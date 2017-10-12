package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class Cartesian3d extends SeparateChart {

    public Cartesian3d() {
        js.append("chart = anychart.cartesian3d();");
        jsBase = "chart";
    }

    
    private View data;
    private Set data1;
    private String[] data2;
    private String data3;
    private TextParsingMode csvSettings;
    private TextParsingSettings csvSettings1;
    private List<Area3d> setArea = new ArrayList<>();

    public Area3d area(View data, TextParsingMode csvSettings) {
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

    public Area3d area(View data, TextParsingSettings csvSettings1) {
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

    private List<Area3d> setArea2 = new ArrayList<>();

    public Area3d area(Set data1, TextParsingMode csvSettings) {
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
        Area3d item = new Area3d("setArea2" + variableIndex);
        setArea2.add(item);
        return item;
    }
    private String generateJSsetArea2() {
        if (!setArea2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Area3d item : setArea2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Area3d> setArea3 = new ArrayList<>();

    public Area3d area(Set data1, TextParsingSettings csvSettings1) {
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
        Area3d item = new Area3d("setArea3" + variableIndex);
        setArea3.add(item);
        return item;
    }
    private String generateJSsetArea3() {
        if (!setArea3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Area3d item : setArea3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Area3d> setArea4 = new ArrayList<>();

    public Area3d area(String[] data2, TextParsingMode csvSettings) {
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
        Area3d item = new Area3d("setArea4" + variableIndex);
        setArea4.add(item);
        return item;
    }
    private String generateJSsetArea4() {
        if (!setArea4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Area3d item : setArea4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Area3d> setArea5 = new ArrayList<>();

    public Area3d area(String[] data2, TextParsingSettings csvSettings1) {
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
        Area3d item = new Area3d("setArea5" + variableIndex);
        setArea5.add(item);
        return item;
    }
    private String generateJSsetArea5() {
        if (!setArea5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Area3d item : setArea5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Area3d> setArea6 = new ArrayList<>();

    public Area3d area(String data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea6" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".area(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        Area3d item = new Area3d("setArea6" + variableIndex);
        setArea6.add(item);
        return item;
    }
    private String generateJSsetArea6() {
        if (!setArea6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Area3d item : setArea6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Area3d> setArea7 = new ArrayList<>();

    public Area3d area(String data3, TextParsingSettings csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setArea7" + ++variableIndex + " = " + jsBase + ".area(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".area(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s, %s)", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
        Area3d item = new Area3d("setArea7" + variableIndex);
        setArea7.add(item);
        return item;
    }
    private String generateJSsetArea7() {
        if (!setArea7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Area3d item : setArea7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data4;
    private Set data5;
    private String[] data6;
    private String data7;
    private TextParsingMode csvSettings2;
    private TextParsingSettings csvSettings3;
    private List<Bar3d> setBar = new ArrayList<>();

    public Bar3d bar(View data4, TextParsingMode csvSettings2) {
        this.data4 = data4;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
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

    public Bar3d bar(View data4, TextParsingSettings csvSettings3) {
        this.data4 = data4;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar1" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
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

    private List<Bar3d> setBar2 = new ArrayList<>();

    public Bar3d bar(Set data5, TextParsingMode csvSettings2) {
        this.data5 = data5;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar2" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bar(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", (data5 != null) ? data5.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        Bar3d item = new Bar3d("setBar2" + variableIndex);
        setBar2.add(item);
        return item;
    }
    private String generateJSsetBar2() {
        if (!setBar2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bar3d item : setBar2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bar3d> setBar3 = new ArrayList<>();

    public Bar3d bar(Set data5, TextParsingSettings csvSettings3) {
        this.data5 = data5;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar3" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bar(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", (data5 != null) ? data5.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        Bar3d item = new Bar3d("setBar3" + variableIndex);
        setBar3.add(item);
        return item;
    }
    private String generateJSsetBar3() {
        if (!setBar3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bar3d item : setBar3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bar3d> setBar4 = new ArrayList<>();

    public Bar3d bar(String[] data6, TextParsingMode csvSettings2) {
        this.data6 = data6;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar4" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", Arrays.toString(data6), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bar(%s, %s);", Arrays.toString(data6), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", Arrays.toString(data6), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        Bar3d item = new Bar3d("setBar4" + variableIndex);
        setBar4.add(item);
        return item;
    }
    private String generateJSsetBar4() {
        if (!setBar4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bar3d item : setBar4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bar3d> setBar5 = new ArrayList<>();

    public Bar3d bar(String[] data6, TextParsingSettings csvSettings3) {
        this.data6 = data6;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar5" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", Arrays.toString(data6), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bar(%s, %s);", Arrays.toString(data6), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", Arrays.toString(data6), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        Bar3d item = new Bar3d("setBar5" + variableIndex);
        setBar5.add(item);
        return item;
    }
    private String generateJSsetBar5() {
        if (!setBar5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bar3d item : setBar5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bar3d> setBar6 = new ArrayList<>();

    public Bar3d bar(String data7, TextParsingMode csvSettings2) {
        this.data7 = data7;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar6" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", data7, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bar(%s, %s);", data7, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", data7, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        Bar3d item = new Bar3d("setBar6" + variableIndex);
        setBar6.add(item);
        return item;
    }
    private String generateJSsetBar6() {
        if (!setBar6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bar3d item : setBar6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bar3d> setBar7 = new ArrayList<>();

    public Bar3d bar(String data7, TextParsingSettings csvSettings3) {
        this.data7 = data7;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBar7" + ++variableIndex + " = " + jsBase + ".bar(%s, %s);", data7, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bar(%s, %s);", data7, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s, %s)", data7, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        Bar3d item = new Bar3d("setBar7" + variableIndex);
        setBar7.add(item);
        return item;
    }
    private String generateJSsetBar7() {
        if (!setBar7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bar3d item : setBar7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data8;
    private Set data9;
    private String[] data10;
    private String data11;
    private TextParsingMode csvSettings4;
    private TextParsingSettings csvSettings5;
    private List<Column3d> setColumn = new ArrayList<>();

    public Column3d column(View data8, TextParsingMode csvSettings4) {
        this.data8 = data8;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data8 != null) ? data8.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
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

    public Column3d column(View data8, TextParsingSettings csvSettings5) {
        this.data8 = data8;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn1" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data8 != null) ? data8.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
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

    private List<Column3d> setColumn2 = new ArrayList<>();

    public Column3d column(Set data9, TextParsingMode csvSettings4) {
        this.data9 = data9;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn2" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data9 != null) ? data9.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
        Column3d item = new Column3d("setColumn2" + variableIndex);
        setColumn2.add(item);
        return item;
    }
    private String generateJSsetColumn2() {
        if (!setColumn2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Column3d item : setColumn2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Column3d> setColumn3 = new ArrayList<>();

    public Column3d column(Set data9, TextParsingSettings csvSettings5) {
        this.data9 = data9;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn3" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", (data9 != null) ? data9.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        Column3d item = new Column3d("setColumn3" + variableIndex);
        setColumn3.add(item);
        return item;
    }
    private String generateJSsetColumn3() {
        if (!setColumn3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Column3d item : setColumn3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Column3d> setColumn4 = new ArrayList<>();

    public Column3d column(String[] data10, TextParsingMode csvSettings4) {
        this.data10 = data10;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn4" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", Arrays.toString(data10), (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", Arrays.toString(data10), (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", Arrays.toString(data10), (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
        Column3d item = new Column3d("setColumn4" + variableIndex);
        setColumn4.add(item);
        return item;
    }
    private String generateJSsetColumn4() {
        if (!setColumn4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Column3d item : setColumn4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Column3d> setColumn5 = new ArrayList<>();

    public Column3d column(String[] data10, TextParsingSettings csvSettings5) {
        this.data10 = data10;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn5" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", Arrays.toString(data10), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", Arrays.toString(data10), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", Arrays.toString(data10), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        Column3d item = new Column3d("setColumn5" + variableIndex);
        setColumn5.add(item);
        return item;
    }
    private String generateJSsetColumn5() {
        if (!setColumn5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Column3d item : setColumn5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Column3d> setColumn6 = new ArrayList<>();

    public Column3d column(String data11, TextParsingMode csvSettings4) {
        this.data11 = data11;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn6" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", data11, (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", data11, (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", data11, (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
        Column3d item = new Column3d("setColumn6" + variableIndex);
        setColumn6.add(item);
        return item;
    }
    private String generateJSsetColumn6() {
        if (!setColumn6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Column3d item : setColumn6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Column3d> setColumn7 = new ArrayList<>();

    public Column3d column(String data11, TextParsingSettings csvSettings5) {
        this.data11 = data11;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setColumn7" + ++variableIndex + " = " + jsBase + ".column(%s, %s);", data11, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".column(%s, %s);", data11, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s, %s)", data11, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        Column3d item = new Column3d("setColumn7" + variableIndex);
        setColumn7.add(item);
        return item;
    }
    private String generateJSsetColumn7() {
        if (!setColumn7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Column3d item : setColumn7) {
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

    private Set data12;
    private String[] data13;
    private DataSettings data14;
    private List<Cartesian3d> setData = new ArrayList<>();

    public Cartesian3d setData(Set data12) {
        this.data12 = data12;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s)", (data12 != null) ? data12.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s)", (data12 != null) ? data12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s)", (data12 != null) ? data12.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian3d> setData1 = new ArrayList<>();

    public Cartesian3d setData(String[] data13) {
        this.data13 = data13;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s)", Arrays.toString(data13)));

//        js.append(String.format(Locale.US, ".data(%s)", Arrays.toString(data13)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s)", Arrays.toString(data13)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian3d> setData2 = new ArrayList<>();

    public Cartesian3d setData(DataSettings data14) {
        this.data14 = data14;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s)", (data14 != null) ? data14.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".data(%s)", (data14 != null) ? data14.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s)", (data14 != null) ? data14.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setData2) {
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
    private List<Cartesian3d> setHovered = new ArrayList<>();

    public Cartesian3d setHovered(String hovered) {
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
            for (Cartesian3d item : setHovered) {
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
    private List<Cartesian3d> setLabels = new ArrayList<>();

    public Cartesian3d setLabels(String labels) {
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
            for (Cartesian3d item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian3d> setLabels1 = new ArrayList<>();

    public Cartesian3d setLabels(Boolean labels1) {
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
            for (Cartesian3d item : setLabels1) {
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
    private TextParsingMode csvSettings6;
    private TextParsingSettings csvSettings7;
    private List<Line3d> setLine = new ArrayList<>();

    public Line3d line(View data15, TextParsingMode csvSettings6) {
        this.data15 = data15;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data15 != null) ? data15.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
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

    public Line3d line(View data15, TextParsingSettings csvSettings7) {
        this.data15 = data15;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine1" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data15 != null) ? data15.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
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

    private List<Line3d> setLine2 = new ArrayList<>();

    public Line3d line(Set data16, TextParsingMode csvSettings6) {
        this.data16 = data16;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data16 != null) ? data16.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        Line3d item = new Line3d("setLine2" + variableIndex);
        setLine2.add(item);
        return item;
    }
    private String generateJSsetLine2() {
        if (!setLine2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Line3d item : setLine2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Line3d> setLine3 = new ArrayList<>();

    public Line3d line(Set data16, TextParsingSettings csvSettings7) {
        this.data16 = data16;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine3" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data16 != null) ? data16.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
        Line3d item = new Line3d("setLine3" + variableIndex);
        setLine3.add(item);
        return item;
    }
    private String generateJSsetLine3() {
        if (!setLine3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Line3d item : setLine3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Line3d> setLine4 = new ArrayList<>();

    public Line3d line(String[] data17, TextParsingMode csvSettings6) {
        this.data17 = data17;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine4" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data17), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", Arrays.toString(data17), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data17), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        Line3d item = new Line3d("setLine4" + variableIndex);
        setLine4.add(item);
        return item;
    }
    private String generateJSsetLine4() {
        if (!setLine4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Line3d item : setLine4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Line3d> setLine5 = new ArrayList<>();

    public Line3d line(String[] data17, TextParsingSettings csvSettings7) {
        this.data17 = data17;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine5" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data17), (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", Arrays.toString(data17), (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data17), (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
        Line3d item = new Line3d("setLine5" + variableIndex);
        setLine5.add(item);
        return item;
    }
    private String generateJSsetLine5() {
        if (!setLine5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Line3d item : setLine5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Line3d> setLine6 = new ArrayList<>();

    public Line3d line(String data18, TextParsingMode csvSettings6) {
        this.data18 = data18;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine6" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data18, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", data18, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data18, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        Line3d item = new Line3d("setLine6" + variableIndex);
        setLine6.add(item);
        return item;
    }
    private String generateJSsetLine6() {
        if (!setLine6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Line3d item : setLine6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Line3d> setLine7 = new ArrayList<>();

    public Line3d line(String data18, TextParsingSettings csvSettings7) {
        this.data18 = data18;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine7" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data18, (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", data18, (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data18, (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
        Line3d item = new Line3d("setLine7" + variableIndex);
        setLine7.add(item);
        return item;
    }
    private String generateJSsetLine7() {
        if (!setLine7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Line3d item : setLine7) {
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
    private TextParsingMode csvSettings8;
    private TextParsingSettings csvSettings9;
    private List<CartesianSeriesLine> setLine2d = new ArrayList<>();

    public CartesianSeriesLine line2d(View data19, TextParsingMode csvSettings8) {
        this.data19 = data19;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data19 != null) ? data19.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
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

    public CartesianSeriesLine line2d(View data19, TextParsingSettings csvSettings9) {
        this.data19 = data19;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d1" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data19 != null) ? data19.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
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

    private List<CartesianSeriesLine> setLine2d2 = new ArrayList<>();

    public CartesianSeriesLine line2d(Set data20, TextParsingMode csvSettings8) {
        this.data20 = data20;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d2" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data20 != null) ? data20.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d2" + variableIndex);
        setLine2d2.add(item);
        return item;
    }
    private String generateJSsetLine2d2() {
        if (!setLine2d2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d3 = new ArrayList<>();

    public CartesianSeriesLine line2d(Set data20, TextParsingSettings csvSettings9) {
        this.data20 = data20;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d3" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data20 != null) ? data20.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d3" + variableIndex);
        setLine2d3.add(item);
        return item;
    }
    private String generateJSsetLine2d3() {
        if (!setLine2d3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d4 = new ArrayList<>();

    public CartesianSeriesLine line2d(String[] data21, TextParsingMode csvSettings8) {
        this.data21 = data21;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d4" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", Arrays.toString(data21), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", Arrays.toString(data21), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", Arrays.toString(data21), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d4" + variableIndex);
        setLine2d4.add(item);
        return item;
    }
    private String generateJSsetLine2d4() {
        if (!setLine2d4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d5 = new ArrayList<>();

    public CartesianSeriesLine line2d(String[] data21, TextParsingSettings csvSettings9) {
        this.data21 = data21;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d5" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", Arrays.toString(data21), (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", Arrays.toString(data21), (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", Arrays.toString(data21), (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d5" + variableIndex);
        setLine2d5.add(item);
        return item;
    }
    private String generateJSsetLine2d5() {
        if (!setLine2d5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d6 = new ArrayList<>();

    public CartesianSeriesLine line2d(String data22, TextParsingMode csvSettings8) {
        this.data22 = data22;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d6" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", data22, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", data22, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", data22, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d6" + variableIndex);
        setLine2d6.add(item);
        return item;
    }
    private String generateJSsetLine2d6() {
        if (!setLine2d6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine2d7 = new ArrayList<>();

    public CartesianSeriesLine line2d(String data22, TextParsingSettings csvSettings9) {
        this.data22 = data22;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2d7" + ++variableIndex + " = " + jsBase + ".line2d(%s, %s);", data22, (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line2d(%s, %s);", data22, (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line2d(%s, %s)", data22, (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        CartesianSeriesLine item = new CartesianSeriesLine("setLine2d7" + variableIndex);
        setLine2d7.add(item);
        return item;
    }
    private String generateJSsetLine2d7() {
        if (!setLine2d7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine2d7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxPointWidth;
    private String maxPointWidth1;
    private List<Cartesian3d> setMaxPointWidth = new ArrayList<>();

    public Cartesian3d setMaxPointWidth(Double maxPointWidth) {
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
            for (Cartesian3d item : setMaxPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian3d> setMaxPointWidth1 = new ArrayList<>();

    public Cartesian3d setMaxPointWidth(String maxPointWidth1) {
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
            for (Cartesian3d item : setMaxPointWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minPointLength;
    private String minPointLength1;
    private List<Cartesian3d> setMinPointLength = new ArrayList<>();

    public Cartesian3d setMinPointLength(Double minPointLength) {
        this.minPointLength = minPointLength;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minPointLength(%f)", minPointLength));

//        js.append(String.format(Locale.US, ".minPointLength(%f)", minPointLength));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%f)", minPointLength));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMinPointLength() {
        if (!setMinPointLength.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setMinPointLength) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian3d> setMinPointLength1 = new ArrayList<>();

    public Cartesian3d setMinPointLength(String minPointLength1) {
        this.minPointLength1 = minPointLength1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minPointLength(%s)", minPointLength1));

//        js.append(String.format(Locale.US, ".minPointLength(%s)", minPointLength1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%s)", minPointLength1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMinPointLength1() {
        if (!setMinPointLength1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setMinPointLength1) {
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
    private List<Cartesian3d> setNormal = new ArrayList<>();

    public Cartesian3d setNormal(String normal) {
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
            for (Cartesian3d item : setNormal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double pointWidth;
    private String pointWidth1;
    private List<Cartesian3d> setPointWidth = new ArrayList<>();

    public Cartesian3d setPointWidth(Double pointWidth) {
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
            for (Cartesian3d item : setPointWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian3d> setPointWidth1 = new ArrayList<>();

    public Cartesian3d setPointWidth(String pointWidth1) {
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
            for (Cartesian3d item : setPointWidth1) {
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
    private List<Cartesian3d> setSelected = new ArrayList<>();

    public Cartesian3d setSelected(String selected) {
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
            for (Cartesian3d item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double zAngle;
    private List<Cartesian3d> setZAngle = new ArrayList<>();

    public Cartesian3d setZAngle(Double zAngle) {
        this.zAngle = zAngle;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zAngle(%f)", zAngle));

//        js.append(String.format(Locale.US, ".zAngle(%f)", zAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zAngle(%f)", zAngle));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZAngle() {
        if (!setZAngle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setZAngle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double zAspect;
    private String zAspect1;
    private List<Cartesian3d> setZAspect = new ArrayList<>();

    public Cartesian3d setZAspect(Double zAspect) {
        this.zAspect = zAspect;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zAspect(%f)", zAspect));

//        js.append(String.format(Locale.US, ".zAspect(%f)", zAspect));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zAspect(%f)", zAspect));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZAspect() {
        if (!setZAspect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setZAspect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Cartesian3d> setZAspect1 = new ArrayList<>();

    public Cartesian3d setZAspect(String zAspect1) {
        this.zAspect1 = zAspect1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zAspect(%s)", zAspect1));

//        js.append(String.format(Locale.US, ".zAspect(%s)", zAspect1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zAspect(%s)", zAspect1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZAspect1() {
        if (!setZAspect1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setZAspect1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean zDistribution;
    private List<Cartesian3d> setZDistribution = new ArrayList<>();

    public Cartesian3d setZDistribution(Boolean zDistribution) {
        this.zDistribution = zDistribution;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zDistribution(%b)", zDistribution));

//        js.append(String.format(Locale.US, ".zDistribution(%b)", zDistribution));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zDistribution(%b)", zDistribution));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZDistribution() {
        if (!setZDistribution.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setZDistribution) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double zPadding;
    private List<Cartesian3d> setZPadding = new ArrayList<>();

    public Cartesian3d setZPadding(Double zPadding) {
        this.zPadding = zPadding;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zPadding(%f)", zPadding));

//        js.append(String.format(Locale.US, ".zPadding(%f)", zPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zPadding(%f)", zPadding));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZPadding() {
        if (!setZPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Cartesian3d item : setZPadding) {
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
        js.append(generateJSsetArea());
        js.append(generateJSsetArea1());
        js.append(generateJSsetArea2());
        js.append(generateJSsetArea3());
        js.append(generateJSsetArea4());
        js.append(generateJSsetArea5());
        js.append(generateJSsetArea6());
        js.append(generateJSsetArea7());
        js.append(generateJSsetBar());
        js.append(generateJSsetBar1());
        js.append(generateJSsetBar2());
        js.append(generateJSsetBar3());
        js.append(generateJSsetBar4());
        js.append(generateJSsetBar5());
        js.append(generateJSsetBar6());
        js.append(generateJSsetBar7());
        js.append(generateJSsetColumn());
        js.append(generateJSsetColumn1());
        js.append(generateJSsetColumn2());
        js.append(generateJSsetColumn3());
        js.append(generateJSsetColumn4());
        js.append(generateJSsetColumn5());
        js.append(generateJSsetColumn6());
        js.append(generateJSsetColumn7());
        js.append(generateJSsetData());
        js.append(generateJSsetData1());
        js.append(generateJSsetData2());
        js.append(generateJSsetHovered());
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
        js.append(generateJSsetLine2d());
        js.append(generateJSsetLine2d1());
        js.append(generateJSsetLine2d2());
        js.append(generateJSsetLine2d3());
        js.append(generateJSsetLine2d4());
        js.append(generateJSsetLine2d5());
        js.append(generateJSsetLine2d6());
        js.append(generateJSsetLine2d7());
        js.append(generateJSsetMaxPointWidth());
        js.append(generateJSsetMaxPointWidth1());
        js.append(generateJSsetMinPointLength());
        js.append(generateJSsetMinPointLength1());
        js.append(generateJSsetNormal());
        js.append(generateJSsetPointWidth());
        js.append(generateJSsetPointWidth1());
        js.append(generateJSsetSelected());
        js.append(generateJSsetZAngle());
        js.append(generateJSsetZAspect());
        js.append(generateJSsetZAspect1());
        js.append(generateJSsetZDistribution());
        js.append(generateJSsetZPadding());

        js.append(super.generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}