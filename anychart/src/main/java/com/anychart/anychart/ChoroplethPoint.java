package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class ChoroplethPoint extends SeriesPoint {

    public ChoroplethPoint() {

    }

    protected ChoroplethPoint(String jsBase) {
        this.jsBase = jsBase;
    }

    protected ChoroplethPoint(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String crs;

    public ChoroplethPoint crs(String crs) {
        if (jsBase == null) {
            this.crs = crs;
        } else {
            this.crs = crs;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".crs(%s)", crs));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".crs(%s)", crs));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnychartMathRect getGetFeatureBounds;

    public AnychartMathRect getGetFeatureBounds() {
        if (getGetFeatureBounds == null)
            getGetFeatureBounds = new AnychartMathRect(jsBase + ".getFeatureBounds()");

        return getGetFeatureBounds;
    }

    private Double middleX;

    public ChoroplethPoint setMiddleX(Double middleX) {
        if (jsBase == null) {
            this.middleX = middleX;
        } else {
            this.middleX = middleX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".middleX(%f)", middleX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleX(%f)", middleX));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double middleY;

    public ChoroplethPoint setMiddleY(Double middleY) {
        if (jsBase == null) {
            this.middleY = middleY;
        } else {
            this.middleY = middleY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".middleY(%f)", middleY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleY(%f)", middleY));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double scale;

    public ChoroplethPoint scaleFactor(Double scale) {
        if (jsBase == null) {
            this.scale = scale;
        } else {
            this.scale = scale;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".scaleFactor(%f)", scale));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scaleFactor(%f)", scale));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double dx;
    private Double dy;

    public ChoroplethPoint translate(Double dx, Double dy) {
        if (jsBase == null) {
            this.dx = dx;
            this.dy = dy;
        } else {
            this.dx = dx;
            this.dy = dy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".translate(%f, %f)", dx, dy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".translate(%f, %f)", dx, dy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double dx1;
    private Double dy1;

    public ChoroplethPoint setTranslation(Double dx1, Double dy1) {
        if (jsBase == null) {
            this.dx = null;
            this.dx1 = null;
            
            this.dx1 = dx1;
            this.dy = null;
            this.dy1 = null;
            
            this.dy1 = dy1;
        } else {
            this.dx1 = dx1;
            this.dy1 = dy1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".translation(%f, %f)", dx1, dy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".translation(%f, %f)", dx1, dy1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetGetFeatureBounds() {
        if (getGetFeatureBounds != null) {
            return getGetFeatureBounds.generateJs();
        }
        return "";
    }

    private String generateJScrs() {
        if (crs != null) {
            return String.format(Locale.US, "crs: %s,", crs);
        }
        return "";
    }

    private String generateJSmiddleX() {
        if (middleX != null) {
            return String.format(Locale.US, "middleX: %f,", middleX);
        }
        return "";
    }

    private String generateJSmiddleY() {
        if (middleY != null) {
            return String.format(Locale.US, "middleY: %f,", middleY);
        }
        return "";
    }

    private String generateJSscale() {
        if (scale != null) {
            return String.format(Locale.US, "scale: %f,", scale);
        }
        return "";
    }

    private String generateJSdx() {
        if (dx != null) {
            return String.format(Locale.US, "dx: %f,", dx);
        }
        return "";
    }

    private String generateJSdy() {
        if (dy != null) {
            return String.format(Locale.US, "dy: %f,", dy);
        }
        return "";
    }

    private String generateJSdx1() {
        if (dx1 != null) {
            return String.format(Locale.US, "dx: %f,", dx1);
        }
        return "";
    }

    private String generateJSdy1() {
        if (dy1 != null) {
            return String.format(Locale.US, "dy: %f,", dy1);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetFeatureBounds());

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
            js.append(generateJScrs());
            js.append(generateJSmiddleX());
            js.append(generateJSmiddleY());
            js.append(generateJSscale());
            js.append(generateJSdx());
            js.append(generateJSdy());
            js.append(generateJSdx1());
            js.append(generateJSdy1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}