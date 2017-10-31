package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * Mekko chart class.<br/>
To get the chart use any of these methods:
 <ul>
     <li>{@link anychart#mosaic}</li>
     <li>{@link anychart#mekko}</li>
     <li>{@link anychart#barmekko}</li>
 </ul>
 */
public class ChartsMekko extends SeparateChart {

    protected ChartsMekko(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    public ChartsMekko setData(SingleValueDataSet data) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            js.append(data.generateJs());

            js.append("]);");
        }

        return this;
    }

    public ChartsMekko setData(List<DataEntry> data) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            for (DataEntry dataEntry : data) {
                js.append(dataEntry.generateJs()).append(",");
            }
            js.setLength(js.length() - 1);

            js.append("]);");
        }

        return this;
    }

    public ChartsMekko setData(List<DataEntry> data, TreeFillingMethod mode) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            for (DataEntry dataEntry : data) {
                js.append(dataEntry.generateJs()).append(",");
            }
            js.setLength(js.length() - 1);

            js.append("], ").append((mode != null) ? mode.generateJs() : "null").append(");");
        }

        return this;
    }

    

    /**
     * Adds series to the chart.
     */
    public void addSeries(List<DataEntry> data) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (!data.isEmpty()) {
            StringBuilder resultData = new StringBuilder();
            resultData.append("[");
            for (DataEntry dataEntry : data) {
                resultData.append(dataEntry.generateJs()).append(",");
            }
            resultData.setLength(resultData.length() - 1);
            resultData.append("]");

            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".addSeries(%s);", resultData.toString()));
        }
    }


    private PlotController getAnnotations;

    /**
     * Getter for the annotations.
     */
    public PlotController getAnnotations() {
        if (getAnnotations == null)
            getAnnotations = new PlotController(jsBase + ".annotations()");

        return getAnnotations;
    }
    private String[] annotationsList;
    private List<ChartsMekko> setAnnotations = new ArrayList<>();

    /**
     * Setter for the annotations.
     */
    public ChartsMekko setAnnotations(String[] annotationsList) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".annotations(%s)", arrayToStringWrapQuotes(annotationsList)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".annotations(%s)", arrayToStringWrapQuotes(annotationsList)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAnnotations() {
        if (!setAnnotations.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setAnnotations) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Crosshair getCrosshair;

    /**
     * Getter for crosshair settings.
     */
    public Crosshair getCrosshair() {
        if (getCrosshair == null)
            getCrosshair = new Crosshair(jsBase + ".crosshair()");

        return getCrosshair;
    }
    private String crosshair;
    private Boolean crosshair1;
    private List<ChartsMekko> setCrosshair = new ArrayList<>();

    /**
     * Setter for crosshair settings.
     */
    public ChartsMekko setCrosshair(String crosshair) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crosshair(%s)", wrapQuotes(crosshair)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crosshair(%s)", wrapQuotes(crosshair)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCrosshair() {
        if (!setCrosshair.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setCrosshair) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setCrosshair1 = new ArrayList<>();

    /**
     * Setter for crosshair settings.
     */
    public ChartsMekko setCrosshair(Boolean crosshair1) {
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
            for (ChartsMekko item : setCrosshair1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private View getData;

    /**
     * Getter for the data.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }
    private List<ChartsMekko> setData = new ArrayList<>();

    /**
     * Setter for the data.
     */
    public ChartsMekko data(List<DataEntry> data) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (!data.isEmpty()) {
            StringBuilder resultData = new StringBuilder();
            resultData.append("[");
            for (DataEntry dataEntry : data) {
                resultData.append(dataEntry.generateJs()).append(",");
            }
            resultData.setLength(resultData.length() - 1);
            resultData.append("]");

            js.append(String.format(Locale.US, "var setData" + ++variableIndex + " = " + jsBase + ".data(%s);", resultData.toString()));
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private AnychartMathRect getGetPlotBounds;

    /**
     * Gets data bounds of the chart.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Mekko#draw} is called.
     */
    public AnychartMathRect getGetPlotBounds() {
        if (getGetPlotBounds == null)
            getGetPlotBounds = new AnychartMathRect(jsBase + ".getPlotBounds()");

        return getGetPlotBounds;
    }

    private List<SeriesMekko> getGetSeries = new ArrayList<>();

    /**
     * Gets series by its id.
     */
    public SeriesMekko getGetSeries(Double id) {
        SeriesMekko item = new SeriesMekko(jsBase + ".getSeries("+ id+")");
        getGetSeries.add(item);
        return item;
    }

    private List<SeriesMekko> getGetSeries1 = new ArrayList<>();

    /**
     * Gets series by its id.
     */
    public SeriesMekko getGetSeries(String id1) {
        SeriesMekko item = new SeriesMekko(jsBase + ".getSeries("+ wrapQuotes(id1)+")");
        getGetSeries1.add(item);
        return item;
    }

    private List<SeriesMekko> getGetSeriesAt = new ArrayList<>();

    /**
     * Getter for the series by its index.
     */
    public SeriesMekko getGetSeriesAt(Double index) {
        SeriesMekko item = new SeriesMekko(jsBase + ".getSeriesAt("+ index+")");
        getGetSeriesAt.add(item);
        return item;
    }

    private HatchFills getHatchFillPalette;

    /**
     * Getter for hatch fill palette settings.
     */
    public HatchFills getHatchFillPalette() {
        if (getHatchFillPalette == null)
            getHatchFillPalette = new HatchFills(jsBase + ".hatchFillPalette()");

        return getHatchFillPalette;
    }
    private HatchFillType[] hatchFillPalette;
    private String hatchFillPalette1;
    private HatchFills hatchFillPalette2;
    private List<ChartsMekko> setHatchFillPalette = new ArrayList<>();

    /**
     * Setter for hatch fill palette settings.
     */
    public ChartsMekko setHatchFillPalette(HatchFillType[] hatchFillPalette) {
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
            for (ChartsMekko item : setHatchFillPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setHatchFillPalette1 = new ArrayList<>();

    /**
     * Setter for hatch fill palette settings.
     */
    public ChartsMekko setHatchFillPalette(String hatchFillPalette1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hatchFillPalette(%s)", wrapQuotes(hatchFillPalette1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", wrapQuotes(hatchFillPalette1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHatchFillPalette1() {
        if (!setHatchFillPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setHatchFillPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setHatchFillPalette2 = new ArrayList<>();

    /**
     * Setter for hatch fill palette settings.
     */
    public ChartsMekko setHatchFillPalette(HatchFills hatchFillPalette2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(hatchFillPalette2.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".hatchFillPalette(%s);",  ((hatchFillPalette2 != null) ? hatchFillPalette2.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetHatchFillPalette2() {
        if (!setHatchFillPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setHatchFillPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private UiLabelsFactory getLabels;

    /**
     * Getter for chart data labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }
    private String labels;
    private Boolean labels1;
    private List<Cartesian> setLabels = new ArrayList<>();

    /**
     * Setter for chart data labels.
     */
    public Cartesian setLabels(String labels) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLabels" + ++variableIndex + " = " + jsBase + ".labels(%s);", wrapQuotes(labels)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%s)", wrapQuotes(labels)));
            js.setLength(0);
        }
        Cartesian item = new Cartesian("setLabels" + variableIndex);
        setLabels.add(item);
        return item;
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

    /**
     * Setter for chart data labels.
     */
    public Cartesian setLabels(Boolean labels1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setLabels1" + ++variableIndex + " = " + jsBase + ".labels(%b);", labels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%b)", labels1));
            js.setLength(0);
        }
        Cartesian item = new Cartesian("setLabels1" + variableIndex);
        setLabels1.add(item);
        return item;
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

    private List<SeriesMekko> setMekko = new ArrayList<>();

    /**
     * Adds Mekko series.
     */
    public SeriesMekko mekko(List<DataEntry> data) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (!data.isEmpty()) {
            StringBuilder resultData = new StringBuilder();
            resultData.append("[");
            for (DataEntry dataEntry : data) {
                resultData.append(dataEntry.generateJs()).append(",");
            }
            resultData.setLength(resultData.length() - 1);
            resultData.append("]");

            js.append(String.format(Locale.US, "var setMekko" + ++variableIndex + " = " + jsBase + ".mekko(%s);", resultData.toString()));
        }
        SeriesMekko item = new SeriesMekko("setMekko" + variableIndex);
        setMekko.add(item);
        return item;
    }
    private String generateJSsetMekko() {
        if (!setMekko.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesMekko item : setMekko) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private RangeColors getPalette;

    /**
     * Getter for the series colors palette.
     */
    public RangeColors getPalette() {
        if (getPalette == null)
            getPalette = new RangeColors(jsBase + ".palette()");

        return getPalette;
    }
    private RangeColors palette;
    private DistinctColors palette1;
    private String palette2;
    private String[] palette3;
    private List<ChartsMekko> setPalette = new ArrayList<>();

    /**
     * Setter for the series colors palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public ChartsMekko setPalette(RangeColors palette) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(palette.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".palette(%s);",  ((palette != null) ? palette.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetPalette() {
        if (!setPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setPalette1 = new ArrayList<>();

    /**
     * Setter for the series colors palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public ChartsMekko setPalette(DistinctColors palette1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(palette1.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".palette(%s);",  ((palette1 != null) ? palette1.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetPalette1() {
        if (!setPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setPalette2 = new ArrayList<>();

    /**
     * Setter for the series colors palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public ChartsMekko setPalette(String palette2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", wrapQuotes(palette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", wrapQuotes(palette2)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette2() {
        if (!setPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setPalette3 = new ArrayList<>();

    /**
     * Setter for the series colors palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public ChartsMekko setPalette(String[] palette3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(palette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(palette3)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPalette3() {
        if (!setPalette3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double pointsPadding;
    private List<ChartsMekko> setPointsPadding = new ArrayList<>();

    /**
     * Setter for points padding.
     */
    public ChartsMekko setPointsPadding(Double pointsPadding) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointsPadding(%f)", pointsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointsPadding(%f)", pointsPadding));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPointsPadding() {
        if (!setPointsPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setPointsPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double id2;
    private String id3;
    private List<ChartsMekko> setRemoveSeries = new ArrayList<>();

    /**
     * Removes one of series from chart by its id.
     */
    public ChartsMekko removeSeries(Double id2) {
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
            for (ChartsMekko item : setRemoveSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setRemoveSeries1 = new ArrayList<>();

    /**
     * Removes one of series from chart by its id.
     */
    public ChartsMekko removeSeries(String id3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeries(%s)", wrapQuotes(id3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%s)", wrapQuotes(id3)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRemoveSeries1() {
        if (!setRemoveSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setRemoveSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private List<ChartsMekko> setRemoveSeriesAt = new ArrayList<>();

    /**
     * Removes one of series from chart by its index.
     */
    public ChartsMekko removeSeriesAt(Double index1) {
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
            for (ChartsMekko item : setRemoveSeriesAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxesLinear getXAxis;

    /**
     * Getter for chart X-axis.
     */
    public CoreAxesLinear getXAxis() {
        if (getXAxis == null)
            getXAxis = new CoreAxesLinear(jsBase + ".xAxis()");

        return getXAxis;
    }

    private List<CoreAxesLinear> getXAxis1 = new ArrayList<>();

    /**
     * Getter for chart X-axis.
     */
    public CoreAxesLinear getXAxis(Double index2) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".xAxis("+ index2+")");
        getXAxis1.add(item);
        return item;
    }
    private String xAxis;
    private Boolean xAxis1;
    private List<ChartsMekko> setXAxis = new ArrayList<>();

    /**
     * Setter for chart X-axis.
     */
    public ChartsMekko setXAxis(String xAxis) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s)", wrapQuotes(xAxis)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s)", wrapQuotes(xAxis)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXAxis() {
        if (!setXAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setXAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setXAxis1 = new ArrayList<>();

    /**
     * Setter for chart X-axis.
     */
    public ChartsMekko setXAxis(Boolean xAxis1) {
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
            for (ChartsMekko item : setXAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index3;
    private String xAxis2;
    private Boolean xAxis3;
    private List<ChartsMekko> setXAxis2 = new ArrayList<>();

    /**
     * Setter for chart X-axis by index.
     */
    public ChartsMekko setXAxis(String xAxis2, Double index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s, %f)", wrapQuotes(xAxis2), index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s, %f)", wrapQuotes(xAxis2), index3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXAxis2() {
        if (!setXAxis2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setXAxis2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setXAxis3 = new ArrayList<>();

    /**
     * Setter for chart X-axis by index.
     */
    public ChartsMekko setXAxis(Boolean xAxis3, Double index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%b, %f)", xAxis3, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b, %f)", xAxis3, index3));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXAxis3() {
        if (!setXAxis3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setXAxis3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Ordinal getXScale;

    /**
     * Getter for default chart X scale.
     */
    public Ordinal getXScale() {
        if (getXScale == null)
            getXScale = new Ordinal(jsBase + ".xScale()");

        return getXScale;
    }
    private String xScale;
    private ScaleTypes xScale1;
    private String xScale2;
    private Ordinal xScale3;
    private List<ChartsMekko> setXScale = new ArrayList<>();

    /**
     * Setter for default chart X scale.
     */
    public ChartsMekko setXScale(String xScale) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", wrapQuotes(xScale)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", wrapQuotes(xScale)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale() {
        if (!setXScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setXScale1 = new ArrayList<>();

    /**
     * Setter for default chart X scale.
     */
    public ChartsMekko setXScale(ScaleTypes xScale1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", ((xScale1 != null) ? xScale1.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", ((xScale1 != null) ? xScale1.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale1() {
        if (!setXScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setXScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setXScale2 = new ArrayList<>();

    /**
     * Setter for default chart X scale.
     */
    public ChartsMekko setXScale(Ordinal xScale3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(xScale3.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".xScale(%s);",  ((xScale3 != null) ? xScale3.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetXScale2() {
        if (!setXScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setXScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxesLinear getYAxis;

    /**
     * Getter for chart Y-axis.
     */
    public CoreAxesLinear getYAxis() {
        if (getYAxis == null)
            getYAxis = new CoreAxesLinear(jsBase + ".yAxis()");

        return getYAxis;
    }

    private List<CoreAxesLinear> getYAxis1 = new ArrayList<>();

    /**
     * Getter for chart Y-axis.
     */
    public CoreAxesLinear getYAxis(Double index4) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".yAxis("+ index4+")");
        getYAxis1.add(item);
        return item;
    }
    private String yAxis;
    private Boolean yAxis1;
    private List<ChartsMekko> setYAxis = new ArrayList<>();

    /**
     * Setter for chart Y-axis.
     */
    public ChartsMekko setYAxis(String yAxis) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s)", wrapQuotes(yAxis)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s)", wrapQuotes(yAxis)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYAxis() {
        if (!setYAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setYAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setYAxis1 = new ArrayList<>();

    /**
     * Setter for chart Y-axis.
     */
    public ChartsMekko setYAxis(Boolean yAxis1) {
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
            for (ChartsMekko item : setYAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index5;
    private String yAxis2;
    private Boolean yAxis3;
    private List<ChartsMekko> setYAxis2 = new ArrayList<>();

    /**
     * Setter for chart Y-axis by index.
     */
    public ChartsMekko setYAxis(String yAxis2, Double index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s, %f)", wrapQuotes(yAxis2), index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s, %f)", wrapQuotes(yAxis2), index5));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYAxis2() {
        if (!setYAxis2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setYAxis2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setYAxis3 = new ArrayList<>();

    /**
     * Setter for chart Y-axis by index.
     */
    public ChartsMekko setYAxis(Boolean yAxis3, Double index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%b, %f)", yAxis3, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%b, %f)", yAxis3, index5));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYAxis3() {
        if (!setYAxis3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setYAxis3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private ScalesBase getYScale;

    /**
     * Getter for default chart Y scale.
     */
    public ScalesBase getYScale() {
        if (getYScale == null)
            getYScale = new ScalesBase(jsBase + ".yScale()");

        return getYScale;
    }
    private String yScale;
    private ScaleTypes yScale1;
    private String yScale2;
    private ScalesBase yScale3;
    private List<ChartsMekko> setYScale = new ArrayList<>();

    /**
     * Setter for default chart Y scale.
     */
    public ChartsMekko setYScale(String yScale) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScale() {
        if (!setYScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setYScale1 = new ArrayList<>();

    /**
     * Setter for default chart Y scale.
     */
    public ChartsMekko setYScale(ScaleTypes yScale1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", ((yScale1 != null) ? yScale1.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale1 != null) ? yScale1.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetYScale1() {
        if (!setYScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsMekko> setYScale2 = new ArrayList<>();

    /**
     * Setter for default chart Y scale.
     */
    public ChartsMekko setYScale(ScalesBase yScale3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(yScale3.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale3 != null) ? yScale3.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetYScale2() {
        if (!setYScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsMekko item : setYScale2) {
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
            for (SeriesMekko item : getGetSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeries1() {
        if (!getGetSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesMekko item : getGetSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeriesAt() {
        if (!getGetSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesMekko item : getGetSeriesAt) {
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

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetPalette() {
        if (getPalette != null) {
            return getPalette.generateJs();
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
        js.append(generateJSgetLabels());
        js.append(generateJSgetPalette());
        js.append(generateJSgetXAxis());
        js.append(generateJSgetXAxis1());
        js.append(generateJSgetXScale());
        js.append(generateJSgetYAxis());
        js.append(generateJSgetYAxis1());
        js.append(generateJSgetYScale());
        js.append(generateJSsetAnnotations());
        js.append(generateJSsetCrosshair());
        js.append(generateJSsetCrosshair1());
        js.append(generateJSsetData());
        js.append(generateJSsetHatchFillPalette());
        js.append(generateJSsetHatchFillPalette1());
        js.append(generateJSsetHatchFillPalette2());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetMekko());
        js.append(generateJSsetPalette());
        js.append(generateJSsetPalette1());
        js.append(generateJSsetPalette2());
        js.append(generateJSsetPalette3());
        js.append(generateJSsetPointsPadding());
        js.append(generateJSsetRemoveSeries());
        js.append(generateJSsetRemoveSeries1());
        js.append(generateJSsetRemoveSeriesAt());
        js.append(generateJSsetXAxis());
        js.append(generateJSsetXAxis1());
        js.append(generateJSsetXAxis2());
        js.append(generateJSsetXAxis3());
        js.append(generateJSsetXScale());
        js.append(generateJSsetXScale1());
        js.append(generateJSsetXScale2());
        js.append(generateJSsetYAxis());
        js.append(generateJSsetYAxis1());
        js.append(generateJSsetYAxis2());
        js.append(generateJSsetYAxis3());
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