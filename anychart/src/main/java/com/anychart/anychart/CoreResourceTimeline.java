package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Resource Chart Timeline element.
 */
public class CoreResourceTimeline extends VisualBaseWithBounds {

    public CoreResourceTimeline() {
        js.setLength(0);
        js.append("var coreResourceTimeline").append(++variableIndex).append(" = anychart.core.resource.timeline();");
        jsBase = "coreResourceTimeline" + variableIndex;
    }

    protected CoreResourceTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CoreResourceTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean adjustOrAdjustByWidth;
    private Boolean[] adjustOrAdjustByWidth1;
    private String adjustOrAdjustByWidth2;
    private Boolean adjustByHeight;
    private List<CoreResourceTimeline> setAdjustFontSize = new ArrayList<>();

    /**
     * Setter for the adjusting font size.
     */
    public CoreResourceTimeline setAdjustFontSize(Boolean adjustOrAdjustByWidth, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustOrAdjustByWidth = null;
            this.adjustOrAdjustByWidth1 = null;
            this.adjustOrAdjustByWidth2 = null;
            
            this.adjustOrAdjustByWidth = adjustOrAdjustByWidth;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustOrAdjustByWidth = adjustOrAdjustByWidth;
            this.adjustByHeight = adjustByHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".adjustFontSize(%b, %b)", adjustOrAdjustByWidth, adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%b, %b)", adjustOrAdjustByWidth, adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize() {
        if (!setAdjustFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setAdjustFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setAdjustFontSize1 = new ArrayList<>();

    /**
     * Setter for the adjusting font size.
     */
    public CoreResourceTimeline setAdjustFontSize(Boolean[] adjustOrAdjustByWidth1, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustOrAdjustByWidth = null;
            this.adjustOrAdjustByWidth1 = null;
            this.adjustOrAdjustByWidth2 = null;
            
            this.adjustOrAdjustByWidth1 = adjustOrAdjustByWidth1;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustOrAdjustByWidth1 = adjustOrAdjustByWidth1;
            this.adjustByHeight = adjustByHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".adjustFontSize(%s, %b)", Arrays.toString(adjustOrAdjustByWidth1), adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%s, %b)", Arrays.toString(adjustOrAdjustByWidth1), adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize1() {
        if (!setAdjustFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setAdjustFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setAdjustFontSize2 = new ArrayList<>();

    /**
     * Setter for the adjusting font size.
     */
    public CoreResourceTimeline setAdjustFontSize(String adjustOrAdjustByWidth2, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustOrAdjustByWidth = null;
            this.adjustOrAdjustByWidth1 = null;
            this.adjustOrAdjustByWidth2 = null;
            
            this.adjustOrAdjustByWidth2 = adjustOrAdjustByWidth2;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustOrAdjustByWidth2 = adjustOrAdjustByWidth2;
            this.adjustByHeight = adjustByHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".adjustFontSize(%s, %b)", wrapQuotes(adjustOrAdjustByWidth2), adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%s, %b)", wrapQuotes(adjustOrAdjustByWidth2), adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize2() {
        if (!setAdjustFontSize2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setAdjustFontSize2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiBackground getBackground;

    /**
     * Getter for the background.
     */
    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private String background;
    private String background1;
    private Boolean background2;
    private List<CoreResourceTimeline> setBackground = new ArrayList<>();

    /**
     * Setter for the background.
     */
    public CoreResourceTimeline setBackground(String background) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background = background;
        } else {
            this.background = background;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".background(%s)", wrapQuotes(background)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".background(%s)", wrapQuotes(background)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackground() {
        if (!setBackground.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setBackground) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setBackground1 = new ArrayList<>();

    /**
     * Setter for the background.
     */
    public CoreResourceTimeline setBackground(Boolean background2) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background2 = background2;
        } else {
            this.background2 = background2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".background(%b)", background2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".background(%b)", background2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackground1() {
        if (!setBackground1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setBackground1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean disablePointerEvents;
    private List<CoreResourceTimeline> setDisablePointerEvents = new ArrayList<>();

    /**
     * Setter for the pointer events setting.
     */
    public CoreResourceTimeline setDisablePointerEvents(Boolean disablePointerEvents) {
        if (jsBase == null) {
            this.disablePointerEvents = disablePointerEvents;
        } else {
            this.disablePointerEvents = disablePointerEvents;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".disablePointerEvents(%b)", disablePointerEvents));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".disablePointerEvents(%b)", disablePointerEvents));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDisablePointerEvents() {
        if (!setDisablePointerEvents.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setDisablePointerEvents) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean drawBottomLine;
    private List<Grid> setDrawBottomLine = new ArrayList<>();

    /**
     * Setter for the bottom line drawing flag.
     */
    public Grid setDrawBottomLine(Boolean drawBottomLine) {
        if (jsBase == null) {
            this.drawBottomLine = drawBottomLine;
        } else {
            this.drawBottomLine = drawBottomLine;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drawBottomLine(%b)", drawBottomLine));
                js.setLength(0);
            }
        }
        Grid item = new Grid("setDrawBottomLine" + variableIndex);
        setDrawBottomLine.add(item);
        return item;
    }
    private String generateJSsetDrawBottomLine() {
        if (!setDrawBottomLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Grid item : setDrawBottomLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean drawLeftLine;
    private List<Grid> setDrawLeftLine = new ArrayList<>();

    /**
     * Setter for the left line drawing flag.
     */
    public Grid setDrawLeftLine(Boolean drawLeftLine) {
        if (jsBase == null) {
            this.drawLeftLine = drawLeftLine;
        } else {
            this.drawLeftLine = drawLeftLine;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drawLeftLine(%b)", drawLeftLine));
                js.setLength(0);
            }
        }
        Grid item = new Grid("setDrawLeftLine" + variableIndex);
        setDrawLeftLine.add(item);
        return item;
    }
    private String generateJSsetDrawLeftLine() {
        if (!setDrawLeftLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Grid item : setDrawLeftLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean drawRightLine;
    private List<Grid> setDrawRightLine = new ArrayList<>();

    /**
     * Setter for the right line drawing flag.
     */
    public Grid setDrawRightLine(Boolean drawRightLine) {
        if (jsBase == null) {
            this.drawRightLine = drawRightLine;
        } else {
            this.drawRightLine = drawRightLine;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drawRightLine(%b)", drawRightLine));
                js.setLength(0);
            }
        }
        Grid item = new Grid("setDrawRightLine" + variableIndex);
        setDrawRightLine.add(item);
        return item;
    }
    private String generateJSsetDrawRightLine() {
        if (!setDrawRightLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Grid item : setDrawRightLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean drawTopLine;
    private List<Grid> setDrawTopLine = new ArrayList<>();

    /**
     * Setter for the top line drawing flag.
     */
    public Grid setDrawTopLine(Boolean drawTopLine) {
        if (jsBase == null) {
            this.drawTopLine = drawTopLine;
        } else {
            this.drawTopLine = drawTopLine;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".drawTopLine(%b)", drawTopLine));
                js.setLength(0);
            }
        }
        Grid item = new Grid("setDrawTopLine" + variableIndex);
        setDrawTopLine.add(item);
        return item;
    }
    private String generateJSsetDrawTopLine() {
        if (!setDrawTopLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Grid item : setDrawTopLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private List<CoreResourceTimeline> setFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CoreResourceTimeline setFill(Fill fill) {
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
            for (CoreResourceTimeline item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<CoreResourceTimeline> setFill1 = new ArrayList<>();

    /**
     * Fill color with opacity.
     */
    public CoreResourceTimeline fill(String color, Double opacity) {
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
            for (CoreResourceTimeline item : setFill1) {
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
    private List<CoreResourceTimeline> setFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CoreResourceTimeline fill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CoreResourceTimeline fill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CoreResourceTimeline fill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CoreResourceTimeline fill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CoreResourceTimeline fill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CoreResourceTimeline fill(String[] keys1, String mode2, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFill7) {
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
    private List<CoreResourceTimeline> setFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CoreResourceTimeline fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CoreResourceTimeline fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private String fontColor;
    private List<CoreResourceTimeline> setFontColor = new ArrayList<>();

    /**
     * Setter for font color settings.
     */
    public CoreResourceTimeline setFontColor(String fontColor) {
        if (jsBase == null) {
            this.fontColor = fontColor;
        } else {
            this.fontColor = fontColor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontColor(%s)", wrapQuotes(fontColor)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontColor(%s)", wrapQuotes(fontColor)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontColor() {
        if (!setFontColor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFontColor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Decoration fontDecoration;
    private String fontDecoration1;
    private List<CoreResourceTimeline> setFontDecoration = new ArrayList<>();

    /**
     * Setter for font decoration settings.
     */
    public CoreResourceTimeline setFontDecoration(Decoration fontDecoration) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration = fontDecoration;
        } else {
            this.fontDecoration = fontDecoration;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontDecoration(%s)", ((fontDecoration != null) ? fontDecoration.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontDecoration(%s)", ((fontDecoration != null) ? fontDecoration.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontDecoration() {
        if (!setFontDecoration.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFontDecoration) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setFontDecoration1 = new ArrayList<>();

    /**
     * Setter for font decoration settings.
     */
    public CoreResourceTimeline setFontDecoration(String fontDecoration1) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration1 = fontDecoration1;
        } else {
            this.fontDecoration1 = fontDecoration1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontDecoration(%s)", wrapQuotes(fontDecoration1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontDecoration(%s)", wrapQuotes(fontDecoration1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontDecoration1() {
        if (!setFontDecoration1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFontDecoration1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontFamily;
    private List<CoreResourceTimeline> setFontFamily = new ArrayList<>();

    /**
     * Setter for font family settings.
     */
    public CoreResourceTimeline setFontFamily(String fontFamily) {
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
            for (CoreResourceTimeline item : setFontFamily) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double fontOpacity;
    private List<CoreResourceTimeline> setFontOpacity = new ArrayList<>();

    /**
     * Setter for font opacity settings.
     */
    public CoreResourceTimeline setFontOpacity(Double fontOpacity) {
        if (jsBase == null) {
            this.fontOpacity = fontOpacity;
        } else {
            this.fontOpacity = fontOpacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontOpacity(%f)", fontOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontOpacity(%f)", fontOpacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontOpacity() {
        if (!setFontOpacity.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFontOpacity) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double fontSize;
    private String fontSize1;
    private List<CoreResourceTimeline> setFontSize = new ArrayList<>();

    /**
     * Setter for font size settings.
     */
    public CoreResourceTimeline setFontSize(Double fontSize) {
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
            for (CoreResourceTimeline item : setFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setFontSize1 = new ArrayList<>();

    /**
     * Setter for font size settings.
     */
    public CoreResourceTimeline setFontSize(String fontSize1) {
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
            for (CoreResourceTimeline item : setFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontStyle;
    private TextFontStyle fontStyle1;
    private List<CoreResourceTimeline> setFontStyle = new ArrayList<>();

    /**
     * Setter for font style settings.
     */
    public CoreResourceTimeline setFontStyle(String fontStyle) {
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
            js.append(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontStyle() {
        if (!setFontStyle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFontStyle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setFontStyle1 = new ArrayList<>();

    /**
     * Setter for font style settings.
     */
    public CoreResourceTimeline setFontStyle(TextFontStyle fontStyle1) {
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
            js.append(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle1 != null) ? fontStyle1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle1 != null) ? fontStyle1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontStyle1() {
        if (!setFontStyle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFontStyle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontVariant;
    private TextFontVariant fontVariant1;
    private List<CoreResourceTimeline> setFontVariant = new ArrayList<>();

    /**
     * Setter for font variant settings.
     */
    public CoreResourceTimeline setFontVariant(String fontVariant) {
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
            js.append(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontVariant() {
        if (!setFontVariant.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFontVariant) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setFontVariant1 = new ArrayList<>();

    /**
     * Setter for font variant settings.
     */
    public CoreResourceTimeline setFontVariant(TextFontVariant fontVariant1) {
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
            js.append(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant1 != null) ? fontVariant1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant1 != null) ? fontVariant1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontVariant1() {
        if (!setFontVariant1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFontVariant1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontWeight;
    private Double fontWeight1;
    private List<CoreResourceTimeline> setFontWeight = new ArrayList<>();

    /**
     * Setter for font weight settings.
     */
    public CoreResourceTimeline setFontWeight(String fontWeight) {
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
            for (CoreResourceTimeline item : setFontWeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setFontWeight1 = new ArrayList<>();

    /**
     * Setter for font weight settings.
     */
    public CoreResourceTimeline setFontWeight(Double fontWeight1) {
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
            for (CoreResourceTimeline item : setFontWeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String format;
    private List<CoreResourceTimeline> setFormat = new ArrayList<>();

    /**
     * Setter for the function content text.<br/>
{docs:Common_Settings/Text_Formatters}Learn more about using format() method.{docs}
     */
    public CoreResourceTimeline setFormat(String format) {
        if (jsBase == null) {
            this.format = format;
        } else {
            this.format = format;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".format(%s)", wrapQuotes(format)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".format(%s)", wrapQuotes(format)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFormat() {
        if (!setFormat.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setFormat) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String hAlign;
    private TextHAlign hAlign1;
    private List<CoreResourceTimeline> setHAlign = new ArrayList<>();

    /**
     * Setter for the text horizontal align settings.
     */
    public CoreResourceTimeline setHAlign(String hAlign) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign = hAlign;
        } else {
            this.hAlign = hAlign;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hAlign(%s)", wrapQuotes(hAlign)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hAlign(%s)", wrapQuotes(hAlign)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHAlign() {
        if (!setHAlign.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setHAlign) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setHAlign1 = new ArrayList<>();

    /**
     * Setter for the text horizontal align settings.
     */
    public CoreResourceTimeline setHAlign(TextHAlign hAlign1) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign1 = hAlign1;
        } else {
            this.hAlign1 = hAlign1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hAlign(%s)", ((hAlign1 != null) ? hAlign1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hAlign(%s)", ((hAlign1 != null) ? hAlign1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHAlign1() {
        if (!setHAlign1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setHAlign1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private CoreResourceTimeline getHolidays;

    /**
     * Getter for holidays.
     */
    public CoreResourceTimeline getHolidays() {
        if (getHolidays == null)
            getHolidays = new CoreResourceTimeline(jsBase + ".holidays()");

        return getHolidays;
    }

    private String holidays;
    private List<CoreResourceTimeline> setHolidays = new ArrayList<>();

    /**
     * Setter for holidays settings.
     */
    public CoreResourceTimeline setHolidays(String holidays) {
        if (jsBase == null) {
            this.holidays = holidays;
        } else {
            this.holidays = holidays;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".holidays(%s)", wrapQuotes(holidays)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".holidays(%s)", wrapQuotes(holidays)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHolidays() {
        if (!setHolidays.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setHolidays) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double letterSpacing;
    private String letterSpacing1;
    private List<CoreResourceTimeline> setLetterSpacing = new ArrayList<>();

    /**
     * Setter for text letter spacing settings.
     */
    public CoreResourceTimeline setLetterSpacing(Double letterSpacing) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing = letterSpacing;
        } else {
            this.letterSpacing = letterSpacing;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".letterSpacing(%f)", letterSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".letterSpacing(%f)", letterSpacing));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLetterSpacing() {
        if (!setLetterSpacing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setLetterSpacing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setLetterSpacing1 = new ArrayList<>();

    /**
     * Setter for text letter spacing settings.
     */
    public CoreResourceTimeline setLetterSpacing(String letterSpacing1) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing1 = letterSpacing1;
        } else {
            this.letterSpacing1 = letterSpacing1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".letterSpacing(%s)", wrapQuotes(letterSpacing1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".letterSpacing(%s)", wrapQuotes(letterSpacing1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLetterSpacing1() {
        if (!setLetterSpacing1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setLetterSpacing1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double levelHeight;
    private List<CoreResourceTimeline> setLevelHeight = new ArrayList<>();

    /**
     * Setter for the level height.
     */
    public CoreResourceTimeline setLevelHeight(Double levelHeight) {
        if (jsBase == null) {
            this.levelHeight = levelHeight;
        } else {
            this.levelHeight = levelHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".levelHeight(%f)", levelHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".levelHeight(%f)", levelHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLevelHeight() {
        if (!setLevelHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setLevelHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double lineHeight;
    private String lineHeight1;
    private List<CoreResourceTimeline> setLineHeight = new ArrayList<>();

    /**
     * Setter for text line height settings.
     */
    public CoreResourceTimeline setLineHeight(Double lineHeight) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight = lineHeight;
        } else {
            this.lineHeight = lineHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lineHeight(%f)", lineHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineHeight(%f)", lineHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLineHeight() {
        if (!setLineHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setLineHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setLineHeight1 = new ArrayList<>();

    /**
     * Setter for text line height settings.
     */
    public CoreResourceTimeline setLineHeight(String lineHeight1) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight1 = lineHeight1;
        } else {
            this.lineHeight1 = lineHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lineHeight(%s)", wrapQuotes(lineHeight1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineHeight(%s)", wrapQuotes(lineHeight1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLineHeight1() {
        if (!setLineHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setLineHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxFontSize;
    private String maxFontSize1;
    private List<CoreResourceTimeline> setMaxFontSize = new ArrayList<>();

    /**
     * Setter for the maximum font size.
     */
    public CoreResourceTimeline setMaxFontSize(Double maxFontSize) {
        if (jsBase == null) {
            this.maxFontSize = null;
            this.maxFontSize1 = null;
            
            this.maxFontSize = maxFontSize;
        } else {
            this.maxFontSize = maxFontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".maxFontSize(%f)", maxFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxFontSize(%f)", maxFontSize));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxFontSize() {
        if (!setMaxFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setMaxFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setMaxFontSize1 = new ArrayList<>();

    /**
     * Setter for the maximum font size.
     */
    public CoreResourceTimeline setMaxFontSize(String maxFontSize1) {
        if (jsBase == null) {
            this.maxFontSize = null;
            this.maxFontSize1 = null;
            
            this.maxFontSize1 = maxFontSize1;
        } else {
            this.maxFontSize1 = maxFontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".maxFontSize(%s)", wrapQuotes(maxFontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxFontSize(%s)", wrapQuotes(maxFontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxFontSize1() {
        if (!setMaxFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setMaxFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minFontSize;
    private String minFontSize1;
    private List<CoreResourceTimeline> setMinFontSize = new ArrayList<>();

    /**
     * Setter for the minimum font size.
     */
    public CoreResourceTimeline setMinFontSize(Double minFontSize) {
        if (jsBase == null) {
            this.minFontSize = null;
            this.minFontSize1 = null;
            
            this.minFontSize = minFontSize;
        } else {
            this.minFontSize = minFontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".minFontSize(%f)", minFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minFontSize(%f)", minFontSize));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinFontSize() {
        if (!setMinFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setMinFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setMinFontSize1 = new ArrayList<>();

    /**
     * Setter for the minimum font size.
     */
    public CoreResourceTimeline setMinFontSize(String minFontSize1) {
        if (jsBase == null) {
            this.minFontSize = null;
            this.minFontSize1 = null;
            
            this.minFontSize1 = minFontSize1;
        } else {
            this.minFontSize1 = minFontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".minFontSize(%s)", wrapQuotes(minFontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minFontSize(%s)", wrapQuotes(minFontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinFontSize1() {
        if (!setMinFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setMinFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Overlay getOverlay;

    /**
     * Getter for the overlay element.
     */
    public Overlay getOverlay() {
        if (getOverlay == null)
            getOverlay = new Overlay(jsBase + ".overlay()");

        return getOverlay;
    }

    private String overlay;
    private Boolean overlay1;
    private List<CoreResourceTimeline> setOverlay = new ArrayList<>();

    /**
     * Setter for the overlay element.
     */
    public CoreResourceTimeline setOverlay(String overlay) {
        if (jsBase == null) {
            this.overlay = null;
            this.overlay1 = null;
            
            this.overlay = overlay;
        } else {
            this.overlay = overlay;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".overlay(%s)", wrapQuotes(overlay)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".overlay(%s)", wrapQuotes(overlay)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOverlay() {
        if (!setOverlay.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setOverlay) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setOverlay1 = new ArrayList<>();

    /**
     * Setter for the overlay element.
     */
    public CoreResourceTimeline setOverlay(Boolean overlay1) {
        if (jsBase == null) {
            this.overlay = null;
            this.overlay1 = null;
            
            this.overlay1 = overlay1;
        } else {
            this.overlay1 = overlay1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".overlay(%b)", overlay1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".overlay(%b)", overlay1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOverlay1() {
        if (!setOverlay1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setOverlay1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UtilsPadding getPadding;

    /**
     * Getter for the padding.
     */
    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;
    private List<CoreResourceTimeline> setPadding = new ArrayList<>();

    /**
     * Setter for paddings in pixels using a single value.
     */
    public CoreResourceTimeline setPadding(Double[] padding) {
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
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding() {
        if (!setPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setPadding1 = new ArrayList<>();

    /**
     * Setter for paddings in pixels using a single value.
     */
    public CoreResourceTimeline setPadding(String[] padding1) {
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
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding1() {
        if (!setPadding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setPadding2 = new ArrayList<>();

    /**
     * Setter for paddings in pixels using a single value.
     */
    public CoreResourceTimeline setPadding(String padding2) {
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
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", wrapQuotes(padding2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding2() {
        if (!setPadding2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setPadding2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;
    private List<CoreResourceTimeline> setPadding3 = new ArrayList<>();

    /**
     * Setter for paddings in pixels using several numbers.
     */
    public CoreResourceTimeline setPadding(String value, String value2, String value4, String value6) {
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
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding3() {
        if (!setPadding3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setPadding3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setPadding4 = new ArrayList<>();

    /**
     * Setter for paddings in pixels using several numbers.
     */
    public CoreResourceTimeline setPadding(Double value1, Double value3, Double value5, Double value7) {
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
            js.append(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding4() {
        if (!setPadding4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setPadding4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean selectable;
    private List<CoreResourceTimeline> setSelectable = new ArrayList<>();

    /**
     * Setter for the text selectable option.
     */
    public CoreResourceTimeline setSelectable(Boolean selectable) {
        if (jsBase == null) {
            this.selectable = selectable;
        } else {
            this.selectable = selectable;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectable(%b)", selectable));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectable(%b)", selectable));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectable() {
        if (!setSelectable.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setSelectable) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<CoreResourceTimeline> setStroke = new ArrayList<>();

    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CoreResourceTimeline setStroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setStroke1 = new ArrayList<>();

    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CoreResourceTimeline setStroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setStroke2 = new ArrayList<>();

    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CoreResourceTimeline setStroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String textDirection;
    private Direction textDirection1;
    private List<CoreResourceTimeline> setTextDirection = new ArrayList<>();

    /**
     * Setter for text direction settings.
     */
    public CoreResourceTimeline setTextDirection(String textDirection) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection = textDirection;
        } else {
            this.textDirection = textDirection;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textDirection(%s)", wrapQuotes(textDirection)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textDirection(%s)", wrapQuotes(textDirection)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextDirection() {
        if (!setTextDirection.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setTextDirection) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setTextDirection1 = new ArrayList<>();

    /**
     * Setter for text direction settings.
     */
    public CoreResourceTimeline setTextDirection(Direction textDirection1) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection1 = textDirection1;
        } else {
            this.textDirection1 = textDirection1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textDirection(%s)", ((textDirection1 != null) ? textDirection1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textDirection(%s)", ((textDirection1 != null) ? textDirection1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextDirection1() {
        if (!setTextDirection1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setTextDirection1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double textIndent;
    private List<CoreResourceTimeline> setTextIndent = new ArrayList<>();

    /**
     * Setter for text-indent settings.
     */
    public CoreResourceTimeline setTextIndent(Double textIndent) {
        if (jsBase == null) {
            this.textIndent = textIndent;
        } else {
            this.textIndent = textIndent;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textIndent(%f)", textIndent));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textIndent(%f)", textIndent));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextIndent() {
        if (!setTextIndent.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setTextIndent) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextOverflow textOverflow;
    private String textOverflow1;
    private List<CoreResourceTimeline> setTextOverflow = new ArrayList<>();

    /**
     * Setter for text overflow settings.
     */
    public CoreResourceTimeline setTextOverflow(TextOverflow textOverflow) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow = textOverflow;
        } else {
            this.textOverflow = textOverflow;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textOverflow(%s)", ((textOverflow != null) ? textOverflow.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textOverflow(%s)", ((textOverflow != null) ? textOverflow.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextOverflow() {
        if (!setTextOverflow.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setTextOverflow) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setTextOverflow1 = new ArrayList<>();

    /**
     * Setter for text overflow settings.
     */
    public CoreResourceTimeline setTextOverflow(String textOverflow1) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow1 = textOverflow1;
        } else {
            this.textOverflow1 = textOverflow1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textOverflow(%s)", wrapQuotes(textOverflow1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textOverflow(%s)", wrapQuotes(textOverflow1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextOverflow1() {
        if (!setTextOverflow1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setTextOverflow1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean useHtml;
    private List<CoreResourceTimeline> setUseHtml = new ArrayList<>();

    /**
     * Setter for the useHTML flag.
     */
    public CoreResourceTimeline setUseHtml(Boolean useHtml) {
        if (jsBase == null) {
            this.useHtml = useHtml;
        } else {
            this.useHtml = useHtml;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".useHtml(%b)", useHtml));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".useHtml(%b)", useHtml));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUseHtml() {
        if (!setUseHtml.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setUseHtml) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String vAlign;
    private TextVAlign vAlign1;
    private List<CoreResourceTimeline> setVAlign = new ArrayList<>();

    /**
     * Setter for text vertical align settings.
     */
    public CoreResourceTimeline setVAlign(String vAlign) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign = vAlign;
        } else {
            this.vAlign = vAlign;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".vAlign(%s)", wrapQuotes(vAlign)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vAlign(%s)", wrapQuotes(vAlign)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetVAlign() {
        if (!setVAlign.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setVAlign) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setVAlign1 = new ArrayList<>();

    /**
     * Setter for text vertical align settings.
     */
    public CoreResourceTimeline setVAlign(TextVAlign vAlign1) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign1 = vAlign1;
        } else {
            this.vAlign1 = vAlign1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".vAlign(%s)", ((vAlign1 != null) ? vAlign1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vAlign(%s)", ((vAlign1 != null) ? vAlign1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetVAlign1() {
        if (!setVAlign1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setVAlign1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private EnumsWordBreak wordBreak;
    private String wordBreak1;
    private List<CoreResourceTimeline> setWordBreak = new ArrayList<>();

    /**
     * Setter for the word-break mode.
     */
    public CoreResourceTimeline setWordBreak(EnumsWordBreak wordBreak) {
        if (jsBase == null) {
            this.wordBreak = null;
            this.wordBreak1 = null;
            
            this.wordBreak = wordBreak;
        } else {
            this.wordBreak = wordBreak;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".wordBreak(%s)", ((wordBreak != null) ? wordBreak.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordBreak(%s)", ((wordBreak != null) ? wordBreak.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordBreak() {
        if (!setWordBreak.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setWordBreak) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setWordBreak1 = new ArrayList<>();

    /**
     * Setter for the word-break mode.
     */
    public CoreResourceTimeline setWordBreak(String wordBreak1) {
        if (jsBase == null) {
            this.wordBreak = null;
            this.wordBreak1 = null;
            
            this.wordBreak1 = wordBreak1;
        } else {
            this.wordBreak1 = wordBreak1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".wordBreak(%s)", wrapQuotes(wordBreak1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordBreak(%s)", wrapQuotes(wordBreak1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordBreak1() {
        if (!setWordBreak1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setWordBreak1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private EnumsWordWrap wordWrap;
    private String wordWrap1;
    private List<CoreResourceTimeline> setWordWrap = new ArrayList<>();

    /**
     * Setter for the word-wrap mode.
     */
    public CoreResourceTimeline setWordWrap(EnumsWordWrap wordWrap) {
        if (jsBase == null) {
            this.wordWrap = null;
            this.wordWrap1 = null;
            
            this.wordWrap = wordWrap;
        } else {
            this.wordWrap = wordWrap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".wordWrap(%s)", ((wordWrap != null) ? wordWrap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordWrap(%s)", ((wordWrap != null) ? wordWrap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordWrap() {
        if (!setWordWrap.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setWordWrap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CoreResourceTimeline> setWordWrap1 = new ArrayList<>();

    /**
     * Setter for the word-wrap mode.
     */
    public CoreResourceTimeline setWordWrap(String wordWrap1) {
        if (jsBase == null) {
            this.wordWrap = null;
            this.wordWrap1 = null;
            
            this.wordWrap1 = wordWrap1;
        } else {
            this.wordWrap1 = wordWrap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".wordWrap(%s)", wrapQuotes(wordWrap1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordWrap(%s)", wrapQuotes(wordWrap1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordWrap1() {
        if (!setWordWrap1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreResourceTimeline item : setWordWrap1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
        }
        return "";
    }

    private String generateJSgetHolidays() {
        if (getHolidays != null) {
            return getHolidays.generateJs();
        }
        return "";
    }

    private String generateJSgetOverlay() {
        if (getOverlay != null) {
            return getOverlay.generateJs();
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

    
        jsGetters.append(generateJSgetBackground());
        jsGetters.append(generateJSgetHolidays());
        jsGetters.append(generateJSgetOverlay());
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

        js.append(generateJSsetAdjustFontSize());
        js.append(generateJSsetAdjustFontSize1());
        js.append(generateJSsetAdjustFontSize2());
        js.append(generateJSsetBackground());
        js.append(generateJSsetBackground1());
        js.append(generateJSsetDisablePointerEvents());
        js.append(generateJSsetDrawBottomLine());
        js.append(generateJSsetDrawLeftLine());
        js.append(generateJSsetDrawRightLine());
        js.append(generateJSsetDrawTopLine());
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
        js.append(generateJSsetFontColor());
        js.append(generateJSsetFontDecoration());
        js.append(generateJSsetFontDecoration1());
        js.append(generateJSsetFontFamily());
        js.append(generateJSsetFontOpacity());
        js.append(generateJSsetFontSize());
        js.append(generateJSsetFontSize1());
        js.append(generateJSsetFontStyle());
        js.append(generateJSsetFontStyle1());
        js.append(generateJSsetFontVariant());
        js.append(generateJSsetFontVariant1());
        js.append(generateJSsetFontWeight());
        js.append(generateJSsetFontWeight1());
        js.append(generateJSsetFormat());
        js.append(generateJSsetHAlign());
        js.append(generateJSsetHAlign1());
        js.append(generateJSsetHolidays());
        js.append(generateJSsetLetterSpacing());
        js.append(generateJSsetLetterSpacing1());
        js.append(generateJSsetLevelHeight());
        js.append(generateJSsetLineHeight());
        js.append(generateJSsetLineHeight1());
        js.append(generateJSsetMaxFontSize());
        js.append(generateJSsetMaxFontSize1());
        js.append(generateJSsetMinFontSize());
        js.append(generateJSsetMinFontSize1());
        js.append(generateJSsetOverlay());
        js.append(generateJSsetOverlay1());
        js.append(generateJSsetPadding());
        js.append(generateJSsetPadding1());
        js.append(generateJSsetPadding2());
        js.append(generateJSsetPadding3());
        js.append(generateJSsetPadding4());
        js.append(generateJSsetSelectable());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetTextDirection());
        js.append(generateJSsetTextDirection1());
        js.append(generateJSsetTextIndent());
        js.append(generateJSsetTextOverflow());
        js.append(generateJSsetTextOverflow1());
        js.append(generateJSsetUseHtml());
        js.append(generateJSsetVAlign());
        js.append(generateJSsetVAlign1());
        js.append(generateJSsetWordBreak());
        js.append(generateJSsetWordBreak1());
        js.append(generateJSsetWordWrap());
        js.append(generateJSsetWordWrap1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}