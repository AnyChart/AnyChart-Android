package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The Linear class contains methods for configuring Linear scale.<br/>
Represents simple linear scale that transforms values from domain [a, b] to domain [0, 1].
Note that a can be greater than b. The only condition for the scale is that a != b.<br/>
<b>Note:</b> To create instance use {@link anychart.scales#linear} method.
 */
public class ScalesLinear extends ScatterBase {

    public ScalesLinear() {
        js.setLength(0);
        js.append("var scalesLinear").append(++variableIndex).append(" = anychart.scales.linear();");
        jsBase = "scalesLinear" + variableIndex;
    }

    protected ScalesLinear(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ScalesLinear(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private ScaleCompareWithMode compareWith;
    private String compareWith1;
    private Number compareWith2;

    /**
     * Setter for the date which should be used as a changes zero for series.
     */
    public ScalesLinear setCompareWith(ScaleCompareWithMode compareWith) {
        if (jsBase == null) {
            this.compareWith = null;
            this.compareWith1 = null;
            this.compareWith2 = null;
            
            this.compareWith = compareWith;
        } else {
            this.compareWith = compareWith;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".compareWith(%s)", ((compareWith != null) ? compareWith.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".compareWith(%s);", ((compareWith != null) ? compareWith.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the date which should be used as a changes zero for series.
     */
    public ScalesLinear setCompareWith(String compareWith1) {
        if (jsBase == null) {
            this.compareWith = null;
            this.compareWith1 = null;
            this.compareWith2 = null;
            
            this.compareWith1 = compareWith1;
        } else {
            this.compareWith1 = compareWith1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".compareWith(%s)", wrapQuotes(compareWith1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".compareWith(%s);", wrapQuotes(compareWith1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the date which should be used as a changes zero for series.
     */
    public ScalesLinear setCompareWith(Number compareWith2) {
        if (jsBase == null) {
            this.compareWith = null;
            this.compareWith1 = null;
            this.compareWith2 = null;
            
            this.compareWith2 = compareWith2;
        } else {
            this.compareWith2 = compareWith2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".compareWith(%s)", compareWith2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".compareWith(%s);", compareWith2));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScaleComparisonMode comparisonMode;
    private String comparisonMode1;

    /**
     * Setter for the scale changes mode.
     */
    public ScalesLinear setComparisonMode(ScaleComparisonMode comparisonMode) {
        if (jsBase == null) {
            this.comparisonMode = null;
            this.comparisonMode1 = null;
            
            this.comparisonMode = comparisonMode;
        } else {
            this.comparisonMode = comparisonMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".comparisonMode(%s)", ((comparisonMode != null) ? comparisonMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".comparisonMode(%s);", ((comparisonMode != null) ? comparisonMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the scale changes mode.
     */
    public ScalesLinear setComparisonMode(String comparisonMode1) {
        if (jsBase == null) {
            this.comparisonMode = null;
            this.comparisonMode1 = null;
            
            this.comparisonMode1 = comparisonMode1;
        } else {
            this.comparisonMode1 = comparisonMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".comparisonMode(%s)", wrapQuotes(comparisonMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".comparisonMode(%s);", wrapQuotes(comparisonMode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number maximumGap;

    /**
     * Setter for the scale maximum gap.
     */
    public ScalesLinear setMaximumGap(Number maximumGap) {
        if (jsBase == null) {
            this.maximumGap = maximumGap;
        } else {
            this.maximumGap = maximumGap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maximumGap(%s)", maximumGap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maximumGap(%s);", maximumGap));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number minimumGap;

    /**
     * Setter for the scale minimum gap.
     */
    public ScalesLinear setMinimumGap(Number minimumGap) {
        if (jsBase == null) {
            this.minimumGap = minimumGap;
        } else {
            this.minimumGap = minimumGap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minimumGap(%s)", minimumGap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minimumGap(%s);", minimumGap));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScatterTicks getMinorTicks;

    /**
     * Getter for set of scale minor ticks in terms of data values.
     */
    public ScatterTicks getMinorTicks() {
        if (getMinorTicks == null)
            getMinorTicks = new ScatterTicks(jsBase + ".minorTicks()");

        return getMinorTicks;
    }

    private String minorTicks;
    private String[] minorTicks1;

    /**
     * Setter for set of scale minor ticks in terms of data values.
     */
    public ScalesLinear setMinorTicks(String minorTicks) {
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
     * Setter for set of scale minor ticks in terms of data values.
     */
    public ScalesLinear setMinorTicks(String[] minorTicks1) {
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

    private Number softMaximum;

    /**
     * Setter for the soft maximum.
     */
    public ScalesLinear setSoftMaximum(Number softMaximum) {
        if (jsBase == null) {
            this.softMaximum = softMaximum;
        } else {
            this.softMaximum = softMaximum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".softMaximum(%s)", softMaximum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".softMaximum(%s);", softMaximum));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number softMinimum;

    /**
     * Setter for the soft minimum.
     */
    public ScalesLinear setSoftMinimum(Number softMinimum) {
        if (jsBase == null) {
            this.softMinimum = softMinimum;
        } else {
            this.softMinimum = softMinimum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".softMinimum(%s)", softMinimum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".softMinimum(%s);", softMinimum));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScaleStackDirection stackDirection;
    private String stackDirection1;

    /**
     * Setter for the stacking direction.
     */
    public ScalesLinear setStackDirection(ScaleStackDirection stackDirection) {
        if (jsBase == null) {
            this.stackDirection = null;
            this.stackDirection1 = null;
            
            this.stackDirection = stackDirection;
        } else {
            this.stackDirection = stackDirection;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stackDirection(%s)", ((stackDirection != null) ? stackDirection.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stackDirection(%s);", ((stackDirection != null) ? stackDirection.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the stacking direction.
     */
    public ScalesLinear setStackDirection(String stackDirection1) {
        if (jsBase == null) {
            this.stackDirection = null;
            this.stackDirection1 = null;
            
            this.stackDirection1 = stackDirection1;
        } else {
            this.stackDirection1 = stackDirection1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stackDirection(%s)", wrapQuotes(stackDirection1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stackDirection(%s);", wrapQuotes(stackDirection1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScaleStackMode stackMode;
    private String stackMode1;

    /**
     * Setter for the stacked mode.
     */
    public ScalesLinear setStackMode(ScaleStackMode stackMode) {
        if (jsBase == null) {
            this.stackMode = null;
            this.stackMode1 = null;
            
            this.stackMode = stackMode;
        } else {
            this.stackMode = stackMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stackMode(%s)", ((stackMode != null) ? stackMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stackMode(%s);", ((stackMode != null) ? stackMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the stacked mode.
     */
    public ScalesLinear setStackMode(String stackMode1) {
        if (jsBase == null) {
            this.stackMode = null;
            this.stackMode1 = null;
            
            this.stackMode1 = stackMode1;
        } else {
            this.stackMode1 = stackMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stackMode(%s)", wrapQuotes(stackMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stackMode(%s);", wrapQuotes(stackMode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean stickToZero;

    /**
     * Setter for stick to zero.
Flag to stick to zero value on auto calc if gaps lead to zero crossing.
     */
    public ScalesLinear setStickToZero(Boolean stickToZero) {
        if (jsBase == null) {
            this.stickToZero = stickToZero;
        } else {
            this.stickToZero = stickToZero;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stickToZero(%b)", stickToZero));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stickToZero(%b);", stickToZero));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScatterTicks getTicks;

    /**
     * Getter for set of scale ticks in terms of data values.
     */
    public ScatterTicks getTicks() {
        if (getTicks == null)
            getTicks = new ScatterTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private String[] ticks1;

    /**
     * Setter for set of scale ticks in terms of data values.
     */
    public ScalesLinear setTicks(String ticks) {
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
     * Setter for set of scale ticks in terms of data values.
     */
    public ScalesLinear setTicks(String[] ticks1) {
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