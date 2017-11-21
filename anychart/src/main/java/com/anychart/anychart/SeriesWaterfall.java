package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Waterfall Series Class.
 */
public class SeriesWaterfall extends WidthBased {

    public SeriesWaterfall() {
        js.setLength(0);
        js.append("var seriesWaterfall").append(++variableIndex).append(" = anychart.core.waterfall.series.waterfall();");
        jsBase = "seriesWaterfall" + variableIndex;
    }

    protected SeriesWaterfall(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected SeriesWaterfall(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill fallingFill;
    private List<SeriesWaterfall> setFallingFill = new ArrayList<>();

    /**
     * Setter for falling fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall setFallingFill(Fill fallingFill) {
        if (jsBase == null) {
            this.fallingFill = fallingFill;
        } else {
            this.fallingFill = fallingFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fallingFill(%s)", ((fallingFill != null) ? fallingFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s)", ((fallingFill != null) ? fallingFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill() {
        if (!setFallingFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFallingFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<SeriesWaterfall> setFallingFill1 = new ArrayList<>();

    /**
     * Falling fill color with opacity.
     */
    public SeriesWaterfall fallingFill(String color, Double opacity) {
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
            
            js.append(String.format(Locale.US, ".fallingFill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill1() {
        if (!setFallingFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFallingFill1) {
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
    private List<SeriesWaterfall> setFallingFill2 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fallingFill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
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
            
            js.append(String.format(Locale.US, ".fallingFill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill2() {
        if (!setFallingFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFallingFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setFallingFill3 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fallingFill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
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
            js.append(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill3() {
        if (!setFallingFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFallingFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setFallingFill4 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fallingFill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
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
            
            js.append(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill4() {
        if (!setFallingFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFallingFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setFallingFill5 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fallingFill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
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
            
            js.append(String.format(Locale.US, ".fallingFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill5() {
        if (!setFallingFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFallingFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setFallingFill6 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fallingFill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
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
            js.append(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill6() {
        if (!setFallingFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFallingFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setFallingFill7 = new ArrayList<>();

    /**
     * Linear gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fallingFill(String[] keys1, Double angle, Double opacity1, String mode2) {
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
            
            js.append(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill7() {
        if (!setFallingFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFallingFill7) {
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
    private List<SeriesWaterfall> setFallingFill8 = new ArrayList<>();

    /**
     * Radial gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fallingFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill8() {
        if (!setFallingFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFallingFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setFallingFill9 = new ArrayList<>();

    /**
     * Radial gradient falling fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fallingFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fallingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFallingFill9() {
        if (!setFallingFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFallingFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private Fill fill;
    private List<SeriesWaterfall> setFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall setFill(Fill fill) {
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
            for (SeriesWaterfall item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color1;
    private Double opacity3;
    private List<SeriesWaterfall> setFill1 = new ArrayList<>();

    /**
     * Fill color with opacity.
     */
    public SeriesWaterfall fill(String color1, Double opacity3) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color1), opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color1), opacity3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill1() {
        if (!setFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFill1) {
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
    private List<SeriesWaterfall> setFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fill(GradientKey[] keys4, Double angle1, Double opacity4, Boolean mode4) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToString(keys4), angle1, opacity4, mode4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToString(keys4), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fill(GradientKey[] keys4, Double angle1, Double opacity4, VectorRect mode5) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fill(GradientKey[] keys4, Double angle1, Double opacity4, String mode6) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fill(String[] keys5, Double angle1, Double opacity4, Boolean mode4) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fill(String[] keys5, Double angle1, Double opacity4, VectorRect mode5) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fill(String[] keys5, Double angle1, Double opacity4, String mode6) {
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
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFill7) {
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
    private List<SeriesWaterfall> setFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall fill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings1;
    private Fill risingFill;
    private List<SeriesWaterfall> setRisingFill = new ArrayList<>();

    /**
     * Setter for rising fill settings using an array or a string.
{docs:Graphics/Hatch_Fill_Settings}Learn more about hatch fill settings.{docs}
     */
    public SeriesWaterfall setRisingFill(Fill risingFill) {
        if (jsBase == null) {
            this.risingFill = risingFill;
        } else {
            this.risingFill = risingFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".risingFill(%s)", ((risingFill != null) ? risingFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s)", ((risingFill != null) ? risingFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill() {
        if (!setRisingFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setRisingFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color2;
    private Double opacity6;
    private List<SeriesWaterfall> setRisingFill1 = new ArrayList<>();

    /**
     * Rising fill color with opacity.
     */
    public SeriesWaterfall risingFill(String color2, Double opacity6) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
        } else {
            this.color2 = color2;
            this.opacity6 = opacity6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".risingFill(%s, %f)", wrapQuotes(color2), opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f)", wrapQuotes(color2), opacity6));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill1() {
        if (!setRisingFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setRisingFill1) {
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
    private Double opacity7;
    private List<SeriesWaterfall> setRisingFill2 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall risingFill(GradientKey[] keys8, Double angle2, Double opacity7, Boolean mode8) {
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
            
            this.opacity7 = opacity7;
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
        } else {
            this.keys8 = keys8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            this.mode8 = mode8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %b)", arrayToString(keys8), angle2, opacity7, mode8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %b)", arrayToString(keys8), angle2, opacity7, mode8));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill2() {
        if (!setRisingFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setRisingFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setRisingFill3 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall risingFill(GradientKey[] keys8, Double angle2, Double opacity7, VectorRect mode9) {
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
            
            this.opacity7 = opacity7;
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
        } else {
            this.keys8 = keys8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            this.mode9 = mode9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode9.generateJs());
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %s)", arrayToString(keys8), angle2, opacity7, ((mode9 != null) ? mode9.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %s)", arrayToString(keys8), angle2, opacity7, ((mode9 != null) ? mode9.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill3() {
        if (!setRisingFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setRisingFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setRisingFill4 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall risingFill(GradientKey[] keys8, Double angle2, Double opacity7, String mode10) {
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
            
            this.opacity7 = opacity7;
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
        } else {
            this.keys8 = keys8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            this.mode10 = mode10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %s)", arrayToString(keys8), angle2, opacity7, wrapQuotes(mode10)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %s)", arrayToString(keys8), angle2, opacity7, wrapQuotes(mode10)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill4() {
        if (!setRisingFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setRisingFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setRisingFill5 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall risingFill(String[] keys9, Double angle2, Double opacity7, Boolean mode8) {
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
            
            this.opacity7 = opacity7;
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
        } else {
            this.keys9 = keys9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            this.mode8 = mode8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys9), angle2, opacity7, mode8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys9), angle2, opacity7, mode8));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill5() {
        if (!setRisingFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setRisingFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setRisingFill6 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall risingFill(String[] keys9, Double angle2, Double opacity7, VectorRect mode9) {
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
            
            this.opacity7 = opacity7;
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
        } else {
            this.keys9 = keys9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            this.mode9 = mode9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode9.generateJs());
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys9), angle2, opacity7, ((mode9 != null) ? mode9.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys9), angle2, opacity7, ((mode9 != null) ? mode9.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill6() {
        if (!setRisingFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setRisingFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setRisingFill7 = new ArrayList<>();

    /**
     * Linear gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall risingFill(String[] keys9, Double angle2, Double opacity7, String mode10) {
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
            
            this.opacity7 = opacity7;
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
        } else {
            this.keys9 = keys9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            this.mode10 = mode10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys9), angle2, opacity7, wrapQuotes(mode10)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys9), angle2, opacity7, wrapQuotes(mode10)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill7() {
        if (!setRisingFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setRisingFill7) {
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
    private Double opacity8;
    private Double fx2;
    private Double fy2;
    private List<SeriesWaterfall> setRisingFill8 = new ArrayList<>();

    /**
     * Radial gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall risingFill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
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
            
            this.opacity8 = opacity8;
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
            this.opacity8 = opacity8;
            this.fx2 = fx2;
            this.fy2 = fy2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode11.generateJs());
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.getJsBase() : "null"), opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.getJsBase() : "null"), opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill8() {
        if (!setRisingFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setRisingFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesWaterfall> setRisingFill9 = new ArrayList<>();

    /**
     * Radial gradient rising fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public SeriesWaterfall risingFill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
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
            
            this.opacity8 = opacity8;
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
            this.opacity8 = opacity8;
            this.fx2 = fx2;
            this.fy2 = fy2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode11.generateJs());
            js.append(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.getJsBase() : "null"), opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".risingFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.getJsBase() : "null"), opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRisingFill9() {
        if (!setRisingFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesWaterfall item : setRisingFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings2;

    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

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
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}