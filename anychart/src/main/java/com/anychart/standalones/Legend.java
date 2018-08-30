package com.anychart.standalones;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Arrays;
import java.util.Locale;

// class
/**
 * The Legend class contains methods for configuring standalones legend.
 */
public class Legend extends JsObject {

    protected Legend() {

    }

    public static Legend instantiate() {
        return new Legend("new anychart.standalones.legend()");
    }

    

    public Legend(String jsChart) {
        jsBase = "legend" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for legend align settings.
     */
    public void align() {
        APIlib.getInstance().addJSLine(jsBase + ".align();");
    }
    /**
     * Setter for legend align settings.
     */
    public com.anychart.standalones.Legend align(com.anychart.enums.Align value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".align(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for legend align settings.
     */
    public com.anychart.standalones.Legend align(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".align(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the legend background.
     */
    public com.anychart.core.ui.Background background() {
        return new com.anychart.core.ui.Background(jsBase + ".background()");
    }
    /**
     * Setter for the legend background.
     */
    public com.anychart.standalones.Legend background(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the legend background.
     */
    public com.anychart.standalones.Legend background(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", value));

        return this;
    }
    /**
     * Getter for the legend container.
     */
    public void container() {
        APIlib.getInstance().addJSLine(jsBase + ".container();");
    }
    /**
     * Setter for the legend container.
     */
    public com.anychart.standalones.Legend container(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(value)));

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
    public com.anychart.standalones.Legend disablePointerEvents(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".disablePointerEvents(%s);", value));

        return this;
    }
    /**
     * Draws legend.
     */
    public com.anychart.standalones.Legend draw() {
        APIlib.getInstance().addJSLine(jsBase + ".draw();");

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
    public com.anychart.standalones.Legend enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

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
    public com.anychart.standalones.Legend fontColor(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontColor(%s);", wrapQuotes(value)));

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
    public com.anychart.standalones.Legend fontDecoration(com.anychart.graphics.vector.text.Decoration value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text font decoration.
     */
    public com.anychart.standalones.Legend fontDecoration(String value) {
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
    public com.anychart.standalones.Legend fontFamily(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontFamily(%s);", wrapQuotes(value)));

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
    public com.anychart.standalones.Legend fontOpacity(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontOpacity(%s);", value));

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
    public com.anychart.standalones.Legend fontSize(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the text font size.
     */
    public com.anychart.standalones.Legend fontSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", value));

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
    public com.anychart.standalones.Legend fontStyle(com.anychart.graphics.vector.text.FontStyle value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text font style.
     */
    public com.anychart.standalones.Legend fontStyle(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", wrapQuotes(value)));

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
    public com.anychart.standalones.Legend fontVariant(com.anychart.graphics.vector.text.FontVariant value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontVariant(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text font variant.
     */
    public com.anychart.standalones.Legend fontVariant(String value) {
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
    public com.anychart.standalones.Legend fontWeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the text font weight.<br/>
{@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public com.anychart.standalones.Legend fontWeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", value));

        return this;
    }
    /**
     * Getter for remain bounds after legend.
     */
    public com.anychart.math.Rect getRemainingBounds() {
        return new com.anychart.math.Rect(jsBase + ".getRemainingBounds()");
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
    public com.anychart.standalones.Legend hAlign(com.anychart.graphics.vector.text.HAlign value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text horizontal align.
     */
    public com.anychart.standalones.Legend hAlign(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the legend height.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for the legend height.
     */
    public com.anychart.standalones.Legend height(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", value));

        return this;
    }
    /**
     * Setter for the legend height.
     */
    public com.anychart.standalones.Legend height(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for hover cursor settings.
     */
    public void hoverCursor() {
        APIlib.getInstance().addJSLine(jsBase + ".hoverCursor();");
    }
    /**
     * Setter for hover cursor settings.
     */
    public com.anychart.standalones.Legend hoverCursor(com.anychart.enums.Cursor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hoverCursor(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for hover cursor settings.
     */
    public com.anychart.standalones.Legend hoverCursor(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hoverCursor(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the icon size.
     */
    public void iconSize() {
        APIlib.getInstance().addJSLine(jsBase + ".iconSize();");
    }
    /**
     * Setter for the icon size.
     */
    public com.anychart.standalones.Legend iconSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".iconSize(%s);", value));

        return this;
    }
    /**
     * Setter for the icon size.
     */
    public com.anychart.standalones.Legend iconSize(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".iconSize(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for spacing between icon and text in a legend item.
     */
    public void iconTextSpacing() {
        APIlib.getInstance().addJSLine(jsBase + ".iconTextSpacing();");
    }
    /**
     * Setter for spacing between icon and text in a legend item.
     */
    public com.anychart.standalones.Legend iconTextSpacing(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".iconTextSpacing(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for spacing between icon and text in a legend item.
     */
    public com.anychart.standalones.Legend iconTextSpacing(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".iconTextSpacing(%s);", value));

        return this;
    }
    /**
     * Getter for inverted settings.
     */
    public void inverted() {
        APIlib.getInstance().addJSLine(jsBase + ".inverted();");
    }
    /**
     * Setter for inverted settings.
     */
    public com.anychart.standalones.Legend inverted(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".inverted(%s);", value));

        return this;
    }
    /**
     * Getter for custom items.
     */
    public void items() {
        APIlib.getInstance().addJSLine(jsBase + ".items();");
    }
    /**
     * Setter for custom items.
     */
    public com.anychart.standalones.Legend items(com.anychart.core.ui.legend.LegendItemProvider[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s);", arrayToString(value)));

        return this;
    }
    /**
     * Getter for items text formatter.
     */
    public void itemsFormat() {
        APIlib.getInstance().addJSLine(jsBase + ".itemsFormat();");
    }
    /**
     * Setter for items text formatter.<br/>
{docs:Stock_Charts/Legend#items}Learn more about using itemsFormat() method.{docs}
     */
    public com.anychart.standalones.Legend itemsFormat(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemsFormat(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for items formatter.
     */
    public void itemsFormatter() {
        APIlib.getInstance().addJSLine(jsBase + ".itemsFormatter();");
    }
    /**
     * Setter for items formatter.
     */
    public com.anychart.standalones.Legend itemsFormatter(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemsFormatter(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for items layout.
     */
    public void itemsLayout() {
        APIlib.getInstance().addJSLine(jsBase + ".itemsLayout();");
    }
    /**
     * Setter for items layout.
     */
    public com.anychart.standalones.Legend itemsLayout(com.anychart.enums.LegendLayout value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemsLayout(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for items layout.
     */
    public com.anychart.standalones.Legend itemsLayout(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemsLayout(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for items source.
     */
    public com.anychart.core.SeparateChart itemsSource() {
        return new com.anychart.core.SeparateChart(jsBase + ".itemsSource()");
    }
    /**
     * Setter for items source.
     */
    public com.anychart.standalones.Legend itemsSource(com.anychart.core.SeparateChart value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemsSource(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for items source.
     */
    public com.anychart.standalones.Legend itemsSource(com.anychart.core.SeparateChart[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemsSource(%s);", arrayToString(value)));

        return this;
    }
    /**
     * Getter for items source mode.
     */
    public void itemsSourceMode() {
        APIlib.getInstance().addJSLine(jsBase + ".itemsSourceMode();");
    }
    /**
     * Setter for items source mode.
     */
    public com.anychart.standalones.Legend itemsSourceMode(com.anychart.enums.LegendItemsSourceMode value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemsSourceMode(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for items source mode.
     */
    public com.anychart.standalones.Legend itemsSourceMode(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemsSourceMode(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for items spacing settings.
     */
    public void itemsSpacing() {
        APIlib.getInstance().addJSLine(jsBase + ".itemsSpacing();");
    }
    /**
     * Setter for items spacing settings.
     */
    public com.anychart.standalones.Legend itemsSpacing(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemsSpacing(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for items spacing settings.
     */
    public com.anychart.standalones.Legend itemsSpacing(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemsSpacing(%s);", value));

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
    public com.anychart.standalones.Legend letterSpacing(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".letterSpacing(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the text letter spacing.<br/>
{@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public com.anychart.standalones.Legend letterSpacing(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".letterSpacing(%s);", value));

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
    public com.anychart.standalones.Legend lineHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the text line height.<br/>
{@link https://www.w3schools.com/cssref/pr_dim_line-height.asp}
     */
    public com.anychart.standalones.Legend lineHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineHeight(%s);", value));

        return this;
    }
    /**
     * Getter for margin settings.
     */
    public com.anychart.core.utils.Margin margin() {
        return new com.anychart.core.utils.Margin(jsBase + ".margin()");
    }
    /**
     * Setter for the legend margin in pixels using a single value.
     */
    public com.anychart.standalones.Legend margin(Number[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(value)));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single value.
     */
    public com.anychart.standalones.Legend margin(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single value.
     */
    public com.anychart.standalones.Legend margin(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single value.
     */
    public com.anychart.standalones.Legend margin(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", value));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend margin in pixels using a single simple values.
     */
    public com.anychart.standalones.Legend margin(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
    }
    /**
     * Getter for legend padding settings.
     */
    public com.anychart.core.utils.Padding padding() {
        return new com.anychart.core.utils.Padding(jsBase + ".padding()");
    }
    /**
     * Setter for the legend padding in pixels using a single value.
     */
    public com.anychart.standalones.Legend padding(Number[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(value)));

        return this;
    }
    /**
     * Setter for the legend padding in pixels using a single value.
     */
    public com.anychart.standalones.Legend padding(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the legend padding in pixels using a single value.
     */
    public com.anychart.standalones.Legend padding(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the legend padding in pixels using a single value.
     */
    public com.anychart.standalones.Legend padding(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", value));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the legend padding setting in pixels using a several value.
     */
    public com.anychart.standalones.Legend padding(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
    }
    /**
     * Getter for paginator settings.
     */
    public com.anychart.core.ui.Paginator paginator() {
        return new com.anychart.core.ui.Paginator(jsBase + ".paginator()");
    }
    /**
     * Setter for paginator settings.
     */
    public com.anychart.standalones.Legend paginator(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".paginator(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for paginator settings.
     */
    public com.anychart.standalones.Legend paginator(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".paginator(%s);", value));

        return this;
    }
    /**
     * Getter for parent bounds.<br/>
As a getter falls back to stage bounds.
     */
    public com.anychart.math.Rect parentBounds() {
        return new com.anychart.math.Rect(jsBase + ".parentBounds()");
    }
    /**
     * Setter for bounds using single value.
     */
    public com.anychart.standalones.Legend parentBounds(com.anychart.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds using single value.
     */
    public com.anychart.standalones.Legend parentBounds(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for bounds using several values.
     */
    public com.anychart.standalones.Legend parentBounds(Number left, Number top, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s, %s, %s, %s);", left, top, width, height));

        return this;
    }
    /**
     * Getter for legend position settings.
     */
    public void position() {
        APIlib.getInstance().addJSLine(jsBase + ".position();");
    }
    /**
     * Setter for legend position setting.
     */
    public com.anychart.standalones.Legend position(com.anychart.enums.Orientation value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".position(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for legend position setting.
     */
    public com.anychart.standalones.Legend position(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".position(%s);", wrapQuotes(value)));

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
    public com.anychart.standalones.Legend selectable(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectable(%s);", value));

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
    public com.anychart.standalones.Legend textDirection(com.anychart.graphics.vector.text.Direction value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textDirection(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text direction.
     */
    public com.anychart.standalones.Legend textDirection(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textDirection(%s);", wrapQuotes(value)));

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
    public com.anychart.standalones.Legend textIndent(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textIndent(%s);", value));

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
    public com.anychart.standalones.Legend textOverflow(com.anychart.graphics.vector.text.TextOverflow value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textOverflow(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text overflow settings.
     */
    public com.anychart.standalones.Legend textOverflow(String value) {
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
    public com.anychart.standalones.Legend textSettings(String name, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", wrapQuotes(name), wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the text appearance settings.
     */
    public com.anychart.standalones.Legend textSettings(String name, Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", wrapQuotes(name), value));

        return this;
    }
    /**
     * Setter for the text appearance settings.
     */
    public com.anychart.standalones.Legend textSettings(String name, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", wrapQuotes(name), value));

        return this;
    }
    /**
     * Getter for the legend title.
     */
    public com.anychart.core.ui.Title title() {
        return new com.anychart.core.ui.Title(jsBase + ".title()");
    }
    /**
     * Setter for the legend title.
     */
    public com.anychart.standalones.Legend title(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", value));

        return this;
    }
    /**
     * Setter for the legend title.
     */
    public com.anychart.standalones.Legend title(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the legend title format function.
     */
    public void titleFormat() {
        APIlib.getInstance().addJSLine(jsBase + ".titleFormat();");
    }
    /**
     * Setter for the legend title format function.
If set, formats title. Currently supported in Stock only.
{docs:Common_Settings/Text_Formatters}Learn more about using titleFormat() method.{docs}
     */
    public com.anychart.standalones.Legend titleFormat(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".titleFormat(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for title separator settings.
     */
    public com.anychart.core.ui.Separator titleSeparator() {
        return new com.anychart.core.ui.Separator(jsBase + ".titleSeparator()");
    }
    /**
     * Setter for title separator settings.
     */
    public com.anychart.standalones.Legend titleSeparator(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".titleSeparator(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for title separator settings.
     */
    public com.anychart.standalones.Legend titleSeparator(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".titleSeparator(%s);", value));

        return this;
    }
    /**
     * Getter for the legend tooltip.
     */
    public com.anychart.core.ui.Tooltip tooltip() {
        return new com.anychart.core.ui.Tooltip(jsBase + ".tooltip()");
    }
    /**
     * Setter for legend tooltip.
     */
    public com.anychart.standalones.Legend tooltip(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for legend tooltip.
     */
    public com.anychart.standalones.Legend tooltip(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", value));

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
    public com.anychart.standalones.Legend useHtml(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".useHtml(%s);", value));

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
    public com.anychart.standalones.Legend vAlign(com.anychart.graphics.vector.text.VAlign value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text vertical align.
     */
    public com.anychart.standalones.Legend vAlign(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the legend width.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for the legend width.
     */
    public com.anychart.standalones.Legend width(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", value));

        return this;
    }
    /**
     * Setter for the legend width.
     */
    public com.anychart.standalones.Legend width(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(value)));

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
    public com.anychart.standalones.Legend wordBreak(com.anychart.enums.WordBreak value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordBreak(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the word-break mode.
     */
    public com.anychart.standalones.Legend wordBreak(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordBreak(%s);", wrapQuotes(value)));

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
    public com.anychart.standalones.Legend wordWrap(com.anychart.enums.WordWrap value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordWrap(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the word-wrap mode.
     */
    public com.anychart.standalones.Legend wordWrap(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordWrap(%s);", wrapQuotes(value)));

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
    public com.anychart.standalones.Legend zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * Gets a value for dragging.
     */
    public void drag() {
        APIlib.getInstance().addJSLine(jsBase + ".drag();");
    }
    /**
     * Allows to use drag for legend.
     */
    public com.anychart.standalones.Legend drag(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".drag(%s);", value));

        return this;
    }
    /**
     * Returns pixel bounds of the legend.
     */
    public com.anychart.math.Rect getPixelBounds() {
        return new com.anychart.math.Rect(jsBase + ".getPixelBounds()");
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
    public com.anychart.standalones.Legend maxHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum height.
     */
    public com.anychart.standalones.Legend maxHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", wrapQuotes(value)));

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
    public com.anychart.standalones.Legend maxWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum width.
     */
    public com.anychart.standalones.Legend maxWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the position mode.
     */
    public void positionMode() {
        APIlib.getInstance().addJSLine(jsBase + ".positionMode();");
    }
    /**
     * Setter for the position mode.
     */
    public com.anychart.standalones.Legend positionMode(com.anychart.enums.LegendPositionMode value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".positionMode(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the position mode.
     */
    public com.anychart.standalones.Legend positionMode(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".positionMode(%s);", wrapQuotes(value)));

        return this;
    }

}