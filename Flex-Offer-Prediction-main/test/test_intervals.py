"""from src.structs.interval import Interval, matching_intervals

def test_matching_intervals():

    base_interval = Interval(5.0, 10.0)

    encompassed_interval = Interval(6.0, 9.0) 
    assert matching_intervals(base_interval, encompassed_interval) == True

    encompasser_interval = Interval(4.0, 11.0)
    assert matching_intervals(base_interval, encompasser_interval) == True

    left_matching_interval = Interval(4.0, 7.0)
    assert matching_intervals(base_interval, left_matching_interval) == True

    right_matching_interval = Interval(9.0, 11.0)
    assert matching_intervals(base_interval, right_matching_interval) == True"""