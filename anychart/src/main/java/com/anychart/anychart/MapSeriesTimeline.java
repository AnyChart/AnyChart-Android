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
public class MapSeriesTimeline extends SeriesBase {

    public MapSeriesTimeline() {
        js.setLength(0);
        js.append("var mapSeriesTimeline").append(++variableIndex).append(" = anychart.core.map.series.base();");
        jsBase = "mapSeriesTimeline" + variableIndex;
    }

    protected MapSeriesTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected MapSeriesTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number indexes;
    private Number[] indexes1;

    /**
     * Excludes points at the specified index.
     */
    public void excludePoint(Number indexes) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            
            this.indexes = indexes;
        } else {
            this.indexes = indexes;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".excludePoint(%f);", indexes));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%f);", indexes));
                js.setLength(0);
            }
        }
    }


    /**
     * Excludes points at the specified index.
     */
    public void excludePoint(Number[] indexes1) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            
            this.indexes1 = indexes1;
        } else {
            this.indexes1 = indexes1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".excludePoint(%s);", Arrays.toString(indexes1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%s);", Arrays.toString(indexes1)));
                js.setLength(0);
            }
        }
    }

    private Fill fill;
    private List<ScalesTimeline> setFill = new ArrayList<>();

    /**
     * Setter for series fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScalesTimeline setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFill" + ++variableIndex + " = " + jsBase + ".fill(%s);", ((fill != null) ? fill.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", ((fill != null) ? fill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFill" + variableIndex);
        setFill.add(item);
        return item;
    }
    private String generateJSsetFill() {
        if (!setFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Number opacity;
    private List<ScalesTimeline> setFill1 = new ArrayList<>();

    /**
     * Series fill color with opacity. Fill as a string or an object.
     */
    public ScalesTimeline fill(String color, Number opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFill1" + ++variableIndex + " = " + jsBase + ".fill(%s, %f);", wrapQuotes(color), opacity));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f);", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFill1" + variableIndex);
        setFill1.add(item);
        return item;
    }
    private String generateJSsetFill1() {
        if (!setFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Number angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Number opacity1;
    private List<ScalesTimeline> setFill2 = new ArrayList<>();

    /**
     * Linear gradient series fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScalesTimeline fill(GradientKey[] keys, Number angle, Number opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFill2" + ++variableIndex + " = " + jsBase + ".fill(%s, %f, %f, %b);", arrayToString(keys), angle, opacity1, mode));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %b);", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFill2" + variableIndex);
        setFill2.add(item);
        return item;
    }
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setFill3 = new ArrayList<>();

    /**
     * Linear gradient series fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScalesTimeline fill(GradientKey[] keys, Number angle, Number opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, "var setFill3" + ++variableIndex + " = " + jsBase + ".fill(%s, %f, %f, %s);", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s);", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFill3" + variableIndex);
        setFill3.add(item);
        return item;
    }
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setFill4 = new ArrayList<>();

    /**
     * Linear gradient series fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScalesTimeline fill(GradientKey[] keys, Number angle, Number opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFill4" + ++variableIndex + " = " + jsBase + ".fill(%s, %f, %f, %s);", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s);", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFill4" + variableIndex);
        setFill4.add(item);
        return item;
    }
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setFill5 = new ArrayList<>();

    /**
     * Linear gradient series fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScalesTimeline fill(String[] keys1, Number angle, Number opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFill5" + ++variableIndex + " = " + jsBase + ".fill(%s, %f, %f, %b);", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %b);", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFill5" + variableIndex);
        setFill5.add(item);
        return item;
    }
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setFill6 = new ArrayList<>();

    /**
     * Linear gradient series fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScalesTimeline fill(String[] keys1, Number angle, Number opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, "var setFill6" + ++variableIndex + " = " + jsBase + ".fill(%s, %f, %f, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFill6" + variableIndex);
        setFill6.add(item);
        return item;
    }
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setFill7 = new ArrayList<>();

    /**
     * Linear gradient series fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScalesTimeline fill(String[] keys1, Number angle, Number opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFill7" + ++variableIndex + " = " + jsBase + ".fill(%s, %f, %f, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFill7" + variableIndex);
        setFill7.add(item);
        return item;
    }
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Number cx;
    private Number cy;
    private GraphicsMathRect mode3;
    private Number opacity2;
    private Number fx;
    private Number fy;
    private List<ScalesTimeline> setFill8 = new ArrayList<>();

    /**
     * Radial series fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScalesTimeline fill(GradientKey[] keys2, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, "var setFill8" + ++variableIndex + " = " + jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFill8" + variableIndex);
        setFill8.add(item);
        return item;
    }
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setFill9 = new ArrayList<>();

    /**
     * Radial series fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScalesTimeline fill(String[] keys3, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, "var setFill9" + ++variableIndex + " = " + jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFill9" + variableIndex);
        setFill9.add(item);
        return item;
    }
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private String geoIdField;
    private List<ScalesTimeline> setGeoIdField = new ArrayList<>();

    /**
     * Setter for the geo id field.
     */
    public ScalesTimeline setGeoIdField(String geoIdField) {
        if (jsBase == null) {
            this.geoIdField = geoIdField;
        } else {
            this.geoIdField = geoIdField;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setGeoIdField" + ++variableIndex + " = " + jsBase + ".geoIdField(%s);", wrapQuotes(geoIdField)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".geoIdField(%s);", wrapQuotes(geoIdField)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setGeoIdField" + variableIndex);
        setGeoIdField.add(item);
        return item;
    }
    private String generateJSsetGeoIdField() {
        if (!setGeoIdField.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setGeoIdField) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private PatternFill getHatchFill;

    /**
     * Getter fot the hatch fill.
     */
    public PatternFill getHatchFill() {
        if (getHatchFill == null)
            getHatchFill = new PatternFill(jsBase + ".hatchFill()");

        return getHatchFill;
    }

    private PatternFill patternFillOrTypeOrState;
    private HatchFill patternFillOrTypeOrState1;
    private HatchFillType patternFillOrTypeOrState2;
    private String patternFillOrTypeOrState3;
    private Boolean patternFillOrTypeOrState4;
    private String color1;
    private Number thickness;
    private Number size;
    private List<ScalesTimeline> setHatchFill = new ArrayList<>();

    /**
     * Setter for the hatch fill.
     */
    public ScalesTimeline setHatchFill(PatternFill patternFillOrTypeOrState, String color1, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(patternFillOrTypeOrState.generateJs());
            js.append(String.format(Locale.US, "var setHatchFill" + ++variableIndex + " = " + jsBase + ".hatchFill(%s, %s, %f, %f);", ((patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", ((patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setHatchFill" + variableIndex);
        setHatchFill.add(item);
        return item;
    }
    private String generateJSsetHatchFill() {
        if (!setHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setHatchFill1 = new ArrayList<>();

    /**
     * Setter for the hatch fill.
     */
    public ScalesTimeline setHatchFill(HatchFill patternFillOrTypeOrState1, String color1, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(patternFillOrTypeOrState1.generateJs());
            js.append(String.format(Locale.US, "var setHatchFill1" + ++variableIndex + " = " + jsBase + ".hatchFill(%s, %s, %f, %f);", ((patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", ((patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setHatchFill1" + variableIndex);
        setHatchFill1.add(item);
        return item;
    }
    private String generateJSsetHatchFill1() {
        if (!setHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setHatchFill2 = new ArrayList<>();

    /**
     * Setter for the hatch fill.
     */
    public ScalesTimeline setHatchFill(HatchFillType patternFillOrTypeOrState2, String color1, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHatchFill2" + ++variableIndex + " = " + jsBase + ".hatchFill(%s, %s, %f, %f);", ((patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null"), wrapQuotes(color1), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", ((patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setHatchFill2" + variableIndex);
        setHatchFill2.add(item);
        return item;
    }
    private String generateJSsetHatchFill2() {
        if (!setHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setHatchFill3 = new ArrayList<>();

    /**
     * Setter for the hatch fill.
     */
    public ScalesTimeline setHatchFill(String patternFillOrTypeOrState3, String color1, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHatchFill3" + ++variableIndex + " = " + jsBase + ".hatchFill(%s, %s, %f, %f);", wrapQuotes(patternFillOrTypeOrState3), wrapQuotes(color1), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", wrapQuotes(patternFillOrTypeOrState3), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setHatchFill3" + variableIndex);
        setHatchFill3.add(item);
        return item;
    }
    private String generateJSsetHatchFill3() {
        if (!setHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setHatchFill4 = new ArrayList<>();

    /**
     * Setter for the hatch fill.
     */
    public ScalesTimeline setHatchFill(Boolean patternFillOrTypeOrState4, String color1, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHatchFill4" + ++variableIndex + " = " + jsBase + ".hatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState4, wrapQuotes(color1), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState4, wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setHatchFill4" + variableIndex);
        setHatchFill4.add(item);
        return item;
    }
    private String generateJSsetHatchFill4() {
        if (!setHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number indexes2;
    private Number[] indexes3;

    /**
     * Includes excluded points with the specified indexes.
     */
    public void includePoint(Number indexes2) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes2 = indexes2;
        } else {
            this.indexes2 = indexes2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".includePoint(%f);", indexes2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%f);", indexes2));
                js.setLength(0);
            }
        }
    }


    /**
     * Includes excluded points with the specified indexes.
     */
    public void includePoint(Number[] indexes3) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes3 = indexes3;
        } else {
            this.indexes3 = indexes3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".includePoint(%s);", Arrays.toString(indexes3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%s);", Arrays.toString(indexes3)));
                js.setLength(0);
            }
        }
    }

    private Number indexes4;
    private Number[] indexes5;

    /**
     * Keep only the specified points.
     */
    public void keepOnlyPoints(Number indexes4) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            
            this.indexes4 = indexes4;
        } else {
            this.indexes4 = indexes4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".keepOnlyPoints(%f);", indexes4));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%f);", indexes4));
                js.setLength(0);
            }
        }
    }


    /**
     * Keep only the specified points.
     */
    public void keepOnlyPoints(Number[] indexes5) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            
            this.indexes5 = indexes5;
        } else {
            this.indexes5 = indexes5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes5)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes5)));
                js.setLength(0);
            }
        }
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private Boolean overlapMode2;
    private List<ScalesTimeline> setOverlapMode = new ArrayList<>();

    /**
     * Setter for labels overlap mode.
     */
    public ScalesTimeline setOverlapMode(LabelsOverlapMode overlapMode) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            this.overlapMode2 = null;
            
            this.overlapMode = overlapMode;
        } else {
            this.overlapMode = overlapMode;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setOverlapMode" + ++variableIndex + " = " + jsBase + ".overlapMode(%s);", ((overlapMode != null) ? overlapMode.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlapMode(%s);", ((overlapMode != null) ? overlapMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setOverlapMode" + variableIndex);
        setOverlapMode.add(item);
        return item;
    }
    private String generateJSsetOverlapMode() {
        if (!setOverlapMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setOverlapMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setOverlapMode1 = new ArrayList<>();

    /**
     * Setter for labels overlap mode.
     */
    public ScalesTimeline setOverlapMode(String overlapMode1) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            this.overlapMode2 = null;
            
            this.overlapMode1 = overlapMode1;
        } else {
            this.overlapMode1 = overlapMode1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setOverlapMode1" + ++variableIndex + " = " + jsBase + ".overlapMode(%s);", wrapQuotes(overlapMode1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlapMode(%s);", wrapQuotes(overlapMode1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setOverlapMode1" + variableIndex);
        setOverlapMode1.add(item);
        return item;
    }
    private String generateJSsetOverlapMode1() {
        if (!setOverlapMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setOverlapMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setOverlapMode2 = new ArrayList<>();

    /**
     * Setter for labels overlap mode.
     */
    public ScalesTimeline setOverlapMode(Boolean overlapMode2) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            this.overlapMode2 = null;
            
            this.overlapMode2 = overlapMode2;
        } else {
            this.overlapMode2 = overlapMode2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setOverlapMode2" + ++variableIndex + " = " + jsBase + ".overlapMode(%b);", overlapMode2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlapMode(%b);", overlapMode2));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setOverlapMode2" + variableIndex);
        setOverlapMode2.add(item);
        return item;
    }
    private String generateJSsetOverlapMode2() {
        if (!setOverlapMode2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setOverlapMode2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Number thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<ScalesTimeline> setStroke = new ArrayList<>();

    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScalesTimeline setStroke(Stroke stroke, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke = stroke;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke = stroke;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStroke" + ++variableIndex + " = " + jsBase + ".stroke(%s, %f, %s, %s, %s);", ((stroke != null) ? stroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", ((stroke != null) ? stroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setStroke" + variableIndex);
        setStroke.add(item);
        return item;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setStroke1 = new ArrayList<>();

    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScalesTimeline setStroke(ColoredFill stroke1, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke1 = stroke1;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke1 = stroke1;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStroke1" + ++variableIndex + " = " + jsBase + ".stroke(%s, %f, %s, %s, %s);", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setStroke1" + variableIndex);
        setStroke1.add(item);
        return item;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setStroke2 = new ArrayList<>();

    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScalesTimeline setStroke(String stroke2, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke2 = stroke2;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke2 = stroke2;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStroke2" + ++variableIndex + " = " + jsBase + ".stroke(%s, %f, %s, %s, %s);", wrapQuotes(stroke2), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", wrapQuotes(stroke2), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setStroke2" + variableIndex);
        setStroke2.add(item);
        return item;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number xCoord;
    private Number yCoord;

    /**
     * Transforms geo coordinates to pixel values.
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public void transformXY(Number xCoord, Number yCoord) {
        if (jsBase == null) {
            this.xCoord = xCoord;
            this.yCoord = yCoord;
        } else {
            this.xCoord = xCoord;
            this.yCoord = yCoord;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".transformXY(%f, %f);", xCoord, yCoord));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transformXY(%f, %f);", xCoord, yCoord));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetHatchFill());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetFill());
        js.append(generateJSsetFill1());
        js.append(generateJSsetFill2());
        js.append(generateJSsetFill3());
        js.append(generateJSsetFill4());
        js.append(generateJSsetFill5());
        js.append(generateJSsetFill6());
        js.append(generateJSsetFill7());
        js.append(generateJSsetFill8());
        js.append(generateJSsetFill9());
        js.append(generateJSsetGeoIdField());
        js.append(generateJSsetHatchFill());
        js.append(generateJSsetHatchFill1());
        js.append(generateJSsetHatchFill2());
        js.append(generateJSsetHatchFill3());
        js.append(generateJSsetHatchFill4());
        js.append(generateJSsetOverlapMode());
        js.append(generateJSsetOverlapMode1());
        js.append(generateJSsetOverlapMode2());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}