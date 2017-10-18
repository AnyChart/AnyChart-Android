package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Choropleth extends MapSeriesBaseWithMarkers {

    public Choropleth() {

    }

    protected Choropleth(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Choropleth(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private OrdinalColor getColorScale;

    public OrdinalColor getColorScale() {
        if (getColorScale == null)
            getColorScale = new OrdinalColor(jsBase + ".colorScale()");

        return getColorScale;
    }

    private LinearColor colorScale;
    private OrdinalColor colorScale1;

    public MapSeriesBase setColorScale(LinearColor colorScale) {
        if (jsBase == null) {
            this.colorScale = null;
            this.colorScale1 = null;
            
            this.colorScale = colorScale;
        } else {
            this.colorScale = colorScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".colorScale(%s);", (colorScale != null) ? colorScale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorScale(%s)", (colorScale != null) ? colorScale.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return new MapSeriesBase(jsBase);
    }


    public MapSeriesBase setColorScale(OrdinalColor colorScale1) {
        if (jsBase == null) {
            this.colorScale = null;
            this.colorScale1 = null;
            
            this.colorScale1 = colorScale1;
        } else {
            this.colorScale1 = colorScale1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".colorScale(%s);", (colorScale1 != null) ? colorScale1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorScale(%s)", (colorScale1 != null) ? colorScale1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return new MapSeriesBase(jsBase);
    }

    private String generateJSgetColorScale() {
        if (getColorScale != null) {
            return getColorScale.generateJs();
        }
        return "";
    }

    private String generateJScolorScale() {
        if (colorScale != null) {
            return String.format(Locale.US, "colorScale: %s,", (colorScale != null) ? colorScale.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolorScale1() {
        if (colorScale1 != null) {
            return String.format(Locale.US, "colorScale: %s,", (colorScale1 != null) ? colorScale1.generateJs() : "null");
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetColorScale());

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
            js.append(generateJScolorScale());
            js.append(generateJScolorScale1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}