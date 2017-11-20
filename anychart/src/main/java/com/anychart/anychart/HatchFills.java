package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * HatchFills palette class.
 */
public class HatchFills extends CoreBase {

    public HatchFills() {
        js.setLength(0);
        js.append("var hatchFills").append(++variableIndex).append(" = anychart.palettes.hatchFills();");
        jsBase = "hatchFills" + variableIndex;
    }

    protected HatchFills(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected HatchFills(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private List<HatchFill> getItemAt = new ArrayList<>();

    /**
     * Getter for type palette HatchFills from list by index.
     */
    public HatchFill getItemAt(Double index) {
        HatchFill item = new HatchFill(jsBase + ".itemAt(" + index + ")");
        getItemAt.add(item);
        return item;
    }

    private Double index;
    private HatchFillType type;
    private String type1;
    private String color;
    private Double thickness;
    private Double size;
    private List<HatchFills> setItemAt = new ArrayList<>();

    /**
     * Setter for type palette HatchFills from list by index.
     */
    public HatchFills setItemAt(HatchFillType type, Double index, String color, Double thickness, Double size) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
            this.index = index;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.type = type;
            this.index = index;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".itemAt(%s, %f, %s, %f, %f)", ((type != null) ? type.generateJs() : "null"), index, wrapQuotes(color), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%s, %f, %s, %f, %f)", ((type != null) ? type.generateJs() : "null"), index, wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItemAt() {
        if (!setItemAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItemAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HatchFills> setItemAt1 = new ArrayList<>();

    /**
     * Setter for type palette HatchFills from list by index.
     */
    public HatchFills setItemAt(String type1, Double index, String color, Double thickness, Double size) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.index = index;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.type1 = type1;
            this.index = index;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".itemAt(%s, %f, %s, %f, %f)", wrapQuotes(type1), index, wrapQuotes(color), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%s, %f, %s, %f, %f)", wrapQuotes(type1), index, wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItemAt1() {
        if (!setItemAt1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItemAt1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private PatternFill patternFill;
    private List<HatchFills> setItemAt2 = new ArrayList<>();

    /**
     * Setter for type palette HatchFills from list by index using patternFill.
     */
    public HatchFills setItemAt(Double index1, PatternFill patternFill) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.patternFill = patternFill;
        } else {
            this.index1 = index1;
            this.patternFill = patternFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".itemAt(%f, %s)", index1, ((patternFill != null) ? patternFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%f, %s)", index1, ((patternFill != null) ? patternFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItemAt2() {
        if (!setItemAt2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItemAt2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index2;
    private HatchFill instance;
    private List<HatchFills> setItemAt3 = new ArrayList<>();

    /**
     * Setter for type palette HatchFills from list by index using instance.
     */
    public HatchFills setItemAt(Double index2, HatchFill instance) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
            this.instance = instance;
        } else {
            this.index2 = index2;
            this.instance = instance;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".itemAt(%f, %s)", index2, ((instance != null) ? instance.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%f, %s)", index2, ((instance != null) ? instance.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItemAt3() {
        if (!setItemAt3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItemAt3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index3;
    private Boolean state;
    private List<HatchFills> setItemAt4 = new ArrayList<>();

    /**
     * Enables/disables type palette HatchFills from list by index.
     */
    public HatchFills itemAt(Double index3, Boolean state) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.state = state;
        } else {
            this.index3 = index3;
            this.state = state;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".itemAt(%f, %b)", index3, state));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemAt(%f, %b)", index3, state));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItemAt4() {
        if (!setItemAt4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItemAt4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private HatchFill[] items;
    private HatchFillType[] items1;
    private PatternFill[] items2;
    private HatchFill var_args;
    private HatchFillType var_args1;
    private PatternFill var_args2;
    private List<HatchFills> setItems = new ArrayList<>();

    /**
     * Setter for HatchFills list of palette.
     */
    public HatchFills setItems(HatchFill[] items, HatchFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
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
            for (HatchFills item : setItems) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HatchFills> setItems1 = new ArrayList<>();

    /**
     * Setter for HatchFills list of palette.
     */
    public HatchFills setItems(HatchFill[] items, HatchFillType var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items = items;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), ((var_args1 != null) ? var_args1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), ((var_args1 != null) ? var_args1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems1() {
        if (!setItems1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItems1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HatchFills> setItems2 = new ArrayList<>();

    /**
     * Setter for HatchFills list of palette.
     */
    public HatchFills setItems(HatchFill[] items, PatternFill var_args2) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.items = items;
            this.var_args2 = var_args2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), ((var_args2 != null) ? var_args2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), ((var_args2 != null) ? var_args2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems2() {
        if (!setItems2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItems2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HatchFills> setItems3 = new ArrayList<>();

    /**
     * Setter for HatchFills list of palette.
     */
    public HatchFills setItems(HatchFillType[] items1, HatchFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args = var_args;
        } else {
            this.items1 = items1;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems3() {
        if (!setItems3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItems3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HatchFills> setItems4 = new ArrayList<>();

    /**
     * Setter for HatchFills list of palette.
     */
    public HatchFills setItems(HatchFillType[] items1, HatchFillType var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items1 = items1;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), ((var_args1 != null) ? var_args1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), ((var_args1 != null) ? var_args1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems4() {
        if (!setItems4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItems4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HatchFills> setItems5 = new ArrayList<>();

    /**
     * Setter for HatchFills list of palette.
     */
    public HatchFills setItems(HatchFillType[] items1, PatternFill var_args2) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.items1 = items1;
            this.var_args2 = var_args2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), ((var_args2 != null) ? var_args2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), ((var_args2 != null) ? var_args2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems5() {
        if (!setItems5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItems5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HatchFills> setItems6 = new ArrayList<>();

    /**
     * Setter for HatchFills list of palette.
     */
    public HatchFills setItems(PatternFill[] items2, HatchFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args = var_args;
        } else {
            this.items2 = items2;
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), ((var_args != null) ? var_args.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems6() {
        if (!setItems6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItems6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HatchFills> setItems7 = new ArrayList<>();

    /**
     * Setter for HatchFills list of palette.
     */
    public HatchFills setItems(PatternFill[] items2, HatchFillType var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items2 = items2;
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), ((var_args1 != null) ? var_args1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), ((var_args1 != null) ? var_args1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems7() {
        if (!setItems7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItems7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HatchFills> setItems8 = new ArrayList<>();

    /**
     * Setter for HatchFills list of palette.
     */
    public HatchFills setItems(PatternFill[] items2, PatternFill var_args2) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.items2 = items2;
            this.var_args2 = var_args2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), ((var_args2 != null) ? var_args2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), ((var_args2 != null) ? var_args2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetItems8() {
        if (!setItems8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFills item : setItems8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetItemAt() {
        if (!getItemAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HatchFill item : getItemAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetItemAt());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetItemAt());
        js.append(generateJSsetItemAt1());
        js.append(generateJSsetItemAt2());
        js.append(generateJSsetItemAt3());
        js.append(generateJSsetItemAt4());
        js.append(generateJSsetItems());
        js.append(generateJSsetItems1());
        js.append(generateJSsetItems2());
        js.append(generateJSsetItems3());
        js.append(generateJSsetItems4());
        js.append(generateJSsetItems5());
        js.append(generateJSsetItems6());
        js.append(generateJSsetItems7());
        js.append(generateJSsetItems8());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}