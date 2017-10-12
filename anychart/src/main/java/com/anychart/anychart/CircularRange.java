package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class CircularRange extends VisualBase {

    public CircularRange() {

    }

    protected CircularRange(String jsBase) {
        this.jsBase = jsBase;
    }

    protected CircularRange(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double index;

    public CircularRange setAxisIndex(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".axisIndex(%f)", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".axisIndex(%f)", index));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double cornersRounding;
    private String cornersRounding1;

    public CircularRange setCornersRounding(Double cornersRounding) {
        if (jsBase == null) {
            this.cornersRounding = null;
            this.cornersRounding1 = null;
            
            this.cornersRounding = cornersRounding;
        } else {
            this.cornersRounding = cornersRounding;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".cornersRounding(%f)", cornersRounding));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cornersRounding(%f)", cornersRounding));
                js.setLength(0);
            }
        }
        return this;
    }


    public CircularRange setCornersRounding(String cornersRounding1) {
        if (jsBase == null) {
            this.cornersRounding = null;
            this.cornersRounding1 = null;
            
            this.cornersRounding1 = cornersRounding1;
        } else {
            this.cornersRounding1 = cornersRounding1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".cornersRounding(%s)", cornersRounding1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cornersRounding(%s)", cornersRounding1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double endSize;
    private String endSize1;

    public CircularRange setEndSize(Double endSize) {
        if (jsBase == null) {
            this.endSize = null;
            this.endSize1 = null;
            
            this.endSize = endSize;
        } else {
            this.endSize = endSize;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".endSize(%f)", endSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endSize(%f)", endSize));
                js.setLength(0);
            }
        }
        return this;
    }


    public CircularRange setEndSize(String endSize1) {
        if (jsBase == null) {
            this.endSize = null;
            this.endSize1 = null;
            
            this.endSize1 = endSize1;
        } else {
            this.endSize1 = endSize1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".endSize(%s)", endSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endSize(%s)", endSize1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill fill;

    public CircularRange setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".fill(%s)", (fill != null) ? fill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", (fill != null) ? fill.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double from;

    public CircularRange setFrom(Double from) {
        if (jsBase == null) {
            this.from = from;
        } else {
            this.from = from;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".from(%f)", from));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".from(%f)", from));
                js.setLength(0);
            }
        }
        return this;
    }

    private GaugeSidePosition position;
    private String position1;

    public CircularRange setPosition(GaugeSidePosition position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".position(%s)", (position != null) ? position.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", (position != null) ? position.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public CircularRange setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".position(%s)", position1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", position1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double radius;
    private String radius1;

    public CircularRange setRadius(Double radius) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius = radius;
        } else {
            this.radius = radius;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".radius(%f)", radius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".radius(%f)", radius));
                js.setLength(0);
            }
        }
        return this;
    }


    public CircularRange setRadius(String radius1) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius1 = radius1;
        } else {
            this.radius1 = radius1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".radius(%s)", radius1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".radius(%s)", radius1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double startSize;
    private String startSize1;

    public CircularRange setStartSize(Double startSize) {
        if (jsBase == null) {
            this.startSize = null;
            this.startSize1 = null;
            
            this.startSize = startSize;
        } else {
            this.startSize = startSize;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".startSize(%f)", startSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startSize(%f)", startSize));
                js.setLength(0);
            }
        }
        return this;
    }


    public CircularRange setStartSize(String startSize1) {
        if (jsBase == null) {
            this.startSize = null;
            this.startSize1 = null;
            
            this.startSize1 = startSize1;
        } else {
            this.startSize1 = startSize1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".startSize(%s)", startSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startSize(%s)", startSize1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double to;

    public CircularRange setTo(Double to) {
        if (jsBase == null) {
            this.to = to;
        } else {
            this.to = to;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".to(%f)", to));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".to(%f)", to));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJScornersRounding() {
        if (cornersRounding != null) {
            return String.format(Locale.US, "cornersRounding: %f,", cornersRounding);
        }
        return "";
    }

    private String generateJScornersRounding1() {
        if (cornersRounding1 != null) {
            return String.format(Locale.US, "cornersRounding: %s,", cornersRounding1);
        }
        return "";
    }

    private String generateJSendSize() {
        if (endSize != null) {
            return String.format(Locale.US, "endSize: %f,", endSize);
        }
        return "";
    }

    private String generateJSendSize1() {
        if (endSize1 != null) {
            return String.format(Locale.US, "endSize: %s,", endSize1);
        }
        return "";
    }

    private String generateJSfill() {
        if (fill != null) {
            return String.format(Locale.US, "fill: %s,", (fill != null) ? fill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfrom() {
        if (from != null) {
            return String.format(Locale.US, "from: %f,", from);
        }
        return "";
    }

    private String generateJSposition() {
        if (position != null) {
            return String.format(Locale.US, "position: %s,", (position != null) ? position.generateJs() : "null");
        }
        return "";
    }

    private String generateJSposition1() {
        if (position1 != null) {
            return String.format(Locale.US, "position: %s,", position1);
        }
        return "";
    }

    private String generateJSradius() {
        if (radius != null) {
            return String.format(Locale.US, "radius: %f,", radius);
        }
        return "";
    }

    private String generateJSradius1() {
        if (radius1 != null) {
            return String.format(Locale.US, "radius: %s,", radius1);
        }
        return "";
    }

    private String generateJSstartSize() {
        if (startSize != null) {
            return String.format(Locale.US, "startSize: %f,", startSize);
        }
        return "";
    }

    private String generateJSstartSize1() {
        if (startSize1 != null) {
            return String.format(Locale.US, "startSize: %s,", startSize1);
        }
        return "";
    }

    private String generateJSto() {
        if (to != null) {
            return String.format(Locale.US, "to: %f,", to);
        }
        return "";
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSindex());
            js.append(generateJScornersRounding());
            js.append(generateJScornersRounding1());
            js.append(generateJSendSize());
            js.append(generateJSendSize1());
            js.append(generateJSfill());
            js.append(generateJSfrom());
            js.append(generateJSposition());
            js.append(generateJSposition1());
            js.append(generateJSradius());
            js.append(generateJSradius1());
            js.append(generateJSstartSize());
            js.append(generateJSstartSize1());
            js.append(generateJSto());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}