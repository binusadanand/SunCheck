package com.weather.wiprodigital.suncheck.Utils;

import org.ocpsoft.prettytime.PrettyTime;

import java.util.Date;

/**
 * Created by binusadanand on 31/05/2017.
 */

public class DateConverter {

    public static String FriendlyFromEpoc(long aEpocTime) {
        Date aDate =  new Date(aEpocTime * 1000);
        PrettyTime p = new PrettyTime();
        return (p.format(aDate));
    }

}
