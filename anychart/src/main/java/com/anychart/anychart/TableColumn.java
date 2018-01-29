package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Table column settings container.
 */
public class TableColumn extends TableBase {

    public TableColumn() {
        js.setLength(0);
        js.append("var tableColumn").append(++variableIndex).append(" = anychart.core.ui.table.column();");
        jsBase = "tableColumn" + variableIndex;
    }

    protected TableColumn(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TableColumn(StringBuilder js, String jsBase, boolean isChain) {
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
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<TableBase> setCellBorder = new ArrayList<>();

    /**
     * Setter for cell border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public TableBase setCellBorder(Stroke color, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            
            js.append(String.format(Locale.US, "var setCellBorder" + ++variableIndex + " = " + jsBase + ".cellBorder(%s, %s, %s, %s, %s);", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellBorder(%s, %s, %s, %s, %s);", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellBorder" + variableIndex);
        setCellBorder.add(item);
        return item;
    }
    private String generateJSsetCellBorder() {
        if (!setCellBorder.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellBorder) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableBase> setCellBorder1 = new ArrayList<>();

    /**
     * Setter for cell border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public TableBase setCellBorder(ColoredFill color1, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            
            js.append(String.format(Locale.US, "var setCellBorder1" + ++variableIndex + " = " + jsBase + ".cellBorder(%s, %s, %s, %s, %s);", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellBorder(%s, %s, %s, %s, %s);", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellBorder1" + variableIndex);
        setCellBorder1.add(item);
        return item;
    }
    private String generateJSsetCellBorder1() {
        if (!setCellBorder1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellBorder1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableBase> setCellBorder2 = new ArrayList<>();

    /**
     * Setter for cell border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public TableBase setCellBorder(String color2, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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
            
            js.append(String.format(Locale.US, "var setCellBorder2" + ++variableIndex + " = " + jsBase + ".cellBorder(%s, %s, %s, %s, %s);", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellBorder(%s, %s, %s, %s, %s);", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellBorder2" + variableIndex);
        setCellBorder2.add(item);
        return item;
    }
    private String generateJSsetCellBorder2() {
        if (!setCellBorder2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellBorder2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill cellFill;
    private List<TableBase> setCellFill = new ArrayList<>();

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
            
            js.append(String.format(Locale.US, "var setCellFill" + ++variableIndex + " = " + jsBase + ".cellFill(%s);", ((cellFill != null) ? cellFill.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s);", ((cellFill != null) ? cellFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellFill" + variableIndex);
        setCellFill.add(item);
        return item;
    }
    private String generateJSsetCellFill() {
        if (!setCellFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color3;
    private Number opacity;
    private List<TableBase> setCellFill1 = new ArrayList<>();

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public TableBase cellFill(String color3, Number opacity) {
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
            
            js.append(String.format(Locale.US, "var setCellFill1" + ++variableIndex + " = " + jsBase + ".cellFill(%s, %s);", wrapQuotes(color3), opacity));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s);", wrapQuotes(color3), opacity));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellFill1" + variableIndex);
        setCellFill1.add(item);
        return item;
    }
    private String generateJSsetCellFill1() {
        if (!setCellFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Number angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Number opacity1;
    private List<TableBase> setCellFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(GradientKey[] keys, Number angle, Number opacity1, Boolean mode) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setCellFill2" + ++variableIndex + " = " + jsBase + ".cellFill(%s, %s, %s, %b);", arrayToString(keys), angle, opacity1, mode));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %s, %b);", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellFill2" + variableIndex);
        setCellFill2.add(item);
        return item;
    }
    private String generateJSsetCellFill2() {
        if (!setCellFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableBase> setCellFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(GradientKey[] keys, Number angle, Number opacity1, VectorRect mode1) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, "var setCellFill3" + ++variableIndex + " = " + jsBase + ".cellFill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellFill3" + variableIndex);
        setCellFill3.add(item);
        return item;
    }
    private String generateJSsetCellFill3() {
        if (!setCellFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableBase> setCellFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(GradientKey[] keys, Number angle, Number opacity1, String mode2) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setCellFill4" + ++variableIndex + " = " + jsBase + ".cellFill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %s, %s);", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellFill4" + variableIndex);
        setCellFill4.add(item);
        return item;
    }
    private String generateJSsetCellFill4() {
        if (!setCellFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableBase> setCellFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(String[] keys1, Number angle, Number opacity1, Boolean mode) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setCellFill5" + ++variableIndex + " = " + jsBase + ".cellFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %s, %b);", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellFill5" + variableIndex);
        setCellFill5.add(item);
        return item;
    }
    private String generateJSsetCellFill5() {
        if (!setCellFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableBase> setCellFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(String[] keys1, Number angle, Number opacity1, VectorRect mode1) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, "var setCellFill6" + ++variableIndex + " = " + jsBase + ".cellFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellFill6" + variableIndex);
        setCellFill6.add(item);
        return item;
    }
    private String generateJSsetCellFill6() {
        if (!setCellFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableBase> setCellFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(String[] keys1, Number angle, Number opacity1, String mode2) {
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setCellFill7" + ++variableIndex + " = " + jsBase + ".cellFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellFill7" + variableIndex);
        setCellFill7.add(item);
        return item;
    }
    private String generateJSsetCellFill7() {
        if (!setCellFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Number cx;
    private Number cy;
    private GraphicsMathRect mode3;
    private Number opacity2;
    private Number fx;
    private Number fy;
    private List<TableBase> setCellFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(GradientKey[] keys2, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, "var setCellFill8" + ++variableIndex + " = " + jsBase + ".cellFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellFill8" + variableIndex);
        setCellFill8.add(item);
        return item;
    }
    private String generateJSsetCellFill8() {
        if (!setCellFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableBase> setCellFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public TableBase cellFill(String[] keys3, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
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
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, "var setCellFill9" + ++variableIndex + " = " + jsBase + ".cellFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellFill9" + variableIndex);
        setCellFill9.add(item);
        return item;
    }
    private String generateJSsetCellFill9() {
        if (!setCellFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private TablePadding getCellPadding;

    /**
     * Getter for padding settings object.
     */
    public TablePadding getCellPadding() {
        if (getCellPadding == null)
            getCellPadding = new TablePadding(jsBase + ".cellPadding()");

        return getCellPadding;
    }

    private Number[] cellPadding;
    private String[] cellPadding1;
    private String cellPadding2;
    private List<TableBase> setCellPadding = new ArrayList<>();

    /**
     * Setter for current cell paddings in pixels using a single value.
     */
    public TableBase setCellPadding(Number[] cellPadding) {
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
            
            js.append(String.format(Locale.US, "var setCellPadding" + ++variableIndex + " = " + jsBase + ".cellPadding(%s);", Arrays.toString(cellPadding)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s);", Arrays.toString(cellPadding)));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellPadding" + variableIndex);
        setCellPadding.add(item);
        return item;
    }
    private String generateJSsetCellPadding() {
        if (!setCellPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableBase> setCellPadding1 = new ArrayList<>();

    /**
     * Setter for current cell paddings in pixels using a single value.
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
            
            js.append(String.format(Locale.US, "var setCellPadding1" + ++variableIndex + " = " + jsBase + ".cellPadding(%s);", arrayToStringWrapQuotes(cellPadding1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s);", arrayToStringWrapQuotes(cellPadding1)));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellPadding1" + variableIndex);
        setCellPadding1.add(item);
        return item;
    }
    private String generateJSsetCellPadding1() {
        if (!setCellPadding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableBase> setCellPadding2 = new ArrayList<>();

    /**
     * Setter for current cell paddings in pixels using a single value.
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
            
            js.append(String.format(Locale.US, "var setCellPadding2" + ++variableIndex + " = " + jsBase + ".cellPadding(%s);", wrapQuotes(cellPadding2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s);", wrapQuotes(cellPadding2)));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellPadding2" + variableIndex);
        setCellPadding2.add(item);
        return item;
    }
    private String generateJSsetCellPadding2() {
        if (!setCellPadding2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellPadding2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String value;
    private Number value1;
    private String value2;
    private Number value3;
    private String value4;
    private Number value5;
    private String value6;
    private Number value7;
    private List<TableBase> setCellPadding3 = new ArrayList<>();

    /**
     * Setter for current cell paddings in pixels using several numbers.
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
            
            js.append(String.format(Locale.US, "var setCellPadding3" + ++variableIndex + " = " + jsBase + ".cellPadding(%s, %s, %s, %s);", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s, %s, %s, %s);", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellPadding3" + variableIndex);
        setCellPadding3.add(item);
        return item;
    }
    private String generateJSsetCellPadding3() {
        if (!setCellPadding3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellPadding3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableBase> setCellPadding4 = new ArrayList<>();

    /**
     * Setter for current cell paddings in pixels using several numbers.
     */
    public TableBase setCellPadding(Number value1, Number value3, Number value5, Number value7) {
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
            
            js.append(String.format(Locale.US, "var setCellPadding4" + ++variableIndex + " = " + jsBase + ".cellPadding(%s, %s, %s, %s);", value1, value3, value5, value7));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s, %s, %s, %s);", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        TableBase item = new TableBase("setCellPadding4" + variableIndex);
        setCellPadding4.add(item);
        return item;
    }
    private String generateJSsetCellPadding4() {
        if (!setCellPadding4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableBase item : setCellPadding4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number row;
    private List<Cell> setGetCell = new ArrayList<>();

    /**
     * Returns cell of current column by row index.
     */
    public Cell getCell(Number row) {
        if (jsBase == null) {
            this.row = row;
        } else {
            this.row = row;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setGetCell" + ++variableIndex + " = " + jsBase + ".getCell(%s);", row));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getCell(%s);", row));
                js.setLength(0);
            }
        }
        Cell item = new Cell("setGetCell" + variableIndex);
        setGetCell.add(item);
        return item;
    }
    private String generateJSsetGetCell() {
        if (!setGetCell.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cell item : setGetCell) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableColumn> getMaxWidth = new ArrayList<>();

    /**
     * Getter and setter for column max width settings.
     */
    public TableColumn getMaxWidth(String maxWidth) {
        TableColumn item = new TableColumn(jsBase + ".maxWidth(" + wrapQuotes(maxWidth) + ")");
        getMaxWidth.add(item);
        return item;
    }

    private List<TableColumn> getMaxWidth1 = new ArrayList<>();

    /**
     * Getter and setter for column max width settings.
     */
    public TableColumn getMaxWidth(Number maxWidth) {
        TableColumn item = new TableColumn(jsBase + ".maxWidth(" + maxWidth + ")");
        getMaxWidth1.add(item);
        return item;
    }

    private String minWidth;
    private Number minWidth1;

    /**
     * Setter for column minimum width settings.
     */
    public TableColumn setMinWidth(String minWidth) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth = minWidth;
        } else {
            this.minWidth = minWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minWidth(%s)", wrapQuotes(minWidth)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minWidth(%s);", wrapQuotes(minWidth)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for column minimum width settings.
     */
    public TableColumn setMinWidth(Number minWidth1) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth1 = minWidth1;
        } else {
            this.minWidth1 = minWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minWidth(%s)", minWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minWidth(%s);", minWidth1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String width;
    private Number width1;

    /**
     * Setter for column width settings.
     */
    public TableColumn setWidth(String width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for column width settings.
     */
    public TableColumn setWidth(Number width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%s)", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width1));
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

    private String generateJSgetMaxWidth() {
        if (!getMaxWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableColumn item : getMaxWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetMaxWidth1() {
        if (!getMaxWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableColumn item : getMaxWidth1) {
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
        jsGetters.append(generateJSgetMaxWidth());
        jsGetters.append(generateJSgetMaxWidth1());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetCellBorder());
        js.append(generateJSsetCellBorder1());
        js.append(generateJSsetCellBorder2());
        js.append(generateJSsetCellFill());
        js.append(generateJSsetCellFill1());
        js.append(generateJSsetCellFill2());
        js.append(generateJSsetCellFill3());
        js.append(generateJSsetCellFill4());
        js.append(generateJSsetCellFill5());
        js.append(generateJSsetCellFill6());
        js.append(generateJSsetCellFill7());
        js.append(generateJSsetCellFill8());
        js.append(generateJSsetCellFill9());
        js.append(generateJSsetCellPadding());
        js.append(generateJSsetCellPadding1());
        js.append(generateJSsetCellPadding2());
        js.append(generateJSsetCellPadding3());
        js.append(generateJSsetCellPadding4());
        js.append(generateJSsetGetCell());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}