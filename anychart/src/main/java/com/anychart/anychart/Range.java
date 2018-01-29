package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for range.
 */
public class Range extends JsObject  {

    
    private StockRangeAnchor anchor;
    private String anchor1;
    private Number count;
    private String endDate;
    private String startDate;
    private String text;
    private StockRangeType type;
    private String type1;
    private Interval unit;
    private String unit1;

    
    public Range(StockRangeAnchor anchor, StockRangeType type, Interval unit, Number count, String endDate, String startDate, String text) {
        this.anchor = anchor;
        this.type = type;
        this.unit = unit;
        this.count = count;
        this.endDate = endDate;
        this.startDate = startDate;
        this.text = text;

        js.append(String.format(Locale.US, "{anchor: %s,type: %s,unit: %s,count: %s,endDate: %s,startDate: %s,text: %s}",  ((anchor != null) ? anchor.generateJs() : "null"), ((type != null) ? type.generateJs() : "null"), ((unit != null) ? unit.generateJs() : "null"), count, wrapQuotes(endDate), wrapQuotes(startDate), wrapQuotes(text)));
    }
    public Range(StockRangeAnchor anchor, StockRangeType type, String unit1, Number count, String endDate, String startDate, String text) {
        this.anchor = anchor;
        this.type = type;
        this.unit1 = unit1;
        this.count = count;
        this.endDate = endDate;
        this.startDate = startDate;
        this.text = text;

        js.append(String.format(Locale.US, "{anchor: %s,type: %s,unit: %s,count: %s,endDate: %s,startDate: %s,text: %s}",  ((anchor != null) ? anchor.generateJs() : "null"), ((type != null) ? type.generateJs() : "null"), wrapQuotes(unit1), count, wrapQuotes(endDate), wrapQuotes(startDate), wrapQuotes(text)));
    }
    public Range(StockRangeAnchor anchor, String type1, Interval unit, Number count, String endDate, String startDate, String text) {
        this.anchor = anchor;
        this.type1 = type1;
        this.unit = unit;
        this.count = count;
        this.endDate = endDate;
        this.startDate = startDate;
        this.text = text;

        js.append(String.format(Locale.US, "{anchor: %s,type: %s,unit: %s,count: %s,endDate: %s,startDate: %s,text: %s}",  ((anchor != null) ? anchor.generateJs() : "null"), wrapQuotes(type1), ((unit != null) ? unit.generateJs() : "null"), count, wrapQuotes(endDate), wrapQuotes(startDate), wrapQuotes(text)));
    }
    public Range(StockRangeAnchor anchor, String type1, String unit1, Number count, String endDate, String startDate, String text) {
        this.anchor = anchor;
        this.type1 = type1;
        this.unit1 = unit1;
        this.count = count;
        this.endDate = endDate;
        this.startDate = startDate;
        this.text = text;

        js.append(String.format(Locale.US, "{anchor: %s,type: %s,unit: %s,count: %s,endDate: %s,startDate: %s,text: %s}",  ((anchor != null) ? anchor.generateJs() : "null"), wrapQuotes(type1), wrapQuotes(unit1), count, wrapQuotes(endDate), wrapQuotes(startDate), wrapQuotes(text)));
    }
    public Range(String anchor1, StockRangeType type, Interval unit, Number count, String endDate, String startDate, String text) {
        this.anchor1 = anchor1;
        this.type = type;
        this.unit = unit;
        this.count = count;
        this.endDate = endDate;
        this.startDate = startDate;
        this.text = text;

        js.append(String.format(Locale.US, "{anchor: %s,type: %s,unit: %s,count: %s,endDate: %s,startDate: %s,text: %s}",  wrapQuotes(anchor1), ((type != null) ? type.generateJs() : "null"), ((unit != null) ? unit.generateJs() : "null"), count, wrapQuotes(endDate), wrapQuotes(startDate), wrapQuotes(text)));
    }
    public Range(String anchor1, StockRangeType type, String unit1, Number count, String endDate, String startDate, String text) {
        this.anchor1 = anchor1;
        this.type = type;
        this.unit1 = unit1;
        this.count = count;
        this.endDate = endDate;
        this.startDate = startDate;
        this.text = text;

        js.append(String.format(Locale.US, "{anchor: %s,type: %s,unit: %s,count: %s,endDate: %s,startDate: %s,text: %s}",  wrapQuotes(anchor1), ((type != null) ? type.generateJs() : "null"), wrapQuotes(unit1), count, wrapQuotes(endDate), wrapQuotes(startDate), wrapQuotes(text)));
    }
    public Range(String anchor1, String type1, Interval unit, Number count, String endDate, String startDate, String text) {
        this.anchor1 = anchor1;
        this.type1 = type1;
        this.unit = unit;
        this.count = count;
        this.endDate = endDate;
        this.startDate = startDate;
        this.text = text;

        js.append(String.format(Locale.US, "{anchor: %s,type: %s,unit: %s,count: %s,endDate: %s,startDate: %s,text: %s}",  wrapQuotes(anchor1), wrapQuotes(type1), ((unit != null) ? unit.generateJs() : "null"), count, wrapQuotes(endDate), wrapQuotes(startDate), wrapQuotes(text)));
    }
    public Range(String anchor1, String type1, String unit1, Number count, String endDate, String startDate, String text) {
        this.anchor1 = anchor1;
        this.type1 = type1;
        this.unit1 = unit1;
        this.count = count;
        this.endDate = endDate;
        this.startDate = startDate;
        this.text = text;

        js.append(String.format(Locale.US, "{anchor: %s,type: %s,unit: %s,count: %s,endDate: %s,startDate: %s,text: %s}",  wrapQuotes(anchor1), wrapQuotes(type1), wrapQuotes(unit1), count, wrapQuotes(endDate), wrapQuotes(startDate), wrapQuotes(text)));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}