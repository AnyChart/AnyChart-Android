package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Base annotations class.
 */
public class AnnotationsTimeline extends VisualBaseWithBounds {

    public AnnotationsTimeline() {
        js.setLength(0);
        js.append("var annotationsTimeline").append(++variableIndex).append(" = anychart.core.annotations.base();");
        jsBase = "annotationsTimeline" + variableIndex;
    }

    protected AnnotationsTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected AnnotationsTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String color;
    private List<ScalesTimeline> setColor = new ArrayList<>();

    /**
     * Setter for the annotation color.
     */
    public ScalesTimeline setColor(String color) {
        if (jsBase == null) {
            this.color = color;
        } else {
            this.color = color;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setColor" + ++variableIndex + " = " + jsBase + ".color(%s);", wrapQuotes(color)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".color(%s);", wrapQuotes(color)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setColor" + variableIndex);
        setColor.add(item);
        return item;
    }
    private String generateJSsetColor() {
        if (!setColor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setColor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StateSettings getHovered;

    /**
     * Getter for hovered state settings.
     */
    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }

    private String hovered;
    private List<ScalesTimeline> setHovered = new ArrayList<>();

    /**
     * Setter for hovered state settings.
     */
    public ScalesTimeline setHovered(String hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHovered" + ++variableIndex + " = " + jsBase + ".hovered(%s);", wrapQuotes(hovered)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hovered(%s);", wrapQuotes(hovered)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setHovered" + variableIndex);
        setHovered.add(item);
        return item;
    }
    private String generateJSsetHovered() {
        if (!setHovered.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiMarkersFactory getMarkers;

    /**
     * Getter for data markers.
     */
    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }

    private String markers;
    private Boolean markers1;
    private String markers2;
    private List<ScalesTimeline> setMarkers = new ArrayList<>();

    /**
     * Setter for data markers.
     */
    public ScalesTimeline setMarkers(String markers) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers = markers;
        } else {
            this.markers = markers;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMarkers" + ++variableIndex + " = " + jsBase + ".markers(%s);", wrapQuotes(markers)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".markers(%s);", wrapQuotes(markers)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setMarkers" + variableIndex);
        setMarkers.add(item);
        return item;
    }
    private String generateJSsetMarkers() {
        if (!setMarkers.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setMarkers) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setMarkers1 = new ArrayList<>();

    /**
     * Setter for data markers.
     */
    public ScalesTimeline setMarkers(Boolean markers1) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers1 = markers1;
        } else {
            this.markers1 = markers1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMarkers1" + ++variableIndex + " = " + jsBase + ".markers(%b);", markers1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".markers(%b);", markers1));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setMarkers1" + variableIndex);
        setMarkers1.add(item);
        return item;
    }
    private String generateJSsetMarkers1() {
        if (!setMarkers1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setMarkers1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StateSettings getNormal;

    /**
     * Getter for normal state settings.
     */
    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }

    private String normal;
    private List<ScalesTimeline> setNormal = new ArrayList<>();

    /**
     * Setter for normal state settings.
     */
    public ScalesTimeline setNormal(String normal) {
        if (jsBase == null) {
            this.normal = normal;
        } else {
            this.normal = normal;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setNormal" + ++variableIndex + " = " + jsBase + ".normal(%s);", wrapQuotes(normal)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".normal(%s);", wrapQuotes(normal)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setNormal" + variableIndex);
        setNormal.add(item);
        return item;
    }
    private String generateJSsetNormal() {
        if (!setNormal.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setNormal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StateSettings getSelected;

    /**
     * Getter for selected state settings.
     */
    public StateSettings getSelected() {
        if (getSelected == null)
            getSelected = new StateSettings(jsBase + ".selected()");

        return getSelected;
    }

    private String selected;
    private List<ScalesTimeline> setSelected = new ArrayList<>();

    /**
     * Setter for selected state settings.
     */
    public ScalesTimeline setSelected(String selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSelected" + ++variableIndex + " = " + jsBase + ".selected(%s);", wrapQuotes(selected)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selected(%s);", wrapQuotes(selected)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setSelected" + variableIndex);
        setSelected.add(item);
        return item;
    }
    private String generateJSsetSelected() {
        if (!setSelected.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Ordinal getXScale;

    /**
     * Getter for the X-scale.
     */
    public Ordinal getXScale() {
        if (getXScale == null)
            getXScale = new Ordinal(jsBase + ".xScale()");

        return getXScale;
    }

    private ScalesTimeline xScale;
    private StockScatterDateTime xScale1;
    private String xScale2;
    private ScaleTypes xScale3;
    private String xScale4;
    private List<ScalesTimeline> setXScale = new ArrayList<>();

    /**
     * Setter for the X-scale.
     */
    public ScalesTimeline setXScale(ScalesTimeline xScale) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            this.xScale4 = null;
            
            this.xScale = xScale;
        } else {
            this.xScale = xScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(xScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".xScale(%s);",  ((xScale != null) ? xScale.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xScale(%s);", ((xScale != null) ? xScale.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setXScale" + variableIndex);
        setXScale.add(item);
        return item;
    }
    private String generateJSsetXScale() {
        if (!setXScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setXScale1 = new ArrayList<>();

    /**
     * Setter for the X-scale.
     */
    public ScalesTimeline setXScale(StockScatterDateTime xScale1) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            this.xScale4 = null;
            
            this.xScale1 = xScale1;
        } else {
            this.xScale1 = xScale1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(xScale1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".xScale(%s);",  ((xScale1 != null) ? xScale1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xScale(%s);", ((xScale1 != null) ? xScale1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setXScale1" + variableIndex);
        setXScale1.add(item);
        return item;
    }
    private String generateJSsetXScale1() {
        if (!setXScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setXScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setXScale2 = new ArrayList<>();

    /**
     * Setter for the X-scale.
     */
    public ScalesTimeline setXScale(String xScale2) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            this.xScale4 = null;
            
            this.xScale2 = xScale2;
        } else {
            this.xScale2 = xScale2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setXScale2" + ++variableIndex + " = " + jsBase + ".xScale(%s);", wrapQuotes(xScale2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xScale(%s);", wrapQuotes(xScale2)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setXScale2" + variableIndex);
        setXScale2.add(item);
        return item;
    }
    private String generateJSsetXScale2() {
        if (!setXScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setXScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setXScale3 = new ArrayList<>();

    /**
     * Setter for the X-scale.
     */
    public ScalesTimeline setXScale(ScaleTypes xScale3) {
        if (jsBase == null) {
            this.xScale = null;
            this.xScale1 = null;
            this.xScale2 = null;
            this.xScale3 = null;
            this.xScale4 = null;
            
            this.xScale3 = xScale3;
        } else {
            this.xScale3 = xScale3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setXScale3" + ++variableIndex + " = " + jsBase + ".xScale(%s);", ((xScale3 != null) ? xScale3.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xScale(%s);", ((xScale3 != null) ? xScale3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setXScale3" + variableIndex);
        setXScale3.add(item);
        return item;
    }
    private String generateJSsetXScale3() {
        if (!setXScale3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setXScale3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScalesTimeline getYScale;

    /**
     * Getter for the Y-scale.
     */
    public ScalesTimeline getYScale() {
        if (getYScale == null)
            getYScale = new ScalesTimeline(jsBase + ".yScale()");

        return getYScale;
    }

    private ScalesTimeline yScale;
    private String yScale1;
    private ScaleTypes yScale2;
    private String yScale3;
    private List<ScalesTimeline> setYScale = new ArrayList<>();

    /**
     * Setter for the Y-scale.
     */
    public ScalesTimeline setYScale(ScalesTimeline yScale) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale = yScale;
        } else {
            this.yScale = yScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(yScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale != null) ? yScale.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", ((yScale != null) ? yScale.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setYScale" + variableIndex);
        setYScale.add(item);
        return item;
    }
    private String generateJSsetYScale() {
        if (!setYScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setYScale1 = new ArrayList<>();

    /**
     * Setter for the Y-scale.
     */
    public ScalesTimeline setYScale(String yScale1) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale1 = yScale1;
        } else {
            this.yScale1 = yScale1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setYScale1" + ++variableIndex + " = " + jsBase + ".yScale(%s);", wrapQuotes(yScale1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", wrapQuotes(yScale1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setYScale1" + variableIndex);
        setYScale1.add(item);
        return item;
    }
    private String generateJSsetYScale1() {
        if (!setYScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setYScale2 = new ArrayList<>();

    /**
     * Setter for the Y-scale.
     */
    public ScalesTimeline setYScale(ScaleTypes yScale2) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale2 = yScale2;
        } else {
            this.yScale2 = yScale2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setYScale2" + ++variableIndex + " = " + jsBase + ".yScale(%s);", ((yScale2 != null) ? yScale2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yScale(%s);", ((yScale2 != null) ? yScale2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setYScale2" + variableIndex);
        setYScale2.add(item);
        return item;
    }
    private String generateJSsetYScale2() {
        if (!setYScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setYScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetHovered() {
        if (getHovered != null) {
            return getHovered.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }

    private String generateJSgetXScale() {
        if (getXScale != null) {
            return getXScale.generateJs();
        }
        return "";
    }

    private String generateJSgetYScale() {
        if (getYScale != null) {
            return getYScale.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetHovered());
        jsGetters.append(generateJSgetMarkers());
        jsGetters.append(generateJSgetNormal());
        jsGetters.append(generateJSgetSelected());
        jsGetters.append(generateJSgetXScale());
        jsGetters.append(generateJSgetYScale());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetColor());
        js.append(generateJSsetHovered());
        js.append(generateJSsetMarkers());
        js.append(generateJSsetMarkers1());
        js.append(generateJSsetNormal());
        js.append(generateJSsetSelected());
        js.append(generateJSsetXScale());
        js.append(generateJSsetXScale1());
        js.append(generateJSsetXScale2());
        js.append(generateJSsetXScale3());
        js.append(generateJSsetYScale());
        js.append(generateJSsetYScale1());
        js.append(generateJSsetYScale2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}