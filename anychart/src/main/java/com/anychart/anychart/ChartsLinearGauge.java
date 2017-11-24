package com.anychart.anychart;

import com.anychart.anychart.application.MyApplication;
import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// chart class
/**
 * Linear gauge class.<br/>
<b>Note:</b> Use {@link anychart.gauges#linear} method to get an instance of this class.
 */
public class ChartsLinearGauge extends SeparateChart {

    protected ChartsLinearGauge(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    public ChartsLinearGauge setData(SingleValueDataSet data) {
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

    public ChartsLinearGauge setData(List<DataEntry> data) {
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

    public ChartsLinearGauge setData(List<DataEntry> data, TreeFillingMethod mode) {
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

    public ChartsLinearGauge setData(Mapping mapping) {
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

    
    private Double var_args;

    /**
     * Adds pointers to the gauge.
     */
    public void addPointer(Double var_args) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".addPointer(%f);", var_args));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".addPointer(%f)", var_args));
            js.setLength(0);
        }
    }


    private AxesLinearGauge getAxis;

    /**
     * Getter for the gauge axis.
     */
    public AxesLinearGauge getAxis() {
        if (getAxis == null)
            getAxis = new AxesLinearGauge(jsBase + ".axis()");

        return getAxis;
    }

    private List<AxesLinearGauge> getAxis1 = new ArrayList<>();

    /**
     * Getter for the gauge axis.
     */
    public AxesLinearGauge getAxis(Double index) {
        AxesLinearGauge item = new AxesLinearGauge(jsBase + ".axis("+ index+")");
        getAxis1.add(item);
        return item;
    }
    private String axis;
    private Boolean axis1;

    /**
     * Setter for the gauge axis.
     */
    public ChartsLinearGauge setAxis(String axis) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%s)", wrapQuotes(axis)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%s)", wrapQuotes(axis)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the gauge axis.
     */
    public ChartsLinearGauge setAxis(Boolean axis1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%b)", axis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%b)", axis1));
            js.setLength(0);
        }
        return this;
    }

    private Double index1;
    private String axis2;
    private Boolean axis3;

    /**
     * Setter for the chart axis by index.
     */
    public ChartsLinearGauge setAxis(String axis2, Double index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%s, %f)", wrapQuotes(axis2), index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%s, %f)", wrapQuotes(axis2), index1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart axis by index.
     */
    public ChartsLinearGauge setAxis(Boolean axis3, Double index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%b, %f)", axis3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%b, %f)", axis3, index1));
            js.setLength(0);
        }
        return this;
    }

    private Double dataIndex;
    private List<LineargaugePointersBar> setBar = new ArrayList<>();

    /**
     * Adds Bar pointer.
     */
    public LineargaugePointersBar bar(Double dataIndex) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar" + ++variableIndex + " = " + jsBase + ".bar(%f);", dataIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%f)", dataIndex));
            js.setLength(0);
        }
        LineargaugePointersBar item = new LineargaugePointersBar("setBar" + variableIndex);
        setBar.add(item);
        return item;
    }
    private String generateJSsetBar() {
        if (!setBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LineargaugePointersBar item : setBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private View getData;

    /**
     * Getter for the pointers mapping.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for the pointers mapping.
     */
    public ChartsLinearGauge data(List<DataEntry> data) {
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
    public ChartsLinearGauge data(View mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(mapping.generateJs());
        js.append(String.format(Locale.US, "var setData1" + ++variableIndex + " = " + jsBase + ".data(%s);",  ((mapping != null) ? mapping.getJsBase() : "null")));
        return this;
    }

    private LinearGaugePointerType defaultPointerType;
    private String defaultPointerType1;

    /**
     * Setter for the linear gauge pointer type by default.
     */
    public ChartsLinearGauge setDefaultPointerType(LinearGaugePointerType defaultPointerType) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultPointerType(%s)", ((defaultPointerType != null) ? defaultPointerType.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultPointerType(%s)", ((defaultPointerType != null) ? defaultPointerType.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the linear gauge pointer type by default.
     */
    public ChartsLinearGauge setDefaultPointerType(String defaultPointerType1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultPointerType(%s)", wrapQuotes(defaultPointerType1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultPointerType(%s)", wrapQuotes(defaultPointerType1)));
            js.setLength(0);
        }
        return this;
    }

    private Double id;
    private String id1;
    private List<LineargaugePointersBase> setGetPointer = new ArrayList<>();

    /**
     * Returns pointer by id.
     */
    public LineargaugePointersBase getPointer(Double id) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setGetPointer" + ++variableIndex + " = " + jsBase + ".getPointer(%f);", id));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPointer(%f)", id));
            js.setLength(0);
        }
        LineargaugePointersBase item = new LineargaugePointersBase("setGetPointer" + variableIndex);
        setGetPointer.add(item);
        return item;
    }
    private String generateJSsetGetPointer() {
        if (!setGetPointer.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LineargaugePointersBase item : setGetPointer) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LineargaugePointersBase> setGetPointer1 = new ArrayList<>();

    /**
     * Returns pointer by id.
     */
    public LineargaugePointersBase getPointer(String id1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setGetPointer1" + ++variableIndex + " = " + jsBase + ".getPointer(%s);", wrapQuotes(id1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPointer(%s)", wrapQuotes(id1)));
            js.setLength(0);
        }
        LineargaugePointersBase item = new LineargaugePointersBase("setGetPointer1" + variableIndex);
        setGetPointer1.add(item);
        return item;
    }
    private String generateJSsetGetPointer1() {
        if (!setGetPointer1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LineargaugePointersBase item : setGetPointer1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index2;
    private List<LineargaugePointersBase> setGetPointerAt = new ArrayList<>();

    /**
     * Returns pointer by index.
     */
    public LineargaugePointersBase getPointerAt(Double index2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setGetPointerAt" + ++variableIndex + " = " + jsBase + ".getPointerAt(%f);", index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPointerAt(%f)", index2));
            js.setLength(0);
        }
        LineargaugePointersBase item = new LineargaugePointersBase("setGetPointerAt" + variableIndex);
        setGetPointerAt.add(item);
        return item;
    }
    private String generateJSsetGetPointerAt() {
        if (!setGetPointerAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LineargaugePointersBase item : setGetPointerAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String globalOffset;
    private Double globalOffset1;

    /**
     * Setter for the global offset of a linear gauge.
     */
    public ChartsLinearGauge setGlobalOffset(String globalOffset) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".globalOffset(%s)", wrapQuotes(globalOffset)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".globalOffset(%s)", wrapQuotes(globalOffset)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the global offset of a linear gauge.
     */
    public ChartsLinearGauge setGlobalOffset(Double globalOffset1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".globalOffset(%f)", globalOffset1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".globalOffset(%f)", globalOffset1));
            js.setLength(0);
        }
        return this;
    }


    private HatchFills getHatchFillPalette;

    /**
     * Getter for the gauge hatch fill palette settings.
     */
    public HatchFills getHatchFillPalette() {
        if (getHatchFillPalette == null)
            getHatchFillPalette = new HatchFills(jsBase + ".hatchFillPalette()");

        return getHatchFillPalette;
    }
    private HatchFillType[] hatchFillPalette;
    private String hatchFillPalette1;
    private HatchFills hatchFillPalette2;

    /**
     * Setter for the gauge hatch fill palette settings.
     */
    public ChartsLinearGauge setHatchFillPalette(HatchFillType[] hatchFillPalette) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", arrayToString(hatchFillPalette)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", arrayToString(hatchFillPalette)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the gauge hatch fill palette settings.
     */
    public ChartsLinearGauge setHatchFillPalette(String hatchFillPalette1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", wrapQuotes(hatchFillPalette1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", wrapQuotes(hatchFillPalette1)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the gauge hatch fill palette settings.
     */
    public ChartsLinearGauge setHatchFillPalette(HatchFills hatchFillPalette2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(hatchFillPalette2.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".hatchFillPalette(%s);",  ((hatchFillPalette2 != null) ? hatchFillPalette2.getJsBase() : "null")));
        return this;
    }

    private Boolean isVertical;

    /**
     * Setter for the vertical layout.
     */
    public ChartsLinearGauge setIsVertical(Boolean isVertical) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".isVertical(%b)", isVertical));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".isVertical(%b)", isVertical));
            js.setLength(0);
        }
        return this;
    }

    private Layout layout;
    private String layout1;

    /**
     * Setter for the gauge layout.
     */
    public ChartsLinearGauge setLayout(Layout layout) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".layout(%s)", ((layout != null) ? layout.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", ((layout != null) ? layout.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the gauge layout.
     */
    public ChartsLinearGauge setLayout(String layout1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".layout(%s)", wrapQuotes(layout1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", wrapQuotes(layout1)));
            js.setLength(0);
        }
        return this;
    }

    private Double dataIndex1;
    private List<Led> setLed = new ArrayList<>();

    /**
     * Adds Led pointer.
     */
    public Led led(Double dataIndex1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLed" + ++variableIndex + " = " + jsBase + ".led(%f);", dataIndex1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".led(%f)", dataIndex1));
            js.setLength(0);
        }
        Led item = new Led("setLed" + variableIndex);
        setLed.add(item);
        return item;
    }
    private String generateJSsetLed() {
        if (!setLed.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Led item : setLed) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double dataIndex2;
    private List<LineargaugePointersMarker> setMarker = new ArrayList<>();

    /**
     * Adds Marker pointer.
     */
    public LineargaugePointersMarker marker(Double dataIndex2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker" + ++variableIndex + " = " + jsBase + ".marker(%f);", dataIndex2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%f)", dataIndex2));
            js.setLength(0);
        }
        LineargaugePointersMarker item = new LineargaugePointersMarker("setMarker" + variableIndex);
        setMarker.add(item);
        return item;
    }
    private String generateJSsetMarker() {
        if (!setMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LineargaugePointersMarker item : setMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Markers getMarkerPalette;

    /**
     * Getter for the gauge markers palette settings.
     */
    public Markers getMarkerPalette() {
        if (getMarkerPalette == null)
            getMarkerPalette = new Markers(jsBase + ".markerPalette()");

        return getMarkerPalette;
    }
    private Markers markerPalette;
    private String markerPalette1;
    private MarkerType[] markerPalette2;
    private String[] markerPalette3;

    /**
     * Setter for the gauge markers palette settings.
     */
    public ChartsLinearGauge setMarkerPalette(Markers markerPalette) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(markerPalette.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".markerPalette(%s);",  ((markerPalette != null) ? markerPalette.getJsBase() : "null")));
        return this;
    }


    /**
     * Setter for the gauge markers palette settings.
     */
    public ChartsLinearGauge setMarkerPalette(String markerPalette1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", wrapQuotes(markerPalette1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", wrapQuotes(markerPalette1)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the gauge markers palette settings.
     */
    public ChartsLinearGauge setMarkerPalette(MarkerType[] markerPalette2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette2)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the gauge markers palette settings.
     */
    public ChartsLinearGauge setMarkerPalette(String[] markerPalette3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToStringWrapQuotes(markerPalette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToStringWrapQuotes(markerPalette3)));
            js.setLength(0);
        }
        return this;
    }


    private RangeColors getPalette;

    /**
     * Getter for the gauge palette.
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

    /**
     * Setter for the gauge palette.
     */
    public ChartsLinearGauge setPalette(RangeColors palette) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(palette.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".palette(%s);",  ((palette != null) ? palette.getJsBase() : "null")));
        return this;
    }


    /**
     * Setter for the gauge palette.
     */
    public ChartsLinearGauge setPalette(DistinctColors palette1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(palette1.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".palette(%s);",  ((palette1 != null) ? palette1.getJsBase() : "null")));
        return this;
    }


    /**
     * Setter for the gauge palette.
     */
    public ChartsLinearGauge setPalette(String palette2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", wrapQuotes(palette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", wrapQuotes(palette2)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the gauge palette.
     */
    public ChartsLinearGauge setPalette(String[] palette3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(palette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(palette3)));
            js.setLength(0);
        }
        return this;
    }

    private Double dataIndex3;
    private List<PointersRangeBar> setRangeBar = new ArrayList<>();

    /**
     * Adds Range bar pointer.
     */
    public PointersRangeBar rangeBar(Double dataIndex3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar" + ++variableIndex + " = " + jsBase + ".rangeBar(%f);", dataIndex3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%f)", dataIndex3));
            js.setLength(0);
        }
        PointersRangeBar item = new PointersRangeBar("setRangeBar" + variableIndex);
        setRangeBar.add(item);
        return item;
    }
    private String generateJSsetRangeBar() {
        if (!setRangeBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PointersRangeBar item : setRangeBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double id2;
    private String id3;

    /**
     * Removes pointer by id.
     */
    public ChartsLinearGauge removePointer(Double id2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removePointer(%f)", id2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removePointer(%f)", id2));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Removes pointer by id.
     */
    public ChartsLinearGauge removePointer(String id3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removePointer(%s)", wrapQuotes(id3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removePointer(%s)", wrapQuotes(id3)));
            js.setLength(0);
        }
        return this;
    }

    private Double index3;

    /**
     * Removes pointer by index.
     */
    public ChartsLinearGauge removePointerAt(Double index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removePointerAt(%f)", index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removePointerAt(%f)", index3));
            js.setLength(0);
        }
        return this;
    }


    private ScalesBase getScale;

    /**
     * Getter for the gauge scale.
     */
    public ScalesBase getScale() {
        if (getScale == null)
            getScale = new ScalesBase(jsBase + ".scale()");

        return getScale;
    }
    private ScaleTypes scale;
    private String scale1;
    private ScalesBase scale2;
    private String scale3;

    /**
     * Setter for the gauge scale.
     */
    public ChartsLinearGauge setScale(ScaleTypes scale) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scale(%s)", ((scale != null) ? scale.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", ((scale != null) ? scale.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the gauge scale.
     */
    public ChartsLinearGauge setScale(String scale1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scale(%s)", wrapQuotes(scale1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", wrapQuotes(scale1)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the gauge scale.
     */
    public ChartsLinearGauge setScale(ScalesBase scale2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(scale2.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".scale(%s);",  ((scale2 != null) ? scale2.getJsBase() : "null")));
        return this;
    }


    private ScaleBar getScaleBar;

    /**
     * Getter for the scale bar.
     */
    public ScaleBar getScaleBar() {
        if (getScaleBar == null)
            getScaleBar = new ScaleBar(jsBase + ".scaleBar()");

        return getScaleBar;
    }

    private List<ScaleBar> getScaleBar1 = new ArrayList<>();

    /**
     * Getter for the scale bar.
     */
    public ScaleBar getScaleBar(Double index4) {
        ScaleBar item = new ScaleBar(jsBase + ".scaleBar("+ index4+")");
        getScaleBar1.add(item);
        return item;
    }
    private String scaleBar;
    private Boolean scaleBar1;

    /**
     * Setter for the scale bar.
     */
    public ChartsLinearGauge setScaleBar(String scaleBar) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scaleBar(%s)", wrapQuotes(scaleBar)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scaleBar(%s)", wrapQuotes(scaleBar)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the scale bar.
     */
    public ChartsLinearGauge setScaleBar(Boolean scaleBar1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scaleBar(%b)", scaleBar1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scaleBar(%b)", scaleBar1));
            js.setLength(0);
        }
        return this;
    }

    private Double index5;
    private String scaleBar2;
    private Boolean scaleBar3;

    /**
     * Setter for the scale bar by index.
     */
    public ChartsLinearGauge setScaleBar(String scaleBar2, Double index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scaleBar(%s, %f)", wrapQuotes(scaleBar2), index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scaleBar(%s, %f)", wrapQuotes(scaleBar2), index5));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the scale bar by index.
     */
    public ChartsLinearGauge setScaleBar(Boolean scaleBar3, Double index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scaleBar(%b, %f)", scaleBar3, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scaleBar(%b, %f)", scaleBar3, index5));
            js.setLength(0);
        }
        return this;
    }

    private Double dataIndex4;
    private List<Tank> setTank = new ArrayList<>();

    /**
     * Adds Tank pointer.
     */
    public Tank tank(Double dataIndex4) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setTank" + ++variableIndex + " = " + jsBase + ".tank(%f);", dataIndex4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".tank(%f)", dataIndex4));
            js.setLength(0);
        }
        Tank item = new Tank("setTank" + variableIndex);
        setTank.add(item);
        return item;
    }
    private String generateJSsetTank() {
        if (!setTank.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tank item : setTank) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double dataIndex5;
    private List<Thermometer> setThermometer = new ArrayList<>();

    /**
     * Adds Thermometer pointer.
     */
    public Thermometer thermometer(Double dataIndex5) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setThermometer" + ++variableIndex + " = " + jsBase + ".thermometer(%f);", dataIndex5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".thermometer(%f)", dataIndex5));
            js.setLength(0);
        }
        Thermometer item = new Thermometer("setThermometer" + variableIndex);
        setThermometer.add(item);
        return item;
    }
    private String generateJSsetThermometer() {
        if (!setThermometer.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Thermometer item : setThermometer) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetAxis() {
        if (getAxis != null) {
            return getAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetAxis1() {
        if (!getAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AxesLinearGauge item : getAxis1) {
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

    private String generateJSgetHatchFillPalette() {
        if (getHatchFillPalette != null) {
            return getHatchFillPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkerPalette() {
        if (getMarkerPalette != null) {
            return getMarkerPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetPalette() {
        if (getPalette != null) {
            return getPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
        }
        return "";
    }

    private String generateJSgetScaleBar() {
        if (getScaleBar != null) {
            return getScaleBar.generateJs();
        }
        return "";
    }

    private String generateJSgetScaleBar1() {
        if (!getScaleBar1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScaleBar item : getScaleBar1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetAxis());
        js.append(generateJSgetAxis1());
        js.append(generateJSgetData());
        js.append(generateJSgetHatchFillPalette());
        js.append(generateJSgetMarkerPalette());
        js.append(generateJSgetPalette());
        js.append(generateJSgetScale());
        js.append(generateJSgetScaleBar());
        js.append(generateJSgetScaleBar1());
        js.append(generateJSsetBar());
        js.append(generateJSsetGetPointer());
        js.append(generateJSsetGetPointer1());
        js.append(generateJSsetGetPointerAt());
        js.append(generateJSsetLed());
        js.append(generateJSsetMarker());
        js.append(generateJSsetRangeBar());
        js.append(generateJSsetTank());
        js.append(generateJSsetThermometer());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}