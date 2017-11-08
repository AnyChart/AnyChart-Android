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
public class ChartWithCredits extends Chart {

    public ChartWithCredits() {
        js.setLength(0);
        js.append("var chartWithCredits").append(++variableIndex).append(" = anychart.core.chartWithCredits();");
        jsBase = "chartWithCredits" + variableIndex;
    }

    protected ChartWithCredits(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ChartWithCredits(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private ChartCredits getCredits;

    /**
     * Getter for the current credits.
     */
    public ChartCredits getCredits() {
        if (getCredits == null)
            getCredits = new ChartCredits(jsBase + ".credits()");

        return getCredits;
    }

    private String credits;
    private Boolean credits1;

    /**
     * Setter for the chart credits.
{docs:Quick_Start/Credits}Learn more about credits settings.{docs}
     */
    public Chart setCredits(String credits) {
        if (jsBase == null) {
            this.credits = null;
            this.credits1 = null;
            
            this.credits = credits;
        } else {
            this.credits = credits;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".credits(%s)", wrapQuotes(credits)));
                js.setLength(0);
            }
        }
        return new Chart(jsBase);
    }


    /**
     * Setter for the chart credits.
{docs:Quick_Start/Credits}Learn more about credits settings.{docs}
     */
    public Chart setCredits(Boolean credits1) {
        if (jsBase == null) {
            this.credits = null;
            this.credits1 = null;
            
            this.credits1 = credits1;
        } else {
            this.credits1 = credits1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".credits(%b)", credits1));
                js.setLength(0);
            }
        }
        return new Chart(jsBase);
    }

    private String generateJSgetCredits() {
        if (getCredits != null) {
            return getCredits.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetCredits());

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