package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * Radar chart class.<br/>
To get the chart use {@link anychart#radar} method.<br/>
Chart can contain any number of series.<br/>
Each series is interactive, you can customize click and hover behavior and other params.
 */
public class ChartsRadar extends SeparateChart {

    protected ChartsRadar(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    public void setOnClickListener(ListenersInterface.OnClickListener listener) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append("chart.listen('pointClick', function(e) {");
        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        ListenersInterface.getInstance().setOnClickListener(listener);
    }

    

    /**
     * Add series to the chart.
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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".addSeries(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
    }


    /**
     * 
     */
    public void addSeries(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".addSeries(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".addSeries(%s);", view.getJsBase()));
            js.setLength(0);
        }
    }

    private List<RadarSeriesArea> setArea = new ArrayList<>();

    /**
     * Adds Area series.
     */
    public RadarSeriesArea area(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setArea" + ++variableIndex + " = " + jsBase + ".area(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s);", resultData.toString()));
            js.setLength(0);
        }
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

    /**
     * 
     */
    public RadarSeriesArea area(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setArea1" + ++variableIndex + " = " + jsBase + ".area(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".area(%s);", view.getJsBase()));
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

    private RadarSeriesType defaultSeriesType;
    private String defaultSeriesType1;

    /**
     * Setter for the radar default series type.
     */
    public ChartsRadar setDefaultSeriesType(RadarSeriesType defaultSeriesType) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultSeriesType(%s)", ((defaultSeriesType != null) ? defaultSeriesType.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", ((defaultSeriesType != null) ? defaultSeriesType.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the radar default series type.
     */
    public ChartsRadar setDefaultSeriesType(String defaultSeriesType1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultSeriesType(%s)", wrapQuotes(defaultSeriesType1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultSeriesType(%s)", wrapQuotes(defaultSeriesType1)));
            js.setLength(0);
        }
        return this;
    }


    private AnychartMathRect getGetPlotBounds;

    /**
     * Getter for the current data bounds of the plot.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Radar#draw} is called.
     */
    public AnychartMathRect getGetPlotBounds() {
        if (getGetPlotBounds == null)
            getGetPlotBounds = new AnychartMathRect(jsBase + ".getPlotBounds()");

        return getGetPlotBounds;
    }

    private List<RadarSeriesBase> getGetSeries = new ArrayList<>();

    /**
     * Getter for the series by its id.
     */
    public RadarSeriesBase getGetSeries(Number id) {
        RadarSeriesBase item = new RadarSeriesBase(jsBase + ".getSeries("+ id+")");
        getGetSeries.add(item);
        return item;
    }

    private List<RadarSeriesBase> getGetSeries1 = new ArrayList<>();

    /**
     * Getter for the series by its id.
     */
    public RadarSeriesBase getGetSeries(String id1) {
        RadarSeriesBase item = new RadarSeriesBase(jsBase + ".getSeries("+ wrapQuotes(id1)+")");
        getGetSeries1.add(item);
        return item;
    }

    private List<RadarSeriesBase> getGetSeriesAt = new ArrayList<>();

    /**
     * Gets the series by its index.
     */
    public RadarSeriesBase getGetSeriesAt(Number index) {
        RadarSeriesBase item = new RadarSeriesBase(jsBase + ".getSeriesAt("+ index+")");
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

    /**
     * Setter for hatch fill palette settings.
     */
    public ChartsRadar setHatchFillPalette(HatchFillType[] hatchFillPalette) {
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


    /**
     * Setter for hatch fill palette settings.
     */
    public ChartsRadar setHatchFillPalette(String hatchFillPalette1) {
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


    /**
     * Setter for hatch fill palette settings.
     */
    public ChartsRadar setHatchFillPalette(HatchFills hatchFillPalette2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(hatchFillPalette2.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".hatchFillPalette(%s);",  ((hatchFillPalette2 != null) ? hatchFillPalette2.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hatchFillPalette(%s)", ((hatchFillPalette2 != null) ? hatchFillPalette2.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
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

    /**
     * Setter for hovered state settings.
     */
    public ChartsRadar setHovered(String hovered) {
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

    private Number innerRadius;
    private String innerRadius1;

    /**
     * Setter for the inner radius in pixels or percent of main radius.
     */
    public ChartsRadar setInnerRadius(Number innerRadius) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".innerRadius(%s)", innerRadius));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".innerRadius(%s)", innerRadius));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the inner radius in pixels or percent of main radius.
     */
    public ChartsRadar setInnerRadius(String innerRadius1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".innerRadius(%s)", wrapQuotes(innerRadius1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".innerRadius(%s)", wrapQuotes(innerRadius1)));
            js.setLength(0);
        }
        return this;
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

    /**
     * Setter for series data labels.
     */
    public ChartsRadar setLabels(String labels) {
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


    /**
     * Setter for series data labels.
     */
    public ChartsRadar setLabels(Boolean labels1) {
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

    private List<RadarSeriesLine> setLine = new ArrayList<>();

    /**
     * Adds Line series.
     */
    public RadarSeriesLine line(List<DataEntry> data) {
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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s);", resultData.toString()));
            js.setLength(0);
        }
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

    /**
     * 
     */
    public RadarSeriesLine line(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setLine1" + ++variableIndex + " = " + jsBase + ".line(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s);", view.getJsBase()));
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

    private List<RadarSeriesMarker> setMarker = new ArrayList<>();

    /**
     * Adds Marker series.
     */
    public RadarSeriesMarker marker(List<DataEntry> data) {
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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s);", resultData.toString()));
            js.setLength(0);
        }
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

    /**
     * 
     */
    public RadarSeriesMarker marker(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setMarker1" + ++variableIndex + " = " + jsBase + ".marker(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s);", view.getJsBase()));
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

    /**
     * Setter for markers palette settings.
     */
    public ChartsRadar setMarkerPalette(Markers markerPalette) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(markerPalette.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".markerPalette(%s);",  ((markerPalette != null) ? markerPalette.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", ((markerPalette != null) ? markerPalette.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for markers palette settings.
     */
    public ChartsRadar setMarkerPalette(String markerPalette1) {
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


    /**
     * Setter for markers palette settings.
     */
    public ChartsRadar setMarkerPalette(MarkerType[] markerPalette2) {
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


    /**
     * Setter for markers palette settings.
     */
    public ChartsRadar setMarkerPalette(String[] markerPalette3) {
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

    /**
     * Setter for normal state settings.
     */
    public ChartsRadar setNormal(String normal) {
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


    private RangeColors getPalette;

    /**
     * Getter for series colors palette.
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

    /**
     * Setter for series colors palette.<br/>
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public ChartsRadar setPalette(RangeColors palette) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(palette.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".palette(%s);",  ((palette != null) ? palette.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", ((palette != null) ? palette.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for series colors palette.<br/>
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public ChartsRadar setPalette(DistinctColors palette1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(palette1.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".palette(%s);",  ((palette1 != null) ? palette1.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".palette(%s)", ((palette1 != null) ? palette1.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for series colors palette.<br/>
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public ChartsRadar setPalette(String palette2) {
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


    /**
     * Setter for series colors palette.<br/>
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public ChartsRadar setPalette(String[] palette3) {
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

    private Number id2;
    private String id3;

    /**
     * Removes one of series from chart by its id.
     */
    public ChartsRadar removeSeries(Number id2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeries(%s)", id2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%s)", id2));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Removes one of series from chart by its id.
     */
    public ChartsRadar removeSeries(String id3) {
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

    private Number index1;

    /**
     * Removes one of series from chart by its index.
     */
    public ChartsRadar removeSeriesAt(Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeriesAt(%s)", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeriesAt(%s)", index1));
            js.setLength(0);
        }
        return this;
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

    /**
     * Setter for selected state settings.
     */
    public ChartsRadar setSelected(String selected) {
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

    private String startAngle;
    private Number startAngle1;

    /**
     * Setter for the chart start angle.
     */
    public ChartsRadar setStartAngle(String startAngle) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".startAngle(%s)", wrapQuotes(startAngle)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".startAngle(%s)", wrapQuotes(startAngle)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart start angle.
     */
    public ChartsRadar setStartAngle(Number startAngle1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".startAngle(%s)", startAngle1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".startAngle(%s)", startAngle1));
            js.setLength(0);
        }
        return this;
    }


    private CoreAxesRadar getXAxis;

    /**
     * Getter for the chart X-axis.
     */
    public CoreAxesRadar getXAxis() {
        if (getXAxis == null)
            getXAxis = new CoreAxesRadar(jsBase + ".xAxis()");

        return getXAxis;
    }
    private String xAxis;
    private Boolean xAxis1;

    /**
     * Setter for the chart X-axis.
     */
    public ChartsRadar setXAxis(String xAxis) {
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


    /**
     * Setter for the chart X-axis.
     */
    public ChartsRadar setXAxis(Boolean xAxis1) {
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


    private CoreGridsRadar getXGrid;

    /**
     * Getter for the chart grid by X-scale.
     */
    public CoreGridsRadar getXGrid() {
        if (getXGrid == null)
            getXGrid = new CoreGridsRadar(jsBase + ".xGrid()");

        return getXGrid;
    }

    private List<CoreGridsRadar> getXGrid1 = new ArrayList<>();

    /**
     * Getter for the chart grid by X-scale.
     */
    public CoreGridsRadar getXGrid(Number index2) {
        CoreGridsRadar item = new CoreGridsRadar(jsBase + ".xGrid("+ index2+")");
        getXGrid1.add(item);
        return item;
    }
    private String xGrid;
    private Boolean xGrid1;

    /**
     * Setter for the chart grid by X-scale.
     */
    public ChartsRadar setXGrid(String xGrid) {
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


    /**
     * Setter for the chart grid by X-scale.
     */
    public ChartsRadar setXGrid(Boolean xGrid1) {
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

    private Number index3;
    private String xGrid2;
    private Boolean xGrid3;

    /**
     * Setter for the chart grid by index.
     */
    public ChartsRadar setXGrid(String xGrid2, Number index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s, %s)", wrapQuotes(xGrid2), index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s, %s)", wrapQuotes(xGrid2), index3));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart grid by index.
     */
    public ChartsRadar setXGrid(Boolean xGrid3, Number index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%b, %s)", xGrid3, index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b, %s)", xGrid3, index3));
            js.setLength(0);
        }
        return this;
    }


    private CoreGridsRadar getXMinorGrid;

    /**
     * Getter for the chart minor grid by X-scale.
     */
    public CoreGridsRadar getXMinorGrid() {
        if (getXMinorGrid == null)
            getXMinorGrid = new CoreGridsRadar(jsBase + ".xMinorGrid()");

        return getXMinorGrid;
    }

    private List<CoreGridsRadar> getXMinorGrid1 = new ArrayList<>();

    /**
     * Getter for the chart minor grid by X-scale.
     */
    public CoreGridsRadar getXMinorGrid(Number index4) {
        CoreGridsRadar item = new CoreGridsRadar(jsBase + ".xMinorGrid("+ index4+")");
        getXMinorGrid1.add(item);
        return item;
    }
    private String xMinorGrid;
    private Boolean xMinorGrid1;

    /**
     * Setter for the chart minor grid by X-scale.
     */
    public ChartsRadar setXMinorGrid(String xMinorGrid) {
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


    /**
     * Setter for the chart minor grid by X-scale.
     */
    public ChartsRadar setXMinorGrid(Boolean xMinorGrid1) {
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

    private Number index5;
    private String xMinorGrid2;
    private Boolean xMinorGrid3;

    /**
     * Setter for the chart minor grid by index.
     */
    public ChartsRadar setXMinorGrid(String xMinorGrid2, Number index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%s, %s)", wrapQuotes(xMinorGrid2), index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s, %s)", wrapQuotes(xMinorGrid2), index5));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart minor grid by index.
     */
    public ChartsRadar setXMinorGrid(Boolean xMinorGrid3, Number index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%b, %s)", xMinorGrid3, index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%b, %s)", xMinorGrid3, index5));
            js.setLength(0);
        }
        return this;
    }


    private Ordinal getXScale;

    /**
     * Getter for the chart X scale.
     */
    public Ordinal getXScale() {
        if (getXScale == null)
            getXScale = new Ordinal(jsBase + ".xScale()");

        return getXScale;
    }
    private Ordinal xScale;

    /**
     * Setter for the chart X scale.<br/>
<b>Note:</b> This scale will be passed to all scale dependent chart elements if they don't have their own scales.
     */
    public ChartsRadar setXScale(Ordinal xScale) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(xScale.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".xScale(%s);",  ((xScale != null) ? xScale.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", ((xScale != null) ? xScale.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


    private CoreAxesRadar getYAxis;

    /**
     * Getter for the chart Y-axis.
     */
    public CoreAxesRadar getYAxis() {
        if (getYAxis == null)
            getYAxis = new CoreAxesRadar(jsBase + ".yAxis()");

        return getYAxis;
    }
    private String yAxis;
    private Boolean yAxis1;

    /**
     * Setter for the chart Y-axis.
     */
    public ChartsRadar setYAxis(String yAxis) {
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


    /**
     * Setter for the chart Y-axis.
     */
    public ChartsRadar setYAxis(Boolean yAxis1) {
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


    private CoreGridsRadar getYGrid;

    /**
     * Getter for the chart grid by Y-scale.
     */
    public CoreGridsRadar getYGrid() {
        if (getYGrid == null)
            getYGrid = new CoreGridsRadar(jsBase + ".yGrid()");

        return getYGrid;
    }

    private List<CoreGridsRadar> getYGrid1 = new ArrayList<>();

    /**
     * Getter for the chart grid by Y-scale.
     */
    public CoreGridsRadar getYGrid(Number index6) {
        CoreGridsRadar item = new CoreGridsRadar(jsBase + ".yGrid("+ index6+")");
        getYGrid1.add(item);
        return item;
    }
    private String yGrid;
    private Boolean yGrid1;

    /**
     * Setter for the chart grid by Y-scale.
     */
    public ChartsRadar setYGrid(String yGrid) {
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


    /**
     * Setter for the chart grid by Y-scale.
     */
    public ChartsRadar setYGrid(Boolean yGrid1) {
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

    private Number index7;
    private String yGrid2;
    private Boolean yGrid3;

    /**
     * Setter for the chart grid by index.
     */
    public ChartsRadar setYGrid(String yGrid2, Number index7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s, %s)", wrapQuotes(yGrid2), index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s, %s)", wrapQuotes(yGrid2), index7));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart grid by index.
     */
    public ChartsRadar setYGrid(Boolean yGrid3, Number index7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%b, %s)", yGrid3, index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b, %s)", yGrid3, index7));
            js.setLength(0);
        }
        return this;
    }


    private CoreGridsRadar getYMinorGrid;

    /**
     * Getter for the chart minor grid by X-scale.
     */
    public CoreGridsRadar getYMinorGrid() {
        if (getYMinorGrid == null)
            getYMinorGrid = new CoreGridsRadar(jsBase + ".yMinorGrid()");

        return getYMinorGrid;
    }

    private List<CoreGridsRadar> getYMinorGrid1 = new ArrayList<>();

    /**
     * Getter for the chart minor grid by X-scale.
     */
    public CoreGridsRadar getYMinorGrid(Number index8) {
        CoreGridsRadar item = new CoreGridsRadar(jsBase + ".yMinorGrid("+ index8+")");
        getYMinorGrid1.add(item);
        return item;
    }
    private String yMinorGrid;
    private Boolean yMinorGrid1;

    /**
     * Setter for the chart minor grid by X-scale.
     */
    public ChartsRadar setYMinorGrid(String yMinorGrid) {
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


    /**
     * Setter for the chart minor grid by X-scale.
     */
    public ChartsRadar setYMinorGrid(Boolean yMinorGrid1) {
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

    private Number index9;
    private String yMinorGrid2;
    private Boolean yMinorGrid3;

    /**
     * Setter for the chart minor grid by index.
     */
    public ChartsRadar setYMinorGrid(String yMinorGrid2, Number index9) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%s, %s)", wrapQuotes(yMinorGrid2), index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s, %s)", wrapQuotes(yMinorGrid2), index9));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart minor grid by index.
     */
    public ChartsRadar setYMinorGrid(Boolean yMinorGrid3, Number index9) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%b, %s)", yMinorGrid3, index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%b, %s)", yMinorGrid3, index9));
            js.setLength(0);
        }
        return this;
    }


    private ScalesLinear getYScale;

    /**
     * Getter for the chart Y scale.
     */
    public ScalesLinear getYScale() {
        if (getYScale == null)
            getYScale = new ScalesLinear(jsBase + ".yScale()");

        return getYScale;
    }
    private String yScale;
    private String yScale1;
    private ScalesBase yScale2;
    private ScaleTypes yScale3;

    /**
     * Setter for the chart Y scale.<br/>
<b>Note:</b> This scale will be passed to all scale dependent chart elements if they don't have their own scales.
     */
    public ChartsRadar setYScale(String yScale) {
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


    /**
     * Setter for the chart Y scale.<br/>
<b>Note:</b> This scale will be passed to all scale dependent chart elements if they don't have their own scales.
     */
    public ChartsRadar setYScale(ScalesBase yScale2) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(yScale2.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale2 != null) ? yScale2.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale2 != null) ? yScale2.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart Y scale.<br/>
<b>Note:</b> This scale will be passed to all scale dependent chart elements if they don't have their own scales.
     */
    public ChartsRadar setYScale(ScaleTypes yScale3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yScale(%s)", ((yScale3 != null) ? yScale3.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale3 != null) ? yScale3.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
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
        js.append(generateJSsetLine());
        js.append(generateJSsetLine1());
        js.append(generateJSsetMarker());
        js.append(generateJSsetMarker1());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}