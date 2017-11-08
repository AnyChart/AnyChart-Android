package com.anychart.anychart;

import com.anychart.anychart.application.MyApplication;
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

    public ChartsMap setData(SingleValueDataSet data) {
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

    public ChartsMap setData(List<DataEntry> data) {
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

    public ChartsMap setData(List<DataEntry> data, TreeFillingMethod mode) {
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

        MyApplication.getInstance().getJavaScriptInterface().setOnClickListener(listener);
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
    private List<ChartsMap> setAxes = new ArrayList<>();

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
    public Callout getCallout(Double index) {
        Callout item = new Callout(jsBase + ".callout("+ index+")");
        getCallout1.add(item);
        return item;
    }
    private String callout;
    private Boolean callout1;
    private List<ChartsMap> setCallout = new ArrayList<>();

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

    /**
     * Setter for callout elements by index.
     */
    public ChartsMap setCallout(String callout2, Double index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".callout(%s, %f)", wrapQuotes(callout2), index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".callout(%s, %f)", wrapQuotes(callout2), index1));
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

    /**
     * Setter for callout elements by index.
     */
    public ChartsMap setCallout(Boolean callout3, Double index1) {
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
    private List<ChartsMap> setColorRange = new ArrayList<>();

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

    private List<Connector> setConnector = new ArrayList<>();

    /**
     * Creates connector series.
     */
    public Connector connector(List<DataEntry> data) {
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
    private List<ChartsMap> setCrosshair = new ArrayList<>();

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
    private Double duration;
    private List<ChartsMap> setCrsAnimation = new ArrayList<>();

    /**
     * Setter for animation settings.
     */
    public ChartsMap setCrsAnimation(Boolean crsAnimation, Double duration) {
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

    /**
     * Setter for animation settings.
     */
    public ChartsMap setCrsAnimation(String crsAnimation1, Double duration) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crsAnimation(%s, %f)", wrapQuotes(crsAnimation1), duration));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crsAnimation(%s, %f)", wrapQuotes(crsAnimation1), duration));
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
    private List<ChartsMap> setDrillTo = new ArrayList<>();

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

    /**
     * Setter for the feature scale factor.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChartsMap setFeatureScaleFactor(String id4, Double ratio) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".featureScaleFactor(%s, %f)", wrapQuotes(id4), ratio));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".featureScaleFactor(%s, %f)", wrapQuotes(id4), ratio));
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

    /**
     * Setter for the translation feature.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChartsMap setFeatureTranslation(String id6, Double dx, Double dy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".featureTranslation(%s, %f, %f)", wrapQuotes(id6), dx, dy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".featureTranslation(%s, %f, %f)", wrapQuotes(id6), dx, dy));
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

    /**
     * Setter for the geo data.
     */
    public void setGeoData(String data12, String data13) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".geoData(%s, %s);", wrapQuotes(data12), wrapQuotes(data13)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".geoData(%s, %s)", wrapQuotes(data12), wrapQuotes(data13)));
            js.setLength(0);
        }
    }

    private String geoIdField;
    private List<ChartsMap> setGeoIdField = new ArrayList<>();

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
    public MapSeriesBase getGetSeries(Double id7) {
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
    public MapSeriesBase getGetSeriesAt(Double index2) {
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
    private List<ChartsMap> setGrids = new ArrayList<>();

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
    private List<ChartsMap> setHatchFillPalette = new ArrayList<>();

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

    /**
     * Getter for hovered state settings.
     */
    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }
    private String hovered;
    private List<ChartsMap> setHovered = new ArrayList<>();

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

    /**
     * Transforms local pixel coordinates to latitude/longitude values.
     */
    public void inverseTransform(Double x, Double y) {
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
    private List<ChartsMap> setLabels = new ArrayList<>();

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
    private List<ChartsMap> setMarkerPalette = new ArrayList<>();

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

    /**
     * Setter for the maximum size for all bubbles on the charts.
     */
    public ChartsMap setMaxBubbleSize(Double maxBubbleSize) {
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

    /**
     * Setter for the maximum zoom level.
     */
    public ChartsMap setMaxZoomLevel(Double maxZoomLevel) {
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

    /**
     * Setter for the minimum size for all bubbles on the charts.
     */
    public ChartsMap setMinBubbleSize(Double minBubbleSize) {
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

    /**
     * Moves focus point for the map.<br/>
<b>Note:</b> Works only with {@link anychart.charts.Map#zoom}
     */
    public ChartsMap move(Double dx1, Double dy1) {
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

    /**
     * Getter for normal state settings.
     */
    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }
    private String normal;
    private List<ChartsMap> setNormal = new ArrayList<>();

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
    private List<ChartsMap> setPalette = new ArrayList<>();

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

    /**
     * Removes one of series from chart by its id.
     */
    public ChartsMap removeSeries(Double id9) {
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

    /**
     * Removes one of series from chart by its index.
     */
    public ChartsMap removeSeriesAt(Double index3) {
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
    private List<ChartsMap> setSelected = new ArrayList<>();

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

    /**
     * Returns coordinate at given latitude and longitude as pixel values relative to a map bounds.<br/>
<b>Note:</b> Returns correct values only after {@link anychart.charts.Map#draw} is called.
     */
    public void transform(Double xLong, Double yLat) {
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

    /**
     * Translates feature on passed dx and dy.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChartsMap translateFeature(String id11, Double dx2, Double dy2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".translateFeature(%s, %f, %f)", wrapQuotes(id11), dx2, dy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".translateFeature(%s, %f, %f)", wrapQuotes(id11), dx2, dy2));
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
    private List<ChartsMap> setUnboundRegions = new ArrayList<>();

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

    /**
     * Zooms a map.
     */
    public ChartsMap zoom(Double zoom, Double cx, Double cy, Double duration1) {
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

    /**
     * Zooms the map to passed zoom level and coordinates.
     */
    public ChartsMap zoomTo(Double zoomTo, Double cx1, Double cy1) {
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
        js.append(generateJSsetAxes());
        js.append(generateJSsetAxes1());
        js.append(generateJSsetBubble());
        js.append(generateJSsetCallout());
        js.append(generateJSsetCallout1());
        js.append(generateJSsetCallout2());
        js.append(generateJSsetCallout3());
        js.append(generateJSsetChoropleth());
        js.append(generateJSsetColorRange());
        js.append(generateJSsetConnector());
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