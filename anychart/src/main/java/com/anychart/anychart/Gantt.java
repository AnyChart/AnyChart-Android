package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class Gantt extends SeparateChart {

    protected Gantt(String name) {
        super(name);

        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    
    private String taskId;
    private List<Gantt> setCollapseTask = new ArrayList<>();

    public Gantt collapseTask(String taskId) {
        this.taskId = taskId;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".collapseTask(%s)", taskId));

//        js.append(String.format(Locale.US, ".collapseTask(%s)", taskId));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".collapseTask(%s)", taskId));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCollapseTask() {
        if (!setCollapseTask.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setCollapseTask) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke columnStroke;
    private String columnStroke1;
    private List<Gantt> setColumnStroke = new ArrayList<>();

    public Gantt setColumnStroke(Stroke columnStroke) {
        this.columnStroke = columnStroke;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".columnStroke(%s)", (columnStroke != null) ? columnStroke.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".columnStroke(%s)", (columnStroke != null) ? columnStroke.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".columnStroke(%s)", (columnStroke != null) ? columnStroke.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetColumnStroke() {
        if (!setColumnStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setColumnStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setColumnStroke1 = new ArrayList<>();

    public Gantt setColumnStroke(String columnStroke1) {
        this.columnStroke1 = columnStroke1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".columnStroke(%s)", columnStroke1));

//        js.append(String.format(Locale.US, ".columnStroke(%s)", columnStroke1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".columnStroke(%s)", columnStroke1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetColumnStroke1() {
        if (!setColumnStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setColumnStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Tree getData;

    public Tree getData() {
        if (getData == null)
            getData = new Tree(jsBase + ".data()");

        return getData;
    }
    private Tree data;
    private TreeView data1;
    private String data2;
    private TreeFillingMethod fillMethod;
    private String fillMethod1;
    private List<Gantt> setData = new ArrayList<>();

    public Gantt setData(Tree data, TreeFillingMethod fillMethod) {
        this.data = data;
        this.fillMethod = fillMethod;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (fillMethod != null) ? fillMethod.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (fillMethod != null) ? fillMethod.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (fillMethod != null) ? fillMethod.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setData1 = new ArrayList<>();

    public Gantt setData(Tree data, String fillMethod1) {
        this.data = data;
        this.fillMethod1 = fillMethod1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", fillMethod1));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", fillMethod1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", fillMethod1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setData2 = new ArrayList<>();

    public Gantt setData(TreeView data1, TreeFillingMethod fillMethod) {
        this.data1 = data1;
        this.fillMethod = fillMethod;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (fillMethod != null) ? fillMethod.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (fillMethod != null) ? fillMethod.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (fillMethod != null) ? fillMethod.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setData3 = new ArrayList<>();

    public Gantt setData(TreeView data1, String fillMethod1) {
        this.data1 = data1;
        this.fillMethod1 = fillMethod1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", fillMethod1));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", fillMethod1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", fillMethod1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData3() {
        if (!setData3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setData4 = new ArrayList<>();

    public Gantt setData(String data2, TreeFillingMethod fillMethod) {
        this.data2 = data2;
        this.fillMethod = fillMethod;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data2, (fillMethod != null) ? fillMethod.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", data2, (fillMethod != null) ? fillMethod.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data2, (fillMethod != null) ? fillMethod.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData4() {
        if (!setData4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setData4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setData5 = new ArrayList<>();

    public Gantt setData(String data2, String fillMethod1) {
        this.data2 = data2;
        this.fillMethod1 = fillMethod1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data2, fillMethod1));

//        js.append(String.format(Locale.US, ".data(%s, %s)", data2, fillMethod1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data2, fillMethod1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData5() {
        if (!setData5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setData5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private UiDataGrid getDataGrid;

    public UiDataGrid getDataGrid() {
        if (getDataGrid == null)
            getDataGrid = new UiDataGrid(jsBase + ".dataGrid()");

        return getDataGrid;
    }
    private Boolean enabled;
    private List<Gantt> setDataGrid = new ArrayList<>();

    public Gantt setDataGrid(Boolean enabled) {
        this.enabled = enabled;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".dataGrid(%b)", enabled));

//        js.append(String.format(Locale.US, ".dataGrid(%b)", enabled));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".dataGrid(%b)", enabled));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetDataGrid() {
        if (!setDataGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setDataGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double defaultRowHeight;
    private List<Gantt> setDefaultRowHeight = new ArrayList<>();

    public Gantt setDefaultRowHeight(Double defaultRowHeight) {
        this.defaultRowHeight = defaultRowHeight;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultRowHeight(%f)", defaultRowHeight));

//        js.append(String.format(Locale.US, ".defaultRowHeight(%f)", defaultRowHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultRowHeight(%f)", defaultRowHeight));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetDefaultRowHeight() {
        if (!setDefaultRowHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setDefaultRowHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean editing;
    private List<Gantt> setEditing = new ArrayList<>();

    public Gantt editing(Boolean editing) {
        this.editing = editing;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".editing(%b)", editing));

//        js.append(String.format(Locale.US, ".editing(%b)", editing));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".editing(%b)", editing));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetEditing() {
        if (!setEditing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setEditing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String taskId1;
    private List<Gantt> setExpandTask = new ArrayList<>();

    public Gantt expandTask(String taskId1) {
        this.taskId1 = taskId1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".expandTask(%s)", taskId1));

//        js.append(String.format(Locale.US, ".expandTask(%s)", taskId1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".expandTask(%s)", taskId1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetExpandTask() {
        if (!setExpandTask.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setExpandTask) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String taskId2;
    private List<Gantt> setFitToTask = new ArrayList<>();

    public Gantt fitToTask(String taskId2) {
        this.taskId2 = taskId2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fitToTask(%s)", taskId2));

//        js.append(String.format(Locale.US, ".fitToTask(%s)", taskId2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fitToTask(%s)", taskId2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFitToTask() {
        if (!setFitToTask.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setFitToTask) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Timeline getGetTimeline;

    public Timeline getGetTimeline() {
        if (getGetTimeline == null)
            getGetTimeline = new Timeline(jsBase + ".getTimeline()");

        return getGetTimeline;
    }
    private Double headerHeight;
    private String headerHeight1;
    private List<Gantt> setHeaderHeight = new ArrayList<>();

    public Gantt setHeaderHeight(Double headerHeight) {
        this.headerHeight = headerHeight;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".headerHeight(%f)", headerHeight));

//        js.append(String.format(Locale.US, ".headerHeight(%f)", headerHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".headerHeight(%f)", headerHeight));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHeaderHeight() {
        if (!setHeaderHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setHeaderHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setHeaderHeight1 = new ArrayList<>();

    public Gantt setHeaderHeight(String headerHeight1) {
        this.headerHeight1 = headerHeight1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".headerHeight(%s)", headerHeight1));

//        js.append(String.format(Locale.US, ".headerHeight(%s)", headerHeight1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".headerHeight(%s)", headerHeight1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHeaderHeight1() {
        if (!setHeaderHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setHeaderHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill rowHoverFill;
    private List<Gantt> setRowHoverFill = new ArrayList<>();

    public Gantt setRowHoverFill(Fill rowHoverFill) {
        this.rowHoverFill = rowHoverFill;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s)", (rowHoverFill != null) ? rowHoverFill.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".rowHoverFill(%s)", (rowHoverFill != null) ? rowHoverFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s)", (rowHoverFill != null) ? rowHoverFill.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowHoverFill() {
        if (!setRowHoverFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowHoverFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<Gantt> setRowHoverFill1 = new ArrayList<>();

    public Gantt rowHoverFill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %f)", color, opacity));

//        js.append(String.format(Locale.US, ".rowHoverFill(%s, %f)", color, opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %f)", color, opacity));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowHoverFill1() {
        if (!setRowHoverFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowHoverFill1) {
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
    private List<Gantt> setRowHoverFill2 = new ArrayList<>();

    public Gantt rowHoverFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

//        js.append(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowHoverFill2() {
        if (!setRowHoverFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowHoverFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowHoverFill3 = new ArrayList<>();

    public Gantt rowHoverFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

//        js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowHoverFill3() {
        if (!setRowHoverFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowHoverFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowHoverFill4 = new ArrayList<>();

    public Gantt rowHoverFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));

//        js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowHoverFill4() {
        if (!setRowHoverFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowHoverFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowHoverFill5 = new ArrayList<>();

    public Gantt rowHoverFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));

//        js.append(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowHoverFill5() {
        if (!setRowHoverFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowHoverFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowHoverFill6 = new ArrayList<>();

    public Gantt rowHoverFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

//        js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowHoverFill6() {
        if (!setRowHoverFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowHoverFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowHoverFill7 = new ArrayList<>();

    public Gantt rowHoverFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));

//        js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowHoverFill7() {
        if (!setRowHoverFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowHoverFill7) {
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
    private List<Gantt> setRowHoverFill8 = new ArrayList<>();

    public Gantt rowHoverFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

//        js.append(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowHoverFill8() {
        if (!setRowHoverFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowHoverFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowHoverFill9 = new ArrayList<>();

    public Gantt rowHoverFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

//        js.append(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowHoverFill9() {
        if (!setRowHoverFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowHoverFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill rowSelectedFill;
    private List<Gantt> setRowSelectedFill = new ArrayList<>();

    public Gantt setRowSelectedFill(Fill rowSelectedFill) {
        this.rowSelectedFill = rowSelectedFill;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s)", (rowSelectedFill != null) ? rowSelectedFill.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".rowSelectedFill(%s)", (rowSelectedFill != null) ? rowSelectedFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s)", (rowSelectedFill != null) ? rowSelectedFill.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowSelectedFill() {
        if (!setRowSelectedFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowSelectedFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color1;
    private Double opacity3;
    private List<Gantt> setRowSelectedFill1 = new ArrayList<>();

    public Gantt rowSelectedFill(String color1, Double opacity3) {
        this.color1 = color1;
        this.opacity3 = opacity3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f)", color1, opacity3));

//        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f)", color1, opacity3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %f)", color1, opacity3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowSelectedFill1() {
        if (!setRowSelectedFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowSelectedFill1) {
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
    private List<Gantt> setRowSelectedFill2 = new ArrayList<>();

    public Gantt rowSelectedFill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode4 = mode4;
        this.angle1 = angle1;
        this.opacity4 = opacity4;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));

//        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowSelectedFill2() {
        if (!setRowSelectedFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowSelectedFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowSelectedFill3 = new ArrayList<>();

    public Gantt rowSelectedFill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode5 = mode5;
        this.angle1 = angle1;
        this.opacity4 = opacity4;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

//        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowSelectedFill3() {
        if (!setRowSelectedFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowSelectedFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowSelectedFill4 = new ArrayList<>();

    public Gantt rowSelectedFill(GradientKey[] keys4, String mode6, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode6 = mode6;
        this.angle1 = angle1;
        this.opacity4 = opacity4;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToString(keys4), mode6, angle1, opacity4));

//        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToString(keys4), mode6, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToString(keys4), mode6, angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowSelectedFill4() {
        if (!setRowSelectedFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowSelectedFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowSelectedFill5 = new ArrayList<>();

    public Gantt rowSelectedFill(String[] keys5, Boolean mode4, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode4 = mode4;
        this.angle1 = angle1;
        this.opacity4 = opacity4;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f, %f)", Arrays.toString(keys5), mode4, angle1, opacity4));

//        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f, %f)", Arrays.toString(keys5), mode4, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f, %f)", Arrays.toString(keys5), mode4, angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowSelectedFill5() {
        if (!setRowSelectedFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowSelectedFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowSelectedFill6 = new ArrayList<>();

    public Gantt rowSelectedFill(String[] keys5, VectorRect mode5, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode5 = mode5;
        this.angle1 = angle1;
        this.opacity4 = opacity4;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

//        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowSelectedFill6() {
        if (!setRowSelectedFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowSelectedFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowSelectedFill7 = new ArrayList<>();

    public Gantt rowSelectedFill(String[] keys5, String mode6, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode6 = mode6;
        this.angle1 = angle1;
        this.opacity4 = opacity4;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", Arrays.toString(keys5), mode6, angle1, opacity4));

//        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", Arrays.toString(keys5), mode6, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", Arrays.toString(keys5), mode6, angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowSelectedFill7() {
        if (!setRowSelectedFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowSelectedFill7) {
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
    private List<Gantt> setRowSelectedFill8 = new ArrayList<>();

    public Gantt rowSelectedFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

//        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowSelectedFill8() {
        if (!setRowSelectedFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowSelectedFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowSelectedFill9 = new ArrayList<>();

    public Gantt rowSelectedFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
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
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

//        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowSelectedFill9() {
        if (!setRowSelectedFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowSelectedFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke rowStroke;
    private String rowStroke1;
    private List<Gantt> setRowStroke = new ArrayList<>();

    public Gantt setRowStroke(Stroke rowStroke) {
        this.rowStroke = rowStroke;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowStroke(%s)", (rowStroke != null) ? rowStroke.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".rowStroke(%s)", (rowStroke != null) ? rowStroke.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowStroke(%s)", (rowStroke != null) ? rowStroke.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowStroke() {
        if (!setRowStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setRowStroke1 = new ArrayList<>();

    public Gantt setRowStroke(String rowStroke1) {
        this.rowStroke1 = rowStroke1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowStroke(%s)", rowStroke1));

//        js.append(String.format(Locale.US, ".rowStroke(%s)", rowStroke1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowStroke(%s)", rowStroke1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRowStroke1() {
        if (!setRowStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setRowStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double pxOffset;
    private List<Gantt> setScrollTo = new ArrayList<>();

    public Gantt scrollTo(Double pxOffset) {
        this.pxOffset = pxOffset;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scrollTo(%f)", pxOffset));

//        js.append(String.format(Locale.US, ".scrollTo(%f)", pxOffset));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scrollTo(%f)", pxOffset));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScrollTo() {
        if (!setScrollTo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setScrollTo) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index;
    private List<Gantt> setScrollToEnd = new ArrayList<>();

    public Gantt scrollToEnd(Double index) {
        this.index = index;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scrollToEnd(%f)", index));

//        js.append(String.format(Locale.US, ".scrollToEnd(%f)", index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scrollToEnd(%f)", index));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScrollToEnd() {
        if (!setScrollToEnd.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setScrollToEnd) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double rowIndex;
    private List<Gantt> setScrollToRow = new ArrayList<>();

    public Gantt scrollToRow(Double rowIndex) {
        this.rowIndex = rowIndex;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scrollToRow(%f)", rowIndex));

//        js.append(String.format(Locale.US, ".scrollToRow(%f)", rowIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scrollToRow(%f)", rowIndex));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScrollToRow() {
        if (!setScrollToRow.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setScrollToRow) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String splitterPosition;
    private Double splitterPosition1;
    private List<Gantt> setSplitterPosition = new ArrayList<>();

    public Gantt setSplitterPosition(String splitterPosition) {
        this.splitterPosition = splitterPosition;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterPosition(%s)", splitterPosition));

//        js.append(String.format(Locale.US, ".splitterPosition(%s)", splitterPosition));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterPosition(%s)", splitterPosition));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSplitterPosition() {
        if (!setSplitterPosition.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setSplitterPosition) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setSplitterPosition1 = new ArrayList<>();

    public Gantt setSplitterPosition(Double splitterPosition1) {
        this.splitterPosition1 = splitterPosition1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterPosition(%f)", splitterPosition1));

//        js.append(String.format(Locale.US, ".splitterPosition(%f)", splitterPosition1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterPosition(%f)", splitterPosition1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSplitterPosition1() {
        if (!setSplitterPosition1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setSplitterPosition1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private GanttDateTime getXScale;

    public GanttDateTime getXScale() {
        if (getXScale == null)
            getXScale = new GanttDateTime(jsBase + ".xScale()");

        return getXScale;
    }
    private String xScale;
    private List<Gantt> setXScale = new ArrayList<>();

    public Gantt setXScale(String xScale) {
        this.xScale = xScale;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", xScale));

//        js.append(String.format(Locale.US, ".xScale(%s)", xScale));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", xScale));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale() {
        if (!setXScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double zoomFactor;
    private List<Gantt> setZoomIn = new ArrayList<>();

    public Gantt zoomIn(Double zoomFactor) {
        this.zoomFactor = zoomFactor;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomIn(%f)", zoomFactor));

//        js.append(String.format(Locale.US, ".zoomIn(%f)", zoomFactor));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomIn(%f)", zoomFactor));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomIn() {
        if (!setZoomIn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setZoomIn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double zoomFactor1;
    private List<Gantt> setZoomOut = new ArrayList<>();

    public Gantt zoomOut(Double zoomFactor1) {
        this.zoomFactor1 = zoomFactor1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomOut(%f)", zoomFactor1));

//        js.append(String.format(Locale.US, ".zoomOut(%f)", zoomFactor1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomOut(%f)", zoomFactor1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomOut() {
        if (!setZoomOut.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setZoomOut) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double startDate;
    private Double endDate;
    private List<Gantt> setZoomTo = new ArrayList<>();

    public Gantt setZoomTo(Double startDate, Double endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomTo(%f, %f)", startDate, endDate));

//        js.append(String.format(Locale.US, ".zoomTo(%f, %f)", startDate, endDate));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomTo(%f, %f)", startDate, endDate));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomTo() {
        if (!setZoomTo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setZoomTo) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Interval unit;
    private String unit1;
    private Double count;
    private GanttRangeAnchor anchor;
    private String anchor1;
    private List<Gantt> setZoomTo1 = new ArrayList<>();

    public Gantt setZoomTo(Interval unit, GanttRangeAnchor anchor, Double count) {
        this.unit = unit;
        this.anchor = anchor;
        this.count = count;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %f)", (unit != null) ? unit.generateJs() : "null", (anchor != null) ? anchor.generateJs() : "null", count));

//        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %f)", (unit != null) ? unit.generateJs() : "null", (anchor != null) ? anchor.generateJs() : "null", count));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomTo(%s, %s, %f)", (unit != null) ? unit.generateJs() : "null", (anchor != null) ? anchor.generateJs() : "null", count));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomTo1() {
        if (!setZoomTo1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setZoomTo1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setZoomTo2 = new ArrayList<>();

    public Gantt setZoomTo(Interval unit, String anchor1, Double count) {
        this.unit = unit;
        this.anchor1 = anchor1;
        this.count = count;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %f)", (unit != null) ? unit.generateJs() : "null", anchor1, count));

//        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %f)", (unit != null) ? unit.generateJs() : "null", anchor1, count));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomTo(%s, %s, %f)", (unit != null) ? unit.generateJs() : "null", anchor1, count));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomTo2() {
        if (!setZoomTo2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setZoomTo2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setZoomTo3 = new ArrayList<>();

    public Gantt setZoomTo(String unit1, GanttRangeAnchor anchor, Double count) {
        this.unit1 = unit1;
        this.anchor = anchor;
        this.count = count;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %f)", unit1, (anchor != null) ? anchor.generateJs() : "null", count));

//        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %f)", unit1, (anchor != null) ? anchor.generateJs() : "null", count));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomTo(%s, %s, %f)", unit1, (anchor != null) ? anchor.generateJs() : "null", count));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomTo3() {
        if (!setZoomTo3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setZoomTo3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Gantt> setZoomTo4 = new ArrayList<>();

    public Gantt setZoomTo(String unit1, String anchor1, Double count) {
        this.unit1 = unit1;
        this.anchor1 = anchor1;
        this.count = count;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %f)", unit1, anchor1, count));

//        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %f)", unit1, anchor1, count));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomTo(%s, %s, %f)", unit1, anchor1, count));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomTo4() {
        if (!setZoomTo4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Gantt item : setZoomTo4) {
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

    private String generateJSgetDataGrid() {
        if (getDataGrid != null) {
            return getDataGrid.generateJs();
        }
        return "";
    }

    private String generateJSgetGetTimeline() {
        if (getGetTimeline != null) {
            return getGetTimeline.generateJs();
        }
        return "";
    }

    private String generateJSgetXScale() {
        if (getXScale != null) {
            return getXScale.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetData());
        js.append(generateJSgetDataGrid());
        js.append(generateJSgetGetTimeline());
        js.append(generateJSgetXScale());
        js.append(generateJSsetCollapseTask());
        js.append(generateJSsetColumnStroke());
        js.append(generateJSsetColumnStroke1());
        js.append(generateJSsetData());
        js.append(generateJSsetData1());
        js.append(generateJSsetData2());
        js.append(generateJSsetData3());
        js.append(generateJSsetData4());
        js.append(generateJSsetData5());
        js.append(generateJSsetDataGrid());
        js.append(generateJSsetDefaultRowHeight());
        js.append(generateJSsetEditing());
        js.append(generateJSsetExpandTask());
        js.append(generateJSsetFitToTask());
        js.append(generateJSsetHeaderHeight());
        js.append(generateJSsetHeaderHeight1());
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
        js.append(generateJSsetRowStroke());
        js.append(generateJSsetRowStroke1());
        js.append(generateJSsetScrollTo());
        js.append(generateJSsetScrollToEnd());
        js.append(generateJSsetScrollToRow());
        js.append(generateJSsetSplitterPosition());
        js.append(generateJSsetSplitterPosition1());
        js.append(generateJSsetXScale());
        js.append(generateJSsetZoomIn());
        js.append(generateJSsetZoomOut());
        js.append(generateJSsetZoomTo());
        js.append(generateJSsetZoomTo1());
        js.append(generateJSsetZoomTo2());
        js.append(generateJSsetZoomTo3());
        js.append(generateJSsetZoomTo4());

        js.append(super.generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}