package com.anychart.scales.calendar;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for one schedule item.
 */
public class ScheduleItem extends JsObject  {

    
    public ScheduleItem(Number end, Number start, String[] workingTime) {
        js.append(String.format(Locale.US, "{end:%s, start: %s, workingTime: %s, } ", end, start, arrayToStringWrapQuotes(workingTime)));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}