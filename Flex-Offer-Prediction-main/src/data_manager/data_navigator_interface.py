import pandas as pd

CHARGER_KEY = "charger_id"
ARRIVAL_TIME_KEY = "start" 
DEPARTURE_TIME_KEY = "end"
ARRIVAL_SOC_KEY = "initial_soc" 
DEPARTURE_SOC_KEY = "end_soc" 

TIMESTAMP_KEY = "timestamp"
SOC_KEY = "soc"
SESSIONS_KEY = "charging_sessions"

def get_charger_column(input: pd.DataFrame):
    clone = input.copy()
    return clone[CHARGER_KEY]

def get_s_time_column(input: pd.DataFrame):
    clone = input.copy()
    return clone[ARRIVAL_TIME_KEY]

def get_e_time_column(input: pd.DataFrame):
    clone = input.copy()
    return clone[DEPARTURE_TIME_KEY]

def get_s_soc_column(input: pd.DataFrame):
    clone = input.copy()
    return clone[ARRIVAL_SOC_KEY]

def get_e_soc_column(input: pd.DataFrame):
    clone = input.copy()
    return clone[DEPARTURE_SOC_KEY]

def get_flex_columns(input: pd.DataFrame):
    return [get_s_time_column(input), get_e_time_column(input),
            get_s_soc_column(input), get_e_soc_column(input)]

def get_flex_keys():
    return [ARRIVAL_TIME_KEY, DEPARTURE_TIME_KEY,
            ARRIVAL_SOC_KEY, DEPARTURE_SOC_KEY]