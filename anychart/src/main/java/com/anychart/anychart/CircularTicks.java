package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Axis ticks class.
 */
public class CircularTicks extends VisualBase {

    public CircularTicks() {
        js.setLength(0);
        js.append("var circularTicks").append(++variableIndex).append(" = anychart.core.axes.circularTicks();");
        jsBase = "circularTicks" + variableIndex;
    }

    protected CircularTicks(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CircularTicks(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill fill;
    private String fill1;
    private List<CircularTicks> setFill = new ArrayList<>();

    /**
     * Setter for ticks fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularTicks setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = null;
            this.fill1 = null;
            
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
            for (CircularTicks item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setFill1 = new ArrayList<>();

    /**
     * Setter for ticks fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularTicks setFill(String fill1) {
        if (jsBase == null) {
            this.fill = null;
            this.fill1 = null;
            
            this.fill1 = fill1;
        } else {
            this.fill1 = fill1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s)", wrapQuotes(fill1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", wrapQuotes(fill1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill1() {
        if (!setFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<CircularTicks> setFill2 = new ArrayList<>();

    /**
     * Ticks fill color with opacity. Fill as a string or an object.
     */
    public CircularTicks fill(String color, Double opacity) {
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
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setFill2) {
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
    private List<CircularTicks> setFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularTicks fill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
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
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularTicks fill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
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
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularTicks fill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
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
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularTicks fill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
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
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularTicks fill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
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
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setFill8 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularTicks fill(String[] keys1, Double angle, Double opacity1, String mode2) {
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
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setFill8) {
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
    private List<CircularTicks> setFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularTicks fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setFill10 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public CircularTicks fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
    private String generateJSsetFill10() {
        if (!setFill10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setFill10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private PatternFill getHatchFill;

    /**
     * Getter for ticks hatch fill settings.
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
    private String color1;
    private Double thickness;
    private Double size;
    private List<CircularTicks> setHatchFill = new ArrayList<>();

    /**
     * Setter for ticks hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CircularTicks setHatchFill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
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
            for (CircularTicks item : setHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setHatchFill1 = new ArrayList<>();

    /**
     * Setter for ticks hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CircularTicks setHatchFill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
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
            for (CircularTicks item : setHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setHatchFill2 = new ArrayList<>();

    /**
     * Setter for ticks hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CircularTicks setHatchFill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
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
            for (CircularTicks item : setHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setHatchFill3 = new ArrayList<>();

    /**
     * Setter for ticks hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CircularTicks setHatchFill(String patternFillOrType3, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
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
            for (CircularTicks item : setHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setHatchFill4 = new ArrayList<>();

    /**
     * Setter for ticks hatch fill settings.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public CircularTicks setHatchFill(Boolean patternFillOrType4, String color1, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrType = null;
            this.patternFillOrType1 = null;
            this.patternFillOrType2 = null;
            this.patternFillOrType3 = null;
            this.patternFillOrType4 = null;
            
            this.patternFillOrType4 = patternFillOrType4;
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrType4 = patternFillOrType4;
            this.color1 = color1;
            this.thickness = thickness;
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hatchFill(%b, %s, %f, %f)", patternFillOrType4, wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%b, %s, %f, %f)", patternFillOrType4, wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHatchFill4() {
        if (!setHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double length;
    private String length1;
    private List<CircularTicks> setLength = new ArrayList<>();

    /**
     * Setter for ticks length.
     */
    public CircularTicks setLength(Double length) {
        if (jsBase == null) {
            this.length = null;
            this.length1 = null;
            
            this.length = length;
        } else {
            this.length = length;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".length(%f)", length));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".length(%f)", length));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLength() {
        if (!setLength.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setLength) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setLength1 = new ArrayList<>();

    /**
     * Setter for ticks length.
     */
    public CircularTicks setLength(String length1) {
        if (jsBase == null) {
            this.length = null;
            this.length1 = null;
            
            this.length1 = length1;
        } else {
            this.length1 = length1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".length(%s)", wrapQuotes(length1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".length(%s)", wrapQuotes(length1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLength1() {
        if (!setLength1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setLength1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private SidePosition position;
    private String position1;
    private List<CircularTicks> setPosition = new ArrayList<>();

    /**
     * Setter for ticks position.
     */
    public CircularTicks setPosition(SidePosition position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition() {
        if (!setPosition.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setPosition) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setPosition1 = new ArrayList<>();

    /**
     * Setter for ticks position.
     */
    public CircularTicks setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition1() {
        if (!setPosition1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setPosition1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke stroke;
    private String stroke1;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<CircularTicks> setStroke = new ArrayList<>();

    /**
     * Setter for ticks stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CircularTicks setStroke(Stroke stroke, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setStroke1 = new ArrayList<>();

    /**
     * Setter for ticks stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public CircularTicks setStroke(String stroke1, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke1), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(stroke1), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CircularTicks item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private MarkerType type;
    private String type1;
    private List<CircularTicks> setType = new ArrayList<>();

    /**
     * Setter for ticks type.
     */
    public CircularTicks setType(MarkerType type) {
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
            for (CircularTicks item : setType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CircularTicks> setType1 = new ArrayList<>();

    /**
     * Setter for ticks type.
     */
    public CircularTicks setType(String type1) {
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
            for (CircularTicks item : setType1) {
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
        js.append(generateJSsetFill10());
        js.append(generateJSsetHatchFill());
        js.append(generateJSsetHatchFill1());
        js.append(generateJSsetHatchFill2());
        js.append(generateJSsetHatchFill3());
        js.append(generateJSsetHatchFill4());
        js.append(generateJSsetLength());
        js.append(generateJSsetLength1());
        js.append(generateJSsetPosition());
        js.append(generateJSsetPosition1());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetType());
        js.append(generateJSsetType1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}