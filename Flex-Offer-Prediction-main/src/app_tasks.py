import time
from loguru import logger
from .data_manager.pub_sub import conn_mq, close_mq_conn
from .utils.time import calculate_next_sleept_trigger
from .data_manager.pre_process import data_generator
from .flexibility_predictor.flex_generator import build_fo
from .data_manager.pub_sub import pub_mq, generic_callback

TRIGGER_HOUR = 1
TRIGGER_MINUTES = 30

# TODO: Currently connection is unused. In the future this method will also establish
# connection with the DB, and some logic might have to be changed
def start_sending_flexibility_offers(users, connection, mq_credentials : dict, mq_exchange : str):

    while True:
        logger.debug("Starting today's flexibility predictions...")

        mq_connection = conn_mq(
            mq_credentials.get("host"),
            mq_credentials.get("port"),
            mq_credentials.get("username"),
            mq_credentials.get("password")
        )

        for user in users:
            processed_data = data_generator.generate_full_data()
            flexibility = build_fo(processed_data, user)
            print(flexibility.to_json_str())
            pub_mq(mq_connection, mq_exchange, flexibility)
            
        close_mq_conn(mq_connection)
        # Predictions are made every day at 1:30 AM
        logger.info("Halting executing until next trigger.")
        time.sleep(calculate_next_sleept_trigger(TRIGGER_HOUR, TRIGGER_MINUTES))

def retrieve_forecast_logs(mq_credentials : dict, queues : list[str]):

    logger.debug("Started listening to queues...")
    
    mq_connection = conn_mq(
            mq_credentials.get("host"),
            mq_credentials.get("port"),
            mq_credentials.get("username"),
            mq_credentials.get("password")
        )

    try:
        logger.debug("Establishing communication channel...")
        channel = mq_connection.channel()
        logger.debug("Channel was successfuly created.")
    except Exception as e:
        logger.error(f"There was an error when creating the communication channel: {e}")
        return
    
    for queue in queues:
        try:
            channel.queue_declare(queue=queue, durable=True)
            channel.basic_consume(
                queue=queue,
                on_message_callback=generic_callback,
                auto_ack=True,
                exclusive=False,
                consumer_tag=None
            )
        except Exception as e:
            logger.error(f"Listener couldn't declare the queue \"{queue}\": {e}")
    
    logger.info(f"Listener is waiting for messages on the queues: {queues}")
    channel.start_consuming()
    mq_connection.close()