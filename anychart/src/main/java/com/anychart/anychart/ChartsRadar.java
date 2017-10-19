package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class ChartsRadar extends SeparateChart {

    protected ChartsRadar(String name) {
        super(name);

        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    
    private View var_args;
    private Set var_args1;
    private String[] var_args2;

    public void addSeries(View var_args) {
        this.var_args = var_args;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".addSeries(%s);", (var_args != null) ? var_args.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".addSeries(%s)", (var_args != null) ? var_args.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void addSeries(Set var_args1) {
        this.var_args1 = var_args1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".addSeries(%s);", (var_args1 != null) ? var_args1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".addSeries(%s)", (var_args1 != null) ? var_args1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void addSeries(String[] var_args2) {
        this.var_args2 = var_args2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".addSeries(%s);", Arrays.toString(var_args2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".addSeries(%s)", Arrays.toString(var_args2)));
            js.setLength(0);
        }
    }

    private View data;
    private Set data1;
    private String[] data2;
    private TextParsingMode csvSettings;
    private String csvSettings1;
    private TextParsingSettings csvSettings2;
    private List<RadarSeriesArea> setArea = new ArrayList<>();

    public RadarSeriesArea area(View data, TextParsingMode csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesArea item = new RadarSeriesArea("setArea" + variableIndex);
        setArea.add(item);
        return item;
    }
    private String generateJSsetArea() {
        if (!setArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesArea item : setArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesArea> setArea1 = new ArrayList<>();

    public RadarSeriesArea area(View data, String csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea1" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", (data != null) ? data.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", (data != null) ? data.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        RadarSeriesArea item = new RadarSeriesArea("setArea1" + variableIndex);
        setArea1.add(item);
        return item;
    }
    private String generateJSsetArea1() {
        if (!setArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesArea item : setArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesArea> setArea2 = new ArrayList<>();

    public RadarSeriesArea area(View data, TextParsingSettings csvSettings2) {
        this.data = data;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea2" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesArea item = new RadarSeriesArea("setArea2" + variableIndex);
        setArea2.add(item);
        return item;
    }
    private String generateJSsetArea2() {
        if (!setArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesArea item : setArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesArea> setArea3 = new ArrayList<>();

    public RadarSeriesArea area(Set data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea3" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesArea item = new RadarSeriesArea("setArea3" + variableIndex);
        setArea3.add(item);
        return item;
    }
    private String generateJSsetArea3() {
        if (!setArea3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesArea item : setArea3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesArea> setArea4 = new ArrayList<>();

    public RadarSeriesArea area(Set data1, String csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea4" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", (data1 != null) ? data1.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", (data1 != null) ? data1.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        RadarSeriesArea item = new RadarSeriesArea("setArea4" + variableIndex);
        setArea4.add(item);
        return item;
    }
    private String generateJSsetArea4() {
        if (!setArea4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesArea item : setArea4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesArea> setArea5 = new ArrayList<>();

    public RadarSeriesArea area(Set data1, TextParsingSettings csvSettings2) {
        this.data1 = data1;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea5" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesArea item = new RadarSeriesArea("setArea5" + variableIndex);
        setArea5.add(item);
        return item;
    }
    private String generateJSsetArea5() {
        if (!setArea5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesArea item : setArea5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesArea> setArea6 = new ArrayList<>();

    public RadarSeriesArea area(String[] data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea6" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesArea item = new RadarSeriesArea("setArea6" + variableIndex);
        setArea6.add(item);
        return item;
    }
    private String generateJSsetArea6() {
        if (!setArea6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesArea item : setArea6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesArea> setArea7 = new ArrayList<>();

    public RadarSeriesArea area(String[] data2, String csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea7" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", Arrays.toString(data2), csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", Arrays.toString(data2), csvSettings1));
            js.setLength(0);
        }
        RadarSeriesArea item = new RadarSeriesArea("setArea7" + variableIndex);
        setArea7.add(item);
        return item;
    }
    private String generateJSsetArea7() {
        if (!setArea7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesArea item : setArea7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesArea> setArea8 = new ArrayList<>();

    public RadarSeriesArea area(String[] data2, TextParsingSettings csvSettings2) {
        this.data2 = data2;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea8" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesArea item = new RadarSeriesArea("setArea8" + variableIndex);
        setArea8.add(item);
        return item;
    }
    private String generateJSsetArea8() {
        if (!setArea8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesArea item : setArea8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private RadarSeriesType defaultSeriesType;
    private String defaultSeriesType1;
    private List<ChartsRadar> setDefaultSeriesType = new ArrayList<>();

    public ChartsRadar setDefaultSeriesType(RadarSeriesType defaultSeriesType) {
        this.defaultSeriesType = defaultSeriesType;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultSeriesType(%s)", (defaultSeriesType != null) ? defaultSeriesType.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", (defaultSeriesType != null) ? defaultSeriesType.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetDefaultSeriesType() {
        if (!setDefaultSeriesType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setDefaultSeriesType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setDefaultSeriesType1 = new ArrayList<>();

    public ChartsRadar setDefaultSeriesType(String defaultSeriesType1) {
        this.defaultSeriesType1 = defaultSeriesType1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultSeriesType(%s)", defaultSeriesType1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", defaultSeriesType1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetDefaultSeriesType1() {
        if (!setDefaultSeriesType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setDefaultSeriesType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private AnychartMathRect getGetPlotBounds;

    public AnychartMathRect getGetPlotBounds() {
        if (getGetPlotBounds == null)
            getGetPlotBounds = new AnychartMathRect(jsBase + ".getPlotBounds()");

        return getGetPlotBounds;
    }

    private List<RadarSeriesBase> getGetSeries = new ArrayList<>();

    public RadarSeriesBase getGetSeries(Double id) {
        RadarSeriesBase item = new RadarSeriesBase(jsBase + ".getSeries("+ id+")");
        getGetSeries.add(item);
        return item;
    }

    private List<RadarSeriesBase> getGetSeries1 = new ArrayList<>();

    public RadarSeriesBase getGetSeries(String id1) {
        RadarSeriesBase item = new RadarSeriesBase(jsBase + ".getSeries("+ id1+")");
        getGetSeries1.add(item);
        return item;
    }

    private List<RadarSeriesBase> getGetSeriesAt = new ArrayList<>();

    public RadarSeriesBase getGetSeriesAt(Double index) {
        RadarSeriesBase item = new RadarSeriesBase(jsBase + ".getSeriesAt("+ index+")");
        getGetSeriesAt.add(item);
        return item;
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
    private List<ChartsRadar> setHatchFillPalette = new ArrayList<>();

    public ChartsRadar setHatchFillPalette(HatchFillType[] hatchFillPalette) {
        this.hatchFillPalette = hatchFillPalette;
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
    private String generateJSsetHatchFillPalette() {
        if (!setHatchFillPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setHatchFillPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setHatchFillPalette1 = new ArrayList<>();

    public ChartsRadar setHatchFillPalette(String hatchFillPalette1) {
        this.hatchFillPalette1 = hatchFillPalette1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", hatchFillPalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", hatchFillPalette1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFillPalette1() {
        if (!setHatchFillPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setHatchFillPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setHatchFillPalette2 = new ArrayList<>();

    public ChartsRadar setHatchFillPalette(HatchFills hatchFillPalette2) {
        this.hatchFillPalette2 = hatchFillPalette2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFillPalette2() {
        if (!setHatchFillPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setHatchFillPalette2) {
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
    private List<ChartsRadar> setHovered = new ArrayList<>();

    public ChartsRadar setHovered(String hovered) {
        this.hovered = hovered;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hovered(%s)", hovered));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hovered(%s)", hovered));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHovered() {
        if (!setHovered.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double innerRadius;
    private String innerRadius1;
    private List<ChartsRadar> setInnerRadius = new ArrayList<>();

    public ChartsRadar setInnerRadius(Double innerRadius) {
        this.innerRadius = innerRadius;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".innerRadius(%f)", innerRadius));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".innerRadius(%f)", innerRadius));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetInnerRadius() {
        if (!setInnerRadius.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setInnerRadius) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setInnerRadius1 = new ArrayList<>();

    public ChartsRadar setInnerRadius(String innerRadius1) {
        this.innerRadius1 = innerRadius1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".innerRadius(%s)", innerRadius1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".innerRadius(%s)", innerRadius1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetInnerRadius1() {
        if (!setInnerRadius1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setInnerRadius1) {
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
    private List<ChartsRadar> setLabels = new ArrayList<>();

    public ChartsRadar setLabels(String labels) {
        this.labels = labels;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labels(%s)", labels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", labels));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLabels() {
        if (!setLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setLabels1 = new ArrayList<>();

    public ChartsRadar setLabels(Boolean labels1) {
        this.labels1 = labels1;
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
    private String generateJSsetLabels1() {
        if (!setLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data3;
    private Set data4;
    private String[] data5;
    private String data6;
    private TextParsingMode csvSettings3;
    private String csvSettings4;
    private TextParsingSettings csvSettings5;
    private List<RadarSeriesLine> setLine = new ArrayList<>();

    public RadarSeriesLine line(View data3, TextParsingMode csvSettings3) {
        this.data3 = data3;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data3 != null) ? data3.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesLine item = new RadarSeriesLine("setLine" + variableIndex);
        setLine.add(item);
        return item;
    }
    private String generateJSsetLine() {
        if (!setLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesLine item : setLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesLine> setLine1 = new ArrayList<>();

    public RadarSeriesLine line(View data3, String csvSettings4) {
        this.data3 = data3;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine1" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data3 != null) ? data3.generateJs() : "null", csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data3 != null) ? data3.generateJs() : "null", csvSettings4));
            js.setLength(0);
        }
        RadarSeriesLine item = new RadarSeriesLine("setLine1" + variableIndex);
        setLine1.add(item);
        return item;
    }
    private String generateJSsetLine1() {
        if (!setLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesLine item : setLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesLine> setLine2 = new ArrayList<>();

    public RadarSeriesLine line(View data3, TextParsingSettings csvSettings5) {
        this.data3 = data3;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data3 != null) ? data3.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesLine item = new RadarSeriesLine("setLine2" + variableIndex);
        setLine2.add(item);
        return item;
    }
    private String generateJSsetLine2() {
        if (!setLine2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesLine item : setLine2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesLine> setLine3 = new ArrayList<>();

    public RadarSeriesLine line(Set data4, TextParsingMode csvSettings3) {
        this.data4 = data4;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine3" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesLine item = new RadarSeriesLine("setLine3" + variableIndex);
        setLine3.add(item);
        return item;
    }
    private String generateJSsetLine3() {
        if (!setLine3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesLine item : setLine3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesLine> setLine4 = new ArrayList<>();

    public RadarSeriesLine line(Set data4, String csvSettings4) {
        this.data4 = data4;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine4" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data4 != null) ? data4.generateJs() : "null", csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data4 != null) ? data4.generateJs() : "null", csvSettings4));
            js.setLength(0);
        }
        RadarSeriesLine item = new RadarSeriesLine("setLine4" + variableIndex);
        setLine4.add(item);
        return item;
    }
    private String generateJSsetLine4() {
        if (!setLine4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesLine item : setLine4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesLine> setLine5 = new ArrayList<>();

    public RadarSeriesLine line(Set data4, TextParsingSettings csvSettings5) {
        this.data4 = data4;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine5" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesLine item = new RadarSeriesLine("setLine5" + variableIndex);
        setLine5.add(item);
        return item;
    }
    private String generateJSsetLine5() {
        if (!setLine5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesLine item : setLine5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesLine> setLine6 = new ArrayList<>();

    public RadarSeriesLine line(String[] data5, TextParsingMode csvSettings3) {
        this.data5 = data5;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine6" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data5), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data5), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesLine item = new RadarSeriesLine("setLine6" + variableIndex);
        setLine6.add(item);
        return item;
    }
    private String generateJSsetLine6() {
        if (!setLine6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesLine item : setLine6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesLine> setLine7 = new ArrayList<>();

    public RadarSeriesLine line(String[] data5, String csvSettings4) {
        this.data5 = data5;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine7" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data5), csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data5), csvSettings4));
            js.setLength(0);
        }
        RadarSeriesLine item = new RadarSeriesLine("setLine7" + variableIndex);
        setLine7.add(item);
        return item;
    }
    private String generateJSsetLine7() {
        if (!setLine7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesLine item : setLine7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesLine> setLine8 = new ArrayList<>();

    public RadarSeriesLine line(String[] data5, TextParsingSettings csvSettings5) {
        this.data5 = data5;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine8" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data5), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data5), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesLine item = new RadarSeriesLine("setLine8" + variableIndex);
        setLine8.add(item);
        return item;
    }
    private String generateJSsetLine8() {
        if (!setLine8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesLine item : setLine8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesLine> setLine9 = new ArrayList<>();

    public RadarSeriesLine line(String data6, TextParsingMode csvSettings3) {
        this.data6 = data6;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine9" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data6, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data6, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesLine item = new RadarSeriesLine("setLine9" + variableIndex);
        setLine9.add(item);
        return item;
    }
    private String generateJSsetLine9() {
        if (!setLine9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesLine item : setLine9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesLine> setLine10 = new ArrayList<>();

    public RadarSeriesLine line(String data6, String csvSettings4) {
        this.data6 = data6;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine10" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data6, csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data6, csvSettings4));
            js.setLength(0);
        }
        RadarSeriesLine item = new RadarSeriesLine("setLine10" + variableIndex);
        setLine10.add(item);
        return item;
    }
    private String generateJSsetLine10() {
        if (!setLine10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesLine item : setLine10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesLine> setLine11 = new ArrayList<>();

    public RadarSeriesLine line(String data6, TextParsingSettings csvSettings5) {
        this.data6 = data6;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine11" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data6, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data6, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesLine item = new RadarSeriesLine("setLine11" + variableIndex);
        setLine11.add(item);
        return item;
    }
    private String generateJSsetLine11() {
        if (!setLine11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesLine item : setLine11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data7;
    private Set data8;
    private String[] data9;
    private String data10;
    private TextParsingMode csvSettings6;
    private String csvSettings7;
    private TextParsingSettings csvSettings8;
    private List<RadarSeriesMarker> setMarker = new ArrayList<>();

    public RadarSeriesMarker marker(View data7, TextParsingMode csvSettings6) {
        this.data7 = data7;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data7 != null) ? data7.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data7 != null) ? data7.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesMarker item = new RadarSeriesMarker("setMarker" + variableIndex);
        setMarker.add(item);
        return item;
    }
    private String generateJSsetMarker() {
        if (!setMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesMarker item : setMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesMarker> setMarker1 = new ArrayList<>();

    public RadarSeriesMarker marker(View data7, String csvSettings7) {
        this.data7 = data7;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker1" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data7 != null) ? data7.generateJs() : "null", csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data7 != null) ? data7.generateJs() : "null", csvSettings7));
            js.setLength(0);
        }
        RadarSeriesMarker item = new RadarSeriesMarker("setMarker1" + variableIndex);
        setMarker1.add(item);
        return item;
    }
    private String generateJSsetMarker1() {
        if (!setMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesMarker item : setMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesMarker> setMarker2 = new ArrayList<>();

    public RadarSeriesMarker marker(View data7, TextParsingSettings csvSettings8) {
        this.data7 = data7;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker2" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data7 != null) ? data7.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data7 != null) ? data7.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesMarker item = new RadarSeriesMarker("setMarker2" + variableIndex);
        setMarker2.add(item);
        return item;
    }
    private String generateJSsetMarker2() {
        if (!setMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesMarker item : setMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesMarker> setMarker3 = new ArrayList<>();

    public RadarSeriesMarker marker(Set data8, TextParsingMode csvSettings6) {
        this.data8 = data8;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker3" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data8 != null) ? data8.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesMarker item = new RadarSeriesMarker("setMarker3" + variableIndex);
        setMarker3.add(item);
        return item;
    }
    private String generateJSsetMarker3() {
        if (!setMarker3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesMarker item : setMarker3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesMarker> setMarker4 = new ArrayList<>();

    public RadarSeriesMarker marker(Set data8, String csvSettings7) {
        this.data8 = data8;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker4" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data8 != null) ? data8.generateJs() : "null", csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data8 != null) ? data8.generateJs() : "null", csvSettings7));
            js.setLength(0);
        }
        RadarSeriesMarker item = new RadarSeriesMarker("setMarker4" + variableIndex);
        setMarker4.add(item);
        return item;
    }
    private String generateJSsetMarker4() {
        if (!setMarker4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesMarker item : setMarker4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesMarker> setMarker5 = new ArrayList<>();

    public RadarSeriesMarker marker(Set data8, TextParsingSettings csvSettings8) {
        this.data8 = data8;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker5" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data8 != null) ? data8.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesMarker item = new RadarSeriesMarker("setMarker5" + variableIndex);
        setMarker5.add(item);
        return item;
    }
    private String generateJSsetMarker5() {
        if (!setMarker5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesMarker item : setMarker5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesMarker> setMarker6 = new ArrayList<>();

    public RadarSeriesMarker marker(String[] data9, TextParsingMode csvSettings6) {
        this.data9 = data9;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker6" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data9), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data9), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesMarker item = new RadarSeriesMarker("setMarker6" + variableIndex);
        setMarker6.add(item);
        return item;
    }
    private String generateJSsetMarker6() {
        if (!setMarker6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesMarker item : setMarker6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesMarker> setMarker7 = new ArrayList<>();

    public RadarSeriesMarker marker(String[] data9, String csvSettings7) {
        this.data9 = data9;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker7" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data9), csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data9), csvSettings7));
            js.setLength(0);
        }
        RadarSeriesMarker item = new RadarSeriesMarker("setMarker7" + variableIndex);
        setMarker7.add(item);
        return item;
    }
    private String generateJSsetMarker7() {
        if (!setMarker7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesMarker item : setMarker7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesMarker> setMarker8 = new ArrayList<>();

    public RadarSeriesMarker marker(String[] data9, TextParsingSettings csvSettings8) {
        this.data9 = data9;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker8" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data9), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data9), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesMarker item = new RadarSeriesMarker("setMarker8" + variableIndex);
        setMarker8.add(item);
        return item;
    }
    private String generateJSsetMarker8() {
        if (!setMarker8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesMarker item : setMarker8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesMarker> setMarker9 = new ArrayList<>();

    public RadarSeriesMarker marker(String data10, TextParsingMode csvSettings6) {
        this.data10 = data10;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker9" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data10, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data10, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesMarker item = new RadarSeriesMarker("setMarker9" + variableIndex);
        setMarker9.add(item);
        return item;
    }
    private String generateJSsetMarker9() {
        if (!setMarker9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesMarker item : setMarker9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesMarker> setMarker10 = new ArrayList<>();

    public RadarSeriesMarker marker(String data10, String csvSettings7) {
        this.data10 = data10;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker10" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data10, csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data10, csvSettings7));
            js.setLength(0);
        }
        RadarSeriesMarker item = new RadarSeriesMarker("setMarker10" + variableIndex);
        setMarker10.add(item);
        return item;
    }
    private String generateJSsetMarker10() {
        if (!setMarker10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesMarker item : setMarker10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<RadarSeriesMarker> setMarker11 = new ArrayList<>();

    public RadarSeriesMarker marker(String data10, TextParsingSettings csvSettings8) {
        this.data10 = data10;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker11" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data10, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data10, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        RadarSeriesMarker item = new RadarSeriesMarker("setMarker11" + variableIndex);
        setMarker11.add(item);
        return item;
    }
    private String generateJSsetMarker11() {
        if (!setMarker11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesMarker item : setMarker11) {
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
    private List<ChartsRadar> setMarkerPalette = new ArrayList<>();

    public ChartsRadar setMarkerPalette(Markers markerPalette) {
        this.markerPalette = markerPalette;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", (markerPalette != null) ? markerPalette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", (markerPalette != null) ? markerPalette.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette() {
        if (!setMarkerPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setMarkerPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setMarkerPalette1 = new ArrayList<>();

    public ChartsRadar setMarkerPalette(String markerPalette1) {
        this.markerPalette1 = markerPalette1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", markerPalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", markerPalette1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette1() {
        if (!setMarkerPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setMarkerPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setMarkerPalette2 = new ArrayList<>();

    public ChartsRadar setMarkerPalette(MarkerType[] markerPalette2) {
        this.markerPalette2 = markerPalette2;
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
    private String generateJSsetMarkerPalette2() {
        if (!setMarkerPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setMarkerPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setMarkerPalette3 = new ArrayList<>();

    public ChartsRadar setMarkerPalette(String[] markerPalette3) {
        this.markerPalette3 = markerPalette3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", Arrays.toString(markerPalette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", Arrays.toString(markerPalette3)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette3() {
        if (!setMarkerPalette3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setMarkerPalette3) {
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
    private List<ChartsRadar> setNormal = new ArrayList<>();

    public ChartsRadar setNormal(String normal) {
        this.normal = normal;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".normal(%s)", normal));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".normal(%s)", normal));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetNormal() {
        if (!setNormal.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setNormal) {
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
    private List<ChartsRadar> setPalette = new ArrayList<>();

    public ChartsRadar setPalette(RangeColors palette) {
        this.palette = palette;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", (palette != null) ? palette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", (palette != null) ? palette.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette() {
        if (!setPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setPalette1 = new ArrayList<>();

    public ChartsRadar setPalette(DistinctColors palette1) {
        this.palette1 = palette1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", (palette1 != null) ? palette1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", (palette1 != null) ? palette1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette1() {
        if (!setPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setPalette2 = new ArrayList<>();

    public ChartsRadar setPalette(String palette2) {
        this.palette2 = palette2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", palette2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", palette2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette2() {
        if (!setPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setPalette3 = new ArrayList<>();

    public ChartsRadar setPalette(String[] palette3) {
        this.palette3 = palette3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", Arrays.toString(palette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", Arrays.toString(palette3)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette3() {
        if (!setPalette3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double id2;
    private String id3;
    private List<ChartsRadar> setRemoveSeries = new ArrayList<>();

    public ChartsRadar removeSeries(Double id2) {
        this.id2 = id2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeries(%f)", id2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%f)", id2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRemoveSeries() {
        if (!setRemoveSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setRemoveSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setRemoveSeries1 = new ArrayList<>();

    public ChartsRadar removeSeries(String id3) {
        this.id3 = id3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeries(%s)", id3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%s)", id3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRemoveSeries1() {
        if (!setRemoveSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setRemoveSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private List<ChartsRadar> setRemoveSeriesAt = new ArrayList<>();

    public ChartsRadar removeSeriesAt(Double index1) {
        this.index1 = index1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeriesAt(%f)", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeriesAt(%f)", index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRemoveSeriesAt() {
        if (!setRemoveSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setRemoveSeriesAt) {
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
    private List<ChartsRadar> setSelected = new ArrayList<>();

    public ChartsRadar setSelected(String selected) {
        this.selected = selected;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selected(%s)", selected));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selected(%s)", selected));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelected() {
        if (!setSelected.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String startAngle;
    private Double startAngle1;
    private List<ChartsRadar> setStartAngle = new ArrayList<>();

    public ChartsRadar setStartAngle(String startAngle) {
        this.startAngle = startAngle;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".startAngle(%s)", startAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".startAngle(%s)", startAngle));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStartAngle() {
        if (!setStartAngle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setStartAngle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setStartAngle1 = new ArrayList<>();

    public ChartsRadar setStartAngle(Double startAngle1) {
        this.startAngle1 = startAngle1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".startAngle(%f)", startAngle1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".startAngle(%f)", startAngle1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStartAngle1() {
        if (!setStartAngle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setStartAngle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxesRadar getXAxis;

    public CoreAxesRadar getXAxis() {
        if (getXAxis == null)
            getXAxis = new CoreAxesRadar(jsBase + ".xAxis()");

        return getXAxis;
    }
    private String xAxis;
    private Boolean xAxis1;
    private List<ChartsRadar> setXAxis = new ArrayList<>();

    public ChartsRadar setXAxis(String xAxis) {
        this.xAxis = xAxis;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s)", xAxis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s)", xAxis));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXAxis() {
        if (!setXAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setXAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setXAxis1 = new ArrayList<>();

    public ChartsRadar setXAxis(Boolean xAxis1) {
        this.xAxis1 = xAxis1;
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
    private String generateJSsetXAxis1() {
        if (!setXAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setXAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreGridsRadar getXGrid;

    public CoreGridsRadar getXGrid() {
        if (getXGrid == null)
            getXGrid = new CoreGridsRadar(jsBase + ".xGrid()");

        return getXGrid;
    }

    private List<CoreGridsRadar> getXGrid1 = new ArrayList<>();

    public CoreGridsRadar getXGrid(Double index2) {
        CoreGridsRadar item = new CoreGridsRadar(jsBase + ".xGrid("+ index2+")");
        getXGrid1.add(item);
        return item;
    }
    private String xGrid;
    private Boolean xGrid1;
    private List<ChartsRadar> setXGrid = new ArrayList<>();

    public ChartsRadar setXGrid(String xGrid) {
        this.xGrid = xGrid;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s)", xGrid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s)", xGrid));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXGrid() {
        if (!setXGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setXGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setXGrid1 = new ArrayList<>();

    public ChartsRadar setXGrid(Boolean xGrid1) {
        this.xGrid1 = xGrid1;
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
    private String generateJSsetXGrid1() {
        if (!setXGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setXGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index3;
    private String xGrid2;
    private Boolean xGrid3;
    private List<ChartsRadar> setXGrid2 = new ArrayList<>();

    public ChartsRadar setXGrid(String xGrid2, Double index3) {
        this.xGrid2 = xGrid2;
        this.index3 = index3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s, %f)", xGrid2, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s, %f)", xGrid2, index3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXGrid2() {
        if (!setXGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setXGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setXGrid3 = new ArrayList<>();

    public ChartsRadar setXGrid(Boolean xGrid3, Double index3) {
        this.xGrid3 = xGrid3;
        this.index3 = index3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%b, %f)", xGrid3, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b, %f)", xGrid3, index3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXGrid3() {
        if (!setXGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setXGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreGridsRadar getXMinorGrid;

    public CoreGridsRadar getXMinorGrid() {
        if (getXMinorGrid == null)
            getXMinorGrid = new CoreGridsRadar(jsBase + ".xMinorGrid()");

        return getXMinorGrid;
    }

    private List<CoreGridsRadar> getXMinorGrid1 = new ArrayList<>();

    public CoreGridsRadar getXMinorGrid(Double index4) {
        CoreGridsRadar item = new CoreGridsRadar(jsBase + ".xMinorGrid("+ index4+")");
        getXMinorGrid1.add(item);
        return item;
    }
    private String xMinorGrid;
    private Boolean xMinorGrid1;
    private List<ChartsRadar> setXMinorGrid = new ArrayList<>();

    public ChartsRadar setXMinorGrid(String xMinorGrid) {
        this.xMinorGrid = xMinorGrid;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%s)", xMinorGrid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s)", xMinorGrid));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXMinorGrid() {
        if (!setXMinorGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setXMinorGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setXMinorGrid1 = new ArrayList<>();

    public ChartsRadar setXMinorGrid(Boolean xMinorGrid1) {
        this.xMinorGrid1 = xMinorGrid1;
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
    private String generateJSsetXMinorGrid1() {
        if (!setXMinorGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setXMinorGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index5;
    private String xMinorGrid2;
    private Boolean xMinorGrid3;
    private List<ChartsRadar> setXMinorGrid2 = new ArrayList<>();

    public ChartsRadar setXMinorGrid(String xMinorGrid2, Double index5) {
        this.xMinorGrid2 = xMinorGrid2;
        this.index5 = index5;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%s, %f)", xMinorGrid2, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s, %f)", xMinorGrid2, index5));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXMinorGrid2() {
        if (!setXMinorGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setXMinorGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setXMinorGrid3 = new ArrayList<>();

    public ChartsRadar setXMinorGrid(Boolean xMinorGrid3, Double index5) {
        this.xMinorGrid3 = xMinorGrid3;
        this.index5 = index5;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%b, %f)", xMinorGrid3, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%b, %f)", xMinorGrid3, index5));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXMinorGrid3() {
        if (!setXMinorGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setXMinorGrid3) {
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
    private Ordinal xScale;
    private List<ChartsRadar> setXScale = new ArrayList<>();

    public ChartsRadar setXScale(Ordinal xScale) {
        this.xScale = xScale;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", (xScale != null) ? xScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", (xScale != null) ? xScale.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale() {
        if (!setXScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxesRadar getYAxis;

    public CoreAxesRadar getYAxis() {
        if (getYAxis == null)
            getYAxis = new CoreAxesRadar(jsBase + ".yAxis()");

        return getYAxis;
    }
    private String yAxis;
    private Boolean yAxis1;
    private List<ChartsRadar> setYAxis = new ArrayList<>();

    public ChartsRadar setYAxis(String yAxis) {
        this.yAxis = yAxis;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s)", yAxis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s)", yAxis));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYAxis() {
        if (!setYAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setYAxis1 = new ArrayList<>();

    public ChartsRadar setYAxis(Boolean yAxis1) {
        this.yAxis1 = yAxis1;
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
    private String generateJSsetYAxis1() {
        if (!setYAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreGridsRadar getYGrid;

    public CoreGridsRadar getYGrid() {
        if (getYGrid == null)
            getYGrid = new CoreGridsRadar(jsBase + ".yGrid()");

        return getYGrid;
    }

    private List<CoreGridsRadar> getYGrid1 = new ArrayList<>();

    public CoreGridsRadar getYGrid(Double index6) {
        CoreGridsRadar item = new CoreGridsRadar(jsBase + ".yGrid("+ index6+")");
        getYGrid1.add(item);
        return item;
    }
    private String yGrid;
    private Boolean yGrid1;
    private List<ChartsRadar> setYGrid = new ArrayList<>();

    public ChartsRadar setYGrid(String yGrid) {
        this.yGrid = yGrid;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s)", yGrid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s)", yGrid));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYGrid() {
        if (!setYGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setYGrid1 = new ArrayList<>();

    public ChartsRadar setYGrid(Boolean yGrid1) {
        this.yGrid1 = yGrid1;
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
    private String generateJSsetYGrid1() {
        if (!setYGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index7;
    private String yGrid2;
    private Boolean yGrid3;
    private List<ChartsRadar> setYGrid2 = new ArrayList<>();

    public ChartsRadar setYGrid(String yGrid2, Double index7) {
        this.yGrid2 = yGrid2;
        this.index7 = index7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s, %f)", yGrid2, index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s, %f)", yGrid2, index7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYGrid2() {
        if (!setYGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setYGrid3 = new ArrayList<>();

    public ChartsRadar setYGrid(Boolean yGrid3, Double index7) {
        this.yGrid3 = yGrid3;
        this.index7 = index7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%b, %f)", yGrid3, index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b, %f)", yGrid3, index7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYGrid3() {
        if (!setYGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreGridsRadar getYMinorGrid;

    public CoreGridsRadar getYMinorGrid() {
        if (getYMinorGrid == null)
            getYMinorGrid = new CoreGridsRadar(jsBase + ".yMinorGrid()");

        return getYMinorGrid;
    }

    private List<CoreGridsRadar> getYMinorGrid1 = new ArrayList<>();

    public CoreGridsRadar getYMinorGrid(Double index8) {
        CoreGridsRadar item = new CoreGridsRadar(jsBase + ".yMinorGrid("+ index8+")");
        getYMinorGrid1.add(item);
        return item;
    }
    private String yMinorGrid;
    private Boolean yMinorGrid1;
    private List<ChartsRadar> setYMinorGrid = new ArrayList<>();

    public ChartsRadar setYMinorGrid(String yMinorGrid) {
        this.yMinorGrid = yMinorGrid;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%s)", yMinorGrid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s)", yMinorGrid));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYMinorGrid() {
        if (!setYMinorGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYMinorGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setYMinorGrid1 = new ArrayList<>();

    public ChartsRadar setYMinorGrid(Boolean yMinorGrid1) {
        this.yMinorGrid1 = yMinorGrid1;
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
    private String generateJSsetYMinorGrid1() {
        if (!setYMinorGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYMinorGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index9;
    private String yMinorGrid2;
    private Boolean yMinorGrid3;
    private List<ChartsRadar> setYMinorGrid2 = new ArrayList<>();

    public ChartsRadar setYMinorGrid(String yMinorGrid2, Double index9) {
        this.yMinorGrid2 = yMinorGrid2;
        this.index9 = index9;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%s, %f)", yMinorGrid2, index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s, %f)", yMinorGrid2, index9));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYMinorGrid2() {
        if (!setYMinorGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYMinorGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setYMinorGrid3 = new ArrayList<>();

    public ChartsRadar setYMinorGrid(Boolean yMinorGrid3, Double index9) {
        this.yMinorGrid3 = yMinorGrid3;
        this.index9 = index9;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%b, %f)", yMinorGrid3, index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%b, %f)", yMinorGrid3, index9));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYMinorGrid3() {
        if (!setYMinorGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYMinorGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private ScalesLinear getYScale;

    public ScalesLinear getYScale() {
        if (getYScale == null)
            getYScale = new ScalesLinear(jsBase + ".yScale()");

        return getYScale;
    }
    private String yScale;
    private String yScale1;
    private ScalesBase yScale2;
    private ScaleTypes yScale3;
    private List<ChartsRadar> setYScale = new ArrayList<>();

    public ChartsRadar setYScale(String yScale) {
        this.yScale = yScale;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", yScale));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", yScale));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScale() {
        if (!setYScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setYScale1 = new ArrayList<>();

    public ChartsRadar setYScale(ScalesBase yScale2) {
        this.yScale2 = yScale2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", (yScale2 != null) ? yScale2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale2 != null) ? yScale2.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScale1() {
        if (!setYScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsRadar> setYScale2 = new ArrayList<>();

    public ChartsRadar setYScale(ScaleTypes yScale3) {
        this.yScale3 = yScale3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", (yScale3 != null) ? yScale3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale3 != null) ? yScale3.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScale2() {
        if (!setYScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsRadar item : setYScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetGetPlotBounds() {
        if (getGetPlotBounds != null) {
            return getGetPlotBounds.generateJs();
        }
        return "";
    }

    private String generateJSgetGetSeries() {
        if (!getGetSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesBase item : getGetSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeries1() {
        if (!getGetSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesBase item : getGetSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeriesAt() {
        if (!getGetSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadarSeriesBase item : getGetSeriesAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

    private String generateJSgetXAxis() {
        if (getXAxis != null) {
            return getXAxis.generateJs();
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
            for (CoreGridsRadar item : getXGrid1) {
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
            for (CoreGridsRadar item : getXMinorGrid1) {
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

    private String generateJSgetYGrid() {
        if (getYGrid != null) {
            return getYGrid.generateJs();
        }
        return "";
    }

    private String generateJSgetYGrid1() {
        if (!getYGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreGridsRadar item : getYGrid1) {
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
            for (CoreGridsRadar item : getYMinorGrid1) {
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
        js.append(generateJSgetGetPlotBounds());
        js.append(generateJSgetGetSeries());
        js.append(generateJSgetGetSeries1());
        js.append(generateJSgetGetSeriesAt());
        js.append(generateJSgetHatchFillPalette());
        js.append(generateJSgetHovered());
        js.append(generateJSgetLabels());
        js.append(generateJSgetMarkerPalette());
        js.append(generateJSgetNormal());
        js.append(generateJSgetPalette());
        js.append(generateJSgetSelected());
        js.append(generateJSgetXAxis());
        js.append(generateJSgetXGrid());
        js.append(generateJSgetXGrid1());
        js.append(generateJSgetXMinorGrid());
        js.append(generateJSgetXMinorGrid1());
        js.append(generateJSgetXScale());
        js.append(generateJSgetYAxis());
        js.append(generateJSgetYGrid());
        js.append(generateJSgetYGrid1());
        js.append(generateJSgetYMinorGrid());
        js.append(generateJSgetYMinorGrid1());
        js.append(generateJSgetYScale());
        js.append(generateJSsetArea());
        js.append(generateJSsetArea1());
        js.append(generateJSsetArea2());
        js.append(generateJSsetArea3());
        js.append(generateJSsetArea4());
        js.append(generateJSsetArea5());
        js.append(generateJSsetArea6());
        js.append(generateJSsetArea7());
        js.append(generateJSsetArea8());
        js.append(generateJSsetDefaultSeriesType());
        js.append(generateJSsetDefaultSeriesType1());
        js.append(generateJSsetHatchFillPalette());
        js.append(generateJSsetHatchFillPalette1());
        js.append(generateJSsetHatchFillPalette2());
        js.append(generateJSsetHovered());
        js.append(generateJSsetInnerRadius());
        js.append(generateJSsetInnerRadius1());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetLine());
        js.append(generateJSsetLine1());
        js.append(generateJSsetLine2());
        js.append(generateJSsetLine3());
        js.append(generateJSsetLine4());
        js.append(generateJSsetLine5());
        js.append(generateJSsetLine6());
        js.append(generateJSsetLine7());
        js.append(generateJSsetLine8());
        js.append(generateJSsetLine9());
        js.append(generateJSsetLine10());
        js.append(generateJSsetLine11());
        js.append(generateJSsetMarker());
        js.append(generateJSsetMarker1());
        js.append(generateJSsetMarker2());
        js.append(generateJSsetMarker3());
        js.append(generateJSsetMarker4());
        js.append(generateJSsetMarker5());
        js.append(generateJSsetMarker6());
        js.append(generateJSsetMarker7());
        js.append(generateJSsetMarker8());
        js.append(generateJSsetMarker9());
        js.append(generateJSsetMarker10());
        js.append(generateJSsetMarker11());
        js.append(generateJSsetMarkerPalette());
        js.append(generateJSsetMarkerPalette1());
        js.append(generateJSsetMarkerPalette2());
        js.append(generateJSsetMarkerPalette3());
        js.append(generateJSsetNormal());
        js.append(generateJSsetPalette());
        js.append(generateJSsetPalette1());
        js.append(generateJSsetPalette2());
        js.append(generateJSsetPalette3());
        js.append(generateJSsetRemoveSeries());
        js.append(generateJSsetRemoveSeries1());
        js.append(generateJSsetRemoveSeriesAt());
        js.append(generateJSsetSelected());
        js.append(generateJSsetStartAngle());
        js.append(generateJSsetStartAngle1());
        js.append(generateJSsetXAxis());
        js.append(generateJSsetXAxis1());
        js.append(generateJSsetXGrid());
        js.append(generateJSsetXGrid1());
        js.append(generateJSsetXGrid2());
        js.append(generateJSsetXGrid3());
        js.append(generateJSsetXMinorGrid());
        js.append(generateJSsetXMinorGrid1());
        js.append(generateJSsetXMinorGrid2());
        js.append(generateJSsetXMinorGrid3());
        js.append(generateJSsetXScale());
        js.append(generateJSsetYAxis());
        js.append(generateJSsetYAxis1());
        js.append(generateJSsetYGrid());
        js.append(generateJSsetYGrid1());
        js.append(generateJSsetYGrid2());
        js.append(generateJSsetYGrid3());
        js.append(generateJSsetYMinorGrid());
        js.append(generateJSsetYMinorGrid1());
        js.append(generateJSsetYMinorGrid2());
        js.append(generateJSsetYMinorGrid3());
        js.append(generateJSsetYScale());
        js.append(generateJSsetYScale1());
        js.append(generateJSsetYScale2());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}