package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Base class for pointers.
 */
public class LineargaugePointersTimeline extends VisualBase {

    public LineargaugePointersTimeline() {
        js.setLength(0);
        js.append("var lineargaugePointersTimeline").append(++variableIndex).append(" = anychart.core.linearGauge.pointers.base();");
        jsBase = "lineargaugePointersTimeline" + variableIndex;
    }

    protected LineargaugePointersTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected LineargaugePointersTimeline(StringBuilder js, String jsBase, boolean isChain) {
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
     * Setter for the pointer color.
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

    private Number index;
    private List<ScalesTimeline> setDataIndex = new ArrayList<>();

    /**
     * Setter for the data index.
     */
    public ScalesTimeline setDataIndex(Number index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setDataIndex" + ++variableIndex + " = " + jsBase + ".dataIndex(%f);", index));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dataIndex(%f);", index));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setDataIndex" + variableIndex);
        setDataIndex.add(item);
        return item;
    }
    private String generateJSsetDataIndex() {
        if (!setDataIndex.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setDataIndex) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private List<ScalesTimeline> setFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
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

    private String color1;
    private Number opacity;
    private List<ScalesTimeline> setFill1 = new ArrayList<>();

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public ScalesTimeline fill(String color1, Number opacity) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.opacity = opacity;
        } else {
            this.color1 = color1;
            this.opacity = opacity;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFill1" + ++variableIndex + " = " + jsBase + ".fill(%s, %f);", wrapQuotes(color1), opacity));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f);", wrapQuotes(color1), opacity));
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
     * Linear gradient fill.
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
     * Linear gradient fill.
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
     * Linear gradient fill.
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
     * Linear gradient fill.
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
     * Linear gradient fill.
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
     * Linear gradient fill.
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
     * Radial gradient fill.
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
     * Radial gradient fill.
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
    private ChartsLinearGauge getGetGauge;

    /**
     * Getter for the gauge.
     */
    public ChartsLinearGauge getGetGauge() {
        if (getGetGauge == null)
            getGetGauge = new ChartsLinearGauge(jsBase + ".getGauge()");

        return getGetGauge;
    }

    private PatternFill getHatchFill;

    /**
     * Getter for pointer hatch fill settings.
     */
    public PatternFill getHatchFill() {
        if (getHatchFill == null)
            getHatchFill = new PatternFill(jsBase + ".hatchFill()");

        return getHatchFill;
    }

    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private Boolean patternFillOrType4;
    private String color2;
    private Number thickness;
    private Number size;
    private List<ScalesTimeline> setHatchFill = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
     */
    public ScalesTimeline setHatchFill(PatternFill patternFillOrType, String color2, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType = patternFillOrType;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType = patternFillOrType;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(patternFillOrType.generateJs());
            js.append(String.format(Locale.US, "var setHatchFill" + ++variableIndex + " = " + jsBase + ".hatchFill(%s, %s, %f, %f);", ((patternFillOrType != null) ? patternFillOrType.getJsBase() : "null"), wrapQuotes(color2), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", ((patternFillOrType != null) ? patternFillOrType.getJsBase() : "null"), wrapQuotes(color2), thickness, size));
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
     * Setter for hatch fill settings.
     */
    public ScalesTimeline setHatchFill(HatchFill patternFillOrType1, String color2, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType1 = patternFillOrType1;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType1 = patternFillOrType1;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(patternFillOrType1.generateJs());
            js.append(String.format(Locale.US, "var setHatchFill1" + ++variableIndex + " = " + jsBase + ".hatchFill(%s, %s, %f, %f);", ((patternFillOrType1 != null) ? patternFillOrType1.getJsBase() : "null"), wrapQuotes(color2), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", ((patternFillOrType1 != null) ? patternFillOrType1.getJsBase() : "null"), wrapQuotes(color2), thickness, size));
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
     * Setter for hatch fill settings.
     */
    public ScalesTimeline setHatchFill(HatchFillType patternFillOrType2, String color2, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType2 = patternFillOrType2;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType2 = patternFillOrType2;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHatchFill2" + ++variableIndex + " = " + jsBase + ".hatchFill(%s, %s, %f, %f);", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color2), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color2), thickness, size));
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
     * Setter for hatch fill settings.
     */
    public ScalesTimeline setHatchFill(String patternFillOrType3, String color2, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType3 = patternFillOrType3;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType3 = patternFillOrType3;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHatchFill3" + ++variableIndex + " = " + jsBase + ".hatchFill(%s, %s, %f, %f);", wrapQuotes(patternFillOrType3), wrapQuotes(color2), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", wrapQuotes(patternFillOrType3), wrapQuotes(color2), thickness, size));
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
     * Setter for hatch fill settings.
     */
    public ScalesTimeline setHatchFill(Boolean patternFillOrType4, String color2, Number thickness, Number size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType4 = patternFillOrType4;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType4 = patternFillOrType4;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHatchFill4" + ++variableIndex + " = " + jsBase + ".hatchFill(%b, %s, %f, %f);", patternFillOrType4, wrapQuotes(color2), thickness, size));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%b, %s, %f, %f);", patternFillOrType4, wrapQuotes(color2), thickness, size));
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

    private UiLabelsFactory getLabel;

    /**
     * Getter for the pointer label.
     */
    public UiLabelsFactory getLabel() {
        if (getLabel == null)
            getLabel = new UiLabelsFactory(jsBase + ".label()");

        return getLabel;
    }

    private UiLabelsFactory label;
    private String label1;
    private Boolean label2;
    private List<ScalesTimeline> setLabel = new ArrayList<>();

    /**
     * Setter for the pointer label.
     */
    public ScalesTimeline setLabel(UiLabelsFactory label) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label = label;
        } else {
            this.label = label;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(label.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".label(%s);",  ((label != null) ? label.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s);", ((label != null) ? label.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setLabel" + variableIndex);
        setLabel.add(item);
        return item;
    }
    private String generateJSsetLabel() {
        if (!setLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setLabel1 = new ArrayList<>();

    /**
     * Setter for the pointer label.
     */
    public ScalesTimeline setLabel(String label1) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label1 = label1;
        } else {
            this.label1 = label1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLabel1" + ++variableIndex + " = " + jsBase + ".label(%s);", wrapQuotes(label1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s);", wrapQuotes(label1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setLabel1" + variableIndex);
        setLabel1.add(item);
        return item;
    }
    private String generateJSsetLabel1() {
        if (!setLabel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setLabel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setLabel2 = new ArrayList<>();

    /**
     * Setter for the pointer label.
     */
    public ScalesTimeline setLabel(Boolean label2) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label2 = label2;
        } else {
            this.label2 = label2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLabel2" + ++variableIndex + " = " + jsBase + ".label(%b);", label2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%b);", label2));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setLabel2" + variableIndex);
        setLabel2.add(item);
        return item;
    }
    private String generateJSsetLabel2() {
        if (!setLabel2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setLabel2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LegendItemSettings getLegendItem;

    /**
     * Getter for the legend item settings.
     */
    public LegendItemSettings getLegendItem() {
        if (getLegendItem == null)
            getLegendItem = new LegendItemSettings(jsBase + ".legendItem()");

        return getLegendItem;
    }

    private String legendItem;
    private List<ScalesTimeline> setLegendItem = new ArrayList<>();

    /**
     * Setter for the legend item settings.
     */
    public ScalesTimeline setLegendItem(String legendItem) {
        if (jsBase == null) {
            this.legendItem = legendItem;
        } else {
            this.legendItem = legendItem;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLegendItem" + ++variableIndex + " = " + jsBase + ".legendItem(%s);", wrapQuotes(legendItem)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".legendItem(%s);", wrapQuotes(legendItem)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setLegendItem" + variableIndex);
        setLegendItem.add(item);
        return item;
    }
    private String generateJSsetLegendItem() {
        if (!setLegendItem.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setLegendItem) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String name;
    private List<ScalesTimeline> setName = new ArrayList<>();

    /**
     * Setter for the pointer name.
     */
    public ScalesTimeline setName(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setName" + ++variableIndex + " = " + jsBase + ".name(%s);", wrapQuotes(name)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".name(%s);", wrapQuotes(name)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setName" + variableIndex);
        setName.add(item);
        return item;
    }
    private String generateJSsetName() {
        if (!setName.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setName) {
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

    private String offset;
    private List<ScalesTimeline> setOffset = new ArrayList<>();

    /**
     * Setter for the pointer offset.
     */
    public ScalesTimeline setOffset(String offset) {
        if (jsBase == null) {
            this.offset = offset;
        } else {
            this.offset = offset;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setOffset" + ++variableIndex + " = " + jsBase + ".offset(%s);", wrapQuotes(offset)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".offset(%s);", wrapQuotes(offset)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setOffset" + variableIndex);
        setOffset.add(item);
        return item;
    }
    private String generateJSsetOffset() {
        if (!setOffset.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setOffset) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScalesTimeline getScale;

    /**
     * Getter for the pointer scale.
     */
    public ScalesTimeline getScale() {
        if (getScale == null)
            getScale = new ScalesTimeline(jsBase + ".scale()");

        return getScale;
    }

    private ScalesTimeline scale;
    private List<ScalesTimeline> setScale = new ArrayList<>();

    /**
     * Setter for the pointer scale.
     */
    public ScalesTimeline setScale(ScalesTimeline scale) {
        if (jsBase == null) {
            this.scale = scale;
        } else {
            this.scale = scale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(scale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".scale(%s);",  ((scale != null) ? scale.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s);", ((scale != null) ? scale.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setScale" + variableIndex);
        setScale.add(item);
        return item;
    }
    private String generateJSsetScale() {
        if (!setScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setScale) {
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

    private Stroke stroke;
    private List<ScalesTimeline> setStroke = new ArrayList<>();

    /**
     * Setter for the pointer stroke using function.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScalesTimeline setStroke(Stroke stroke) {
        if (jsBase == null) {
            this.stroke = stroke;
        } else {
            this.stroke = stroke;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStroke" + ++variableIndex + " = " + jsBase + ".stroke(%s);", ((stroke != null) ? stroke.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", ((stroke != null) ? stroke.generateJs() : "null")));
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

    private Stroke color3;
    private ColoredFill color4;
    private String color5;
    private Number thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<ScalesTimeline> setStroke1 = new ArrayList<>();

    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScalesTimeline setStroke(Stroke color3, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStroke1" + ++variableIndex + " = " + jsBase + ".stroke(%s, %f, %s, %s, %s);", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
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
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScalesTimeline setStroke(ColoredFill color4, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStroke2" + ++variableIndex + " = " + jsBase + ".stroke(%s, %f, %s, %s, %s);", ((color4 != null) ? color4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", ((color4 != null) ? color4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
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

    private List<ScalesTimeline> setStroke3 = new ArrayList<>();

    /**
     * Setter for the  pointer stroke using several parameters.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScalesTimeline setStroke(String color5, Number thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStroke3" + ++variableIndex + " = " + jsBase + ".stroke(%s, %f, %s, %s, %s);", wrapQuotes(color5), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", wrapQuotes(color5), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setStroke3" + variableIndex);
        setStroke3.add(item);
        return item;
    }
    private String generateJSsetStroke3() {
        if (!setStroke3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setStroke3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String width;
    private List<ScalesTimeline> setWidth = new ArrayList<>();

    /**
     * Setter for the pointer width.
     */
    public ScalesTimeline setWidth(String width) {
        if (jsBase == null) {
            this.width = width;
        } else {
            this.width = width;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setWidth" + ++variableIndex + " = " + jsBase + ".width(%s);", wrapQuotes(width)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setWidth" + variableIndex);
        setWidth.add(item);
        return item;
    }
    private String generateJSsetWidth() {
        if (!setWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetGetGauge() {
        if (getGetGauge != null) {
            return getGetGauge.generateJs();
        }
        return "";
    }

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHovered() {
        if (getHovered != null) {
            return getHovered.generateJs();
        }
        return "";
    }

    private String generateJSgetLabel() {
        if (getLabel != null) {
            return getLabel.generateJs();
        }
        return "";
    }

    private String generateJSgetLegendItem() {
        if (getLegendItem != null) {
            return getLegendItem.generateJs();
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetGauge());
        jsGetters.append(generateJSgetHatchFill());
        jsGetters.append(generateJSgetHovered());
        jsGetters.append(generateJSgetLabel());
        jsGetters.append(generateJSgetLegendItem());
        jsGetters.append(generateJSgetNormal());
        jsGetters.append(generateJSgetScale());
        jsGetters.append(generateJSgetSelected());

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
        js.append(generateJSsetDataIndex());
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
        js.append(generateJSsetHatchFill());
        js.append(generateJSsetHatchFill1());
        js.append(generateJSsetHatchFill2());
        js.append(generateJSsetHatchFill3());
        js.append(generateJSsetHatchFill4());
        js.append(generateJSsetHovered());
        js.append(generateJSsetLabel());
        js.append(generateJSsetLabel1());
        js.append(generateJSsetLabel2());
        js.append(generateJSsetLegendItem());
        js.append(generateJSsetName());
        js.append(generateJSsetNormal());
        js.append(generateJSsetOffset());
        js.append(generateJSsetScale());
        js.append(generateJSsetSelected());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetStroke3());
        js.append(generateJSsetWidth());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}