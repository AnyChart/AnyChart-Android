package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Needle pointer class.
 */
public class Needle extends GaugePointersBase {

    public Needle() {
        js.setLength(0);
        js.append("var needle").append(++variableIndex).append(" = anychart.core.gauge.pointers.needle();");
        jsBase = "needle" + variableIndex;
    }

    protected Needle(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Needle(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double endRadius;
    private String endRadius1;
    private List<Needle> setEndRadius = new ArrayList<>();

    /**
     * Setter for the end radius.
     */
    public Needle setEndRadius(Double endRadius) {
        if (jsBase == null) {
            this.endRadius = null;
            this.endRadius1 = null;
            
            this.endRadius = endRadius;
        } else {
            this.endRadius = endRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".endRadius(%f)", endRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endRadius(%f)", endRadius));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEndRadius() {
        if (!setEndRadius.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : setEndRadius) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Needle> setEndRadius1 = new ArrayList<>();

    /**
     * Setter for the end radius.
     */
    public Needle setEndRadius(String endRadius1) {
        if (jsBase == null) {
            this.endRadius = null;
            this.endRadius1 = null;
            
            this.endRadius1 = endRadius1;
        } else {
            this.endRadius1 = endRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".endRadius(%s)", wrapQuotes(endRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endRadius(%s)", wrapQuotes(endRadius1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEndRadius1() {
        if (!setEndRadius1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : setEndRadius1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double endWidth;
    private String endWidth1;
    private List<Needle> setEndWidth = new ArrayList<>();

    /**
     * Setter for the end width.
     */
    public Needle setEndWidth(Double endWidth) {
        if (jsBase == null) {
            this.endWidth = null;
            this.endWidth1 = null;
            
            this.endWidth = endWidth;
        } else {
            this.endWidth = endWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".endWidth(%f)", endWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endWidth(%f)", endWidth));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEndWidth() {
        if (!setEndWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : setEndWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Needle> setEndWidth1 = new ArrayList<>();

    /**
     * Setter for the end width.
     */
    public Needle setEndWidth(String endWidth1) {
        if (jsBase == null) {
            this.endWidth = null;
            this.endWidth1 = null;
            
            this.endWidth1 = endWidth1;
        } else {
            this.endWidth1 = endWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".endWidth(%s)", wrapQuotes(endWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endWidth(%s)", wrapQuotes(endWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEndWidth1() {
        if (!setEndWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : setEndWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double middleRadius;
    private String middleRadius1;
    private List<Needle> setMiddleRadius = new ArrayList<>();

    /**
     * Setter for the middle radius.
     */
    public Needle setMiddleRadius(Double middleRadius) {
        if (jsBase == null) {
            this.middleRadius = null;
            this.middleRadius1 = null;
            
            this.middleRadius = middleRadius;
        } else {
            this.middleRadius = middleRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".middleRadius(%f)", middleRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleRadius(%f)", middleRadius));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMiddleRadius() {
        if (!setMiddleRadius.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : setMiddleRadius) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Needle> setMiddleRadius1 = new ArrayList<>();

    /**
     * Setter for the middle radius.
     */
    public Needle setMiddleRadius(String middleRadius1) {
        if (jsBase == null) {
            this.middleRadius = null;
            this.middleRadius1 = null;
            
            this.middleRadius1 = middleRadius1;
        } else {
            this.middleRadius1 = middleRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".middleRadius(%s)", wrapQuotes(middleRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleRadius(%s)", wrapQuotes(middleRadius1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMiddleRadius1() {
        if (!setMiddleRadius1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : setMiddleRadius1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double middleWidth;
    private String middleWidth1;
    private List<Needle> setMiddleWidth = new ArrayList<>();

    /**
     * Setter for the middle width
     */
    public Needle setMiddleWidth(Double middleWidth) {
        if (jsBase == null) {
            this.middleWidth = null;
            this.middleWidth1 = null;
            
            this.middleWidth = middleWidth;
        } else {
            this.middleWidth = middleWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".middleWidth(%f)", middleWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleWidth(%f)", middleWidth));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMiddleWidth() {
        if (!setMiddleWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : setMiddleWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Needle> setMiddleWidth1 = new ArrayList<>();

    /**
     * Setter for the middle width
     */
    public Needle setMiddleWidth(String middleWidth1) {
        if (jsBase == null) {
            this.middleWidth = null;
            this.middleWidth1 = null;
            
            this.middleWidth1 = middleWidth1;
        } else {
            this.middleWidth1 = middleWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".middleWidth(%s)", wrapQuotes(middleWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleWidth(%s)", wrapQuotes(middleWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMiddleWidth1() {
        if (!setMiddleWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : setMiddleWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double startRadius;
    private String startRadius1;
    private List<Needle> setStartRadius = new ArrayList<>();

    /**
     * Setter for the start radius.
     */
    public Needle setStartRadius(Double startRadius) {
        if (jsBase == null) {
            this.startRadius = null;
            this.startRadius1 = null;
            
            this.startRadius = startRadius;
        } else {
            this.startRadius = startRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startRadius(%f)", startRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startRadius(%f)", startRadius));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStartRadius() {
        if (!setStartRadius.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : setStartRadius) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Needle> setStartRadius1 = new ArrayList<>();

    /**
     * Setter for the start radius.
     */
    public Needle setStartRadius(String startRadius1) {
        if (jsBase == null) {
            this.startRadius = null;
            this.startRadius1 = null;
            
            this.startRadius1 = startRadius1;
        } else {
            this.startRadius1 = startRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startRadius(%s)", wrapQuotes(startRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startRadius(%s)", wrapQuotes(startRadius1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStartRadius1() {
        if (!setStartRadius1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : setStartRadius1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double startWidth;
    private String startWidth1;
    private List<Needle> setStartWidth = new ArrayList<>();

    /**
     * Setter for the start width
     */
    public Needle setStartWidth(Double startWidth) {
        if (jsBase == null) {
            this.startWidth = null;
            this.startWidth1 = null;
            
            this.startWidth = startWidth;
        } else {
            this.startWidth = startWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startWidth(%f)", startWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startWidth(%f)", startWidth));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStartWidth() {
        if (!setStartWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : setStartWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Needle> setStartWidth1 = new ArrayList<>();

    /**
     * Setter for the start width
     */
    public Needle setStartWidth(String startWidth1) {
        if (jsBase == null) {
            this.startWidth = null;
            this.startWidth1 = null;
            
            this.startWidth1 = startWidth1;
        } else {
            this.startWidth1 = startWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startWidth(%s)", wrapQuotes(startWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startWidth(%s)", wrapQuotes(startWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStartWidth1() {
        if (!setStartWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Needle item : setStartWidth1) {
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

        js.append(generateJSsetEndRadius());
        js.append(generateJSsetEndRadius1());
        js.append(generateJSsetEndWidth());
        js.append(generateJSsetEndWidth1());
        js.append(generateJSsetMiddleRadius());
        js.append(generateJSsetMiddleRadius1());
        js.append(generateJSsetMiddleWidth());
        js.append(generateJSsetMiddleWidth1());
        js.append(generateJSsetStartRadius());
        js.append(generateJSsetStartRadius1());
        js.append(generateJSsetStartWidth());
        js.append(generateJSsetStartWidth1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}