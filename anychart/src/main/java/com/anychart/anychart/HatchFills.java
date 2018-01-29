package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

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
    public HatchFill getItemAt(Number index) {
        HatchFill item = new HatchFill(jsBase + ".itemAt(" + index + ")");
        getItemAt.add(item);
        return item;
    }

    private Number index;
    private HatchFillType type;
    private String type1;
    private String color;
    private Number thickness;
    private Number size;

    /**
     * Setter for type palette HatchFills from list by index.
     */
    public HatchFills setItemAt(Number index, HatchFillType type, String color, Number thickness, Number size) {
        if (jsBase == null) {
            this.index = index;
            this.type = null;
            this.type1 = null;
            
            this.type = type;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.index = index;
            this.type = type;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".itemAt(%s, %s, %s, %s, %s)", index, ((type != null) ? type.generateJs() : "null"), wrapQuotes(color), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%s, %s, %s, %s, %s);", index, ((type != null) ? type.generateJs() : "null"), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for type palette HatchFills from list by index.
     */
    public HatchFills setItemAt(Number index, String type1, String color, Number thickness, Number size) {
        if (jsBase == null) {
            this.index = index;
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.index = index;
            this.type1 = type1;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".itemAt(%s, %s, %s, %s, %s)", index, wrapQuotes(type1), wrapQuotes(color), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%s, %s, %s, %s, %s);", index, wrapQuotes(type1), wrapQuotes(color), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index1;
    private PatternFill patternFill;

    /**
     * Setter for type palette HatchFills from list by index using patternFill.
     */
    public HatchFills setItemAt(Number index1, PatternFill patternFill) {
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
            js.append(patternFill.generateJs());
            js.append(String.format(Locale.US, ".itemAt(%s, %s)", index1, ((patternFill != null) ? patternFill.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%s, %s);", index1, ((patternFill != null) ? patternFill.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index2;
    private HatchFill instance;

    /**
     * Setter for type palette HatchFills from list by index using instance.
     */
    public HatchFills setItemAt(Number index2, HatchFill instance) {
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
            js.append(instance.generateJs());
            js.append(String.format(Locale.US, ".itemAt(%s, %s)", index2, ((instance != null) ? instance.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%s, %s);", index2, ((instance != null) ? instance.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index3;
    private Boolean state;

    /**
     * Enables/disables type palette HatchFills from list by index.
     */
    public HatchFills itemAt(Number index3, Boolean state) {
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
            
            js.append(String.format(Locale.US, ".itemAt(%s, %b)", index3, state));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%s, %b);", index3, state));
                js.setLength(0);
            }
        }
        return this;
    }

    private HatchFill[] items;
    private HatchFillType[] items1;
    private PatternFill[] items2;
    private HatchFill var_args;
    private HatchFillType var_args1;
    private PatternFill var_args2;

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
            js.append(var_args.generateJs());
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), ((var_args != null) ? var_args.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), ((var_args != null) ? var_args.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), ((var_args1 != null) ? var_args1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
            js.append(var_args2.generateJs());
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items), ((var_args2 != null) ? var_args2.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), ((var_args2 != null) ? var_args2.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
            js.append(var_args.generateJs());
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), ((var_args != null) ? var_args.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items1), ((var_args != null) ? var_args.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items1), ((var_args1 != null) ? var_args1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
            js.append(var_args2.generateJs());
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items1), ((var_args2 != null) ? var_args2.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items1), ((var_args2 != null) ? var_args2.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
            js.append(var_args.generateJs());
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), ((var_args != null) ? var_args.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items2), ((var_args != null) ? var_args.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items2), ((var_args1 != null) ? var_args1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
            js.append(var_args2.generateJs());
            js.append(String.format(Locale.US, ".items(%s, %s)", arrayToString(items2), ((var_args2 != null) ? var_args2.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items2), ((var_args2 != null) ? var_args2.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
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

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}