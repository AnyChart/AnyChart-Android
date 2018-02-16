package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * Cartesian chart class.<br/>
To get the chart use any of these methods:
 <ul>
     <li>{@link anychart#cartesian}</li>
     <li>{@link anychart#area}</li>
     <li>{@link anychart#bar}</li>
     <li>{@link anychart#column}</li>
     <li>{@link anychart#financial}</li>
     <li>{@link anychart#line}</li>
 </ul>
Chart can contain any number of series.
Each series is interactive, you can customize click and hover behavior and other parameters.
 */
public class Cartesian extends SeparateChart {

    protected Cartesian(String name) {
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

    /**
     * Setter for the annotations.
     */
    public Cartesian setAnnotations(String[] annotationsList) {
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

    private List<CartesianSeriesArea> setArea = new ArrayList<>();

    /**
     * Adds Area series.
     */
    public CartesianSeriesArea area(List<DataEntry> data) {
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
        CartesianSeriesArea item = new CartesianSeriesArea("setArea" + variableIndex);
        setArea.add(item);
        return item;
    }
    private String generateJSsetArea() {
        if (!setArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesArea item : setArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesArea> setArea1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesArea area(View view) {
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
        CartesianSeriesArea item = new CartesianSeriesArea("setArea1" + variableIndex);
        setArea1.add(item);
        return item;
    }
    private String generateJSsetArea1() {
        if (!setArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesArea item : setArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar = new ArrayList<>();

    /**
     * Adds Bar series.
     */
    public SeriesBar bar(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setBar" + ++variableIndex + " = " + jsBase + ".bar(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        SeriesBar item = new SeriesBar("setBar" + variableIndex);
        setBar.add(item);
        return item;
    }
    private String generateJSsetBar() {
        if (!setBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesBar> setBar1 = new ArrayList<>();

    /**
     * 
     */
    public SeriesBar bar(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setBar1" + ++variableIndex + " = " + jsBase + ".bar(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".bar(%s);", view.getJsBase()));
            js.setLength(0);
        }
        SeriesBar item = new SeriesBar("setBar1" + variableIndex);
        setBar1.add(item);
        return item;
    }
    private String generateJSsetBar1() {
        if (!setBar1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesBar item : setBar1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number barGroupsPadding;

    /**
     * Setter for the space between bar groups on the ordinal scale by ratio of bars width.<br/>
See illustration at {@link anychart.charts.Cartesian#barsPadding}.
     */
    public Cartesian setBarGroupsPadding(Number barGroupsPadding) {
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
     * Setter for the space between bars on the ordinal scale by ratio of bars width.</br>
<img src='https://api.anychart.com/si/8.1.0/anychart.charts.Cartesian.barsPadding.png' width='396' height='294'/>
     */
    public Cartesian setBarsPadding(Number barsPadding) {
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

    private List<Box> setBox = new ArrayList<>();

    /**
     * Adds Box series.
     */
    public Box box(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setBox" + ++variableIndex + " = " + jsBase + ".box(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        Box item = new Box("setBox" + variableIndex);
        setBox.add(item);
        return item;
    }
    private String generateJSsetBox() {
        if (!setBox.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Box> setBox1 = new ArrayList<>();

    /**
     * 
     */
    public Box box(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setBox1" + ++variableIndex + " = " + jsBase + ".box(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".box(%s);", view.getJsBase()));
            js.setLength(0);
        }
        Box item = new Box("setBox1" + variableIndex);
        setBox1.add(item);
        return item;
    }
    private String generateJSsetBox1() {
        if (!setBox1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Box item : setBox1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble = new ArrayList<>();

    /**
     * Adds Bubble series.
     */
    public CartesianSeriesBubble bubble(List<DataEntry> data) {
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
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble" + variableIndex);
        setBubble.add(item);
        return item;
    }
    private String generateJSsetBubble() {
        if (!setBubble.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesBubble> setBubble1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesBubble bubble(View view) {
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
        CartesianSeriesBubble item = new CartesianSeriesBubble("setBubble1" + variableIndex);
        setBubble1.add(item);
        return item;
    }
    private String generateJSsetBubble1() {
        if (!setBubble1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBubble item : setBubble1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick = new ArrayList<>();

    /**
     * Adds Candlestick series.
     */
    public CartesianSeriesCandlestick candlestick(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setCandlestick" + ++variableIndex + " = " + jsBase + ".candlestick(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick" + variableIndex);
        setCandlestick.add(item);
        return item;
    }
    private String generateJSsetCandlestick() {
        if (!setCandlestick.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesCandlestick> setCandlestick1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesCandlestick candlestick(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setCandlestick1" + ++variableIndex + " = " + jsBase + ".candlestick(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".candlestick(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesCandlestick item = new CartesianSeriesCandlestick("setCandlestick1" + variableIndex);
        setCandlestick1.add(item);
        return item;
    }
    private String generateJSsetCandlestick1() {
        if (!setCandlestick1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesCandlestick item : setCandlestick1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn = new ArrayList<>();

    /**
     * Adds Column series.
     */
    public CartesianSeriesColumn column(List<DataEntry> data) {
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
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn" + variableIndex);
        setColumn.add(item);
        return item;
    }
    private String generateJSsetColumn() {
        if (!setColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesColumn> setColumn1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesColumn column(View view) {
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
        CartesianSeriesColumn item = new CartesianSeriesColumn("setColumn1" + variableIndex);
        setColumn1.add(item);
        return item;
    }
    private String generateJSsetColumn1() {
        if (!setColumn1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesColumn item : setColumn1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Crosshair getCrosshair;

    /**
     * Getter for the current crosshair settings.
     */
    public Crosshair getCrosshair() {
        if (getCrosshair == null)
            getCrosshair = new Crosshair(jsBase + ".crosshair()");

        return getCrosshair;
    }
    private String crosshair;
    private Boolean crosshair1;

    /**
     * Setter for the crosshair settings.
     */
    public Cartesian setCrosshair(String crosshair) {
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
     * Setter for the crosshair settings.
     */
    public Cartesian setCrosshair(Boolean crosshair1) {
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


    private View getData;

    /**
     * Getter for the data.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for the data.
     */
    public Cartesian setData(List<DataEntry> data) {
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
    public Cartesian setData(View view) {
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

    private CartesianSeriesType defaultSeriesType;
    private String defaultSeriesType1;

    /**
     * Setter for the default series type.
     */
    public Cartesian setDefaultSeriesType(CartesianSeriesType defaultSeriesType) {
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
     * Setter for the default series type.
     */
    public Cartesian setDefaultSeriesType(String defaultSeriesType1) {
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
     * Getter for the current data bounds of the chart.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} is called.
     */
    public AnychartMathRect getGetPlotBounds() {
        if (getGetPlotBounds == null)
            getGetPlotBounds = new AnychartMathRect(jsBase + ".getPlotBounds()");

        return getGetPlotBounds;
    }

    private List<CartesianSeriesBase> getGetSeries = new ArrayList<>();

    /**
     * Getter for the series by its id.
     */
    public CartesianSeriesBase getGetSeries(Number id) {
        CartesianSeriesBase item = new CartesianSeriesBase(jsBase + ".getSeries("+ id+")");
        getGetSeries.add(item);
        return item;
    }

    private List<CartesianSeriesBase> getGetSeries1 = new ArrayList<>();

    /**
     * Getter for the series by its id.
     */
    public CartesianSeriesBase getGetSeries(String id1) {
        CartesianSeriesBase item = new CartesianSeriesBase(jsBase + ".getSeries("+ wrapQuotes(id1)+")");
        getGetSeries1.add(item);
        return item;
    }

    private List<CartesianSeriesBase> getGetSeriesAt = new ArrayList<>();

    /**
     * Getter for the series by its index.
     */
    public CartesianSeriesBase getGetSeriesAt(Number index) {
        CartesianSeriesBase item = new CartesianSeriesBase(jsBase + ".getSeriesAt("+ index+")");
        getGetSeriesAt.add(item);
        return item;
    }

    private HatchFills getHatchFillPalette;

    /**
     * Getter for the current hatch fill palette settings.
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
    public Cartesian setHatchFillPalette(HatchFillType[] hatchFillPalette) {
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
    public Cartesian setHatchFillPalette(String hatchFillPalette1) {
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
    public Cartesian setHatchFillPalette(HatchFills hatchFillPalette2) {
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

    private List<CartesianSeriesHilo> setHilo = new ArrayList<>();

    /**
     * Adds HiLo series.
     */
    public CartesianSeriesHilo hilo(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setHilo" + ++variableIndex + " = " + jsBase + ".hilo(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo" + variableIndex);
        setHilo.add(item);
        return item;
    }
    private String generateJSsetHilo() {
        if (!setHilo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesHilo> setHilo1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesHilo hilo(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setHilo1" + ++variableIndex + " = " + jsBase + ".hilo(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".hilo(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesHilo item = new CartesianSeriesHilo("setHilo1" + variableIndex);
        setHilo1.add(item);
        return item;
    }
    private String generateJSsetHilo1() {
        if (!setHilo1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesHilo item : setHilo1) {
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

    /**
     * Setter for hovered state settings.
     */
    public Cartesian setHovered(String hovered) {
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

    private Boolean isVertical;

    /**
     * Setter for the layout direction.
     */
    public Cartesian setIsVertical(Boolean isVertical) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".isVertical(%b)", isVertical));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".isVertical(%b)", isVertical));
            js.setLength(0);
        }
        return this;
    }

    private List<CartesianSeriesJumpLine> setJumpLine = new ArrayList<>();

    /**
     * Adds Jump Line series.
     */
    public CartesianSeriesJumpLine jumpLine(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setJumpLine" + ++variableIndex + " = " + jsBase + ".jumpLine(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine" + variableIndex);
        setJumpLine.add(item);
        return item;
    }
    private String generateJSsetJumpLine() {
        if (!setJumpLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesJumpLine> setJumpLine1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesJumpLine jumpLine(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setJumpLine1" + ++variableIndex + " = " + jsBase + ".jumpLine(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".jumpLine(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesJumpLine item = new CartesianSeriesJumpLine("setJumpLine1" + variableIndex);
        setJumpLine1.add(item);
        return item;
    }
    private String generateJSsetJumpLine1() {
        if (!setJumpLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesJumpLine item : setJumpLine1) {
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

    /**
     * Setter for series data labels.
     */
    public Cartesian setLabels(String labels) {
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
    public Cartesian setLabels(Boolean labels1) {
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

    private List<CartesianSeriesLine> setLine = new ArrayList<>();

    /**
     * Adds Line series.
     */
    public CartesianSeriesLine line(List<DataEntry> data) {
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
        CartesianSeriesLine item = new CartesianSeriesLine("setLine" + variableIndex);
        setLine.add(item);
        return item;
    }
    private String generateJSsetLine() {
        if (!setLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesLine> setLine1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesLine line(View view) {
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
        CartesianSeriesLine item = new CartesianSeriesLine("setLine1" + variableIndex);
        setLine1.add(item);
        return item;
    }
    private String generateJSsetLine1() {
        if (!setLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesLine item : setLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxismarkersLine getLineMarker;

    /**
     * Getter for the current line marker.
     */
    public CoreAxismarkersLine getLineMarker() {
        if (getLineMarker == null)
            getLineMarker = new CoreAxismarkersLine(jsBase + ".lineMarker()");

        return getLineMarker;
    }

    private List<CoreAxismarkersLine> getLineMarker1 = new ArrayList<>();

    /**
     * Getter for the current line marker.
     */
    public CoreAxismarkersLine getLineMarker(Number index1) {
        CoreAxismarkersLine item = new CoreAxismarkersLine(jsBase + ".lineMarker("+ index1+")");
        getLineMarker1.add(item);
        return item;
    }
    private String lineMarker;
    private Boolean lineMarker1;

    /**
     * Setter for the line marker settings.
     */
    public Cartesian setLineMarker(String lineMarker) {
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


    /**
     * Setter for the line marker settings.
     */
    public Cartesian setLineMarker(Boolean lineMarker1) {
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

    private Number index2;
    private String lineMarker2;
    private Boolean lineMarker3;

    /**
     * Setter for the line marker settings by index.
     */
    public Cartesian setLineMarker(String lineMarker2, Number index2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%s, %s)", wrapQuotes(lineMarker2), index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%s, %s)", wrapQuotes(lineMarker2), index2));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the line marker settings by index.
     */
    public Cartesian setLineMarker(Boolean lineMarker3, Number index2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".lineMarker(%b, %s)", lineMarker3, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".lineMarker(%b, %s)", lineMarker3, index2));
            js.setLength(0);
        }
        return this;
    }

    private List<CartesianSeriesMarker> setMarker = new ArrayList<>();

    /**
     * Adds Marker series.
     */
    public CartesianSeriesMarker marker(List<DataEntry> data) {
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
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker" + variableIndex);
        setMarker.add(item);
        return item;
    }
    private String generateJSsetMarker() {
        if (!setMarker.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesMarker> setMarker1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesMarker marker(View view) {
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
        CartesianSeriesMarker item = new CartesianSeriesMarker("setMarker1" + variableIndex);
        setMarker1.add(item);
        return item;
    }
    private String generateJSsetMarker1() {
        if (!setMarker1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesMarker item : setMarker1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Markers getMarkerPalette;

    /**
     * Getter for the current chart markers palette settings.
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
     * Setter for the chart markers palette settings.
     */
    public Cartesian setMarkerPalette(Markers markerPalette) {
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
     * Setter for the chart markers palette settings.
     */
    public Cartesian setMarkerPalette(String markerPalette1) {
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
     * Setter for the chart markers palette settings.
     */
    public Cartesian setMarkerPalette(MarkerType[] markerPalette2) {
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
     * Setter for the chart markers palette settings.
     */
    public Cartesian setMarkerPalette(String[] markerPalette3) {
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
     * Setter for the maximum size for all bubbles on the charts.<br/>
     */
    public Cartesian setMaxBubbleSize(Number maxBubbleSize) {
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
     * Setter for the maximum size for all bubbles on the charts.<br/>
     */
    public Cartesian setMaxBubbleSize(String maxBubbleSize1) {
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

    private Number maxPointWidth;
    private String maxPointWidth1;

    /**
     * Setter for the maximum point width.
     */
    public Cartesian setMaxPointWidth(Number maxPointWidth) {
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
    public Cartesian setMaxPointWidth(String maxPointWidth1) {
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

    private Number minBubbleSize;
    private String minBubbleSize1;

    /**
     * Setter for the minimum size for all bubbles on the charts.
     */
    public Cartesian setMinBubbleSize(Number minBubbleSize) {
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
    public Cartesian setMinBubbleSize(String minBubbleSize1) {
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

    private Number minPointLength;
    private String minPointLength1;

    /**
     * Setter for the minimum point length.
     */
    public Cartesian setMinPointLength(Number minPointLength) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minPointLength(%s)", minPointLength));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%s)", minPointLength));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the minimum point length.
     */
    public Cartesian setMinPointLength(String minPointLength1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));
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
    public Cartesian setNormal(String normal) {
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

    private List<CartesianSeriesOHLC> setOhlc = new ArrayList<>();

    /**
     * Adds OHLC series.
     */
    public CartesianSeriesOHLC ohlc(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setOhlc" + ++variableIndex + " = " + jsBase + ".ohlc(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc" + variableIndex);
        setOhlc.add(item);
        return item;
    }
    private String generateJSsetOhlc() {
        if (!setOhlc.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesOHLC> setOhlc1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesOHLC ohlc(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setOhlc1" + ++variableIndex + " = " + jsBase + ".ohlc(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".ohlc(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesOHLC item = new CartesianSeriesOHLC("setOhlc1" + variableIndex);
        setOhlc1.add(item);
        return item;
    }
    private String generateJSsetOhlc1() {
        if (!setOhlc1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesOHLC item : setOhlc1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private RangeColors getPalette;

    /**
     * Getter for the current series colors palette.
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
     * Setter for the current series colors palette.
     */
    public Cartesian setPalette(RangeColors palette) {
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
     * Setter for the current series colors palette.
     */
    public Cartesian setPalette(DistinctColors palette1) {
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
     * Setter for the current series colors palette.
     */
    public Cartesian setPalette(String palette2) {
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
     * Setter for the current series colors palette.
     */
    public Cartesian setPalette(String[] palette3) {
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
    public Cartesian setPointWidth(Number pointWidth) {
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
    public Cartesian setPointWidth(String pointWidth1) {
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

    private List<CartesianSeriesRangeArea> setRangeArea = new ArrayList<>();

    /**
     * Adds Range Area series.
     */
    public CartesianSeriesRangeArea rangeArea(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setRangeArea" + ++variableIndex + " = " + jsBase + ".rangeArea(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea" + variableIndex);
        setRangeArea.add(item);
        return item;
    }
    private String generateJSsetRangeArea() {
        if (!setRangeArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeArea> setRangeArea1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesRangeArea rangeArea(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setRangeArea1" + ++variableIndex + " = " + jsBase + ".rangeArea(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeArea(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesRangeArea item = new CartesianSeriesRangeArea("setRangeArea1" + variableIndex);
        setRangeArea1.add(item);
        return item;
    }
    private String generateJSsetRangeArea1() {
        if (!setRangeArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeArea item : setRangeArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar = new ArrayList<>();

    /**
     * Adds Range Bar series.
     */
    public SeriesRangeBar rangeBar(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setRangeBar" + ++variableIndex + " = " + jsBase + ".rangeBar(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar" + variableIndex);
        setRangeBar.add(item);
        return item;
    }
    private String generateJSsetRangeBar() {
        if (!setRangeBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesRangeBar> setRangeBar1 = new ArrayList<>();

    /**
     * 
     */
    public SeriesRangeBar rangeBar(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setRangeBar1" + ++variableIndex + " = " + jsBase + ".rangeBar(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeBar(%s);", view.getJsBase()));
            js.setLength(0);
        }
        SeriesRangeBar item = new SeriesRangeBar("setRangeBar1" + variableIndex);
        setRangeBar1.add(item);
        return item;
    }
    private String generateJSsetRangeBar1() {
        if (!setRangeBar1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesRangeBar item : setRangeBar1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn = new ArrayList<>();

    /**
     * Adds Range Column series.
     */
    public CartesianSeriesRangeColumn rangeColumn(List<DataEntry> data) {
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
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn" + variableIndex);
        setRangeColumn.add(item);
        return item;
    }
    private String generateJSsetRangeColumn() {
        if (!setRangeColumn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeColumn> setRangeColumn1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesRangeColumn rangeColumn(View view) {
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
        CartesianSeriesRangeColumn item = new CartesianSeriesRangeColumn("setRangeColumn1" + variableIndex);
        setRangeColumn1.add(item);
        return item;
    }
    private String generateJSsetRangeColumn1() {
        if (!setRangeColumn1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeColumn item : setRangeColumn1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxismarkersRange getRangeMarker;

    /**
     * Getter for the current range marker.
     */
    public CoreAxismarkersRange getRangeMarker() {
        if (getRangeMarker == null)
            getRangeMarker = new CoreAxismarkersRange(jsBase + ".rangeMarker()");

        return getRangeMarker;
    }

    private List<CoreAxismarkersRange> getRangeMarker1 = new ArrayList<>();

    /**
     * Getter for the current range marker.
     */
    public CoreAxismarkersRange getRangeMarker(Number index3) {
        CoreAxismarkersRange item = new CoreAxismarkersRange(jsBase + ".rangeMarker("+ index3+")");
        getRangeMarker1.add(item);
        return item;
    }
    private String rangeMarker;
    private Boolean rangeMarker1;

    /**
     * Setter for the range marker.
     */
    public Cartesian setRangeMarker(String rangeMarker) {
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


    /**
     * Setter for the range marker.
     */
    public Cartesian setRangeMarker(Boolean rangeMarker1) {
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

    private Number index4;
    private String rangeMarker2;
    private Boolean rangeMarker3;

    /**
     * Setter for the range marker by index.
     */
    public Cartesian setRangeMarker(String rangeMarker2, Number index4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%s, %s)", wrapQuotes(rangeMarker2), index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%s, %s)", wrapQuotes(rangeMarker2), index4));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the range marker by index.
     */
    public Cartesian setRangeMarker(Boolean rangeMarker3, Number index4) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".rangeMarker(%b, %s)", rangeMarker3, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".rangeMarker(%b, %s)", rangeMarker3, index4));
            js.setLength(0);
        }
        return this;
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea = new ArrayList<>();

    /**
     * Adds Range Spline Area series.
     */
    public CartesianSeriesRangeSplineArea rangeSplineArea(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setRangeSplineArea" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea" + variableIndex);
        setRangeSplineArea.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea() {
        if (!setRangeSplineArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeSplineArea> setRangeSplineArea1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesRangeSplineArea rangeSplineArea(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setRangeSplineArea1" + ++variableIndex + " = " + jsBase + ".rangeSplineArea(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeSplineArea(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesRangeSplineArea item = new CartesianSeriesRangeSplineArea("setRangeSplineArea1" + variableIndex);
        setRangeSplineArea1.add(item);
        return item;
    }
    private String generateJSsetRangeSplineArea1() {
        if (!setRangeSplineArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeSplineArea item : setRangeSplineArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea = new ArrayList<>();

    /**
     * Adds Range Step Area series.
     */
    public CartesianSeriesRangeStepArea rangeStepArea(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setRangeStepArea" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea" + variableIndex);
        setRangeStepArea.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea() {
        if (!setRangeStepArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesRangeStepArea> setRangeStepArea1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesRangeStepArea rangeStepArea(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setRangeStepArea1" + ++variableIndex + " = " + jsBase + ".rangeStepArea(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".rangeStepArea(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesRangeStepArea item = new CartesianSeriesRangeStepArea("setRangeStepArea1" + variableIndex);
        setRangeStepArea1.add(item);
        return item;
    }
    private String generateJSsetRangeStepArea1() {
        if (!setRangeStepArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesRangeStepArea item : setRangeStepArea1) {
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
    public Cartesian removeSeries(Number id2) {
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
    public Cartesian removeSeries(String id3) {
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

    private Number index5;

    /**
     * Removes one of series from chart by its index.
     */
    public Cartesian removeSeriesAt(Number index5) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".removeSeriesAt(%s)", index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".removeSeriesAt(%s)", index5));
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
    public Cartesian setSelected(String selected) {
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

    private List<CartesianSeriesSpline> setSpline = new ArrayList<>();

    /**
     * Adds Spline series.
     */
    public CartesianSeriesSpline spline(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setSpline" + ++variableIndex + " = " + jsBase + ".spline(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline" + variableIndex);
        setSpline.add(item);
        return item;
    }
    private String generateJSsetSpline() {
        if (!setSpline.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSpline> setSpline1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesSpline spline(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setSpline1" + ++variableIndex + " = " + jsBase + ".spline(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".spline(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesSpline item = new CartesianSeriesSpline("setSpline1" + variableIndex);
        setSpline1.add(item);
        return item;
    }
    private String generateJSsetSpline1() {
        if (!setSpline1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSpline item : setSpline1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea = new ArrayList<>();

    /**
     * Adds Spline Area series.
     */
    public CartesianSeriesSplineArea splineArea(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setSplineArea" + ++variableIndex + " = " + jsBase + ".splineArea(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea" + variableIndex);
        setSplineArea.add(item);
        return item;
    }
    private String generateJSsetSplineArea() {
        if (!setSplineArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesSplineArea> setSplineArea1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesSplineArea splineArea(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setSplineArea1" + ++variableIndex + " = " + jsBase + ".splineArea(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".splineArea(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesSplineArea item = new CartesianSeriesSplineArea("setSplineArea1" + variableIndex);
        setSplineArea1.add(item);
        return item;
    }
    private String generateJSsetSplineArea1() {
        if (!setSplineArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesSplineArea item : setSplineArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea = new ArrayList<>();

    /**
     * Adds Step Area series.
     */
    public CartesianSeriesStepArea stepArea(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setStepArea" + ++variableIndex + " = " + jsBase + ".stepArea(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea" + variableIndex);
        setStepArea.add(item);
        return item;
    }
    private String generateJSsetStepArea() {
        if (!setStepArea.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepArea> setStepArea1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesStepArea stepArea(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setStepArea1" + ++variableIndex + " = " + jsBase + ".stepArea(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepArea(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesStepArea item = new CartesianSeriesStepArea("setStepArea1" + variableIndex);
        setStepArea1.add(item);
        return item;
    }
    private String generateJSsetStepArea1() {
        if (!setStepArea1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepArea item : setStepArea1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine = new ArrayList<>();

    /**
     * Adds Step Line series.
     */
    public CartesianSeriesStepLine stepLine(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setStepLine" + ++variableIndex + " = " + jsBase + ".stepLine(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine" + variableIndex);
        setStepLine.add(item);
        return item;
    }
    private String generateJSsetStepLine() {
        if (!setStepLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStepLine> setStepLine1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesStepLine stepLine(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setStepLine1" + ++variableIndex + " = " + jsBase + ".stepLine(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stepLine(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesStepLine item = new CartesianSeriesStepLine("setStepLine1" + variableIndex);
        setStepLine1.add(item);
        return item;
    }
    private String generateJSsetStepLine1() {
        if (!setStepLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStepLine item : setStepLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick = new ArrayList<>();

    /**
     * Adds Stick series.
     */
    public CartesianSeriesStick stick(List<DataEntry> data) {
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

        js.append(String.format(Locale.US, "var setStick" + ++variableIndex + " = " + jsBase + ".stick(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick" + variableIndex);
        setStick.add(item);
        return item;
    }
    private String generateJSsetStick() {
        if (!setStick.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CartesianSeriesStick> setStick1 = new ArrayList<>();

    /**
     * 
     */
    public CartesianSeriesStick stick(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setStick1" + ++variableIndex + " = " + jsBase + ".stick(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".stick(%s);", view.getJsBase()));
            js.setLength(0);
        }
        CartesianSeriesStick item = new CartesianSeriesStick("setStick1" + variableIndex);
        setStick1.add(item);
        return item;
    }
    private String generateJSsetStick1() {
        if (!setStick1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesStick item : setStick1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private CoreAxismarkersText getTextMarker;

    /**
     * Getter for the current text marker.
     */
    public CoreAxismarkersText getTextMarker() {
        if (getTextMarker == null)
            getTextMarker = new CoreAxismarkersText(jsBase + ".textMarker()");

        return getTextMarker;
    }

    private List<CoreAxismarkersText> getTextMarker1 = new ArrayList<>();

    /**
     * Getter for the current text marker.
     */
    public CoreAxismarkersText getTextMarker(Number index6) {
        CoreAxismarkersText item = new CoreAxismarkersText(jsBase + ".textMarker("+ index6+")");
        getTextMarker1.add(item);
        return item;
    }
    private String textMarker;
    private Boolean textMarker1;

    /**
     * Setter for the text marker.
     */
    public Cartesian setTextMarker(String textMarker) {
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


    /**
     * Setter for the text marker.
     */
    public Cartesian setTextMarker(Boolean textMarker1) {
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

    private Number index7;
    private String textMarker2;
    private Boolean textMarker3;

    /**
     * Setter for the text marker by index.
     */
    public Cartesian setTextMarker(String textMarker2, Number index7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%s, %s)", wrapQuotes(textMarker2), index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%s, %s)", wrapQuotes(textMarker2), index7));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the text marker by index.
     */
    public Cartesian setTextMarker(Boolean textMarker3, Number index7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".textMarker(%b, %s)", textMarker3, index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".textMarker(%b, %s)", textMarker3, index7));
            js.setLength(0);
        }
        return this;
    }


    private CoreAxesLinear getXAxis;

    /**
     * Getter for the current chart X-axis.
     */
    public CoreAxesLinear getXAxis() {
        if (getXAxis == null)
            getXAxis = new CoreAxesLinear(jsBase + ".xAxis()");

        return getXAxis;
    }

    private List<CoreAxesLinear> getXAxis1 = new ArrayList<>();

    /**
     * Getter for the current chart X-axis.
     */
    public CoreAxesLinear getXAxis(Number index8) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".xAxis("+ index8+")");
        getXAxis1.add(item);
        return item;
    }
    private String xAxis;
    private Boolean xAxis1;

    /**
     * Setter for the chart X-axis.
     */
    public Cartesian setXAxis(String xAxis) {
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
    public Cartesian setXAxis(Boolean xAxis1) {
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

    private Number index9;
    private String xAxis2;
    private Boolean xAxis3;

    /**
     * Setter for the chart X-axis by index.
     */
    public Cartesian setXAxis(String xAxis2, Number index9) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%s, %s)", wrapQuotes(xAxis2), index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%s, %s)", wrapQuotes(xAxis2), index9));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart X-axis by index.
     */
    public Cartesian setXAxis(Boolean xAxis3, Number index9) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xAxis(%b, %s)", xAxis3, index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xAxis(%b, %s)", xAxis3, index9));
            js.setLength(0);
        }
        return this;
    }


    private CoreGridsLinear getXGrid;

    /**
     * Getter for the chart grid by X-scale.
     */
    public CoreGridsLinear getXGrid() {
        if (getXGrid == null)
            getXGrid = new CoreGridsLinear(jsBase + ".xGrid()");

        return getXGrid;
    }

    private List<CoreGridsLinear> getXGrid1 = new ArrayList<>();

    /**
     * Getter for the chart grid by X-scale.
     */
    public CoreGridsLinear getXGrid(Number index10) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".xGrid("+ index10+")");
        getXGrid1.add(item);
        return item;
    }
    private String xGrid;
    private Boolean xGrid1;

    /**
     * Setter for the chart grid by X-scale.
     */
    public Cartesian setXGrid(String xGrid) {
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
    public Cartesian setXGrid(Boolean xGrid1) {
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

    private Number index11;
    private String xGrid2;
    private Boolean xGrid3;

    /**
     * Setter for chart grid by index.
     */
    public Cartesian setXGrid(String xGrid2, Number index11) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%s, %s)", wrapQuotes(xGrid2), index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%s, %s)", wrapQuotes(xGrid2), index11));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for chart grid by index.
     */
    public Cartesian setXGrid(Boolean xGrid3, Number index11) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xGrid(%b, %s)", xGrid3, index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xGrid(%b, %s)", xGrid3, index11));
            js.setLength(0);
        }
        return this;
    }


    private CoreGridsLinear getXMinorGrid;

    /**
     * Getter for the chart minor grid by X-scale.
     */
    public CoreGridsLinear getXMinorGrid() {
        if (getXMinorGrid == null)
            getXMinorGrid = new CoreGridsLinear(jsBase + ".xMinorGrid()");

        return getXMinorGrid;
    }

    private List<CoreGridsLinear> getXMinorGrid1 = new ArrayList<>();

    /**
     * Getter for the chart minor grid by X-scale.
     */
    public CoreGridsLinear getXMinorGrid(Number index12) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".xMinorGrid("+ index12+")");
        getXMinorGrid1.add(item);
        return item;
    }
    private String xMinorGrid;
    private Boolean xMinorGrid1;

    /**
     * Setter for the chart minor grid by X-scale.
     */
    public Cartesian setXMinorGrid(String xMinorGrid) {
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
    public Cartesian setXMinorGrid(Boolean xMinorGrid1) {
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

    private Number index13;
    private String xMinorGrid2;
    private Boolean xMinorGrid3;

    /**
     * Setter for the chart minor grid by index.
     */
    public Cartesian setXMinorGrid(String xMinorGrid2, Number index13) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%s, %s)", wrapQuotes(xMinorGrid2), index13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%s, %s)", wrapQuotes(xMinorGrid2), index13));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart minor grid by index.
     */
    public Cartesian setXMinorGrid(Boolean xMinorGrid3, Number index13) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xMinorGrid(%b, %s)", xMinorGrid3, index13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xMinorGrid(%b, %s)", xMinorGrid3, index13));
            js.setLength(0);
        }
        return this;
    }


    private Ordinal getXScale;

    /**
     * Getter for the current chart X-scale.
     */
    public Ordinal getXScale() {
        if (getXScale == null)
            getXScale = new Ordinal(jsBase + ".xScale()");

        return getXScale;
    }
    private String xScale;
    private ScaleTypes xScale1;
    private String xScale2;
    private ScalesBase xScale3;

    /**
     * Setter for the chart X-scale.
     */
    public Cartesian setXScale(String xScale) {
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
     * Setter for the chart X-scale.
     */
    public Cartesian setXScale(ScaleTypes xScale1) {
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
     * Setter for the chart X-scale.
     */
    public Cartesian setXScale(ScalesBase xScale3) {
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


    private ChartScroller getXScroller;

    /**
     * Getter for the current scroller.
     */
    public ChartScroller getXScroller() {
        if (getXScroller == null)
            getXScroller = new ChartScroller(jsBase + ".xScroller()");

        return getXScroller;
    }
    private String xScroller;
    private Boolean xScroller1;

    /**
     * Setter for the scroller.
     */
    public Cartesian setXScroller(String xScroller) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScroller(%s)", wrapQuotes(xScroller)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScroller(%s)", wrapQuotes(xScroller)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the scroller.
     */
    public Cartesian setXScroller(Boolean xScroller1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScroller(%b)", xScroller1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScroller(%b)", xScroller1));
            js.setLength(0);
        }
        return this;
    }


    private OrdinalZoom getXZoom;

    /**
     * Getter for the current zoom settings.
     */
    public OrdinalZoom getXZoom() {
        if (getXZoom == null)
            getXZoom = new OrdinalZoom(jsBase + ".xZoom()");

        return getXZoom;
    }
    private Number xZoom;
    private Boolean xZoom1;
    private String xZoom2;

    /**
     * Setter for the zoom settings.
     */
    public Cartesian setXZoom(Number xZoom) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xZoom(%s)", xZoom));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xZoom(%s)", xZoom));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the zoom settings.
     */
    public Cartesian setXZoom(Boolean xZoom1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xZoom(%b)", xZoom1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xZoom(%b)", xZoom1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the zoom settings.
     */
    public Cartesian setXZoom(String xZoom2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xZoom(%s)", wrapQuotes(xZoom2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xZoom(%s)", wrapQuotes(xZoom2)));
            js.setLength(0);
        }
        return this;
    }


    private CoreAxesLinear getYAxis;

    /**
     * Getter for the current chart Y-axis.
     */
    public CoreAxesLinear getYAxis() {
        if (getYAxis == null)
            getYAxis = new CoreAxesLinear(jsBase + ".yAxis()");

        return getYAxis;
    }

    private List<CoreAxesLinear> getYAxis1 = new ArrayList<>();

    /**
     * Getter for the current chart Y-axis.
     */
    public CoreAxesLinear getYAxis(Number index14) {
        CoreAxesLinear item = new CoreAxesLinear(jsBase + ".yAxis("+ index14+")");
        getYAxis1.add(item);
        return item;
    }
    private String yAxis;
    private Boolean yAxis1;

    /**
     * Setter for the chart Y-axis.
     */
    public Cartesian setYAxis(String yAxis) {
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
    public Cartesian setYAxis(Boolean yAxis1) {
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

    private Number index15;
    private String yAxis2;
    private Boolean yAxis3;

    /**
     * Setter for the chart Y-axis by index.
     */
    public Cartesian setYAxis(String yAxis2, Number index15) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%s, %s)", wrapQuotes(yAxis2), index15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%s, %s)", wrapQuotes(yAxis2), index15));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart Y-axis by index.
     */
    public Cartesian setYAxis(Boolean yAxis3, Number index15) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yAxis(%b, %s)", yAxis3, index15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yAxis(%b, %s)", yAxis3, index15));
            js.setLength(0);
        }
        return this;
    }


    private CoreGridsLinear getYGrid;

    /**
     * Getter for the chart grid by Y-scale.
     */
    public CoreGridsLinear getYGrid() {
        if (getYGrid == null)
            getYGrid = new CoreGridsLinear(jsBase + ".yGrid()");

        return getYGrid;
    }

    private List<CoreGridsLinear> getYGrid1 = new ArrayList<>();

    /**
     * Getter for the chart grid by Y-scale.
     */
    public CoreGridsLinear getYGrid(Number index16) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".yGrid("+ index16+")");
        getYGrid1.add(item);
        return item;
    }
    private String yGrid;
    private Boolean yGrid1;

    /**
     * Setter for the chart grid by Y-scale.
     */
    public Cartesian setYGrid(String yGrid) {
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
    public Cartesian setYGrid(Boolean yGrid1) {
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

    private Number index17;
    private String yGrid2;
    private Boolean yGrid3;

    /**
     * Setter for chart grid by index.
     */
    public Cartesian setYGrid(String yGrid2, Number index17) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%s, %s)", wrapQuotes(yGrid2), index17));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%s, %s)", wrapQuotes(yGrid2), index17));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for chart grid by index.
     */
    public Cartesian setYGrid(Boolean yGrid3, Number index17) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yGrid(%b, %s)", yGrid3, index17));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yGrid(%b, %s)", yGrid3, index17));
            js.setLength(0);
        }
        return this;
    }


    private CoreGridsLinear getYMinorGrid;

    /**
     * Getter for the chart minor grid by Y-scale.
     */
    public CoreGridsLinear getYMinorGrid() {
        if (getYMinorGrid == null)
            getYMinorGrid = new CoreGridsLinear(jsBase + ".yMinorGrid()");

        return getYMinorGrid;
    }

    private List<CoreGridsLinear> getYMinorGrid1 = new ArrayList<>();

    /**
     * Getter for the chart minor grid by Y-scale.
     */
    public CoreGridsLinear getYMinorGrid(Number index18) {
        CoreGridsLinear item = new CoreGridsLinear(jsBase + ".yMinorGrid("+ index18+")");
        getYMinorGrid1.add(item);
        return item;
    }
    private String yMinorGrid;
    private Boolean yMinorGrid1;

    /**
     * Setter for the chart minor grid by Y-scale.
     */
    public Cartesian setYMinorGrid(String yMinorGrid) {
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
    public Cartesian setYMinorGrid(Boolean yMinorGrid1) {
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

    private Number index19;
    private String yMinorGrid2;
    private Boolean yMinorGrid3;

    /**
     * Setter for the chart minor grid by index.
     */
    public Cartesian setYMinorGrid(String yMinorGrid2, Number index19) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%s, %s)", wrapQuotes(yMinorGrid2), index19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%s, %s)", wrapQuotes(yMinorGrid2), index19));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the chart minor grid by index.
     */
    public Cartesian setYMinorGrid(Boolean yMinorGrid3, Number index19) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".yMinorGrid(%b, %s)", yMinorGrid3, index19));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".yMinorGrid(%b, %s)", yMinorGrid3, index19));
            js.setLength(0);
        }
        return this;
    }


    private ScalesLinear getYScale;

    /**
     * Getter for the current chart Y-scale.
     */
    public ScalesLinear getYScale() {
        if (getYScale == null)
            getYScale = new ScalesLinear(jsBase + ".yScale()");

        return getYScale;
    }
    private String yScale;
    private ScaleTypes yScale1;
    private String yScale2;
    private ScalesBase yScale3;

    /**
     * Setter for the chart Y-scale.
     */
    public Cartesian setYScale(String yScale) {
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
     * Setter for the chart Y-scale.
     */
    public Cartesian setYScale(ScaleTypes yScale1) {
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
     * Setter for the chart Y-scale.
     */
    public Cartesian setYScale(ScalesBase yScale3) {
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
            for (CartesianSeriesBase item : getGetSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeries1() {
        if (!getGetSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : getGetSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetSeriesAt() {
        if (!getGetSeriesAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : getGetSeriesAt) {
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

    private String generateJSgetXScroller() {
        if (getXScroller != null) {
            return getXScroller.generateJs();
        }
        return "";
    }

    private String generateJSgetXZoom() {
        if (getXZoom != null) {
            return getXZoom.generateJs();
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
        js.append(generateJSgetData());
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
        js.append(generateJSgetXScroller());
        js.append(generateJSgetXZoom());
        js.append(generateJSgetYAxis());
        js.append(generateJSgetYAxis1());
        js.append(generateJSgetYGrid());
        js.append(generateJSgetYGrid1());
        js.append(generateJSgetYMinorGrid());
        js.append(generateJSgetYMinorGrid1());
        js.append(generateJSgetYScale());
        js.append(generateJSsetArea());
        js.append(generateJSsetArea1());
        js.append(generateJSsetBar());
        js.append(generateJSsetBar1());
        js.append(generateJSsetBox());
        js.append(generateJSsetBox1());
        js.append(generateJSsetBubble());
        js.append(generateJSsetBubble1());
        js.append(generateJSsetCandlestick());
        js.append(generateJSsetCandlestick1());
        js.append(generateJSsetColumn());
        js.append(generateJSsetColumn1());
        js.append(generateJSsetHilo());
        js.append(generateJSsetHilo1());
        js.append(generateJSsetJumpLine());
        js.append(generateJSsetJumpLine1());
        js.append(generateJSsetLine());
        js.append(generateJSsetLine1());
        js.append(generateJSsetMarker());
        js.append(generateJSsetMarker1());
        js.append(generateJSsetOhlc());
        js.append(generateJSsetOhlc1());
        js.append(generateJSsetRangeArea());
        js.append(generateJSsetRangeArea1());
        js.append(generateJSsetRangeBar());
        js.append(generateJSsetRangeBar1());
        js.append(generateJSsetRangeColumn());
        js.append(generateJSsetRangeColumn1());
        js.append(generateJSsetRangeSplineArea());
        js.append(generateJSsetRangeSplineArea1());
        js.append(generateJSsetRangeStepArea());
        js.append(generateJSsetRangeStepArea1());
        js.append(generateJSsetSpline());
        js.append(generateJSsetSpline1());
        js.append(generateJSsetSplineArea());
        js.append(generateJSsetSplineArea1());
        js.append(generateJSsetStepArea());
        js.append(generateJSsetStepArea1());
        js.append(generateJSsetStepLine());
        js.append(generateJSsetStepLine1());
        js.append(generateJSsetStick());
        js.append(generateJSsetStick1());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}