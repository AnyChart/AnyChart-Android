package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Table row settings container.
 */
public class Row extends TableBase {

    public Row() {
        js.setLength(0);
        js.append("var row").append(++variableIndex).append(" = anychart.core.ui.table.row();");
        jsBase = "row" + variableIndex;
    }

    protected Row(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Row(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Border getCellBorder;

    /**
     * Getter for border settings object.
     */
    public Border getCellBorder() {
        if (getCellBorder == null)
            getCellBorder = new Border(jsBase + ".cellBorder()");

        return getCellBorder;
    }

    private Stroke color;
    private ColoredFill color1;
    private String color2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for cell border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public TableBase setCellBorder(Stroke color, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellBorder(%s, %f, %s, %s, %s);", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellBorder(%s, %f, %s, %s, %s)", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }


    /**
     * Setter for cell border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public TableBase setCellBorder(ColoredFill color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellBorder(%s, %f, %s, %s, %s);", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellBorder(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }


    /**
     * Setter for cell border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public TableBase setCellBorder(String color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellBorder(%s, %f, %s, %s, %s);", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellBorder(%s, %f, %s, %s, %s)", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }

    private Fill cellFill;

    /**
     * Sets fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase setCellFill(Fill cellFill) {
        if (jsBase == null) {
            this.cellFill = cellFill;
        } else {
            this.cellFill = cellFill;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s);", ((cellFill != null) ? cellFill.generateJs() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s)", ((cellFill != null) ? cellFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }

    private String color3;
    private Double opacity;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public TableBase cellFill(String color3, Double opacity) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %f);", wrapQuotes(color3), opacity));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %f)", wrapQuotes(color3), opacity));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
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
    public TableBase cellFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f);", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f);", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %b, %f, %f);", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f);", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(String[] keys1, String mode2, Double angle, Double opacity1) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f);", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
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
    public TableBase cellFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %f, %f, %s, %f, %f, %f);", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }

    private Fill imageSettings;
    private TablePadding getCellPadding;

    /**
     * Getter for padding settings.
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
    public TableBase setCellPadding(Double[] cellPadding) {
        if (jsBase == null) {
            this.cellPadding = null;
            this.cellPadding1 = null;
            this.cellPadding2 = null;
            
            this.cellPadding = cellPadding;
        } else {
            this.cellPadding = cellPadding;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellPadding(%s);", Arrays.toString(cellPadding)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s)", Arrays.toString(cellPadding)));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }


    /**
     * Setter for cell paddings in pixels using a single value.
     */
    public TableBase setCellPadding(String[] cellPadding1) {
        if (jsBase == null) {
            this.cellPadding = null;
            this.cellPadding1 = null;
            this.cellPadding2 = null;
            
            this.cellPadding1 = cellPadding1;
        } else {
            this.cellPadding1 = cellPadding1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellPadding(%s);", arrayToStringWrapQuotes(cellPadding1)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s)", arrayToStringWrapQuotes(cellPadding1)));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }


    /**
     * Setter for cell paddings in pixels using a single value.
     */
    public TableBase setCellPadding(String cellPadding2) {
        if (jsBase == null) {
            this.cellPadding = null;
            this.cellPadding1 = null;
            this.cellPadding2 = null;
            
            this.cellPadding2 = cellPadding2;
        } else {
            this.cellPadding2 = cellPadding2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellPadding(%s);", wrapQuotes(cellPadding2)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s)", wrapQuotes(cellPadding2)));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
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
    public TableBase setCellPadding(String value, String value2, String value4, String value6) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellPadding(%s, %s, %s, %s);", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }


    /**
     * Setter for cell paddings in pixels using several numbers.
     */
    public TableBase setCellPadding(Double value1, Double value3, Double value5, Double value7) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".cellPadding(%f, %f, %f, %f);", value1, value3, value5, value7));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%f, %f, %f, %f)", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return new TableBase(jsBase);
    }

    private Double col;

    /**
     * Returns cell of current row by column index.
     */
    public Cell getCell(Double col) {
        if (jsBase == null) {
            this.col = col;
        } else {
            this.col = col;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getCell(%f);", col));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getCell(%f)", col));
                js.setLength(0);
            }
        }
        return new Cell(jsBase);
    }

    private String height;
    private Double height1;

    /**
     * Setter for row height settings.
     */
    public Row setHeight(String height) {
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

            js.append(String.format(Locale.US, ".height(%s)", wrapQuotes(height)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%s)", wrapQuotes(height)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for row height settings.
     */
    public Row setHeight(Double height1) {
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

            js.append(String.format(Locale.US, ".height(%f)", height1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%f)", height1));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<Row> getMaxHeight = new ArrayList<>();

    /**
     * Getter for row maximum height settings.
     */
    public Row getMaxHeight(String maxHeight) {
        Row item = new Row(jsBase + ".maxHeight(" + wrapQuotes(maxHeight) + ")");
        getMaxHeight.add(item);
        return item;
    }

    private List<Row> getMaxHeight1 = new ArrayList<>();

    /**
     * Getter for row maximum height settings.
     */
    public Row getMaxHeight(Double maxHeight) {
        Row item = new Row(jsBase + ".maxHeight(" + maxHeight + ")");
        getMaxHeight1.add(item);
        return item;
    }

    private String minHeight;
    private Double minHeight1;

    /**
     * Setter for row minimum height settings.
     */
    public Row setMinHeight(String minHeight) {
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

            js.append(String.format(Locale.US, ".minHeight(%s)", wrapQuotes(minHeight)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minHeight(%s)", wrapQuotes(minHeight)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for row minimum height settings.
     */
    public Row setMinHeight(Double minHeight1) {
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

            js.append(String.format(Locale.US, ".minHeight(%f)", minHeight1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minHeight(%f)", minHeight1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetCellBorder() {
        if (getCellBorder != null) {
            return getCellBorder.generateJs();
        }
        return "";
    }

    private String generateJSgetCellPadding() {
        if (getCellPadding != null) {
            return getCellPadding.generateJs();
        }
        return "";
    }

    private String generateJSgetMaxHeight() {
        if (!getMaxHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Row item : getMaxHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetMaxHeight1() {
        if (!getMaxHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Row item : getMaxHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetCellBorder());
        jsGetters.append(generateJSgetCellPadding());
        jsGetters.append(generateJSgetMaxHeight());
        jsGetters.append(generateJSgetMaxHeight1());

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