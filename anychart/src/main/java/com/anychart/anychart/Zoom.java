package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The Zoom class contains methods for configuring zoom ui element.
 */
public class Zoom extends JsObject {

    public Zoom() {
        js.setLength(0);
        js.append("var zoom").append(++variableIndex).append(" = anychart.ui.zoom();");
        jsBase = "zoom" + variableIndex;
    }

    protected Zoom(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Zoom(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element decorate;

    /**
     * Decorates the container for the zoom controller.
     */
    public void decorate(Element decorate) {
        if (jsBase == null) {
            this.decorate = decorate;
        } else {
            this.decorate = decorate;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(decorate.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".decorate(%s);",  ((decorate != null) ? decorate.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".decorate(%s);", ((decorate != null) ? decorate.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }

    private ChartsMap parentElement;
    private Element parentElement1;

    /**
     * Renders the zoom controller.
     */
    public void render(ChartsMap parentElement) {
        if (jsBase == null) {
            this.parentElement = null;
            this.parentElement1 = null;
            
            this.parentElement = parentElement;
        } else {
            this.parentElement = parentElement;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(parentElement.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".render(%s);",  ((parentElement != null) ? parentElement.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".render(%s);", ((parentElement != null) ? parentElement.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }


    /**
     * Renders the zoom controller.
     */
    public void render(Element parentElement1) {
        if (jsBase == null) {
            this.parentElement = null;
            this.parentElement1 = null;
            
            this.parentElement1 = parentElement1;
        } else {
            this.parentElement1 = parentElement1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(parentElement1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".render(%s);",  ((parentElement1 != null) ? parentElement1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".render(%s);", ((parentElement1 != null) ? parentElement1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }

    private ChartsMap chart;

    /**
     * Set Map chart for zoom controller.
     */
    public void target(ChartsMap chart) {
        if (jsBase == null) {
            this.chart = chart;
        } else {
            this.chart = chart;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(chart.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".target(%s);",  ((chart != null) ? chart.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".target(%s);", ((chart != null) ? chart.getJsBase() : "null")));
                js.setLength(0);
            }
        }
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

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