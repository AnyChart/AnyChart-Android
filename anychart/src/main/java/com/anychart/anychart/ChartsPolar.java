package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * Polar chart class.<br/>
To get the chart use {@link anychart#polar} method.<br/>
Chart can contain any number of series.<br/>
Each series is interactive, you can customize click and hover behavior and other params.
 */
public class ChartsPolar extends SeparateChart {

    protected ChartsPolar(String name) {
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

    private List<PolarSeriesArea> setArea = new ArrayList<>();

    /**
     * Adds Area series.
     */
    public PolarSeriesArea area(List<DataEntry> data) {
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

    /**
     * 
     */
    public PolarSeriesArea area(View view) {
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

    private Number barGroupsPadding;

    /**
     * Setter for the space between bar groups on the ordinal scale by ratio of bars width.
     */
    public ChartsPolar setBarGroupsPadding(Number barGroupsPadding) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".barGroupsPadding(%s)", barGroupsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".barGroupsPadding(%s)", barGroupsPadding));
            js.setLength(0);
        }
        return this;
    }

    private Number barsPadding;

    /**
     * Setter for the space between bars on the ordinal scale by ratio of bars width.
     */
    public ChartsPolar setBarsPadding(Number barsPadding) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".barsPadding(%s)", barsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".barsPadding(%s)", barsPadding));
            js.setLength(0);
        }
        return this;
    }

    private List<PolarSeriesColumn> setColumn = new ArrayList<>();

    /**
     * Adds Column series.
     */
    public PolarSeriesColumn column(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setColumn" + ++variableIndex + " = " + jsBase + ".column(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s);", resultData.toString()));
            js.setLength(0);
        }
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

    /**
     * 
     */
    public PolarSeriesColumn column(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setColumn1" + ++variableIndex + " = " + jsBase + ".column(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".column(%s);", view.getJsBase()));
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

    private PolarSeriesType defaultSeriesType;
    private String defaultSeriesType1;

    /**
     * Setter for the polar default series type.
     */
    public ChartsPolar setDefaultSeriesType(PolarSeriesType defaultSeriesType) {
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
     * Setter for the polar default series type.
     */
    public ChartsPolar setDefaultSeriesType(String defaultSeriesType1) {
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
     * Getter for the data bounds of the chart.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Polar#draw} is called.
     */
    public AnychartMathRect getGetPlotBounds() {
        if (getGetPlotBounds == null)
            getGetPlotBounds = new AnychartMathRect(jsBase + ".getPlotBounds()");

        return getGetPlotBounds;
    }

    private List<PolarSeriesBase> getGetSeries = new ArrayList<>();

    /**
     * Getter for the series by its id.
     */
    public PolarSeriesBase getGetSeries(Number id) {
        PolarSeriesBase item = new PolarSeriesBase(jsBase + ".getSeries("+ id+")");
        getGetSeries.add(item);
        return item;
    }

    private List<PolarSeriesBase> getGetSeries1 = new ArrayList<>();

    /**
     * Getter for the series by its id.
     */
    public PolarSeriesBase getGetSeries(String id1) {
        PolarSeriesBase item = new PolarSeriesBase(jsBase + ".getSeries("+ wrapQuotes(id1)+")");
        getGetSeries1.add(item);
        return item;
    }

    private List<PolarSeriesBase> getGetSeriesAt = new ArrayList<>();

    /**
     * Getter for the series by its index.
     */
    public PolarSeriesBase getGetSeriesAt(Number index) {
        PolarSeriesBase item = new PolarSeriesBase(jsBase + ".getSeriesAt("+ index+")");
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
    public ChartsPolar setHatchFillPalette(HatchFillType[] hatchFillPalette) {
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
    public ChartsPolar setHatchFillPalette(String hatchFillPalette1) {
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
    public ChartsPolar setHatchFillPalette(HatchFills hatchFillPalette2) {
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
    public ChartsPolar setHovered(String hovered) {
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
    public ChartsPolar setInnerRadius(Number innerRadius) {
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
    public ChartsPolar setInnerRadius(String innerRadius1) {
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
    public ChartsPolar setLabels(String labels) {
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
    public ChartsPolar setLabels(Boolean labels1) {
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

    private List<PolarSeriesLine> setLine = new ArrayList<>();

    /**
     * Adds Line series.
     */
    public PolarSeriesLine line(List<DataEntry> data) {
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

    /**
     * 
     */
    public PolarSeriesLine line(View view) {
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

    private List<PolarSeriesMarker> setMarker = new ArrayList<>();

    /**
     * Adds Marker series.
     */
    public PolarSeriesMarker marker(List<DataEntry> data) {
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

    /**
     * 
     */
    public PolarSeriesMarker marker(View view) {
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


    private Markers getMarkerPalette;

    /**
     * Getter for the markers palette settings.
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
     * Setter for the markers palette settings.
     */
    public ChartsPolar setMarkerPalette(Markers markerPalette) {
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
     * Setter for the markers palette settings.
     */
    public ChartsPolar setMarkerPalette(String markerPalette1) {
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
     * Setter for the markers palette settings.
     */
    public ChartsPolar setMarkerPalette(MarkerType[] markerPalette2) {
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
     * Setter for the markers palette settings.
     */
    public ChartsPolar setMarkerPalette(String[] markerPalette3) {
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

    private Number maxPointWidth;
    private String maxPointWidth1;

    /**
     * Setter for the maximum point width.
     */
    public ChartsPolar setMaxPointWidth(Number maxPointWidth) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%s)", maxPointWidth));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the maximum point width.
     */
    public ChartsPolar setMaxPointWidth(String maxPointWidth1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));
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
    public ChartsPolar setNormal(String normal) {
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

    /**
     * Setter for the series colors palette.<br/>
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public ChartsPolar setPalette(RangeColors palette) {
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
     * Setter for the series colors palette.<br/>
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public ChartsPolar setPalette(DistinctColors palette1) {
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
     * Setter for the series colors palette.<br/>
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public ChartsPolar setPalette(String palette2) {
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
     * Setter for the series colors palette.<br/>
<b>Note</b>: You can use predefined palettes from {@link anychart.palettes}.
     */
    public ChartsPolar setPalette(String[] palette3) {
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

    private Number pointWidth;
    private String pointWidth1;

    /**
     * Setter for the point width settings.
     */
    public ChartsPolar setPointWidth(Number pointWidth) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointWidth(%s)", pointWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", pointWidth));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the point width settings.
     */
    public ChartsPolar setPointWidth(String pointWidth1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));
            js.setLength(0);
        }
        return this;
    }

    private List<Polygon> setPolygon = new ArrayList<>();

    /**
     * Adds Polygon series.
     */
    public Polygon polygon(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setPolygon" + ++variableIndex + " = " + jsBase + ".polygon(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polygon(%s);", resultData.toString()));
            js.setLength(0);
        }
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

    /**
     * 
     */
    public Polygon polygon(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setPolygon1" + ++variableIndex + " = " + jsBase + ".polygon(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polygon(%s);", view.getJsBase()));
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

    private List<Polyline> setPolyline = new ArrayList<>();

    /**
     * Adds Polyline series.
     */
    public Polyline polyline(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setPolyline" + ++variableIndex + " = " + jsBase + ".polyline(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polyline(%s);", resultData.toString()));
            js.setLength(0);
        }
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

    /**
     * 
     */
    public Polyline polyline(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setPolyline1" + ++variableIndex + " = " + jsBase + ".polyline(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".polyline(%s);", view.getJsBase()));
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

    private List<PolarSeriesRangeColumn> setRangeColumn = new ArrayList<>();

    /**
     * Adds Range Column series.
     */
    public PolarSeriesRangeColumn rangeColumn(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setRangeColumn" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s);", resultData.toString()));
            js.setLength(0);
        }
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

    /**
     * 
     */
    public PolarSeriesRangeColumn rangeColumn(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setRangeColumn1" + ++variableIndex + " = " + jsBase + ".rangeColumn(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeColumn(%s);", view.getJsBase()));
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

    private Number id2;
    private String id3;

    /**
     * Removes one of series from chart by its id.
     */
    public ChartsPolar removeSeries(Number id2) {
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
    public ChartsPolar removeSeries(String id3) {
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
    public ChartsPolar removeSeriesAt(Number index1) {
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
    public ChartsPolar setSelected(String selected) {
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

    private Boolean sortPointsByX;

    /**
     * Setter for the sortPointsByX mode.
If the points of series should be sorted by X before drawing.
     */
    public ChartsPolar setSortPointsByX(Boolean sortPointsByX) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".sortPointsByX(%b)", sortPointsByX));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".sortPointsByX(%b)", sortPointsByX));
            js.setLength(0);
        }
        return this;
    }

    private String startAngle;
    private Number startAngle1;

    /**
     * Setter for the chart start angle.
     */
    public ChartsPolar setStartAngle(String startAngle) {
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
    public ChartsPolar setStartAngle(Number startAngle1) {
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


    private CoreAxesPolar getXAxis;

    /**
     * Getter for the chart X-axis.
     */
    public CoreAxesPolar getXAxis() {
        if (getXAxis == null)
            getXAxis = new CoreAxesPolar(jsBase + ".xAxis()");

        return getXAxis;
    }
    private String xAxis;
    private Boolean xAxis1;

    /**
     * Setter for the chart X-axis.
     */
    public ChartsPolar setXAxis(String xAxis) {
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
    public ChartsPolar setXAxis(Boolean xAxis1) {
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


    private CoreGridsPolar getXGrid;

    /**
     * Getter for the chart grid by X-scale.
     */
    public CoreGridsPolar getXGrid() {
        if (getXGrid == null)
            getXGrid = new CoreGridsPolar(jsBase + ".xGrid()");

        return getXGrid;
    }

    private List<CoreGridsPolar> getXGrid1 = new ArrayList<>();

    /**
     * Getter for the chart grid by X-scale.
     */
    public CoreGridsPolar getXGrid(Number index2) {
        CoreGridsPolar item = new CoreGridsPolar(jsBase + ".xGrid("+ index2+")");
        getXGrid1.add(item);
        return item;
    }
    private String xGrid;
    private Boolean xGrid1;

    /**
     * Setter for the chart grid by X-scale.
     */
    public ChartsPolar setXGrid(String xGrid) {
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
    public ChartsPolar setXGrid(Boolean xGrid1) {
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
     * Setter for chart grid by index.
     */
    public ChartsPolar setXGrid(String xGrid2, Number index3) {
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
     * Setter for chart grid by index.
     */
    public ChartsPolar setXGrid(Boolean xGrid3, Number index3) {
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


    private CoreGridsPolar getXMinorGrid;

    /**
     * Getter for the chart minor grid by X-scale.
     */
    public CoreGridsPolar getXMinorGrid() {
        if (getXMinorGrid == null)
            getXMinorGrid = new CoreGridsPolar(jsBase + ".xMinorGrid()");

        return getXMinorGrid;
    }

    private List<CoreGridsPolar> getXMinorGrid1 = new ArrayList<>();

    /**
     * Getter for the chart minor grid by X-scale.
     */
    public CoreGridsPolar getXMinorGrid(Number index4) {
        CoreGridsPolar item = new CoreGridsPolar(jsBase + ".xMinorGrid("+ index4+")");
        getXMinorGrid1.add(item);
        return item;
    }
    private String xMinorGrid;
    private Boolean xMinorGrid1;

    /**
     * Setter for the chart minor grid by X-scale.
     */
    public ChartsPolar setXMinorGrid(String xMinorGrid) {
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
    public ChartsPolar setXMinorGrid(Boolean xMinorGrid1) {
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
    public ChartsPolar setXMinorGrid(String xMinorGrid2, Number index5) {
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
    public ChartsPolar setXMinorGrid(Boolean xMinorGrid3, Number index5) {
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


    private ScatterBase getXScale;

    /**
     * Getter for the default chart X scale.
     */
    public ScatterBase getXScale() {
        if (getXScale == null)
            getXScale = new ScalesLinear(jsBase + ".xScale()");

        return getXScale;
    }
    private String xScale;
    private ScaleTypes xScale1;
    private String xScale2;
    private ScalesBase xScale3;

    /**
     * Setter for the chart X scale.
     */
    public ChartsPolar setXScale(String xScale) {
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


    /**
     * Setter for the chart X scale.
     */
    public ChartsPolar setXScale(ScaleTypes xScale1) {
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


    /**
     * Setter for the chart X scale.
     */
    public ChartsPolar setXScale(ScalesBase xScale3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(xScale3.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".xScale(%s);",  ((xScale3 != null) ? xScale3.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", ((xScale3 != null) ? xScale3.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


    private CoreAxesRadial getYAxis;

    /**
     * Getter for the chart Y-axis.
     */
    public CoreAxesRadial getYAxis() {
        if (getYAxis == null)
            getYAxis = new CoreAxesRadial(jsBase + ".yAxis()");

        return getYAxis;
    }
    private String yAxis;
    private Boolean yAxis1;

    /**
     * Setter for the chart Y-axis.
     */
    public ChartsPolar setYAxis(String yAxis) {
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
    public ChartsPolar setYAxis(Boolean yAxis1) {
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


    private CoreGridsPolar getYGrid;

    /**
     * Getter for the chart grid by Y-scale.
     */
    public CoreGridsPolar getYGrid() {
        if (getYGrid == null)
            getYGrid = new CoreGridsPolar(jsBase + ".yGrid()");

        return getYGrid;
    }

    private List<CoreGridsPolar> getYGrid1 = new ArrayList<>();

    /**
     * Getter for the chart grid by Y-scale.
     */
    public CoreGridsPolar getYGrid(Number index6) {
        CoreGridsPolar item = new CoreGridsPolar(jsBase + ".yGrid("+ index6+")");
        getYGrid1.add(item);
        return item;
    }
    private String yGrid;
    private Boolean yGrid1;

    /**
     * Setter for the chart grid by Y-scale.
     */
    public ChartsPolar setYGrid(String yGrid) {
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
    public ChartsPolar setYGrid(Boolean yGrid1) {
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
     * Setter for chart grid by index.
     */
    public ChartsPolar setYGrid(String yGrid2, Number index7) {
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
     * Setter for chart grid by index.
     */
    public ChartsPolar setYGrid(Boolean yGrid3, Number index7) {
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


    private CoreGridsPolar getYMinorGrid;

    /**
     * Getter for the chart minor grid by Y-scale.
     */
    public CoreGridsPolar getYMinorGrid() {
        if (getYMinorGrid == null)
            getYMinorGrid = new CoreGridsPolar(jsBase + ".yMinorGrid()");

        return getYMinorGrid;
    }

    private List<CoreGridsPolar> getYMinorGrid1 = new ArrayList<>();

    /**
     * Getter for the chart minor grid by Y-scale.
     */
    public CoreGridsPolar getYMinorGrid(Number index8) {
        CoreGridsPolar item = new CoreGridsPolar(jsBase + ".yMinorGrid("+ index8+")");
        getYMinorGrid1.add(item);
        return item;
    }
    private String yMinorGrid;
    private Boolean yMinorGrid1;

    /**
     * Setter for the chart minor grid by Y-scale.
     */
    public ChartsPolar setYMinorGrid(String yMinorGrid) {
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
     * Setter for the chart minor grid by Y-scale.
     */
    public ChartsPolar setYMinorGrid(Boolean yMinorGrid1) {
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
    public ChartsPolar setYMinorGrid(String yMinorGrid2, Number index9) {
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
    public ChartsPolar setYMinorGrid(Boolean yMinorGrid3, Number index9) {
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


    private ScatterBase getYScale;

    /**
     * Getter for the default chart Y scale.
     */
    public ScatterBase getYScale() {
        if (getYScale == null)
            getYScale = new ScalesLinear(jsBase + ".yScale()");

        return getYScale;
    }
    private String yScale;
    private ScatterScaleTypes yScale1;
    private String yScale2;
    private ScatterBase yScale3;

    /**
     * Setter for the chart Y scale.
     */
    public ChartsPolar setYScale(String yScale) {
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
     * Setter for the chart Y scale.
     */
    public ChartsPolar setYScale(ScatterScaleTypes yScale1) {
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


    /**
     * Setter for the chart Y scale.
     */
    public ChartsPolar setYScale(ScatterBase yScale3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(yScale3.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale3 != null) ? yScale3.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale3 != null) ? yScale3.getJsBase() : "null")));
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
            for (PolarSeriesBase item : getGetSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeries1() {
        if (!getGetSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesBase item : getGetSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeriesAt() {
        if (!getGetSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesBase item : getGetSeriesAt) {
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
            for (CoreGridsPolar item : getXGrid1) {
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
            for (CoreGridsPolar item : getXMinorGrid1) {
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
            for (CoreGridsPolar item : getYGrid1) {
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
            for (CoreGridsPolar item : getYMinorGrid1) {
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
        js.append(generateJSsetColumn());
        js.append(generateJSsetColumn1());
        js.append(generateJSsetLine());
        js.append(generateJSsetLine1());
        js.append(generateJSsetMarker());
        js.append(generateJSsetMarker1());
        js.append(generateJSsetPolygon());
        js.append(generateJSsetPolygon1());
        js.append(generateJSsetPolyline());
        js.append(generateJSsetPolyline1());
        js.append(generateJSsetRangeColumn());
        js.append(generateJSsetRangeColumn1());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}