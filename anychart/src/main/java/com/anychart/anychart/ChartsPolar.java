package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class ChartsPolar extends SeparateChart {

    public ChartsPolar() {
        js.append("chart = anychart.polar();");
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

//        js.append(String.format(Locale.US, jsBase + ".addSeries(%s);", (var_args != null) ? var_args.generateJs() : "null"));

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

//        js.append(String.format(Locale.US, jsBase + ".addSeries(%s);", (var_args1 != null) ? var_args1.generateJs() : "null"));

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

//        js.append(String.format(Locale.US, jsBase + ".addSeries(%s);", Arrays.toString(var_args2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".addSeries(%s)", Arrays.toString(var_args2)));
            js.setLength(0);
        }
    }

    private View data;
    private Set data1;
    private String[] data2;
    private TextParsingMode csvSettings;
    private TextParsingSettings csvSettings1;
    private List<PolarSeriesArea> setArea = new ArrayList<>();

    public PolarSeriesArea area(View data, TextParsingMode csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".area(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesArea item = new PolarSeriesArea("setArea" + variableIndex);
        setArea.add(item);
        return item;
    }
    private String generateJSsetArea() {
        if (!setArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesArea item : setArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesArea> setArea1 = new ArrayList<>();

    public PolarSeriesArea area(View data, TextParsingSettings csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea1" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".area(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesArea item = new PolarSeriesArea("setArea1" + variableIndex);
        setArea1.add(item);
        return item;
    }
    private String generateJSsetArea1() {
        if (!setArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesArea item : setArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesArea> setArea2 = new ArrayList<>();

    public PolarSeriesArea area(Set data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea2" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".area(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesArea item = new PolarSeriesArea("setArea2" + variableIndex);
        setArea2.add(item);
        return item;
    }
    private String generateJSsetArea2() {
        if (!setArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesArea item : setArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesArea> setArea3 = new ArrayList<>();

    public PolarSeriesArea area(Set data1, TextParsingSettings csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea3" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".area(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesArea item = new PolarSeriesArea("setArea3" + variableIndex);
        setArea3.add(item);
        return item;
    }
    private String generateJSsetArea3() {
        if (!setArea3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesArea item : setArea3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesArea> setArea4 = new ArrayList<>();

    public PolarSeriesArea area(String[] data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea4" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".area(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesArea item = new PolarSeriesArea("setArea4" + variableIndex);
        setArea4.add(item);
        return item;
    }
    private String generateJSsetArea4() {
        if (!setArea4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesArea item : setArea4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesArea> setArea5 = new ArrayList<>();

    public PolarSeriesArea area(String[] data2, TextParsingSettings csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea5" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".area(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesArea item = new PolarSeriesArea("setArea5" + variableIndex);
        setArea5.add(item);
        return item;
    }
    private String generateJSsetArea5() {
        if (!setArea5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesArea item : setArea5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double barGroupsPadding;
    private List<ChartsPolar> setBarGroupsPadding = new ArrayList<>();

    public ChartsPolar setBarGroupsPadding(Double barGroupsPadding) {
        this.barGroupsPadding = barGroupsPadding;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".barGroupsPadding(%f)", barGroupsPadding));

//        js.append(String.format(Locale.US, ".barGroupsPadding(%f)", barGroupsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".barGroupsPadding(%f)", barGroupsPadding));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetBarGroupsPadding() {
        if (!setBarGroupsPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setBarGroupsPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double barsPadding;
    private List<ChartsPolar> setBarsPadding = new ArrayList<>();

    public ChartsPolar setBarsPadding(Double barsPadding) {
        this.barsPadding = barsPadding;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".barsPadding(%f)", barsPadding));

//        js.append(String.format(Locale.US, ".barsPadding(%f)", barsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".barsPadding(%f)", barsPadding));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetBarsPadding() {
        if (!setBarsPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setBarsPadding) {
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
    private TextParsingMode csvSettings2;
    private TextParsingSettings csvSettings3;
    private List<PolarSeriesColumn> setColumn = new ArrayList<>();

    public PolarSeriesColumn column(View data3, TextParsingMode csvSettings2) {
        this.data3 = data3;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data3 != null) ? data3.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesColumn item = new PolarSeriesColumn("setColumn" + variableIndex);
        setColumn.add(item);
        return item;
    }
    private String generateJSsetColumn() {
        if (!setColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesColumn item : setColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesColumn> setColumn1 = new ArrayList<>();

    public PolarSeriesColumn column(View data3, TextParsingSettings csvSettings3) {
        this.data3 = data3;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn1" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data3 != null) ? data3.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesColumn item = new PolarSeriesColumn("setColumn1" + variableIndex);
        setColumn1.add(item);
        return item;
    }
    private String generateJSsetColumn1() {
        if (!setColumn1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesColumn item : setColumn1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesColumn> setColumn2 = new ArrayList<>();

    public PolarSeriesColumn column(Set data4, TextParsingMode csvSettings2) {
        this.data4 = data4;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn2" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesColumn item = new PolarSeriesColumn("setColumn2" + variableIndex);
        setColumn2.add(item);
        return item;
    }
    private String generateJSsetColumn2() {
        if (!setColumn2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesColumn item : setColumn2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesColumn> setColumn3 = new ArrayList<>();

    public PolarSeriesColumn column(Set data4, TextParsingSettings csvSettings3) {
        this.data4 = data4;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn3" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesColumn item = new PolarSeriesColumn("setColumn3" + variableIndex);
        setColumn3.add(item);
        return item;
    }
    private String generateJSsetColumn3() {
        if (!setColumn3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesColumn item : setColumn3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesColumn> setColumn4 = new ArrayList<>();

    public PolarSeriesColumn column(String[] data5, TextParsingMode csvSettings2) {
        this.data5 = data5;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn4" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", Arrays.toString(data5), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", Arrays.toString(data5), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", Arrays.toString(data5), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesColumn item = new PolarSeriesColumn("setColumn4" + variableIndex);
        setColumn4.add(item);
        return item;
    }
    private String generateJSsetColumn4() {
        if (!setColumn4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesColumn item : setColumn4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesColumn> setColumn5 = new ArrayList<>();

    public PolarSeriesColumn column(String[] data5, TextParsingSettings csvSettings3) {
        this.data5 = data5;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn5" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", Arrays.toString(data5), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", Arrays.toString(data5), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", Arrays.toString(data5), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesColumn item = new PolarSeriesColumn("setColumn5" + variableIndex);
        setColumn5.add(item);
        return item;
    }
    private String generateJSsetColumn5() {
        if (!setColumn5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesColumn item : setColumn5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesColumn> setColumn6 = new ArrayList<>();

    public PolarSeriesColumn column(String data6, TextParsingMode csvSettings2) {
        this.data6 = data6;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn6" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", data6, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", data6, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", data6, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesColumn item = new PolarSeriesColumn("setColumn6" + variableIndex);
        setColumn6.add(item);
        return item;
    }
    private String generateJSsetColumn6() {
        if (!setColumn6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesColumn item : setColumn6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesColumn> setColumn7 = new ArrayList<>();

    public PolarSeriesColumn column(String data6, TextParsingSettings csvSettings3) {
        this.data6 = data6;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn7" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", data6, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", data6, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", data6, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesColumn item = new PolarSeriesColumn("setColumn7" + variableIndex);
        setColumn7.add(item);
        return item;
    }
    private String generateJSsetColumn7() {
        if (!setColumn7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesColumn item : setColumn7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String defaultSeriesType;
    private PolarSeriesType defaultSeriesType1;
    private List<ChartsPolar> setDefaultSeriesType = new ArrayList<>();

    public ChartsPolar setDefaultSeriesType(String defaultSeriesType) {
        this.defaultSeriesType = defaultSeriesType;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultSeriesType(%s)", defaultSeriesType));

//        js.append(String.format(Locale.US, ".defaultSeriesType(%s)", defaultSeriesType));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", defaultSeriesType));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetDefaultSeriesType() {
        if (!setDefaultSeriesType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setDefaultSeriesType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setDefaultSeriesType1 = new ArrayList<>();

    public ChartsPolar setDefaultSeriesType(PolarSeriesType defaultSeriesType1) {
        this.defaultSeriesType1 = defaultSeriesType1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultSeriesType(%s)", (defaultSeriesType1 != null) ? defaultSeriesType1.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".defaultSeriesType(%s)", (defaultSeriesType1 != null) ? defaultSeriesType1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", (defaultSeriesType1 != null) ? defaultSeriesType1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetDefaultSeriesType1() {
        if (!setDefaultSeriesType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setDefaultSeriesType1) {
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

    private PolarSeriesBase getGetSeries;

    public PolarSeriesBase getGetSeries(Double id) {
        if (getGetSeries == null)
            getGetSeries = new PolarSeriesBase(jsBase + ".getSeries("+ id+")");

        return getGetSeries;
    }

    private PolarSeriesBase getGetSeries1;

    public PolarSeriesBase getGetSeries(String id1) {
        if (getGetSeries1 == null)
            getGetSeries1 = new PolarSeriesBase(jsBase + ".getSeries("+ id1+")");

        return getGetSeries1;
    }

    private PolarSeriesBase getGetSeriesAt;

    public PolarSeriesBase getGetSeriesAt(Double index) {
        if (getGetSeriesAt == null)
            getGetSeriesAt = new PolarSeriesBase(jsBase + ".getSeriesAt("+ index+")");

        return getGetSeriesAt;
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
    private List<ChartsPolar> setHatchFillPalette = new ArrayList<>();

    public ChartsPolar setHatchFillPalette(HatchFillType[] hatchFillPalette) {
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
            for (ChartsPolar item : setHatchFillPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setHatchFillPalette1 = new ArrayList<>();

    public ChartsPolar setHatchFillPalette(String hatchFillPalette1) {
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
            for (ChartsPolar item : setHatchFillPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setHatchFillPalette2 = new ArrayList<>();

    public ChartsPolar setHatchFillPalette(HatchFills hatchFillPalette2) {
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
            for (ChartsPolar item : setHatchFillPalette2) {
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
    private List<ChartsPolar> setHovered = new ArrayList<>();

    public ChartsPolar setHovered(String hovered) {
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
            for (ChartsPolar item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double innerRadius;
    private String innerRadius1;
    private List<ChartsPolar> setInnerRadius = new ArrayList<>();

    public ChartsPolar setInnerRadius(Double innerRadius) {
        this.innerRadius = innerRadius;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".innerRadius(%f)", innerRadius));

//        js.append(String.format(Locale.US, ".innerRadius(%f)", innerRadius));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".innerRadius(%f)", innerRadius));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetInnerRadius() {
        if (!setInnerRadius.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setInnerRadius) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setInnerRadius1 = new ArrayList<>();

    public ChartsPolar setInnerRadius(String innerRadius1) {
        this.innerRadius1 = innerRadius1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".innerRadius(%s)", innerRadius1));

//        js.append(String.format(Locale.US, ".innerRadius(%s)", innerRadius1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".innerRadius(%s)", innerRadius1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetInnerRadius1() {
        if (!setInnerRadius1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setInnerRadius1) {
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
    private List<ChartsPolar> setLabels = new ArrayList<>();

    public ChartsPolar setLabels(String labels) {
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
            for (ChartsPolar item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setLabels1 = new ArrayList<>();

    public ChartsPolar setLabels(Boolean labels1) {
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
            for (ChartsPolar item : setLabels1) {
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
    private TextParsingMode csvSettings4;
    private TextParsingSettings csvSettings5;
    private List<PolarSeriesLine> setLine = new ArrayList<>();

    public PolarSeriesLine line(View data7, TextParsingMode csvSettings4) {
        this.data7 = data7;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data7 != null) ? data7.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data7 != null) ? data7.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data7 != null) ? data7.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesLine item = new PolarSeriesLine("setLine" + variableIndex);
        setLine.add(item);
        return item;
    }
    private String generateJSsetLine() {
        if (!setLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesLine item : setLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesLine> setLine1 = new ArrayList<>();

    public PolarSeriesLine line(View data7, TextParsingSettings csvSettings5) {
        this.data7 = data7;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine1" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data7 != null) ? data7.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data7 != null) ? data7.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data7 != null) ? data7.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesLine item = new PolarSeriesLine("setLine1" + variableIndex);
        setLine1.add(item);
        return item;
    }
    private String generateJSsetLine1() {
        if (!setLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesLine item : setLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesLine> setLine2 = new ArrayList<>();

    public PolarSeriesLine line(Set data8, TextParsingMode csvSettings4) {
        this.data8 = data8;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data8 != null) ? data8.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesLine item = new PolarSeriesLine("setLine2" + variableIndex);
        setLine2.add(item);
        return item;
    }
    private String generateJSsetLine2() {
        if (!setLine2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesLine item : setLine2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesLine> setLine3 = new ArrayList<>();

    public PolarSeriesLine line(Set data8, TextParsingSettings csvSettings5) {
        this.data8 = data8;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine3" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data8 != null) ? data8.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesLine item = new PolarSeriesLine("setLine3" + variableIndex);
        setLine3.add(item);
        return item;
    }
    private String generateJSsetLine3() {
        if (!setLine3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesLine item : setLine3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesLine> setLine4 = new ArrayList<>();

    public PolarSeriesLine line(String[] data9, TextParsingMode csvSettings4) {
        this.data9 = data9;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine4" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data9), (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", Arrays.toString(data9), (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data9), (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesLine item = new PolarSeriesLine("setLine4" + variableIndex);
        setLine4.add(item);
        return item;
    }
    private String generateJSsetLine4() {
        if (!setLine4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesLine item : setLine4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesLine> setLine5 = new ArrayList<>();

    public PolarSeriesLine line(String[] data9, TextParsingSettings csvSettings5) {
        this.data9 = data9;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine5" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data9), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", Arrays.toString(data9), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data9), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesLine item = new PolarSeriesLine("setLine5" + variableIndex);
        setLine5.add(item);
        return item;
    }
    private String generateJSsetLine5() {
        if (!setLine5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesLine item : setLine5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesLine> setLine6 = new ArrayList<>();

    public PolarSeriesLine line(String data10, TextParsingMode csvSettings4) {
        this.data10 = data10;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine6" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data10, (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", data10, (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data10, (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesLine item = new PolarSeriesLine("setLine6" + variableIndex);
        setLine6.add(item);
        return item;
    }
    private String generateJSsetLine6() {
        if (!setLine6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesLine item : setLine6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesLine> setLine7 = new ArrayList<>();

    public PolarSeriesLine line(String data10, TextParsingSettings csvSettings5) {
        this.data10 = data10;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine7" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data10, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", data10, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data10, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesLine item = new PolarSeriesLine("setLine7" + variableIndex);
        setLine7.add(item);
        return item;
    }
    private String generateJSsetLine7() {
        if (!setLine7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesLine item : setLine7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data11;
    private Set data12;
    private String[] data13;
    private String data14;
    private TextParsingMode csvSettings6;
    private TextParsingSettings csvSettings7;
    private List<PolarSeriesMarker> setMarker = new ArrayList<>();

    public PolarSeriesMarker marker(View data11, TextParsingMode csvSettings6) {
        this.data11 = data11;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data11 != null) ? data11.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", (data11 != null) ? data11.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data11 != null) ? data11.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesMarker item = new PolarSeriesMarker("setMarker" + variableIndex);
        setMarker.add(item);
        return item;
    }
    private String generateJSsetMarker() {
        if (!setMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesMarker item : setMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesMarker> setMarker1 = new ArrayList<>();

    public PolarSeriesMarker marker(View data11, TextParsingSettings csvSettings7) {
        this.data11 = data11;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker1" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data11 != null) ? data11.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", (data11 != null) ? data11.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data11 != null) ? data11.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesMarker item = new PolarSeriesMarker("setMarker1" + variableIndex);
        setMarker1.add(item);
        return item;
    }
    private String generateJSsetMarker1() {
        if (!setMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesMarker item : setMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesMarker> setMarker2 = new ArrayList<>();

    public PolarSeriesMarker marker(Set data12, TextParsingMode csvSettings6) {
        this.data12 = data12;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker2" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data12 != null) ? data12.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", (data12 != null) ? data12.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data12 != null) ? data12.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesMarker item = new PolarSeriesMarker("setMarker2" + variableIndex);
        setMarker2.add(item);
        return item;
    }
    private String generateJSsetMarker2() {
        if (!setMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesMarker item : setMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesMarker> setMarker3 = new ArrayList<>();

    public PolarSeriesMarker marker(Set data12, TextParsingSettings csvSettings7) {
        this.data12 = data12;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker3" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data12 != null) ? data12.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", (data12 != null) ? data12.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data12 != null) ? data12.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesMarker item = new PolarSeriesMarker("setMarker3" + variableIndex);
        setMarker3.add(item);
        return item;
    }
    private String generateJSsetMarker3() {
        if (!setMarker3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesMarker item : setMarker3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesMarker> setMarker4 = new ArrayList<>();

    public PolarSeriesMarker marker(String[] data13, TextParsingMode csvSettings6) {
        this.data13 = data13;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker4" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data13), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", Arrays.toString(data13), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data13), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesMarker item = new PolarSeriesMarker("setMarker4" + variableIndex);
        setMarker4.add(item);
        return item;
    }
    private String generateJSsetMarker4() {
        if (!setMarker4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesMarker item : setMarker4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesMarker> setMarker5 = new ArrayList<>();

    public PolarSeriesMarker marker(String[] data13, TextParsingSettings csvSettings7) {
        this.data13 = data13;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker5" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data13), (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", Arrays.toString(data13), (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data13), (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesMarker item = new PolarSeriesMarker("setMarker5" + variableIndex);
        setMarker5.add(item);
        return item;
    }
    private String generateJSsetMarker5() {
        if (!setMarker5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesMarker item : setMarker5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesMarker> setMarker6 = new ArrayList<>();

    public PolarSeriesMarker marker(String data14, TextParsingMode csvSettings6) {
        this.data14 = data14;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker6" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data14, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", data14, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data14, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesMarker item = new PolarSeriesMarker("setMarker6" + variableIndex);
        setMarker6.add(item);
        return item;
    }
    private String generateJSsetMarker6() {
        if (!setMarker6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesMarker item : setMarker6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesMarker> setMarker7 = new ArrayList<>();

    public PolarSeriesMarker marker(String data14, TextParsingSettings csvSettings7) {
        this.data14 = data14;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker7" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data14, (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", data14, (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data14, (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesMarker item = new PolarSeriesMarker("setMarker7" + variableIndex);
        setMarker7.add(item);
        return item;
    }
    private String generateJSsetMarker7() {
        if (!setMarker7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesMarker item : setMarker7) {
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
    private List<ChartsPolar> setMarkerPalette = new ArrayList<>();

    public ChartsPolar setMarkerPalette(Markers markerPalette) {
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
            for (ChartsPolar item : setMarkerPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setMarkerPalette1 = new ArrayList<>();

    public ChartsPolar setMarkerPalette(String markerPalette1) {
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
            for (ChartsPolar item : setMarkerPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setMarkerPalette2 = new ArrayList<>();

    public ChartsPolar setMarkerPalette(MarkerType[] markerPalette2) {
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
            for (ChartsPolar item : setMarkerPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxPointWidth;
    private String maxPointWidth1;
    private List<ChartsPolar> setMaxPointWidth = new ArrayList<>();

    public ChartsPolar setMaxPointWidth(Double maxPointWidth) {
        this.maxPointWidth = maxPointWidth;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));

//        js.append(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMaxPointWidth() {
        if (!setMaxPointWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setMaxPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setMaxPointWidth1 = new ArrayList<>();

    public ChartsPolar setMaxPointWidth(String maxPointWidth1) {
        this.maxPointWidth1 = maxPointWidth1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth1));

//        js.append(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMaxPointWidth1() {
        if (!setMaxPointWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setMaxPointWidth1) {
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
    private List<ChartsPolar> setNormal = new ArrayList<>();

    public ChartsPolar setNormal(String normal) {
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
            for (ChartsPolar item : setNormal) {
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
    private List<ChartsPolar> setPalette = new ArrayList<>();

    public ChartsPolar setPalette(RangeColors palette) {
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
            for (ChartsPolar item : setPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setPalette1 = new ArrayList<>();

    public ChartsPolar setPalette(DistinctColors palette1) {
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
            for (ChartsPolar item : setPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setPalette2 = new ArrayList<>();

    public ChartsPolar setPalette(String palette2) {
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
            for (ChartsPolar item : setPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setPalette3 = new ArrayList<>();

    public ChartsPolar setPalette(String[] palette3) {
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
            for (ChartsPolar item : setPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double pointWidth;
    private String pointWidth1;
    private List<ChartsPolar> setPointWidth = new ArrayList<>();

    public ChartsPolar setPointWidth(Double pointWidth) {
        this.pointWidth = pointWidth;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointWidth(%f)", pointWidth));

//        js.append(String.format(Locale.US, ".pointWidth(%f)", pointWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%f)", pointWidth));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPointWidth() {
        if (!setPointWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setPointWidth1 = new ArrayList<>();

    public ChartsPolar setPointWidth(String pointWidth1) {
        this.pointWidth1 = pointWidth1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointWidth(%s)", pointWidth1));

//        js.append(String.format(Locale.US, ".pointWidth(%s)", pointWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", pointWidth1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPointWidth1() {
        if (!setPointWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setPointWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data15;
    private Set data16;
    private String[] data17;
    private String data18;
    private TextParsingMode csvSettings8;
    private TextParsingSettings csvSettings9;
    private List<Polygon> setPolygon = new ArrayList<>();

    public Polygon polygon(View data15, TextParsingMode csvSettings8) {
        this.data15 = data15;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolygon" + ++variableIndex + " = " + jsBase + ".polygon(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polygon(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polygon(%s, %s)", (data15 != null) ? data15.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        Polygon item = new Polygon("setPolygon" + variableIndex);
        setPolygon.add(item);
        return item;
    }
    private String generateJSsetPolygon() {
        if (!setPolygon.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polygon item : setPolygon) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polygon> setPolygon1 = new ArrayList<>();

    public Polygon polygon(View data15, TextParsingSettings csvSettings9) {
        this.data15 = data15;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolygon1" + ++variableIndex + " = " + jsBase + ".polygon(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polygon(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polygon(%s, %s)", (data15 != null) ? data15.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        Polygon item = new Polygon("setPolygon1" + variableIndex);
        setPolygon1.add(item);
        return item;
    }
    private String generateJSsetPolygon1() {
        if (!setPolygon1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polygon item : setPolygon1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polygon> setPolygon2 = new ArrayList<>();

    public Polygon polygon(Set data16, TextParsingMode csvSettings8) {
        this.data16 = data16;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolygon2" + ++variableIndex + " = " + jsBase + ".polygon(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polygon(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polygon(%s, %s)", (data16 != null) ? data16.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        Polygon item = new Polygon("setPolygon2" + variableIndex);
        setPolygon2.add(item);
        return item;
    }
    private String generateJSsetPolygon2() {
        if (!setPolygon2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polygon item : setPolygon2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polygon> setPolygon3 = new ArrayList<>();

    public Polygon polygon(Set data16, TextParsingSettings csvSettings9) {
        this.data16 = data16;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolygon3" + ++variableIndex + " = " + jsBase + ".polygon(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polygon(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polygon(%s, %s)", (data16 != null) ? data16.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        Polygon item = new Polygon("setPolygon3" + variableIndex);
        setPolygon3.add(item);
        return item;
    }
    private String generateJSsetPolygon3() {
        if (!setPolygon3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polygon item : setPolygon3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polygon> setPolygon4 = new ArrayList<>();

    public Polygon polygon(String[] data17, TextParsingMode csvSettings8) {
        this.data17 = data17;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolygon4" + ++variableIndex + " = " + jsBase + ".polygon(%s, %s);", Arrays.toString(data17), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polygon(%s, %s);", Arrays.toString(data17), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polygon(%s, %s)", Arrays.toString(data17), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        Polygon item = new Polygon("setPolygon4" + variableIndex);
        setPolygon4.add(item);
        return item;
    }
    private String generateJSsetPolygon4() {
        if (!setPolygon4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polygon item : setPolygon4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polygon> setPolygon5 = new ArrayList<>();

    public Polygon polygon(String[] data17, TextParsingSettings csvSettings9) {
        this.data17 = data17;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolygon5" + ++variableIndex + " = " + jsBase + ".polygon(%s, %s);", Arrays.toString(data17), (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polygon(%s, %s);", Arrays.toString(data17), (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polygon(%s, %s)", Arrays.toString(data17), (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        Polygon item = new Polygon("setPolygon5" + variableIndex);
        setPolygon5.add(item);
        return item;
    }
    private String generateJSsetPolygon5() {
        if (!setPolygon5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polygon item : setPolygon5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polygon> setPolygon6 = new ArrayList<>();

    public Polygon polygon(String data18, TextParsingMode csvSettings8) {
        this.data18 = data18;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolygon6" + ++variableIndex + " = " + jsBase + ".polygon(%s, %s);", data18, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polygon(%s, %s);", data18, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polygon(%s, %s)", data18, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        Polygon item = new Polygon("setPolygon6" + variableIndex);
        setPolygon6.add(item);
        return item;
    }
    private String generateJSsetPolygon6() {
        if (!setPolygon6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polygon item : setPolygon6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polygon> setPolygon7 = new ArrayList<>();

    public Polygon polygon(String data18, TextParsingSettings csvSettings9) {
        this.data18 = data18;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolygon7" + ++variableIndex + " = " + jsBase + ".polygon(%s, %s);", data18, (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polygon(%s, %s);", data18, (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polygon(%s, %s)", data18, (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        Polygon item = new Polygon("setPolygon7" + variableIndex);
        setPolygon7.add(item);
        return item;
    }
    private String generateJSsetPolygon7() {
        if (!setPolygon7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polygon item : setPolygon7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data19;
    private Set data20;
    private String[] data21;
    private String data22;
    private TextParsingMode csvSettings10;
    private TextParsingSettings csvSettings11;
    private List<Polyline> setPolyline = new ArrayList<>();

    public Polyline polyline(View data19, TextParsingMode csvSettings10) {
        this.data19 = data19;
        this.csvSettings10 = csvSettings10;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolyline" + ++variableIndex + " = " + jsBase + ".polyline(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polyline(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polyline(%s, %s)", (data19 != null) ? data19.generateJs() : "null", (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));
            js.setLength(0);
        }
        Polyline item = new Polyline("setPolyline" + variableIndex);
        setPolyline.add(item);
        return item;
    }
    private String generateJSsetPolyline() {
        if (!setPolyline.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polyline item : setPolyline) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polyline> setPolyline1 = new ArrayList<>();

    public Polyline polyline(View data19, TextParsingSettings csvSettings11) {
        this.data19 = data19;
        this.csvSettings11 = csvSettings11;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolyline1" + ++variableIndex + " = " + jsBase + ".polyline(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polyline(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polyline(%s, %s)", (data19 != null) ? data19.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
        Polyline item = new Polyline("setPolyline1" + variableIndex);
        setPolyline1.add(item);
        return item;
    }
    private String generateJSsetPolyline1() {
        if (!setPolyline1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polyline item : setPolyline1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polyline> setPolyline2 = new ArrayList<>();

    public Polyline polyline(Set data20, TextParsingMode csvSettings10) {
        this.data20 = data20;
        this.csvSettings10 = csvSettings10;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolyline2" + ++variableIndex + " = " + jsBase + ".polyline(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polyline(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polyline(%s, %s)", (data20 != null) ? data20.generateJs() : "null", (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));
            js.setLength(0);
        }
        Polyline item = new Polyline("setPolyline2" + variableIndex);
        setPolyline2.add(item);
        return item;
    }
    private String generateJSsetPolyline2() {
        if (!setPolyline2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polyline item : setPolyline2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polyline> setPolyline3 = new ArrayList<>();

    public Polyline polyline(Set data20, TextParsingSettings csvSettings11) {
        this.data20 = data20;
        this.csvSettings11 = csvSettings11;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolyline3" + ++variableIndex + " = " + jsBase + ".polyline(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polyline(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polyline(%s, %s)", (data20 != null) ? data20.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
        Polyline item = new Polyline("setPolyline3" + variableIndex);
        setPolyline3.add(item);
        return item;
    }
    private String generateJSsetPolyline3() {
        if (!setPolyline3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polyline item : setPolyline3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polyline> setPolyline4 = new ArrayList<>();

    public Polyline polyline(String[] data21, TextParsingMode csvSettings10) {
        this.data21 = data21;
        this.csvSettings10 = csvSettings10;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolyline4" + ++variableIndex + " = " + jsBase + ".polyline(%s, %s);", Arrays.toString(data21), (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polyline(%s, %s);", Arrays.toString(data21), (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polyline(%s, %s)", Arrays.toString(data21), (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));
            js.setLength(0);
        }
        Polyline item = new Polyline("setPolyline4" + variableIndex);
        setPolyline4.add(item);
        return item;
    }
    private String generateJSsetPolyline4() {
        if (!setPolyline4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polyline item : setPolyline4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polyline> setPolyline5 = new ArrayList<>();

    public Polyline polyline(String[] data21, TextParsingSettings csvSettings11) {
        this.data21 = data21;
        this.csvSettings11 = csvSettings11;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolyline5" + ++variableIndex + " = " + jsBase + ".polyline(%s, %s);", Arrays.toString(data21), (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polyline(%s, %s);", Arrays.toString(data21), (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polyline(%s, %s)", Arrays.toString(data21), (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
        Polyline item = new Polyline("setPolyline5" + variableIndex);
        setPolyline5.add(item);
        return item;
    }
    private String generateJSsetPolyline5() {
        if (!setPolyline5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polyline item : setPolyline5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polyline> setPolyline6 = new ArrayList<>();

    public Polyline polyline(String data22, TextParsingMode csvSettings10) {
        this.data22 = data22;
        this.csvSettings10 = csvSettings10;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolyline6" + ++variableIndex + " = " + jsBase + ".polyline(%s, %s);", data22, (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polyline(%s, %s);", data22, (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polyline(%s, %s)", data22, (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));
            js.setLength(0);
        }
        Polyline item = new Polyline("setPolyline6" + variableIndex);
        setPolyline6.add(item);
        return item;
    }
    private String generateJSsetPolyline6() {
        if (!setPolyline6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polyline item : setPolyline6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Polyline> setPolyline7 = new ArrayList<>();

    public Polyline polyline(String data22, TextParsingSettings csvSettings11) {
        this.data22 = data22;
        this.csvSettings11 = csvSettings11;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setPolyline7" + ++variableIndex + " = " + jsBase + ".polyline(%s, %s);", data22, (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".polyline(%s, %s);", data22, (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polyline(%s, %s)", data22, (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
        Polyline item = new Polyline("setPolyline7" + variableIndex);
        setPolyline7.add(item);
        return item;
    }
    private String generateJSsetPolyline7() {
        if (!setPolyline7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Polyline item : setPolyline7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data23;
    private Set data24;
    private String[] data25;
    private String data26;
    private TextParsingMode csvSettings12;
    private TextParsingSettings csvSettings13;
    private List<PolarSeriesRangeColumn> setRangeColumn = new ArrayList<>();

    public PolarSeriesRangeColumn rangeColumn(View data23, TextParsingMode csvSettings12) {
        this.data23 = data23;
        this.csvSettings12 = csvSettings12;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", (data23 != null) ? data23.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s);", (data23 != null) ? data23.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", (data23 != null) ? data23.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesRangeColumn item = new PolarSeriesRangeColumn("setRangeColumn" + variableIndex);
        setRangeColumn.add(item);
        return item;
    }
    private String generateJSsetRangeColumn() {
        if (!setRangeColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesRangeColumn item : setRangeColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesRangeColumn> setRangeColumn1 = new ArrayList<>();

    public PolarSeriesRangeColumn rangeColumn(View data23, TextParsingSettings csvSettings13) {
        this.data23 = data23;
        this.csvSettings13 = csvSettings13;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn1" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", (data23 != null) ? data23.generateJs() : "null", (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s);", (data23 != null) ? data23.generateJs() : "null", (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", (data23 != null) ? data23.generateJs() : "null", (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesRangeColumn item = new PolarSeriesRangeColumn("setRangeColumn1" + variableIndex);
        setRangeColumn1.add(item);
        return item;
    }
    private String generateJSsetRangeColumn1() {
        if (!setRangeColumn1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesRangeColumn item : setRangeColumn1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesRangeColumn> setRangeColumn2 = new ArrayList<>();

    public PolarSeriesRangeColumn rangeColumn(Set data24, TextParsingMode csvSettings12) {
        this.data24 = data24;
        this.csvSettings12 = csvSettings12;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn2" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", (data24 != null) ? data24.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s);", (data24 != null) ? data24.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", (data24 != null) ? data24.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesRangeColumn item = new PolarSeriesRangeColumn("setRangeColumn2" + variableIndex);
        setRangeColumn2.add(item);
        return item;
    }
    private String generateJSsetRangeColumn2() {
        if (!setRangeColumn2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesRangeColumn item : setRangeColumn2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesRangeColumn> setRangeColumn3 = new ArrayList<>();

    public PolarSeriesRangeColumn rangeColumn(Set data24, TextParsingSettings csvSettings13) {
        this.data24 = data24;
        this.csvSettings13 = csvSettings13;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn3" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", (data24 != null) ? data24.generateJs() : "null", (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s);", (data24 != null) ? data24.generateJs() : "null", (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", (data24 != null) ? data24.generateJs() : "null", (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesRangeColumn item = new PolarSeriesRangeColumn("setRangeColumn3" + variableIndex);
        setRangeColumn3.add(item);
        return item;
    }
    private String generateJSsetRangeColumn3() {
        if (!setRangeColumn3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesRangeColumn item : setRangeColumn3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesRangeColumn> setRangeColumn4 = new ArrayList<>();

    public PolarSeriesRangeColumn rangeColumn(String[] data25, TextParsingMode csvSettings12) {
        this.data25 = data25;
        this.csvSettings12 = csvSettings12;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn4" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", Arrays.toString(data25), (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s);", Arrays.toString(data25), (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", Arrays.toString(data25), (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesRangeColumn item = new PolarSeriesRangeColumn("setRangeColumn4" + variableIndex);
        setRangeColumn4.add(item);
        return item;
    }
    private String generateJSsetRangeColumn4() {
        if (!setRangeColumn4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesRangeColumn item : setRangeColumn4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesRangeColumn> setRangeColumn5 = new ArrayList<>();

    public PolarSeriesRangeColumn rangeColumn(String[] data25, TextParsingSettings csvSettings13) {
        this.data25 = data25;
        this.csvSettings13 = csvSettings13;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn5" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", Arrays.toString(data25), (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s);", Arrays.toString(data25), (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", Arrays.toString(data25), (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesRangeColumn item = new PolarSeriesRangeColumn("setRangeColumn5" + variableIndex);
        setRangeColumn5.add(item);
        return item;
    }
    private String generateJSsetRangeColumn5() {
        if (!setRangeColumn5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesRangeColumn item : setRangeColumn5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesRangeColumn> setRangeColumn6 = new ArrayList<>();

    public PolarSeriesRangeColumn rangeColumn(String data26, TextParsingMode csvSettings12) {
        this.data26 = data26;
        this.csvSettings12 = csvSettings12;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn6" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", data26, (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s);", data26, (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", data26, (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesRangeColumn item = new PolarSeriesRangeColumn("setRangeColumn6" + variableIndex);
        setRangeColumn6.add(item);
        return item;
    }
    private String generateJSsetRangeColumn6() {
        if (!setRangeColumn6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesRangeColumn item : setRangeColumn6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesRangeColumn> setRangeColumn7 = new ArrayList<>();

    public PolarSeriesRangeColumn rangeColumn(String data26, TextParsingSettings csvSettings13) {
        this.data26 = data26;
        this.csvSettings13 = csvSettings13;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn7" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", data26, (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s);", data26, (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", data26, (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));
            js.setLength(0);
        }
        PolarSeriesRangeColumn item = new PolarSeriesRangeColumn("setRangeColumn7" + variableIndex);
        setRangeColumn7.add(item);
        return item;
    }
    private String generateJSsetRangeColumn7() {
        if (!setRangeColumn7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesRangeColumn item : setRangeColumn7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double id2;
    private String id3;
    private List<ChartsPolar> setRemoveSeries = new ArrayList<>();

    public ChartsPolar removeSeries(Double id2) {
        this.id2 = id2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeries(%f)", id2));

//        js.append(String.format(Locale.US, ".removeSeries(%f)", id2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%f)", id2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRemoveSeries() {
        if (!setRemoveSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setRemoveSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setRemoveSeries1 = new ArrayList<>();

    public ChartsPolar removeSeries(String id3) {
        this.id3 = id3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeries(%s)", id3));

//        js.append(String.format(Locale.US, ".removeSeries(%s)", id3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%s)", id3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRemoveSeries1() {
        if (!setRemoveSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setRemoveSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private List<ChartsPolar> setRemoveSeriesAt = new ArrayList<>();

    public ChartsPolar removeSeriesAt(Double index1) {
        this.index1 = index1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeriesAt(%f)", index1));

//        js.append(String.format(Locale.US, ".removeSeriesAt(%f)", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeriesAt(%f)", index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRemoveSeriesAt() {
        if (!setRemoveSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setRemoveSeriesAt) {
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
    private List<ChartsPolar> setSelected = new ArrayList<>();

    public ChartsPolar setSelected(String selected) {
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
            for (ChartsPolar item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean sortPointsByX;
    private List<ChartsPolar> setSortPointsByX = new ArrayList<>();

    public ChartsPolar setSortPointsByX(Boolean sortPointsByX) {
        this.sortPointsByX = sortPointsByX;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".sortPointsByX(%b)", sortPointsByX));

//        js.append(String.format(Locale.US, ".sortPointsByX(%b)", sortPointsByX));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".sortPointsByX(%b)", sortPointsByX));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSortPointsByX() {
        if (!setSortPointsByX.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setSortPointsByX) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String startAngle;
    private Double startAngle1;
    private List<ChartsPolar> setStartAngle = new ArrayList<>();

    public ChartsPolar setStartAngle(String startAngle) {
        this.startAngle = startAngle;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".startAngle(%s)", startAngle));

//        js.append(String.format(Locale.US, ".startAngle(%s)", startAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".startAngle(%s)", startAngle));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStartAngle() {
        if (!setStartAngle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setStartAngle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setStartAngle1 = new ArrayList<>();

    public ChartsPolar setStartAngle(Double startAngle1) {
        this.startAngle1 = startAngle1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".startAngle(%f)", startAngle1));

//        js.append(String.format(Locale.US, ".startAngle(%f)", startAngle1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".startAngle(%f)", startAngle1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStartAngle1() {
        if (!setStartAngle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setStartAngle1) {
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
    private List<ChartsPolar> setXAxis = new ArrayList<>();

    public ChartsPolar setXAxis(String xAxis) {
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
            for (ChartsPolar item : setXAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setXAxis1 = new ArrayList<>();

    public ChartsPolar setXAxis(Boolean xAxis1) {
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
            for (ChartsPolar item : setXAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private CoreGridsPolar getXGrid;

    public CoreGridsPolar getXGrid() {
        if (getXGrid == null)
            getXGrid = new CoreGridsPolar(jsBase + ".xGrid()");

        return getXGrid;
    }

    private CoreGridsPolar getXGrid1;

    public CoreGridsPolar getXGrid(Double index2) {
        if (getXGrid1 == null)
            getXGrid1 = new CoreGridsPolar(jsBase + ".xGrid("+ index2+")");

        return getXGrid1;
    }

    private String xGrid;
    private Boolean xGrid1;
    private List<ChartsPolar> setXGrid = new ArrayList<>();

    public ChartsPolar setXGrid(String xGrid) {
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
            for (ChartsPolar item : setXGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setXGrid1 = new ArrayList<>();

    public ChartsPolar setXGrid(Boolean xGrid1) {
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
            for (ChartsPolar item : setXGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index3;
    private String xGrid2;
    private Boolean xGrid3;
    private List<ChartsPolar> setXGrid2 = new ArrayList<>();

    public ChartsPolar setXGrid(String xGrid2, Double index3) {
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
            for (ChartsPolar item : setXGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setXGrid3 = new ArrayList<>();

    public ChartsPolar setXGrid(Boolean xGrid3, Double index3) {
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
            for (ChartsPolar item : setXGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private CoreGridsPolar getXMinorGrid;

    public CoreGridsPolar getXMinorGrid() {
        if (getXMinorGrid == null)
            getXMinorGrid = new CoreGridsPolar(jsBase + ".xMinorGrid()");

        return getXMinorGrid;
    }

    private CoreGridsPolar getXMinorGrid1;

    public CoreGridsPolar getXMinorGrid(Double index4) {
        if (getXMinorGrid1 == null)
            getXMinorGrid1 = new CoreGridsPolar(jsBase + ".xMinorGrid("+ index4+")");

        return getXMinorGrid1;
    }

    private String xMinorGrid;
    private Boolean xMinorGrid1;
    private List<ChartsPolar> setXMinorGrid = new ArrayList<>();

    public ChartsPolar setXMinorGrid(String xMinorGrid) {
        this.xMinorGrid = xMinorGrid;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%s)", xMinorGrid));

//        js.append(String.format(Locale.US, ".xMinorGrid(%s)", xMinorGrid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s)", xMinorGrid));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXMinorGrid() {
        if (!setXMinorGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setXMinorGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setXMinorGrid1 = new ArrayList<>();

    public ChartsPolar setXMinorGrid(Boolean xMinorGrid1) {
        this.xMinorGrid1 = xMinorGrid1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%b)", xMinorGrid1));

//        js.append(String.format(Locale.US, ".xMinorGrid(%b)", xMinorGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%b)", xMinorGrid1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXMinorGrid1() {
        if (!setXMinorGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setXMinorGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index5;
    private String xMinorGrid2;
    private Boolean xMinorGrid3;
    private List<ChartsPolar> setXMinorGrid2 = new ArrayList<>();

    public ChartsPolar setXMinorGrid(String xMinorGrid2, Double index5) {
        this.xMinorGrid2 = xMinorGrid2;
        this.index5 = index5;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%s, %f)", xMinorGrid2, index5));

//        js.append(String.format(Locale.US, ".xMinorGrid(%s, %f)", xMinorGrid2, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s, %f)", xMinorGrid2, index5));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXMinorGrid2() {
        if (!setXMinorGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setXMinorGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setXMinorGrid3 = new ArrayList<>();

    public ChartsPolar setXMinorGrid(Boolean xMinorGrid3, Double index5) {
        this.xMinorGrid3 = xMinorGrid3;
        this.index5 = index5;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%b, %f)", xMinorGrid3, index5));

//        js.append(String.format(Locale.US, ".xMinorGrid(%b, %f)", xMinorGrid3, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%b, %f)", xMinorGrid3, index5));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXMinorGrid3() {
        if (!setXMinorGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setXMinorGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScatterBase getXScale;

    public ScatterBase getXScale() {
        if (getXScale == null)
            getXScale = new ScatterBase(jsBase + ".xScale()");

        return getXScale;
    }

    private String xScale;
    private String xScale1;
    private ScaleTypes xScale2;
    private ScalesBase xScale3;
    private List<ChartsPolar> setXScale = new ArrayList<>();

    public ChartsPolar setXScale(String xScale) {
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
            for (ChartsPolar item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setXScale1 = new ArrayList<>();

    public ChartsPolar setXScale(ScaleTypes xScale2) {
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
    private String generateJSsetXScale1() {
        if (!setXScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setXScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setXScale2 = new ArrayList<>();

    public ChartsPolar setXScale(ScalesBase xScale3) {
        this.xScale3 = xScale3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", (xScale3 != null) ? xScale3.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".xScale(%s)", (xScale3 != null) ? xScale3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", (xScale3 != null) ? xScale3.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale2() {
        if (!setXScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setXScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private CoreAxesRadial getYAxis;

    public CoreAxesRadial getYAxis() {
        if (getYAxis == null)
            getYAxis = new CoreAxesRadial(jsBase + ".yAxis()");

        return getYAxis;
    }

    private String yAxis;
    private Boolean yAxis1;
    private List<ChartsPolar> setYAxis = new ArrayList<>();

    public ChartsPolar setYAxis(String yAxis) {
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
            for (ChartsPolar item : setYAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setYAxis1 = new ArrayList<>();

    public ChartsPolar setYAxis(Boolean yAxis1) {
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
            for (ChartsPolar item : setYAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private CoreGridsPolar getYGrid;

    public CoreGridsPolar getYGrid() {
        if (getYGrid == null)
            getYGrid = new CoreGridsPolar(jsBase + ".yGrid()");

        return getYGrid;
    }

    private CoreGridsPolar getYGrid1;

    public CoreGridsPolar getYGrid(Double index6) {
        if (getYGrid1 == null)
            getYGrid1 = new CoreGridsPolar(jsBase + ".yGrid("+ index6+")");

        return getYGrid1;
    }

    private String yGrid;
    private Boolean yGrid1;
    private List<ChartsPolar> setYGrid = new ArrayList<>();

    public ChartsPolar setYGrid(String yGrid) {
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
            for (ChartsPolar item : setYGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setYGrid1 = new ArrayList<>();

    public ChartsPolar setYGrid(Boolean yGrid1) {
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
            for (ChartsPolar item : setYGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index7;
    private String yGrid2;
    private Boolean yGrid3;
    private List<ChartsPolar> setYGrid2 = new ArrayList<>();

    public ChartsPolar setYGrid(String yGrid2, Double index7) {
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
            for (ChartsPolar item : setYGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setYGrid3 = new ArrayList<>();

    public ChartsPolar setYGrid(Boolean yGrid3, Double index7) {
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
            for (ChartsPolar item : setYGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private CoreGridsPolar getYMinorGrid;

    public CoreGridsPolar getYMinorGrid() {
        if (getYMinorGrid == null)
            getYMinorGrid = new CoreGridsPolar(jsBase + ".yMinorGrid()");

        return getYMinorGrid;
    }

    private CoreGridsPolar getYMinorGrid1;

    public CoreGridsPolar getYMinorGrid(Double index8) {
        if (getYMinorGrid1 == null)
            getYMinorGrid1 = new CoreGridsPolar(jsBase + ".yMinorGrid("+ index8+")");

        return getYMinorGrid1;
    }

    private String yMinorGrid;
    private Boolean yMinorGrid1;
    private List<ChartsPolar> setYMinorGrid = new ArrayList<>();

    public ChartsPolar setYMinorGrid(String yMinorGrid) {
        this.yMinorGrid = yMinorGrid;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%s)", yMinorGrid));

//        js.append(String.format(Locale.US, ".yMinorGrid(%s)", yMinorGrid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s)", yMinorGrid));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYMinorGrid() {
        if (!setYMinorGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setYMinorGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setYMinorGrid1 = new ArrayList<>();

    public ChartsPolar setYMinorGrid(Boolean yMinorGrid1) {
        this.yMinorGrid1 = yMinorGrid1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%b)", yMinorGrid1));

//        js.append(String.format(Locale.US, ".yMinorGrid(%b)", yMinorGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%b)", yMinorGrid1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYMinorGrid1() {
        if (!setYMinorGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setYMinorGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index9;
    private String yMinorGrid2;
    private Boolean yMinorGrid3;
    private List<ChartsPolar> setYMinorGrid2 = new ArrayList<>();

    public ChartsPolar setYMinorGrid(String yMinorGrid2, Double index9) {
        this.yMinorGrid2 = yMinorGrid2;
        this.index9 = index9;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%s, %f)", yMinorGrid2, index9));

//        js.append(String.format(Locale.US, ".yMinorGrid(%s, %f)", yMinorGrid2, index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s, %f)", yMinorGrid2, index9));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYMinorGrid2() {
        if (!setYMinorGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setYMinorGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setYMinorGrid3 = new ArrayList<>();

    public ChartsPolar setYMinorGrid(Boolean yMinorGrid3, Double index9) {
        this.yMinorGrid3 = yMinorGrid3;
        this.index9 = index9;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%b, %f)", yMinorGrid3, index9));

//        js.append(String.format(Locale.US, ".yMinorGrid(%b, %f)", yMinorGrid3, index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%b, %f)", yMinorGrid3, index9));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYMinorGrid3() {
        if (!setYMinorGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setYMinorGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScatterBase getYScale;

    public ScatterBase getYScale() {
        if (getYScale == null)
            getYScale = new ScatterBase(jsBase + ".yScale()");

        return getYScale;
    }

    private String yScale;
    private String yScale1;
    private ScatterScaleTypes yScale2;
    private ScatterBase yScale3;
    private List<ChartsPolar> setYScale = new ArrayList<>();

    public ChartsPolar setYScale(String yScale) {
        this.yScale = yScale;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", yScale));

//        js.append(String.format(Locale.US, ".yScale(%s)", yScale));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", yScale));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScale() {
        if (!setYScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setYScale1 = new ArrayList<>();

    public ChartsPolar setYScale(ScatterScaleTypes yScale2) {
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
    private String generateJSsetYScale1() {
        if (!setYScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsPolar> setYScale2 = new ArrayList<>();

    public ChartsPolar setYScale(ScatterBase yScale3) {
        this.yScale3 = yScale3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", (yScale3 != null) ? yScale3.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".yScale(%s)", (yScale3 != null) ? yScale3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale3 != null) ? yScale3.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScale2() {
        if (!setYScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsPolar item : setYScale2) {
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
        if (getGetSeries != null) {
            return getGetSeries.generateJs();
        }
        return "";
    }

    private String generateJSgetGetSeries1() {
        if (getGetSeries1 != null) {
            return getGetSeries1.generateJs();
        }
        return "";
    }

    private String generateJSgetGetSeriesAt() {
        if (getGetSeriesAt != null) {
            return getGetSeriesAt.generateJs();
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
        if (getXGrid1 != null) {
            return getXGrid1.generateJs();
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
        if (getXMinorGrid1 != null) {
            return getXMinorGrid1.generateJs();
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
        if (getYGrid1 != null) {
            return getYGrid1.generateJs();
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
        if (getYMinorGrid1 != null) {
            return getYMinorGrid1.generateJs();
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
        js.append(generateJSsetBarGroupsPadding());
        js.append(generateJSsetBarsPadding());
        js.append(generateJSsetColumn());
        js.append(generateJSsetColumn1());
        js.append(generateJSsetColumn2());
        js.append(generateJSsetColumn3());
        js.append(generateJSsetColumn4());
        js.append(generateJSsetColumn5());
        js.append(generateJSsetColumn6());
        js.append(generateJSsetColumn7());
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
        js.append(generateJSsetMarker());
        js.append(generateJSsetMarker1());
        js.append(generateJSsetMarker2());
        js.append(generateJSsetMarker3());
        js.append(generateJSsetMarker4());
        js.append(generateJSsetMarker5());
        js.append(generateJSsetMarker6());
        js.append(generateJSsetMarker7());
        js.append(generateJSsetMarkerPalette());
        js.append(generateJSsetMarkerPalette1());
        js.append(generateJSsetMarkerPalette2());
        js.append(generateJSsetMaxPointWidth());
        js.append(generateJSsetMaxPointWidth1());
        js.append(generateJSsetNormal());
        js.append(generateJSsetPalette());
        js.append(generateJSsetPalette1());
        js.append(generateJSsetPalette2());
        js.append(generateJSsetPalette3());
        js.append(generateJSsetPointWidth());
        js.append(generateJSsetPointWidth1());
        js.append(generateJSsetPolygon());
        js.append(generateJSsetPolygon1());
        js.append(generateJSsetPolygon2());
        js.append(generateJSsetPolygon3());
        js.append(generateJSsetPolygon4());
        js.append(generateJSsetPolygon5());
        js.append(generateJSsetPolygon6());
        js.append(generateJSsetPolygon7());
        js.append(generateJSsetPolyline());
        js.append(generateJSsetPolyline1());
        js.append(generateJSsetPolyline2());
        js.append(generateJSsetPolyline3());
        js.append(generateJSsetPolyline4());
        js.append(generateJSsetPolyline5());
        js.append(generateJSsetPolyline6());
        js.append(generateJSsetPolyline7());
        js.append(generateJSsetRangeColumn());
        js.append(generateJSsetRangeColumn1());
        js.append(generateJSsetRangeColumn2());
        js.append(generateJSsetRangeColumn3());
        js.append(generateJSsetRangeColumn4());
        js.append(generateJSsetRangeColumn5());
        js.append(generateJSsetRangeColumn6());
        js.append(generateJSsetRangeColumn7());
        js.append(generateJSsetRemoveSeries());
        js.append(generateJSsetRemoveSeries1());
        js.append(generateJSsetRemoveSeriesAt());
        js.append(generateJSsetSelected());
        js.append(generateJSsetSortPointsByX());
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
        js.append(generateJSsetXScale1());
        js.append(generateJSsetXScale2());
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

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}