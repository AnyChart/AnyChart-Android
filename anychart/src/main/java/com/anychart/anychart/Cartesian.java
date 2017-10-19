package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class Cartesian extends SeparateChart {

    protected Cartesian(String name) {
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


    private PlotController getAnnotations;

    public PlotController getAnnotations() {
        if (getAnnotations == null)
            getAnnotations = new PlotController(jsBase + ".annotations()");

        return getAnnotations;
    }
    private String[] annotationsList;
    private List<Cartesian> setAnnotations = new ArrayList<>();

    public Cartesian setAnnotations(String[] annotationsList) {
        this.annotationsList = annotationsList;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".annotations(%s)", Arrays.toString(annotationsList)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".annotations(%s)", Arrays.toString(annotationsList)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAnnotations() {
        if (!setAnnotations.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setAnnotations) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data;
    private Set data1;
    private String[] data2;
    private TextParsingMode csvSettings;
    private String csvSettings1;
    private TextParsingSettings csvSettings2;
    private List<CartesianSeriesArea> setArea = new ArrayList<>();

    public CartesianSeriesArea area(View data, TextParsingMode csvSettings) {
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
        CartesianSeriesArea item = new CartesianSeriesArea("setArea" + variableIndex);
        setArea.add(item);
        return item;
    }
    private String generateJSsetArea() {
        if (!setArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesArea item : setArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesArea> setArea1 = new ArrayList<>();

    public CartesianSeriesArea area(View data, String csvSettings1) {
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
        CartesianSeriesArea item = new CartesianSeriesArea("setArea1" + variableIndex);
        setArea1.add(item);
        return item;
    }
    private String generateJSsetArea1() {
        if (!setArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesArea item : setArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesArea> setArea2 = new ArrayList<>();

    public CartesianSeriesArea area(View data, TextParsingSettings csvSettings2) {
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
        CartesianSeriesArea item = new CartesianSeriesArea("setArea2" + variableIndex);
        setArea2.add(item);
        return item;
    }
    private String generateJSsetArea2() {
        if (!setArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesArea item : setArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesArea> setArea3 = new ArrayList<>();

    public CartesianSeriesArea area(Set data1, TextParsingMode csvSettings) {
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
        CartesianSeriesArea item = new CartesianSeriesArea("setArea3" + variableIndex);
        setArea3.add(item);
        return item;
    }
    private String generateJSsetArea3() {
        if (!setArea3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesArea item : setArea3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesArea> setArea4 = new ArrayList<>();

    public CartesianSeriesArea area(Set data1, String csvSettings1) {
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
        CartesianSeriesArea item = new CartesianSeriesArea("setArea4" + variableIndex);
        setArea4.add(item);
        return item;
    }
    private String generateJSsetArea4() {
        if (!setArea4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesArea item : setArea4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesArea> setArea5 = new ArrayList<>();

    public CartesianSeriesArea area(Set data1, TextParsingSettings csvSettings2) {
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
        CartesianSeriesArea item = new CartesianSeriesArea("setArea5" + variableIndex);
        setArea5.add(item);
        return item;
    }
    private String generateJSsetArea5() {
        if (!setArea5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesArea item : setArea5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesArea> setArea6 = new ArrayList<>();

    public CartesianSeriesArea area(String[] data2, TextParsingMode csvSettings) {
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
        CartesianSeriesArea item = new CartesianSeriesArea("setArea6" + variableIndex);
        setArea6.add(item);
        return item;
    }
    private String generateJSsetArea6() {
        if (!setArea6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesArea item : setArea6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesArea> setArea7 = new ArrayList<>();

    public CartesianSeriesArea area(String[] data2, String csvSettings1) {
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
        CartesianSeriesArea item = new CartesianSeriesArea("setArea7" + variableIndex);
        setArea7.add(item);
        return item;
    }
    private String generateJSsetArea7() {
        if (!setArea7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesArea item : setArea7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesArea> setArea8 = new ArrayList<>();

    public CartesianSeriesArea area(String[] data2, TextParsingSettings csvSettings2) {
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
        CartesianSeriesArea item = new CartesianSeriesArea("setArea8" + variableIndex);
        setArea8.add(item);
        return item;
    }
    private String generateJSsetArea8() {
        if (!setArea8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesArea item : setArea8) {
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
    private List<SeriesBar> setBar = new ArrayList<>();

    public SeriesBar bar(View data3, TextParsingMode csvSettings3) {
        this.data3 = data3;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", (data3 != null) ? data3.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar" + variableIndex);
        setBar.add(item);
        return item;
    }
    private String generateJSsetBar() {
        if (!setBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar1 = new ArrayList<>();

    public SeriesBar bar(View data3, String csvSettings4) {
        this.data3 = data3;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar1" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", (data3 != null) ? data3.generateJs() : "null", csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", (data3 != null) ? data3.generateJs() : "null", csvSettings4));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar1" + variableIndex);
        setBar1.add(item);
        return item;
    }
    private String generateJSsetBar1() {
        if (!setBar1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar2 = new ArrayList<>();

    public SeriesBar bar(View data3, TextParsingSettings csvSettings5) {
        this.data3 = data3;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar2" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", (data3 != null) ? data3.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar2" + variableIndex);
        setBar2.add(item);
        return item;
    }
    private String generateJSsetBar2() {
        if (!setBar2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar3 = new ArrayList<>();

    public SeriesBar bar(Set data4, TextParsingMode csvSettings3) {
        this.data4 = data4;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar3" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar3" + variableIndex);
        setBar3.add(item);
        return item;
    }
    private String generateJSsetBar3() {
        if (!setBar3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar4 = new ArrayList<>();

    public SeriesBar bar(Set data4, String csvSettings4) {
        this.data4 = data4;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar4" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", (data4 != null) ? data4.generateJs() : "null", csvSettings4));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar4" + variableIndex);
        setBar4.add(item);
        return item;
    }
    private String generateJSsetBar4() {
        if (!setBar4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar5 = new ArrayList<>();

    public SeriesBar bar(Set data4, TextParsingSettings csvSettings5) {
        this.data4 = data4;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar5" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar5" + variableIndex);
        setBar5.add(item);
        return item;
    }
    private String generateJSsetBar5() {
        if (!setBar5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar6 = new ArrayList<>();

    public SeriesBar bar(String[] data5, TextParsingMode csvSettings3) {
        this.data5 = data5;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar6" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", Arrays.toString(data5), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", Arrays.toString(data5), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar6" + variableIndex);
        setBar6.add(item);
        return item;
    }
    private String generateJSsetBar6() {
        if (!setBar6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar7 = new ArrayList<>();

    public SeriesBar bar(String[] data5, String csvSettings4) {
        this.data5 = data5;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar7" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", Arrays.toString(data5), csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", Arrays.toString(data5), csvSettings4));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar7" + variableIndex);
        setBar7.add(item);
        return item;
    }
    private String generateJSsetBar7() {
        if (!setBar7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar8 = new ArrayList<>();

    public SeriesBar bar(String[] data5, TextParsingSettings csvSettings5) {
        this.data5 = data5;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar8" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", Arrays.toString(data5), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", Arrays.toString(data5), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar8" + variableIndex);
        setBar8.add(item);
        return item;
    }
    private String generateJSsetBar8() {
        if (!setBar8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar9 = new ArrayList<>();

    public SeriesBar bar(String data6, TextParsingMode csvSettings3) {
        this.data6 = data6;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar9" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", data6, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", data6, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar9" + variableIndex);
        setBar9.add(item);
        return item;
    }
    private String generateJSsetBar9() {
        if (!setBar9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar10 = new ArrayList<>();

    public SeriesBar bar(String data6, String csvSettings4) {
        this.data6 = data6;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar10" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", data6, csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", data6, csvSettings4));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar10" + variableIndex);
        setBar10.add(item);
        return item;
    }
    private String generateJSsetBar10() {
        if (!setBar10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar11 = new ArrayList<>();

    public SeriesBar bar(String data6, TextParsingSettings csvSettings5) {
        this.data6 = data6;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar11" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", data6, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", data6, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar11" + variableIndex);
        setBar11.add(item);
        return item;
    }
    private String generateJSsetBar11() {
        if (!setBar11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double barGroupsPadding;
    private List<Cartesian> setBarGroupsPadding = new ArrayList<>();

    public Cartesian setBarGroupsPadding(Double barGroupsPadding) {
        this.barGroupsPadding = barGroupsPadding;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".barGroupsPadding(%f)", barGroupsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".barGroupsPadding(%f)", barGroupsPadding));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetBarGroupsPadding() {
        if (!setBarGroupsPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setBarGroupsPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double barsPadding;
    private List<Cartesian> setBarsPadding = new ArrayList<>();

    public Cartesian setBarsPadding(Double barsPadding) {
        this.barsPadding = barsPadding;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".barsPadding(%f)", barsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".barsPadding(%f)", barsPadding));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetBarsPadding() {
        if (!setBarsPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setBarsPadding) {
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
    private List<Box> setBox = new ArrayList<>();

    public Box box(View data7, TextParsingMode csvSettings6) {
        this.data7 = data7;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBox" + ++variableIndex + " = " + jsBase + ".box(%s, %s);", (data7 != null) ? data7.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s, %s)", (data7 != null) ? data7.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        Box item = new Box("setBox" + variableIndex);
        setBox.add(item);
        return item;
    }
    private String generateJSsetBox() {
        if (!setBox.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Box> setBox1 = new ArrayList<>();

    public Box box(View data7, String csvSettings7) {
        this.data7 = data7;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBox1" + ++variableIndex + " = " + jsBase + ".box(%s, %s);", (data7 != null) ? data7.generateJs() : "null", csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s, %s)", (data7 != null) ? data7.generateJs() : "null", csvSettings7));
            js.setLength(0);
        }
        Box item = new Box("setBox1" + variableIndex);
        setBox1.add(item);
        return item;
    }
    private String generateJSsetBox1() {
        if (!setBox1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Box> setBox2 = new ArrayList<>();

    public Box box(View data7, TextParsingSettings csvSettings8) {
        this.data7 = data7;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBox2" + ++variableIndex + " = " + jsBase + ".box(%s, %s);", (data7 != null) ? data7.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s, %s)", (data7 != null) ? data7.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        Box item = new Box("setBox2" + variableIndex);
        setBox2.add(item);
        return item;
    }
    private String generateJSsetBox2() {
        if (!setBox2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Box> setBox3 = new ArrayList<>();

    public Box box(Set data8, TextParsingMode csvSettings6) {
        this.data8 = data8;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBox3" + ++variableIndex + " = " + jsBase + ".box(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s, %s)", (data8 != null) ? data8.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        Box item = new Box("setBox3" + variableIndex);
        setBox3.add(item);
        return item;
    }
    private String generateJSsetBox3() {
        if (!setBox3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Box> setBox4 = new ArrayList<>();

    public Box box(Set data8, String csvSettings7) {
        this.data8 = data8;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBox4" + ++variableIndex + " = " + jsBase + ".box(%s, %s);", (data8 != null) ? data8.generateJs() : "null", csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s, %s)", (data8 != null) ? data8.generateJs() : "null", csvSettings7));
            js.setLength(0);
        }
        Box item = new Box("setBox4" + variableIndex);
        setBox4.add(item);
        return item;
    }
    private String generateJSsetBox4() {
        if (!setBox4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Box> setBox5 = new ArrayList<>();

    public Box box(Set data8, TextParsingSettings csvSettings8) {
        this.data8 = data8;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBox5" + ++variableIndex + " = " + jsBase + ".box(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s, %s)", (data8 != null) ? data8.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        Box item = new Box("setBox5" + variableIndex);
        setBox5.add(item);
        return item;
    }
    private String generateJSsetBox5() {
        if (!setBox5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Box> setBox6 = new ArrayList<>();

    public Box box(String[] data9, TextParsingMode csvSettings6) {
        this.data9 = data9;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBox6" + ++variableIndex + " = " + jsBase + ".box(%s, %s);", Arrays.toString(data9), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s, %s)", Arrays.toString(data9), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        Box item = new Box("setBox6" + variableIndex);
        setBox6.add(item);
        return item;
    }
    private String generateJSsetBox6() {
        if (!setBox6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Box> setBox7 = new ArrayList<>();

    public Box box(String[] data9, String csvSettings7) {
        this.data9 = data9;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBox7" + ++variableIndex + " = " + jsBase + ".box(%s, %s);", Arrays.toString(data9), csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s, %s)", Arrays.toString(data9), csvSettings7));
            js.setLength(0);
        }
        Box item = new Box("setBox7" + variableIndex);
        setBox7.add(item);
        return item;
    }
    private String generateJSsetBox7() {
        if (!setBox7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Box> setBox8 = new ArrayList<>();

    public Box box(String[] data9, TextParsingSettings csvSettings8) {
        this.data9 = data9;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBox8" + ++variableIndex + " = " + jsBase + ".box(%s, %s);", Arrays.toString(data9), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s, %s)", Arrays.toString(data9), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        Box item = new Box("setBox8" + variableIndex);
        setBox8.add(item);
        return item;
    }
    private String generateJSsetBox8() {
        if (!setBox8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Box> setBox9 = new ArrayList<>();

    public Box box(String data10, TextParsingMode csvSettings6) {
        this.data10 = data10;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBox9" + ++variableIndex + " = " + jsBase + ".box(%s, %s);", data10, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s, %s)", data10, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        Box item = new Box("setBox9" + variableIndex);
        setBox9.add(item);
        return item;
    }
    private String generateJSsetBox9() {
        if (!setBox9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Box> setBox10 = new ArrayList<>();

    public Box box(String data10, String csvSettings7) {
        this.data10 = data10;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBox10" + ++variableIndex + " = " + jsBase + ".box(%s, %s);", data10, csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s, %s)", data10, csvSettings7));
            js.setLength(0);
        }
        Box item = new Box("setBox10" + variableIndex);
        setBox10.add(item);
        return item;
    }
    private String generateJSsetBox10() {
        if (!setBox10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Box> setBox11 = new ArrayList<>();

    public Box box(String data10, TextParsingSettings csvSettings8) {
        this.data10 = data10;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBox11" + ++variableIndex + " = " + jsBase + ".box(%s, %s);", data10, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s, %s)", data10, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        Box item = new Box("setBox11" + variableIndex);
        setBox11.add(item);
        return item;
    }
    private String generateJSsetBox11() {
        if (!setBox11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox11) {
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
    private TextParsingMode csvSettings9;
    private String csvSettings10;
    private TextParsingSettings csvSettings11;
    private List<CartesianSeriesBubble> setBubble = new ArrayList<>();

    public CartesianSeriesBubble bubble(View data11, TextParsingMode csvSettings9) {
        this.data11 = data11;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data11 != null) ? data11.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data11 != null) ? data11.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble" + variableIndex);
        setBubble.add(item);
        return item;
    }
    private String generateJSsetBubble() {
        if (!setBubble.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble1 = new ArrayList<>();

    public CartesianSeriesBubble bubble(View data11, String csvSettings10) {
        this.data11 = data11;
        this.csvSettings10 = csvSettings10;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble1" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data11 != null) ? data11.generateJs() : "null", csvSettings10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data11 != null) ? data11.generateJs() : "null", csvSettings10));
            js.setLength(0);
        }
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble1" + variableIndex);
        setBubble1.add(item);
        return item;
    }
    private String generateJSsetBubble1() {
        if (!setBubble1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble2 = new ArrayList<>();

    public CartesianSeriesBubble bubble(View data11, TextParsingSettings csvSettings11) {
        this.data11 = data11;
        this.csvSettings11 = csvSettings11;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble2" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data11 != null) ? data11.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data11 != null) ? data11.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble2" + variableIndex);
        setBubble2.add(item);
        return item;
    }
    private String generateJSsetBubble2() {
        if (!setBubble2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble3 = new ArrayList<>();

    public CartesianSeriesBubble bubble(Set data12, TextParsingMode csvSettings9) {
        this.data12 = data12;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble3" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data12 != null) ? data12.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data12 != null) ? data12.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble3" + variableIndex);
        setBubble3.add(item);
        return item;
    }
    private String generateJSsetBubble3() {
        if (!setBubble3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble4 = new ArrayList<>();

    public CartesianSeriesBubble bubble(Set data12, String csvSettings10) {
        this.data12 = data12;
        this.csvSettings10 = csvSettings10;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble4" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data12 != null) ? data12.generateJs() : "null", csvSettings10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data12 != null) ? data12.generateJs() : "null", csvSettings10));
            js.setLength(0);
        }
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble4" + variableIndex);
        setBubble4.add(item);
        return item;
    }
    private String generateJSsetBubble4() {
        if (!setBubble4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble5 = new ArrayList<>();

    public CartesianSeriesBubble bubble(Set data12, TextParsingSettings csvSettings11) {
        this.data12 = data12;
        this.csvSettings11 = csvSettings11;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble5" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data12 != null) ? data12.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data12 != null) ? data12.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble5" + variableIndex);
        setBubble5.add(item);
        return item;
    }
    private String generateJSsetBubble5() {
        if (!setBubble5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble6 = new ArrayList<>();

    public CartesianSeriesBubble bubble(String[] data13, TextParsingMode csvSettings9) {
        this.data13 = data13;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble6" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", Arrays.toString(data13), (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", Arrays.toString(data13), (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble6" + variableIndex);
        setBubble6.add(item);
        return item;
    }
    private String generateJSsetBubble6() {
        if (!setBubble6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble7 = new ArrayList<>();

    public CartesianSeriesBubble bubble(String[] data13, String csvSettings10) {
        this.data13 = data13;
        this.csvSettings10 = csvSettings10;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble7" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", Arrays.toString(data13), csvSettings10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", Arrays.toString(data13), csvSettings10));
            js.setLength(0);
        }
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble7" + variableIndex);
        setBubble7.add(item);
        return item;
    }
    private String generateJSsetBubble7() {
        if (!setBubble7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble8 = new ArrayList<>();

    public CartesianSeriesBubble bubble(String[] data13, TextParsingSettings csvSettings11) {
        this.data13 = data13;
        this.csvSettings11 = csvSettings11;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble8" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", Arrays.toString(data13), (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", Arrays.toString(data13), (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble8" + variableIndex);
        setBubble8.add(item);
        return item;
    }
    private String generateJSsetBubble8() {
        if (!setBubble8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble9 = new ArrayList<>();

    public CartesianSeriesBubble bubble(String data14, TextParsingMode csvSettings9) {
        this.data14 = data14;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble9" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", data14, (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", data14, (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble9" + variableIndex);
        setBubble9.add(item);
        return item;
    }
    private String generateJSsetBubble9() {
        if (!setBubble9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble10 = new ArrayList<>();

    public CartesianSeriesBubble bubble(String data14, String csvSettings10) {
        this.data14 = data14;
        this.csvSettings10 = csvSettings10;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble10" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", data14, csvSettings10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", data14, csvSettings10));
            js.setLength(0);
        }
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble10" + variableIndex);
        setBubble10.add(item);
        return item;
    }
    private String generateJSsetBubble10() {
        if (!setBubble10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble11 = new ArrayList<>();

    public CartesianSeriesBubble bubble(String data14, TextParsingSettings csvSettings11) {
        this.data14 = data14;
        this.csvSettings11 = csvSettings11;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble11" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", data14, (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", data14, (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble11" + variableIndex);
        setBubble11.add(item);
        return item;
    }
    private String generateJSsetBubble11() {
        if (!setBubble11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble11) {
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
    private TextParsingMode csvSettings12;
    private String csvSettings13;
    private TextParsingSettings csvSettings14;
    private List<CartesianSeriesCandlestick> setCandlestick = new ArrayList<>();

    public CartesianSeriesCandlestick candlestick(View data15, TextParsingMode csvSettings12) {
        this.data15 = data15;
        this.csvSettings12 = csvSettings12;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setCandlestick" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", (data15 != null) ? data15.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick" + variableIndex);
        setCandlestick.add(item);
        return item;
    }
    private String generateJSsetCandlestick() {
        if (!setCandlestick.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick1 = new ArrayList<>();

    public CartesianSeriesCandlestick candlestick(View data15, String csvSettings13) {
        this.data15 = data15;
        this.csvSettings13 = csvSettings13;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setCandlestick1" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s);", (data15 != null) ? data15.generateJs() : "null", csvSettings13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", (data15 != null) ? data15.generateJs() : "null", csvSettings13));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick1" + variableIndex);
        setCandlestick1.add(item);
        return item;
    }
    private String generateJSsetCandlestick1() {
        if (!setCandlestick1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick2 = new ArrayList<>();

    public CartesianSeriesCandlestick candlestick(View data15, TextParsingSettings csvSettings14) {
        this.data15 = data15;
        this.csvSettings14 = csvSettings14;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setCandlestick2" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", (data15 != null) ? data15.generateJs() : "null", (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick2" + variableIndex);
        setCandlestick2.add(item);
        return item;
    }
    private String generateJSsetCandlestick2() {
        if (!setCandlestick2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick3 = new ArrayList<>();

    public CartesianSeriesCandlestick candlestick(Set data16, TextParsingMode csvSettings12) {
        this.data16 = data16;
        this.csvSettings12 = csvSettings12;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setCandlestick3" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", (data16 != null) ? data16.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick3" + variableIndex);
        setCandlestick3.add(item);
        return item;
    }
    private String generateJSsetCandlestick3() {
        if (!setCandlestick3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick4 = new ArrayList<>();

    public CartesianSeriesCandlestick candlestick(Set data16, String csvSettings13) {
        this.data16 = data16;
        this.csvSettings13 = csvSettings13;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setCandlestick4" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s);", (data16 != null) ? data16.generateJs() : "null", csvSettings13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", (data16 != null) ? data16.generateJs() : "null", csvSettings13));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick4" + variableIndex);
        setCandlestick4.add(item);
        return item;
    }
    private String generateJSsetCandlestick4() {
        if (!setCandlestick4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick5 = new ArrayList<>();

    public CartesianSeriesCandlestick candlestick(Set data16, TextParsingSettings csvSettings14) {
        this.data16 = data16;
        this.csvSettings14 = csvSettings14;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setCandlestick5" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", (data16 != null) ? data16.generateJs() : "null", (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick5" + variableIndex);
        setCandlestick5.add(item);
        return item;
    }
    private String generateJSsetCandlestick5() {
        if (!setCandlestick5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick6 = new ArrayList<>();

    public CartesianSeriesCandlestick candlestick(String[] data17, TextParsingMode csvSettings12) {
        this.data17 = data17;
        this.csvSettings12 = csvSettings12;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setCandlestick6" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s);", Arrays.toString(data17), (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", Arrays.toString(data17), (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick6" + variableIndex);
        setCandlestick6.add(item);
        return item;
    }
    private String generateJSsetCandlestick6() {
        if (!setCandlestick6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick7 = new ArrayList<>();

    public CartesianSeriesCandlestick candlestick(String[] data17, String csvSettings13) {
        this.data17 = data17;
        this.csvSettings13 = csvSettings13;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setCandlestick7" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s);", Arrays.toString(data17), csvSettings13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", Arrays.toString(data17), csvSettings13));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick7" + variableIndex);
        setCandlestick7.add(item);
        return item;
    }
    private String generateJSsetCandlestick7() {
        if (!setCandlestick7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick8 = new ArrayList<>();

    public CartesianSeriesCandlestick candlestick(String[] data17, TextParsingSettings csvSettings14) {
        this.data17 = data17;
        this.csvSettings14 = csvSettings14;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setCandlestick8" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s);", Arrays.toString(data17), (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", Arrays.toString(data17), (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick8" + variableIndex);
        setCandlestick8.add(item);
        return item;
    }
    private String generateJSsetCandlestick8() {
        if (!setCandlestick8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick9 = new ArrayList<>();

    public CartesianSeriesCandlestick candlestick(String data18, TextParsingMode csvSettings12) {
        this.data18 = data18;
        this.csvSettings12 = csvSettings12;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setCandlestick9" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s);", data18, (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", data18, (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick9" + variableIndex);
        setCandlestick9.add(item);
        return item;
    }
    private String generateJSsetCandlestick9() {
        if (!setCandlestick9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick10 = new ArrayList<>();

    public CartesianSeriesCandlestick candlestick(String data18, String csvSettings13) {
        this.data18 = data18;
        this.csvSettings13 = csvSettings13;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setCandlestick10" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s);", data18, csvSettings13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", data18, csvSettings13));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick10" + variableIndex);
        setCandlestick10.add(item);
        return item;
    }
    private String generateJSsetCandlestick10() {
        if (!setCandlestick10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick11 = new ArrayList<>();

    public CartesianSeriesCandlestick candlestick(String data18, TextParsingSettings csvSettings14) {
        this.data18 = data18;
        this.csvSettings14 = csvSettings14;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setCandlestick11" + ++variableIndex + " = " + jsBase + ".candlestick(%s, %s);", data18, (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s, %s)", data18, (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick11" + variableIndex);
        setCandlestick11.add(item);
        return item;
    }
    private String generateJSsetCandlestick11() {
        if (!setCandlestick11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick11) {
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
    private TextParsingMode csvSettings15;
    private String csvSettings16;
    private TextParsingSettings csvSettings17;
    private List<CartesianSeriesColumn> setColumn = new ArrayList<>();

    public CartesianSeriesColumn column(View data19, TextParsingMode csvSettings15) {
        this.data19 = data19;
        this.csvSettings15 = csvSettings15;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data19 != null) ? data19.generateJs() : "null", (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn" + variableIndex);
        setColumn.add(item);
        return item;
    }
    private String generateJSsetColumn() {
        if (!setColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn1 = new ArrayList<>();

    public CartesianSeriesColumn column(View data19, String csvSettings16) {
        this.data19 = data19;
        this.csvSettings16 = csvSettings16;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn1" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data19 != null) ? data19.generateJs() : "null", csvSettings16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data19 != null) ? data19.generateJs() : "null", csvSettings16));
            js.setLength(0);
        }
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn1" + variableIndex);
        setColumn1.add(item);
        return item;
    }
    private String generateJSsetColumn1() {
        if (!setColumn1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn2 = new ArrayList<>();

    public CartesianSeriesColumn column(View data19, TextParsingSettings csvSettings17) {
        this.data19 = data19;
        this.csvSettings17 = csvSettings17;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn2" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data19 != null) ? data19.generateJs() : "null", (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn2" + variableIndex);
        setColumn2.add(item);
        return item;
    }
    private String generateJSsetColumn2() {
        if (!setColumn2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn3 = new ArrayList<>();

    public CartesianSeriesColumn column(Set data20, TextParsingMode csvSettings15) {
        this.data20 = data20;
        this.csvSettings15 = csvSettings15;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn3" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data20 != null) ? data20.generateJs() : "null", (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn3" + variableIndex);
        setColumn3.add(item);
        return item;
    }
    private String generateJSsetColumn3() {
        if (!setColumn3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn4 = new ArrayList<>();

    public CartesianSeriesColumn column(Set data20, String csvSettings16) {
        this.data20 = data20;
        this.csvSettings16 = csvSettings16;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn4" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data20 != null) ? data20.generateJs() : "null", csvSettings16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data20 != null) ? data20.generateJs() : "null", csvSettings16));
            js.setLength(0);
        }
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn4" + variableIndex);
        setColumn4.add(item);
        return item;
    }
    private String generateJSsetColumn4() {
        if (!setColumn4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn5 = new ArrayList<>();

    public CartesianSeriesColumn column(Set data20, TextParsingSettings csvSettings17) {
        this.data20 = data20;
        this.csvSettings17 = csvSettings17;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn5" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data20 != null) ? data20.generateJs() : "null", (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn5" + variableIndex);
        setColumn5.add(item);
        return item;
    }
    private String generateJSsetColumn5() {
        if (!setColumn5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn6 = new ArrayList<>();

    public CartesianSeriesColumn column(String[] data21, TextParsingMode csvSettings15) {
        this.data21 = data21;
        this.csvSettings15 = csvSettings15;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn6" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", Arrays.toString(data21), (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", Arrays.toString(data21), (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn6" + variableIndex);
        setColumn6.add(item);
        return item;
    }
    private String generateJSsetColumn6() {
        if (!setColumn6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn7 = new ArrayList<>();

    public CartesianSeriesColumn column(String[] data21, String csvSettings16) {
        this.data21 = data21;
        this.csvSettings16 = csvSettings16;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn7" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", Arrays.toString(data21), csvSettings16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", Arrays.toString(data21), csvSettings16));
            js.setLength(0);
        }
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn7" + variableIndex);
        setColumn7.add(item);
        return item;
    }
    private String generateJSsetColumn7() {
        if (!setColumn7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn8 = new ArrayList<>();

    public CartesianSeriesColumn column(String[] data21, TextParsingSettings csvSettings17) {
        this.data21 = data21;
        this.csvSettings17 = csvSettings17;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn8" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", Arrays.toString(data21), (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", Arrays.toString(data21), (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn8" + variableIndex);
        setColumn8.add(item);
        return item;
    }
    private String generateJSsetColumn8() {
        if (!setColumn8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn9 = new ArrayList<>();

    public CartesianSeriesColumn column(String data22, TextParsingMode csvSettings15) {
        this.data22 = data22;
        this.csvSettings15 = csvSettings15;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn9" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", data22, (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", data22, (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn9" + variableIndex);
        setColumn9.add(item);
        return item;
    }
    private String generateJSsetColumn9() {
        if (!setColumn9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn10 = new ArrayList<>();

    public CartesianSeriesColumn column(String data22, String csvSettings16) {
        this.data22 = data22;
        this.csvSettings16 = csvSettings16;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn10" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", data22, csvSettings16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", data22, csvSettings16));
            js.setLength(0);
        }
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn10" + variableIndex);
        setColumn10.add(item);
        return item;
    }
    private String generateJSsetColumn10() {
        if (!setColumn10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn11 = new ArrayList<>();

    public CartesianSeriesColumn column(String data22, TextParsingSettings csvSettings17) {
        this.data22 = data22;
        this.csvSettings17 = csvSettings17;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn11" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", data22, (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", data22, (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn11" + variableIndex);
        setColumn11.add(item);
        return item;
    }
    private String generateJSsetColumn11() {
        if (!setColumn11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Crosshair getCrosshair;

    public Crosshair getCrosshair() {
        if (getCrosshair == null)
            getCrosshair = new Crosshair(jsBase + ".crosshair()");

        return getCrosshair;
    }
    private String crosshair;
    private Boolean crosshair1;
    private List<Cartesian> setCrosshair = new ArrayList<>();

    public Cartesian setCrosshair(String crosshair) {
        this.crosshair = crosshair;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crosshair(%s)", crosshair));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crosshair(%s)", crosshair));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCrosshair() {
        if (!setCrosshair.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setCrosshair) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setCrosshair1 = new ArrayList<>();

    public Cartesian setCrosshair(Boolean crosshair1) {
        this.crosshair1 = crosshair1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crosshair(%b)", crosshair1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crosshair(%b)", crosshair1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCrosshair1() {
        if (!setCrosshair1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setCrosshair1) {
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
    private Set data23;
    private DataSettings data24;
    private String[] data25;
    private List<Cartesian> setData = new ArrayList<>();

    public Cartesian setData(Set data23) {
        this.data23 = data23;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s)", (data23 != null) ? data23.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s)", (data23 != null) ? data23.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setData1 = new ArrayList<>();

    public Cartesian setData(DataSettings data24) {
        this.data24 = data24;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s)", (data24 != null) ? data24.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s)", (data24 != null) ? data24.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setData2 = new ArrayList<>();

    public Cartesian setData(String[] data25) {
        this.data25 = data25;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s)", Arrays.toString(data25)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s)", Arrays.toString(data25)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private CartesianSeriesType defaultSeriesType;
    private String defaultSeriesType1;
    private List<Cartesian> setDefaultSeriesType = new ArrayList<>();

    public Cartesian setDefaultSeriesType(CartesianSeriesType defaultSeriesType) {
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
            for (Cartesian item : setDefaultSeriesType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setDefaultSeriesType1 = new ArrayList<>();

    public Cartesian setDefaultSeriesType(String defaultSeriesType1) {
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
            for (Cartesian item : setDefaultSeriesType1) {
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

    private List<CartesianSeriesBase> getGetSeries = new ArrayList<>();

    public CartesianSeriesBase getGetSeries(Double id) {
        CartesianSeriesBase item = new CartesianSeriesBase(jsBase + ".getSeries("+ id+")");
        getGetSeries.add(item);
        return item;
    }

    private List<CartesianSeriesBase> getGetSeries1 = new ArrayList<>();

    public CartesianSeriesBase getGetSeries(String id1) {
        CartesianSeriesBase item = new CartesianSeriesBase(jsBase + ".getSeries("+ id1+")");
        getGetSeries1.add(item);
        return item;
    }

    private List<CartesianSeriesBase> getGetSeriesAt = new ArrayList<>();

    public CartesianSeriesBase getGetSeriesAt(Double index) {
        CartesianSeriesBase item = new CartesianSeriesBase(jsBase + ".getSeriesAt("+ index+")");
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
    private List<Cartesian> setHatchFillPalette = new ArrayList<>();

    public Cartesian setHatchFillPalette(HatchFillType[] hatchFillPalette) {
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
            for (Cartesian item : setHatchFillPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setHatchFillPalette1 = new ArrayList<>();

    public Cartesian setHatchFillPalette(String hatchFillPalette1) {
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
            for (Cartesian item : setHatchFillPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setHatchFillPalette2 = new ArrayList<>();

    public Cartesian setHatchFillPalette(HatchFills hatchFillPalette2) {
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
            for (Cartesian item : setHatchFillPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data26;
    private Set data27;
    private String[] data28;
    private String data29;
    private TextParsingMode csvSettings18;
    private String csvSettings19;
    private TextParsingSettings csvSettings20;
    private List<CartesianSeriesHilo> setHilo = new ArrayList<>();

    public CartesianSeriesHilo hilo(View data26, TextParsingMode csvSettings18) {
        this.data26 = data26;
        this.csvSettings18 = csvSettings18;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s);", (data26 != null) ? data26.generateJs() : "null", (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s)", (data26 != null) ? data26.generateJs() : "null", (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo" + variableIndex);
        setHilo.add(item);
        return item;
    }
    private String generateJSsetHilo() {
        if (!setHilo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesHilo> setHilo1 = new ArrayList<>();

    public CartesianSeriesHilo hilo(View data26, String csvSettings19) {
        this.data26 = data26;
        this.csvSettings19 = csvSettings19;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setHilo1" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s);", (data26 != null) ? data26.generateJs() : "null", csvSettings19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s)", (data26 != null) ? data26.generateJs() : "null", csvSettings19));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo1" + variableIndex);
        setHilo1.add(item);
        return item;
    }
    private String generateJSsetHilo1() {
        if (!setHilo1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesHilo> setHilo2 = new ArrayList<>();

    public CartesianSeriesHilo hilo(View data26, TextParsingSettings csvSettings20) {
        this.data26 = data26;
        this.csvSettings20 = csvSettings20;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setHilo2" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s);", (data26 != null) ? data26.generateJs() : "null", (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s)", (data26 != null) ? data26.generateJs() : "null", (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo2" + variableIndex);
        setHilo2.add(item);
        return item;
    }
    private String generateJSsetHilo2() {
        if (!setHilo2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesHilo> setHilo3 = new ArrayList<>();

    public CartesianSeriesHilo hilo(Set data27, TextParsingMode csvSettings18) {
        this.data27 = data27;
        this.csvSettings18 = csvSettings18;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setHilo3" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s);", (data27 != null) ? data27.generateJs() : "null", (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s)", (data27 != null) ? data27.generateJs() : "null", (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo3" + variableIndex);
        setHilo3.add(item);
        return item;
    }
    private String generateJSsetHilo3() {
        if (!setHilo3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesHilo> setHilo4 = new ArrayList<>();

    public CartesianSeriesHilo hilo(Set data27, String csvSettings19) {
        this.data27 = data27;
        this.csvSettings19 = csvSettings19;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setHilo4" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s);", (data27 != null) ? data27.generateJs() : "null", csvSettings19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s)", (data27 != null) ? data27.generateJs() : "null", csvSettings19));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo4" + variableIndex);
        setHilo4.add(item);
        return item;
    }
    private String generateJSsetHilo4() {
        if (!setHilo4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesHilo> setHilo5 = new ArrayList<>();

    public CartesianSeriesHilo hilo(Set data27, TextParsingSettings csvSettings20) {
        this.data27 = data27;
        this.csvSettings20 = csvSettings20;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setHilo5" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s);", (data27 != null) ? data27.generateJs() : "null", (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s)", (data27 != null) ? data27.generateJs() : "null", (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo5" + variableIndex);
        setHilo5.add(item);
        return item;
    }
    private String generateJSsetHilo5() {
        if (!setHilo5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesHilo> setHilo6 = new ArrayList<>();

    public CartesianSeriesHilo hilo(String[] data28, TextParsingMode csvSettings18) {
        this.data28 = data28;
        this.csvSettings18 = csvSettings18;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setHilo6" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s);", Arrays.toString(data28), (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s)", Arrays.toString(data28), (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo6" + variableIndex);
        setHilo6.add(item);
        return item;
    }
    private String generateJSsetHilo6() {
        if (!setHilo6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesHilo> setHilo7 = new ArrayList<>();

    public CartesianSeriesHilo hilo(String[] data28, String csvSettings19) {
        this.data28 = data28;
        this.csvSettings19 = csvSettings19;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setHilo7" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s);", Arrays.toString(data28), csvSettings19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s)", Arrays.toString(data28), csvSettings19));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo7" + variableIndex);
        setHilo7.add(item);
        return item;
    }
    private String generateJSsetHilo7() {
        if (!setHilo7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesHilo> setHilo8 = new ArrayList<>();

    public CartesianSeriesHilo hilo(String[] data28, TextParsingSettings csvSettings20) {
        this.data28 = data28;
        this.csvSettings20 = csvSettings20;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setHilo8" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s);", Arrays.toString(data28), (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s)", Arrays.toString(data28), (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo8" + variableIndex);
        setHilo8.add(item);
        return item;
    }
    private String generateJSsetHilo8() {
        if (!setHilo8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesHilo> setHilo9 = new ArrayList<>();

    public CartesianSeriesHilo hilo(String data29, TextParsingMode csvSettings18) {
        this.data29 = data29;
        this.csvSettings18 = csvSettings18;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setHilo9" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s);", data29, (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s)", data29, (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo9" + variableIndex);
        setHilo9.add(item);
        return item;
    }
    private String generateJSsetHilo9() {
        if (!setHilo9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesHilo> setHilo10 = new ArrayList<>();

    public CartesianSeriesHilo hilo(String data29, String csvSettings19) {
        this.data29 = data29;
        this.csvSettings19 = csvSettings19;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setHilo10" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s);", data29, csvSettings19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s)", data29, csvSettings19));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo10" + variableIndex);
        setHilo10.add(item);
        return item;
    }
    private String generateJSsetHilo10() {
        if (!setHilo10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesHilo> setHilo11 = new ArrayList<>();

    public CartesianSeriesHilo hilo(String data29, TextParsingSettings csvSettings20) {
        this.data29 = data29;
        this.csvSettings20 = csvSettings20;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setHilo11" + ++variableIndex + " = " + jsBase + ".hilo(%s, %s);", data29, (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s, %s)", data29, (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo11" + variableIndex);
        setHilo11.add(item);
        return item;
    }
    private String generateJSsetHilo11() {
        if (!setHilo11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo11) {
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
    private List<Cartesian> setHovered = new ArrayList<>();

    public Cartesian setHovered(String hovered) {
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
            for (Cartesian item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean isVertical;
    private List<Cartesian> setIsVertical = new ArrayList<>();

    public Cartesian setIsVertical(Boolean isVertical) {
        this.isVertical = isVertical;
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
    private String generateJSsetIsVertical() {
        if (!setIsVertical.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setIsVertical) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data30;
    private Set data31;
    private String[] data32;
    private String data33;
    private TextParsingMode csvSettings21;
    private String csvSettings22;
    private TextParsingSettings csvSettings23;
    private List<CartesianSeriesJumpLine> setJumpLine = new ArrayList<>();

    public CartesianSeriesJumpLine jumpLine(View data30, TextParsingMode csvSettings21) {
        this.data30 = data30;
        this.csvSettings21 = csvSettings21;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setJumpLine" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s);", (data30 != null) ? data30.generateJs() : "null", (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s)", (data30 != null) ? data30.generateJs() : "null", (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine" + variableIndex);
        setJumpLine.add(item);
        return item;
    }
    private String generateJSsetJumpLine() {
        if (!setJumpLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesJumpLine> setJumpLine1 = new ArrayList<>();

    public CartesianSeriesJumpLine jumpLine(View data30, String csvSettings22) {
        this.data30 = data30;
        this.csvSettings22 = csvSettings22;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setJumpLine1" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s);", (data30 != null) ? data30.generateJs() : "null", csvSettings22));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s)", (data30 != null) ? data30.generateJs() : "null", csvSettings22));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine1" + variableIndex);
        setJumpLine1.add(item);
        return item;
    }
    private String generateJSsetJumpLine1() {
        if (!setJumpLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesJumpLine> setJumpLine2 = new ArrayList<>();

    public CartesianSeriesJumpLine jumpLine(View data30, TextParsingSettings csvSettings23) {
        this.data30 = data30;
        this.csvSettings23 = csvSettings23;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setJumpLine2" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s);", (data30 != null) ? data30.generateJs() : "null", (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s)", (data30 != null) ? data30.generateJs() : "null", (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine2" + variableIndex);
        setJumpLine2.add(item);
        return item;
    }
    private String generateJSsetJumpLine2() {
        if (!setJumpLine2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesJumpLine> setJumpLine3 = new ArrayList<>();

    public CartesianSeriesJumpLine jumpLine(Set data31, TextParsingMode csvSettings21) {
        this.data31 = data31;
        this.csvSettings21 = csvSettings21;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setJumpLine3" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s);", (data31 != null) ? data31.generateJs() : "null", (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s)", (data31 != null) ? data31.generateJs() : "null", (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine3" + variableIndex);
        setJumpLine3.add(item);
        return item;
    }
    private String generateJSsetJumpLine3() {
        if (!setJumpLine3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesJumpLine> setJumpLine4 = new ArrayList<>();

    public CartesianSeriesJumpLine jumpLine(Set data31, String csvSettings22) {
        this.data31 = data31;
        this.csvSettings22 = csvSettings22;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setJumpLine4" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s);", (data31 != null) ? data31.generateJs() : "null", csvSettings22));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s)", (data31 != null) ? data31.generateJs() : "null", csvSettings22));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine4" + variableIndex);
        setJumpLine4.add(item);
        return item;
    }
    private String generateJSsetJumpLine4() {
        if (!setJumpLine4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesJumpLine> setJumpLine5 = new ArrayList<>();

    public CartesianSeriesJumpLine jumpLine(Set data31, TextParsingSettings csvSettings23) {
        this.data31 = data31;
        this.csvSettings23 = csvSettings23;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setJumpLine5" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s);", (data31 != null) ? data31.generateJs() : "null", (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s)", (data31 != null) ? data31.generateJs() : "null", (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine5" + variableIndex);
        setJumpLine5.add(item);
        return item;
    }
    private String generateJSsetJumpLine5() {
        if (!setJumpLine5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesJumpLine> setJumpLine6 = new ArrayList<>();

    public CartesianSeriesJumpLine jumpLine(String[] data32, TextParsingMode csvSettings21) {
        this.data32 = data32;
        this.csvSettings21 = csvSettings21;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setJumpLine6" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s);", Arrays.toString(data32), (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s)", Arrays.toString(data32), (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine6" + variableIndex);
        setJumpLine6.add(item);
        return item;
    }
    private String generateJSsetJumpLine6() {
        if (!setJumpLine6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesJumpLine> setJumpLine7 = new ArrayList<>();

    public CartesianSeriesJumpLine jumpLine(String[] data32, String csvSettings22) {
        this.data32 = data32;
        this.csvSettings22 = csvSettings22;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setJumpLine7" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s);", Arrays.toString(data32), csvSettings22));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s)", Arrays.toString(data32), csvSettings22));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine7" + variableIndex);
        setJumpLine7.add(item);
        return item;
    }
    private String generateJSsetJumpLine7() {
        if (!setJumpLine7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesJumpLine> setJumpLine8 = new ArrayList<>();

    public CartesianSeriesJumpLine jumpLine(String[] data32, TextParsingSettings csvSettings23) {
        this.data32 = data32;
        this.csvSettings23 = csvSettings23;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setJumpLine8" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s);", Arrays.toString(data32), (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s)", Arrays.toString(data32), (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine8" + variableIndex);
        setJumpLine8.add(item);
        return item;
    }
    private String generateJSsetJumpLine8() {
        if (!setJumpLine8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesJumpLine> setJumpLine9 = new ArrayList<>();

    public CartesianSeriesJumpLine jumpLine(String data33, TextParsingMode csvSettings21) {
        this.data33 = data33;
        this.csvSettings21 = csvSettings21;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setJumpLine9" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s);", data33, (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s)", data33, (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine9" + variableIndex);
        setJumpLine9.add(item);
        return item;
    }
    private String generateJSsetJumpLine9() {
        if (!setJumpLine9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesJumpLine> setJumpLine10 = new ArrayList<>();

    public CartesianSeriesJumpLine jumpLine(String data33, String csvSettings22) {
        this.data33 = data33;
        this.csvSettings22 = csvSettings22;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setJumpLine10" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s);", data33, csvSettings22));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s)", data33, csvSettings22));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine10" + variableIndex);
        setJumpLine10.add(item);
        return item;
    }
    private String generateJSsetJumpLine10() {
        if (!setJumpLine10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesJumpLine> setJumpLine11 = new ArrayList<>();

    public CartesianSeriesJumpLine jumpLine(String data33, TextParsingSettings csvSettings23) {
        this.data33 = data33;
        this.csvSettings23 = csvSettings23;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setJumpLine11" + ++variableIndex + " = " + jsBase + ".jumpLine(%s, %s);", data33, (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s, %s)", data33, (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine11" + variableIndex);
        setJumpLine11.add(item);
        return item;
    }
    private String generateJSsetJumpLine11() {
        if (!setJumpLine11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine11) {
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
    private List<Cartesian> setLabels = new ArrayList<>();

    public Cartesian setLabels(String labels) {
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
            for (Cartesian item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setLabels1 = new ArrayList<>();

    public Cartesian setLabels(Boolean labels1) {
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
            for (Cartesian item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data34;
    private Set data35;
    private String[] data36;
    private String data37;
    private TextParsingMode csvSettings24;
    private String csvSettings25;
    private TextParsingSettings csvSettings26;
    private List<CartesianSeriesLine> setLine = new ArrayList<>();

    public CartesianSeriesLine line(View data34, TextParsingMode csvSettings24) {
        this.data34 = data34;
        this.csvSettings24 = csvSettings24;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data34 != null) ? data34.generateJs() : "null", (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data34 != null) ? data34.generateJs() : "null", (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine" + variableIndex);
        setLine.add(item);
        return item;
    }
    private String generateJSsetLine() {
        if (!setLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine1 = new ArrayList<>();

    public CartesianSeriesLine line(View data34, String csvSettings25) {
        this.data34 = data34;
        this.csvSettings25 = csvSettings25;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine1" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data34 != null) ? data34.generateJs() : "null", csvSettings25));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data34 != null) ? data34.generateJs() : "null", csvSettings25));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine1" + variableIndex);
        setLine1.add(item);
        return item;
    }
    private String generateJSsetLine1() {
        if (!setLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2 = new ArrayList<>();

    public CartesianSeriesLine line(View data34, TextParsingSettings csvSettings26) {
        this.data34 = data34;
        this.csvSettings26 = csvSettings26;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data34 != null) ? data34.generateJs() : "null", (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data34 != null) ? data34.generateJs() : "null", (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2" + variableIndex);
        setLine2.add(item);
        return item;
    }
    private String generateJSsetLine2() {
        if (!setLine2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine3 = new ArrayList<>();

    public CartesianSeriesLine line(Set data35, TextParsingMode csvSettings24) {
        this.data35 = data35;
        this.csvSettings24 = csvSettings24;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine3" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data35 != null) ? data35.generateJs() : "null", (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data35 != null) ? data35.generateJs() : "null", (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine3" + variableIndex);
        setLine3.add(item);
        return item;
    }
    private String generateJSsetLine3() {
        if (!setLine3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine4 = new ArrayList<>();

    public CartesianSeriesLine line(Set data35, String csvSettings25) {
        this.data35 = data35;
        this.csvSettings25 = csvSettings25;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine4" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data35 != null) ? data35.generateJs() : "null", csvSettings25));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data35 != null) ? data35.generateJs() : "null", csvSettings25));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine4" + variableIndex);
        setLine4.add(item);
        return item;
    }
    private String generateJSsetLine4() {
        if (!setLine4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine5 = new ArrayList<>();

    public CartesianSeriesLine line(Set data35, TextParsingSettings csvSettings26) {
        this.data35 = data35;
        this.csvSettings26 = csvSettings26;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine5" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data35 != null) ? data35.generateJs() : "null", (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data35 != null) ? data35.generateJs() : "null", (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine5" + variableIndex);
        setLine5.add(item);
        return item;
    }
    private String generateJSsetLine5() {
        if (!setLine5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine6 = new ArrayList<>();

    public CartesianSeriesLine line(String[] data36, TextParsingMode csvSettings24) {
        this.data36 = data36;
        this.csvSettings24 = csvSettings24;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine6" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data36), (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data36), (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine6" + variableIndex);
        setLine6.add(item);
        return item;
    }
    private String generateJSsetLine6() {
        if (!setLine6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine7 = new ArrayList<>();

    public CartesianSeriesLine line(String[] data36, String csvSettings25) {
        this.data36 = data36;
        this.csvSettings25 = csvSettings25;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine7" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data36), csvSettings25));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data36), csvSettings25));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine7" + variableIndex);
        setLine7.add(item);
        return item;
    }
    private String generateJSsetLine7() {
        if (!setLine7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine8 = new ArrayList<>();

    public CartesianSeriesLine line(String[] data36, TextParsingSettings csvSettings26) {
        this.data36 = data36;
        this.csvSettings26 = csvSettings26;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine8" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data36), (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data36), (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine8" + variableIndex);
        setLine8.add(item);
        return item;
    }
    private String generateJSsetLine8() {
        if (!setLine8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine9 = new ArrayList<>();

    public CartesianSeriesLine line(String data37, TextParsingMode csvSettings24) {
        this.data37 = data37;
        this.csvSettings24 = csvSettings24;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine9" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data37, (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data37, (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine9" + variableIndex);
        setLine9.add(item);
        return item;
    }
    private String generateJSsetLine9() {
        if (!setLine9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine10 = new ArrayList<>();

    public CartesianSeriesLine line(String data37, String csvSettings25) {
        this.data37 = data37;
        this.csvSettings25 = csvSettings25;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine10" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data37, csvSettings25));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data37, csvSettings25));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine10" + variableIndex);
        setLine10.add(item);
        return item;
    }
    private String generateJSsetLine10() {
        if (!setLine10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine11 = new ArrayList<>();

    public CartesianSeriesLine line(String data37, TextParsingSettings csvSettings26) {
        this.data37 = data37;
        this.csvSettings26 = csvSettings26;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine11" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data37, (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data37, (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine11" + variableIndex);
        setLine11.add(item);
        return item;
    }
    private String generateJSsetLine11() {
        if (!setLine11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxismarkersLine getLineMarker;

    public CoreAxismarkersLine getLineMarker() {
        if (getLineMarker == null)
            getLineMarker = new CoreAxismarkersLine(jsBase + ".lineMarker()");

        return getLineMarker;
    }

    private List<CoreAxismarkersLine> getLineMarker1 = new ArrayList<>();

    public CoreAxismarkersLine getLineMarker(Double index1) {
        CoreAxismarkersLine item = new CoreAxismarkersLine(jsBase + ".lineMarker("+ index1+")");
        getLineMarker1.add(item);
        return item;
    }
    private String lineMarker;
    private Boolean lineMarker1;
    private List<Cartesian> setLineMarker = new ArrayList<>();

    public Cartesian setLineMarker(String lineMarker) {
        this.lineMarker = lineMarker;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%s)", lineMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%s)", lineMarker));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLineMarker() {
        if (!setLineMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setLineMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setLineMarker1 = new ArrayList<>();

    public Cartesian setLineMarker(Boolean lineMarker1) {
        this.lineMarker1 = lineMarker1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%b)", lineMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%b)", lineMarker1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLineMarker1() {
        if (!setLineMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setLineMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index2;
    private String lineMarker2;
    private Boolean lineMarker3;
    private List<Cartesian> setLineMarker2 = new ArrayList<>();

    public Cartesian setLineMarker(String lineMarker2, Double index2) {
        this.lineMarker2 = lineMarker2;
        this.index2 = index2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%s, %f)", lineMarker2, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%s, %f)", lineMarker2, index2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLineMarker2() {
        if (!setLineMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setLineMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setLineMarker3 = new ArrayList<>();

    public Cartesian setLineMarker(Boolean lineMarker3, Double index2) {
        this.lineMarker3 = lineMarker3;
        this.index2 = index2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%b, %f)", lineMarker3, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%b, %f)", lineMarker3, index2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLineMarker3() {
        if (!setLineMarker3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setLineMarker3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data38;
    private Set data39;
    private String[] data40;
    private String data41;
    private TextParsingMode csvSettings27;
    private String csvSettings28;
    private TextParsingSettings csvSettings29;
    private List<CartesianSeriesMarker> setMarker = new ArrayList<>();

    public CartesianSeriesMarker marker(View data38, TextParsingMode csvSettings27) {
        this.data38 = data38;
        this.csvSettings27 = csvSettings27;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data38 != null) ? data38.generateJs() : "null", (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data38 != null) ? data38.generateJs() : "null", (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker" + variableIndex);
        setMarker.add(item);
        return item;
    }
    private String generateJSsetMarker() {
        if (!setMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesMarker> setMarker1 = new ArrayList<>();

    public CartesianSeriesMarker marker(View data38, String csvSettings28) {
        this.data38 = data38;
        this.csvSettings28 = csvSettings28;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker1" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data38 != null) ? data38.generateJs() : "null", csvSettings28));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data38 != null) ? data38.generateJs() : "null", csvSettings28));
            js.setLength(0);
        }
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker1" + variableIndex);
        setMarker1.add(item);
        return item;
    }
    private String generateJSsetMarker1() {
        if (!setMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesMarker> setMarker2 = new ArrayList<>();

    public CartesianSeriesMarker marker(View data38, TextParsingSettings csvSettings29) {
        this.data38 = data38;
        this.csvSettings29 = csvSettings29;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker2" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data38 != null) ? data38.generateJs() : "null", (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data38 != null) ? data38.generateJs() : "null", (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker2" + variableIndex);
        setMarker2.add(item);
        return item;
    }
    private String generateJSsetMarker2() {
        if (!setMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesMarker> setMarker3 = new ArrayList<>();

    public CartesianSeriesMarker marker(Set data39, TextParsingMode csvSettings27) {
        this.data39 = data39;
        this.csvSettings27 = csvSettings27;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker3" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data39 != null) ? data39.generateJs() : "null", (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data39 != null) ? data39.generateJs() : "null", (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker3" + variableIndex);
        setMarker3.add(item);
        return item;
    }
    private String generateJSsetMarker3() {
        if (!setMarker3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesMarker> setMarker4 = new ArrayList<>();

    public CartesianSeriesMarker marker(Set data39, String csvSettings28) {
        this.data39 = data39;
        this.csvSettings28 = csvSettings28;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker4" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data39 != null) ? data39.generateJs() : "null", csvSettings28));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data39 != null) ? data39.generateJs() : "null", csvSettings28));
            js.setLength(0);
        }
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker4" + variableIndex);
        setMarker4.add(item);
        return item;
    }
    private String generateJSsetMarker4() {
        if (!setMarker4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesMarker> setMarker5 = new ArrayList<>();

    public CartesianSeriesMarker marker(Set data39, TextParsingSettings csvSettings29) {
        this.data39 = data39;
        this.csvSettings29 = csvSettings29;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker5" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data39 != null) ? data39.generateJs() : "null", (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data39 != null) ? data39.generateJs() : "null", (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker5" + variableIndex);
        setMarker5.add(item);
        return item;
    }
    private String generateJSsetMarker5() {
        if (!setMarker5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesMarker> setMarker6 = new ArrayList<>();

    public CartesianSeriesMarker marker(String[] data40, TextParsingMode csvSettings27) {
        this.data40 = data40;
        this.csvSettings27 = csvSettings27;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker6" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data40), (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data40), (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker6" + variableIndex);
        setMarker6.add(item);
        return item;
    }
    private String generateJSsetMarker6() {
        if (!setMarker6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesMarker> setMarker7 = new ArrayList<>();

    public CartesianSeriesMarker marker(String[] data40, String csvSettings28) {
        this.data40 = data40;
        this.csvSettings28 = csvSettings28;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker7" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data40), csvSettings28));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data40), csvSettings28));
            js.setLength(0);
        }
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker7" + variableIndex);
        setMarker7.add(item);
        return item;
    }
    private String generateJSsetMarker7() {
        if (!setMarker7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesMarker> setMarker8 = new ArrayList<>();

    public CartesianSeriesMarker marker(String[] data40, TextParsingSettings csvSettings29) {
        this.data40 = data40;
        this.csvSettings29 = csvSettings29;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker8" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data40), (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data40), (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker8" + variableIndex);
        setMarker8.add(item);
        return item;
    }
    private String generateJSsetMarker8() {
        if (!setMarker8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesMarker> setMarker9 = new ArrayList<>();

    public CartesianSeriesMarker marker(String data41, TextParsingMode csvSettings27) {
        this.data41 = data41;
        this.csvSettings27 = csvSettings27;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker9" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data41, (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data41, (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker9" + variableIndex);
        setMarker9.add(item);
        return item;
    }
    private String generateJSsetMarker9() {
        if (!setMarker9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesMarker> setMarker10 = new ArrayList<>();

    public CartesianSeriesMarker marker(String data41, String csvSettings28) {
        this.data41 = data41;
        this.csvSettings28 = csvSettings28;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker10" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data41, csvSettings28));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data41, csvSettings28));
            js.setLength(0);
        }
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker10" + variableIndex);
        setMarker10.add(item);
        return item;
    }
    private String generateJSsetMarker10() {
        if (!setMarker10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesMarker> setMarker11 = new ArrayList<>();

    public CartesianSeriesMarker marker(String data41, TextParsingSettings csvSettings29) {
        this.data41 = data41;
        this.csvSettings29 = csvSettings29;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker11" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data41, (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data41, (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker11" + variableIndex);
        setMarker11.add(item);
        return item;
    }
    private String generateJSsetMarker11() {
        if (!setMarker11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker11) {
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
    private List<Cartesian> setMarkerPalette = new ArrayList<>();

    public Cartesian setMarkerPalette(Markers markerPalette) {
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
            for (Cartesian item : setMarkerPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setMarkerPalette1 = new ArrayList<>();

    public Cartesian setMarkerPalette(String markerPalette1) {
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
            for (Cartesian item : setMarkerPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setMarkerPalette2 = new ArrayList<>();

    public Cartesian setMarkerPalette(MarkerType[] markerPalette2) {
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
            for (Cartesian item : setMarkerPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setMarkerPalette3 = new ArrayList<>();

    public Cartesian setMarkerPalette(String[] markerPalette3) {
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
            for (Cartesian item : setMarkerPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxBubbleSize;
    private String maxBubbleSize1;
    private List<Cartesian> setMaxBubbleSize = new ArrayList<>();

    public Cartesian setMaxBubbleSize(Double maxBubbleSize) {
        this.maxBubbleSize = maxBubbleSize;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxBubbleSize(%f)", maxBubbleSize));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxBubbleSize(%f)", maxBubbleSize));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMaxBubbleSize() {
        if (!setMaxBubbleSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setMaxBubbleSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setMaxBubbleSize1 = new ArrayList<>();

    public Cartesian setMaxBubbleSize(String maxBubbleSize1) {
        this.maxBubbleSize1 = maxBubbleSize1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxBubbleSize(%s)", maxBubbleSize1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxBubbleSize(%s)", maxBubbleSize1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMaxBubbleSize1() {
        if (!setMaxBubbleSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setMaxBubbleSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxPointWidth;
    private String maxPointWidth1;
    private List<Cartesian> setMaxPointWidth = new ArrayList<>();

    public Cartesian setMaxPointWidth(Double maxPointWidth) {
        this.maxPointWidth = maxPointWidth;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMaxPointWidth() {
        if (!setMaxPointWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setMaxPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setMaxPointWidth1 = new ArrayList<>();

    public Cartesian setMaxPointWidth(String maxPointWidth1) {
        this.maxPointWidth1 = maxPointWidth1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMaxPointWidth1() {
        if (!setMaxPointWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setMaxPointWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minBubbleSize;
    private String minBubbleSize1;
    private List<Cartesian> setMinBubbleSize = new ArrayList<>();

    public Cartesian setMinBubbleSize(Double minBubbleSize) {
        this.minBubbleSize = minBubbleSize;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minBubbleSize(%f)", minBubbleSize));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minBubbleSize(%f)", minBubbleSize));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMinBubbleSize() {
        if (!setMinBubbleSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setMinBubbleSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setMinBubbleSize1 = new ArrayList<>();

    public Cartesian setMinBubbleSize(String minBubbleSize1) {
        this.minBubbleSize1 = minBubbleSize1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minBubbleSize(%s)", minBubbleSize1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minBubbleSize(%s)", minBubbleSize1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMinBubbleSize1() {
        if (!setMinBubbleSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setMinBubbleSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minPointLength;
    private String minPointLength1;
    private List<Cartesian> setMinPointLength = new ArrayList<>();

    public Cartesian setMinPointLength(Double minPointLength) {
        this.minPointLength = minPointLength;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minPointLength(%f)", minPointLength));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%f)", minPointLength));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMinPointLength() {
        if (!setMinPointLength.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setMinPointLength) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setMinPointLength1 = new ArrayList<>();

    public Cartesian setMinPointLength(String minPointLength1) {
        this.minPointLength1 = minPointLength1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minPointLength(%s)", minPointLength1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%s)", minPointLength1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMinPointLength1() {
        if (!setMinPointLength1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setMinPointLength1) {
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
    private List<Cartesian> setNormal = new ArrayList<>();

    public Cartesian setNormal(String normal) {
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
            for (Cartesian item : setNormal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data42;
    private Set data43;
    private String[] data44;
    private String data45;
    private TextParsingMode csvSettings30;
    private String csvSettings31;
    private TextParsingSettings csvSettings32;
    private List<CartesianSeriesOHLC> setOhlc = new ArrayList<>();

    public CartesianSeriesOHLC ohlc(View data42, TextParsingMode csvSettings30) {
        this.data42 = data42;
        this.csvSettings30 = csvSettings30;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setOhlc" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s);", (data42 != null) ? data42.generateJs() : "null", (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s)", (data42 != null) ? data42.generateJs() : "null", (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc" + variableIndex);
        setOhlc.add(item);
        return item;
    }
    private String generateJSsetOhlc() {
        if (!setOhlc.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesOHLC> setOhlc1 = new ArrayList<>();

    public CartesianSeriesOHLC ohlc(View data42, String csvSettings31) {
        this.data42 = data42;
        this.csvSettings31 = csvSettings31;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setOhlc1" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s);", (data42 != null) ? data42.generateJs() : "null", csvSettings31));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s)", (data42 != null) ? data42.generateJs() : "null", csvSettings31));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc1" + variableIndex);
        setOhlc1.add(item);
        return item;
    }
    private String generateJSsetOhlc1() {
        if (!setOhlc1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesOHLC> setOhlc2 = new ArrayList<>();

    public CartesianSeriesOHLC ohlc(View data42, TextParsingSettings csvSettings32) {
        this.data42 = data42;
        this.csvSettings32 = csvSettings32;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setOhlc2" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s);", (data42 != null) ? data42.generateJs() : "null", (csvSettings32 != null) ? csvSettings32.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s)", (data42 != null) ? data42.generateJs() : "null", (csvSettings32 != null) ? csvSettings32.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc2" + variableIndex);
        setOhlc2.add(item);
        return item;
    }
    private String generateJSsetOhlc2() {
        if (!setOhlc2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesOHLC> setOhlc3 = new ArrayList<>();

    public CartesianSeriesOHLC ohlc(Set data43, TextParsingMode csvSettings30) {
        this.data43 = data43;
        this.csvSettings30 = csvSettings30;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setOhlc3" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s);", (data43 != null) ? data43.generateJs() : "null", (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s)", (data43 != null) ? data43.generateJs() : "null", (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc3" + variableIndex);
        setOhlc3.add(item);
        return item;
    }
    private String generateJSsetOhlc3() {
        if (!setOhlc3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesOHLC> setOhlc4 = new ArrayList<>();

    public CartesianSeriesOHLC ohlc(Set data43, String csvSettings31) {
        this.data43 = data43;
        this.csvSettings31 = csvSettings31;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setOhlc4" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s);", (data43 != null) ? data43.generateJs() : "null", csvSettings31));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s)", (data43 != null) ? data43.generateJs() : "null", csvSettings31));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc4" + variableIndex);
        setOhlc4.add(item);
        return item;
    }
    private String generateJSsetOhlc4() {
        if (!setOhlc4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesOHLC> setOhlc5 = new ArrayList<>();

    public CartesianSeriesOHLC ohlc(Set data43, TextParsingSettings csvSettings32) {
        this.data43 = data43;
        this.csvSettings32 = csvSettings32;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setOhlc5" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s);", (data43 != null) ? data43.generateJs() : "null", (csvSettings32 != null) ? csvSettings32.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s)", (data43 != null) ? data43.generateJs() : "null", (csvSettings32 != null) ? csvSettings32.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc5" + variableIndex);
        setOhlc5.add(item);
        return item;
    }
    private String generateJSsetOhlc5() {
        if (!setOhlc5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesOHLC> setOhlc6 = new ArrayList<>();

    public CartesianSeriesOHLC ohlc(String[] data44, TextParsingMode csvSettings30) {
        this.data44 = data44;
        this.csvSettings30 = csvSettings30;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setOhlc6" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s);", Arrays.toString(data44), (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s)", Arrays.toString(data44), (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc6" + variableIndex);
        setOhlc6.add(item);
        return item;
    }
    private String generateJSsetOhlc6() {
        if (!setOhlc6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesOHLC> setOhlc7 = new ArrayList<>();

    public CartesianSeriesOHLC ohlc(String[] data44, String csvSettings31) {
        this.data44 = data44;
        this.csvSettings31 = csvSettings31;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setOhlc7" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s);", Arrays.toString(data44), csvSettings31));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s)", Arrays.toString(data44), csvSettings31));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc7" + variableIndex);
        setOhlc7.add(item);
        return item;
    }
    private String generateJSsetOhlc7() {
        if (!setOhlc7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesOHLC> setOhlc8 = new ArrayList<>();

    public CartesianSeriesOHLC ohlc(String[] data44, TextParsingSettings csvSettings32) {
        this.data44 = data44;
        this.csvSettings32 = csvSettings32;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setOhlc8" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s);", Arrays.toString(data44), (csvSettings32 != null) ? csvSettings32.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s)", Arrays.toString(data44), (csvSettings32 != null) ? csvSettings32.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc8" + variableIndex);
        setOhlc8.add(item);
        return item;
    }
    private String generateJSsetOhlc8() {
        if (!setOhlc8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesOHLC> setOhlc9 = new ArrayList<>();

    public CartesianSeriesOHLC ohlc(String data45, TextParsingMode csvSettings30) {
        this.data45 = data45;
        this.csvSettings30 = csvSettings30;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setOhlc9" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s);", data45, (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s)", data45, (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc9" + variableIndex);
        setOhlc9.add(item);
        return item;
    }
    private String generateJSsetOhlc9() {
        if (!setOhlc9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesOHLC> setOhlc10 = new ArrayList<>();

    public CartesianSeriesOHLC ohlc(String data45, String csvSettings31) {
        this.data45 = data45;
        this.csvSettings31 = csvSettings31;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setOhlc10" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s);", data45, csvSettings31));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s)", data45, csvSettings31));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc10" + variableIndex);
        setOhlc10.add(item);
        return item;
    }
    private String generateJSsetOhlc10() {
        if (!setOhlc10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesOHLC> setOhlc11 = new ArrayList<>();

    public CartesianSeriesOHLC ohlc(String data45, TextParsingSettings csvSettings32) {
        this.data45 = data45;
        this.csvSettings32 = csvSettings32;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setOhlc11" + ++variableIndex + " = " + jsBase + ".ohlc(%s, %s);", data45, (csvSettings32 != null) ? csvSettings32.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s, %s)", data45, (csvSettings32 != null) ? csvSettings32.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc11" + variableIndex);
        setOhlc11.add(item);
        return item;
    }
    private String generateJSsetOhlc11() {
        if (!setOhlc11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc11) {
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
    private List<Cartesian> setPalette = new ArrayList<>();

    public Cartesian setPalette(RangeColors palette) {
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
            for (Cartesian item : setPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setPalette1 = new ArrayList<>();

    public Cartesian setPalette(DistinctColors palette1) {
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
            for (Cartesian item : setPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setPalette2 = new ArrayList<>();

    public Cartesian setPalette(String palette2) {
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
            for (Cartesian item : setPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setPalette3 = new ArrayList<>();

    public Cartesian setPalette(String[] palette3) {
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
            for (Cartesian item : setPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double pointWidth;
    private String pointWidth1;
    private List<Cartesian> setPointWidth = new ArrayList<>();

    public Cartesian setPointWidth(Double pointWidth) {
        this.pointWidth = pointWidth;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointWidth(%f)", pointWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%f)", pointWidth));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPointWidth() {
        if (!setPointWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setPointWidth1 = new ArrayList<>();

    public Cartesian setPointWidth(String pointWidth1) {
        this.pointWidth1 = pointWidth1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointWidth(%s)", pointWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", pointWidth1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPointWidth1() {
        if (!setPointWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setPointWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data46;
    private Set data47;
    private String[] data48;
    private String data49;
    private TextParsingMode csvSettings33;
    private String csvSettings34;
    private TextParsingSettings csvSettings35;
    private List<CartesianSeriesRangeArea> setRangeArea = new ArrayList<>();

    public CartesianSeriesRangeArea rangeArea(View data46, TextParsingMode csvSettings33) {
        this.data46 = data46;
        this.csvSettings33 = csvSettings33;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeArea" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s);", (data46 != null) ? data46.generateJs() : "null", (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", (data46 != null) ? data46.generateJs() : "null", (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea" + variableIndex);
        setRangeArea.add(item);
        return item;
    }
    private String generateJSsetRangeArea() {
        if (!setRangeArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeArea> setRangeArea1 = new ArrayList<>();

    public CartesianSeriesRangeArea rangeArea(View data46, String csvSettings34) {
        this.data46 = data46;
        this.csvSettings34 = csvSettings34;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeArea1" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s);", (data46 != null) ? data46.generateJs() : "null", csvSettings34));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", (data46 != null) ? data46.generateJs() : "null", csvSettings34));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea1" + variableIndex);
        setRangeArea1.add(item);
        return item;
    }
    private String generateJSsetRangeArea1() {
        if (!setRangeArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeArea> setRangeArea2 = new ArrayList<>();

    public CartesianSeriesRangeArea rangeArea(View data46, TextParsingSettings csvSettings35) {
        this.data46 = data46;
        this.csvSettings35 = csvSettings35;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeArea2" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s);", (data46 != null) ? data46.generateJs() : "null", (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", (data46 != null) ? data46.generateJs() : "null", (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea2" + variableIndex);
        setRangeArea2.add(item);
        return item;
    }
    private String generateJSsetRangeArea2() {
        if (!setRangeArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeArea> setRangeArea3 = new ArrayList<>();

    public CartesianSeriesRangeArea rangeArea(Set data47, TextParsingMode csvSettings33) {
        this.data47 = data47;
        this.csvSettings33 = csvSettings33;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeArea3" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s);", (data47 != null) ? data47.generateJs() : "null", (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", (data47 != null) ? data47.generateJs() : "null", (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea3" + variableIndex);
        setRangeArea3.add(item);
        return item;
    }
    private String generateJSsetRangeArea3() {
        if (!setRangeArea3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeArea> setRangeArea4 = new ArrayList<>();

    public CartesianSeriesRangeArea rangeArea(Set data47, String csvSettings34) {
        this.data47 = data47;
        this.csvSettings34 = csvSettings34;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeArea4" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s);", (data47 != null) ? data47.generateJs() : "null", csvSettings34));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", (data47 != null) ? data47.generateJs() : "null", csvSettings34));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea4" + variableIndex);
        setRangeArea4.add(item);
        return item;
    }
    private String generateJSsetRangeArea4() {
        if (!setRangeArea4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeArea> setRangeArea5 = new ArrayList<>();

    public CartesianSeriesRangeArea rangeArea(Set data47, TextParsingSettings csvSettings35) {
        this.data47 = data47;
        this.csvSettings35 = csvSettings35;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeArea5" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s);", (data47 != null) ? data47.generateJs() : "null", (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", (data47 != null) ? data47.generateJs() : "null", (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea5" + variableIndex);
        setRangeArea5.add(item);
        return item;
    }
    private String generateJSsetRangeArea5() {
        if (!setRangeArea5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeArea> setRangeArea6 = new ArrayList<>();

    public CartesianSeriesRangeArea rangeArea(String[] data48, TextParsingMode csvSettings33) {
        this.data48 = data48;
        this.csvSettings33 = csvSettings33;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeArea6" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s);", Arrays.toString(data48), (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", Arrays.toString(data48), (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea6" + variableIndex);
        setRangeArea6.add(item);
        return item;
    }
    private String generateJSsetRangeArea6() {
        if (!setRangeArea6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeArea> setRangeArea7 = new ArrayList<>();

    public CartesianSeriesRangeArea rangeArea(String[] data48, String csvSettings34) {
        this.data48 = data48;
        this.csvSettings34 = csvSettings34;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeArea7" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s);", Arrays.toString(data48), csvSettings34));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", Arrays.toString(data48), csvSettings34));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea7" + variableIndex);
        setRangeArea7.add(item);
        return item;
    }
    private String generateJSsetRangeArea7() {
        if (!setRangeArea7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeArea> setRangeArea8 = new ArrayList<>();

    public CartesianSeriesRangeArea rangeArea(String[] data48, TextParsingSettings csvSettings35) {
        this.data48 = data48;
        this.csvSettings35 = csvSettings35;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeArea8" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s);", Arrays.toString(data48), (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", Arrays.toString(data48), (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea8" + variableIndex);
        setRangeArea8.add(item);
        return item;
    }
    private String generateJSsetRangeArea8() {
        if (!setRangeArea8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeArea> setRangeArea9 = new ArrayList<>();

    public CartesianSeriesRangeArea rangeArea(String data49, TextParsingMode csvSettings33) {
        this.data49 = data49;
        this.csvSettings33 = csvSettings33;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeArea9" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s);", data49, (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", data49, (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea9" + variableIndex);
        setRangeArea9.add(item);
        return item;
    }
    private String generateJSsetRangeArea9() {
        if (!setRangeArea9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeArea> setRangeArea10 = new ArrayList<>();

    public CartesianSeriesRangeArea rangeArea(String data49, String csvSettings34) {
        this.data49 = data49;
        this.csvSettings34 = csvSettings34;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeArea10" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s);", data49, csvSettings34));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", data49, csvSettings34));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea10" + variableIndex);
        setRangeArea10.add(item);
        return item;
    }
    private String generateJSsetRangeArea10() {
        if (!setRangeArea10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeArea> setRangeArea11 = new ArrayList<>();

    public CartesianSeriesRangeArea rangeArea(String data49, TextParsingSettings csvSettings35) {
        this.data49 = data49;
        this.csvSettings35 = csvSettings35;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeArea11" + ++variableIndex + " = " + jsBase + ".rangeArea(%s, %s);", data49, (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s, %s)", data49, (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea11" + variableIndex);
        setRangeArea11.add(item);
        return item;
    }
    private String generateJSsetRangeArea11() {
        if (!setRangeArea11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data50;
    private Set data51;
    private String[] data52;
    private String data53;
    private TextParsingMode csvSettings36;
    private String csvSettings37;
    private TextParsingSettings csvSettings38;
    private List<SeriesRangeBar> setRangeBar = new ArrayList<>();

    public SeriesRangeBar rangeBar(View data50, TextParsingMode csvSettings36) {
        this.data50 = data50;
        this.csvSettings36 = csvSettings36;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar" + ++variableIndex + " = " + jsBase + ".rangeBar(%s, %s);", (data50 != null) ? data50.generateJs() : "null", (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", (data50 != null) ? data50.generateJs() : "null", (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar" + variableIndex);
        setRangeBar.add(item);
        return item;
    }
    private String generateJSsetRangeBar() {
        if (!setRangeBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar1 = new ArrayList<>();

    public SeriesRangeBar rangeBar(View data50, String csvSettings37) {
        this.data50 = data50;
        this.csvSettings37 = csvSettings37;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar1" + ++variableIndex + " = " + jsBase + ".rangeBar(%s, %s);", (data50 != null) ? data50.generateJs() : "null", csvSettings37));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", (data50 != null) ? data50.generateJs() : "null", csvSettings37));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar1" + variableIndex);
        setRangeBar1.add(item);
        return item;
    }
    private String generateJSsetRangeBar1() {
        if (!setRangeBar1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar2 = new ArrayList<>();

    public SeriesRangeBar rangeBar(View data50, TextParsingSettings csvSettings38) {
        this.data50 = data50;
        this.csvSettings38 = csvSettings38;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar2" + ++variableIndex + " = " + jsBase + ".rangeBar(%s, %s);", (data50 != null) ? data50.generateJs() : "null", (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", (data50 != null) ? data50.generateJs() : "null", (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar2" + variableIndex);
        setRangeBar2.add(item);
        return item;
    }
    private String generateJSsetRangeBar2() {
        if (!setRangeBar2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar3 = new ArrayList<>();

    public SeriesRangeBar rangeBar(Set data51, TextParsingMode csvSettings36) {
        this.data51 = data51;
        this.csvSettings36 = csvSettings36;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar3" + ++variableIndex + " = " + jsBase + ".rangeBar(%s, %s);", (data51 != null) ? data51.generateJs() : "null", (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", (data51 != null) ? data51.generateJs() : "null", (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar3" + variableIndex);
        setRangeBar3.add(item);
        return item;
    }
    private String generateJSsetRangeBar3() {
        if (!setRangeBar3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar4 = new ArrayList<>();

    public SeriesRangeBar rangeBar(Set data51, String csvSettings37) {
        this.data51 = data51;
        this.csvSettings37 = csvSettings37;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar4" + ++variableIndex + " = " + jsBase + ".rangeBar(%s, %s);", (data51 != null) ? data51.generateJs() : "null", csvSettings37));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", (data51 != null) ? data51.generateJs() : "null", csvSettings37));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar4" + variableIndex);
        setRangeBar4.add(item);
        return item;
    }
    private String generateJSsetRangeBar4() {
        if (!setRangeBar4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar5 = new ArrayList<>();

    public SeriesRangeBar rangeBar(Set data51, TextParsingSettings csvSettings38) {
        this.data51 = data51;
        this.csvSettings38 = csvSettings38;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar5" + ++variableIndex + " = " + jsBase + ".rangeBar(%s, %s);", (data51 != null) ? data51.generateJs() : "null", (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", (data51 != null) ? data51.generateJs() : "null", (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar5" + variableIndex);
        setRangeBar5.add(item);
        return item;
    }
    private String generateJSsetRangeBar5() {
        if (!setRangeBar5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar6 = new ArrayList<>();

    public SeriesRangeBar rangeBar(String[] data52, TextParsingMode csvSettings36) {
        this.data52 = data52;
        this.csvSettings36 = csvSettings36;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar6" + ++variableIndex + " = " + jsBase + ".rangeBar(%s, %s);", Arrays.toString(data52), (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", Arrays.toString(data52), (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar6" + variableIndex);
        setRangeBar6.add(item);
        return item;
    }
    private String generateJSsetRangeBar6() {
        if (!setRangeBar6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar7 = new ArrayList<>();

    public SeriesRangeBar rangeBar(String[] data52, String csvSettings37) {
        this.data52 = data52;
        this.csvSettings37 = csvSettings37;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar7" + ++variableIndex + " = " + jsBase + ".rangeBar(%s, %s);", Arrays.toString(data52), csvSettings37));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", Arrays.toString(data52), csvSettings37));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar7" + variableIndex);
        setRangeBar7.add(item);
        return item;
    }
    private String generateJSsetRangeBar7() {
        if (!setRangeBar7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar8 = new ArrayList<>();

    public SeriesRangeBar rangeBar(String[] data52, TextParsingSettings csvSettings38) {
        this.data52 = data52;
        this.csvSettings38 = csvSettings38;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar8" + ++variableIndex + " = " + jsBase + ".rangeBar(%s, %s);", Arrays.toString(data52), (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", Arrays.toString(data52), (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar8" + variableIndex);
        setRangeBar8.add(item);
        return item;
    }
    private String generateJSsetRangeBar8() {
        if (!setRangeBar8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar9 = new ArrayList<>();

    public SeriesRangeBar rangeBar(String data53, TextParsingMode csvSettings36) {
        this.data53 = data53;
        this.csvSettings36 = csvSettings36;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar9" + ++variableIndex + " = " + jsBase + ".rangeBar(%s, %s);", data53, (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", data53, (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar9" + variableIndex);
        setRangeBar9.add(item);
        return item;
    }
    private String generateJSsetRangeBar9() {
        if (!setRangeBar9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar10 = new ArrayList<>();

    public SeriesRangeBar rangeBar(String data53, String csvSettings37) {
        this.data53 = data53;
        this.csvSettings37 = csvSettings37;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar10" + ++variableIndex + " = " + jsBase + ".rangeBar(%s, %s);", data53, csvSettings37));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", data53, csvSettings37));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar10" + variableIndex);
        setRangeBar10.add(item);
        return item;
    }
    private String generateJSsetRangeBar10() {
        if (!setRangeBar10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar11 = new ArrayList<>();

    public SeriesRangeBar rangeBar(String data53, TextParsingSettings csvSettings38) {
        this.data53 = data53;
        this.csvSettings38 = csvSettings38;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeBar11" + ++variableIndex + " = " + jsBase + ".rangeBar(%s, %s);", data53, (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s, %s)", data53, (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar11" + variableIndex);
        setRangeBar11.add(item);
        return item;
    }
    private String generateJSsetRangeBar11() {
        if (!setRangeBar11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data54;
    private Set data55;
    private String[] data56;
    private String data57;
    private TextParsingMode csvSettings39;
    private String csvSettings40;
    private TextParsingSettings csvSettings41;
    private List<CartesianSeriesRangeColumn> setRangeColumn = new ArrayList<>();

    public CartesianSeriesRangeColumn rangeColumn(View data54, TextParsingMode csvSettings39) {
        this.data54 = data54;
        this.csvSettings39 = csvSettings39;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", (data54 != null) ? data54.generateJs() : "null", (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", (data54 != null) ? data54.generateJs() : "null", (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn" + variableIndex);
        setRangeColumn.add(item);
        return item;
    }
    private String generateJSsetRangeColumn() {
        if (!setRangeColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn1 = new ArrayList<>();

    public CartesianSeriesRangeColumn rangeColumn(View data54, String csvSettings40) {
        this.data54 = data54;
        this.csvSettings40 = csvSettings40;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn1" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", (data54 != null) ? data54.generateJs() : "null", csvSettings40));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", (data54 != null) ? data54.generateJs() : "null", csvSettings40));
            js.setLength(0);
        }
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn1" + variableIndex);
        setRangeColumn1.add(item);
        return item;
    }
    private String generateJSsetRangeColumn1() {
        if (!setRangeColumn1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn2 = new ArrayList<>();

    public CartesianSeriesRangeColumn rangeColumn(View data54, TextParsingSettings csvSettings41) {
        this.data54 = data54;
        this.csvSettings41 = csvSettings41;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn2" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", (data54 != null) ? data54.generateJs() : "null", (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", (data54 != null) ? data54.generateJs() : "null", (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn2" + variableIndex);
        setRangeColumn2.add(item);
        return item;
    }
    private String generateJSsetRangeColumn2() {
        if (!setRangeColumn2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn3 = new ArrayList<>();

    public CartesianSeriesRangeColumn rangeColumn(Set data55, TextParsingMode csvSettings39) {
        this.data55 = data55;
        this.csvSettings39 = csvSettings39;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn3" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", (data55 != null) ? data55.generateJs() : "null", (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", (data55 != null) ? data55.generateJs() : "null", (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn3" + variableIndex);
        setRangeColumn3.add(item);
        return item;
    }
    private String generateJSsetRangeColumn3() {
        if (!setRangeColumn3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn4 = new ArrayList<>();

    public CartesianSeriesRangeColumn rangeColumn(Set data55, String csvSettings40) {
        this.data55 = data55;
        this.csvSettings40 = csvSettings40;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn4" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", (data55 != null) ? data55.generateJs() : "null", csvSettings40));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", (data55 != null) ? data55.generateJs() : "null", csvSettings40));
            js.setLength(0);
        }
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn4" + variableIndex);
        setRangeColumn4.add(item);
        return item;
    }
    private String generateJSsetRangeColumn4() {
        if (!setRangeColumn4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn5 = new ArrayList<>();

    public CartesianSeriesRangeColumn rangeColumn(Set data55, TextParsingSettings csvSettings41) {
        this.data55 = data55;
        this.csvSettings41 = csvSettings41;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn5" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", (data55 != null) ? data55.generateJs() : "null", (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", (data55 != null) ? data55.generateJs() : "null", (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn5" + variableIndex);
        setRangeColumn5.add(item);
        return item;
    }
    private String generateJSsetRangeColumn5() {
        if (!setRangeColumn5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn6 = new ArrayList<>();

    public CartesianSeriesRangeColumn rangeColumn(String[] data56, TextParsingMode csvSettings39) {
        this.data56 = data56;
        this.csvSettings39 = csvSettings39;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn6" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", Arrays.toString(data56), (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", Arrays.toString(data56), (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn6" + variableIndex);
        setRangeColumn6.add(item);
        return item;
    }
    private String generateJSsetRangeColumn6() {
        if (!setRangeColumn6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn7 = new ArrayList<>();

    public CartesianSeriesRangeColumn rangeColumn(String[] data56, String csvSettings40) {
        this.data56 = data56;
        this.csvSettings40 = csvSettings40;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn7" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", Arrays.toString(data56), csvSettings40));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", Arrays.toString(data56), csvSettings40));
            js.setLength(0);
        }
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn7" + variableIndex);
        setRangeColumn7.add(item);
        return item;
    }
    private String generateJSsetRangeColumn7() {
        if (!setRangeColumn7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn8 = new ArrayList<>();

    public CartesianSeriesRangeColumn rangeColumn(String[] data56, TextParsingSettings csvSettings41) {
        this.data56 = data56;
        this.csvSettings41 = csvSettings41;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn8" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", Arrays.toString(data56), (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", Arrays.toString(data56), (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn8" + variableIndex);
        setRangeColumn8.add(item);
        return item;
    }
    private String generateJSsetRangeColumn8() {
        if (!setRangeColumn8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn9 = new ArrayList<>();

    public CartesianSeriesRangeColumn rangeColumn(String data57, TextParsingMode csvSettings39) {
        this.data57 = data57;
        this.csvSettings39 = csvSettings39;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn9" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", data57, (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", data57, (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn9" + variableIndex);
        setRangeColumn9.add(item);
        return item;
    }
    private String generateJSsetRangeColumn9() {
        if (!setRangeColumn9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn10 = new ArrayList<>();

    public CartesianSeriesRangeColumn rangeColumn(String data57, String csvSettings40) {
        this.data57 = data57;
        this.csvSettings40 = csvSettings40;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn10" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", data57, csvSettings40));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", data57, csvSettings40));
            js.setLength(0);
        }
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn10" + variableIndex);
        setRangeColumn10.add(item);
        return item;
    }
    private String generateJSsetRangeColumn10() {
        if (!setRangeColumn10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn11 = new ArrayList<>();

    public CartesianSeriesRangeColumn rangeColumn(String data57, TextParsingSettings csvSettings41) {
        this.data57 = data57;
        this.csvSettings41 = csvSettings41;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeColumn11" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s, %s);", data57, (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s, %s)", data57, (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn11" + variableIndex);
        setRangeColumn11.add(item);
        return item;
    }
    private String generateJSsetRangeColumn11() {
        if (!setRangeColumn11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxismarkersRange getRangeMarker;

    public CoreAxismarkersRange getRangeMarker() {
        if (getRangeMarker == null)
            getRangeMarker = new CoreAxismarkersRange(jsBase + ".rangeMarker()");

        return getRangeMarker;
    }

    private List<CoreAxismarkersRange> getRangeMarker1 = new ArrayList<>();

    public CoreAxismarkersRange getRangeMarker(Double index3) {
        CoreAxismarkersRange item = new CoreAxismarkersRange(jsBase + ".rangeMarker("+ index3+")");
        getRangeMarker1.add(item);
        return item;
    }
    private String rangeMarker;
    private Boolean rangeMarker1;
    private List<Cartesian> setRangeMarker = new ArrayList<>();

    public Cartesian setRangeMarker(String rangeMarker) {
        this.rangeMarker = rangeMarker;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%s)", rangeMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%s)", rangeMarker));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangeMarker() {
        if (!setRangeMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setRangeMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setRangeMarker1 = new ArrayList<>();

    public Cartesian setRangeMarker(Boolean rangeMarker1) {
        this.rangeMarker1 = rangeMarker1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%b)", rangeMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%b)", rangeMarker1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangeMarker1() {
        if (!setRangeMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setRangeMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index4;
    private String rangeMarker2;
    private Boolean rangeMarker3;
    private List<Cartesian> setRangeMarker2 = new ArrayList<>();

    public Cartesian setRangeMarker(String rangeMarker2, Double index4) {
        this.rangeMarker2 = rangeMarker2;
        this.index4 = index4;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%s, %f)", rangeMarker2, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%s, %f)", rangeMarker2, index4));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangeMarker2() {
        if (!setRangeMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setRangeMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setRangeMarker3 = new ArrayList<>();

    public Cartesian setRangeMarker(Boolean rangeMarker3, Double index4) {
        this.rangeMarker3 = rangeMarker3;
        this.index4 = index4;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%b, %f)", rangeMarker3, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%b, %f)", rangeMarker3, index4));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangeMarker3() {
        if (!setRangeMarker3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setRangeMarker3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data58;
    private Set data59;
    private String[] data60;
    private String data61;
    private TextParsingMode csvSettings42;
    private String csvSettings43;
    private TextParsingSettings csvSettings44;
    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea = new ArrayList<>();

    public CartesianSeriesRangeSplineArea rangeSplineArea(View data58, TextParsingMode csvSettings42) {
        this.data58 = data58;
        this.csvSettings42 = csvSettings42;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeSplineArea" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s);", (data58 != null) ? data58.generateJs() : "null", (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", (data58 != null) ? data58.generateJs() : "null", (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea" + variableIndex);
        setRangeSplineArea.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea() {
        if (!setRangeSplineArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea1 = new ArrayList<>();

    public CartesianSeriesRangeSplineArea rangeSplineArea(View data58, String csvSettings43) {
        this.data58 = data58;
        this.csvSettings43 = csvSettings43;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeSplineArea1" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s);", (data58 != null) ? data58.generateJs() : "null", csvSettings43));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", (data58 != null) ? data58.generateJs() : "null", csvSettings43));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea1" + variableIndex);
        setRangeSplineArea1.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea1() {
        if (!setRangeSplineArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea2 = new ArrayList<>();

    public CartesianSeriesRangeSplineArea rangeSplineArea(View data58, TextParsingSettings csvSettings44) {
        this.data58 = data58;
        this.csvSettings44 = csvSettings44;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeSplineArea2" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s);", (data58 != null) ? data58.generateJs() : "null", (csvSettings44 != null) ? csvSettings44.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", (data58 != null) ? data58.generateJs() : "null", (csvSettings44 != null) ? csvSettings44.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea2" + variableIndex);
        setRangeSplineArea2.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea2() {
        if (!setRangeSplineArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea3 = new ArrayList<>();

    public CartesianSeriesRangeSplineArea rangeSplineArea(Set data59, TextParsingMode csvSettings42) {
        this.data59 = data59;
        this.csvSettings42 = csvSettings42;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeSplineArea3" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s);", (data59 != null) ? data59.generateJs() : "null", (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", (data59 != null) ? data59.generateJs() : "null", (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea3" + variableIndex);
        setRangeSplineArea3.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea3() {
        if (!setRangeSplineArea3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea4 = new ArrayList<>();

    public CartesianSeriesRangeSplineArea rangeSplineArea(Set data59, String csvSettings43) {
        this.data59 = data59;
        this.csvSettings43 = csvSettings43;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeSplineArea4" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s);", (data59 != null) ? data59.generateJs() : "null", csvSettings43));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", (data59 != null) ? data59.generateJs() : "null", csvSettings43));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea4" + variableIndex);
        setRangeSplineArea4.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea4() {
        if (!setRangeSplineArea4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea5 = new ArrayList<>();

    public CartesianSeriesRangeSplineArea rangeSplineArea(Set data59, TextParsingSettings csvSettings44) {
        this.data59 = data59;
        this.csvSettings44 = csvSettings44;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeSplineArea5" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s);", (data59 != null) ? data59.generateJs() : "null", (csvSettings44 != null) ? csvSettings44.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", (data59 != null) ? data59.generateJs() : "null", (csvSettings44 != null) ? csvSettings44.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea5" + variableIndex);
        setRangeSplineArea5.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea5() {
        if (!setRangeSplineArea5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea6 = new ArrayList<>();

    public CartesianSeriesRangeSplineArea rangeSplineArea(String[] data60, TextParsingMode csvSettings42) {
        this.data60 = data60;
        this.csvSettings42 = csvSettings42;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeSplineArea6" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s);", Arrays.toString(data60), (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", Arrays.toString(data60), (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea6" + variableIndex);
        setRangeSplineArea6.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea6() {
        if (!setRangeSplineArea6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea7 = new ArrayList<>();

    public CartesianSeriesRangeSplineArea rangeSplineArea(String[] data60, String csvSettings43) {
        this.data60 = data60;
        this.csvSettings43 = csvSettings43;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeSplineArea7" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s);", Arrays.toString(data60), csvSettings43));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", Arrays.toString(data60), csvSettings43));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea7" + variableIndex);
        setRangeSplineArea7.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea7() {
        if (!setRangeSplineArea7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea8 = new ArrayList<>();

    public CartesianSeriesRangeSplineArea rangeSplineArea(String[] data60, TextParsingSettings csvSettings44) {
        this.data60 = data60;
        this.csvSettings44 = csvSettings44;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeSplineArea8" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s);", Arrays.toString(data60), (csvSettings44 != null) ? csvSettings44.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", Arrays.toString(data60), (csvSettings44 != null) ? csvSettings44.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea8" + variableIndex);
        setRangeSplineArea8.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea8() {
        if (!setRangeSplineArea8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea9 = new ArrayList<>();

    public CartesianSeriesRangeSplineArea rangeSplineArea(String data61, TextParsingMode csvSettings42) {
        this.data61 = data61;
        this.csvSettings42 = csvSettings42;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeSplineArea9" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s);", data61, (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", data61, (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea9" + variableIndex);
        setRangeSplineArea9.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea9() {
        if (!setRangeSplineArea9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea10 = new ArrayList<>();

    public CartesianSeriesRangeSplineArea rangeSplineArea(String data61, String csvSettings43) {
        this.data61 = data61;
        this.csvSettings43 = csvSettings43;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeSplineArea10" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s);", data61, csvSettings43));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", data61, csvSettings43));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea10" + variableIndex);
        setRangeSplineArea10.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea10() {
        if (!setRangeSplineArea10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea11 = new ArrayList<>();

    public CartesianSeriesRangeSplineArea rangeSplineArea(String data61, TextParsingSettings csvSettings44) {
        this.data61 = data61;
        this.csvSettings44 = csvSettings44;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeSplineArea11" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s, %s);", data61, (csvSettings44 != null) ? csvSettings44.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s, %s)", data61, (csvSettings44 != null) ? csvSettings44.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea11" + variableIndex);
        setRangeSplineArea11.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea11() {
        if (!setRangeSplineArea11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data62;
    private Set data63;
    private String[] data64;
    private String data65;
    private TextParsingMode csvSettings45;
    private String csvSettings46;
    private TextParsingSettings csvSettings47;
    private List<CartesianSeriesRangeStepArea> setRangeStepArea = new ArrayList<>();

    public CartesianSeriesRangeStepArea rangeStepArea(View data62, TextParsingMode csvSettings45) {
        this.data62 = data62;
        this.csvSettings45 = csvSettings45;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeStepArea" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s);", (data62 != null) ? data62.generateJs() : "null", (csvSettings45 != null) ? csvSettings45.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", (data62 != null) ? data62.generateJs() : "null", (csvSettings45 != null) ? csvSettings45.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea" + variableIndex);
        setRangeStepArea.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea() {
        if (!setRangeStepArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea1 = new ArrayList<>();

    public CartesianSeriesRangeStepArea rangeStepArea(View data62, String csvSettings46) {
        this.data62 = data62;
        this.csvSettings46 = csvSettings46;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeStepArea1" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s);", (data62 != null) ? data62.generateJs() : "null", csvSettings46));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", (data62 != null) ? data62.generateJs() : "null", csvSettings46));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea1" + variableIndex);
        setRangeStepArea1.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea1() {
        if (!setRangeStepArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea2 = new ArrayList<>();

    public CartesianSeriesRangeStepArea rangeStepArea(View data62, TextParsingSettings csvSettings47) {
        this.data62 = data62;
        this.csvSettings47 = csvSettings47;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeStepArea2" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s);", (data62 != null) ? data62.generateJs() : "null", (csvSettings47 != null) ? csvSettings47.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", (data62 != null) ? data62.generateJs() : "null", (csvSettings47 != null) ? csvSettings47.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea2" + variableIndex);
        setRangeStepArea2.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea2() {
        if (!setRangeStepArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea3 = new ArrayList<>();

    public CartesianSeriesRangeStepArea rangeStepArea(Set data63, TextParsingMode csvSettings45) {
        this.data63 = data63;
        this.csvSettings45 = csvSettings45;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeStepArea3" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s);", (data63 != null) ? data63.generateJs() : "null", (csvSettings45 != null) ? csvSettings45.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", (data63 != null) ? data63.generateJs() : "null", (csvSettings45 != null) ? csvSettings45.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea3" + variableIndex);
        setRangeStepArea3.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea3() {
        if (!setRangeStepArea3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea4 = new ArrayList<>();

    public CartesianSeriesRangeStepArea rangeStepArea(Set data63, String csvSettings46) {
        this.data63 = data63;
        this.csvSettings46 = csvSettings46;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeStepArea4" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s);", (data63 != null) ? data63.generateJs() : "null", csvSettings46));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", (data63 != null) ? data63.generateJs() : "null", csvSettings46));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea4" + variableIndex);
        setRangeStepArea4.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea4() {
        if (!setRangeStepArea4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea5 = new ArrayList<>();

    public CartesianSeriesRangeStepArea rangeStepArea(Set data63, TextParsingSettings csvSettings47) {
        this.data63 = data63;
        this.csvSettings47 = csvSettings47;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeStepArea5" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s);", (data63 != null) ? data63.generateJs() : "null", (csvSettings47 != null) ? csvSettings47.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", (data63 != null) ? data63.generateJs() : "null", (csvSettings47 != null) ? csvSettings47.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea5" + variableIndex);
        setRangeStepArea5.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea5() {
        if (!setRangeStepArea5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea6 = new ArrayList<>();

    public CartesianSeriesRangeStepArea rangeStepArea(String[] data64, TextParsingMode csvSettings45) {
        this.data64 = data64;
        this.csvSettings45 = csvSettings45;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeStepArea6" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s);", Arrays.toString(data64), (csvSettings45 != null) ? csvSettings45.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", Arrays.toString(data64), (csvSettings45 != null) ? csvSettings45.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea6" + variableIndex);
        setRangeStepArea6.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea6() {
        if (!setRangeStepArea6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea7 = new ArrayList<>();

    public CartesianSeriesRangeStepArea rangeStepArea(String[] data64, String csvSettings46) {
        this.data64 = data64;
        this.csvSettings46 = csvSettings46;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeStepArea7" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s);", Arrays.toString(data64), csvSettings46));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", Arrays.toString(data64), csvSettings46));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea7" + variableIndex);
        setRangeStepArea7.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea7() {
        if (!setRangeStepArea7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea8 = new ArrayList<>();

    public CartesianSeriesRangeStepArea rangeStepArea(String[] data64, TextParsingSettings csvSettings47) {
        this.data64 = data64;
        this.csvSettings47 = csvSettings47;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeStepArea8" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s);", Arrays.toString(data64), (csvSettings47 != null) ? csvSettings47.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", Arrays.toString(data64), (csvSettings47 != null) ? csvSettings47.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea8" + variableIndex);
        setRangeStepArea8.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea8() {
        if (!setRangeStepArea8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea9 = new ArrayList<>();

    public CartesianSeriesRangeStepArea rangeStepArea(String data65, TextParsingMode csvSettings45) {
        this.data65 = data65;
        this.csvSettings45 = csvSettings45;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeStepArea9" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s);", data65, (csvSettings45 != null) ? csvSettings45.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", data65, (csvSettings45 != null) ? csvSettings45.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea9" + variableIndex);
        setRangeStepArea9.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea9() {
        if (!setRangeStepArea9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea10 = new ArrayList<>();

    public CartesianSeriesRangeStepArea rangeStepArea(String data65, String csvSettings46) {
        this.data65 = data65;
        this.csvSettings46 = csvSettings46;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeStepArea10" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s);", data65, csvSettings46));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", data65, csvSettings46));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea10" + variableIndex);
        setRangeStepArea10.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea10() {
        if (!setRangeStepArea10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea11 = new ArrayList<>();

    public CartesianSeriesRangeStepArea rangeStepArea(String data65, TextParsingSettings csvSettings47) {
        this.data65 = data65;
        this.csvSettings47 = csvSettings47;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setRangeStepArea11" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s, %s);", data65, (csvSettings47 != null) ? csvSettings47.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s, %s)", data65, (csvSettings47 != null) ? csvSettings47.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea11" + variableIndex);
        setRangeStepArea11.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea11() {
        if (!setRangeStepArea11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double id2;
    private String id3;
    private List<Cartesian> setRemoveSeries = new ArrayList<>();

    public Cartesian removeSeries(Double id2) {
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
            for (Cartesian item : setRemoveSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setRemoveSeries1 = new ArrayList<>();

    public Cartesian removeSeries(String id3) {
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
            for (Cartesian item : setRemoveSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index5;
    private List<Cartesian> setRemoveSeriesAt = new ArrayList<>();

    public Cartesian removeSeriesAt(Double index5) {
        this.index5 = index5;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeriesAt(%f)", index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeriesAt(%f)", index5));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRemoveSeriesAt() {
        if (!setRemoveSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setRemoveSeriesAt) {
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
    private List<Cartesian> setSelected = new ArrayList<>();

    public Cartesian setSelected(String selected) {
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
            for (Cartesian item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data66;
    private Set data67;
    private String[] data68;
    private String data69;
    private TextParsingMode csvSettings48;
    private String csvSettings49;
    private TextParsingSettings csvSettings50;
    private List<CartesianSeriesSpline> setSpline = new ArrayList<>();

    public CartesianSeriesSpline spline(View data66, TextParsingMode csvSettings48) {
        this.data66 = data66;
        this.csvSettings48 = csvSettings48;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSpline" + ++variableIndex + " = " + jsBase + ".spline(%s, %s);", (data66 != null) ? data66.generateJs() : "null", (csvSettings48 != null) ? csvSettings48.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s)", (data66 != null) ? data66.generateJs() : "null", (csvSettings48 != null) ? csvSettings48.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline" + variableIndex);
        setSpline.add(item);
        return item;
    }
    private String generateJSsetSpline() {
        if (!setSpline.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSpline> setSpline1 = new ArrayList<>();

    public CartesianSeriesSpline spline(View data66, String csvSettings49) {
        this.data66 = data66;
        this.csvSettings49 = csvSettings49;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSpline1" + ++variableIndex + " = " + jsBase + ".spline(%s, %s);", (data66 != null) ? data66.generateJs() : "null", csvSettings49));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s)", (data66 != null) ? data66.generateJs() : "null", csvSettings49));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline1" + variableIndex);
        setSpline1.add(item);
        return item;
    }
    private String generateJSsetSpline1() {
        if (!setSpline1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSpline> setSpline2 = new ArrayList<>();

    public CartesianSeriesSpline spline(View data66, TextParsingSettings csvSettings50) {
        this.data66 = data66;
        this.csvSettings50 = csvSettings50;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSpline2" + ++variableIndex + " = " + jsBase + ".spline(%s, %s);", (data66 != null) ? data66.generateJs() : "null", (csvSettings50 != null) ? csvSettings50.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s)", (data66 != null) ? data66.generateJs() : "null", (csvSettings50 != null) ? csvSettings50.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline2" + variableIndex);
        setSpline2.add(item);
        return item;
    }
    private String generateJSsetSpline2() {
        if (!setSpline2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSpline> setSpline3 = new ArrayList<>();

    public CartesianSeriesSpline spline(Set data67, TextParsingMode csvSettings48) {
        this.data67 = data67;
        this.csvSettings48 = csvSettings48;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSpline3" + ++variableIndex + " = " + jsBase + ".spline(%s, %s);", (data67 != null) ? data67.generateJs() : "null", (csvSettings48 != null) ? csvSettings48.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s)", (data67 != null) ? data67.generateJs() : "null", (csvSettings48 != null) ? csvSettings48.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline3" + variableIndex);
        setSpline3.add(item);
        return item;
    }
    private String generateJSsetSpline3() {
        if (!setSpline3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSpline> setSpline4 = new ArrayList<>();

    public CartesianSeriesSpline spline(Set data67, String csvSettings49) {
        this.data67 = data67;
        this.csvSettings49 = csvSettings49;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSpline4" + ++variableIndex + " = " + jsBase + ".spline(%s, %s);", (data67 != null) ? data67.generateJs() : "null", csvSettings49));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s)", (data67 != null) ? data67.generateJs() : "null", csvSettings49));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline4" + variableIndex);
        setSpline4.add(item);
        return item;
    }
    private String generateJSsetSpline4() {
        if (!setSpline4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSpline> setSpline5 = new ArrayList<>();

    public CartesianSeriesSpline spline(Set data67, TextParsingSettings csvSettings50) {
        this.data67 = data67;
        this.csvSettings50 = csvSettings50;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSpline5" + ++variableIndex + " = " + jsBase + ".spline(%s, %s);", (data67 != null) ? data67.generateJs() : "null", (csvSettings50 != null) ? csvSettings50.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s)", (data67 != null) ? data67.generateJs() : "null", (csvSettings50 != null) ? csvSettings50.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline5" + variableIndex);
        setSpline5.add(item);
        return item;
    }
    private String generateJSsetSpline5() {
        if (!setSpline5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSpline> setSpline6 = new ArrayList<>();

    public CartesianSeriesSpline spline(String[] data68, TextParsingMode csvSettings48) {
        this.data68 = data68;
        this.csvSettings48 = csvSettings48;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSpline6" + ++variableIndex + " = " + jsBase + ".spline(%s, %s);", Arrays.toString(data68), (csvSettings48 != null) ? csvSettings48.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s)", Arrays.toString(data68), (csvSettings48 != null) ? csvSettings48.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline6" + variableIndex);
        setSpline6.add(item);
        return item;
    }
    private String generateJSsetSpline6() {
        if (!setSpline6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSpline> setSpline7 = new ArrayList<>();

    public CartesianSeriesSpline spline(String[] data68, String csvSettings49) {
        this.data68 = data68;
        this.csvSettings49 = csvSettings49;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSpline7" + ++variableIndex + " = " + jsBase + ".spline(%s, %s);", Arrays.toString(data68), csvSettings49));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s)", Arrays.toString(data68), csvSettings49));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline7" + variableIndex);
        setSpline7.add(item);
        return item;
    }
    private String generateJSsetSpline7() {
        if (!setSpline7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSpline> setSpline8 = new ArrayList<>();

    public CartesianSeriesSpline spline(String[] data68, TextParsingSettings csvSettings50) {
        this.data68 = data68;
        this.csvSettings50 = csvSettings50;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSpline8" + ++variableIndex + " = " + jsBase + ".spline(%s, %s);", Arrays.toString(data68), (csvSettings50 != null) ? csvSettings50.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s)", Arrays.toString(data68), (csvSettings50 != null) ? csvSettings50.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline8" + variableIndex);
        setSpline8.add(item);
        return item;
    }
    private String generateJSsetSpline8() {
        if (!setSpline8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSpline> setSpline9 = new ArrayList<>();

    public CartesianSeriesSpline spline(String data69, TextParsingMode csvSettings48) {
        this.data69 = data69;
        this.csvSettings48 = csvSettings48;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSpline9" + ++variableIndex + " = " + jsBase + ".spline(%s, %s);", data69, (csvSettings48 != null) ? csvSettings48.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s)", data69, (csvSettings48 != null) ? csvSettings48.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline9" + variableIndex);
        setSpline9.add(item);
        return item;
    }
    private String generateJSsetSpline9() {
        if (!setSpline9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSpline> setSpline10 = new ArrayList<>();

    public CartesianSeriesSpline spline(String data69, String csvSettings49) {
        this.data69 = data69;
        this.csvSettings49 = csvSettings49;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSpline10" + ++variableIndex + " = " + jsBase + ".spline(%s, %s);", data69, csvSettings49));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s)", data69, csvSettings49));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline10" + variableIndex);
        setSpline10.add(item);
        return item;
    }
    private String generateJSsetSpline10() {
        if (!setSpline10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSpline> setSpline11 = new ArrayList<>();

    public CartesianSeriesSpline spline(String data69, TextParsingSettings csvSettings50) {
        this.data69 = data69;
        this.csvSettings50 = csvSettings50;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSpline11" + ++variableIndex + " = " + jsBase + ".spline(%s, %s);", data69, (csvSettings50 != null) ? csvSettings50.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s, %s)", data69, (csvSettings50 != null) ? csvSettings50.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline11" + variableIndex);
        setSpline11.add(item);
        return item;
    }
    private String generateJSsetSpline11() {
        if (!setSpline11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data70;
    private Set data71;
    private String[] data72;
    private String data73;
    private TextParsingMode csvSettings51;
    private String csvSettings52;
    private TextParsingSettings csvSettings53;
    private List<CartesianSeriesSplineArea> setSplineArea = new ArrayList<>();

    public CartesianSeriesSplineArea splineArea(View data70, TextParsingMode csvSettings51) {
        this.data70 = data70;
        this.csvSettings51 = csvSettings51;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSplineArea" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s);", (data70 != null) ? data70.generateJs() : "null", (csvSettings51 != null) ? csvSettings51.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", (data70 != null) ? data70.generateJs() : "null", (csvSettings51 != null) ? csvSettings51.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea" + variableIndex);
        setSplineArea.add(item);
        return item;
    }
    private String generateJSsetSplineArea() {
        if (!setSplineArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea1 = new ArrayList<>();

    public CartesianSeriesSplineArea splineArea(View data70, String csvSettings52) {
        this.data70 = data70;
        this.csvSettings52 = csvSettings52;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSplineArea1" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s);", (data70 != null) ? data70.generateJs() : "null", csvSettings52));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", (data70 != null) ? data70.generateJs() : "null", csvSettings52));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea1" + variableIndex);
        setSplineArea1.add(item);
        return item;
    }
    private String generateJSsetSplineArea1() {
        if (!setSplineArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea2 = new ArrayList<>();

    public CartesianSeriesSplineArea splineArea(View data70, TextParsingSettings csvSettings53) {
        this.data70 = data70;
        this.csvSettings53 = csvSettings53;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSplineArea2" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s);", (data70 != null) ? data70.generateJs() : "null", (csvSettings53 != null) ? csvSettings53.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", (data70 != null) ? data70.generateJs() : "null", (csvSettings53 != null) ? csvSettings53.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea2" + variableIndex);
        setSplineArea2.add(item);
        return item;
    }
    private String generateJSsetSplineArea2() {
        if (!setSplineArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea3 = new ArrayList<>();

    public CartesianSeriesSplineArea splineArea(Set data71, TextParsingMode csvSettings51) {
        this.data71 = data71;
        this.csvSettings51 = csvSettings51;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSplineArea3" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s);", (data71 != null) ? data71.generateJs() : "null", (csvSettings51 != null) ? csvSettings51.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", (data71 != null) ? data71.generateJs() : "null", (csvSettings51 != null) ? csvSettings51.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea3" + variableIndex);
        setSplineArea3.add(item);
        return item;
    }
    private String generateJSsetSplineArea3() {
        if (!setSplineArea3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea4 = new ArrayList<>();

    public CartesianSeriesSplineArea splineArea(Set data71, String csvSettings52) {
        this.data71 = data71;
        this.csvSettings52 = csvSettings52;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSplineArea4" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s);", (data71 != null) ? data71.generateJs() : "null", csvSettings52));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", (data71 != null) ? data71.generateJs() : "null", csvSettings52));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea4" + variableIndex);
        setSplineArea4.add(item);
        return item;
    }
    private String generateJSsetSplineArea4() {
        if (!setSplineArea4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea5 = new ArrayList<>();

    public CartesianSeriesSplineArea splineArea(Set data71, TextParsingSettings csvSettings53) {
        this.data71 = data71;
        this.csvSettings53 = csvSettings53;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSplineArea5" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s);", (data71 != null) ? data71.generateJs() : "null", (csvSettings53 != null) ? csvSettings53.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", (data71 != null) ? data71.generateJs() : "null", (csvSettings53 != null) ? csvSettings53.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea5" + variableIndex);
        setSplineArea5.add(item);
        return item;
    }
    private String generateJSsetSplineArea5() {
        if (!setSplineArea5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea6 = new ArrayList<>();

    public CartesianSeriesSplineArea splineArea(String[] data72, TextParsingMode csvSettings51) {
        this.data72 = data72;
        this.csvSettings51 = csvSettings51;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSplineArea6" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s);", Arrays.toString(data72), (csvSettings51 != null) ? csvSettings51.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", Arrays.toString(data72), (csvSettings51 != null) ? csvSettings51.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea6" + variableIndex);
        setSplineArea6.add(item);
        return item;
    }
    private String generateJSsetSplineArea6() {
        if (!setSplineArea6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea7 = new ArrayList<>();

    public CartesianSeriesSplineArea splineArea(String[] data72, String csvSettings52) {
        this.data72 = data72;
        this.csvSettings52 = csvSettings52;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSplineArea7" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s);", Arrays.toString(data72), csvSettings52));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", Arrays.toString(data72), csvSettings52));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea7" + variableIndex);
        setSplineArea7.add(item);
        return item;
    }
    private String generateJSsetSplineArea7() {
        if (!setSplineArea7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea8 = new ArrayList<>();

    public CartesianSeriesSplineArea splineArea(String[] data72, TextParsingSettings csvSettings53) {
        this.data72 = data72;
        this.csvSettings53 = csvSettings53;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSplineArea8" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s);", Arrays.toString(data72), (csvSettings53 != null) ? csvSettings53.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", Arrays.toString(data72), (csvSettings53 != null) ? csvSettings53.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea8" + variableIndex);
        setSplineArea8.add(item);
        return item;
    }
    private String generateJSsetSplineArea8() {
        if (!setSplineArea8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea9 = new ArrayList<>();

    public CartesianSeriesSplineArea splineArea(String data73, TextParsingMode csvSettings51) {
        this.data73 = data73;
        this.csvSettings51 = csvSettings51;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSplineArea9" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s);", data73, (csvSettings51 != null) ? csvSettings51.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", data73, (csvSettings51 != null) ? csvSettings51.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea9" + variableIndex);
        setSplineArea9.add(item);
        return item;
    }
    private String generateJSsetSplineArea9() {
        if (!setSplineArea9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea10 = new ArrayList<>();

    public CartesianSeriesSplineArea splineArea(String data73, String csvSettings52) {
        this.data73 = data73;
        this.csvSettings52 = csvSettings52;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSplineArea10" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s);", data73, csvSettings52));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", data73, csvSettings52));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea10" + variableIndex);
        setSplineArea10.add(item);
        return item;
    }
    private String generateJSsetSplineArea10() {
        if (!setSplineArea10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea11 = new ArrayList<>();

    public CartesianSeriesSplineArea splineArea(String data73, TextParsingSettings csvSettings53) {
        this.data73 = data73;
        this.csvSettings53 = csvSettings53;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setSplineArea11" + ++variableIndex + " = " + jsBase + ".splineArea(%s, %s);", data73, (csvSettings53 != null) ? csvSettings53.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s, %s)", data73, (csvSettings53 != null) ? csvSettings53.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea11" + variableIndex);
        setSplineArea11.add(item);
        return item;
    }
    private String generateJSsetSplineArea11() {
        if (!setSplineArea11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data74;
    private Set data75;
    private String[] data76;
    private String data77;
    private TextParsingMode csvSettings54;
    private String csvSettings55;
    private TextParsingSettings csvSettings56;
    private List<CartesianSeriesStepArea> setStepArea = new ArrayList<>();

    public CartesianSeriesStepArea stepArea(View data74, TextParsingMode csvSettings54) {
        this.data74 = data74;
        this.csvSettings54 = csvSettings54;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepArea" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s);", (data74 != null) ? data74.generateJs() : "null", (csvSettings54 != null) ? csvSettings54.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", (data74 != null) ? data74.generateJs() : "null", (csvSettings54 != null) ? csvSettings54.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea" + variableIndex);
        setStepArea.add(item);
        return item;
    }
    private String generateJSsetStepArea() {
        if (!setStepArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea1 = new ArrayList<>();

    public CartesianSeriesStepArea stepArea(View data74, String csvSettings55) {
        this.data74 = data74;
        this.csvSettings55 = csvSettings55;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepArea1" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s);", (data74 != null) ? data74.generateJs() : "null", csvSettings55));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", (data74 != null) ? data74.generateJs() : "null", csvSettings55));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea1" + variableIndex);
        setStepArea1.add(item);
        return item;
    }
    private String generateJSsetStepArea1() {
        if (!setStepArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea2 = new ArrayList<>();

    public CartesianSeriesStepArea stepArea(View data74, TextParsingSettings csvSettings56) {
        this.data74 = data74;
        this.csvSettings56 = csvSettings56;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepArea2" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s);", (data74 != null) ? data74.generateJs() : "null", (csvSettings56 != null) ? csvSettings56.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", (data74 != null) ? data74.generateJs() : "null", (csvSettings56 != null) ? csvSettings56.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea2" + variableIndex);
        setStepArea2.add(item);
        return item;
    }
    private String generateJSsetStepArea2() {
        if (!setStepArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea3 = new ArrayList<>();

    public CartesianSeriesStepArea stepArea(Set data75, TextParsingMode csvSettings54) {
        this.data75 = data75;
        this.csvSettings54 = csvSettings54;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepArea3" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s);", (data75 != null) ? data75.generateJs() : "null", (csvSettings54 != null) ? csvSettings54.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", (data75 != null) ? data75.generateJs() : "null", (csvSettings54 != null) ? csvSettings54.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea3" + variableIndex);
        setStepArea3.add(item);
        return item;
    }
    private String generateJSsetStepArea3() {
        if (!setStepArea3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea4 = new ArrayList<>();

    public CartesianSeriesStepArea stepArea(Set data75, String csvSettings55) {
        this.data75 = data75;
        this.csvSettings55 = csvSettings55;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepArea4" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s);", (data75 != null) ? data75.generateJs() : "null", csvSettings55));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", (data75 != null) ? data75.generateJs() : "null", csvSettings55));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea4" + variableIndex);
        setStepArea4.add(item);
        return item;
    }
    private String generateJSsetStepArea4() {
        if (!setStepArea4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea5 = new ArrayList<>();

    public CartesianSeriesStepArea stepArea(Set data75, TextParsingSettings csvSettings56) {
        this.data75 = data75;
        this.csvSettings56 = csvSettings56;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepArea5" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s);", (data75 != null) ? data75.generateJs() : "null", (csvSettings56 != null) ? csvSettings56.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", (data75 != null) ? data75.generateJs() : "null", (csvSettings56 != null) ? csvSettings56.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea5" + variableIndex);
        setStepArea5.add(item);
        return item;
    }
    private String generateJSsetStepArea5() {
        if (!setStepArea5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea6 = new ArrayList<>();

    public CartesianSeriesStepArea stepArea(String[] data76, TextParsingMode csvSettings54) {
        this.data76 = data76;
        this.csvSettings54 = csvSettings54;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepArea6" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s);", Arrays.toString(data76), (csvSettings54 != null) ? csvSettings54.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", Arrays.toString(data76), (csvSettings54 != null) ? csvSettings54.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea6" + variableIndex);
        setStepArea6.add(item);
        return item;
    }
    private String generateJSsetStepArea6() {
        if (!setStepArea6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea7 = new ArrayList<>();

    public CartesianSeriesStepArea stepArea(String[] data76, String csvSettings55) {
        this.data76 = data76;
        this.csvSettings55 = csvSettings55;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepArea7" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s);", Arrays.toString(data76), csvSettings55));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", Arrays.toString(data76), csvSettings55));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea7" + variableIndex);
        setStepArea7.add(item);
        return item;
    }
    private String generateJSsetStepArea7() {
        if (!setStepArea7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea8 = new ArrayList<>();

    public CartesianSeriesStepArea stepArea(String[] data76, TextParsingSettings csvSettings56) {
        this.data76 = data76;
        this.csvSettings56 = csvSettings56;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepArea8" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s);", Arrays.toString(data76), (csvSettings56 != null) ? csvSettings56.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", Arrays.toString(data76), (csvSettings56 != null) ? csvSettings56.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea8" + variableIndex);
        setStepArea8.add(item);
        return item;
    }
    private String generateJSsetStepArea8() {
        if (!setStepArea8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea9 = new ArrayList<>();

    public CartesianSeriesStepArea stepArea(String data77, TextParsingMode csvSettings54) {
        this.data77 = data77;
        this.csvSettings54 = csvSettings54;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepArea9" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s);", data77, (csvSettings54 != null) ? csvSettings54.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", data77, (csvSettings54 != null) ? csvSettings54.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea9" + variableIndex);
        setStepArea9.add(item);
        return item;
    }
    private String generateJSsetStepArea9() {
        if (!setStepArea9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea10 = new ArrayList<>();

    public CartesianSeriesStepArea stepArea(String data77, String csvSettings55) {
        this.data77 = data77;
        this.csvSettings55 = csvSettings55;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepArea10" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s);", data77, csvSettings55));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", data77, csvSettings55));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea10" + variableIndex);
        setStepArea10.add(item);
        return item;
    }
    private String generateJSsetStepArea10() {
        if (!setStepArea10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea11 = new ArrayList<>();

    public CartesianSeriesStepArea stepArea(String data77, TextParsingSettings csvSettings56) {
        this.data77 = data77;
        this.csvSettings56 = csvSettings56;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepArea11" + ++variableIndex + " = " + jsBase + ".stepArea(%s, %s);", data77, (csvSettings56 != null) ? csvSettings56.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s, %s)", data77, (csvSettings56 != null) ? csvSettings56.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea11" + variableIndex);
        setStepArea11.add(item);
        return item;
    }
    private String generateJSsetStepArea11() {
        if (!setStepArea11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data78;
    private Set data79;
    private String[] data80;
    private String data81;
    private TextParsingMode csvSettings57;
    private String csvSettings58;
    private TextParsingSettings csvSettings59;
    private List<CartesianSeriesStepLine> setStepLine = new ArrayList<>();

    public CartesianSeriesStepLine stepLine(View data78, TextParsingMode csvSettings57) {
        this.data78 = data78;
        this.csvSettings57 = csvSettings57;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepLine" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s);", (data78 != null) ? data78.generateJs() : "null", (csvSettings57 != null) ? csvSettings57.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", (data78 != null) ? data78.generateJs() : "null", (csvSettings57 != null) ? csvSettings57.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine" + variableIndex);
        setStepLine.add(item);
        return item;
    }
    private String generateJSsetStepLine() {
        if (!setStepLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine1 = new ArrayList<>();

    public CartesianSeriesStepLine stepLine(View data78, String csvSettings58) {
        this.data78 = data78;
        this.csvSettings58 = csvSettings58;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepLine1" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s);", (data78 != null) ? data78.generateJs() : "null", csvSettings58));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", (data78 != null) ? data78.generateJs() : "null", csvSettings58));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine1" + variableIndex);
        setStepLine1.add(item);
        return item;
    }
    private String generateJSsetStepLine1() {
        if (!setStepLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine2 = new ArrayList<>();

    public CartesianSeriesStepLine stepLine(View data78, TextParsingSettings csvSettings59) {
        this.data78 = data78;
        this.csvSettings59 = csvSettings59;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepLine2" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s);", (data78 != null) ? data78.generateJs() : "null", (csvSettings59 != null) ? csvSettings59.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", (data78 != null) ? data78.generateJs() : "null", (csvSettings59 != null) ? csvSettings59.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine2" + variableIndex);
        setStepLine2.add(item);
        return item;
    }
    private String generateJSsetStepLine2() {
        if (!setStepLine2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine3 = new ArrayList<>();

    public CartesianSeriesStepLine stepLine(Set data79, TextParsingMode csvSettings57) {
        this.data79 = data79;
        this.csvSettings57 = csvSettings57;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepLine3" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s);", (data79 != null) ? data79.generateJs() : "null", (csvSettings57 != null) ? csvSettings57.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", (data79 != null) ? data79.generateJs() : "null", (csvSettings57 != null) ? csvSettings57.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine3" + variableIndex);
        setStepLine3.add(item);
        return item;
    }
    private String generateJSsetStepLine3() {
        if (!setStepLine3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine4 = new ArrayList<>();

    public CartesianSeriesStepLine stepLine(Set data79, String csvSettings58) {
        this.data79 = data79;
        this.csvSettings58 = csvSettings58;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepLine4" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s);", (data79 != null) ? data79.generateJs() : "null", csvSettings58));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", (data79 != null) ? data79.generateJs() : "null", csvSettings58));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine4" + variableIndex);
        setStepLine4.add(item);
        return item;
    }
    private String generateJSsetStepLine4() {
        if (!setStepLine4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine5 = new ArrayList<>();

    public CartesianSeriesStepLine stepLine(Set data79, TextParsingSettings csvSettings59) {
        this.data79 = data79;
        this.csvSettings59 = csvSettings59;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepLine5" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s);", (data79 != null) ? data79.generateJs() : "null", (csvSettings59 != null) ? csvSettings59.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", (data79 != null) ? data79.generateJs() : "null", (csvSettings59 != null) ? csvSettings59.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine5" + variableIndex);
        setStepLine5.add(item);
        return item;
    }
    private String generateJSsetStepLine5() {
        if (!setStepLine5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine6 = new ArrayList<>();

    public CartesianSeriesStepLine stepLine(String[] data80, TextParsingMode csvSettings57) {
        this.data80 = data80;
        this.csvSettings57 = csvSettings57;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepLine6" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s);", Arrays.toString(data80), (csvSettings57 != null) ? csvSettings57.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", Arrays.toString(data80), (csvSettings57 != null) ? csvSettings57.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine6" + variableIndex);
        setStepLine6.add(item);
        return item;
    }
    private String generateJSsetStepLine6() {
        if (!setStepLine6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine7 = new ArrayList<>();

    public CartesianSeriesStepLine stepLine(String[] data80, String csvSettings58) {
        this.data80 = data80;
        this.csvSettings58 = csvSettings58;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepLine7" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s);", Arrays.toString(data80), csvSettings58));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", Arrays.toString(data80), csvSettings58));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine7" + variableIndex);
        setStepLine7.add(item);
        return item;
    }
    private String generateJSsetStepLine7() {
        if (!setStepLine7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine8 = new ArrayList<>();

    public CartesianSeriesStepLine stepLine(String[] data80, TextParsingSettings csvSettings59) {
        this.data80 = data80;
        this.csvSettings59 = csvSettings59;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepLine8" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s);", Arrays.toString(data80), (csvSettings59 != null) ? csvSettings59.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", Arrays.toString(data80), (csvSettings59 != null) ? csvSettings59.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine8" + variableIndex);
        setStepLine8.add(item);
        return item;
    }
    private String generateJSsetStepLine8() {
        if (!setStepLine8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine9 = new ArrayList<>();

    public CartesianSeriesStepLine stepLine(String data81, TextParsingMode csvSettings57) {
        this.data81 = data81;
        this.csvSettings57 = csvSettings57;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepLine9" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s);", data81, (csvSettings57 != null) ? csvSettings57.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", data81, (csvSettings57 != null) ? csvSettings57.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine9" + variableIndex);
        setStepLine9.add(item);
        return item;
    }
    private String generateJSsetStepLine9() {
        if (!setStepLine9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine10 = new ArrayList<>();

    public CartesianSeriesStepLine stepLine(String data81, String csvSettings58) {
        this.data81 = data81;
        this.csvSettings58 = csvSettings58;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepLine10" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s);", data81, csvSettings58));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", data81, csvSettings58));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine10" + variableIndex);
        setStepLine10.add(item);
        return item;
    }
    private String generateJSsetStepLine10() {
        if (!setStepLine10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine11 = new ArrayList<>();

    public CartesianSeriesStepLine stepLine(String data81, TextParsingSettings csvSettings59) {
        this.data81 = data81;
        this.csvSettings59 = csvSettings59;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStepLine11" + ++variableIndex + " = " + jsBase + ".stepLine(%s, %s);", data81, (csvSettings59 != null) ? csvSettings59.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s, %s)", data81, (csvSettings59 != null) ? csvSettings59.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine11" + variableIndex);
        setStepLine11.add(item);
        return item;
    }
    private String generateJSsetStepLine11() {
        if (!setStepLine11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data82;
    private Set data83;
    private String[] data84;
    private String data85;
    private TextParsingMode csvSettings60;
    private String csvSettings61;
    private TextParsingSettings csvSettings62;
    private List<CartesianSeriesStick> setStick = new ArrayList<>();

    public CartesianSeriesStick stick(View data82, TextParsingMode csvSettings60) {
        this.data82 = data82;
        this.csvSettings60 = csvSettings60;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStick" + ++variableIndex + " = " + jsBase + ".stick(%s, %s);", (data82 != null) ? data82.generateJs() : "null", (csvSettings60 != null) ? csvSettings60.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s)", (data82 != null) ? data82.generateJs() : "null", (csvSettings60 != null) ? csvSettings60.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick" + variableIndex);
        setStick.add(item);
        return item;
    }
    private String generateJSsetStick() {
        if (!setStick.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick1 = new ArrayList<>();

    public CartesianSeriesStick stick(View data82, String csvSettings61) {
        this.data82 = data82;
        this.csvSettings61 = csvSettings61;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStick1" + ++variableIndex + " = " + jsBase + ".stick(%s, %s);", (data82 != null) ? data82.generateJs() : "null", csvSettings61));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s)", (data82 != null) ? data82.generateJs() : "null", csvSettings61));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick1" + variableIndex);
        setStick1.add(item);
        return item;
    }
    private String generateJSsetStick1() {
        if (!setStick1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick2 = new ArrayList<>();

    public CartesianSeriesStick stick(View data82, TextParsingSettings csvSettings62) {
        this.data82 = data82;
        this.csvSettings62 = csvSettings62;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStick2" + ++variableIndex + " = " + jsBase + ".stick(%s, %s);", (data82 != null) ? data82.generateJs() : "null", (csvSettings62 != null) ? csvSettings62.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s)", (data82 != null) ? data82.generateJs() : "null", (csvSettings62 != null) ? csvSettings62.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick2" + variableIndex);
        setStick2.add(item);
        return item;
    }
    private String generateJSsetStick2() {
        if (!setStick2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick3 = new ArrayList<>();

    public CartesianSeriesStick stick(Set data83, TextParsingMode csvSettings60) {
        this.data83 = data83;
        this.csvSettings60 = csvSettings60;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStick3" + ++variableIndex + " = " + jsBase + ".stick(%s, %s);", (data83 != null) ? data83.generateJs() : "null", (csvSettings60 != null) ? csvSettings60.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s)", (data83 != null) ? data83.generateJs() : "null", (csvSettings60 != null) ? csvSettings60.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick3" + variableIndex);
        setStick3.add(item);
        return item;
    }
    private String generateJSsetStick3() {
        if (!setStick3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick4 = new ArrayList<>();

    public CartesianSeriesStick stick(Set data83, String csvSettings61) {
        this.data83 = data83;
        this.csvSettings61 = csvSettings61;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStick4" + ++variableIndex + " = " + jsBase + ".stick(%s, %s);", (data83 != null) ? data83.generateJs() : "null", csvSettings61));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s)", (data83 != null) ? data83.generateJs() : "null", csvSettings61));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick4" + variableIndex);
        setStick4.add(item);
        return item;
    }
    private String generateJSsetStick4() {
        if (!setStick4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick5 = new ArrayList<>();

    public CartesianSeriesStick stick(Set data83, TextParsingSettings csvSettings62) {
        this.data83 = data83;
        this.csvSettings62 = csvSettings62;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStick5" + ++variableIndex + " = " + jsBase + ".stick(%s, %s);", (data83 != null) ? data83.generateJs() : "null", (csvSettings62 != null) ? csvSettings62.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s)", (data83 != null) ? data83.generateJs() : "null", (csvSettings62 != null) ? csvSettings62.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick5" + variableIndex);
        setStick5.add(item);
        return item;
    }
    private String generateJSsetStick5() {
        if (!setStick5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick6 = new ArrayList<>();

    public CartesianSeriesStick stick(String[] data84, TextParsingMode csvSettings60) {
        this.data84 = data84;
        this.csvSettings60 = csvSettings60;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStick6" + ++variableIndex + " = " + jsBase + ".stick(%s, %s);", Arrays.toString(data84), (csvSettings60 != null) ? csvSettings60.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s)", Arrays.toString(data84), (csvSettings60 != null) ? csvSettings60.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick6" + variableIndex);
        setStick6.add(item);
        return item;
    }
    private String generateJSsetStick6() {
        if (!setStick6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick7 = new ArrayList<>();

    public CartesianSeriesStick stick(String[] data84, String csvSettings61) {
        this.data84 = data84;
        this.csvSettings61 = csvSettings61;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStick7" + ++variableIndex + " = " + jsBase + ".stick(%s, %s);", Arrays.toString(data84), csvSettings61));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s)", Arrays.toString(data84), csvSettings61));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick7" + variableIndex);
        setStick7.add(item);
        return item;
    }
    private String generateJSsetStick7() {
        if (!setStick7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick8 = new ArrayList<>();

    public CartesianSeriesStick stick(String[] data84, TextParsingSettings csvSettings62) {
        this.data84 = data84;
        this.csvSettings62 = csvSettings62;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStick8" + ++variableIndex + " = " + jsBase + ".stick(%s, %s);", Arrays.toString(data84), (csvSettings62 != null) ? csvSettings62.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s)", Arrays.toString(data84), (csvSettings62 != null) ? csvSettings62.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick8" + variableIndex);
        setStick8.add(item);
        return item;
    }
    private String generateJSsetStick8() {
        if (!setStick8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick9 = new ArrayList<>();

    public CartesianSeriesStick stick(String data85, TextParsingMode csvSettings60) {
        this.data85 = data85;
        this.csvSettings60 = csvSettings60;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStick9" + ++variableIndex + " = " + jsBase + ".stick(%s, %s);", data85, (csvSettings60 != null) ? csvSettings60.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s)", data85, (csvSettings60 != null) ? csvSettings60.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick9" + variableIndex);
        setStick9.add(item);
        return item;
    }
    private String generateJSsetStick9() {
        if (!setStick9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick10 = new ArrayList<>();

    public CartesianSeriesStick stick(String data85, String csvSettings61) {
        this.data85 = data85;
        this.csvSettings61 = csvSettings61;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStick10" + ++variableIndex + " = " + jsBase + ".stick(%s, %s);", data85, csvSettings61));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s)", data85, csvSettings61));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick10" + variableIndex);
        setStick10.add(item);
        return item;
    }
    private String generateJSsetStick10() {
        if (!setStick10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick11 = new ArrayList<>();

    public CartesianSeriesStick stick(String data85, TextParsingSettings csvSettings62) {
        this.data85 = data85;
        this.csvSettings62 = csvSettings62;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setStick11" + ++variableIndex + " = " + jsBase + ".stick(%s, %s);", data85, (csvSettings62 != null) ? csvSettings62.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s, %s)", data85, (csvSettings62 != null) ? csvSettings62.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick11" + variableIndex);
        setStick11.add(item);
        return item;
    }
    private String generateJSsetStick11() {
        if (!setStick11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxismarkersText getTextMarker;

    public CoreAxismarkersText getTextMarker() {
        if (getTextMarker == null)
            getTextMarker = new CoreAxismarkersText(jsBase + ".textMarker()");

        return getTextMarker;
    }

    private List<CoreAxismarkersText> getTextMarker1 = new ArrayList<>();

    public CoreAxismarkersText getTextMarker(Double index6) {
        CoreAxismarkersText item = new CoreAxismarkersText(jsBase + ".textMarker("+ index6+")");
        getTextMarker1.add(item);
        return item;
    }
    private String textMarker;
    private Boolean textMarker1;
    private List<Cartesian> setTextMarker = new ArrayList<>();

    public Cartesian setTextMarker(String textMarker) {
        this.textMarker = textMarker;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%s)", textMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%s)", textMarker));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTextMarker() {
        if (!setTextMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setTextMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setTextMarker1 = new ArrayList<>();

    public Cartesian setTextMarker(Boolean textMarker1) {
        this.textMarker1 = textMarker1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%b)", textMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%b)", textMarker1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTextMarker1() {
        if (!setTextMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setTextMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index7;
    private String textMarker2;
    private Boolean textMarker3;
    private List<Cartesian> setTextMarker2 = new ArrayList<>();

    public Cartesian setTextMarker(String textMarker2, Double index7) {
        this.textMarker2 = textMarker2;
        this.index7 = index7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%s, %f)", textMarker2, index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%s, %f)", textMarker2, index7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTextMarker2() {
        if (!setTextMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setTextMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setTextMarker3 = new ArrayList<>();

    public Cartesian setTextMarker(Boolean textMarker3, Double index7) {
        this.textMarker3 = textMarker3;
        this.index7 = index7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%b, %f)", textMarker3, index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%b, %f)", textMarker3, index7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTextMarker3() {
        if (!setTextMarker3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setTextMarker3) {
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

    public CoreAxesLinear getXAxis(Double index8) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".xAxis("+ index8+")");
        getXAxis1.add(item);
        return item;
    }
    private String xAxis;
    private Boolean xAxis1;
    private List<Cartesian> setXAxis = new ArrayList<>();

    public Cartesian setXAxis(String xAxis) {
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
            for (Cartesian item : setXAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setXAxis1 = new ArrayList<>();

    public Cartesian setXAxis(Boolean xAxis1) {
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
            for (Cartesian item : setXAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index9;
    private String xAxis2;
    private Boolean xAxis3;
    private List<Cartesian> setXAxis2 = new ArrayList<>();

    public Cartesian setXAxis(String xAxis2, Double index9) {
        this.xAxis2 = xAxis2;
        this.index9 = index9;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s, %f)", xAxis2, index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s, %f)", xAxis2, index9));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXAxis2() {
        if (!setXAxis2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXAxis2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setXAxis3 = new ArrayList<>();

    public Cartesian setXAxis(Boolean xAxis3, Double index9) {
        this.xAxis3 = xAxis3;
        this.index9 = index9;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%b, %f)", xAxis3, index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b, %f)", xAxis3, index9));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXAxis3() {
        if (!setXAxis3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXAxis3) {
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

    public CoreGridsLinear getXGrid(Double index10) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".xGrid("+ index10+")");
        getXGrid1.add(item);
        return item;
    }
    private String xGrid;
    private Boolean xGrid1;
    private List<Cartesian> setXGrid = new ArrayList<>();

    public Cartesian setXGrid(String xGrid) {
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
            for (Cartesian item : setXGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setXGrid1 = new ArrayList<>();

    public Cartesian setXGrid(Boolean xGrid1) {
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
            for (Cartesian item : setXGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index11;
    private String xGrid2;
    private Boolean xGrid3;
    private List<Cartesian> setXGrid2 = new ArrayList<>();

    public Cartesian setXGrid(String xGrid2, Double index11) {
        this.xGrid2 = xGrid2;
        this.index11 = index11;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s, %f)", xGrid2, index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s, %f)", xGrid2, index11));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXGrid2() {
        if (!setXGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setXGrid3 = new ArrayList<>();

    public Cartesian setXGrid(Boolean xGrid3, Double index11) {
        this.xGrid3 = xGrid3;
        this.index11 = index11;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%b, %f)", xGrid3, index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b, %f)", xGrid3, index11));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXGrid3() {
        if (!setXGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreGridsLinear getXMinorGrid;

    public CoreGridsLinear getXMinorGrid() {
        if (getXMinorGrid == null)
            getXMinorGrid = new CoreGridsLinear(jsBase + ".xMinorGrid()");

        return getXMinorGrid;
    }

    private List<CoreGridsLinear> getXMinorGrid1 = new ArrayList<>();

    public CoreGridsLinear getXMinorGrid(Double index12) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".xMinorGrid("+ index12+")");
        getXMinorGrid1.add(item);
        return item;
    }
    private String xMinorGrid;
    private Boolean xMinorGrid1;
    private List<Cartesian> setXMinorGrid = new ArrayList<>();

    public Cartesian setXMinorGrid(String xMinorGrid) {
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
            for (Cartesian item : setXMinorGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setXMinorGrid1 = new ArrayList<>();

    public Cartesian setXMinorGrid(Boolean xMinorGrid1) {
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
            for (Cartesian item : setXMinorGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index13;
    private String xMinorGrid2;
    private Boolean xMinorGrid3;
    private List<Cartesian> setXMinorGrid2 = new ArrayList<>();

    public Cartesian setXMinorGrid(String xMinorGrid2, Double index13) {
        this.xMinorGrid2 = xMinorGrid2;
        this.index13 = index13;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%s, %f)", xMinorGrid2, index13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s, %f)", xMinorGrid2, index13));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXMinorGrid2() {
        if (!setXMinorGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXMinorGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setXMinorGrid3 = new ArrayList<>();

    public Cartesian setXMinorGrid(Boolean xMinorGrid3, Double index13) {
        this.xMinorGrid3 = xMinorGrid3;
        this.index13 = index13;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%b, %f)", xMinorGrid3, index13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%b, %f)", xMinorGrid3, index13));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXMinorGrid3() {
        if (!setXMinorGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXMinorGrid3) {
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
    private String xScale;
    private ScaleTypes xScale1;
    private String xScale2;
    private ScalesBase xScale3;
    private List<Cartesian> setXScale = new ArrayList<>();

    public Cartesian setXScale(String xScale) {
        this.xScale = xScale;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", xScale));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", xScale));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale() {
        if (!setXScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setXScale1 = new ArrayList<>();

    public Cartesian setXScale(ScaleTypes xScale1) {
        this.xScale1 = xScale1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", (xScale1 != null) ? xScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", (xScale1 != null) ? xScale1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale1() {
        if (!setXScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setXScale2 = new ArrayList<>();

    public Cartesian setXScale(ScalesBase xScale3) {
        this.xScale3 = xScale3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", (xScale3 != null) ? xScale3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", (xScale3 != null) ? xScale3.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale2() {
        if (!setXScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXScale2) {
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
    private List<Cartesian> setXScroller = new ArrayList<>();

    public Cartesian setXScroller(String xScroller) {
        this.xScroller = xScroller;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScroller(%s)", xScroller));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScroller(%s)", xScroller));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScroller() {
        if (!setXScroller.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXScroller) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setXScroller1 = new ArrayList<>();

    public Cartesian setXScroller(Boolean xScroller1) {
        this.xScroller1 = xScroller1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScroller(%b)", xScroller1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScroller(%b)", xScroller1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScroller1() {
        if (!setXScroller1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXScroller1) {
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
    private List<Cartesian> setXZoom = new ArrayList<>();

    public Cartesian setXZoom(Double xZoom) {
        this.xZoom = xZoom;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xZoom(%f)", xZoom));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xZoom(%f)", xZoom));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXZoom() {
        if (!setXZoom.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXZoom) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setXZoom1 = new ArrayList<>();

    public Cartesian setXZoom(Boolean xZoom1) {
        this.xZoom1 = xZoom1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xZoom(%b)", xZoom1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xZoom(%b)", xZoom1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXZoom1() {
        if (!setXZoom1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXZoom1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setXZoom2 = new ArrayList<>();

    public Cartesian setXZoom(String xZoom2) {
        this.xZoom2 = xZoom2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xZoom(%s)", xZoom2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xZoom(%s)", xZoom2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXZoom2() {
        if (!setXZoom2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setXZoom2) {
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

    public CoreAxesLinear getYAxis(Double index14) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".yAxis("+ index14+")");
        getYAxis1.add(item);
        return item;
    }
    private String yAxis;
    private Boolean yAxis1;
    private List<Cartesian> setYAxis = new ArrayList<>();

    public Cartesian setYAxis(String yAxis) {
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
            for (Cartesian item : setYAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setYAxis1 = new ArrayList<>();

    public Cartesian setYAxis(Boolean yAxis1) {
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
            for (Cartesian item : setYAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index15;
    private String yAxis2;
    private Boolean yAxis3;
    private List<Cartesian> setYAxis2 = new ArrayList<>();

    public Cartesian setYAxis(String yAxis2, Double index15) {
        this.yAxis2 = yAxis2;
        this.index15 = index15;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s, %f)", yAxis2, index15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s, %f)", yAxis2, index15));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYAxis2() {
        if (!setYAxis2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setYAxis2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setYAxis3 = new ArrayList<>();

    public Cartesian setYAxis(Boolean yAxis3, Double index15) {
        this.yAxis3 = yAxis3;
        this.index15 = index15;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%b, %f)", yAxis3, index15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%b, %f)", yAxis3, index15));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYAxis3() {
        if (!setYAxis3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setYAxis3) {
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

    public CoreGridsLinear getYGrid(Double index16) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".yGrid("+ index16+")");
        getYGrid1.add(item);
        return item;
    }
    private String yGrid;
    private Boolean yGrid1;
    private List<Cartesian> setYGrid = new ArrayList<>();

    public Cartesian setYGrid(String yGrid) {
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
            for (Cartesian item : setYGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setYGrid1 = new ArrayList<>();

    public Cartesian setYGrid(Boolean yGrid1) {
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
            for (Cartesian item : setYGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index17;
    private String yGrid2;
    private Boolean yGrid3;
    private List<Cartesian> setYGrid2 = new ArrayList<>();

    public Cartesian setYGrid(String yGrid2, Double index17) {
        this.yGrid2 = yGrid2;
        this.index17 = index17;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s, %f)", yGrid2, index17));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s, %f)", yGrid2, index17));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYGrid2() {
        if (!setYGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setYGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setYGrid3 = new ArrayList<>();

    public Cartesian setYGrid(Boolean yGrid3, Double index17) {
        this.yGrid3 = yGrid3;
        this.index17 = index17;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%b, %f)", yGrid3, index17));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b, %f)", yGrid3, index17));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYGrid3() {
        if (!setYGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setYGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreGridsLinear getYMinorGrid;

    public CoreGridsLinear getYMinorGrid() {
        if (getYMinorGrid == null)
            getYMinorGrid = new CoreGridsLinear(jsBase + ".yMinorGrid()");

        return getYMinorGrid;
    }

    private List<CoreGridsLinear> getYMinorGrid1 = new ArrayList<>();

    public CoreGridsLinear getYMinorGrid(Double index18) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".yMinorGrid("+ index18+")");
        getYMinorGrid1.add(item);
        return item;
    }
    private String yMinorGrid;
    private Boolean yMinorGrid1;
    private List<Cartesian> setYMinorGrid = new ArrayList<>();

    public Cartesian setYMinorGrid(String yMinorGrid) {
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
            for (Cartesian item : setYMinorGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setYMinorGrid1 = new ArrayList<>();

    public Cartesian setYMinorGrid(Boolean yMinorGrid1) {
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
            for (Cartesian item : setYMinorGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index19;
    private String yMinorGrid2;
    private Boolean yMinorGrid3;
    private List<Cartesian> setYMinorGrid2 = new ArrayList<>();

    public Cartesian setYMinorGrid(String yMinorGrid2, Double index19) {
        this.yMinorGrid2 = yMinorGrid2;
        this.index19 = index19;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%s, %f)", yMinorGrid2, index19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s, %f)", yMinorGrid2, index19));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYMinorGrid2() {
        if (!setYMinorGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setYMinorGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setYMinorGrid3 = new ArrayList<>();

    public Cartesian setYMinorGrid(Boolean yMinorGrid3, Double index19) {
        this.yMinorGrid3 = yMinorGrid3;
        this.index19 = index19;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%b, %f)", yMinorGrid3, index19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%b, %f)", yMinorGrid3, index19));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYMinorGrid3() {
        if (!setYMinorGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setYMinorGrid3) {
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
    private ScaleTypes yScale1;
    private String yScale2;
    private ScalesBase yScale3;
    private List<Cartesian> setYScale = new ArrayList<>();

    public Cartesian setYScale(String yScale) {
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
            for (Cartesian item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setYScale1 = new ArrayList<>();

    public Cartesian setYScale(ScaleTypes yScale1) {
        this.yScale1 = yScale1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", (yScale1 != null) ? yScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale1 != null) ? yScale1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScale1() {
        if (!setYScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian> setYScale2 = new ArrayList<>();

    public Cartesian setYScale(ScalesBase yScale3) {
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
            for (Cartesian item : setYScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetAnnotations() {
        if (getAnnotations != null) {
            return getAnnotations.generateJs();
        }
        return "";
    }

    private String generateJSgetCrosshair() {
        if (getCrosshair != null) {
            return getCrosshair.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
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
            for (CartesianSeriesBase item : getGetSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeries1() {
        if (!getGetSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : getGetSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeriesAt() {
        if (!getGetSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : getGetSeriesAt) {
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

    private String generateJSgetLineMarker() {
        if (getLineMarker != null) {
            return getLineMarker.generateJs();
        }
        return "";
    }

    private String generateJSgetLineMarker1() {
        if (!getLineMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxismarkersLine item : getLineMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

    private String generateJSgetRangeMarker() {
        if (getRangeMarker != null) {
            return getRangeMarker.generateJs();
        }
        return "";
    }

    private String generateJSgetRangeMarker1() {
        if (!getRangeMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxismarkersRange item : getRangeMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }

    private String generateJSgetTextMarker() {
        if (getTextMarker != null) {
            return getTextMarker.generateJs();
        }
        return "";
    }

    private String generateJSgetTextMarker1() {
        if (!getTextMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxismarkersText item : getTextMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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
        js.append(generateJSgetAnnotations());
        js.append(generateJSgetCrosshair());
        js.append(generateJSgetData());
        js.append(generateJSgetGetPlotBounds());
        js.append(generateJSgetGetSeries());
        js.append(generateJSgetGetSeries1());
        js.append(generateJSgetGetSeriesAt());
        js.append(generateJSgetHatchFillPalette());
        js.append(generateJSgetHovered());
        js.append(generateJSgetLabels());
        js.append(generateJSgetLineMarker());
        js.append(generateJSgetLineMarker1());
        js.append(generateJSgetMarkerPalette());
        js.append(generateJSgetNormal());
        js.append(generateJSgetPalette());
        js.append(generateJSgetRangeMarker());
        js.append(generateJSgetRangeMarker1());
        js.append(generateJSgetSelected());
        js.append(generateJSgetTextMarker());
        js.append(generateJSgetTextMarker1());
        js.append(generateJSgetXAxis());
        js.append(generateJSgetXAxis1());
        js.append(generateJSgetXGrid());
        js.append(generateJSgetXGrid1());
        js.append(generateJSgetXMinorGrid());
        js.append(generateJSgetXMinorGrid1());
        js.append(generateJSgetXScale());
        js.append(generateJSgetXScroller());
        js.append(generateJSgetXZoom());
        js.append(generateJSgetYAxis());
        js.append(generateJSgetYAxis1());
        js.append(generateJSgetYGrid());
        js.append(generateJSgetYGrid1());
        js.append(generateJSgetYMinorGrid());
        js.append(generateJSgetYMinorGrid1());
        js.append(generateJSgetYScale());
        js.append(generateJSsetAnnotations());
        js.append(generateJSsetArea());
        js.append(generateJSsetArea1());
        js.append(generateJSsetArea2());
        js.append(generateJSsetArea3());
        js.append(generateJSsetArea4());
        js.append(generateJSsetArea5());
        js.append(generateJSsetArea6());
        js.append(generateJSsetArea7());
        js.append(generateJSsetArea8());
        js.append(generateJSsetBar());
        js.append(generateJSsetBar1());
        js.append(generateJSsetBar2());
        js.append(generateJSsetBar3());
        js.append(generateJSsetBar4());
        js.append(generateJSsetBar5());
        js.append(generateJSsetBar6());
        js.append(generateJSsetBar7());
        js.append(generateJSsetBar8());
        js.append(generateJSsetBar9());
        js.append(generateJSsetBar10());
        js.append(generateJSsetBar11());
        js.append(generateJSsetBarGroupsPadding());
        js.append(generateJSsetBarsPadding());
        js.append(generateJSsetBox());
        js.append(generateJSsetBox1());
        js.append(generateJSsetBox2());
        js.append(generateJSsetBox3());
        js.append(generateJSsetBox4());
        js.append(generateJSsetBox5());
        js.append(generateJSsetBox6());
        js.append(generateJSsetBox7());
        js.append(generateJSsetBox8());
        js.append(generateJSsetBox9());
        js.append(generateJSsetBox10());
        js.append(generateJSsetBox11());
        js.append(generateJSsetBubble());
        js.append(generateJSsetBubble1());
        js.append(generateJSsetBubble2());
        js.append(generateJSsetBubble3());
        js.append(generateJSsetBubble4());
        js.append(generateJSsetBubble5());
        js.append(generateJSsetBubble6());
        js.append(generateJSsetBubble7());
        js.append(generateJSsetBubble8());
        js.append(generateJSsetBubble9());
        js.append(generateJSsetBubble10());
        js.append(generateJSsetBubble11());
        js.append(generateJSsetCandlestick());
        js.append(generateJSsetCandlestick1());
        js.append(generateJSsetCandlestick2());
        js.append(generateJSsetCandlestick3());
        js.append(generateJSsetCandlestick4());
        js.append(generateJSsetCandlestick5());
        js.append(generateJSsetCandlestick6());
        js.append(generateJSsetCandlestick7());
        js.append(generateJSsetCandlestick8());
        js.append(generateJSsetCandlestick9());
        js.append(generateJSsetCandlestick10());
        js.append(generateJSsetCandlestick11());
        js.append(generateJSsetColumn());
        js.append(generateJSsetColumn1());
        js.append(generateJSsetColumn2());
        js.append(generateJSsetColumn3());
        js.append(generateJSsetColumn4());
        js.append(generateJSsetColumn5());
        js.append(generateJSsetColumn6());
        js.append(generateJSsetColumn7());
        js.append(generateJSsetColumn8());
        js.append(generateJSsetColumn9());
        js.append(generateJSsetColumn10());
        js.append(generateJSsetColumn11());
        js.append(generateJSsetCrosshair());
        js.append(generateJSsetCrosshair1());
        js.append(generateJSsetData());
        js.append(generateJSsetData1());
        js.append(generateJSsetData2());
        js.append(generateJSsetDefaultSeriesType());
        js.append(generateJSsetDefaultSeriesType1());
        js.append(generateJSsetHatchFillPalette());
        js.append(generateJSsetHatchFillPalette1());
        js.append(generateJSsetHatchFillPalette2());
        js.append(generateJSsetHilo());
        js.append(generateJSsetHilo1());
        js.append(generateJSsetHilo2());
        js.append(generateJSsetHilo3());
        js.append(generateJSsetHilo4());
        js.append(generateJSsetHilo5());
        js.append(generateJSsetHilo6());
        js.append(generateJSsetHilo7());
        js.append(generateJSsetHilo8());
        js.append(generateJSsetHilo9());
        js.append(generateJSsetHilo10());
        js.append(generateJSsetHilo11());
        js.append(generateJSsetHovered());
        js.append(generateJSsetIsVertical());
        js.append(generateJSsetJumpLine());
        js.append(generateJSsetJumpLine1());
        js.append(generateJSsetJumpLine2());
        js.append(generateJSsetJumpLine3());
        js.append(generateJSsetJumpLine4());
        js.append(generateJSsetJumpLine5());
        js.append(generateJSsetJumpLine6());
        js.append(generateJSsetJumpLine7());
        js.append(generateJSsetJumpLine8());
        js.append(generateJSsetJumpLine9());
        js.append(generateJSsetJumpLine10());
        js.append(generateJSsetJumpLine11());
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
        js.append(generateJSsetLineMarker());
        js.append(generateJSsetLineMarker1());
        js.append(generateJSsetLineMarker2());
        js.append(generateJSsetLineMarker3());
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
        js.append(generateJSsetMaxBubbleSize());
        js.append(generateJSsetMaxBubbleSize1());
        js.append(generateJSsetMaxPointWidth());
        js.append(generateJSsetMaxPointWidth1());
        js.append(generateJSsetMinBubbleSize());
        js.append(generateJSsetMinBubbleSize1());
        js.append(generateJSsetMinPointLength());
        js.append(generateJSsetMinPointLength1());
        js.append(generateJSsetNormal());
        js.append(generateJSsetOhlc());
        js.append(generateJSsetOhlc1());
        js.append(generateJSsetOhlc2());
        js.append(generateJSsetOhlc3());
        js.append(generateJSsetOhlc4());
        js.append(generateJSsetOhlc5());
        js.append(generateJSsetOhlc6());
        js.append(generateJSsetOhlc7());
        js.append(generateJSsetOhlc8());
        js.append(generateJSsetOhlc9());
        js.append(generateJSsetOhlc10());
        js.append(generateJSsetOhlc11());
        js.append(generateJSsetPalette());
        js.append(generateJSsetPalette1());
        js.append(generateJSsetPalette2());
        js.append(generateJSsetPalette3());
        js.append(generateJSsetPointWidth());
        js.append(generateJSsetPointWidth1());
        js.append(generateJSsetRangeArea());
        js.append(generateJSsetRangeArea1());
        js.append(generateJSsetRangeArea2());
        js.append(generateJSsetRangeArea3());
        js.append(generateJSsetRangeArea4());
        js.append(generateJSsetRangeArea5());
        js.append(generateJSsetRangeArea6());
        js.append(generateJSsetRangeArea7());
        js.append(generateJSsetRangeArea8());
        js.append(generateJSsetRangeArea9());
        js.append(generateJSsetRangeArea10());
        js.append(generateJSsetRangeArea11());
        js.append(generateJSsetRangeBar());
        js.append(generateJSsetRangeBar1());
        js.append(generateJSsetRangeBar2());
        js.append(generateJSsetRangeBar3());
        js.append(generateJSsetRangeBar4());
        js.append(generateJSsetRangeBar5());
        js.append(generateJSsetRangeBar6());
        js.append(generateJSsetRangeBar7());
        js.append(generateJSsetRangeBar8());
        js.append(generateJSsetRangeBar9());
        js.append(generateJSsetRangeBar10());
        js.append(generateJSsetRangeBar11());
        js.append(generateJSsetRangeColumn());
        js.append(generateJSsetRangeColumn1());
        js.append(generateJSsetRangeColumn2());
        js.append(generateJSsetRangeColumn3());
        js.append(generateJSsetRangeColumn4());
        js.append(generateJSsetRangeColumn5());
        js.append(generateJSsetRangeColumn6());
        js.append(generateJSsetRangeColumn7());
        js.append(generateJSsetRangeColumn8());
        js.append(generateJSsetRangeColumn9());
        js.append(generateJSsetRangeColumn10());
        js.append(generateJSsetRangeColumn11());
        js.append(generateJSsetRangeMarker());
        js.append(generateJSsetRangeMarker1());
        js.append(generateJSsetRangeMarker2());
        js.append(generateJSsetRangeMarker3());
        js.append(generateJSsetRangeSplineArea());
        js.append(generateJSsetRangeSplineArea1());
        js.append(generateJSsetRangeSplineArea2());
        js.append(generateJSsetRangeSplineArea3());
        js.append(generateJSsetRangeSplineArea4());
        js.append(generateJSsetRangeSplineArea5());
        js.append(generateJSsetRangeSplineArea6());
        js.append(generateJSsetRangeSplineArea7());
        js.append(generateJSsetRangeSplineArea8());
        js.append(generateJSsetRangeSplineArea9());
        js.append(generateJSsetRangeSplineArea10());
        js.append(generateJSsetRangeSplineArea11());
        js.append(generateJSsetRangeStepArea());
        js.append(generateJSsetRangeStepArea1());
        js.append(generateJSsetRangeStepArea2());
        js.append(generateJSsetRangeStepArea3());
        js.append(generateJSsetRangeStepArea4());
        js.append(generateJSsetRangeStepArea5());
        js.append(generateJSsetRangeStepArea6());
        js.append(generateJSsetRangeStepArea7());
        js.append(generateJSsetRangeStepArea8());
        js.append(generateJSsetRangeStepArea9());
        js.append(generateJSsetRangeStepArea10());
        js.append(generateJSsetRangeStepArea11());
        js.append(generateJSsetRemoveSeries());
        js.append(generateJSsetRemoveSeries1());
        js.append(generateJSsetRemoveSeriesAt());
        js.append(generateJSsetSelected());
        js.append(generateJSsetSpline());
        js.append(generateJSsetSpline1());
        js.append(generateJSsetSpline2());
        js.append(generateJSsetSpline3());
        js.append(generateJSsetSpline4());
        js.append(generateJSsetSpline5());
        js.append(generateJSsetSpline6());
        js.append(generateJSsetSpline7());
        js.append(generateJSsetSpline8());
        js.append(generateJSsetSpline9());
        js.append(generateJSsetSpline10());
        js.append(generateJSsetSpline11());
        js.append(generateJSsetSplineArea());
        js.append(generateJSsetSplineArea1());
        js.append(generateJSsetSplineArea2());
        js.append(generateJSsetSplineArea3());
        js.append(generateJSsetSplineArea4());
        js.append(generateJSsetSplineArea5());
        js.append(generateJSsetSplineArea6());
        js.append(generateJSsetSplineArea7());
        js.append(generateJSsetSplineArea8());
        js.append(generateJSsetSplineArea9());
        js.append(generateJSsetSplineArea10());
        js.append(generateJSsetSplineArea11());
        js.append(generateJSsetStepArea());
        js.append(generateJSsetStepArea1());
        js.append(generateJSsetStepArea2());
        js.append(generateJSsetStepArea3());
        js.append(generateJSsetStepArea4());
        js.append(generateJSsetStepArea5());
        js.append(generateJSsetStepArea6());
        js.append(generateJSsetStepArea7());
        js.append(generateJSsetStepArea8());
        js.append(generateJSsetStepArea9());
        js.append(generateJSsetStepArea10());
        js.append(generateJSsetStepArea11());
        js.append(generateJSsetStepLine());
        js.append(generateJSsetStepLine1());
        js.append(generateJSsetStepLine2());
        js.append(generateJSsetStepLine3());
        js.append(generateJSsetStepLine4());
        js.append(generateJSsetStepLine5());
        js.append(generateJSsetStepLine6());
        js.append(generateJSsetStepLine7());
        js.append(generateJSsetStepLine8());
        js.append(generateJSsetStepLine9());
        js.append(generateJSsetStepLine10());
        js.append(generateJSsetStepLine11());
        js.append(generateJSsetStick());
        js.append(generateJSsetStick1());
        js.append(generateJSsetStick2());
        js.append(generateJSsetStick3());
        js.append(generateJSsetStick4());
        js.append(generateJSsetStick5());
        js.append(generateJSsetStick6());
        js.append(generateJSsetStick7());
        js.append(generateJSsetStick8());
        js.append(generateJSsetStick9());
        js.append(generateJSsetStick10());
        js.append(generateJSsetStick11());
        js.append(generateJSsetTextMarker());
        js.append(generateJSsetTextMarker1());
        js.append(generateJSsetTextMarker2());
        js.append(generateJSsetTextMarker3());
        js.append(generateJSsetXAxis());
        js.append(generateJSsetXAxis1());
        js.append(generateJSsetXAxis2());
        js.append(generateJSsetXAxis3());
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