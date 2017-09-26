package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class LinearColor extends JsObject {

    private String jsBase;

    public LinearColor() {

    }

    protected LinearColor(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String colorToValue;

    public void setColortovalue(String colorToValue) {
        if (jsBase == null) {
            this.colorToValue = colorToValue;
        } else {
            this.colorToValue = colorToValue;

            js.append(String.format(Locale.US, jsBase + ".colorToValue(%s);", colorToValue));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorToValue(%s);", colorToValue));
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

    public void setColors(String var_args) {
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

            js.append(String.format(Locale.US, jsBase + ".colors(%s);", var_args));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", var_args));
                js.setLength(0);
            }
        }
    }


    public void setColors(SolidFill var_args1) {
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

            js.append(String.format(Locale.US, jsBase + ".colors(%s);", (var_args1 != null) ? var_args1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", (var_args1 != null) ? var_args1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setColors(LinearGradientFill var_args2) {
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

            js.append(String.format(Locale.US, jsBase + ".colors(%s);", (var_args2 != null) ? var_args2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", (var_args2 != null) ? var_args2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setColors(RadialGradientFill var_args3) {
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

            js.append(String.format(Locale.US, jsBase + ".colors(%s);", (var_args3 != null) ? var_args3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", (var_args3 != null) ? var_args3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setColors(String[] var_args4) {
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

            js.append(String.format(Locale.US, jsBase + ".colors(%s);", Arrays.toString(var_args4)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", Arrays.toString(var_args4)));
                js.setLength(0);
            }
        }
    }


    public void setColors(SolidFill[] var_args5) {
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

            js.append(String.format(Locale.US, jsBase + ".colors(%s);", arrayToString(var_args5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", arrayToString(var_args5)));
                js.setLength(0);
            }
        }
    }


    public void setColors(LinearGradientFill[] var_args6) {
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

            js.append(String.format(Locale.US, jsBase + ".colors(%s);", arrayToString(var_args6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", arrayToString(var_args6)));
                js.setLength(0);
            }
        }
    }


    public void setColors(RadialGradientFill[] var_args7) {
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

            js.append(String.format(Locale.US, jsBase + ".colors(%s);", arrayToString(var_args7)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colors(%s);", arrayToString(var_args7)));
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

    private Double valueToColor;

    public void setValuetocolor(Double valueToColor) {
        if (jsBase == null) {
            this.valueToColor = valueToColor;
        } else {
            this.valueToColor = valueToColor;

            js.append(String.format(Locale.US, jsBase + ".valueToColor(%f);", valueToColor));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueToColor(%f);", valueToColor));
                js.setLength(0);
            }
        }
    }

    private String generateJScolorToValue() {
        if (colorToValue != null) {
            return String.format(Locale.US, "colorToValue: %s,", colorToValue);
        }
        return "";
    }

    private String generateJSvar_args() {
        if (var_args != null) {
            return String.format(Locale.US, "var_args: %s,", var_args);
        }
        return "";
    }

    private String generateJSvar_args1() {
        if (var_args1 != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args1 != null) ? var_args1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvar_args2() {
        if (var_args2 != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args2 != null) ? var_args2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvar_args3() {
        if (var_args3 != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args3 != null) ? var_args3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvar_args4() {
        if (var_args4 != null) {
            return String.format(Locale.US, "var_args: %s,", Arrays.toString(var_args4));
        }
        return "";
    }

    private String generateJSvar_args5() {
        if (var_args5 != null) {
            return String.format(Locale.US, "var_args: %s,", arrayToString(var_args5));
        }
        return "";
    }

    private String generateJSvar_args6() {
        if (var_args6 != null) {
            return String.format(Locale.US, "var_args: %s,", arrayToString(var_args6));
        }
        return "";
    }

    private String generateJSvar_args7() {
        if (var_args7 != null) {
            return String.format(Locale.US, "var_args: %s,", arrayToString(var_args7));
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

    private String generateJSminimum() {
        if (minimum != null) {
            return String.format(Locale.US, "minimum: %f,", minimum);
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

    private String generateJSvalueToColor() {
        if (valueToColor != null) {
            return String.format(Locale.US, "valueToColor: %f,", valueToColor);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJScolorToValue());
            js.append(generateJSvar_args());
            js.append(generateJSvar_args1());
            js.append(generateJSvar_args2());
            js.append(generateJSvar_args3());
            js.append(generateJSvar_args4());
            js.append(generateJSvar_args5());
            js.append(generateJSvar_args6());
            js.append(generateJSvar_args7());
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
            js.append(generateJSminimum());
            js.append(generateJSminorTicks());
            js.append(generateJSminorTicks1());
            js.append(generateJStype2());
            js.append(generateJSticks());
            js.append(generateJSticks1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSvalueToColor());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}