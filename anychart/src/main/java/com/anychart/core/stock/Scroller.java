package com.anychart.core.stock;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Stock scroller class. Adds series drawing to UI Scroller.
 */
public class Scroller extends JsObject {

    protected Scroller() {

    }

    public static Scroller instantiate() {
        return new Scroller("new anychart.core.stock.scroller()");
    }

    

    public Scroller(String jsChart) {
        jsBase = "scroller" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Add series to chart.<br/>
<b>Note</b>: We recommend to use the line and area types for the scroller series.
     */
    public void addSeries(com.anychart.data.View var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addSeries(%s);", (var_args != null) ? var_args.getJsBase() : null));
    }
    /**
     * Add series to chart.<br/>
<b>Note</b>: We recommend to use the line and area types for the scroller series.
     */
    public void addSeries(com.anychart.data.Set var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addSeries(%s);", (var_args != null) ? var_args.getJsBase() : null));
    }
    /**
     * Add series to chart.<br/>
<b>Note</b>: We recommend to use the line and area types for the scroller series.
     */
    public void addSeries(String[] var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addSeries(%s);", arrayToStringWrapQuotes(var_args)));
    }
    /**
     * Creates an Accumulation Distribution Line indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.ADL adl(com.anychart.data.TableMapping mapping, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.ADL(String.format(Locale.US, jsBase + ".adl(%s, %s)", (mapping != null) ? mapping.getJsBase() : null, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates an Accumulation Distribution Line indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.ADL adl(com.anychart.data.TableMapping mapping, String seriesType) {
        return new com.anychart.core.stock.indicators.ADL(String.format(Locale.US, jsBase + ".adl(%s, %s)", (mapping != null) ? mapping.getJsBase() : null, wrapQuotes(seriesType)));
    }
    /**
     * Getter for the mode of the range changing.
     */
    public void allowRangeChange() {
        APIlib.getInstance().addJSLine(jsBase + ".allowRangeChange();");
    }
    /**
     * Setter for the mode of the range changing. If the range changing is allowed.
     */
    public com.anychart.core.stock.Scroller allowRangeChange(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".allowRangeChange(%s);", enabled));

        return this;
    }
    /**
     * Creates AMA (Adaptive Moving Average) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.AMA ama(com.anychart.data.TableMapping mapping, Number period, Number fastPeriod, Number slowPeriod, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.AMA(String.format(Locale.US, jsBase + ".ama(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, fastPeriod, slowPeriod, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates AMA (Adaptive Moving Average) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.AMA ama(com.anychart.data.TableMapping mapping, Number period, Number fastPeriod, Number slowPeriod, String seriesType) {
        return new com.anychart.core.stock.indicators.AMA(String.format(Locale.US, jsBase + ".ama(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, fastPeriod, slowPeriod, wrapQuotes(seriesType)));
    }
    /**
     * Creates an Awesome Oscillator indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.AO ao(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.AO(String.format(Locale.US, jsBase + ".ao(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, (maType != null) ? maType.getJsBase() : null, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates an Awesome Oscillator indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.AO ao(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, com.anychart.enums.MovingAverageType maType, String seriesType) {
        return new com.anychart.core.stock.indicators.AO(String.format(Locale.US, jsBase + ".ao(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, (maType != null) ? maType.getJsBase() : null, wrapQuotes(seriesType)));
    }
    /**
     * Creates an Awesome Oscillator indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.AO ao(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, String maType, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.AO(String.format(Locale.US, jsBase + ".ao(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, wrapQuotes(maType), (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates an Awesome Oscillator indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.AO ao(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, String maType, String seriesType) {
        return new com.anychart.core.stock.indicators.AO(String.format(Locale.US, jsBase + ".ao(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, wrapQuotes(maType), wrapQuotes(seriesType)));
    }
    /**
     * 
     */
    public com.anychart.core.stock.scrollerseries.Area area(com.anychart.data.Table data) {
        return new com.anychart.core.stock.scrollerseries.Area(String.format(Locale.US, jsBase + ".area(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * Creates Aroon indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Aroon aroon(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType upSeriesType, com.anychart.enums.StockSeriesType downSeriesType) {
        return new com.anychart.core.stock.indicators.Aroon(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (upSeriesType != null) ? upSeriesType.getJsBase() : null, (downSeriesType != null) ? downSeriesType.getJsBase() : null));
    }
    /**
     * Creates Aroon indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Aroon aroon(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType upSeriesType, String downSeriesType) {
        return new com.anychart.core.stock.indicators.Aroon(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (upSeriesType != null) ? upSeriesType.getJsBase() : null, wrapQuotes(downSeriesType)));
    }
    /**
     * Creates Aroon indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Aroon aroon(com.anychart.data.TableMapping mapping, Number period, String upSeriesType, com.anychart.enums.StockSeriesType downSeriesType) {
        return new com.anychart.core.stock.indicators.Aroon(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(upSeriesType), (downSeriesType != null) ? downSeriesType.getJsBase() : null));
    }
    /**
     * Creates Aroon indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Aroon aroon(com.anychart.data.TableMapping mapping, Number period, String upSeriesType, String downSeriesType) {
        return new com.anychart.core.stock.indicators.Aroon(String.format(Locale.US, jsBase + ".aroon(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(upSeriesType), wrapQuotes(downSeriesType)));
    }
    /**
     * Creates an Average True Range indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.ATR atr(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.ATR(String.format(Locale.US, jsBase + ".atr(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates an Average True Range indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.ATR atr(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.ATR(String.format(Locale.US, jsBase + ".atr(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Getter for scroller auto hide mode.
     */
    public void autoHide() {
        APIlib.getInstance().addJSLine(jsBase + ".autoHide();");
    }
    /**
     * Setter for scroller auto hide mode.
     */
    public com.anychart.core.stock.Scroller autoHide(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".autoHide(%s);", enabled));

        return this;
    }
    /**
     * Creates Bollinger Bands indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, com.anychart.enums.StockSeriesType middleSeriesType, com.anychart.enums.StockSeriesType upperSeriesType, com.anychart.enums.StockSeriesType lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, (middleSeriesType != null) ? middleSeriesType.getJsBase() : null, (upperSeriesType != null) ? upperSeriesType.getJsBase() : null, (lowerSeriesType != null) ? lowerSeriesType.getJsBase() : null));
    }
    /**
     * Creates Bollinger Bands indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, com.anychart.enums.StockSeriesType middleSeriesType, com.anychart.enums.StockSeriesType upperSeriesType, String lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, (middleSeriesType != null) ? middleSeriesType.getJsBase() : null, (upperSeriesType != null) ? upperSeriesType.getJsBase() : null, wrapQuotes(lowerSeriesType)));
    }
    /**
     * Creates Bollinger Bands indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, com.anychart.enums.StockSeriesType middleSeriesType, String upperSeriesType, com.anychart.enums.StockSeriesType lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, (middleSeriesType != null) ? middleSeriesType.getJsBase() : null, wrapQuotes(upperSeriesType), (lowerSeriesType != null) ? lowerSeriesType.getJsBase() : null));
    }
    /**
     * Creates Bollinger Bands indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, com.anychart.enums.StockSeriesType middleSeriesType, String upperSeriesType, String lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, (middleSeriesType != null) ? middleSeriesType.getJsBase() : null, wrapQuotes(upperSeriesType), wrapQuotes(lowerSeriesType)));
    }
    /**
     * Creates Bollinger Bands indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, String middleSeriesType, com.anychart.enums.StockSeriesType upperSeriesType, com.anychart.enums.StockSeriesType lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, wrapQuotes(middleSeriesType), (upperSeriesType != null) ? upperSeriesType.getJsBase() : null, (lowerSeriesType != null) ? lowerSeriesType.getJsBase() : null));
    }
    /**
     * Creates Bollinger Bands indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, String middleSeriesType, com.anychart.enums.StockSeriesType upperSeriesType, String lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, wrapQuotes(middleSeriesType), (upperSeriesType != null) ? upperSeriesType.getJsBase() : null, wrapQuotes(lowerSeriesType)));
    }
    /**
     * Creates Bollinger Bands indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, String middleSeriesType, String upperSeriesType, com.anychart.enums.StockSeriesType lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, wrapQuotes(middleSeriesType), wrapQuotes(upperSeriesType), (lowerSeriesType != null) ? lowerSeriesType.getJsBase() : null));
    }
    /**
     * Creates Bollinger Bands indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.BBands bbands(com.anychart.data.TableMapping mapping, Number period, Number deviation, String middleSeriesType, String upperSeriesType, String lowerSeriesType) {
        return new com.anychart.core.stock.indicators.BBands(String.format(Locale.US, jsBase + ".bbands(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, wrapQuotes(middleSeriesType), wrapQuotes(upperSeriesType), wrapQuotes(lowerSeriesType)));
    }
    /**
     * Creates %B indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.BBandsB bbandsB(com.anychart.data.TableMapping mapping, Number period, Number deviation, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.BBandsB(String.format(Locale.US, jsBase + ".bbandsB(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates %B indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.BBandsB bbandsB(com.anychart.data.TableMapping mapping, Number period, Number deviation, String seriesType) {
        return new com.anychart.core.stock.indicators.BBandsB(String.format(Locale.US, jsBase + ".bbandsB(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, wrapQuotes(seriesType)));
    }
    /**
     * Creates Bollinger Bands Width indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.BBandsWidth bbandsWidth(com.anychart.data.TableMapping mapping, Number period, Number deviation, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.BBandsWidth(String.format(Locale.US, jsBase + ".bbandsWidth(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates Bollinger Bands Width indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.BBandsWidth bbandsWidth(com.anychart.data.TableMapping mapping, Number period, Number deviation, String seriesType) {
        return new com.anychart.core.stock.indicators.BBandsWidth(String.format(Locale.US, jsBase + ".bbandsWidth(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, deviation, wrapQuotes(seriesType)));
    }
    /**
     * Creates a Commodity Channel Index indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.CCI cci(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.CCI(String.format(Locale.US, jsBase + ".cci(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Commodity Channel Index indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.CCI cci(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.CCI(String.format(Locale.US, jsBase + ".cci(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Creates a Chaikin Oscillator indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.CHO cho(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, String maType, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.CHO(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, wrapQuotes(maType), (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Chaikin Oscillator indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.CHO cho(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, String maType, String seriesType) {
        return new com.anychart.core.stock.indicators.CHO(String.format(Locale.US, jsBase + ".cho(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, wrapQuotes(maType), wrapQuotes(seriesType)));
    }
    /**
     * Creates a Chaikin Money Flow indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.CMF cmf(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.CMF(String.format(Locale.US, jsBase + ".cmf(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Chaikin Money Flow indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.CMF cmf(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.CMF(String.format(Locale.US, jsBase + ".cmf(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Setter for the default stock scroller series type.<br/>
<b>Note</b>: We recommend to use the line and area types for the scroller series.
     */
    public void defaultSeriesType() {
        APIlib.getInstance().addJSLine(jsBase + ".defaultSeriesType();");
    }
    /**
     * Setter for the stock scroller default series type.<br/>
<b>Note</b>: We recommend to use the line and area types for the scroller series.
     */
    public com.anychart.core.stock.Scroller defaultSeriesType(com.anychart.enums.StockSeriesType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".defaultSeriesType(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the stock scroller default series type.<br/>
<b>Note</b>: We recommend to use the line and area types for the scroller series.
     */
    public com.anychart.core.stock.Scroller defaultSeriesType(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".defaultSeriesType(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Creates a Directional Movement Index indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, com.anychart.enums.StockSeriesType pdiSeriesType, com.anychart.enums.StockSeriesType ndiSeriesType, com.anychart.enums.StockSeriesType adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, (pdiSeriesType != null) ? pdiSeriesType.getJsBase() : null, (ndiSeriesType != null) ? ndiSeriesType.getJsBase() : null, (adxSeriesType != null) ? adxSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Directional Movement Index indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, com.anychart.enums.StockSeriesType pdiSeriesType, com.anychart.enums.StockSeriesType ndiSeriesType, String adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, (pdiSeriesType != null) ? pdiSeriesType.getJsBase() : null, (ndiSeriesType != null) ? ndiSeriesType.getJsBase() : null, wrapQuotes(adxSeriesType)));
    }
    /**
     * Creates a Directional Movement Index indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, com.anychart.enums.StockSeriesType pdiSeriesType, String ndiSeriesType, com.anychart.enums.StockSeriesType adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, (pdiSeriesType != null) ? pdiSeriesType.getJsBase() : null, wrapQuotes(ndiSeriesType), (adxSeriesType != null) ? adxSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Directional Movement Index indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, com.anychart.enums.StockSeriesType pdiSeriesType, String ndiSeriesType, String adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, (pdiSeriesType != null) ? pdiSeriesType.getJsBase() : null, wrapQuotes(ndiSeriesType), wrapQuotes(adxSeriesType)));
    }
    /**
     * Creates a Directional Movement Index indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, String pdiSeriesType, com.anychart.enums.StockSeriesType ndiSeriesType, com.anychart.enums.StockSeriesType adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType), (ndiSeriesType != null) ? ndiSeriesType.getJsBase() : null, (adxSeriesType != null) ? adxSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Directional Movement Index indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, String pdiSeriesType, com.anychart.enums.StockSeriesType ndiSeriesType, String adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType), (ndiSeriesType != null) ? ndiSeriesType.getJsBase() : null, wrapQuotes(adxSeriesType)));
    }
    /**
     * Creates a Directional Movement Index indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, String pdiSeriesType, String ndiSeriesType, com.anychart.enums.StockSeriesType adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType), wrapQuotes(ndiSeriesType), (adxSeriesType != null) ? adxSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Directional Movement Index indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.DMI dmi(com.anychart.data.TableMapping mapping, Number period, Number adxPeriod, Boolean useWildersSmoothing, String pdiSeriesType, String ndiSeriesType, String adxSeriesType) {
        return new com.anychart.core.stock.indicators.DMI(String.format(Locale.US, jsBase + ".dmi(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, adxPeriod, useWildersSmoothing, wrapQuotes(pdiSeriesType), wrapQuotes(ndiSeriesType), wrapQuotes(adxSeriesType)));
    }
    /**
     * Creates EMA (Exponential Moving Average) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.EMA ema(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.EMA(String.format(Locale.US, jsBase + ".ema(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates EMA (Exponential Moving Average) indicator on the scroller.
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
    public com.anychart.core.stock.Scroller enabled(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", enabled));

        return this;
    }
    /**
     * Getter for the scroller fill.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Setter for scroller fill settings using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller fill(com.anychart.graphics.vector.Fill color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Setter for scroller fill settings using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller fill(com.anychart.graphics.vector.GradientKey color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Setter for scroller fill settings using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller fill(String[] color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", arrayToStringWrapQuotes(color)));

        return this;
    }
    /**
     * Scroller fill color with opacity.
     */
    public com.anychart.core.stock.Scroller fill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller fill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller fill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller fill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller fill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller fill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller fill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller fill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller fill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Gets series by its id.
     */
    public com.anychart.core.stock.scrollerseries.Base getSeries(Number id) {
        return new com.anychart.core.stock.scrollerseries.Base(String.format(Locale.US, jsBase + ".getSeries(%s)", id));
    }
    /**
     * Gets series by its id.
     */
    public com.anychart.core.stock.scrollerseries.Base getSeries(String id) {
        return new com.anychart.core.stock.scrollerseries.Base(String.format(Locale.US, jsBase + ".getSeries(%s)", wrapQuotes(id)));
    }
    /**
     * Gets the series by its index.
     */
    public com.anychart.core.stock.scrollerseries.Base getSeriesAt(Number index) {
        return new com.anychart.core.stock.scrollerseries.Base(String.format(Locale.US, jsBase + ".getSeriesAt(%s)", index));
    }
    /**
     * Returns series count.
     */
    public void getSeriesCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getSeriesCount();");
    }
    /**
     * Creates a Heikin-Ashi indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.HA ha(com.anychart.data.TableMapping mapping, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.HA(String.format(Locale.US, jsBase + ".ha(%s, %s)", (mapping != null) ? mapping.getJsBase() : null, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Heikin-Ashi indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.HA ha(com.anychart.data.TableMapping mapping, String seriesType) {
        return new com.anychart.core.stock.indicators.HA(String.format(Locale.US, jsBase + ".ha(%s, %s)", (mapping != null) ? mapping.getJsBase() : null, wrapQuotes(seriesType)));
    }
    /**
     * Getter for hatch fill palette settings.
     */
    public com.anychart.palettes.HatchFills hatchFillPalette() {
        return new com.anychart.palettes.HatchFills(jsBase + ".hatchFillPalette()");
    }
    /**
     * Hatch fill palette settings.
     */
    public com.anychart.core.stock.Scroller hatchFillPalette(com.anychart.graphics.vector.hatchfill.HatchFillType[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", arrayToString(value)));

        return this;
    }
    /**
     * Hatch fill palette settings.
     */
    public com.anychart.core.stock.Scroller hatchFillPalette(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Hatch fill palette settings.
     */
    public com.anychart.core.stock.Scroller hatchFillPalette(com.anychart.palettes.HatchFills value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hatchFillPalette(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the scroller height.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for the scroller height.
     */
    public com.anychart.core.stock.Scroller height(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", height));

        return this;
    }
    /**
     * Setter for the scroller height.
     */
    public com.anychart.core.stock.Scroller height(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.stock.scrollerseries.Hilo hilo(com.anychart.data.Table data) {
        return new com.anychart.core.stock.scrollerseries.Hilo(String.format(Locale.US, jsBase + ".hilo(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null, wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, com.anychart.enums.StockSeriesType jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), (jSeriesType != null) ? jSeriesType.getJsBase() : null));
    }
    /**
     * Creates a KDJ indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KDJ kdj(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, Number kMultiplier, Number dMultiplier, String kSeriesType, String dSeriesType, String jSeriesType) {
        return new com.anychart.core.stock.indicators.KDJ(String.format(Locale.US, jsBase + ".kdj(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), kMultiplier, dMultiplier, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType), wrapQuotes(jSeriesType)));
    }
    /**
     * Creates a Keltner Channels indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KeltnerChannels keltnerChannels(com.anychart.data.TableMapping mapping, Number maPeriod, Number atrPeriod, com.anychart.enums.MovingAverageType maType, Number multiplier, com.anychart.enums.StockSeriesType maSeries) {
        return new com.anychart.core.stock.indicators.KeltnerChannels(String.format(Locale.US, jsBase + ".keltnerChannels(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, atrPeriod, (maType != null) ? maType.getJsBase() : null, multiplier, (maSeries != null) ? maSeries.getJsBase() : null));
    }
    /**
     * Creates a Keltner Channels indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KeltnerChannels keltnerChannels(com.anychart.data.TableMapping mapping, Number maPeriod, Number atrPeriod, com.anychart.enums.MovingAverageType maType, Number multiplier, String maSeries) {
        return new com.anychart.core.stock.indicators.KeltnerChannels(String.format(Locale.US, jsBase + ".keltnerChannels(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, atrPeriod, (maType != null) ? maType.getJsBase() : null, multiplier, wrapQuotes(maSeries)));
    }
    /**
     * Creates a Keltner Channels indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KeltnerChannels keltnerChannels(com.anychart.data.TableMapping mapping, Number maPeriod, Number atrPeriod, String maType, Number multiplier, com.anychart.enums.StockSeriesType maSeries) {
        return new com.anychart.core.stock.indicators.KeltnerChannels(String.format(Locale.US, jsBase + ".keltnerChannels(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, atrPeriod, wrapQuotes(maType), multiplier, (maSeries != null) ? maSeries.getJsBase() : null));
    }
    /**
     * Creates a Keltner Channels indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.KeltnerChannels keltnerChannels(com.anychart.data.TableMapping mapping, Number maPeriod, Number atrPeriod, String maType, Number multiplier, String maSeries) {
        return new com.anychart.core.stock.indicators.KeltnerChannels(String.format(Locale.US, jsBase + ".keltnerChannels(%s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, atrPeriod, wrapQuotes(maType), multiplier, wrapQuotes(maSeries)));
    }
    /**
     * 
     */
    public com.anychart.core.stock.scrollerseries.Line line(com.anychart.data.Table data) {
        return new com.anychart.core.stock.scrollerseries.Line(String.format(Locale.US, jsBase + ".line(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, com.anychart.enums.StockSeriesType macdSeriesType, com.anychart.enums.StockSeriesType signalSeriesType, com.anychart.enums.StockSeriesType histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, (macdSeriesType != null) ? macdSeriesType.getJsBase() : null, (signalSeriesType != null) ? signalSeriesType.getJsBase() : null, (histogramSeriesType != null) ? histogramSeriesType.getJsBase() : null));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, com.anychart.enums.StockSeriesType macdSeriesType, com.anychart.enums.StockSeriesType signalSeriesType, String histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, (macdSeriesType != null) ? macdSeriesType.getJsBase() : null, (signalSeriesType != null) ? signalSeriesType.getJsBase() : null, wrapQuotes(histogramSeriesType)));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, com.anychart.enums.StockSeriesType macdSeriesType, String signalSeriesType, com.anychart.enums.StockSeriesType histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, (macdSeriesType != null) ? macdSeriesType.getJsBase() : null, wrapQuotes(signalSeriesType), (histogramSeriesType != null) ? histogramSeriesType.getJsBase() : null));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, com.anychart.enums.StockSeriesType macdSeriesType, String signalSeriesType, String histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, (macdSeriesType != null) ? macdSeriesType.getJsBase() : null, wrapQuotes(signalSeriesType), wrapQuotes(histogramSeriesType)));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, String macdSeriesType, com.anychart.enums.StockSeriesType signalSeriesType, com.anychart.enums.StockSeriesType histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, wrapQuotes(macdSeriesType), (signalSeriesType != null) ? signalSeriesType.getJsBase() : null, (histogramSeriesType != null) ? histogramSeriesType.getJsBase() : null));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, String macdSeriesType, com.anychart.enums.StockSeriesType signalSeriesType, String histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, wrapQuotes(macdSeriesType), (signalSeriesType != null) ? signalSeriesType.getJsBase() : null, wrapQuotes(histogramSeriesType)));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, String macdSeriesType, String signalSeriesType, com.anychart.enums.StockSeriesType histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, wrapQuotes(macdSeriesType), wrapQuotes(signalSeriesType), (histogramSeriesType != null) ? histogramSeriesType.getJsBase() : null));
    }
    /**
     * Creates MACD (Moving Average Convergence Divergence) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.MACD macd(com.anychart.data.TableMapping mapping, Number fastPeriod, Number slowPeriod, Number signalPeriod, String macdSeriesType, String signalSeriesType, String histogramSeriesType) {
        return new com.anychart.core.stock.indicators.MACD(String.format(Locale.US, jsBase + ".macd(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, fastPeriod, slowPeriod, signalPeriod, wrapQuotes(macdSeriesType), wrapQuotes(signalSeriesType), wrapQuotes(histogramSeriesType)));
    }
    /**
     * Getter for the scroller maximum height.
     */
    public void maxHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".maxHeight();");
    }
    /**
     * Setter for the scroller maximum height.
     */
    public com.anychart.core.stock.Scroller maxHeight(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", height));

        return this;
    }
    /**
     * Setter for the scroller maximum height.
     */
    public com.anychart.core.stock.Scroller maxHeight(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * Creates a MFI (Money Flow Index) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.MFI mfi(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.MFI(String.format(Locale.US, jsBase + ".mfi(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a MFI (Money Flow Index) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.MFI mfi(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.MFI(String.format(Locale.US, jsBase + ".mfi(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Setter for the scroller minimum height.
     */
    public void minHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".minHeight();");
    }
    /**
     * Setter for the scroller minimum height.
     */
    public com.anychart.core.stock.Scroller minHeight(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", height));

        return this;
    }
    /**
     * Setter for the scroller minimum height.
     */
    public com.anychart.core.stock.Scroller minHeight(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * Creates MMA (Modified Moving Average) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.MMA mma(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.MMA(String.format(Locale.US, jsBase + ".mma(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates MMA (Modified Moving Average) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.MMA mma(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.MMA(String.format(Locale.US, jsBase + ".mma(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Creates a Momentum indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Momentum momentum(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.Momentum(String.format(Locale.US, jsBase + ".momentum(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Momentum indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Momentum momentum(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.Momentum(String.format(Locale.US, jsBase + ".momentum(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Creates an On Balance Volume indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.OBV obv(com.anychart.data.TableMapping mapping, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.OBV(String.format(Locale.US, jsBase + ".obv(%s, %s)", (mapping != null) ? mapping.getJsBase() : null, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates an On Balance Volume indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.OBV obv(com.anychart.data.TableMapping mapping, String seriesType) {
        return new com.anychart.core.stock.indicators.OBV(String.format(Locale.US, jsBase + ".obv(%s, %s)", (mapping != null) ? mapping.getJsBase() : null, wrapQuotes(seriesType)));
    }
    /**
     * 
     */
    public com.anychart.core.stock.scrollerseries.OHLC ohlc(com.anychart.data.Table data) {
        return new com.anychart.core.stock.scrollerseries.OHLC(String.format(Locale.US, jsBase + ".ohlc(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * Getter for the scroller orientation.
     */
    public void orientation() {
        APIlib.getInstance().addJSLine(jsBase + ".orientation();");
    }
    /**
     * Setter for the scroller orientation.
     */
    public com.anychart.core.stock.Scroller orientation(com.anychart.enums.Orientation orientation) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".orientation(%s);", (orientation != null) ? orientation.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the scroller orientation.
     */
    public com.anychart.core.stock.Scroller orientation(String orientation) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".orientation(%s);", wrapQuotes(orientation)));

        return this;
    }
    /**
     * Getter for outline stroke settings.
     */
    public void outlineStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".outlineStroke();");
    }
    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.stock.Scroller outlineStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.stock.Scroller outlineStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.stock.Scroller outlineStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.stock.Scroller outlineStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.stock.Scroller outlineStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.stock.Scroller outlineStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.stock.Scroller outlineStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.stock.Scroller outlineStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.stock.Scroller outlineStroke(String color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.stock.Scroller outlineStroke(String color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.stock.Scroller outlineStroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for outline stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.stock.Scroller outlineStroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for outline stroke using an object.
     */
    public com.anychart.core.stock.Scroller outlineStroke(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".outlineStroke(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Getter for the scroller colors palette.
     */
    public com.anychart.palettes.RangeColors palette() {
        return new com.anychart.palettes.RangeColors(jsBase + ".palette()");
    }
    /**
     * Setter for the scroller colors palette.
     */
    public com.anychart.core.stock.Scroller palette(com.anychart.palettes.RangeColors value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".palette(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the scroller colors palette.
     */
    public com.anychart.core.stock.Scroller palette(com.anychart.palettes.DistinctColors value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".palette(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the scroller colors palette.
     */
    public com.anychart.core.stock.Scroller palette(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".palette(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the scroller colors palette.
     */
    public com.anychart.core.stock.Scroller palette(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".palette(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Creates a Price Channels indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.PriceChannels priceChannels(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType middleSeriesType, com.anychart.enums.StockSeriesType rangeSeriesType) {
        return new com.anychart.core.stock.indicators.PriceChannels(String.format(Locale.US, jsBase + ".priceChannels(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (middleSeriesType != null) ? middleSeriesType.getJsBase() : null, (rangeSeriesType != null) ? rangeSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Price Channels indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.PriceChannels priceChannels(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType middleSeriesType, String rangeSeriesType) {
        return new com.anychart.core.stock.indicators.PriceChannels(String.format(Locale.US, jsBase + ".priceChannels(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (middleSeriesType != null) ? middleSeriesType.getJsBase() : null, wrapQuotes(rangeSeriesType)));
    }
    /**
     * Creates a Price Channels indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.PriceChannels priceChannels(com.anychart.data.TableMapping mapping, Number period, String middleSeriesType, com.anychart.enums.StockSeriesType rangeSeriesType) {
        return new com.anychart.core.stock.indicators.PriceChannels(String.format(Locale.US, jsBase + ".priceChannels(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(middleSeriesType), (rangeSeriesType != null) ? rangeSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Price Channels indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.PriceChannels priceChannels(com.anychart.data.TableMapping mapping, Number period, String middleSeriesType, String rangeSeriesType) {
        return new com.anychart.core.stock.indicators.PriceChannels(String.format(Locale.US, jsBase + ".priceChannels(%s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(middleSeriesType), wrapQuotes(rangeSeriesType)));
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
     * Creates a PSAR (Parabolic SAR) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.PSAR psar(com.anychart.data.TableMapping mapping, Number accelerationFactorStart, Number accelerationFactorIncrement, Number accelerationFactorMaximum, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.PSAR(String.format(Locale.US, jsBase + ".psar(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, accelerationFactorStart, accelerationFactorIncrement, accelerationFactorMaximum, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a PSAR (Parabolic SAR) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.PSAR psar(com.anychart.data.TableMapping mapping, Number accelerationFactorStart, Number accelerationFactorIncrement, Number accelerationFactorMaximum, String seriesType) {
        return new com.anychart.core.stock.indicators.PSAR(String.format(Locale.US, jsBase + ".psar(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, accelerationFactorStart, accelerationFactorIncrement, accelerationFactorMaximum, wrapQuotes(seriesType)));
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
    public com.anychart.core.stock.Scroller removeAllSeries() {
        APIlib.getInstance().addJSLine(jsBase + ".removeAllSeries();");

        return this;
    }
    /**
     * Removes one of series from chart by its id.
     */
    public com.anychart.core.stock.Scroller removeSeries(Number id) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeSeries(%s);", id));

        return this;
    }
    /**
     * Removes one of series from chart by its id.
     */
    public com.anychart.core.stock.Scroller removeSeries(String id) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeSeries(%s);", wrapQuotes(id)));

        return this;
    }
    /**
     * Removes one of series from chart by its index.
     */
    public com.anychart.core.stock.Scroller removeSeriesAt(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeSeriesAt(%s);", index));

        return this;
    }
    /**
     * Creates RoC (Rate of Change) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.RoC roc(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.RoC(String.format(Locale.US, jsBase + ".roc(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates RoC (Rate of Change) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.RoC roc(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.RoC(String.format(Locale.US, jsBase + ".roc(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Creates RSI (Relative Strength Index) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.RSI rsi(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.RSI(String.format(Locale.US, jsBase + ".rsi(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates RSI (Relative Strength Index) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.RSI rsi(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.RSI(String.format(Locale.US, jsBase + ".rsi(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Getter for scroller fill in selected mode.
     */
    public void selectedFill() {
        APIlib.getInstance().addJSLine(jsBase + ".selectedFill();");
    }
    /**
     * Setter for scroller fill settings in selected mode using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller selectedFill(com.anychart.graphics.vector.Fill color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedFill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Setter for scroller fill settings in selected mode using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller selectedFill(com.anychart.graphics.vector.GradientKey color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedFill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Setter for scroller fill settings in selected mode using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller selectedFill(String[] color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedFill(%s);", arrayToStringWrapQuotes(color)));

        return this;
    }
    /**
     * Scroller fill color in selected mode with opacity.
     */
    public com.anychart.core.stock.Scroller selectedFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller selectedFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller selectedFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller selectedFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller selectedFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller selectedFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller selectedFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller selectedFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill in selected mode.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.Scroller selectedFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectedFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Creates SMA (Simple Moving Average) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.SMA sma(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.SMA(String.format(Locale.US, jsBase + ".sma(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates SMA (Simple Moving Average) indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.SMA sma(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.SMA(String.format(Locale.US, jsBase + ".sma(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, com.anychart.enums.MovingAverageType dMAType, String kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, (dMAType != null) ? dMAType.getJsBase() : null, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, com.anychart.enums.MovingAverageType kMAType, String dMAType, String kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, (kMAType != null) ? kMAType.getJsBase() : null, wrapQuotes(dMAType), wrapQuotes(kSeriesType), wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, com.anychart.enums.MovingAverageType dMAType, String kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), (dMAType != null) ? dMAType.getJsBase() : null, wrapQuotes(kSeriesType), wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, com.anychart.enums.StockSeriesType kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), (kSeriesType != null) ? kSeriesType.getJsBase() : null, (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, com.anychart.enums.StockSeriesType kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), (kSeriesType != null) ? kSeriesType.getJsBase() : null, wrapQuotes(dSeriesType)));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, String kSeriesType, com.anychart.enums.StockSeriesType dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), wrapQuotes(kSeriesType), (dSeriesType != null) ? dSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Stochastic indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.Stochastic stochastic(com.anychart.data.TableMapping mapping, Number kPeriod, Number kMAPeriod, Number dPeriod, String kMAType, String dMAType, String kSeriesType, String dSeriesType) {
        return new com.anychart.core.stock.indicators.Stochastic(String.format(Locale.US, jsBase + ".stochastic(%s, %s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, kPeriod, kMAPeriod, dPeriod, wrapQuotes(kMAType), wrapQuotes(dMAType), wrapQuotes(kSeriesType), wrapQuotes(dSeriesType)));
    }
    /**
     * Getter for the thumbs.
     */
    public com.anychart.core.ui.scroller.Thumbs thumbs() {
        return new com.anychart.core.ui.scroller.Thumbs(jsBase + ".thumbs()");
    }
    /**
     * Setter for the thumbs settings.
     */
    public com.anychart.core.stock.Scroller thumbs(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".thumbs(%s);", settings));

        return this;
    }
    /**
     * Setter for the thumbs settings.
     */
    public com.anychart.core.stock.Scroller thumbs(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".thumbs(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.MovingAverageType signalMaType, com.anychart.enums.StockSeriesType trixSeriesType, com.anychart.enums.StockSeriesType signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, (maType != null) ? maType.getJsBase() : null, (signalMaType != null) ? signalMaType.getJsBase() : null, (trixSeriesType != null) ? trixSeriesType.getJsBase() : null, (signalSeriesType != null) ? signalSeriesType.getJsBase() : null));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.MovingAverageType signalMaType, com.anychart.enums.StockSeriesType trixSeriesType, String signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, (maType != null) ? maType.getJsBase() : null, (signalMaType != null) ? signalMaType.getJsBase() : null, (trixSeriesType != null) ? trixSeriesType.getJsBase() : null, wrapQuotes(signalSeriesType)));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.MovingAverageType signalMaType, String trixSeriesType, com.anychart.enums.StockSeriesType signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, (maType != null) ? maType.getJsBase() : null, (signalMaType != null) ? signalMaType.getJsBase() : null, wrapQuotes(trixSeriesType), (signalSeriesType != null) ? signalSeriesType.getJsBase() : null));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.MovingAverageType signalMaType, String trixSeriesType, String signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, (maType != null) ? maType.getJsBase() : null, (signalMaType != null) ? signalMaType.getJsBase() : null, wrapQuotes(trixSeriesType), wrapQuotes(signalSeriesType)));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, com.anychart.enums.MovingAverageType maType, String signalMaType, com.anychart.enums.StockSeriesType trixSeriesType, com.anychart.enums.StockSeriesType signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, (maType != null) ? maType.getJsBase() : null, wrapQuotes(signalMaType), (trixSeriesType != null) ? trixSeriesType.getJsBase() : null, (signalSeriesType != null) ? signalSeriesType.getJsBase() : null));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, com.anychart.enums.MovingAverageType maType, String signalMaType, com.anychart.enums.StockSeriesType trixSeriesType, String signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, (maType != null) ? maType.getJsBase() : null, wrapQuotes(signalMaType), (trixSeriesType != null) ? trixSeriesType.getJsBase() : null, wrapQuotes(signalSeriesType)));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, com.anychart.enums.MovingAverageType maType, String signalMaType, String trixSeriesType, com.anychart.enums.StockSeriesType signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, (maType != null) ? maType.getJsBase() : null, wrapQuotes(signalMaType), wrapQuotes(trixSeriesType), (signalSeriesType != null) ? signalSeriesType.getJsBase() : null));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, com.anychart.enums.MovingAverageType maType, String signalMaType, String trixSeriesType, String signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, (maType != null) ? maType.getJsBase() : null, wrapQuotes(signalMaType), wrapQuotes(trixSeriesType), wrapQuotes(signalSeriesType)));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, String maType, com.anychart.enums.MovingAverageType signalMaType, com.anychart.enums.StockSeriesType trixSeriesType, com.anychart.enums.StockSeriesType signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, wrapQuotes(maType), (signalMaType != null) ? signalMaType.getJsBase() : null, (trixSeriesType != null) ? trixSeriesType.getJsBase() : null, (signalSeriesType != null) ? signalSeriesType.getJsBase() : null));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, String maType, com.anychart.enums.MovingAverageType signalMaType, com.anychart.enums.StockSeriesType trixSeriesType, String signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, wrapQuotes(maType), (signalMaType != null) ? signalMaType.getJsBase() : null, (trixSeriesType != null) ? trixSeriesType.getJsBase() : null, wrapQuotes(signalSeriesType)));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, String maType, com.anychart.enums.MovingAverageType signalMaType, String trixSeriesType, com.anychart.enums.StockSeriesType signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, wrapQuotes(maType), (signalMaType != null) ? signalMaType.getJsBase() : null, wrapQuotes(trixSeriesType), (signalSeriesType != null) ? signalSeriesType.getJsBase() : null));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, String maType, com.anychart.enums.MovingAverageType signalMaType, String trixSeriesType, String signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, wrapQuotes(maType), (signalMaType != null) ? signalMaType.getJsBase() : null, wrapQuotes(trixSeriesType), wrapQuotes(signalSeriesType)));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, String maType, String signalMaType, com.anychart.enums.StockSeriesType trixSeriesType, com.anychart.enums.StockSeriesType signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, wrapQuotes(maType), wrapQuotes(signalMaType), (trixSeriesType != null) ? trixSeriesType.getJsBase() : null, (signalSeriesType != null) ? signalSeriesType.getJsBase() : null));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, String maType, String signalMaType, com.anychart.enums.StockSeriesType trixSeriesType, String signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, wrapQuotes(maType), wrapQuotes(signalMaType), (trixSeriesType != null) ? trixSeriesType.getJsBase() : null, wrapQuotes(signalSeriesType)));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, String maType, String signalMaType, String trixSeriesType, com.anychart.enums.StockSeriesType signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, wrapQuotes(maType), wrapQuotes(signalMaType), wrapQuotes(trixSeriesType), (signalSeriesType != null) ? signalSeriesType.getJsBase() : null));
    }
    /**
     * Creates a TRIX indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.TRIX trix(com.anychart.data.TableMapping mapping, Number period, Number signalPeriod, String maType, String signalMaType, String trixSeriesType, String signalSeriesType) {
        return new com.anychart.core.stock.indicators.TRIX(String.format(Locale.US, jsBase + ".trix(%s, %s, %s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, signalPeriod, wrapQuotes(maType), wrapQuotes(signalMaType), wrapQuotes(trixSeriesType), wrapQuotes(signalSeriesType)));
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
     * Creates a Volume + MA indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.StockSeriesType volumeSeriesType, com.anychart.enums.StockSeriesType maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, (maType != null) ? maType.getJsBase() : null, (volumeSeriesType != null) ? volumeSeriesType.getJsBase() : null, (maSeriesType != null) ? maSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Volume + MA indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, com.anychart.enums.MovingAverageType maType, com.anychart.enums.StockSeriesType volumeSeriesType, String maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, (maType != null) ? maType.getJsBase() : null, (volumeSeriesType != null) ? volumeSeriesType.getJsBase() : null, wrapQuotes(maSeriesType)));
    }
    /**
     * Creates a Volume + MA indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, com.anychart.enums.MovingAverageType maType, String volumeSeriesType, com.anychart.enums.StockSeriesType maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, (maType != null) ? maType.getJsBase() : null, wrapQuotes(volumeSeriesType), (maSeriesType != null) ? maSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Volume + MA indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, com.anychart.enums.MovingAverageType maType, String volumeSeriesType, String maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, (maType != null) ? maType.getJsBase() : null, wrapQuotes(volumeSeriesType), wrapQuotes(maSeriesType)));
    }
    /**
     * Creates a Volume + MA indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, String maType, com.anychart.enums.StockSeriesType volumeSeriesType, com.anychart.enums.StockSeriesType maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, wrapQuotes(maType), (volumeSeriesType != null) ? volumeSeriesType.getJsBase() : null, (maSeriesType != null) ? maSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Volume + MA indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, String maType, com.anychart.enums.StockSeriesType volumeSeriesType, String maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, wrapQuotes(maType), (volumeSeriesType != null) ? volumeSeriesType.getJsBase() : null, wrapQuotes(maSeriesType)));
    }
    /**
     * Creates a Volume + MA indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, String maType, String volumeSeriesType, com.anychart.enums.StockSeriesType maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, wrapQuotes(maType), wrapQuotes(volumeSeriesType), (maSeriesType != null) ? maSeriesType.getJsBase() : null));
    }
    /**
     * Creates a Volume + MA indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.VolumeMA volumeMa(com.anychart.data.TableMapping mapping, Number maPeriod, String maType, String volumeSeriesType, String maSeriesType) {
        return new com.anychart.core.stock.indicators.VolumeMA(String.format(Locale.US, jsBase + ".volumeMa(%s, %s, %s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, maPeriod, wrapQuotes(maType), wrapQuotes(volumeSeriesType), wrapQuotes(maSeriesType)));
    }
    /**
     * Creates a Williams %R indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.WilliamsR williamsR(com.anychart.data.TableMapping mapping, Number period, com.anychart.enums.StockSeriesType seriesType) {
        return new com.anychart.core.stock.indicators.WilliamsR(String.format(Locale.US, jsBase + ".williamsR(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, (seriesType != null) ? seriesType.getJsBase() : null));
    }
    /**
     * Creates a Williams %R indicator on the scroller.
     */
    public com.anychart.core.stock.indicators.WilliamsR williamsR(com.anychart.data.TableMapping mapping, Number period, String seriesType) {
        return new com.anychart.core.stock.indicators.WilliamsR(String.format(Locale.US, jsBase + ".williamsR(%s, %s, %s)", (mapping != null) ? mapping.getJsBase() : null, period, wrapQuotes(seriesType)));
    }
    /**
     * Getter for the scroller X-axis.
     */
    public com.anychart.core.axes.StockDateTime xAxis() {
        return new com.anychart.core.axes.StockDateTime(jsBase + ".xAxis()");
    }
    /**
     * Setter for the scroller X-axis.
     */
    public com.anychart.core.stock.Scroller xAxis(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xAxis(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the scroller X-axis.
     */
    public com.anychart.core.stock.Scroller xAxis(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xAxis(%s);", settings));

        return this;
    }
    /**
     * Getter for the scroller Y-scale.
     */
    public com.anychart.scales.ScatterBase yScale() {
        return new com.anychart.scales.ScatterBase(jsBase + ".yScale()");
    }
    /**
     * Setter for the scroller Y-scale.
     */
    public com.anychart.core.stock.Scroller yScale(com.anychart.enums.ScatterScaleTypes settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", (settings != null) ? settings.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the scroller Y-scale.
     */
    public com.anychart.core.stock.Scroller yScale(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the scroller Y-scale.
     */
    public com.anychart.core.stock.Scroller yScale(com.anychart.scales.ScatterBase settings) {
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
    public com.anychart.core.stock.Scroller zIndex(Number zIndex) {
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
    public com.anychart.core.stock.Scroller container(com.anychart.graphics.vector.Layer element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.stock.Scroller container(com.anychart.graphics.vector.Stage element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.stock.Scroller container(String element) {
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
    public com.anychart.core.stock.Scroller parentBounds(com.anychart.math.Rect bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", (bounds != null) ? bounds.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.stock.Scroller parentBounds(String bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", wrapQuotes(bounds)));

        return this;
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.stock.Scroller parentBounds(Number bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", bounds));

        return this;
    }
    /**
     * Setter for the parent bounds using several values.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.stock.Scroller parentBounds(Number left, Number top, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s, %s, %s, %s);", left, top, width, height));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.stock.scrollerseries.Area area(com.anychart.data.TableMapping data) {
        return new com.anychart.core.stock.scrollerseries.Area(String.format(Locale.US, jsBase + ".area(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.stock.scrollerseries.Line line(com.anychart.data.TableMapping data) {
        return new com.anychart.core.stock.scrollerseries.Line(String.format(Locale.US, jsBase + ".line(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.stock.scrollerseries.Hilo hilo(com.anychart.data.TableMapping data) {
        return new com.anychart.core.stock.scrollerseries.Hilo(String.format(Locale.US, jsBase + ".hilo(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.stock.scrollerseries.OHLC ohlc(com.anychart.data.TableMapping data) {
        return new com.anychart.core.stock.scrollerseries.OHLC(String.format(Locale.US, jsBase + ".ohlc(%s)", (data != null) ? data.getJsBase() : null));
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
    /**
     * 
     */
    public com.anychart.core.stock.Scroller fill(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", wrapQuotes(value)));

        return this;
    }

}