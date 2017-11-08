package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Declares table element.<br/>
<b>Note:</b> Better to use methods in {@link anychart.ui#table}.
 */
public class UiTable extends VisualBaseWithBounds {

    public UiTable() {
        js.setLength(0);
        js.append("var uiTable").append(++variableIndex).append(" = anychart.core.ui.table();");
        jsBase = "uiTable" + variableIndex;
    }

    protected UiTable(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected UiTable(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Border getBorder;

    /**
     * Getter for border of the table (not cells).
     */
    public Border getBorder() {
        if (getBorder == null)
            getBorder = new Border(jsBase + ".border()");

        return getBorder;
    }

    private Stroke color;
    private ColoredFill color1;
    private String color2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for border of the table (not cells).
     */
    public UiTable setBorder(Stroke color, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".border(%s, %f, %s, %s, %s)", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".border(%s, %f, %s, %s, %s)", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for border of the table (not cells).
     */
    public UiTable setBorder(ColoredFill color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
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
            js.append(String.format(Locale.US, ".border(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".border(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for border of the table (not cells).
     */
    public UiTable setBorder(String color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
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
            js.append(String.format(Locale.US, ".border(%s, %f, %s, %s, %s)", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".border(%s, %f, %s, %s, %s)", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke strokeOrFill;
    private ColoredFill strokeOrFill1;
    private String strokeOrFill2;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    /**
     * Setter for cell border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTable setCellBorder(Stroke strokeOrFill, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill = strokeOrFill;
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
            this.strokeOrFill = strokeOrFill;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".cellBorder(%s, %f, %s, %s, %s)", ((strokeOrFill != null) ? strokeOrFill.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellBorder(%s, %f, %s, %s, %s)", ((strokeOrFill != null) ? strokeOrFill.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for cell border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTable setCellBorder(ColoredFill strokeOrFill1, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill1 = strokeOrFill1;
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
            this.strokeOrFill1 = strokeOrFill1;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".cellBorder(%s, %f, %s, %s, %s)", ((strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellBorder(%s, %f, %s, %s, %s)", ((strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for cell border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiTable setCellBorder(String strokeOrFill2, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill2 = strokeOrFill2;
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
            this.strokeOrFill2 = strokeOrFill2;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".cellBorder(%s, %f, %s, %s, %s)", wrapQuotes(strokeOrFill2), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellBorder(%s, %f, %s, %s, %s)", wrapQuotes(strokeOrFill2), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill cellFill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable setCellFill(Fill cellFill) {
        if (jsBase == null) {
            this.cellFill = cellFill;
        } else {
            this.cellFill = cellFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".cellFill(%s)", ((cellFill != null) ? cellFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellFill(%s)", ((cellFill != null) ? cellFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color3;
    private Double opacity;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTable cellFill(String color3, Double opacity) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.opacity = opacity;
        } else {
            this.color3 = color3;
            this.opacity = opacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".cellFill(%s, %f)", wrapQuotes(color3), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellFill(%s, %f)", wrapQuotes(color3), opacity));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable cellFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".cellFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable cellFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".cellFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable cellFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".cellFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable cellFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".cellFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable cellFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".cellFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable cellFill(String[] keys1, String mode2, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".cellFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable cellFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".cellFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable cellFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".cellFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings;
    private TablePadding getCellPadding;

    /**
     * Getter for cell padding settings.
     */
    public TablePadding getCellPadding() {
        if (getCellPadding == null)
            getCellPadding = new TablePadding(jsBase + ".cellPadding()");

        return getCellPadding;
    }

    private Double[] cellPadding;
    private String[] cellPadding1;
    private String cellPadding2;

    /**
     * Setter for cell paddings in pixels using a single value.
     */
    public UiTable setCellPadding(Double[] cellPadding) {
        if (jsBase == null) {
            this.cellPadding = null;
            this.cellPadding1 = null;
            this.cellPadding2 = null;
            
            this.cellPadding = cellPadding;
        } else {
            this.cellPadding = cellPadding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".cellPadding(%s)", Arrays.toString(cellPadding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s)", Arrays.toString(cellPadding)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for cell paddings in pixels using a single value.
     */
    public UiTable setCellPadding(String[] cellPadding1) {
        if (jsBase == null) {
            this.cellPadding = null;
            this.cellPadding1 = null;
            this.cellPadding2 = null;
            
            this.cellPadding1 = cellPadding1;
        } else {
            this.cellPadding1 = cellPadding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".cellPadding(%s)", arrayToStringWrapQuotes(cellPadding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s)", arrayToStringWrapQuotes(cellPadding1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for cell paddings in pixels using a single value.
     */
    public UiTable setCellPadding(String cellPadding2) {
        if (jsBase == null) {
            this.cellPadding = null;
            this.cellPadding1 = null;
            this.cellPadding2 = null;
            
            this.cellPadding2 = cellPadding2;
        } else {
            this.cellPadding2 = cellPadding2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".cellPadding(%s)", wrapQuotes(cellPadding2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s)", wrapQuotes(cellPadding2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    /**
     * Setter for cell paddings in pixels using several numbers.
     */
    public UiTable setCellPadding(String value, String value2, String value4, String value6) {
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
            js.append(String.format(Locale.US, ".cellPadding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for cell paddings in pixels using several numbers.
     */
    public UiTable setCellPadding(Double value1, Double value3, Double value5, Double value7) {
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
            js.append(String.format(Locale.US, ".cellPadding(%f, %f, %f, %f)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%f, %f, %f, %f)", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double colsCount;

    /**
     * Setter for table columns count.
     */
    public UiTable setColsCount(Double colsCount) {
        if (jsBase == null) {
            this.colsCount = colsCount;
        } else {
            this.colsCount = colsCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".colsCount(%f)", colsCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colsCount(%f)", colsCount));
                js.setLength(0);
            }
        }
        return this;
    }

    private String colsMaxWidth;
    private Double colsMaxWidth1;

    /**
     * Setter for the column width maximum.
     */
    public UiTable setColsMaxWidth(String colsMaxWidth) {
        if (jsBase == null) {
            this.colsMaxWidth = null;
            this.colsMaxWidth1 = null;
            
            this.colsMaxWidth = colsMaxWidth;
        } else {
            this.colsMaxWidth = colsMaxWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".colsMaxWidth(%s)", wrapQuotes(colsMaxWidth)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colsMaxWidth(%s)", wrapQuotes(colsMaxWidth)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the column width maximum.
     */
    public UiTable setColsMaxWidth(Double colsMaxWidth1) {
        if (jsBase == null) {
            this.colsMaxWidth = null;
            this.colsMaxWidth1 = null;
            
            this.colsMaxWidth1 = colsMaxWidth1;
        } else {
            this.colsMaxWidth1 = colsMaxWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".colsMaxWidth(%f)", colsMaxWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colsMaxWidth(%f)", colsMaxWidth1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String colsMinWidth;
    private Double colsMinWidth1;

    /**
     * Setter for column width minimum.
     */
    public UiTable setColsMinWidth(String colsMinWidth) {
        if (jsBase == null) {
            this.colsMinWidth = null;
            this.colsMinWidth1 = null;
            
            this.colsMinWidth = colsMinWidth;
        } else {
            this.colsMinWidth = colsMinWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".colsMinWidth(%s)", wrapQuotes(colsMinWidth)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colsMinWidth(%s)", wrapQuotes(colsMinWidth)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for column width minimum.
     */
    public UiTable setColsMinWidth(Double colsMinWidth1) {
        if (jsBase == null) {
            this.colsMinWidth = null;
            this.colsMinWidth1 = null;
            
            this.colsMinWidth1 = colsMinWidth1;
        } else {
            this.colsMinWidth1 = colsMinWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".colsMinWidth(%f)", colsMinWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colsMinWidth(%f)", colsMinWidth1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String colsWidth;
    private Double colsWidth1;

    /**
     * Setter for the column width.
     */
    public UiTable setColsWidth(String colsWidth) {
        if (jsBase == null) {
            this.colsWidth = null;
            this.colsWidth1 = null;
            
            this.colsWidth = colsWidth;
        } else {
            this.colsWidth = colsWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".colsWidth(%s)", wrapQuotes(colsWidth)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colsWidth(%s)", wrapQuotes(colsWidth)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the column width.
     */
    public UiTable setColsWidth(Double colsWidth1) {
        if (jsBase == null) {
            this.colsWidth = null;
            this.colsWidth1 = null;
            
            this.colsWidth1 = colsWidth1;
        } else {
            this.colsWidth1 = colsWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".colsWidth(%f)", colsWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colsWidth(%f)", colsWidth1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String tableValues;
    private Boolean demergeCells;

    /**
     * Setter for the table content.
     */
    public UiTable setContents(String tableValues, Boolean demergeCells) {
        if (jsBase == null) {
            this.tableValues = tableValues;
            this.demergeCells = demergeCells;
        } else {
            this.tableValues = tableValues;
            this.demergeCells = demergeCells;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".contents(%s, %b)", wrapQuotes(tableValues), demergeCells));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".contents(%s, %b)", wrapQuotes(tableValues), demergeCells));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean disablePointerEvents;

    /**
     * Setter for the text disablePointerEvents option.
     */
    public UiTable setDisablePointerEvents(Boolean disablePointerEvents) {
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

    private String fontColor;

    /**
     * Setter for the text font color.
{@link https://www.w3schools.com/html/html_colors.asp}
     */
    public UiTable setFontColor(String fontColor) {
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

    private Decoration fontDecoration;
    private String fontDecoration1;

    /**
     * Setter for the text font decoration.
     */
    public UiTable setFontDecoration(Decoration fontDecoration) {
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


    /**
     * Setter for the text font decoration.
     */
    public UiTable setFontDecoration(String fontDecoration1) {
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

    private String fontFamily;

    /**
     * Setter for font family.
     */
    public UiTable setFontFamily(String fontFamily) {
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

    private Double fontOpacity;

    /**
     * Setter for the text font opacity.
Double value from 0 to 1.
     */
    public UiTable setFontOpacity(Double fontOpacity) {
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

    private String fontSize;
    private Double fontSize1;

    /**
     * Setter for text font size.
     */
    public UiTable setFontSize(String fontSize) {
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
            js.append(String.format(Locale.US, ".fontSize(%s)", wrapQuotes(fontSize)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%s)", wrapQuotes(fontSize)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for text font size.
     */
    public UiTable setFontSize(Double fontSize1) {
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
            js.append(String.format(Locale.US, ".fontSize(%f)", fontSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%f)", fontSize1));
                js.setLength(0);
            }
        }
        return this;
    }

    private TextFontStyle fontStyle;
    private String fontStyle1;

    /**
     * Setter for the text font style.
     */
    public UiTable setFontStyle(TextFontStyle fontStyle) {
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
            js.append(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle != null) ? fontStyle.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle != null) ? fontStyle.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text font style.
     */
    public UiTable setFontStyle(String fontStyle1) {
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
            js.append(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private TextFontVariant fontVariant;
    private String fontVariant1;

    /**
     * Setter for the text font variant.
     */
    public UiTable setFontVariant(TextFontVariant fontVariant) {
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
            js.append(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant != null) ? fontVariant.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant != null) ? fontVariant.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text font variant.
     */
    public UiTable setFontVariant(String fontVariant1) {
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
            js.append(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String fontWeight;
    private Double fontWeight1;

    /**
     * Setter for the text font weight.
{@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public UiTable setFontWeight(String fontWeight) {
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


    /**
     * Setter for the text font weight.
{@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public UiTable setFontWeight(Double fontWeight1) {
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

    private Double row;
    private Double col;

    /**
     * Returns cell by its row and column number.
     */
    public Cell getCell(Double row, Double col) {
        if (jsBase == null) {
            this.row = row;
            this.col = col;
        } else {
            this.row = row;
            this.col = col;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getCell(%f, %f)", row, col));
                js.setLength(0);
            }
        }
        return new Cell(jsBase);
    }

    private Double col1;

    /**
     * Returns column instance by its number.
     */
    public TableColumn getCol(Double col1) {
        if (jsBase == null) {
            this.col = null;
            this.col1 = null;
            
            this.col1 = col1;
        } else {
            this.col1 = col1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getCol(%f)", col1));
                js.setLength(0);
            }
        }
        return new TableColumn(jsBase);
    }

    private Double width;
    private Double height;
    private Double quality;
    private Boolean forceTransparentWhite;

    /**
     * Returns JPG as base64 string.
     */
    public void getJpgBase64String(Double width, Double height, Double quality, Boolean forceTransparentWhite) {
        if (jsBase == null) {
            this.width = width;
            this.height = height;
            this.quality = quality;
            this.forceTransparentWhite = forceTransparentWhite;
        } else {
            this.width = width;
            this.height = height;
            this.quality = quality;
            this.forceTransparentWhite = forceTransparentWhite;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getJpgBase64String(%f, %f, %f, %b)", width, height, quality, forceTransparentWhite));
                js.setLength(0);
            }
        }
    }

    private Double paperSizeOrWidth;
    private String paperSizeOrWidth1;
    private Double landscapeOrWidth;
    private Boolean landscapeOrWidth1;
    private Double x;
    private Double y;

    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(Double paperSizeOrWidth, Double landscapeOrWidth, Double x, Double y) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth = landscapeOrWidth;
            this.x = x;
            this.y = y;
        } else {
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.landscapeOrWidth = landscapeOrWidth;
            this.x = x;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %f, %f, %f)", paperSizeOrWidth, landscapeOrWidth, x, y));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(Double paperSizeOrWidth, Boolean landscapeOrWidth1, Double x, Double y) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.x = x;
            this.y = y;
        } else {
            this.paperSizeOrWidth = paperSizeOrWidth;
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.x = x;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%f, %b, %f, %f)", paperSizeOrWidth, landscapeOrWidth1, x, y));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String paperSizeOrWidth1, Double landscapeOrWidth, Double x, Double y) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth = landscapeOrWidth;
            this.x = x;
            this.y = y;
        } else {
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.landscapeOrWidth = landscapeOrWidth;
            this.x = x;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %f, %f, %f)", wrapQuotes(paperSizeOrWidth1), landscapeOrWidth, x, y));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String paperSizeOrWidth1, Boolean landscapeOrWidth1, Double x, Double y) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.x = x;
            this.y = y;
        } else {
            this.paperSizeOrWidth1 = paperSizeOrWidth1;
            this.landscapeOrWidth1 = landscapeOrWidth1;
            this.x = x;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %b, %f, %f)", wrapQuotes(paperSizeOrWidth1), landscapeOrWidth1, x, y));
                js.setLength(0);
            }
        }
    }

    private Double width1;
    private Double height1;
    private Double quality1;

    /**
     * Returns PNG as base64 string.
     */
    public void getPngBase64String(Double width1, Double height1, Double quality1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
            this.quality = null;
            this.quality1 = null;
            
            this.quality1 = quality1;
        } else {
            this.width1 = width1;
            this.height1 = height1;
            this.quality1 = quality1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPngBase64String(%f, %f, %f)", width1, height1, quality1));
                js.setLength(0);
            }
        }
    }

    private Double row1;

    /**
     * Returns row instance by its number.
     */
    public Row getRow(Double row1) {
        if (jsBase == null) {
            this.row = null;
            this.row1 = null;
            
            this.row1 = row1;
        } else {
            this.row1 = row1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getRow(%f)", row1));
                js.setLength(0);
            }
        }
        return new Row(jsBase);
    }

    private String paperSizeOrWidth2;
    private Double paperSizeOrWidth3;
    private Boolean landscapeOrHeight;
    private String landscapeOrHeight1;

    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String paperSizeOrWidth2, Boolean landscapeOrHeight) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight = landscapeOrHeight;
        } else {
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight = landscapeOrHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %b)", wrapQuotes(paperSizeOrWidth2), landscapeOrHeight));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String paperSizeOrWidth2, String landscapeOrHeight1) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight1 = landscapeOrHeight1;
        } else {
            this.paperSizeOrWidth2 = paperSizeOrWidth2;
            this.landscapeOrHeight1 = landscapeOrHeight1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s)", wrapQuotes(paperSizeOrWidth2), wrapQuotes(landscapeOrHeight1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(Double paperSizeOrWidth3, Boolean landscapeOrHeight) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight = landscapeOrHeight;
        } else {
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight = landscapeOrHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %b)", paperSizeOrWidth3, landscapeOrHeight));
                js.setLength(0);
            }
        }
    }


    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(Double paperSizeOrWidth3, String landscapeOrHeight1) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            
            this.landscapeOrHeight1 = landscapeOrHeight1;
        } else {
            this.paperSizeOrWidth3 = paperSizeOrWidth3;
            this.landscapeOrHeight1 = landscapeOrHeight1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getSvgBase64String(%f, %s)", paperSizeOrWidth3, wrapQuotes(landscapeOrHeight1)));
                js.setLength(0);
            }
        }
    }

    private TextHAlign hAlign;
    private String hAlign1;

    /**
     * Setter for the text horizontal align.
     */
    public UiTable setHAlign(TextHAlign hAlign) {
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
            js.append(String.format(Locale.US, ".hAlign(%s)", ((hAlign != null) ? hAlign.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hAlign(%s)", ((hAlign != null) ? hAlign.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text horizontal align.
     */
    public UiTable setHAlign(String hAlign1) {
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
            js.append(String.format(Locale.US, ".hAlign(%s)", wrapQuotes(hAlign1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hAlign(%s)", wrapQuotes(hAlign1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String letterSpacing;
    private Double letterSpacing1;

    /**
     * Setter for the text letter spacing.
{@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public UiTable setLetterSpacing(String letterSpacing) {
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
            js.append(String.format(Locale.US, ".letterSpacing(%s)", wrapQuotes(letterSpacing)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".letterSpacing(%s)", wrapQuotes(letterSpacing)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text letter spacing.
{@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public UiTable setLetterSpacing(Double letterSpacing1) {
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
            js.append(String.format(Locale.US, ".letterSpacing(%f)", letterSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".letterSpacing(%f)", letterSpacing1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String lineHeight;
    private Double lineHeight1;

    /**
     * Setter for the text line height. {@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public UiTable setLineHeight(String lineHeight) {
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
            js.append(String.format(Locale.US, ".lineHeight(%s)", wrapQuotes(lineHeight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineHeight(%s)", wrapQuotes(lineHeight)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text line height. {@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public UiTable setLineHeight(Double lineHeight1) {
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
            js.append(String.format(Locale.US, ".lineHeight(%f)", lineHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineHeight(%f)", lineHeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill rowEvenFill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable setRowEvenFill(Fill rowEvenFill) {
        if (jsBase == null) {
            this.rowEvenFill = rowEvenFill;
        } else {
            this.rowEvenFill = rowEvenFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s)", ((rowEvenFill != null) ? rowEvenFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s)", ((rowEvenFill != null) ? rowEvenFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color4;
    private Double opacity3;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTable rowEvenFill(String color4, Double opacity3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
        } else {
            this.color4 = color4;
            this.opacity3 = opacity3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %f)", wrapQuotes(color4), opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %f)", wrapQuotes(color4), opacity3));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Double opacity4;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowEvenFill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys4 = keys4;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowEvenFill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys4 = keys4;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowEvenFill(GradientKey[] keys4, String mode6, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys4 = keys4;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowEvenFill(String[] keys5, Boolean mode4, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys5 = keys5;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowEvenFill(String[] keys5, VectorRect mode5, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys5 = keys5;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowEvenFill(String[] keys5, String mode6, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys5 = keys5;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity4 = opacity4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private GraphicsMathRect mode7;
    private Double opacity5;
    private Double fx1;
    private Double fy1;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowEvenFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowEvenFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings1;
    private Fill rowOddFill;

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable setRowOddFill(Fill rowOddFill) {
        if (jsBase == null) {
            this.rowOddFill = rowOddFill;
        } else {
            this.rowOddFill = rowOddFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s)", ((rowOddFill != null) ? rowOddFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s)", ((rowOddFill != null) ? rowOddFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color5;
    private Double opacity6;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiTable rowOddFill(String color5, Double opacity6) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
        } else {
            this.color5 = color5;
            this.opacity6 = opacity6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %f)", wrapQuotes(color5), opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %f)", wrapQuotes(color5), opacity6));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode8;
    private VectorRect mode9;
    private String mode10;
    private Double opacity7;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowOddFill(GradientKey[] keys8, Boolean mode8, Double angle2, Double opacity7) {
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
        } else {
            this.keys8 = keys8;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %b, %f, %f)", arrayToString(keys8), mode8, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %b, %f, %f)", arrayToString(keys8), mode8, angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowOddFill(GradientKey[] keys8, VectorRect mode9, Double angle2, Double opacity7) {
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
        } else {
            this.keys8 = keys8;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToString(keys8), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToString(keys8), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowOddFill(GradientKey[] keys8, String mode10, Double angle2, Double opacity7) {
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
        } else {
            this.keys8 = keys8;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToString(keys8), wrapQuotes(mode10), angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToString(keys8), wrapQuotes(mode10), angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowOddFill(String[] keys9, Boolean mode8, Double angle2, Double opacity7) {
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
        } else {
            this.keys9 = keys9;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys9), mode8, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys9), mode8, angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowOddFill(String[] keys9, VectorRect mode9, Double angle2, Double opacity7) {
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
        } else {
            this.keys9 = keys9;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowOddFill(String[] keys9, String mode10, Double angle2, Double opacity7) {
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
        } else {
            this.keys9 = keys9;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity7 = opacity7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), wrapQuotes(mode10), angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), wrapQuotes(mode10), angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private GraphicsMathRect mode11;
    private Double opacity8;
    private Double fx2;
    private Double fy2;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowOddFill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
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
            js.append(String.format(Locale.US, ".rowOddFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiTable rowOddFill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
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
            js.append(String.format(Locale.US, ".rowOddFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings2;
    private Double rowsCount;

    /**
     * Setter for table rows count.
     */
    public UiTable setRowsCount(Double rowsCount) {
        if (jsBase == null) {
            this.rowsCount = rowsCount;
        } else {
            this.rowsCount = rowsCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowsCount(%f)", rowsCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowsCount(%f)", rowsCount));
                js.setLength(0);
            }
        }
        return this;
    }

    private String rowsHeight;
    private Double rowsHeight1;

    /**
     * Setter for row height.
     */
    public UiTable setRowsHeight(String rowsHeight) {
        if (jsBase == null) {
            this.rowsHeight = null;
            this.rowsHeight1 = null;
            
            this.rowsHeight = rowsHeight;
        } else {
            this.rowsHeight = rowsHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowsHeight(%s)", wrapQuotes(rowsHeight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowsHeight(%s)", wrapQuotes(rowsHeight)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for row height.
     */
    public UiTable setRowsHeight(Double rowsHeight1) {
        if (jsBase == null) {
            this.rowsHeight = null;
            this.rowsHeight1 = null;
            
            this.rowsHeight1 = rowsHeight1;
        } else {
            this.rowsHeight1 = rowsHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowsHeight(%f)", rowsHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowsHeight(%f)", rowsHeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String rowsMaxHeight;
    private Double rowsMaxHeight1;

    /**
     * Setter for the row height maximum.
     */
    public UiTable setRowsMaxHeight(String rowsMaxHeight) {
        if (jsBase == null) {
            this.rowsMaxHeight = null;
            this.rowsMaxHeight1 = null;
            
            this.rowsMaxHeight = rowsMaxHeight;
        } else {
            this.rowsMaxHeight = rowsMaxHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowsMaxHeight(%s)", wrapQuotes(rowsMaxHeight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowsMaxHeight(%s)", wrapQuotes(rowsMaxHeight)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the row height maximum.
     */
    public UiTable setRowsMaxHeight(Double rowsMaxHeight1) {
        if (jsBase == null) {
            this.rowsMaxHeight = null;
            this.rowsMaxHeight1 = null;
            
            this.rowsMaxHeight1 = rowsMaxHeight1;
        } else {
            this.rowsMaxHeight1 = rowsMaxHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowsMaxHeight(%f)", rowsMaxHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowsMaxHeight(%f)", rowsMaxHeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String rowsMinHeight;
    private Double rowsMinHeight1;

    /**
     * Setter for the row height minimum.
     */
    public UiTable setRowsMinHeight(String rowsMinHeight) {
        if (jsBase == null) {
            this.rowsMinHeight = null;
            this.rowsMinHeight1 = null;
            
            this.rowsMinHeight = rowsMinHeight;
        } else {
            this.rowsMinHeight = rowsMinHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowsMinHeight(%s)", wrapQuotes(rowsMinHeight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowsMinHeight(%s)", wrapQuotes(rowsMinHeight)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the row height minimum.
     */
    public UiTable setRowsMinHeight(Double rowsMinHeight1) {
        if (jsBase == null) {
            this.rowsMinHeight = null;
            this.rowsMinHeight1 = null;
            
            this.rowsMinHeight1 = rowsMinHeight1;
        } else {
            this.rowsMinHeight1 = rowsMinHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowsMinHeight(%f)", rowsMinHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowsMinHeight(%f)", rowsMinHeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double width2;
    private Double height2;
    private Double quality2;
    private Boolean forceTransparentWhite1;

    /**
     * Saves the current table into JPEG file.
     */
    public void saveAsJpg(Double width2, Double height2, Double quality2, Boolean forceTransparentWhite1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            
            this.width2 = width2;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            
            this.height2 = height2;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            
            this.quality2 = quality2;
            this.forceTransparentWhite = null;
            this.forceTransparentWhite1 = null;
            
            this.forceTransparentWhite1 = forceTransparentWhite1;
        } else {
            this.width2 = width2;
            this.height2 = height2;
            this.quality2 = quality2;
            this.forceTransparentWhite1 = forceTransparentWhite1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJpg(%f, %f, %f, %b)", width2, height2, quality2, forceTransparentWhite1));
                js.setLength(0);
            }
        }
    }

    private String paperSize;
    private Boolean landscape;
    private Double x1;
    private Double y1;

    /**
     * Saves the current table into PDF file.
     */
    public void saveAsPdf(String paperSize, Boolean landscape, Double x1, Double y1) {
        if (jsBase == null) {
            this.paperSize = paperSize;
            this.landscape = landscape;
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
        } else {
            this.paperSize = paperSize;
            this.landscape = landscape;
            this.x1 = x1;
            this.y1 = y1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %b, %f, %f)", wrapQuotes(paperSize), landscape, x1, y1));
                js.setLength(0);
            }
        }
    }

    private Double width3;
    private Double height3;
    private Double quality3;

    /**
     * Saves the current table into PNG file.
     */
    public void saveAsPng(Double width3, Double height3, Double quality3) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width3 = width3;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height3 = height3;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            this.quality3 = null;
            
            this.quality3 = quality3;
        } else {
            this.width3 = width3;
            this.height3 = height3;
            this.quality3 = quality3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPng(%f, %f, %f)", width3, height3, quality3));
                js.setLength(0);
            }
        }
    }

    private String paperSize1;
    private Boolean landscape1;

    /**
     * Saves the current table into SVG file with a paper size and landscape settings.
     */
    public void saveAsSvg(String paperSize1, Boolean landscape1) {
        if (jsBase == null) {
            this.paperSize = null;
            this.paperSize1 = null;
            
            this.paperSize1 = paperSize1;
            this.landscape = null;
            this.landscape1 = null;
            
            this.landscape1 = landscape1;
        } else {
            this.paperSize1 = paperSize1;
            this.landscape1 = landscape1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %b)", wrapQuotes(paperSize1), landscape1));
                js.setLength(0);
            }
        }
    }

    private Double width4;
    private Double height4;

    /**
     * Saves the current visual state into SVG file image width and height.
     */
    public void saveAsSvg(Double width4, Double height4) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            
            this.width4 = width4;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            
            this.height4 = height4;
        } else {
            this.width4 = width4;
            this.height4 = height4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%f, %f)", width4, height4));
                js.setLength(0);
            }
        }
    }

    private Boolean selectable;

    /**
     * Setter for the text selectable.
     */
    public UiTable setSelectable(Boolean selectable) {
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

    private Boolean asBase;
    private Double width5;
    private Double height5;
    private Double quality4;
    private Boolean forceTransparentWhite2;
    private String filename;

    /**
     * Shares a table as a JPG file and returns a link to the shared image.
     */
    public void shareAsJpg(Boolean asBase, Double width5, Double height5, Double quality4, Boolean forceTransparentWhite2, String filename) {
        if (jsBase == null) {
            this.asBase = asBase;
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            
            this.width5 = width5;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            
            this.height5 = height5;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            this.quality3 = null;
            this.quality4 = null;
            
            this.quality4 = quality4;
            this.forceTransparentWhite = null;
            this.forceTransparentWhite1 = null;
            this.forceTransparentWhite2 = null;
            
            this.forceTransparentWhite2 = forceTransparentWhite2;
            this.filename = filename;
        } else {
            this.asBase = asBase;
            this.width5 = width5;
            this.height5 = height5;
            this.quality4 = quality4;
            this.forceTransparentWhite2 = forceTransparentWhite2;
            this.filename = filename;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsJpg(%b, %f, %f, %f, %b, %s)", asBase, width5, height5, quality4, forceTransparentWhite2, wrapQuotes(filename)));
                js.setLength(0);
            }
        }
    }

    private Boolean asBase1;
    private Double paperSizeOrWidth4;
    private String paperSizeOrWidth5;
    private Double landscapeOrWidth2;
    private Boolean landscapeOrWidth3;
    private Double x2;
    private Double y2;
    private String filename1;

    /**
     * Shares a table as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(Double paperSizeOrWidth4, Double landscapeOrWidth2, Boolean asBase1, Double x2, Double y2, String filename1) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.asBase = null;
            this.asBase1 = null;
            
            this.asBase1 = asBase1;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
            this.filename = null;
            this.filename1 = null;
            
            this.filename1 = filename1;
        } else {
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.asBase1 = asBase1;
            this.x2 = x2;
            this.y2 = y2;
            this.filename1 = filename1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%f, %f, %b, %f, %f, %s)", paperSizeOrWidth4, landscapeOrWidth2, asBase1, x2, y2, wrapQuotes(filename1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a table as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(Double paperSizeOrWidth4, Boolean landscapeOrWidth3, Boolean asBase1, Double x2, Double y2, String filename1) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.asBase = null;
            this.asBase1 = null;
            
            this.asBase1 = asBase1;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
            this.filename = null;
            this.filename1 = null;
            
            this.filename1 = filename1;
        } else {
            this.paperSizeOrWidth4 = paperSizeOrWidth4;
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.asBase1 = asBase1;
            this.x2 = x2;
            this.y2 = y2;
            this.filename1 = filename1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%f, %b, %b, %f, %f, %s)", paperSizeOrWidth4, landscapeOrWidth3, asBase1, x2, y2, wrapQuotes(filename1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a table as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String paperSizeOrWidth5, Double landscapeOrWidth2, Boolean asBase1, Double x2, Double y2, String filename1) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.asBase = null;
            this.asBase1 = null;
            
            this.asBase1 = asBase1;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
            this.filename = null;
            this.filename1 = null;
            
            this.filename1 = filename1;
        } else {
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.landscapeOrWidth2 = landscapeOrWidth2;
            this.asBase1 = asBase1;
            this.x2 = x2;
            this.y2 = y2;
            this.filename1 = filename1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %f, %b, %f, %f, %s)", wrapQuotes(paperSizeOrWidth5), landscapeOrWidth2, asBase1, x2, y2, wrapQuotes(filename1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a table as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String paperSizeOrWidth5, Boolean landscapeOrWidth3, Boolean asBase1, Double x2, Double y2, String filename1) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.landscapeOrWidth = null;
            this.landscapeOrWidth1 = null;
            this.landscapeOrWidth2 = null;
            this.landscapeOrWidth3 = null;
            
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.asBase = null;
            this.asBase1 = null;
            
            this.asBase1 = asBase1;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
            this.filename = null;
            this.filename1 = null;
            
            this.filename1 = filename1;
        } else {
            this.paperSizeOrWidth5 = paperSizeOrWidth5;
            this.landscapeOrWidth3 = landscapeOrWidth3;
            this.asBase1 = asBase1;
            this.x2 = x2;
            this.y2 = y2;
            this.filename1 = filename1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %b, %b, %f, %f, %s)", wrapQuotes(paperSizeOrWidth5), landscapeOrWidth3, asBase1, x2, y2, wrapQuotes(filename1)));
                js.setLength(0);
            }
        }
    }

    private Boolean asBase2;
    private Double width6;
    private Double height6;
    private Double quality5;
    private String filename2;

    /**
     * Shares a table as a PNG file and returns a link to the shared image.
     */
    public void shareAsPng(Boolean asBase2, Double width6, Double height6, Double quality5, String filename2) {
        if (jsBase == null) {
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            
            this.asBase2 = asBase2;
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            
            this.width6 = width6;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            
            this.height6 = height6;
            this.quality = null;
            this.quality1 = null;
            this.quality2 = null;
            this.quality3 = null;
            this.quality4 = null;
            this.quality5 = null;
            
            this.quality5 = quality5;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            
            this.filename2 = filename2;
        } else {
            this.asBase2 = asBase2;
            this.width6 = width6;
            this.height6 = height6;
            this.quality5 = quality5;
            this.filename2 = filename2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsPng(%b, %f, %f, %f, %s)", asBase2, width6, height6, quality5, wrapQuotes(filename2)));
                js.setLength(0);
            }
        }
    }

    private Boolean asBase3;
    private String paperSizeOrWidth6;
    private Double paperSizeOrWidth7;
    private Boolean landscapeOrHeight2;
    private String landscapeOrHeight3;
    private String filename3;

    /**
     * Shares a table as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String paperSizeOrWidth6, Boolean landscapeOrHeight2, Boolean asBase3, String filename3) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight2 = landscapeOrHeight2;
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            this.asBase3 = null;
            
            this.asBase3 = asBase3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            
            this.filename3 = filename3;
        } else {
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.landscapeOrHeight2 = landscapeOrHeight2;
            this.asBase3 = asBase3;
            this.filename3 = filename3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %b, %b, %s)", wrapQuotes(paperSizeOrWidth6), landscapeOrHeight2, asBase3, wrapQuotes(filename3)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a table as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String paperSizeOrWidth6, String landscapeOrHeight3, Boolean asBase3, String filename3) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight3 = landscapeOrHeight3;
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            this.asBase3 = null;
            
            this.asBase3 = asBase3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            
            this.filename3 = filename3;
        } else {
            this.paperSizeOrWidth6 = paperSizeOrWidth6;
            this.landscapeOrHeight3 = landscapeOrHeight3;
            this.asBase3 = asBase3;
            this.filename3 = filename3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %b, %s)", wrapQuotes(paperSizeOrWidth6), wrapQuotes(landscapeOrHeight3), asBase3, wrapQuotes(filename3)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a table as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(Double paperSizeOrWidth7, Boolean landscapeOrHeight2, Boolean asBase3, String filename3) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight2 = landscapeOrHeight2;
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            this.asBase3 = null;
            
            this.asBase3 = asBase3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            
            this.filename3 = filename3;
        } else {
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.landscapeOrHeight2 = landscapeOrHeight2;
            this.asBase3 = asBase3;
            this.filename3 = filename3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%f, %b, %b, %s)", paperSizeOrWidth7, landscapeOrHeight2, asBase3, wrapQuotes(filename3)));
                js.setLength(0);
            }
        }
    }


    /**
     * Shares a table as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(Double paperSizeOrWidth7, String landscapeOrHeight3, Boolean asBase3, String filename3) {
        if (jsBase == null) {
            this.paperSizeOrWidth = null;
            this.paperSizeOrWidth1 = null;
            this.paperSizeOrWidth2 = null;
            this.paperSizeOrWidth3 = null;
            this.paperSizeOrWidth4 = null;
            this.paperSizeOrWidth5 = null;
            this.paperSizeOrWidth6 = null;
            this.paperSizeOrWidth7 = null;
            
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.landscapeOrHeight = null;
            this.landscapeOrHeight1 = null;
            this.landscapeOrHeight2 = null;
            this.landscapeOrHeight3 = null;
            
            this.landscapeOrHeight3 = landscapeOrHeight3;
            this.asBase = null;
            this.asBase1 = null;
            this.asBase2 = null;
            this.asBase3 = null;
            
            this.asBase3 = asBase3;
            this.filename = null;
            this.filename1 = null;
            this.filename2 = null;
            this.filename3 = null;
            
            this.filename3 = filename3;
        } else {
            this.paperSizeOrWidth7 = paperSizeOrWidth7;
            this.landscapeOrHeight3 = landscapeOrHeight3;
            this.asBase3 = asBase3;
            this.filename3 = filename3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shareAsSvg(%f, %s, %b, %s)", paperSizeOrWidth7, wrapQuotes(landscapeOrHeight3), asBase3, wrapQuotes(filename3)));
                js.setLength(0);
            }
        }
    }

    private Direction textDirection;
    private String textDirection1;

    /**
     * Setter for the text direction.
     */
    public UiTable setTextDirection(Direction textDirection) {
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
            js.append(String.format(Locale.US, ".textDirection(%s)", ((textDirection != null) ? textDirection.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textDirection(%s)", ((textDirection != null) ? textDirection.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text direction.
     */
    public UiTable setTextDirection(String textDirection1) {
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
            js.append(String.format(Locale.US, ".textDirection(%s)", wrapQuotes(textDirection1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textDirection(%s)", wrapQuotes(textDirection1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double textIndent;

    /**
     * Setter for the text indent.
     */
    public UiTable setTextIndent(Double textIndent) {
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

    private TextOverflow textOverflow;
    private String textOverflow1;

    /**
     * Setter for the text overflow settings.
     */
    public UiTable setTextOverflow(TextOverflow textOverflow) {
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


    /**
     * Setter for the text overflow settings.
     */
    public UiTable setTextOverflow(String textOverflow1) {
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

    private String paperSize2;
    private Boolean landscape2;

    /**
     * Returns SVG string if type of content SVG with parameters otherwise returns empty string.
     */
    public void toSvg(String paperSize2, Boolean landscape2) {
        if (jsBase == null) {
            this.paperSize = null;
            this.paperSize1 = null;
            this.paperSize2 = null;
            
            this.paperSize2 = paperSize2;
            this.landscape = null;
            this.landscape1 = null;
            this.landscape2 = null;
            
            this.landscape2 = landscape2;
        } else {
            this.paperSize2 = paperSize2;
            this.landscape2 = landscape2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%s, %b)", wrapQuotes(paperSize2), landscape2));
                js.setLength(0);
            }
        }
    }

    private Double width7;
    private Double height7;

    /**
     * Returns SVG string if type of content SVG with determined the width and height otherwise returns empty string.
     */
    public void toSvg(Double width7, Double height7) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            
            this.width7 = width7;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            
            this.height7 = height7;
        } else {
            this.width7 = width7;
            this.height7 = height7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%f, %f)", width7, height7));
                js.setLength(0);
            }
        }
    }

    private Boolean useHtml;

    /**
     * Setter for flag useHtml.
     */
    public UiTable setUseHtml(Boolean useHtml) {
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

    private TextVAlign vAlign;
    private String vAlign1;

    /**
     * Setter for the text vertical align.
     */
    public UiTable setVAlign(TextVAlign vAlign) {
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
            js.append(String.format(Locale.US, ".vAlign(%s)", ((vAlign != null) ? vAlign.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vAlign(%s)", ((vAlign != null) ? vAlign.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the text vertical align.
     */
    public UiTable setVAlign(String vAlign1) {
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
            js.append(String.format(Locale.US, ".vAlign(%s)", wrapQuotes(vAlign1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vAlign(%s)", wrapQuotes(vAlign1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private EnumsWordBreak wordBreak;
    private String wordBreak1;

    /**
     * Setter for the word-break mode.
     */
    public UiTable setWordBreak(EnumsWordBreak wordBreak) {
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


    /**
     * Setter for the word-break mode.
     */
    public UiTable setWordBreak(String wordBreak1) {
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

    private EnumsWordWrap wordWrap;
    private String wordWrap1;

    /**
     * Setter for the word-wrap mode.
     */
    public UiTable setWordWrap(EnumsWordWrap wordWrap) {
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


    /**
     * Setter for the word-wrap mode.
     */
    public UiTable setWordWrap(String wordWrap1) {
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

    private String generateJSgetBorder() {
        if (getBorder != null) {
            return getBorder.generateJs();
        }
        return "";
    }

    private String generateJSgetCellPadding() {
        if (getCellPadding != null) {
            return getCellPadding.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetBorder());
        jsGetters.append(generateJSgetCellPadding());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}