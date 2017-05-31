package com.weather.wiprodigital.suncheck.model;

import java.util.ArrayList;

/**
 * Created by binusadanand on 31/05/2017.
 */

public class WeatherItem {
    public int dt;
    public String dt_txt;
    public WeatherMain main;
    public ArrayList<WeatherDes> weather;
    public Wind wind;


    public class WeatherMain {

        public float temp;
        public float temp_max;
        public float temp_min;
        public float humidity;
        public float pressure;

    }

    public class WeatherDes {
        public int id;
        public String main;
        public String description;
        public String icon;
    }

    public class Wind {
        public float speed;
        public float deg;
    }


}

/*
    {
      "dt": 1487246400,
      "main": {
        "temp": 286.67,
        "temp_min": 281.556,
        "temp_max": 286.67,
        "pressure": 972.73,
        "sea_level": 1046.46,
        "grnd_level": 972.73,
        "humidity": 75,
        "temp_kf": 5.11
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01d"
        }
      ],
      "clouds": {
        "all": 0
      },
      "wind": {
        "speed": 1.81,
        "deg": 247.501
      },
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2017-02-16 12:00:00"
    }
 */
