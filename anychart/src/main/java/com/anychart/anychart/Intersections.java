package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Venn intersections settings collector.
 */
public class Intersections extends CoreBase {

    public Intersections() {
        js.setLength(0);
        js.append("var intersections").append(++variableIndex).append(" = anychart.core.venn.intersections();");
        jsBase = "intersections" + variableIndex;
    }

    protected Intersections(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Intersections(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill fill;
    private List<Intersections> setFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Intersections setFill(Fill fill) {
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
            for (Intersections item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<Intersections> setFill1 = new ArrayList<>();

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Intersections fill(String color, Double opacity) {
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
            for (Intersections item : setFill1) {
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
    private List<Intersections> setFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Intersections fill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
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
            for (Intersections item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Intersections fill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
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
            for (Intersections item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Intersections fill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
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
            for (Intersections item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Intersections fill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
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
            for (Intersections item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Intersections fill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
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
            for (Intersections item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Intersections fill(String[] keys1, Double angle, Double opacity1, String mode2) {
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
            for (Intersections item : setFill7) {
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
    private List<Intersections> setFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Intersections fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            for (Intersections item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Intersections fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            for (Intersections item : setFill9) {
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
    private Boolean patternFillOrType4;
    private String color1;
    private Double thickness;
    private Double size;
    private List<Intersections> setHatchFill = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
     */
    public Intersections setHatchFill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
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
            for (Intersections item : setHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setHatchFill1 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
     */
    public Intersections setHatchFill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
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
            for (Intersections item : setHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setHatchFill2 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
     */
    public Intersections setHatchFill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
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
            for (Intersections item : setHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setHatchFill3 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
     */
    public Intersections setHatchFill(String patternFillOrType3, String color1, Double thickness, Double size) {
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
            for (Intersections item : setHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setHatchFill4 = new ArrayList<>();

    /**
     * Setter for hatch fill settings.
     */
    public Intersections setHatchFill(Boolean patternFillOrType4, String color1, Double thickness, Double size) {
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
            for (Intersections item : setHatchFill4) {
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
    private List<Intersections> setHovered = new ArrayList<>();

    /**
     * Setter for hovered state settings.
     */
    public Intersections setHovered(String hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHovered() {
        if (!setHovered.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Intersections item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiLabelsFactory getLabels;

    /**
     * Getter for intersections labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }

    private String labels;
    private Boolean labels1;
    private List<Intersections> setLabels = new ArrayList<>();

    /**
     * Setter for intersections labels.
     */
    public Intersections setLabels(String labels) {
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
            for (Intersections item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setLabels1 = new ArrayList<>();

    /**
     * Setter for intersections labels.
     */
    public Intersections setLabels(Boolean labels1) {
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
            for (Intersections item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiMarkersFactory getMarkers;

    /**
     * Getter for the data markers.
     */
    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }

    private String markers;
    private Boolean markers1;
    private String markers2;
    private List<Intersections> setMarkers = new ArrayList<>();

    /**
     * Setter for data markers.
     */
    public Intersections setMarkers(String markers) {
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
            for (Intersections item : setMarkers) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setMarkers1 = new ArrayList<>();

    /**
     * Setter for data markers.
     */
    public Intersections setMarkers(Boolean markers1) {
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
            for (Intersections item : setMarkers1) {
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
    private List<Intersections> setNormal = new ArrayList<>();

    /**
     * Setter for normal state settings.
     */
    public Intersections setNormal(String normal) {
        if (jsBase == null) {
            this.normal = normal;
        } else {
            this.normal = normal;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNormal() {
        if (!setNormal.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Intersections item : setNormal) {
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
    private List<Intersections> setSelected = new ArrayList<>();

    /**
     * Setter for selected state settings.
     */
    public Intersections setSelected(String selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelected() {
        if (!setSelected.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Intersections item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<Intersections> setStroke = new ArrayList<>();

    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Intersections setStroke(Stroke color2, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color2 = color2;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness1 = thickness1;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Intersections item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setStroke1 = new ArrayList<>();

    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Intersections setStroke(ColoredFill color3, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Intersections item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setStroke2 = new ArrayList<>();

    /**
     * Setter for the stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Intersections setStroke(String color4, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color4), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color4), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Intersections item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Tooltip getTooltip;

    /**
     * Getter for the tooltip.
     */
    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;
    private List<Intersections> setTooltip = new ArrayList<>();

    /**
     * Setter for the tooltip.
     */
    public Intersections setTooltip(String tooltip) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip = tooltip;
        } else {
            this.tooltip = tooltip;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".tooltip(%s)", wrapQuotes(tooltip)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%s)", wrapQuotes(tooltip)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTooltip() {
        if (!setTooltip.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Intersections item : setTooltip) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Intersections> setTooltip1 = new ArrayList<>();

    /**
     * Setter for the tooltip.
     */
    public Intersections setTooltip(Boolean tooltip1) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip1 = tooltip1;
        } else {
            this.tooltip1 = tooltip1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".tooltip(%b)", tooltip1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%b)", tooltip1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTooltip1() {
        if (!setTooltip1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Intersections item : setTooltip1) {
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

    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetHatchFill());
        jsGetters.append(generateJSgetHovered());
        jsGetters.append(generateJSgetLabels());
        jsGetters.append(generateJSgetMarkers());
        jsGetters.append(generateJSgetNormal());
        jsGetters.append(generateJSgetSelected());
        jsGetters.append(generateJSgetTooltip());

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
        js.append(generateJSsetHatchFill());
        js.append(generateJSsetHatchFill1());
        js.append(generateJSsetHatchFill2());
        js.append(generateJSsetHatchFill3());
        js.append(generateJSsetHatchFill4());
        js.append(generateJSsetHovered());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetMarkers());
        js.append(generateJSsetMarkers1());
        js.append(generateJSsetNormal());
        js.append(generateJSsetSelected());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetTooltip());
        js.append(generateJSsetTooltip1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}