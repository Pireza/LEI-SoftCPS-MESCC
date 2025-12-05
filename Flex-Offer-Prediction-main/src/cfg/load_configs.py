import os
from loguru import logger
import json

def load_holiday_configuration(config_path : str, country_key : str, region_key : str):
    
    logger.debug("Loading holiday configuration")
    try:
        with open(config_path) as f:
            config = dict(json.load(f))
            f.close()
    except OSError as ose:
        logger.error(f"Holiday configuration file not found: {ose}")    
        return "", ""

    country, region = config.get(country_key), config.get(region_key)
    if not country or not region:
        logger.warning("Missing country/region specification in the holiday configuration file.")

    return country, region


"""def fetch_user_ids() -> list[str]:

    with open("household_users.json") as f:
        users = dict(json.load(f))
        f.close()

        if USERS_KEY not in users.keys():
            LOG.ERR("The JSON file \"household_users.json\" must contain the \"users\" attribute -> an array containing all household users' IDs.")
            raise KeyError("Missing key in \"household_users.json\" file. Check logs for more information.")
    
    ids = users.get(USERS_KEY)
    if not ids:
        LOG.WARN("The \"users\" attribute under the \"houshold_users.json\" is empty.")

    return ids
"""
