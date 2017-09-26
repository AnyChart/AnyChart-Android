package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class MapPoint extends JsObject {

    private String jsBase;

    public MapPoint() {

    }

    protected MapPoint(String jsBase) {
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

    private SeparateChart getgetChart;

    public SeparateChart getGetchart() {
        if (getgetChart == null)
            getgetChart = new SeparateChart(jsBase + ".getChart()");

        return getgetChart;
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

    private String generateJSgetgetChart() {
        if (getgetChart != null) {
            return getgetChart.generateJs();
        }
        return "";
    }

    private String generateJSfield() {
        if (field != null) {
            return String.format(Locale.US, "field: %s,", field);
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
            js.append(generateJShovered());
            js.append(generateJSselected());
            js.append(generateJSfield1());
            js.append("}");
        }
            js.append(generateJSgetgetChart());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}