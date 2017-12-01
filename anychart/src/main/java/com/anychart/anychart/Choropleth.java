package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Choropleth series. Read more about choropleth <a href='https://en.wikipedia.org/wiki/Choropleth_map'>here</a>.
 */
public class Choropleth extends MapSeriesBaseWithMarkers {

    public Choropleth() {
        js.setLength(0);
        js.append("var choropleth").append(++variableIndex).append(" = anychart.core.map.series.choropleth();");
        jsBase = "choropleth" + variableIndex;
    }

    protected Choropleth(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Choropleth(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private OrdinalColor getColorScale;

    /**
     * Getter for the color scale.
     */
    public OrdinalColor getColorScale() {
        if (getColorScale == null)
            getColorScale = new OrdinalColor(jsBase + ".colorScale()");

        return getColorScale;
    }

    private LinearColor colorScale;
    private OrdinalColor colorScale1;
    private List<MapSeriesBase> setColorScale = new ArrayList<>();

    /**
     * Setter for the color scale.
     */
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
            js.append(colorScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".colorScale(%s);",  ((colorScale != null) ? colorScale.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorScale(%s);", ((colorScale != null) ? colorScale.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        MapSeriesBase item = new MapSeriesBase("setColorScale" + variableIndex);
        setColorScale.add(item);
        return item;
    }
    private String generateJSsetColorScale() {
        if (!setColorScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBase item : setColorScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBase> setColorScale1 = new ArrayList<>();

    /**
     * Setter for the color scale.
     */
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
            js.append(colorScale1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".colorScale(%s);",  ((colorScale1 != null) ? colorScale1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colorScale(%s);", ((colorScale1 != null) ? colorScale1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        MapSeriesBase item = new MapSeriesBase("setColorScale1" + variableIndex);
        setColorScale1.add(item);
        return item;
    }
    private String generateJSsetColorScale1() {
        if (!setColorScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBase item : setColorScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetColorScale() {
        if (getColorScale != null) {
            return getColorScale.generateJs();
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

        js.append(generateJsGetters());

        js.append(generateJSsetColorScale());
        js.append(generateJSsetColorScale1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}