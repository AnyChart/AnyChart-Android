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



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetMarker());
        jsGetters.append(generateJSgetMarker1());
        jsGetters.append(generateJSgetMarker2());

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