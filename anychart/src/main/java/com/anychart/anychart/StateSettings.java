package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * The StateSettings class contains methods for configuring the states of different charts and their parts.<br/>
States are used for series, charts, annotations, intersections in Venn Diagram, pointers in Linear Gauge, tasks,
and milestones in PERT Chart, activities in Resource Chart.<br/> See examples below:
 */
public class StateSettings extends CoreBase {

    public StateSettings() {
        js.setLength(0);
        js.append("var stateSettings").append(++variableIndex).append(" = anychart.core.stateSettings();");
        jsBase = "stateSettings" + variableIndex;
    }

    protected StateSettings(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StateSettings(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill dummyFill;
    private List<StateSettings> setDummyFill = new ArrayList<>();

    /**
     * Setter for dummy fill settings using a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setDummyFill(Fill dummyFill) {
        if (jsBase == null) {
            this.dummyFill = dummyFill;
        } else {
            this.dummyFill = dummyFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s)", ((dummyFill != null) ? dummyFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s)", ((dummyFill != null) ? dummyFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyFill() {
        if (!setDummyFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<StateSettings> setDummyFill1 = new ArrayList<>();

    /**
     * Dummy fill color with opacity.
     */
    public StateSettings dummyFill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyFill1() {
        if (!setDummyFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;
    private List<StateSettings> setDummyFill2 = new ArrayList<>();

    /**
     * Linear gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyFill2() {
        if (!setDummyFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setDummyFill3 = new ArrayList<>();

    /**
     * Linear gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyFill3() {
        if (!setDummyFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setDummyFill4 = new ArrayList<>();

    /**
     * Linear gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyFill4() {
        if (!setDummyFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setDummyFill5 = new ArrayList<>();

    /**
     * Linear gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyFill5() {
        if (!setDummyFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setDummyFill6 = new ArrayList<>();

    /**
     * Linear gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyFill6() {
        if (!setDummyFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setDummyFill7 = new ArrayList<>();

    /**
     * Linear gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyFill7() {
        if (!setDummyFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;
    private List<StateSettings> setDummyFill8 = new ArrayList<>();

    /**
     * Radial gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyFill8() {
        if (!setDummyFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setDummyFill9 = new ArrayList<>();

    /**
     * Radial gradient dummy fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings dummyFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyFill9() {
        if (!setDummyFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<StateSettings> setDummyStroke = new ArrayList<>();

    /**
     * Setter for tasks dummy stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setDummyStroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyStroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyStroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyStroke() {
        if (!setDummyStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setDummyStroke1 = new ArrayList<>();

    /**
     * Setter for tasks dummy stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setDummyStroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyStroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyStroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyStroke1() {
        if (!setDummyStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setDummyStroke2 = new ArrayList<>();

    /**
     * Setter for tasks dummy stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setDummyStroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color3 = color3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dummyStroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dummyStroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDummyStroke2() {
        if (!setDummyStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setDummyStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill emptyFill;
    private String emptyFill1;
    private List<StateSettings> setEmptyFill = new ArrayList<>();

    /**
     * Setter for state fill settings for the empty part of a tank using a string or an object.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setEmptyFill(Fill emptyFill) {
        if (jsBase == null) {
            this.emptyFill = null;
            this.emptyFill1 = null;
            
            this.emptyFill = emptyFill;
        } else {
            this.emptyFill = emptyFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyFill(%s)", ((emptyFill != null) ? emptyFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyFill(%s)", ((emptyFill != null) ? emptyFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEmptyFill() {
        if (!setEmptyFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setEmptyFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setEmptyFill1 = new ArrayList<>();

    /**
     * Setter for state fill settings for the empty part of a tank using a string or an object.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setEmptyFill(String emptyFill1) {
        if (jsBase == null) {
            this.emptyFill = null;
            this.emptyFill1 = null;
            
            this.emptyFill1 = emptyFill1;
        } else {
            this.emptyFill1 = emptyFill1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyFill(%s)", wrapQuotes(emptyFill1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyFill(%s)", wrapQuotes(emptyFill1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEmptyFill1() {
        if (!setEmptyFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setEmptyFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color4;
    private Double opacity3;
    private List<StateSettings> setEmptyFill2 = new ArrayList<>();

    /**
     * State fill color with opacity for the empty part of a tank. Fill as a string or an object.
     */
    public StateSettings emptyFill(String color4, Double opacity3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
        } else {
            this.color4 = color4;
            this.opacity3 = opacity3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyFill(%s, %f)", wrapQuotes(color4), opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyFill(%s, %f)", wrapQuotes(color4), opacity3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEmptyFill2() {
        if (!setEmptyFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setEmptyFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private PatternFill getEmptyHatchFill;

    /**
     * Getter for hatch fill settings.
     */
    public PatternFill getEmptyHatchFill() {
        if (getEmptyHatchFill == null)
            getEmptyHatchFill = new PatternFill(jsBase + ".emptyHatchFill()");

        return getEmptyHatchFill;
    }

    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private Boolean patternFillOrType4;
    private String color5;
    private Double thickness1;
    private Double size;
    private List<StateSettings> setEmptyHatchFill = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setEmptyHatchFill(PatternFill patternFillOrType, String color5, Double thickness1, Double size) {
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
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = size;
        } else {
            this.patternFillOrType = patternFillOrType;
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.generateJs() : "null"), wrapQuotes(color5), thickness1, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.generateJs() : "null"), wrapQuotes(color5), thickness1, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEmptyHatchFill() {
        if (!setEmptyHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setEmptyHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setEmptyHatchFill1 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setEmptyHatchFill(HatchFill patternFillOrType1, String color5, Double thickness1, Double size) {
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
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = size;
        } else {
            this.patternFillOrType1 = patternFillOrType1;
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null"), wrapQuotes(color5), thickness1, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null"), wrapQuotes(color5), thickness1, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEmptyHatchFill1() {
        if (!setEmptyHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setEmptyHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setEmptyHatchFill2 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setEmptyHatchFill(HatchFillType patternFillOrType2, String color5, Double thickness1, Double size) {
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
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = size;
        } else {
            this.patternFillOrType2 = patternFillOrType2;
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color5), thickness1, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color5), thickness1, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEmptyHatchFill2() {
        if (!setEmptyHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setEmptyHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setEmptyHatchFill3 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setEmptyHatchFill(String patternFillOrType3, String color5, Double thickness1, Double size) {
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
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = size;
        } else {
            this.patternFillOrType3 = patternFillOrType3;
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color5), thickness1, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color5), thickness1, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEmptyHatchFill3() {
        if (!setEmptyHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setEmptyHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setEmptyHatchFill4 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setEmptyHatchFill(Boolean patternFillOrType4, String color5, Double thickness1, Double size) {
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
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = size;
        } else {
            this.patternFillOrType4 = patternFillOrType4;
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".emptyHatchFill(%b, %s, %f, %f)", patternFillOrType4, wrapQuotes(color5), thickness1, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".emptyHatchFill(%b, %s, %f, %f)", patternFillOrType4, wrapQuotes(color5), thickness1, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEmptyHatchFill4() {
        if (!setEmptyHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setEmptyHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fallingFill;
    private List<CartesianSeriesBase> setFallingFill = new ArrayList<>();

    /**
     * Setter for falling fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase setFallingFill(Fill fallingFill) {
        if (jsBase == null) {
            this.fallingFill = fallingFill;
        } else {
            this.fallingFill = fallingFill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s)", ((fallingFill != null) ? fallingFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill" + variableIndex);
        setFallingFill.add(item);
        return item;
    }
    private String generateJSsetFallingFill() {
        if (!setFallingFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color6;
    private Double opacity4;
    private List<CartesianSeriesBase> setFallingFill1 = new ArrayList<>();

    /**
     * Falling fill color with opacity.
     */
    public CartesianSeriesBase fallingFill(String color6, Double opacity4) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.color6 = color6;
            this.opacity4 = opacity4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %f)", wrapQuotes(color6), opacity4));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill1" + variableIndex);
        setFallingFill1.add(item);
        return item;
    }
    private String generateJSsetFallingFill1() {
        if (!setFallingFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Double opacity5;
    private List<CartesianSeriesBase> setFallingFill2 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
        } else {
            this.keys4 = keys4;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity5 = opacity5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity5));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill2" + variableIndex);
        setFallingFill2.add(item);
        return item;
    }
    private String generateJSsetFallingFill2() {
        if (!setFallingFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingFill3 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
        } else {
            this.keys4 = keys4;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity5 = opacity5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity5));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill3" + variableIndex);
        setFallingFill3.add(item);
        return item;
    }
    private String generateJSsetFallingFill3() {
        if (!setFallingFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingFill4 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(GradientKey[] keys4, String mode6, Double angle1, Double opacity5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
        } else {
            this.keys4 = keys4;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity5 = opacity5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity5));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill4" + variableIndex);
        setFallingFill4.add(item);
        return item;
    }
    private String generateJSsetFallingFill4() {
        if (!setFallingFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingFill5 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(String[] keys5, Boolean mode4, Double angle1, Double opacity5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
        } else {
            this.keys5 = keys5;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity5 = opacity5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity5));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill5" + variableIndex);
        setFallingFill5.add(item);
        return item;
    }
    private String generateJSsetFallingFill5() {
        if (!setFallingFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingFill6 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(String[] keys5, VectorRect mode5, Double angle1, Double opacity5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
        } else {
            this.keys5 = keys5;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity5 = opacity5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity5));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill6" + variableIndex);
        setFallingFill6.add(item);
        return item;
    }
    private String generateJSsetFallingFill6() {
        if (!setFallingFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingFill7 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(String[] keys5, String mode6, Double angle1, Double opacity5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
        } else {
            this.keys5 = keys5;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity5 = opacity5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity5));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill7" + variableIndex);
        setFallingFill7.add(item);
        return item;
    }
    private String generateJSsetFallingFill7() {
        if (!setFallingFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private GraphicsMathRect mode7;
    private Double opacity6;
    private Double fx1;
    private Double fy1;
    private List<CartesianSeriesBase> setFallingFill8 = new ArrayList<>();

    /**
     * Radial gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity6, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            
            this.keys6 = keys6;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            
            this.mode7 = mode7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.keys6 = keys6;
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.mode7 = mode7;
            this.opacity6 = opacity6;
            this.fx1 = fx1;
            this.fy1 = fy1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity6, fx1, fy1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill8" + variableIndex);
        setFallingFill8.add(item);
        return item;
    }
    private String generateJSsetFallingFill8() {
        if (!setFallingFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingFill9 = new ArrayList<>();

    /**
     * Radial gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBase fallingFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity6, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            
            this.keys7 = keys7;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            
            this.mode7 = mode7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.keys7 = keys7;
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.mode7 = mode7;
            this.opacity6 = opacity6;
            this.fx1 = fx1;
            this.fy1 = fy1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity6, fx1, fy1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingFill9" + variableIndex);
        setFallingFill9.add(item);
        return item;
    }
    private String generateJSsetFallingFill9() {
        if (!setFallingFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings1;
    private PatternFill getFallingHatchFill;

    /**
     * Getter for falling hatch fill settings.
     */
    public PatternFill getFallingHatchFill() {
        if (getFallingHatchFill == null)
            getFallingHatchFill = new PatternFill(jsBase + ".fallingHatchFill()");

        return getFallingHatchFill;
    }

    private PatternFill patternFillOrTypeOrState;
    private HatchFill patternFillOrTypeOrState1;
    private HatchFillType patternFillOrTypeOrState2;
    private String patternFillOrTypeOrState3;
    private Boolean patternFillOrTypeOrState4;
    private String color7;
    private Double thickness2;
    private Double size1;
    private List<CartesianSeriesBase> setFallingHatchFill = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(PatternFill patternFillOrTypeOrState, String color7, Double thickness2, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null"), wrapQuotes(color7), thickness2, size1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingHatchFill" + variableIndex);
        setFallingHatchFill.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill() {
        if (!setFallingHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingHatchFill1 = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(HatchFill patternFillOrTypeOrState1, String color7, Double thickness2, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null"), wrapQuotes(color7), thickness2, size1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingHatchFill1" + variableIndex);
        setFallingHatchFill1.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill1() {
        if (!setFallingHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingHatchFill2 = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(HatchFillType patternFillOrTypeOrState2, String color7, Double thickness2, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null"), wrapQuotes(color7), thickness2, size1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingHatchFill2" + variableIndex);
        setFallingHatchFill2.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill2() {
        if (!setFallingHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingHatchFill3 = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(String patternFillOrTypeOrState3, String color7, Double thickness2, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrTypeOrState3), wrapQuotes(color7), thickness2, size1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingHatchFill3" + variableIndex);
        setFallingHatchFill3.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill3() {
        if (!setFallingHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBase> setFallingHatchFill4 = new ArrayList<>();

    /**
     * Setter for falling hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBase setFallingHatchFill(Boolean patternFillOrTypeOrState4, String color7, Double thickness2, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.size1 = size1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fallingHatchFill(%b, %s, %f, %f)", patternFillOrTypeOrState4, wrapQuotes(color7), thickness2, size1));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setFallingHatchFill4" + variableIndex);
        setFallingHatchFill4.add(item);
        return item;
    }
    private String generateJSsetFallingHatchFill4() {
        if (!setFallingHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setFallingHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Double thickness3;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;
    private List<StateSettings> setFallingStroke = new ArrayList<>();

    /**
     * Setter for falling stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setFallingStroke(Stroke stroke, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke = stroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.stroke = stroke;
            this.thickness3 = thickness3;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingStroke() {
        if (!setFallingStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFallingStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setFallingStroke1 = new ArrayList<>();

    /**
     * Setter for falling stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setFallingStroke(ColoredFill stroke1, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke1 = stroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.stroke1 = stroke1;
            this.thickness3 = thickness3;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingStroke1() {
        if (!setFallingStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFallingStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setFallingStroke2 = new ArrayList<>();

    /**
     * Setter for falling stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setFallingStroke(String stroke2, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke2 = stroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.stroke2 = stroke2;
            this.thickness3 = thickness3;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke2), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingStroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke2), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingStroke2() {
        if (!setFallingStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFallingStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private List<StateSettings> setFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill() {
        if (!setFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color8;
    private Double opacity7;
    private List<StateSettings> setFill1 = new ArrayList<>();

    /**
     * Setter for the fill color with opacity.
     */
    public StateSettings setFill(String color8, Double opacity7) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            
            this.color8 = color8;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.color8 = color8;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color8), opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color8), opacity7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill1() {
        if (!setFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode8;
    private VectorRect mode9;
    private String mode10;
    private Double opacity8;
    private List<StateSettings> setFill2 = new ArrayList<>();

    /**
     * Setter for the linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(GradientKey[] keys8, Boolean mode8, Double angle2, Double opacity8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode8 = mode8;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
        } else {
            this.keys8 = keys8;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity8 = opacity8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys8), mode8, angle2, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys8), mode8, angle2, opacity8));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setFill3 = new ArrayList<>();

    /**
     * Setter for the linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(GradientKey[] keys8, VectorRect mode9, Double angle2, Double opacity8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode9 = mode9;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
        } else {
            this.keys8 = keys8;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity8 = opacity8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys8), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys8), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity8));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setFill4 = new ArrayList<>();

    /**
     * Setter for the linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(GradientKey[] keys8, String mode10, Double angle2, Double opacity8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode10 = mode10;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
        } else {
            this.keys8 = keys8;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity8 = opacity8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys8), wrapQuotes(mode10), angle2, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys8), wrapQuotes(mode10), angle2, opacity8));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setFill5 = new ArrayList<>();

    /**
     * Setter for the linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(String[] keys9, Boolean mode8, Double angle2, Double opacity8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode8 = mode8;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
        } else {
            this.keys9 = keys9;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity8 = opacity8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys9), mode8, angle2, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys9), mode8, angle2, opacity8));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setFill6 = new ArrayList<>();

    /**
     * Setter for the linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(String[] keys9, VectorRect mode9, Double angle2, Double opacity8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode9 = mode9;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
        } else {
            this.keys9 = keys9;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity8 = opacity8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity8));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setFill7 = new ArrayList<>();

    /**
     * Setter for the linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(String[] keys9, String mode10, Double angle2, Double opacity8) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode10 = mode10;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
        } else {
            this.keys9 = keys9;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity8 = opacity8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), wrapQuotes(mode10), angle2, opacity8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), wrapQuotes(mode10), angle2, opacity8));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private GraphicsMathRect mode11;
    private Double opacity9;
    private Double fx2;
    private Double fy2;
    private List<StateSettings> setFill8 = new ArrayList<>();

    /**
     * Setter for the radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity9, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            
            this.keys10 = keys10;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            
            this.mode11 = mode11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            
            this.opacity9 = opacity9;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.keys10 = keys10;
            this.cx2 = cx2;
            this.cy2 = cy2;
            this.mode11 = mode11;
            this.opacity9 = opacity9;
            this.fx2 = fx2;
            this.fy2 = fy2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity9, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity9, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setFill9 = new ArrayList<>();

    /**
     * Setter for the radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setFill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity9, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            
            this.keys11 = keys11;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            
            this.mode11 = mode11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            
            this.opacity9 = opacity9;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.keys11 = keys11;
            this.cx2 = cx2;
            this.cy2 = cy2;
            this.mode11 = mode11;
            this.opacity9 = opacity9;
            this.fx2 = fx2;
            this.fy2 = fy2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity9, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity9, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings2;
    private String fontFamily;
    private List<StateSettings> setFontFamily = new ArrayList<>();

    /**
     * Setter for the font family of text.
     */
    public StateSettings setFontFamily(String fontFamily) {
        if (jsBase == null) {
            this.fontFamily = fontFamily;
        } else {
            this.fontFamily = fontFamily;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontFamily(%s)", wrapQuotes(fontFamily)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontFamily(%s)", wrapQuotes(fontFamily)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontFamily() {
        if (!setFontFamily.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFontFamily) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double fontSize;
    private String fontSize1;
    private List<StateSettings> setFontSize = new ArrayList<>();

    /**
     * Setter for font size settings.
     */
    public StateSettings setFontSize(Double fontSize) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize = fontSize;
        } else {
            this.fontSize = fontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontSize(%f)", fontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%f)", fontSize));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontSize() {
        if (!setFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setFontSize1 = new ArrayList<>();

    /**
     * Setter for font size settings.
     */
    public StateSettings setFontSize(String fontSize1) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize1 = fontSize1;
        } else {
            this.fontSize1 = fontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontSize(%s)", wrapQuotes(fontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%s)", wrapQuotes(fontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontSize1() {
        if (!setFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextFontStyle fontStyle;
    private String fontStyle1;
    private List<StateSettings> setFontStyle = new ArrayList<>();

    /**
     * Setter for the text font style.
     */
    public StateSettings setFontStyle(TextFontStyle fontStyle) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle = fontStyle;
        } else {
            this.fontStyle = fontStyle;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle != null) ? fontStyle.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle != null) ? fontStyle.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontStyle() {
        if (!setFontStyle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFontStyle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setFontStyle1 = new ArrayList<>();

    /**
     * Setter for the text font style.
     */
    public StateSettings setFontStyle(String fontStyle1) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle1 = fontStyle1;
        } else {
            this.fontStyle1 = fontStyle1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontStyle1() {
        if (!setFontStyle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFontStyle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextFontVariant fontVariant;
    private String fontVariant1;
    private List<StateSettings> setFontVariant = new ArrayList<>();

    /**
     * Setter for the text font variant.
     */
    public StateSettings setFontVariant(TextFontVariant fontVariant) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant = fontVariant;
        } else {
            this.fontVariant = fontVariant;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant != null) ? fontVariant.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant != null) ? fontVariant.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontVariant() {
        if (!setFontVariant.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFontVariant) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setFontVariant1 = new ArrayList<>();

    /**
     * Setter for the text font variant.
     */
    public StateSettings setFontVariant(String fontVariant1) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant1 = fontVariant1;
        } else {
            this.fontVariant1 = fontVariant1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontVariant1() {
        if (!setFontVariant1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFontVariant1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontWeight;
    private Double fontWeight1;
    private List<StateSettings> setFontWeight = new ArrayList<>();

    /**
     * Setter for the text font weight. {@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public StateSettings setFontWeight(String fontWeight) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight = fontWeight;
        } else {
            this.fontWeight = fontWeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontWeight(%s)", wrapQuotes(fontWeight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontWeight(%s)", wrapQuotes(fontWeight)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontWeight() {
        if (!setFontWeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFontWeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setFontWeight1 = new ArrayList<>();

    /**
     * Setter for the text font weight. {@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public StateSettings setFontWeight(Double fontWeight1) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight1 = fontWeight1;
        } else {
            this.fontWeight1 = fontWeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontWeight(%f)", fontWeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontWeight(%f)", fontWeight1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontWeight1() {
        if (!setFontWeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setFontWeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke grid;
    private ColoredFill grid1;
    private String grid2;
    private Double thickness4;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;
    private List<StateSettings> setGrid = new ArrayList<>();

    /**
     * Setter for annotation grid settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setGrid(Stroke grid, Double thickness4, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.grid = null;
            this.grid1 = null;
            this.grid2 = null;
            
            this.grid = grid;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.grid = grid;
            this.thickness4 = thickness4;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", ((grid != null) ? grid.generateJs() : "null"), thickness4, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", ((grid != null) ? grid.generateJs() : "null"), thickness4, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetGrid() {
        if (!setGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setGrid1 = new ArrayList<>();

    /**
     * Setter for annotation grid settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setGrid(ColoredFill grid1, Double thickness4, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.grid = null;
            this.grid1 = null;
            this.grid2 = null;
            
            this.grid1 = grid1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.grid1 = grid1;
            this.thickness4 = thickness4;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", ((grid1 != null) ? grid1.generateJs() : "null"), thickness4, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", ((grid1 != null) ? grid1.generateJs() : "null"), thickness4, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetGrid1() {
        if (!setGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setGrid2 = new ArrayList<>();

    /**
     * Setter for annotation grid settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setGrid(String grid2, Double thickness4, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.grid = null;
            this.grid1 = null;
            this.grid2 = null;
            
            this.grid2 = grid2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.grid2 = grid2;
            this.thickness4 = thickness4;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", wrapQuotes(grid2), thickness4, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".grid(%s, %f, %s, %s, %s)", wrapQuotes(grid2), thickness4, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetGrid2() {
        if (!setGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private PatternFill getHatchFill;

    /**
     * Getter for hatch fill settings.
     */
    public PatternFill getHatchFill() {
        if (getHatchFill == null)
            getHatchFill = new PatternFill(jsBase + ".hatchFill()");

        return getHatchFill;
    }

    private PatternFill patternFillOrType5;
    private HatchFill patternFillOrType6;
    private HatchFillType patternFillOrType7;
    private String patternFillOrType8;
    private String color9;
    private Double thickness5;
    private Double size2;
    private List<StateSettings> setHatchFill = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setHatchFill(PatternFill patternFillOrType5, String color9, Double thickness5, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            
            this.patternFillOrType5 = patternFillOrType5;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType5 = patternFillOrType5;
            this.color9 = color9;
            this.thickness5 = thickness5;
            this.size2 = size2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null"), wrapQuotes(color9), thickness5, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null"), wrapQuotes(color9), thickness5, size2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHatchFill() {
        if (!setHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setHatchFill1 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setHatchFill(HatchFill patternFillOrType6, String color9, Double thickness5, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            
            this.patternFillOrType6 = patternFillOrType6;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType6 = patternFillOrType6;
            this.color9 = color9;
            this.thickness5 = thickness5;
            this.size2 = size2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null"), wrapQuotes(color9), thickness5, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null"), wrapQuotes(color9), thickness5, size2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHatchFill1() {
        if (!setHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setHatchFill2 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setHatchFill(HatchFillType patternFillOrType7, String color9, Double thickness5, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            
            this.patternFillOrType7 = patternFillOrType7;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType7 = patternFillOrType7;
            this.color9 = color9;
            this.thickness5 = thickness5;
            this.size2 = size2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType7 != null) ? patternFillOrType7.generateJs() : "null"), wrapQuotes(color9), thickness5, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType7 != null) ? patternFillOrType7.generateJs() : "null"), wrapQuotes(color9), thickness5, size2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHatchFill2() {
        if (!setHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setHatchFill3 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public StateSettings setHatchFill(String patternFillOrType8, String color9, Double thickness5, Double size2) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            
            this.patternFillOrType8 = patternFillOrType8;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrType8 = patternFillOrType8;
            this.color9 = color9;
            this.thickness5 = thickness5;
            this.size2 = size2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType8), wrapQuotes(color9), thickness5, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType8), wrapQuotes(color9), thickness5, size2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHatchFill3() {
        if (!setHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiLabelsFactory getHeaders;

    /**
     * Getter for the header labels (TreeMap).
     */
    public UiLabelsFactory getHeaders() {
        if (getHeaders == null)
            getHeaders = new UiLabelsFactory(jsBase + ".headers()");

        return getHeaders;
    }

    private String headers;
    private Boolean headers1;
    private List<StateSettings> setHeaders = new ArrayList<>();

    /**
     * Setter for the header labels (TreeMap).
     */
    public StateSettings setHeaders(String headers) {
        if (jsBase == null) {
            this.headers = null;
            this.headers1 = null;
            
            this.headers = headers;
        } else {
            this.headers = headers;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".headers(%s)", wrapQuotes(headers)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".headers(%s)", wrapQuotes(headers)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHeaders() {
        if (!setHeaders.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setHeaders) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setHeaders1 = new ArrayList<>();

    /**
     * Setter for the header labels (TreeMap).
     */
    public StateSettings setHeaders(Boolean headers1) {
        if (jsBase == null) {
            this.headers = null;
            this.headers1 = null;
            
            this.headers1 = headers1;
        } else {
            this.headers1 = headers1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".headers(%b)", headers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".headers(%b)", headers1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHeaders1() {
        if (!setHeaders1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setHeaders1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color10;
    private ColoredFill color11;
    private String color12;
    private Double thickness6;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;
    private List<StateSettings> setHighStroke = new ArrayList<>();

    /**
     * Setter for high stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setHighStroke(Stroke color10, Double thickness6, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color10 = color10;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color10 = color10;
            this.thickness6 = thickness6;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".highStroke(%s, %f, %s, %s, %s)", ((color10 != null) ? color10.generateJs() : "null"), thickness6, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".highStroke(%s, %f, %s, %s, %s)", ((color10 != null) ? color10.generateJs() : "null"), thickness6, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHighStroke() {
        if (!setHighStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setHighStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setHighStroke1 = new ArrayList<>();

    /**
     * Setter for high stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setHighStroke(ColoredFill color11, Double thickness6, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color11 = color11;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color11 = color11;
            this.thickness6 = thickness6;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".highStroke(%s, %f, %s, %s, %s)", ((color11 != null) ? color11.generateJs() : "null"), thickness6, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".highStroke(%s, %f, %s, %s, %s)", ((color11 != null) ? color11.generateJs() : "null"), thickness6, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHighStroke1() {
        if (!setHighStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setHighStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setHighStroke2 = new ArrayList<>();

    /**
     * Setter for high stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setHighStroke(String color12, Double thickness6, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color12 = color12;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color12 = color12;
            this.thickness6 = thickness6;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".highStroke(%s, %f, %s, %s, %s)", wrapQuotes(color12), thickness6, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".highStroke(%s, %f, %s, %s, %s)", wrapQuotes(color12), thickness6, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHighStroke2() {
        if (!setHighStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setHighStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StateSettings getHovered;

    /**
     * Getter for the hovered state.
     */
    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }

    private String hovered;

    /**
     * Setter for the hovered state.
     */
    public void setHovered(String hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hovered(%s)", wrapQuotes(hovered)));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getLabels;

    /**
     * Getter for labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }

    private String labels;
    private Boolean labels1;
    private List<StateSettings> setLabels = new ArrayList<>();

    /**
     * Setter for labels.
     */
    public StateSettings setLabels(String labels) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels = labels;
        } else {
            this.labels = labels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabels() {
        if (!setLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setLabels1 = new ArrayList<>();

    /**
     * Setter for labels.
     */
    public StateSettings setLabels(Boolean labels1) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels1 = labels1;
        } else {
            this.labels1 = labels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".labels(%b)", labels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".labels(%b)", labels1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabels1() {
        if (!setLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color13;
    private ColoredFill color14;
    private String color15;
    private Double thickness7;
    private String dashpattern4;
    private StrokeLineJoin lineJoin4;
    private StrokeLineCap lineCap4;
    private List<StateSettings> setLowStroke = new ArrayList<>();

    /**
     * Setter for low stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setLowStroke(Stroke color13, Double thickness7, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            
            this.color13 = color13;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.color13 = color13;
            this.thickness7 = thickness7;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lowStroke(%s, %f, %s, %s, %s)", ((color13 != null) ? color13.generateJs() : "null"), thickness7, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lowStroke(%s, %f, %s, %s, %s)", ((color13 != null) ? color13.generateJs() : "null"), thickness7, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLowStroke() {
        if (!setLowStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setLowStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setLowStroke1 = new ArrayList<>();

    /**
     * Setter for low stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setLowStroke(ColoredFill color14, Double thickness7, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            
            this.color14 = color14;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.color14 = color14;
            this.thickness7 = thickness7;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lowStroke(%s, %f, %s, %s, %s)", ((color14 != null) ? color14.generateJs() : "null"), thickness7, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lowStroke(%s, %f, %s, %s, %s)", ((color14 != null) ? color14.generateJs() : "null"), thickness7, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLowStroke1() {
        if (!setLowStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setLowStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setLowStroke2 = new ArrayList<>();

    /**
     * Setter for low stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setLowStroke(String color15, Double thickness7, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            
            this.color15 = color15;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.color15 = color15;
            this.thickness7 = thickness7;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lowStroke(%s, %f, %s, %s, %s)", wrapQuotes(color15), thickness7, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lowStroke(%s, %f, %s, %s, %s)", wrapQuotes(color15), thickness7, wrapQuotes(dashpattern4), ((lineJoin4 != null) ? lineJoin4.generateJs() : "null"), ((lineCap4 != null) ? lineCap4.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLowStroke2() {
        if (!setLowStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setLowStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiLabelsFactory getLowerLabels;

    /**
     * Getter for lower labels (for pert tasks).
     */
    public UiLabelsFactory getLowerLabels() {
        if (getLowerLabels == null)
            getLowerLabels = new UiLabelsFactory(jsBase + ".lowerLabels()");

        return getLowerLabels;
    }

    private String lowerLabels;
    private Boolean lowerLabels1;
    private List<StateSettings> setLowerLabels = new ArrayList<>();

    /**
     * Setter for lower labels (for pert tasks).
     */
    public StateSettings setLowerLabels(String lowerLabels) {
        if (jsBase == null) {
            this.lowerLabels = null;
            this.lowerLabels1 = null;
            
            this.lowerLabels = lowerLabels;
        } else {
            this.lowerLabels = lowerLabels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lowerLabels(%s)", wrapQuotes(lowerLabels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lowerLabels(%s)", wrapQuotes(lowerLabels)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLowerLabels() {
        if (!setLowerLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setLowerLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setLowerLabels1 = new ArrayList<>();

    /**
     * Setter for lower labels (for pert tasks).
     */
    public StateSettings setLowerLabels(Boolean lowerLabels1) {
        if (jsBase == null) {
            this.lowerLabels = null;
            this.lowerLabels1 = null;
            
            this.lowerLabels1 = lowerLabels1;
        } else {
            this.lowerLabels1 = lowerLabels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lowerLabels(%b)", lowerLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lowerLabels(%b)", lowerLabels1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLowerLabels1() {
        if (!setLowerLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setLowerLabels1) {
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
    private List<StateSettings> setMarkers = new ArrayList<>();

    /**
     * Setter for data markers.
     */
    public StateSettings setMarkers(String markers) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers = markers;
        } else {
            this.markers = markers;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMarkers() {
        if (!setMarkers.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setMarkers) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setMarkers1 = new ArrayList<>();

    /**
     * Setter for data markers.
     */
    public StateSettings setMarkers(Boolean markers1) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers1 = markers1;
        } else {
            this.markers1 = markers1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".markers(%b)", markers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%b)", markers1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMarkers1() {
        if (!setMarkers1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setMarkers1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color16;
    private ColoredFill color17;
    private String color18;
    private Double thickness8;
    private String dashpattern5;
    private StrokeLineJoin lineJoin5;
    private StrokeLineCap lineCap5;
    private List<StateSettings> setMedianStroke = new ArrayList<>();

    /**
     * Setter for median stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setMedianStroke(Stroke color16, Double thickness8, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            
            this.color16 = color16;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            
            this.dashpattern5 = dashpattern5;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            
            this.lineJoin5 = lineJoin5;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            
            this.lineCap5 = lineCap5;
        } else {
            this.color16 = color16;
            this.thickness8 = thickness8;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".medianStroke(%s, %f, %s, %s, %s)", ((color16 != null) ? color16.generateJs() : "null"), thickness8, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".medianStroke(%s, %f, %s, %s, %s)", ((color16 != null) ? color16.generateJs() : "null"), thickness8, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMedianStroke() {
        if (!setMedianStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setMedianStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setMedianStroke1 = new ArrayList<>();

    /**
     * Setter for median stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setMedianStroke(ColoredFill color17, Double thickness8, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            
            this.color17 = color17;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            
            this.dashpattern5 = dashpattern5;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            
            this.lineJoin5 = lineJoin5;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            
            this.lineCap5 = lineCap5;
        } else {
            this.color17 = color17;
            this.thickness8 = thickness8;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".medianStroke(%s, %f, %s, %s, %s)", ((color17 != null) ? color17.generateJs() : "null"), thickness8, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".medianStroke(%s, %f, %s, %s, %s)", ((color17 != null) ? color17.generateJs() : "null"), thickness8, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMedianStroke1() {
        if (!setMedianStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setMedianStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setMedianStroke2 = new ArrayList<>();

    /**
     * Setter for median stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setMedianStroke(String color18, Double thickness8, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            
            this.color18 = color18;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            
            this.dashpattern5 = dashpattern5;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            
            this.lineJoin5 = lineJoin5;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            
            this.lineCap5 = lineCap5;
        } else {
            this.color18 = color18;
            this.thickness8 = thickness8;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".medianStroke(%s, %f, %s, %s, %s)", wrapQuotes(color18), thickness8, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".medianStroke(%s, %f, %s, %s, %s)", wrapQuotes(color18), thickness8, wrapQuotes(dashpattern5), ((lineJoin5 != null) ? lineJoin5.generateJs() : "null"), ((lineCap5 != null) ? lineCap5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMedianStroke2() {
        if (!setMedianStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setMedianStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill negativeFill;
    private List<StateSettings> setNegativeFill = new ArrayList<>();

    /**
     * Setter for negative fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setNegativeFill(Fill negativeFill) {
        if (jsBase == null) {
            this.negativeFill = negativeFill;
        } else {
            this.negativeFill = negativeFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s)", ((negativeFill != null) ? negativeFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s)", ((negativeFill != null) ? negativeFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill() {
        if (!setNegativeFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color19;
    private Double opacity10;
    private List<StateSettings> setNegativeFill1 = new ArrayList<>();

    /**
     * Negative fill color with opacity.
     */
    public StateSettings negativeFill(String color19, Double opacity10) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            
            this.color19 = color19;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.color19 = color19;
            this.opacity10 = opacity10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %f)", wrapQuotes(color19), opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f)", wrapQuotes(color19), opacity10));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill1() {
        if (!setNegativeFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys12;
    private String[] keys13;
    private Double angle3;
    private Boolean mode12;
    private VectorRect mode13;
    private String mode14;
    private Double opacity11;
    private List<StateSettings> setNegativeFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(GradientKey[] keys12, Boolean mode12, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode12 = mode12;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys12 = keys12;
            this.mode12 = mode12;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %b, %f, %f)", arrayToString(keys12), mode12, angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %b, %f, %f)", arrayToString(keys12), mode12, angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill2() {
        if (!setNegativeFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setNegativeFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(GradientKey[] keys12, VectorRect mode13, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode13 = mode13;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys12 = keys12;
            this.mode13 = mode13;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToString(keys12), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToString(keys12), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill3() {
        if (!setNegativeFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setNegativeFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(GradientKey[] keys12, String mode14, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode14 = mode14;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys12 = keys12;
            this.mode14 = mode14;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToString(keys12), wrapQuotes(mode14), angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToString(keys12), wrapQuotes(mode14), angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill4() {
        if (!setNegativeFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setNegativeFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(String[] keys13, Boolean mode12, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode12 = mode12;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys13 = keys13;
            this.mode12 = mode12;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys13), mode12, angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys13), mode12, angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill5() {
        if (!setNegativeFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setNegativeFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(String[] keys13, VectorRect mode13, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode13 = mode13;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys13 = keys13;
            this.mode13 = mode13;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill6() {
        if (!setNegativeFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setNegativeFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(String[] keys13, String mode14, Double angle3, Double opacity11) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode14 = mode14;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
        } else {
            this.keys13 = keys13;
            this.mode14 = mode14;
            this.angle3 = angle3;
            this.opacity11 = opacity11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), wrapQuotes(mode14), angle3, opacity11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), wrapQuotes(mode14), angle3, opacity11));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill7() {
        if (!setNegativeFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys14;
    private String[] keys15;
    private Double cx3;
    private Double cy3;
    private GraphicsMathRect mode15;
    private Double opacity12;
    private Double fx3;
    private Double fy3;
    private List<StateSettings> setNegativeFill8 = new ArrayList<>();

    /**
     * Radial gradient negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(GradientKey[] keys14, Double cx3, Double cy3, GraphicsMathRect mode15, Double opacity12, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            
            this.keys14 = keys14;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            
            this.mode15 = mode15;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            
            this.opacity12 = opacity12;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.keys14 = keys14;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.mode15 = mode15;
            this.opacity12 = opacity12;
            this.fx3 = fx3;
            this.fy3 = fy3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys14), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity12, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys14), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity12, fx3, fy3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill8() {
        if (!setNegativeFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setNegativeFill9 = new ArrayList<>();

    /**
     * Radial gradient negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings negativeFill(String[] keys15, Double cx3, Double cy3, GraphicsMathRect mode15, Double opacity12, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            
            this.keys15 = keys15;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            
            this.mode15 = mode15;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            
            this.opacity12 = opacity12;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.keys15 = keys15;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.mode15 = mode15;
            this.opacity12 = opacity12;
            this.fx3 = fx3;
            this.fy3 = fy3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys15), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity12, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys15), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity12, fx3, fy3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill9() {
        if (!setNegativeFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings3;
    private PatternFill getNegativeHatchFill;

    /**
     * Getter for negative hatch fill settings.
     */
    public PatternFill getNegativeHatchFill() {
        if (getNegativeHatchFill == null)
            getNegativeHatchFill = new PatternFill(jsBase + ".negativeHatchFill()");

        return getNegativeHatchFill;
    }

    private PatternFill patternFillOrType9;
    private HatchFill patternFillOrType10;
    private HatchFillType patternFillOrType11;
    private String patternFillOrType12;
    private String color20;
    private Double thickness9;
    private Double size3;
    private List<StateSettings> setNegativeHatchFill = new ArrayList<>();

    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setNegativeHatchFill(PatternFill patternFillOrType9, String color20, Double thickness9, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            
            this.patternFillOrType9 = patternFillOrType9;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            
            this.color20 = color20;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType9 = patternFillOrType9;
            this.color20 = color20;
            this.thickness9 = thickness9;
            this.size3 = size3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType9 != null) ? patternFillOrType9.generateJs() : "null"), wrapQuotes(color20), thickness9, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType9 != null) ? patternFillOrType9.generateJs() : "null"), wrapQuotes(color20), thickness9, size3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill() {
        if (!setNegativeHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setNegativeHatchFill1 = new ArrayList<>();

    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setNegativeHatchFill(HatchFill patternFillOrType10, String color20, Double thickness9, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            
            this.patternFillOrType10 = patternFillOrType10;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            
            this.color20 = color20;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType10 = patternFillOrType10;
            this.color20 = color20;
            this.thickness9 = thickness9;
            this.size3 = size3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null"), wrapQuotes(color20), thickness9, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType10 != null) ? patternFillOrType10.generateJs() : "null"), wrapQuotes(color20), thickness9, size3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill1() {
        if (!setNegativeHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setNegativeHatchFill2 = new ArrayList<>();

    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setNegativeHatchFill(HatchFillType patternFillOrType11, String color20, Double thickness9, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            
            this.patternFillOrType11 = patternFillOrType11;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            
            this.color20 = color20;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType11 = patternFillOrType11;
            this.color20 = color20;
            this.thickness9 = thickness9;
            this.size3 = size3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType11 != null) ? patternFillOrType11.generateJs() : "null"), wrapQuotes(color20), thickness9, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType11 != null) ? patternFillOrType11.generateJs() : "null"), wrapQuotes(color20), thickness9, size3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill2() {
        if (!setNegativeHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setNegativeHatchFill3 = new ArrayList<>();

    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings setNegativeHatchFill(String patternFillOrType12, String color20, Double thickness9, Double size3) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            this.patternFillOrType8 = null;
            this.patternFillOrType9 = null;
            this.patternFillOrType10 = null;
            this.patternFillOrType11 = null;
            this.patternFillOrType12 = null;
            
            this.patternFillOrType12 = patternFillOrType12;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            
            this.color20 = color20;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrType12 = patternFillOrType12;
            this.color20 = color20;
            this.thickness9 = thickness9;
            this.size3 = size3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType12), wrapQuotes(color20), thickness9, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType12), wrapQuotes(color20), thickness9, size3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill3() {
        if (!setNegativeHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color21;
    private ColoredFill color22;
    private String color23;
    private Double thickness10;
    private String dashpattern6;
    private StrokeLineJoin lineJoin6;
    private StrokeLineCap lineCap6;
    private List<StateSettings> setNegativeStroke = new ArrayList<>();

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setNegativeStroke(Stroke color21, Double thickness10, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            
            this.color21 = color21;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            
            this.thickness10 = thickness10;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            
            this.dashpattern6 = dashpattern6;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            
            this.lineJoin6 = lineJoin6;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            
            this.lineCap6 = lineCap6;
        } else {
            this.color21 = color21;
            this.thickness10 = thickness10;
            this.dashpattern6 = dashpattern6;
            this.lineJoin6 = lineJoin6;
            this.lineCap6 = lineCap6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color21 != null) ? color21.generateJs() : "null"), thickness10, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color21 != null) ? color21.generateJs() : "null"), thickness10, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeStroke() {
        if (!setNegativeStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setNegativeStroke1 = new ArrayList<>();

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setNegativeStroke(ColoredFill color22, Double thickness10, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            
            this.color22 = color22;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            
            this.thickness10 = thickness10;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            
            this.dashpattern6 = dashpattern6;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            
            this.lineJoin6 = lineJoin6;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            
            this.lineCap6 = lineCap6;
        } else {
            this.color22 = color22;
            this.thickness10 = thickness10;
            this.dashpattern6 = dashpattern6;
            this.lineJoin6 = lineJoin6;
            this.lineCap6 = lineCap6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color22 != null) ? color22.generateJs() : "null"), thickness10, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color22 != null) ? color22.generateJs() : "null"), thickness10, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeStroke1() {
        if (!setNegativeStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setNegativeStroke2 = new ArrayList<>();

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setNegativeStroke(String color23, Double thickness10, String dashpattern6, StrokeLineJoin lineJoin6, StrokeLineCap lineCap6) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            
            this.color23 = color23;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            
            this.thickness10 = thickness10;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            
            this.dashpattern6 = dashpattern6;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            
            this.lineJoin6 = lineJoin6;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            
            this.lineCap6 = lineCap6;
        } else {
            this.color23 = color23;
            this.thickness10 = thickness10;
            this.dashpattern6 = dashpattern6;
            this.lineJoin6 = lineJoin6;
            this.lineCap6 = lineCap6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", wrapQuotes(color23), thickness10, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", wrapQuotes(color23), thickness10, wrapQuotes(dashpattern6), ((lineJoin6 != null) ? lineJoin6.generateJs() : "null"), ((lineCap6 != null) ? lineCap6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeStroke2() {
        if (!setNegativeStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setNegativeStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StateSettings getNormal;

    /**
     * Getter for the normal state.
     */
    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }

    private String normal;

    /**
     * Setter for the normal state.
     */
    public void setNormal(String normal) {
        if (jsBase == null) {
            this.normal = normal;
        } else {
            this.normal = normal;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".normal(%s)", wrapQuotes(normal)));
                js.setLength(0);
            }
        }
    }

    private UiMarkersFactory getOutlierMarkers;

    /**
     * Getter for series outlier markers.
     */
    public UiMarkersFactory getOutlierMarkers() {
        if (getOutlierMarkers == null)
            getOutlierMarkers = new UiMarkersFactory(jsBase + ".outlierMarkers()");

        return getOutlierMarkers;
    }

    private String outlierMarkers;
    private Boolean outlierMarkers1;
    private String outlierMarkers2;
    private List<StateSettings> setOutlierMarkers = new ArrayList<>();

    /**
     * Setter for series outlier markers.
     */
    public StateSettings setOutlierMarkers(String outlierMarkers) {
        if (jsBase == null) {
            this.outlierMarkers = null;
            this.outlierMarkers1 = null;
            this.outlierMarkers2 = null;
            
            this.outlierMarkers = outlierMarkers;
        } else {
            this.outlierMarkers = outlierMarkers;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".outlierMarkers(%s)", wrapQuotes(outlierMarkers)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".outlierMarkers(%s)", wrapQuotes(outlierMarkers)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOutlierMarkers() {
        if (!setOutlierMarkers.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setOutlierMarkers) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setOutlierMarkers1 = new ArrayList<>();

    /**
     * Setter for series outlier markers.
     */
    public StateSettings setOutlierMarkers(Boolean outlierMarkers1) {
        if (jsBase == null) {
            this.outlierMarkers = null;
            this.outlierMarkers1 = null;
            this.outlierMarkers2 = null;
            
            this.outlierMarkers1 = outlierMarkers1;
        } else {
            this.outlierMarkers1 = outlierMarkers1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".outlierMarkers(%b)", outlierMarkers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".outlierMarkers(%b)", outlierMarkers1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOutlierMarkers1() {
        if (!setOutlierMarkers1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setOutlierMarkers1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill risingFill;
    private List<ScrollerseriesBase> setRisingFill = new ArrayList<>();

    /**
     * Setter for the rising fill settings using an array or a string.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingFill(Fill risingFill) {
        if (jsBase == null) {
            this.risingFill = risingFill;
        } else {
            this.risingFill = risingFill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s)", ((risingFill != null) ? risingFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill" + variableIndex);
        setRisingFill.add(item);
        return item;
    }
    private String generateJSsetRisingFill() {
        if (!setRisingFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color24;
    private Double opacity13;
    private List<ScrollerseriesBase> setRisingFill1 = new ArrayList<>();

    /**
     * Rising fill color with opacity.
     */
    public ScrollerseriesBase risingFill(String color24, Double opacity13) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            
            this.color24 = color24;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.color24 = color24;
            this.opacity13 = opacity13;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %f)", wrapQuotes(color24), opacity13));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill1" + variableIndex);
        setRisingFill1.add(item);
        return item;
    }
    private String generateJSsetRisingFill1() {
        if (!setRisingFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys16;
    private String[] keys17;
    private Double angle4;
    private Boolean mode16;
    private VectorRect mode17;
    private String mode18;
    private Double opacity14;
    private List<ScrollerseriesBase> setRisingFill2 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(GradientKey[] keys16, Boolean mode16, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode16 = mode16;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys16 = keys16;
            this.mode16 = mode16;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %b, %f, %f)", arrayToString(keys16), mode16, angle4, opacity14));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill2" + variableIndex);
        setRisingFill2.add(item);
        return item;
    }
    private String generateJSsetRisingFill2() {
        if (!setRisingFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingFill3 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(GradientKey[] keys16, VectorRect mode17, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode17 = mode17;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys16 = keys16;
            this.mode17 = mode17;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %f, %f)", arrayToString(keys16), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity14));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill3" + variableIndex);
        setRisingFill3.add(item);
        return item;
    }
    private String generateJSsetRisingFill3() {
        if (!setRisingFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingFill4 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(GradientKey[] keys16, String mode18, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode18 = mode18;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys16 = keys16;
            this.mode18 = mode18;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %f, %f)", arrayToString(keys16), wrapQuotes(mode18), angle4, opacity14));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill4" + variableIndex);
        setRisingFill4.add(item);
        return item;
    }
    private String generateJSsetRisingFill4() {
        if (!setRisingFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingFill5 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(String[] keys17, Boolean mode16, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode16 = mode16;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys17 = keys17;
            this.mode16 = mode16;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys17), mode16, angle4, opacity14));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill5" + variableIndex);
        setRisingFill5.add(item);
        return item;
    }
    private String generateJSsetRisingFill5() {
        if (!setRisingFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingFill6 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(String[] keys17, VectorRect mode17, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode17 = mode17;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys17 = keys17;
            this.mode17 = mode17;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity14));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill6" + variableIndex);
        setRisingFill6.add(item);
        return item;
    }
    private String generateJSsetRisingFill6() {
        if (!setRisingFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingFill7 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ScrollerseriesBase risingFill(String[] keys17, String mode18, Double angle4, Double opacity14) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode18 = mode18;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
        } else {
            this.keys17 = keys17;
            this.mode18 = mode18;
            this.angle4 = angle4;
            this.opacity14 = opacity14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), wrapQuotes(mode18), angle4, opacity14));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingFill7" + variableIndex);
        setRisingFill7.add(item);
        return item;
    }
    private String generateJSsetRisingFill7() {
        if (!setRisingFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys18;
    private String[] keys19;
    private Double cx4;
    private Double cy4;
    private GraphicsMathRect mode19;
    private Double opacity15;
    private Double fx4;
    private Double fy4;
    private List<StateSettings> setRisingFill8 = new ArrayList<>();

    /**
     * Radial gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings risingFill(GradientKey[] keys18, Double cx4, Double cy4, GraphicsMathRect mode19, Double opacity15, Double fx4, Double fy4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            
            this.keys18 = keys18;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            
            this.cx4 = cx4;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            
            this.cy4 = cy4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            
            this.mode19 = mode19;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            
            this.opacity15 = opacity15;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            
            this.fx4 = fx4;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            
            this.fy4 = fy4;
        } else {
            this.keys18 = keys18;
            this.cx4 = cx4;
            this.cy4 = cy4;
            this.mode19 = mode19;
            this.opacity15 = opacity15;
            this.fx4 = fx4;
            this.fy4 = fy4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys18), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity15, fx4, fy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys18), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity15, fx4, fy4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill8() {
        if (!setRisingFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setRisingFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setRisingFill9 = new ArrayList<>();

    /**
     * Radial gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public StateSettings risingFill(String[] keys19, Double cx4, Double cy4, GraphicsMathRect mode19, Double opacity15, Double fx4, Double fy4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            
            this.keys19 = keys19;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            
            this.cx4 = cx4;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            
            this.cy4 = cy4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            
            this.mode19 = mode19;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            
            this.opacity15 = opacity15;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            
            this.fx4 = fx4;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            
            this.fy4 = fy4;
        } else {
            this.keys19 = keys19;
            this.cx4 = cx4;
            this.cy4 = cy4;
            this.mode19 = mode19;
            this.opacity15 = opacity15;
            this.fx4 = fx4;
            this.fy4 = fy4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys19), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity15, fx4, fy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys19), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity15, fx4, fy4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill9() {
        if (!setRisingFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setRisingFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings4;
    private PatternFill getRisingHatchFill;

    /**
     * Getter for the rising hatch fill.
     */
    public PatternFill getRisingHatchFill() {
        if (getRisingHatchFill == null)
            getRisingHatchFill = new PatternFill(jsBase + ".risingHatchFill()");

        return getRisingHatchFill;
    }

    private PatternFill patternFillOrTypeOrState5;
    private HatchFill patternFillOrTypeOrState6;
    private HatchFillType patternFillOrTypeOrState7;
    private String patternFillOrTypeOrState8;
    private Boolean patternFillOrTypeOrState9;
    private String color25;
    private Double thickness11;
    private Double size4;
    private List<ScrollerseriesBase> setRisingHatchFill = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(PatternFill patternFillOrTypeOrState5, String color25, Double thickness11, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            
            this.color25 = color25;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
            this.color25 = color25;
            this.thickness11 = thickness11;
            this.size4 = size4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.generateJs() : "null"), wrapQuotes(color25), thickness11, size4));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingHatchFill" + variableIndex);
        setRisingHatchFill.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill() {
        if (!setRisingHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingHatchFill1 = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(HatchFill patternFillOrTypeOrState6, String color25, Double thickness11, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            
            this.color25 = color25;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
            this.color25 = color25;
            this.thickness11 = thickness11;
            this.size4 = size4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.generateJs() : "null"), wrapQuotes(color25), thickness11, size4));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingHatchFill1" + variableIndex);
        setRisingHatchFill1.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill1() {
        if (!setRisingHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingHatchFill2 = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(HatchFillType patternFillOrTypeOrState7, String color25, Double thickness11, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            
            this.color25 = color25;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
            this.color25 = color25;
            this.thickness11 = thickness11;
            this.size4 = size4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", ((patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null"), wrapQuotes(color25), thickness11, size4));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingHatchFill2" + variableIndex);
        setRisingHatchFill2.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill2() {
        if (!setRisingHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingHatchFill3 = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(String patternFillOrTypeOrState8, String color25, Double thickness11, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            
            this.color25 = color25;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
            this.color25 = color25;
            this.thickness11 = thickness11;
            this.size4 = size4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrTypeOrState8), wrapQuotes(color25), thickness11, size4));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingHatchFill3" + variableIndex);
        setRisingHatchFill3.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill3() {
        if (!setRisingHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScrollerseriesBase> setRisingHatchFill4 = new ArrayList<>();

    /**
     * Setter for rising hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public ScrollerseriesBase setRisingHatchFill(Boolean patternFillOrTypeOrState9, String color25, Double thickness11, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            
            this.color25 = color25;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
            this.color25 = color25;
            this.thickness11 = thickness11;
            this.size4 = size4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".risingHatchFill(%b, %s, %f, %f)", patternFillOrTypeOrState9, wrapQuotes(color25), thickness11, size4));
                js.setLength(0);
            }
        }
        ScrollerseriesBase item = new ScrollerseriesBase("setRisingHatchFill4" + variableIndex);
        setRisingHatchFill4.add(item);
        return item;
    }
    private String generateJSsetRisingHatchFill4() {
        if (!setRisingHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScrollerseriesBase item : setRisingHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color26;
    private ColoredFill color27;
    private String color28;
    private Double thickness12;
    private String dashpattern7;
    private StrokeLineJoin lineJoin7;
    private StrokeLineCap lineCap7;
    private List<StateSettings> setRisingStroke = new ArrayList<>();

    /**
     * Setter for rising stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setRisingStroke(Stroke color26, Double thickness12, String dashpattern7, StrokeLineJoin lineJoin7, StrokeLineCap lineCap7) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            
            this.color26 = color26;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            
            this.thickness12 = thickness12;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            
            this.dashpattern7 = dashpattern7;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            
            this.lineJoin7 = lineJoin7;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            
            this.lineCap7 = lineCap7;
        } else {
            this.color26 = color26;
            this.thickness12 = thickness12;
            this.dashpattern7 = dashpattern7;
            this.lineJoin7 = lineJoin7;
            this.lineCap7 = lineCap7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((color26 != null) ? color26.generateJs() : "null"), thickness12, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((color26 != null) ? color26.generateJs() : "null"), thickness12, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingStroke() {
        if (!setRisingStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setRisingStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setRisingStroke1 = new ArrayList<>();

    /**
     * Setter for rising stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setRisingStroke(ColoredFill color27, Double thickness12, String dashpattern7, StrokeLineJoin lineJoin7, StrokeLineCap lineCap7) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            
            this.color27 = color27;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            
            this.thickness12 = thickness12;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            
            this.dashpattern7 = dashpattern7;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            
            this.lineJoin7 = lineJoin7;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            
            this.lineCap7 = lineCap7;
        } else {
            this.color27 = color27;
            this.thickness12 = thickness12;
            this.dashpattern7 = dashpattern7;
            this.lineJoin7 = lineJoin7;
            this.lineCap7 = lineCap7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((color27 != null) ? color27.generateJs() : "null"), thickness12, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", ((color27 != null) ? color27.generateJs() : "null"), thickness12, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingStroke1() {
        if (!setRisingStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setRisingStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setRisingStroke2 = new ArrayList<>();

    /**
     * Setter for rising stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setRisingStroke(String color28, Double thickness12, String dashpattern7, StrokeLineJoin lineJoin7, StrokeLineCap lineCap7) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            
            this.color28 = color28;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            
            this.thickness12 = thickness12;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            
            this.dashpattern7 = dashpattern7;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            
            this.lineJoin7 = lineJoin7;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            
            this.lineCap7 = lineCap7;
        } else {
            this.color28 = color28;
            this.thickness12 = thickness12;
            this.dashpattern7 = dashpattern7;
            this.lineJoin7 = lineJoin7;
            this.lineCap7 = lineCap7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", wrapQuotes(color28), thickness12, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingStroke(%s, %f, %s, %s, %s)", wrapQuotes(color28), thickness12, wrapQuotes(dashpattern7), ((lineJoin7 != null) ? lineJoin7.generateJs() : "null"), ((lineCap7 != null) ? lineCap7.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingStroke2() {
        if (!setRisingStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setRisingStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StateSettings getSelected;

    /**
     * Getter for the selected state.
     */
    public StateSettings getSelected() {
        if (getSelected == null)
            getSelected = new StateSettings(jsBase + ".selected()");

        return getSelected;
    }

    private String selected;

    /**
     * Setter for the selected state.
     */
    public void setSelected(String selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selected(%s)", wrapQuotes(selected)));
                js.setLength(0);
            }
        }
    }

    private Double size5;
    private List<StateSettings> setSize = new ArrayList<>();

    /**
     * Setter for the marker size.
     */
    public StateSettings setSize(Double size5) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            this.size5 = null;
            
            this.size5 = size5;
        } else {
            this.size5 = size5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".size(%f)", size5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%f)", size5));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSize() {
        if (!setSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color29;
    private ColoredFill color30;
    private String color31;
    private Double thickness13;
    private String dashpattern8;
    private StrokeLineJoin lineJoin8;
    private StrokeLineCap lineCap8;
    private List<StateSettings> setStemStroke = new ArrayList<>();

    /**
     * Setter for stem stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setStemStroke(Stroke color29, Double thickness13, String dashpattern8, StrokeLineJoin lineJoin8, StrokeLineCap lineCap8) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            
            this.color29 = color29;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            
            this.thickness13 = thickness13;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            
            this.dashpattern8 = dashpattern8;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            
            this.lineJoin8 = lineJoin8;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            
            this.lineCap8 = lineCap8;
        } else {
            this.color29 = color29;
            this.thickness13 = thickness13;
            this.dashpattern8 = dashpattern8;
            this.lineJoin8 = lineJoin8;
            this.lineCap8 = lineCap8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stemStroke(%s, %f, %s, %s, %s)", ((color29 != null) ? color29.generateJs() : "null"), thickness13, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stemStroke(%s, %f, %s, %s, %s)", ((color29 != null) ? color29.generateJs() : "null"), thickness13, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStemStroke() {
        if (!setStemStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setStemStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setStemStroke1 = new ArrayList<>();

    /**
     * Setter for stem stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setStemStroke(ColoredFill color30, Double thickness13, String dashpattern8, StrokeLineJoin lineJoin8, StrokeLineCap lineCap8) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            
            this.color30 = color30;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            
            this.thickness13 = thickness13;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            
            this.dashpattern8 = dashpattern8;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            
            this.lineJoin8 = lineJoin8;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            
            this.lineCap8 = lineCap8;
        } else {
            this.color30 = color30;
            this.thickness13 = thickness13;
            this.dashpattern8 = dashpattern8;
            this.lineJoin8 = lineJoin8;
            this.lineCap8 = lineCap8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stemStroke(%s, %f, %s, %s, %s)", ((color30 != null) ? color30.generateJs() : "null"), thickness13, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stemStroke(%s, %f, %s, %s, %s)", ((color30 != null) ? color30.generateJs() : "null"), thickness13, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStemStroke1() {
        if (!setStemStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setStemStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setStemStroke2 = new ArrayList<>();

    /**
     * Setter for stem stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setStemStroke(String color31, Double thickness13, String dashpattern8, StrokeLineJoin lineJoin8, StrokeLineCap lineCap8) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            
            this.color31 = color31;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            
            this.thickness13 = thickness13;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            
            this.dashpattern8 = dashpattern8;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            
            this.lineJoin8 = lineJoin8;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            
            this.lineCap8 = lineCap8;
        } else {
            this.color31 = color31;
            this.thickness13 = thickness13;
            this.dashpattern8 = dashpattern8;
            this.lineJoin8 = lineJoin8;
            this.lineCap8 = lineCap8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stemStroke(%s, %f, %s, %s, %s)", wrapQuotes(color31), thickness13, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stemStroke(%s, %f, %s, %s, %s)", wrapQuotes(color31), thickness13, wrapQuotes(dashpattern8), ((lineJoin8 != null) ? lineJoin8.generateJs() : "null"), ((lineCap8 != null) ? lineCap8.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStemStroke2() {
        if (!setStemStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setStemStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color32;
    private ColoredFill color33;
    private String color34;
    private Double thickness14;
    private String dashpattern9;
    private StrokeLineJoin lineJoin9;
    private StrokeLineCap lineCap9;
    private List<StateSettings> setStroke = new ArrayList<>();

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setStroke(Stroke color32, Double thickness14, String dashpattern9, StrokeLineJoin lineJoin9, StrokeLineCap lineCap9) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            this.color32 = null;
            this.color33 = null;
            this.color34 = null;
            
            this.color32 = color32;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            
            this.thickness14 = thickness14;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            
            this.dashpattern9 = dashpattern9;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            
            this.lineJoin9 = lineJoin9;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            
            this.lineCap9 = lineCap9;
        } else {
            this.color32 = color32;
            this.thickness14 = thickness14;
            this.dashpattern9 = dashpattern9;
            this.lineJoin9 = lineJoin9;
            this.lineCap9 = lineCap9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color32 != null) ? color32.generateJs() : "null"), thickness14, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color32 != null) ? color32.generateJs() : "null"), thickness14, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setStroke1 = new ArrayList<>();

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setStroke(ColoredFill color33, Double thickness14, String dashpattern9, StrokeLineJoin lineJoin9, StrokeLineCap lineCap9) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            this.color32 = null;
            this.color33 = null;
            this.color34 = null;
            
            this.color33 = color33;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            
            this.thickness14 = thickness14;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            
            this.dashpattern9 = dashpattern9;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            
            this.lineJoin9 = lineJoin9;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            
            this.lineCap9 = lineCap9;
        } else {
            this.color33 = color33;
            this.thickness14 = thickness14;
            this.dashpattern9 = dashpattern9;
            this.lineJoin9 = lineJoin9;
            this.lineCap9 = lineCap9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color33 != null) ? color33.generateJs() : "null"), thickness14, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color33 != null) ? color33.generateJs() : "null"), thickness14, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setStroke2 = new ArrayList<>();

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setStroke(String color34, Double thickness14, String dashpattern9, StrokeLineJoin lineJoin9, StrokeLineCap lineCap9) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            this.color32 = null;
            this.color33 = null;
            this.color34 = null;
            
            this.color34 = color34;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            
            this.thickness14 = thickness14;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            
            this.dashpattern9 = dashpattern9;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            
            this.lineJoin9 = lineJoin9;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            
            this.lineCap9 = lineCap9;
        } else {
            this.color34 = color34;
            this.thickness14 = thickness14;
            this.dashpattern9 = dashpattern9;
            this.lineJoin9 = lineJoin9;
            this.lineCap9 = lineCap9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color34), thickness14, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color34), thickness14, wrapQuotes(dashpattern9), ((lineJoin9 != null) ? lineJoin9.generateJs() : "null"), ((lineCap9 != null) ? lineCap9.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke trend;
    private ColoredFill trend1;
    private String trend2;
    private Double thickness15;
    private String dashpattern10;
    private StrokeLineJoin lineJoin10;
    private StrokeLineCap lineCap10;
    private List<StateSettings> setTrend = new ArrayList<>();

    /**
     * Setter for annotation trend settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setTrend(Stroke trend, Double thickness15, String dashpattern10, StrokeLineJoin lineJoin10, StrokeLineCap lineCap10) {
        if (jsBase == null) {
            this.trend = null;
            this.trend1 = null;
            this.trend2 = null;
            
            this.trend = trend;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            this.thickness15 = null;
            
            this.thickness15 = thickness15;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            
            this.dashpattern10 = dashpattern10;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            
            this.lineJoin10 = lineJoin10;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            
            this.lineCap10 = lineCap10;
        } else {
            this.trend = trend;
            this.thickness15 = thickness15;
            this.dashpattern10 = dashpattern10;
            this.lineJoin10 = lineJoin10;
            this.lineCap10 = lineCap10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".trend(%s, %f, %s, %s, %s)", ((trend != null) ? trend.generateJs() : "null"), thickness15, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".trend(%s, %f, %s, %s, %s)", ((trend != null) ? trend.generateJs() : "null"), thickness15, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTrend() {
        if (!setTrend.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setTrend) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setTrend1 = new ArrayList<>();

    /**
     * Setter for annotation trend settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setTrend(ColoredFill trend1, Double thickness15, String dashpattern10, StrokeLineJoin lineJoin10, StrokeLineCap lineCap10) {
        if (jsBase == null) {
            this.trend = null;
            this.trend1 = null;
            this.trend2 = null;
            
            this.trend1 = trend1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            this.thickness15 = null;
            
            this.thickness15 = thickness15;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            
            this.dashpattern10 = dashpattern10;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            
            this.lineJoin10 = lineJoin10;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            
            this.lineCap10 = lineCap10;
        } else {
            this.trend1 = trend1;
            this.thickness15 = thickness15;
            this.dashpattern10 = dashpattern10;
            this.lineJoin10 = lineJoin10;
            this.lineCap10 = lineCap10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".trend(%s, %f, %s, %s, %s)", ((trend1 != null) ? trend1.generateJs() : "null"), thickness15, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".trend(%s, %f, %s, %s, %s)", ((trend1 != null) ? trend1.generateJs() : "null"), thickness15, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTrend1() {
        if (!setTrend1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setTrend1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setTrend2 = new ArrayList<>();

    /**
     * Setter for annotation trend settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setTrend(String trend2, Double thickness15, String dashpattern10, StrokeLineJoin lineJoin10, StrokeLineCap lineCap10) {
        if (jsBase == null) {
            this.trend = null;
            this.trend1 = null;
            this.trend2 = null;
            
            this.trend2 = trend2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            this.thickness15 = null;
            
            this.thickness15 = thickness15;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            
            this.dashpattern10 = dashpattern10;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            
            this.lineJoin10 = lineJoin10;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            
            this.lineCap10 = lineCap10;
        } else {
            this.trend2 = trend2;
            this.thickness15 = thickness15;
            this.dashpattern10 = dashpattern10;
            this.lineJoin10 = lineJoin10;
            this.lineCap10 = lineCap10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".trend(%s, %f, %s, %s, %s)", wrapQuotes(trend2), thickness15, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".trend(%s, %f, %s, %s, %s)", wrapQuotes(trend2), thickness15, wrapQuotes(dashpattern10), ((lineJoin10 != null) ? lineJoin10.generateJs() : "null"), ((lineCap10 != null) ? lineCap10.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTrend2() {
        if (!setTrend2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setTrend2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private MarkerType type;
    private String type1;
    private List<StateSettings> setType = new ArrayList<>();

    /**
     * Setter for the marker type.
     */
    public StateSettings setType(MarkerType type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".type(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetType() {
        if (!setType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setType1 = new ArrayList<>();

    /**
     * Setter for the marker type.
     */
    public StateSettings setType(String type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".type(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetType1() {
        if (!setType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiLabelsFactory getUpperLabels;

    /**
     * Getter for upper labels (for pert tasks).
     */
    public UiLabelsFactory getUpperLabels() {
        if (getUpperLabels == null)
            getUpperLabels = new UiLabelsFactory(jsBase + ".upperLabels()");

        return getUpperLabels;
    }

    private String upperLabels;
    private Boolean upperLabels1;
    private List<StateSettings> setUpperLabels = new ArrayList<>();

    /**
     * Setter for upper labels (for pert tasks).
     */
    public StateSettings setUpperLabels(String upperLabels) {
        if (jsBase == null) {
            this.upperLabels = null;
            this.upperLabels1 = null;
            
            this.upperLabels = upperLabels;
        } else {
            this.upperLabels = upperLabels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".upperLabels(%s)", wrapQuotes(upperLabels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".upperLabels(%s)", wrapQuotes(upperLabels)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUpperLabels() {
        if (!setUpperLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setUpperLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setUpperLabels1 = new ArrayList<>();

    /**
     * Setter for upper labels (for pert tasks).
     */
    public StateSettings setUpperLabels(Boolean upperLabels1) {
        if (jsBase == null) {
            this.upperLabels = null;
            this.upperLabels1 = null;
            
            this.upperLabels1 = upperLabels1;
        } else {
            this.upperLabels1 = upperLabels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".upperLabels(%b)", upperLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".upperLabels(%b)", upperLabels1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUpperLabels1() {
        if (!setUpperLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setUpperLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color35;
    private ColoredFill color36;
    private String color37;
    private Double thickness16;
    private String dashpattern11;
    private StrokeLineJoin lineJoin11;
    private StrokeLineCap lineCap11;
    private List<StateSettings> setWhiskerStroke = new ArrayList<>();

    /**
     * Setter for whisker stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setWhiskerStroke(Stroke color35, Double thickness16, String dashpattern11, StrokeLineJoin lineJoin11, StrokeLineCap lineCap11) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            this.color32 = null;
            this.color33 = null;
            this.color34 = null;
            this.color35 = null;
            this.color36 = null;
            this.color37 = null;
            
            this.color35 = color35;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            this.thickness15 = null;
            this.thickness16 = null;
            
            this.thickness16 = thickness16;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            
            this.dashpattern11 = dashpattern11;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            
            this.lineJoin11 = lineJoin11;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            
            this.lineCap11 = lineCap11;
        } else {
            this.color35 = color35;
            this.thickness16 = thickness16;
            this.dashpattern11 = dashpattern11;
            this.lineJoin11 = lineJoin11;
            this.lineCap11 = lineCap11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".whiskerStroke(%s, %f, %s, %s, %s)", ((color35 != null) ? color35.generateJs() : "null"), thickness16, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".whiskerStroke(%s, %f, %s, %s, %s)", ((color35 != null) ? color35.generateJs() : "null"), thickness16, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWhiskerStroke() {
        if (!setWhiskerStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setWhiskerStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setWhiskerStroke1 = new ArrayList<>();

    /**
     * Setter for whisker stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setWhiskerStroke(ColoredFill color36, Double thickness16, String dashpattern11, StrokeLineJoin lineJoin11, StrokeLineCap lineCap11) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            this.color32 = null;
            this.color33 = null;
            this.color34 = null;
            this.color35 = null;
            this.color36 = null;
            this.color37 = null;
            
            this.color36 = color36;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            this.thickness15 = null;
            this.thickness16 = null;
            
            this.thickness16 = thickness16;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            
            this.dashpattern11 = dashpattern11;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            
            this.lineJoin11 = lineJoin11;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            
            this.lineCap11 = lineCap11;
        } else {
            this.color36 = color36;
            this.thickness16 = thickness16;
            this.dashpattern11 = dashpattern11;
            this.lineJoin11 = lineJoin11;
            this.lineCap11 = lineCap11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".whiskerStroke(%s, %f, %s, %s, %s)", ((color36 != null) ? color36.generateJs() : "null"), thickness16, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".whiskerStroke(%s, %f, %s, %s, %s)", ((color36 != null) ? color36.generateJs() : "null"), thickness16, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWhiskerStroke1() {
        if (!setWhiskerStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setWhiskerStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setWhiskerStroke2 = new ArrayList<>();

    /**
     * Setter for whisker stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public StateSettings setWhiskerStroke(String color37, Double thickness16, String dashpattern11, StrokeLineJoin lineJoin11, StrokeLineCap lineCap11) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            this.color31 = null;
            this.color32 = null;
            this.color33 = null;
            this.color34 = null;
            this.color35 = null;
            this.color36 = null;
            this.color37 = null;
            
            this.color37 = color37;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            this.thickness12 = null;
            this.thickness13 = null;
            this.thickness14 = null;
            this.thickness15 = null;
            this.thickness16 = null;
            
            this.thickness16 = thickness16;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            this.dashpattern6 = null;
            this.dashpattern7 = null;
            this.dashpattern8 = null;
            this.dashpattern9 = null;
            this.dashpattern10 = null;
            this.dashpattern11 = null;
            
            this.dashpattern11 = dashpattern11;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            this.lineJoin6 = null;
            this.lineJoin7 = null;
            this.lineJoin8 = null;
            this.lineJoin9 = null;
            this.lineJoin10 = null;
            this.lineJoin11 = null;
            
            this.lineJoin11 = lineJoin11;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            this.lineCap6 = null;
            this.lineCap7 = null;
            this.lineCap8 = null;
            this.lineCap9 = null;
            this.lineCap10 = null;
            this.lineCap11 = null;
            
            this.lineCap11 = lineCap11;
        } else {
            this.color37 = color37;
            this.thickness16 = thickness16;
            this.dashpattern11 = dashpattern11;
            this.lineJoin11 = lineJoin11;
            this.lineCap11 = lineCap11;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".whiskerStroke(%s, %f, %s, %s, %s)", wrapQuotes(color37), thickness16, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".whiskerStroke(%s, %f, %s, %s, %s)", wrapQuotes(color37), thickness16, wrapQuotes(dashpattern11), ((lineJoin11 != null) ? lineJoin11.generateJs() : "null"), ((lineCap11 != null) ? lineCap11.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWhiskerStroke2() {
        if (!setWhiskerStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setWhiskerStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double whiskerWidth;
    private String whiskerWidth1;
    private List<StateSettings> setWhiskerWidth = new ArrayList<>();

    /**
     * Setter for the whisker width.
     */
    public StateSettings setWhiskerWidth(Double whiskerWidth) {
        if (jsBase == null) {
            this.whiskerWidth = null;
            this.whiskerWidth1 = null;
            
            this.whiskerWidth = whiskerWidth;
        } else {
            this.whiskerWidth = whiskerWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".whiskerWidth(%f)", whiskerWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".whiskerWidth(%f)", whiskerWidth));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWhiskerWidth() {
        if (!setWhiskerWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setWhiskerWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StateSettings> setWhiskerWidth1 = new ArrayList<>();

    /**
     * Setter for the whisker width.
     */
    public StateSettings setWhiskerWidth(String whiskerWidth1) {
        if (jsBase == null) {
            this.whiskerWidth = null;
            this.whiskerWidth1 = null;
            
            this.whiskerWidth1 = whiskerWidth1;
        } else {
            this.whiskerWidth1 = whiskerWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".whiskerWidth(%s)", wrapQuotes(whiskerWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".whiskerWidth(%s)", wrapQuotes(whiskerWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWhiskerWidth1() {
        if (!setWhiskerWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StateSettings item : setWhiskerWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetEmptyHatchFill() {
        if (getEmptyHatchFill != null) {
            return getEmptyHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetFallingHatchFill() {
        if (getFallingHatchFill != null) {
            return getFallingHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHeaders() {
        if (getHeaders != null) {
            return getHeaders.generateJs();
        }
        return "";
    }

    private String generateJSgetHovered() {
        if (getHovered != null) {
            return getHovered.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLowerLabels() {
        if (getLowerLabels != null) {
            return getLowerLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetNegativeHatchFill() {
        if (getNegativeHatchFill != null) {
            return getNegativeHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetOutlierMarkers() {
        if (getOutlierMarkers != null) {
            return getOutlierMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetRisingHatchFill() {
        if (getRisingHatchFill != null) {
            return getRisingHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }

    private String generateJSgetUpperLabels() {
        if (getUpperLabels != null) {
            return getUpperLabels.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetEmptyHatchFill());
        jsGetters.append(generateJSgetFallingHatchFill());
        jsGetters.append(generateJSgetHatchFill());
        jsGetters.append(generateJSgetHeaders());
        jsGetters.append(generateJSgetHovered());
        jsGetters.append(generateJSgetLabels());
        jsGetters.append(generateJSgetLowerLabels());
        jsGetters.append(generateJSgetMarkers());
        jsGetters.append(generateJSgetNegativeHatchFill());
        jsGetters.append(generateJSgetNormal());
        jsGetters.append(generateJSgetOutlierMarkers());
        jsGetters.append(generateJSgetRisingHatchFill());
        jsGetters.append(generateJSgetSelected());
        jsGetters.append(generateJSgetUpperLabels());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetDummyFill());
        js.append(generateJSsetDummyFill1());
        js.append(generateJSsetDummyFill2());
        js.append(generateJSsetDummyFill3());
        js.append(generateJSsetDummyFill4());
        js.append(generateJSsetDummyFill5());
        js.append(generateJSsetDummyFill6());
        js.append(generateJSsetDummyFill7());
        js.append(generateJSsetDummyFill8());
        js.append(generateJSsetDummyFill9());
        js.append(generateJSsetDummyStroke());
        js.append(generateJSsetDummyStroke1());
        js.append(generateJSsetDummyStroke2());
        js.append(generateJSsetEmptyFill());
        js.append(generateJSsetEmptyFill1());
        js.append(generateJSsetEmptyFill2());
        js.append(generateJSsetEmptyHatchFill());
        js.append(generateJSsetEmptyHatchFill1());
        js.append(generateJSsetEmptyHatchFill2());
        js.append(generateJSsetEmptyHatchFill3());
        js.append(generateJSsetEmptyHatchFill4());
        js.append(generateJSsetFallingFill());
        js.append(generateJSsetFallingFill1());
        js.append(generateJSsetFallingFill2());
        js.append(generateJSsetFallingFill3());
        js.append(generateJSsetFallingFill4());
        js.append(generateJSsetFallingFill5());
        js.append(generateJSsetFallingFill6());
        js.append(generateJSsetFallingFill7());
        js.append(generateJSsetFallingFill8());
        js.append(generateJSsetFallingFill9());
        js.append(generateJSsetFallingHatchFill());
        js.append(generateJSsetFallingHatchFill1());
        js.append(generateJSsetFallingHatchFill2());
        js.append(generateJSsetFallingHatchFill3());
        js.append(generateJSsetFallingHatchFill4());
        js.append(generateJSsetFallingStroke());
        js.append(generateJSsetFallingStroke1());
        js.append(generateJSsetFallingStroke2());
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
        js.append(generateJSsetFontFamily());
        js.append(generateJSsetFontSize());
        js.append(generateJSsetFontSize1());
        js.append(generateJSsetFontStyle());
        js.append(generateJSsetFontStyle1());
        js.append(generateJSsetFontVariant());
        js.append(generateJSsetFontVariant1());
        js.append(generateJSsetFontWeight());
        js.append(generateJSsetFontWeight1());
        js.append(generateJSsetGrid());
        js.append(generateJSsetGrid1());
        js.append(generateJSsetGrid2());
        js.append(generateJSsetHatchFill());
        js.append(generateJSsetHatchFill1());
        js.append(generateJSsetHatchFill2());
        js.append(generateJSsetHatchFill3());
        js.append(generateJSsetHeaders());
        js.append(generateJSsetHeaders1());
        js.append(generateJSsetHighStroke());
        js.append(generateJSsetHighStroke1());
        js.append(generateJSsetHighStroke2());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetLowStroke());
        js.append(generateJSsetLowStroke1());
        js.append(generateJSsetLowStroke2());
        js.append(generateJSsetLowerLabels());
        js.append(generateJSsetLowerLabels1());
        js.append(generateJSsetMarkers());
        js.append(generateJSsetMarkers1());
        js.append(generateJSsetMedianStroke());
        js.append(generateJSsetMedianStroke1());
        js.append(generateJSsetMedianStroke2());
        js.append(generateJSsetNegativeFill());
        js.append(generateJSsetNegativeFill1());
        js.append(generateJSsetNegativeFill2());
        js.append(generateJSsetNegativeFill3());
        js.append(generateJSsetNegativeFill4());
        js.append(generateJSsetNegativeFill5());
        js.append(generateJSsetNegativeFill6());
        js.append(generateJSsetNegativeFill7());
        js.append(generateJSsetNegativeFill8());
        js.append(generateJSsetNegativeFill9());
        js.append(generateJSsetNegativeHatchFill());
        js.append(generateJSsetNegativeHatchFill1());
        js.append(generateJSsetNegativeHatchFill2());
        js.append(generateJSsetNegativeHatchFill3());
        js.append(generateJSsetNegativeStroke());
        js.append(generateJSsetNegativeStroke1());
        js.append(generateJSsetNegativeStroke2());
        js.append(generateJSsetOutlierMarkers());
        js.append(generateJSsetOutlierMarkers1());
        js.append(generateJSsetRisingFill());
        js.append(generateJSsetRisingFill1());
        js.append(generateJSsetRisingFill2());
        js.append(generateJSsetRisingFill3());
        js.append(generateJSsetRisingFill4());
        js.append(generateJSsetRisingFill5());
        js.append(generateJSsetRisingFill6());
        js.append(generateJSsetRisingFill7());
        js.append(generateJSsetRisingFill8());
        js.append(generateJSsetRisingFill9());
        js.append(generateJSsetRisingHatchFill());
        js.append(generateJSsetRisingHatchFill1());
        js.append(generateJSsetRisingHatchFill2());
        js.append(generateJSsetRisingHatchFill3());
        js.append(generateJSsetRisingHatchFill4());
        js.append(generateJSsetRisingStroke());
        js.append(generateJSsetRisingStroke1());
        js.append(generateJSsetRisingStroke2());
        js.append(generateJSsetSize());
        js.append(generateJSsetStemStroke());
        js.append(generateJSsetStemStroke1());
        js.append(generateJSsetStemStroke2());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetTrend());
        js.append(generateJSsetTrend1());
        js.append(generateJSsetTrend2());
        js.append(generateJSsetType());
        js.append(generateJSsetType1());
        js.append(generateJSsetUpperLabels());
        js.append(generateJSsetUpperLabels1());
        js.append(generateJSsetWhiskerStroke());
        js.append(generateJSsetWhiskerStroke1());
        js.append(generateJSsetWhiskerStroke2());
        js.append(generateJSsetWhiskerWidth());
        js.append(generateJSsetWhiskerWidth1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}