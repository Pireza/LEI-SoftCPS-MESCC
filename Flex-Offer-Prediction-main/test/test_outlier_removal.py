from src.data_manager.pre_process import filterer
import pandas.testing as pdt

def test_sample_no_outliers(sample_no_outliers):
    act = filterer.remove_outliers(sample_no_outliers)
    pdt.assert_frame_equal(act.reset_index(drop=True), sample_no_outliers.reset_index(drop=True))


def test_sample_with_outliers(sample_with_outliers, sample_with_outliers_removed):
    act = filterer.remove_outliers(sample_with_outliers)
    pdt.assert_frame_equal(act.reset_index(drop=True), sample_with_outliers_removed.reset_index(drop=True))


def test_big_sample_with_few_outliers(bigger_sample_with_outliers, bigger_sample_with_outliers_removed):
    act = filterer.remove_outliers(bigger_sample_with_outliers)
    pdt.assert_frame_equal(act.reset_index(drop=True), bigger_sample_with_outliers_removed.reset_index(drop=True))


