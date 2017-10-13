package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class Bullet extends Chart {

    public Bullet() {
        js.append("chart = anychart.bullet();");
        jsBase = "chart";
    }

    
    private CoreAxesLinear getAxis;

    public CoreAxesLinear getAxis() {
        if (getAxis == null)
            getAxis = new CoreAxesLinear(jsBase + ".axis()");

        return getAxis;
    }

    private String axis;
    private Boolean axis1;
    private List<Bullet> setAxis = new ArrayList<>();

    public Bullet setAxis(String axis) {
        this.axis = axis;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%s)", axis));

//        js.append(String.format(Locale.US, ".axis(%s)", axis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%s)", axis));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAxis() {
        if (!setAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setAxis1 = new ArrayList<>();

    public Bullet setAxis(Boolean axis1) {
        this.axis1 = axis1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%b)", axis1));

//        js.append(String.format(Locale.US, ".axis(%b)", axis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%b)", axis1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAxis1() {
        if (!setAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setAxis1) {
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
    private List<Bullet> setData = new ArrayList<>();

    public Bullet setData(View data, TextParsingMode csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setData1 = new ArrayList<>();

    public Bullet setData(View data, TextParsingSettings csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setData2 = new ArrayList<>();

    public Bullet setData(Set data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setData3 = new ArrayList<>();

    public Bullet setData(Set data1, TextParsingSettings csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData3() {
        if (!setData3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setData4 = new ArrayList<>();

    public Bullet setData(String[] data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData4() {
        if (!setData4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setData4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setData5 = new ArrayList<>();

    public Bullet setData(String[] data2, TextParsingSettings csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData5() {
        if (!setData5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setData5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setData6 = new ArrayList<>();

    public Bullet setData(String data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData6() {
        if (!setData6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setData6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setData7 = new ArrayList<>();

    public Bullet setData(String data3, TextParsingSettings csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData7() {
        if (!setData7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setData7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String layout;
    private Layout layout1;
    private List<Bullet> setLayout = new ArrayList<>();

    public Bullet setLayout(String layout) {
        this.layout = layout;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".layout(%s)", layout));

//        js.append(String.format(Locale.US, ".layout(%s)", layout));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", layout));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLayout() {
        if (!setLayout.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setLayout) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setLayout1 = new ArrayList<>();

    public Bullet setLayout(Layout layout1) {
        this.layout1 = layout1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".layout(%s)", (layout1 != null) ? layout1.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".layout(%s)", (layout1 != null) ? layout1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", (layout1 != null) ? layout1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLayout1() {
        if (!setLayout1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setLayout1) {
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

    private MarkerType[] markerPalette;
    private String markerPalette1;
    private Markers markerPalette2;
    private List<Bullet> setMarkerPalette = new ArrayList<>();

    public Bullet setMarkerPalette(MarkerType[] markerPalette) {
        this.markerPalette = markerPalette;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette)));

//        js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette() {
        if (!setMarkerPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setMarkerPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setMarkerPalette1 = new ArrayList<>();

    public Bullet setMarkerPalette(String markerPalette1) {
        this.markerPalette1 = markerPalette1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", markerPalette1));

//        js.append(String.format(Locale.US, ".markerPalette(%s)", markerPalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", markerPalette1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette1() {
        if (!setMarkerPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setMarkerPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setMarkerPalette2 = new ArrayList<>();

    public Bullet setMarkerPalette(Markers markerPalette2) {
        this.markerPalette2 = markerPalette2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", (markerPalette2 != null) ? markerPalette2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".markerPalette(%s)", (markerPalette2 != null) ? markerPalette2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", (markerPalette2 != null) ? markerPalette2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette2() {
        if (!setMarkerPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setMarkerPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private CoreAxismarkersRange getRange;

    public CoreAxismarkersRange getRange() {
        if (getRange == null)
            getRange = new CoreAxismarkersRange(jsBase + ".range()");

        return getRange;
    }

    private CoreAxismarkersRange getRange1;

    public CoreAxismarkersRange getRange(Double index) {
        if (getRange1 == null)
            getRange1 = new CoreAxismarkersRange(jsBase + ".range("+ index+")");

        return getRange1;
    }

    private String range;
    private Boolean range1;
    private List<Bullet> setRange = new ArrayList<>();

    public Bullet setRange(String range) {
        this.range = range;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%s)", range));

//        js.append(String.format(Locale.US, ".range(%s)", range));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%s)", range));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRange() {
        if (!setRange.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRange) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setRange1 = new ArrayList<>();

    public Bullet setRange(Boolean range1) {
        this.range1 = range1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%b)", range1));

//        js.append(String.format(Locale.US, ".range(%b)", range1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%b)", range1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRange1() {
        if (!setRange1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRange1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private String range2;
    private Boolean range3;
    private List<Bullet> setRange2 = new ArrayList<>();

    public Bullet setRange(String range2, Double index1) {
        this.range2 = range2;
        this.index1 = index1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%s, %f)", range2, index1));

//        js.append(String.format(Locale.US, ".range(%s, %f)", range2, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%s, %f)", range2, index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRange2() {
        if (!setRange2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRange2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setRange3 = new ArrayList<>();

    public Bullet setRange(Boolean range3, Double index1) {
        this.range3 = range3;
        this.index1 = index1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%b, %f)", range3, index1));

//        js.append(String.format(Locale.US, ".range(%b, %f)", range3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%b, %f)", range3, index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRange3() {
        if (!setRange3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRange3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private DistinctColors getRangePalette;

    public DistinctColors getRangePalette() {
        if (getRangePalette == null)
            getRangePalette = new DistinctColors(jsBase + ".rangePalette()");

        return getRangePalette;
    }

    private DistinctColors rangePalette;
    private String rangePalette1;
    private String[] rangePalette2;
    private List<Bullet> setRangePalette = new ArrayList<>();

    public Bullet setRangePalette(DistinctColors rangePalette) {
        this.rangePalette = rangePalette;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangePalette(%s)", (rangePalette != null) ? rangePalette.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".rangePalette(%s)", (rangePalette != null) ? rangePalette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangePalette(%s)", (rangePalette != null) ? rangePalette.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangePalette() {
        if (!setRangePalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRangePalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setRangePalette1 = new ArrayList<>();

    public Bullet setRangePalette(String rangePalette1) {
        this.rangePalette1 = rangePalette1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangePalette(%s)", rangePalette1));

//        js.append(String.format(Locale.US, ".rangePalette(%s)", rangePalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangePalette(%s)", rangePalette1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangePalette1() {
        if (!setRangePalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRangePalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setRangePalette2 = new ArrayList<>();

    public Bullet setRangePalette(String[] rangePalette2) {
        this.rangePalette2 = rangePalette2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangePalette(%s)", Arrays.toString(rangePalette2)));

//        js.append(String.format(Locale.US, ".rangePalette(%s)", Arrays.toString(rangePalette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangePalette(%s)", Arrays.toString(rangePalette2)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangePalette2() {
        if (!setRangePalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRangePalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScalesBase getScale;

    public ScalesBase getScale() {
        if (getScale == null)
            getScale = new ScalesBase(jsBase + ".scale()");

        return getScale;
    }

    private ScalesBase scale;
    private String scale1;
    private ScaleTypes scale2;
    private String scale3;
    private List<Bullet> setScale = new ArrayList<>();

    public Bullet setScale(ScalesBase scale) {
        this.scale = scale;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scale(%s)", (scale != null) ? scale.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".scale(%s)", (scale != null) ? scale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", (scale != null) ? scale.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScale() {
        if (!setScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setScale1 = new ArrayList<>();

    public Bullet setScale(String scale1) {
        this.scale1 = scale1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scale(%s)", scale1));

//        js.append(String.format(Locale.US, ".scale(%s)", scale1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", scale1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScale1() {
        if (!setScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setScale2 = new ArrayList<>();

    public Bullet setScale(ScaleTypes scale2) {
        this.scale2 = scale2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scale(%s)", (scale2 != null) ? scale2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".scale(%s)", (scale2 != null) ? scale2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", (scale2 != null) ? scale2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScale2() {
        if (!setScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setScale2) {
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

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkerPalette() {
        if (getMarkerPalette != null) {
            return getMarkerPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetRange() {
        if (getRange != null) {
            return getRange.generateJs();
        }
        return "";
    }

    private String generateJSgetRange1() {
        if (getRange1 != null) {
            return getRange1.generateJs();
        }
        return "";
    }

    private String generateJSgetRangePalette() {
        if (getRangePalette != null) {
            return getRangePalette.generateJs();
        }
        return "";
    }

    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
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
        js.append(generateJSgetData());
        js.append(generateJSgetMarkerPalette());
        js.append(generateJSgetRange());
        js.append(generateJSgetRange1());
        js.append(generateJSgetRangePalette());
        js.append(generateJSgetScale());
        js.append(generateJSsetAxis());
        js.append(generateJSsetAxis1());
        js.append(generateJSsetData());
        js.append(generateJSsetData1());
        js.append(generateJSsetData2());
        js.append(generateJSsetData3());
        js.append(generateJSsetData4());
        js.append(generateJSsetData5());
        js.append(generateJSsetData6());
        js.append(generateJSsetData7());
        js.append(generateJSsetLayout());
        js.append(generateJSsetLayout1());
        js.append(generateJSsetMarkerPalette());
        js.append(generateJSsetMarkerPalette1());
        js.append(generateJSsetMarkerPalette2());
        js.append(generateJSsetRange());
        js.append(generateJSsetRange1());
        js.append(generateJSsetRange2());
        js.append(generateJSsetRange3());
        js.append(generateJSsetRangePalette());
        js.append(generateJSsetRangePalette1());
        js.append(generateJSsetRangePalette2());
        js.append(generateJSsetScale());
        js.append(generateJSsetScale1());
        js.append(generateJSsetScale2());

        js.append(super.generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}