package com.weather.wiprodigital.suncheck.Utils;

import com.weather.wiprodigital.suncheck.R;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by binusadanand on 31/05/2017.
 */

public class WeatherImageDecoder {

    private static Map<String, Integer> mMap;

    static {
        HashMap<String, Integer> aMap = new HashMap<>();
        aMap.put("01d", R.drawable.sun);
        aMap.put("02d", R.drawable.cloudy);
        aMap.put("03d", R.drawable.clouds);
        aMap.put("04d", R.drawable.windy_7);
        aMap.put("09d", R.drawable.rain_2);
        aMap.put("10d", R.drawable.rain);
        aMap.put("11d", R.drawable.storm_1);
        aMap.put("13d", R.drawable.hail_2);
        aMap.put("50d", R.drawable.windy_7);

        aMap.put("01n", R.drawable.moon);
        aMap.put("02n", R.drawable.clouds);
        aMap.put("03n", R.drawable.clouds);
        aMap.put("04n", R.drawable.rain_1);
        aMap.put("09n", R.drawable.rain_2);
        aMap.put("10n", R.drawable.rain);
        aMap.put("11n", R.drawable.storm_2);
        aMap.put("13n", R.drawable.hail);
        aMap.put("13n", R.drawable.windy_7);


        mMap = Collections.unmodifiableMap(aMap);
    }

    public static int getResID(String aIconName) {
        return mMap.get(aIconName);

    }
}
