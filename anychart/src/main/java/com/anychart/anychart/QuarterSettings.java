package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Quarter settings class.
 */
public class QuarterSettings extends CoreBase {

    public QuarterSettings() {
        js.setLength(0);
        js.append("var quarterSettings").append(++variableIndex).append(" = anychart.core.utils.quarterSettings();");
        jsBase = "quarterSettings" + variableIndex;
    }

    protected QuarterSettings(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected QuarterSettings(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Quarter getLeftBottom;

    /**
     * Getter for left-bottom quarter.
     */
    public Quarter getLeftBottom() {
        if (getLeftBottom == null)
            getLeftBottom = new Quarter(jsBase + ".leftBottom()");

        return getLeftBottom;
    }

    private String leftBottom;
    private List<QuarterSettings> setLeftBottom = new ArrayList<>();

    /**
     * Setter for left-bottom quarter.
     */
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
    private String generateJSsetLeftBottom() {
        if (!setLeftBottom.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (QuarterSettings item : setLeftBottom) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Quarter getLeftTop;

    /**
     * Getter for left-top quarter.
     */
    public Quarter getLeftTop() {
        if (getLeftTop == null)
            getLeftTop = new Quarter(jsBase + ".leftTop()");

        return getLeftTop;
    }

    private String leftTop;
    private List<QuarterSettings> setLeftTop = new ArrayList<>();

    /**
     * Setter for left-top quarter.
     */
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
    private String generateJSsetLeftTop() {
        if (!setLeftTop.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (QuarterSettings item : setLeftTop) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Quarter getRightBottom;

    /**
     * Getter for right-bottom quarter.
     */
    public Quarter getRightBottom() {
        if (getRightBottom == null)
            getRightBottom = new Quarter(jsBase + ".rightBottom()");

        return getRightBottom;
    }

    private String rightBottom;
    private List<QuarterSettings> setRightBottom = new ArrayList<>();

    /**
     * Setter for right-bottom quarter.
     */
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
    private String generateJSsetRightBottom() {
        if (!setRightBottom.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (QuarterSettings item : setRightBottom) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Quarter getRightTop;

    /**
     * Getter for right-top quarter.
     */
    public Quarter getRightTop() {
        if (getRightTop == null)
            getRightTop = new Quarter(jsBase + ".rightTop()");

        return getRightTop;
    }

    private String rightTop;
    private List<QuarterSettings> setRightTop = new ArrayList<>();

    /**
     * Setter for right-top quarter.
     */
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
    private String generateJSsetRightTop() {
        if (!setRightTop.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (QuarterSettings item : setRightTop) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJsGetters());

        js.append(generateJSsetLeftBottom());
        js.append(generateJSsetLeftTop());
        js.append(generateJSsetRightBottom());
        js.append(generateJSsetRightTop());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}