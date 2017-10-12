package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class SeparateChart extends ChartWithCredits {

    public SeparateChart() {

    }

    protected SeparateChart(String jsBase) {
        this.jsBase = jsBase;
    }

    protected SeparateChart(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Interactivity getInteractivity;

    public Interactivity getInteractivity() {
        if (getInteractivity == null)
            getInteractivity = new Interactivity(jsBase + ".interactivity()");

        return getInteractivity;
    }

    private String interactivity;
    private HoverMode interactivity1;

    public SeparateChart setInteractivity(String interactivity) {
        if (jsBase == null) {
            this.interactivity = null;
            this.interactivity1 = null;
            
            this.interactivity = interactivity;
        } else {
            this.interactivity = interactivity;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".interactivity(%s)", interactivity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interactivity(%s)", interactivity));
                js.setLength(0);
            }
        }
        return this;
    }


    public SeparateChart setInteractivity(HoverMode interactivity1) {
        if (jsBase == null) {
            this.interactivity = null;
            this.interactivity1 = null;
            
            this.interactivity1 = interactivity1;
        } else {
            this.interactivity1 = interactivity1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".interactivity(%s)", (interactivity1 != null) ? interactivity1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".interactivity(%s)", (interactivity1 != null) ? interactivity1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLegend getLegend;

    public UiLegend getLegend() {
        if (getLegend == null)
            getLegend = new UiLegend(jsBase + ".legend()");

        return getLegend;
    }

    private String legend;
    private Boolean legend1;

    public Chart setLegend(String legend) {
        if (jsBase == null) {
            this.legend = null;
            this.legend1 = null;
            
            this.legend = legend;
        } else {
            this.legend = legend;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".legend(%s);", legend));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".legend(%s)", legend));
                js.setLength(0);
            }
        }
        return new Chart(jsBase);
    }


    public Chart setLegend(Boolean legend1) {
        if (jsBase == null) {
            this.legend = null;
            this.legend1 = null;
            
            this.legend1 = legend1;
        } else {
            this.legend1 = legend1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private String generateJSinteractivity() {
        if (interactivity != null) {
            return String.format(Locale.US, "interactivity: %s,", interactivity);
        }
        return "";
    }

    private String generateJSinteractivity1() {
        if (interactivity1 != null) {
            return String.format(Locale.US, "interactivity: %s,", (interactivity1 != null) ? interactivity1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlegend() {
        if (legend != null) {
            return String.format(Locale.US, "legend: %s,", legend);
        }
        return "";
    }

    private String generateJSlegend1() {
        if (legend1 != null) {
            return String.format(Locale.US, "legend: %b,", legend1);
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSinteractivity());
            js.append(generateJSinteractivity1());
            js.append(generateJSlegend());
            js.append(generateJSlegend1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}