package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Range Selector (only for stock chart).
 */
public class RangeSelector extends JsObject {

    public RangeSelector() {
        js.setLength(0);
        js.append("var rangeSelector").append(++variableIndex).append(" = anychart.ui.rangeSelector();");
        jsBase = "rangeSelector" + variableIndex;
    }

    protected RangeSelector(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected RangeSelector(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element decorate;

    /**
     * Decorates the container for the range selector.
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
        }
    }

    private Range[] ranges;

    /**
     * Setter for buttons setup.
     */
    public void setRanges(Range[] ranges) {
        if (jsBase == null) {
            this.ranges = ranges;
        } else {
            this.ranges = ranges;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ranges(%s)", arrayToString(ranges)));
                js.setLength(0);
            }
        }
    }

    private ChartsStock parentElement;
    private Element parentElement1;

    /**
     * Renders the range selector.
     */
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
            js.append(parentElement.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".render(%s);",  ((parentElement != null) ? parentElement.getJsBase() : "null")));
        }
    }


    /**
     * Renders the range selector.
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
        }
    }

    private ChartsStock chart;

    /**
     * Set stock chart for range selector.
     */
    public void target(ChartsStock chart) {
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
        }
    }

    private String zoomLabelText;
    private List<RangeSelector> setZoomLabelText = new ArrayList<>();

    /**
     * Setter fot the label text.
     */
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
    private String generateJSsetZoomLabelText() {
        if (!setZoomLabelText.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeSelector item : setZoomLabelText) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJSsetZoomLabelText());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}