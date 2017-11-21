package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Settings with margin.
 */
public class SettingsWithMargin extends JsObject {

    public SettingsWithMargin() {
        js.setLength(0);
        js.append("var settingsWithMargin").append(++variableIndex).append(" = anychart.core.resource.resourceList.settingsWithMargin();");
        jsBase = "settingsWithMargin" + variableIndex;
    }

    protected SettingsWithMargin(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected SettingsWithMargin(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Margin getMargin;

    /**
     * Getter for the margin.
     */
    public Margin getMargin() {
        if (getMargin == null)
            getMargin = new Margin(jsBase + ".margin()");

        return getMargin;
    }

    private Double[] margin;
    private String[] margin1;
    private String margin2;
    private List<SettingsWithMargin> setMargin = new ArrayList<>();

    /**
     * Setter for the margin using a single value.
     */
    public SettingsWithMargin setMargin(Double[] margin) {
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
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s)", Arrays.toString(margin)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMargin() {
        if (!setMargin.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SettingsWithMargin item : setMargin) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SettingsWithMargin> setMargin1 = new ArrayList<>();

    /**
     * Setter for the margin using a single value.
     */
    public SettingsWithMargin setMargin(String[] margin1) {
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
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s)", arrayToStringWrapQuotes(margin1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMargin1() {
        if (!setMargin1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SettingsWithMargin item : setMargin1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SettingsWithMargin> setMargin2 = new ArrayList<>();

    /**
     * Setter for the margin using a single value.
     */
    public SettingsWithMargin setMargin(String margin2) {
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
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s)", wrapQuotes(margin2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMargin2() {
        if (!setMargin2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SettingsWithMargin item : setMargin2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;
    private List<SettingsWithMargin> setMargin3 = new ArrayList<>();

    /**
     * Setter for the callout margin using several values.
     */
    public SettingsWithMargin setMargin(String value, String value2, String value4, String value6) {
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
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMargin3() {
        if (!setMargin3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SettingsWithMargin item : setMargin3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SettingsWithMargin> setMargin4 = new ArrayList<>();

    /**
     * Setter for the callout margin using several values.
     */
    public SettingsWithMargin setMargin(Double value1, Double value3, Double value5, Double value7) {
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
            
            js.append(String.format(Locale.US, ".margin(%f, %f, %f, %f)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%f, %f, %f, %f)", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMargin4() {
        if (!setMargin4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SettingsWithMargin item : setMargin4) {
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


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetMargin());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetMargin());
        js.append(generateJSsetMargin1());
        js.append(generateJSsetMargin2());
        js.append(generateJSsetMargin3());
        js.append(generateJSsetMargin4());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}