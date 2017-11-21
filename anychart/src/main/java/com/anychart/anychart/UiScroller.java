package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Scroller ui element
 */
public class UiScroller extends VisualBase {

    public UiScroller() {
        js.setLength(0);
        js.append("var uiScroller").append(++variableIndex).append(" = anychart.core.ui.scroller();");
        jsBase = "uiScroller" + variableIndex;
    }

    protected UiScroller(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected UiScroller(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean allowRangeChange;
    private List<UiScroller> setAllowRangeChange = new ArrayList<>();

    /**
     * Setter for the mode of the range changing. If the range changing is allowed.
     */
    public UiScroller setAllowRangeChange(Boolean allowRangeChange) {
        if (jsBase == null) {
            this.allowRangeChange = allowRangeChange;
        } else {
            this.allowRangeChange = allowRangeChange;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".allowRangeChange(%b)", allowRangeChange));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".allowRangeChange(%b)", allowRangeChange));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAllowRangeChange() {
        if (!setAllowRangeChange.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setAllowRangeChange) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean autoHide;
    private List<UiScroller> setAutoHide = new ArrayList<>();

    /**
     * Setter for scroller auto hide mode.
     */
    public UiScroller setAutoHide(Boolean autoHide) {
        if (jsBase == null) {
            this.autoHide = autoHide;
        } else {
            this.autoHide = autoHide;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".autoHide(%b)", autoHide));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".autoHide(%b)", autoHide));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAutoHide() {
        if (!setAutoHide.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setAutoHide) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private List<UiScroller> setFill = new ArrayList<>();

    /**
     * Setter for scroller fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller setFill(Fill fill) {
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
            for (UiScroller item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<UiScroller> setFill1 = new ArrayList<>();

    /**
     * Scroller fill color with opacity.
     */
    public UiScroller fill(String color, Double opacity) {
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
            for (UiScroller item : setFill1) {
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
    private List<UiScroller> setFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller fill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
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
            for (UiScroller item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller fill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
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
            for (UiScroller item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller fill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
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
            for (UiScroller item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller fill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
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
            for (UiScroller item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller fill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
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
            for (UiScroller item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller fill(String[] keys1, Double angle, Double opacity1, String mode2) {
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
            for (UiScroller item : setFill7) {
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
    private List<UiScroller> setFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            for (UiScroller item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            for (UiScroller item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private Double height;
    private String height1;
    private List<UiScroller> setHeight = new ArrayList<>();

    /**
     * Setter for the scroller height.
     */
    public UiScroller setHeight(Double height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".height(%f)", height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%f)", height));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHeight() {
        if (!setHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setHeight1 = new ArrayList<>();

    /**
     * Setter for the scroller height.
     */
    public UiScroller setHeight(String height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".height(%s)", wrapQuotes(height1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%s)", wrapQuotes(height1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHeight1() {
        if (!setHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxHeight;
    private String maxHeight1;
    private List<UiScroller> setMaxHeight = new ArrayList<>();

    /**
     * Setter for the scroller maximum height.
     */
    public UiScroller setMaxHeight(Double maxHeight) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight = maxHeight;
        } else {
            this.maxHeight = maxHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxHeight(%f)", maxHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxHeight(%f)", maxHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxHeight() {
        if (!setMaxHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setMaxHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setMaxHeight1 = new ArrayList<>();

    /**
     * Setter for the scroller maximum height.
     */
    public UiScroller setMaxHeight(String maxHeight1) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight1 = maxHeight1;
        } else {
            this.maxHeight1 = maxHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxHeight(%s)", wrapQuotes(maxHeight1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxHeight(%s)", wrapQuotes(maxHeight1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxHeight1() {
        if (!setMaxHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setMaxHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minHeight;
    private String minHeight1;
    private List<UiScroller> setMinHeight = new ArrayList<>();

    /**
     * Setter for the scroller minimum height.
     */
    public UiScroller setMinHeight(Double minHeight) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight = minHeight;
        } else {
            this.minHeight = minHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minHeight(%f)", minHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minHeight(%f)", minHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinHeight() {
        if (!setMinHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setMinHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setMinHeight1 = new ArrayList<>();

    /**
     * Setter for the scroller minimum height.
     */
    public UiScroller setMinHeight(String minHeight1) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight1 = minHeight1;
        } else {
            this.minHeight1 = minHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minHeight(%s)", wrapQuotes(minHeight1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minHeight(%s)", wrapQuotes(minHeight1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinHeight1() {
        if (!setMinHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setMinHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Orientation orientation;
    private String orientation1;
    private List<UiScroller> setOrientation = new ArrayList<>();

    /**
     * Setter for the scroller orientation.
     */
    public UiScroller setOrientation(Orientation orientation) {
        if (jsBase == null) {
            this.orientation = null;
            this.orientation1 = null;
            
            this.orientation = orientation;
        } else {
            this.orientation = orientation;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".orientation(%s)", ((orientation != null) ? orientation.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".orientation(%s)", ((orientation != null) ? orientation.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOrientation() {
        if (!setOrientation.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setOrientation) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setOrientation1 = new ArrayList<>();

    /**
     * Setter for the scroller orientation.
     */
    public UiScroller setOrientation(String orientation1) {
        if (jsBase == null) {
            this.orientation = null;
            this.orientation1 = null;
            
            this.orientation1 = orientation1;
        } else {
            this.orientation1 = orientation1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".orientation(%s)", wrapQuotes(orientation1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".orientation(%s)", wrapQuotes(orientation1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOrientation1() {
        if (!setOrientation1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setOrientation1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke outlineStroke;
    private ColoredFill outlineStroke1;
    private String outlineStroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<UiScroller> setOutlineStroke = new ArrayList<>();

    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiScroller setOutlineStroke(Stroke outlineStroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.outlineStroke = null;
            this.outlineStroke1 = null;
            this.outlineStroke2 = null;
            
            this.outlineStroke = outlineStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.outlineStroke = outlineStroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".outlineStroke(%s, %f, %s, %s, %s)", ((outlineStroke != null) ? outlineStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".outlineStroke(%s, %f, %s, %s, %s)", ((outlineStroke != null) ? outlineStroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOutlineStroke() {
        if (!setOutlineStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setOutlineStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setOutlineStroke1 = new ArrayList<>();

    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiScroller setOutlineStroke(ColoredFill outlineStroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.outlineStroke = null;
            this.outlineStroke1 = null;
            this.outlineStroke2 = null;
            
            this.outlineStroke1 = outlineStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.outlineStroke1 = outlineStroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".outlineStroke(%s, %f, %s, %s, %s)", ((outlineStroke1 != null) ? outlineStroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".outlineStroke(%s, %f, %s, %s, %s)", ((outlineStroke1 != null) ? outlineStroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOutlineStroke1() {
        if (!setOutlineStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setOutlineStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setOutlineStroke2 = new ArrayList<>();

    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiScroller setOutlineStroke(String outlineStroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.outlineStroke = null;
            this.outlineStroke1 = null;
            this.outlineStroke2 = null;
            
            this.outlineStroke2 = outlineStroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.outlineStroke2 = outlineStroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".outlineStroke(%s, %f, %s, %s, %s)", wrapQuotes(outlineStroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".outlineStroke(%s, %f, %s, %s, %s)", wrapQuotes(outlineStroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOutlineStroke2() {
        if (!setOutlineStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setOutlineStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill selectedFill;
    private List<UiScroller> setSelectedFill = new ArrayList<>();

    /**
     * Setter for scroller fill settings in selected mode using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller setSelectedFill(Fill selectedFill) {
        if (jsBase == null) {
            this.selectedFill = selectedFill;
        } else {
            this.selectedFill = selectedFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectedFill(%s)", ((selectedFill != null) ? selectedFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedFill(%s)", ((selectedFill != null) ? selectedFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectedFill() {
        if (!setSelectedFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setSelectedFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color1;
    private Double opacity3;
    private List<UiScroller> setSelectedFill1 = new ArrayList<>();

    /**
     * Scroller fill color in selected mode with opacity.
     */
    public UiScroller selectedFill(String color1, Double opacity3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
        } else {
            this.color1 = color1;
            this.opacity3 = opacity3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectedFill(%s, %f)", wrapQuotes(color1), opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedFill(%s, %f)", wrapQuotes(color1), opacity3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectedFill1() {
        if (!setSelectedFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setSelectedFill1) {
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
    private Double opacity4;
    private List<UiScroller> setSelectedFill2 = new ArrayList<>();

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller selectedFill(GradientKey[] keys4, Double angle1, Double opacity4, Boolean mode4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
        } else {
            this.keys4 = keys4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode4 = mode4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectedFill(%s, %f, %f, %b)", arrayToString(keys4), angle1, opacity4, mode4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedFill(%s, %f, %f, %b)", arrayToString(keys4), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectedFill2() {
        if (!setSelectedFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setSelectedFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setSelectedFill3 = new ArrayList<>();

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller selectedFill(GradientKey[] keys4, Double angle1, Double opacity4, VectorRect mode5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
        } else {
            this.keys4 = keys4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode5 = mode5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode5.generateJs());
            js.append(String.format(Locale.US, ".selectedFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectedFill3() {
        if (!setSelectedFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setSelectedFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setSelectedFill4 = new ArrayList<>();

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller selectedFill(GradientKey[] keys4, Double angle1, Double opacity4, String mode6) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
        } else {
            this.keys4 = keys4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode6 = mode6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectedFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectedFill4() {
        if (!setSelectedFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setSelectedFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setSelectedFill5 = new ArrayList<>();

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller selectedFill(String[] keys5, Double angle1, Double opacity4, Boolean mode4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
        } else {
            this.keys5 = keys5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode4 = mode4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectedFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectedFill5() {
        if (!setSelectedFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setSelectedFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setSelectedFill6 = new ArrayList<>();

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller selectedFill(String[] keys5, Double angle1, Double opacity4, VectorRect mode5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
        } else {
            this.keys5 = keys5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode5 = mode5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode5.generateJs());
            js.append(String.format(Locale.US, ".selectedFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectedFill6() {
        if (!setSelectedFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setSelectedFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setSelectedFill7 = new ArrayList<>();

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller selectedFill(String[] keys5, Double angle1, Double opacity4, String mode6) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
        } else {
            this.keys5 = keys5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            this.mode6 = mode6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectedFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectedFill7() {
        if (!setSelectedFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setSelectedFill7) {
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
    private Double opacity5;
    private Double fx1;
    private Double fy1;
    private List<UiScroller> setSelectedFill8 = new ArrayList<>();

    /**
     * Radial gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller selectedFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            
            this.opacity5 = opacity5;
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
            this.opacity5 = opacity5;
            this.fx1 = fx1;
            this.fy1 = fy1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode7.generateJs());
            js.append(String.format(Locale.US, ".selectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectedFill8() {
        if (!setSelectedFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setSelectedFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setSelectedFill9 = new ArrayList<>();

    /**
     * Radial gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiScroller selectedFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            
            this.opacity5 = opacity5;
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
            this.opacity5 = opacity5;
            this.fx1 = fx1;
            this.fy1 = fy1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode7.generateJs());
            js.append(String.format(Locale.US, ".selectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectedFill9() {
        if (!setSelectedFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setSelectedFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings1;
    private Thumbs getThumbs;

    /**
     * Getter for the thumbs.
     */
    public Thumbs getThumbs() {
        if (getThumbs == null)
            getThumbs = new Thumbs(jsBase + ".thumbs()");

        return getThumbs;
    }

    private Boolean thumbs;
    private String thumbs1;
    private List<UiScroller> setThumbs = new ArrayList<>();

    /**
     * Setter for the thumbs settings.
     */
    public UiScroller setThumbs(Boolean thumbs) {
        if (jsBase == null) {
            this.thumbs = null;
            this.thumbs1 = null;
            
            this.thumbs = thumbs;
        } else {
            this.thumbs = thumbs;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".thumbs(%b)", thumbs));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".thumbs(%b)", thumbs));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetThumbs() {
        if (!setThumbs.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setThumbs) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiScroller> setThumbs1 = new ArrayList<>();

    /**
     * Setter for the thumbs settings.
     */
    public UiScroller setThumbs(String thumbs1) {
        if (jsBase == null) {
            this.thumbs = null;
            this.thumbs1 = null;
            
            this.thumbs1 = thumbs1;
        } else {
            this.thumbs1 = thumbs1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".thumbs(%s)", wrapQuotes(thumbs1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".thumbs(%s)", wrapQuotes(thumbs1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetThumbs1() {
        if (!setThumbs1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiScroller item : setThumbs1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetThumbs() {
        if (getThumbs != null) {
            return getThumbs.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetThumbs());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetAllowRangeChange());
        js.append(generateJSsetAutoHide());
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
        js.append(generateJSsetHeight());
        js.append(generateJSsetHeight1());
        js.append(generateJSsetMaxHeight());
        js.append(generateJSsetMaxHeight1());
        js.append(generateJSsetMinHeight());
        js.append(generateJSsetMinHeight1());
        js.append(generateJSsetOrientation());
        js.append(generateJSsetOrientation1());
        js.append(generateJSsetOutlineStroke());
        js.append(generateJSsetOutlineStroke1());
        js.append(generateJSsetOutlineStroke2());
        js.append(generateJSsetSelectedFill());
        js.append(generateJSsetSelectedFill1());
        js.append(generateJSsetSelectedFill2());
        js.append(generateJSsetSelectedFill3());
        js.append(generateJSsetSelectedFill4());
        js.append(generateJSsetSelectedFill5());
        js.append(generateJSsetSelectedFill6());
        js.append(generateJSsetSelectedFill7());
        js.append(generateJSsetSelectedFill8());
        js.append(generateJSsetSelectedFill9());
        js.append(generateJSsetThumbs());
        js.append(generateJSsetThumbs1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}