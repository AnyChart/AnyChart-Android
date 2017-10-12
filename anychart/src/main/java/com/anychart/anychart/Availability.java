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

    
    public Availability(Double ends, Double from, Double on, Double starts, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from = from;
        this.on = on;
        this.starts = starts;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %f,on: %f,starts: %f,to: %f,each: %s,isWorking: %b}",  ends, from, on, starts, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, Double from, Double on, Double starts, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from = from;
        this.on = on;
        this.starts = starts;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %f,on: %f,starts: %f,to: %s,each: %s,isWorking: %b}",  ends, from, on, starts, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, Double from, Double on, String starts1, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from = from;
        this.on = on;
        this.starts1 = starts1;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %f,on: %f,starts: %s,to: %f,each: %s,isWorking: %b}",  ends, from, on, starts1, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, Double from, Double on, String starts1, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from = from;
        this.on = on;
        this.starts1 = starts1;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %f,on: %f,starts: %s,to: %s,each: %s,isWorking: %b}",  ends, from, on, starts1, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, Double from, String on1, Double starts, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from = from;
        this.on1 = on1;
        this.starts = starts;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %f,on: %s,starts: %f,to: %f,each: %s,isWorking: %b}",  ends, from, on1, starts, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, Double from, String on1, Double starts, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from = from;
        this.on1 = on1;
        this.starts = starts;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %f,on: %s,starts: %f,to: %s,each: %s,isWorking: %b}",  ends, from, on1, starts, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, Double from, String on1, String starts1, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from = from;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %f,on: %s,starts: %s,to: %f,each: %s,isWorking: %b}",  ends, from, on1, starts1, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, Double from, String on1, String starts1, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from = from;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %f,on: %s,starts: %s,to: %s,each: %s,isWorking: %b}",  ends, from, on1, starts1, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, String from1, Double on, Double starts, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from1 = from1;
        this.on = on;
        this.starts = starts;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %s,on: %f,starts: %f,to: %f,each: %s,isWorking: %b}",  ends, from1, on, starts, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, String from1, Double on, Double starts, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from1 = from1;
        this.on = on;
        this.starts = starts;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %s,on: %f,starts: %f,to: %s,each: %s,isWorking: %b}",  ends, from1, on, starts, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, String from1, Double on, String starts1, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from1 = from1;
        this.on = on;
        this.starts1 = starts1;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %s,on: %f,starts: %s,to: %f,each: %s,isWorking: %b}",  ends, from1, on, starts1, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, String from1, Double on, String starts1, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from1 = from1;
        this.on = on;
        this.starts1 = starts1;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %s,on: %f,starts: %s,to: %s,each: %s,isWorking: %b}",  ends, from1, on, starts1, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, String from1, String on1, Double starts, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from1 = from1;
        this.on1 = on1;
        this.starts = starts;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %s,on: %s,starts: %f,to: %f,each: %s,isWorking: %b}",  ends, from1, on1, starts, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, String from1, String on1, Double starts, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from1 = from1;
        this.on1 = on1;
        this.starts = starts;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %s,on: %s,starts: %f,to: %s,each: %s,isWorking: %b}",  ends, from1, on1, starts, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, String from1, String on1, String starts1, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from1 = from1;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %s,on: %s,starts: %s,to: %f,each: %s,isWorking: %b}",  ends, from1, on1, starts1, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(Double ends, String from1, String on1, String starts1, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends = ends;
        this.from1 = from1;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %f,from: %s,on: %s,starts: %s,to: %s,each: %s,isWorking: %b}",  ends, from1, on1, starts1, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, Double from, Double on, Double starts, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from = from;
        this.on = on;
        this.starts = starts;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %f,on: %f,starts: %f,to: %f,each: %s,isWorking: %b}",  ends1, from, on, starts, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, Double from, Double on, Double starts, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from = from;
        this.on = on;
        this.starts = starts;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %f,on: %f,starts: %f,to: %s,each: %s,isWorking: %b}",  ends1, from, on, starts, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, Double from, Double on, String starts1, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from = from;
        this.on = on;
        this.starts1 = starts1;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %f,on: %f,starts: %s,to: %f,each: %s,isWorking: %b}",  ends1, from, on, starts1, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, Double from, Double on, String starts1, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from = from;
        this.on = on;
        this.starts1 = starts1;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %f,on: %f,starts: %s,to: %s,each: %s,isWorking: %b}",  ends1, from, on, starts1, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, Double from, String on1, Double starts, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from = from;
        this.on1 = on1;
        this.starts = starts;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %f,on: %s,starts: %f,to: %f,each: %s,isWorking: %b}",  ends1, from, on1, starts, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, Double from, String on1, Double starts, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from = from;
        this.on1 = on1;
        this.starts = starts;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %f,on: %s,starts: %f,to: %s,each: %s,isWorking: %b}",  ends1, from, on1, starts, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, Double from, String on1, String starts1, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from = from;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %f,on: %s,starts: %s,to: %f,each: %s,isWorking: %b}",  ends1, from, on1, starts1, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, Double from, String on1, String starts1, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from = from;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %f,on: %s,starts: %s,to: %s,each: %s,isWorking: %b}",  ends1, from, on1, starts1, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, String from1, Double on, Double starts, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from1 = from1;
        this.on = on;
        this.starts = starts;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %s,on: %f,starts: %f,to: %f,each: %s,isWorking: %b}",  ends1, from1, on, starts, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, String from1, Double on, Double starts, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from1 = from1;
        this.on = on;
        this.starts = starts;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %s,on: %f,starts: %f,to: %s,each: %s,isWorking: %b}",  ends1, from1, on, starts, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, String from1, Double on, String starts1, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from1 = from1;
        this.on = on;
        this.starts1 = starts1;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %s,on: %f,starts: %s,to: %f,each: %s,isWorking: %b}",  ends1, from1, on, starts1, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, String from1, Double on, String starts1, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from1 = from1;
        this.on = on;
        this.starts1 = starts1;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %s,on: %f,starts: %s,to: %s,each: %s,isWorking: %b}",  ends1, from1, on, starts1, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, String from1, String on1, Double starts, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from1 = from1;
        this.on1 = on1;
        this.starts = starts;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %s,on: %s,starts: %f,to: %f,each: %s,isWorking: %b}",  ends1, from1, on1, starts, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, String from1, String on1, Double starts, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from1 = from1;
        this.on1 = on1;
        this.starts = starts;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %s,on: %s,starts: %f,to: %s,each: %s,isWorking: %b}",  ends1, from1, on1, starts, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, String from1, String on1, String starts1, Double to, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from1 = from1;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to = to;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %s,on: %s,starts: %s,to: %f,each: %s,isWorking: %b}",  ends1, from1, on1, starts1, to, (each != null) ? each.generateJs() : "null", isWorking));
    }
    public Availability(String ends1, String from1, String on1, String starts1, String to1, AvailabilityPeriod each, Boolean isWorking) {
        this.ends1 = ends1;
        this.from1 = from1;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to1 = to1;
        this.each = each;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{ends: %s,from: %s,on: %s,starts: %s,to: %s,each: %s,isWorking: %b}",  ends1, from1, on1, starts1, to1, (each != null) ? each.generateJs() : "null", isWorking));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}