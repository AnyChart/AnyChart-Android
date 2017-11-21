package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Timeline header. Contains a time levels.
 */
public class TimelineHeader extends VisualBaseWithBounds {

    public TimelineHeader() {
        js.setLength(0);
        js.append("var timelineHeader").append(++variableIndex).append(" = anychart.core.gantt.timelineHeader();");
        jsBase = "timelineHeader" + variableIndex;
    }

    protected TimelineHeader(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TimelineHeader(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill backgroundFill;
    private List<TimelineHeader> setBackgroundFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TimelineHeader setBackgroundFill(Fill backgroundFill) {
        if (jsBase == null) {
            this.backgroundFill = backgroundFill;
        } else {
            this.backgroundFill = backgroundFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".backgroundFill(%s)", ((backgroundFill != null) ? backgroundFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s)", ((backgroundFill != null) ? backgroundFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill() {
        if (!setBackgroundFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setBackgroundFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<TimelineHeader> setBackgroundFill1 = new ArrayList<>();

    /**
     * Fill color with opacity.
     */
    public TimelineHeader backgroundFill(String color, Double opacity) {
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
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill1() {
        if (!setBackgroundFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setBackgroundFill1) {
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
    private List<TimelineHeader> setBackgroundFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TimelineHeader backgroundFill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
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
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill2() {
        if (!setBackgroundFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setBackgroundFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TimelineHeader> setBackgroundFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TimelineHeader backgroundFill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill3() {
        if (!setBackgroundFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setBackgroundFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TimelineHeader> setBackgroundFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TimelineHeader backgroundFill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
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
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill4() {
        if (!setBackgroundFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setBackgroundFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TimelineHeader> setBackgroundFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TimelineHeader backgroundFill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
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
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill5() {
        if (!setBackgroundFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setBackgroundFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TimelineHeader> setBackgroundFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TimelineHeader backgroundFill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill6() {
        if (!setBackgroundFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setBackgroundFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TimelineHeader> setBackgroundFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TimelineHeader backgroundFill(String[] keys1, Double angle, Double opacity1, String mode2) {
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
            
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill7() {
        if (!setBackgroundFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setBackgroundFill7) {
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
    private List<TimelineHeader> setBackgroundFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TimelineHeader backgroundFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill8() {
        if (!setBackgroundFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setBackgroundFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TimelineHeader> setBackgroundFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TimelineHeader backgroundFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill9() {
        if (!setBackgroundFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setBackgroundFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private Stroke levelsSeparationStroke;
    private String levelsSeparationStroke1;
    private List<TimelineHeader> setLevelsSeparationStroke = new ArrayList<>();

    /**
     * Setter for the levels separation stroke.
     */
    public TimelineHeader setLevelsSeparationStroke(Stroke levelsSeparationStroke) {
        if (jsBase == null) {
            this.levelsSeparationStroke = null;
            this.levelsSeparationStroke1 = null;
            
            this.levelsSeparationStroke = levelsSeparationStroke;
        } else {
            this.levelsSeparationStroke = levelsSeparationStroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".levelsSeparationStroke(%s)", ((levelsSeparationStroke != null) ? levelsSeparationStroke.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".levelsSeparationStroke(%s)", ((levelsSeparationStroke != null) ? levelsSeparationStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLevelsSeparationStroke() {
        if (!setLevelsSeparationStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setLevelsSeparationStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TimelineHeader> setLevelsSeparationStroke1 = new ArrayList<>();

    /**
     * Setter for the levels separation stroke.
     */
    public TimelineHeader setLevelsSeparationStroke(String levelsSeparationStroke1) {
        if (jsBase == null) {
            this.levelsSeparationStroke = null;
            this.levelsSeparationStroke1 = null;
            
            this.levelsSeparationStroke1 = levelsSeparationStroke1;
        } else {
            this.levelsSeparationStroke1 = levelsSeparationStroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".levelsSeparationStroke(%s)", wrapQuotes(levelsSeparationStroke1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".levelsSeparationStroke(%s)", wrapQuotes(levelsSeparationStroke1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLevelsSeparationStroke1() {
        if (!setLevelsSeparationStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setLevelsSeparationStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TimelineHeader> getLowLevel = new ArrayList<>();

    /**
     * Getter for the low level of header.
     */
    public TimelineHeader getLowLevel(String lowLevel) {
        TimelineHeader item = new TimelineHeader(jsBase + ".lowLevel(" + wrapQuotes(lowLevel) + ")");
        getLowLevel.add(item);
        return item;
    }

    private List<TimelineHeader> getLowLevel1 = new ArrayList<>();

    /**
     * Getter for the low level of header.
     */
    public TimelineHeader getLowLevel(Boolean lowLevel) {
        TimelineHeader item = new TimelineHeader(jsBase + ".lowLevel(" + lowLevel + ")");
        getLowLevel1.add(item);
        return item;
    }

    private String midLevel;
    private Boolean midLevel1;
    private List<TimelineHeader> setMidLevel = new ArrayList<>();

    /**
     * Setter for the middle level of header.
     */
    public TimelineHeader setMidLevel(String midLevel) {
        if (jsBase == null) {
            this.midLevel = null;
            this.midLevel1 = null;
            
            this.midLevel = midLevel;
        } else {
            this.midLevel = midLevel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".midLevel(%s)", wrapQuotes(midLevel)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".midLevel(%s)", wrapQuotes(midLevel)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMidLevel() {
        if (!setMidLevel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setMidLevel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TimelineHeader> setMidLevel1 = new ArrayList<>();

    /**
     * Setter for the middle level of header.
     */
    public TimelineHeader setMidLevel(Boolean midLevel1) {
        if (jsBase == null) {
            this.midLevel = null;
            this.midLevel1 = null;
            
            this.midLevel1 = midLevel1;
        } else {
            this.midLevel1 = midLevel1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".midLevel(%b)", midLevel1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".midLevel(%b)", midLevel1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMidLevel1() {
        if (!setMidLevel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setMidLevel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String topLevel;
    private Boolean topLevel1;
    private List<TimelineHeader> setTopLevel = new ArrayList<>();

    /**
     * Setter for top level of header.
     */
    public TimelineHeader setTopLevel(String topLevel) {
        if (jsBase == null) {
            this.topLevel = null;
            this.topLevel1 = null;
            
            this.topLevel = topLevel;
        } else {
            this.topLevel = topLevel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".topLevel(%s)", wrapQuotes(topLevel)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".topLevel(%s)", wrapQuotes(topLevel)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTopLevel() {
        if (!setTopLevel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setTopLevel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TimelineHeader> setTopLevel1 = new ArrayList<>();

    /**
     * Setter for top level of header.
     */
    public TimelineHeader setTopLevel(Boolean topLevel1) {
        if (jsBase == null) {
            this.topLevel = null;
            this.topLevel1 = null;
            
            this.topLevel1 = topLevel1;
        } else {
            this.topLevel1 = topLevel1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".topLevel(%b)", topLevel1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".topLevel(%b)", topLevel1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTopLevel1() {
        if (!setTopLevel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : setTopLevel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetLowLevel() {
        if (!getLowLevel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : getLowLevel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetLowLevel1() {
        if (!getLowLevel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TimelineHeader item : getLowLevel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetLowLevel());
        jsGetters.append(generateJSgetLowLevel1());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetBackgroundFill());
        js.append(generateJSsetBackgroundFill1());
        js.append(generateJSsetBackgroundFill2());
        js.append(generateJSsetBackgroundFill3());
        js.append(generateJSsetBackgroundFill4());
        js.append(generateJSsetBackgroundFill5());
        js.append(generateJSsetBackgroundFill6());
        js.append(generateJSsetBackgroundFill7());
        js.append(generateJSsetBackgroundFill8());
        js.append(generateJSsetBackgroundFill9());
        js.append(generateJSsetLevelsSeparationStroke());
        js.append(generateJSsetLevelsSeparationStroke1());
        js.append(generateJSsetMidLevel());
        js.append(generateJSsetMidLevel1());
        js.append(generateJSsetTopLevel());
        js.append(generateJSsetTopLevel1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}