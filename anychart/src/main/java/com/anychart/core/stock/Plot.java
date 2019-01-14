package com.anychart.core.stock;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.VisualBaseWithBounds;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Stock Plot class.
 */
public class Plot extends VisualBaseWithBounds {

    protected Plot() {

    }

    public static Plot instantiate() {
        return new Plot("new anychart.core.stock.plot()");
    }

    

    public Plot(String jsChart) {
        jsBase = "plot" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Add series to chart.
     */
    public void addSeries(com.anychart.data.TableMapping var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addSeries(%s);", (var_args != null) ? var_args.getJsBase() : null));
    }
    /**
     * Creates an Accumulation Distribution Line indicator on the plot.
     */
    public com.anychart.core.stock.indicators.ADL adl(com.anychart.data.TableMapping mapping, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.ADL(String.format(Locale.US, jsBase + ".adl(%s, %s)", (mapping != null) ? mapping.getJsBase() : null, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates an Accumulation Distribution Line indicator on the plot.
     */
    public com.anychart.core.stock.indicators.ADL adl(com.anychart.data.TableMapping mapping, String seriesType) {
        return new com.anychart.core.stock.indicators.ADL(String.format(Locale.US, jsBase + ".adl(%s, %s)", (mapping != null) ? mapping.getJsBase() : null, wrapQuotes(seriesType)));
    }
    /**
     * Creates AMA (Adaptive Moving Average) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.AMA ama(com.anychart.data.TableMapping mapping, Number period, Number fastPeriod, Number slowPeriod, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.AMA(String.format(Locale.US, jsBase + ".ama(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, fastPeriod, slowPeriod, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates AMA (Adaptive Moving Average) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.AMA ama(com.anychart.data.TableMapping mapping, Number period, Number fastPeriod, Number slowPeriod, String seriesType) {
        return new com.anychart.core.stock.indicators.AMA(String.format(Locale.US, jsBase + ".ama(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, fastPeriod, slowPeriod, wrapQuotes(seriesType)));
    }
    /**
     * Getter for the plot annotations.
     */
    public com.anychart.core.annotations.PlotController annotations() {
        return new com.anychart.core.annotations.PlotController(jsBase + ".annotations()");
    }
    /**
     * Setter for the plot annotations.
     */
    public com.anychart.core.stock.Plot annotations(String[] annotationsList) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".annotations(%s);", arrayToStringWrapQuotes(annotationsList)));

        return this;
    }
    /**
     * Creates an Awesome Oscillator indicator on the plot.
     */
    public com.anychart.core.stock.indicators.AO ao(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.AO(String.format(Locale.US, jsBase + ".ao(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, (maType != null) ? maType.getJsBase() : null, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates an Awesome Oscillator indicator on the plot.
     */
    public com.anychart.core.stock.indicators.AO ao(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, com.anychart.enums.MovingAverageType maType, String seriesType) {
        return new com.anychart.core.stock.indicators.AO(String.format(Locale.US, jsBase + ".ao(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, (maType != null) ? maType.getJsBase() : null, wrapQuotes(seriesType)));
    }
    /**
     * Creates an Awesome Oscillator indicator on the plot.
     */
    public com.anychart.core.stock.indicators.AO ao(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, String maType, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.AO(String.format(Locale.US, jsBase + ".ao(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, wrapQuotes(maType), (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates an Awesome Oscillator indicator on the plot.
     */
    public com.anychart.core.stock.indicators.AO ao(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, String maType, String seriesType) {
        return new com.anychart.core.stock.indicators.AO(String.format(Locale.US, jsBase + ".ao(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, wrapQuotes(maType), wrapQuotes(seriesType)));
    }
    /**
     * 
     */
    public com.anychart.core.stock.series.Area area(com.anychart.data.Table data) {
        return new com.anychart.core.stock.series.Area(String.format(Locale.US, jsBase + ".area(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * Creates Aroon indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Aroon aroon(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType upSeriesType, com.anychart.enums.StockSeriesType downSeriesType) {
        return new com.anychart.core.stock.indicators.Aroon(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (upSeriesType != null) ? upSeriesType.getJsBase() : null, (downSeriesType != null) ? downSeriesType.getJsBase() : null));
    }
    /**
     * Creates Aroon indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Aroon aroon(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType upSeriesType, String downSeriesType) {
        return new com.anychart.core.stock.indicators.Aroon(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (upSeriesType != null) ? upSeriesType.getJsBase() : null, wrapQuotes(downSeriesType)));
    }
    /**
     * Creates Aroon indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Aroon aroon(com.anychart.data.TableMapping mapping, Number period, String upSeriesType, com.anychart.enums.StockSeriesType downSeriesType) {
        return new com.anychart.core.stock.indicators.Aroon(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(upSeriesType), (downSeriesType != null) ? downSeriesType.getJsBase() : null));
    }
    /**
     * Creates Aroon indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Aroon aroon(com.anychart.data.TableMapping mapping, Number period, String upSeriesType, String downSeriesType) {
        return new com.anychart.core.stock.indicators.Aroon(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(upSeriesType), wrapQuotes(downSeriesType)));
    }
    /**
     * Creates an Average True Range indicator on the plot.
     */
    public com.anychart.core.stock.indicators.ATR atr(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.ATR(String.format(Locale.US, jsBase + ".atr(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates an Average True Range indicator on the plot.
     */
    public com.anychart.core.stock.indicators.ATR atr(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.ATR(String.format(Locale.US, jsBase + ".atr(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Getter for the plot background.
     */
    public com.anychart.core.ui.Background background() {
        return new com.anychart.core.ui.Background(jsBase + ".background()");
    }
    /**
     * Setter for the plot background.
     */
    public com.anychart.core.stock.Plot background(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot background.
     */
    public com.anychart.core.stock.Plot background(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", settings));

        return this;
    }
    /**
     * Getter for the baseline.
     */
    public void baseline() {
        APIlib.getInstance().addJSLine(jsBase + ".baseline();");
    }
    /**
     * Setter for the baseline.<br/>
The baseline is the line relative to which the series  with the negative or positive value is drawn and painted over.
     */
    public com.anychart.core.stock.Plot baseline(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".baseline(%s);", value));

        return this;
    }
    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, com.anychart.enums.StockSeriesType middleSeriesType, com.anychart.enums.StockSeriesType upperSeriesType, com.anychart.enums.StockSeriesType lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, (middleSeriesType != null) ? middleSeriesType.getJsBase() : null, (upperSeriesType != null) ? upperSeriesType.getJsBase() : null, (lowerSeriesType != null) ? lowerSeriesType.getJsBase() : null));
    }
    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, com.anychart.enums.StockSeriesType middleSeriesType, com.anychart.enums.StockSeriesType upperSeriesType, String lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, (middleSeriesType != null) ? middleSeriesType.getJsBase() : null, (upperSeriesType != null) ? upperSeriesType.getJsBase() : null, wrapQuotes(lowerSeriesType)));
    }
    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, com.anychart.enums.StockSeriesType middleSeriesType, String upperSeriesType, com.anychart.enums.StockSeriesType lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, (middleSeriesType != null) ? middleSeriesType.getJsBase() : null, wrapQuotes(upperSeriesType), (lowerSeriesType != null) ? lowerSeriesType.getJsBase() : null));
    }
    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, com.anychart.enums.StockSeriesType middleSeriesType, String upperSeriesType, String lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, (middleSeriesType != null) ? middleSeriesType.getJsBase() : null, wrapQuotes(upperSeriesType), wrapQuotes(lowerSeriesType)));
    }
    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, String middleSeriesType, com.anychart.enums.StockSeriesType upperSeriesType, com.anychart.enums.StockSeriesType lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, wrapQuotes(middleSeriesType), (upperSeriesType != null) ? upperSeriesType.getJsBase() : null, (lowerSeriesType != null) ? lowerSeriesType.getJsBase() : null));
    }
    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, String middleSeriesType, com.anychart.enums.StockSeriesType upperSeriesType, String lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, wrapQuotes(middleSeriesType), (upperSeriesType != null) ? upperSeriesType.getJsBase() : null, wrapQuotes(lowerSeriesType)));
    }
    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, String middleSeriesType, String upperSeriesType, com.anychart.enums.StockSeriesType lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, wrapQuotes(middleSeriesType), wrapQuotes(upperSeriesType), (lowerSeriesType != null) ? lowerSeriesType.getJsBase() : null));
    }
    /**
     * Creates Bollinger Bands indicator on the plot.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, String middleSeriesType, String upperSeriesType, String lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, wrapQuotes(middleSeriesType), wrapQuotes(upperSeriesType), wrapQuotes(lowerSeriesType)));
    }
    /**
     * Creates %B indicator on the plot.
     */
    public com.anychart.core.stock.indicators.BBandsB bbandsB(com.anychart.data.TableMapping mapping, Number period, Number deviation, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.BBandsB(String.format(Locale.US, jsBase + ".bbandsB(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates %B indicator on the plot.
     */
    public com.anychart.core.stock.indicators.BBandsB bbandsB(com.anychart.data.TableMapping mapping, Number period, Number deviation, String seriesType) {
        return new com.anychart.core.stock.indicators.BBandsB(String.format(Locale.US, jsBase + ".bbandsB(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, wrapQuotes(seriesType)));
    }
    /**
     * Creates Bollinger Bands Width indicator on the plot.
     */
    public com.anychart.core.stock.indicators.BBandsWidth bbandsWidth(com.anychart.data.TableMapping mapping, Number period, Number deviation, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.BBandsWidth(String.format(Locale.US, jsBase + ".bbandsWidth(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates Bollinger Bands Width indicator on the plot.
     */
    public com.anychart.core.stock.indicators.BBandsWidth bbandsWidth(com.anychart.data.TableMapping mapping, Number period, Number deviation, String seriesType) {
        return new com.anychart.core.stock.indicators.BBandsWidth(String.format(Locale.US, jsBase + ".bbandsWidth(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, wrapQuotes(seriesType)));
    }
    /**
     * Getter for element bottom bound settings.
     */
    public void bottom() {
        APIlib.getInstance().addJSLine(jsBase + ".bottom();");
    }
    /**
     * Setter for element bottom bound settings.
     */
    public com.anychart.core.stock.Plot bottom(Number bottom) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", bottom));

        return this;
    }
    /**
     * Setter for element bottom bound settings.
     */
    public com.anychart.core.stock.Plot bottom(String bottom) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", wrapQuotes(bottom)));

        return this;
    }
    /**
     * Getter for element bounds settings.
     */
    public com.anychart.core.utils.Bounds bounds() {
        return new com.anychart.core.utils.Bounds(jsBase + ".bounds()");
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.stock.Plot bounds(com.anychart.utils.RectObj bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds != null) ? bounds.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.stock.Plot bounds(com.anychart.math.Rect bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds != null) ? bounds.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.stock.Plot bounds(com.anychart.core.utils.Bounds bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds != null) ? bounds.getJsBase() : null));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(Number x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(Number x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(Number x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(Number x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(Number x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(Number x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(Number x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(Number x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(String x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(String x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(String x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(String x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(String x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(String x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(String x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.stock.Plot bounds(String x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Creates a Commodity Channel Index indicator on the chart.
     */
    public com.anychart.core.stock.indicators.CCI cci(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.CCI(String.format(Locale.US, jsBase + ".cci(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Commodity Channel Index indicator on the chart.
     */
    public com.anychart.core.stock.indicators.CCI cci(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.CCI(String.format(Locale.US, jsBase + ".cci(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Creates a Chaikin Oscillator indicator on the chart.
     */
    public com.anychart.core.stock.indicators.CHO cho(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.CHO(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, (maType != null) ? maType.getJsBase() : null, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Chaikin Oscillator indicator on the chart.
     */
    public com.anychart.core.stock.indicators.CHO cho(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, com.anychart.enums.MovingAverageType maType, String seriesType) {
        return new com.anychart.core.stock.indicators.CHO(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, (maType != null) ? maType.getJsBase() : null, wrapQuotes(seriesType)));
    }
    /**
     * Creates a Chaikin Oscillator indicator on the chart.
     */
    public com.anychart.core.stock.indicators.CHO cho(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, String maType, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.CHO(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, wrapQuotes(maType), (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Chaikin Oscillator indicator on the chart.
     */
    public com.anychart.core.stock.indicators.CHO cho(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, String maType, String seriesType) {
        return new com.anychart.core.stock.indicators.CHO(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, wrapQuotes(maType), wrapQuotes(seriesType)));
    }
    /**
     * Creates a Chaikin Money Flow indicator on the chart.
     */
    public com.anychart.core.stock.indicators.CMF cmf(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.CMF(String.format(Locale.US, jsBase + ".cmf(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Chaikin Money Flow indicator on the chart.
     */
    public com.anychart.core.stock.indicators.CMF cmf(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.CMF(String.format(Locale.US, jsBase + ".cmf(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Getter for crosshair settings.
     */
    public com.anychart.core.ui.Crosshair crosshair() {
        return new com.anychart.core.ui.Crosshair(jsBase + ".crosshair()");
    }
    /**
     * Setter for crosshair settings.<br/>
The plot crosshair settings have a higher priority than the chart crosshair settings.
     */
    public com.anychart.core.stock.Plot crosshair(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".crosshair(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for crosshair settings.<br/>
The plot crosshair settings have a higher priority than the chart crosshair settings.
     */
    public com.anychart.core.stock.Plot crosshair(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".crosshair(%s);", settings));

        return this;
    }
    /**
     * Getter for the data area settings.
     */
    public com.anychart.core.ui.DataArea dataArea() {
        return new com.anychart.core.ui.DataArea(jsBase + ".dataArea()");
    }
    /**
     * Setter for the data area settings.<br/>
The data area is drawn along the data bounds.
     */
    public com.anychart.core.stock.Plot dataArea(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dataArea(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the data area settings.<br/>
The data area is drawn along the data bounds.
     */
    public com.anychart.core.stock.Plot dataArea(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dataArea(%s);", settings));

        return this;
    }
    /**
     * Getter for the default stock plot series type.
     */
    public void defaultSeriesType() {
        APIlib.getInstance().addJSLine(jsBase + ".defaultSeriesType();");
    }
    /**
     * Setter for the stock plot defaultSeriesType.
     */
    public com.anychart.core.stock.Plot defaultSeriesType(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".defaultSeriesType(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the stock plot defaultSeriesType.
     */
    public com.anychart.core.stock.Plot defaultSeriesType(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".defaultSeriesType(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, com.anychart.enums.StockSeriesType pdiSeriesType, com.anychart.enums.StockSeriesType ndiSeriesType, com.anychart.enums.StockSeriesType adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, (pdiSeriesType != null) ? pdiSeriesType.getJsBase() : null, (ndiSeriesType != null) ? ndiSeriesType.getJsBase() : null, (adxSeriesType != null) ? adxSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, com.anychart.enums.StockSeriesType pdiSeriesType, com.anychart.enums.StockSeriesType ndiSeriesType, String adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, (pdiSeriesType != null) ? pdiSeriesType.getJsBase() : null, (ndiSeriesType != null) ? ndiSeriesType.getJsBase() : null, wrapQuotes(adxSeriesType)));
    }
    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, com.anychart.enums.StockSeriesType pdiSeriesType, String ndiSeriesType, com.anychart.enums.StockSeriesType adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, (pdiSeriesType != null) ? pdiSeriesType.getJsBase() : null, wrapQuotes(ndiSeriesType), (adxSeriesType != null) ? adxSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, com.anychart.enums.StockSeriesType pdiSeriesType, String ndiSeriesType, String adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, (pdiSeriesType != null) ? pdiSeriesType.getJsBase() : null, wrapQuotes(ndiSeriesType), wrapQuotes(adxSeriesType)));
    }
    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, String pdiSeriesType, com.anychart.enums.StockSeriesType ndiSeriesType, com.anychart.enums.StockSeriesType adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType), (ndiSeriesType != null) ? ndiSeriesType.getJsBase() : null, (adxSeriesType != null) ? adxSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, String pdiSeriesType, com.anychart.enums.StockSeriesType ndiSeriesType, String adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType), (ndiSeriesType != null) ? ndiSeriesType.getJsBase() : null, wrapQuotes(adxSeriesType)));
    }
    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, String pdiSeriesType, String ndiSeriesType, com.anychart.enums.StockSeriesType adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType), wrapQuotes(ndiSeriesType), (adxSeriesType != null) ? adxSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Directional Movement Index indicator on the chart.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, String pdiSeriesType, String ndiSeriesType, String adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType), wrapQuotes(ndiSeriesType), wrapQuotes(adxSeriesType)));
    }
    /**
     * Creates EMA (Exponential Moving Average) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.EMA ema(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.EMA(String.format(Locale.US, jsBase + ".ema(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates EMA (Exponential Moving Average) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.EMA ema(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.EMA(String.format(Locale.US, jsBase + ".ema(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Getter for the element state (enabled or disabled).
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the element enabled state.
     */
    public com.anychart.core.stock.Plot enabled(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", enabled));

        return this;
    }
    /**
     * Getter for the event markers controller.
     */
    public com.anychart.core.stock.eventmarkers.Controller eventMarkers() {
        return new com.anychart.core.stock.eventmarkers.Controller(jsBase + ".eventMarkers()");
    }
    /**
     * Setter for the event markers controller.
     */
    public com.anychart.core.stock.Plot eventMarkers(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".eventMarkers(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the event markers controller.
     */
    public com.anychart.core.stock.Plot eventMarkers(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".eventMarkers(%s);", value));

        return this;
    }
    /**
     * Returns pixel bounds of the element due to parent bounds and self bounds settings.
     */
    public com.anychart.math.Rect getPixelBounds() {
        return new com.anychart.math.Rect(jsBase + ".getPixelBounds()");
    }
    /**
     * Gets series by its id.
     */
    public com.anychart.core.stock.series.Base getSeries(Number id) {
        return new com.anychart.core.stock.series.Base(String.format(Locale.US, jsBase + ".getSeries(%s)", id));
    }
    /**
     * Gets series by its id.
     */
    public com.anychart.core.stock.series.Base getSeries(String id) {
        return new com.anychart.core.stock.series.Base(String.format(Locale.US, jsBase + ".getSeries(%s)", wrapQuotes(id)));
    }
    /**
     * Gets series by its index.
     */
    public com.anychart.core.stock.series.Base getSeriesAt(Number index) {
        return new com.anychart.core.stock.series.Base(String.format(Locale.US, jsBase + ".getSeriesAt(%s)", index));
    }
    /**
     * Returns series count.
     */
    public void getSeriesCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getSeriesCount();");
    }
    /**
     * Getter for a statistical value by the key.
     */
    public void getStat(com.anychart.enums.Statistics key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", (key != null) ? key.getJsBase() : null));
    }
    /**
     * Getter for a statistical value by the key.
     */
    public void getStat(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", wrapQuotes(key)));
    }
    /**
     * Creates a Heikin-Ashi indicator on the plot.
     */
    public com.anychart.core.stock.indicators.HA ha(com.anychart.data.TableMapping mapping, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.HA(String.format(Locale.US, jsBase + ".ha(%s, %s)", (mapping != null) ? mapping.getJsBase() : null, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Heikin-Ashi indicator on the plot.
     */
    public com.anychart.core.stock.indicators.HA ha(com.anychart.data.TableMapping mapping, String seriesType) {
        return new com.anychart.core.stock.indicators.HA(String.format(Locale.US, jsBase + ".ha(%s, %s)", (mapping != null) ? mapping.getJsBase() : null, wrapQuotes(seriesType)));
    }
    /**
     * Getter for the hatch fill palette settings.
     */
    public com.anychart.palettes.HatchFills hatchFillPalette() {
        return new com.anychart.palettes.HatchFills(jsBase + ".hatchFillPalette()");
    }
    /**
     * Setter for hatch fill palette settings.
     */
    public com.anychart.palettes.HatchFills hatchFillPalette(com.anychart.graphics.vector.hatchfill.HatchFillType[] value) {
        return new com.anychart.palettes.HatchFills(String.format(Locale.US, jsBase + ".hatchFillPalette(%s)", arrayToString(value)));
    }
    /**
     * Setter for hatch fill palette settings.
     */
    public com.anychart.palettes.HatchFills hatchFillPalette(String value) {
        return new com.anychart.palettes.HatchFills(String.format(Locale.US, jsBase + ".hatchFillPalette(%s)", wrapQuotes(value)));
    }
    /**
     * Setter for hatch fill palette settings.
     */
    public com.anychart.palettes.HatchFills hatchFillPalette(com.anychart.palettes.HatchFills value) {
        return new com.anychart.palettes.HatchFills(String.format(Locale.US, jsBase + ".hatchFillPalette(%s)", (value != null) ? value.getJsBase() : null));
    }
    /**
     * Getter for element height settings.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for element height setting.
     */
    public com.anychart.core.stock.Plot height(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", height));

        return this;
    }
    /**
     * Setter for element height setting.
     */
    public com.anychart.core.stock.Plot height(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.stock.series.Hilo hilo(com.anychart.data.Table data) {
        return new com.anychart.core.stock.series.Hilo(String.format(Locale.US, jsBase + ".hilo(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a Keltner Channels indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KeltnerChannels keltnerChannels(com.anychart.data.TableMapping mapping, Number maPeriod, Number atrPeriod, com.anychart.enums.MovingAverageType maType, Number multiplier, com.anychart.enums.StockSeriesType maSeries) {
        return new com.anychart.core.stock.indicators.KeltnerChannels(String.format(Locale.US, jsBase + ".keltnerChannels(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, atrPeriod, (maType != null) ? maType.getJsBase() : null, multiplier, (maSeries != null) ? maSeries.getJsBase() : null));
    }
    /**
     * Creates a Keltner Channels indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KeltnerChannels keltnerChannels(com.anychart.data.TableMapping mapping, Number maPeriod, Number atrPeriod, com.anychart.enums.MovingAverageType maType, Number multiplier, String maSeries) {
        return new com.anychart.core.stock.indicators.KeltnerChannels(String.format(Locale.US, jsBase + ".keltnerChannels(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, atrPeriod, (maType != null) ? maType.getJsBase() : null, multiplier, wrapQuotes(maSeries)));
    }
    /**
     * Creates a Keltner Channels indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KeltnerChannels keltnerChannels(com.anychart.data.TableMapping mapping, Number maPeriod, Number atrPeriod, String maType, Number multiplier, com.anychart.enums.StockSeriesType maSeries) {
        return new com.anychart.core.stock.indicators.KeltnerChannels(String.format(Locale.US, jsBase + ".keltnerChannels(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, atrPeriod, wrapQuotes(maType), multiplier, (maSeries != null) ? maSeries.getJsBase() : null));
    }
    /**
     * Creates a Keltner Channels indicator on the plot.
     */
    public com.anychart.core.stock.indicators.KeltnerChannels keltnerChannels(com.anychart.data.TableMapping mapping, Number maPeriod, Number atrPeriod, String maType, Number multiplier, String maSeries) {
        return new com.anychart.core.stock.indicators.KeltnerChannels(String.format(Locale.US, jsBase + ".keltnerChannels(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, atrPeriod, wrapQuotes(maType), multiplier, wrapQuotes(maSeries)));
    }
    /**
     * Getter for element left bound settings.
     */
    public void left() {
        APIlib.getInstance().addJSLine(jsBase + ".left();");
    }
    /**
     * Setter for element left bound settings.
     */
    public com.anychart.core.stock.Plot left(Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", left));

        return this;
    }
    /**
     * Setter for element left bound settings.
     */
    public com.anychart.core.stock.Plot left(String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", wrapQuotes(left)));

        return this;
    }
    /**
     * Getter for the plot legend.
     */
    public com.anychart.core.ui.Legend legend() {
        return new com.anychart.core.ui.Legend(jsBase + ".legend()");
    }
    /**
     * Setter for the plot legend setting.
     */
    public com.anychart.core.stock.Plot legend(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".legend(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the plot legend setting.
     */
    public com.anychart.core.stock.Plot legend(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".legend(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.stock.series.Line line(com.anychart.data.Table data) {
        return new com.anychart.core.stock.series.Line(String.format(Locale.US, jsBase + ".line(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * Getter for the plot line marker.
     */
    public com.anychart.core.axismarkers.Line lineMarker(Number index) {
        return new com.anychart.core.axismarkers.Line(String.format(Locale.US, jsBase + ".lineMarker(%s)", index));
    }
    /**
     * Setter for the plot line marker.
     */
    public com.anychart.core.stock.Plot lineMarker(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot line marker.
     */
    public com.anychart.core.stock.Plot lineMarker(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s);", settings));

        return this;
    }
    /**
     * Setter for the plot line marker settings by index.
     */
    public com.anychart.core.stock.Plot lineMarker(Number index, String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s, %s);", index, wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot line marker settings by index.
     */
    public com.anychart.core.stock.Plot lineMarker(Number index, Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineMarker(%s, %s);", index, settings));

        return this;
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, com.anychart.enums.StockSeriesType macdSeriesType, com.anychart.enums.StockSeriesType signalSeriesType, com.anychart.enums.StockSeriesType histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, (macdSeriesType != null) ? macdSeriesType.getJsBase() : null, (signalSeriesType != null) ? signalSeriesType.getJsBase() : null, (histogramSeriesType != null) ? histogramSeriesType.getJsBase() : null));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, com.anychart.enums.StockSeriesType macdSeriesType, com.anychart.enums.StockSeriesType signalSeriesType, String histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, (macdSeriesType != null) ? macdSeriesType.getJsBase() : null, (signalSeriesType != null) ? signalSeriesType.getJsBase() : null, wrapQuotes(histogramSeriesType)));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, com.anychart.enums.StockSeriesType macdSeriesType, String signalSeriesType, com.anychart.enums.StockSeriesType histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, (macdSeriesType != null) ? macdSeriesType.getJsBase() : null, wrapQuotes(signalSeriesType), (histogramSeriesType != null) ? histogramSeriesType.getJsBase() : null));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, com.anychart.enums.StockSeriesType macdSeriesType, String signalSeriesType, String histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, (macdSeriesType != null) ? macdSeriesType.getJsBase() : null, wrapQuotes(signalSeriesType), wrapQuotes(histogramSeriesType)));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, String macdSeriesType, com.anychart.enums.StockSeriesType signalSeriesType, com.anychart.enums.StockSeriesType histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, wrapQuotes(macdSeriesType), (signalSeriesType != null) ? signalSeriesType.getJsBase() : null, (histogramSeriesType != null) ? histogramSeriesType.getJsBase() : null));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, String macdSeriesType, com.anychart.enums.StockSeriesType signalSeriesType, String histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, wrapQuotes(macdSeriesType), (signalSeriesType != null) ? signalSeriesType.getJsBase() : null, wrapQuotes(histogramSeriesType)));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, String macdSeriesType, String signalSeriesType, com.anychart.enums.StockSeriesType histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, wrapQuotes(macdSeriesType), wrapQuotes(signalSeriesType), (histogramSeriesType != null) ? histogramSeriesType.getJsBase() : null));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, String macdSeriesType, String signalSeriesType, String histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, wrapQuotes(macdSeriesType), wrapQuotes(signalSeriesType), wrapQuotes(histogramSeriesType)));
    }
    /**
     * Getter for chart markers palette settings.
     */
    public com.anychart.palettes.Markers markerPalette() {
        return new com.anychart.palettes.Markers(jsBase + ".markerPalette()");
    }
    /**
     * Setter for the chart markers palette settings.
     */
    public com.anychart.core.stock.Plot markerPalette(com.anychart.palettes.Markers value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".markerPalette(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart markers palette settings.
     */
    public com.anychart.core.stock.Plot markerPalette(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".markerPalette(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart markers palette settings.
     */
    public com.anychart.core.stock.Plot markerPalette(com.anychart.enums.MarkerType value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".markerPalette(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart markers palette settings.
     */
    public com.anychart.core.stock.Plot markerPalette(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".markerPalette(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the maximum height.
     */
    public void maxHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".maxHeight();");
    }
    /**
     * Setter for the maximum height.
     */
    public com.anychart.core.stock.Plot maxHeight(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", height));

        return this;
    }
    /**
     * Setter for the maximum height.
     */
    public com.anychart.core.stock.Plot maxHeight(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * Getter for the maximum point width.
     */
    public void maxPointWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".maxPointWidth();");
    }
    /**
     * Setter for the maximum point width.
     */
    public com.anychart.core.stock.Plot maxPointWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxPointWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum point width.
     */
    public com.anychart.core.stock.Plot maxPointWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxPointWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the maximum width.
     */
    public void maxWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".maxWidth();");
    }
    /**
     * Setter for the maximum width.
     */
    public com.anychart.core.stock.Plot maxWidth(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", width));

        return this;
    }
    /**
     * Setter for the maximum width.
     */
    public com.anychart.core.stock.Plot maxWidth(String width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", wrapQuotes(width)));

        return this;
    }
    /**
     * Creates a MFI (Money Flow Index) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.MFI mfi(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.MFI(String.format(Locale.US, jsBase + ".mfi(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a MFI (Money Flow Index) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.MFI mfi(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.MFI(String.format(Locale.US, jsBase + ".mfi(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Getter for the minimum height.
     */
    public void minHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".minHeight();");
    }
    /**
     * Setter for the minimum height.
     */
    public com.anychart.core.stock.Plot minHeight(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", height));

        return this;
    }
    /**
     * Setter for the minimum height.
     */
    public com.anychart.core.stock.Plot minHeight(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * Getter for the minimum point length.
     */
    public void minPointLength() {
        APIlib.getInstance().addJSLine(jsBase + ".minPointLength();");
    }
    /**
     * Setter for the minimum point length.
     */
    public com.anychart.core.stock.Plot minPointLength(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minPointLength(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum point length.
     */
    public com.anychart.core.stock.Plot minPointLength(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minPointLength(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the minimum width.
     */
    public void minWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".minWidth();");
    }
    /**
     * Setter for the minimum width.
     */
    public com.anychart.core.stock.Plot minWidth(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", width));

        return this;
    }
    /**
     * Setter for the minimum width.
     */
    public com.anychart.core.stock.Plot minWidth(String width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", wrapQuotes(width)));

        return this;
    }
    /**
     * Creates MMA (Modified Moving Average) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.MMA mma(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.MMA(String.format(Locale.US, jsBase + ".mma(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates MMA (Modified Moving Average) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.MMA mma(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.MMA(String.format(Locale.US, jsBase + ".mma(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Creates a Momentum indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Momentum momentum(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.Momentum(String.format(Locale.US, jsBase + ".momentum(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Momentum indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Momentum momentum(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.Momentum(String.format(Locale.US, jsBase + ".momentum(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Getter for noData settings.
     */
    public com.anychart.core.NoDataSettings noData() {
        return new com.anychart.core.NoDataSettings(jsBase + ".noData()");
    }
    /**
     * Setter for noData settings.<br/>
{docs:Working_with_Data/No_Data_Label} Learn more about "No data" feature {docs}
     */
    public com.anychart.core.stock.Plot noData(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".noData(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Creates an On Balance Volume indicator on the plot.
     */
    public com.anychart.core.stock.indicators.OBV obv(com.anychart.data.TableMapping mapping, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.OBV(String.format(Locale.US, jsBase + ".obv(%s, %s)", (mapping != null) ? mapping.getJsBase() : null, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates an On Balance Volume indicator on the plot.
     */
    public com.anychart.core.stock.indicators.OBV obv(com.anychart.data.TableMapping mapping, String seriesType) {
        return new com.anychart.core.stock.indicators.OBV(String.format(Locale.US, jsBase + ".obv(%s, %s)", (mapping != null) ? mapping.getJsBase() : null, wrapQuotes(seriesType)));
    }
    /**
     * 
     */
    public com.anychart.core.stock.series.OHLC ohlc(com.anychart.data.Table data) {
        return new com.anychart.core.stock.series.OHLC(String.format(Locale.US, jsBase + ".ohlc(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * Getter for the series colors palette.
     */
    public com.anychart.palettes.RangeColors palette() {
        return new com.anychart.palettes.RangeColors(jsBase + ".palette()");
    }
    /**
     * Setter for the series colors palette.
     */
    public com.anychart.core.stock.Plot palette(com.anychart.palettes.RangeColors value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".palette(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the series colors palette.
     */
    public com.anychart.core.stock.Plot palette(com.anychart.palettes.DistinctColors value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".palette(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the series colors palette.
     */
    public com.anychart.core.stock.Plot palette(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".palette(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the series colors palette.
     */
    public com.anychart.core.stock.Plot palette(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".palette(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the point width settings.
     */
    public void pointWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".pointWidth();");
    }
    /**
     * Setter for the point width settings.
     */
    public com.anychart.core.stock.Plot pointWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".pointWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the point width settings.
     */
    public com.anychart.core.stock.Plot pointWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".pointWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Creates a Price Channels indicator on the plot.
     */
    public com.anychart.core.stock.indicators.PriceChannels priceChannels(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType middleSeriesType, com.anychart.enums.StockSeriesType rangeSeriesType) {
        return new com.anychart.core.stock.indicators.PriceChannels(String.format(Locale.US, jsBase + ".priceChannels(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (middleSeriesType != null) ? middleSeriesType.getJsBase() : null, (rangeSeriesType != null) ? rangeSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Price Channels indicator on the plot.
     */
    public com.anychart.core.stock.indicators.PriceChannels priceChannels(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType middleSeriesType, String rangeSeriesType) {
        return new com.anychart.core.stock.indicators.PriceChannels(String.format(Locale.US, jsBase + ".priceChannels(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (middleSeriesType != null) ? middleSeriesType.getJsBase() : null, wrapQuotes(rangeSeriesType)));
    }
    /**
     * Creates a Price Channels indicator on the plot.
     */
    public com.anychart.core.stock.indicators.PriceChannels priceChannels(com.anychart.data.TableMapping mapping, Number period, String middleSeriesType, com.anychart.enums.StockSeriesType rangeSeriesType) {
        return new com.anychart.core.stock.indicators.PriceChannels(String.format(Locale.US, jsBase + ".priceChannels(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(middleSeriesType), (rangeSeriesType != null) ? rangeSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Price Channels indicator on the plot.
     */
    public com.anychart.core.stock.indicators.PriceChannels priceChannels(com.anychart.data.TableMapping mapping, Number period, String middleSeriesType, String rangeSeriesType) {
        return new com.anychart.core.stock.indicators.PriceChannels(String.format(Locale.US, jsBase + ".priceChannels(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(middleSeriesType), wrapQuotes(rangeSeriesType)));
    }
    /**
     * Getter for the stock price indicator.
     */
    public com.anychart.core.axismarkers.CurrentPriceIndicator priceIndicator(Number index) {
        return new com.anychart.core.axismarkers.CurrentPriceIndicator(String.format(Locale.US, jsBase + ".priceIndicator(%s)", index));
    }
    /**
     * Setter for the stock price indicator settings.
     */
    public com.anychart.core.stock.Plot priceIndicator(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".priceIndicator(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the stock price indicator settings.
     */
    public com.anychart.core.stock.Plot priceIndicator(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".priceIndicator(%s);", value));

        return this;
    }
    /**
     * Setter for the stock price indicator settings by index.
     */
    public com.anychart.core.stock.Plot priceIndicator(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".priceIndicator(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the stock price indicator settings by index.
     */
    public com.anychart.core.stock.Plot priceIndicator(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".priceIndicator(%s, %s);", index, value));

        return this;
    }
    /**
     * Prints all elements on related stage.
     */
    public void print(com.anychart.graphics.vector.PaperSize paperSizeOrOptions, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", (paperSizeOrOptions != null) ? paperSizeOrOptions.getJsBase() : null, landscape));
    }
    /**
     * Prints all elements on related stage.
     */
    public void print(String paperSizeOrOptions, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".print(%s, %s);", wrapQuotes(paperSizeOrOptions), landscape));
    }
    /**
     * Creates a PSAR (Parabolic SAR) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.PSAR psar(com.anychart.data.TableMapping mapping, Number accelerationFactorStart, Number accelerationFactorIncrement, Number accelerationFactorMaximum, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.PSAR(String.format(Locale.US, jsBase + ".psar(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, accelerationFactorStart, accelerationFactorIncrement, accelerationFactorMaximum, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a PSAR (Parabolic SAR) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.PSAR psar(com.anychart.data.TableMapping mapping, Number accelerationFactorStart, Number accelerationFactorIncrement, Number accelerationFactorMaximum, String seriesType) {
        return new com.anychart.core.stock.indicators.PSAR(String.format(Locale.US, jsBase + ".psar(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, accelerationFactorStart, accelerationFactorIncrement, accelerationFactorMaximum, wrapQuotes(seriesType)));
    }
    /**
     * Getter for the plot range marker.
     */
    public com.anychart.core.axismarkers.Range rangeMarker(Number index) {
        return new com.anychart.core.axismarkers.Range(String.format(Locale.US, jsBase + ".rangeMarker(%s)", index));
    }
    /**
     * Setter for the plot range marker.
     */
    public com.anychart.core.stock.Plot rangeMarker(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot range marker.
     */
    public com.anychart.core.stock.Plot rangeMarker(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s);", settings));

        return this;
    }
    /**
     * Setter for the plot range marker settings by index.
     */
    public com.anychart.core.stock.Plot rangeMarker(Number index, String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s, %s);", index, wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot range marker settings by index.
     */
    public com.anychart.core.stock.Plot rangeMarker(Number index, Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".rangeMarker(%s, %s);", index, settings));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Removes all series from chart.
     */
    public com.anychart.core.stock.Plot removeAllSeries() {
        APIlib.getInstance().addJSLine(jsBase + ".removeAllSeries();");

        return this;
    }
    /**
     * Removes one of series from chart by its id.
     */
    public com.anychart.core.stock.Plot removeSeries(Number id) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeSeries(%s);", id));

        return this;
    }
    /**
     * Removes one of series from chart by its id.
     */
    public com.anychart.core.stock.Plot removeSeries(String id) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeSeries(%s);", wrapQuotes(id)));

        return this;
    }
    /**
     * Removes one of series from chart by its index.
     */
    public com.anychart.core.stock.Plot removeSeriesAt(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeSeriesAt(%s);", index));

        return this;
    }
    /**
     * Getter for element right bound settings.
     */
    public void right() {
        APIlib.getInstance().addJSLine(jsBase + ".right();");
    }
    /**
     * Setter for element right bound setting.
     */
    public com.anychart.core.stock.Plot right(Number right) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", right));

        return this;
    }
    /**
     * Setter for element right bound setting.
     */
    public com.anychart.core.stock.Plot right(String right) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", wrapQuotes(right)));

        return this;
    }
    /**
     * Creates RoC (Rate of Change) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.RoC roc(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.RoC(String.format(Locale.US, jsBase + ".roc(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates RoC (Rate of Change) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.RoC roc(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.RoC(String.format(Locale.US, jsBase + ".roc(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Creates RSI (Relative Strength Index) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.RSI rsi(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.RSI(String.format(Locale.US, jsBase + ".rsi(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates RSI (Relative Strength Index) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.RSI rsi(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.RSI(String.format(Locale.US, jsBase + ".rsi(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Creates SMA (Simple Moving Average) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.SMA sma(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.SMA(String.format(Locale.US, jsBase + ".sma(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates SMA (Simple Moving Average) indicator on the plot.
     */
    public com.anychart.core.stock.indicators.SMA sma(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.SMA(String.format(Locale.US, jsBase + ".sma(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, String kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, String kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), wrapQuotes(kSeriesType), wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, String kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the plot.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, String kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), wrapQuotes(kSeriesType), wrapQuotes(dSeriesType)));
    }
    /**
     * Getter for the plot text marker.
     */
    public com.anychart.core.axismarkers.Text textMarker(Number index) {
        return new com.anychart.core.axismarkers.Text(String.format(Locale.US, jsBase + ".textMarker(%s)", index));
    }
    /**
     * Setter for the plot text marker.
     */
    public com.anychart.core.stock.Plot textMarker(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot text marker.
     */
    public com.anychart.core.stock.Plot textMarker(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s);", settings));

        return this;
    }
    /**
     * Setter for the plot text marker settings by index.
     */
    public com.anychart.core.stock.Plot textMarker(Number index, String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s, %s);", index, wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot text marker settings by index.
     */
    public com.anychart.core.stock.Plot textMarker(Number index, Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textMarker(%s, %s);", index, settings));

        return this;
    }
    /**
     * Getter for the plot title.
     */
    public com.anychart.core.ui.Title title() {
        return new com.anychart.core.ui.Title(jsBase + ".title()");
    }
    /**
     * Setter for the plot title.
     */
    public com.anychart.core.stock.Plot title(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", settings));

        return this;
    }
    /**
     * Setter for the plot title.
     */
    public com.anychart.core.stock.Plot title(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for element top bound settings.
     */
    public void top() {
        APIlib.getInstance().addJSLine(jsBase + ".top();");
    }
    /**
     * Setter for element top bound settings.
     */
    public com.anychart.core.stock.Plot top(Number top) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", top));

        return this;
    }
    /**
     * Setter for element top bound settings.
     */
    public com.anychart.core.stock.Plot top(String top) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", wrapQuotes(top)));

        return this;
    }
    /**
     * Creates a TRIX indicator on the plot.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.MovingAverageType signalMaType, com.anychart.enums.StockSeriesType trixSeriesType, com.anychart.enums.StockSeriesType signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, (maType != null) ? maType.getJsBase() : null, (signalMaType != null) ? signalMaType.getJsBase() : null, (trixSeriesType != null) ? trixSeriesType.getJsBase() : null, (signalSeriesType != null) ? signalSeriesType.getJsBase() : null));
    }
    /**
     * Creates a TRIX indicator on the plot.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.MovingAverageType signalMaType, com.anychart.enums.StockSeriesType trixSeriesType, String signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, (maType != null) ? maType.getJsBase() : null, (signalMaType != null) ? signalMaType.getJsBase() : null, (trixSeriesType != null) ? trixSeriesType.getJsBase() : null, wrapQuotes(signalSeriesType)));
    }
    /**
     * Creates a TRIX indicator on the plot.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.MovingAverageType signalMaType, String trixSeriesType, com.anychart.enums.StockSeriesType signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, (maType != null) ? maType.getJsBase() : null, (signalMaType != null) ? signalMaType.getJsBase() : null, wrapQuotes(trixSeriesType), (signalSeriesType != null) ? signalSeriesType.getJsBase() : null));
    }
    /**
     * Creates a TRIX indicator on the plot.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.MovingAverageType signalMaType, String trixSeriesType, String signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, (maType != null) ? maType.getJsBase() : null, (signalMaType != null) ? signalMaType.getJsBase() : null, wrapQuotes(trixSeriesType), wrapQuotes(signalSeriesType)));
    }
    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(".listen('pointClick', function(e) {");

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

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }

    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener, String type, String ePath) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(String.format(Locale.US, ".listen('%1$s', function(e) {", type));

        if (listener.getFields() != null) {
            ePath = (ePath != null) ? ePath + "." : "";
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.%2$s%1$s + ',' +", field, ePath));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }
    /**
     * Creates a Volume + MA indicator on the plot.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.StockSeriesType volumeSeriesType, com.anychart.enums.StockSeriesType maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, (maType != null) ? maType.getJsBase() : null, (volumeSeriesType != null) ? volumeSeriesType.getJsBase() : null, (maSeriesType != null) ? maSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Volume + MA indicator on the plot.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.StockSeriesType volumeSeriesType, String maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, (maType != null) ? maType.getJsBase() : null, (volumeSeriesType != null) ? volumeSeriesType.getJsBase() : null, wrapQuotes(maSeriesType)));
    }
    /**
     * Creates a Volume + MA indicator on the plot.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, com.anychart.enums.MovingAverageType maType, String volumeSeriesType, com.anychart.enums.StockSeriesType maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, (maType != null) ? maType.getJsBase() : null, wrapQuotes(volumeSeriesType), (maSeriesType != null) ? maSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Volume + MA indicator on the plot.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, com.anychart.enums.MovingAverageType maType, String volumeSeriesType, String maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, (maType != null) ? maType.getJsBase() : null, wrapQuotes(volumeSeriesType), wrapQuotes(maSeriesType)));
    }
    /**
     * Creates a Volume + MA indicator on the plot.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, String maType, com.anychart.enums.StockSeriesType volumeSeriesType, com.anychart.enums.StockSeriesType maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, wrapQuotes(maType), (volumeSeriesType != null) ? volumeSeriesType.getJsBase() : null, (maSeriesType != null) ? maSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Volume + MA indicator on the plot.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, String maType, com.anychart.enums.StockSeriesType volumeSeriesType, String maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, wrapQuotes(maType), (volumeSeriesType != null) ? volumeSeriesType.getJsBase() : null, wrapQuotes(maSeriesType)));
    }
    /**
     * Creates a Volume + MA indicator on the plot.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, String maType, String volumeSeriesType, com.anychart.enums.StockSeriesType maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, wrapQuotes(maType), wrapQuotes(volumeSeriesType), (maSeriesType != null) ? maSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Volume + MA indicator on the plot.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, String maType, String volumeSeriesType, String maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, wrapQuotes(maType), wrapQuotes(volumeSeriesType), wrapQuotes(maSeriesType)));
    }
    /**
     * Getter for element width settings.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for element width setting.
     */
    public com.anychart.core.stock.Plot width(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", width));

        return this;
    }
    /**
     * Setter for element width setting.
     */
    public com.anychart.core.stock.Plot width(String width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width)));

        return this;
    }
    /**
     * Creates a Williams %R indicator on the plot.
     */
    public com.anychart.core.stock.indicators.WilliamsR williamsR(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.WilliamsR(String.format(Locale.US, jsBase + ".williamsR(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Williams %R indicator on the plot.
     */
    public com.anychart.core.stock.indicators.WilliamsR williamsR(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.WilliamsR(String.format(Locale.US, jsBase + ".williamsR(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Getter for the X-axis.
     */
    public com.anychart.core.axes.StockDateTime xAxis() {
        return new com.anychart.core.axes.StockDateTime(jsBase + ".xAxis()");
    }
    /**
     * Setter for the X-axis.
     */
    public com.anychart.core.stock.Plot xAxis(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xAxis(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the X-axis.
     */
    public com.anychart.core.stock.Plot xAxis(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xAxis(%s);", settings));

        return this;
    }
    /**
     * Getter for the plot grid by X-scale.
     */
    public com.anychart.core.grids.Stock xGrid(Number index) {
        return new com.anychart.core.grids.Stock(String.format(Locale.US, jsBase + ".xGrid(%s)", index));
    }
    /**
     * Setter for the plot grid by X-scale.
     */
    public com.anychart.core.stock.Plot xGrid(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xGrid(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot grid by X-scale.
     */
    public com.anychart.core.stock.Plot xGrid(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xGrid(%s);", settings));

        return this;
    }
    /**
     * Setter for the plot grid by index.
     */
    public com.anychart.core.stock.Plot xGrid(Number index, String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xGrid(%s, %s);", index, wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot grid by index.
     */
    public com.anychart.core.stock.Plot xGrid(Number index, Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xGrid(%s, %s);", index, settings));

        return this;
    }
    /**
     * Getter for the plot grid by X-scale.
     */
    public com.anychart.core.grids.Stock xMinorGrid(Number index) {
        return new com.anychart.core.grids.Stock(String.format(Locale.US, jsBase + ".xMinorGrid(%s)", index));
    }
    /**
     * Setter for the plot grid by X-scale.
     */
    public com.anychart.core.stock.Plot xMinorGrid(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorGrid(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot grid by X-scale.
     */
    public com.anychart.core.stock.Plot xMinorGrid(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorGrid(%s);", settings));

        return this;
    }
    /**
     * Setter for the plot grid by index.
     */
    public com.anychart.core.stock.Plot xMinorGrid(Number indexOrValue, String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorGrid(%s, %s);", indexOrValue, wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot grid by index.
     */
    public com.anychart.core.stock.Plot xMinorGrid(Number indexOrValue, Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorGrid(%s, %s);", indexOrValue, settings));

        return this;
    }
    /**
     * Getter for the plot Y-axis.
     */
    public com.anychart.core.axes.Linear yAxis(Number index) {
        return new com.anychart.core.axes.Linear(String.format(Locale.US, jsBase + ".yAxis(%s)", index));
    }
    /**
     * Setter for the plot Y-axis.
     */
    public com.anychart.core.stock.Plot yAxis(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yAxis(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot Y-axis.
     */
    public com.anychart.core.stock.Plot yAxis(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yAxis(%s);", settings));

        return this;
    }
    /**
     * Setter for the Y-axis by index.
     */
    public com.anychart.core.stock.Plot yAxis(Number index, String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yAxis(%s, %s);", index, wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the Y-axis by index.
     */
    public com.anychart.core.stock.Plot yAxis(Number index, Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yAxis(%s, %s);", index, settings));

        return this;
    }
    /**
     * Getter for the plot grid by Y-scale.
     */
    public com.anychart.core.grids.Stock yGrid(Number index) {
        return new com.anychart.core.grids.Stock(String.format(Locale.US, jsBase + ".yGrid(%s)", index));
    }
    /**
     * Setter for the plot grid by Y-scale.
     */
    public com.anychart.core.stock.Plot yGrid(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yGrid(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot grid by Y-scale.
     */
    public com.anychart.core.stock.Plot yGrid(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yGrid(%s);", settings));

        return this;
    }
    /**
     * Setter for the plot grid by index.
     */
    public com.anychart.core.stock.Plot yGrid(Number index, String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yGrid(%s, %s);", index, wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot grid by index.
     */
    public com.anychart.core.stock.Plot yGrid(Number index, Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yGrid(%s, %s);", index, settings));

        return this;
    }
    /**
     * Getter for the plot grid by Y-scale.
     */
    public com.anychart.core.grids.Stock yMinorGrid(Number index) {
        return new com.anychart.core.grids.Stock(String.format(Locale.US, jsBase + ".yMinorGrid(%s)", index));
    }
    /**
     * Setter for the plot grid by Y-scale.
     */
    public com.anychart.core.stock.Plot yMinorGrid(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorGrid(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot grid by Y-scale.
     */
    public com.anychart.core.stock.Plot yMinorGrid(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorGrid(%s);", settings));

        return this;
    }
    /**
     * Setter for the plot grid by index.
     */
    public com.anychart.core.stock.Plot yMinorGrid(Number indexOrValue, String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorGrid(%s, %s);", indexOrValue, wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot grid by index.
     */
    public com.anychart.core.stock.Plot yMinorGrid(Number indexOrValue, Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorGrid(%s, %s);", indexOrValue, settings));

        return this;
    }
    /**
     * Getter for the default plot Y-scale.
     */
    public com.anychart.scales.ScatterBase yScale() {
        return new com.anychart.scales.ScatterBase(jsBase + ".yScale()");
    }
    /**
     * Setter for the plot Y-scale.
     */
    public com.anychart.core.stock.Plot yScale(com.anychart.enums.ScatterScaleTypes settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", (settings != null) ? settings.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the plot Y-scale.
     */
    public com.anychart.core.stock.Plot yScale(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the plot Y-scale.
     */
    public com.anychart.core.stock.Plot yScale(com.anychart.scales.ScatterBase settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", (settings != null) ? settings.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the Z-index of the element.
     */
    public void zIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".zIndex();");
    }
    /**
     * Setter for the Z-index of the element.
     */
    public com.anychart.core.stock.Plot zIndex(Number zIndex) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", zIndex));

        return this;
    }
    /**
     * Getter for the container.
     */
    public com.anychart.graphics.vector.Layer container() {
        return new com.anychart.graphics.vector.Layer(jsBase + ".container()");
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.stock.Plot container(com.anychart.graphics.vector.Layer element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.stock.Plot container(com.anychart.graphics.vector.Stage element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.stock.Plot container(String element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(element)));

        return this;
    }
    /**
     * Getter for the parent bounds.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.math.Rect parentBounds() {
        return new com.anychart.math.Rect(jsBase + ".parentBounds()");
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.stock.Plot parentBounds(com.anychart.math.Rect bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", (bounds != null) ? bounds.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.stock.Plot parentBounds(String bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", wrapQuotes(bounds)));

        return this;
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.stock.Plot parentBounds(Number bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", bounds));

        return this;
    }
    /**
     * Setter for the parent bounds using several values.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.stock.Plot parentBounds(Number left, Number top, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s, %s, %s, %s);", left, top, width, height));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.stock.series.Area area(com.anychart.data.TableMapping data) {
        return new com.anychart.core.stock.series.Area(String.format(Locale.US, jsBase + ".area(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.stock.series.Line line(com.anychart.data.TableMapping data) {
        return new com.anychart.core.stock.series.Line(String.format(Locale.US, jsBase + ".line(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.stock.series.Hilo hilo(com.anychart.data.TableMapping data) {
        return new com.anychart.core.stock.series.Hilo(String.format(Locale.US, jsBase + ".hilo(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.stock.series.OHLC ohlc(com.anychart.data.TableMapping data) {
        return new com.anychart.core.stock.series.OHLC(String.format(Locale.US, jsBase + ".ohlc(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public Object yScale(Class scaleClass) {
        Object instance = null;
        try {
            instance = scaleClass.getDeclaredConstructor(String.class).newInstance(jsBase + ".yScale()");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
        return instance;
    }

}