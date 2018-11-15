package com.anychart.core.utils;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.Base;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Stores information about visual location of an object.<br/>
Can be defined with an object, a {@link anychart.math#rect} or as a set of numbers.<br/>
<b>Note</b>: "right" and "bottom" have priority over "width" and "height".
 */
public class Bounds extends Base {

    protected Bounds() {

    }

    public static Bounds instantiate() {
        return new Bounds("new anychart.core.utils.bounds()");
    }

    

    public Bounds(String jsChart) {
        jsBase = "bounds" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the bottom edge position.
     */
    public void bottom() {
        APIlib.getInstance().addJSLine(jsBase + ".bottom();");
    }
    /**
     * Setter for the bottom edge position.
     */
    public com.anychart.core.utils.Bounds bottom(Number bottom) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", bottom));

        return this;
    }
    /**
     * Setter for the bottom edge position.
     */
    public com.anychart.core.utils.Bounds bottom(String bottom) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", wrapQuotes(bottom)));

        return this;
    }
    /**
     * Getter for the height value.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for the height value.
     */
    public com.anychart.core.utils.Bounds height(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", height));

        return this;
    }
    /**
     * Setter for the height value.
     */
    public com.anychart.core.utils.Bounds height(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * Getter for the left edge position.
     */
    public void left() {
        APIlib.getInstance().addJSLine(jsBase + ".left();");
    }
    /**
     * Setter for the left edge position.
     */
    public com.anychart.core.utils.Bounds left(Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", left));

        return this;
    }
    /**
     * Setter for the left edge position.
     */
    public com.anychart.core.utils.Bounds left(String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", wrapQuotes(left)));

        return this;
    }
    /**
     * Getter for the maximum height value.
     */
    public void maxHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".maxHeight();");
    }
    /**
     * Setter for the maximum height value.
     */
    public com.anychart.core.utils.Bounds maxHeight(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", height));

        return this;
    }
    /**
     * Setter for the maximum height value.
     */
    public com.anychart.core.utils.Bounds maxHeight(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * Getter for the maximum width value.
     */
    public void maxWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".maxWidth();");
    }
    /**
     * Setter for the maximum width value.
     */
    public com.anychart.core.utils.Bounds maxWidth(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", width));

        return this;
    }
    /**
     * Setter for the maximum width value.
     */
    public com.anychart.core.utils.Bounds maxWidth(String width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", wrapQuotes(width)));

        return this;
    }
    /**
     * Getter for the minimum height value.
     */
    public void minHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".minHeight();");
    }
    /**
     * Setter for the minimum height value.
     */
    public com.anychart.core.utils.Bounds minHeight(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", height));

        return this;
    }
    /**
     * Setter for the minimum height value.
     */
    public com.anychart.core.utils.Bounds minHeight(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * Getter for the minimum width value.
     */
    public void minWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".minWidth();");
    }
    /**
     * Setter for the minimum width value.
     */
    public com.anychart.core.utils.Bounds minWidth(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", width));

        return this;
    }
    /**
     * Setter for the minimum width value.
     */
    public com.anychart.core.utils.Bounds minWidth(String width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", wrapQuotes(width)));

        return this;
    }
    /**
     * Getter for the right edge position.
     */
    public void right() {
        APIlib.getInstance().addJSLine(jsBase + ".right();");
    }
    /**
     * Setter for the right edge position.
     */
    public com.anychart.core.utils.Bounds right(Number right) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", right));

        return this;
    }
    /**
     * Setter for the right edge position.
     */
    public com.anychart.core.utils.Bounds right(String right) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", wrapQuotes(right)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number xOrRect, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", xOrRect, y, width, height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number xOrRect, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", xOrRect, y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number xOrRect, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", xOrRect, y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number xOrRect, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", xOrRect, y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number xOrRect, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", xOrRect, wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number xOrRect, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", xOrRect, wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number xOrRect, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", xOrRect, wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number xOrRect, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", xOrRect, wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(String xOrRect, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(xOrRect), y, width, height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(String xOrRect, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(xOrRect), y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(String xOrRect, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(xOrRect), y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(String xOrRect, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(xOrRect), y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(String xOrRect, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(xOrRect), wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(String xOrRect, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(xOrRect), wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(String xOrRect, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(xOrRect), wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(String xOrRect, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", wrapQuotes(xOrRect), wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number[] xOrRect, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(xOrRect), y, width, height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number[] xOrRect, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(xOrRect), y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number[] xOrRect, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(xOrRect), y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number[] xOrRect, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(xOrRect), y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number[] xOrRect, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(xOrRect), wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number[] xOrRect, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(xOrRect), wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number[] xOrRect, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(xOrRect), wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(Number[] xOrRect, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", Arrays.toString(xOrRect), wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.utils.RectObj xOrRect, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, y, width, height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.utils.RectObj xOrRect, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.utils.RectObj xOrRect, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.utils.RectObj xOrRect, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.utils.RectObj xOrRect, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.utils.RectObj xOrRect, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.utils.RectObj xOrRect, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.utils.RectObj xOrRect, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.math.Rect xOrRect, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, y, width, height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.math.Rect xOrRect, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.math.Rect xOrRect, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.math.Rect xOrRect, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.math.Rect xOrRect, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.math.Rect xOrRect, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.math.Rect xOrRect, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.math.Rect xOrRect, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.core.utils.Bounds xOrRect, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, y, width, height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.core.utils.Bounds xOrRect, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.core.utils.Bounds xOrRect, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.core.utils.Bounds xOrRect, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.core.utils.Bounds xOrRect, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.core.utils.Bounds xOrRect, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.core.utils.Bounds xOrRect, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: 'right' and 'bottom' have priority over 'width' and 'height'.
     */
    public com.anychart.core.utils.Bounds set(com.anychart.core.utils.Bounds xOrRect, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".set(%s, %s, %s, %s);", (xOrRect != null) ? xOrRect.getJsBase() : null, wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Normalizes all info stored in this object.
     */
    public com.anychart.math.Rect toRect(Number parentLeftOrRect, Number parentTop, Number parentWidth, Number parentHeight) {
        return new com.anychart.math.Rect(String.format(Locale.US, jsBase + ".toRect(%s, %s, %s, %s)", parentLeftOrRect, parentTop, parentWidth, parentHeight));
    }
    /**
     * Normalizes all info stored in this object.
     */
    public com.anychart.math.Rect toRect(com.anychart.math.Rect parentLeftOrRect, Number parentTop, Number parentWidth, Number parentHeight) {
        return new com.anychart.math.Rect(String.format(Locale.US, jsBase + ".toRect(%s, %s, %s, %s)", (parentLeftOrRect != null) ? parentLeftOrRect.getJsBase() : null, parentTop, parentWidth, parentHeight));
    }
    /**
     * Normalizes all info stored in this object.
     */
    public com.anychart.math.Rect toRect(String parentLeftOrRect, Number parentTop, Number parentWidth, Number parentHeight) {
        return new com.anychart.math.Rect(String.format(Locale.US, jsBase + ".toRect(%s, %s, %s, %s)", wrapQuotes(parentLeftOrRect), parentTop, parentWidth, parentHeight));
    }
    /**
     * Getter for the top edge position.
     */
    public void top() {
        APIlib.getInstance().addJSLine(jsBase + ".top();");
    }
    /**
     * Setter for the top edge position.
     */
    public com.anychart.core.utils.Bounds top(Number top) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", top));

        return this;
    }
    /**
     * Setter for the top edge position.
     */
    public com.anychart.core.utils.Bounds top(String top) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", wrapQuotes(top)));

        return this;
    }
    /**
     * Getter for the width value.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for the width value.
     */
    public com.anychart.core.utils.Bounds width(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", width));

        return this;
    }
    /**
     * Setter for the width value.
     */
    public com.anychart.core.utils.Bounds width(String width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
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

}