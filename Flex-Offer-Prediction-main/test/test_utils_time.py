"""from src.utils import time as tc 

def test_minutes_to_time():
    time_in_minutes = [135, 720, 983, 5, 1430]
    time_in_HHmm = ["02:15", "12:00", "16:23", "00:05", "23:50"]
    for i in range(len(time_in_minutes)):
        assert tc.minutes_to_time(time_in_minutes[i]) == time_in_HHmm[i]

def test_time_to_minutes():
    time_datetime = [
    "14/10/2024 02:15",
    "06/02/2025 12:00",
    "28/06/2024 16:23",
    "11/01/2025 00:05",
    "03/04/2025 23:50"
    ]
    time_in_minutes = [135, 720, 983, 5, 1430]
    for i in range(len(time_datetime)):
        assert tc.time_to_minutes(time_datetime[i]) == time_in_minutes[i]

def test_time_to_date():
    time_datetime = [
    "14/10/2024 02:15",
    "06/02/2025 12:00",
    "28/06/2024 16:23",
    "11/01/2025 00:05",
    "03/04/2025 23:50"
    ]
    time_date = [
        "14/10/2024",
        "06/02/2025",
        "28/06/2024",
        "11/01/2025",
        "03/04/2025"
    ]
    for i in range(len(time_datetime)):
        assert tc.time_to_date(time_datetime[i], "%d/%m/%Y") == time_date[i]


"""