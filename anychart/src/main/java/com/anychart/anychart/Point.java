package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Class that wraps point of series/chart.
 */
public class Point extends JsObject {

    public Point() {
        js.setLength(0);
        js.append("var point").append(++variableIndex).append(" = anychart.core.point();");
        jsBase = "point" + variableIndex;
    }

    protected Point(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Point(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String field;

    /**
     * Fetches a field value from point data row by its name.
     */
    public void get(String field) {
        if (jsBase == null) {
            this.field = field;
        } else {
            this.field = field;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".get(%s);", wrapQuotes(field)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%s);", wrapQuotes(field)));
                js.setLength(0);
            }
        }
    }

    private SeparateChart getGetChart;

    /**
     * Getter for the chart which current point belongs to.
     */
    public SeparateChart getGetChart() {
        if (getGetChart == null)
            getGetChart = new SeparateChart(jsBase + ".getChart()");

        return getGetChart;
    }

    private Boolean hovered;

    /**
     * Setter for hover point state.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hovered(%b);", hovered));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean selected;

    /**
     * Setter for select point state.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selected(%b);", selected));
                js.setLength(0);
            }
        }
        return this;
    }

    private String field1;

    /**
     * Sets the field of the point data row to the specified value.
     */
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
            
            js.append(String.format(Locale.US, ".set(%s)", wrapQuotes(field1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".set(%s);", wrapQuotes(field1)));
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

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}