package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Gradient palette.
 */
public class RangeColors extends CoreBase {

    public RangeColors() {
        js.setLength(0);
        js.append("var rangeColors").append(++variableIndex).append(" = anychart.palettes.rangeColors();");
        jsBase = "rangeColors" + variableIndex;
    }

    protected RangeColors(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected RangeColors(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double count;
    private List<RangeColors> setCount = new ArrayList<>();

    /**
     * Setter for color palette's colors counts.<br/>
<b>Note:</b> Defines how many steps we need in gradient.
     */
    public RangeColors setCount(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".count(%f)", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".count(%f)", count));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCount() {
        if (!setCount.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setCount) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index;
    private SolidFill color;
    private List<RangeColors> setItemAt = new ArrayList<>();

    /**
     * Setter for color palette colors from list by index.
     */
    public RangeColors setItemAt(Double index, SolidFill color) {
        if (jsBase == null) {
            this.index = index;
            this.color = color;
        } else {
            this.index = index;
            this.color = color;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".itemAt(%f, %s)", index, ((color != null) ? color.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%f, %s)", index, ((color != null) ? color.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItemAt() {
        if (!setItemAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItemAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private SolidFill[] items;
    private LinearGradientFill items1;
    private RadialGradientFill items2;
    private GradientKey[] items3;
    private String[] items4;
    private SolidFill items5;
    private String items6;
    private SolidFill var_args;
    private String var_args1;
    private List<RangeColors> setItems = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(SolidFill[] items, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items = items;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems() {
        if (!setItems.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems1 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(SolidFill[] items, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items = items;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems1() {
        if (!setItems1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems2 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(LinearGradientFill items1, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items1 = items1;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", ((items1 != null) ? items1.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", ((items1 != null) ? items1.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems2() {
        if (!setItems2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems3 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(LinearGradientFill items1, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items1 = items1;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", ((items1 != null) ? items1.generateJs() : "null"), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", ((items1 != null) ? items1.generateJs() : "null"), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems3() {
        if (!setItems3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems4 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(RadialGradientFill items2, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items2 = items2;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", ((items2 != null) ? items2.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", ((items2 != null) ? items2.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems4() {
        if (!setItems4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems5 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(RadialGradientFill items2, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items2 = items2;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", ((items2 != null) ? items2.generateJs() : "null"), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", ((items2 != null) ? items2.generateJs() : "null"), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems5() {
        if (!setItems5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems6 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(GradientKey[] items3, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items3 = items3;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items3 = items3;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items3), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items3), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems6() {
        if (!setItems6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems7 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(GradientKey[] items3, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items3 = items3;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items3 = items3;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items3), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items3), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems7() {
        if (!setItems7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems8 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(String[] items4, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items4 = items4;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items4 = items4;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToStringWrapQuotes(items4), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToStringWrapQuotes(items4), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems8() {
        if (!setItems8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems9 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(String[] items4, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items4 = items4;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items4 = items4;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToStringWrapQuotes(items4), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToStringWrapQuotes(items4), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems9() {
        if (!setItems9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems10 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(SolidFill items5, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items5 = items5;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items5 = items5;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", ((items5 != null) ? items5.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", ((items5 != null) ? items5.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems10() {
        if (!setItems10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems11 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(SolidFill items5, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items5 = items5;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items5 = items5;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", ((items5 != null) ? items5.generateJs() : "null"), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", ((items5 != null) ? items5.generateJs() : "null"), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems11() {
        if (!setItems11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems12 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(String items6, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items6 = items6;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items6 = items6;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", wrapQuotes(items6), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", wrapQuotes(items6), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems12() {
        if (!setItems12.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems12) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RangeColors> setItems13 = new ArrayList<>();

    /**
     * Setter for color palette colors list.
     */
    public RangeColors setItems(String items6, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items6 = items6;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items6 = items6;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s, %s)", wrapQuotes(items6), wrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", wrapQuotes(items6), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems13() {
        if (!setItems13.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RangeColors item : setItems13) {
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

        js.append(generateJSsetCount());
        js.append(generateJSsetItemAt());
        js.append(generateJSsetItems());
        js.append(generateJSsetItems1());
        js.append(generateJSsetItems2());
        js.append(generateJSsetItems3());
        js.append(generateJSsetItems4());
        js.append(generateJSsetItems5());
        js.append(generateJSsetItems6());
        js.append(generateJSsetItems7());
        js.append(generateJSsetItems8());
        js.append(generateJSsetItems9());
        js.append(generateJSsetItems10());
        js.append(generateJSsetItems11());
        js.append(generateJSsetItems12());
        js.append(generateJSsetItems13());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}