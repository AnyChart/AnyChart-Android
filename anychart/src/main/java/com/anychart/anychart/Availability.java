package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for availabilities.
 */
public class Availability extends JsObject  {

    
    private AvailabilityPeriod each;
    private String each1;
    private Number ends;
    private String ends1;
    private Number from;
    private String from1;
    private Boolean isWorking;
    private Number on;
    private String on1;
    private Number starts;
    private String starts1;
    private Number to;
    private String to1;

    
    public Availability(AvailabilityPeriod each, Number ends, Number from, Number on, Number starts, Number to, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from = from;
        this.on = on;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, from, on, starts, to, isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, Number on, Number starts, String to1, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from = from;
        this.on = on;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, from, on, starts, wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, Number on, String starts1, Number to, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from = from;
        this.on = on;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, from, on, wrapQuotes(starts1), to, isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, Number on, String starts1, String to1, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from = from;
        this.on = on;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, from, on, wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, String on1, Number starts, Number to, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from = from;
        this.on1 = on1;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, from, wrapQuotes(on1), starts, to, isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, String on1, Number starts, String to1, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from = from;
        this.on1 = on1;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, from, wrapQuotes(on1), starts, wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, String on1, String starts1, Number to, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from = from;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, from, wrapQuotes(on1), wrapQuotes(starts1), to, isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, String on1, String starts1, String to1, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from = from;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, from, wrapQuotes(on1), wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from1, Number on, Number starts, Number to, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from1 = from1;
        this.on = on;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, wrapQuotes(from1), on, starts, to, isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from1, Number on, Number starts, String to1, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from1 = from1;
        this.on = on;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, wrapQuotes(from1), on, starts, wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from1, Number on, String starts1, Number to, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from1 = from1;
        this.on = on;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, wrapQuotes(from1), on, wrapQuotes(starts1), to, isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from1, Number on, String starts1, String to1, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from1 = from1;
        this.on = on;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, wrapQuotes(from1), on, wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from1, String on1, Number starts, Number to, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from1 = from1;
        this.on1 = on1;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, wrapQuotes(from1), wrapQuotes(on1), starts, to, isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from1, String on1, Number starts, String to1, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from1 = from1;
        this.on1 = on1;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, wrapQuotes(from1), wrapQuotes(on1), starts, wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from1, String on1, String starts1, Number to, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from1 = from1;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, wrapQuotes(from1), wrapQuotes(on1), wrapQuotes(starts1), to, isWorking));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from1, String on1, String starts1, String to1, Boolean isWorking) {
        this.each = each;
        this.ends = ends;
        this.from1 = from1;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), ends, wrapQuotes(from1), wrapQuotes(on1), wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, Number from, Number on, Number starts, Number to, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from = from;
        this.on = on;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), from, on, starts, to, isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, Number from, Number on, Number starts, String to1, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from = from;
        this.on = on;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), from, on, starts, wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, Number from, Number on, String starts1, Number to, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from = from;
        this.on = on;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), from, on, wrapQuotes(starts1), to, isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, Number from, Number on, String starts1, String to1, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from = from;
        this.on = on;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), from, on, wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, Number from, String on1, Number starts, Number to, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from = from;
        this.on1 = on1;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), from, wrapQuotes(on1), starts, to, isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, Number from, String on1, Number starts, String to1, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from = from;
        this.on1 = on1;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), from, wrapQuotes(on1), starts, wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, Number from, String on1, String starts1, Number to, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from = from;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), from, wrapQuotes(on1), wrapQuotes(starts1), to, isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, Number from, String on1, String starts1, String to1, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from = from;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), from, wrapQuotes(on1), wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, String from1, Number on, Number starts, Number to, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on = on;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), wrapQuotes(from1), on, starts, to, isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, String from1, Number on, Number starts, String to1, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on = on;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), wrapQuotes(from1), on, starts, wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, String from1, Number on, String starts1, Number to, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on = on;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), wrapQuotes(from1), on, wrapQuotes(starts1), to, isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, String from1, Number on, String starts1, String to1, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on = on;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), wrapQuotes(from1), on, wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, String from1, String on1, Number starts, Number to, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on1 = on1;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), wrapQuotes(from1), wrapQuotes(on1), starts, to, isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, String from1, String on1, Number starts, String to1, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on1 = on1;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), wrapQuotes(from1), wrapQuotes(on1), starts, wrapQuotes(to1), isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, String from1, String on1, String starts1, Number to, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), wrapQuotes(from1), wrapQuotes(on1), wrapQuotes(starts1), to, isWorking));
    }
    public Availability(AvailabilityPeriod each, String ends1, String from1, String on1, String starts1, String to1, Boolean isWorking) {
        this.each = each;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  ((each != null) ? each.generateJs() : "null"), wrapQuotes(ends1), wrapQuotes(from1), wrapQuotes(on1), wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, Number ends, Number from, Number on, Number starts, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from = from;
        this.on = on;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, from, on, starts, to, isWorking));
    }
    public Availability(String each1, Number ends, Number from, Number on, Number starts, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from = from;
        this.on = on;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, from, on, starts, wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, Number ends, Number from, Number on, String starts1, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from = from;
        this.on = on;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, from, on, wrapQuotes(starts1), to, isWorking));
    }
    public Availability(String each1, Number ends, Number from, Number on, String starts1, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from = from;
        this.on = on;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, from, on, wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, Number ends, Number from, String on1, Number starts, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from = from;
        this.on1 = on1;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, from, wrapQuotes(on1), starts, to, isWorking));
    }
    public Availability(String each1, Number ends, Number from, String on1, Number starts, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from = from;
        this.on1 = on1;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, from, wrapQuotes(on1), starts, wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, Number ends, Number from, String on1, String starts1, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from = from;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, from, wrapQuotes(on1), wrapQuotes(starts1), to, isWorking));
    }
    public Availability(String each1, Number ends, Number from, String on1, String starts1, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from = from;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, from, wrapQuotes(on1), wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, Number ends, String from1, Number on, Number starts, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from1 = from1;
        this.on = on;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, wrapQuotes(from1), on, starts, to, isWorking));
    }
    public Availability(String each1, Number ends, String from1, Number on, Number starts, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from1 = from1;
        this.on = on;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, wrapQuotes(from1), on, starts, wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, Number ends, String from1, Number on, String starts1, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from1 = from1;
        this.on = on;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, wrapQuotes(from1), on, wrapQuotes(starts1), to, isWorking));
    }
    public Availability(String each1, Number ends, String from1, Number on, String starts1, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from1 = from1;
        this.on = on;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, wrapQuotes(from1), on, wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, Number ends, String from1, String on1, Number starts, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from1 = from1;
        this.on1 = on1;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, wrapQuotes(from1), wrapQuotes(on1), starts, to, isWorking));
    }
    public Availability(String each1, Number ends, String from1, String on1, Number starts, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from1 = from1;
        this.on1 = on1;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, wrapQuotes(from1), wrapQuotes(on1), starts, wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, Number ends, String from1, String on1, String starts1, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from1 = from1;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, wrapQuotes(from1), wrapQuotes(on1), wrapQuotes(starts1), to, isWorking));
    }
    public Availability(String each1, Number ends, String from1, String on1, String starts1, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends = ends;
        this.from1 = from1;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), ends, wrapQuotes(from1), wrapQuotes(on1), wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, String ends1, Number from, Number on, Number starts, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from = from;
        this.on = on;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), from, on, starts, to, isWorking));
    }
    public Availability(String each1, String ends1, Number from, Number on, Number starts, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from = from;
        this.on = on;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), from, on, starts, wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, String ends1, Number from, Number on, String starts1, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from = from;
        this.on = on;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), from, on, wrapQuotes(starts1), to, isWorking));
    }
    public Availability(String each1, String ends1, Number from, Number on, String starts1, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from = from;
        this.on = on;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), from, on, wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, String ends1, Number from, String on1, Number starts, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from = from;
        this.on1 = on1;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), from, wrapQuotes(on1), starts, to, isWorking));
    }
    public Availability(String each1, String ends1, Number from, String on1, Number starts, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from = from;
        this.on1 = on1;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), from, wrapQuotes(on1), starts, wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, String ends1, Number from, String on1, String starts1, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from = from;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), from, wrapQuotes(on1), wrapQuotes(starts1), to, isWorking));
    }
    public Availability(String each1, String ends1, Number from, String on1, String starts1, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from = from;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), from, wrapQuotes(on1), wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, String ends1, String from1, Number on, Number starts, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on = on;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), wrapQuotes(from1), on, starts, to, isWorking));
    }
    public Availability(String each1, String ends1, String from1, Number on, Number starts, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on = on;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), wrapQuotes(from1), on, starts, wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, String ends1, String from1, Number on, String starts1, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on = on;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), wrapQuotes(from1), on, wrapQuotes(starts1), to, isWorking));
    }
    public Availability(String each1, String ends1, String from1, Number on, String starts1, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on = on;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), wrapQuotes(from1), on, wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, String ends1, String from1, String on1, Number starts, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on1 = on1;
        this.starts = starts;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), wrapQuotes(from1), wrapQuotes(on1), starts, to, isWorking));
    }
    public Availability(String each1, String ends1, String from1, String on1, Number starts, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on1 = on1;
        this.starts = starts;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), wrapQuotes(from1), wrapQuotes(on1), starts, wrapQuotes(to1), isWorking));
    }
    public Availability(String each1, String ends1, String from1, String on1, String starts1, Number to, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to = to;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), wrapQuotes(from1), wrapQuotes(on1), wrapQuotes(starts1), to, isWorking));
    }
    public Availability(String each1, String ends1, String from1, String on1, String starts1, String to1, Boolean isWorking) {
        this.each1 = each1;
        this.ends1 = ends1;
        this.from1 = from1;
        this.on1 = on1;
        this.starts1 = starts1;
        this.to1 = to1;
        this.isWorking = isWorking;

        js.append(String.format(Locale.US, "{each: %s,ends: %s,from: %s,on: %s,starts: %s,to: %s,isWorking: %b}",  wrapQuotes(each1), wrapQuotes(ends1), wrapQuotes(from1), wrapQuotes(on1), wrapQuotes(starts1), wrapQuotes(to1), isWorking));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}