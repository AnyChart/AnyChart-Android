package com.anychart.anychart;

import com.anychart.anychart.application.MyApplication;
import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.List;
import java.util.Locale;

// chart class
/**
 * Gantt chart class.
 */
public class Gantt extends SeparateChart {

    protected Gantt(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    public Gantt setData(SingleValueDataSet data) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            js.append(data.generateJs());

            js.append("]);");
        }

        return this;
    }

    public Gantt setData(List<DataEntry> data) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            for (DataEntry dataEntry : data) {
                js.append(dataEntry.generateJs()).append(",");
            }
            js.setLength(js.length() - 1);

            js.append("]);");
        }

        return this;
    }

    public Gantt setData(List<DataEntry> data, TreeFillingMethod mode) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            for (DataEntry dataEntry : data) {
                js.append(dataEntry.generateJs()).append(",");
            }
            js.setLength(js.length() - 1);

            js.append("], ").append((mode != null) ? mode.generateJs() : "null").append(");");
        }

        return this;
    }

    public Gantt setData(Mapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(mapping.generateJs());

        js.append(jsBase).append(".data(").append(mapping.getJsBase()).append(");");

        return this;
    }

    public void setOnClickListener(ListenersInterface.OnClickListener listener) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append("chart.listen('pointClick', function(e) {");
        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        MyApplication.getInstance().getJavaScriptInterface().setOnClickListener(listener);
    }

    
    private String taskId;

    /**
     * Collapses task by id.<br/>
The collapseTask() method should be used after drawing a chart.
     */
    public Gantt collapseTask(String taskId) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".collapseTask(%s)", wrapQuotes(taskId)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".collapseTask(%s)", wrapQuotes(taskId)));
            js.setLength(0);
        }
        return this;
    }

    private Stroke columnStroke;
    private String columnStroke1;

    /**
     * Setter for the column stroke.
     */
    public Gantt setColumnStroke(Stroke columnStroke) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".columnStroke(%s)", ((columnStroke != null) ? columnStroke.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".columnStroke(%s)", ((columnStroke != null) ? columnStroke.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the column stroke.
     */
    public Gantt setColumnStroke(String columnStroke1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".columnStroke(%s)", wrapQuotes(columnStroke1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".columnStroke(%s)", wrapQuotes(columnStroke1)));
            js.setLength(0);
        }
        return this;
    }


    private Tree getData;

    /**
     * Getter for the chart data.
     */
    public Tree getData() {
        if (getData == null)
            getData = new Tree(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for the chart data.
     */
    public Gantt data(List<DataEntry> data) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (!data.isEmpty()) {
            StringBuilder resultData = new StringBuilder();
            resultData.append("[");
            for (DataEntry dataEntry : data) {
                resultData.append(dataEntry.generateJs()).append(",");
            }
            resultData.setLength(resultData.length() - 1);
            resultData.append("]");

            js.append(String.format(Locale.US, "var setData" + ++variableIndex + " = " + jsBase + ".data(%s);", resultData.toString()));
        }
        return this;
    }


    /**
     * 
     */
    public Gantt data(View mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setData1" + ++variableIndex + " = " + jsBase + ".data(%s);",  ((mapping != null) ? mapping.getJsBase() : "null")));
        return this;
    }


    private UiDataGrid getDataGrid;

    /**
     * Getter for the data grid.
     */
    public UiDataGrid getDataGrid() {
        if (getDataGrid == null)
            getDataGrid = new UiDataGrid(jsBase + ".dataGrid()");

        return getDataGrid;
    }
    private Boolean enabled;

    /**
     * Setter for the data grid.
     */
    public Gantt setDataGrid(Boolean enabled) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".dataGrid(%b)", enabled));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".dataGrid(%b)", enabled));
            js.setLength(0);
        }
        return this;
    }

    private Double defaultRowHeight;

    /**
     * Setter for the default row height.
     */
    public Gantt setDefaultRowHeight(Double defaultRowHeight) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultRowHeight(%f)", defaultRowHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultRowHeight(%f)", defaultRowHeight));
            js.setLength(0);
        }
        return this;
    }

    private Boolean editing;

    /**
     * Enables or disables the live edit mode.
     */
    public Gantt editing(Boolean editing) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".editing(%b)", editing));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".editing(%b)", editing));
            js.setLength(0);
        }
        return this;
    }

    private String taskId1;

    /**
     * Expands task by id.<br/>
The expandTask() method should be used after drawing a chart.
     */
    public Gantt expandTask(String taskId1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".expandTask(%s)", wrapQuotes(taskId1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".expandTask(%s)", wrapQuotes(taskId1)));
            js.setLength(0);
        }
        return this;
    }

    private String taskId2;

    /**
     * Fits the visible area of the timeline to the range of specified tasks.
     */
    public Gantt fitToTask(String taskId2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fitToTask(%s)", wrapQuotes(taskId2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fitToTask(%s)", wrapQuotes(taskId2)));
            js.setLength(0);
        }
        return this;
    }


    private UiTimeline getGetTimeline;

    /**
     * Getter for the timeline.
     */
    public UiTimeline getGetTimeline() {
        if (getGetTimeline == null)
            getGetTimeline = new UiTimeline(jsBase + ".getTimeline()");

        return getGetTimeline;
    }
    private Double headerHeight;
    private String headerHeight1;

    /**
     * Setter for the header height.
     */
    public Gantt setHeaderHeight(Double headerHeight) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".headerHeight(%f)", headerHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".headerHeight(%f)", headerHeight));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the header height.
     */
    public Gantt setHeaderHeight(String headerHeight1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".headerHeight(%s)", wrapQuotes(headerHeight1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".headerHeight(%s)", wrapQuotes(headerHeight1)));
            js.setLength(0);
        }
        return this;
    }

    private Fill rowHoverFill;

    /**
     * Sets row hover fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt setRowHoverFill(Fill rowHoverFill) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s)", ((rowHoverFill != null) ? rowHoverFill.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s)", ((rowHoverFill != null) ? rowHoverFill.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private String color;
    private Double opacity;

    /**
     * Fill color with opacity.<br/>
Fill as a string or an object.
     */
    public Gantt rowHoverFill(String color, Double opacity) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %f)", wrapQuotes(color), opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %f)", wrapQuotes(color), opacity));
            js.setLength(0);
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
    public Gantt rowHoverFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt rowHoverFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt rowHoverFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt rowHoverFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt rowHoverFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt rowHoverFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
            js.setLength(0);
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
    public Gantt rowHoverFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt rowHoverFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowHoverFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }

    private Fill rowSelectedFill;

    /**
     * Sets row selected fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt setRowSelectedFill(Fill rowSelectedFill) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s)", ((rowSelectedFill != null) ? rowSelectedFill.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s)", ((rowSelectedFill != null) ? rowSelectedFill.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private String color1;
    private Double opacity3;

    /**
     * Fill color with opacity.<br/>
Fill as a string or an object.
     */
    public Gantt rowSelectedFill(String color1, Double opacity3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f)", wrapQuotes(color1), opacity3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %f)", wrapQuotes(color1), opacity3));
            js.setLength(0);
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
    public Gantt rowSelectedFill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f, %f)", arrayToString(keys4), mode4, angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt rowSelectedFill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToString(keys4), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt rowSelectedFill(GradientKey[] keys4, String mode6, Double angle1, Double opacity4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToString(keys4), wrapQuotes(mode6), angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt rowSelectedFill(String[] keys5, Boolean mode4, Double angle1, Double opacity4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys5), mode4, angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt rowSelectedFill(String[] keys5, VectorRect mode5, Double angle1, Double opacity4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), ((mode5 != null) ? mode5.generateJs() : "null"), angle1, opacity4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt rowSelectedFill(String[] keys5, String mode6, Double angle1, Double opacity4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys5), wrapQuotes(mode6), angle1, opacity4));
            js.setLength(0);
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
    public Gantt rowSelectedFill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys6), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Gantt rowSelectedFill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowSelectedFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys7), cx1, cy1, ((mode7 != null) ? mode7.generateJs() : "null"), opacity5, fx1, fy1));
            js.setLength(0);
        }
        return this;
    }

    private Stroke rowStroke;
    private String rowStroke1;

    /**
     * Setter for the row stroke.
     */
    public Gantt setRowStroke(Stroke rowStroke) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowStroke(%s)", ((rowStroke != null) ? rowStroke.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowStroke(%s)", ((rowStroke != null) ? rowStroke.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the row stroke.
     */
    public Gantt setRowStroke(String rowStroke1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rowStroke(%s)", wrapQuotes(rowStroke1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rowStroke(%s)", wrapQuotes(rowStroke1)));
            js.setLength(0);
        }
        return this;
    }

    private Double pxOffset;

    /**
     * Performs vertical scrolling by pixel offset.<br/>
The scrollTo() method should be used after drawing a chart.
     */
    public Gantt scrollTo(Double pxOffset) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scrollTo(%f)", pxOffset));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scrollTo(%f)", pxOffset));
            js.setLength(0);
        }
        return this;
    }

    private Double index;

    /**
     * Scrolls vertically to specified index.<br/>
The scrollToEnd() method should be used after drawing a chart.
     */
    public Gantt scrollToEnd(Double index) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scrollToEnd(%f)", index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scrollToEnd(%f)", index));
            js.setLength(0);
        }
        return this;
    }

    private Double rowIndex;

    /**
     * Performs vertical scroll for a row at the specified index.
     */
    public Gantt scrollToRow(Double rowIndex) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scrollToRow(%f)", rowIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scrollToRow(%f)", rowIndex));
            js.setLength(0);
        }
        return this;
    }

    private String splitterPosition;
    private Double splitterPosition1;

    /**
     * Setter for the splitter position.
     */
    public Gantt setSplitterPosition(String splitterPosition) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterPosition(%s)", wrapQuotes(splitterPosition)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterPosition(%s)", wrapQuotes(splitterPosition)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the splitter position.
     */
    public Gantt setSplitterPosition(Double splitterPosition1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterPosition(%f)", splitterPosition1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterPosition(%f)", splitterPosition1));
            js.setLength(0);
        }
        return this;
    }


    private GanttDateTime getXScale;

    /**
     * Getter for the timeline X-scale.
     */
    public GanttDateTime getXScale() {
        if (getXScale == null)
            getXScale = new GanttDateTime(jsBase + ".xScale()");

        return getXScale;
    }
    private String xScale;

    /**
     * Setter for the timeline X-scale.
     */
    public Gantt setXScale(String xScale) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", wrapQuotes(xScale)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", wrapQuotes(xScale)));
            js.setLength(0);
        }
        return this;
    }

    private Double zoomFactor;

    /**
     * Timeline zoom in.
     */
    public Gantt zoomIn(Double zoomFactor) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomIn(%f)", zoomFactor));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomIn(%f)", zoomFactor));
            js.setLength(0);
        }
        return this;
    }

    private Double zoomFactor1;

    /**
     * Timeline zoom out.
     */
    public Gantt zoomOut(Double zoomFactor1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomOut(%f)", zoomFactor1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomOut(%f)", zoomFactor1));
            js.setLength(0);
        }
        return this;
    }

    private Double startDate;
    private Double endDate;

    /**
     * Sets the timeline zoom to range using the date.
     */
    public Gantt setZoomTo(Double startDate, Double endDate) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomTo(%f, %f)", startDate, endDate));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomTo(%f, %f)", startDate, endDate));
            js.setLength(0);
        }
        return this;
    }

    private Interval unit;
    private String unit1;
    private Double count;
    private GanttRangeAnchor anchor;
    private String anchor1;

    /**
     * Sets the timeline zoom to range using the interval.
     */
    public Gantt setZoomTo(Interval unit, GanttRangeAnchor anchor, Double count) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %f)", ((unit != null) ? unit.generateJs() : "null"), ((anchor != null) ? anchor.generateJs() : "null"), count));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomTo(%s, %s, %f)", ((unit != null) ? unit.generateJs() : "null"), ((anchor != null) ? anchor.generateJs() : "null"), count));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Sets the timeline zoom to range using the interval.
     */
    public Gantt setZoomTo(Interval unit, String anchor1, Double count) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %f)", ((unit != null) ? unit.generateJs() : "null"), wrapQuotes(anchor1), count));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomTo(%s, %s, %f)", ((unit != null) ? unit.generateJs() : "null"), wrapQuotes(anchor1), count));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Sets the timeline zoom to range using the interval.
     */
    public Gantt setZoomTo(String unit1, GanttRangeAnchor anchor, Double count) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %f)", wrapQuotes(unit1), ((anchor != null) ? anchor.generateJs() : "null"), count));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomTo(%s, %s, %f)", wrapQuotes(unit1), ((anchor != null) ? anchor.generateJs() : "null"), count));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Sets the timeline zoom to range using the interval.
     */
    public Gantt setZoomTo(String unit1, String anchor1, Double count) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %f)", wrapQuotes(unit1), wrapQuotes(anchor1), count));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomTo(%s, %s, %f)", wrapQuotes(unit1), wrapQuotes(anchor1), count));
            js.setLength(0);
        }
        return this;
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

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}