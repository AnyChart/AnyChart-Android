package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
    private String interactivity2;

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


//
//    private String generateJSInteractivity getInteractivity() {
//        if (Interactivity getInteractivity != null) {
//            return Interactivity getInteractivity.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSUiLegend getLegend() {
//        if (UiLegend getLegend != null) {
//            return UiLegend getLegend.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetInteractivity() {
        if (getInteractivity != null) {
            return getInteractivity.generateJs();
            //return String.format(Locale.US, "getInteractivity: %s,", ((getInteractivity != null) ? getInteractivity.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetLegend() {
        if (getLegend != null) {
            return getLegend.generateJs();
            //return String.format(Locale.US, "getLegend: %s,", ((getLegend != null) ? getLegend.generateJs() : "null"));
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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSinteractivity());
////        
//            js.append(generateJSinteractivity1());
////        
//            js.append(generateJSinteractivity2());
////        
//            js.append(generateJSlegend());
////        
//            js.append(generateJSlegend1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}