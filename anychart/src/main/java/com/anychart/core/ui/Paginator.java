package com.anychart.core.ui;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.Text;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Paginator base class.
 */
public class Paginator extends Text {

    protected Paginator() {

    }

    public static Paginator instantiate() {
        return new Paginator("new anychart.core.ui.paginator()");
    }

    

    public Paginator(String jsChart) {
        jsBase = "paginator" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Paginator background.
     */
    public com.anychart.core.ui.Paginator background(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Paginator background.
     */
    public com.anychart.core.ui.Paginator background(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", value));

        return this;
    }
    /**
     * Getter for the active page.
     */
    public void currentPage() {
        APIlib.getInstance().addJSLine(jsBase + ".currentPage();");
    }
    /**
     * Setter for the active page.
     */
    public com.anychart.core.ui.Paginator currentPage(Number pageNumber) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".currentPage(%s);", pageNumber));

        return this;
    }
    /**
     * Setter for the active page.
     */
    public com.anychart.core.ui.Paginator currentPage(String pageNumber) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".currentPage(%s);", wrapQuotes(pageNumber)));

        return this;
    }
    /**
     * Getter for the pointer events.
     */
    public void disablePointerEvents() {
        APIlib.getInstance().addJSLine(jsBase + ".disablePointerEvents();");
    }
    /**
     * Setter for the pointer events.
     */
    public com.anychart.core.ui.Paginator disablePointerEvents(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".disablePointerEvents(%s);", enabled));

        return this;
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
    public com.anychart.core.ui.Paginator enabled(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", enabled));

        return this;
    }
    /**
     * Getter for the text font color.
     */
    public void fontColor() {
        APIlib.getInstance().addJSLine(jsBase + ".fontColor();");
    }
    /**
     * Setter for the text font color.<br/>
{@link https://www.w3schools.com/html/html_colors.asp}
     */
    public com.anychart.core.ui.Paginator fontColor(String color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontColor(%s);", wrapQuotes(color)));

        return this;
    }
    /**
     * Getter for the text font decoration.
     */
    public void fontDecoration() {
        APIlib.getInstance().addJSLine(jsBase + ".fontDecoration();");
    }
    /**
     * Setter for the text font decoration.
     */
    public com.anychart.core.ui.Paginator fontDecoration(com.anychart.graphics.vector.text.Decoration value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text font decoration.
     */
    public com.anychart.core.ui.Paginator fontDecoration(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontDecoration(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the font family.
     */
    public void fontFamily() {
        APIlib.getInstance().addJSLine(jsBase + ".fontFamily();");
    }
    /**
     * Setter for the font family.
     */
    public com.anychart.core.ui.Paginator fontFamily(String family) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontFamily(%s);", wrapQuotes(family)));

        return this;
    }
    /**
     * Getter for the text font opacity.
     */
    public void fontOpacity() {
        APIlib.getInstance().addJSLine(jsBase + ".fontOpacity();");
    }
    /**
     * Setter for the text font opacity. Double value from 0 to 1.
     */
    public com.anychart.core.ui.Paginator fontOpacity(Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontOpacity(%s);", opacity));

        return this;
    }
    /**
     * Getter for the text font size.
     */
    public void fontSize() {
        APIlib.getInstance().addJSLine(jsBase + ".fontSize();");
    }
    /**
     * Setter for the text font size.
     */
    public com.anychart.core.ui.Paginator fontSize(String size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", wrapQuotes(size)));

        return this;
    }
    /**
     * Setter for the text font size.
     */
    public com.anychart.core.ui.Paginator fontSize(Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", size));

        return this;
    }
    /**
     * Getter for the text font style.
     */
    public void fontStyle() {
        APIlib.getInstance().addJSLine(jsBase + ".fontStyle();");
    }
    /**
     * Setter for the text font style.
     */
    public com.anychart.core.ui.Paginator fontStyle(com.anychart.graphics.vector.text.FontStyle style) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", (style != null) ? style.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text font style.
     */
    public com.anychart.core.ui.Paginator fontStyle(String style) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", wrapQuotes(style)));

        return this;
    }
    /**
     * Getter for the text font variant.
     */
    public void fontVariant() {
        APIlib.getInstance().addJSLine(jsBase + ".fontVariant();");
    }
    /**
     * Setter for the text font variant.
     */
    public com.anychart.core.ui.Paginator fontVariant(com.anychart.graphics.vector.text.FontVariant value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontVariant(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text font variant.
     */
    public com.anychart.core.ui.Paginator fontVariant(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontVariant(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the text font weight.
     */
    public void fontWeight() {
        APIlib.getInstance().addJSLine(jsBase + ".fontWeight();");
    }
    /**
     * Setter for the text font weight.<br/>
{@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public com.anychart.core.ui.Paginator fontWeight(String weight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", wrapQuotes(weight)));

        return this;
    }
    /**
     * Setter for the text font weight.<br/>
{@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public com.anychart.core.ui.Paginator fontWeight(Number weight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", weight));

        return this;
    }
    /**
     * Getter for the text horizontal align.
     */
    public void hAlign() {
        APIlib.getInstance().addJSLine(jsBase + ".hAlign();");
    }
    /**
     * Setter for the text horizontal align.
     */
    public com.anychart.core.ui.Paginator hAlign(com.anychart.graphics.vector.text.HAlign align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", (align != null) ? align.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text horizontal align.
     */
    public com.anychart.core.ui.Paginator hAlign(String align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", wrapQuotes(align)));

        return this;
    }
    /**
     * Getter for paginator layout.
     */
    public void layout() {
        APIlib.getInstance().addJSLine(jsBase + ".layout();");
    }
    /**
     * Setter for paginator layout.
     */
    public com.anychart.core.ui.Paginator layout(com.anychart.enums.Layout value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".layout(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for paginator layout.
     */
    public com.anychart.core.ui.Paginator layout(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".layout(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the text letter spacing.
     */
    public void letterSpacing() {
        APIlib.getInstance().addJSLine(jsBase + ".letterSpacing();");
    }
    /**
     * Setter for the text letter spacing.<br/>
{@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public com.anychart.core.ui.Paginator letterSpacing(String spacing) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".letterSpacing(%s);", wrapQuotes(spacing)));

        return this;
    }
    /**
     * Setter for the text letter spacing.<br/>
{@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public com.anychart.core.ui.Paginator letterSpacing(Number spacing) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".letterSpacing(%s);", spacing));

        return this;
    }
    /**
     * Getter for the text line height.
     */
    public void lineHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".lineHeight();");
    }
    /**
     * Setter for the text line height.<br/>
{@link https://www.w3schools.com/cssref/pr_dim_line-height.asp}
     */
    public com.anychart.core.ui.Paginator lineHeight(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineHeight(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for the text line height.<br/>
{@link https://www.w3schools.com/cssref/pr_dim_line-height.asp}
     */
    public com.anychart.core.ui.Paginator lineHeight(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineHeight(%s);", height));

        return this;
    }
    /**
     * Getter for the paginator margin.
     */
    public com.anychart.core.utils.Margin margin() {
        return new com.anychart.core.utils.Margin(jsBase + ".margin()");
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, wrapQuotes(rightOrRightAndLeft), bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, wrapQuotes(rightOrRightAndLeft), bottom, left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(Number[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator margin.
     */
    public com.anychart.core.ui.Paginator margin(String[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, left));

        return this;
    }
    /**
     * Orientation of the paginator.
     */
    public com.anychart.core.ui.Paginator orientation(com.anychart.enums.Orientation value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".orientation(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Orientation of the paginator.
     */
    public com.anychart.core.ui.Paginator orientation(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".orientation(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the paginator padding.
     */
    public com.anychart.core.utils.Padding padding() {
        return new com.anychart.core.utils.Padding(jsBase + ".padding()");
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, wrapQuotes(rightOrRightAndLeft), bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, wrapQuotes(rightOrRightAndLeft), bottom, left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", spaceOrTopOrTopAndBottom, rightOrRightAndLeft, bottom, left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(Number[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", Arrays.toString(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String[] spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), wrapQuotes(rightOrRightAndLeft), bottom, left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, String bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, wrapQuotes(bottom), left));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, String left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, wrapQuotes(left)));

        return this;
    }
    /**
     * Setter for the paginator padding.
     */
    public com.anychart.core.ui.Paginator padding(String[] spaceOrTopOrTopAndBottom, Number rightOrRightAndLeft, Number bottom, Number left) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", arrayToStringWrapQuotes(spaceOrTopOrTopAndBottom), rightOrRightAndLeft, bottom, left));

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
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Getter for the text selectable option.
     */
    public void selectable() {
        APIlib.getInstance().addJSLine(jsBase + ".selectable();");
    }
    /**
     * Setter for the text selectable.
     */
    public com.anychart.core.ui.Paginator selectable(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectable(%s);", enabled));

        return this;
    }
    /**
     * Getter for the text direction.
     */
    public void textDirection() {
        APIlib.getInstance().addJSLine(jsBase + ".textDirection();");
    }
    /**
     * Setter for the text direction.
     */
    public com.anychart.core.ui.Paginator textDirection(com.anychart.graphics.vector.text.Direction direction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textDirection(%s);", (direction != null) ? direction.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text direction.
     */
    public com.anychart.core.ui.Paginator textDirection(String direction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textDirection(%s);", wrapQuotes(direction)));

        return this;
    }
    /**
     * Getter for the text indent.
     */
    public void textIndent() {
        APIlib.getInstance().addJSLine(jsBase + ".textIndent();");
    }
    /**
     * Setter for the text indent.
     */
    public com.anychart.core.ui.Paginator textIndent(Number indent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textIndent(%s);", indent));

        return this;
    }
    /**
     * Getter for the text overflow settings.
     */
    public void textOverflow() {
        APIlib.getInstance().addJSLine(jsBase + ".textOverflow();");
    }
    /**
     * Setter for the text overflow settings.
     */
    public com.anychart.core.ui.Paginator textOverflow(com.anychart.graphics.vector.text.TextOverflow value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textOverflow(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text overflow settings.
     */
    public com.anychart.core.ui.Paginator textOverflow(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textOverflow(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the full text appearance settings.
     */
    public void textSettings() {
        APIlib.getInstance().addJSLine(jsBase + ".textSettings();");
    }
    /**
     * Getter for all text appearance settings.
     */
    public void textSettings(String name) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textSettings(%s);", wrapQuotes(name)));
    }
    /**
     * Setter for the text appearance settings.
     */
    public com.anychart.core.ui.Paginator textSettings(String name, String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", wrapQuotes(name), wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the text appearance settings.
     */
    public com.anychart.core.ui.Paginator textSettings(String name, Number settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", wrapQuotes(name), settings));

        return this;
    }
    /**
     * Setter for the text appearance settings.
     */
    public com.anychart.core.ui.Paginator textSettings(String name, Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", wrapQuotes(name), settings));

        return this;
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
     * Getter for the useHTML flag.
     */
    public void useHtml() {
        APIlib.getInstance().addJSLine(jsBase + ".useHtml();");
    }
    /**
     * Setter for flag useHTML.
     */
    public com.anychart.core.ui.Paginator useHtml(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".useHtml(%s);", enabled));

        return this;
    }
    /**
     * Getter for the text vertical align.
     */
    public void vAlign() {
        APIlib.getInstance().addJSLine(jsBase + ".vAlign();");
    }
    /**
     * Setter for the text vertical align.
     */
    public com.anychart.core.ui.Paginator vAlign(com.anychart.graphics.vector.text.VAlign align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", (align != null) ? align.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text vertical align.
     */
    public com.anychart.core.ui.Paginator vAlign(String align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", wrapQuotes(align)));

        return this;
    }
    /**
     * Getter for the word-break mode.
     */
    public void wordBreak() {
        APIlib.getInstance().addJSLine(jsBase + ".wordBreak();");
    }
    /**
     * Setter for the word-break mode.
     */
    public com.anychart.core.ui.Paginator wordBreak(com.anychart.enums.WordBreak mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordBreak(%s);", (mode != null) ? mode.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the word-break mode.
     */
    public com.anychart.core.ui.Paginator wordBreak(String mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordBreak(%s);", wrapQuotes(mode)));

        return this;
    }
    /**
     * Getter for the word-wrap mode.
     */
    public void wordWrap() {
        APIlib.getInstance().addJSLine(jsBase + ".wordWrap();");
    }
    /**
     * Setter for the word-wrap mode.
     */
    public com.anychart.core.ui.Paginator wordWrap(com.anychart.enums.WordWrap mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordWrap(%s);", (mode != null) ? mode.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the word-wrap mode.
     */
    public com.anychart.core.ui.Paginator wordWrap(String mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordWrap(%s);", wrapQuotes(mode)));

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
    public com.anychart.core.ui.Paginator zIndex(Number zIndex) {
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
    public com.anychart.core.ui.Paginator container(com.anychart.graphics.vector.Layer element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.ui.Paginator container(com.anychart.graphics.vector.Stage element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.ui.Paginator container(String element) {
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
    public com.anychart.core.ui.Paginator parentBounds(com.anychart.math.Rect bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", (bounds != null) ? bounds.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.ui.Paginator parentBounds(String bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", wrapQuotes(bounds)));

        return this;
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.ui.Paginator parentBounds(Number bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", bounds));

        return this;
    }
    /**
     * Setter for the parent bounds using several values.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.ui.Paginator parentBounds(Number left, Number top, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s, %s, %s, %s);", left, top, width, height));

        return this;
    }

}