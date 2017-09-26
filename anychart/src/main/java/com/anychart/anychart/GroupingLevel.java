package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class GroupingLevel extends JsObject  {

    
    private Double count;
    private Interval unit;

    
    public GroupingLevel(Double count, Interval unit) {
        this.count = count;
        this.unit = unit;

        js.append(String.format(Locale.US, "{count: %f,unit: %s}",  count, (unit != null) ? unit.generateJs() : "null"));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}