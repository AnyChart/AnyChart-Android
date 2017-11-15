package com.anychart.anychart;

import com.anychart.anychart.application.MyApplication;
import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// chart class
/**
 * Bullet chart class.<br/>
<b>Note:</b> Use {@link anychart#bullet} method to get an instance of this class.
 */
public class Bullet extends Chart {

    protected Bullet(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    public Bullet setData(SingleValueDataSet data) {
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

    public Bullet setData(List<DataEntry> data) {
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

    public Bullet setData(List<DataEntry> data, TreeFillingMethod mode) {
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

    public Bullet setData(Mapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(mapping.generateJs());

        js.append(jsBase).append(".data(").append(mapping.getJsBase()).append(");");

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

    

    private CoreAxesLinear getAxis;

    /**
     * Getter for the current bullet chart axis settings.
     */
    public CoreAxesLinear getAxis() {
        if (getAxis == null)
            getAxis = new CoreAxesLinear(jsBase + ".axis()");

        return getAxis;
    }
    private String axis;
    private Boolean axis1;
    private List<Bullet> setAxis = new ArrayList<>();

    /**
     * Setter for the bullet chart axis settings.
     */
    public Bullet setAxis(String axis) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%s)", wrapQuotes(axis)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%s)", wrapQuotes(axis)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAxis() {
        if (!setAxis.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setAxis) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setAxis1 = new ArrayList<>();

    /**
     * Setter for the bullet chart axis settings.
     */
    public Bullet setAxis(Boolean axis1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".axis(%b)", axis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".axis(%b)", axis1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetAxis1() {
        if (!setAxis1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setAxis1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private View getData;

    /**
     * Getter for the current chart data.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }
    private List<Bullet> setData = new ArrayList<>();

    /**
     * Setter for the chart data.<br/>
<b>Note:</b> All data is markers values.
     */
    public Bullet data(List<DataEntry> data) {
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
            for (Bullet item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Layout layout;
    private String layout1;
    private List<Bullet> setLayout = new ArrayList<>();

    /**
     * Setter for the chart layout.
     */
    public Bullet setLayout(Layout layout) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".layout(%s)", ((layout != null) ? layout.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", ((layout != null) ? layout.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLayout() {
        if (!setLayout.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setLayout) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setLayout1 = new ArrayList<>();

    /**
     * Setter for the chart layout.
     */
    public Bullet setLayout(String layout1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".layout(%s)", wrapQuotes(layout1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", wrapQuotes(layout1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetLayout1() {
        if (!setLayout1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setLayout1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Markers getMarkerPalette;

    /**
     * Getter for the current markers palette settings.
     */
    public Markers getMarkerPalette() {
        if (getMarkerPalette == null)
            getMarkerPalette = new Markers(jsBase + ".markerPalette()");

        return getMarkerPalette;
    }
    private MarkerType[] markerPalette;
    private String[] markerPalette1;
    private String markerPalette2;
    private Markers markerPalette3;
    private List<Bullet> setMarkerPalette = new ArrayList<>();

    /**
     * Setter for the markers palette settings.<br/>
<b>Note:</b> Markers sets in data().
     */
    public Bullet setMarkerPalette(MarkerType[] markerPalette) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToString(markerPalette)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette() {
        if (!setMarkerPalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setMarkerPalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setMarkerPalette1 = new ArrayList<>();

    /**
     * Setter for the markers palette settings.<br/>
<b>Note:</b> Markers sets in data().
     */
    public Bullet setMarkerPalette(String[] markerPalette1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", arrayToStringWrapQuotes(markerPalette1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", arrayToStringWrapQuotes(markerPalette1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette1() {
        if (!setMarkerPalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setMarkerPalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setMarkerPalette2 = new ArrayList<>();

    /**
     * Setter for the markers palette settings.<br/>
<b>Note:</b> Markers sets in data().
     */
    public Bullet setMarkerPalette(String markerPalette2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".markerPalette(%s)", wrapQuotes(markerPalette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", wrapQuotes(markerPalette2)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMarkerPalette2() {
        if (!setMarkerPalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setMarkerPalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setMarkerPalette3 = new ArrayList<>();

    /**
     * Setter for the markers palette settings.<br/>
<b>Note:</b> Markers sets in data().
     */
    public Bullet setMarkerPalette(Markers markerPalette3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(markerPalette3.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".markerPalette(%s);",  ((markerPalette3 != null) ? markerPalette3.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetMarkerPalette3() {
        if (!setMarkerPalette3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setMarkerPalette3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxismarkersRange getRange;

    /**
     * Getter for the current bullet chart ranges settings.
     */
    public CoreAxismarkersRange getRange() {
        if (getRange == null)
            getRange = new CoreAxismarkersRange(jsBase + ".range()");

        return getRange;
    }

    private List<CoreAxismarkersRange> getRange1 = new ArrayList<>();

    /**
     * Getter for the current bullet chart ranges settings.
     */
    public CoreAxismarkersRange getRange(Double index) {
        CoreAxismarkersRange item = new CoreAxismarkersRange(jsBase + ".range("+ index+")");
        getRange1.add(item);
        return item;
    }
    private String range;
    private Boolean range1;
    private List<Bullet> setRange = new ArrayList<>();

    /**
     * Setter for the bullet chart first range settings.
     */
    public Bullet setRange(String range) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%s)", wrapQuotes(range)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%s)", wrapQuotes(range)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRange() {
        if (!setRange.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRange) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setRange1 = new ArrayList<>();

    /**
     * Setter for the bullet chart first range settings.
     */
    public Bullet setRange(Boolean range1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%b)", range1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%b)", range1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRange1() {
        if (!setRange1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRange1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private String range2;
    private Boolean range3;
    private List<Bullet> setRange2 = new ArrayList<>();

    /**
     * Setter for bullet chart ranges settings.
     */
    public Bullet setRange(String range2, Double index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%s, %f)", wrapQuotes(range2), index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%s, %f)", wrapQuotes(range2), index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRange2() {
        if (!setRange2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRange2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setRange3 = new ArrayList<>();

    /**
     * Setter for bullet chart ranges settings.
     */
    public Bullet setRange(Boolean range3, Double index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%b, %f)", range3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%b, %f)", range3, index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRange3() {
        if (!setRange3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRange3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private DistinctColors getRangePalette;

    /**
     * Getter for the current range palette settings.
     */
    public DistinctColors getRangePalette() {
        if (getRangePalette == null)
            getRangePalette = new DistinctColors(jsBase + ".rangePalette()");

        return getRangePalette;
    }
    private DistinctColors rangePalette;
    private String rangePalette1;
    private String[] rangePalette2;
    private List<Bullet> setRangePalette = new ArrayList<>();

    /**
     * Setter for the range palette settings.
     */
    public Bullet setRangePalette(DistinctColors rangePalette) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(rangePalette.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".rangePalette(%s);",  ((rangePalette != null) ? rangePalette.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetRangePalette() {
        if (!setRangePalette.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRangePalette) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setRangePalette1 = new ArrayList<>();

    /**
     * Setter for the range palette settings.
     */
    public Bullet setRangePalette(String rangePalette1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangePalette(%s)", wrapQuotes(rangePalette1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangePalette(%s)", wrapQuotes(rangePalette1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangePalette1() {
        if (!setRangePalette1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRangePalette1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setRangePalette2 = new ArrayList<>();

    /**
     * Setter for the range palette settings.
     */
    public Bullet setRangePalette(String[] rangePalette2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangePalette(%s)", arrayToStringWrapQuotes(rangePalette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangePalette(%s)", arrayToStringWrapQuotes(rangePalette2)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetRangePalette2() {
        if (!setRangePalette2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setRangePalette2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private ScalesBase getScale;

    /**
     * Getter for default bullet chart scale settings.
     */
    public ScalesBase getScale() {
        if (getScale == null)
            getScale = new ScalesBase(jsBase + ".scale()");

        return getScale;
    }
    private ScalesBase scale;
    private String scale1;
    private ScaleTypes scale2;
    private String scale3;
    private List<Bullet> setScale = new ArrayList<>();

    /**
     * Setter for the bullet chart scale settings.
     */
    public Bullet setScale(ScalesBase scale) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(scale.generateJs());
        js.append(jsBase);

        js.append(String.format(Locale.US, ".scale(%s);",  ((scale != null) ? scale.getJsBase() : "null")));
        return this;
    }
    private String generateJSsetScale() {
        if (!setScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setScale1 = new ArrayList<>();

    /**
     * Setter for the bullet chart scale settings.
     */
    public Bullet setScale(String scale1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scale(%s)", wrapQuotes(scale1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", wrapQuotes(scale1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScale1() {
        if (!setScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Bullet> setScale2 = new ArrayList<>();

    /**
     * Setter for the bullet chart scale settings.
     */
    public Bullet setScale(ScaleTypes scale2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scale(%s)", ((scale2 != null) ? scale2.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", ((scale2 != null) ? scale2.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScale2() {
        if (!setScale2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Bullet item : setScale2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetAxis() {
        if (getAxis != null) {
            return getAxis.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkerPalette() {
        if (getMarkerPalette != null) {
            return getMarkerPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetRange() {
        if (getRange != null) {
            return getRange.generateJs();
        }
        return "";
    }

    private String generateJSgetRange1() {
        if (!getRange1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CoreAxismarkersRange item : getRange1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetRangePalette() {
        if (getRangePalette != null) {
            return getRangePalette.generateJs();
        }
        return "";
    }

    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetAxis());
        js.append(generateJSgetData());
        js.append(generateJSgetMarkerPalette());
        js.append(generateJSgetRange());
        js.append(generateJSgetRange1());
        js.append(generateJSgetRangePalette());
        js.append(generateJSgetScale());
        js.append(generateJSsetAxis());
        js.append(generateJSsetAxis1());
        js.append(generateJSsetData());
        js.append(generateJSsetLayout());
        js.append(generateJSsetLayout1());
        js.append(generateJSsetMarkerPalette());
        js.append(generateJSsetMarkerPalette1());
        js.append(generateJSsetMarkerPalette2());
        js.append(generateJSsetMarkerPalette3());
        js.append(generateJSsetRange());
        js.append(generateJSsetRange1());
        js.append(generateJSsetRange2());
        js.append(generateJSsetRange3());
        js.append(generateJSsetRangePalette());
        js.append(generateJSsetRangePalette1());
        js.append(generateJSsetRangePalette2());
        js.append(generateJSsetScale());
        js.append(generateJSsetScale1());
        js.append(generateJSsetScale2());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}