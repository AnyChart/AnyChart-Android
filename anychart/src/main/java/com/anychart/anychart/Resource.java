package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class Resource extends Chart {

    public Resource() {
        js.append("chart = anychart.resource();");
        jsBase = "chart";
    }

    
    private Activities getActivities;

    public Activities getActivities() {
        if (getActivities == null)
            getActivities = new Activities(jsBase + ".activities()");

        return getActivities;
    }

    private String activities;
    private List<Resource> setActivities = new ArrayList<>();

    public Resource setActivities(String activities) {
        this.activities = activities;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".activities(%s)", activities));

//        js.append(String.format(Locale.US, ".activities(%s)", activities));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".activities(%s)", activities));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetActivities() {
        if (!setActivities.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setActivities) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Calendar getCalendar;

    public Calendar getCalendar() {
        if (getCalendar == null)
            getCalendar = new Calendar(jsBase + ".calendar()");

        return getCalendar;
    }

    private String calendar;
    private List<Resource> setCalendar = new ArrayList<>();

    public Resource setCalendar(String calendar) {
        this.calendar = calendar;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".calendar(%s)", calendar));

//        js.append(String.format(Locale.US, ".calendar(%s)", calendar));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".calendar(%s)", calendar));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCalendar() {
        if (!setCalendar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCalendar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UtilsPadding getCellPadding;

    public UtilsPadding getCellPadding() {
        if (getCellPadding == null)
            getCellPadding = new UtilsPadding(jsBase + ".cellPadding()");

        return getCellPadding;
    }

    private Double[] cellPadding;
    private String[] cellPadding1;
    private String cellPadding2;
    private List<Resource> setCellPadding = new ArrayList<>();

    public Resource setCellPadding(Double[] cellPadding) {
        this.cellPadding = cellPadding;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s)", Arrays.toString(cellPadding)));

//        js.append(String.format(Locale.US, ".cellPadding(%s)", Arrays.toString(cellPadding)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s)", Arrays.toString(cellPadding)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding() {
        if (!setCellPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding1 = new ArrayList<>();

    public Resource setCellPadding(String[] cellPadding1) {
        this.cellPadding1 = cellPadding1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s)", Arrays.toString(cellPadding1)));

//        js.append(String.format(Locale.US, ".cellPadding(%s)", Arrays.toString(cellPadding1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s)", Arrays.toString(cellPadding1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding1() {
        if (!setCellPadding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding2 = new ArrayList<>();

    public Resource setCellPadding(String cellPadding2) {
        this.cellPadding2 = cellPadding2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s)", cellPadding2));

//        js.append(String.format(Locale.US, ".cellPadding(%s)", cellPadding2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s)", cellPadding2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding2() {
        if (!setCellPadding2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;
    private List<Resource> setCellPadding3 = new ArrayList<>();

    public Resource setCellPadding(String value, String value2, String value4, String value6) {
        this.value = value;
        this.value2 = value2;
        this.value4 = value4;
        this.value6 = value6;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s, %s, %s, %s)", value, value2, value4, value6));

//        js.append(String.format(Locale.US, ".cellPadding(%s, %s, %s, %s)", value, value2, value4, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s, %s, %s, %s)", value, value2, value4, value6));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding3() {
        if (!setCellPadding3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding4 = new ArrayList<>();

    public Resource setCellPadding(String value, String value2, String value4, Double value7) {
        this.value = value;
        this.value2 = value2;
        this.value4 = value4;
        this.value7 = value7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s, %s, %s, %f)", value, value2, value4, value7));

//        js.append(String.format(Locale.US, ".cellPadding(%s, %s, %s, %f)", value, value2, value4, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s, %s, %s, %f)", value, value2, value4, value7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding4() {
        if (!setCellPadding4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding5 = new ArrayList<>();

    public Resource setCellPadding(String value, String value2, Double value5, String value6) {
        this.value = value;
        this.value2 = value2;
        this.value5 = value5;
        this.value6 = value6;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s, %s, %f, %s)", value, value2, value5, value6));

//        js.append(String.format(Locale.US, ".cellPadding(%s, %s, %f, %s)", value, value2, value5, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s, %s, %f, %s)", value, value2, value5, value6));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding5() {
        if (!setCellPadding5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding6 = new ArrayList<>();

    public Resource setCellPadding(String value, String value2, Double value5, Double value7) {
        this.value = value;
        this.value2 = value2;
        this.value5 = value5;
        this.value7 = value7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s, %s, %f, %f)", value, value2, value5, value7));

//        js.append(String.format(Locale.US, ".cellPadding(%s, %s, %f, %f)", value, value2, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s, %s, %f, %f)", value, value2, value5, value7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding6() {
        if (!setCellPadding6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding7 = new ArrayList<>();

    public Resource setCellPadding(String value, Double value3, String value4, String value6) {
        this.value = value;
        this.value3 = value3;
        this.value4 = value4;
        this.value6 = value6;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s, %f, %s, %s)", value, value3, value4, value6));

//        js.append(String.format(Locale.US, ".cellPadding(%s, %f, %s, %s)", value, value3, value4, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s, %f, %s, %s)", value, value3, value4, value6));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding7() {
        if (!setCellPadding7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding8 = new ArrayList<>();

    public Resource setCellPadding(String value, Double value3, String value4, Double value7) {
        this.value = value;
        this.value3 = value3;
        this.value4 = value4;
        this.value7 = value7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s, %f, %s, %f)", value, value3, value4, value7));

//        js.append(String.format(Locale.US, ".cellPadding(%s, %f, %s, %f)", value, value3, value4, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s, %f, %s, %f)", value, value3, value4, value7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding8() {
        if (!setCellPadding8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding9 = new ArrayList<>();

    public Resource setCellPadding(String value, Double value3, Double value5, String value6) {
        this.value = value;
        this.value3 = value3;
        this.value5 = value5;
        this.value6 = value6;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s, %f, %f, %s)", value, value3, value5, value6));

//        js.append(String.format(Locale.US, ".cellPadding(%s, %f, %f, %s)", value, value3, value5, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s, %f, %f, %s)", value, value3, value5, value6));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding9() {
        if (!setCellPadding9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding10 = new ArrayList<>();

    public Resource setCellPadding(String value, Double value3, Double value5, Double value7) {
        this.value = value;
        this.value3 = value3;
        this.value5 = value5;
        this.value7 = value7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s, %f, %f, %f)", value, value3, value5, value7));

//        js.append(String.format(Locale.US, ".cellPadding(%s, %f, %f, %f)", value, value3, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s, %f, %f, %f)", value, value3, value5, value7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding10() {
        if (!setCellPadding10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding11 = new ArrayList<>();

    public Resource setCellPadding(Double value1, String value2, String value4, String value6) {
        this.value1 = value1;
        this.value2 = value2;
        this.value4 = value4;
        this.value6 = value6;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%f, %s, %s, %s)", value1, value2, value4, value6));

//        js.append(String.format(Locale.US, ".cellPadding(%f, %s, %s, %s)", value1, value2, value4, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%f, %s, %s, %s)", value1, value2, value4, value6));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding11() {
        if (!setCellPadding11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding12 = new ArrayList<>();

    public Resource setCellPadding(Double value1, String value2, String value4, Double value7) {
        this.value1 = value1;
        this.value2 = value2;
        this.value4 = value4;
        this.value7 = value7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%f, %s, %s, %f)", value1, value2, value4, value7));

//        js.append(String.format(Locale.US, ".cellPadding(%f, %s, %s, %f)", value1, value2, value4, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%f, %s, %s, %f)", value1, value2, value4, value7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding12() {
        if (!setCellPadding12.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding12) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding13 = new ArrayList<>();

    public Resource setCellPadding(Double value1, String value2, Double value5, String value6) {
        this.value1 = value1;
        this.value2 = value2;
        this.value5 = value5;
        this.value6 = value6;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%f, %s, %f, %s)", value1, value2, value5, value6));

//        js.append(String.format(Locale.US, ".cellPadding(%f, %s, %f, %s)", value1, value2, value5, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%f, %s, %f, %s)", value1, value2, value5, value6));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding13() {
        if (!setCellPadding13.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding13) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding14 = new ArrayList<>();

    public Resource setCellPadding(Double value1, String value2, Double value5, Double value7) {
        this.value1 = value1;
        this.value2 = value2;
        this.value5 = value5;
        this.value7 = value7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%f, %s, %f, %f)", value1, value2, value5, value7));

//        js.append(String.format(Locale.US, ".cellPadding(%f, %s, %f, %f)", value1, value2, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%f, %s, %f, %f)", value1, value2, value5, value7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding14() {
        if (!setCellPadding14.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding14) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding15 = new ArrayList<>();

    public Resource setCellPadding(Double value1, Double value3, String value4, String value6) {
        this.value1 = value1;
        this.value3 = value3;
        this.value4 = value4;
        this.value6 = value6;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%f, %f, %s, %s)", value1, value3, value4, value6));

//        js.append(String.format(Locale.US, ".cellPadding(%f, %f, %s, %s)", value1, value3, value4, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%f, %f, %s, %s)", value1, value3, value4, value6));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding15() {
        if (!setCellPadding15.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding15) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding16 = new ArrayList<>();

    public Resource setCellPadding(Double value1, Double value3, String value4, Double value7) {
        this.value1 = value1;
        this.value3 = value3;
        this.value4 = value4;
        this.value7 = value7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%f, %f, %s, %f)", value1, value3, value4, value7));

//        js.append(String.format(Locale.US, ".cellPadding(%f, %f, %s, %f)", value1, value3, value4, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%f, %f, %s, %f)", value1, value3, value4, value7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding16() {
        if (!setCellPadding16.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding16) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding17 = new ArrayList<>();

    public Resource setCellPadding(Double value1, Double value3, Double value5, String value6) {
        this.value1 = value1;
        this.value3 = value3;
        this.value5 = value5;
        this.value6 = value6;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%f, %f, %f, %s)", value1, value3, value5, value6));

//        js.append(String.format(Locale.US, ".cellPadding(%f, %f, %f, %s)", value1, value3, value5, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%f, %f, %f, %s)", value1, value3, value5, value6));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding17() {
        if (!setCellPadding17.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding17) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding18 = new ArrayList<>();

    public Resource setCellPadding(Double value1, Double value3, Double value5, Double value7) {
        this.value1 = value1;
        this.value3 = value3;
        this.value5 = value5;
        this.value7 = value7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%f, %f, %f, %f)", value1, value3, value5, value7));

//        js.append(String.format(Locale.US, ".cellPadding(%f, %f, %f, %f)", value1, value3, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%f, %f, %f, %f)", value1, value3, value5, value7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding18() {
        if (!setCellPadding18.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding18) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Conflicts getConflicts;

    public Conflicts getConflicts() {
        if (getConflicts == null)
            getConflicts = new Conflicts(jsBase + ".conflicts()");

        return getConflicts;
    }

    private String conflicts;
    private List<Resource> setConflicts = new ArrayList<>();

    public Resource setConflicts(String conflicts) {
        this.conflicts = conflicts;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".conflicts(%s)", conflicts));

//        js.append(String.format(Locale.US, ".conflicts(%s)", conflicts));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".conflicts(%s)", conflicts));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetConflicts() {
        if (!setConflicts.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setConflicts) {
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
    private List<Resource> setData = new ArrayList<>();

    public Resource setData(View data, TextParsingMode csvSettings) {
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
            for (Resource item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setData1 = new ArrayList<>();

    public Resource setData(View data, TextParsingSettings csvSettings1) {
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
            for (Resource item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setData2 = new ArrayList<>();

    public Resource setData(Set data1, TextParsingMode csvSettings) {
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
            for (Resource item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setData3 = new ArrayList<>();

    public Resource setData(Set data1, TextParsingSettings csvSettings1) {
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
            for (Resource item : setData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setData4 = new ArrayList<>();

    public Resource setData(String[] data2, TextParsingMode csvSettings) {
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
            for (Resource item : setData4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setData5 = new ArrayList<>();

    public Resource setData(String[] data2, TextParsingSettings csvSettings1) {
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
            for (Resource item : setData5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setData6 = new ArrayList<>();

    public Resource setData(String data3, TextParsingMode csvSettings) {
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
            for (Resource item : setData6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setData7 = new ArrayList<>();

    public Resource setData(String data3, TextParsingSettings csvSettings1) {
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
            for (Resource item : setData7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double defaultMinutesPerDay;
    private List<Resource> setDefaultMinutesPerDay = new ArrayList<>();

    public Resource setDefaultMinutesPerDay(Double defaultMinutesPerDay) {
        this.defaultMinutesPerDay = defaultMinutesPerDay;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultMinutesPerDay(%f)", defaultMinutesPerDay));

//        js.append(String.format(Locale.US, ".defaultMinutesPerDay(%f)", defaultMinutesPerDay));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultMinutesPerDay(%f)", defaultMinutesPerDay));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetDefaultMinutesPerDay() {
        if (!setDefaultMinutesPerDay.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setDefaultMinutesPerDay) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Grid getGrid;

    public Grid getGrid() {
        if (getGrid == null)
            getGrid = new Grid(jsBase + ".grid()");

        return getGrid;
    }

    private String grid;
    private Boolean grid1;
    private List<Resource> setGrid = new ArrayList<>();

    public Resource setGrid(String grid) {
        this.grid = grid;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grid(%s)", grid));

//        js.append(String.format(Locale.US, ".grid(%s)", grid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".grid(%s)", grid));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetGrid() {
        if (!setGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setGrid1 = new ArrayList<>();

    public Resource setGrid(Boolean grid1) {
        this.grid1 = grid1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grid(%b)", grid1));

//        js.append(String.format(Locale.US, ".grid(%b)", grid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".grid(%b)", grid1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetGrid1() {
        if (!setGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiScroller getHorizontalScrollBar;

    public UiScroller getHorizontalScrollBar() {
        if (getHorizontalScrollBar == null)
            getHorizontalScrollBar = new UiScroller(jsBase + ".horizontalScrollBar()");

        return getHorizontalScrollBar;
    }

    private String horizontalScrollBar;
    private Boolean horizontalScrollBar1;
    private List<Resource> setHorizontalScrollBar = new ArrayList<>();

    public Resource setHorizontalScrollBar(String horizontalScrollBar) {
        this.horizontalScrollBar = horizontalScrollBar;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".horizontalScrollBar(%s)", horizontalScrollBar));

//        js.append(String.format(Locale.US, ".horizontalScrollBar(%s)", horizontalScrollBar));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".horizontalScrollBar(%s)", horizontalScrollBar));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHorizontalScrollBar() {
        if (!setHorizontalScrollBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setHorizontalScrollBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setHorizontalScrollBar1 = new ArrayList<>();

    public Resource setHorizontalScrollBar(Boolean horizontalScrollBar1) {
        this.horizontalScrollBar1 = horizontalScrollBar1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".horizontalScrollBar(%b)", horizontalScrollBar1));

//        js.append(String.format(Locale.US, ".horizontalScrollBar(%b)", horizontalScrollBar1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".horizontalScrollBar(%b)", horizontalScrollBar1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHorizontalScrollBar1() {
        if (!setHorizontalScrollBar1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setHorizontalScrollBar1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double resourceIndex;
    private Double activityIndex;
    private List<Resource> setHover = new ArrayList<>();

    public Resource setHover(Double resourceIndex, Double activityIndex) {
        this.resourceIndex = resourceIndex;
        this.activityIndex = activityIndex;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%f, %f)", resourceIndex, activityIndex));

//        js.append(String.format(Locale.US, ".hover(%f, %f)", resourceIndex, activityIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%f, %f)", resourceIndex, activityIndex));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHover() {
        if (!setHover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setHover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double globalIndex;
    private List<Resource> setHoverPoint = new ArrayList<>();

    public Resource hoverPoint(Double globalIndex) {
        this.globalIndex = globalIndex;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hoverPoint(%f)", globalIndex));

//        js.append(String.format(Locale.US, ".hoverPoint(%f)", globalIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hoverPoint(%f)", globalIndex));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHoverPoint() {
        if (!setHoverPoint.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setHoverPoint) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Logo getLogo;

    public Logo getLogo() {
        if (getLogo == null)
            getLogo = new Logo(jsBase + ".logo()");

        return getLogo;
    }

    private String logo;
    private List<Resource> setLogo = new ArrayList<>();

    public Resource setLogo(String logo) {
        this.logo = logo;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".logo(%s)", logo));

//        js.append(String.format(Locale.US, ".logo(%s)", logo));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".logo(%s)", logo));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLogo() {
        if (!setLogo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setLogo) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minRowHeight;
    private List<Resource> setMinRowHeight = new ArrayList<>();

    public Resource setMinRowHeight(Double minRowHeight) {
        this.minRowHeight = minRowHeight;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minRowHeight(%f)", minRowHeight));

//        js.append(String.format(Locale.US, ".minRowHeight(%f)", minRowHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minRowHeight(%f)", minRowHeight));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMinRowHeight() {
        if (!setMinRowHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setMinRowHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Overlay getOverlay;

    public Overlay getOverlay() {
        if (getOverlay == null)
            getOverlay = new Overlay(jsBase + ".overlay()");

        return getOverlay;
    }

    private String overlay;
    private Boolean overlay1;
    private List<Resource> setOverlay = new ArrayList<>();

    public Resource setOverlay(String overlay) {
        this.overlay = overlay;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".overlay(%s)", overlay));

//        js.append(String.format(Locale.US, ".overlay(%s)", overlay));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".overlay(%s)", overlay));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetOverlay() {
        if (!setOverlay.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setOverlay) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setOverlay1 = new ArrayList<>();

    public Resource setOverlay(Boolean overlay1) {
        this.overlay1 = overlay1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".overlay(%b)", overlay1));

//        js.append(String.format(Locale.US, ".overlay(%b)", overlay1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".overlay(%b)", overlay1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetOverlay1() {
        if (!setOverlay1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setOverlay1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double pixPerHour;
    private List<Resource> setPixPerHour = new ArrayList<>();

    public Resource setPixPerHour(Double pixPerHour) {
        this.pixPerHour = pixPerHour;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pixPerHour(%f)", pixPerHour));

//        js.append(String.format(Locale.US, ".pixPerHour(%f)", pixPerHour));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pixPerHour(%f)", pixPerHour));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPixPerHour() {
        if (!setPixPerHour.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setPixPerHour) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double resourceListWidth;
    private String resourceListWidth1;
    private List<Resource> setResourceListWidth = new ArrayList<>();

    public Resource setResourceListWidth(Double resourceListWidth) {
        this.resourceListWidth = resourceListWidth;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".resourceListWidth(%f)", resourceListWidth));

//        js.append(String.format(Locale.US, ".resourceListWidth(%f)", resourceListWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".resourceListWidth(%f)", resourceListWidth));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetResourceListWidth() {
        if (!setResourceListWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setResourceListWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setResourceListWidth1 = new ArrayList<>();

    public Resource setResourceListWidth(String resourceListWidth1) {
        this.resourceListWidth1 = resourceListWidth1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".resourceListWidth(%s)", resourceListWidth1));

//        js.append(String.format(Locale.US, ".resourceListWidth(%s)", resourceListWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".resourceListWidth(%s)", resourceListWidth1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetResourceListWidth1() {
        if (!setResourceListWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setResourceListWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double resourceIndex1;
    private Double activityIndex1;
    private List<Resource> setSelect = new ArrayList<>();

    public Resource setSelect(Double resourceIndex1, Double activityIndex1) {
        this.resourceIndex1 = resourceIndex1;
        this.activityIndex1 = activityIndex1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%f, %f)", resourceIndex1, activityIndex1));

//        js.append(String.format(Locale.US, ".select(%f, %f)", resourceIndex1, activityIndex1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%f, %f)", resourceIndex1, activityIndex1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelect() {
        if (!setSelect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setSelect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double globalIndex1;
    private List<Resource> setSelectPoint = new ArrayList<>();

    public Resource selectPoint(Double globalIndex1) {
        this.globalIndex1 = globalIndex1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectPoint(%f)", globalIndex1));

//        js.append(String.format(Locale.US, ".selectPoint(%f)", globalIndex1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectPoint(%f)", globalIndex1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectPoint() {
        if (!setSelectPoint.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setSelectPoint) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color;
    private ColoredFill color1;
    private String color2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<Resource> setSplitterStroke = new ArrayList<>();

    public Resource setSplitterStroke(Stroke color, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color = color;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", (color != null) ? color.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", (color != null) ? color.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", (color != null) ? color.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSplitterStroke() {
        if (!setSplitterStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setSplitterStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setSplitterStroke1 = new ArrayList<>();

    public Resource setSplitterStroke(ColoredFill color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color1 = color1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSplitterStroke1() {
        if (!setSplitterStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setSplitterStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setSplitterStroke2 = new ArrayList<>();

    public Resource setSplitterStroke(String color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color2 = color2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", color2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", color2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", color2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSplitterStroke2() {
        if (!setSplitterStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setSplitterStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TimeLine getTimeLine;

    public TimeLine getTimeLine() {
        if (getTimeLine == null)
            getTimeLine = new TimeLine(jsBase + ".timeLine()");

        return getTimeLine;
    }

    private String timeLine;
    private Boolean timeLine1;
    private List<Resource> setTimeLine = new ArrayList<>();

    public Resource setTimeLine(String timeLine) {
        this.timeLine = timeLine;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeLine(%s)", timeLine));

//        js.append(String.format(Locale.US, ".timeLine(%s)", timeLine));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeLine(%s)", timeLine));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTimeLine() {
        if (!setTimeLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setTimeLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setTimeLine1 = new ArrayList<>();

    public Resource setTimeLine(Boolean timeLine1) {
        this.timeLine1 = timeLine1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeLine(%b)", timeLine1));

//        js.append(String.format(Locale.US, ".timeLine(%b)", timeLine1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeLine(%b)", timeLine1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTimeLine1() {
        if (!setTimeLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setTimeLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double timeLineHeight;
    private String timeLineHeight1;
    private List<Resource> setTimeLineHeight = new ArrayList<>();

    public Resource setTimeLineHeight(Double timeLineHeight) {
        this.timeLineHeight = timeLineHeight;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeLineHeight(%f)", timeLineHeight));

//        js.append(String.format(Locale.US, ".timeLineHeight(%f)", timeLineHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeLineHeight(%f)", timeLineHeight));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTimeLineHeight() {
        if (!setTimeLineHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setTimeLineHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setTimeLineHeight1 = new ArrayList<>();

    public Resource setTimeLineHeight(String timeLineHeight1) {
        this.timeLineHeight1 = timeLineHeight1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeLineHeight(%s)", timeLineHeight1));

//        js.append(String.format(Locale.US, ".timeLineHeight(%s)", timeLineHeight1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeLineHeight(%s)", timeLineHeight1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTimeLineHeight1() {
        if (!setTimeLineHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setTimeLineHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TimeTrackingMode timeTrackingMode;
    private String timeTrackingMode1;
    private List<Resource> setTimeTrackingMode = new ArrayList<>();

    public Resource setTimeTrackingMode(TimeTrackingMode timeTrackingMode) {
        this.timeTrackingMode = timeTrackingMode;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeTrackingMode(%s)", (timeTrackingMode != null) ? timeTrackingMode.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".timeTrackingMode(%s)", (timeTrackingMode != null) ? timeTrackingMode.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeTrackingMode(%s)", (timeTrackingMode != null) ? timeTrackingMode.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTimeTrackingMode() {
        if (!setTimeTrackingMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setTimeTrackingMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setTimeTrackingMode1 = new ArrayList<>();

    public Resource setTimeTrackingMode(String timeTrackingMode1) {
        this.timeTrackingMode1 = timeTrackingMode1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeTrackingMode(%s)", timeTrackingMode1));

//        js.append(String.format(Locale.US, ".timeTrackingMode(%s)", timeTrackingMode1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeTrackingMode(%s)", timeTrackingMode1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTimeTrackingMode1() {
        if (!setTimeTrackingMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setTimeTrackingMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double resourceIndex2;
    private Double[] resourceIndex3;
    private Double activityIndex2;
    private List<Resource> setUnhover = new ArrayList<>();

    public Resource unhover(Double resourceIndex2, Double activityIndex2) {
        this.resourceIndex2 = resourceIndex2;
        this.activityIndex2 = activityIndex2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unhover(%f, %f)", resourceIndex2, activityIndex2));

//        js.append(String.format(Locale.US, ".unhover(%f, %f)", resourceIndex2, activityIndex2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unhover(%f, %f)", resourceIndex2, activityIndex2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetUnhover() {
        if (!setUnhover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setUnhover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setUnhover1 = new ArrayList<>();

    public Resource unhover(Double[] resourceIndex3, Double activityIndex2) {
        this.resourceIndex3 = resourceIndex3;
        this.activityIndex2 = activityIndex2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unhover(%s, %f)", Arrays.toString(resourceIndex3), activityIndex2));

//        js.append(String.format(Locale.US, ".unhover(%s, %f)", Arrays.toString(resourceIndex3), activityIndex2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unhover(%s, %f)", Arrays.toString(resourceIndex3), activityIndex2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetUnhover1() {
        if (!setUnhover1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setUnhover1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double resourceIndex4;
    private Double[] resourceIndex5;
    private Double activityIndex3;

    public void unselect(Double resourceIndex4, Double activityIndex3) {
        this.resourceIndex4 = resourceIndex4;
        this.activityIndex3 = activityIndex3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".unselect(%f, %f);", resourceIndex4, activityIndex3));

//        js.append(String.format(Locale.US, jsBase + ".unselect(%f, %f);", resourceIndex4, activityIndex3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%f, %f)", resourceIndex4, activityIndex3));
            js.setLength(0);
        }
    }


    public void unselect(Double[] resourceIndex5, Double activityIndex3) {
        this.resourceIndex5 = resourceIndex5;
        this.activityIndex3 = activityIndex3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".unselect(%s, %f);", Arrays.toString(resourceIndex5), activityIndex3));

//        js.append(String.format(Locale.US, jsBase + ".unselect(%s, %f);", Arrays.toString(resourceIndex5), activityIndex3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%s, %f)", Arrays.toString(resourceIndex5), activityIndex3));
            js.setLength(0);
        }
    }

    private UiScroller getVerticalScrollBar;

    public UiScroller getVerticalScrollBar() {
        if (getVerticalScrollBar == null)
            getVerticalScrollBar = new UiScroller(jsBase + ".verticalScrollBar()");

        return getVerticalScrollBar;
    }

    private String verticalScrollBar;
    private Boolean verticalScrollBar1;
    private List<Resource> setVerticalScrollBar = new ArrayList<>();

    public Resource setVerticalScrollBar(String verticalScrollBar) {
        this.verticalScrollBar = verticalScrollBar;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".verticalScrollBar(%s)", verticalScrollBar));

//        js.append(String.format(Locale.US, ".verticalScrollBar(%s)", verticalScrollBar));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".verticalScrollBar(%s)", verticalScrollBar));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetVerticalScrollBar() {
        if (!setVerticalScrollBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setVerticalScrollBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setVerticalScrollBar1 = new ArrayList<>();

    public Resource setVerticalScrollBar(Boolean verticalScrollBar1) {
        this.verticalScrollBar1 = verticalScrollBar1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".verticalScrollBar(%b)", verticalScrollBar1));

//        js.append(String.format(Locale.US, ".verticalScrollBar(%b)", verticalScrollBar1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".verticalScrollBar(%b)", verticalScrollBar1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetVerticalScrollBar1() {
        if (!setVerticalScrollBar1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setVerticalScrollBar1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private DateTimeWithCalendar getXScale;

    public DateTimeWithCalendar getXScale() {
        if (getXScale == null)
            getXScale = new DateTimeWithCalendar(jsBase + ".xScale()");

        return getXScale;
    }

    private String xScale;
    private List<Resource> setXScale = new ArrayList<>();

    public Resource setXScale(String xScale) {
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
            for (Resource item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double indexOrId;
    private String indexOrId1;
    private List<Resource> setZoomLevel = new ArrayList<>();

    public Resource setZoomLevel(Double indexOrId) {
        this.indexOrId = indexOrId;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomLevel(%f)", indexOrId));

//        js.append(String.format(Locale.US, ".zoomLevel(%f)", indexOrId));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomLevel(%f)", indexOrId));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomLevel() {
        if (!setZoomLevel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setZoomLevel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setZoomLevel1 = new ArrayList<>();

    public Resource setZoomLevel(String indexOrId1) {
        this.indexOrId1 = indexOrId1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomLevel(%s)", indexOrId1));

//        js.append(String.format(Locale.US, ".zoomLevel(%s)", indexOrId1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomLevel(%s)", indexOrId1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomLevel1() {
        if (!setZoomLevel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setZoomLevel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ZoomLevel[] zoomLevels;
    private List<Resource> setZoomLevels = new ArrayList<>();

    public Resource setZoomLevels(ZoomLevel[] zoomLevels) {
        this.zoomLevels = zoomLevels;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomLevels(%s)", arrayToString(zoomLevels)));

//        js.append(String.format(Locale.US, ".zoomLevels(%s)", arrayToString(zoomLevels)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomLevels(%s)", arrayToString(zoomLevels)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomLevels() {
        if (!setZoomLevels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setZoomLevels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetActivities() {
        if (getActivities != null) {
            return getActivities.generateJs();
        }
        return "";
    }

    private String generateJSgetCalendar() {
        if (getCalendar != null) {
            return getCalendar.generateJs();
        }
        return "";
    }

    private String generateJSgetCellPadding() {
        if (getCellPadding != null) {
            return getCellPadding.generateJs();
        }
        return "";
    }

    private String generateJSgetConflicts() {
        if (getConflicts != null) {
            return getConflicts.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetGrid() {
        if (getGrid != null) {
            return getGrid.generateJs();
        }
        return "";
    }

    private String generateJSgetHorizontalScrollBar() {
        if (getHorizontalScrollBar != null) {
            return getHorizontalScrollBar.generateJs();
        }
        return "";
    }

    private String generateJSgetLogo() {
        if (getLogo != null) {
            return getLogo.generateJs();
        }
        return "";
    }

    private String generateJSgetOverlay() {
        if (getOverlay != null) {
            return getOverlay.generateJs();
        }
        return "";
    }

    private String generateJSgetTimeLine() {
        if (getTimeLine != null) {
            return getTimeLine.generateJs();
        }
        return "";
    }

    private String generateJSgetVerticalScrollBar() {
        if (getVerticalScrollBar != null) {
            return getVerticalScrollBar.generateJs();
        }
        return "";
    }

    private String generateJSgetXScale() {
        if (getXScale != null) {
            return getXScale.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetActivities());
        js.append(generateJSgetCalendar());
        js.append(generateJSgetCellPadding());
        js.append(generateJSgetConflicts());
        js.append(generateJSgetData());
        js.append(generateJSgetGrid());
        js.append(generateJSgetHorizontalScrollBar());
        js.append(generateJSgetLogo());
        js.append(generateJSgetOverlay());
        js.append(generateJSgetTimeLine());
        js.append(generateJSgetVerticalScrollBar());
        js.append(generateJSgetXScale());
        js.append(generateJSsetActivities());
        js.append(generateJSsetCalendar());
        js.append(generateJSsetCellPadding());
        js.append(generateJSsetCellPadding1());
        js.append(generateJSsetCellPadding2());
        js.append(generateJSsetCellPadding3());
        js.append(generateJSsetCellPadding4());
        js.append(generateJSsetCellPadding5());
        js.append(generateJSsetCellPadding6());
        js.append(generateJSsetCellPadding7());
        js.append(generateJSsetCellPadding8());
        js.append(generateJSsetCellPadding9());
        js.append(generateJSsetCellPadding10());
        js.append(generateJSsetCellPadding11());
        js.append(generateJSsetCellPadding12());
        js.append(generateJSsetCellPadding13());
        js.append(generateJSsetCellPadding14());
        js.append(generateJSsetCellPadding15());
        js.append(generateJSsetCellPadding16());
        js.append(generateJSsetCellPadding17());
        js.append(generateJSsetCellPadding18());
        js.append(generateJSsetConflicts());
        js.append(generateJSsetData());
        js.append(generateJSsetData1());
        js.append(generateJSsetData2());
        js.append(generateJSsetData3());
        js.append(generateJSsetData4());
        js.append(generateJSsetData5());
        js.append(generateJSsetData6());
        js.append(generateJSsetData7());
        js.append(generateJSsetDefaultMinutesPerDay());
        js.append(generateJSsetGrid());
        js.append(generateJSsetGrid1());
        js.append(generateJSsetHorizontalScrollBar());
        js.append(generateJSsetHorizontalScrollBar1());
        js.append(generateJSsetHover());
        js.append(generateJSsetHoverPoint());
        js.append(generateJSsetLogo());
        js.append(generateJSsetMinRowHeight());
        js.append(generateJSsetOverlay());
        js.append(generateJSsetOverlay1());
        js.append(generateJSsetPixPerHour());
        js.append(generateJSsetResourceListWidth());
        js.append(generateJSsetResourceListWidth1());
        js.append(generateJSsetSelect());
        js.append(generateJSsetSelectPoint());
        js.append(generateJSsetSplitterStroke());
        js.append(generateJSsetSplitterStroke1());
        js.append(generateJSsetSplitterStroke2());
        js.append(generateJSsetTimeLine());
        js.append(generateJSsetTimeLine1());
        js.append(generateJSsetTimeLineHeight());
        js.append(generateJSsetTimeLineHeight1());
        js.append(generateJSsetTimeTrackingMode());
        js.append(generateJSsetTimeTrackingMode1());
        js.append(generateJSsetUnhover());
        js.append(generateJSsetUnhover1());
        js.append(generateJSsetVerticalScrollBar());
        js.append(generateJSsetVerticalScrollBar1());
        js.append(generateJSsetXScale());
        js.append(generateJSsetZoomLevel());
        js.append(generateJSsetZoomLevel1());
        js.append(generateJSsetZoomLevels());

        js.append(super.generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}