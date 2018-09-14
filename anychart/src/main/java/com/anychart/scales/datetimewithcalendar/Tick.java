package com.anychart.scales.datetimewithcalendar;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for tick.
 */
public class Tick extends JsObject  {

    
    public Tick(Number end, Boolean holiday, Number start) {
        js.append(String.format(Locale.US, "{end:%s, holiday: %s, start: %s, } ", end, holiday, start));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}