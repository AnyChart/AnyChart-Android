package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class Pyramid extends SeparateChart {

    protected Pyramid(String name) {
        super(name);

        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    
    private String baseWidth;
    private Double baseWidth1;
    private List<Pyramid> setBaseWidth = new ArrayList<>();

    public Pyramid setBaseWidth(String baseWidth) {
        this.baseWidth = baseWidth;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".baseWidth(%s)", baseWidth));

//        js.append(String.format(Locale.US, ".baseWidth(%s)", baseWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".baseWidth(%s)", baseWidth));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetBaseWidth() {
        if (!setBaseWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setBaseWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setBaseWidth1 = new ArrayList<>();

    public Pyramid setBaseWidth(Double baseWidth1) {
        this.baseWidth1 = baseWidth1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".baseWidth(%f)", baseWidth1));

//        js.append(String.format(Locale.US, ".baseWidth(%f)", baseWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".baseWidth(%f)", baseWidth1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetBaseWidth1() {
        if (!setBaseWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setBaseWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double connectorLength;
    private String connectorLength1;
    private List<Pyramid> setConnectorLength = new ArrayList<>();

    public Pyramid setConnectorLength(Double connectorLength) {
        this.connectorLength = connectorLength;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".connectorLength(%f)", connectorLength));

//        js.append(String.format(Locale.US, ".connectorLength(%f)", connectorLength));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".connectorLength(%f)", connectorLength));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetConnectorLength() {
        if (!setConnectorLength.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setConnectorLength) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setConnectorLength1 = new ArrayList<>();

    public Pyramid setConnectorLength(String connectorLength1) {
        this.connectorLength1 = connectorLength1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".connectorLength(%s)", connectorLength1));

//        js.append(String.format(Locale.US, ".connectorLength(%s)", connectorLength1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".connectorLength(%s)", connectorLength1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetConnectorLength1() {
        if (!setConnectorLength1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setConnectorLength1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke connectorStroke;
    private ColoredFill connectorStroke1;
    private String connectorStroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<Pyramid> setConnectorStroke = new ArrayList<>();

    public Pyramid setConnectorStroke(Stroke connectorStroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.connectorStroke = connectorStroke;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", (connectorStroke != null) ? connectorStroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", (connectorStroke != null) ? connectorStroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", (connectorStroke != null) ? connectorStroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetConnectorStroke() {
        if (!setConnectorStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setConnectorStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setConnectorStroke1 = new ArrayList<>();

    public Pyramid setConnectorStroke(ColoredFill connectorStroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.connectorStroke1 = connectorStroke1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", (connectorStroke1 != null) ? connectorStroke1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", (connectorStroke1 != null) ? connectorStroke1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", (connectorStroke1 != null) ? connectorStroke1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetConnectorStroke1() {
        if (!setConnectorStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setConnectorStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setConnectorStroke2 = new ArrayList<>();

    public Pyramid setConnectorStroke(String connectorStroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.connectorStroke2 = connectorStroke2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", connectorStroke2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", connectorStroke2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".connectorStroke(%s, %f, %s, %s, %s)", connectorStroke2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetConnectorStroke2() {
        if (!setConnectorStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setConnectorStroke2) {
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
    private Mapping data1;
    private Set data2;
    private String[] data3;
    private String data4;
    private DataSettings data5;
    private TextParsingMode csvSettings;
    private String csvSettings1;
    private TextParsingSettings csvSettings2;
    private List<Pyramid> setData = new ArrayList<>();

    public Pyramid setData(View data, TextParsingMode csvSettings) {
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
            for (Pyramid item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData1 = new ArrayList<>();

    public Pyramid setData(View data, String csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", csvSettings1));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData2 = new ArrayList<>();

    public Pyramid setData(View data, TextParsingSettings csvSettings2) {
        this.data = data;
        this.csvSettings2 = csvSettings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData3 = new ArrayList<>();

    public Pyramid setData(Mapping data1, TextParsingMode csvSettings) {
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
    private String generateJSsetData3() {
        if (!setData3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData4 = new ArrayList<>();

    public Pyramid setData(Mapping data1, String csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", csvSettings1));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData4() {
        if (!setData4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData5 = new ArrayList<>();

    public Pyramid setData(Mapping data1, TextParsingSettings csvSettings2) {
        this.data1 = data1;
        this.csvSettings2 = csvSettings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData5() {
        if (!setData5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData6 = new ArrayList<>();

    public Pyramid setData(Set data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data2 != null) ? data2.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data2 != null) ? data2.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data2 != null) ? data2.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData6() {
        if (!setData6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData7 = new ArrayList<>();

    public Pyramid setData(Set data2, String csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data2 != null) ? data2.generateJs() : "null", csvSettings1));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data2 != null) ? data2.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data2 != null) ? data2.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData7() {
        if (!setData7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData8 = new ArrayList<>();

    public Pyramid setData(Set data2, TextParsingSettings csvSettings2) {
        this.data2 = data2;
        this.csvSettings2 = csvSettings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data2 != null) ? data2.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data2 != null) ? data2.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data2 != null) ? data2.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData8() {
        if (!setData8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData9 = new ArrayList<>();

    public Pyramid setData(String[] data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data3), (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data3), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data3), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData9() {
        if (!setData9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData10 = new ArrayList<>();

    public Pyramid setData(String[] data3, String csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data3), csvSettings1));

//        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data3), csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data3), csvSettings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData10() {
        if (!setData10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData11 = new ArrayList<>();

    public Pyramid setData(String[] data3, TextParsingSettings csvSettings2) {
        this.data3 = data3;
        this.csvSettings2 = csvSettings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data3), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data3), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data3), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData11() {
        if (!setData11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData12 = new ArrayList<>();

    public Pyramid setData(String data4, TextParsingMode csvSettings) {
        this.data4 = data4;
        this.csvSettings = csvSettings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data4, (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", data4, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data4, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData12() {
        if (!setData12.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData12) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData13 = new ArrayList<>();

    public Pyramid setData(String data4, String csvSettings1) {
        this.data4 = data4;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data4, csvSettings1));

//        js.append(String.format(Locale.US, ".data(%s, %s)", data4, csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data4, csvSettings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData13() {
        if (!setData13.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData13) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData14 = new ArrayList<>();

    public Pyramid setData(String data4, TextParsingSettings csvSettings2) {
        this.data4 = data4;
        this.csvSettings2 = csvSettings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data4, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", data4, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data4, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData14() {
        if (!setData14.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData14) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData15 = new ArrayList<>();

    public Pyramid setData(DataSettings data5, TextParsingMode csvSettings) {
        this.data5 = data5;
        this.csvSettings = csvSettings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data5 != null) ? data5.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data5 != null) ? data5.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data5 != null) ? data5.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData15() {
        if (!setData15.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData15) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData16 = new ArrayList<>();

    public Pyramid setData(DataSettings data5, String csvSettings1) {
        this.data5 = data5;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data5 != null) ? data5.generateJs() : "null", csvSettings1));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data5 != null) ? data5.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data5 != null) ? data5.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData16() {
        if (!setData16.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData16) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setData17 = new ArrayList<>();

    public Pyramid setData(DataSettings data5, TextParsingSettings csvSettings2) {
        this.data5 = data5;
        this.csvSettings2 = csvSettings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data5 != null) ? data5.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data5 != null) ? data5.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data5 != null) ? data5.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData17() {
        if (!setData17.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setData17) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private List<Pyramid> setFill = new ArrayList<>();

    public Pyramid setFill(Fill fill) {
        this.fill = fill;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s)", (fill != null) ? fill.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".fill(%s)", (fill != null) ? fill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", (fill != null) ? fill.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill() {
        if (!setFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill1;
    private String color;
    private Double opacity;
    private List<Pyramid> setFill1 = new ArrayList<>();

    public Pyramid fill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %f)", color, opacity));

//        js.append(String.format(Locale.US, ".fill(%s, %f)", color, opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f)", color, opacity));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill1() {
        if (!setFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setFill1) {
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
    private List<Pyramid> setFill2 = new ArrayList<>();

    public Pyramid fill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

//        js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setFill3 = new ArrayList<>();

    public Pyramid fill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

//        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setFill4 = new ArrayList<>();

    public Pyramid fill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));

//        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setFill5 = new ArrayList<>();

    public Pyramid fill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));

//        js.append(String.format(Locale.US, ".fill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setFill6 = new ArrayList<>();

    public Pyramid fill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

//        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setFill7 = new ArrayList<>();

    public Pyramid fill(String[] keys1, String mode2, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));

//        js.append(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setFill7) {
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
    private List<Pyramid> setFill8 = new ArrayList<>();

    public Pyramid fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
        js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

//        js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setFill9 = new ArrayList<>();

    public Pyramid fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
        js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

//        js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;

    private PatternFill getHatchFill;

    public PatternFill getHatchFill() {
        if (getHatchFill == null)
            getHatchFill = new PatternFill(jsBase + ".hatchFill()");

        return getHatchFill;
    }
    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private Boolean patternFillOrType4;
    private String color1;
    private Double thickness1;
    private Double size;
    private List<Pyramid> setHatchFill = new ArrayList<>();

    public Pyramid setHatchFill(PatternFill patternFillOrType, String color1, Double thickness1, Double size) {
        this.patternFillOrType = patternFillOrType;
        this.color1 = color1;
        this.thickness1 = thickness1;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness1, size));

//        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness1, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness1, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill() {
        if (!setHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setHatchFill1 = new ArrayList<>();

    public Pyramid setHatchFill(HatchFill patternFillOrType1, String color1, Double thickness1, Double size) {
        this.patternFillOrType1 = patternFillOrType1;
        this.color1 = color1;
        this.thickness1 = thickness1;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness1, size));

//        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness1, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness1, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill1() {
        if (!setHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setHatchFill2 = new ArrayList<>();

    public Pyramid setHatchFill(HatchFillType patternFillOrType2, String color1, Double thickness1, Double size) {
        this.patternFillOrType2 = patternFillOrType2;
        this.color1 = color1;
        this.thickness1 = thickness1;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness1, size));

//        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness1, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness1, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill2() {
        if (!setHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setHatchFill3 = new ArrayList<>();

    public Pyramid setHatchFill(String patternFillOrType3, String color1, Double thickness1, Double size) {
        this.patternFillOrType3 = patternFillOrType3;
        this.color1 = color1;
        this.thickness1 = thickness1;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", patternFillOrType3, color1, thickness1, size));

//        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", patternFillOrType3, color1, thickness1, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", patternFillOrType3, color1, thickness1, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill3() {
        if (!setHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setHatchFill4 = new ArrayList<>();

    public Pyramid setHatchFill(Boolean patternFillOrType4, String color1, Double thickness1, Double size) {
        this.patternFillOrType4 = patternFillOrType4;
        this.color1 = color1;
        this.thickness1 = thickness1;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%b, %s, %f, %f)", patternFillOrType4, color1, thickness1, size));

//        js.append(String.format(Locale.US, ".hatchFill(%b, %s, %f, %f)", patternFillOrType4, color1, thickness1, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%b, %s, %f, %f)", patternFillOrType4, color1, thickness1, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill4() {
        if (!setHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Pyramid> setHatchFillPalette = new ArrayList<>();

    public Pyramid setHatchFillPalette(HatchFillType[] hatchFillPalette) {
        this.hatchFillPalette = hatchFillPalette;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", arrayToString(hatchFillPalette)));

//        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", arrayToString(hatchFillPalette)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", arrayToString(hatchFillPalette)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFillPalette() {
        if (!setHatchFillPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setHatchFillPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setHatchFillPalette1 = new ArrayList<>();

    public Pyramid setHatchFillPalette(String hatchFillPalette1) {
        this.hatchFillPalette1 = hatchFillPalette1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", hatchFillPalette1));

//        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", hatchFillPalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", hatchFillPalette1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFillPalette1() {
        if (!setHatchFillPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setHatchFillPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setHatchFillPalette2 = new ArrayList<>();

    public Pyramid setHatchFillPalette(HatchFills hatchFillPalette2) {
        this.hatchFillPalette2 = hatchFillPalette2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFillPalette2() {
        if (!setHatchFillPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setHatchFillPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index;
    private List<Pyramid> setHover = new ArrayList<>();

    public Pyramid setHover(Double index) {
        this.index = index;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%f)", index));

//        js.append(String.format(Locale.US, ".hover(%f)", index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%f)", index));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHover() {
        if (!setHover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setHover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private StateSettings getHovered;

    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }
    private String hovered;
    private List<Pyramid> setHovered = new ArrayList<>();

    public Pyramid setHovered(String hovered) {
        this.hovered = hovered;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hovered(%s)", hovered));

//        js.append(String.format(Locale.US, ".hovered(%s)", hovered));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hovered(%s)", hovered));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHovered() {
        if (!setHovered.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private UiLabelsFactory getLabels;

    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }
    private String labels;
    private Boolean labels1;
    private List<Pyramid> setLabels = new ArrayList<>();

    public Pyramid setLabels(String labels) {
        this.labels = labels;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labels(%s)", labels));

//        js.append(String.format(Locale.US, ".labels(%s)", labels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", labels));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLabels() {
        if (!setLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setLabels1 = new ArrayList<>();

    public Pyramid setLabels(Boolean labels1) {
        this.labels1 = labels1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labels(%b)", labels1));

//        js.append(String.format(Locale.US, ".labels(%b)", labels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labels(%b)", labels1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLabels1() {
        if (!setLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setLabels1) {
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
    private String[] markerPalette3;
    private List<Pyramid> setMarkerPalette = new ArrayList<>();

    public Pyramid setMarkerPalette(Markers markerPalette) {
        this.markerPalette = markerPalette;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", (markerPalette != null) ? markerPalette.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".markerPalette(%s)", (markerPalette != null) ? markerPalette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", (markerPalette != null) ? markerPalette.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette() {
        if (!setMarkerPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setMarkerPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setMarkerPalette1 = new ArrayList<>();

    public Pyramid setMarkerPalette(String markerPalette1) {
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
            for (Pyramid item : setMarkerPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setMarkerPalette2 = new ArrayList<>();

    public Pyramid setMarkerPalette(MarkerType[] markerPalette2) {
        this.markerPalette2 = markerPalette2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette2)));

//        js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette2)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette2() {
        if (!setMarkerPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setMarkerPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setMarkerPalette3 = new ArrayList<>();

    public Pyramid setMarkerPalette(String[] markerPalette3) {
        this.markerPalette3 = markerPalette3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", Arrays.toString(markerPalette3)));

//        js.append(String.format(Locale.US, ".markerPalette(%s)", Arrays.toString(markerPalette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", Arrays.toString(markerPalette3)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette3() {
        if (!setMarkerPalette3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setMarkerPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private UiMarkersFactory getMarkers;

    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }
    private String markers;
    private Boolean markers1;
    private String markers2;
    private List<Pyramid> setMarkers = new ArrayList<>();

    public Pyramid setMarkers(String markers) {
        this.markers = markers;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markers(%s)", markers));

//        js.append(String.format(Locale.US, ".markers(%s)", markers));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markers(%s)", markers));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkers() {
        if (!setMarkers.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setMarkers) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setMarkers1 = new ArrayList<>();

    public Pyramid setMarkers(Boolean markers1) {
        this.markers1 = markers1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markers(%b)", markers1));

//        js.append(String.format(Locale.US, ".markers(%b)", markers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markers(%b)", markers1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkers1() {
        if (!setMarkers1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setMarkers1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private StateSettings getNormal;

    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }
    private String normal;
    private List<Pyramid> setNormal = new ArrayList<>();

    public Pyramid setNormal(String normal) {
        this.normal = normal;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".normal(%s)", normal));

//        js.append(String.format(Locale.US, ".normal(%s)", normal));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".normal(%s)", normal));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetNormal() {
        if (!setNormal.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setNormal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private Boolean overlapMode2;
    private List<Pyramid> setOverlapMode = new ArrayList<>();

    public Pyramid setOverlapMode(LabelsOverlapMode overlapMode) {
        this.overlapMode = overlapMode;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".overlapMode(%s)", (overlapMode != null) ? overlapMode.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".overlapMode(%s)", (overlapMode != null) ? overlapMode.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%s)", (overlapMode != null) ? overlapMode.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetOverlapMode() {
        if (!setOverlapMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setOverlapMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setOverlapMode1 = new ArrayList<>();

    public Pyramid setOverlapMode(String overlapMode1) {
        this.overlapMode1 = overlapMode1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".overlapMode(%s)", overlapMode1));

//        js.append(String.format(Locale.US, ".overlapMode(%s)", overlapMode1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%s)", overlapMode1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetOverlapMode1() {
        if (!setOverlapMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setOverlapMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setOverlapMode2 = new ArrayList<>();

    public Pyramid setOverlapMode(Boolean overlapMode2) {
        this.overlapMode2 = overlapMode2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".overlapMode(%b)", overlapMode2));

//        js.append(String.format(Locale.US, ".overlapMode(%b)", overlapMode2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%b)", overlapMode2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetOverlapMode2() {
        if (!setOverlapMode2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setOverlapMode2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Pyramid> setPalette = new ArrayList<>();

    public Pyramid setPalette(RangeColors palette) {
        this.palette = palette;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", (palette != null) ? palette.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".palette(%s)", (palette != null) ? palette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", (palette != null) ? palette.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette() {
        if (!setPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setPalette1 = new ArrayList<>();

    public Pyramid setPalette(DistinctColors palette1) {
        this.palette1 = palette1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", (palette1 != null) ? palette1.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".palette(%s)", (palette1 != null) ? palette1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", (palette1 != null) ? palette1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette1() {
        if (!setPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setPalette2 = new ArrayList<>();

    public Pyramid setPalette(String palette2) {
        this.palette2 = palette2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", palette2));

//        js.append(String.format(Locale.US, ".palette(%s)", palette2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", palette2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette2() {
        if (!setPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setPalette3 = new ArrayList<>();

    public Pyramid setPalette(String[] palette3) {
        this.palette3 = palette3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", Arrays.toString(palette3)));

//        js.append(String.format(Locale.US, ".palette(%s)", Arrays.toString(palette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", Arrays.toString(palette3)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette3() {
        if (!setPalette3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String pointsPadding;
    private Double pointsPadding1;
    private List<Pyramid> setPointsPadding = new ArrayList<>();

    public Pyramid setPointsPadding(String pointsPadding) {
        this.pointsPadding = pointsPadding;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointsPadding(%s)", pointsPadding));

//        js.append(String.format(Locale.US, ".pointsPadding(%s)", pointsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointsPadding(%s)", pointsPadding));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPointsPadding() {
        if (!setPointsPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setPointsPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setPointsPadding1 = new ArrayList<>();

    public Pyramid setPointsPadding(Double pointsPadding1) {
        this.pointsPadding1 = pointsPadding1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointsPadding(%f)", pointsPadding1));

//        js.append(String.format(Locale.US, ".pointsPadding(%f)", pointsPadding1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointsPadding(%f)", pointsPadding1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPointsPadding1() {
        if (!setPointsPadding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setPointsPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean reversed;
    private List<Pyramid> setReversed = new ArrayList<>();

    public Pyramid setReversed(Boolean reversed) {
        this.reversed = reversed;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".reversed(%b)", reversed));

//        js.append(String.format(Locale.US, ".reversed(%b)", reversed));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".reversed(%b)", reversed));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetReversed() {
        if (!setReversed.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setReversed) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private List<Pyramid> setSelect = new ArrayList<>();

    public Pyramid select(Double index1) {
        this.index1 = index1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%f)", index1));

//        js.append(String.format(Locale.US, ".select(%f)", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%f)", index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelect() {
        if (!setSelect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setSelect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double[] indexes;
    private List<Pyramid> setSelect1 = new ArrayList<>();

    public Pyramid select(Double[] indexes) {
        this.indexes = indexes;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%s)", Arrays.toString(indexes)));

//        js.append(String.format(Locale.US, ".select(%s)", Arrays.toString(indexes)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%s)", Arrays.toString(indexes)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelect1() {
        if (!setSelect1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setSelect1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private StateSettings getSelected;

    public StateSettings getSelected() {
        if (getSelected == null)
            getSelected = new StateSettings(jsBase + ".selected()");

        return getSelected;
    }
    private String selected;
    private List<Pyramid> setSelected = new ArrayList<>();

    public Pyramid setSelected(String selected) {
        this.selected = selected;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selected(%s)", selected));

//        js.append(String.format(Locale.US, ".selected(%s)", selected));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selected(%s)", selected));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelected() {
        if (!setSelected.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke stroke;
    private List<Pyramid> setStroke = new ArrayList<>();

    public Pyramid setStroke(Stroke stroke) {
        this.stroke = stroke;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s)", (stroke != null) ? stroke.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".stroke(%s)", (stroke != null) ? stroke.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s)", (stroke != null) ? stroke.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Double thickness2;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;
    private List<Pyramid> setStroke1 = new ArrayList<>();

    public Pyramid setStroke(Stroke color2, Double thickness2, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color2 = color2;
        this.thickness2 = thickness2;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setStroke2 = new ArrayList<>();

    public Pyramid setStroke(ColoredFill color3, Double thickness2, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color3 = color3;
        this.thickness2 = thickness2;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color3 != null) ? color3.generateJs() : "null", thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color3 != null) ? color3.generateJs() : "null", thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color3 != null) ? color3.generateJs() : "null", thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pyramid> setStroke3 = new ArrayList<>();

    public Pyramid setStroke(String color4, Double thickness2, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color4 = color4;
        this.thickness2 = thickness2;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", color4, thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", color4, thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", color4, thickness2, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke3() {
        if (!setStroke3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pyramid item : setStroke3) {
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

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHatchFillPalette() {
        if (getHatchFillPalette != null) {
            return getHatchFillPalette.generateJs();
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

    private String generateJSgetMarkerPalette() {
        if (getMarkerPalette != null) {
            return getMarkerPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetPalette() {
        if (getPalette != null) {
            return getPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
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
        js.append(generateJSgetHatchFill());
        js.append(generateJSgetHatchFillPalette());
        js.append(generateJSgetHovered());
        js.append(generateJSgetLabels());
        js.append(generateJSgetMarkerPalette());
        js.append(generateJSgetMarkers());
        js.append(generateJSgetNormal());
        js.append(generateJSgetPalette());
        js.append(generateJSgetSelected());
        js.append(generateJSsetBaseWidth());
        js.append(generateJSsetBaseWidth1());
        js.append(generateJSsetConnectorLength());
        js.append(generateJSsetConnectorLength1());
        js.append(generateJSsetConnectorStroke());
        js.append(generateJSsetConnectorStroke1());
        js.append(generateJSsetConnectorStroke2());
        js.append(generateJSsetData());
        js.append(generateJSsetData1());
        js.append(generateJSsetData2());
        js.append(generateJSsetData3());
        js.append(generateJSsetData4());
        js.append(generateJSsetData5());
        js.append(generateJSsetData6());
        js.append(generateJSsetData7());
        js.append(generateJSsetData8());
        js.append(generateJSsetData9());
        js.append(generateJSsetData10());
        js.append(generateJSsetData11());
        js.append(generateJSsetData12());
        js.append(generateJSsetData13());
        js.append(generateJSsetData14());
        js.append(generateJSsetData15());
        js.append(generateJSsetData16());
        js.append(generateJSsetData17());
        js.append(generateJSsetFill());
        js.append(generateJSsetFill1());
        js.append(generateJSsetFill2());
        js.append(generateJSsetFill3());
        js.append(generateJSsetFill4());
        js.append(generateJSsetFill5());
        js.append(generateJSsetFill6());
        js.append(generateJSsetFill7());
        js.append(generateJSsetFill8());
        js.append(generateJSsetFill9());
        js.append(generateJSsetHatchFill());
        js.append(generateJSsetHatchFill1());
        js.append(generateJSsetHatchFill2());
        js.append(generateJSsetHatchFill3());
        js.append(generateJSsetHatchFill4());
        js.append(generateJSsetHatchFillPalette());
        js.append(generateJSsetHatchFillPalette1());
        js.append(generateJSsetHatchFillPalette2());
        js.append(generateJSsetHover());
        js.append(generateJSsetHovered());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetMarkerPalette());
        js.append(generateJSsetMarkerPalette1());
        js.append(generateJSsetMarkerPalette2());
        js.append(generateJSsetMarkerPalette3());
        js.append(generateJSsetMarkers());
        js.append(generateJSsetMarkers1());
        js.append(generateJSsetNormal());
        js.append(generateJSsetOverlapMode());
        js.append(generateJSsetOverlapMode1());
        js.append(generateJSsetOverlapMode2());
        js.append(generateJSsetPalette());
        js.append(generateJSsetPalette1());
        js.append(generateJSsetPalette2());
        js.append(generateJSsetPalette3());
        js.append(generateJSsetPointsPadding());
        js.append(generateJSsetPointsPadding1());
        js.append(generateJSsetReversed());
        js.append(generateJSsetSelect());
        js.append(generateJSsetSelect1());
        js.append(generateJSsetSelected());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetStroke3());

        js.append(super.generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}