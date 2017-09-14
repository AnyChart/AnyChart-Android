package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Tick extends JsObject  {

    
    private Double end;
    private Boolean holiday;
    private Double start;

    
    public Tick(Double end, Boolean holiday, Double start) {
        this.end = end;
        this.holiday = holiday;
        this.start = start;

        js.append(String.format(Locale.US, "{end: %f,holiday: %b,start: %f}",  end, holiday, start));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}