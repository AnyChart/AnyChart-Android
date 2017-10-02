package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class QuarterSettings extends JsObject {

    private String jsBase;

    public QuarterSettings() {

    }

    protected QuarterSettings(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Quarter getLeftBottom;

    public Quarter getLeftBottom() {
        if (getLeftBottom == null)
            getLeftBottom = new Quarter(jsBase + ".leftBottom()");

        return getLeftBottom;
    }

    private String leftBottom;

    public void setLeftbottom(String leftBottom) {
        if (jsBase == null) {
            this.leftBottom = leftBottom;
        } else {
            this.leftBottom = leftBottom;

            js.append(String.format(Locale.US, jsBase + ".leftBottom(%s);", leftBottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".leftBottom(%s);", leftBottom));
                js.setLength(0);
            }
        }
    }

    private Quarter getLeftTop;

    public Quarter getLeftTop() {
        if (getLeftTop == null)
            getLeftTop = new Quarter(jsBase + ".leftTop()");

        return getLeftTop;
    }

    private String leftTop;

    public void setLefttop(String leftTop) {
        if (jsBase == null) {
            this.leftTop = leftTop;
        } else {
            this.leftTop = leftTop;

            js.append(String.format(Locale.US, jsBase + ".leftTop(%s);", leftTop));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".leftTop(%s);", leftTop));
                js.setLength(0);
            }
        }
    }

    private Quarter getRightBottom;

    public Quarter getRightBottom() {
        if (getRightBottom == null)
            getRightBottom = new Quarter(jsBase + ".rightBottom()");

        return getRightBottom;
    }

    private String rightBottom;

    public void setRightbottom(String rightBottom) {
        if (jsBase == null) {
            this.rightBottom = rightBottom;
        } else {
            this.rightBottom = rightBottom;

            js.append(String.format(Locale.US, jsBase + ".rightBottom(%s);", rightBottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rightBottom(%s);", rightBottom));
                js.setLength(0);
            }
        }
    }

    private Quarter getRightTop;

    public Quarter getRightTop() {
        if (getRightTop == null)
            getRightTop = new Quarter(jsBase + ".rightTop()");

        return getRightTop;
    }

    private String rightTop;

    public void setRighttop(String rightTop) {
        if (jsBase == null) {
            this.rightTop = rightTop;
        } else {
            this.rightTop = rightTop;

            js.append(String.format(Locale.US, jsBase + ".rightTop(%s);", rightTop));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rightTop(%s);", rightTop));
                js.setLength(0);
            }
        }
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


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSleftBottom());
            js.append(generateJSleftTop());
            js.append(generateJSrightBottom());
            js.append(generateJSrightTop());
            js.append("}");
        }
            js.append(generateJSgetLeftBottom());
            js.append(generateJSgetLeftTop());
            js.append(generateJSgetRightBottom());
            js.append(generateJSgetRightTop());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}