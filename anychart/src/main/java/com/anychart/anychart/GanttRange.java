package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Gantt range marker.
 */
public class GanttRange extends VisualBase {

    public GanttRange() {
        js.setLength(0);
        js.append("var ganttRange").append(++variableIndex).append(" = anychart.core.axisMarkers.ganttRange();");
        jsBase = "ganttRange" + variableIndex;
    }

    protected GanttRange(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected GanttRange(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill fill;
    private List<GanttRange> setFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GanttRange setFill(Fill fill) {
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
            for (GanttRange item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<GanttRange> setFill1 = new ArrayList<>();

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public GanttRange fill(String color, Double opacity) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill1() {
        if (!setFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setFill1) {
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
    private List<GanttRange> setFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GanttRange fill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttRange> setFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GanttRange fill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttRange> setFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GanttRange fill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttRange> setFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GanttRange fill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttRange> setFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GanttRange fill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttRange> setFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GanttRange fill(String[] keys1, Double angle, Double opacity1, String mode2) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setFill7) {
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
    private List<GanttRange> setFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GanttRange fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttRange> setFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GanttRange fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private Double from;
    private GanttDateTimeMarkers from1;
    private String from2;
    private List<GanttRange> setFrom = new ArrayList<>();

    /**
     * Setter for the starting marker value.
     */
    public GanttRange setFrom(Double from) {
        if (jsBase == null) {
            this.from = null;
            this.from1 = null;
            this.from2 = null;
            
            this.from = from;
        } else {
            this.from = from;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".from(%f)", from));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".from(%f)", from));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFrom() {
        if (!setFrom.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setFrom) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttRange> setFrom1 = new ArrayList<>();

    /**
     * Setter for the starting marker value.
     */
    public GanttRange setFrom(GanttDateTimeMarkers from1) {
        if (jsBase == null) {
            this.from = null;
            this.from1 = null;
            this.from2 = null;
            
            this.from1 = from1;
        } else {
            this.from1 = from1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".from(%s)", ((from1 != null) ? from1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".from(%s)", ((from1 != null) ? from1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFrom1() {
        if (!setFrom1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setFrom1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttRange> setFrom2 = new ArrayList<>();

    /**
     * Setter for the starting marker value.
     */
    public GanttRange setFrom(String from2) {
        if (jsBase == null) {
            this.from = null;
            this.from1 = null;
            this.from2 = null;
            
            this.from2 = from2;
        } else {
            this.from2 = from2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".from(%s)", wrapQuotes(from2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".from(%s)", wrapQuotes(from2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFrom2() {
        if (!setFrom2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setFrom2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Layout layout;
    private String layout1;
    private List<GanttRange> setLayout = new ArrayList<>();

    /**
     * Setter for the Gantt chart range marker layout.
<b>Note:</b> The layout method will not work here, only "vertical" layout are available in Gantt Chart.
     */
    public GanttRange setLayout(Layout layout) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout = layout;
        } else {
            this.layout = layout;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".layout(%s)", ((layout != null) ? layout.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", ((layout != null) ? layout.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLayout() {
        if (!setLayout.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setLayout) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttRange> setLayout1 = new ArrayList<>();

    /**
     * Setter for the Gantt chart range marker layout.
<b>Note:</b> The layout method will not work here, only "vertical" layout are available in Gantt Chart.
     */
    public GanttRange setLayout(String layout1) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout1 = layout1;
        } else {
            this.layout1 = layout1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".layout(%s)", wrapQuotes(layout1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", wrapQuotes(layout1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLayout1() {
        if (!setLayout1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setLayout1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GanttDateTime getScale;

    /**
     * Getter for the Gantt chart range marker scale.
     */
    public GanttDateTime getScale() {
        if (getScale == null)
            getScale = new GanttDateTime(jsBase + ".scale()");

        return getScale;
    }

    private GanttDateTime scale;
    private List<GanttRange> setScale = new ArrayList<>();

    /**
     * Setter for the Gantt chart range marker scale.
<b>Note:</b> The scale method will not work here, only "dateTime" scale are available in Gantt Chart.
{docs:Gantt_Chart/Timeline#special_features}Learn more about scale.{docs}
     */
    public GanttRange setScale(GanttDateTime scale) {
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
        }
        return this;
    }
    private String generateJSsetScale() {
        if (!setScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double to;
    private GanttDateTimeMarkers to1;
    private String to2;
    private List<GanttRange> setTo = new ArrayList<>();

    /**
     * Setter for the ending marker value.
     */
    public GanttRange setTo(Double to) {
        if (jsBase == null) {
            this.to = null;
            this.to1 = null;
            this.to2 = null;
            
            this.to = to;
        } else {
            this.to = to;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".to(%f)", to));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".to(%f)", to));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTo() {
        if (!setTo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setTo) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttRange> setTo1 = new ArrayList<>();

    /**
     * Setter for the ending marker value.
     */
    public GanttRange setTo(GanttDateTimeMarkers to1) {
        if (jsBase == null) {
            this.to = null;
            this.to1 = null;
            this.to2 = null;
            
            this.to1 = to1;
        } else {
            this.to1 = to1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".to(%s)", ((to1 != null) ? to1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".to(%s)", ((to1 != null) ? to1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTo1() {
        if (!setTo1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setTo1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttRange> setTo2 = new ArrayList<>();

    /**
     * Setter for the ending marker value.
     */
    public GanttRange setTo(String to2) {
        if (jsBase == null) {
            this.to = null;
            this.to1 = null;
            this.to2 = null;
            
            this.to2 = to2;
        } else {
            this.to2 = to2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".to(%s)", wrapQuotes(to2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".to(%s)", wrapQuotes(to2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTo2() {
        if (!setTo2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttRange item : setTo2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetScale());

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
        js.append(generateJSsetFrom());
        js.append(generateJSsetFrom1());
        js.append(generateJSsetFrom2());
        js.append(generateJSsetLayout());
        js.append(generateJSsetLayout1());
        js.append(generateJSsetScale());
        js.append(generateJSsetTo());
        js.append(generateJSsetTo1());
        js.append(generateJSsetTo2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}