package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The OrdinalColor class contains methods for configuring Ordinal color scale.<br/>
<b>Note:</b> To create instance use {@link anychart.scales#ordinalColor} method.
 */
public class OrdinalColor extends ScalesBase {

    public OrdinalColor() {
        js.setLength(0);
        js.append("var ordinalColor").append(++variableIndex).append(" = anychart.scales.ordinalColor();");
        jsBase = "ordinalColor" + variableIndex;
    }

    protected OrdinalColor(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected OrdinalColor(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String colorToValue;

    /**
     * Returns value for passed color. Value is a middle of its range.
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

    private String[] colors;

    /**
     * Setter for the linear gradient for linear color scale.
     */
    public OrdinalColor setColors(String[] colors) {
        if (jsBase == null) {
            this.colors = colors;
        } else {
            this.colors = colors;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".colors(%s)", arrayToStringWrapQuotes(colors)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", arrayToStringWrapQuotes(colors)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number getIndexByValue;

    /**
     * Returns range index relative passed value.
     */
    public void getIndexByValue(Number getIndexByValue) {
        if (jsBase == null) {
            this.getIndexByValue = getIndexByValue;
        } else {
            this.getIndexByValue = getIndexByValue;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getIndexByValue(%s);", getIndexByValue));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getIndexByValue(%s);", getIndexByValue));
                js.setLength(0);
            }
        }
    }

    private Number getRangeByValue;

    /**
     * Returns range for passed value.
     */
    public void getRangeByValue(Number getRangeByValue) {
        if (jsBase == null) {
            this.getRangeByValue = getRangeByValue;
        } else {
            this.getRangeByValue = getRangeByValue;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".getRangeByValue(%s);", getRangeByValue));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getRangeByValue(%s);", getRangeByValue));
                js.setLength(0);
            }
        }
    }

    private Number ratio;

    /**
     * Returns tick value by its ratio position.
     */
    public void inverseTransform(Number ratio) {
        if (jsBase == null) {
            this.ratio = ratio;
        } else {
            this.ratio = ratio;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".inverseTransform(%s);", ratio));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverseTransform(%s);", ratio));
                js.setLength(0);
            }
        }
    }

    private String names;

    /**
     * Setter for scale names for data set.
     */
    public OrdinalColor setNames(String names) {
        if (jsBase == null) {
            this.names = names;
        } else {
            this.names = names;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".names(%s)", wrapQuotes(names)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".names(%s);", wrapQuotes(names)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String ranges;

    /**
     * Setter for the scale ranges.
     */
    public OrdinalColor setRanges(String ranges) {
        if (jsBase == null) {
            this.ranges = ranges;
        } else {
            this.ranges = ranges;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".ranges(%s)", wrapQuotes(ranges)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ranges(%s);", wrapQuotes(ranges)));
                js.setLength(0);
            }
        }
        return this;
    }

    private OrdinalTicks getTicks;

    /**
     * Getter for the set of scale ticks in terms of data values.
     */
    public OrdinalTicks getTicks() {
        if (getTicks == null)
            getTicks = new OrdinalTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private String[] ticks1;

    /**
     * Setter for the set of scale ticks in terms of data values.
     */
    public OrdinalColor setTicks(String ticks) {
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
    public OrdinalColor setTicks(String[] ticks1) {
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

    private Number subRangeRatio;

    /**
     * Returns tick position ratio by its value.
     */
    public void transform(Number subRangeRatio) {
        if (jsBase == null) {
            this.subRangeRatio = subRangeRatio;
        } else {
            this.subRangeRatio = subRangeRatio;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".transform(%s);", subRangeRatio));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transform(%s);", subRangeRatio));
                js.setLength(0);
            }
        }
    }

    private Number valueToColor;

    /**
     * Converts value to color. Returns color relative to passed value.
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

    private String generateJSgetTicks() {
        if (getTicks != null) {
            return getTicks.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
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