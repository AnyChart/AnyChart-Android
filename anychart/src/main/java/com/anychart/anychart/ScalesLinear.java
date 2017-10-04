package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class ScalesLinear extends ScatterBase {

    private String jsBase;

    public ScalesLinear() {

    }

    protected ScalesLinear(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String compareWith;
    private ScaleCompareWithMode compareWith1;
    private Double compareWith2;

    public void setComparewith(String compareWith) {
        if (jsBase == null) {
            this.compareWith = null;
            this.compareWith1 = null;
            this.compareWith2 = null;
            
            this.compareWith = compareWith;
        } else {
            this.compareWith = compareWith;

            js.append(String.format(Locale.US, jsBase + ".compareWith(%s);", compareWith));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".compareWith(%s);", compareWith));
                js.setLength(0);
            }
        }
    }


    public void setComparewith(ScaleCompareWithMode compareWith1) {
        if (jsBase == null) {
            this.compareWith = null;
            this.compareWith1 = null;
            this.compareWith2 = null;
            
            this.compareWith1 = compareWith1;
        } else {
            this.compareWith1 = compareWith1;

            js.append(String.format(Locale.US, jsBase + ".compareWith(%s);", (compareWith1 != null) ? compareWith1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".compareWith(%s);", (compareWith1 != null) ? compareWith1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setComparewith(Double compareWith2) {
        if (jsBase == null) {
            this.compareWith = null;
            this.compareWith1 = null;
            this.compareWith2 = null;
            
            this.compareWith2 = compareWith2;
        } else {
            this.compareWith2 = compareWith2;

            js.append(String.format(Locale.US, jsBase + ".compareWith(%f);", compareWith2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".compareWith(%f);", compareWith2));
                js.setLength(0);
            }
        }
    }

    private String comparisonMode;
    private ScaleComparisonMode comparisonMode1;

    public void setComparisonmode(String comparisonMode) {
        if (jsBase == null) {
            this.comparisonMode = null;
            this.comparisonMode1 = null;
            
            this.comparisonMode = comparisonMode;
        } else {
            this.comparisonMode = comparisonMode;

            js.append(String.format(Locale.US, jsBase + ".comparisonMode(%s);", comparisonMode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".comparisonMode(%s);", comparisonMode));
                js.setLength(0);
            }
        }
    }


    public void setComparisonmode(ScaleComparisonMode comparisonMode1) {
        if (jsBase == null) {
            this.comparisonMode = null;
            this.comparisonMode1 = null;
            
            this.comparisonMode1 = comparisonMode1;
        } else {
            this.comparisonMode1 = comparisonMode1;

            js.append(String.format(Locale.US, jsBase + ".comparisonMode(%s);", (comparisonMode1 != null) ? comparisonMode1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".comparisonMode(%s);", (comparisonMode1 != null) ? comparisonMode1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Boolean silently;

    public void setFinishautocalc(Boolean silently) {
        if (jsBase == null) {
            this.silently = silently;
        } else {
            this.silently = silently;

            js.append(String.format(Locale.US, jsBase + ".finishAutoCalc(%b);", silently));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".finishAutoCalc(%b);", silently));
                js.setLength(0);
            }
        }
    }

    private Double ratio;

    public void setInversetransform(Double ratio) {
        if (jsBase == null) {
            this.ratio = ratio;
        } else {
            this.ratio = ratio;

            js.append(String.format(Locale.US, jsBase + ".inverseTransform(%f);", ratio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverseTransform(%f);", ratio));
                js.setLength(0);
            }
        }
    }

    private Boolean inverted;

    public void setInverted(Boolean inverted) {
        if (jsBase == null) {
            this.inverted = inverted;
        } else {
            this.inverted = inverted;

            js.append(String.format(Locale.US, jsBase + ".inverted(%b);", inverted));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverted(%b);", inverted));
                js.setLength(0);
            }
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private Double maximum;

    public void setMaximum(Double maximum) {
        if (jsBase == null) {
            this.maximum = maximum;
        } else {
            this.maximum = maximum;

            js.append(String.format(Locale.US, jsBase + ".maximum(%f);", maximum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maximum(%f);", maximum));
                js.setLength(0);
            }
        }
    }

    private Double maximumGap;

    public void setMaximumgap(Double maximumGap) {
        if (jsBase == null) {
            this.maximumGap = maximumGap;
        } else {
            this.maximumGap = maximumGap;

            js.append(String.format(Locale.US, jsBase + ".maximumGap(%f);", maximumGap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maximumGap(%f);", maximumGap));
                js.setLength(0);
            }
        }
    }

    private Double minimum;

    public void setMinimum(Double minimum) {
        if (jsBase == null) {
            this.minimum = minimum;
        } else {
            this.minimum = minimum;

            js.append(String.format(Locale.US, jsBase + ".minimum(%f);", minimum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minimum(%f);", minimum));
                js.setLength(0);
            }
        }
    }

    private Double minimumGap;

    public void setMinimumgap(Double minimumGap) {
        if (jsBase == null) {
            this.minimumGap = minimumGap;
        } else {
            this.minimumGap = minimumGap;

            js.append(String.format(Locale.US, jsBase + ".minimumGap(%f);", minimumGap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minimumGap(%f);", minimumGap));
                js.setLength(0);
            }
        }
    }

    private ScatterTicks getMinorTicks;

    public ScatterTicks getMinorTicks() {
        if (getMinorTicks == null)
            getMinorTicks = new ScatterTicks(jsBase + ".minorTicks()");

        return getMinorTicks;
    }

    private String minorTicks;
    private String[] minorTicks1;

    public void setMinorticks(String minorTicks) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks = minorTicks;
        } else {
            this.minorTicks = minorTicks;

            js.append(String.format(Locale.US, jsBase + ".minorTicks(%s);", minorTicks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minorTicks(%s);", minorTicks));
                js.setLength(0);
            }
        }
    }


    public void setMinorticks(String[] minorTicks1) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks1 = minorTicks1;
        } else {
            this.minorTicks1 = minorTicks1;

            js.append(String.format(Locale.US, jsBase + ".minorTicks(%s);", Arrays.toString(minorTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minorTicks(%s);", Arrays.toString(minorTicks1)));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private Double softMaximum;

    public void setSoftmaximum(Double softMaximum) {
        if (jsBase == null) {
            this.softMaximum = softMaximum;
        } else {
            this.softMaximum = softMaximum;

            js.append(String.format(Locale.US, jsBase + ".softMaximum(%f);", softMaximum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".softMaximum(%f);", softMaximum));
                js.setLength(0);
            }
        }
    }

    private Double softMinimum;

    public void setSoftminimum(Double softMinimum) {
        if (jsBase == null) {
            this.softMinimum = softMinimum;
        } else {
            this.softMinimum = softMinimum;

            js.append(String.format(Locale.US, jsBase + ".softMinimum(%f);", softMinimum));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".softMinimum(%f);", softMinimum));
                js.setLength(0);
            }
        }
    }

    private ScaleStackMode stackMode;
    private String stackMode1;

    public void setStackmode(ScaleStackMode stackMode) {
        if (jsBase == null) {
            this.stackMode = null;
            this.stackMode1 = null;
            
            this.stackMode = stackMode;
        } else {
            this.stackMode = stackMode;

            js.append(String.format(Locale.US, jsBase + ".stackMode(%s);", (stackMode != null) ? stackMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stackMode(%s);", (stackMode != null) ? stackMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStackmode(String stackMode1) {
        if (jsBase == null) {
            this.stackMode = null;
            this.stackMode1 = null;
            
            this.stackMode1 = stackMode1;
        } else {
            this.stackMode1 = stackMode1;

            js.append(String.format(Locale.US, jsBase + ".stackMode(%s);", stackMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stackMode(%s);", stackMode1));
                js.setLength(0);
            }
        }
    }

    private Boolean stickToZero;

    public void setSticktozero(Boolean stickToZero) {
        if (jsBase == null) {
            this.stickToZero = stickToZero;
        } else {
            this.stickToZero = stickToZero;

            js.append(String.format(Locale.US, jsBase + ".stickToZero(%b);", stickToZero));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stickToZero(%b);", stickToZero));
                js.setLength(0);
            }
        }
    }

    private ScatterTicks getTicks;

    public ScatterTicks getTicks() {
        if (getTicks == null)
            getTicks = new ScatterTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private String[] ticks1;

    public void setTicks(String ticks) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks = ticks;
        } else {
            this.ticks = ticks;

            js.append(String.format(Locale.US, jsBase + ".ticks(%s);", ticks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ticks(%s);", ticks));
                js.setLength(0);
            }
        }
    }


    public void setTicks(String[] ticks1) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks1 = ticks1;
        } else {
            this.ticks1 = ticks1;

            js.append(String.format(Locale.US, jsBase + ".ticks(%s);", Arrays.toString(ticks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ticks(%s);", Arrays.toString(ticks1)));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
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

    private String generateJScompareWith() {
        if (compareWith != null) {
            return String.format(Locale.US, "compareWith: %s,", compareWith);
        }
        return "";
    }

    private String generateJScompareWith1() {
        if (compareWith1 != null) {
            return String.format(Locale.US, "compareWith: %s,", (compareWith1 != null) ? compareWith1.generateJs() : "null");
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
            return String.format(Locale.US, "comparisonMode: %s,", comparisonMode);
        }
        return "";
    }

    private String generateJScomparisonMode1() {
        if (comparisonMode1 != null) {
            return String.format(Locale.US, "comparisonMode: %s,", (comparisonMode1 != null) ? comparisonMode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSsilently() {
        if (silently != null) {
            return String.format(Locale.US, "silently: %b,", silently);
        }
        return "";
    }

    private String generateJSratio() {
        if (ratio != null) {
            return String.format(Locale.US, "ratio: %f,", ratio);
        }
        return "";
    }

    private String generateJSinverted() {
        if (inverted != null) {
            return String.format(Locale.US, "inverted: %b,", inverted);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
        }
        return "";
    }

    private String generateJSmaximum() {
        if (maximum != null) {
            return String.format(Locale.US, "maximum: %f,", maximum);
        }
        return "";
    }

    private String generateJSmaximumGap() {
        if (maximumGap != null) {
            return String.format(Locale.US, "maximumGap: %f,", maximumGap);
        }
        return "";
    }

    private String generateJSminimum() {
        if (minimum != null) {
            return String.format(Locale.US, "minimum: %f,", minimum);
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

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
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

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJScompareWith());
            js.append(generateJScompareWith1());
            js.append(generateJScompareWith2());
            js.append(generateJScomparisonMode());
            js.append(generateJScomparisonMode1());
            js.append(generateJSsilently());
            js.append(generateJSratio());
            js.append(generateJSinverted());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSmaximum());
            js.append(generateJSmaximumGap());
            js.append(generateJSminimum());
            js.append(generateJSminimumGap());
            js.append(generateJSminorTicks());
            js.append(generateJSminorTicks1());
            js.append(generateJStype2());
            js.append(generateJSsoftMaximum());
            js.append(generateJSsoftMinimum());
            js.append(generateJSstackMode());
            js.append(generateJSstackMode1());
            js.append(generateJSstickToZero());
            js.append(generateJSticks());
            js.append(generateJSticks1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append("}");
        }
            js.append(generateJSgetMinorTicks());
            js.append(generateJSgetTicks());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}