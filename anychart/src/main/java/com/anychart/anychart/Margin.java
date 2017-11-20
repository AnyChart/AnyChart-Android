package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Stores margins values. Can accept numbers and strings.
Use {@link anychart.core.utils.Margin#set} method to set values.
 */
public class Margin extends CoreBase {

    public Margin() {
        js.setLength(0);
        js.append("var margin").append(++variableIndex).append(" = anychart.core.utils.margin();");
        jsBase = "margin" + variableIndex;
    }

    protected Margin(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Margin(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double bottom;
    private String bottom1;
    private List<Margin> setBottom = new ArrayList<>();

    /**
     * Setter for the bottom space.
     */
    public Margin setBottom(Double bottom) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
        } else {
            this.bottom = bottom;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottom(%f)", bottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%f)", bottom));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottom() {
        if (!setBottom.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Margin item : setBottom) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Margin> setBottom1 = new ArrayList<>();

    /**
     * Setter for the bottom space.
     */
    public Margin setBottom(String bottom1) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
        } else {
            this.bottom1 = bottom1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottom(%s)", wrapQuotes(bottom1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%s)", wrapQuotes(bottom1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottom1() {
        if (!setBottom1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Margin item : setBottom1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double left;
    private String left1;
    private List<Margin> setLeft = new ArrayList<>();

    /**
     * Setter for the left space.
     */
    public Margin setLeft(Double left) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.left = left;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".left(%f)", left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%f)", left));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeft() {
        if (!setLeft.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Margin item : setLeft) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Margin> setLeft1 = new ArrayList<>();

    /**
     * Setter for the left space.
     */
    public Margin setLeft(String left1) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.left1 = left1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".left(%s)", wrapQuotes(left1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%s)", wrapQuotes(left1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeft1() {
        if (!setLeft1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Margin item : setLeft1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double right;
    private String right1;
    private List<Margin> setRight = new ArrayList<>();

    /**
     * Setter for the right space.
     */
    public Margin setRight(Double right) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right = right;
        } else {
            this.right = right;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".right(%f)", right));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%f)", right));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRight() {
        if (!setRight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Margin item : setRight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Margin> setRight1 = new ArrayList<>();

    /**
     * Setter for the right space.
     */
    public Margin setRight(String right1) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right1 = right1;
        } else {
            this.right1 = right1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".right(%s)", wrapQuotes(right1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%s)", wrapQuotes(right1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRight1() {
        if (!setRight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Margin item : setRight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String value;
    private Double value1;
    private Double[] value2;
    private String[] value3;
    private String value4;
    private String value5;
    private Double value6;
    private String value7;
    private Double value8;
    private String value9;
    private Double value10;
    private List<Margin> setSet = new ArrayList<>();

    /**
     * Sets all offsets.
     */
    public Margin setSet(Double[] value2) {
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
            
            this.value2 = value2;
        } else {
            this.value2 = value2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".set(%s)", Arrays.toString(value2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", Arrays.toString(value2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSet() {
        if (!setSet.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Margin item : setSet) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Margin> setSet1 = new ArrayList<>();

    /**
     * Sets all offsets.
     */
    public Margin setSet(String[] value3) {
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
            
            this.value3 = value3;
        } else {
            this.value3 = value3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".set(%s)", arrayToStringWrapQuotes(value3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", arrayToStringWrapQuotes(value3)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSet1() {
        if (!setSet1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Margin item : setSet1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double top;
    private String top1;
    private List<Margin> setTop = new ArrayList<>();

    /**
     * Setter for the top space.
     */
    public Margin setTop(Double top) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top = top;
        } else {
            this.top = top;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".top(%f)", top));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%f)", top));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTop() {
        if (!setTop.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Margin item : setTop) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Margin> setTop1 = new ArrayList<>();

    /**
     * Setter for the top space.
     */
    public Margin setTop(String top1) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top1 = top1;
        } else {
            this.top1 = top1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".top(%s)", wrapQuotes(top1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%s)", wrapQuotes(top1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTop1() {
        if (!setTop1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Margin item : setTop1) {
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

        js.append(generateJSsetBottom());
        js.append(generateJSsetBottom1());
        js.append(generateJSsetLeft());
        js.append(generateJSsetLeft1());
        js.append(generateJSsetRight());
        js.append(generateJSsetRight1());
        js.append(generateJSsetSet());
        js.append(generateJSsetSet1());
        js.append(generateJSsetTop());
        js.append(generateJSsetTop1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}