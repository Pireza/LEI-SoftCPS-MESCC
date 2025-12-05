from datetime import date
from ...utils import time

class HolidayParameters:
    country           : str
    country_key       : str
    region            : str
    region_key        : str
    api_url           : str
    first_day_of_year : date
    last_day_of_year  : date

    api_date_format   : str
    api_date_key      : str

    def __init__(self, country : str, country_key : str,
                 region : str, region_key : str, api_url : str,
                 api_date_format : str, api_date_key : str):
    
        self.country = country
        self.country_key = country_key
        self.region = region
        self.region_key = region_key
        self.api_url = api_url
        self.api_date_format = api_date_format
        self.api_date_key = api_date_key

        self.first_day_of_year = time.first_of_the_year()
        self.last_day_of_year = time.last_of_the_year() 
    
    def build_endpoint(self) -> str: 
        return (
            f"{self.api_url}?"
            f"{self.country_key}={self.country}&"
            f"{self.region_key}={self.region}&"
            f"validFrom={self.first_day_of_year}&"
            f"validTo={self.last_day_of_year}"
        )
