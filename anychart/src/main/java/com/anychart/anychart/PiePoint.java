package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class PiePoint extends Point {

    private String jsBase;

    public PiePoint() {

    }

    protected PiePoint(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String field;

    public void setGet(String field) {
        if (jsBase == null) {
            this.field = field;
        } else {
            this.field = field;

            js.append(String.format(Locale.US, jsBase + ".get(%s);", field));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%s);", field));
                js.setLength(0);
            }
        }
    }

    private SeparateChart getGetChart;

    public SeparateChart getGetChart() {
        if (getGetChart == null)
            getGetChart = new SeparateChart(jsBase + ".getChart()");

        return getGetChart;
    }

    private String key;
    private Statistics key1;

    public void setGetstat(String key) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".getStat(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s);", key));
                js.setLength(0);
            }
        }
    }


    public void setGetstat(Statistics key1) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            
            this.key1 = key1;
        } else {
            this.key1 = key1;

            js.append(String.format(Locale.US, jsBase + ".getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Boolean hovered;

    public void setHovered(Boolean hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;

            js.append(String.format(Locale.US, jsBase + ".hovered(%b);", hovered));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hovered(%b);", hovered));
                js.setLength(0);
            }
        }
    }

    private Boolean selected;

    public void setSelected(Boolean selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;

            js.append(String.format(Locale.US, jsBase + ".selected(%b);", selected));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selected(%b);", selected));
                js.setLength(0);
            }
        }
    }

    private String field1;

    public void setSet(String field1) {
        if (jsBase == null) {
            this.field = null;
            this.field1 = null;
            
            this.field1 = field1;
        } else {
            this.field1 = field1;

            js.append(String.format(Locale.US, jsBase + ".set(%s);", field1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".set(%s);", field1));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetGetChart() {
        if (getGetChart != null) {
            return getGetChart.generateJs();
        }
        return "";
    }

    private String generateJSfield() {
        if (field != null) {
            return String.format(Locale.US, "field: %s,", field);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSkey1() {
        if (key1 != null) {
            return String.format(Locale.US, "key: %s,", (key1 != null) ? key1.generateJs() : "null");
        }
        return "";
    }

    private String generateJShovered() {
        if (hovered != null) {
            return String.format(Locale.US, "hovered: %b,", hovered);
        }
        return "";
    }

    private String generateJSselected() {
        if (selected != null) {
            return String.format(Locale.US, "selected: %b,", selected);
        }
        return "";
    }

    private String generateJSfield1() {
        if (field1 != null) {
            return String.format(Locale.US, "field: %s,", field1);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSfield());
            js.append(generateJSkey());
            js.append(generateJSkey1());
            js.append(generateJShovered());
            js.append(generateJSselected());
            js.append(generateJSfield1());
            js.append("}");
        }
            js.append(generateJSgetGetChart());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}