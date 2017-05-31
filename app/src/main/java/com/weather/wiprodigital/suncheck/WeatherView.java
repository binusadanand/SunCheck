package com.weather.wiprodigital.suncheck;

import com.weather.wiprodigital.suncheck.model.WeatherObj;

/**
 * Created by binusadanand on 30/05/2017.
 */

public interface WeatherView {
    void showProgress();
    void dismissProgress();
    void showDetails(WeatherObj aDetailObj);
    void showError(String aReason);
}
