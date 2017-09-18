package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Range extends JsObject  {

    
    private StockRangeAnchor anchor;
    private Double count;
    private String endDate;
    private String startDate;
    private String text;
    private StockRangeType type;
    private Interval unit;

    
    public Range(StockRangeAnchor anchor, Double count, String endDate, String startDate, String text, StockRangeType type, Interval unit) {
        this.anchor = anchor;
        this.count = count;
        this.endDate = endDate;
        this.startDate = startDate;
        this.text = text;
        this.type = type;
        this.unit = unit;

        js.append(String.format(Locale.US, "{anchor: %s,count: %f,endDate: %s,startDate: %s,text: %s,type: %s,unit: %s}",  (anchor != null) ? anchor.generateJs() : "null", count, endDate, startDate, text, (type != null) ? type.generateJs() : "null", (unit != null) ? unit.generateJs() : "null"));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}