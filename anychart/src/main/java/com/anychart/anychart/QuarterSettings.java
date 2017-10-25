package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".leftBottom(%s)", wrapQuotes(leftBottom)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".leftBottom(%s)", wrapQuotes(leftBottom)));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".leftTop(%s)", wrapQuotes(leftTop)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".leftTop(%s)", wrapQuotes(leftTop)));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".rightBottom(%s)", wrapQuotes(rightBottom)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rightBottom(%s)", wrapQuotes(rightBottom)));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".rightTop(%s)", wrapQuotes(rightTop)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rightTop(%s)", wrapQuotes(rightTop)));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSQuarter getLeftBottom() {
//        if (Quarter getLeftBottom != null) {
//            return Quarter getLeftBottom.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSQuarter getLeftTop() {
//        if (Quarter getLeftTop != null) {
//            return Quarter getLeftTop.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSQuarter getRightBottom() {
//        if (Quarter getRightBottom != null) {
//            return Quarter getRightBottom.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSQuarter getRightTop() {
//        if (Quarter getRightTop != null) {
//            return Quarter getRightTop.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetLeftBottom() {
        if (getLeftBottom != null) {
            return getLeftBottom.generateJs();
            //return String.format(Locale.US, "getLeftBottom: %s,", ((getLeftBottom != null) ? getLeftBottom.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetLeftTop() {
        if (getLeftTop != null) {
            return getLeftTop.generateJs();
            //return String.format(Locale.US, "getLeftTop: %s,", ((getLeftTop != null) ? getLeftTop.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetRightBottom() {
        if (getRightBottom != null) {
            return getRightBottom.generateJs();
            //return String.format(Locale.US, "getRightBottom: %s,", ((getRightBottom != null) ? getRightBottom.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetRightTop() {
        if (getRightTop != null) {
            return getRightTop.generateJs();
            //return String.format(Locale.US, "getRightTop: %s,", ((getRightTop != null) ? getRightTop.generateJs() : "null"));
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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSleftBottom());
////        
//            js.append(generateJSleftTop());
////        
//            js.append(generateJSrightBottom());
////        
//            js.append(generateJSrightTop());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}