package com.weather.wiprodigital.suncheck.ApiService;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
import com.weather.wiprodigital.suncheck.model.WeatherObj;

/**
 * Created by binusadanand on 30/05/2017.
 */

public interface Api {
    @GET("data/2.5/forecast")
    Observable<WeatherObj> items(@Query(EndPointConstants.CITY) String aCity,
                                 @Query(EndPointConstants.MODE) String aMode,
                                 @Query(EndPointConstants.APP_ID_KEY) String aID);

    @GET("data/2.5/forecast")
    Observable<WeatherObj> items(@Query(EndPointConstants.LATITUDE) float aLat,
                                 @Query(EndPointConstants.LONGITUDE) float along,
                                 @Query(EndPointConstants.APP_ID_KEY) String aID);


    //api.openweathermap.org/data/2.5/forecast?lat={lat}&lon={lon}
    //api.openweathermap.org/data/2.5/forecast?q=London,uk&mode=xml

}
