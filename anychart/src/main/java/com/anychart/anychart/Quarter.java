package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Quarter settings representation class.<br/>
{docs:Basic_Charts/Quadrant_Chart#quarters}Learn more about the quarters.{docs}
 */
public class Quarter extends UiBackground {

    public Quarter() {
        js.setLength(0);
        js.append("var quarter").append(++variableIndex).append(" = anychart.core.utils.quarter();");
        jsBase = "quarter" + variableIndex;
    }

    protected Quarter(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Quarter(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private List<UiLabel> getLabel = new ArrayList<>();

    /**
     * Getter for quarter label.
     */
    public UiLabel getLabel(String index) {
        UiLabel item = new UiLabel(jsBase + ".label(" + wrapQuotes(index) + ")");
        getLabel.add(item);
        return item;
    }

    private List<UiLabel> getLabel1 = new ArrayList<>();

    /**
     * Getter for quarter label.
     */
    public UiLabel getLabel(Number index) {
        UiLabel item = new UiLabel(jsBase + ".label(" + index + ")");
        getLabel1.add(item);
        return item;
    }

    private Boolean label;
    private String label1;
    private String label2;
    private List<Chart> setLabel = new ArrayList<>();

    /**
     * Setter for quarter label.
     */
    public Chart setLabel(Boolean label) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label = label;
        } else {
            this.label = label;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLabel" + ++variableIndex + " = " + jsBase + ".label(%b);", label));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%b);", label));
                js.setLength(0);
            }
        }
        Chart item = new Chart("setLabel" + variableIndex);
        setLabel.add(item);
        return item;
    }
    private String generateJSsetLabel() {
        if (!setLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setLabel1 = new ArrayList<>();

    /**
     * Setter for quarter label.
     */
    public Chart setLabel(String label1) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label1 = label1;
        } else {
            this.label1 = label1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLabel1" + ++variableIndex + " = " + jsBase + ".label(%s);", wrapQuotes(label1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s);", wrapQuotes(label1)));
                js.setLength(0);
            }
        }
        Chart item = new Chart("setLabel1" + variableIndex);
        setLabel1.add(item);
        return item;
    }
    private String generateJSsetLabel1() {
        if (!setLabel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setLabel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String index;
    private Number index1;
    private Boolean label3;
    private String label4;
    private String label5;
    private List<Chart> setLabel2 = new ArrayList<>();

    /**
     * Setter for quarter label.
     */
    public Chart setLabel(String index, Boolean label3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index = index;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label3 = label3;
        } else {
            this.index = index;
            this.label3 = label3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLabel2" + ++variableIndex + " = " + jsBase + ".label(%s, %b);", wrapQuotes(index), label3));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s, %b);", wrapQuotes(index), label3));
                js.setLength(0);
            }
        }
        Chart item = new Chart("setLabel2" + variableIndex);
        setLabel2.add(item);
        return item;
    }
    private String generateJSsetLabel2() {
        if (!setLabel2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setLabel2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setLabel3 = new ArrayList<>();

    /**
     * Setter for quarter label.
     */
    public Chart setLabel(String index, String label4) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index = index;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label4 = label4;
        } else {
            this.index = index;
            this.label4 = label4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLabel3" + ++variableIndex + " = " + jsBase + ".label(%s, %s);", wrapQuotes(index), wrapQuotes(label4)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s, %s);", wrapQuotes(index), wrapQuotes(label4)));
                js.setLength(0);
            }
        }
        Chart item = new Chart("setLabel3" + variableIndex);
        setLabel3.add(item);
        return item;
    }
    private String generateJSsetLabel3() {
        if (!setLabel3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setLabel3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setLabel4 = new ArrayList<>();

    /**
     * Setter for quarter label.
     */
    public Chart setLabel(Number index1, Boolean label3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label3 = label3;
        } else {
            this.index1 = index1;
            this.label3 = label3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLabel4" + ++variableIndex + " = " + jsBase + ".label(%s, %b);", index1, label3));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s, %b);", index1, label3));
                js.setLength(0);
            }
        }
        Chart item = new Chart("setLabel4" + variableIndex);
        setLabel4.add(item);
        return item;
    }
    private String generateJSsetLabel4() {
        if (!setLabel4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setLabel4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setLabel5 = new ArrayList<>();

    /**
     * Setter for quarter label.
     */
    public Chart setLabel(Number index1, String label4) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label4 = label4;
        } else {
            this.index1 = index1;
            this.label4 = label4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLabel5" + ++variableIndex + " = " + jsBase + ".label(%s, %s);", index1, wrapQuotes(label4)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s, %s);", index1, wrapQuotes(label4)));
                js.setLength(0);
            }
        }
        Chart item = new Chart("setLabel5" + variableIndex);
        setLabel5.add(item);
        return item;
    }
    private String generateJSsetLabel5() {
        if (!setLabel5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setLabel5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Margin getMargin;

    /**
     * Getter for the quarter margin.<br/>
<img src='https://api.anychart.com/si/8.1.0/anychart.core.Chart.prototype.margin.png' width='352' height='351'/>
     */
    public Margin getMargin() {
        if (getMargin == null)
            getMargin = new Margin(jsBase + ".margin()");

        return getMargin;
    }

    private Number[] margin;
    private String[] margin1;
    private String margin2;

    /**
     * Setter for the quarter margin in pixels using a single complex object.
     */
    public Quarter setMargin(Number[] margin) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            
            this.margin = margin;
        } else {
            this.margin = margin;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".margin(%s)", Arrays.toString(margin)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the quarter margin in pixels using a single complex object.
     */
    public Quarter setMargin(String[] margin1) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            
            this.margin1 = margin1;
        } else {
            this.margin1 = margin1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".margin(%s)", arrayToStringWrapQuotes(margin1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", arrayToStringWrapQuotes(margin1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the quarter margin in pixels using a single complex object.
     */
    public Quarter setMargin(String margin2) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            
            this.margin2 = margin2;
        } else {
            this.margin2 = margin2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".margin(%s)", wrapQuotes(margin2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", wrapQuotes(margin2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value;
    private Number value1;
    private String value2;
    private Number value3;
    private String value4;
    private Number value5;
    private String value6;
    private Number value7;

    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public Quarter setMargin(String value, String value2, String value4, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value4 = value4;
            this.value6 = value6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".margin(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the quarter margin in pixels using several simple values.
     */
    public Quarter setMargin(Number value1, Number value3, Number value5, Number value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value5 = value5;
            this.value7 = value7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".margin(%s, %s, %s, %s)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }

    private UtilsPadding getPadding;

    /**
     * Getter for the quarter padding.<br/>
<img src='https://api.anychart.com/si/8.1.0/anychart.core.Chart.prototype.padding.png' width='352' height='351'/>
     */
    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Number[] padding;
    private String[] padding1;
    private String padding2;
    private List<Chart> setPadding = new ArrayList<>();

    /**
     * Setter for the quarter paddings in pixels using a single value.
     */
    public Chart setPadding(Number[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setPadding" + ++variableIndex + " = " + jsBase + ".padding(%s);", Arrays.toString(padding)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
        Chart item = new Chart("setPadding" + variableIndex);
        setPadding.add(item);
        return item;
    }
    private String generateJSsetPadding() {
        if (!setPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setPadding1 = new ArrayList<>();

    /**
     * Setter for the quarter paddings in pixels using a single value.
     */
    public Chart setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setPadding1" + ++variableIndex + " = " + jsBase + ".padding(%s);", arrayToStringWrapQuotes(padding1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", arrayToStringWrapQuotes(padding1)));
                js.setLength(0);
            }
        }
        Chart item = new Chart("setPadding1" + variableIndex);
        setPadding1.add(item);
        return item;
    }
    private String generateJSsetPadding1() {
        if (!setPadding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setPadding2 = new ArrayList<>();

    /**
     * Setter for the quarter paddings in pixels using a single value.
     */
    public Chart setPadding(String padding2) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding2 = padding2;
        } else {
            this.padding2 = padding2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setPadding2" + ++variableIndex + " = " + jsBase + ".padding(%s);", wrapQuotes(padding2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", wrapQuotes(padding2)));
                js.setLength(0);
            }
        }
        Chart item = new Chart("setPadding2" + variableIndex);
        setPadding2.add(item);
        return item;
    }
    private String generateJSsetPadding2() {
        if (!setPadding2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setPadding2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String value8;
    private Number value9;
    private String value10;
    private Number value11;
    private String value12;
    private Number value13;
    private String value14;
    private Number value15;
    private List<Chart> setPadding3 = new ArrayList<>();

    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public Chart setPadding(String value8, String value10, String value12, String value14) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value8 = value8;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value10 = value10;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value12 = value12;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value14 = value14;
        } else {
            this.value8 = value8;
            this.value10 = value10;
            this.value12 = value12;
            this.value14 = value14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setPadding3" + ++variableIndex + " = " + jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value8), wrapQuotes(value10), wrapQuotes(value12), wrapQuotes(value14)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value8), wrapQuotes(value10), wrapQuotes(value12), wrapQuotes(value14)));
                js.setLength(0);
            }
        }
        Chart item = new Chart("setPadding3" + variableIndex);
        setPadding3.add(item);
        return item;
    }
    private String generateJSsetPadding3() {
        if (!setPadding3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setPadding3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setPadding4 = new ArrayList<>();

    /**
     * Setter for the quarter paddings in pixels using several numbers.
     */
    public Chart setPadding(Number value9, Number value11, Number value13, Number value15) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value9 = value9;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value11 = value11;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value13 = value13;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value15 = value15;
        } else {
            this.value9 = value9;
            this.value11 = value11;
            this.value13 = value13;
            this.value15 = value15;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setPadding4" + ++variableIndex + " = " + jsBase + ".padding(%s, %s, %s, %s);", value9, value11, value13, value15));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value9, value11, value13, value15));
                js.setLength(0);
            }
        }
        Chart item = new Chart("setPadding4" + variableIndex);
        setPadding4.add(item);
        return item;
    }
    private String generateJSsetPadding4() {
        if (!setPadding4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setPadding4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiTitle getTitle;

    /**
     * Getter for the title.
     */
    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle(jsBase + ".title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

    /**
     * Setter for the title.
     */
    public Quarter setTitle(Boolean title) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title = title;
        } else {
            this.title = title;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".title(%b)", title));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%b);", title));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the title.
     */
    public Quarter setTitle(String title1) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title1 = title1;
        } else {
            this.title1 = title1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".title(%s)", wrapQuotes(title1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(title1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetLabel() {
        if (!getLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabel item : getLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetLabel1() {
        if (!getLabel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiLabel item : getLabel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetMargin() {
        if (getMargin != null) {
            return getMargin.generateJs();
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }

    private String generateJSgetTitle() {
        if (getTitle != null) {
            return getTitle.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetLabel());
        jsGetters.append(generateJSgetLabel1());
        jsGetters.append(generateJSgetMargin());
        jsGetters.append(generateJSgetPadding());
        jsGetters.append(generateJSgetTitle());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetLabel());
        js.append(generateJSsetLabel1());
        js.append(generateJSsetLabel2());
        js.append(generateJSsetLabel3());
        js.append(generateJSsetLabel4());
        js.append(generateJSsetLabel5());
        js.append(generateJSsetPadding());
        js.append(generateJSsetPadding1());
        js.append(generateJSsetPadding2());
        js.append(generateJSsetPadding3());
        js.append(generateJSsetPadding4());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}