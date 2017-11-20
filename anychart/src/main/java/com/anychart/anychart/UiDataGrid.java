package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Data grid element.<br/>
The Data grid is a part of Gantt chart but it also can be used independently.
 */
public class UiDataGrid extends VisualBaseWithBounds {

    public UiDataGrid() {
        js.setLength(0);
        js.append("var uiDataGrid").append(++variableIndex).append(" = anychart.core.ui.dataGrid();");
        jsBase = "uiDataGrid" + variableIndex;
    }

    protected UiDataGrid(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected UiDataGrid(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill backgroundFill;
    private List<UiDataGrid> setBackgroundFill = new ArrayList<>();

    /**
     * Setter for background fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid setBackgroundFill(Fill backgroundFill) {
        if (jsBase == null) {
            this.backgroundFill = backgroundFill;
        } else {
            this.backgroundFill = backgroundFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".backgroundFill(%s)", ((backgroundFill != null) ? backgroundFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s)", ((backgroundFill != null) ? backgroundFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill() {
        if (!setBackgroundFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setBackgroundFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<UiDataGrid> setBackgroundFill1 = new ArrayList<>();

    /**
     * Background fill color with opacity.
     */
    public UiDataGrid backgroundFill(String color, Double opacity) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill1() {
        if (!setBackgroundFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setBackgroundFill1) {
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
    private List<UiDataGrid> setBackgroundFill2 = new ArrayList<>();

    /**
     * Linear gradient background fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid backgroundFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill2() {
        if (!setBackgroundFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setBackgroundFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setBackgroundFill3 = new ArrayList<>();

    /**
     * Linear gradient background fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid backgroundFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill3() {
        if (!setBackgroundFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setBackgroundFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setBackgroundFill4 = new ArrayList<>();

    /**
     * Linear gradient background fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid backgroundFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill4() {
        if (!setBackgroundFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setBackgroundFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setBackgroundFill5 = new ArrayList<>();

    /**
     * Linear gradient background fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid backgroundFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill5() {
        if (!setBackgroundFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setBackgroundFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setBackgroundFill6 = new ArrayList<>();

    /**
     * Linear gradient background fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid backgroundFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill6() {
        if (!setBackgroundFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setBackgroundFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setBackgroundFill7 = new ArrayList<>();

    /**
     * Linear gradient background fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid backgroundFill(String[] keys1, String mode2, Double angle, Double opacity1) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill7() {
        if (!setBackgroundFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setBackgroundFill7) {
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
    private List<UiDataGrid> setBackgroundFill8 = new ArrayList<>();

    /**
     * Radial gradient background fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid backgroundFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill8() {
        if (!setBackgroundFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setBackgroundFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setBackgroundFill9 = new ArrayList<>();

    /**
     * Radial gradient background fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid backgroundFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            js.append(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".backgroundFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackgroundFill9() {
        if (!setBackgroundFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setBackgroundFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private List<DatagridColumn> getColumn = new ArrayList<>();

    /**
     * Getter for column by index.<br/>
Gets column by index or creates a new one if column doesn't exist yet.
     */
    public DatagridColumn getColumn(Double index) {
        DatagridColumn item = new DatagridColumn(jsBase + ".column(" + index + ")");
        getColumn.add(item);
        return item;
    }

    private DatagridColumn column;
    private List<UiDataGrid> setColumn = new ArrayList<>();

    /**
     * Setter for the first column.
     */
    public UiDataGrid setColumn(DatagridColumn column) {
        if (jsBase == null) {
            this.column = column;
        } else {
            this.column = column;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(column.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".column(%s);",  ((column != null) ? column.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetColumn() {
        if (!setColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index;
    private DatagridColumn column1;
    private List<UiDataGrid> setColumn1 = new ArrayList<>();

    /**
     * Setter for the column by index.
     */
    public UiDataGrid setColumn(Double index, DatagridColumn column1) {
        if (jsBase == null) {
            this.index = index;
            this.column = null;
            this.column1 = null;
            
            this.column1 = column1;
        } else {
            this.index = index;
            this.column1 = column1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".column(%f, %s)", index, ((column1 != null) ? column1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".column(%f, %s)", index, ((column1 != null) ? column1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetColumn1() {
        if (!setColumn1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setColumn1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke columnStroke;
    private String columnStroke1;
    private List<UiDataGrid> setColumnStroke = new ArrayList<>();

    /**
     * Setter for the column stroke.
     */
    public UiDataGrid setColumnStroke(Stroke columnStroke) {
        if (jsBase == null) {
            this.columnStroke = null;
            this.columnStroke1 = null;
            
            this.columnStroke = columnStroke;
        } else {
            this.columnStroke = columnStroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".columnStroke(%s)", ((columnStroke != null) ? columnStroke.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".columnStroke(%s)", ((columnStroke != null) ? columnStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetColumnStroke() {
        if (!setColumnStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setColumnStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setColumnStroke1 = new ArrayList<>();

    /**
     * Setter for the column stroke.
     */
    public UiDataGrid setColumnStroke(String columnStroke1) {
        if (jsBase == null) {
            this.columnStroke = null;
            this.columnStroke1 = null;
            
            this.columnStroke1 = columnStroke1;
        } else {
            this.columnStroke1 = columnStroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".columnStroke(%s)", wrapQuotes(columnStroke1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".columnStroke(%s)", wrapQuotes(columnStroke1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetColumnStroke1() {
        if (!setColumnStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setColumnStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Tree getData;

    /**
     * Getter for data.
     */
    public Tree getData() {
        if (getData == null)
            getData = new Tree(jsBase + ".data()");

        return getData;
    }

    private Tree data;
    private List<UiDataGrid> setData = new ArrayList<>();

    /**
     * Setter for new data.
     */
    public UiDataGrid setData(Tree data) {
        if (jsBase == null) {
            this.data = data;
        } else {
            this.data = data;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".data(%s);",  ((data != null) ? data.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke editStructurePreviewDashStroke;
    private String editStructurePreviewDashStroke1;
    private List<UiDataGrid> setEditStructurePreviewDashStroke = new ArrayList<>();

    /**
     * Setter for the structure preview dash stroke in edit mode.
     */
    public UiDataGrid setEditStructurePreviewDashStroke(Stroke editStructurePreviewDashStroke) {
        if (jsBase == null) {
            this.editStructurePreviewDashStroke = null;
            this.editStructurePreviewDashStroke1 = null;
            
            this.editStructurePreviewDashStroke = editStructurePreviewDashStroke;
        } else {
            this.editStructurePreviewDashStroke = editStructurePreviewDashStroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewDashStroke(%s)", ((editStructurePreviewDashStroke != null) ? editStructurePreviewDashStroke.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewDashStroke(%s)", ((editStructurePreviewDashStroke != null) ? editStructurePreviewDashStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewDashStroke() {
        if (!setEditStructurePreviewDashStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewDashStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setEditStructurePreviewDashStroke1 = new ArrayList<>();

    /**
     * Setter for the structure preview dash stroke in edit mode.
     */
    public UiDataGrid setEditStructurePreviewDashStroke(String editStructurePreviewDashStroke1) {
        if (jsBase == null) {
            this.editStructurePreviewDashStroke = null;
            this.editStructurePreviewDashStroke1 = null;
            
            this.editStructurePreviewDashStroke1 = editStructurePreviewDashStroke1;
        } else {
            this.editStructurePreviewDashStroke1 = editStructurePreviewDashStroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewDashStroke(%s)", wrapQuotes(editStructurePreviewDashStroke1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewDashStroke(%s)", wrapQuotes(editStructurePreviewDashStroke1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewDashStroke1() {
        if (!setEditStructurePreviewDashStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewDashStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill editStructurePreviewFill;
    private List<UiDataGrid> setEditStructurePreviewFill = new ArrayList<>();

    /**
     * Setter for structure preview fill settings in edit mode using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid setEditStructurePreviewFill(Fill editStructurePreviewFill) {
        if (jsBase == null) {
            this.editStructurePreviewFill = editStructurePreviewFill;
        } else {
            this.editStructurePreviewFill = editStructurePreviewFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s)", ((editStructurePreviewFill != null) ? editStructurePreviewFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s)", ((editStructurePreviewFill != null) ? editStructurePreviewFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewFill() {
        if (!setEditStructurePreviewFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color1;
    private Double opacity3;
    private List<UiDataGrid> setEditStructurePreviewFill1 = new ArrayList<>();

    /**
     * Structure preview fill color in edit mode with opacity.
     */
    public UiDataGrid editStructurePreviewFill(String color1, Double opacity3) {
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
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %f)", wrapQuotes(color1), opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %f)", wrapQuotes(color1), opacity3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewFill1() {
        if (!setEditStructurePreviewFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewFill1) {
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
    private List<UiDataGrid> setEditStructurePreviewFill2 = new ArrayList<>();

    /**
     * Linear gradient structure preview fill in edit mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid editStructurePreviewFill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity4) {
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
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewFill2() {
        if (!setEditStructurePreviewFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setEditStructurePreviewFill3 = new ArrayList<>();

    /**
     * Linear gradient structure preview fill in edit mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid editStructurePreviewFill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity4) {
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
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewFill3() {
        if (!setEditStructurePreviewFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setEditStructurePreviewFill4 = new ArrayList<>();

    /**
     * Linear gradient structure preview fill in edit mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid editStructurePreviewFill(GradientKey[] keys4, String mode6, Double angle1, Double opacity4) {
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
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewFill4() {
        if (!setEditStructurePreviewFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setEditStructurePreviewFill5 = new ArrayList<>();

    /**
     * Linear gradient structure preview fill in edit mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid editStructurePreviewFill(String[] keys5, Boolean mode4, Double angle1, Double opacity4) {
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
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewFill5() {
        if (!setEditStructurePreviewFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setEditStructurePreviewFill6 = new ArrayList<>();

    /**
     * Linear gradient structure preview fill in edit mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid editStructurePreviewFill(String[] keys5, VectorRect mode5, Double angle1, Double opacity4) {
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
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewFill6() {
        if (!setEditStructurePreviewFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setEditStructurePreviewFill7 = new ArrayList<>();

    /**
     * Linear gradient structure preview fill in edit mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid editStructurePreviewFill(String[] keys5, String mode6, Double angle1, Double opacity4) {
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
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewFill7() {
        if (!setEditStructurePreviewFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewFill7) {
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
    private List<UiDataGrid> setEditStructurePreviewFill8 = new ArrayList<>();

    /**
     * Radial gradient structure preview fill in edit mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid editStructurePreviewFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewFill8() {
        if (!setEditStructurePreviewFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setEditStructurePreviewFill9 = new ArrayList<>();

    /**
     * Radial gradient structure preview fill in edit mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid editStructurePreviewFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
            js.append(String.format(Locale.US, ".editStructurePreviewFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewFill9() {
        if (!setEditStructurePreviewFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings1;
    private Stroke editStructurePreviewStroke;
    private String editStructurePreviewStroke1;
    private List<UiDataGrid> setEditStructurePreviewStroke = new ArrayList<>();

    /**
     * Setter for the structure preview stroke in edit mode.
     */
    public UiDataGrid setEditStructurePreviewStroke(Stroke editStructurePreviewStroke) {
        if (jsBase == null) {
            this.editStructurePreviewStroke = null;
            this.editStructurePreviewStroke1 = null;
            
            this.editStructurePreviewStroke = editStructurePreviewStroke;
        } else {
            this.editStructurePreviewStroke = editStructurePreviewStroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewStroke(%s)", ((editStructurePreviewStroke != null) ? editStructurePreviewStroke.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewStroke(%s)", ((editStructurePreviewStroke != null) ? editStructurePreviewStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewStroke() {
        if (!setEditStructurePreviewStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setEditStructurePreviewStroke1 = new ArrayList<>();

    /**
     * Setter for the structure preview stroke in edit mode.
     */
    public UiDataGrid setEditStructurePreviewStroke(String editStructurePreviewStroke1) {
        if (jsBase == null) {
            this.editStructurePreviewStroke = null;
            this.editStructurePreviewStroke1 = null;
            
            this.editStructurePreviewStroke1 = editStructurePreviewStroke1;
        } else {
            this.editStructurePreviewStroke1 = editStructurePreviewStroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".editStructurePreviewStroke(%s)", wrapQuotes(editStructurePreviewStroke1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".editStructurePreviewStroke(%s)", wrapQuotes(editStructurePreviewStroke1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEditStructurePreviewStroke1() {
        if (!setEditStructurePreviewStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEditStructurePreviewStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean editing;
    private List<StandalonesDataGrid> setEditing = new ArrayList<>();

    /**
     * Enables or disables live edit mode.
     */
    public StandalonesDataGrid editing(Boolean editing) {
        if (jsBase == null) {
            this.editing = editing;
        } else {
            this.editing = editing;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".editing(%b)", editing));
                js.setLength(0);
            }
        }
        StandalonesDataGrid item = new StandalonesDataGrid("setEditing" + variableIndex);
        setEditing.add(item);
        return item;
    }
    private String generateJSsetEditing() {
        if (!setEditing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesDataGrid item : setEditing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double endIndex;
    private List<UiDataGrid> setEndIndex = new ArrayList<>();

    /**
     * Setter for the end index.
     */
    public UiDataGrid setEndIndex(Double endIndex) {
        if (jsBase == null) {
            this.endIndex = endIndex;
        } else {
            this.endIndex = endIndex;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".endIndex(%f)", endIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endIndex(%f)", endIndex));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEndIndex() {
        if (!setEndIndex.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setEndIndex) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double horizontalOffset;
    private List<UiDataGrid> setHorizontalOffset = new ArrayList<>();

    /**
     * Setter for the horizontal offset.
     */
    public UiDataGrid setHorizontalOffset(Double horizontalOffset) {
        if (jsBase == null) {
            this.horizontalOffset = horizontalOffset;
        } else {
            this.horizontalOffset = horizontalOffset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".horizontalOffset(%f)", horizontalOffset));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".horizontalOffset(%f)", horizontalOffset));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHorizontalOffset() {
        if (!setHorizontalOffset.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setHorizontalOffset) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScrollBar getHorizontalScrollBar;

    /**
     * Getter for the horizontal scroll bar.
     */
    public ScrollBar getHorizontalScrollBar() {
        if (getHorizontalScrollBar == null)
            getHorizontalScrollBar = new ScrollBar(jsBase + ".horizontalScrollBar()");

        return getHorizontalScrollBar;
    }

    private String horizontalScrollBar;
    private List<UiDataGrid> setHorizontalScrollBar = new ArrayList<>();

    /**
     * Setter for the horizontal scroll bar.
     */
    public UiDataGrid setHorizontalScrollBar(String horizontalScrollBar) {
        if (jsBase == null) {
            this.horizontalScrollBar = horizontalScrollBar;
        } else {
            this.horizontalScrollBar = horizontalScrollBar;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".horizontalScrollBar(%s)", wrapQuotes(horizontalScrollBar)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".horizontalScrollBar(%s)", wrapQuotes(horizontalScrollBar)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHorizontalScrollBar() {
        if (!setHorizontalScrollBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setHorizontalScrollBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill rowEvenFill;
    private List<UiDataGrid> setRowEvenFill = new ArrayList<>();

    /**
     * Setter for fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid setRowEvenFill(Fill rowEvenFill) {
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
    private String generateJSsetRowEvenFill() {
        if (!setRowEvenFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowEvenFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color2;
    private Double opacity6;
    private List<UiDataGrid> setRowEvenFill1 = new ArrayList<>();

    /**
     * Fill color with opacity.
     */
    public UiDataGrid rowEvenFill(String color2, Double opacity6) {
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
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %f)", wrapQuotes(color2), opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %f)", wrapQuotes(color2), opacity6));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowEvenFill1() {
        if (!setRowEvenFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowEvenFill1) {
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
    private List<UiDataGrid> setRowEvenFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowEvenFill(GradientKey[] keys8, Boolean mode8, Double angle2, Double opacity7) {
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
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %b, %f, %f)", arrayToString(keys8), mode8, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %b, %f, %f)", arrayToString(keys8), mode8, angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowEvenFill2() {
        if (!setRowEvenFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowEvenFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowEvenFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowEvenFill(GradientKey[] keys8, VectorRect mode9, Double angle2, Double opacity7) {
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
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToString(keys8), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToString(keys8), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowEvenFill3() {
        if (!setRowEvenFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowEvenFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowEvenFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowEvenFill(GradientKey[] keys8, String mode10, Double angle2, Double opacity7) {
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
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToString(keys8), wrapQuotes(mode10), angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToString(keys8), wrapQuotes(mode10), angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowEvenFill4() {
        if (!setRowEvenFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowEvenFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowEvenFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowEvenFill(String[] keys9, Boolean mode8, Double angle2, Double opacity7) {
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
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys9), mode8, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys9), mode8, angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowEvenFill5() {
        if (!setRowEvenFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowEvenFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowEvenFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowEvenFill(String[] keys9, VectorRect mode9, Double angle2, Double opacity7) {
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
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), ((mode9 != null) ? mode9.generateJs() : "null"), angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowEvenFill6() {
        if (!setRowEvenFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowEvenFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowEvenFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowEvenFill(String[] keys9, String mode10, Double angle2, Double opacity7) {
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
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), wrapQuotes(mode10), angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys9), wrapQuotes(mode10), angle2, opacity7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowEvenFill7() {
        if (!setRowEvenFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowEvenFill7) {
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
    private List<UiDataGrid> setRowEvenFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowEvenFill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
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
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys10), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowEvenFill8() {
        if (!setRowEvenFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowEvenFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowEvenFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowEvenFill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
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
            js.append(String.format(Locale.US, ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys11), cx2, cy2, ((mode11 != null) ? mode11.generateJs() : "null"), opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowEvenFill9() {
        if (!setRowEvenFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowEvenFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings2;
    private Fill rowFill;
    private List<UiDataGrid> setRowFill = new ArrayList<>();

    /**
     * Setter for fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid setRowFill(Fill rowFill) {
        if (jsBase == null) {
            this.rowFill = rowFill;
        } else {
            this.rowFill = rowFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s)", ((rowFill != null) ? rowFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s)", ((rowFill != null) ? rowFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowFill() {
        if (!setRowFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color3;
    private Double opacity9;
    private List<UiDataGrid> setRowFill1 = new ArrayList<>();

    /**
     * Fill color with opacity.
     */
    public UiDataGrid rowFill(String color3, Double opacity9) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            
            this.opacity9 = opacity9;
        } else {
            this.color3 = color3;
            this.opacity9 = opacity9;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %f)", wrapQuotes(color3), opacity9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %f)", wrapQuotes(color3), opacity9));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowFill1() {
        if (!setRowFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys12;
    private String[] keys13;
    private Double angle3;
    private Boolean mode12;
    private VectorRect mode13;
    private String mode14;
    private Double opacity10;
    private List<UiDataGrid> setRowFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowFill(GradientKey[] keys12, Boolean mode12, Double angle3, Double opacity10) {
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
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode12 = mode12;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys12 = keys12;
            this.mode12 = mode12;
            this.angle3 = angle3;
            this.opacity10 = opacity10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %b, %f, %f)", arrayToString(keys12), mode12, angle3, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %b, %f, %f)", arrayToString(keys12), mode12, angle3, opacity10));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowFill2() {
        if (!setRowFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowFill(GradientKey[] keys12, VectorRect mode13, Double angle3, Double opacity10) {
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
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode13 = mode13;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys12 = keys12;
            this.mode13 = mode13;
            this.angle3 = angle3;
            this.opacity10 = opacity10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToString(keys12), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToString(keys12), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity10));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowFill3() {
        if (!setRowFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowFill(GradientKey[] keys12, String mode14, Double angle3, Double opacity10) {
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
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode14 = mode14;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys12 = keys12;
            this.mode14 = mode14;
            this.angle3 = angle3;
            this.opacity10 = opacity10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToString(keys12), wrapQuotes(mode14), angle3, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToString(keys12), wrapQuotes(mode14), angle3, opacity10));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowFill4() {
        if (!setRowFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowFill(String[] keys13, Boolean mode12, Double angle3, Double opacity10) {
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
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode12 = mode12;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys13 = keys13;
            this.mode12 = mode12;
            this.angle3 = angle3;
            this.opacity10 = opacity10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys13), mode12, angle3, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys13), mode12, angle3, opacity10));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowFill5() {
        if (!setRowFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowFill(String[] keys13, VectorRect mode13, Double angle3, Double opacity10) {
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
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode13 = mode13;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys13 = keys13;
            this.mode13 = mode13;
            this.angle3 = angle3;
            this.opacity10 = opacity10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), ((mode13 != null) ? mode13.generateJs() : "null"), angle3, opacity10));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowFill6() {
        if (!setRowFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowFill(String[] keys13, String mode14, Double angle3, Double opacity10) {
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
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode14 = mode14;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys13 = keys13;
            this.mode14 = mode14;
            this.angle3 = angle3;
            this.opacity10 = opacity10;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), wrapQuotes(mode14), angle3, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys13), wrapQuotes(mode14), angle3, opacity10));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowFill7() {
        if (!setRowFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys14;
    private String[] keys15;
    private Double cx3;
    private Double cy3;
    private GraphicsMathRect mode15;
    private Double opacity11;
    private Double fx3;
    private Double fy3;
    private List<UiDataGrid> setRowFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowFill(GradientKey[] keys14, Double cx3, Double cy3, GraphicsMathRect mode15, Double opacity11, Double fx3, Double fy3) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            
            this.keys14 = keys14;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            
            this.mode15 = mode15;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.keys14 = keys14;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.mode15 = mode15;
            this.opacity11 = opacity11;
            this.fx3 = fx3;
            this.fy3 = fy3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys14), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity11, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys14), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity11, fx3, fy3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowFill8() {
        if (!setRowFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowFill(String[] keys15, Double cx3, Double cy3, GraphicsMathRect mode15, Double opacity11, Double fx3, Double fy3) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            
            this.keys15 = keys15;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            
            this.mode15 = mode15;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.keys15 = keys15;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.mode15 = mode15;
            this.opacity11 = opacity11;
            this.fx3 = fx3;
            this.fy3 = fy3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys15), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity11, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys15), cx3, cy3, ((mode15 != null) ? mode15.generateJs() : "null"), opacity11, fx3, fy3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowFill9() {
        if (!setRowFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings3;
    private Fill rowHoverFill;
    private List<UiDataGrid> setRowHoverFill = new ArrayList<>();

    /**
     * Setter for fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid setRowHoverFill(Fill rowHoverFill) {
        if (jsBase == null) {
            this.rowHoverFill = rowHoverFill;
        } else {
            this.rowHoverFill = rowHoverFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s)", ((rowHoverFill != null) ? rowHoverFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s)", ((rowHoverFill != null) ? rowHoverFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowHoverFill() {
        if (!setRowHoverFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowHoverFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color4;
    private Double opacity12;
    private List<UiDataGrid> setRowHoverFill1 = new ArrayList<>();

    /**
     * Fill color with opacity.
     */
    public UiDataGrid rowHoverFill(String color4, Double opacity12) {
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
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            
            this.opacity12 = opacity12;
        } else {
            this.color4 = color4;
            this.opacity12 = opacity12;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %f)", wrapQuotes(color4), opacity12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %f)", wrapQuotes(color4), opacity12));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowHoverFill1() {
        if (!setRowHoverFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowHoverFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys16;
    private String[] keys17;
    private Double angle4;
    private Boolean mode16;
    private VectorRect mode17;
    private String mode18;
    private Double opacity13;
    private List<UiDataGrid> setRowHoverFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowHoverFill(GradientKey[] keys16, Boolean mode16, Double angle4, Double opacity13) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode16 = mode16;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.keys16 = keys16;
            this.mode16 = mode16;
            this.angle4 = angle4;
            this.opacity13 = opacity13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToString(keys16), mode16, angle4, opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToString(keys16), mode16, angle4, opacity13));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowHoverFill2() {
        if (!setRowHoverFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowHoverFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowHoverFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowHoverFill(GradientKey[] keys16, VectorRect mode17, Double angle4, Double opacity13) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode17 = mode17;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.keys16 = keys16;
            this.mode17 = mode17;
            this.angle4 = angle4;
            this.opacity13 = opacity13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys16), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys16), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity13));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowHoverFill3() {
        if (!setRowHoverFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowHoverFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowHoverFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowHoverFill(GradientKey[] keys16, String mode18, Double angle4, Double opacity13) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode18 = mode18;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.keys16 = keys16;
            this.mode18 = mode18;
            this.angle4 = angle4;
            this.opacity13 = opacity13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys16), wrapQuotes(mode18), angle4, opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys16), wrapQuotes(mode18), angle4, opacity13));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowHoverFill4() {
        if (!setRowHoverFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowHoverFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowHoverFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowHoverFill(String[] keys17, Boolean mode16, Double angle4, Double opacity13) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode16 = mode16;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.keys17 = keys17;
            this.mode16 = mode16;
            this.angle4 = angle4;
            this.opacity13 = opacity13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys17), mode16, angle4, opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys17), mode16, angle4, opacity13));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowHoverFill5() {
        if (!setRowHoverFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowHoverFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowHoverFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowHoverFill(String[] keys17, VectorRect mode17, Double angle4, Double opacity13) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode17 = mode17;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.keys17 = keys17;
            this.mode17 = mode17;
            this.angle4 = angle4;
            this.opacity13 = opacity13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), ((mode17 != null) ? mode17.generateJs() : "null"), angle4, opacity13));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowHoverFill6() {
        if (!setRowHoverFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowHoverFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowHoverFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowHoverFill(String[] keys17, String mode18, Double angle4, Double opacity13) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode18 = mode18;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.keys17 = keys17;
            this.mode18 = mode18;
            this.angle4 = angle4;
            this.opacity13 = opacity13;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), wrapQuotes(mode18), angle4, opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys17), wrapQuotes(mode18), angle4, opacity13));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowHoverFill7() {
        if (!setRowHoverFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowHoverFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys18;
    private String[] keys19;
    private Double cx4;
    private Double cy4;
    private GraphicsMathRect mode19;
    private Double opacity14;
    private Double fx4;
    private Double fy4;
    private List<UiDataGrid> setRowHoverFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowHoverFill(GradientKey[] keys18, Double cx4, Double cy4, GraphicsMathRect mode19, Double opacity14, Double fx4, Double fy4) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            
            this.keys18 = keys18;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            
            this.cx4 = cx4;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            
            this.cy4 = cy4;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            
            this.mode19 = mode19;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            
            this.fx4 = fx4;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            
            this.fy4 = fy4;
        } else {
            this.keys18 = keys18;
            this.cx4 = cx4;
            this.cy4 = cy4;
            this.mode19 = mode19;
            this.opacity14 = opacity14;
            this.fx4 = fx4;
            this.fy4 = fy4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys18), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity14, fx4, fy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys18), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity14, fx4, fy4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowHoverFill8() {
        if (!setRowHoverFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowHoverFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowHoverFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowHoverFill(String[] keys19, Double cx4, Double cy4, GraphicsMathRect mode19, Double opacity14, Double fx4, Double fy4) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            
            this.keys19 = keys19;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            
            this.cx4 = cx4;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            
            this.cy4 = cy4;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            
            this.mode19 = mode19;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            
            this.fx4 = fx4;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            
            this.fy4 = fy4;
        } else {
            this.keys19 = keys19;
            this.cx4 = cx4;
            this.cy4 = cy4;
            this.mode19 = mode19;
            this.opacity14 = opacity14;
            this.fx4 = fx4;
            this.fy4 = fy4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys19), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity14, fx4, fy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys19), cx4, cy4, ((mode19 != null) ? mode19.generateJs() : "null"), opacity14, fx4, fy4));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowHoverFill9() {
        if (!setRowHoverFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowHoverFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings4;
    private Fill rowOddFill;
    private List<UiDataGrid> setRowOddFill = new ArrayList<>();

    /**
     * Setter for fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid setRowOddFill(Fill rowOddFill) {
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
    private String generateJSsetRowOddFill() {
        if (!setRowOddFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowOddFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color5;
    private Double opacity15;
    private List<UiDataGrid> setRowOddFill1 = new ArrayList<>();

    /**
     * Fill color with opacity.
     */
    public UiDataGrid rowOddFill(String color5, Double opacity15) {
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
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            
            this.opacity15 = opacity15;
        } else {
            this.color5 = color5;
            this.opacity15 = opacity15;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %f)", wrapQuotes(color5), opacity15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %f)", wrapQuotes(color5), opacity15));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowOddFill1() {
        if (!setRowOddFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowOddFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys20;
    private String[] keys21;
    private Double angle5;
    private Boolean mode20;
    private VectorRect mode21;
    private String mode22;
    private Double opacity16;
    private List<UiDataGrid> setRowOddFill2 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowOddFill(GradientKey[] keys20, Boolean mode20, Double angle5, Double opacity16) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys20 = keys20;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode20 = mode20;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.keys20 = keys20;
            this.mode20 = mode20;
            this.angle5 = angle5;
            this.opacity16 = opacity16;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %b, %f, %f)", arrayToString(keys20), mode20, angle5, opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %b, %f, %f)", arrayToString(keys20), mode20, angle5, opacity16));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowOddFill2() {
        if (!setRowOddFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowOddFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowOddFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowOddFill(GradientKey[] keys20, VectorRect mode21, Double angle5, Double opacity16) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys20 = keys20;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode21 = mode21;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.keys20 = keys20;
            this.mode21 = mode21;
            this.angle5 = angle5;
            this.opacity16 = opacity16;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToString(keys20), ((mode21 != null) ? mode21.generateJs() : "null"), angle5, opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToString(keys20), ((mode21 != null) ? mode21.generateJs() : "null"), angle5, opacity16));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowOddFill3() {
        if (!setRowOddFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowOddFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowOddFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowOddFill(GradientKey[] keys20, String mode22, Double angle5, Double opacity16) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys20 = keys20;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode22 = mode22;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.keys20 = keys20;
            this.mode22 = mode22;
            this.angle5 = angle5;
            this.opacity16 = opacity16;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToString(keys20), wrapQuotes(mode22), angle5, opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToString(keys20), wrapQuotes(mode22), angle5, opacity16));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowOddFill4() {
        if (!setRowOddFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowOddFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowOddFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowOddFill(String[] keys21, Boolean mode20, Double angle5, Double opacity16) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys21 = keys21;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode20 = mode20;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.keys21 = keys21;
            this.mode20 = mode20;
            this.angle5 = angle5;
            this.opacity16 = opacity16;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys21), mode20, angle5, opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys21), mode20, angle5, opacity16));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowOddFill5() {
        if (!setRowOddFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowOddFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowOddFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowOddFill(String[] keys21, VectorRect mode21, Double angle5, Double opacity16) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys21 = keys21;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode21 = mode21;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.keys21 = keys21;
            this.mode21 = mode21;
            this.angle5 = angle5;
            this.opacity16 = opacity16;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys21), ((mode21 != null) ? mode21.generateJs() : "null"), angle5, opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys21), ((mode21 != null) ? mode21.generateJs() : "null"), angle5, opacity16));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowOddFill6() {
        if (!setRowOddFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowOddFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowOddFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowOddFill(String[] keys21, String mode22, Double angle5, Double opacity16) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys21 = keys21;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode22 = mode22;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.keys21 = keys21;
            this.mode22 = mode22;
            this.angle5 = angle5;
            this.opacity16 = opacity16;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys21), wrapQuotes(mode22), angle5, opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys21), wrapQuotes(mode22), angle5, opacity16));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowOddFill7() {
        if (!setRowOddFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowOddFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys22;
    private String[] keys23;
    private Double cx5;
    private Double cy5;
    private GraphicsMathRect mode23;
    private Double opacity17;
    private Double fx5;
    private Double fy5;
    private List<UiDataGrid> setRowOddFill8 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowOddFill(GradientKey[] keys22, Double cx5, Double cy5, GraphicsMathRect mode23, Double opacity17, Double fx5, Double fy5) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            
            this.keys22 = keys22;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            
            this.cx5 = cx5;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            
            this.cy5 = cy5;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            
            this.mode23 = mode23;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            
            this.opacity17 = opacity17;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            
            this.fx5 = fx5;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            
            this.fy5 = fy5;
        } else {
            this.keys22 = keys22;
            this.cx5 = cx5;
            this.cy5 = cy5;
            this.mode23 = mode23;
            this.opacity17 = opacity17;
            this.fx5 = fx5;
            this.fy5 = fy5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys22), cx5, cy5, ((mode23 != null) ? mode23.generateJs() : "null"), opacity17, fx5, fy5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys22), cx5, cy5, ((mode23 != null) ? mode23.generateJs() : "null"), opacity17, fx5, fy5));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowOddFill8() {
        if (!setRowOddFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowOddFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowOddFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowOddFill(String[] keys23, Double cx5, Double cy5, GraphicsMathRect mode23, Double opacity17, Double fx5, Double fy5) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            
            this.keys23 = keys23;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            
            this.cx5 = cx5;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            
            this.cy5 = cy5;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            
            this.mode23 = mode23;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            
            this.opacity17 = opacity17;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            
            this.fx5 = fx5;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            
            this.fy5 = fy5;
        } else {
            this.keys23 = keys23;
            this.cx5 = cx5;
            this.cy5 = cy5;
            this.mode23 = mode23;
            this.opacity17 = opacity17;
            this.fx5 = fx5;
            this.fy5 = fy5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowOddFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys23), cx5, cy5, ((mode23 != null) ? mode23.generateJs() : "null"), opacity17, fx5, fy5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowOddFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys23), cx5, cy5, ((mode23 != null) ? mode23.generateJs() : "null"), opacity17, fx5, fy5));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowOddFill9() {
        if (!setRowOddFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowOddFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings5;
    private Fill rowSelectedFill;
    private List<UiDataGrid> setRowSelectedFill = new ArrayList<>();

    /**
     * Setter for row fill settings in selected mode using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid setRowSelectedFill(Fill rowSelectedFill) {
        if (jsBase == null) {
            this.rowSelectedFill = rowSelectedFill;
        } else {
            this.rowSelectedFill = rowSelectedFill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s)", ((rowSelectedFill != null) ? rowSelectedFill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s)", ((rowSelectedFill != null) ? rowSelectedFill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowSelectedFill() {
        if (!setRowSelectedFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowSelectedFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color6;
    private Double opacity18;
    private List<UiDataGrid> setRowSelectedFill1 = new ArrayList<>();

    /**
     * Fill color in selected mode with opacity. Fill as a string or an object.
     */
    public UiDataGrid rowSelectedFill(String color6, Double opacity18) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            
            this.opacity18 = opacity18;
        } else {
            this.color6 = color6;
            this.opacity18 = opacity18;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f)", wrapQuotes(color6), opacity18));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %f)", wrapQuotes(color6), opacity18));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowSelectedFill1() {
        if (!setRowSelectedFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowSelectedFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys24;
    private String[] keys25;
    private Double angle6;
    private Boolean mode24;
    private VectorRect mode25;
    private String mode26;
    private List<UiDataGrid> setRowSelectedFill2 = new ArrayList<>();

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowSelectedFill(GradientKey[] keys24, Boolean mode24, Double angle6) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            
            this.keys24 = keys24;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            
            this.mode24 = mode24;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            
            this.angle6 = angle6;
        } else {
            this.keys24 = keys24;
            this.mode24 = mode24;
            this.angle6 = angle6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f)", arrayToString(keys24), mode24, angle6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f)", arrayToString(keys24), mode24, angle6));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowSelectedFill2() {
        if (!setRowSelectedFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowSelectedFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowSelectedFill3 = new ArrayList<>();

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowSelectedFill(GradientKey[] keys24, VectorRect mode25, Double angle6) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            
            this.keys24 = keys24;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            
            this.mode25 = mode25;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            
            this.angle6 = angle6;
        } else {
            this.keys24 = keys24;
            this.mode25 = mode25;
            this.angle6 = angle6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToString(keys24), ((mode25 != null) ? mode25.generateJs() : "null"), angle6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToString(keys24), ((mode25 != null) ? mode25.generateJs() : "null"), angle6));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowSelectedFill3() {
        if (!setRowSelectedFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowSelectedFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowSelectedFill4 = new ArrayList<>();

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowSelectedFill(GradientKey[] keys24, String mode26, Double angle6) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            
            this.keys24 = keys24;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            
            this.mode26 = mode26;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            
            this.angle6 = angle6;
        } else {
            this.keys24 = keys24;
            this.mode26 = mode26;
            this.angle6 = angle6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToString(keys24), wrapQuotes(mode26), angle6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToString(keys24), wrapQuotes(mode26), angle6));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowSelectedFill4() {
        if (!setRowSelectedFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowSelectedFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowSelectedFill5 = new ArrayList<>();

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowSelectedFill(String[] keys25, Boolean mode24, Double angle6) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            
            this.keys25 = keys25;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            
            this.mode24 = mode24;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            
            this.angle6 = angle6;
        } else {
            this.keys25 = keys25;
            this.mode24 = mode24;
            this.angle6 = angle6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f)", arrayToStringWrapQuotes(keys25), mode24, angle6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f)", arrayToStringWrapQuotes(keys25), mode24, angle6));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowSelectedFill5() {
        if (!setRowSelectedFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowSelectedFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowSelectedFill6 = new ArrayList<>();

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowSelectedFill(String[] keys25, VectorRect mode25, Double angle6) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            
            this.keys25 = keys25;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            
            this.mode25 = mode25;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            
            this.angle6 = angle6;
        } else {
            this.keys25 = keys25;
            this.mode25 = mode25;
            this.angle6 = angle6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToStringWrapQuotes(keys25), ((mode25 != null) ? mode25.generateJs() : "null"), angle6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToStringWrapQuotes(keys25), ((mode25 != null) ? mode25.generateJs() : "null"), angle6));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowSelectedFill6() {
        if (!setRowSelectedFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowSelectedFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowSelectedFill7 = new ArrayList<>();

    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowSelectedFill(String[] keys25, String mode26, Double angle6) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            
            this.keys25 = keys25;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            
            this.mode26 = mode26;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            this.angle6 = null;
            
            this.angle6 = angle6;
        } else {
            this.keys25 = keys25;
            this.mode26 = mode26;
            this.angle6 = angle6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToStringWrapQuotes(keys25), wrapQuotes(mode26), angle6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f)", arrayToStringWrapQuotes(keys25), wrapQuotes(mode26), angle6));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowSelectedFill7() {
        if (!setRowSelectedFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowSelectedFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys26;
    private String[] keys27;
    private Double cx6;
    private Double cy6;
    private GraphicsMathRect mode27;
    private Double opacity19;
    private Double fx6;
    private Double fy6;
    private List<UiDataGrid> setRowSelectedFill8 = new ArrayList<>();

    /**
     * Radial gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowSelectedFill(GradientKey[] keys26, Double cx6, Double cy6, GraphicsMathRect mode27, Double opacity19, Double fx6, Double fy6) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            
            this.keys26 = keys26;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            
            this.cx6 = cx6;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            
            this.cy6 = cy6;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            
            this.mode27 = mode27;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            
            this.opacity19 = opacity19;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            
            this.fx6 = fx6;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            
            this.fy6 = fy6;
        } else {
            this.keys26 = keys26;
            this.cx6 = cx6;
            this.cy6 = cy6;
            this.mode27 = mode27;
            this.opacity19 = opacity19;
            this.fx6 = fx6;
            this.fy6 = fy6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys26), cx6, cy6, ((mode27 != null) ? mode27.generateJs() : "null"), opacity19, fx6, fy6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys26), cx6, cy6, ((mode27 != null) ? mode27.generateJs() : "null"), opacity19, fx6, fy6));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowSelectedFill8() {
        if (!setRowSelectedFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowSelectedFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiDataGrid> setRowSelectedFill9 = new ArrayList<>();

    /**
     * Radial gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiDataGrid rowSelectedFill(String[] keys27, Double cx6, Double cy6, GraphicsMathRect mode27, Double opacity19, Double fx6, Double fy6) {
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
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            this.keys24 = null;
            this.keys25 = null;
            this.keys26 = null;
            this.keys27 = null;
            
            this.keys27 = keys27;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            this.cx6 = null;
            
            this.cx6 = cx6;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            this.cy6 = null;
            
            this.cy6 = cy6;
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
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            this.mode24 = null;
            this.mode25 = null;
            this.mode26 = null;
            this.mode27 = null;
            
            this.mode27 = mode27;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            this.opacity18 = null;
            this.opacity19 = null;
            
            this.opacity19 = opacity19;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            this.fx6 = null;
            
            this.fx6 = fx6;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            this.fy6 = null;
            
            this.fy6 = fy6;
        } else {
            this.keys27 = keys27;
            this.cx6 = cx6;
            this.cy6 = cy6;
            this.mode27 = mode27;
            this.opacity19 = opacity19;
            this.fx6 = fx6;
            this.fy6 = fy6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys27), cx6, cy6, ((mode27 != null) ? mode27.generateJs() : "null"), opacity19, fx6, fy6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys27), cx6, cy6, ((mode27 != null) ? mode27.generateJs() : "null"), opacity19, fx6, fy6));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowSelectedFill9() {
        if (!setRowSelectedFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setRowSelectedFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings6;
    private Double startIndex;
    private List<UiDataGrid> setStartIndex = new ArrayList<>();

    /**
     * Setter for the start index.
     */
    public UiDataGrid setStartIndex(Double startIndex) {
        if (jsBase == null) {
            this.startIndex = startIndex;
        } else {
            this.startIndex = startIndex;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".startIndex(%f)", startIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startIndex(%f)", startIndex));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStartIndex() {
        if (!setStartIndex.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setStartIndex) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Tooltip getTooltip;

    /**
     * Getter for tooltip settings.
     */
    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private List<UiDataGrid> getTooltip1 = new ArrayList<>();

    /**
     * Getter for tooltip settings.
     */
    public UiDataGrid getTooltip(String tooltip) {
        UiDataGrid item = new UiDataGrid(jsBase + ".tooltip(" + wrapQuotes(tooltip) + ")");
        getTooltip1.add(item);
        return item;
    }

    private List<UiDataGrid> getTooltip2 = new ArrayList<>();

    /**
     * Getter for tooltip settings.
     */
    public UiDataGrid getTooltip(Boolean tooltip) {
        UiDataGrid item = new UiDataGrid(jsBase + ".tooltip(" + tooltip + ")");
        getTooltip2.add(item);
        return item;
    }

    private Double verticalOffset;
    private List<UiDataGrid> setVerticalOffset = new ArrayList<>();

    /**
     * Setter for the vertical offset.
     */
    public UiDataGrid setVerticalOffset(Double verticalOffset) {
        if (jsBase == null) {
            this.verticalOffset = verticalOffset;
        } else {
            this.verticalOffset = verticalOffset;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".verticalOffset(%f)", verticalOffset));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".verticalOffset(%f)", verticalOffset));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetVerticalOffset() {
        if (!setVerticalOffset.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : setVerticalOffset) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetColumn() {
        if (!getColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DatagridColumn item : getColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetHorizontalScrollBar() {
        if (getHorizontalScrollBar != null) {
            return getHorizontalScrollBar.generateJs();
        }
        return "";
    }

    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
        }
        return "";
    }

    private String generateJSgetTooltip1() {
        if (!getTooltip1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : getTooltip1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetTooltip2() {
        if (!getTooltip2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiDataGrid item : getTooltip2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetColumn());
        jsGetters.append(generateJSgetData());
        jsGetters.append(generateJSgetHorizontalScrollBar());
        jsGetters.append(generateJSgetTooltip());
        jsGetters.append(generateJSgetTooltip1());
        jsGetters.append(generateJSgetTooltip2());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetBackgroundFill());
        js.append(generateJSsetBackgroundFill1());
        js.append(generateJSsetBackgroundFill2());
        js.append(generateJSsetBackgroundFill3());
        js.append(generateJSsetBackgroundFill4());
        js.append(generateJSsetBackgroundFill5());
        js.append(generateJSsetBackgroundFill6());
        js.append(generateJSsetBackgroundFill7());
        js.append(generateJSsetBackgroundFill8());
        js.append(generateJSsetBackgroundFill9());
        js.append(generateJSsetColumn());
        js.append(generateJSsetColumn1());
        js.append(generateJSsetColumnStroke());
        js.append(generateJSsetColumnStroke1());
        js.append(generateJSsetData());
        js.append(generateJSsetEditStructurePreviewDashStroke());
        js.append(generateJSsetEditStructurePreviewDashStroke1());
        js.append(generateJSsetEditStructurePreviewFill());
        js.append(generateJSsetEditStructurePreviewFill1());
        js.append(generateJSsetEditStructurePreviewFill2());
        js.append(generateJSsetEditStructurePreviewFill3());
        js.append(generateJSsetEditStructurePreviewFill4());
        js.append(generateJSsetEditStructurePreviewFill5());
        js.append(generateJSsetEditStructurePreviewFill6());
        js.append(generateJSsetEditStructurePreviewFill7());
        js.append(generateJSsetEditStructurePreviewFill8());
        js.append(generateJSsetEditStructurePreviewFill9());
        js.append(generateJSsetEditStructurePreviewStroke());
        js.append(generateJSsetEditStructurePreviewStroke1());
        js.append(generateJSsetEditing());
        js.append(generateJSsetEndIndex());
        js.append(generateJSsetHorizontalOffset());
        js.append(generateJSsetHorizontalScrollBar());
        js.append(generateJSsetRowEvenFill());
        js.append(generateJSsetRowEvenFill1());
        js.append(generateJSsetRowEvenFill2());
        js.append(generateJSsetRowEvenFill3());
        js.append(generateJSsetRowEvenFill4());
        js.append(generateJSsetRowEvenFill5());
        js.append(generateJSsetRowEvenFill6());
        js.append(generateJSsetRowEvenFill7());
        js.append(generateJSsetRowEvenFill8());
        js.append(generateJSsetRowEvenFill9());
        js.append(generateJSsetRowFill());
        js.append(generateJSsetRowFill1());
        js.append(generateJSsetRowFill2());
        js.append(generateJSsetRowFill3());
        js.append(generateJSsetRowFill4());
        js.append(generateJSsetRowFill5());
        js.append(generateJSsetRowFill6());
        js.append(generateJSsetRowFill7());
        js.append(generateJSsetRowFill8());
        js.append(generateJSsetRowFill9());
        js.append(generateJSsetRowHoverFill());
        js.append(generateJSsetRowHoverFill1());
        js.append(generateJSsetRowHoverFill2());
        js.append(generateJSsetRowHoverFill3());
        js.append(generateJSsetRowHoverFill4());
        js.append(generateJSsetRowHoverFill5());
        js.append(generateJSsetRowHoverFill6());
        js.append(generateJSsetRowHoverFill7());
        js.append(generateJSsetRowHoverFill8());
        js.append(generateJSsetRowHoverFill9());
        js.append(generateJSsetRowOddFill());
        js.append(generateJSsetRowOddFill1());
        js.append(generateJSsetRowOddFill2());
        js.append(generateJSsetRowOddFill3());
        js.append(generateJSsetRowOddFill4());
        js.append(generateJSsetRowOddFill5());
        js.append(generateJSsetRowOddFill6());
        js.append(generateJSsetRowOddFill7());
        js.append(generateJSsetRowOddFill8());
        js.append(generateJSsetRowOddFill9());
        js.append(generateJSsetRowSelectedFill());
        js.append(generateJSsetRowSelectedFill1());
        js.append(generateJSsetRowSelectedFill2());
        js.append(generateJSsetRowSelectedFill3());
        js.append(generateJSsetRowSelectedFill4());
        js.append(generateJSsetRowSelectedFill5());
        js.append(generateJSsetRowSelectedFill6());
        js.append(generateJSsetRowSelectedFill7());
        js.append(generateJSsetRowSelectedFill8());
        js.append(generateJSsetRowSelectedFill9());
        js.append(generateJSsetStartIndex());
        js.append(generateJSsetVerticalOffset());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}