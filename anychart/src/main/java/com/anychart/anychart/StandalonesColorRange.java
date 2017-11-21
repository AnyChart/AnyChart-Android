package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * 
 */
public class StandalonesColorRange extends UiColorRange {

    public StandalonesColorRange() {
        js.setLength(0);
        js.append("var standalonesColorRange").append(++variableIndex).append(" = anychart.standalones.colorRange();");
        jsBase = "standalonesColorRange" + variableIndex;
    }

    protected StandalonesColorRange(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StandalonesColorRange(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element getContainer;

    /**
     * Getter for the color range container.
     */
    public Element getContainer() {
        if (getContainer == null)
            getContainer = new Element(jsBase + ".container()");

        return getContainer;
    }

    private String container;
    private Element container1;
    private List<StandalonesColorRange> setContainer = new ArrayList<>();

    /**
     * Setter for the color range container.
     */
    public StandalonesColorRange setContainer(String container) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            
            this.container = container;
        } else {
            this.container = container;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".container(%s)", wrapQuotes(container)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", wrapQuotes(container)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetContainer() {
        if (!setContainer.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesColorRange item : setContainer) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesColorRange> setContainer1 = new ArrayList<>();

    /**
     * Setter for the color range container.
     */
    public StandalonesColorRange setContainer(Element container1) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            
            this.container1 = container1;
        } else {
            this.container1 = container1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(container1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".container(%s);",  ((container1 != null) ? container1.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetContainer1() {
        if (!setContainer1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesColorRange item : setContainer1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TablePadding getPadding;

    /**
     * Getter for padding settings object.
     */
    public TablePadding getPadding() {
        if (getPadding == null)
            getPadding = new TablePadding(jsBase + ".padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;
    private List<StandalonesColorRange> setPadding = new ArrayList<>();

    /**
     * Setter for paddings in pixels using a single value.<br/>
     */
    public StandalonesColorRange setPadding(Double[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding() {
        if (!setPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesColorRange item : setPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesColorRange> setPadding1 = new ArrayList<>();

    /**
     * Setter for paddings in pixels using a single value.<br/>
     */
    public StandalonesColorRange setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding1() {
        if (!setPadding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesColorRange item : setPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesColorRange> setPadding2 = new ArrayList<>();

    /**
     * Setter for paddings in pixels using a single value.<br/>
     */
    public StandalonesColorRange setPadding(String padding2) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding2 = padding2;
        } else {
            this.padding2 = padding2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", wrapQuotes(padding2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", wrapQuotes(padding2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding2() {
        if (!setPadding2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesColorRange item : setPadding2) {
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
    private List<StandalonesColorRange> setPadding3 = new ArrayList<>();

    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public StandalonesColorRange setPadding(String value, String value2, String value4, String value6) {
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
            
            js.append(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding3() {
        if (!setPadding3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesColorRange item : setPadding3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesColorRange> setPadding4 = new ArrayList<>();

    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public StandalonesColorRange setPadding(Double value1, Double value3, Double value5, Double value7) {
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
            
            js.append(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding4() {
        if (!setPadding4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesColorRange item : setPadding4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private AnychartMathRect getParentBounds;

    /**
     * Getter for bounds.
As a getter falls back to stage bounds.
     */
    public AnychartMathRect getParentBounds() {
        if (getParentBounds == null)
            getParentBounds = new AnychartMathRect(jsBase + ".parentBounds()");

        return getParentBounds;
    }

    private AnychartMathRect parentBounds;
    private String parentBounds1;
    private List<StandalonesColorRange> setParentBounds = new ArrayList<>();

    /**
     * Setter for bounds using single value.
     */
    public StandalonesColorRange setParentBounds(AnychartMathRect parentBounds) {
        if (jsBase == null) {
            this.parentBounds = null;
            this.parentBounds1 = null;
            
            this.parentBounds = parentBounds;
        } else {
            this.parentBounds = parentBounds;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(parentBounds.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".parentBounds(%s);",  ((parentBounds != null) ? parentBounds.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetParentBounds() {
        if (!setParentBounds.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesColorRange item : setParentBounds) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesColorRange> setParentBounds1 = new ArrayList<>();

    /**
     * Setter for bounds using single value.
     */
    public StandalonesColorRange setParentBounds(String parentBounds1) {
        if (jsBase == null) {
            this.parentBounds = null;
            this.parentBounds1 = null;
            
            this.parentBounds1 = parentBounds1;
        } else {
            this.parentBounds1 = parentBounds1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".parentBounds(%s)", wrapQuotes(parentBounds1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentBounds(%s)", wrapQuotes(parentBounds1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetParentBounds1() {
        if (!setParentBounds1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesColorRange item : setParentBounds1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double left;
    private Double top;
    private Double width;
    private Double height;
    private List<StandalonesColorRange> setParentBounds2 = new ArrayList<>();

    /**
     * Setter for bounds using several value.
     */
    public StandalonesColorRange setParentBounds(Double left, Double top, Double width, Double height) {
        if (jsBase == null) {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
        } else {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".parentBounds(%f, %f, %f, %f)", left, top, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentBounds(%f, %f, %f, %f)", left, top, width, height));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetParentBounds2() {
        if (!setParentBounds2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesColorRange item : setParentBounds2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetContainer() {
        if (getContainer != null) {
            return getContainer.generateJs();
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }

    private String generateJSgetParentBounds() {
        if (getParentBounds != null) {
            return getParentBounds.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetContainer());
        jsGetters.append(generateJSgetPadding());
        jsGetters.append(generateJSgetParentBounds());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetContainer());
        js.append(generateJSsetContainer1());
        js.append(generateJSsetPadding());
        js.append(generateJSsetPadding1());
        js.append(generateJSsetPadding2());
        js.append(generateJSsetPadding3());
        js.append(generateJSsetPadding4());
        js.append(generateJSsetParentBounds());
        js.append(generateJSsetParentBounds1());
        js.append(generateJSsetParentBounds2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}