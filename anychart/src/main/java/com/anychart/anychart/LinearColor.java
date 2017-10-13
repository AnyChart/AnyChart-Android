package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class LinearColor extends ScatterBase {

    public LinearColor() {

    }

    protected LinearColor(String jsBase) {
        this.jsBase = jsBase;
    }

    protected LinearColor(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String colorToValue;

    public void colorToValue(String colorToValue) {
        if (jsBase == null) {
            this.colorToValue = colorToValue;
        } else {
            this.colorToValue = colorToValue;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".colorToValue(%s);", colorToValue));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorToValue(%s)", colorToValue));
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colors(%s)", var_args));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colors(%s)", var_args));
                js.setLength(0);
            }
        }
        return this;
    }


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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colors(%s)", (var_args1 != null) ? var_args1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colors(%s)", (var_args1 != null) ? var_args1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colors(%s)", (var_args2 != null) ? var_args2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colors(%s)", (var_args2 != null) ? var_args2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colors(%s)", (var_args3 != null) ? var_args3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colors(%s)", (var_args3 != null) ? var_args3.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colors(%s)", Arrays.toString(var_args4)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colors(%s)", Arrays.toString(var_args4)));
                js.setLength(0);
            }
        }
        return this;
    }


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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colors(%s)", arrayToString(var_args5)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colors(%s)", arrayToString(var_args5)));
                js.setLength(0);
            }
        }
        return this;
    }


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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colors(%s)", arrayToString(var_args6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colors(%s)", arrayToString(var_args6)));
                js.setLength(0);
            }
        }
        return this;
    }


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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".colors(%s)", arrayToString(var_args7)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colors(%s)", arrayToString(var_args7)));
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

    public LinearColor setMinorTicks(String minorTicks) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks = minorTicks;
        } else {
            this.minorTicks = minorTicks;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public LinearColor setMinorTicks(String[] minorTicks1) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks1 = minorTicks1;
        } else {
            this.minorTicks1 = minorTicks1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private ScatterTicks getTicks;

    public ScatterTicks getTicks() {
        if (getTicks == null)
            getTicks = new ScatterTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private String ticks;
    private String[] ticks1;

    public LinearColor setTicks(String ticks) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks = ticks;
        } else {
            this.ticks = ticks;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public LinearColor setTicks(String[] ticks1) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks1 = ticks1;
        } else {
            this.ticks1 = ticks1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double valueToColor;

    public void valueToColor(Double valueToColor) {
        if (jsBase == null) {
            this.valueToColor = valueToColor;
        } else {
            this.valueToColor = valueToColor;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".valueToColor(%f);", valueToColor));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".valueToColor(%f)", valueToColor));
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

    private String generateJSvalueToColor() {
        if (valueToColor != null) {
            return String.format(Locale.US, "valueToColor: %f,", valueToColor);
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
            js.append(generateJScolorToValue());
            js.append(generateJSvar_args());
            js.append(generateJSvar_args1());
            js.append(generateJSvar_args2());
            js.append(generateJSvar_args3());
            js.append(generateJSvar_args4());
            js.append(generateJSvar_args5());
            js.append(generateJSvar_args6());
            js.append(generateJSvar_args7());
            js.append(generateJSminorTicks());
            js.append(generateJSminorTicks1());
            js.append(generateJSticks());
            js.append(generateJSticks1());
            js.append(generateJSvalueToColor());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}