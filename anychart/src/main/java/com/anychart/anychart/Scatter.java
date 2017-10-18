package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class Scatter extends SeparateChart {

    protected Scatter(String name) {
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


    private PlotController getAnnotations;

    public PlotController getAnnotations() {
        if (getAnnotations == null)
            getAnnotations = new PlotController(jsBase + ".annotations()");

        return getAnnotations;
    }
    private String[] annotationsList;
    private List<Scatter> setAnnotations = new ArrayList<>();

    public Scatter setAnnotations(String[] annotationsList) {
        this.annotationsList = annotationsList;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".annotations(%s)", Arrays.toString(annotationsList)));

//        js.append(String.format(Locale.US, ".annotations(%s)", Arrays.toString(annotationsList)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".annotations(%s)", Arrays.toString(annotationsList)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAnnotations() {
        if (!setAnnotations.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setAnnotations) {
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
    private List<ScatterSeriesBubble> setBubble = new ArrayList<>();

    public ScatterSeriesBubble bubble(View data, TextParsingMode csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bubble(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesBubble item = new ScatterSeriesBubble("setBubble" + variableIndex);
        setBubble.add(item);
        return item;
    }
    private String generateJSsetBubble() {
        if (!setBubble.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBubble item : setBubble) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBubble> setBubble1 = new ArrayList<>();

    public ScatterSeriesBubble bubble(View data, String csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble1" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data != null) ? data.generateJs() : "null", csvSettings1));

//        js.append(String.format(Locale.US, jsBase + ".bubble(%s, %s);", (data != null) ? data.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data != null) ? data.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        ScatterSeriesBubble item = new ScatterSeriesBubble("setBubble1" + variableIndex);
        setBubble1.add(item);
        return item;
    }
    private String generateJSsetBubble1() {
        if (!setBubble1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBubble item : setBubble1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBubble> setBubble2 = new ArrayList<>();

    public ScatterSeriesBubble bubble(View data, TextParsingSettings csvSettings2) {
        this.data = data;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble2" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bubble(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesBubble item = new ScatterSeriesBubble("setBubble2" + variableIndex);
        setBubble2.add(item);
        return item;
    }
    private String generateJSsetBubble2() {
        if (!setBubble2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBubble item : setBubble2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBubble> setBubble3 = new ArrayList<>();

    public ScatterSeriesBubble bubble(Set data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble3" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesBubble item = new ScatterSeriesBubble("setBubble3" + variableIndex);
        setBubble3.add(item);
        return item;
    }
    private String generateJSsetBubble3() {
        if (!setBubble3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBubble item : setBubble3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBubble> setBubble4 = new ArrayList<>();

    public ScatterSeriesBubble bubble(Set data1, String csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble4" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", csvSettings1));

//        js.append(String.format(Locale.US, jsBase + ".bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data1 != null) ? data1.generateJs() : "null", csvSettings1));
            js.setLength(0);
        }
        ScatterSeriesBubble item = new ScatterSeriesBubble("setBubble4" + variableIndex);
        setBubble4.add(item);
        return item;
    }
    private String generateJSsetBubble4() {
        if (!setBubble4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBubble item : setBubble4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBubble> setBubble5 = new ArrayList<>();

    public ScatterSeriesBubble bubble(Set data1, TextParsingSettings csvSettings2) {
        this.data1 = data1;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble5" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bubble(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesBubble item = new ScatterSeriesBubble("setBubble5" + variableIndex);
        setBubble5.add(item);
        return item;
    }
    private String generateJSsetBubble5() {
        if (!setBubble5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBubble item : setBubble5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBubble> setBubble6 = new ArrayList<>();

    public ScatterSeriesBubble bubble(String[] data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble6" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bubble(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesBubble item = new ScatterSeriesBubble("setBubble6" + variableIndex);
        setBubble6.add(item);
        return item;
    }
    private String generateJSsetBubble6() {
        if (!setBubble6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBubble item : setBubble6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBubble> setBubble7 = new ArrayList<>();

    public ScatterSeriesBubble bubble(String[] data2, String csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble7" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", Arrays.toString(data2), csvSettings1));

//        js.append(String.format(Locale.US, jsBase + ".bubble(%s, %s);", Arrays.toString(data2), csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", Arrays.toString(data2), csvSettings1));
            js.setLength(0);
        }
        ScatterSeriesBubble item = new ScatterSeriesBubble("setBubble7" + variableIndex);
        setBubble7.add(item);
        return item;
    }
    private String generateJSsetBubble7() {
        if (!setBubble7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBubble item : setBubble7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBubble> setBubble8 = new ArrayList<>();

    public ScatterSeriesBubble bubble(String[] data2, TextParsingSettings csvSettings2) {
        this.data2 = data2;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble8" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bubble(%s, %s);", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", Arrays.toString(data2), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesBubble item = new ScatterSeriesBubble("setBubble8" + variableIndex);
        setBubble8.add(item);
        return item;
    }
    private String generateJSsetBubble8() {
        if (!setBubble8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBubble item : setBubble8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBubble> setBubble9 = new ArrayList<>();

    public ScatterSeriesBubble bubble(String data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble9" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bubble(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesBubble item = new ScatterSeriesBubble("setBubble9" + variableIndex);
        setBubble9.add(item);
        return item;
    }
    private String generateJSsetBubble9() {
        if (!setBubble9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBubble item : setBubble9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBubble> setBubble10 = new ArrayList<>();

    public ScatterSeriesBubble bubble(String data3, String csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble10" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", data3, csvSettings1));

//        js.append(String.format(Locale.US, jsBase + ".bubble(%s, %s);", data3, csvSettings1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", data3, csvSettings1));
            js.setLength(0);
        }
        ScatterSeriesBubble item = new ScatterSeriesBubble("setBubble10" + variableIndex);
        setBubble10.add(item);
        return item;
    }
    private String generateJSsetBubble10() {
        if (!setBubble10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBubble item : setBubble10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBubble> setBubble11 = new ArrayList<>();

    public ScatterSeriesBubble bubble(String data3, TextParsingSettings csvSettings2) {
        this.data3 = data3;
        this.csvSettings2 = csvSettings2;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setBubble11" + ++variableIndex + " = " + jsBase + ".bubble(%s, %s);", data3, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".bubble(%s, %s);", data3, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s, %s)", data3, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesBubble item = new ScatterSeriesBubble("setBubble11" + variableIndex);
        setBubble11.add(item);
        return item;
    }
    private String generateJSsetBubble11() {
        if (!setBubble11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBubble item : setBubble11) {
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
    private List<Scatter> setCrosshair = new ArrayList<>();

    public Scatter setCrosshair(String crosshair) {
        this.crosshair = crosshair;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crosshair(%s)", crosshair));

//        js.append(String.format(Locale.US, ".crosshair(%s)", crosshair));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crosshair(%s)", crosshair));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCrosshair() {
        if (!setCrosshair.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setCrosshair) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setCrosshair1 = new ArrayList<>();

    public Scatter setCrosshair(Boolean crosshair1) {
        this.crosshair1 = crosshair1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crosshair(%b)", crosshair1));

//        js.append(String.format(Locale.US, ".crosshair(%b)", crosshair1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crosshair(%b)", crosshair1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCrosshair1() {
        if (!setCrosshair1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setCrosshair1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Crossing getCrossing;

    public Crossing getCrossing() {
        if (getCrossing == null)
            getCrossing = new Crossing(jsBase + ".crossing()");

        return getCrossing;
    }
    private String crossing;
    private List<Scatter> setCrossing = new ArrayList<>();

    public Scatter setCrossing(String crossing) {
        this.crossing = crossing;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crossing(%s)", crossing));

//        js.append(String.format(Locale.US, ".crossing(%s)", crossing));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crossing(%s)", crossing));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCrossing() {
        if (!setCrossing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setCrossing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String defaultSeriesType;
    private List<Scatter> setDefaultSeriesType = new ArrayList<>();

    public Scatter setDefaultSeriesType(String defaultSeriesType) {
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
            for (Scatter item : setDefaultSeriesType) {
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

    private List<ScatterSeriesBase> getGetSeries = new ArrayList<>();

    public ScatterSeriesBase getGetSeries(Double id) {
        ScatterSeriesBase item = new ScatterSeriesBase(jsBase + ".getSeries("+ id+")");
        getGetSeries.add(item);
        return item;
    }

    private List<ScatterSeriesBase> getGetSeries1 = new ArrayList<>();

    public ScatterSeriesBase getGetSeries(String id1) {
        ScatterSeriesBase item = new ScatterSeriesBase(jsBase + ".getSeries("+ id1+")");
        getGetSeries1.add(item);
        return item;
    }

    private List<ScatterSeriesBase> getGetSeriesAt = new ArrayList<>();

    public ScatterSeriesBase getGetSeriesAt(Double index) {
        ScatterSeriesBase item = new ScatterSeriesBase(jsBase + ".getSeriesAt("+ index+")");
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
    private List<Scatter> setHatchFillPalette = new ArrayList<>();

    public Scatter setHatchFillPalette(HatchFillType[] hatchFillPalette) {
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
            for (Scatter item : setHatchFillPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setHatchFillPalette1 = new ArrayList<>();

    public Scatter setHatchFillPalette(String hatchFillPalette1) {
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
            for (Scatter item : setHatchFillPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setHatchFillPalette2 = new ArrayList<>();

    public Scatter setHatchFillPalette(HatchFills hatchFillPalette2) {
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
            for (Scatter item : setHatchFillPalette2) {
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
    private List<Scatter> setHovered = new ArrayList<>();

    public Scatter setHovered(String hovered) {
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
            for (Scatter item : setHovered) {
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
    private List<Scatter> setLabels = new ArrayList<>();

    public Scatter setLabels(String labels) {
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
            for (Scatter item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setLabels1 = new ArrayList<>();

    public Scatter setLabels(Boolean labels1) {
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
            for (Scatter item : setLabels1) {
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
    private List<ScatterSeriesLine> setLine = new ArrayList<>();

    public ScatterSeriesLine line(View data4, TextParsingMode csvSettings3) {
        this.data4 = data4;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesLine item = new ScatterSeriesLine("setLine" + variableIndex);
        setLine.add(item);
        return item;
    }
    private String generateJSsetLine() {
        if (!setLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesLine item : setLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesLine> setLine1 = new ArrayList<>();

    public ScatterSeriesLine line(View data4, String csvSettings4) {
        this.data4 = data4;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine1" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data4 != null) ? data4.generateJs() : "null", csvSettings4));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data4 != null) ? data4.generateJs() : "null", csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data4 != null) ? data4.generateJs() : "null", csvSettings4));
            js.setLength(0);
        }
        ScatterSeriesLine item = new ScatterSeriesLine("setLine1" + variableIndex);
        setLine1.add(item);
        return item;
    }
    private String generateJSsetLine1() {
        if (!setLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesLine item : setLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesLine> setLine2 = new ArrayList<>();

    public ScatterSeriesLine line(View data4, TextParsingSettings csvSettings5) {
        this.data4 = data4;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine2" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data4 != null) ? data4.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesLine item = new ScatterSeriesLine("setLine2" + variableIndex);
        setLine2.add(item);
        return item;
    }
    private String generateJSsetLine2() {
        if (!setLine2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesLine item : setLine2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesLine> setLine3 = new ArrayList<>();

    public ScatterSeriesLine line(Set data5, TextParsingMode csvSettings3) {
        this.data5 = data5;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine3" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data5 != null) ? data5.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesLine item = new ScatterSeriesLine("setLine3" + variableIndex);
        setLine3.add(item);
        return item;
    }
    private String generateJSsetLine3() {
        if (!setLine3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesLine item : setLine3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesLine> setLine4 = new ArrayList<>();

    public ScatterSeriesLine line(Set data5, String csvSettings4) {
        this.data5 = data5;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine4" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data5 != null) ? data5.generateJs() : "null", csvSettings4));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data5 != null) ? data5.generateJs() : "null", csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data5 != null) ? data5.generateJs() : "null", csvSettings4));
            js.setLength(0);
        }
        ScatterSeriesLine item = new ScatterSeriesLine("setLine4" + variableIndex);
        setLine4.add(item);
        return item;
    }
    private String generateJSsetLine4() {
        if (!setLine4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesLine item : setLine4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesLine> setLine5 = new ArrayList<>();

    public ScatterSeriesLine line(Set data5, TextParsingSettings csvSettings5) {
        this.data5 = data5;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine5" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", (data5 != null) ? data5.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesLine item = new ScatterSeriesLine("setLine5" + variableIndex);
        setLine5.add(item);
        return item;
    }
    private String generateJSsetLine5() {
        if (!setLine5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesLine item : setLine5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesLine> setLine6 = new ArrayList<>();

    public ScatterSeriesLine line(String[] data6, TextParsingMode csvSettings3) {
        this.data6 = data6;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine6" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data6), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", Arrays.toString(data6), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data6), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesLine item = new ScatterSeriesLine("setLine6" + variableIndex);
        setLine6.add(item);
        return item;
    }
    private String generateJSsetLine6() {
        if (!setLine6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesLine item : setLine6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesLine> setLine7 = new ArrayList<>();

    public ScatterSeriesLine line(String[] data6, String csvSettings4) {
        this.data6 = data6;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine7" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data6), csvSettings4));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", Arrays.toString(data6), csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data6), csvSettings4));
            js.setLength(0);
        }
        ScatterSeriesLine item = new ScatterSeriesLine("setLine7" + variableIndex);
        setLine7.add(item);
        return item;
    }
    private String generateJSsetLine7() {
        if (!setLine7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesLine item : setLine7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesLine> setLine8 = new ArrayList<>();

    public ScatterSeriesLine line(String[] data6, TextParsingSettings csvSettings5) {
        this.data6 = data6;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine8" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", Arrays.toString(data6), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", Arrays.toString(data6), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", Arrays.toString(data6), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesLine item = new ScatterSeriesLine("setLine8" + variableIndex);
        setLine8.add(item);
        return item;
    }
    private String generateJSsetLine8() {
        if (!setLine8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesLine item : setLine8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesLine> setLine9 = new ArrayList<>();

    public ScatterSeriesLine line(String data7, TextParsingMode csvSettings3) {
        this.data7 = data7;
        this.csvSettings3 = csvSettings3;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine9" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data7, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", data7, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data7, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesLine item = new ScatterSeriesLine("setLine9" + variableIndex);
        setLine9.add(item);
        return item;
    }
    private String generateJSsetLine9() {
        if (!setLine9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesLine item : setLine9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesLine> setLine10 = new ArrayList<>();

    public ScatterSeriesLine line(String data7, String csvSettings4) {
        this.data7 = data7;
        this.csvSettings4 = csvSettings4;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine10" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data7, csvSettings4));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", data7, csvSettings4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data7, csvSettings4));
            js.setLength(0);
        }
        ScatterSeriesLine item = new ScatterSeriesLine("setLine10" + variableIndex);
        setLine10.add(item);
        return item;
    }
    private String generateJSsetLine10() {
        if (!setLine10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesLine item : setLine10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesLine> setLine11 = new ArrayList<>();

    public ScatterSeriesLine line(String data7, TextParsingSettings csvSettings5) {
        this.data7 = data7;
        this.csvSettings5 = csvSettings5;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLine11" + ++variableIndex + " = " + jsBase + ".line(%s, %s);", data7, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".line(%s, %s);", data7, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s, %s)", data7, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesLine item = new ScatterSeriesLine("setLine11" + variableIndex);
        setLine11.add(item);
        return item;
    }
    private String generateJSsetLine11() {
        if (!setLine11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesLine item : setLine11) {
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
    private List<Scatter> setLineMarker = new ArrayList<>();

    public Scatter setLineMarker(String lineMarker) {
        this.lineMarker = lineMarker;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%s)", lineMarker));

//        js.append(String.format(Locale.US, ".lineMarker(%s)", lineMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%s)", lineMarker));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLineMarker() {
        if (!setLineMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setLineMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setLineMarker1 = new ArrayList<>();

    public Scatter setLineMarker(Boolean lineMarker1) {
        this.lineMarker1 = lineMarker1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%b)", lineMarker1));

//        js.append(String.format(Locale.US, ".lineMarker(%b)", lineMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%b)", lineMarker1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLineMarker1() {
        if (!setLineMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setLineMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index2;
    private String lineMarker2;
    private Boolean lineMarker3;
    private List<Scatter> setLineMarker2 = new ArrayList<>();

    public Scatter setLineMarker(String lineMarker2, Double index2) {
        this.lineMarker2 = lineMarker2;
        this.index2 = index2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%s, %f)", lineMarker2, index2));

//        js.append(String.format(Locale.US, ".lineMarker(%s, %f)", lineMarker2, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%s, %f)", lineMarker2, index2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLineMarker2() {
        if (!setLineMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setLineMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setLineMarker3 = new ArrayList<>();

    public Scatter setLineMarker(Boolean lineMarker3, Double index2) {
        this.lineMarker3 = lineMarker3;
        this.index2 = index2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%b, %f)", lineMarker3, index2));

//        js.append(String.format(Locale.US, ".lineMarker(%b, %f)", lineMarker3, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%b, %f)", lineMarker3, index2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLineMarker3() {
        if (!setLineMarker3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setLineMarker3) {
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
    private List<ScatterSeriesMarker> setMarker = new ArrayList<>();

    public ScatterSeriesMarker marker(View data8, TextParsingMode csvSettings6) {
        this.data8 = data8;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data8 != null) ? data8.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesMarker item = new ScatterSeriesMarker("setMarker" + variableIndex);
        setMarker.add(item);
        return item;
    }
    private String generateJSsetMarker() {
        if (!setMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesMarker item : setMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesMarker> setMarker1 = new ArrayList<>();

    public ScatterSeriesMarker marker(View data8, String csvSettings7) {
        this.data8 = data8;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker1" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data8 != null) ? data8.generateJs() : "null", csvSettings7));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", (data8 != null) ? data8.generateJs() : "null", csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data8 != null) ? data8.generateJs() : "null", csvSettings7));
            js.setLength(0);
        }
        ScatterSeriesMarker item = new ScatterSeriesMarker("setMarker1" + variableIndex);
        setMarker1.add(item);
        return item;
    }
    private String generateJSsetMarker1() {
        if (!setMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesMarker item : setMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesMarker> setMarker2 = new ArrayList<>();

    public ScatterSeriesMarker marker(View data8, TextParsingSettings csvSettings8) {
        this.data8 = data8;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker2" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data8 != null) ? data8.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesMarker item = new ScatterSeriesMarker("setMarker2" + variableIndex);
        setMarker2.add(item);
        return item;
    }
    private String generateJSsetMarker2() {
        if (!setMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesMarker item : setMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesMarker> setMarker3 = new ArrayList<>();

    public ScatterSeriesMarker marker(Set data9, TextParsingMode csvSettings6) {
        this.data9 = data9;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker3" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data9 != null) ? data9.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesMarker item = new ScatterSeriesMarker("setMarker3" + variableIndex);
        setMarker3.add(item);
        return item;
    }
    private String generateJSsetMarker3() {
        if (!setMarker3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesMarker item : setMarker3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesMarker> setMarker4 = new ArrayList<>();

    public ScatterSeriesMarker marker(Set data9, String csvSettings7) {
        this.data9 = data9;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker4" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data9 != null) ? data9.generateJs() : "null", csvSettings7));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", (data9 != null) ? data9.generateJs() : "null", csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data9 != null) ? data9.generateJs() : "null", csvSettings7));
            js.setLength(0);
        }
        ScatterSeriesMarker item = new ScatterSeriesMarker("setMarker4" + variableIndex);
        setMarker4.add(item);
        return item;
    }
    private String generateJSsetMarker4() {
        if (!setMarker4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesMarker item : setMarker4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesMarker> setMarker5 = new ArrayList<>();

    public ScatterSeriesMarker marker(Set data9, TextParsingSettings csvSettings8) {
        this.data9 = data9;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker5" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", (data9 != null) ? data9.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesMarker item = new ScatterSeriesMarker("setMarker5" + variableIndex);
        setMarker5.add(item);
        return item;
    }
    private String generateJSsetMarker5() {
        if (!setMarker5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesMarker item : setMarker5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesMarker> setMarker6 = new ArrayList<>();

    public ScatterSeriesMarker marker(String[] data10, TextParsingMode csvSettings6) {
        this.data10 = data10;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker6" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data10), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", Arrays.toString(data10), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data10), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesMarker item = new ScatterSeriesMarker("setMarker6" + variableIndex);
        setMarker6.add(item);
        return item;
    }
    private String generateJSsetMarker6() {
        if (!setMarker6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesMarker item : setMarker6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesMarker> setMarker7 = new ArrayList<>();

    public ScatterSeriesMarker marker(String[] data10, String csvSettings7) {
        this.data10 = data10;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker7" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data10), csvSettings7));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", Arrays.toString(data10), csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data10), csvSettings7));
            js.setLength(0);
        }
        ScatterSeriesMarker item = new ScatterSeriesMarker("setMarker7" + variableIndex);
        setMarker7.add(item);
        return item;
    }
    private String generateJSsetMarker7() {
        if (!setMarker7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesMarker item : setMarker7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesMarker> setMarker8 = new ArrayList<>();

    public ScatterSeriesMarker marker(String[] data10, TextParsingSettings csvSettings8) {
        this.data10 = data10;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker8" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", Arrays.toString(data10), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", Arrays.toString(data10), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", Arrays.toString(data10), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesMarker item = new ScatterSeriesMarker("setMarker8" + variableIndex);
        setMarker8.add(item);
        return item;
    }
    private String generateJSsetMarker8() {
        if (!setMarker8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesMarker item : setMarker8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesMarker> setMarker9 = new ArrayList<>();

    public ScatterSeriesMarker marker(String data11, TextParsingMode csvSettings6) {
        this.data11 = data11;
        this.csvSettings6 = csvSettings6;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker9" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data11, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", data11, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data11, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesMarker item = new ScatterSeriesMarker("setMarker9" + variableIndex);
        setMarker9.add(item);
        return item;
    }
    private String generateJSsetMarker9() {
        if (!setMarker9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesMarker item : setMarker9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesMarker> setMarker10 = new ArrayList<>();

    public ScatterSeriesMarker marker(String data11, String csvSettings7) {
        this.data11 = data11;
        this.csvSettings7 = csvSettings7;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker10" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data11, csvSettings7));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", data11, csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data11, csvSettings7));
            js.setLength(0);
        }
        ScatterSeriesMarker item = new ScatterSeriesMarker("setMarker10" + variableIndex);
        setMarker10.add(item);
        return item;
    }
    private String generateJSsetMarker10() {
        if (!setMarker10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesMarker item : setMarker10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesMarker> setMarker11 = new ArrayList<>();

    public ScatterSeriesMarker marker(String data11, TextParsingSettings csvSettings8) {
        this.data11 = data11;
        this.csvSettings8 = csvSettings8;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setMarker11" + ++variableIndex + " = " + jsBase + ".marker(%s, %s);", data11, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".marker(%s, %s);", data11, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s, %s)", data11, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
        ScatterSeriesMarker item = new ScatterSeriesMarker("setMarker11" + variableIndex);
        setMarker11.add(item);
        return item;
    }
    private String generateJSsetMarker11() {
        if (!setMarker11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesMarker item : setMarker11) {
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
    private List<Scatter> setMarkerPalette = new ArrayList<>();

    public Scatter setMarkerPalette(Markers markerPalette) {
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
            for (Scatter item : setMarkerPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setMarkerPalette1 = new ArrayList<>();

    public Scatter setMarkerPalette(String markerPalette1) {
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
            for (Scatter item : setMarkerPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setMarkerPalette2 = new ArrayList<>();

    public Scatter setMarkerPalette(MarkerType[] markerPalette2) {
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
            for (Scatter item : setMarkerPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setMarkerPalette3 = new ArrayList<>();

    public Scatter setMarkerPalette(String[] markerPalette3) {
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
            for (Scatter item : setMarkerPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxBubbleSize;
    private String maxBubbleSize1;
    private List<Scatter> setMaxBubbleSize = new ArrayList<>();

    public Scatter setMaxBubbleSize(Double maxBubbleSize) {
        this.maxBubbleSize = maxBubbleSize;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxBubbleSize(%f)", maxBubbleSize));

//        js.append(String.format(Locale.US, ".maxBubbleSize(%f)", maxBubbleSize));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxBubbleSize(%f)", maxBubbleSize));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMaxBubbleSize() {
        if (!setMaxBubbleSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setMaxBubbleSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setMaxBubbleSize1 = new ArrayList<>();

    public Scatter setMaxBubbleSize(String maxBubbleSize1) {
        this.maxBubbleSize1 = maxBubbleSize1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxBubbleSize(%s)", maxBubbleSize1));

//        js.append(String.format(Locale.US, ".maxBubbleSize(%s)", maxBubbleSize1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxBubbleSize(%s)", maxBubbleSize1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMaxBubbleSize1() {
        if (!setMaxBubbleSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setMaxBubbleSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minBubbleSize;
    private String minBubbleSize1;
    private List<Scatter> setMinBubbleSize = new ArrayList<>();

    public Scatter setMinBubbleSize(Double minBubbleSize) {
        this.minBubbleSize = minBubbleSize;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minBubbleSize(%f)", minBubbleSize));

//        js.append(String.format(Locale.US, ".minBubbleSize(%f)", minBubbleSize));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minBubbleSize(%f)", minBubbleSize));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMinBubbleSize() {
        if (!setMinBubbleSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setMinBubbleSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setMinBubbleSize1 = new ArrayList<>();

    public Scatter setMinBubbleSize(String minBubbleSize1) {
        this.minBubbleSize1 = minBubbleSize1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minBubbleSize(%s)", minBubbleSize1));

//        js.append(String.format(Locale.US, ".minBubbleSize(%s)", minBubbleSize1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minBubbleSize(%s)", minBubbleSize1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMinBubbleSize1() {
        if (!setMinBubbleSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setMinBubbleSize1) {
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
    private List<Scatter> setNormal = new ArrayList<>();

    public Scatter setNormal(String normal) {
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
            for (Scatter item : setNormal) {
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
    private List<Scatter> setPalette = new ArrayList<>();

    public Scatter setPalette(RangeColors palette) {
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
            for (Scatter item : setPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setPalette1 = new ArrayList<>();

    public Scatter setPalette(DistinctColors palette1) {
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
            for (Scatter item : setPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setPalette2 = new ArrayList<>();

    public Scatter setPalette(String palette2) {
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
            for (Scatter item : setPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setPalette3 = new ArrayList<>();

    public Scatter setPalette(String[] palette3) {
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
            for (Scatter item : setPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private QuarterSettings getQuarters;

    public QuarterSettings getQuarters() {
        if (getQuarters == null)
            getQuarters = new QuarterSettings(jsBase + ".quarters()");

        return getQuarters;
    }
    private String quarters;
    private List<Scatter> setQuarters = new ArrayList<>();

    public Scatter setQuarters(String quarters) {
        this.quarters = quarters;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".quarters(%s)", quarters));

//        js.append(String.format(Locale.US, ".quarters(%s)", quarters));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".quarters(%s)", quarters));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetQuarters() {
        if (!setQuarters.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setQuarters) {
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
    private List<Scatter> setRangeMarker = new ArrayList<>();

    public Scatter setRangeMarker(String rangeMarker) {
        this.rangeMarker = rangeMarker;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%s)", rangeMarker));

//        js.append(String.format(Locale.US, ".rangeMarker(%s)", rangeMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%s)", rangeMarker));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangeMarker() {
        if (!setRangeMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setRangeMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setRangeMarker1 = new ArrayList<>();

    public Scatter setRangeMarker(Boolean rangeMarker1) {
        this.rangeMarker1 = rangeMarker1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%b)", rangeMarker1));

//        js.append(String.format(Locale.US, ".rangeMarker(%b)", rangeMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%b)", rangeMarker1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangeMarker1() {
        if (!setRangeMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setRangeMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index4;
    private String rangeMarker2;
    private Boolean rangeMarker3;
    private List<Scatter> setRangeMarker2 = new ArrayList<>();

    public Scatter setRangeMarker(String rangeMarker2, Double index4) {
        this.rangeMarker2 = rangeMarker2;
        this.index4 = index4;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%s, %f)", rangeMarker2, index4));

//        js.append(String.format(Locale.US, ".rangeMarker(%s, %f)", rangeMarker2, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%s, %f)", rangeMarker2, index4));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangeMarker2() {
        if (!setRangeMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setRangeMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setRangeMarker3 = new ArrayList<>();

    public Scatter setRangeMarker(Boolean rangeMarker3, Double index4) {
        this.rangeMarker3 = rangeMarker3;
        this.index4 = index4;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%b, %f)", rangeMarker3, index4));

//        js.append(String.format(Locale.US, ".rangeMarker(%b, %f)", rangeMarker3, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%b, %f)", rangeMarker3, index4));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangeMarker3() {
        if (!setRangeMarker3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setRangeMarker3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double id2;
    private String id3;
    private List<Scatter> setRemoveSeries = new ArrayList<>();

    public Scatter removeSeries(Double id2) {
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
            for (Scatter item : setRemoveSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setRemoveSeries1 = new ArrayList<>();

    public Scatter removeSeries(String id3) {
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
            for (Scatter item : setRemoveSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index5;
    private List<Scatter> setRemoveSeriesAt = new ArrayList<>();

    public Scatter removeSeriesAt(Double index5) {
        this.index5 = index5;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeriesAt(%f)", index5));

//        js.append(String.format(Locale.US, ".removeSeriesAt(%f)", index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeriesAt(%f)", index5));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRemoveSeriesAt() {
        if (!setRemoveSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setRemoveSeriesAt) {
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
    private List<Scatter> setSelected = new ArrayList<>();

    public Scatter setSelected(String selected) {
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
            for (Scatter item : setSelected) {
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
    private List<Scatter> setTextMarker = new ArrayList<>();

    public Scatter setTextMarker(String textMarker) {
        this.textMarker = textMarker;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%s)", textMarker));

//        js.append(String.format(Locale.US, ".textMarker(%s)", textMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%s)", textMarker));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTextMarker() {
        if (!setTextMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setTextMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setTextMarker1 = new ArrayList<>();

    public Scatter setTextMarker(Boolean textMarker1) {
        this.textMarker1 = textMarker1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%b)", textMarker1));

//        js.append(String.format(Locale.US, ".textMarker(%b)", textMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%b)", textMarker1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTextMarker1() {
        if (!setTextMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setTextMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index7;
    private String textMarker2;
    private Boolean textMarker3;
    private List<Scatter> setTextMarker2 = new ArrayList<>();

    public Scatter setTextMarker(String textMarker2, Double index7) {
        this.textMarker2 = textMarker2;
        this.index7 = index7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%s, %f)", textMarker2, index7));

//        js.append(String.format(Locale.US, ".textMarker(%s, %f)", textMarker2, index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%s, %f)", textMarker2, index7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTextMarker2() {
        if (!setTextMarker2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setTextMarker2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setTextMarker3 = new ArrayList<>();

    public Scatter setTextMarker(Boolean textMarker3, Double index7) {
        this.textMarker3 = textMarker3;
        this.index7 = index7;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%b, %f)", textMarker3, index7));

//        js.append(String.format(Locale.US, ".textMarker(%b, %f)", textMarker3, index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%b, %f)", textMarker3, index7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTextMarker3() {
        if (!setTextMarker3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setTextMarker3) {
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
    private List<Scatter> setXAxis = new ArrayList<>();

    public Scatter setXAxis(String xAxis) {
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
            for (Scatter item : setXAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setXAxis1 = new ArrayList<>();

    public Scatter setXAxis(Boolean xAxis1) {
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
            for (Scatter item : setXAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index9;
    private String xAxis2;
    private Boolean xAxis3;
    private List<Scatter> setXAxis2 = new ArrayList<>();

    public Scatter setXAxis(String xAxis2, Double index9) {
        this.xAxis2 = xAxis2;
        this.index9 = index9;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s, %f)", xAxis2, index9));

//        js.append(String.format(Locale.US, ".xAxis(%s, %f)", xAxis2, index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s, %f)", xAxis2, index9));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXAxis2() {
        if (!setXAxis2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setXAxis2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setXAxis3 = new ArrayList<>();

    public Scatter setXAxis(Boolean xAxis3, Double index9) {
        this.xAxis3 = xAxis3;
        this.index9 = index9;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%b, %f)", xAxis3, index9));

//        js.append(String.format(Locale.US, ".xAxis(%b, %f)", xAxis3, index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b, %f)", xAxis3, index9));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXAxis3() {
        if (!setXAxis3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setXAxis3) {
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
    private List<Scatter> setXGrid = new ArrayList<>();

    public Scatter setXGrid(String xGrid) {
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
            for (Scatter item : setXGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setXGrid1 = new ArrayList<>();

    public Scatter setXGrid(Boolean xGrid1) {
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
            for (Scatter item : setXGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index11;
    private String xGrid2;
    private Boolean xGrid3;
    private List<Scatter> setXGrid2 = new ArrayList<>();

    public Scatter setXGrid(String xGrid2, Double index11) {
        this.xGrid2 = xGrid2;
        this.index11 = index11;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s, %f)", xGrid2, index11));

//        js.append(String.format(Locale.US, ".xGrid(%s, %f)", xGrid2, index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s, %f)", xGrid2, index11));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXGrid2() {
        if (!setXGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setXGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setXGrid3 = new ArrayList<>();

    public Scatter setXGrid(Boolean xGrid3, Double index11) {
        this.xGrid3 = xGrid3;
        this.index11 = index11;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%b, %f)", xGrid3, index11));

//        js.append(String.format(Locale.US, ".xGrid(%b, %f)", xGrid3, index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b, %f)", xGrid3, index11));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXGrid3() {
        if (!setXGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setXGrid3) {
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
    private List<Scatter> setXMinorGrid = new ArrayList<>();

    public Scatter setXMinorGrid(String xMinorGrid) {
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
            for (Scatter item : setXMinorGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setXMinorGrid1 = new ArrayList<>();

    public Scatter setXMinorGrid(Boolean xMinorGrid1) {
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
            for (Scatter item : setXMinorGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index13;
    private String xMinorGrid2;
    private Boolean xMinorGrid3;
    private List<Scatter> setXMinorGrid2 = new ArrayList<>();

    public Scatter setXMinorGrid(String xMinorGrid2, Double index13) {
        this.xMinorGrid2 = xMinorGrid2;
        this.index13 = index13;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%s, %f)", xMinorGrid2, index13));

//        js.append(String.format(Locale.US, ".xMinorGrid(%s, %f)", xMinorGrid2, index13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s, %f)", xMinorGrid2, index13));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXMinorGrid2() {
        if (!setXMinorGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setXMinorGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setXMinorGrid3 = new ArrayList<>();

    public Scatter setXMinorGrid(Boolean xMinorGrid3, Double index13) {
        this.xMinorGrid3 = xMinorGrid3;
        this.index13 = index13;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%b, %f)", xMinorGrid3, index13));

//        js.append(String.format(Locale.US, ".xMinorGrid(%b, %f)", xMinorGrid3, index13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%b, %f)", xMinorGrid3, index13));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXMinorGrid3() {
        if (!setXMinorGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setXMinorGrid3) {
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
    private ScatterScaleTypes xScale1;
    private String xScale2;
    private ScatterBase xScale3;
    private List<Scatter> setXScale = new ArrayList<>();

    public Scatter setXScale(String xScale) {
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
            for (Scatter item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setXScale1 = new ArrayList<>();

    public Scatter setXScale(ScatterScaleTypes xScale1) {
        this.xScale1 = xScale1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", (xScale1 != null) ? xScale1.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".xScale(%s)", (xScale1 != null) ? xScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", (xScale1 != null) ? xScale1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale1() {
        if (!setXScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setXScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setXScale2 = new ArrayList<>();

    public Scatter setXScale(ScatterBase xScale3) {
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
            for (Scatter item : setXScale2) {
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
    private List<Scatter> setYAxis = new ArrayList<>();

    public Scatter setYAxis(String yAxis) {
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
            for (Scatter item : setYAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setYAxis1 = new ArrayList<>();

    public Scatter setYAxis(Boolean yAxis1) {
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
            for (Scatter item : setYAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index15;
    private String yAxis2;
    private Boolean yAxis3;
    private List<Scatter> setYAxis2 = new ArrayList<>();

    public Scatter setYAxis(String yAxis2, Double index15) {
        this.yAxis2 = yAxis2;
        this.index15 = index15;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s, %f)", yAxis2, index15));

//        js.append(String.format(Locale.US, ".yAxis(%s, %f)", yAxis2, index15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s, %f)", yAxis2, index15));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYAxis2() {
        if (!setYAxis2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setYAxis2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setYAxis3 = new ArrayList<>();

    public Scatter setYAxis(Boolean yAxis3, Double index15) {
        this.yAxis3 = yAxis3;
        this.index15 = index15;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%b, %f)", yAxis3, index15));

//        js.append(String.format(Locale.US, ".yAxis(%b, %f)", yAxis3, index15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%b, %f)", yAxis3, index15));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYAxis3() {
        if (!setYAxis3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setYAxis3) {
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
    private List<Scatter> setYGrid = new ArrayList<>();

    public Scatter setYGrid(String yGrid) {
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
            for (Scatter item : setYGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setYGrid1 = new ArrayList<>();

    public Scatter setYGrid(Boolean yGrid1) {
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
            for (Scatter item : setYGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index17;
    private String yGrid2;
    private Boolean yGrid3;
    private List<Scatter> setYGrid2 = new ArrayList<>();

    public Scatter setYGrid(String yGrid2, Double index17) {
        this.yGrid2 = yGrid2;
        this.index17 = index17;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s, %f)", yGrid2, index17));

//        js.append(String.format(Locale.US, ".yGrid(%s, %f)", yGrid2, index17));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s, %f)", yGrid2, index17));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYGrid2() {
        if (!setYGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setYGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setYGrid3 = new ArrayList<>();

    public Scatter setYGrid(Boolean yGrid3, Double index17) {
        this.yGrid3 = yGrid3;
        this.index17 = index17;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%b, %f)", yGrid3, index17));

//        js.append(String.format(Locale.US, ".yGrid(%b, %f)", yGrid3, index17));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b, %f)", yGrid3, index17));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYGrid3() {
        if (!setYGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setYGrid3) {
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
    private List<Scatter> setYMinorGrid = new ArrayList<>();

    public Scatter setYMinorGrid(String yMinorGrid) {
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
            for (Scatter item : setYMinorGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setYMinorGrid1 = new ArrayList<>();

    public Scatter setYMinorGrid(Boolean yMinorGrid1) {
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
            for (Scatter item : setYMinorGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index19;
    private String yMinorGrid2;
    private Boolean yMinorGrid3;
    private List<Scatter> setYMinorGrid2 = new ArrayList<>();

    public Scatter setYMinorGrid(String yMinorGrid2, Double index19) {
        this.yMinorGrid2 = yMinorGrid2;
        this.index19 = index19;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%s, %f)", yMinorGrid2, index19));

//        js.append(String.format(Locale.US, ".yMinorGrid(%s, %f)", yMinorGrid2, index19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s, %f)", yMinorGrid2, index19));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYMinorGrid2() {
        if (!setYMinorGrid2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setYMinorGrid2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setYMinorGrid3 = new ArrayList<>();

    public Scatter setYMinorGrid(Boolean yMinorGrid3, Double index19) {
        this.yMinorGrid3 = yMinorGrid3;
        this.index19 = index19;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%b, %f)", yMinorGrid3, index19));

//        js.append(String.format(Locale.US, ".yMinorGrid(%b, %f)", yMinorGrid3, index19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%b, %f)", yMinorGrid3, index19));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYMinorGrid3() {
        if (!setYMinorGrid3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setYMinorGrid3) {
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
    private ScatterScaleTypes yScale1;
    private String yScale2;
    private ScatterBase yScale3;
    private List<Scatter> setYScale = new ArrayList<>();

    public Scatter setYScale(String yScale) {
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
            for (Scatter item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setYScale1 = new ArrayList<>();

    public Scatter setYScale(ScatterScaleTypes yScale1) {
        this.yScale1 = yScale1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", (yScale1 != null) ? yScale1.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".yScale(%s)", (yScale1 != null) ? yScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", (yScale1 != null) ? yScale1.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScale1() {
        if (!setYScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Scatter item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setYScale2 = new ArrayList<>();

    public Scatter setYScale(ScatterBase yScale3) {
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
            for (Scatter item : setYScale2) {
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

    private String generateJSgetCrossing() {
        if (getCrossing != null) {
            return getCrossing.generateJs();
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
            for (ScatterSeriesBase item : getGetSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeries1() {
        if (!getGetSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBase item : getGetSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeriesAt() {
        if (!getGetSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScatterSeriesBase item : getGetSeriesAt) {
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

    private String generateJSgetQuarters() {
        if (getQuarters != null) {
            return getQuarters.generateJs();
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
        js.append(generateJSgetCrossing());
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
        js.append(generateJSgetQuarters());
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
        js.append(generateJSgetYAxis());
        js.append(generateJSgetYAxis1());
        js.append(generateJSgetYGrid());
        js.append(generateJSgetYGrid1());
        js.append(generateJSgetYMinorGrid());
        js.append(generateJSgetYMinorGrid1());
        js.append(generateJSgetYScale());
        js.append(generateJSsetAnnotations());
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
        js.append(generateJSsetCrosshair());
        js.append(generateJSsetCrosshair1());
        js.append(generateJSsetCrossing());
        js.append(generateJSsetDefaultSeriesType());
        js.append(generateJSsetHatchFillPalette());
        js.append(generateJSsetHatchFillPalette1());
        js.append(generateJSsetHatchFillPalette2());
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
        js.append(generateJSsetMinBubbleSize());
        js.append(generateJSsetMinBubbleSize1());
        js.append(generateJSsetNormal());
        js.append(generateJSsetPalette());
        js.append(generateJSsetPalette1());
        js.append(generateJSsetPalette2());
        js.append(generateJSsetPalette3());
        js.append(generateJSsetQuarters());
        js.append(generateJSsetRangeMarker());
        js.append(generateJSsetRangeMarker1());
        js.append(generateJSsetRangeMarker2());
        js.append(generateJSsetRangeMarker3());
        js.append(generateJSsetRemoveSeries());
        js.append(generateJSsetRemoveSeries1());
        js.append(generateJSsetRemoveSeriesAt());
        js.append(generateJSsetSelected());
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

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}