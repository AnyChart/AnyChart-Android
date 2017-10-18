package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class WidthBased extends CartesianSeriesBaseWithMarkers {

    public WidthBased() {

    }

    protected WidthBased(String jsBase) {
        this.jsBase = jsBase;
    }

    protected WidthBased(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double maxPointWidth;
    private String maxPointWidth1;

    public WidthBased setMaxPointWidth(Double maxPointWidth) {
        if (jsBase == null) {
            this.maxPointWidth = null;
            this.maxPointWidth1 = null;
            
            this.maxPointWidth = maxPointWidth;
        } else {
            this.maxPointWidth = maxPointWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    public WidthBased setMaxPointWidth(String maxPointWidth1) {
        if (jsBase == null) {
            this.maxPointWidth = null;
            this.maxPointWidth1 = null;
            
            this.maxPointWidth1 = maxPointWidth1;
        } else {
            this.maxPointWidth1 = maxPointWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minPointLength;
    private String minPointLength1;

    public WidthBased setMinPointLength(Double minPointLength) {
        if (jsBase == null) {
            this.minPointLength = null;
            this.minPointLength1 = null;
            
            this.minPointLength = minPointLength;
        } else {
            this.minPointLength = minPointLength;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minPointLength(%f)", minPointLength));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%f)", minPointLength));
                js.setLength(0);
            }
        }
        return this;
    }


    public WidthBased setMinPointLength(String minPointLength1) {
        if (jsBase == null) {
            this.minPointLength = null;
            this.minPointLength1 = null;
            
            this.minPointLength1 = minPointLength1;
        } else {
            this.minPointLength1 = minPointLength1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minPointLength(%s)", minPointLength1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%s)", minPointLength1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double pointWidth;
    private String pointWidth1;

    public WidthBased setPointWidth(Double pointWidth) {
        if (jsBase == null) {
            this.pointWidth = null;
            this.pointWidth1 = null;
            
            this.pointWidth = pointWidth;
        } else {
            this.pointWidth = pointWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".pointWidth(%f)", pointWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%f)", pointWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    public WidthBased setPointWidth(String pointWidth1) {
        if (jsBase == null) {
            this.pointWidth = null;
            this.pointWidth1 = null;
            
            this.pointWidth1 = pointWidth1;
        } else {
            this.pointWidth1 = pointWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".pointWidth(%s)", pointWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", pointWidth1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSmaxPointWidth() {
        if (maxPointWidth != null) {
            return String.format(Locale.US, "maxPointWidth: %f,", maxPointWidth);
        }
        return "";
    }

    private String generateJSmaxPointWidth1() {
        if (maxPointWidth1 != null) {
            return String.format(Locale.US, "maxPointWidth: %s,", maxPointWidth1);
        }
        return "";
    }

    private String generateJSminPointLength() {
        if (minPointLength != null) {
            return String.format(Locale.US, "minPointLength: %f,", minPointLength);
        }
        return "";
    }

    private String generateJSminPointLength1() {
        if (minPointLength1 != null) {
            return String.format(Locale.US, "minPointLength: %s,", minPointLength1);
        }
        return "";
    }

    private String generateJSpointWidth() {
        if (pointWidth != null) {
            return String.format(Locale.US, "pointWidth: %f,", pointWidth);
        }
        return "";
    }

    private String generateJSpointWidth1() {
        if (pointWidth1 != null) {
            return String.format(Locale.US, "pointWidth: %s,", pointWidth1);
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
            js.append(generateJSmaxPointWidth());
            js.append(generateJSmaxPointWidth1());
            js.append(generateJSminPointLength());
            js.append(generateJSminPointLength1());
            js.append(generateJSpointWidth());
            js.append(generateJSpointWidth1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}