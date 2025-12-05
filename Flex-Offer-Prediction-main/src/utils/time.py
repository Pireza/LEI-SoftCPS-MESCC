from datetime import datetime, date, timedelta
import time

MIDNIGHT = 0       # 00:00
F_MIDNIGHT = 1440 # 24:00

DOW_DICT = {
    0: "Monday",
    1: "Tuesday",
    2: "Wednesday",
    3: "Thursday",
    4: "Friday",
    5: "Saturday",
    6: "Sunday"
}

def today_dow() -> int:
    """
    Returns the day of the week, where Monday is 0 and Sunday is 6

    Returns:
        int: Day of the week
    """
    return datetime.today().weekday()


def first_of_the_year() -> date:
    """
    Returns the first day of the current year in the date.py format

    Returns:
        date: First day of the current year
    """
    return date(date.today().year, 1, 1)

def last_of_the_year() -> date:
    """
    Returns the last day of the current year in the date.py format

    Returns:
        date: Last day of the current year
    """
    return date(date.today().year, 12, 31)

def is_sequential(t1 : datetime, t2: datetime) -> bool:
    t1 = t1.replace(second=0, microsecond=0)
    t2 = t2.replace(second=0, microsecond=0)
    return t2 - t1 == timedelta(minutes=1)

def int_to_dow(int: int):
    """Translates integer into day of the week.

    Args:

        int (int): Integer identifier of the day of the week.

    Returns:

        str: Day of the week.
    """
    return DOW_DICT.get(int)

def valid_time(t : int):
    
    if t < MIDNIGHT:
        return F_MIDNIGHT + t
    elif t >= F_MIDNIGHT:
        return t - F_MIDNIGHT
    return t

def deltatime_minutes(t1 : int, t2 : int):
    if t2 - t1 < 0:
        return t2 - t1 + F_MIDNIGHT
    return t2 - 1

def calculate_next_sleept_trigger(hours : int, minutes : int) -> int: 
    if hours > 23 or hours < 0:
        raise ValueError("Hour value should be between from 0 to 23.")
    if minutes > 59 or minutes < 0:
        raise ValueError("Minute value should be between 0 and 59.")
    
    now = datetime.today()
    next_trigger = datetime(now.year, now.month, now.day, hours, minutes)

    if now.hour >= hours:
        next_trigger += timedelta(days=1)
    
    return (next_trigger - now).total_seconds()