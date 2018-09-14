package com.anychart.core.stock.grouping;

import com.anychart.JsObject;

import com.anychart.enums.Interval;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for grouping level.
 */
public class Level extends JsObject  {

    
    public Level(Number count, Interval unit) {
        js.append(String.format(Locale.US, "{count:%s, unit: %s, } ", count, (unit != null) ? unit.getJsBase() : null));
    }
    public Level(Number count, String unit) {
        js.append(String.format(Locale.US, "{count:%s, unit: %s, } ", count, wrapQuotes(unit)));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}