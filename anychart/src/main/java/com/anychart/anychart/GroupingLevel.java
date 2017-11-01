package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for grouping level.
 */
public class GroupingLevel extends JsObject  {

    
    private Double count;
    private Interval unit;
    private String unit1;

    
    public GroupingLevel(Interval unit, Double count) {
        this.unit = unit;
        this.count = count;

        js.append(String.format(Locale.US, "{unit: %s,count: %f}",  ((unit != null) ? unit.generateJs() : "null"), count));
    }
    public GroupingLevel(String unit1, Double count) {
        this.unit1 = unit1;
        this.count = count;

        js.append(String.format(Locale.US, "{unit: %s,count: %f}",  wrapQuotes(unit1), count));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}