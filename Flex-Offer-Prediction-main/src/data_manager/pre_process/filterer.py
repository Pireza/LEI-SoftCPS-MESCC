from loguru import logger
from .data_generator import generate_data
from ...data_manager import data_navigator_interface as dn
from ...utils import time

import pandas as pd
import numpy as np

"""
Global variable that stores the holidays list
"""
MIN_SAMPLE_SIZE = 4
"""
Global variable that stores the minimum sample size for performing KDE
"""

def filter_dow(raw_data : pd.DataFrame, dow) -> pd.DataFrame:
    return raw_data[raw_data[dn.TIMESTAMP_KEY].dt.weekday == dow]


def squeeze_data(data : pd.DataFrame) -> pd.DataFrame:
    
    squeezed_data = [ ]

    s_data = simplify_data(data)
    data_size = len(s_data)

    # Aux variables for the loop
  
    prev_timestamp = None
    curr_timestamp = None
    prev_soc = None

    charger = None
    time_start = None
    time_end = None
    i_soc = None

    # Extraction of the first values in the dataframe
    try:
        charger = s_data[dn.CHARGER_KEY].iloc[0]
        time_start = s_data[dn.TIMESTAMP_KEY].iloc[0]
        i_soc = s_data[dn.SOC_KEY].iloc[0]

        prev_timestamp = time_start
        prev_soc = s_data[dn.SOC_KEY].iloc[0]
    except:
        logger.error("Couldn't squeeze data because the Dataframe is empty.")
        return squeezed_data

    for itr in range(1, data_size):
        curr_timestamp = s_data[dn.TIMESTAMP_KEY].iloc[itr]

        if not time.is_sequential(prev_timestamp, curr_timestamp):
            time_end = prev_timestamp
            e_soc = prev_soc

            squeezed_data.append([charger, time_start, time_end, i_soc, e_soc])
            
            charger = s_data[dn.CHARGER_KEY].iloc[itr]
            time_start = curr_timestamp
            i_soc = s_data[dn.SOC_KEY].iloc[itr]

        prev_timestamp = curr_timestamp
        prev_soc = s_data[dn.SOC_KEY].iloc[0]

    # Adding the last session in the Dataframe
    squeezed_data.append([charger, time_start, prev_timestamp, i_soc, e_soc])

    return pd.DataFrame(squeezed_data, columns=[
        dn.CHARGER_KEY,
        dn.ARRIVAL_TIME_KEY,
        dn.DEPARTURE_TIME_KEY,
        dn.ARRIVAL_SOC_KEY,
        dn.DEPARTURE_SOC_KEY
        ])

def simplify_data(data : pd.DataFrame):
    data = data.reset_index(drop=True)

    for key in [dn.CHARGER_KEY, dn.SOC_KEY]:
        data[key.value] = unpack_nested_arr(data, key)

    return data.drop(columns=[dn.SESSIONS_KEY])

def remove_holidays(data: pd.DataFrame, holiday_list : list):
    return data[~data[dn.TIMESTAMP_KEY].dt.date.isin(holiday_list)]

def extract_time_from_datetime(data: pd.DataFrame):
    clone = data.copy()
    clone[dn.ARRIVAL_TIME_KEY] = clone[dn.ARRIVAL_TIME_KEY].apply(lambda x: x.hour * 60 + x.minute)
    clone[dn.DEPARTURE_TIME_KEY] = clone[dn.DEPARTURE_TIME_KEY].apply(lambda x: x.hour * 60 + x.minute)
    return clone

def process_data(data: pd.DataFrame, user_id, holiday_list : list,
                    dow = None, gen_data = False):

    if dow is None:
        dow = time.today_dow()

    dow_filtered = filter_dow(data, dow)
    holidays_filtered = remove_holidays(dow_filtered, holiday_list)
    s_data = squeeze_data(holidays_filtered)
    t_data = extract_time_from_datetime(s_data)
    prc_data = remove_outliers(t_data)

    if len(prc_data) < MIN_SAMPLE_SIZE:
            logger.warning(f"Insuficcient data to estimate flexibility for user [{user_id}] on [{time.int_to_dow(dow)}]")
            
            if not gen_data:
                return pd.DataFrame()
            
            logger.info(f"Generate random data flag is active")
            prc_data = generate_data(prc_data)

    return prc_data

def unpack_nested_arr(data : pd.DataFrame, attr : str):
    return data[dn.SESSIONS_KEY].apply(lambda x : x[0][attr.value])

def remove_outliers(df: pd.DataFrame, out_threshold=2.5):
    """Removes outliers from the parameter data.
    This works for any of the columns passed as argument.
    If one of them is marked as outlier, the entire row is removed

    Args:

        df (pd.DataFrame): Data to be processed

        columns (list, optional): Columns that will be analysed for outlier values. Defaults to ["start", "duration", "energy"].

        out_threshold (float, optional): Outlier threshold. The higher the more tolerable to outliers it is. Defaults to 2.5.

    Returns:

        pandas.Dataframe: Data without outliers
    """
    combined_mask = pd.Series(True, index=df.index)
    
    for col in dn.get_flex_keys():
        
        if df[col].empty:
            return df
        
        data = df[col].values
        d = np.abs(data - np.median(data))
        mdev = np.median(d)
        s = d / mdev if mdev else np.zeros(len(d))
        mask = s <= out_threshold
        combined_mask &= mask
    
    return df[combined_mask]
