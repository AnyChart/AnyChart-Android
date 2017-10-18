package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class HeatMap extends SeparateChart {

    protected HeatMap(String name) {
        super(name);

        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    

    private OrdinalColor getColorScale;

    public OrdinalColor getColorScale() {
        if (getColorScale == null)
            getColorScale = new OrdinalColor(jsBase + ".colorScale()");

        return getColorScale;
    }
    private OrdinalColor colorScale;
    private String colorScale1;
    private ScaleTypes colorScale2;
    private String colorScale3;
    private List<HeatMap> setColorScale = new ArrayList<>();

    public HeatMap setColorScale(OrdinalColor colorScale) {
        this.colorScale = colorScale;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorScale(%s)", (colorScale != null) ? colorScale.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".colorScale(%s)", (colorScale != null) ? colorScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", (colorScale != null) ? colorScale.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetColorScale() {
        if (!setColorScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setColorScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setColorScale1 = new ArrayList<>();

    public HeatMap setColorScale(String colorScale1) {
        this.colorScale1 = colorScale1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorScale(%s)", colorScale1));

//        js.append(String.format(Locale.US, ".colorScale(%s)", colorScale1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", colorScale1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetColorScale1() {
        if (!setColorScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setColorScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setColorScale2 = new ArrayList<>();

    public HeatMap setColorScale(ScaleTypes colorScale2) {
        this.colorScale2 = colorScale2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorScale(%s)", (colorScale2 != null) ? colorScale2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".colorScale(%s)", (colorScale2 != null) ? colorScale2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorScale(%s)", (colorScale2 != null) ? colorScale2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetColorScale2() {
        if (!setColorScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setColorScale2) {
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
    private DataSettings data4;
    private TextParsingMode csvSettings;
    private String csvSettings1;
    private TextParsingSettings csvSettings2;
    private List<HeatMap> setData = new ArrayList<>();

    public HeatMap setData(View data, TextParsingMode csvSettings) {
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
            for (HeatMap item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData1 = new ArrayList<>();

    public HeatMap setData(View data, String csvSettings1) {
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
            for (HeatMap item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData2 = new ArrayList<>();

    public HeatMap setData(View data, TextParsingSettings csvSettings2) {
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
            for (HeatMap item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData3 = new ArrayList<>();

    public HeatMap setData(Set data1, TextParsingMode csvSettings) {
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
            for (HeatMap item : setData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData4 = new ArrayList<>();

    public HeatMap setData(Set data1, String csvSettings1) {
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
            for (HeatMap item : setData4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData5 = new ArrayList<>();

    public HeatMap setData(Set data1, TextParsingSettings csvSettings2) {
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
            for (HeatMap item : setData5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData6 = new ArrayList<>();

    public HeatMap setData(String[] data2, TextParsingMode csvSettings) {
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
    private String generateJSsetData6() {
        if (!setData6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setData6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData7 = new ArrayList<>();

    public HeatMap setData(String[] data2, String csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), csvSettings1));

//        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), csvSettings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData7() {
        if (!setData7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setData7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData8 = new ArrayList<>();

    public HeatMap setData(String[] data2, TextParsingSettings csvSettings2) {
        this.data2 = data2;
        this.csvSettings2 = csvSettings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData8() {
        if (!setData8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setData8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData9 = new ArrayList<>();

    public HeatMap setData(String data3, TextParsingMode csvSettings) {
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
    private String generateJSsetData9() {
        if (!setData9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setData9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData10 = new ArrayList<>();

    public HeatMap setData(String data3, String csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data3, csvSettings1));

//        js.append(String.format(Locale.US, ".data(%s, %s)", data3, csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data3, csvSettings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData10() {
        if (!setData10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setData10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData11 = new ArrayList<>();

    public HeatMap setData(String data3, TextParsingSettings csvSettings2) {
        this.data3 = data3;
        this.csvSettings2 = csvSettings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData11() {
        if (!setData11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setData11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData12 = new ArrayList<>();

    public HeatMap setData(DataSettings data4, TextParsingMode csvSettings) {
        this.data4 = data4;
        this.csvSettings = csvSettings;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData12() {
        if (!setData12.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setData12) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData13 = new ArrayList<>();

    public HeatMap setData(DataSettings data4, String csvSettings1) {
        this.data4 = data4;
        this.csvSettings1 = csvSettings1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data4 != null) ? data4.generateJs() : "null", csvSettings1));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data4 != null) ? data4.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data4 != null) ? data4.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData13() {
        if (!setData13.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setData13) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setData14 = new ArrayList<>();

    public HeatMap setData(DataSettings data4, TextParsingSettings csvSettings2) {
        this.data4 = data4;
        this.csvSettings2 = csvSettings2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData14() {
        if (!setData14.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setData14) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private List<HeatMap> setFill = new ArrayList<>();

    public HeatMap setFill(Fill fill) {
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
            for (HeatMap item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<HeatMap> setFill1 = new ArrayList<>();

    public HeatMap fill(String color, Double opacity) {
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
            for (HeatMap item : setFill1) {
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
    private List<HeatMap> setFill2 = new ArrayList<>();

    public HeatMap fill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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
            for (HeatMap item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setFill3 = new ArrayList<>();

    public HeatMap fill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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
            for (HeatMap item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setFill4 = new ArrayList<>();

    public HeatMap fill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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
            for (HeatMap item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setFill5 = new ArrayList<>();

    public HeatMap fill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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
            for (HeatMap item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setFill6 = new ArrayList<>();

    public HeatMap fill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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
            for (HeatMap item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setFill7 = new ArrayList<>();

    public HeatMap fill(String[] keys1, String mode2, Double angle, Double opacity1) {
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
            for (HeatMap item : setFill7) {
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
    private List<HeatMap> setFill8 = new ArrayList<>();

    public HeatMap fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            for (HeatMap item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setFill9 = new ArrayList<>();

    public HeatMap fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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
            for (HeatMap item : setFill9) {
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
    private Double thickness;
    private Double size;
    private List<HeatMap> setHatchFill = new ArrayList<>();

    public HeatMap setHatchFill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
        this.patternFillOrType = patternFillOrType;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness, size));

//        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill() {
        if (!setHatchFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setHatchFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setHatchFill1 = new ArrayList<>();

    public HeatMap setHatchFill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
        this.patternFillOrType1 = patternFillOrType1;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness, size));

//        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill1() {
        if (!setHatchFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setHatchFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setHatchFill2 = new ArrayList<>();

    public HeatMap setHatchFill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
        this.patternFillOrType2 = patternFillOrType2;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness, size));

//        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill2() {
        if (!setHatchFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setHatchFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setHatchFill3 = new ArrayList<>();

    public HeatMap setHatchFill(String patternFillOrType3, String color1, Double thickness, Double size) {
        this.patternFillOrType3 = patternFillOrType3;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", patternFillOrType3, color1, thickness, size));

//        js.append(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", patternFillOrType3, color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%s, %s, %f, %f)", patternFillOrType3, color1, thickness, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill3() {
        if (!setHatchFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setHatchFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setHatchFill4 = new ArrayList<>();

    public HeatMap setHatchFill(Boolean patternFillOrType4, String color1, Double thickness, Double size) {
        this.patternFillOrType4 = patternFillOrType4;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFill(%b, %s, %f, %f)", patternFillOrType4, color1, thickness, size));

//        js.append(String.format(Locale.US, ".hatchFill(%b, %s, %f, %f)", patternFillOrType4, color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFill(%b, %s, %f, %f)", patternFillOrType4, color1, thickness, size));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFill4() {
        if (!setHatchFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setHatchFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double indexOrIndexes;
    private Double[] indexOrIndexes1;
    private List<HeatMap> setHover = new ArrayList<>();

    public HeatMap hover(Double indexOrIndexes) {
        this.indexOrIndexes = indexOrIndexes;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%f)", indexOrIndexes));

//        js.append(String.format(Locale.US, ".hover(%f)", indexOrIndexes));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%f)", indexOrIndexes));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHover() {
        if (!setHover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setHover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setHover1 = new ArrayList<>();

    public HeatMap hover(Double[] indexOrIndexes1) {
        this.indexOrIndexes1 = indexOrIndexes1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%s)", Arrays.toString(indexOrIndexes1)));

//        js.append(String.format(Locale.US, ".hover(%s)", Arrays.toString(indexOrIndexes1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%s)", Arrays.toString(indexOrIndexes1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHover1() {
        if (!setHover1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setHover1) {
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
    private List<HeatMap> setHovered = new ArrayList<>();

    public HeatMap setHovered(String hovered) {
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
            for (HeatMap item : setHovered) {
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
    private List<HeatMap> setLabels = new ArrayList<>();

    public HeatMap setLabels(String labels) {
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
            for (HeatMap item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setLabels1 = new ArrayList<>();

    public HeatMap setLabels(Boolean labels1) {
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
            for (HeatMap item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LabelsDisplayMode labelsDisplayMode;
    private String labelsDisplayMode1;
    private List<HeatMap> setLabelsDisplayMode = new ArrayList<>();

    public HeatMap setLabelsDisplayMode(LabelsDisplayMode labelsDisplayMode) {
        this.labelsDisplayMode = labelsDisplayMode;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labelsDisplayMode(%s)", (labelsDisplayMode != null) ? labelsDisplayMode.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".labelsDisplayMode(%s)", (labelsDisplayMode != null) ? labelsDisplayMode.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labelsDisplayMode(%s)", (labelsDisplayMode != null) ? labelsDisplayMode.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLabelsDisplayMode() {
        if (!setLabelsDisplayMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setLabelsDisplayMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setLabelsDisplayMode1 = new ArrayList<>();

    public HeatMap setLabelsDisplayMode(String labelsDisplayMode1) {
        this.labelsDisplayMode1 = labelsDisplayMode1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labelsDisplayMode(%s)", labelsDisplayMode1));

//        js.append(String.format(Locale.US, ".labelsDisplayMode(%s)", labelsDisplayMode1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labelsDisplayMode(%s)", labelsDisplayMode1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLabelsDisplayMode1() {
        if (!setLabelsDisplayMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setLabelsDisplayMode1) {
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
    private List<HeatMap> setMarkers = new ArrayList<>();

    public HeatMap setMarkers(String markers) {
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
            for (HeatMap item : setMarkers) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setMarkers1 = new ArrayList<>();

    public HeatMap setMarkers(Boolean markers1) {
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
            for (HeatMap item : setMarkers1) {
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
    private List<HeatMap> setNormal = new ArrayList<>();

    public HeatMap setNormal(String normal) {
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
            for (HeatMap item : setNormal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double indexOrIndexes2;
    private Double[] indexOrIndexes3;
    private List<HeatMap> setSelect = new ArrayList<>();

    public HeatMap select(Double indexOrIndexes2) {
        this.indexOrIndexes2 = indexOrIndexes2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%f)", indexOrIndexes2));

//        js.append(String.format(Locale.US, ".select(%f)", indexOrIndexes2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%f)", indexOrIndexes2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelect() {
        if (!setSelect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setSelect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setSelect1 = new ArrayList<>();

    public HeatMap select(Double[] indexOrIndexes3) {
        this.indexOrIndexes3 = indexOrIndexes3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%s)", Arrays.toString(indexOrIndexes3)));

//        js.append(String.format(Locale.US, ".select(%s)", Arrays.toString(indexOrIndexes3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%s)", Arrays.toString(indexOrIndexes3)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelect1() {
        if (!setSelect1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setSelect1) {
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
    private List<HeatMap> setSelected = new ArrayList<>();

    public HeatMap setSelected(String selected) {
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
            for (HeatMap item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Double thickness1;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<HeatMap> setStroke = new ArrayList<>();

    public HeatMap setStroke(Stroke color2, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color2 = color2;
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setStroke1 = new ArrayList<>();

    public HeatMap setStroke(ColoredFill color3, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color3 = color3;
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color3 != null) ? color3.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color3 != null) ? color3.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", (color3 != null) ? color3.generateJs() : "null", thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setStroke2 = new ArrayList<>();

    public HeatMap setStroke(String color4, Double thickness1, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color4 = color4;
        this.thickness1 = thickness1;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", color4, thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", color4, thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", color4, thickness1, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxesLinear getXAxis;

    public CoreAxesLinear getXAxis() {
        if (getXAxis == null)
            getXAxis = new CoreAxesLinear(jsBase + ".xAxis()");

        return getXAxis;
    }

    private List<CoreAxesLinear> getXAxis1 = new ArrayList<>();

    public CoreAxesLinear getXAxis(Double index) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".xAxis("+ index+")");
        getXAxis1.add(item);
        return item;
    }
    private String xAxis;
    private Boolean xAxis1;
    private List<HeatMap> setXAxis = new ArrayList<>();

    public HeatMap setXAxis(String xAxis) {
        this.xAxis = xAxis;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s)", xAxis));

//        js.append(String.format(Locale.US, ".xAxis(%s)", xAxis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s)", xAxis));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXAxis() {
        if (!setXAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setXAxis1 = new ArrayList<>();

    public HeatMap setXAxis(Boolean xAxis1) {
        this.xAxis1 = xAxis1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%b)", xAxis1));

//        js.append(String.format(Locale.US, ".xAxis(%b)", xAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b)", xAxis1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXAxis1() {
        if (!setXAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private String xAxis2;
    private Boolean xAxis3;
    private List<HeatMap> setXAxis2 = new ArrayList<>();

    public HeatMap setXAxis(String xAxis2, Double index1) {
        this.xAxis2 = xAxis2;
        this.index1 = index1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s, %f)", xAxis2, index1));

//        js.append(String.format(Locale.US, ".xAxis(%s, %f)", xAxis2, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s, %f)", xAxis2, index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXAxis2() {
        if (!setXAxis2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXAxis2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setXAxis3 = new ArrayList<>();

    public HeatMap setXAxis(Boolean xAxis3, Double index1) {
        this.xAxis3 = xAxis3;
        this.index1 = index1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%b, %f)", xAxis3, index1));

//        js.append(String.format(Locale.US, ".xAxis(%b, %f)", xAxis3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b, %f)", xAxis3, index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXAxis3() {
        if (!setXAxis3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXAxis3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreGridsLinear getXGrid;

    public CoreGridsLinear getXGrid() {
        if (getXGrid == null)
            getXGrid = new CoreGridsLinear(jsBase + ".xGrid()");

        return getXGrid;
    }

    private List<CoreGridsLinear> getXGrid1 = new ArrayList<>();

    public CoreGridsLinear getXGrid(Double index2) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".xGrid("+ index2+")");
        getXGrid1.add(item);
        return item;
    }
    private String xGrid;
    private Boolean xGrid1;
    private List<HeatMap> setXGrid = new ArrayList<>();

    public HeatMap setXGrid(String xGrid) {
        this.xGrid = xGrid;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s)", xGrid));

//        js.append(String.format(Locale.US, ".xGrid(%s)", xGrid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s)", xGrid));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXGrid() {
        if (!setXGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setXGrid1 = new ArrayList<>();

    public HeatMap setXGrid(Boolean xGrid1) {
        this.xGrid1 = xGrid1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%b)", xGrid1));

//        js.append(String.format(Locale.US, ".xGrid(%b)", xGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b)", xGrid1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXGrid1() {
        if (!setXGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index3;
    private String xGrid2;
    private Boolean xGrid3;
    private List<HeatMap> setXGrid2 = new ArrayList<>();

    public HeatMap setXGrid(String xGrid2, Double index3) {
        this.xGrid2 = xGrid2;
        this.index3 = index3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s, %f)", xGrid2, index3));

//        js.append(String.format(Locale.US, ".xGrid(%s, %f)", xGrid2, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s, %f)", xGrid2, index3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXGrid2() {
        if (!setXGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setXGrid3 = new ArrayList<>();

    public HeatMap setXGrid(Boolean xGrid3, Double index3) {
        this.xGrid3 = xGrid3;
        this.index3 = index3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%b, %f)", xGrid3, index3));

//        js.append(String.format(Locale.US, ".xGrid(%b, %f)", xGrid3, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b, %f)", xGrid3, index3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXGrid3() {
        if (!setXGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Ordinal getXScale;

    public Ordinal getXScale() {
        if (getXScale == null)
            getXScale = new Ordinal(jsBase + ".xScale()");

        return getXScale;
    }
    private ScaleTypes xScale;
    private String xScale1;
    private Ordinal xScale2;
    private List<HeatMap> setXScale = new ArrayList<>();

    public HeatMap setXScale(ScaleTypes xScale) {
        this.xScale = xScale;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", (xScale != null) ? xScale.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".xScale(%s)", (xScale != null) ? xScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", (xScale != null) ? xScale.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale() {
        if (!setXScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setXScale1 = new ArrayList<>();

    public HeatMap setXScale(String xScale1) {
        this.xScale1 = xScale1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", xScale1));

//        js.append(String.format(Locale.US, ".xScale(%s)", xScale1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", xScale1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale1() {
        if (!setXScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setXScale2 = new ArrayList<>();

    public HeatMap setXScale(Ordinal xScale2) {
        this.xScale2 = xScale2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", (xScale2 != null) ? xScale2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".xScale(%s)", (xScale2 != null) ? xScale2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", (xScale2 != null) ? xScale2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale2() {
        if (!setXScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private ChartScroller getXScroller;

    public ChartScroller getXScroller() {
        if (getXScroller == null)
            getXScroller = new ChartScroller(jsBase + ".xScroller()");

        return getXScroller;
    }
    private String xScroller;
    private Boolean xScroller1;
    private List<HeatMap> setXScroller = new ArrayList<>();

    public HeatMap setXScroller(String xScroller) {
        this.xScroller = xScroller;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScroller(%s)", xScroller));

//        js.append(String.format(Locale.US, ".xScroller(%s)", xScroller));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScroller(%s)", xScroller));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScroller() {
        if (!setXScroller.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXScroller) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setXScroller1 = new ArrayList<>();

    public HeatMap setXScroller(Boolean xScroller1) {
        this.xScroller1 = xScroller1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScroller(%b)", xScroller1));

//        js.append(String.format(Locale.US, ".xScroller(%b)", xScroller1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScroller(%b)", xScroller1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScroller1() {
        if (!setXScroller1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXScroller1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private OrdinalZoom getXZoom;

    public OrdinalZoom getXZoom() {
        if (getXZoom == null)
            getXZoom = new OrdinalZoom(jsBase + ".xZoom()");

        return getXZoom;
    }
    private Double xZoom;
    private Boolean xZoom1;
    private String xZoom2;
    private List<HeatMap> setXZoom = new ArrayList<>();

    public HeatMap setXZoom(Double xZoom) {
        this.xZoom = xZoom;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xZoom(%f)", xZoom));

//        js.append(String.format(Locale.US, ".xZoom(%f)", xZoom));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xZoom(%f)", xZoom));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXZoom() {
        if (!setXZoom.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXZoom) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setXZoom1 = new ArrayList<>();

    public HeatMap setXZoom(Boolean xZoom1) {
        this.xZoom1 = xZoom1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xZoom(%b)", xZoom1));

//        js.append(String.format(Locale.US, ".xZoom(%b)", xZoom1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xZoom(%b)", xZoom1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXZoom1() {
        if (!setXZoom1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXZoom1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setXZoom2 = new ArrayList<>();

    public HeatMap setXZoom(String xZoom2) {
        this.xZoom2 = xZoom2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xZoom(%s)", xZoom2));

//        js.append(String.format(Locale.US, ".xZoom(%s)", xZoom2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xZoom(%s)", xZoom2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXZoom2() {
        if (!setXZoom2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setXZoom2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxesLinear getYAxis;

    public CoreAxesLinear getYAxis() {
        if (getYAxis == null)
            getYAxis = new CoreAxesLinear(jsBase + ".yAxis()");

        return getYAxis;
    }

    private List<CoreAxesLinear> getYAxis1 = new ArrayList<>();

    public CoreAxesLinear getYAxis(Double index4) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".yAxis("+ index4+")");
        getYAxis1.add(item);
        return item;
    }
    private String yAxis;
    private Boolean yAxis1;
    private List<HeatMap> setYAxis = new ArrayList<>();

    public HeatMap setYAxis(String yAxis) {
        this.yAxis = yAxis;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s)", yAxis));

//        js.append(String.format(Locale.US, ".yAxis(%s)", yAxis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s)", yAxis));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYAxis() {
        if (!setYAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setYAxis1 = new ArrayList<>();

    public HeatMap setYAxis(Boolean yAxis1) {
        this.yAxis1 = yAxis1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%b)", yAxis1));

//        js.append(String.format(Locale.US, ".yAxis(%b)", yAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%b)", yAxis1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYAxis1() {
        if (!setYAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index5;
    private String yAxis2;
    private Boolean yAxis3;
    private List<HeatMap> setYAxis2 = new ArrayList<>();

    public HeatMap setYAxis(String yAxis2, Double index5) {
        this.yAxis2 = yAxis2;
        this.index5 = index5;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s, %f)", yAxis2, index5));

//        js.append(String.format(Locale.US, ".yAxis(%s, %f)", yAxis2, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s, %f)", yAxis2, index5));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYAxis2() {
        if (!setYAxis2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYAxis2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setYAxis3 = new ArrayList<>();

    public HeatMap setYAxis(Boolean yAxis3, Double index5) {
        this.yAxis3 = yAxis3;
        this.index5 = index5;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%b, %f)", yAxis3, index5));

//        js.append(String.format(Locale.US, ".yAxis(%b, %f)", yAxis3, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%b, %f)", yAxis3, index5));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYAxis3() {
        if (!setYAxis3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYAxis3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreGridsLinear getYGrid;

    public CoreGridsLinear getYGrid() {
        if (getYGrid == null)
            getYGrid = new CoreGridsLinear(jsBase + ".yGrid()");

        return getYGrid;
    }

    private List<CoreGridsLinear> getYGrid1 = new ArrayList<>();

    public CoreGridsLinear getYGrid(Double index6) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".yGrid("+ index6+")");
        getYGrid1.add(item);
        return item;
    }
    private String yGrid;
    private Boolean yGrid1;
    private List<HeatMap> setYGrid = new ArrayList<>();

    public HeatMap setYGrid(String yGrid) {
        this.yGrid = yGrid;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s)", yGrid));

//        js.append(String.format(Locale.US, ".yGrid(%s)", yGrid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s)", yGrid));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYGrid() {
        if (!setYGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setYGrid1 = new ArrayList<>();

    public HeatMap setYGrid(Boolean yGrid1) {
        this.yGrid1 = yGrid1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%b)", yGrid1));

//        js.append(String.format(Locale.US, ".yGrid(%b)", yGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b)", yGrid1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYGrid1() {
        if (!setYGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index7;
    private String yGrid2;
    private Boolean yGrid3;
    private List<HeatMap> setYGrid2 = new ArrayList<>();

    public HeatMap setYGrid(String yGrid2, Double index7) {
        this.yGrid2 = yGrid2;
        this.index7 = index7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s, %f)", yGrid2, index7));

//        js.append(String.format(Locale.US, ".yGrid(%s, %f)", yGrid2, index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s, %f)", yGrid2, index7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYGrid2() {
        if (!setYGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setYGrid3 = new ArrayList<>();

    public HeatMap setYGrid(Boolean yGrid3, Double index7) {
        this.yGrid3 = yGrid3;
        this.index7 = index7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%b, %f)", yGrid3, index7));

//        js.append(String.format(Locale.US, ".yGrid(%b, %f)", yGrid3, index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b, %f)", yGrid3, index7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYGrid3() {
        if (!setYGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Ordinal getYScale;

    public Ordinal getYScale() {
        if (getYScale == null)
            getYScale = new Ordinal(jsBase + ".yScale()");

        return getYScale;
    }
    private ScaleTypes yScale;
    private String yScale1;
    private Ordinal yScale2;
    private List<HeatMap> setYScale = new ArrayList<>();

    public HeatMap setYScale(ScaleTypes yScale) {
        this.yScale = yScale;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", (yScale != null) ? yScale.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".yScale(%s)", (yScale != null) ? yScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale != null) ? yScale.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScale() {
        if (!setYScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setYScale1 = new ArrayList<>();

    public HeatMap setYScale(String yScale1) {
        this.yScale1 = yScale1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", yScale1));

//        js.append(String.format(Locale.US, ".yScale(%s)", yScale1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", yScale1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScale1() {
        if (!setYScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setYScale2 = new ArrayList<>();

    public HeatMap setYScale(Ordinal yScale2) {
        this.yScale2 = yScale2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", (yScale2 != null) ? yScale2.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".yScale(%s)", (yScale2 != null) ? yScale2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale2 != null) ? yScale2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScale2() {
        if (!setYScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private ChartScroller getYScroller;

    public ChartScroller getYScroller() {
        if (getYScroller == null)
            getYScroller = new ChartScroller(jsBase + ".yScroller()");

        return getYScroller;
    }
    private String yScroller;
    private Boolean yScroller1;
    private List<HeatMap> setYScroller = new ArrayList<>();

    public HeatMap setYScroller(String yScroller) {
        this.yScroller = yScroller;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScroller(%s)", yScroller));

//        js.append(String.format(Locale.US, ".yScroller(%s)", yScroller));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScroller(%s)", yScroller));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScroller() {
        if (!setYScroller.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYScroller) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setYScroller1 = new ArrayList<>();

    public HeatMap setYScroller(Boolean yScroller1) {
        this.yScroller1 = yScroller1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScroller(%b)", yScroller1));

//        js.append(String.format(Locale.US, ".yScroller(%b)", yScroller1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScroller(%b)", yScroller1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScroller1() {
        if (!setYScroller1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYScroller1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private OrdinalZoom getYZoom;

    public OrdinalZoom getYZoom() {
        if (getYZoom == null)
            getYZoom = new OrdinalZoom(jsBase + ".yZoom()");

        return getYZoom;
    }
    private Double yZoom;
    private Boolean yZoom1;
    private String yZoom2;
    private List<HeatMap> setYZoom = new ArrayList<>();

    public HeatMap setYZoom(Double yZoom) {
        this.yZoom = yZoom;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yZoom(%f)", yZoom));

//        js.append(String.format(Locale.US, ".yZoom(%f)", yZoom));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yZoom(%f)", yZoom));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYZoom() {
        if (!setYZoom.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYZoom) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setYZoom1 = new ArrayList<>();

    public HeatMap setYZoom(Boolean yZoom1) {
        this.yZoom1 = yZoom1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yZoom(%b)", yZoom1));

//        js.append(String.format(Locale.US, ".yZoom(%b)", yZoom1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yZoom(%b)", yZoom1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYZoom1() {
        if (!setYZoom1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYZoom1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<HeatMap> setYZoom2 = new ArrayList<>();

    public HeatMap setYZoom(String yZoom2) {
        this.yZoom2 = yZoom2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yZoom(%s)", yZoom2));

//        js.append(String.format(Locale.US, ".yZoom(%s)", yZoom2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yZoom(%s)", yZoom2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYZoom2() {
        if (!setYZoom2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (HeatMap item : setYZoom2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetColorScale() {
        if (getColorScale != null) {
            return getColorScale.generateJs();
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


    private String generateJSgetXScale() {
        if (getXScale != null) {
            return getXScale.generateJs();
        }
        return "";
    }

    private String generateJSgetXScroller() {
        if (getXScroller != null) {
            return getXScroller.generateJs();
        }
        return "";
    }

    private String generateJSgetXZoom() {
        if (getXZoom != null) {
            return getXZoom.generateJs();
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


    private String generateJSgetYScale() {
        if (getYScale != null) {
            return getYScale.generateJs();
        }
        return "";
    }

    private String generateJSgetYScroller() {
        if (getYScroller != null) {
            return getYScroller.generateJs();
        }
        return "";
    }

    private String generateJSgetYZoom() {
        if (getYZoom != null) {
            return getYZoom.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetColorScale());
        js.append(generateJSgetData());
        js.append(generateJSgetHatchFill());
        js.append(generateJSgetHovered());
        js.append(generateJSgetLabels());
        js.append(generateJSgetMarkers());
        js.append(generateJSgetNormal());
        js.append(generateJSgetSelected());
        js.append(generateJSgetXAxis());
        js.append(generateJSgetXAxis1());
        js.append(generateJSgetXGrid());
        js.append(generateJSgetXGrid1());
        js.append(generateJSgetXScale());
        js.append(generateJSgetXScroller());
        js.append(generateJSgetXZoom());
        js.append(generateJSgetYAxis());
        js.append(generateJSgetYAxis1());
        js.append(generateJSgetYGrid());
        js.append(generateJSgetYGrid1());
        js.append(generateJSgetYScale());
        js.append(generateJSgetYScroller());
        js.append(generateJSgetYZoom());
        js.append(generateJSsetColorScale());
        js.append(generateJSsetColorScale1());
        js.append(generateJSsetColorScale2());
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
        js.append(generateJSsetHover());
        js.append(generateJSsetHover1());
        js.append(generateJSsetHovered());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetLabelsDisplayMode());
        js.append(generateJSsetLabelsDisplayMode1());
        js.append(generateJSsetMarkers());
        js.append(generateJSsetMarkers1());
        js.append(generateJSsetNormal());
        js.append(generateJSsetSelect());
        js.append(generateJSsetSelect1());
        js.append(generateJSsetSelected());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetXAxis());
        js.append(generateJSsetXAxis1());
        js.append(generateJSsetXAxis2());
        js.append(generateJSsetXAxis3());
        js.append(generateJSsetXGrid());
        js.append(generateJSsetXGrid1());
        js.append(generateJSsetXGrid2());
        js.append(generateJSsetXGrid3());
        js.append(generateJSsetXScale());
        js.append(generateJSsetXScale1());
        js.append(generateJSsetXScale2());
        js.append(generateJSsetXScroller());
        js.append(generateJSsetXScroller1());
        js.append(generateJSsetXZoom());
        js.append(generateJSsetXZoom1());
        js.append(generateJSsetXZoom2());
        js.append(generateJSsetYAxis());
        js.append(generateJSsetYAxis1());
        js.append(generateJSsetYAxis2());
        js.append(generateJSsetYAxis3());
        js.append(generateJSsetYGrid());
        js.append(generateJSsetYGrid1());
        js.append(generateJSsetYGrid2());
        js.append(generateJSsetYGrid3());
        js.append(generateJSsetYScale());
        js.append(generateJSsetYScale1());
        js.append(generateJSsetYScale2());
        js.append(generateJSsetYScroller());
        js.append(generateJSsetYScroller1());
        js.append(generateJSsetYZoom());
        js.append(generateJSsetYZoom1());
        js.append(generateJSsetYZoom2());

        js.append(super.generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}