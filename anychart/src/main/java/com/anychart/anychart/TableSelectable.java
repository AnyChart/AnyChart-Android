package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class TableSelectable extends JsObject {

    
    private Double key;
    private TableSearchMode mode;

    public void setSearch(Double key, TableSearchMode mode) {
        this.key = key;
        this.mode = mode;
    }

    private Double startDate;
    private String startDate1;
    private Double endDate;
    private String endDate1;
    private Interval intervalUnit;
    private Double intervalCount;

    public void setSelect(Double startDate, Double endDate, Interval intervalUnit, Double intervalCount) {
        this.startDate = null;
        this.startDate1 = null;
        
        this.startDate = startDate;
        this.endDate = null;
        this.endDate1 = null;
        
        this.endDate = endDate;
        this.intervalUnit = intervalUnit;
        this.intervalCount = intervalCount;
    }


    public void setSelect(Double startDate, String endDate1, Interval intervalUnit, Double intervalCount) {
        this.startDate = null;
        this.startDate1 = null;
        
        this.startDate = startDate;
        this.endDate = null;
        this.endDate1 = null;
        
        this.endDate1 = endDate1;
        this.intervalUnit = intervalUnit;
        this.intervalCount = intervalCount;
    }


    public void setSelect(String startDate1, Double endDate, Interval intervalUnit, Double intervalCount) {
        this.startDate = null;
        this.startDate1 = null;
        
        this.startDate1 = startDate1;
        this.endDate = null;
        this.endDate1 = null;
        
        this.endDate = endDate;
        this.intervalUnit = intervalUnit;
        this.intervalCount = intervalCount;
    }


    public void setSelect(String startDate1, String endDate1, Interval intervalUnit, Double intervalCount) {
        this.startDate = null;
        this.startDate1 = null;
        
        this.startDate1 = startDate1;
        this.endDate = null;
        this.endDate1 = null;
        
        this.endDate1 = endDate1;
        this.intervalUnit = intervalUnit;
        this.intervalCount = intervalCount;
    }

    private Interval intervalUnit1;
    private Double intervalCount1;

    public void setSelectall(Interval intervalUnit1, Double intervalCount1) {
        this.intervalUnit = null;
        this.intervalUnit1 = null;
        
        this.intervalUnit1 = intervalUnit1;
        this.intervalCount = null;
        this.intervalCount1 = null;
        
        this.intervalCount1 = intervalCount1;
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %f,", key);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %s,", (mode != null) ? mode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstartDate() {
        if (startDate != null) {
            return String.format(Locale.US, "startDate: %f,", startDate);
        }
        return "";
    }

    private String generateJSstartDate1() {
        if (startDate1 != null) {
            return String.format(Locale.US, "startDate: \"%s\",", startDate1);
        }
        return "";
    }

    private String generateJSendDate() {
        if (endDate != null) {
            return String.format(Locale.US, "endDate: %f,", endDate);
        }
        return "";
    }

    private String generateJSendDate1() {
        if (endDate1 != null) {
            return String.format(Locale.US, "endDate: \"%s\",", endDate1);
        }
        return "";
    }

    private String generateJSintervalUnit() {
        if (intervalUnit != null) {
            return String.format(Locale.US, "intervalUnit: %s,", (intervalUnit != null) ? intervalUnit.generateJs() : "null");
        }
        return "";
    }

    private String generateJSintervalCount() {
        if (intervalCount != null) {
            return String.format(Locale.US, "intervalCount: %f,", intervalCount);
        }
        return "";
    }

    private String generateJSintervalUnit1() {
        if (intervalUnit1 != null) {
            return String.format(Locale.US, "intervalUnit: %s,", (intervalUnit1 != null) ? intervalUnit1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSintervalCount1() {
        if (intervalCount1 != null) {
            return String.format(Locale.US, "intervalCount: %f,", intervalCount1);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSkey());
        js.append(generateJSmode());
        js.append(generateJSstartDate());
        js.append(generateJSstartDate1());
        js.append(generateJSendDate());
        js.append(generateJSendDate1());
        js.append(generateJSintervalUnit());
        js.append(generateJSintervalCount());
        js.append(generateJSintervalUnit1());
        js.append(generateJSintervalCount1());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}