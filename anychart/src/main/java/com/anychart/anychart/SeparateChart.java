package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Base class for all charts, contains the margins, the background and the title.
 */
public class SeparateChart extends ChartWithCredits {

    public SeparateChart() {
        js.setLength(0);
        js.append("var separateChart").append(++variableIndex).append(" = anychart.core.separateChart();");
        jsBase = "separateChart" + variableIndex;
    }

    protected SeparateChart(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected SeparateChart(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Interactivity getInteractivity;

    /**
     * Gets the current interactivity settings for chart.
     */
    public Interactivity getInteractivity() {
        if (getInteractivity == null)
            getInteractivity = new Interactivity(jsBase + ".interactivity()");

        return getInteractivity;
    }

    private String interactivity;
    private HoverMode interactivity1;
    private String interactivity2;

    /**
     * Sets interactivity settings for chart.
     */
    public SeparateChart setInteractivity(String interactivity) {
        if (jsBase == null) {
            this.interactivity = null;
            this.interactivity1 = null;
            this.interactivity2 = null;
            
            this.interactivity = interactivity;
        } else {
            this.interactivity = interactivity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".interactivity(%s)", wrapQuotes(interactivity)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interactivity(%s)", wrapQuotes(interactivity)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets interactivity settings for chart.
     */
    public SeparateChart setInteractivity(HoverMode interactivity1) {
        if (jsBase == null) {
            this.interactivity = null;
            this.interactivity1 = null;
            this.interactivity2 = null;
            
            this.interactivity1 = interactivity1;
        } else {
            this.interactivity1 = interactivity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".interactivity(%s)", ((interactivity1 != null) ? interactivity1.generateJs() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interactivity(%s)", ((interactivity1 != null) ? interactivity1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLegend getLegend;

    /**
     * Getter for the current chart legend.
     */
    public UiLegend getLegend() {
        if (getLegend == null)
            getLegend = new UiLegend(jsBase + ".legend()");

        return getLegend;
    }

    private String legend;
    private Boolean legend1;

    /**
     * Setter for chart legend setting.
     */
    public Chart setLegend(String legend) {
        if (jsBase == null) {
            this.legend = null;
            this.legend1 = null;
            
            this.legend = legend;
        } else {
            this.legend = legend;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".legend(%s);", wrapQuotes(legend)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".legend(%s)", wrapQuotes(legend)));
                js.setLength(0);
            }
        }
        return new Chart(jsBase);
    }


    /**
     * Setter for chart legend setting.
     */
    public Chart setLegend(Boolean legend1) {
        if (jsBase == null) {
            this.legend = null;
            this.legend1 = null;
            
            this.legend1 = legend1;
        } else {
            this.legend1 = legend1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".legend(%b);", legend1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".legend(%b)", legend1));
                js.setLength(0);
            }
        }
        return new Chart(jsBase);
    }

    private String generateJSgetInteractivity() {
        if (getInteractivity != null) {
            return getInteractivity.generateJs();
        }
        return "";
    }

    private String generateJSgetLegend() {
        if (getLegend != null) {
            return getLegend.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetInteractivity());
        jsGetters.append(generateJSgetLegend());

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