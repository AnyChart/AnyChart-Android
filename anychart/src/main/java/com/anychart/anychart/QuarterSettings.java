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

    
    private Quarter getleftBottom;

    public Quarter getLeftbottom() {
        if (getleftBottom == null)
            getleftBottom = new Quarter(jsBase + ".leftBottom()");

        return getleftBottom;
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

    private Quarter getleftTop;

    public Quarter getLefttop() {
        if (getleftTop == null)
            getleftTop = new Quarter(jsBase + ".leftTop()");

        return getleftTop;
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

    private Quarter getrightBottom;

    public Quarter getRightbottom() {
        if (getrightBottom == null)
            getrightBottom = new Quarter(jsBase + ".rightBottom()");

        return getrightBottom;
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

    private Quarter getrightTop;

    public Quarter getRighttop() {
        if (getrightTop == null)
            getrightTop = new Quarter(jsBase + ".rightTop()");

        return getrightTop;
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

    private String generateJSgetleftBottom() {
        if (getleftBottom != null) {
            return getleftBottom.generateJs();
        }
        return "";
    }

    private String generateJSgetleftTop() {
        if (getleftTop != null) {
            return getleftTop.generateJs();
        }
        return "";
    }

    private String generateJSgetrightBottom() {
        if (getrightBottom != null) {
            return getrightBottom.generateJs();
        }
        return "";
    }

    private String generateJSgetrightTop() {
        if (getrightTop != null) {
            return getrightTop.generateJs();
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
            js.append(generateJSgetleftBottom());
            js.append(generateJSgetleftTop());
            js.append(generateJSgetrightBottom());
            js.append(generateJSgetrightTop());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}