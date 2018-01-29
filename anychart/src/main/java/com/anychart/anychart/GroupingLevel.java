package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for grouping level.
 */
public class GroupingLevel extends JsObject  {

    
    private Number count;
    private Interval unit;
    private String unit1;

    
    public GroupingLevel(Interval unit, Number count) {
        this.unit = unit;
        this.count = count;

        js.append(String.format(Locale.US, "{unit: %s,count: %s}",  ((unit != null) ? unit.generateJs() : "null"), count));
    }
    public GroupingLevel(String unit1, Number count) {
        this.unit1 = unit1;
        this.count = count;

        js.append(String.format(Locale.US, "{unit: %s,count: %s}",  wrapQuotes(unit1), count));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}