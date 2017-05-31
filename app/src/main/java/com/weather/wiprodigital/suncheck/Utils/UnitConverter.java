package com.weather.wiprodigital.suncheck.Utils;

/**
 * Created by binusadanand on 31/05/2017.
 */

public class UnitConverter {

    public static float toCelsiusFromF(float fahrenheit) {
        float celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static float toCelsiusFromK (float aKelvin){
        return (aKelvin - 273.15F);
    }
}
