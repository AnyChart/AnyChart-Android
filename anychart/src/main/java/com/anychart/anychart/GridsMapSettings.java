package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Map grid settings.
 */
public class GridsMapSettings extends CoreBase {

    public GridsMapSettings() {
        js.setLength(0);
        js.append("var gridsMapSettings").append(++variableIndex).append(" = anychart.core.grids.mapSettings();");
        jsBase = "gridsMapSettings" + variableIndex;
    }

    protected GridsMapSettings(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected GridsMapSettings(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean drawFirstLine;
    private List<GridsMapSettings> setDrawFirstLine = new ArrayList<>();

    /**
     * Setter for the first line drawing.
     */
    public GridsMapSettings setDrawFirstLine(Boolean drawFirstLine) {
        if (jsBase == null) {
            this.drawFirstLine = drawFirstLine;
        } else {
            this.drawFirstLine = drawFirstLine;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".drawFirstLine(%b)", drawFirstLine));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".drawFirstLine(%b)", drawFirstLine));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDrawFirstLine() {
        if (!setDrawFirstLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setDrawFirstLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean drawLastLine;
    private List<GridsMapSettings> setDrawLastLine = new ArrayList<>();

    /**
     * Setter for the last line drawing.
     */
    public GridsMapSettings setDrawLastLine(Boolean drawLastLine) {
        if (jsBase == null) {
            this.drawLastLine = drawLastLine;
        } else {
            this.drawLastLine = drawLastLine;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".drawLastLine(%b)", drawLastLine));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".drawLastLine(%b)", drawLastLine));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDrawLastLine() {
        if (!setDrawLastLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setDrawLastLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean enabled;
    private List<GridsMapSettings> setEnabled = new ArrayList<>();

    /**
     * Setter for the grid enabled state.
     */
    public GridsMapSettings setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".enabled(%b)", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".enabled(%b)", enabled));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEnabled() {
        if (!setEnabled.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setEnabled) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private List<GridsMapSettings> setFill = new ArrayList<>();

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GridsMapSettings setFill(Fill fill) {
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
            for (GridsMapSettings item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<GridsMapSettings> setFill1 = new ArrayList<>();

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public GridsMapSettings fill(String color, Double opacity) {
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
            for (GridsMapSettings item : setFill1) {
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
    private List<GridsMapSettings> setFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GridsMapSettings fill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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
            for (GridsMapSettings item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GridsMapSettings fill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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
            for (GridsMapSettings item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GridsMapSettings fill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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
            for (GridsMapSettings item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GridsMapSettings fill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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
            for (GridsMapSettings item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GridsMapSettings fill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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
            for (GridsMapSettings item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GridsMapSettings fill(String[] keys1, String mode2, Double angle, Double opacity1) {
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
            for (GridsMapSettings item : setFill7) {
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
    private List<GridsMapSettings> setFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GridsMapSettings fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            for (GridsMapSettings item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public GridsMapSettings fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            for (GridsMapSettings item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private GridsMap getHorizontal;

    /**
     * Getter for the horizontal grid.
     */
    public GridsMap getHorizontal() {
        if (getHorizontal == null)
            getHorizontal = new GridsMap(jsBase + ".horizontal()");

        return getHorizontal;
    }

    private Boolean horizontal;
    private String horizontal1;
    private List<GridsMapSettings> setHorizontal = new ArrayList<>();

    /**
     * Setter for the horizontal grid.
     */
    public GridsMapSettings setHorizontal(Boolean horizontal) {
        if (jsBase == null) {
            this.horizontal = null;
            this.horizontal1 = null;
            
            this.horizontal = horizontal;
        } else {
            this.horizontal = horizontal;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".horizontal(%b)", horizontal));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".horizontal(%b)", horizontal));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHorizontal() {
        if (!setHorizontal.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setHorizontal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setHorizontal1 = new ArrayList<>();

    /**
     * Setter for the horizontal grid.
     */
    public GridsMapSettings setHorizontal(String horizontal1) {
        if (jsBase == null) {
            this.horizontal = null;
            this.horizontal1 = null;
            
            this.horizontal1 = horizontal1;
        } else {
            this.horizontal1 = horizontal1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".horizontal(%s)", wrapQuotes(horizontal1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".horizontal(%s)", wrapQuotes(horizontal1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHorizontal1() {
        if (!setHorizontal1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setHorizontal1) {
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
    private List<GridsMapSettings> setMinorStroke = new ArrayList<>();

    /**
     * Setter for grid stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public GridsMapSettings setMinorStroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            js.append(String.format(Locale.US, ".minorStroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minorStroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorStroke() {
        if (!setMinorStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setMinorStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setMinorStroke1 = new ArrayList<>();

    /**
     * Setter for grid stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public GridsMapSettings setMinorStroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            js.append(String.format(Locale.US, ".minorStroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minorStroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorStroke1() {
        if (!setMinorStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setMinorStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setMinorStroke2 = new ArrayList<>();

    /**
     * Setter for grid stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public GridsMapSettings setMinorStroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            js.append(String.format(Locale.US, ".minorStroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minorStroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorStroke2() {
        if (!setMinorStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setMinorStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private RangeColors getPalette;

    /**
     * Getter for the colors palette.
     */
    public RangeColors getPalette() {
        if (getPalette == null)
            getPalette = new RangeColors(jsBase + ".palette()");

        return getPalette;
    }

    private RangeColors palette;
    private DistinctColors palette1;
    private String palette2;
    private String[] palette3;
    private List<GridsMap> setPalette = new ArrayList<>();

    /**
     * Setter for the grid colors palette.
     */
    public GridsMap setPalette(RangeColors palette) {
        if (jsBase == null) {
            this.palette = null;
            this.palette1 = null;
            this.palette2 = null;
            this.palette3 = null;
            
            this.palette = palette;
        } else {
            this.palette = palette;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(palette.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".palette(%s);",  ((palette != null) ? palette.getJsBase() : "null")));
        }
        GridsMap item = new GridsMap("setPalette" + variableIndex);
        setPalette.add(item);
        return item;
    }
    private String generateJSsetPalette() {
        if (!setPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMap item : setPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMap> setPalette1 = new ArrayList<>();

    /**
     * Setter for the grid colors palette.
     */
    public GridsMap setPalette(DistinctColors palette1) {
        if (jsBase == null) {
            this.palette = null;
            this.palette1 = null;
            this.palette2 = null;
            this.palette3 = null;
            
            this.palette1 = palette1;
        } else {
            this.palette1 = palette1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(palette1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".palette(%s);",  ((palette1 != null) ? palette1.getJsBase() : "null")));
        }
        GridsMap item = new GridsMap("setPalette1" + variableIndex);
        setPalette1.add(item);
        return item;
    }
    private String generateJSsetPalette1() {
        if (!setPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMap item : setPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMap> setPalette2 = new ArrayList<>();

    /**
     * Setter for the grid colors palette.
     */
    public GridsMap setPalette(String palette2) {
        if (jsBase == null) {
            this.palette = null;
            this.palette1 = null;
            this.palette2 = null;
            this.palette3 = null;
            
            this.palette2 = palette2;
        } else {
            this.palette2 = palette2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s)", wrapQuotes(palette2)));
                js.setLength(0);
            }
        }
        GridsMap item = new GridsMap("setPalette2" + variableIndex);
        setPalette2.add(item);
        return item;
    }
    private String generateJSsetPalette2() {
        if (!setPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMap item : setPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMap> setPalette3 = new ArrayList<>();

    /**
     * Setter for the grid colors palette.
     */
    public GridsMap setPalette(String[] palette3) {
        if (jsBase == null) {
            this.palette = null;
            this.palette1 = null;
            this.palette2 = null;
            this.palette3 = null;
            
            this.palette3 = palette3;
        } else {
            this.palette3 = palette3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s)", arrayToStringWrapQuotes(palette3)));
                js.setLength(0);
            }
        }
        GridsMap item = new GridsMap("setPalette3" + variableIndex);
        setPalette3.add(item);
        return item;
    }
    private String generateJSsetPalette3() {
        if (!setPalette3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMap item : setPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color4;
    private ColoredFill color5;
    private String color6;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;
    private List<GridsMapSettings> setStroke = new ArrayList<>();

    /**
     * Setter for grid stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public GridsMapSettings setStroke(Stroke color4, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            
            this.thickness1 = thickness1;
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
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color4 != null) ? color4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color4 != null) ? color4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setStroke1 = new ArrayList<>();

    /**
     * Setter for grid stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public GridsMapSettings setStroke(ColoredFill color5, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            
            this.thickness1 = thickness1;
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
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color5 != null) ? color5.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color5 != null) ? color5.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setStroke2 = new ArrayList<>();

    /**
     * Setter for grid stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public GridsMapSettings setStroke(String color6, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
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
            
            this.thickness1 = thickness1;
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
            this.color6 = color6;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color6), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color6), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GridsMap getVertical;

    /**
     * Getter for the vertical grid.
     */
    public GridsMap getVertical() {
        if (getVertical == null)
            getVertical = new GridsMap(jsBase + ".vertical()");

        return getVertical;
    }

    private Boolean vertical;
    private String vertical1;
    private List<GridsMapSettings> setVertical = new ArrayList<>();

    /**
     * Setter for the vertical grid.
     */
    public GridsMapSettings setVertical(Boolean vertical) {
        if (jsBase == null) {
            this.vertical = null;
            this.vertical1 = null;
            
            this.vertical = vertical;
        } else {
            this.vertical = vertical;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".vertical(%b)", vertical));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vertical(%b)", vertical));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetVertical() {
        if (!setVertical.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setVertical) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setVertical1 = new ArrayList<>();

    /**
     * Setter for the vertical grid.
     */
    public GridsMapSettings setVertical(String vertical1) {
        if (jsBase == null) {
            this.vertical = null;
            this.vertical1 = null;
            
            this.vertical1 = vertical1;
        } else {
            this.vertical1 = vertical1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".vertical(%s)", wrapQuotes(vertical1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vertical(%s)", wrapQuotes(vertical1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetVertical1() {
        if (!setVertical1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setVertical1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double zIndex;
    private MapGridZIndex zIndex1;
    private String zIndex2;
    private List<GridsMapSettings> setZIndex = new ArrayList<>();

    /**
     * Setter for the grid zIndex.
     */
    public GridsMapSettings setZIndex(Double zIndex) {
        if (jsBase == null) {
            this.zIndex = null;
            this.zIndex1 = null;
            this.zIndex2 = null;
            
            this.zIndex = zIndex;
        } else {
            this.zIndex = zIndex;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".zIndex(%f)", zIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".zIndex(%f)", zIndex));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetZIndex() {
        if (!setZIndex.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setZIndex) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setZIndex1 = new ArrayList<>();

    /**
     * Setter for the grid zIndex.
     */
    public GridsMapSettings setZIndex(MapGridZIndex zIndex1) {
        if (jsBase == null) {
            this.zIndex = null;
            this.zIndex1 = null;
            this.zIndex2 = null;
            
            this.zIndex1 = zIndex1;
        } else {
            this.zIndex1 = zIndex1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".zIndex(%s)", ((zIndex1 != null) ? zIndex1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".zIndex(%s)", ((zIndex1 != null) ? zIndex1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetZIndex1() {
        if (!setZIndex1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setZIndex1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GridsMapSettings> setZIndex2 = new ArrayList<>();

    /**
     * Setter for the grid zIndex.
     */
    public GridsMapSettings setZIndex(String zIndex2) {
        if (jsBase == null) {
            this.zIndex = null;
            this.zIndex1 = null;
            this.zIndex2 = null;
            
            this.zIndex2 = zIndex2;
        } else {
            this.zIndex2 = zIndex2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".zIndex(%s)", wrapQuotes(zIndex2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".zIndex(%s)", wrapQuotes(zIndex2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetZIndex2() {
        if (!setZIndex2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GridsMapSettings item : setZIndex2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetHorizontal() {
        if (getHorizontal != null) {
            return getHorizontal.generateJs();
        }
        return "";
    }

    private String generateJSgetPalette() {
        if (getPalette != null) {
            return getPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetVertical() {
        if (getVertical != null) {
            return getVertical.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetHorizontal());
        jsGetters.append(generateJSgetPalette());
        jsGetters.append(generateJSgetVertical());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetDrawFirstLine());
        js.append(generateJSsetDrawLastLine());
        js.append(generateJSsetEnabled());
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
        js.append(generateJSsetHorizontal());
        js.append(generateJSsetHorizontal1());
        js.append(generateJSsetMinorStroke());
        js.append(generateJSsetMinorStroke1());
        js.append(generateJSsetMinorStroke2());
        js.append(generateJSsetPalette());
        js.append(generateJSsetPalette1());
        js.append(generateJSsetPalette2());
        js.append(generateJSsetPalette3());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetVertical());
        js.append(generateJSsetVertical1());
        js.append(generateJSsetZIndex());
        js.append(generateJSsetZIndex1());
        js.append(generateJSsetZIndex2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}