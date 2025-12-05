import pika
import os
from datetime import datetime

from ..structs.flexibility import Flexibility
from pika import BlockingConnection
from pika.adapters.blocking_connection import BlockingChannel
from pika.exceptions import ChannelClosed
from loguru import logger

def conn_mq(host : str, port : int, username : str, password : str):
    
    logger.debug("Establishing connection to RabbitMQ...")
    try:
        connection = pika.BlockingConnection(
            pika.ConnectionParameters(
                host=host,
                port=port,
                credentials=pika.PlainCredentials(
                    username=username,
                    password=password
                )
            )
        )
        logger.info("RabbitMQ connection successfuly established.")
    except Exception as e:
        logger.error(f"An error occurred when establishing connection with the MQ broker: {e}")
        exit(os.EX_UNAVAILABLE)

    return connection

def declare_exchange(channel : BlockingChannel, exchange : str):
    try:
        channel.exchange_declare(exchange, durable=True, exchange_type="fanout", passive=True)
        logger.info(f"Exchange \"{exchange}\" exists")
        return
    except ChannelClosed as cc:
        logger.debug(f"Exchange \"{exchange}\" doesn't exist: {cc}")
        channel.exchange_declare(exchange, "fanout", durable=True)
        logger.info("Exchange was created.")


def close_mq_conn(connection : BlockingConnection):
    logger.debug("Terminating RabbitMQ connection...")

    try:
        connection.close()
        logger.info("RabbitMQ connection was terminated.")
    except:
        logger.error("RabbitMQ connection was already terminated.")
        

def pub_mq(connection : BlockingConnection, exchange : str, flexibility : Flexibility, queue : str = ""):

    logger.debug("Sending flexibility payload to broker...")
    try:
        channel = connection.channel()
        stamp = int(datetime.now().timestamp()) 
        properties = pika.BasicProperties(
                content_type='application/json', delivery_mode=2, timestamp=stamp
            )
        
        declare_exchange(channel, exchange)

        channel.basic_publish(
            exchange=exchange,
            routing_key=queue,
            body=flexibility.to_json_str(),
            properties = properties
        )
        
        logger.info("Payload was successfuly sent.")
        

    except Exception as e:
        logger.error(f"Payload couldn't be sent to broker: {e}")


def generic_callback(ch, method, properties, body):
    logger.info(f"Retrieved PulseCharge response:\n{body}")
