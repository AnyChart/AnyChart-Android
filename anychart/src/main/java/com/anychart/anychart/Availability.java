package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Availability extends JsObject  {

    
    private AvailabilityPeriod each;
    private Double ends;
    private String ends1;
    private Double from;
    private String from1;
    private Boolean isWorking;
    private Double on;
    private String on1;
    private Double starts;
    private String starts1;
    private Double to;
    private String to1;

    
    public Availability(AvailabilityPeriod each, Double ends, String ends1, Double from, String from1, Boolean isWorking, Double on, String on1, Double starts, String starts1, Double to, String to1) {
        this.each = each;
        this.ends = ends;
        this.ends1 = ends1;
        this.from = from;
        this.from1 = from1;
        this.isWorking = isWorking;
        this.on = on;
        this.on1 = on1;
        this.starts = starts;
        this.starts1 = starts1;
        this.to = to;
        this.to1 = to1;

        js.append(String.format(Locale.US, "{each: %s,ends: %f,ends: \"%s\",from: %f,from: \"%s\",isWorking: %b,on: %f,on: \"%s\",starts: %f,starts: \"%s\",to: %f,to: \"%s\"}",  (each != null) ? each.generateJs() : "null", ends, ends1, from, from1, isWorking, on, on1, starts, starts1, to, to1));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}