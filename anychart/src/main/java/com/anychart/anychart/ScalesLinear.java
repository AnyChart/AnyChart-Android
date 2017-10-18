package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class ScalesLinear extends ScatterBase {

    public ScalesLinear() {

    }

    protected ScalesLinear(String jsBase) {
        this.jsBase = jsBase;
    }

    protected ScalesLinear(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private ScaleCompareWithMode compareWith;
    private String compareWith1;
    private Double compareWith2;

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

            js.append(String.format(Locale.US, ".compareWith(%s)", (compareWith != null) ? compareWith.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".compareWith(%s)", (compareWith != null) ? compareWith.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".compareWith(%s)", compareWith1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".compareWith(%s)", compareWith1));
                js.setLength(0);
            }
        }
        return this;
    }


    public ScalesLinear setCompareWith(Double compareWith2) {
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

            js.append(String.format(Locale.US, ".compareWith(%f)", compareWith2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".compareWith(%f)", compareWith2));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScaleComparisonMode comparisonMode;
    private String comparisonMode1;

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

            js.append(String.format(Locale.US, ".comparisonMode(%s)", (comparisonMode != null) ? comparisonMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".comparisonMode(%s)", (comparisonMode != null) ? comparisonMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".comparisonMode(%s)", comparisonMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".comparisonMode(%s)", comparisonMode1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maximumGap;

    public ScalesLinear setMaximumGap(Double maximumGap) {
        if (jsBase == null) {
            this.maximumGap = maximumGap;
        } else {
            this.maximumGap = maximumGap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maximumGap(%f)", maximumGap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maximumGap(%f)", maximumGap));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minimumGap;

    public ScalesLinear setMinimumGap(Double minimumGap) {
        if (jsBase == null) {
            this.minimumGap = minimumGap;
        } else {
            this.minimumGap = minimumGap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minimumGap(%f)", minimumGap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minimumGap(%f)", minimumGap));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScatterTicks getMinorTicks;

    public ScatterTicks getMinorTicks() {
        if (getMinorTicks == null)
            getMinorTicks = new ScatterTicks(jsBase + ".minorTicks()");

        return getMinorTicks;
    }

    private String minorTicks;
    private String[] minorTicks1;

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

            js.append(String.format(Locale.US, ".minorTicks(%s)", minorTicks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minorTicks(%s)", minorTicks));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".minorTicks(%s)", Arrays.toString(minorTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minorTicks(%s)", Arrays.toString(minorTicks1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double softMaximum;

    public ScalesLinear setSoftMaximum(Double softMaximum) {
        if (jsBase == null) {
            this.softMaximum = softMaximum;
        } else {
            this.softMaximum = softMaximum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".softMaximum(%f)", softMaximum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".softMaximum(%f)", softMaximum));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double softMinimum;

    public ScalesLinear setSoftMinimum(Double softMinimum) {
        if (jsBase == null) {
            this.softMinimum = softMinimum;
        } else {
            this.softMinimum = softMinimum;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".softMinimum(%f)", softMinimum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".softMinimum(%f)", softMinimum));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScaleStackDirection stackDirection;
    private String stackDirection1;

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

            js.append(String.format(Locale.US, ".stackDirection(%s)", (stackDirection != null) ? stackDirection.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stackDirection(%s)", (stackDirection != null) ? stackDirection.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".stackDirection(%s)", stackDirection1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stackDirection(%s)", stackDirection1));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScaleStackMode stackMode;
    private String stackMode1;

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

            js.append(String.format(Locale.US, ".stackMode(%s)", (stackMode != null) ? stackMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stackMode(%s)", (stackMode != null) ? stackMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".stackMode(%s)", stackMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stackMode(%s)", stackMode1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean stickToZero;

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
                onChangeListener.onChange(String.format(Locale.US, ".stickToZero(%b)", stickToZero));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScatterTicks getTicks;

    public ScatterTicks getTicks() {
        if (getTicks == null)
            getTicks = new ScatterTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private String[] ticks1;

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

            js.append(String.format(Locale.US, ".ticks(%s)", ticks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".ticks(%s)", ticks));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".ticks(%s)", Arrays.toString(ticks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".ticks(%s)", Arrays.toString(ticks1)));
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

    private String generateJScompareWith() {
        if (compareWith != null) {
            return String.format(Locale.US, "compareWith: %s,", (compareWith != null) ? compareWith.generateJs() : "null");
        }
        return "";
    }

    private String generateJScompareWith1() {
        if (compareWith1 != null) {
            return String.format(Locale.US, "compareWith: %s,", compareWith1);
        }
        return "";
    }

    private String generateJScompareWith2() {
        if (compareWith2 != null) {
            return String.format(Locale.US, "compareWith: %f,", compareWith2);
        }
        return "";
    }

    private String generateJScomparisonMode() {
        if (comparisonMode != null) {
            return String.format(Locale.US, "comparisonMode: %s,", (comparisonMode != null) ? comparisonMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJScomparisonMode1() {
        if (comparisonMode1 != null) {
            return String.format(Locale.US, "comparisonMode: %s,", comparisonMode1);
        }
        return "";
    }

    private String generateJSmaximumGap() {
        if (maximumGap != null) {
            return String.format(Locale.US, "maximumGap: %f,", maximumGap);
        }
        return "";
    }

    private String generateJSminimumGap() {
        if (minimumGap != null) {
            return String.format(Locale.US, "minimumGap: %f,", minimumGap);
        }
        return "";
    }

    private String generateJSminorTicks() {
        if (minorTicks != null) {
            return String.format(Locale.US, "minorTicks: %s,", minorTicks);
        }
        return "";
    }

    private String generateJSminorTicks1() {
        if (minorTicks1 != null) {
            return String.format(Locale.US, "minorTicks: %s,", Arrays.toString(minorTicks1));
        }
        return "";
    }

    private String generateJSsoftMaximum() {
        if (softMaximum != null) {
            return String.format(Locale.US, "softMaximum: %f,", softMaximum);
        }
        return "";
    }

    private String generateJSsoftMinimum() {
        if (softMinimum != null) {
            return String.format(Locale.US, "softMinimum: %f,", softMinimum);
        }
        return "";
    }

    private String generateJSstackDirection() {
        if (stackDirection != null) {
            return String.format(Locale.US, "stackDirection: %s,", (stackDirection != null) ? stackDirection.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstackDirection1() {
        if (stackDirection1 != null) {
            return String.format(Locale.US, "stackDirection: %s,", stackDirection1);
        }
        return "";
    }

    private String generateJSstackMode() {
        if (stackMode != null) {
            return String.format(Locale.US, "stackMode: %s,", (stackMode != null) ? stackMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstackMode1() {
        if (stackMode1 != null) {
            return String.format(Locale.US, "stackMode: %s,", stackMode1);
        }
        return "";
    }

    private String generateJSstickToZero() {
        if (stickToZero != null) {
            return String.format(Locale.US, "stickToZero: %b,", stickToZero);
        }
        return "";
    }

    private String generateJSticks() {
        if (ticks != null) {
            return String.format(Locale.US, "ticks: %s,", ticks);
        }
        return "";
    }

    private String generateJSticks1() {
        if (ticks1 != null) {
            return String.format(Locale.US, "ticks: %s,", Arrays.toString(ticks1));
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJScompareWith());
            js.append(generateJScompareWith1());
            js.append(generateJScompareWith2());
            js.append(generateJScomparisonMode());
            js.append(generateJScomparisonMode1());
            js.append(generateJSmaximumGap());
            js.append(generateJSminimumGap());
            js.append(generateJSminorTicks());
            js.append(generateJSminorTicks1());
            js.append(generateJSsoftMaximum());
            js.append(generateJSsoftMinimum());
            js.append(generateJSstackDirection());
            js.append(generateJSstackDirection1());
            js.append(generateJSstackMode());
            js.append(generateJSstackMode1());
            js.append(generateJSstickToZero());
            js.append(generateJSticks());
            js.append(generateJSticks1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}