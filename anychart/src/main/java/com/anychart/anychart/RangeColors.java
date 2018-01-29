package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Gradient palette class.
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

    
    private Number count;

    /**
     * Setter for color palette's colors counts.<br/>
<b>Note:</b> Defines how many steps we need in gradient.
     */
    public RangeColors setCount(Number count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".count(%s)", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".count(%s);", count));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index;
    private SolidFill color;

    /**
     * Setter for color palette colors from list by index.
     */
    public RangeColors setItemAt(Number index, SolidFill color) {
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
            
            js.append(String.format(Locale.US, ".itemAt(%s, %s)", index, ((color != null) ? color.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%s, %s);", index, ((color != null) ? color.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", ((items1 != null) ? items1.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", ((items1 != null) ? items1.generateJs() : "null"), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", ((items2 != null) ? items2.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", ((items2 != null) ? items2.generateJs() : "null"), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items3), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items3), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToStringWrapQuotes(items4), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToStringWrapQuotes(items4), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", ((items5 != null) ? items5.generateJs() : "null"), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", ((items5 != null) ? items5.generateJs() : "null"), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", wrapQuotes(items6), ((var_args != null) ? var_args.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", wrapQuotes(items6), wrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
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

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}