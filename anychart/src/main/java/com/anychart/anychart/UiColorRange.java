package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Color range.
 */
public class UiColorRange extends CoreAxesLinear {

    public UiColorRange() {
        js.setLength(0);
        js.append("var uiColorRange").append(++variableIndex).append(" = anychart.core.ui.colorRange();");
        jsBase = "uiColorRange" + variableIndex;
    }

    protected UiColorRange(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected UiColorRange(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private EnumsAlign align;
    private String align1;

    /**
     * Setter for color range align settings.
     */
    public UiColorRange setAlign(EnumsAlign align) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align = align;
        } else {
            this.align = align;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".align(%s)", ((align != null) ? align.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".align(%s);", ((align != null) ? align.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for color range align settings.
     */
    public UiColorRange setAlign(String align1) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align1 = align1;
        } else {
            this.align1 = align1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".align(%s)", wrapQuotes(align1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".align(%s);", wrapQuotes(align1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number colorLineSize;

    /**
     * Setter for the color line size.
     */
    public UiColorRange setColorLineSize(Number colorLineSize) {
        if (jsBase == null) {
            this.colorLineSize = colorLineSize;
        } else {
            this.colorLineSize = colorLineSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".colorLineSize(%s)", colorLineSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorLineSize(%s);", colorLineSize));
                js.setLength(0);
            }
        }
        return this;
    }

    private String length;
    private Number length1;

    /**
     * Setter for the current color range line length.
     */
    public UiColorRange setLength(String length) {
        if (jsBase == null) {
            this.length = null;
            this.length1 = null;
            
            this.length = length;
        } else {
            this.length = length;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".length(%s)", wrapQuotes(length)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".length(%s);", wrapQuotes(length)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the current color range line length.
     */
    public UiColorRange setLength(Number length1) {
        if (jsBase == null) {
            this.length = null;
            this.length1 = null;
            
            this.length1 = length1;
        } else {
            this.length1 = length1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".length(%s)", length1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".length(%s);", length1));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiMarkersfactoryMarker getMarker;

    /**
     * Getter for the color range marker.
     */
    public UiMarkersfactoryMarker getMarker() {
        if (getMarker == null)
            getMarker = new UiMarkersfactoryMarker(jsBase + ".marker()");

        return getMarker;
    }

    private List<UiColorRange> getMarker1 = new ArrayList<>();

    /**
     * Getter for the color range marker.
     */
    public UiColorRange getMarker(UiMarkersfactoryMarker marker) {
        UiColorRange item = new UiColorRange(jsBase + ".marker(" + ((marker != null) ? marker.generateJs() : "null") + ")");
        getMarker1.add(item);
        return item;
    }

    private List<UiColorRange> getMarker2 = new ArrayList<>();

    /**
     * Getter for the color range marker.
     */
    public UiColorRange getMarker(String marker) {
        UiColorRange item = new UiColorRange(jsBase + ".marker(" + wrapQuotes(marker) + ")");
        getMarker2.add(item);
        return item;
    }

    private TablePadding getPadding;

    /**
     * Getter for a padding settings object.
     */
    public TablePadding getPadding() {
        if (getPadding == null)
            getPadding = new TablePadding(jsBase + ".padding()");

        return getPadding;
    }

    private Number[] padding;
    private String[] padding1;
    private String padding2;

    /**
     * Setter for paddings in pixels using a single value.<br/>
     */
    public UiColorRange setPadding(Number[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for paddings in pixels using a single value.<br/>
     */
    public UiColorRange setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", arrayToStringWrapQuotes(padding1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for paddings in pixels using a single value.<br/>
     */
    public UiColorRange setPadding(String padding2) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding2 = padding2;
        } else {
            this.padding2 = padding2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", wrapQuotes(padding2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", wrapQuotes(padding2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value;
    private Number value1;
    private String value2;
    private Number value3;
    private String value4;
    private Number value5;
    private String value6;
    private Number value7;

    /**
     * Setter for paddings in pixels using several numbers.
     */
    public UiColorRange setPadding(String value, String value2, String value4, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value4 = value4;
            this.value6 = value6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for paddings in pixels using several numbers.
     */
    public UiColorRange setPadding(Number value1, Number value3, Number value5, Number value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value5 = value5;
            this.value7 = value7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s, %s, %s, %s)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetMarker() {
        if (getMarker != null) {
            return getMarker.generateJs();
        }
        return "";
    }

    private String generateJSgetMarker1() {
        if (!getMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiColorRange item : getMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetMarker2() {
        if (!getMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiColorRange item : getMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetMarker());
        jsGetters.append(generateJSgetMarker1());
        jsGetters.append(generateJSgetMarker2());
        jsGetters.append(generateJSgetPadding());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}