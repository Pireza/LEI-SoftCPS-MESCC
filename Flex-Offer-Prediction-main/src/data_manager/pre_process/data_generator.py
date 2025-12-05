import pandas as pd
import numpy as np
import random
from ...utils.time import valid_time, deltatime_minutes
from .. import data_navigator_interface as dn

TIME_VARIATION = 10 # minutes
TIME_VARIATION_FACTOR = 1 # minute, serves a purpose when calculating timestamps that don't overlap

SOC_VARIATION = 0.1 # percent
SOC_VARIATION_FACTOR = .01 # percent

SAMPLE_LIMIT = 4

TIME_OF_ARRIVAL_LOWER = 510
TIME_OF_ARRIVAL_UPPER = 570

TIME_OF_DEPARTURE_LOWER = 1050
TIME_OF_DEPARTURE_UPPER = 1110


SOC_OF_ARRIVAL_LOWER = .1
SOC_OF_ARRIVAL_UPPER = .3

SOC_OF_DEPARTURE_LOWER = .7
SOC_OF_DEPARTURE_UPPER = .9



def generate_full_data():

    fake_data = pd.DataFrame(
        {
            "charger_id":  ["FAKE_00001"],
            "start": random.randint(TIME_OF_ARRIVAL_LOWER, TIME_OF_ARRIVAL_UPPER),
            "end": random.randint(TIME_OF_DEPARTURE_LOWER, TIME_OF_DEPARTURE_UPPER),
            "initial_soc": random.uniform(SOC_OF_ARRIVAL_LOWER, SOC_OF_ARRIVAL_UPPER),
            "end_soc": random.uniform(SOC_OF_DEPARTURE_LOWER, SOC_OF_DEPARTURE_UPPER) 
        }
    )

    return generate_data(fake_data)


def generate_data(data: pd.DataFrame):
    clone = data.copy()

    charger_col = dn.get_charger_column(clone)
    counts = charger_col.value_counts(normalize = True)

    while len(clone) < SAMPLE_LIMIT:

        rand_row = clone.sample(n = 1).iloc[0]

        arr_soc, dep_soc = generate_valid_socs(
            rand_row[dn.ARRIVAL_SOC_KEY], rand_row[dn.DEPARTURE_SOC_KEY]
            )

        arr_time, dep_time = generate_valid_time(
            rand_row[dn.ARRIVAL_TIME_KEY], rand_row[dn.DEPARTURE_TIME_KEY]
        )

        clone.loc[len(clone)] = [
            np.random.choice(counts.index.to_list(), p = counts.values),
            arr_time,
            dep_time,
            arr_soc,
            dep_soc
        ]

    return clone

def generate_valid_time(a_time, dep_time):

    var = TIME_VARIATION
    if TIME_VARIATION >= deltatime_minutes(dep_time, a_time) / 2:
        var = deltatime_minutes(dep_time, a_time) / 2 - TIME_VARIATION_FACTOR

    i_time = random.randint(a_time - var, a_time + var)
    e_time = random.randint(dep_time - var, dep_time + var)

    return valid_time(i_time), valid_time(e_time)



def generate_valid_socs(a_soc: float, dep_soc: float):

    var = SOC_VARIATION
    if SOC_VARIATION >= abs(a_soc - dep_soc) / 2:
        var = abs(a_soc - dep_soc) / 2 - SOC_VARIATION_FACTOR

    i_soc = random.uniform(max(0, a_soc - var), min(1, a_soc + var))
    e_soc = random.uniform(max(0, dep_soc - var), min(1, dep_soc + var))

    return i_soc, e_soc