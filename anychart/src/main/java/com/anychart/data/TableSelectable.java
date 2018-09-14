package com.anychart.data;

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
 * Table mapping proxy that supports selection
 */
public class TableSelectable extends JsObject {

    protected TableSelectable() {

    }

    public static TableSelectable instantiate() {
        return new TableSelectable("new anychart.data.tableSelectable()");
    }

    

    public TableSelectable(String jsChart) {
        jsBase = "tableSelectable" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Returns a new iterator for current selection.
     */
    public com.anychart.data.TableIterator getIterator() {
        return new com.anychart.data.TableIterator(jsBase + ".getIterator()");
    }
    /**
     * Searches asked key with asked mode and return an object that allows values fetching.
     */
    public com.anychart.data.tableselectable.RowProxy search(Number key, com.anychart.enums.TableSearchMode mode) {
        return new com.anychart.data.tableselectable.RowProxy(String.format(Locale.US, jsBase + ".search(%s, %s)", key, (mode != null) ? mode.getJsBase() : null));
    }
    /**
     * Searches asked key with asked mode and return an object that allows values fetching.
     */
    public com.anychart.data.tableselectable.RowProxy search(Number key, String mode) {
        return new com.anychart.data.tableselectable.RowProxy(String.format(Locale.US, jsBase + ".search(%s, %s)", key, wrapQuotes(mode)));
    }
    /**
     * Searches asked key with asked mode and return an object that allows values fetching.
     */
    public com.anychart.data.tableselectable.RowProxy search(String key, com.anychart.enums.TableSearchMode mode) {
        return new com.anychart.data.tableselectable.RowProxy(String.format(Locale.US, jsBase + ".search(%s, %s)", wrapQuotes(key), (mode != null) ? mode.getJsBase() : null));
    }
    /**
     * Searches asked key with asked mode and return an object that allows values fetching.
     */
    public com.anychart.data.tableselectable.RowProxy search(String key, String mode) {
        return new com.anychart.data.tableselectable.RowProxy(String.format(Locale.US, jsBase + ".search(%s, %s)", wrapQuotes(key), wrapQuotes(mode)));
    }
    /**
     * Selects asked range.
     */
    public com.anychart.data.TableSelectable select(Number startDate, Number endDate, com.anychart.enums.Interval intervalUnit, Number intervalCount) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", startDate, endDate, (intervalUnit != null) ? intervalUnit.getJsBase() : null, intervalCount));

        return this;
    }
    /**
     * Selects asked range.
     */
    public com.anychart.data.TableSelectable select(Number startDate, Number endDate, String intervalUnit, Number intervalCount) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", startDate, endDate, wrapQuotes(intervalUnit), intervalCount));

        return this;
    }
    /**
     * Selects asked range.
     */
    public com.anychart.data.TableSelectable select(Number startDate, String endDate, com.anychart.enums.Interval intervalUnit, Number intervalCount) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", startDate, wrapQuotes(endDate), (intervalUnit != null) ? intervalUnit.getJsBase() : null, intervalCount));

        return this;
    }
    /**
     * Selects asked range.
     */
    public com.anychart.data.TableSelectable select(Number startDate, String endDate, String intervalUnit, Number intervalCount) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", startDate, wrapQuotes(endDate), wrapQuotes(intervalUnit), intervalCount));

        return this;
    }
    /**
     * Selects asked range.
     */
    public com.anychart.data.TableSelectable select(String startDate, Number endDate, com.anychart.enums.Interval intervalUnit, Number intervalCount) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", wrapQuotes(startDate), endDate, (intervalUnit != null) ? intervalUnit.getJsBase() : null, intervalCount));

        return this;
    }
    /**
     * Selects asked range.
     */
    public com.anychart.data.TableSelectable select(String startDate, Number endDate, String intervalUnit, Number intervalCount) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", wrapQuotes(startDate), endDate, wrapQuotes(intervalUnit), intervalCount));

        return this;
    }
    /**
     * Selects asked range.
     */
    public com.anychart.data.TableSelectable select(String startDate, String endDate, com.anychart.enums.Interval intervalUnit, Number intervalCount) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", wrapQuotes(startDate), wrapQuotes(endDate), (intervalUnit != null) ? intervalUnit.getJsBase() : null, intervalCount));

        return this;
    }
    /**
     * Selects asked range.
     */
    public com.anychart.data.TableSelectable select(String startDate, String endDate, String intervalUnit, Number intervalCount) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s, %s, %s, %s);", wrapQuotes(startDate), wrapQuotes(endDate), wrapQuotes(intervalUnit), intervalCount));

        return this;
    }
    /**
     * Selects the full range of the storage.
     */
    public com.anychart.data.TableSelectable selectAll(com.anychart.enums.Interval intervalUnit, Number intervalCount) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectAll(%s, %s);", (intervalUnit != null) ? intervalUnit.getJsBase() : null, intervalCount));

        return this;
    }
    /**
     * Selects the full range of the storage.
     */
    public com.anychart.data.TableSelectable selectAll(String intervalUnit, Number intervalCount) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectAll(%s, %s);", wrapQuotes(intervalUnit), intervalCount));

        return this;
    }

}