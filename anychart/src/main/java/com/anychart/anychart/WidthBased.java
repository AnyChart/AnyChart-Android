package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * A base for all width-based series like bars, columns, OHLC and candlesticks.
 */
public class WidthBased extends CartesianSeriesBaseWithMarkers {

    public WidthBased() {
        js.setLength(0);
        js.append("var widthBased").append(++variableIndex).append(" = anychart.core.cartesian.series.widthBased();");
        jsBase = "widthBased" + variableIndex;
    }

    protected WidthBased(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected WidthBased(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double maxPointWidth;
    private String maxPointWidth1;
    private List<WidthBased> setMaxPointWidth = new ArrayList<>();

    /**
     * Setter for the maximum point width.
     */
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
    private String generateJSsetMaxPointWidth() {
        if (!setMaxPointWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (WidthBased item : setMaxPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<WidthBased> setMaxPointWidth1 = new ArrayList<>();

    /**
     * Setter for the maximum point width.
     */
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
            
            js.append(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxPointWidth1() {
        if (!setMaxPointWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (WidthBased item : setMaxPointWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minPointLength;
    private String minPointLength1;
    private List<WidthBased> setMinPointLength = new ArrayList<>();

    /**
     * Setter for the minimum point length.
     */
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
    private String generateJSsetMinPointLength() {
        if (!setMinPointLength.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (WidthBased item : setMinPointLength) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<WidthBased> setMinPointLength1 = new ArrayList<>();

    /**
     * Setter for the minimum point length.
     */
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
            
            js.append(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinPointLength1() {
        if (!setMinPointLength1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (WidthBased item : setMinPointLength1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double pointWidth;
    private String pointWidth1;
    private List<WidthBased> setPointWidth = new ArrayList<>();

    /**
     * Setter for the point width settings.
     */
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
    private String generateJSsetPointWidth() {
        if (!setPointWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (WidthBased item : setPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<WidthBased> setPointWidth1 = new ArrayList<>();

    /**
     * Setter for the point width settings.
     */
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
            
            js.append(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPointWidth1() {
        if (!setPointWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (WidthBased item : setPointWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

        js.append(generateJsGetters());

        js.append(generateJSsetMaxPointWidth());
        js.append(generateJSsetMaxPointWidth1());
        js.append(generateJSsetMinPointLength());
        js.append(generateJSsetMinPointLength1());
        js.append(generateJSsetPointWidth());
        js.append(generateJSsetPointWidth1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}