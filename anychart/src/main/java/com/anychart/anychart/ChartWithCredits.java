package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class ChartWithCredits extends Chart {

    public ChartWithCredits() {

    }

    protected ChartWithCredits(String jsBase) {
        this.jsBase = jsBase;
    }

    protected ChartWithCredits(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private ChartCredits getCredits;

    public ChartCredits getCredits() {
        if (getCredits == null)
            getCredits = new ChartCredits(jsBase + ".credits()");

        return getCredits;
    }

    private String credits;
    private Boolean credits1;

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

            js.append(String.format(Locale.US, jsBase + ".credits(%s);", credits));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".credits(%s)", credits));
                js.setLength(0);
            }
        }
        return new Chart(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".credits(%b);", credits1));

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

    private String generateJScredits() {
        if (credits != null) {
            return String.format(Locale.US, "credits: %s,", credits);
        }
        return "";
    }

    private String generateJScredits1() {
        if (credits1 != null) {
            return String.format(Locale.US, "credits: %b,", credits1);
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJScredits());
            js.append(generateJScredits1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}