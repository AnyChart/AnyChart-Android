package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The LinearColor class contains methods for configuring Linear color scale.<br/>
<b>Note:</b> To create instance use {@link anychart.scales#linearColor} method.
 */
public class LinearColor extends ScatterBase {

    public LinearColor() {
        js.setLength(0);
        js.append("var linearColor").append(++variableIndex).append(" = anychart.scales.linearColor();");
        jsBase = "linearColor" + variableIndex;
    }

    protected LinearColor(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected LinearColor(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String colorToValue;

    /**
     * Converts color to value. Returns number ratio by its color.
     */
    public void colorToValue(String colorToValue) {
        if (jsBase == null) {
            this.colorToValue = colorToValue;
        } else {
            this.colorToValue = colorToValue;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".colorToValue(%s);", wrapQuotes(colorToValue)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorToValue(%s);", wrapQuotes(colorToValue)));
                js.setLength(0);
            }
        }
    }

    private String var_args;
    private SolidFill var_args1;
    private LinearGradientFill var_args2;
    private RadialGradientFill var_args3;
    private String[] var_args4;
    private SolidFill[] var_args5;
    private LinearGradientFill[] var_args6;
    private RadialGradientFill[] var_args7;

    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public LinearColor setColors(String var_args) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            this.var_args5 = null;
            this.var_args6 = null;
            this.var_args7 = null;
            
            this.var_args = var_args;
        } else {
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".colors(%s)", wrapQuotes(var_args)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", wrapQuotes(var_args)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public LinearColor setColors(SolidFill var_args1) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            this.var_args5 = null;
            this.var_args6 = null;
            this.var_args7 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".colors(%s)", ((var_args1 != null) ? var_args1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", ((var_args1 != null) ? var_args1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public LinearColor setColors(LinearGradientFill var_args2) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            this.var_args5 = null;
            this.var_args6 = null;
            this.var_args7 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.var_args2 = var_args2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".colors(%s)", ((var_args2 != null) ? var_args2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", ((var_args2 != null) ? var_args2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public LinearColor setColors(RadialGradientFill var_args3) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            this.var_args5 = null;
            this.var_args6 = null;
            this.var_args7 = null;
            
            this.var_args3 = var_args3;
        } else {
            this.var_args3 = var_args3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".colors(%s)", ((var_args3 != null) ? var_args3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", ((var_args3 != null) ? var_args3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public LinearColor setColors(String[] var_args4) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            this.var_args5 = null;
            this.var_args6 = null;
            this.var_args7 = null;
            
            this.var_args4 = var_args4;
        } else {
            this.var_args4 = var_args4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".colors(%s)", arrayToStringWrapQuotes(var_args4)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", arrayToStringWrapQuotes(var_args4)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public LinearColor setColors(SolidFill[] var_args5) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            this.var_args5 = null;
            this.var_args6 = null;
            this.var_args7 = null;
            
            this.var_args5 = var_args5;
        } else {
            this.var_args5 = var_args5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".colors(%s)", arrayToString(var_args5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", arrayToString(var_args5)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public LinearColor setColors(LinearGradientFill[] var_args6) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            this.var_args5 = null;
            this.var_args6 = null;
            this.var_args7 = null;
            
            this.var_args6 = var_args6;
        } else {
            this.var_args6 = var_args6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".colors(%s)", arrayToString(var_args6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", arrayToString(var_args6)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the linear gradient for the linear color scale.
     */
    public LinearColor setColors(RadialGradientFill[] var_args7) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            this.var_args5 = null;
            this.var_args6 = null;
            this.var_args7 = null;
            
            this.var_args7 = var_args7;
        } else {
            this.var_args7 = var_args7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".colors(%s)", arrayToString(var_args7)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", arrayToString(var_args7)));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScatterTicks getMinorTicks;

    /**
     * Getter for the set of scale minor ticks in terms of data values.
     */
    public ScatterTicks getMinorTicks() {
        if (getMinorTicks == null)
            getMinorTicks = new ScatterTicks(jsBase + ".minorTicks()");

        return getMinorTicks;
    }

    private String minorTicks;
    private String[] minorTicks1;

    /**
     * Setter for the  set of scale minor ticks in terms of data values.
     */
    public LinearColor setMinorTicks(String minorTicks) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks = minorTicks;
        } else {
            this.minorTicks = minorTicks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minorTicks(%s)", wrapQuotes(minorTicks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minorTicks(%s);", wrapQuotes(minorTicks)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the  set of scale minor ticks in terms of data values.
     */
    public LinearColor setMinorTicks(String[] minorTicks1) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks1 = minorTicks1;
        } else {
            this.minorTicks1 = minorTicks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minorTicks(%s)", arrayToStringWrapQuotes(minorTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minorTicks(%s);", arrayToStringWrapQuotes(minorTicks1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScatterTicks getTicks;

    /**
     * Getter for the set of scale ticks in terms of data values.
     */
    public ScatterTicks getTicks() {
        if (getTicks == null)
            getTicks = new ScatterTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private String[] ticks1;

    /**
     * Setter for the set of scale ticks in terms of data values.
     */
    public LinearColor setTicks(String ticks) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks = ticks;
        } else {
            this.ticks = ticks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".ticks(%s)", wrapQuotes(ticks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ticks(%s);", wrapQuotes(ticks)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the set of scale ticks in terms of data values.
     */
    public LinearColor setTicks(String[] ticks1) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks1 = ticks1;
        } else {
            this.ticks1 = ticks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".ticks(%s)", arrayToStringWrapQuotes(ticks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ticks(%s);", arrayToStringWrapQuotes(ticks1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number valueToColor;

    /**
     * Converts value to color. Returns color ratio by its number.
     */
    public void valueToColor(Number valueToColor) {
        if (jsBase == null) {
            this.valueToColor = valueToColor;
        } else {
            this.valueToColor = valueToColor;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".valueToColor(%s);", valueToColor));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueToColor(%s);", valueToColor));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetMinorTicks() {
        if (getMinorTicks != null) {
            return getMinorTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetTicks() {
        if (getTicks != null) {
            return getTicks.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetMinorTicks());
        jsGetters.append(generateJSgetTicks());

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