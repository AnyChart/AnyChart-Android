package com.anychart.scales.calendar;

import com.anychart.JsObject;

import com.anychart.enums.AvailabilityPeriod;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for availabilities.
 */
public class Availability extends JsObject  {

    
    public Availability(AvailabilityPeriod each, Number ends, Number from, Boolean isWorking, Number on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, from, isWorking, on, starts, to));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, Boolean isWorking, Number on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, from, isWorking, on, starts, wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, Boolean isWorking, Number on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, from, isWorking, on, wrapQuotes(starts), to));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, Boolean isWorking, Number on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, from, isWorking, on, wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, Boolean isWorking, String on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, from, isWorking, wrapQuotes(on), starts, to));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, Boolean isWorking, String on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, from, isWorking, wrapQuotes(on), starts, wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, Boolean isWorking, String on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, from, isWorking, wrapQuotes(on), wrapQuotes(starts), to));
    }
    public Availability(AvailabilityPeriod each, Number ends, Number from, Boolean isWorking, String on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, from, isWorking, wrapQuotes(on), wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from, Boolean isWorking, Number on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, wrapQuotes(from), isWorking, on, starts, to));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from, Boolean isWorking, Number on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, wrapQuotes(from), isWorking, on, starts, wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from, Boolean isWorking, Number on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, wrapQuotes(from), isWorking, on, wrapQuotes(starts), to));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from, Boolean isWorking, Number on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, wrapQuotes(from), isWorking, on, wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from, Boolean isWorking, String on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, wrapQuotes(from), isWorking, wrapQuotes(on), starts, to));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from, Boolean isWorking, String on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, wrapQuotes(from), isWorking, wrapQuotes(on), starts, wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from, Boolean isWorking, String on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, wrapQuotes(from), isWorking, wrapQuotes(on), wrapQuotes(starts), to));
    }
    public Availability(AvailabilityPeriod each, Number ends, String from, Boolean isWorking, String on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, ends, wrapQuotes(from), isWorking, wrapQuotes(on), wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, String ends, Number from, Boolean isWorking, Number on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), from, isWorking, on, starts, to));
    }
    public Availability(AvailabilityPeriod each, String ends, Number from, Boolean isWorking, Number on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), from, isWorking, on, starts, wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, String ends, Number from, Boolean isWorking, Number on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), from, isWorking, on, wrapQuotes(starts), to));
    }
    public Availability(AvailabilityPeriod each, String ends, Number from, Boolean isWorking, Number on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), from, isWorking, on, wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, String ends, Number from, Boolean isWorking, String on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), from, isWorking, wrapQuotes(on), starts, to));
    }
    public Availability(AvailabilityPeriod each, String ends, Number from, Boolean isWorking, String on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), from, isWorking, wrapQuotes(on), starts, wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, String ends, Number from, Boolean isWorking, String on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), from, isWorking, wrapQuotes(on), wrapQuotes(starts), to));
    }
    public Availability(AvailabilityPeriod each, String ends, Number from, Boolean isWorking, String on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), from, isWorking, wrapQuotes(on), wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, String ends, String from, Boolean isWorking, Number on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), wrapQuotes(from), isWorking, on, starts, to));
    }
    public Availability(AvailabilityPeriod each, String ends, String from, Boolean isWorking, Number on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), wrapQuotes(from), isWorking, on, starts, wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, String ends, String from, Boolean isWorking, Number on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), wrapQuotes(from), isWorking, on, wrapQuotes(starts), to));
    }
    public Availability(AvailabilityPeriod each, String ends, String from, Boolean isWorking, Number on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), wrapQuotes(from), isWorking, on, wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, String ends, String from, Boolean isWorking, String on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), wrapQuotes(from), isWorking, wrapQuotes(on), starts, to));
    }
    public Availability(AvailabilityPeriod each, String ends, String from, Boolean isWorking, String on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), wrapQuotes(from), isWorking, wrapQuotes(on), starts, wrapQuotes(to)));
    }
    public Availability(AvailabilityPeriod each, String ends, String from, Boolean isWorking, String on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), wrapQuotes(from), isWorking, wrapQuotes(on), wrapQuotes(starts), to));
    }
    public Availability(AvailabilityPeriod each, String ends, String from, Boolean isWorking, String on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", (each != null) ? each.getJsBase() : null, wrapQuotes(ends), wrapQuotes(from), isWorking, wrapQuotes(on), wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(String each, Number ends, Number from, Boolean isWorking, Number on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, from, isWorking, on, starts, to));
    }
    public Availability(String each, Number ends, Number from, Boolean isWorking, Number on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, from, isWorking, on, starts, wrapQuotes(to)));
    }
    public Availability(String each, Number ends, Number from, Boolean isWorking, Number on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, from, isWorking, on, wrapQuotes(starts), to));
    }
    public Availability(String each, Number ends, Number from, Boolean isWorking, Number on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, from, isWorking, on, wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(String each, Number ends, Number from, Boolean isWorking, String on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, from, isWorking, wrapQuotes(on), starts, to));
    }
    public Availability(String each, Number ends, Number from, Boolean isWorking, String on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, from, isWorking, wrapQuotes(on), starts, wrapQuotes(to)));
    }
    public Availability(String each, Number ends, Number from, Boolean isWorking, String on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, from, isWorking, wrapQuotes(on), wrapQuotes(starts), to));
    }
    public Availability(String each, Number ends, Number from, Boolean isWorking, String on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, from, isWorking, wrapQuotes(on), wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(String each, Number ends, String from, Boolean isWorking, Number on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, wrapQuotes(from), isWorking, on, starts, to));
    }
    public Availability(String each, Number ends, String from, Boolean isWorking, Number on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, wrapQuotes(from), isWorking, on, starts, wrapQuotes(to)));
    }
    public Availability(String each, Number ends, String from, Boolean isWorking, Number on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, wrapQuotes(from), isWorking, on, wrapQuotes(starts), to));
    }
    public Availability(String each, Number ends, String from, Boolean isWorking, Number on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, wrapQuotes(from), isWorking, on, wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(String each, Number ends, String from, Boolean isWorking, String on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, wrapQuotes(from), isWorking, wrapQuotes(on), starts, to));
    }
    public Availability(String each, Number ends, String from, Boolean isWorking, String on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, wrapQuotes(from), isWorking, wrapQuotes(on), starts, wrapQuotes(to)));
    }
    public Availability(String each, Number ends, String from, Boolean isWorking, String on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, wrapQuotes(from), isWorking, wrapQuotes(on), wrapQuotes(starts), to));
    }
    public Availability(String each, Number ends, String from, Boolean isWorking, String on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), ends, wrapQuotes(from), isWorking, wrapQuotes(on), wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(String each, String ends, Number from, Boolean isWorking, Number on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), from, isWorking, on, starts, to));
    }
    public Availability(String each, String ends, Number from, Boolean isWorking, Number on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), from, isWorking, on, starts, wrapQuotes(to)));
    }
    public Availability(String each, String ends, Number from, Boolean isWorking, Number on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), from, isWorking, on, wrapQuotes(starts), to));
    }
    public Availability(String each, String ends, Number from, Boolean isWorking, Number on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), from, isWorking, on, wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(String each, String ends, Number from, Boolean isWorking, String on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), from, isWorking, wrapQuotes(on), starts, to));
    }
    public Availability(String each, String ends, Number from, Boolean isWorking, String on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), from, isWorking, wrapQuotes(on), starts, wrapQuotes(to)));
    }
    public Availability(String each, String ends, Number from, Boolean isWorking, String on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), from, isWorking, wrapQuotes(on), wrapQuotes(starts), to));
    }
    public Availability(String each, String ends, Number from, Boolean isWorking, String on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), from, isWorking, wrapQuotes(on), wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(String each, String ends, String from, Boolean isWorking, Number on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), wrapQuotes(from), isWorking, on, starts, to));
    }
    public Availability(String each, String ends, String from, Boolean isWorking, Number on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), wrapQuotes(from), isWorking, on, starts, wrapQuotes(to)));
    }
    public Availability(String each, String ends, String from, Boolean isWorking, Number on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), wrapQuotes(from), isWorking, on, wrapQuotes(starts), to));
    }
    public Availability(String each, String ends, String from, Boolean isWorking, Number on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), wrapQuotes(from), isWorking, on, wrapQuotes(starts), wrapQuotes(to)));
    }
    public Availability(String each, String ends, String from, Boolean isWorking, String on, Number starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), wrapQuotes(from), isWorking, wrapQuotes(on), starts, to));
    }
    public Availability(String each, String ends, String from, Boolean isWorking, String on, Number starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), wrapQuotes(from), isWorking, wrapQuotes(on), starts, wrapQuotes(to)));
    }
    public Availability(String each, String ends, String from, Boolean isWorking, String on, String starts, Number to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), wrapQuotes(from), isWorking, wrapQuotes(on), wrapQuotes(starts), to));
    }
    public Availability(String each, String ends, String from, Boolean isWorking, String on, String starts, String to) {
        js.append(String.format(Locale.US, "{each:%s, ends: %s, from: %s, isWorking: %s, on: %s, starts: %s, to: %s, } ", wrapQuotes(each), wrapQuotes(ends), wrapQuotes(from), isWorking, wrapQuotes(on), wrapQuotes(starts), wrapQuotes(to)));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}