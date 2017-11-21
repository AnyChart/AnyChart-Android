package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Bubble Series Class.<br/>
<b>Note:</b> Use {@link anychart.charts.Cartesian#bubble} method to get this series.<br/>
{docs:Basic_Charts/Bubble_Chart}Learn more about Bubble series{docs}
 */
public class CartesianSeriesBubble extends CartesianSeriesBaseWithMarkers {

    public CartesianSeriesBubble() {
        js.setLength(0);
        js.append("var cartesianSeriesBubble").append(++variableIndex).append(" = anychart.core.cartesian.series.bubble();");
        jsBase = "cartesianSeriesBubble" + variableIndex;
    }

    protected CartesianSeriesBubble(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CartesianSeriesBubble(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean displayNegative;
    private List<CartesianSeriesBubble> setDisplayNegative = new ArrayList<>();

    /**
     * Setter for negative value option.
     */
    public CartesianSeriesBubble setDisplayNegative(Boolean displayNegative) {
        if (jsBase == null) {
            this.displayNegative = displayNegative;
        } else {
            this.displayNegative = displayNegative;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".displayNegative(%b)", displayNegative));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".displayNegative(%b)", displayNegative));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDisplayNegative() {
        if (!setDisplayNegative.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setDisplayNegative) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private List<CartesianSeriesBubble> setFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble setFill(Fill fill) {
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
            for (CartesianSeriesBubble item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<CartesianSeriesBubble> setFill1 = new ArrayList<>();

    /**
     * Fill color with opacity.
     */
    public CartesianSeriesBubble fill(String color, Double opacity) {
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
            for (CartesianSeriesBubble item : setFill1) {
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
    private List<CartesianSeriesBubble> setFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble fill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
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
            for (CartesianSeriesBubble item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble fill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
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
            for (CartesianSeriesBubble item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble fill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
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
            for (CartesianSeriesBubble item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble fill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
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
            for (CartesianSeriesBubble item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble fill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
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
            for (CartesianSeriesBubble item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble fill(String[] keys1, Double angle, Double opacity1, String mode2) {
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
            for (CartesianSeriesBubble item : setFill7) {
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
    private List<CartesianSeriesBubble> setFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            for (CartesianSeriesBubble item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            for (CartesianSeriesBubble item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private PatternFill getHatchFill;

    /**
     * Getter for hatch fill settings.
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
    private String color1;
    private Double thickness;
    private Double size;
    private List<CartesianSeriesBubble> setHatchFill = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBubble setHatchFill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType = patternFillOrType;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType = patternFillOrType;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(patternFillOrType.generateJs());
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.getJsBase() : "null"), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHatchFill() {
        if (!setHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setHatchFill1 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBubble setHatchFill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType1 = patternFillOrType1;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType1 = patternFillOrType1;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(patternFillOrType1.generateJs());
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.getJsBase() : "null"), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHatchFill1() {
        if (!setHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setHatchFill2 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBubble setHatchFill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType2 = patternFillOrType2;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType2 = patternFillOrType2;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHatchFill2() {
        if (!setHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setHatchFill3 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CartesianSeriesBubble setHatchFill(String patternFillOrType3, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            
            this.patternFillOrType3 = patternFillOrType3;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType3 = patternFillOrType3;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHatchFill3() {
        if (!setHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill negativeFill;
    private List<CartesianSeriesBubble> setNegativeFill = new ArrayList<>();

    /**
     * Setter for negative fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble setNegativeFill(Fill negativeFill) {
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
            for (CartesianSeriesBubble item : setNegativeFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color2;
    private Double opacity3;
    private List<CartesianSeriesBubble> setNegativeFill1 = new ArrayList<>();

    /**
     * Negative fill color with opacity.
     */
    public CartesianSeriesBubble negativeFill(String color2, Double opacity3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
        } else {
            this.color2 = color2;
            this.opacity3 = opacity3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeFill(%s, %f)", wrapQuotes(color2), opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f)", wrapQuotes(color2), opacity3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill1() {
        if (!setNegativeFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeFill1) {
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
    private List<CartesianSeriesBubble> setNegativeFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble negativeFill(GradientKey[] keys4, Double angle1, Double opacity4, Boolean mode4) {
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
            
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %b)", arrayToString(keys4), angle1, opacity4, mode4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %b)", arrayToString(keys4), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill2() {
        if (!setNegativeFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setNegativeFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble negativeFill(GradientKey[] keys4, Double angle1, Double opacity4, VectorRect mode5) {
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
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill3() {
        if (!setNegativeFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setNegativeFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble negativeFill(GradientKey[] keys4, Double angle1, Double opacity4, String mode6) {
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
            
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill4() {
        if (!setNegativeFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setNegativeFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble negativeFill(String[] keys5, Double angle1, Double opacity4, Boolean mode4) {
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
            
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill5() {
        if (!setNegativeFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setNegativeFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble negativeFill(String[] keys5, Double angle1, Double opacity4, VectorRect mode5) {
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
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill6() {
        if (!setNegativeFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setNegativeFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble negativeFill(String[] keys5, Double angle1, Double opacity4, String mode6) {
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
            
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill7() {
        if (!setNegativeFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeFill7) {
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
    private List<CartesianSeriesBubble> setNegativeFill8 = new ArrayList<>();

    /**
     * Radial gradient negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble negativeFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill8() {
        if (!setNegativeFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setNegativeFill9 = new ArrayList<>();

    /**
     * Radial gradient negative fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble negativeFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeFill9() {
        if (!setNegativeFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings1;
    private PatternFill getNegativeHatchFill;

    /**
     * Getter for negative hatch fill settings.
     */
    public PatternFill getNegativeHatchFill() {
        if (getNegativeHatchFill == null)
            getNegativeHatchFill = new PatternFill(jsBase + ".negativeHatchFill()");

        return getNegativeHatchFill;
    }

    private PatternFill patternFillOrType4;
    private HatchFill patternFillOrType5;
    private HatchFillType patternFillOrType6;
    private String patternFillOrType7;
    private String color3;
    private Double thickness1;
    private Double size1;
    private List<CartesianSeriesBubble> setNegativeHatchFill = new ArrayList<>();

    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble setNegativeHatchFill(PatternFill patternFillOrType4, String color3, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            
            this.patternFillOrType4 = patternFillOrType4;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrType4 = patternFillOrType4;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(patternFillOrType4.generateJs());
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType4 != null) ? patternFillOrType4.getJsBase() : "null"), wrapQuotes(color3), thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType4 != null) ? patternFillOrType4.getJsBase() : "null"), wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill() {
        if (!setNegativeHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setNegativeHatchFill1 = new ArrayList<>();

    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble setNegativeHatchFill(HatchFill patternFillOrType5, String color3, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            
            this.patternFillOrType5 = patternFillOrType5;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrType5 = patternFillOrType5;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(patternFillOrType5.generateJs());
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType5 != null) ? patternFillOrType5.getJsBase() : "null"), wrapQuotes(color3), thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType5 != null) ? patternFillOrType5.getJsBase() : "null"), wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill1() {
        if (!setNegativeHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setNegativeHatchFill2 = new ArrayList<>();

    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble setNegativeHatchFill(HatchFillType patternFillOrType6, String color3, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            
            this.patternFillOrType6 = patternFillOrType6;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrType6 = patternFillOrType6;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", ((patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null"), wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill2() {
        if (!setNegativeHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setNegativeHatchFill3 = new ArrayList<>();

    /**
     * Setter for negative hatch fill settings.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CartesianSeriesBubble setNegativeHatchFill(String patternFillOrType7, String color3, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            this.patternFillOrType5 = null;
            this.patternFillOrType6 = null;
            this.patternFillOrType7 = null;
            
            this.patternFillOrType7 = patternFillOrType7;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrType7 = patternFillOrType7;
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.size1 = size1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType7), wrapQuotes(color3), thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType7), wrapQuotes(color3), thickness1, size1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeHatchFill3() {
        if (!setNegativeHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color4;
    private ColoredFill color5;
    private String color6;
    private Double thickness2;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<CartesianSeriesBubble> setNegativeStroke = new ArrayList<>();

    /**
     * Setter for negative stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CartesianSeriesBubble setNegativeStroke(Stroke color4, Double thickness2, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color4 = color4;
            this.thickness2 = thickness2;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color4 != null) ? color4.generateJs() : "null"), thickness2, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color4 != null) ? color4.generateJs() : "null"), thickness2, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeStroke() {
        if (!setNegativeStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setNegativeStroke1 = new ArrayList<>();

    /**
     * Setter for negative stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CartesianSeriesBubble setNegativeStroke(ColoredFill color5, Double thickness2, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color5 = color5;
            this.thickness2 = thickness2;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color5 != null) ? color5.generateJs() : "null"), thickness2, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", ((color5 != null) ? color5.generateJs() : "null"), thickness2, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeStroke1() {
        if (!setNegativeStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setNegativeStroke2 = new ArrayList<>();

    /**
     * Setter for negative stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CartesianSeriesBubble setNegativeStroke(String color6, Double thickness2, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", wrapQuotes(color6), thickness2, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".negativeStroke(%s, %f, %s, %s, %s)", wrapQuotes(color6), thickness2, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNegativeStroke2() {
        if (!setNegativeStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setNegativeStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color7;
    private ColoredFill color8;
    private String color9;
    private Double thickness3;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;
    private List<CartesianSeriesBubble> setStroke = new ArrayList<>();

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CartesianSeriesBubble setStroke(Stroke color7, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            
            this.color7 = color7;
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
            this.color7 = color7;
            this.thickness3 = thickness3;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color7 != null) ? color7.generateJs() : "null"), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color7 != null) ? color7.generateJs() : "null"), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setStroke1 = new ArrayList<>();

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CartesianSeriesBubble setStroke(ColoredFill color8, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            
            this.color8 = color8;
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
            this.color8 = color8;
            this.thickness3 = thickness3;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color8 != null) ? color8.generateJs() : "null"), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color8 != null) ? color8.generateJs() : "null"), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setStroke2 = new ArrayList<>();

    /**
     * Setter for stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CartesianSeriesBubble setStroke(String color9, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            
            this.color9 = color9;
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
            this.color9 = color9;
            this.thickness3 = thickness3;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color9), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color9), thickness3, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetNegativeHatchFill() {
        if (getNegativeHatchFill != null) {
            return getNegativeHatchFill.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetHatchFill());
        jsGetters.append(generateJSgetNegativeHatchFill());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetDisplayNegative());
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
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}