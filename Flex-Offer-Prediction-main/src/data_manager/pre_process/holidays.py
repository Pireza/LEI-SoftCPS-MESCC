import json
import requests as rq
from ...cfg.params.holiday_api_params import HolidayParameters
from loguru import logger
from datetime import datetime as dt


def holiday_dump(dump_path : str, api_date_format : str):

    holidays = []

    try:
        f = open(dump_path, 'r')
    except OSError as e:
        logger.error(f"There is no holiday dump file: {e}")
        return holidays
    
    try:
        holidays = json.load(f)
        holidays = [dt.strptime(holiday, api_date_format).date() for holiday in holidays]
        f.close()
        logger.info("Holiday dump file was successfuly imported.")
    except json.JSONDecodeError as jde:
        logger.error(f"Dump file is in an incorrect JSON format. Statistical models will be built without accounting for holidays differences: {jde}")
        f.close()
    
    return holidays

def api_get(api_pars : HolidayParameters, dump_path : str):


    endpoint = api_pars.build_endpoint() 
    holidays = []

    try:
        res = rq.get(endpoint)
    except Exception as e:
        logger.error(f"Network not available. Check your internet connection and try again: {e}")
        return holidays 
    
    if not res.ok:
        logger.warning(f"Holidays list couldn't be retrieved from the API (status code {res.status_code})")
        return holidays

    for response_element in res.json():
        holiday = response_element.get(api_pars.api_date_key)
        holidays.append(holiday)

    if not holidays:
        logger.warning("Holidays list couldn't be retrieved. Please check the configuration file and ensure ISO/Subdivison codes exist.")
    else:
        persist_holiday_list(dump_path, holidays)
    
    logger.info("Holiday list successfuly retrieved from API")
    return [dt.strptime(holiday, api_pars.api_date_format).date()
                for holiday in holidays]
        
def persist_holiday_list(dump_path : str, holidays : list):
    with open(dump_path, 'w') as f:
        json.dump(holidays, f, indent=2)        
        f.close

def get_holidays_list(holiday_pars : HolidayParameters, dump_path : str):

    res = api_get(holiday_pars, dump_path)
    if res:
        return res
    
    res = holiday_dump(dump_path, holiday_pars.api_date_format)
    return res

