package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class ChartsLinearGauge extends SeparateChart {

    public ChartsLinearGauge() {
        js.append("chart = anychart.linearGauge();");
        jsBase = "chart";
    }

    
    private Double var_args;

    public void addPointer(Double var_args) {
        this.var_args = var_args;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".addPointer(%f);", var_args));

//        js.append(String.format(Locale.US, jsBase + ".addPointer(%f);", var_args));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".addPointer(%f)", var_args));
            js.setLength(0);
        }
    }

    private AxesLinearGauge getAxis;

    public AxesLinearGauge getAxis() {
        if (getAxis == null)
            getAxis = new AxesLinearGauge(jsBase + ".axis()");

        return getAxis;
    }

    private AxesLinearGauge getAxis1;

    public AxesLinearGauge getAxis(Double index) {
        if (getAxis1 == null)
            getAxis1 = new AxesLinearGauge(jsBase + ".axis("+ index+")");

        return getAxis1;
    }

    private String axis;
    private Boolean axis1;

    public void setAxis(String axis) {
        this.axis = axis;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".axis(%s);", axis));

//        js.append(String.format(Locale.US, jsBase + ".axis(%s);", axis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".axis(%s)", axis));
            js.setLength(0);
        }
    }


    public void setAxis(Boolean axis1) {
        this.axis1 = axis1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".axis(%b);", axis1));

//        js.append(String.format(Locale.US, jsBase + ".axis(%b);", axis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".axis(%b)", axis1));
            js.setLength(0);
        }
    }

    private Double index1;
    private String axis2;
    private Boolean axis3;

    public void setAxis(String axis2, Double index1) {
        this.axis2 = axis2;
        this.index1 = index1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".axis(%s, %f);", axis2, index1));

//        js.append(String.format(Locale.US, jsBase + ".axis(%s, %f);", axis2, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".axis(%s, %f)", axis2, index1));
            js.setLength(0);
        }
    }


    public void setAxis(Boolean axis3, Double index1) {
        this.axis3 = axis3;
        this.index1 = index1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".axis(%b, %f);", axis3, index1));

//        js.append(String.format(Locale.US, jsBase + ".axis(%b, %f);", axis3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".axis(%b, %f)", axis3, index1));
            js.setLength(0);
        }
    }

    private Double dataIndex;
    private List<LineargaugePointersBar> setBar = new ArrayList<>();

    public LineargaugePointersBar bar(Double dataIndex) {
        this.dataIndex = dataIndex;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar" + ++variableIndex + " = " + jsBase + ".bar(%f);", dataIndex));

//        js.append(String.format(Locale.US, jsBase + ".bar(%f);", dataIndex));

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

    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }

    private View data;
    private Set data1;
    private String[] data2;
    private String data3;
    private TextParsingMode csvSettings;
    private TextParsingSettings csvSettings1;

    public void setData(View data, TextParsingMode csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(View data, TextParsingSettings csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(Set data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(Set data1, TextParsingSettings csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String[] data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".data(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s)", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String[] data2, TextParsingSettings csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".data(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s)", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".data(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s)", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String data3, TextParsingSettings csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".data(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s)", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String defaultPointerType;
    private LinearGaugePointerType defaultPointerType1;

    public void setDefaultPointerType(String defaultPointerType) {
        this.defaultPointerType = defaultPointerType;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".defaultPointerType(%s);", defaultPointerType));

//        js.append(String.format(Locale.US, jsBase + ".defaultPointerType(%s);", defaultPointerType));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".defaultPointerType(%s)", defaultPointerType));
            js.setLength(0);
        }
    }


    public void setDefaultPointerType(LinearGaugePointerType defaultPointerType1) {
        this.defaultPointerType1 = defaultPointerType1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".defaultPointerType(%s);", (defaultPointerType1 != null) ? defaultPointerType1.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".defaultPointerType(%s);", (defaultPointerType1 != null) ? defaultPointerType1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".defaultPointerType(%s)", (defaultPointerType1 != null) ? defaultPointerType1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double id;
    private String id1;
    private List<LineargaugePointersBase> setGetPointer = new ArrayList<>();

    public LineargaugePointersBase getPointer(Double id) {
        this.id = id;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setGetPointer" + ++variableIndex + " = " + jsBase + ".getPointer(%f);", id));

//        js.append(String.format(Locale.US, jsBase + ".getPointer(%f);", id));

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

    public LineargaugePointersBase getPointer(String id1) {
        this.id1 = id1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setGetPointer1" + ++variableIndex + " = " + jsBase + ".getPointer(%s);", id1));

//        js.append(String.format(Locale.US, jsBase + ".getPointer(%s);", id1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPointer(%s)", id1));
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

    public LineargaugePointersBase getPointerAt(Double index2) {
        this.index2 = index2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setGetPointerAt" + ++variableIndex + " = " + jsBase + ".getPointerAt(%f);", index2));

//        js.append(String.format(Locale.US, jsBase + ".getPointerAt(%f);", index2));

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

    public void setGlobalOffset(String globalOffset) {
        this.globalOffset = globalOffset;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".globalOffset(%s);", globalOffset));

//        js.append(String.format(Locale.US, jsBase + ".globalOffset(%s);", globalOffset));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".globalOffset(%s)", globalOffset));
            js.setLength(0);
        }
    }


    public void setGlobalOffset(Double globalOffset1) {
        this.globalOffset1 = globalOffset1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".globalOffset(%f);", globalOffset1));

//        js.append(String.format(Locale.US, jsBase + ".globalOffset(%f);", globalOffset1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".globalOffset(%f)", globalOffset1));
            js.setLength(0);
        }
    }

    private HatchFills getHatchFillPalette;

    public HatchFills getHatchFillPalette() {
        if (getHatchFillPalette == null)
            getHatchFillPalette = new HatchFills(jsBase + ".hatchFillPalette()");

        return getHatchFillPalette;
    }

    private HatchFillType[] hatchFillPalette;
    private String hatchFillPalette1;
    private HatchFills hatchFillPalette2;

    public void setHatchFillPalette(HatchFillType[] hatchFillPalette) {
        this.hatchFillPalette = hatchFillPalette;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".hatchFillPalette(%s);", arrayToString(hatchFillPalette)));

//        js.append(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", arrayToString(hatchFillPalette)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFillPalette(%s)", arrayToString(hatchFillPalette)));
            js.setLength(0);
        }
    }


    public void setHatchFillPalette(String hatchFillPalette1) {
        this.hatchFillPalette1 = hatchFillPalette1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".hatchFillPalette(%s);", hatchFillPalette1));

//        js.append(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", hatchFillPalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFillPalette(%s)", hatchFillPalette1));
            js.setLength(0);
        }
    }


    public void setHatchFillPalette(HatchFills hatchFillPalette2) {
        this.hatchFillPalette2 = hatchFillPalette2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".hatchFillPalette(%s);", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFillPalette(%s)", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean isVertical;

    public void setIsVertical(Boolean isVertical) {
        this.isVertical = isVertical;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".isVertical(%b);", isVertical));

//        js.append(String.format(Locale.US, jsBase + ".isVertical(%b);", isVertical));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".isVertical(%b)", isVertical));
            js.setLength(0);
        }
    }

    private String layout;
    private Layout layout1;

    public void setLayout(String layout) {
        this.layout = layout;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".layout(%s);", layout));

//        js.append(String.format(Locale.US, jsBase + ".layout(%s);", layout));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".layout(%s)", layout));
            js.setLength(0);
        }
    }


    public void setLayout(Layout layout1) {
        this.layout1 = layout1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".layout(%s);", (layout1 != null) ? layout1.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".layout(%s);", (layout1 != null) ? layout1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".layout(%s)", (layout1 != null) ? layout1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double dataIndex1;
    private List<Led> setLed = new ArrayList<>();

    public Led led(Double dataIndex1) {
        this.dataIndex1 = dataIndex1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLed" + ++variableIndex + " = " + jsBase + ".led(%f);", dataIndex1));

//        js.append(String.format(Locale.US, jsBase + ".led(%f);", dataIndex1));

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

    public LineargaugePointersMarker marker(Double dataIndex2) {
        this.dataIndex2 = dataIndex2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker" + ++variableIndex + " = " + jsBase + ".marker(%f);", dataIndex2));

//        js.append(String.format(Locale.US, jsBase + ".marker(%f);", dataIndex2));

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

    public Markers getMarkerPalette() {
        if (getMarkerPalette == null)
            getMarkerPalette = new Markers(jsBase + ".markerPalette()");

        return getMarkerPalette;
    }

    private Markers markerPalette;
    private String markerPalette1;
    private MarkerType[] markerPalette2;

    public void setMarkerPalette(Markers markerPalette) {
        this.markerPalette = markerPalette;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".markerPalette(%s);", (markerPalette != null) ? markerPalette.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".markerPalette(%s);", (markerPalette != null) ? markerPalette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".markerPalette(%s)", (markerPalette != null) ? markerPalette.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarkerPalette(String markerPalette1) {
        this.markerPalette1 = markerPalette1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".markerPalette(%s);", markerPalette1));

//        js.append(String.format(Locale.US, jsBase + ".markerPalette(%s);", markerPalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".markerPalette(%s)", markerPalette1));
            js.setLength(0);
        }
    }


    public void setMarkerPalette(MarkerType[] markerPalette2) {
        this.markerPalette2 = markerPalette2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".markerPalette(%s);", arrayToString(markerPalette2)));

//        js.append(String.format(Locale.US, jsBase + ".markerPalette(%s);", arrayToString(markerPalette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".markerPalette(%s)", arrayToString(markerPalette2)));
            js.setLength(0);
        }
    }

    private RangeColors getPalette;

    public RangeColors getPalette() {
        if (getPalette == null)
            getPalette = new RangeColors(jsBase + ".palette()");

        return getPalette;
    }

    private RangeColors palette;
    private DistinctColors palette1;
    private String palette2;
    private String[] palette3;

    public void setPalette(RangeColors palette) {
        this.palette = palette;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".palette(%s);", (palette != null) ? palette.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".palette(%s);", (palette != null) ? palette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s)", (palette != null) ? palette.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setPalette(DistinctColors palette1) {
        this.palette1 = palette1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".palette(%s);", (palette1 != null) ? palette1.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".palette(%s);", (palette1 != null) ? palette1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s)", (palette1 != null) ? palette1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setPalette(String palette2) {
        this.palette2 = palette2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".palette(%s);", palette2));

//        js.append(String.format(Locale.US, jsBase + ".palette(%s);", palette2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s)", palette2));
            js.setLength(0);
        }
    }


    public void setPalette(String[] palette3) {
        this.palette3 = palette3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".palette(%s);", Arrays.toString(palette3)));

//        js.append(String.format(Locale.US, jsBase + ".palette(%s);", Arrays.toString(palette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s)", Arrays.toString(palette3)));
            js.setLength(0);
        }
    }

    private Double dataIndex3;
    private List<PointersRangeBar> setRangeBar = new ArrayList<>();

    public PointersRangeBar rangeBar(Double dataIndex3) {
        this.dataIndex3 = dataIndex3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar" + ++variableIndex + " = " + jsBase + ".rangeBar(%f);", dataIndex3));

//        js.append(String.format(Locale.US, jsBase + ".rangeBar(%f);", dataIndex3));

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

    public void removePointer(Double id2) {
        this.id2 = id2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".removePointer(%f);", id2));

//        js.append(String.format(Locale.US, jsBase + ".removePointer(%f);", id2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".removePointer(%f)", id2));
            js.setLength(0);
        }
    }


    public void removePointer(String id3) {
        this.id3 = id3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".removePointer(%s);", id3));

//        js.append(String.format(Locale.US, jsBase + ".removePointer(%s);", id3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".removePointer(%s)", id3));
            js.setLength(0);
        }
    }

    private Double index3;

    public void removePointerAt(Double index3) {
        this.index3 = index3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".removePointerAt(%f);", index3));

//        js.append(String.format(Locale.US, jsBase + ".removePointerAt(%f);", index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".removePointerAt(%f)", index3));
            js.setLength(0);
        }
    }

    private ScalesBase getScale;

    public ScalesBase getScale() {
        if (getScale == null)
            getScale = new ScalesBase(jsBase + ".scale()");

        return getScale;
    }

    private ScaleTypes scale;
    private String scale1;
    private ScalesBase scale2;
    private String scale3;

    public void setScale(ScaleTypes scale) {
        this.scale = scale;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".scale(%s);", (scale != null) ? scale.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".scale(%s);", (scale != null) ? scale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s)", (scale != null) ? scale.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setScale(String scale1) {
        this.scale1 = scale1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".scale(%s);", scale1));

//        js.append(String.format(Locale.US, jsBase + ".scale(%s);", scale1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s)", scale1));
            js.setLength(0);
        }
    }


    public void setScale(ScalesBase scale2) {
        this.scale2 = scale2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".scale(%s);", (scale2 != null) ? scale2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".scale(%s);", (scale2 != null) ? scale2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s)", (scale2 != null) ? scale2.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private ScaleBar getScaleBar;

    public ScaleBar getScaleBar() {
        if (getScaleBar == null)
            getScaleBar = new ScaleBar(jsBase + ".scaleBar()");

        return getScaleBar;
    }

    private ScaleBar getScaleBar1;

    public ScaleBar getScaleBar(Double index4) {
        if (getScaleBar1 == null)
            getScaleBar1 = new ScaleBar(jsBase + ".scaleBar("+ index4+")");

        return getScaleBar1;
    }

    private String scaleBar;
    private Boolean scaleBar1;

    public void setScaleBar(String scaleBar) {
        this.scaleBar = scaleBar;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".scaleBar(%s);", scaleBar));

//        js.append(String.format(Locale.US, jsBase + ".scaleBar(%s);", scaleBar));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".scaleBar(%s)", scaleBar));
            js.setLength(0);
        }
    }


    public void setScaleBar(Boolean scaleBar1) {
        this.scaleBar1 = scaleBar1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".scaleBar(%b);", scaleBar1));

//        js.append(String.format(Locale.US, jsBase + ".scaleBar(%b);", scaleBar1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".scaleBar(%b)", scaleBar1));
            js.setLength(0);
        }
    }

    private Double index5;
    private String scaleBar2;
    private Boolean scaleBar3;

    public void setScaleBar(String scaleBar2, Double index5) {
        this.scaleBar2 = scaleBar2;
        this.index5 = index5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".scaleBar(%s, %f);", scaleBar2, index5));

//        js.append(String.format(Locale.US, jsBase + ".scaleBar(%s, %f);", scaleBar2, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".scaleBar(%s, %f)", scaleBar2, index5));
            js.setLength(0);
        }
    }


    public void setScaleBar(Boolean scaleBar3, Double index5) {
        this.scaleBar3 = scaleBar3;
        this.index5 = index5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".scaleBar(%b, %f);", scaleBar3, index5));

//        js.append(String.format(Locale.US, jsBase + ".scaleBar(%b, %f);", scaleBar3, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".scaleBar(%b, %f)", scaleBar3, index5));
            js.setLength(0);
        }
    }

    private Double dataIndex4;
    private List<Tank> setTank = new ArrayList<>();

    public Tank tank(Double dataIndex4) {
        this.dataIndex4 = dataIndex4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setTank" + ++variableIndex + " = " + jsBase + ".tank(%f);", dataIndex4));

//        js.append(String.format(Locale.US, jsBase + ".tank(%f);", dataIndex4));

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

    public Thermometer thermometer(Double dataIndex5) {
        this.dataIndex5 = dataIndex5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setThermometer" + ++variableIndex + " = " + jsBase + ".thermometer(%f);", dataIndex5));

//        js.append(String.format(Locale.US, jsBase + ".thermometer(%f);", dataIndex5));

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
        if (getAxis1 != null) {
            return getAxis1.generateJs();
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
        if (getScaleBar1 != null) {
            return getScaleBar1.generateJs();
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

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}