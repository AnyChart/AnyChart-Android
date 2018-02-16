package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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


    private View getData;

    /**
     * Getter for the current chart data.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for the chart data.<br/>
<b>Note:</b> All data is markers values.
     */
    public Bullet setData(List<DataEntry> data) {
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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        return this;
    }


    /**
     * 
     */
    public Bullet setData(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setData1" + ++variableIndex + " = " + jsBase + ".data(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", view.getJsBase()));
            js.setLength(0);
        }
        return this;
    }

    private Layout layout;
    private String layout1;

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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".markerPalette(%s)", ((markerPalette3 != null) ? markerPalette3.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
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
    public CoreAxismarkersRange getRange(Number index) {
        CoreAxismarkersRange item = new CoreAxismarkersRange(jsBase + ".range("+ index+")");
        getRange1.add(item);
        return item;
    }
    private String range;
    private Boolean range1;

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

    private Number index1;
    private String range2;
    private Boolean range3;

    /**
     * Setter for bullet chart ranges settings.
     */
    public Bullet setRange(String range2, Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%s, %s)", wrapQuotes(range2), index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%s, %s)", wrapQuotes(range2), index1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for bullet chart ranges settings.
     */
    public Bullet setRange(Boolean range3, Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".range(%b, %s)", range3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".range(%b, %s)", range3, index1));
            js.setLength(0);
        }
        return this;
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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangePalette(%s)", ((rangePalette != null) ? rangePalette.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


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

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scale(%s)", ((scale != null) ? scale.getJsBase() : "null")));
            js.setLength(0);
        }
        return this;
    }


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

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}