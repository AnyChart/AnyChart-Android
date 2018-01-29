package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for tick.
 */
public class Tick extends JsObject  {

    
    private Number end;
    private Boolean holiday;
    private Number start;

    
    public Tick(Number end, Boolean holiday, Number start) {
        this.end = end;
        this.holiday = holiday;
        this.start = start;

        js.append(String.format(Locale.US, "{end: %s,holiday: %b,start: %s}",  end, holiday, start));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}