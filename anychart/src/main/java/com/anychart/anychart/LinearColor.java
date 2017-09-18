package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class LinearColor extends JsObject {

    
    private String colorToValue;

    public void setColortovalue(String colorToValue) {
        this.colorToValue = colorToValue;
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
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        this.var_args3 = null;
        this.var_args4 = null;
        this.var_args5 = null;
        this.var_args6 = null;
        this.var_args7 = null;
        
        this.var_args = var_args;
    }


    public void setColors(SolidFill var_args1) {
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        this.var_args3 = null;
        this.var_args4 = null;
        this.var_args5 = null;
        this.var_args6 = null;
        this.var_args7 = null;
        
        this.var_args1 = var_args1;
    }


    public void setColors(LinearGradientFill var_args2) {
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        this.var_args3 = null;
        this.var_args4 = null;
        this.var_args5 = null;
        this.var_args6 = null;
        this.var_args7 = null;
        
        this.var_args2 = var_args2;
    }


    public void setColors(RadialGradientFill var_args3) {
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        this.var_args3 = null;
        this.var_args4 = null;
        this.var_args5 = null;
        this.var_args6 = null;
        this.var_args7 = null;
        
        this.var_args3 = var_args3;
    }


    public void setColors(String[] var_args4) {
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        this.var_args3 = null;
        this.var_args4 = null;
        this.var_args5 = null;
        this.var_args6 = null;
        this.var_args7 = null;
        
        this.var_args4 = var_args4;
    }


    public void setColors(SolidFill[] var_args5) {
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        this.var_args3 = null;
        this.var_args4 = null;
        this.var_args5 = null;
        this.var_args6 = null;
        this.var_args7 = null;
        
        this.var_args5 = var_args5;
    }


    public void setColors(LinearGradientFill[] var_args6) {
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        this.var_args3 = null;
        this.var_args4 = null;
        this.var_args5 = null;
        this.var_args6 = null;
        this.var_args7 = null;
        
        this.var_args6 = var_args6;
    }


    public void setColors(RadialGradientFill[] var_args7) {
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        this.var_args3 = null;
        this.var_args4 = null;
        this.var_args5 = null;
        this.var_args6 = null;
        this.var_args7 = null;
        
        this.var_args7 = var_args7;
    }

    private Boolean silently;

    public void setFinishautocalc(Boolean silently) {
        this.silently = silently;
    }

    private Double ratio;

    public void setInversetransform(Double ratio) {
        this.ratio = ratio;
    }

    private Boolean inverted;

    public void setInverted(Boolean inverted) {
        this.inverted = inverted;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private Double maximum;

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    private Double minimum;

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    private String[] minorTicks;

    public void setMinorticks(String[] minorTicks) {
        this.minorTicks = minorTicks;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private String[] ticks;

    public void setTicks(String[] ticks) {
        this.ticks = ticks;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private Double valueToColor;

    public void setValuetocolor(Double valueToColor) {
        this.valueToColor = valueToColor;
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
            return String.format(Locale.US, "minorTicks: %s,", Arrays.toString(minorTicks));
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
            return String.format(Locale.US, "ticks: %s,", Arrays.toString(ticks));
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

    private String generateJSvalueToColor() {
        if (valueToColor != null) {
            return String.format(Locale.US, "valueToColor: %f,", valueToColor);
        }
        return "";
    }


    @Override
    protected String generateJs() {
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
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSmaximum());
        js.append(generateJSminimum());
        js.append(generateJSminorTicks());
        js.append(generateJStype2());
        js.append(generateJSticks());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSvalueToColor());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}