import numpy as np
import pandas as pd
import statsmodels.api as sm

from ..data_manager import data_navigator_interface as dn
from scipy.stats import bootstrap
from ..structs.flexibility import Flexibility
from scipy.stats._common import ConfidenceInterval

def build_fo(data: pd.DataFrame, user_id: str):
    

    charger = most_probable_charger(data)
    time_of_arrival, time_of_departure, soc_of_arrival, soc_of_departure = predict_flexibility(data)
    
    return Flexibility(user_id, charger,
                       time_of_arrival, time_of_departure,
                       soc_of_arrival, soc_of_departure)


def most_probable_charger(data: pd.DataFrame, significance_level=.05, method="wilson"):
    
    charger_col = dn.get_charger_column(data)
    n = len(charger_col)
    highest_probability = .0
    most_probable_charger = ""

    counts = charger_col.value_counts()

    for charger, count in counts.items():
        lower, higher = sm.stats.proportion_confint(
            count = count,
            nobs = n,
            alpha = significance_level,
            method = method
        )
        current_probability = (lower + higher) / 2
        
        if current_probability > highest_probability:
            highest_probability = current_probability
            most_probable_charger = charger

    return most_probable_charger


def predict_flexibility(data: pd.DataFrame, confidence_level=.95, method="percentile"):
    cols_flexibility = [ ]
    flex_cols = dn.get_flex_columns(data)

    for column in flex_cols:
        res : ConfidenceInterval = bootstrap(
                data=(column,),
                statistic=np.mean,
                confidence_level=confidence_level,
                method=method
            ).confidence_interval
        
        cols_flexibility.append((res.high + res.low)/2)
    
    return cols_flexibility
        
