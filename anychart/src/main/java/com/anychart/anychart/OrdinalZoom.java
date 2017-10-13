package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class OrdinalZoom extends JsObject {

    public OrdinalZoom() {

    }

    protected OrdinalZoom(String jsBase) {
        this.jsBase = jsBase;
    }

    protected OrdinalZoom(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Boolean continuous;

    public OrdinalZoom continuous(Boolean continuous) {
        if (jsBase == null) {
            this.continuous = continuous;
        } else {
            this.continuous = continuous;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".continuous(%b)", continuous));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".continuous(%b)", continuous));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double startRatio;
    private Double endRatio;

    public OrdinalZoom setSetTo(Double startRatio, Double endRatio) {
        if (jsBase == null) {
            this.startRatio = startRatio;
            this.endRatio = endRatio;
        } else {
            this.startRatio = startRatio;
            this.endRatio = endRatio;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setTo(%f, %f)", startRatio, endRatio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setTo(%f, %f)", startRatio, endRatio));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double pointsCount;
    private Boolean fromEnd;
    private ScalesBase scale;

    public OrdinalZoom setToPointsCount(Double pointsCount, Boolean fromEnd, ScalesBase scale) {
        if (jsBase == null) {
            this.pointsCount = pointsCount;
            this.fromEnd = fromEnd;
            this.scale = scale;
        } else {
            this.pointsCount = pointsCount;
            this.fromEnd = fromEnd;
            this.scale = scale;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setToPointsCount(%f, %b, %s)", pointsCount, fromEnd, (scale != null) ? scale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setToPointsCount(%f, %b, %s)", pointsCount, fromEnd, (scale != null) ? scale.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScalesBase scale1;

    public OrdinalZoom setToValues(ScalesBase scale1) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            
            this.scale1 = scale1;
        } else {
            this.scale1 = scale1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setToValues(%s)", (scale1 != null) ? scale1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setToValues(%s)", (scale1 != null) ? scale1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJScontinuous() {
        if (continuous != null) {
            return String.format(Locale.US, "continuous: %b,", continuous);
        }
        return "";
    }

    private String generateJSstartRatio() {
        if (startRatio != null) {
            return String.format(Locale.US, "startRatio: %f,", startRatio);
        }
        return "";
    }

    private String generateJSendRatio() {
        if (endRatio != null) {
            return String.format(Locale.US, "endRatio: %f,", endRatio);
        }
        return "";
    }

    private String generateJSpointsCount() {
        if (pointsCount != null) {
            return String.format(Locale.US, "pointsCount: %f,", pointsCount);
        }
        return "";
    }

    private String generateJSfromEnd() {
        if (fromEnd != null) {
            return String.format(Locale.US, "fromEnd: %b,", fromEnd);
        }
        return "";
    }

    private String generateJSscale() {
        if (scale != null) {
            return String.format(Locale.US, "scale: %s,", (scale != null) ? scale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSscale1() {
        if (scale1 != null) {
            return String.format(Locale.US, "scale: %s,", (scale1 != null) ? scale1.generateJs() : "null");
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
            js.append(generateJScontinuous());
            js.append(generateJSstartRatio());
            js.append(generateJSendRatio());
            js.append(generateJSpointsCount());
            js.append(generateJSfromEnd());
            js.append(generateJSscale());
            js.append(generateJSscale1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}