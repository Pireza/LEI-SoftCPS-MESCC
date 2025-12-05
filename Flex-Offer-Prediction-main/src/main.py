# from .cfg.config import load_valid_config, fetch_user_ids
from .data_manager.data_import import conn_db, close_db_conn, fetch_user_data
from .data_manager.pre_process import filterer
from .app_tasks import start_sending_flexibility_offers, retrieve_forecast_logs
from .data_manager.pub_sub import conn_mq, close_mq_conn
from .flexibility_predictor.flex_generator import build_fo
from datetime import datetime, date
from .data_manager.pre_process import data_generator
import os
from loguru import logger
from .cfg import load_configs as lc 
from .cfg.params.holiday_api_params import HolidayParameters
from .data_manager.pre_process.holidays import get_holidays_list
from threading import Thread


def run():
    logger.debug("Loading environment variables...")
    
    # +-----------------------------+ #
    # |Environment variables loading| #
    # +-----------------------------+ #

    try:

        # RabbitMQ 
        mq_username = os.environ["RABBIT_USERNAME"]
        mq_password = os.environ["RABBIT_PASSWORD"]
        mq_host = os.environ["RABBIT_HOST"]
        mq_port = os.environ["RABBIT_PORT"]
        mq_exchange = os.environ["RABBIT_EXCHANGE"] 
        mq_listening_queues = os.environ["LISTENING_QUEUES"].split(",")

        # MongoDB 
        mongo_username = os.environ["MONGO_USERNAME"]
        mongo_password = os.environ["MONGO_PASSWORD"]
        mongo_host = os.environ["MONGO_HOST"]
        mongo_port = os.environ["MONGO_PORT"]
        mongo_db_name = os.environ["MONGO_DB_NAME"]
        mongo_collection_name = os.environ["MONGO_COLLECTION_NAME"]
        household_users = os.environ["USERS"].split(",")

        # Holiday API 
        hd_configuration_file = os.environ["HOLIDAYS_CONFIGURATION_PATH"]
        hd_country_key = os.environ["HOLIDAY_COUNTRY_KEY"]
        hd_region_key = os.environ["HOLIDAY_REGION_KEY"]
        hd_api_url = os.environ["HOLIDAY_API"]
        hd_api_date_key = os.environ["API_DATE_KEY"]
        hd_api_date_format = os.environ["API_DATE_FORMAT"]
        hd_dump_path = os.environ["DUMP_PATH"]

    except KeyError as ke:
        logger.error(f"The .env file is missing the key: {ke.args[0]}")
        exit(os.EX_CONFIG)

    logger.info("Environment variables successfuly loaded.")

    # +-------------------------+ #
    # |Holiday parameters set up| #
    # +-------------------------+ #

    country, region = lc.load_holiday_configuration(
            hd_configuration_file,
            hd_country_key,
            hd_region_key
        )    

    holiday_pars = HolidayParameters(
            country, hd_country_key, region, hd_region_key,
            hd_api_url, hd_api_date_format, hd_api_date_key
        ) 

    # holidays_list = get_holidays_list(holiday_pars, hd_dump_path)
    
    # +---------------------------------------+ #
    # |MQ Connection and Channel establishment| #
    # +---------------------------------------+ #

    mq_credentials = {
        "host" : mq_host,
        "port" : mq_port,
        "username" : mq_username,
        "password" : mq_password
    }

    # +---------------------------+ #
    # |DB Connection establishment| #
    # +---------------------------+ #
   
    """mongo_client, mongo_connection = conn_db(
            username=mongo_username,
            pwd=mongo_password,
            host=mongo_host,
            port=mongo_port,
            db_name=mongo_db_name,
            collection_name=mongo_collection_name 
        )
    """
    ########################################
    ########################################

    tasks_params = [
        # function , args
        #TODO Change None to valid DB connection in the future
        (start_sending_flexibility_offers, (household_users, None, mq_credentials, mq_exchange)),
        (retrieve_forecast_logs, (mq_credentials, mq_listening_queues))
    ]

    running_tasks = []

    for task, args in tasks_params:
        thread = Thread(target=task, args=args)
        running_tasks.append(thread)
        thread.start()
        
    for task in running_tasks:
        task.join()


    # close_db_conn(client=mongo_client)
    # close_mq_conn(connection=mq_connection)

if __name__ == "__main__":
    run()
