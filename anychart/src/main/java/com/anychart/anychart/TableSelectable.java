package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class TableSelectable extends JsObject {

    private String jsBase;

    public TableSelectable() {

    }

    protected TableSelectable(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double key;
    private TableSearchMode mode;

    public void setSearch(Double key, TableSearchMode mode) {
        if (jsBase == null) {
            this.key = key;
            this.mode = mode;
        } else {
            this.key = key;
            this.mode = mode;

            js.append(String.format(Locale.US, jsBase + ".search(%f, %s);", key, (mode != null) ? mode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%f, %s);", key, (mode != null) ? mode.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double startDate;
    private String startDate1;
    private Double endDate;
    private String endDate1;
    private Interval intervalUnit;
    private Double intervalCount;

    public void setSelect(Double startDate, Double endDate, Interval intervalUnit, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
        } else {
            this.startDate = startDate;
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;

            js.append(String.format(Locale.US, jsBase + ".select(%f, %f, %s, %f);", startDate, endDate, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%f, %f, %s, %f);", startDate, endDate, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));
                js.setLength(0);
            }
        }
    }


    public void setSelect(Double startDate, String endDate1, Interval intervalUnit, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate = startDate;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
        } else {
            this.startDate = startDate;
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;

            js.append(String.format(Locale.US, jsBase + ".select(%f, %s, %s, %f);", startDate, endDate1, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%f, %s, %s, %f);", startDate, endDate1, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));
                js.setLength(0);
            }
        }
    }


    public void setSelect(String startDate1, Double endDate, Interval intervalUnit, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
        } else {
            this.startDate1 = startDate1;
            this.endDate = endDate;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;

            js.append(String.format(Locale.US, jsBase + ".select(%s, %f, %s, %f);", startDate1, endDate, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s, %f, %s, %f);", startDate1, endDate, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));
                js.setLength(0);
            }
        }
    }


    public void setSelect(String startDate1, String endDate1, Interval intervalUnit, Double intervalCount) {
        if (jsBase == null) {
            this.startDate = null;
            this.startDate1 = null;
            
            this.startDate1 = startDate1;
            this.endDate = null;
            this.endDate1 = null;
            
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;
        } else {
            this.startDate1 = startDate1;
            this.endDate1 = endDate1;
            this.intervalUnit = intervalUnit;
            this.intervalCount = intervalCount;

            js.append(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %f);", startDate1, endDate1, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %f);", startDate1, endDate1, (intervalUnit != null) ? intervalUnit.generateJs() : "null", intervalCount));
                js.setLength(0);
            }
        }
    }

    private Interval intervalUnit1;
    private Double intervalCount1;

    public void setSelectall(Interval intervalUnit1, Double intervalCount1) {
        if (jsBase == null) {
            this.intervalUnit = null;
            this.intervalUnit1 = null;
            
            this.intervalUnit1 = intervalUnit1;
            this.intervalCount = null;
            this.intervalCount1 = null;
            
            this.intervalCount1 = intervalCount1;
        } else {
            this.intervalUnit1 = intervalUnit1;
            this.intervalCount1 = intervalCount1;

            js.append(String.format(Locale.US, jsBase + ".selectAll(%s, %f);", (intervalUnit1 != null) ? intervalUnit1.generateJs() : "null", intervalCount1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectAll(%s, %f);", (intervalUnit1 != null) ? intervalUnit1.generateJs() : "null", intervalCount1));
                js.setLength(0);
            }
        }
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
            return String.format(Locale.US, "startDate: %s,", startDate1);
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
            return String.format(Locale.US, "endDate: %s,", endDate1);
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
        if (jsBase == null) {
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
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}