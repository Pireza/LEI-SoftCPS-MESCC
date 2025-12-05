import urllib
import os
import pandas as pd
import pymongo as pm
from loguru import logger


def conn_db(username : str, pwd : str, host : str, port : int,
                db_name : str, collection_name : str):

    username = urllib.parse.quote_plus(username)
    pwd = urllib.parse.quote_plus(pwd)
    uri = f"mongodb://{username}:{pwd}@{host}:{port}/"
    
    try:
        logger.debug("Establishing database connection...")

        client = pm.MongoClient(uri)
        if db_name not in client.list_database_names():
            logger.error("Failed database connection due to non existent database name")
            exit(os.EX_CONFIG)

        db = client[db_name]
    except Exception as e:
        logger.error(f"There was an error while connecting to the database: {e}")
        exit(os.EX_UNAVAILABLE)

    collection = db[collection_name]
    logger.info("Database connection established.")

    return client, collection

def close_db_conn(client):
    logger.debug("Closing database connection")
    client.close()
    logger.info("Database connection closed.")

def fetch_user_data(collection, user_id):
    """
    Use this method to retrieve user specific data.
    Retrieved data regards just the specified user to ensure data privacy

    Args:
        user_id (str): User id

    Returns:
        pandas Dataframe: Charging sessions for specified user
    """

    logger.info("Querying data from database...")

    query = collection.find(
        # Query
        {
            "charging_sessions":
            {
                "$elemMatch" :
                {
                    "user_id" : user_id
                }
            }
        } ,
        # Projection to ensure data privacy, avoiding querying unecessary data
        {
            "charging_sessions.$": 1,
            "timestamp": 1,
            "_id" : 0 
        }
    )
    
    data = list(query)
    if not data:
        logger.info(f"There is no data regarding the user:{user_id}. Energy flexibility couldn't be calculated.")

    return pd.DataFrame(data)



