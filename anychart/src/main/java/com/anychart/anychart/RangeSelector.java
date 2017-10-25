package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class RangeSelector extends JsObject {

    public RangeSelector() {

    }

    protected RangeSelector(String jsBase) {
        this.jsBase = jsBase;
    }

    protected RangeSelector(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Element decorate;

    public void decorate(Element decorate) {
        if (jsBase == null) {
            this.decorate = decorate;
        } else {
            this.decorate = decorate;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".decorate(%s);", ((decorate != null) ? decorate.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".decorate(%s)", ((decorate != null) ? decorate.generateJs() : "null")));
                js.setLength(0);
            }
        }
    }

    private Range[] ranges;

    public void setRanges(Range[] ranges) {
        if (jsBase == null) {
            this.ranges = ranges;
        } else {
            this.ranges = ranges;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".ranges(%s);", arrayToString(ranges)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ranges(%s)", arrayToString(ranges)));
                js.setLength(0);
            }
        }
    }

    private ChartsStock parentElement;
    private Element parentElement1;

    public void render(ChartsStock parentElement) {
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

            js.append(String.format(Locale.US, jsBase + ".render(%s);", ((parentElement != null) ? parentElement.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".render(%s)", ((parentElement != null) ? parentElement.generateJs() : "null")));
                js.setLength(0);
            }
        }
    }


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

            js.append(String.format(Locale.US, jsBase + ".render(%s);", ((parentElement1 != null) ? parentElement1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".render(%s)", ((parentElement1 != null) ? parentElement1.generateJs() : "null")));
                js.setLength(0);
            }
        }
    }

    private ChartsStock chart;

    public void target(ChartsStock chart) {
        if (jsBase == null) {
            this.chart = chart;
        } else {
            this.chart = chart;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".target(%s);", ((chart != null) ? chart.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".target(%s)", ((chart != null) ? chart.generateJs() : "null")));
                js.setLength(0);
            }
        }
    }

    private String zoomLabelText;

    public RangeSelector setZoomLabelText(String zoomLabelText) {
        if (jsBase == null) {
            this.zoomLabelText = zoomLabelText;
        } else {
            this.zoomLabelText = zoomLabelText;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".zoomLabelText(%s)", wrapQuotes(zoomLabelText)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".zoomLabelText(%s)", wrapQuotes(zoomLabelText)));
                js.setLength(0);
            }
        }
        return this;
    }


//

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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSdecorate());
////        
//            js.append(generateJSranges());
////        
//            js.append(generateJSparentElement());
////        
//            js.append(generateJSparentElement1());
////        
//            js.append(generateJSchart());
////        
//            js.append(generateJSzoomLabelText());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}