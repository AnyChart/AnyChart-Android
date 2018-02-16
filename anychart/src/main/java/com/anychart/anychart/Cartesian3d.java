package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * Cartesian 3d chart class.<br/>
To get the chart use any of these methods:
 <ul>
     <li>{@link anychart#area3d}</li>
     <li>{@link anychart#bar3d}</li>
     <li>{@link anychart#column3d}</li>
 </ul>
Chart can contain any number of series.
Each series is interactive, you can customize click and hover behavior and other parameters.
 */
public class Cartesian3d extends SeparateChart {

    protected Cartesian3d(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
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

        ListenersInterface.getInstance().setOnClickListener(listener);
    }

    
    private List<Area3d> setArea = new ArrayList<>();

    /**
     * Adds 3D Area series.
     */
    public Area3d area(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setArea" + ++variableIndex + " = " + jsBase + ".area(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        Area3d item = new Area3d("setArea" + variableIndex);
        setArea.add(item);
        return item;
    }
    private String generateJSsetArea() {
        if (!setArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Area3d item : setArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Area3d> setArea1 = new ArrayList<>();

    /**
     * 
     */
    public Area3d area(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setArea1" + ++variableIndex + " = " + jsBase + ".area(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s);", view.getJsBase()));
            js.setLength(0);
        }
        Area3d item = new Area3d("setArea1" + variableIndex);
        setArea1.add(item);
        return item;
    }
    private String generateJSsetArea1() {
        if (!setArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Area3d item : setArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bar3d> setBar = new ArrayList<>();

    /**
     * Adds 3D Bar series.
     */
    public Bar3d bar(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setBar" + ++variableIndex + " = " + jsBase + ".bar(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        Bar3d item = new Bar3d("setBar" + variableIndex);
        setBar.add(item);
        return item;
    }
    private String generateJSsetBar() {
        if (!setBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bar3d item : setBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bar3d> setBar1 = new ArrayList<>();

    /**
     * 
     */
    public Bar3d bar(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setBar1" + ++variableIndex + " = " + jsBase + ".bar(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s);", view.getJsBase()));
            js.setLength(0);
        }
        Bar3d item = new Bar3d("setBar1" + variableIndex);
        setBar1.add(item);
        return item;
    }
    private String generateJSsetBar1() {
        if (!setBar1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bar3d item : setBar1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Column3d> setColumn = new ArrayList<>();

    /**
     * Adds 3D Column series.
     */
    public Column3d column(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setColumn" + ++variableIndex + " = " + jsBase + ".column(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        Column3d item = new Column3d("setColumn" + variableIndex);
        setColumn.add(item);
        return item;
    }
    private String generateJSsetColumn() {
        if (!setColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Column3d item : setColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Column3d> setColumn1 = new ArrayList<>();

    /**
     * 
     */
    public Column3d column(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setColumn1" + ++variableIndex + " = " + jsBase + ".column(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s);", view.getJsBase()));
            js.setLength(0);
        }
        Column3d item = new Column3d("setColumn1" + variableIndex);
        setColumn1.add(item);
        return item;
    }
    private String generateJSsetColumn1() {
        if (!setColumn1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Column3d item : setColumn1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private View getData;

    /**
     * Getter for the data.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for the data.
     */
    public Cartesian3d setData(List<DataEntry> data) {
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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        return this;
    }


    /**
     * 
     */
    public Cartesian3d setData(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setData1" + ++variableIndex + " = " + jsBase + ".data(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", view.getJsBase()));
            js.setLength(0);
        }
        return this;
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

    /**
     * Setter for hovered state settings.
     */
    public Cartesian3d setHovered(String hovered) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));
            js.setLength(0);
        }
        return this;
    }


    private UiLabelsFactory getLabels;

    /**
     * Getter for series data labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }
    private String labels;
    private Boolean labels1;

    /**
     * Setter for series data labels.
     */
    public Cartesian3d setLabels(String labels) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for series data labels.
     */
    public Cartesian3d setLabels(Boolean labels1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labels(%b)", labels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labels(%b)", labels1));
            js.setLength(0);
        }
        return this;
    }

    private List<Line3d> setLine = new ArrayList<>();

    /**
     * Adds 3D Line series.
     */
    public Line3d line(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setLine" + ++variableIndex + " = " + jsBase + ".line(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        Line3d item = new Line3d("setLine" + variableIndex);
        setLine.add(item);
        return item;
    }
    private String generateJSsetLine() {
        if (!setLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Line3d item : setLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Line3d> setLine1 = new ArrayList<>();

    /**
     * 
     */
    public Line3d line(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setLine1" + ++variableIndex + " = " + jsBase + ".line(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s);", view.getJsBase()));
            js.setLength(0);
        }
        Line3d item = new Line3d("setLine1" + variableIndex);
        setLine1.add(item);
        return item;
    }
    private String generateJSsetLine1() {
        if (!setLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Line3d item : setLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d = new ArrayList<>();

    /**
     * Adds 2D Line series to the 3D chart.
     */
    public CartesianSeriesLine line2d(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setLine2d" + ++variableIndex + " = " + jsBase + ".line2d(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d" + variableIndex);
        setLine2d.add(item);
        return item;
    }
    private String generateJSsetLine2d() {
        if (!setLine2d.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesLine line2d(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setLine2d1" + ++variableIndex + " = " + jsBase + ".line2d(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d1" + variableIndex);
        setLine2d1.add(item);
        return item;
    }
    private String generateJSsetLine2d1() {
        if (!setLine2d1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number maxPointWidth;
    private String maxPointWidth1;

    /**
     * Setter for the maximum point width.
     */
    public Cartesian3d setMaxPointWidth(Number maxPointWidth) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the maximum point width.
     */
    public Cartesian3d setMaxPointWidth(String maxPointWidth1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));
            js.setLength(0);
        }
        return this;
    }

    private Number minPointLength;
    private String minPointLength1;

    /**
     * Setter for the minimum point length.
     */
    public Cartesian3d setMinPointLength(Number minPointLength) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minPointLength(%s)", minPointLength));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%s)", minPointLength));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the minimum point length.
     */
    public Cartesian3d setMinPointLength(String minPointLength1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));
            js.setLength(0);
        }
        return this;
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

    /**
     * Setter for normal state settings.
     */
    public Cartesian3d setNormal(String normal) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));
            js.setLength(0);
        }
        return this;
    }

    private Number pointWidth;
    private String pointWidth1;

    /**
     * Setter for the point width settings.
     */
    public Cartesian3d setPointWidth(Number pointWidth) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointWidth(%s)", pointWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", pointWidth));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the point width settings.
     */
    public Cartesian3d setPointWidth(String pointWidth1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));
            js.setLength(0);
        }
        return this;
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

    /**
     * Setter for selected state settings.
     */
    public Cartesian3d setSelected(String selected) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));
            js.setLength(0);
        }
        return this;
    }


    private CoreAxesLinear getXAxis;

    /**
     * Getter for the chart X-axis.
     */
    public CoreAxesLinear getXAxis() {
        if (getXAxis == null)
            getXAxis = new CoreAxesLinear(jsBase + ".xAxis()");

        return getXAxis;
    }

    private List<CoreAxesLinear> getXAxis1 = new ArrayList<>();

    /**
     * Getter for the chart X-axis.
     */
    public CoreAxesLinear getXAxis(Number index) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".xAxis("+ index+")");
        getXAxis1.add(item);
        return item;
    }
    private String xAxis;
    private Boolean xAxis1;

    /**
     * Setter for the chart X-axis.
     */
    public Cartesian3d setXAxis(String xAxis) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s)", wrapQuotes(xAxis)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s)", wrapQuotes(xAxis)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart X-axis.
     */
    public Cartesian3d setXAxis(Boolean xAxis1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%b)", xAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b)", xAxis1));
            js.setLength(0);
        }
        return this;
    }

    private Number index1;
    private String xAxis2;
    private Boolean xAxis3;

    /**
     * Setter for the chart X-axis by index.
     */
    public Cartesian3d setXAxis(String xAxis2, Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s, %s)", wrapQuotes(xAxis2), index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s, %s)", wrapQuotes(xAxis2), index1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart X-axis by index.
     */
    public Cartesian3d setXAxis(Boolean xAxis3, Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%b, %s)", xAxis3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b, %s)", xAxis3, index1));
            js.setLength(0);
        }
        return this;
    }


    private CoreGridsLinear getXGrid;

    /**
     * Getter for the chart grid by X-scale.
     */
    public CoreGridsLinear getXGrid() {
        if (getXGrid == null)
            getXGrid = new CoreGridsLinear(jsBase + ".xGrid()");

        return getXGrid;
    }

    private List<CoreGridsLinear> getXGrid1 = new ArrayList<>();

    /**
     * Getter for the chart grid by X-scale.
     */
    public CoreGridsLinear getXGrid(Number index2) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".xGrid("+ index2+")");
        getXGrid1.add(item);
        return item;
    }
    private String xGrid;
    private Boolean xGrid1;

    /**
     * Setter for the chart grid by X-scale.
     */
    public Cartesian3d setXGrid(String xGrid) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s)", wrapQuotes(xGrid)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s)", wrapQuotes(xGrid)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart grid by X-scale.
     */
    public Cartesian3d setXGrid(Boolean xGrid1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%b)", xGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b)", xGrid1));
            js.setLength(0);
        }
        return this;
    }

    private Number index3;
    private String xGrid2;
    private Boolean xGrid3;

    /**
     * Setter for chart grid by index.
     */
    public Cartesian3d setXGrid(String xGrid2, Number index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s, %s)", wrapQuotes(xGrid2), index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s, %s)", wrapQuotes(xGrid2), index3));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for chart grid by index.
     */
    public Cartesian3d setXGrid(Boolean xGrid3, Number index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%b, %s)", xGrid3, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b, %s)", xGrid3, index3));
            js.setLength(0);
        }
        return this;
    }


    private CoreGridsLinear getXMinorGrid;

    /**
     * Getter for the chart minor grid by X-scale.
     */
    public CoreGridsLinear getXMinorGrid() {
        if (getXMinorGrid == null)
            getXMinorGrid = new CoreGridsLinear(jsBase + ".xMinorGrid()");

        return getXMinorGrid;
    }

    private List<CoreGridsLinear> getXMinorGrid1 = new ArrayList<>();

    /**
     * Getter for the chart minor grid by X-scale.
     */
    public CoreGridsLinear getXMinorGrid(Number index4) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".xMinorGrid("+ index4+")");
        getXMinorGrid1.add(item);
        return item;
    }
    private String xMinorGrid;
    private Boolean xMinorGrid1;

    /**
     * Setter for the chart minor grid by X-scale.
     */
    public Cartesian3d setXMinorGrid(String xMinorGrid) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%s)", wrapQuotes(xMinorGrid)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s)", wrapQuotes(xMinorGrid)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart minor grid by X-scale.
     */
    public Cartesian3d setXMinorGrid(Boolean xMinorGrid1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%b)", xMinorGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%b)", xMinorGrid1));
            js.setLength(0);
        }
        return this;
    }

    private Number index5;
    private String xMinorGrid2;
    private Boolean xMinorGrid3;

    /**
     * Setter for the chart minor grid by index.
     */
    public Cartesian3d setXMinorGrid(String xMinorGrid2, Number index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%s, %s)", wrapQuotes(xMinorGrid2), index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s, %s)", wrapQuotes(xMinorGrid2), index5));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart minor grid by index.
     */
    public Cartesian3d setXMinorGrid(Boolean xMinorGrid3, Number index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%b, %s)", xMinorGrid3, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%b, %s)", xMinorGrid3, index5));
            js.setLength(0);
        }
        return this;
    }


    private Ordinal getXScale;

    /**
     * Getter for the chart X-scale.
     */
    public Ordinal getXScale() {
        if (getXScale == null)
            getXScale = new Ordinal(jsBase + ".xScale()");

        return getXScale;
    }
    private String xScale;
    private ScaleTypes xScale1;
    private String xScale2;
    private ScalesBase xScale3;

    /**
     * Setter for the chart X-scale.
     */
    public Cartesian3d setXScale(String xScale) {
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


    /**
     * Setter for the chart X-scale.
     */
    public Cartesian3d setXScale(ScaleTypes xScale1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", ((xScale1 != null) ? xScale1.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", ((xScale1 != null) ? xScale1.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart X-scale.
     */
    public Cartesian3d setXScale(ScalesBase xScale3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(xScale3.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".xScale(%s);",  ((xScale3 != null) ? xScale3.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", ((xScale3 != null) ? xScale3.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


    private CoreAxesLinear getYAxis;

    /**
     * Getter for the chart Y-axis.
     */
    public CoreAxesLinear getYAxis() {
        if (getYAxis == null)
            getYAxis = new CoreAxesLinear(jsBase + ".yAxis()");

        return getYAxis;
    }

    private List<CoreAxesLinear> getYAxis1 = new ArrayList<>();

    /**
     * Getter for the chart Y-axis.
     */
    public CoreAxesLinear getYAxis(Number index6) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".yAxis("+ index6+")");
        getYAxis1.add(item);
        return item;
    }
    private String yAxis;
    private Boolean yAxis1;

    /**
     * Setter for the chart Y-axis.
     */
    public Cartesian3d setYAxis(String yAxis) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s)", wrapQuotes(yAxis)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s)", wrapQuotes(yAxis)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart Y-axis.
     */
    public Cartesian3d setYAxis(Boolean yAxis1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%b)", yAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%b)", yAxis1));
            js.setLength(0);
        }
        return this;
    }

    private Number index7;
    private String yAxis2;
    private Boolean yAxis3;

    /**
     * Setter for the chart Y-axis by index.
     */
    public Cartesian3d setYAxis(String yAxis2, Number index7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s, %s)", wrapQuotes(yAxis2), index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s, %s)", wrapQuotes(yAxis2), index7));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart Y-axis by index.
     */
    public Cartesian3d setYAxis(Boolean yAxis3, Number index7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%b, %s)", yAxis3, index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%b, %s)", yAxis3, index7));
            js.setLength(0);
        }
        return this;
    }


    private CoreGridsLinear getYGrid;

    /**
     * Getter for the chart grid by Y-scale.
     */
    public CoreGridsLinear getYGrid() {
        if (getYGrid == null)
            getYGrid = new CoreGridsLinear(jsBase + ".yGrid()");

        return getYGrid;
    }

    private List<CoreGridsLinear> getYGrid1 = new ArrayList<>();

    /**
     * Getter for the chart grid by Y-scale.
     */
    public CoreGridsLinear getYGrid(Number index8) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".yGrid("+ index8+")");
        getYGrid1.add(item);
        return item;
    }
    private String yGrid;
    private Boolean yGrid1;

    /**
     * Setter for the chart grid by Y-scale.
     */
    public Cartesian3d setYGrid(String yGrid) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s)", wrapQuotes(yGrid)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s)", wrapQuotes(yGrid)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart grid by Y-scale.
     */
    public Cartesian3d setYGrid(Boolean yGrid1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%b)", yGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b)", yGrid1));
            js.setLength(0);
        }
        return this;
    }

    private Number index9;
    private String yGrid2;
    private Boolean yGrid3;

    /**
     * Setter for chart grid by index.
     */
    public Cartesian3d setYGrid(String yGrid2, Number index9) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s, %s)", wrapQuotes(yGrid2), index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s, %s)", wrapQuotes(yGrid2), index9));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for chart grid by index.
     */
    public Cartesian3d setYGrid(Boolean yGrid3, Number index9) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%b, %s)", yGrid3, index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b, %s)", yGrid3, index9));
            js.setLength(0);
        }
        return this;
    }


    private CoreGridsLinear getYMinorGrid;

    /**
     * Getter for the chart minor grid by Y-scale.
     */
    public CoreGridsLinear getYMinorGrid() {
        if (getYMinorGrid == null)
            getYMinorGrid = new CoreGridsLinear(jsBase + ".yMinorGrid()");

        return getYMinorGrid;
    }

    private List<CoreGridsLinear> getYMinorGrid1 = new ArrayList<>();

    /**
     * Getter for the chart minor grid by Y-scale.
     */
    public CoreGridsLinear getYMinorGrid(Number index10) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".yMinorGrid("+ index10+")");
        getYMinorGrid1.add(item);
        return item;
    }
    private String yMinorGrid;
    private Boolean yMinorGrid1;

    /**
     * Setter for the chart minor grid by Y-scale.
     */
    public Cartesian3d setYMinorGrid(String yMinorGrid) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%s)", wrapQuotes(yMinorGrid)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s)", wrapQuotes(yMinorGrid)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart minor grid by Y-scale.
     */
    public Cartesian3d setYMinorGrid(Boolean yMinorGrid1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%b)", yMinorGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%b)", yMinorGrid1));
            js.setLength(0);
        }
        return this;
    }

    private Number index11;
    private String yMinorGrid2;
    private Boolean yMinorGrid3;

    /**
     * Setter for the chart minor grid by index.
     */
    public Cartesian3d setYMinorGrid(String yMinorGrid2, Number index11) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%s, %s)", wrapQuotes(yMinorGrid2), index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s, %s)", wrapQuotes(yMinorGrid2), index11));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart minor grid by index.
     */
    public Cartesian3d setYMinorGrid(Boolean yMinorGrid3, Number index11) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%b, %s)", yMinorGrid3, index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%b, %s)", yMinorGrid3, index11));
            js.setLength(0);
        }
        return this;
    }


    private ScalesLinear getYScale;

    /**
     * Getter for the chart Y-scale.
     */
    public ScalesLinear getYScale() {
        if (getYScale == null)
            getYScale = new ScalesLinear(jsBase + ".yScale()");

        return getYScale;
    }
    private String yScale;
    private ScaleTypes yScale1;
    private String yScale2;
    private ScalesBase yScale3;

    /**
     * Setter for the chart Y-scale.
     */
    public Cartesian3d setYScale(String yScale) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart Y-scale.
     */
    public Cartesian3d setYScale(ScaleTypes yScale1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", ((yScale1 != null) ? yScale1.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale1 != null) ? yScale1.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart Y-scale.
     */
    public Cartesian3d setYScale(ScalesBase yScale3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(yScale3.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale3 != null) ? yScale3.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale3 != null) ? yScale3.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private Number zAngle;

    /**
     * Setter for the Z-axis angle.
     */
    public Cartesian3d setZAngle(Number zAngle) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zAngle(%s)", zAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zAngle(%s)", zAngle));
            js.setLength(0);
        }
        return this;
    }

    private Number zAspect;
    private String zAspect1;

    /**
     * Setter for the depth of the point by Z-axis.
     */
    public Cartesian3d setZAspect(Number zAspect) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zAspect(%s)", zAspect));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zAspect(%s)", zAspect));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the depth of the point by Z-axis.
     */
    public Cartesian3d setZAspect(String zAspect1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zAspect(%s)", wrapQuotes(zAspect1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zAspect(%s)", wrapQuotes(zAspect1)));
            js.setLength(0);
        }
        return this;
    }

    private Boolean zDistribution;

    /**
     * Setter for distribution of the series by Z-axis.
     */
    public Cartesian3d setZDistribution(Boolean zDistribution) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zDistribution(%b)", zDistribution));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zDistribution(%b)", zDistribution));
            js.setLength(0);
        }
        return this;
    }

    private Number zPadding;

    /**
     * Setter for the Z-axis padding.
     */
    public Cartesian3d setZPadding(Number zPadding) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zPadding(%s)", zPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zPadding(%s)", zPadding));
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

    private String generateJSgetXAxis() {
        if (getXAxis != null) {
            return getXAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetXAxis1() {
        if (!getXAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxesLinear item : getXAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetXGrid() {
        if (getXGrid != null) {
            return getXGrid.generateJs();
        }
        return "";
    }

    private String generateJSgetXGrid1() {
        if (!getXGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreGridsLinear item : getXGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetXMinorGrid() {
        if (getXMinorGrid != null) {
            return getXMinorGrid.generateJs();
        }
        return "";
    }

    private String generateJSgetXMinorGrid1() {
        if (!getXMinorGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreGridsLinear item : getXMinorGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetXScale() {
        if (getXScale != null) {
            return getXScale.generateJs();
        }
        return "";
    }

    private String generateJSgetYAxis() {
        if (getYAxis != null) {
            return getYAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetYAxis1() {
        if (!getYAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxesLinear item : getYAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetYGrid() {
        if (getYGrid != null) {
            return getYGrid.generateJs();
        }
        return "";
    }

    private String generateJSgetYGrid1() {
        if (!getYGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreGridsLinear item : getYGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetYMinorGrid() {
        if (getYMinorGrid != null) {
            return getYMinorGrid.generateJs();
        }
        return "";
    }

    private String generateJSgetYMinorGrid1() {
        if (!getYMinorGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreGridsLinear item : getYMinorGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetYScale() {
        if (getYScale != null) {
            return getYScale.generateJs();
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
        js.append(generateJSgetHovered());
        js.append(generateJSgetLabels());
        js.append(generateJSgetNormal());
        js.append(generateJSgetSelected());
        js.append(generateJSgetXAxis());
        js.append(generateJSgetXAxis1());
        js.append(generateJSgetXGrid());
        js.append(generateJSgetXGrid1());
        js.append(generateJSgetXMinorGrid());
        js.append(generateJSgetXMinorGrid1());
        js.append(generateJSgetXScale());
        js.append(generateJSgetYAxis());
        js.append(generateJSgetYAxis1());
        js.append(generateJSgetYGrid());
        js.append(generateJSgetYGrid1());
        js.append(generateJSgetYMinorGrid());
        js.append(generateJSgetYMinorGrid1());
        js.append(generateJSgetYScale());
        js.append(generateJSsetArea());
        js.append(generateJSsetArea1());
        js.append(generateJSsetBar());
        js.append(generateJSsetBar1());
        js.append(generateJSsetColumn());
        js.append(generateJSsetColumn1());
        js.append(generateJSsetLine());
        js.append(generateJSsetLine1());
        js.append(generateJSsetLine2d());
        js.append(generateJSsetLine2d1());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}