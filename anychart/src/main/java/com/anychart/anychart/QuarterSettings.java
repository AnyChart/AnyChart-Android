package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class QuarterSettings extends CoreBase {

    public QuarterSettings() {

    }

    protected QuarterSettings(String jsBase) {
        this.jsBase = jsBase;
    }

    protected QuarterSettings(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Quarter getLeftBottom;

    public Quarter getLeftBottom() {
        if (getLeftBottom == null)
            getLeftBottom = new Quarter(jsBase + ".leftBottom()");

        return getLeftBottom;
    }

    private String leftBottom;

    public QuarterSettings setLeftBottom(String leftBottom) {
        if (jsBase == null) {
            this.leftBottom = leftBottom;
        } else {
            this.leftBottom = leftBottom;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".leftBottom(%s)", leftBottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".leftBottom(%s)", leftBottom));
                js.setLength(0);
            }
        }
        return this;
    }

    private Quarter getLeftTop;

    public Quarter getLeftTop() {
        if (getLeftTop == null)
            getLeftTop = new Quarter(jsBase + ".leftTop()");

        return getLeftTop;
    }

    private String leftTop;

    public QuarterSettings setLeftTop(String leftTop) {
        if (jsBase == null) {
            this.leftTop = leftTop;
        } else {
            this.leftTop = leftTop;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".leftTop(%s)", leftTop));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".leftTop(%s)", leftTop));
                js.setLength(0);
            }
        }
        return this;
    }

    private Quarter getRightBottom;

    public Quarter getRightBottom() {
        if (getRightBottom == null)
            getRightBottom = new Quarter(jsBase + ".rightBottom()");

        return getRightBottom;
    }

    private String rightBottom;

    public QuarterSettings setRightBottom(String rightBottom) {
        if (jsBase == null) {
            this.rightBottom = rightBottom;
        } else {
            this.rightBottom = rightBottom;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".rightBottom(%s)", rightBottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rightBottom(%s)", rightBottom));
                js.setLength(0);
            }
        }
        return this;
    }

    private Quarter getRightTop;

    public Quarter getRightTop() {
        if (getRightTop == null)
            getRightTop = new Quarter(jsBase + ".rightTop()");

        return getRightTop;
    }

    private String rightTop;

    public QuarterSettings setRightTop(String rightTop) {
        if (jsBase == null) {
            this.rightTop = rightTop;
        } else {
            this.rightTop = rightTop;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".rightTop(%s)", rightTop));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rightTop(%s)", rightTop));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetLeftBottom() {
        if (getLeftBottom != null) {
            return getLeftBottom.generateJs();
        }
        return "";
    }

    private String generateJSgetLeftTop() {
        if (getLeftTop != null) {
            return getLeftTop.generateJs();
        }
        return "";
    }

    private String generateJSgetRightBottom() {
        if (getRightBottom != null) {
            return getRightBottom.generateJs();
        }
        return "";
    }

    private String generateJSgetRightTop() {
        if (getRightTop != null) {
            return getRightTop.generateJs();
        }
        return "";
    }

    private String generateJSleftBottom() {
        if (leftBottom != null) {
            return String.format(Locale.US, "leftBottom: %s,", leftBottom);
        }
        return "";
    }

    private String generateJSleftTop() {
        if (leftTop != null) {
            return String.format(Locale.US, "leftTop: %s,", leftTop);
        }
        return "";
    }

    private String generateJSrightBottom() {
        if (rightBottom != null) {
            return String.format(Locale.US, "rightBottom: %s,", rightBottom);
        }
        return "";
    }

    private String generateJSrightTop() {
        if (rightTop != null) {
            return String.format(Locale.US, "rightTop: %s,", rightTop);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetLeftBottom());
        jsGetters.append(generateJSgetLeftTop());
        jsGetters.append(generateJSgetRightBottom());
        jsGetters.append(generateJSgetRightTop());

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
            js.append(generateJSleftBottom());
            js.append(generateJSleftTop());
            js.append(generateJSrightBottom());
            js.append(generateJSrightTop());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}