import json

class Flexibility:

   user_id           : str
   charger           : str
   time_of_arrival   : int
   time_of_departure : int
   soc_of_arrival    : float
   soc_of_departure  : float

   def __init__(self, user_id : str, charger : str,
               time_of_arrival : int, time_of_departure : int,
               soc_of_arrival : float, soc_of_departure : float):
      
      self.user_id            = user_id
      self.charger            = charger
      self.time_of_arrival    = time_of_arrival
      self.time_of_departure  = time_of_departure
      self.soc_of_arrival     = round(soc_of_arrival, 2)
      self.soc_of_departure   = round(soc_of_departure, 2)

   def to_json_str(self) -> str:
      return json.dumps(vars(self))