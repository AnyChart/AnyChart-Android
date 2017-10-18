package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Point extends JsObject {

    public Point() {

    }

    protected Point(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Point(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String field;

    public void get(String field) {
        if (jsBase == null) {
            this.field = field;
        } else {
            this.field = field;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".get(%s);", field));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%s)", field));
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

    private Boolean hovered;

    public Point setHovered(Boolean hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".hovered(%b)", hovered));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hovered(%b)", hovered));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean selected;

    public Point setSelected(Boolean selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".selected(%b)", selected));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selected(%b)", selected));
                js.setLength(0);
            }
        }
        return this;
    }

    private String field1;

    public Point setSet(String field1) {
        if (jsBase == null) {
            this.field = null;
            this.field1 = null;
            
            this.field1 = field1;
        } else {
            this.field1 = field1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".set(%s)", field1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", field1));
                js.setLength(0);
            }
        }
        return this;
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


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetChart());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSfield());
            js.append(generateJShovered());
            js.append(generateJSselected());
            js.append(generateJSfield1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}