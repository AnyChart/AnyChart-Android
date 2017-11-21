package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Legend items are child elements of a legend.<br/>
The LegendItemSettings class contains different settings for an icon in the legend item.<br/>
Such as text spacing, type, fill, stroke, hatch fill, size, icon marker settings, etc.<br/>
 */
public class LegendItemSettings extends CoreText {

    public LegendItemSettings() {
        js.setLength(0);
        js.append("var legendItemSettings").append(++variableIndex).append(" = anychart.core.utils.legendItemSettings();");
        jsBase = "legendItemSettings" + variableIndex;
    }

    protected LegendItemSettings(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected LegendItemSettings(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean disabled;
    private List<LegendItemSettings> setDisabled = new ArrayList<>();

    /**
     * Setter for disabled settings.
     */
    public LegendItemSettings setDisabled(Boolean disabled) {
        if (jsBase == null) {
            this.disabled = disabled;
        } else {
            this.disabled = disabled;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".disabled(%b)", disabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".disabled(%b)", disabled));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDisabled() {
        if (!setDisabled.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setDisabled) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String format;
    private List<LegendItemSettings> setFormat = new ArrayList<>();

    /**
     * Setter for legend item format settings.<br/>
{docs:Common_Settings/Text_Formatters}Learn more about using format() method.{docs}
     */
    public LegendItemSettings setFormat(String format) {
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
            for (LegendItemSettings item : setFormat) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean iconEnabled;
    private List<LegendItemSettings> setIconEnabled = new ArrayList<>();

    /**
     * Setter for settings showing icons.
     */
    public LegendItemSettings setIconEnabled(Boolean iconEnabled) {
        if (jsBase == null) {
            this.iconEnabled = iconEnabled;
        } else {
            this.iconEnabled = iconEnabled;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconEnabled(%b)", iconEnabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconEnabled(%b)", iconEnabled));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconEnabled() {
        if (!setIconEnabled.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconEnabled) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill iconFill;
    private List<LegendItemSettings> setIconFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings setIconFill(Fill iconFill) {
        if (jsBase == null) {
            this.iconFill = iconFill;
        } else {
            this.iconFill = iconFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconFill(%s)", ((iconFill != null) ? iconFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconFill(%s)", ((iconFill != null) ? iconFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconFill() {
        if (!setIconFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<LegendItemSettings> setIconFill1 = new ArrayList<>();

    /**
     * Fill color with opacity.
     */
    public LegendItemSettings iconFill(String color, Double opacity) {
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
            
            js.append(String.format(Locale.US, ".iconFill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconFill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconFill1() {
        if (!setIconFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconFill1) {
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
    private List<LegendItemSettings> setIconFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconFill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
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
            
            js.append(String.format(Locale.US, ".iconFill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconFill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconFill2() {
        if (!setIconFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconFill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
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
            js.append(String.format(Locale.US, ".iconFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconFill3() {
        if (!setIconFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconFill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
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
            
            js.append(String.format(Locale.US, ".iconFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconFill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconFill4() {
        if (!setIconFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconFill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
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
            
            js.append(String.format(Locale.US, ".iconFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconFill5() {
        if (!setIconFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconFill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
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
            js.append(String.format(Locale.US, ".iconFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconFill6() {
        if (!setIconFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconFill(String[] keys1, Double angle, Double opacity1, String mode2) {
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
            
            js.append(String.format(Locale.US, ".iconFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconFill7() {
        if (!setIconFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconFill7) {
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
    private List<LegendItemSettings> setIconFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".iconFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconFill8() {
        if (!setIconFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".iconFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconFill9() {
        if (!setIconFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private PatternFill getIconHatchFill;

    /**
     * Getter for icon hatch fill settings.
     */
    public PatternFill getIconHatchFill() {
        if (getIconHatchFill == null)
            getIconHatchFill = new PatternFill(jsBase + ".iconHatchFill()");

        return getIconHatchFill;
    }

    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private String color1;
    private Double thickness;
    private Double size;
    private List<LegendItemSettings> setIconHatchFill = new ArrayList<>();

    /**
     * Setter for icon hatch fill settings.
     */
    public LegendItemSettings setIconHatchFill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
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
            js.append(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.getJsBase() : "null"), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", ((patternFillOrType != null) ? patternFillOrType.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconHatchFill() {
        if (!setIconHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconHatchFill1 = new ArrayList<>();

    /**
     * Setter for icon hatch fill settings.
     */
    public LegendItemSettings setIconHatchFill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
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
            js.append(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.getJsBase() : "null"), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", ((patternFillOrType1 != null) ? patternFillOrType1.getJsBase() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconHatchFill1() {
        if (!setIconHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconHatchFill2 = new ArrayList<>();

    /**
     * Setter for icon hatch fill settings.
     */
    public LegendItemSettings setIconHatchFill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
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
            
            js.append(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", ((patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null"), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconHatchFill2() {
        if (!setIconHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconHatchFill3 = new ArrayList<>();

    /**
     * Setter for icon hatch fill settings.
     */
    public LegendItemSettings setIconHatchFill(String patternFillOrType3, String color1, Double thickness, Double size) {
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
            
            js.append(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color1), thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconHatchFill(%s, %s, %f, %f)", wrapQuotes(patternFillOrType3), wrapQuotes(color1), thickness, size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconHatchFill3() {
        if (!setIconHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill iconMarkerFill;
    private List<LegendItemSettings> setIconMarkerFill = new ArrayList<>();

    /**
     * Setter for icon marker fill settings using a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings setIconMarkerFill(Fill iconMarkerFill) {
        if (jsBase == null) {
            this.iconMarkerFill = iconMarkerFill;
        } else {
            this.iconMarkerFill = iconMarkerFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconMarkerFill(%s)", ((iconMarkerFill != null) ? iconMarkerFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerFill(%s)", ((iconMarkerFill != null) ? iconMarkerFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerFill() {
        if (!setIconMarkerFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color2;
    private Double opacity3;
    private List<LegendItemSettings> setIconMarkerFill1 = new ArrayList<>();

    /**
     * Icon marker fill color with opacity.
     */
    public LegendItemSettings iconMarkerFill(String color2, Double opacity3) {
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
            
            js.append(String.format(Locale.US, ".iconMarkerFill(%s, %f)", wrapQuotes(color2), opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerFill(%s, %f)", wrapQuotes(color2), opacity3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerFill1() {
        if (!setIconMarkerFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerFill1) {
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
    private List<LegendItemSettings> setIconMarkerFill2 = new ArrayList<>();

    /**
     * Linear gradient fill for icon marker.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconMarkerFill(GradientKey[] keys4, Double angle1, Double opacity4, Boolean mode4) {
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
            
            js.append(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %b)", arrayToString(keys4), angle1, opacity4, mode4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %b)", arrayToString(keys4), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerFill2() {
        if (!setIconMarkerFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconMarkerFill3 = new ArrayList<>();

    /**
     * Linear gradient fill for icon marker.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconMarkerFill(GradientKey[] keys4, Double angle1, Double opacity4, VectorRect mode5) {
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
            js.append(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerFill3() {
        if (!setIconMarkerFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconMarkerFill4 = new ArrayList<>();

    /**
     * Linear gradient fill for icon marker.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconMarkerFill(GradientKey[] keys4, Double angle1, Double opacity4, String mode6) {
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
            
            js.append(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %s)", arrayToString(keys4), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerFill4() {
        if (!setIconMarkerFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconMarkerFill5 = new ArrayList<>();

    /**
     * Linear gradient fill for icon marker.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconMarkerFill(String[] keys5, Double angle1, Double opacity4, Boolean mode4) {
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
            
            js.append(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys5), angle1, opacity4, mode4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerFill5() {
        if (!setIconMarkerFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconMarkerFill6 = new ArrayList<>();

    /**
     * Linear gradient fill for icon marker.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconMarkerFill(String[] keys5, Double angle1, Double opacity4, VectorRect mode5) {
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
            js.append(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, ((mode5 != null) ? mode5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerFill6() {
        if (!setIconMarkerFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconMarkerFill7 = new ArrayList<>();

    /**
     * Linear gradient fill for icon marker.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconMarkerFill(String[] keys5, Double angle1, Double opacity4, String mode6) {
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
            
            js.append(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys5), angle1, opacity4, wrapQuotes(mode6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerFill7() {
        if (!setIconMarkerFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerFill7) {
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
    private List<LegendItemSettings> setIconMarkerFill8 = new ArrayList<>();

    /**
     * Radial gradient fill for icon marker.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconMarkerFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerFill8() {
        if (!setIconMarkerFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconMarkerFill9 = new ArrayList<>();

    /**
     * Radial gradient fill for icon marker.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public LegendItemSettings iconMarkerFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.getJsBase() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerFill9() {
        if (!setIconMarkerFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private Stroke color3;
    private ColoredFill color4;
    private String color5;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<LegendItemSettings> setIconMarkerStroke = new ArrayList<>();

    /**
     * Setter for icon marker stroke settings.
     */
    public LegendItemSettings setIconMarkerStroke(Stroke color3, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconMarkerStroke(%s, %f, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerStroke(%s, %f, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerStroke() {
        if (!setIconMarkerStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconMarkerStroke1 = new ArrayList<>();

    /**
     * Setter for icon marker stroke settings.
     */
    public LegendItemSettings setIconMarkerStroke(ColoredFill color4, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconMarkerStroke(%s, %f, %s, %s, %s)", ((color4 != null) ? color4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerStroke(%s, %f, %s, %s, %s)", ((color4 != null) ? color4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerStroke1() {
        if (!setIconMarkerStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconMarkerStroke2 = new ArrayList<>();

    /**
     * Setter for icon marker stroke settings.
     */
    public LegendItemSettings setIconMarkerStroke(String color5, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconMarkerStroke(%s, %f, %s, %s, %s)", wrapQuotes(color5), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerStroke(%s, %f, %s, %s, %s)", wrapQuotes(color5), thickness1, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerStroke2() {
        if (!setIconMarkerStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private MarkerType iconMarkerType;
    private String iconMarkerType1;
    private List<LegendItemSettings> setIconMarkerType = new ArrayList<>();

    /**
     * Setter for the marker type.
     */
    public LegendItemSettings setIconMarkerType(MarkerType iconMarkerType) {
        if (jsBase == null) {
            this.iconMarkerType = null;
            this.iconMarkerType1 = null;
            
            this.iconMarkerType = iconMarkerType;
        } else {
            this.iconMarkerType = iconMarkerType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconMarkerType(%s)", ((iconMarkerType != null) ? iconMarkerType.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerType(%s)", ((iconMarkerType != null) ? iconMarkerType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerType() {
        if (!setIconMarkerType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconMarkerType1 = new ArrayList<>();

    /**
     * Setter for the marker type.
     */
    public LegendItemSettings setIconMarkerType(String iconMarkerType1) {
        if (jsBase == null) {
            this.iconMarkerType = null;
            this.iconMarkerType1 = null;
            
            this.iconMarkerType1 = iconMarkerType1;
        } else {
            this.iconMarkerType1 = iconMarkerType1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconMarkerType(%s)", wrapQuotes(iconMarkerType1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconMarkerType(%s)", wrapQuotes(iconMarkerType1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconMarkerType1() {
        if (!setIconMarkerType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconMarkerType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double iconSize;
    private String iconSize1;
    private List<LegendItemSettings> setIconSize = new ArrayList<>();

    /**
     * Setter for the icon size of legend item.
     */
    public LegendItemSettings setIconSize(Double iconSize) {
        if (jsBase == null) {
            this.iconSize = null;
            this.iconSize1 = null;
            
            this.iconSize = iconSize;
        } else {
            this.iconSize = iconSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconSize(%f)", iconSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconSize(%f)", iconSize));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconSize() {
        if (!setIconSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconSize1 = new ArrayList<>();

    /**
     * Setter for the icon size of legend item.
     */
    public LegendItemSettings setIconSize(String iconSize1) {
        if (jsBase == null) {
            this.iconSize = null;
            this.iconSize1 = null;
            
            this.iconSize1 = iconSize1;
        } else {
            this.iconSize1 = iconSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconSize(%s)", wrapQuotes(iconSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconSize(%s)", wrapQuotes(iconSize1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconSize1() {
        if (!setIconSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke iconStroke;
    private ColoredFill iconStroke1;
    private String iconStroke2;
    private Double thickness2;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;
    private List<LegendItemSettings> setIconStroke = new ArrayList<>();

    /**
     * Setter for legend item icon stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public LegendItemSettings setIconStroke(Stroke iconStroke, Double thickness2, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.iconStroke = null;
            this.iconStroke1 = null;
            this.iconStroke2 = null;
            
            this.iconStroke = iconStroke;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
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
            this.iconStroke = iconStroke;
            this.thickness2 = thickness2;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconStroke(%s, %f, %s, %s, %s)", ((iconStroke != null) ? iconStroke.generateJs() : "null"), thickness2, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconStroke(%s, %f, %s, %s, %s)", ((iconStroke != null) ? iconStroke.generateJs() : "null"), thickness2, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconStroke() {
        if (!setIconStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconStroke1 = new ArrayList<>();

    /**
     * Setter for legend item icon stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public LegendItemSettings setIconStroke(ColoredFill iconStroke1, Double thickness2, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.iconStroke = null;
            this.iconStroke1 = null;
            this.iconStroke2 = null;
            
            this.iconStroke1 = iconStroke1;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
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
            this.iconStroke1 = iconStroke1;
            this.thickness2 = thickness2;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconStroke(%s, %f, %s, %s, %s)", ((iconStroke1 != null) ? iconStroke1.generateJs() : "null"), thickness2, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconStroke(%s, %f, %s, %s, %s)", ((iconStroke1 != null) ? iconStroke1.generateJs() : "null"), thickness2, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconStroke1() {
        if (!setIconStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconStroke2 = new ArrayList<>();

    /**
     * Setter for legend item icon stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public LegendItemSettings setIconStroke(String iconStroke2, Double thickness2, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.iconStroke = null;
            this.iconStroke1 = null;
            this.iconStroke2 = null;
            
            this.iconStroke2 = iconStroke2;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
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
            this.iconStroke2 = iconStroke2;
            this.thickness2 = thickness2;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconStroke(%s, %f, %s, %s, %s)", wrapQuotes(iconStroke2), thickness2, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconStroke(%s, %f, %s, %s, %s)", wrapQuotes(iconStroke2), thickness2, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconStroke2() {
        if (!setIconStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double iconTextSpacing;
    private List<LegendItemSettings> setIconTextSpacing = new ArrayList<>();

    /**
     * Setter for a spacing between icon and text.
     */
    public LegendItemSettings setIconTextSpacing(Double iconTextSpacing) {
        if (jsBase == null) {
            this.iconTextSpacing = iconTextSpacing;
        } else {
            this.iconTextSpacing = iconTextSpacing;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconTextSpacing(%f)", iconTextSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconTextSpacing(%f)", iconTextSpacing));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconTextSpacing() {
        if (!setIconTextSpacing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconTextSpacing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LegendItemIconType iconType;
    private String iconType1;
    private List<LegendItemSettings> setIconType = new ArrayList<>();

    /**
     * Setter for the icon type.
     */
    public LegendItemSettings setIconType(LegendItemIconType iconType) {
        if (jsBase == null) {
            this.iconType = null;
            this.iconType1 = null;
            
            this.iconType = iconType;
        } else {
            this.iconType = iconType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconType(%s)", ((iconType != null) ? iconType.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconType(%s)", ((iconType != null) ? iconType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconType() {
        if (!setIconType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LegendItemSettings> setIconType1 = new ArrayList<>();

    /**
     * Setter for the icon type.
     */
    public LegendItemSettings setIconType(String iconType1) {
        if (jsBase == null) {
            this.iconType = null;
            this.iconType1 = null;
            
            this.iconType1 = iconType1;
        } else {
            this.iconType1 = iconType1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".iconType(%s)", wrapQuotes(iconType1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".iconType(%s)", wrapQuotes(iconType1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetIconType1() {
        if (!setIconType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setIconType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String text;
    private List<LegendItemSettings> setText = new ArrayList<>();

    /**
     * Setter for the legend item text.
     */
    public LegendItemSettings setText(String text) {
        if (jsBase == null) {
            this.text = text;
        } else {
            this.text = text;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".text(%s)", wrapQuotes(text)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".text(%s)", wrapQuotes(text)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetText() {
        if (!setText.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LegendItemSettings item : setText) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetIconHatchFill() {
        if (getIconHatchFill != null) {
            return getIconHatchFill.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetIconHatchFill());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetDisabled());
        js.append(generateJSsetFormat());
        js.append(generateJSsetIconEnabled());
        js.append(generateJSsetIconFill());
        js.append(generateJSsetIconFill1());
        js.append(generateJSsetIconFill2());
        js.append(generateJSsetIconFill3());
        js.append(generateJSsetIconFill4());
        js.append(generateJSsetIconFill5());
        js.append(generateJSsetIconFill6());
        js.append(generateJSsetIconFill7());
        js.append(generateJSsetIconFill8());
        js.append(generateJSsetIconFill9());
        js.append(generateJSsetIconHatchFill());
        js.append(generateJSsetIconHatchFill1());
        js.append(generateJSsetIconHatchFill2());
        js.append(generateJSsetIconHatchFill3());
        js.append(generateJSsetIconMarkerFill());
        js.append(generateJSsetIconMarkerFill1());
        js.append(generateJSsetIconMarkerFill2());
        js.append(generateJSsetIconMarkerFill3());
        js.append(generateJSsetIconMarkerFill4());
        js.append(generateJSsetIconMarkerFill5());
        js.append(generateJSsetIconMarkerFill6());
        js.append(generateJSsetIconMarkerFill7());
        js.append(generateJSsetIconMarkerFill8());
        js.append(generateJSsetIconMarkerFill9());
        js.append(generateJSsetIconMarkerStroke());
        js.append(generateJSsetIconMarkerStroke1());
        js.append(generateJSsetIconMarkerStroke2());
        js.append(generateJSsetIconMarkerType());
        js.append(generateJSsetIconMarkerType1());
        js.append(generateJSsetIconSize());
        js.append(generateJSsetIconSize1());
        js.append(generateJSsetIconStroke());
        js.append(generateJSsetIconStroke1());
        js.append(generateJSsetIconStroke2());
        js.append(generateJSsetIconTextSpacing());
        js.append(generateJSsetIconType());
        js.append(generateJSsetIconType1());
        js.append(generateJSsetText());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}