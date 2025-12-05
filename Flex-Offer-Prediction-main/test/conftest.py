import pytest
import pandas as pd
from src.data_manager.pre_process import holidays as h
from src.data_manager import data_import as di

@pytest.fixture
def holidays_list():
    return h.get_holidays_list()

@pytest.fixture
def sample_no_outliers():
    return pd.DataFrame({
        "start": [10, 12, 11, 13, 10],
        "duration": [100, 105, 98, 102, 100],
        "energy": [200, 195, 205, 198, 202]
    })

@pytest.fixture
def sample_with_outliers():
    return pd.DataFrame({
        "start": [10, 12, 11, 130, 10],
        "duration": [10, 105, 98, 102, 100],
        "energy": [200, 195, 20, 198, 202]
    })

@pytest.fixture
def sample_with_outliers_removed():
    return pd.DataFrame({
        "start": [12, 10],
        "duration": [105, 100],
        "energy": [195, 202]
    })


@pytest.fixture
def bigger_sample_with_outliers():
     return pd.DataFrame({
        "start": [10, 11, 12, 10, 13, 11, 12, 14, 250, 13, 12, 11, 14, 13, 13],
        "duration": [100, 102, 98, 101, 99, 100, 103, 97, 96, 99, 102, 98, 100, 101, 350],
        "energy": [30, 198, 202, 199, 197, 203, 201, 200, 204, 202, 199, 198, 201, 200, 200]
    })


@pytest.fixture
def bigger_sample_with_outliers_removed():
     return pd.DataFrame({
        "start": [11, 12, 10, 13, 11, 12, 14, 13, 12, 11, 14, 13],
        "duration": [102, 98, 101, 99, 100, 103, 97, 99, 102, 98, 100, 101],
        "energy": [198, 202, 199, 197, 203, 201, 200, 202, 199, 198, 201, 200]
    })



@pytest.fixture
def sample_user_data():
    return di.import_from_csv_file("test\\sample-data.csv")


