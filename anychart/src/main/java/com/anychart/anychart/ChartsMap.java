package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * AnyChart map class.
 */
public class ChartsMap extends SeparateChart {

    protected ChartsMap(String name) {
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


    private AxesMapSettings getAxes;

    /**
     * Getter for map axes.
     */
    public AxesMapSettings getAxes() {
        if (getAxes == null)
            getAxes = new AxesMapSettings(jsBase + ".axes()");

        return getAxes;
    }
    private String axes;
    private Boolean axes1;

    /**
     * Setter for map axes.
     */
    public ChartsMap setAxes(String axes) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axes(%s)", wrapQuotes(axes)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axes(%s)", wrapQuotes(axes)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for map axes.
     */
    public ChartsMap setAxes(Boolean axes1) {
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

    private List<MapSeriesBubble> setBubble = new ArrayList<>();

    /**
     * Creates a Bubble series.
     */
    public MapSeriesBubble bubble(List<DataEntry> data) {
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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s);", resultData.toString()));
            js.setLength(0);
        }
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

    /**
     * 
     */
    public MapSeriesBubble bubble(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setBubble1" + ++variableIndex + " = " + jsBase + ".bubble(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bubble(%s);", view.getJsBase()));
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


    private Callout getCallout;

    /**
     * Getter for callout elements.
     */
    public Callout getCallout() {
        if (getCallout == null)
            getCallout = new Callout(jsBase + ".callout()");

        return getCallout;
    }

    private List<Callout> getCallout1 = new ArrayList<>();

    /**
     * Getter for callout elements.
     */
    public Callout getCallout(Number index) {
        Callout item = new Callout(jsBase + ".callout("+ index+")");
        getCallout1.add(item);
        return item;
    }
    private String callout;
    private Boolean callout1;

    /**
     * Setter for callout elements.
     */
    public ChartsMap setCallout(String callout) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".callout(%s)", wrapQuotes(callout)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".callout(%s)", wrapQuotes(callout)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for callout elements.
     */
    public ChartsMap setCallout(Boolean callout1) {
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

    private Number index1;
    private String callout2;
    private Boolean callout3;

    /**
     * Setter for callout elements by index.
     */
    public ChartsMap setCallout(String callout2, Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".callout(%s, %s)", wrapQuotes(callout2), index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".callout(%s, %s)", wrapQuotes(callout2), index1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for callout elements by index.
     */
    public ChartsMap setCallout(Boolean callout3, Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".callout(%b, %s)", callout3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".callout(%b, %s)", callout3, index1));
            js.setLength(0);
        }
        return this;
    }

    private List<Choropleth> setChoropleth = new ArrayList<>();

    /**
     * Creates a Choropleth series.
     */
    public Choropleth choropleth(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setChoropleth" + ++variableIndex + " = " + jsBase + ".choropleth(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s);", resultData.toString()));
            js.setLength(0);
        }
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

    /**
     * 
     */
    public Choropleth choropleth(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setChoropleth1" + ++variableIndex + " = " + jsBase + ".choropleth(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".choropleth(%s);", view.getJsBase()));
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


    private UiColorRange getColorRange;

    /**
     * Getter for the current color range.
     */
    public UiColorRange getColorRange() {
        if (getColorRange == null)
            getColorRange = new UiColorRange(jsBase + ".colorRange()");

        return getColorRange;
    }
    private String colorRange;

    /**
     * Setter for the color range.
     */
    public ChartsMap setColorRange(String colorRange) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".colorRange(%s)", wrapQuotes(colorRange)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".colorRange(%s)", wrapQuotes(colorRange)));
            js.setLength(0);
        }
        return this;
    }

    private List<SeriesConnector> setConnector = new ArrayList<>();

    /**
     * Creates connector series.
     */
    public SeriesConnector connector(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setConnector" + ++variableIndex + " = " + jsBase + ".connector(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        SeriesConnector item = new SeriesConnector("setConnector" + variableIndex);
        setConnector.add(item);
        return item;
    }
    private String generateJSsetConnector() {
        if (!setConnector.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesConnector item : setConnector) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesConnector> setConnector1 = new ArrayList<>();

    /**
     * 
     */
    public SeriesConnector connector(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setConnector1" + ++variableIndex + " = " + jsBase + ".connector(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".connector(%s);", view.getJsBase()));
            js.setLength(0);
        }
        SeriesConnector item = new SeriesConnector("setConnector1" + variableIndex);
        setConnector1.add(item);
        return item;
    }
    private String generateJSsetConnector1() {
        if (!setConnector1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesConnector item : setConnector1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Crosshair getCrosshair;

    /**
     * Getter for map crosshair settings.
     */
    public Crosshair getCrosshair() {
        if (getCrosshair == null)
            getCrosshair = new Crosshair(jsBase + ".crosshair()");

        return getCrosshair;
    }
    private String crosshair;
    private Boolean crosshair1;

    /**
     * Setter for map crosshair settings.
     */
    public ChartsMap setCrosshair(String crosshair) {
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


    /**
     * Setter for map crosshair settings.
     */
    public ChartsMap setCrosshair(Boolean crosshair1) {
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

    private String crs;
    private MapProjections crs1;
    private String crs2;

    /**
     * Sets the crs (coordinate system) to map.
     */
    public void setCrs(String crs) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".crs(%s);", wrapQuotes(crs)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".crs(%s)", wrapQuotes(crs)));
            js.setLength(0);
        }
    }


    /**
     * Sets the crs (coordinate system) to map.
     */
    public void setCrs(MapProjections crs1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".crs(%s);", ((crs1 != null) ? crs1.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".crs(%s)", ((crs1 != null) ? crs1.generateJs() : "null")));
            js.setLength(0);
        }
    }


    private Animation getCrsAnimation;

    /**
     * Getter for animation settings.
     */
    public Animation getCrsAnimation() {
        if (getCrsAnimation == null)
            getCrsAnimation = new Animation(jsBase + ".crsAnimation()");

        return getCrsAnimation;
    }
    private Boolean crsAnimation;
    private String crsAnimation1;
    private Number duration;

    /**
     * Setter for animation settings.
     */
    public ChartsMap setCrsAnimation(Boolean crsAnimation, Number duration) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crsAnimation(%b, %s)", crsAnimation, duration));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crsAnimation(%b, %s)", crsAnimation, duration));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for animation settings.
     */
    public ChartsMap setCrsAnimation(String crsAnimation1, Number duration) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crsAnimation(%s, %s)", wrapQuotes(crsAnimation1), duration));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crsAnimation(%s, %s)", wrapQuotes(crsAnimation1), duration));
            js.setLength(0);
        }
        return this;
    }

    private MapSeriesType defaultSeriesType;
    private String defaultSeriesType1;

    /**
     * Setter for the map default series type.
     */
    public ChartsMap setDefaultSeriesType(MapSeriesType defaultSeriesType) {
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
     * Setter for the map default series type.
     */
    public ChartsMap setDefaultSeriesType(String defaultSeriesType1) {
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

    private String drillDownMap;

    /**
     * Drills down a map.<br/>
Set the transitions to drill down.
     */
    public void drillDownMap(String drillDownMap) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".drillDownMap(%s);", wrapQuotes(drillDownMap)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".drillDownMap(%s)", wrapQuotes(drillDownMap)));
            js.setLength(0);
        }
    }

    private String id;
    private ChartsMap map;

    /**
     * Drills down to a map.
     */
    public ChartsMap drillTo(String id, ChartsMap map) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".drillTo(%s, %s)", wrapQuotes(id), ((map != null) ? map.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".drillTo(%s, %s)", wrapQuotes(id), ((map != null) ? map.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }

    private String id2;
    private String crs3;

    /**
     * Setter for the crs of the feature.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChartsMap setFeatureCrs(String id2, String crs3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".featureCrs(%s, %s)", wrapQuotes(id2), wrapQuotes(crs3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".featureCrs(%s, %s)", wrapQuotes(id2), wrapQuotes(crs3)));
            js.setLength(0);
        }
        return this;
    }

    private String id4;
    private Number ratio;

    /**
     * Setter for the feature scale factor.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChartsMap setFeatureScaleFactor(String id4, Number ratio) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".featureScaleFactor(%s, %s)", wrapQuotes(id4), ratio));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".featureScaleFactor(%s, %s)", wrapQuotes(id4), ratio));
            js.setLength(0);
        }
        return this;
    }

    private String id6;
    private Number dx;
    private Number dy;

    /**
     * Setter for the translation feature.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChartsMap setFeatureTranslation(String id6, Number dx, Number dy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".featureTranslation(%s, %s, %s)", wrapQuotes(id6), dx, dy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".featureTranslation(%s, %s, %s)", wrapQuotes(id6), dx, dy));
            js.setLength(0);
        }
        return this;
    }

    private String data12;
    private String data13;

    /**
     * Setter for the geo data.
     */
    public void setGeoData(String data12) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var geoData" + ++variableIndex + " = " + jsBase + ".geoData(%s);", wrapQuotes(data12)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".geoData(%s)", wrapQuotes(data12)));
            js.setLength(0);
        }
    }

    private String geoIdField;

    /**
     * Setter for the geo id field.
     */
    public ChartsMap setGeoIdField(String geoIdField) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".geoIdField(%s)", wrapQuotes(geoIdField)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".geoIdField(%s)", wrapQuotes(geoIdField)));
            js.setLength(0);
        }
        return this;
    }


    private AnychartMathRect getGetPlotBounds;

    /**
     * Getter for the current data bounds of the chart.
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public AnychartMathRect getGetPlotBounds() {
        if (getGetPlotBounds == null)
            getGetPlotBounds = new AnychartMathRect(jsBase + ".getPlotBounds()");

        return getGetPlotBounds;
    }

    private List<MapSeriesBase> getGetSeries = new ArrayList<>();

    /**
     * Getter for the series by its id.
     */
    public MapSeriesBase getGetSeries(Number id7) {
        MapSeriesBase item = new MapSeriesBase(jsBase + ".getSeries("+ id7+")");
        getGetSeries.add(item);
        return item;
    }

    private List<MapSeriesBase> getGetSeries1 = new ArrayList<>();

    /**
     * Getter for the series by its id.
     */
    public MapSeriesBase getGetSeries(String id8) {
        MapSeriesBase item = new MapSeriesBase(jsBase + ".getSeries("+ wrapQuotes(id8)+")");
        getGetSeries1.add(item);
        return item;
    }

    private List<MapSeriesBase> getGetSeriesAt = new ArrayList<>();

    /**
     * Getter for the series by its index.
     */
    public MapSeriesBase getGetSeriesAt(Number index2) {
        MapSeriesBase item = new MapSeriesBase(jsBase + ".getSeriesAt("+ index2+")");
        getGetSeriesAt.add(item);
        return item;
    }

    private GridsMapSettings getGrids;

    /**
     * Getter for map grids.
     */
    public GridsMapSettings getGrids() {
        if (getGrids == null)
            getGrids = new GridsMapSettings(jsBase + ".grids()");

        return getGrids;
    }
    private String grids;
    private Boolean grids1;

    /**
     * Setter for map grids.
     */
    public ChartsMap setGrids(String grids) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grids(%s)", wrapQuotes(grids)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".grids(%s)", wrapQuotes(grids)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for map grids.
     */
    public ChartsMap setGrids(Boolean grids1) {
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


    private HatchFills getHatchFillPalette;

    /**
     * Getter for the current map hatch fill palette settings.
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
     * Setter for the map hatch fill palette settings.
     */
    public ChartsMap setHatchFillPalette(HatchFillType[] hatchFillPalette) {
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
     * Setter for the map hatch fill palette settings.
     */
    public ChartsMap setHatchFillPalette(String hatchFillPalette1) {
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
     * Setter for the map hatch fill palette settings.
     */
    public ChartsMap setHatchFillPalette(HatchFills hatchFillPalette2) {
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
    public ChartsMap setHovered(String hovered) {
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

    private Number x;
    private Number y;

    /**
     * Transforms local pixel coordinates to latitude/longitude values.
     */
    public void inverseTransform(Number x, Number y) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".inverseTransform(%s, %s);", x, y));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverseTransform(%s, %s)", x, y));
            js.setLength(0);
        }
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
    public ChartsMap setLabels(String labels) {
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
    public ChartsMap setLabels(Boolean labels1) {
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

    private List<MapSeriesMarker> setMarker = new ArrayList<>();

    /**
     * Creates a Marker series.
     */
    public MapSeriesMarker marker(List<DataEntry> data) {
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

    /**
     * 
     */
    public MapSeriesMarker marker(View view) {
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


    private Markers getMarkerPalette;

    /**
     * Getter for the current map markers palette settings.
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
     * Setter for the map markers palette settings.
     */
    public ChartsMap setMarkerPalette(Markers markerPalette) {
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
     * Setter for the map markers palette settings.
     */
    public ChartsMap setMarkerPalette(String markerPalette1) {
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
     * Setter for the map markers palette settings.
     */
    public ChartsMap setMarkerPalette(MarkerType[] markerPalette2) {
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
     * Setter for the map markers palette settings.
     */
    public ChartsMap setMarkerPalette(String[] markerPalette3) {
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

    private Number maxBubbleSize;
    private String maxBubbleSize1;

    /**
     * Setter for the maximum size for all bubbles on the charts.
     */
    public ChartsMap setMaxBubbleSize(Number maxBubbleSize) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxBubbleSize(%s)", maxBubbleSize));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxBubbleSize(%s)", maxBubbleSize));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the maximum size for all bubbles on the charts.
     */
    public ChartsMap setMaxBubbleSize(String maxBubbleSize1) {
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

    private Number maxZoomLevel;

    /**
     * Setter for the maximum zoom level.
     */
    public ChartsMap setMaxZoomLevel(Number maxZoomLevel) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".maxZoomLevel(%s)", maxZoomLevel));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".maxZoomLevel(%s)", maxZoomLevel));
            js.setLength(0);
        }
        return this;
    }

    private Number minBubbleSize;
    private String minBubbleSize1;

    /**
     * Setter for the minimum size for all bubbles on the charts.
     */
    public ChartsMap setMinBubbleSize(Number minBubbleSize) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minBubbleSize(%s)", minBubbleSize));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minBubbleSize(%s)", minBubbleSize));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the minimum size for all bubbles on the charts.
     */
    public ChartsMap setMinBubbleSize(String minBubbleSize1) {
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

    private Number dx1;
    private Number dy1;

    /**
     * Moves focus point for the map.<br/>
<b>Note:</b> Works only with {@link anychart.charts.Map#zoom}
     */
    public ChartsMap move(Number dx1, Number dy1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".move(%s, %s)", dx1, dy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".move(%s, %s)", dx1, dy1));
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
    public ChartsMap setNormal(String normal) {
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

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private Boolean overlapMode2;

    /**
     * Setter for labels overlap mode.
     */
    public ChartsMap setOverlapMode(LabelsOverlapMode overlapMode) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".overlapMode(%s)", ((overlapMode != null) ? overlapMode.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%s)", ((overlapMode != null) ? overlapMode.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for labels overlap mode.
     */
    public ChartsMap setOverlapMode(String overlapMode1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".overlapMode(%s)", wrapQuotes(overlapMode1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%s)", wrapQuotes(overlapMode1)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for labels overlap mode.
     */
    public ChartsMap setOverlapMode(Boolean overlapMode2) {
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


    private RangeColors getPalette;

    /**
     * Getter for the current map palette.
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
     * Setter for the map palette.
     */
    public ChartsMap setPalette(RangeColors palette) {
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
     * Setter for the map palette.
     */
    public ChartsMap setPalette(DistinctColors palette1) {
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
     * Setter for the map palette.
     */
    public ChartsMap setPalette(String palette2) {
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
     * Setter for the map palette.
     */
    public ChartsMap setPalette(String[] palette3) {
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

    private Number id9;
    private String id10;

    /**
     * Removes one of series from chart by its id.
     */
    public ChartsMap removeSeries(Number id9) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeries(%s)", id9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%s)", id9));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Removes one of series from chart by its id.
     */
    public ChartsMap removeSeries(String id10) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeries(%s)", wrapQuotes(id10)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeries(%s)", wrapQuotes(id10)));
            js.setLength(0);
        }
        return this;
    }

    private Number index3;

    /**
     * Removes one of series from chart by its index.
     */
    public ChartsMap removeSeriesAt(Number index3) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeriesAt(%s)", index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeriesAt(%s)", index3));
            js.setLength(0);
        }
        return this;
    }


    private Geo getScale;

    /**
     * Getter for the map geo scale.
     */
    public Geo getScale() {
        if (getScale == null)
            getScale = new Geo(jsBase + ".scale()");

        return getScale;
    }
    private Geo scale;
    private String scale1;
    private List<Geo> setScale = new ArrayList<>();

    /**
     * Setter for the map geo scale.
     */
    public Geo setScale(Geo scale) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(scale.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".scale(%s);",  ((scale != null) ? scale.getJsBase() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s)", ((scale != null) ? scale.getJsBase() : "null")));
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

    /**
     * Setter for the map geo scale.
     */
    public Geo setScale(String scale1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setScale1" + ++variableIndex + " = " + jsBase + ".scale(%s);", wrapQuotes(scale1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s)", wrapQuotes(scale1)));
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
    public ChartsMap setSelected(String selected) {
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

    private Number xLong;
    private Number yLat;

    /**
     * Returns coordinate at given latitude and longitude as pixel values relative to a map bounds.<br/>
<b>Note:</b> Returns correct values only after {@link anychart.charts.Map#draw} is called.
     */
    public void transform(Number xLong, Number yLat) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".transform(%s, %s);", xLong, yLat));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".transform(%s, %s)", xLong, yLat));
            js.setLength(0);
        }
    }

    private String id11;
    private Number dx2;
    private Number dy2;

    /**
     * Translates feature on passed dx and dy.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChartsMap translateFeature(String id11, Number dx2, Number dy2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".translateFeature(%s, %s, %s)", wrapQuotes(id11), dx2, dy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".translateFeature(%s, %s, %s)", wrapQuotes(id11), dx2, dy2));
            js.setLength(0);
        }
        return this;
    }


    private UnboundRegionsSettings getUnboundRegions;

    /**
     * Getter for the current settings for the unbound regions.
     */
    public UnboundRegionsSettings getUnboundRegions() {
        if (getUnboundRegions == null)
            getUnboundRegions = new UnboundRegionsSettings(jsBase + ".unboundRegions()");

        return getUnboundRegions;
    }
    private String unboundRegions;
    private MapUnboundRegionsMode unboundRegions1;
    private String unboundRegions2;
    private Boolean unboundRegions3;

    /**
     * Setter for the settings for regions that are not linked to any series data.
     */
    public ChartsMap setUnboundRegions(String unboundRegions) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unboundRegions(%s)", wrapQuotes(unboundRegions)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unboundRegions(%s)", wrapQuotes(unboundRegions)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the settings for regions that are not linked to any series data.
     */
    public ChartsMap setUnboundRegions(MapUnboundRegionsMode unboundRegions1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unboundRegions(%s)", ((unboundRegions1 != null) ? unboundRegions1.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unboundRegions(%s)", ((unboundRegions1 != null) ? unboundRegions1.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the settings for regions that are not linked to any series data.
     */
    public ChartsMap setUnboundRegions(Boolean unboundRegions3) {
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

    private Number zoom;
    private Number cx;
    private Number cy;
    private Number duration1;

    /**
     * Zooms a map.
     */
    public ChartsMap zoom(Number zoom, Number cx, Number cy, Number duration1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoom(%s, %s, %s, %s)", zoom, cx, cy, duration1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoom(%s, %s, %s, %s)", zoom, cx, cy, duration1));
            js.setLength(0);
        }
        return this;
    }

    private Number zoomTo;
    private Number cx1;
    private Number cy1;

    /**
     * Zooms the map to passed zoom level and coordinates.
     */
    public ChartsMap zoomTo(Number zoomTo, Number cx1, Number cy1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomTo(%s, %s, %s)", zoomTo, cx1, cy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomTo(%s, %s, %s)", zoomTo, cx1, cy1));
            js.setLength(0);
        }
        return this;
    }

    private String id12;

    /**
     * Zoom to feature by passed id.
     */
    public void zoomToFeature(String id12) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".zoomToFeature(%s);", wrapQuotes(id12)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomToFeature(%s)", wrapQuotes(id12)));
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
        js.append(generateJSsetBubble());
        js.append(generateJSsetBubble1());
        js.append(generateJSsetChoropleth());
        js.append(generateJSsetChoropleth1());
        js.append(generateJSsetConnector());
        js.append(generateJSsetConnector1());
        js.append(generateJSsetMarker());
        js.append(generateJSsetMarker1());
        js.append(generateJSsetScale());
        js.append(generateJSsetScale1());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}