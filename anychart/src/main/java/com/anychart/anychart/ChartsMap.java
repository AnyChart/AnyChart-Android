package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class ChartsMap extends SeparateChart {

    protected ChartsMap(String name) {
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


    private AxesMapSettings getAxes;

    public AxesMapSettings getAxes() {
        if (getAxes == null)
            getAxes = new AxesMapSettings(jsBase + ".axes()");

        return getAxes;
    }
    private String axes;
    private Boolean axes1;
    private List<ChartsMap> setAxes = new ArrayList<>();

    public ChartsMap setAxes(String axes) {
        this.axes = axes;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axes(%s)", axes));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axes(%s)", axes));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAxes() {
        if (!setAxes.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setAxes) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setAxes1 = new ArrayList<>();

    public ChartsMap setAxes(Boolean axes1) {
        this.axes1 = axes1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axes(%b)", axes1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axes(%b)", axes1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAxes1() {
        if (!setAxes1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setAxes1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data;
    private Set data1;
    private String[] data2;
    private String data3;
    private TextParsingMode csvSettings;
    private String csvSettings1;
    private TextParsingSettings csvSettings2;
    private List<MapSeriesBubble> setBubble = new ArrayList<>();

    public MapSeriesBubble bubble(View data, TextParsingMode csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesBubble item = new MapSeriesBubble("setBubble" + variableIndex);
        setBubble.add(item);
        return item;
    }
    private String generateJSsetBubble() {
        if (!setBubble.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setBubble) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setBubble1 = new ArrayList<>();

    public MapSeriesBubble bubble(View data, String csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble1" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data != null) ? data.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data != null) ? data.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        MapSeriesBubble item = new MapSeriesBubble("setBubble1" + variableIndex);
        setBubble1.add(item);
        return item;
    }
    private String generateJSsetBubble1() {
        if (!setBubble1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setBubble1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setBubble2 = new ArrayList<>();

    public MapSeriesBubble bubble(View data, TextParsingSettings csvSettings2) {
        this.data = data;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble2" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesBubble item = new MapSeriesBubble("setBubble2" + variableIndex);
        setBubble2.add(item);
        return item;
    }
    private String generateJSsetBubble2() {
        if (!setBubble2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setBubble2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setBubble3 = new ArrayList<>();

    public MapSeriesBubble bubble(Set data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble3" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesBubble item = new MapSeriesBubble("setBubble3" + variableIndex);
        setBubble3.add(item);
        return item;
    }
    private String generateJSsetBubble3() {
        if (!setBubble3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setBubble3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setBubble4 = new ArrayList<>();

    public MapSeriesBubble bubble(Set data1, String csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble4" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data1 != null) ? data1.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        MapSeriesBubble item = new MapSeriesBubble("setBubble4" + variableIndex);
        setBubble4.add(item);
        return item;
    }
    private String generateJSsetBubble4() {
        if (!setBubble4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setBubble4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setBubble5 = new ArrayList<>();

    public MapSeriesBubble bubble(Set data1, TextParsingSettings csvSettings2) {
        this.data1 = data1;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble5" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesBubble item = new MapSeriesBubble("setBubble5" + variableIndex);
        setBubble5.add(item);
        return item;
    }
    private String generateJSsetBubble5() {
        if (!setBubble5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setBubble5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setBubble6 = new ArrayList<>();

    public MapSeriesBubble bubble(String[] data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble6" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesBubble item = new MapSeriesBubble("setBubble6" + variableIndex);
        setBubble6.add(item);
        return item;
    }
    private String generateJSsetBubble6() {
        if (!setBubble6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setBubble6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setBubble7 = new ArrayList<>();

    public MapSeriesBubble bubble(String[] data2, String csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble7" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", Arrays.toString(data2), csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", Arrays.toString(data2), csvSettings1));
            js.setLength(0);
        }
        MapSeriesBubble item = new MapSeriesBubble("setBubble7" + variableIndex);
        setBubble7.add(item);
        return item;
    }
    private String generateJSsetBubble7() {
        if (!setBubble7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setBubble7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setBubble8 = new ArrayList<>();

    public MapSeriesBubble bubble(String[] data2, TextParsingSettings csvSettings2) {
        this.data2 = data2;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble8" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesBubble item = new MapSeriesBubble("setBubble8" + variableIndex);
        setBubble8.add(item);
        return item;
    }
    private String generateJSsetBubble8() {
        if (!setBubble8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setBubble8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setBubble9 = new ArrayList<>();

    public MapSeriesBubble bubble(String data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble9" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesBubble item = new MapSeriesBubble("setBubble9" + variableIndex);
        setBubble9.add(item);
        return item;
    }
    private String generateJSsetBubble9() {
        if (!setBubble9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setBubble9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setBubble10 = new ArrayList<>();

    public MapSeriesBubble bubble(String data3, String csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble10" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", data3, csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", data3, csvSettings1));
            js.setLength(0);
        }
        MapSeriesBubble item = new MapSeriesBubble("setBubble10" + variableIndex);
        setBubble10.add(item);
        return item;
    }
    private String generateJSsetBubble10() {
        if (!setBubble10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setBubble10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesBubble> setBubble11 = new ArrayList<>();

    public MapSeriesBubble bubble(String data3, TextParsingSettings csvSettings2) {
        this.data3 = data3;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble11" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", data3, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", data3, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesBubble item = new MapSeriesBubble("setBubble11" + variableIndex);
        setBubble11.add(item);
        return item;
    }
    private String generateJSsetBubble11() {
        if (!setBubble11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBubble item : setBubble11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Callout getCallout;

    public Callout getCallout() {
        if (getCallout == null)
            getCallout = new Callout(jsBase + ".callout()");

        return getCallout;
    }

    private List<Callout> getCallout1 = new ArrayList<>();

    public Callout getCallout(Double index) {
        Callout item = new Callout(jsBase + ".callout("+ index+")");
        getCallout1.add(item);
        return item;
    }
    private String callout;
    private Boolean callout1;
    private List<ChartsMap> setCallout = new ArrayList<>();

    public ChartsMap setCallout(String callout) {
        this.callout = callout;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".callout(%s)", callout));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".callout(%s)", callout));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCallout() {
        if (!setCallout.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setCallout) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setCallout1 = new ArrayList<>();

    public ChartsMap setCallout(Boolean callout1) {
        this.callout1 = callout1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".callout(%b)", callout1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".callout(%b)", callout1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCallout1() {
        if (!setCallout1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setCallout1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private String callout2;
    private Boolean callout3;
    private List<ChartsMap> setCallout2 = new ArrayList<>();

    public ChartsMap setCallout(String callout2, Double index1) {
        this.callout2 = callout2;
        this.index1 = index1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".callout(%s, %f)", callout2, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".callout(%s, %f)", callout2, index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCallout2() {
        if (!setCallout2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setCallout2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setCallout3 = new ArrayList<>();

    public ChartsMap setCallout(Boolean callout3, Double index1) {
        this.callout3 = callout3;
        this.index1 = index1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".callout(%b, %f)", callout3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".callout(%b, %f)", callout3, index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCallout3() {
        if (!setCallout3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setCallout3) {
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
    private TextParsingMode csvSettings3;
    private String csvSettings4;
    private TextParsingSettings csvSettings5;
    private List<Choropleth> setChoropleth = new ArrayList<>();

    public Choropleth choropleth(View data4, TextParsingMode csvSettings3) {
        this.data4 = data4;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setChoropleth" + ++variableIndex + " = " + jsBase + ".choropleth(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        Choropleth item = new Choropleth("setChoropleth" + variableIndex);
        setChoropleth.add(item);
        return item;
    }
    private String generateJSsetChoropleth() {
        if (!setChoropleth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Choropleth item : setChoropleth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Choropleth> setChoropleth1 = new ArrayList<>();

    public Choropleth choropleth(View data4, String csvSettings4) {
        this.data4 = data4;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setChoropleth1" + ++variableIndex + " = " + jsBase + ".choropleth(%s, %s);", (data4 != null) ? data4.generateJs() : "null", csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s, %s)", (data4 != null) ? data4.generateJs() : "null", csvSettings4));
            js.setLength(0);
        }
        Choropleth item = new Choropleth("setChoropleth1" + variableIndex);
        setChoropleth1.add(item);
        return item;
    }
    private String generateJSsetChoropleth1() {
        if (!setChoropleth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Choropleth item : setChoropleth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Choropleth> setChoropleth2 = new ArrayList<>();

    public Choropleth choropleth(View data4, TextParsingSettings csvSettings5) {
        this.data4 = data4;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setChoropleth2" + ++variableIndex + " = " + jsBase + ".choropleth(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        Choropleth item = new Choropleth("setChoropleth2" + variableIndex);
        setChoropleth2.add(item);
        return item;
    }
    private String generateJSsetChoropleth2() {
        if (!setChoropleth2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Choropleth item : setChoropleth2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Choropleth> setChoropleth3 = new ArrayList<>();

    public Choropleth choropleth(Set data5, TextParsingMode csvSettings3) {
        this.data5 = data5;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setChoropleth3" + ++variableIndex + " = " + jsBase + ".choropleth(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s, %s)", (data5 != null) ? data5.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        Choropleth item = new Choropleth("setChoropleth3" + variableIndex);
        setChoropleth3.add(item);
        return item;
    }
    private String generateJSsetChoropleth3() {
        if (!setChoropleth3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Choropleth item : setChoropleth3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Choropleth> setChoropleth4 = new ArrayList<>();

    public Choropleth choropleth(Set data5, String csvSettings4) {
        this.data5 = data5;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setChoropleth4" + ++variableIndex + " = " + jsBase + ".choropleth(%s, %s);", (data5 != null) ? data5.generateJs() : "null", csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s, %s)", (data5 != null) ? data5.generateJs() : "null", csvSettings4));
            js.setLength(0);
        }
        Choropleth item = new Choropleth("setChoropleth4" + variableIndex);
        setChoropleth4.add(item);
        return item;
    }
    private String generateJSsetChoropleth4() {
        if (!setChoropleth4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Choropleth item : setChoropleth4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Choropleth> setChoropleth5 = new ArrayList<>();

    public Choropleth choropleth(Set data5, TextParsingSettings csvSettings5) {
        this.data5 = data5;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setChoropleth5" + ++variableIndex + " = " + jsBase + ".choropleth(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s, %s)", (data5 != null) ? data5.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        Choropleth item = new Choropleth("setChoropleth5" + variableIndex);
        setChoropleth5.add(item);
        return item;
    }
    private String generateJSsetChoropleth5() {
        if (!setChoropleth5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Choropleth item : setChoropleth5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Choropleth> setChoropleth6 = new ArrayList<>();

    public Choropleth choropleth(String[] data6, TextParsingMode csvSettings3) {
        this.data6 = data6;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setChoropleth6" + ++variableIndex + " = " + jsBase + ".choropleth(%s, %s);", Arrays.toString(data6), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s, %s)", Arrays.toString(data6), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        Choropleth item = new Choropleth("setChoropleth6" + variableIndex);
        setChoropleth6.add(item);
        return item;
    }
    private String generateJSsetChoropleth6() {
        if (!setChoropleth6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Choropleth item : setChoropleth6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Choropleth> setChoropleth7 = new ArrayList<>();

    public Choropleth choropleth(String[] data6, String csvSettings4) {
        this.data6 = data6;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setChoropleth7" + ++variableIndex + " = " + jsBase + ".choropleth(%s, %s);", Arrays.toString(data6), csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s, %s)", Arrays.toString(data6), csvSettings4));
            js.setLength(0);
        }
        Choropleth item = new Choropleth("setChoropleth7" + variableIndex);
        setChoropleth7.add(item);
        return item;
    }
    private String generateJSsetChoropleth7() {
        if (!setChoropleth7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Choropleth item : setChoropleth7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Choropleth> setChoropleth8 = new ArrayList<>();

    public Choropleth choropleth(String[] data6, TextParsingSettings csvSettings5) {
        this.data6 = data6;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setChoropleth8" + ++variableIndex + " = " + jsBase + ".choropleth(%s, %s);", Arrays.toString(data6), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s, %s)", Arrays.toString(data6), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        Choropleth item = new Choropleth("setChoropleth8" + variableIndex);
        setChoropleth8.add(item);
        return item;
    }
    private String generateJSsetChoropleth8() {
        if (!setChoropleth8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Choropleth item : setChoropleth8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Choropleth> setChoropleth9 = new ArrayList<>();

    public Choropleth choropleth(String data7, TextParsingMode csvSettings3) {
        this.data7 = data7;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setChoropleth9" + ++variableIndex + " = " + jsBase + ".choropleth(%s, %s);", data7, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s, %s)", data7, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        Choropleth item = new Choropleth("setChoropleth9" + variableIndex);
        setChoropleth9.add(item);
        return item;
    }
    private String generateJSsetChoropleth9() {
        if (!setChoropleth9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Choropleth item : setChoropleth9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Choropleth> setChoropleth10 = new ArrayList<>();

    public Choropleth choropleth(String data7, String csvSettings4) {
        this.data7 = data7;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setChoropleth10" + ++variableIndex + " = " + jsBase + ".choropleth(%s, %s);", data7, csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s, %s)", data7, csvSettings4));
            js.setLength(0);
        }
        Choropleth item = new Choropleth("setChoropleth10" + variableIndex);
        setChoropleth10.add(item);
        return item;
    }
    private String generateJSsetChoropleth10() {
        if (!setChoropleth10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Choropleth item : setChoropleth10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Choropleth> setChoropleth11 = new ArrayList<>();

    public Choropleth choropleth(String data7, TextParsingSettings csvSettings5) {
        this.data7 = data7;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setChoropleth11" + ++variableIndex + " = " + jsBase + ".choropleth(%s, %s);", data7, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s, %s)", data7, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        Choropleth item = new Choropleth("setChoropleth11" + variableIndex);
        setChoropleth11.add(item);
        return item;
    }
    private String generateJSsetChoropleth11() {
        if (!setChoropleth11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Choropleth item : setChoropleth11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private UiColorRange getColorRange;

    public UiColorRange getColorRange() {
        if (getColorRange == null)
            getColorRange = new UiColorRange(jsBase + ".colorRange()");

        return getColorRange;
    }
    private String colorRange;
    private List<ChartsMap> setColorRange = new ArrayList<>();

    public ChartsMap setColorRange(String colorRange) {
        this.colorRange = colorRange;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorRange(%s)", colorRange));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorRange(%s)", colorRange));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetColorRange() {
        if (!setColorRange.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setColorRange) {
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
    private TextParsingMode csvSettings6;
    private String csvSettings7;
    private TextParsingSettings csvSettings8;
    private List<Connector> setConnector = new ArrayList<>();

    public Connector connector(View data8, TextParsingMode csvSettings6) {
        this.data8 = data8;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setConnector" + ++variableIndex + " = " + jsBase + ".connector(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s, %s)", (data8 != null) ? data8.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        Connector item = new Connector("setConnector" + variableIndex);
        setConnector.add(item);
        return item;
    }
    private String generateJSsetConnector() {
        if (!setConnector.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : setConnector) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Connector> setConnector1 = new ArrayList<>();

    public Connector connector(View data8, String csvSettings7) {
        this.data8 = data8;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setConnector1" + ++variableIndex + " = " + jsBase + ".connector(%s, %s);", (data8 != null) ? data8.generateJs() : "null", csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s, %s)", (data8 != null) ? data8.generateJs() : "null", csvSettings7));
            js.setLength(0);
        }
        Connector item = new Connector("setConnector1" + variableIndex);
        setConnector1.add(item);
        return item;
    }
    private String generateJSsetConnector1() {
        if (!setConnector1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : setConnector1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Connector> setConnector2 = new ArrayList<>();

    public Connector connector(View data8, TextParsingSettings csvSettings8) {
        this.data8 = data8;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setConnector2" + ++variableIndex + " = " + jsBase + ".connector(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s, %s)", (data8 != null) ? data8.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        Connector item = new Connector("setConnector2" + variableIndex);
        setConnector2.add(item);
        return item;
    }
    private String generateJSsetConnector2() {
        if (!setConnector2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : setConnector2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Connector> setConnector3 = new ArrayList<>();

    public Connector connector(Set data9, TextParsingMode csvSettings6) {
        this.data9 = data9;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setConnector3" + ++variableIndex + " = " + jsBase + ".connector(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s, %s)", (data9 != null) ? data9.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        Connector item = new Connector("setConnector3" + variableIndex);
        setConnector3.add(item);
        return item;
    }
    private String generateJSsetConnector3() {
        if (!setConnector3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : setConnector3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Connector> setConnector4 = new ArrayList<>();

    public Connector connector(Set data9, String csvSettings7) {
        this.data9 = data9;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setConnector4" + ++variableIndex + " = " + jsBase + ".connector(%s, %s);", (data9 != null) ? data9.generateJs() : "null", csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s, %s)", (data9 != null) ? data9.generateJs() : "null", csvSettings7));
            js.setLength(0);
        }
        Connector item = new Connector("setConnector4" + variableIndex);
        setConnector4.add(item);
        return item;
    }
    private String generateJSsetConnector4() {
        if (!setConnector4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : setConnector4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Connector> setConnector5 = new ArrayList<>();

    public Connector connector(Set data9, TextParsingSettings csvSettings8) {
        this.data9 = data9;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setConnector5" + ++variableIndex + " = " + jsBase + ".connector(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s, %s)", (data9 != null) ? data9.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        Connector item = new Connector("setConnector5" + variableIndex);
        setConnector5.add(item);
        return item;
    }
    private String generateJSsetConnector5() {
        if (!setConnector5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : setConnector5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Connector> setConnector6 = new ArrayList<>();

    public Connector connector(String[] data10, TextParsingMode csvSettings6) {
        this.data10 = data10;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setConnector6" + ++variableIndex + " = " + jsBase + ".connector(%s, %s);", Arrays.toString(data10), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s, %s)", Arrays.toString(data10), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        Connector item = new Connector("setConnector6" + variableIndex);
        setConnector6.add(item);
        return item;
    }
    private String generateJSsetConnector6() {
        if (!setConnector6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : setConnector6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Connector> setConnector7 = new ArrayList<>();

    public Connector connector(String[] data10, String csvSettings7) {
        this.data10 = data10;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setConnector7" + ++variableIndex + " = " + jsBase + ".connector(%s, %s);", Arrays.toString(data10), csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s, %s)", Arrays.toString(data10), csvSettings7));
            js.setLength(0);
        }
        Connector item = new Connector("setConnector7" + variableIndex);
        setConnector7.add(item);
        return item;
    }
    private String generateJSsetConnector7() {
        if (!setConnector7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : setConnector7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Connector> setConnector8 = new ArrayList<>();

    public Connector connector(String[] data10, TextParsingSettings csvSettings8) {
        this.data10 = data10;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setConnector8" + ++variableIndex + " = " + jsBase + ".connector(%s, %s);", Arrays.toString(data10), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s, %s)", Arrays.toString(data10), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        Connector item = new Connector("setConnector8" + variableIndex);
        setConnector8.add(item);
        return item;
    }
    private String generateJSsetConnector8() {
        if (!setConnector8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : setConnector8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Connector> setConnector9 = new ArrayList<>();

    public Connector connector(String data11, TextParsingMode csvSettings6) {
        this.data11 = data11;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setConnector9" + ++variableIndex + " = " + jsBase + ".connector(%s, %s);", data11, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s, %s)", data11, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        Connector item = new Connector("setConnector9" + variableIndex);
        setConnector9.add(item);
        return item;
    }
    private String generateJSsetConnector9() {
        if (!setConnector9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : setConnector9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Connector> setConnector10 = new ArrayList<>();

    public Connector connector(String data11, String csvSettings7) {
        this.data11 = data11;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setConnector10" + ++variableIndex + " = " + jsBase + ".connector(%s, %s);", data11, csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s, %s)", data11, csvSettings7));
            js.setLength(0);
        }
        Connector item = new Connector("setConnector10" + variableIndex);
        setConnector10.add(item);
        return item;
    }
    private String generateJSsetConnector10() {
        if (!setConnector10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : setConnector10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Connector> setConnector11 = new ArrayList<>();

    public Connector connector(String data11, TextParsingSettings csvSettings8) {
        this.data11 = data11;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setConnector11" + ++variableIndex + " = " + jsBase + ".connector(%s, %s);", data11, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s, %s)", data11, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        Connector item = new Connector("setConnector11" + variableIndex);
        setConnector11.add(item);
        return item;
    }
    private String generateJSsetConnector11() {
        if (!setConnector11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : setConnector11) {
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
    private List<ChartsMap> setCrosshair = new ArrayList<>();

    public ChartsMap setCrosshair(String crosshair) {
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
            for (ChartsMap item : setCrosshair) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setCrosshair1 = new ArrayList<>();

    public ChartsMap setCrosshair(Boolean crosshair1) {
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
            for (ChartsMap item : setCrosshair1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String crs;
    private MapProjections crs1;
    private String crs2;

    public void setCrs(String crs) {
        this.crs = crs;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".crs(%s);", crs));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".crs(%s)", crs));
            js.setLength(0);
        }
    }


    public void setCrs(MapProjections crs1) {
        this.crs1 = crs1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".crs(%s);", (crs1 != null) ? crs1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".crs(%s)", (crs1 != null) ? crs1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    private Animation getCrsAnimation;

    public Animation getCrsAnimation() {
        if (getCrsAnimation == null)
            getCrsAnimation = new Animation(jsBase + ".crsAnimation()");

        return getCrsAnimation;
    }
    private Boolean crsAnimation;
    private String crsAnimation1;
    private Double duration;
    private List<ChartsMap> setCrsAnimation = new ArrayList<>();

    public ChartsMap setCrsAnimation(Boolean crsAnimation, Double duration) {
        this.crsAnimation = crsAnimation;
        this.duration = duration;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crsAnimation(%b, %f)", crsAnimation, duration));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crsAnimation(%b, %f)", crsAnimation, duration));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCrsAnimation() {
        if (!setCrsAnimation.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setCrsAnimation) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setCrsAnimation1 = new ArrayList<>();

    public ChartsMap setCrsAnimation(String crsAnimation1, Double duration) {
        this.crsAnimation1 = crsAnimation1;
        this.duration = duration;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crsAnimation(%s, %f)", crsAnimation1, duration));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crsAnimation(%s, %f)", crsAnimation1, duration));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCrsAnimation1() {
        if (!setCrsAnimation1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setCrsAnimation1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private MapSeriesType defaultSeriesType;
    private String defaultSeriesType1;
    private List<ChartsMap> setDefaultSeriesType = new ArrayList<>();

    public ChartsMap setDefaultSeriesType(MapSeriesType defaultSeriesType) {
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
            for (ChartsMap item : setDefaultSeriesType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setDefaultSeriesType1 = new ArrayList<>();

    public ChartsMap setDefaultSeriesType(String defaultSeriesType1) {
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
            for (ChartsMap item : setDefaultSeriesType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String drillDownMap;

    public void drillDownMap(String drillDownMap) {
        this.drillDownMap = drillDownMap;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".drillDownMap(%s);", drillDownMap));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".drillDownMap(%s)", drillDownMap));
            js.setLength(0);
        }
    }

    private String id;
    private ChartsMap map;
    private List<ChartsMap> setDrillTo = new ArrayList<>();

    public ChartsMap drillTo(String id, ChartsMap map) {
        this.id = id;
        this.map = map;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".drillTo(%s, %s)", id, (map != null) ? map.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".drillTo(%s, %s)", id, (map != null) ? map.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetDrillTo() {
        if (!setDrillTo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setDrillTo) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String id2;
    private String crs3;
    private List<ChartsMap> setFeatureCrs = new ArrayList<>();

    public ChartsMap setFeatureCrs(String id2, String crs3) {
        this.id2 = id2;
        this.crs3 = crs3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".featureCrs(%s, %s)", id2, crs3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".featureCrs(%s, %s)", id2, crs3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFeatureCrs() {
        if (!setFeatureCrs.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setFeatureCrs) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String id4;
    private Double ratio;
    private List<ChartsMap> setFeatureScaleFactor = new ArrayList<>();

    public ChartsMap setFeatureScaleFactor(String id4, Double ratio) {
        this.id4 = id4;
        this.ratio = ratio;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".featureScaleFactor(%s, %f)", id4, ratio));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".featureScaleFactor(%s, %f)", id4, ratio));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFeatureScaleFactor() {
        if (!setFeatureScaleFactor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setFeatureScaleFactor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String id6;
    private Double dx;
    private Double dy;
    private List<ChartsMap> setFeatureTranslation = new ArrayList<>();

    public ChartsMap setFeatureTranslation(String id6, Double dx, Double dy) {
        this.id6 = id6;
        this.dx = dx;
        this.dy = dy;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".featureTranslation(%s, %f, %f)", id6, dx, dy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".featureTranslation(%s, %f, %f)", id6, dx, dy));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetFeatureTranslation() {
        if (!setFeatureTranslation.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setFeatureTranslation) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String data12;
    private String data13;

    public void setGeoData(String data12, String data13) {
        this.data12 = data12;
        this.data13 = data13;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".geoData(%s, %s);", data12, data13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".geoData(%s, %s)", data12, data13));
            js.setLength(0);
        }
    }

    private String geoIdField;
    private List<ChartsMap> setGeoIdField = new ArrayList<>();

    public ChartsMap setGeoIdField(String geoIdField) {
        this.geoIdField = geoIdField;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".geoIdField(%s)", geoIdField));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".geoIdField(%s)", geoIdField));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetGeoIdField() {
        if (!setGeoIdField.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setGeoIdField) {
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

    private List<MapSeriesBase> getGetSeries = new ArrayList<>();

    public MapSeriesBase getGetSeries(Double id7) {
        MapSeriesBase item = new MapSeriesBase(jsBase + ".getSeries("+ id7+")");
        getGetSeries.add(item);
        return item;
    }

    private List<MapSeriesBase> getGetSeries1 = new ArrayList<>();

    public MapSeriesBase getGetSeries(String id8) {
        MapSeriesBase item = new MapSeriesBase(jsBase + ".getSeries("+ id8+")");
        getGetSeries1.add(item);
        return item;
    }

    private List<MapSeriesBase> getGetSeriesAt = new ArrayList<>();

    public MapSeriesBase getGetSeriesAt(Double index2) {
        MapSeriesBase item = new MapSeriesBase(jsBase + ".getSeriesAt("+ index2+")");
        getGetSeriesAt.add(item);
        return item;
    }

    private GridsMapSettings getGrids;

    public GridsMapSettings getGrids() {
        if (getGrids == null)
            getGrids = new GridsMapSettings(jsBase + ".grids()");

        return getGrids;
    }
    private String grids;
    private Boolean grids1;
    private List<ChartsMap> setGrids = new ArrayList<>();

    public ChartsMap setGrids(String grids) {
        this.grids = grids;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grids(%s)", grids));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".grids(%s)", grids));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetGrids() {
        if (!setGrids.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setGrids) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setGrids1 = new ArrayList<>();

    public ChartsMap setGrids(Boolean grids1) {
        this.grids1 = grids1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grids(%b)", grids1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".grids(%b)", grids1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetGrids1() {
        if (!setGrids1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setGrids1) {
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
    private List<ChartsMap> setHatchFillPalette = new ArrayList<>();

    public ChartsMap setHatchFillPalette(HatchFillType[] hatchFillPalette) {
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
            for (ChartsMap item : setHatchFillPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setHatchFillPalette1 = new ArrayList<>();

    public ChartsMap setHatchFillPalette(String hatchFillPalette1) {
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
            for (ChartsMap item : setHatchFillPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setHatchFillPalette2 = new ArrayList<>();

    public ChartsMap setHatchFillPalette(HatchFills hatchFillPalette2) {
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
            for (ChartsMap item : setHatchFillPalette2) {
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
    private List<ChartsMap> setHovered = new ArrayList<>();

    public ChartsMap setHovered(String hovered) {
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
            for (ChartsMap item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double x;
    private Double y;

    public void inverseTransform(Double x, Double y) {
        this.x = x;
        this.y = y;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".inverseTransform(%f, %f);", x, y));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverseTransform(%f, %f)", x, y));
            js.setLength(0);
        }
    }


    private UiLabelsFactory getLabels;

    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }
    private String labels;
    private Boolean labels1;
    private List<ChartsMap> setLabels = new ArrayList<>();

    public ChartsMap setLabels(String labels) {
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
            for (ChartsMap item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setLabels1 = new ArrayList<>();

    public ChartsMap setLabels(Boolean labels1) {
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
            for (ChartsMap item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View data14;
    private Set data15;
    private String[] data16;
    private String data17;
    private TextParsingMode csvSettings9;
    private String csvSettings10;
    private TextParsingSettings csvSettings11;
    private List<MapSeriesMarker> setMarker = new ArrayList<>();

    public MapSeriesMarker marker(View data14, TextParsingMode csvSettings9) {
        this.data14 = data14;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data14 != null) ? data14.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data14 != null) ? data14.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesMarker item = new MapSeriesMarker("setMarker" + variableIndex);
        setMarker.add(item);
        return item;
    }
    private String generateJSsetMarker() {
        if (!setMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesMarker item : setMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesMarker> setMarker1 = new ArrayList<>();

    public MapSeriesMarker marker(View data14, String csvSettings10) {
        this.data14 = data14;
        this.csvSettings10 = csvSettings10;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker1" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data14 != null) ? data14.generateJs() : "null", csvSettings10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data14 != null) ? data14.generateJs() : "null", csvSettings10));
            js.setLength(0);
        }
        MapSeriesMarker item = new MapSeriesMarker("setMarker1" + variableIndex);
        setMarker1.add(item);
        return item;
    }
    private String generateJSsetMarker1() {
        if (!setMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesMarker item : setMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesMarker> setMarker2 = new ArrayList<>();

    public MapSeriesMarker marker(View data14, TextParsingSettings csvSettings11) {
        this.data14 = data14;
        this.csvSettings11 = csvSettings11;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker2" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data14 != null) ? data14.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data14 != null) ? data14.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesMarker item = new MapSeriesMarker("setMarker2" + variableIndex);
        setMarker2.add(item);
        return item;
    }
    private String generateJSsetMarker2() {
        if (!setMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesMarker item : setMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesMarker> setMarker3 = new ArrayList<>();

    public MapSeriesMarker marker(Set data15, TextParsingMode csvSettings9) {
        this.data15 = data15;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker3" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data15 != null) ? data15.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesMarker item = new MapSeriesMarker("setMarker3" + variableIndex);
        setMarker3.add(item);
        return item;
    }
    private String generateJSsetMarker3() {
        if (!setMarker3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesMarker item : setMarker3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesMarker> setMarker4 = new ArrayList<>();

    public MapSeriesMarker marker(Set data15, String csvSettings10) {
        this.data15 = data15;
        this.csvSettings10 = csvSettings10;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker4" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data15 != null) ? data15.generateJs() : "null", csvSettings10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data15 != null) ? data15.generateJs() : "null", csvSettings10));
            js.setLength(0);
        }
        MapSeriesMarker item = new MapSeriesMarker("setMarker4" + variableIndex);
        setMarker4.add(item);
        return item;
    }
    private String generateJSsetMarker4() {
        if (!setMarker4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesMarker item : setMarker4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesMarker> setMarker5 = new ArrayList<>();

    public MapSeriesMarker marker(Set data15, TextParsingSettings csvSettings11) {
        this.data15 = data15;
        this.csvSettings11 = csvSettings11;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker5" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data15 != null) ? data15.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesMarker item = new MapSeriesMarker("setMarker5" + variableIndex);
        setMarker5.add(item);
        return item;
    }
    private String generateJSsetMarker5() {
        if (!setMarker5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesMarker item : setMarker5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesMarker> setMarker6 = new ArrayList<>();

    public MapSeriesMarker marker(String[] data16, TextParsingMode csvSettings9) {
        this.data16 = data16;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker6" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data16), (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data16), (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesMarker item = new MapSeriesMarker("setMarker6" + variableIndex);
        setMarker6.add(item);
        return item;
    }
    private String generateJSsetMarker6() {
        if (!setMarker6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesMarker item : setMarker6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesMarker> setMarker7 = new ArrayList<>();

    public MapSeriesMarker marker(String[] data16, String csvSettings10) {
        this.data16 = data16;
        this.csvSettings10 = csvSettings10;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker7" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data16), csvSettings10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data16), csvSettings10));
            js.setLength(0);
        }
        MapSeriesMarker item = new MapSeriesMarker("setMarker7" + variableIndex);
        setMarker7.add(item);
        return item;
    }
    private String generateJSsetMarker7() {
        if (!setMarker7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesMarker item : setMarker7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesMarker> setMarker8 = new ArrayList<>();

    public MapSeriesMarker marker(String[] data16, TextParsingSettings csvSettings11) {
        this.data16 = data16;
        this.csvSettings11 = csvSettings11;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker8" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data16), (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data16), (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesMarker item = new MapSeriesMarker("setMarker8" + variableIndex);
        setMarker8.add(item);
        return item;
    }
    private String generateJSsetMarker8() {
        if (!setMarker8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesMarker item : setMarker8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesMarker> setMarker9 = new ArrayList<>();

    public MapSeriesMarker marker(String data17, TextParsingMode csvSettings9) {
        this.data17 = data17;
        this.csvSettings9 = csvSettings9;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker9" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data17, (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data17, (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesMarker item = new MapSeriesMarker("setMarker9" + variableIndex);
        setMarker9.add(item);
        return item;
    }
    private String generateJSsetMarker9() {
        if (!setMarker9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesMarker item : setMarker9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesMarker> setMarker10 = new ArrayList<>();

    public MapSeriesMarker marker(String data17, String csvSettings10) {
        this.data17 = data17;
        this.csvSettings10 = csvSettings10;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker10" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data17, csvSettings10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data17, csvSettings10));
            js.setLength(0);
        }
        MapSeriesMarker item = new MapSeriesMarker("setMarker10" + variableIndex);
        setMarker10.add(item);
        return item;
    }
    private String generateJSsetMarker10() {
        if (!setMarker10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesMarker item : setMarker10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<MapSeriesMarker> setMarker11 = new ArrayList<>();

    public MapSeriesMarker marker(String data17, TextParsingSettings csvSettings11) {
        this.data17 = data17;
        this.csvSettings11 = csvSettings11;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker11" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data17, (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data17, (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
        MapSeriesMarker item = new MapSeriesMarker("setMarker11" + variableIndex);
        setMarker11.add(item);
        return item;
    }
    private String generateJSsetMarker11() {
        if (!setMarker11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesMarker item : setMarker11) {
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
    private List<ChartsMap> setMarkerPalette = new ArrayList<>();

    public ChartsMap setMarkerPalette(Markers markerPalette) {
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
            for (ChartsMap item : setMarkerPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setMarkerPalette1 = new ArrayList<>();

    public ChartsMap setMarkerPalette(String markerPalette1) {
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
            for (ChartsMap item : setMarkerPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setMarkerPalette2 = new ArrayList<>();

    public ChartsMap setMarkerPalette(MarkerType[] markerPalette2) {
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
            for (ChartsMap item : setMarkerPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setMarkerPalette3 = new ArrayList<>();

    public ChartsMap setMarkerPalette(String[] markerPalette3) {
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
            for (ChartsMap item : setMarkerPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxBubbleSize;
    private String maxBubbleSize1;
    private List<ChartsMap> setMaxBubbleSize = new ArrayList<>();

    public ChartsMap setMaxBubbleSize(Double maxBubbleSize) {
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
            for (ChartsMap item : setMaxBubbleSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setMaxBubbleSize1 = new ArrayList<>();

    public ChartsMap setMaxBubbleSize(String maxBubbleSize1) {
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
            for (ChartsMap item : setMaxBubbleSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxZoomLevel;
    private List<ChartsMap> setMaxZoomLevel = new ArrayList<>();

    public ChartsMap setMaxZoomLevel(Double maxZoomLevel) {
        this.maxZoomLevel = maxZoomLevel;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxZoomLevel(%f)", maxZoomLevel));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxZoomLevel(%f)", maxZoomLevel));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMaxZoomLevel() {
        if (!setMaxZoomLevel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setMaxZoomLevel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minBubbleSize;
    private String minBubbleSize1;
    private List<ChartsMap> setMinBubbleSize = new ArrayList<>();

    public ChartsMap setMinBubbleSize(Double minBubbleSize) {
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
            for (ChartsMap item : setMinBubbleSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setMinBubbleSize1 = new ArrayList<>();

    public ChartsMap setMinBubbleSize(String minBubbleSize1) {
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
            for (ChartsMap item : setMinBubbleSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double dx1;
    private Double dy1;
    private List<ChartsMap> setMove = new ArrayList<>();

    public ChartsMap move(Double dx1, Double dy1) {
        this.dx1 = dx1;
        this.dy1 = dy1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".move(%f, %f)", dx1, dy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".move(%f, %f)", dx1, dy1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMove() {
        if (!setMove.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setMove) {
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
    private List<ChartsMap> setNormal = new ArrayList<>();

    public ChartsMap setNormal(String normal) {
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
            for (ChartsMap item : setNormal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private Boolean overlapMode2;
    private List<ChartsMap> setOverlapMode = new ArrayList<>();

    public ChartsMap setOverlapMode(LabelsOverlapMode overlapMode) {
        this.overlapMode = overlapMode;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".overlapMode(%s)", (overlapMode != null) ? overlapMode.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%s)", (overlapMode != null) ? overlapMode.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetOverlapMode() {
        if (!setOverlapMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setOverlapMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setOverlapMode1 = new ArrayList<>();

    public ChartsMap setOverlapMode(String overlapMode1) {
        this.overlapMode1 = overlapMode1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".overlapMode(%s)", overlapMode1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%s)", overlapMode1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetOverlapMode1() {
        if (!setOverlapMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setOverlapMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setOverlapMode2 = new ArrayList<>();

    public ChartsMap setOverlapMode(Boolean overlapMode2) {
        this.overlapMode2 = overlapMode2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".overlapMode(%b)", overlapMode2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%b)", overlapMode2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetOverlapMode2() {
        if (!setOverlapMode2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setOverlapMode2) {
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
    private List<ChartsMap> setPalette = new ArrayList<>();

    public ChartsMap setPalette(RangeColors palette) {
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
            for (ChartsMap item : setPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setPalette1 = new ArrayList<>();

    public ChartsMap setPalette(DistinctColors palette1) {
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
            for (ChartsMap item : setPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setPalette2 = new ArrayList<>();

    public ChartsMap setPalette(String palette2) {
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
            for (ChartsMap item : setPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setPalette3 = new ArrayList<>();

    public ChartsMap setPalette(String[] palette3) {
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
            for (ChartsMap item : setPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double id9;
    private String id10;
    private List<ChartsMap> setRemoveSeries = new ArrayList<>();

    public ChartsMap removeSeries(Double id9) {
        this.id9 = id9;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeries(%f)", id9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%f)", id9));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRemoveSeries() {
        if (!setRemoveSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setRemoveSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setRemoveSeries1 = new ArrayList<>();

    public ChartsMap removeSeries(String id10) {
        this.id10 = id10;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeries(%s)", id10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%s)", id10));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRemoveSeries1() {
        if (!setRemoveSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setRemoveSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index3;
    private List<ChartsMap> setRemoveSeriesAt = new ArrayList<>();

    public ChartsMap removeSeriesAt(Double index3) {
        this.index3 = index3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeriesAt(%f)", index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeriesAt(%f)", index3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRemoveSeriesAt() {
        if (!setRemoveSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setRemoveSeriesAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Geo getScale;

    public Geo getScale() {
        if (getScale == null)
            getScale = new Geo(jsBase + ".scale()");

        return getScale;
    }
    private Geo scale;
    private String scale1;
    private List<Geo> setScale = new ArrayList<>();

    public Geo setScale(Geo scale) {
        this.scale = scale;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setScale" + ++variableIndex + " = " + jsBase + ".scale(%s);", (scale != null) ? scale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s)", (scale != null) ? scale.generateJs() : "null"));
            js.setLength(0);
        }
        Geo item = new Geo("setScale" + variableIndex);
        setScale.add(item);
        return item;
    }
    private String generateJSsetScale() {
        if (!setScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Geo> setScale1 = new ArrayList<>();

    public Geo setScale(String scale1) {
        this.scale1 = scale1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setScale1" + ++variableIndex + " = " + jsBase + ".scale(%s);", scale1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s)", scale1));
            js.setLength(0);
        }
        Geo item = new Geo("setScale1" + variableIndex);
        setScale1.add(item);
        return item;
    }
    private String generateJSsetScale1() {
        if (!setScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Geo item : setScale1) {
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
    private List<ChartsMap> setSelected = new ArrayList<>();

    public ChartsMap setSelected(String selected) {
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
            for (ChartsMap item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double xLong;
    private Double yLat;

    public void transform(Double xLong, Double yLat) {
        this.xLong = xLong;
        this.yLat = yLat;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".transform(%f, %f);", xLong, yLat));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".transform(%f, %f)", xLong, yLat));
            js.setLength(0);
        }
    }

    private String id11;
    private Double dx2;
    private Double dy2;
    private List<ChartsMap> setTranslateFeature = new ArrayList<>();

    public ChartsMap translateFeature(String id11, Double dx2, Double dy2) {
        this.id11 = id11;
        this.dx2 = dx2;
        this.dy2 = dy2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".translateFeature(%s, %f, %f)", id11, dx2, dy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".translateFeature(%s, %f, %f)", id11, dx2, dy2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTranslateFeature() {
        if (!setTranslateFeature.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setTranslateFeature) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private UnboundRegionsSettings getUnboundRegions;

    public UnboundRegionsSettings getUnboundRegions() {
        if (getUnboundRegions == null)
            getUnboundRegions = new UnboundRegionsSettings(jsBase + ".unboundRegions()");

        return getUnboundRegions;
    }
    private String unboundRegions;
    private MapUnboundRegionsMode unboundRegions1;
    private String unboundRegions2;
    private Boolean unboundRegions3;
    private List<ChartsMap> setUnboundRegions = new ArrayList<>();

    public ChartsMap setUnboundRegions(String unboundRegions) {
        this.unboundRegions = unboundRegions;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unboundRegions(%s)", unboundRegions));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unboundRegions(%s)", unboundRegions));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetUnboundRegions() {
        if (!setUnboundRegions.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setUnboundRegions) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setUnboundRegions1 = new ArrayList<>();

    public ChartsMap setUnboundRegions(MapUnboundRegionsMode unboundRegions1) {
        this.unboundRegions1 = unboundRegions1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unboundRegions(%s)", (unboundRegions1 != null) ? unboundRegions1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unboundRegions(%s)", (unboundRegions1 != null) ? unboundRegions1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetUnboundRegions1() {
        if (!setUnboundRegions1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setUnboundRegions1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMap> setUnboundRegions2 = new ArrayList<>();

    public ChartsMap setUnboundRegions(Boolean unboundRegions3) {
        this.unboundRegions3 = unboundRegions3;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unboundRegions(%b)", unboundRegions3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unboundRegions(%b)", unboundRegions3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetUnboundRegions2() {
        if (!setUnboundRegions2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setUnboundRegions2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double zoom;
    private Double cx;
    private Double cy;
    private Double duration1;
    private List<ChartsMap> setZoom = new ArrayList<>();

    public ChartsMap zoom(Double zoom, Double cx, Double cy, Double duration1) {
        this.zoom = zoom;
        this.cx = cx;
        this.cy = cy;
        this.duration1 = duration1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoom(%f, %f, %f, %f)", zoom, cx, cy, duration1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoom(%f, %f, %f, %f)", zoom, cx, cy, duration1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoom() {
        if (!setZoom.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setZoom) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double zoomTo;
    private Double cx1;
    private Double cy1;
    private List<ChartsMap> setZoomTo = new ArrayList<>();

    public ChartsMap zoomTo(Double zoomTo, Double cx1, Double cy1) {
        this.zoomTo = zoomTo;
        this.cx1 = cx1;
        this.cy1 = cy1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomTo(%f, %f, %f)", zoomTo, cx1, cy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomTo(%f, %f, %f)", zoomTo, cx1, cy1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomTo() {
        if (!setZoomTo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMap item : setZoomTo) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String id12;

    public void zoomToFeature(String id12) {
        this.id12 = id12;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".zoomToFeature(%s);", id12));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomToFeature(%s)", id12));
            js.setLength(0);
        }
    }

    private String generateJSgetAxes() {
        if (getAxes != null) {
            return getAxes.generateJs();
        }
        return "";
    }

    private String generateJSgetCallout() {
        if (getCallout != null) {
            return getCallout.generateJs();
        }
        return "";
    }

    private String generateJSgetCallout1() {
        if (!getCallout1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Callout item : getCallout1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetColorRange() {
        if (getColorRange != null) {
            return getColorRange.generateJs();
        }
        return "";
    }

    private String generateJSgetCrosshair() {
        if (getCrosshair != null) {
            return getCrosshair.generateJs();
        }
        return "";
    }

    private String generateJSgetCrsAnimation() {
        if (getCrsAnimation != null) {
            return getCrsAnimation.generateJs();
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
            for (MapSeriesBase item : getGetSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeries1() {
        if (!getGetSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBase item : getGetSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeriesAt() {
        if (!getGetSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (MapSeriesBase item : getGetSeriesAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGrids() {
        if (getGrids != null) {
            return getGrids.generateJs();
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

    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }

    private String generateJSgetUnboundRegions() {
        if (getUnboundRegions != null) {
            return getUnboundRegions.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetAxes());
        js.append(generateJSgetCallout());
        js.append(generateJSgetCallout1());
        js.append(generateJSgetColorRange());
        js.append(generateJSgetCrosshair());
        js.append(generateJSgetCrsAnimation());
        js.append(generateJSgetGetPlotBounds());
        js.append(generateJSgetGetSeries());
        js.append(generateJSgetGetSeries1());
        js.append(generateJSgetGetSeriesAt());
        js.append(generateJSgetGrids());
        js.append(generateJSgetHatchFillPalette());
        js.append(generateJSgetHovered());
        js.append(generateJSgetLabels());
        js.append(generateJSgetMarkerPalette());
        js.append(generateJSgetNormal());
        js.append(generateJSgetPalette());
        js.append(generateJSgetScale());
        js.append(generateJSgetSelected());
        js.append(generateJSgetUnboundRegions());
        js.append(generateJSsetAxes());
        js.append(generateJSsetAxes1());
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
        js.append(generateJSsetCallout());
        js.append(generateJSsetCallout1());
        js.append(generateJSsetCallout2());
        js.append(generateJSsetCallout3());
        js.append(generateJSsetChoropleth());
        js.append(generateJSsetChoropleth1());
        js.append(generateJSsetChoropleth2());
        js.append(generateJSsetChoropleth3());
        js.append(generateJSsetChoropleth4());
        js.append(generateJSsetChoropleth5());
        js.append(generateJSsetChoropleth6());
        js.append(generateJSsetChoropleth7());
        js.append(generateJSsetChoropleth8());
        js.append(generateJSsetChoropleth9());
        js.append(generateJSsetChoropleth10());
        js.append(generateJSsetChoropleth11());
        js.append(generateJSsetColorRange());
        js.append(generateJSsetConnector());
        js.append(generateJSsetConnector1());
        js.append(generateJSsetConnector2());
        js.append(generateJSsetConnector3());
        js.append(generateJSsetConnector4());
        js.append(generateJSsetConnector5());
        js.append(generateJSsetConnector6());
        js.append(generateJSsetConnector7());
        js.append(generateJSsetConnector8());
        js.append(generateJSsetConnector9());
        js.append(generateJSsetConnector10());
        js.append(generateJSsetConnector11());
        js.append(generateJSsetCrosshair());
        js.append(generateJSsetCrosshair1());
        js.append(generateJSsetCrsAnimation());
        js.append(generateJSsetCrsAnimation1());
        js.append(generateJSsetDefaultSeriesType());
        js.append(generateJSsetDefaultSeriesType1());
        js.append(generateJSsetDrillTo());
        js.append(generateJSsetFeatureCrs());
        js.append(generateJSsetFeatureScaleFactor());
        js.append(generateJSsetFeatureTranslation());
        js.append(generateJSsetGeoIdField());
        js.append(generateJSsetGrids());
        js.append(generateJSsetGrids1());
        js.append(generateJSsetHatchFillPalette());
        js.append(generateJSsetHatchFillPalette1());
        js.append(generateJSsetHatchFillPalette2());
        js.append(generateJSsetHovered());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
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
        js.append(generateJSsetMaxZoomLevel());
        js.append(generateJSsetMinBubbleSize());
        js.append(generateJSsetMinBubbleSize1());
        js.append(generateJSsetMove());
        js.append(generateJSsetNormal());
        js.append(generateJSsetOverlapMode());
        js.append(generateJSsetOverlapMode1());
        js.append(generateJSsetOverlapMode2());
        js.append(generateJSsetPalette());
        js.append(generateJSsetPalette1());
        js.append(generateJSsetPalette2());
        js.append(generateJSsetPalette3());
        js.append(generateJSsetRemoveSeries());
        js.append(generateJSsetRemoveSeries1());
        js.append(generateJSsetRemoveSeriesAt());
        js.append(generateJSsetScale());
        js.append(generateJSsetScale1());
        js.append(generateJSsetSelected());
        js.append(generateJSsetTranslateFeature());
        js.append(generateJSsetUnboundRegions());
        js.append(generateJSsetUnboundRegions1());
        js.append(generateJSsetUnboundRegions2());
        js.append(generateJSsetZoom());
        js.append(generateJSsetZoomTo());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}