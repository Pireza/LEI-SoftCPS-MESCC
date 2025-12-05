# About

> This repository holds the module that is responsible for generating predictions regarding energy consumption on EVs, based on its user usage history

# Scripts
To run the application type the following in the terminal prompt:

    .\run_app.bat

To run application tests type the following in the terminal prompt:

    .\run_tests.bat

To view documentation type the following in the terminal prompt:

    pdoc .\src\

# Setup

This application was developed using the Python programing language (v 3.12.10). Make sure download the latest release [**here**](https://www.python.org/downloads/).


Aftewards, setting up the application is as easy as installing the dependencies and executing the run script. In a terminal prompt type:

    pip install requirements.txt
    .\run_app.bat 

# Structure

| Directory  | Description  |
|---|---|
| **docs/**  | Contains documentation about the structure of the application using diagrams  |  
| **src/**  |  Contains the application itself [(click here for details](#source-folder))|  
| **test/**  |  Contains both data used to test the application and test functions to ensure the API is working as expected |
| **config/**| Contains configuration files for accessing APIs ([click here for details](#config))|
| **logs/** | Contains system logs | 

## Source Folder

### Data Manager
Holds all files that allow for both data access and data pre-processing.
### Flexibility Predictor
Holds the files to build statistical models and use them for flexibility predicition of a specific user.
### Structs
Holds wrapper classes that allows for a cleaner implementation.
### Utils
Provides accessory functionalities to the program, such as a logger or data conversions.

## Config

Besides the configuration for accessing the [OpenHolidays API](https://www.openholidaysapi.org/en/) (holidays.yaml), **it is the user's responsability to also include a config file named "mongo.yaml"**. This file defines the connection parameters to access a Mongo DB. The required file structure is as follows:

    db_name:    <db_name>
    username:   <username>
    pwd:        <password>
    host:       <host_ip_address>
    port:       <port>

Another important observation on the holidays API:
> **If, by some reason, the holiday API is unavailable, the system will use a safety dump of previously requests. If this last one is unavailable, holidays features will become deactivated.**

Because of this, it is **strongly advised** to pay close attention to the system's logs to ensure maximum program efficiency.
