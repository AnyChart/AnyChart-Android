package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * Scatter chart class.
 */
public class Scatter extends SeparateChart {

    protected Scatter(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    public Scatter setData(SingleValueDataSet data) {
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

    public Scatter setData(List<DataEntry> data) {
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

    public Scatter setData(List<DataEntry> data, TreeFillingMethod mode) {
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
     * Adds series to chart.
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
    private List<Scatter> setAnnotations = new ArrayList<>();

    /**
     * Setter for the annotations.
     */
    public Scatter setAnnotations(String[] annotationsList) {
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
            for (Scatter item : setAnnotations) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesBubble> setBubble = new ArrayList<>();

    /**
     * Adds Bubble series.
     */
    public ScatterSeriesBubble bubble(List<DataEntry> data) {
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

            js.append(String.format(Locale.US, "var setBubble" + ++variableIndex + " = " + jsBase + ".bubble(%s);", resultData.toString()));
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
    private List<Scatter> setCrosshair = new ArrayList<>();

    /**
     * Setter for crosshair settings.
     */
    public Scatter setCrosshair(String crosshair) {
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
            for (Scatter item : setCrosshair) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setCrosshair1 = new ArrayList<>();

    /**
     * Setter for crosshair settings.
     */
    public Scatter setCrosshair(Boolean crosshair1) {
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
            for (Scatter item : setCrosshair1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Crossing getCrossing;

    /**
     * Getter for crossing settings.
     */
    public Crossing getCrossing() {
        if (getCrossing == null)
            getCrossing = new Crossing(jsBase + ".crossing()");

        return getCrossing;
    }
    private String crossing;
    private List<Scatter> setCrossing = new ArrayList<>();

    /**
     * Setter for crossing settings.
     */
    public Scatter setCrossing(String crossing) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crossing(%s)", wrapQuotes(crossing)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crossing(%s)", wrapQuotes(crossing)));
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

    /**
     * Setter for the scatter default series type.
     */
    public Scatter setDefaultSeriesType(String defaultSeriesType) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultSeriesType(%s)", wrapQuotes(defaultSeriesType)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", wrapQuotes(defaultSeriesType)));
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

    /**
     * Gets data bounds of the chart.
<b>Note:</b> Works only after {@link anychart.charts.Scatter#draw} is called.
     */
    public AnychartMathRect getGetPlotBounds() {
        if (getGetPlotBounds == null)
            getGetPlotBounds = new AnychartMathRect(jsBase + ".getPlotBounds()");

        return getGetPlotBounds;
    }

    private List<ScatterSeriesBase> getGetSeries = new ArrayList<>();

    /**
     * Gets series by its id.
     */
    public ScatterSeriesBase getGetSeries(Double id) {
        ScatterSeriesBase item = new ScatterSeriesBase(jsBase + ".getSeries("+ id+")");
        getGetSeries.add(item);
        return item;
    }

    private List<ScatterSeriesBase> getGetSeries1 = new ArrayList<>();

    /**
     * Gets series by its id.
     */
    public ScatterSeriesBase getGetSeries(String id1) {
        ScatterSeriesBase item = new ScatterSeriesBase(jsBase + ".getSeries("+ wrapQuotes(id1)+")");
        getGetSeries1.add(item);
        return item;
    }

    private List<ScatterSeriesBase> getGetSeriesAt = new ArrayList<>();

    /**
     * Gets series by its index.
     */
    public ScatterSeriesBase getGetSeriesAt(Double index) {
        ScatterSeriesBase item = new ScatterSeriesBase(jsBase + ".getSeriesAt("+ index+")");
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
    private List<Scatter> setHatchFillPalette = new ArrayList<>();

    /**
     * Setter for hatch fill palette settings.
     */
    public Scatter setHatchFillPalette(HatchFillType[] hatchFillPalette) {
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
            for (Scatter item : setHatchFillPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setHatchFillPalette1 = new ArrayList<>();

    /**
     * Setter for hatch fill palette settings.
     */
    public Scatter setHatchFillPalette(String hatchFillPalette1) {
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
            for (Scatter item : setHatchFillPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setHatchFillPalette2 = new ArrayList<>();

    /**
     * Setter for hatch fill palette settings.
     */
    public Scatter setHatchFillPalette(HatchFills hatchFillPalette2) {
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
            for (Scatter item : setHatchFillPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private StateSettings getHovered;

    /**
     * Getter for hovered state settings.
     */
    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }
    private String hovered;
    private List<Scatter> setHovered = new ArrayList<>();

    /**
     * Setter for hovered state settings.
     */
    public Scatter setHovered(String hovered) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));
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

    /**
     * Getter for series data labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }
    private String labels;
    private Boolean labels1;
    private List<Scatter> setLabels = new ArrayList<>();

    /**
     * Setter for series data labels.
     */
    public Scatter setLabels(String labels) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));
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

    /**
     * Setter for series data labels.
     */
    public Scatter setLabels(Boolean labels1) {
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
            for (Scatter item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesLine> setLine = new ArrayList<>();

    /**
     * Adds Line series.
     */
    public ScatterSeriesLine line(List<DataEntry> data) {
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

            js.append(String.format(Locale.US, "var setLine" + ++variableIndex + " = " + jsBase + ".line(%s);", resultData.toString()));
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


    private CoreAxismarkersLine getLineMarker;

    /**
     * Getter for the chart line marker.
     */
    public CoreAxismarkersLine getLineMarker() {
        if (getLineMarker == null)
            getLineMarker = new CoreAxismarkersLine(jsBase + ".lineMarker()");

        return getLineMarker;
    }

    private List<CoreAxismarkersLine> getLineMarker1 = new ArrayList<>();

    /**
     * Getter for the chart line marker.
     */
    public CoreAxismarkersLine getLineMarker(Double index1) {
        CoreAxismarkersLine item = new CoreAxismarkersLine(jsBase + ".lineMarker("+ index1+")");
        getLineMarker1.add(item);
        return item;
    }
    private String lineMarker;
    private Boolean lineMarker1;
    private List<Scatter> setLineMarker = new ArrayList<>();

    /**
     * Setter for the chart line marker.
     */
    public Scatter setLineMarker(String lineMarker) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%s)", wrapQuotes(lineMarker)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%s)", wrapQuotes(lineMarker)));
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

    /**
     * Setter for the chart line marker.
     */
    public Scatter setLineMarker(Boolean lineMarker1) {
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

    /**
     * Setter for the chart line marker by index.
     */
    public Scatter setLineMarker(String lineMarker2, Double index2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%s, %f)", wrapQuotes(lineMarker2), index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%s, %f)", wrapQuotes(lineMarker2), index2));
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

    /**
     * Setter for the chart line marker by index.
     */
    public Scatter setLineMarker(Boolean lineMarker3, Double index2) {
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
            for (Scatter item : setLineMarker3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScatterSeriesMarker> setMarker = new ArrayList<>();

    /**
     * Adds Marker series.
     */
    public ScatterSeriesMarker marker(List<DataEntry> data) {
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

            js.append(String.format(Locale.US, "var setMarker" + ++variableIndex + " = " + jsBase + ".marker(%s);", resultData.toString()));
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


    private Markers getMarkerPalette;

    /**
     * Getter for markers palette settings.
     */
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

    /**
     * Setter for markers palette settings.
     */
    public Scatter setMarkerPalette(Markers markerPalette) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(markerPalette.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".markerPalette(%s);",  ((markerPalette != null) ? markerPalette.getJsBase() : "null")));
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

    /**
     * Setter for markers palette settings.
     */
    public Scatter setMarkerPalette(String markerPalette1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", wrapQuotes(markerPalette1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", wrapQuotes(markerPalette1)));
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

    /**
     * Setter for markers palette settings.
     */
    public Scatter setMarkerPalette(MarkerType[] markerPalette2) {
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
            for (Scatter item : setMarkerPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setMarkerPalette3 = new ArrayList<>();

    /**
     * Setter for markers palette settings.
     */
    public Scatter setMarkerPalette(String[] markerPalette3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToStringWrapQuotes(markerPalette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToStringWrapQuotes(markerPalette3)));
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

    /**
     * Setter for the maximum size for all bubbles on the charts.
     */
    public Scatter setMaxBubbleSize(Double maxBubbleSize) {
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
            for (Scatter item : setMaxBubbleSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setMaxBubbleSize1 = new ArrayList<>();

    /**
     * Setter for the maximum size for all bubbles on the charts.
     */
    public Scatter setMaxBubbleSize(String maxBubbleSize1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxBubbleSize(%s)", wrapQuotes(maxBubbleSize1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxBubbleSize(%s)", wrapQuotes(maxBubbleSize1)));
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

    /**
     * Setter for the minimum size for all bubbles on the charts.
     */
    public Scatter setMinBubbleSize(Double minBubbleSize) {
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
            for (Scatter item : setMinBubbleSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setMinBubbleSize1 = new ArrayList<>();

    /**
     * Setter for the minimum size for all bubbles on the charts.
     */
    public Scatter setMinBubbleSize(String minBubbleSize1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minBubbleSize(%s)", wrapQuotes(minBubbleSize1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minBubbleSize(%s)", wrapQuotes(minBubbleSize1)));
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

    /**
     * Getter for normal state settings.
     */
    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }
    private String normal;
    private List<Scatter> setNormal = new ArrayList<>();

    /**
     * Setter for normal state settings.
     */
    public Scatter setNormal(String normal) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));
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
    private List<Scatter> setPalette = new ArrayList<>();

    /**
     * Setter for the series colors palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public Scatter setPalette(RangeColors palette) {
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
            for (Scatter item : setPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setPalette1 = new ArrayList<>();

    /**
     * Setter for the series colors palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public Scatter setPalette(DistinctColors palette1) {
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
            for (Scatter item : setPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setPalette2 = new ArrayList<>();

    /**
     * Setter for the series colors palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public Scatter setPalette(String palette2) {
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
            for (Scatter item : setPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setPalette3 = new ArrayList<>();

    /**
     * Setter for the series colors palette.
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public Scatter setPalette(String[] palette3) {
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
            for (Scatter item : setPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private QuarterSettings getQuarters;

    /**
     * Getter for quarter settings.
     */
    public QuarterSettings getQuarters() {
        if (getQuarters == null)
            getQuarters = new QuarterSettings(jsBase + ".quarters()");

        return getQuarters;
    }
    private String quarters;
    private List<Scatter> setQuarters = new ArrayList<>();

    /**
     * Setter for quarter settings.
     */
    public Scatter setQuarters(String quarters) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".quarters(%s)", wrapQuotes(quarters)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".quarters(%s)", wrapQuotes(quarters)));
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

    /**
     * Getter for the chart range marker.
     */
    public CoreAxismarkersRange getRangeMarker() {
        if (getRangeMarker == null)
            getRangeMarker = new CoreAxismarkersRange(jsBase + ".rangeMarker()");

        return getRangeMarker;
    }

    private List<CoreAxismarkersRange> getRangeMarker1 = new ArrayList<>();

    /**
     * Getter for the chart range marker.
     */
    public CoreAxismarkersRange getRangeMarker(Double index3) {
        CoreAxismarkersRange item = new CoreAxismarkersRange(jsBase + ".rangeMarker("+ index3+")");
        getRangeMarker1.add(item);
        return item;
    }
    private String rangeMarker;
    private Boolean rangeMarker1;
    private List<Scatter> setRangeMarker = new ArrayList<>();

    /**
     * Setter for the chart range marker.
     */
    public Scatter setRangeMarker(String rangeMarker) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%s)", wrapQuotes(rangeMarker)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%s)", wrapQuotes(rangeMarker)));
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

    /**
     * Setter for the chart range marker.
     */
    public Scatter setRangeMarker(Boolean rangeMarker1) {
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

    /**
     * Setter for the chart range marker by index.
     */
    public Scatter setRangeMarker(String rangeMarker2, Double index4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%s, %f)", wrapQuotes(rangeMarker2), index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%s, %f)", wrapQuotes(rangeMarker2), index4));
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

    /**
     * Setter for the chart range marker by index.
     */
    public Scatter setRangeMarker(Boolean rangeMarker3, Double index4) {
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

    /**
     * Removes one of series from chart by its id.
     */
    public Scatter removeSeries(Double id2) {
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
            for (Scatter item : setRemoveSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setRemoveSeries1 = new ArrayList<>();

    /**
     * Removes one of series from chart by its id.
     */
    public Scatter removeSeries(String id3) {
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
            for (Scatter item : setRemoveSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index5;
    private List<Scatter> setRemoveSeriesAt = new ArrayList<>();

    /**
     * Removes one of series from chart by its index.
     */
    public Scatter removeSeriesAt(Double index5) {
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
            for (Scatter item : setRemoveSeriesAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private StateSettings getSelected;

    /**
     * Getter for selected state settings.
     */
    public StateSettings getSelected() {
        if (getSelected == null)
            getSelected = new StateSettings(jsBase + ".selected()");

        return getSelected;
    }
    private String selected;
    private List<Scatter> setSelected = new ArrayList<>();

    /**
     * Setter for selected state settings.
     */
    public Scatter setSelected(String selected) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));
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

    /**
     * Getter for the chart text marker.
     */
    public CoreAxismarkersText getTextMarker() {
        if (getTextMarker == null)
            getTextMarker = new CoreAxismarkersText(jsBase + ".textMarker()");

        return getTextMarker;
    }

    private List<CoreAxismarkersText> getTextMarker1 = new ArrayList<>();

    /**
     * Getter for the chart text marker.
     */
    public CoreAxismarkersText getTextMarker(Double index6) {
        CoreAxismarkersText item = new CoreAxismarkersText(jsBase + ".textMarker("+ index6+")");
        getTextMarker1.add(item);
        return item;
    }
    private String textMarker;
    private Boolean textMarker1;
    private List<Scatter> setTextMarker = new ArrayList<>();

    /**
     * Setter for the chart text marker.
     */
    public Scatter setTextMarker(String textMarker) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%s)", wrapQuotes(textMarker)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%s)", wrapQuotes(textMarker)));
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

    /**
     * Setter for the chart text marker.
     */
    public Scatter setTextMarker(Boolean textMarker1) {
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

    /**
     * Setter for the chart text marker by index.
     */
    public Scatter setTextMarker(String textMarker2, Double index7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%s, %f)", wrapQuotes(textMarker2), index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%s, %f)", wrapQuotes(textMarker2), index7));
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

    /**
     * Setter for the chart text marker by index.
     */
    public Scatter setTextMarker(Boolean textMarker3, Double index7) {
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
            for (Scatter item : setTextMarker3) {
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
    public CoreAxesLinear getXAxis(Double index8) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".xAxis("+ index8+")");
        getXAxis1.add(item);
        return item;
    }
    private String xAxis;
    private Boolean xAxis1;
    private List<Scatter> setXAxis = new ArrayList<>();

    /**
     * Setter for chart X-axis.
     */
    public Scatter setXAxis(String xAxis) {
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
            for (Scatter item : setXAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setXAxis1 = new ArrayList<>();

    /**
     * Setter for chart X-axis.
     */
    public Scatter setXAxis(Boolean xAxis1) {
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

    /**
     * Setter for chart X-axis by index.
     */
    public Scatter setXAxis(String xAxis2, Double index9) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s, %f)", wrapQuotes(xAxis2), index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s, %f)", wrapQuotes(xAxis2), index9));
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

    /**
     * Setter for chart X-axis by index.
     */
    public Scatter setXAxis(Boolean xAxis3, Double index9) {
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
            for (Scatter item : setXAxis3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreGridsLinear getXGrid;

    /**
     * Getter for chart grid by X-scale.
     */
    public CoreGridsLinear getXGrid() {
        if (getXGrid == null)
            getXGrid = new CoreGridsLinear(jsBase + ".xGrid()");

        return getXGrid;
    }

    private List<CoreGridsLinear> getXGrid1 = new ArrayList<>();

    /**
     * Getter for chart grid by X-scale.
     */
    public CoreGridsLinear getXGrid(Double index10) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".xGrid("+ index10+")");
        getXGrid1.add(item);
        return item;
    }
    private String xGrid;
    private Boolean xGrid1;
    private List<Scatter> setXGrid = new ArrayList<>();

    /**
     * Setter for chart grid by X-scale.
     */
    public Scatter setXGrid(String xGrid) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s)", wrapQuotes(xGrid)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s)", wrapQuotes(xGrid)));
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

    /**
     * Setter for chart grid by X-scale.
     */
    public Scatter setXGrid(Boolean xGrid1) {
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

    /**
     * Setter for chart grid by index.
     */
    public Scatter setXGrid(String xGrid2, Double index11) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s, %f)", wrapQuotes(xGrid2), index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s, %f)", wrapQuotes(xGrid2), index11));
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

    /**
     * Setter for chart grid by index.
     */
    public Scatter setXGrid(Boolean xGrid3, Double index11) {
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
            for (Scatter item : setXGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreGridsLinear getXMinorGrid;

    /**
     * Getter for chart minor grid by X-scale.
     */
    public CoreGridsLinear getXMinorGrid() {
        if (getXMinorGrid == null)
            getXMinorGrid = new CoreGridsLinear(jsBase + ".xMinorGrid()");

        return getXMinorGrid;
    }

    private List<CoreGridsLinear> getXMinorGrid1 = new ArrayList<>();

    /**
     * Getter for chart minor grid by X-scale.
     */
    public CoreGridsLinear getXMinorGrid(Double index12) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".xMinorGrid("+ index12+")");
        getXMinorGrid1.add(item);
        return item;
    }
    private String xMinorGrid;
    private Boolean xMinorGrid1;
    private List<Scatter> setXMinorGrid = new ArrayList<>();

    /**
     * Setter for chart minor grid by X-scale.
     */
    public Scatter setXMinorGrid(String xMinorGrid) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%s)", wrapQuotes(xMinorGrid)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s)", wrapQuotes(xMinorGrid)));
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

    /**
     * Setter for chart minor grid by X-scale.
     */
    public Scatter setXMinorGrid(Boolean xMinorGrid1) {
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

    /**
     * Setter for chart minor grid by index.
     */
    public Scatter setXMinorGrid(String xMinorGrid2, Double index13) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%s, %f)", wrapQuotes(xMinorGrid2), index13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s, %f)", wrapQuotes(xMinorGrid2), index13));
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

    /**
     * Setter for chart minor grid by index.
     */
    public Scatter setXMinorGrid(Boolean xMinorGrid3, Double index13) {
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
            for (Scatter item : setXMinorGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private ScatterBase getXScale;

    /**
     * Getter for default chart X scale.
     */
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

    /**
     * Setter for default chart X scale.
     */
    public Scatter setXScale(String xScale) {
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
            for (Scatter item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setXScale1 = new ArrayList<>();

    /**
     * Setter for default chart X scale.
     */
    public Scatter setXScale(ScatterScaleTypes xScale1) {
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
            for (Scatter item : setXScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setXScale2 = new ArrayList<>();

    /**
     * Setter for default chart X scale.
     */
    public Scatter setXScale(ScatterBase xScale3) {
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
            for (Scatter item : setXScale2) {
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
    public CoreAxesLinear getYAxis(Double index14) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".yAxis("+ index14+")");
        getYAxis1.add(item);
        return item;
    }
    private String yAxis;
    private Boolean yAxis1;
    private List<Scatter> setYAxis = new ArrayList<>();

    /**
     * Setter for chart Y-axis.
     */
    public Scatter setYAxis(String yAxis) {
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
            for (Scatter item : setYAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setYAxis1 = new ArrayList<>();

    /**
     * Setter for chart Y-axis.
     */
    public Scatter setYAxis(Boolean yAxis1) {
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

    /**
     * Setter for chart Y-axis by index.
     */
    public Scatter setYAxis(String yAxis2, Double index15) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s, %f)", wrapQuotes(yAxis2), index15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s, %f)", wrapQuotes(yAxis2), index15));
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

    /**
     * Setter for chart Y-axis by index.
     */
    public Scatter setYAxis(Boolean yAxis3, Double index15) {
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
            for (Scatter item : setYAxis3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreGridsLinear getYGrid;

    /**
     * Getter for chart grid by Y-scale.
     */
    public CoreGridsLinear getYGrid() {
        if (getYGrid == null)
            getYGrid = new CoreGridsLinear(jsBase + ".yGrid()");

        return getYGrid;
    }

    private List<CoreGridsLinear> getYGrid1 = new ArrayList<>();

    /**
     * Getter for chart grid by Y-scale.
     */
    public CoreGridsLinear getYGrid(Double index16) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".yGrid("+ index16+")");
        getYGrid1.add(item);
        return item;
    }
    private String yGrid;
    private Boolean yGrid1;
    private List<Scatter> setYGrid = new ArrayList<>();

    /**
     * Setter for chart grid by Y-scale.
     */
    public Scatter setYGrid(String yGrid) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s)", wrapQuotes(yGrid)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s)", wrapQuotes(yGrid)));
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

    /**
     * Setter for chart grid by Y-scale.
     */
    public Scatter setYGrid(Boolean yGrid1) {
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

    /**
     * Setter for chart grid by index.
     */
    public Scatter setYGrid(String yGrid2, Double index17) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s, %f)", wrapQuotes(yGrid2), index17));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s, %f)", wrapQuotes(yGrid2), index17));
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

    /**
     * Setter for chart grid by index.
     */
    public Scatter setYGrid(Boolean yGrid3, Double index17) {
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
            for (Scatter item : setYGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreGridsLinear getYMinorGrid;

    /**
     * Getter for chart minor grid by Y-scale.
     */
    public CoreGridsLinear getYMinorGrid() {
        if (getYMinorGrid == null)
            getYMinorGrid = new CoreGridsLinear(jsBase + ".yMinorGrid()");

        return getYMinorGrid;
    }

    private List<CoreGridsLinear> getYMinorGrid1 = new ArrayList<>();

    /**
     * Getter for chart minor grid by Y-scale.
     */
    public CoreGridsLinear getYMinorGrid(Double index18) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".yMinorGrid("+ index18+")");
        getYMinorGrid1.add(item);
        return item;
    }
    private String yMinorGrid;
    private Boolean yMinorGrid1;
    private List<Scatter> setYMinorGrid = new ArrayList<>();

    /**
     * Setter for chart minor grid by Y-scale.
     */
    public Scatter setYMinorGrid(String yMinorGrid) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%s)", wrapQuotes(yMinorGrid)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s)", wrapQuotes(yMinorGrid)));
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

    /**
     * Setter for chart minor grid by Y-scale.
     */
    public Scatter setYMinorGrid(Boolean yMinorGrid1) {
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

    /**
     * Setter for chart minor grid by index.
     */
    public Scatter setYMinorGrid(String yMinorGrid2, Double index19) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%s, %f)", wrapQuotes(yMinorGrid2), index19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s, %f)", wrapQuotes(yMinorGrid2), index19));
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

    /**
     * Setter for chart minor grid by index.
     */
    public Scatter setYMinorGrid(Boolean yMinorGrid3, Double index19) {
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
            for (Scatter item : setYMinorGrid3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private ScatterBase getYScale;

    /**
     * Getter for default chart Y scale.
     */
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

    /**
     * Setter for default chart Y scale.
     */
    public Scatter setYScale(String yScale) {
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
            for (Scatter item : setYScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setYScale1 = new ArrayList<>();

    /**
     * Setter for default chart Y scale.
     */
    public Scatter setYScale(ScatterScaleTypes yScale1) {
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
            for (Scatter item : setYScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Scatter> setYScale2 = new ArrayList<>();

    /**
     * Setter for default chart Y scale.
     */
    public Scatter setYScale(ScatterBase yScale3) {
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
        js.append(generateJSsetLineMarker());
        js.append(generateJSsetLineMarker1());
        js.append(generateJSsetLineMarker2());
        js.append(generateJSsetLineMarker3());
        js.append(generateJSsetMarker());
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
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}