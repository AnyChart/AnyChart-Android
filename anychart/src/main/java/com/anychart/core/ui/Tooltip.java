package com.anychart.core.ui;

import com.anychart.APIlib;
import com.anychart.core.VisualBase;

import java.util.Arrays;
import java.util.Locale;

// class
/**
 * Class for the tooltip.
 */
public class Tooltip extends VisualBase {

    protected Tooltip() {

    }

    public static Tooltip instantiate() {
        return new Tooltip("new anychart.core.ui.tooltip()");
    }

    

    public Tooltip(String jsChart) {
        jsBase = "tooltip" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the adjusting font size.
     */
    public void adjustFontSize() {
        APIlib.getInstance().addJSLine(jsBase + ".adjustFontSize();");
    }
    /**
     * Setter for the adjusting font size.
     */
    public com.anychart.core.ui.Tooltip adjustFontSize(Boolean adjustOrAdjustByWidth, Boolean adjustByHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %s);", adjustOrAdjustByWidth, adjustByHeight));

        return this;
    }
    /**
     * Setter for the adjusting font size.
     */
    public com.anychart.core.ui.Tooltip adjustFontSize(Boolean[] adjustOrAdjustByWidth, Boolean adjustByHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %s);", arrayToString(adjustOrAdjustByWidth), adjustByHeight));

        return this;
    }
    /**
     * Setter for the adjusting font size.
     */
    public com.anychart.core.ui.Tooltip adjustFontSize(String adjustOrAdjustByWidth, Boolean adjustByHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %s);", wrapQuotes(adjustOrAdjustByWidth), adjustByHeight));

        return this;
    }
    /**
     * Getter for the allowLeaveChart tooltip mode.
     */
    public void allowLeaveChart() {
        APIlib.getInstance().addJSLine(jsBase + ".allowLeaveChart();");
    }
    /**
     * Setter for the allowLeaveChart tooltip mode.
     */
    public com.anychart.core.ui.Tooltip allowLeaveChart(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".allowLeaveChart(%s);", value));

        return this;
    }
    /**
     * Getter for the allowLeaveScreen tooltip mode.
     */
    public void allowLeaveScreen() {
        APIlib.getInstance().addJSLine(jsBase + ".allowLeaveScreen();");
    }
    /**
     * Setter for the allowLeaveScreen tooltip mode.
     */
    public com.anychart.core.ui.Tooltip allowLeaveScreen(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".allowLeaveScreen(%s);", value));

        return this;
    }
    /**
     * Getter for the allowLeaveStage tooltip mode.
     */
    public void allowLeaveStage() {
        APIlib.getInstance().addJSLine(jsBase + ".allowLeaveStage();");
    }
    /**
     * Setter for the allowLeaveStage tooltip mode.
     */
    public com.anychart.core.ui.Tooltip allowLeaveStage(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".allowLeaveStage(%s);", value));

        return this;
    }
    /**
     * Getter for the tooltip anchor.
     */
    public void anchor() {
        APIlib.getInstance().addJSLine(jsBase + ".anchor();");
    }
    /**
     * Setter for the tooltip anchor.
     */
    public com.anychart.core.ui.Tooltip anchor(com.anychart.enums.Anchor value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".anchor(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the tooltip anchor.
     */
    public com.anychart.core.ui.Tooltip anchor(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".anchor(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for tooltip background settings.
     */
    public com.anychart.core.ui.Background background() {
        return new com.anychart.core.ui.Background(jsBase + ".background()");
    }
    /**
     * Setter for tooltip background settings.
     */
    public com.anychart.core.ui.Tooltip background(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", value));

        return this;
    }
    /**
     * Setter for tooltip background settings.
     */
    public com.anychart.core.ui.Tooltip background(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the pointer events settings.
     */
    public void disablePointerEvents() {
        APIlib.getInstance().addJSLine(jsBase + ".disablePointerEvents();");
    }
    /**
     * Setter for the pointer events setting.
     */
    public com.anychart.core.ui.Tooltip disablePointerEvents(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".disablePointerEvents(%s);", value));

        return this;
    }
    /**
     * Getter for display mode settings.
     */
    public void displayMode() {
        APIlib.getInstance().addJSLine(jsBase + ".displayMode();");
    }
    /**
     * Setter for display mode settings.
<b>Note</b>: Works only for the <b>chart</b> tooltip.
     */
    public com.anychart.core.ui.Tooltip displayMode(com.anychart.enums.TooltipDisplayMode value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".displayMode(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for display mode settings.
<b>Note</b>: Works only for the <b>chart</b> tooltip.
     */
    public com.anychart.core.ui.Tooltip displayMode(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".displayMode(%s);", wrapQuotes(value)));

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
    public com.anychart.core.ui.Tooltip enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for font color settings.
     */
    public void fontColor() {
        APIlib.getInstance().addJSLine(jsBase + ".fontColor();");
    }
    /**
     * Setter for font color settings.
     */
    public com.anychart.core.ui.Tooltip fontColor(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontColor(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for font decoration settings.
     */
    public void fontDecoration() {
        APIlib.getInstance().addJSLine(jsBase + ".fontDecoration();");
    }
    /**
     * Setter for font decoration settings.
     */
    public com.anychart.core.ui.Tooltip fontDecoration(com.anychart.graphics.vector.text.Decoration value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for font decoration settings.
     */
    public com.anychart.core.ui.Tooltip fontDecoration(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontDecoration(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for font family settings.
     */
    public void fontFamily() {
        APIlib.getInstance().addJSLine(jsBase + ".fontFamily();");
    }
    /**
     * Setter for font family settings.
     */
    public com.anychart.core.ui.Tooltip fontFamily(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontFamily(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for font opacity settings.
     */
    public void fontOpacity() {
        APIlib.getInstance().addJSLine(jsBase + ".fontOpacity();");
    }
    /**
     * Setter for font opacity settings.
     */
    public com.anychart.core.ui.Tooltip fontOpacity(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontOpacity(%s);", value));

        return this;
    }
    /**
     * Getter for font size settings.
     */
    public void fontSize() {
        APIlib.getInstance().addJSLine(jsBase + ".fontSize();");
    }
    /**
     * Setter for font size settings.
     */
    public com.anychart.core.ui.Tooltip fontSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", value));

        return this;
    }
    /**
     * Setter for font size settings.
     */
    public com.anychart.core.ui.Tooltip fontSize(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for font style settings.
     */
    public void fontStyle() {
        APIlib.getInstance().addJSLine(jsBase + ".fontStyle();");
    }
    /**
     * Setter for font style settings.
     */
    public com.anychart.core.ui.Tooltip fontStyle(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for font style settings.
     */
    public com.anychart.core.ui.Tooltip fontStyle(com.anychart.graphics.vector.text.FontStyle value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for font variant settings.
     */
    public void fontVariant() {
        APIlib.getInstance().addJSLine(jsBase + ".fontVariant();");
    }
    /**
     * Setter for font variant settings.
     */
    public com.anychart.core.ui.Tooltip fontVariant(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontVariant(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for font variant settings.
     */
    public com.anychart.core.ui.Tooltip fontVariant(com.anychart.graphics.vector.text.FontVariant value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontVariant(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for font weight settings.
     */
    public void fontWeight() {
        APIlib.getInstance().addJSLine(jsBase + ".fontWeight();");
    }
    /**
     * Setter for font weight settings.
     */
    public com.anychart.core.ui.Tooltip fontWeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for font weight settings.
     */
    public com.anychart.core.ui.Tooltip fontWeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", value));

        return this;
    }
    /**
     * Getter for the function content text for the tooltip.
     */
    public void format() {
        APIlib.getInstance().addJSLine(jsBase + ".format();");
    }
    /**
     * Setter for function content text for the tooltip.<br/>
{docs:Common_Settings/Text_Formatters}Learn more about using the format() method.{docs}
     */
    public com.anychart.core.ui.Tooltip format(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".format(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for text horizontal align settings.
     */
    public void hAlign() {
        APIlib.getInstance().addJSLine(jsBase + ".hAlign();");
    }
    /**
     * Setter for the text horizontal align settings.
     */
    public com.anychart.core.ui.Tooltip hAlign(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the text horizontal align settings.
     */
    public com.anychart.core.ui.Tooltip hAlign(com.anychart.graphics.vector.text.HAlign value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the tooltip height.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for the tooltip height.
     */
    public com.anychart.core.ui.Tooltip height(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the tooltip height.
     */
    public com.anychart.core.ui.Tooltip height(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", value));

        return this;
    }
    /**
     * Getter for delay in milliseconds before union tooltip item becomes hidden.
     */
    public void hideDelay() {
        APIlib.getInstance().addJSLine(jsBase + ".hideDelay();");
    }
    /**
     * Setter for the delay in milliseconds before a tooltip becomes hidden.
     */
    public com.anychart.core.ui.Tooltip hideDelay(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hideDelay(%s);", value));

        return this;
    }
    /**
     * Getter for text letter spacing settings.
     */
    public void letterSpacing() {
        APIlib.getInstance().addJSLine(jsBase + ".letterSpacing();");
    }
    /**
     * Setter for text letter spacing settings.
     */
    public com.anychart.core.ui.Tooltip letterSpacing(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".letterSpacing(%s);", value));

        return this;
    }
    /**
     * Getter for text line height settings.
     */
    public void lineHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".lineHeight();");
    }
    /**
     * Setter for text line height settings.
     */
    public com.anychart.core.ui.Tooltip lineHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineHeight(%s);", value));

        return this;
    }
    /**
     * Setter for text line height settings.
     */
    public com.anychart.core.ui.Tooltip lineHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for maximum font size settings for adjust text from.
     */
    public void maxFontSize() {
        APIlib.getInstance().addJSLine(jsBase + ".maxFontSize();");
    }
    /**
     * Setter for maximum font size settings for adjust text from.
     */
    public com.anychart.core.ui.Tooltip maxFontSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxFontSize(%s);", value));

        return this;
    }
    /**
     * Setter for maximum font size settings for adjust text from.
     */
    public com.anychart.core.ui.Tooltip maxFontSize(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxFontSize(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for minimum font size settings for adjust text from.
     */
    public void minFontSize() {
        APIlib.getInstance().addJSLine(jsBase + ".minFontSize();");
    }
    /**
     * Setter for minimum font size settings for adjust text from.
     */
    public com.anychart.core.ui.Tooltip minFontSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minFontSize(%s);", value));

        return this;
    }
    /**
     * Setter for minimum font size settings for adjust text from.
     */
    public com.anychart.core.ui.Tooltip minFontSize(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minFontSize(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the tooltip offset by X.
     */
    public void offsetX() {
        APIlib.getInstance().addJSLine(jsBase + ".offsetX();");
    }
    /**
     * Setter for union tooltip offsetX.
     */
    public com.anychart.core.ui.Tooltip offsetX(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".offsetX(%s);", value));

        return this;
    }
    /**
     * Getter for the tooltip offset by Y.
     */
    public void offsetY() {
        APIlib.getInstance().addJSLine(jsBase + ".offsetY();");
    }
    /**
     * Setter for the tooltip offset by Y.
     */
    public com.anychart.core.ui.Tooltip offsetY(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".offsetY(%s);", value));

        return this;
    }
    /**
     * Getter for the tooltip padding.
     */
    public com.anychart.core.utils.Padding padding() {
        return new com.anychart.core.utils.Padding(jsBase + ".padding()");
    }
    /**
     * Setter for the tooltip padding in pixels by one value.
     */
    public com.anychart.core.ui.Tooltip padding(Number[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(value)));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels by one value.
     */
    public com.anychart.core.ui.Tooltip padding(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels by one value.
     */
    public com.anychart.core.ui.Tooltip padding(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the tooltip padding in pixels.
     */
    public com.anychart.core.ui.Tooltip padding(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
    }
    /**
     * Getter for the union tooltip position.
     */
    public void position() {
        APIlib.getInstance().addJSLine(jsBase + ".position();");
    }
    /**
     * Setter for the union tooltip position.<br/>
<b>Note:</b> Do not works with position mode <b>FLOAT</b>.
     */
    public com.anychart.core.ui.Tooltip position(com.anychart.enums.Position value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".position(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the union tooltip position.<br/>
<b>Note:</b> Do not works with position mode <b>FLOAT</b>.
     */
    public com.anychart.core.ui.Tooltip position(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".position(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for all tooltips position mode.
     */
    public void positionMode() {
        APIlib.getInstance().addJSLine(jsBase + ".positionMode();");
    }
    /**
     * Setter for all tooltips position mode.
     */
    public com.anychart.core.ui.Tooltip positionMode(com.anychart.enums.TooltipPositionMode value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".positionMode(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for all tooltips position mode.
     */
    public com.anychart.core.ui.Tooltip positionMode(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".positionMode(%s);", wrapQuotes(value)));

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
     * Setter for the text selectable option.
     */
    public com.anychart.core.ui.Tooltip selectable(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectable(%s);", value));

        return this;
    }
    /**
     * Getter for the union tooltip separator.
     */
    public com.anychart.core.ui.Separator separator() {
        return new com.anychart.core.ui.Separator(jsBase + ".separator()");
    }
    /**
     * Setter for the union tooltip separator.
     */
    public com.anychart.core.ui.Tooltip separator(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".separator(%s);", value));

        return this;
    }
    /**
     * Setter for the union tooltip separator.
     */
    public com.anychart.core.ui.Tooltip separator(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".separator(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the text direction settings.
     */
    public void textDirection() {
        APIlib.getInstance().addJSLine(jsBase + ".textDirection();");
    }
    /**
     * Setter for text direction settings.
     */
    public com.anychart.core.ui.Tooltip textDirection(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textDirection(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for text direction settings.
     */
    public com.anychart.core.ui.Tooltip textDirection(com.anychart.graphics.vector.text.Direction value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textDirection(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for text-indent settings.
     */
    public void textIndent() {
        APIlib.getInstance().addJSLine(jsBase + ".textIndent();");
    }
    /**
     * Setter for text-indent settings.
     */
    public com.anychart.core.ui.Tooltip textIndent(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textIndent(%s);", value));

        return this;
    }
    /**
     * Getter for text overflow settings.
     */
    public void textOverflow() {
        APIlib.getInstance().addJSLine(jsBase + ".textOverflow();");
    }
    /**
     * Setter for text overflow settings.
     */
    public com.anychart.core.ui.Tooltip textOverflow(com.anychart.graphics.vector.text.TextOverflow value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textOverflow(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for text overflow settings.
     */
    public com.anychart.core.ui.Tooltip textOverflow(String value) {
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
     * Setter for the full text appearance settings.
     */
    public com.anychart.core.ui.Tooltip textSettings(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textSettings(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the custom text appearance settings.
     */
    public com.anychart.core.ui.Tooltip textSettings(String name, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", wrapQuotes(name), wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the custom text appearance settings.
     */
    public com.anychart.core.ui.Tooltip textSettings(String name, Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", wrapQuotes(name), value));

        return this;
    }
    /**
     * Setter for the custom text appearance settings.
     */
    public com.anychart.core.ui.Tooltip textSettings(String name, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textSettings(%s, %s);", wrapQuotes(name), value));

        return this;
    }
    /**
     * Getter for union tooltip title visual settings.
     */
    public com.anychart.core.ui.Title title() {
        return new com.anychart.core.ui.Title(jsBase + ".title()");
    }
    /**
     * Setter for union tooltip title visual settings.
     */
    public com.anychart.core.ui.Tooltip title(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", value));

        return this;
    }
    /**
     * Setter for union tooltip title visual settings.
     */
    public com.anychart.core.ui.Tooltip title(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the function to format title.
     */
    public void titleFormat() {
        APIlib.getInstance().addJSLine(jsBase + ".titleFormat();");
    }
    /**
     * Setter for the function to format title.<br/>
<b>Note:</b> Use {@link anychart.core.ui.Tooltip#title} method to set title visual settings.
     */
    public com.anychart.core.ui.Tooltip titleFormat(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".titleFormat(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the function content text for union tooltip.
     */
    public void unionFormat() {
        APIlib.getInstance().addJSLine(jsBase + ".unionFormat();");
    }
    /**
     * Setter for the function content text for union tooltip.<br/>
{docs:Common_Settings/Text_Formatters}Learn more about using unionFormat() method.{docs}
     */
    public com.anychart.core.ui.Tooltip unionFormat(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unionFormat(%s);", wrapQuotes(value)));

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
     * Setter for the useHTML flag.
     */
    public com.anychart.core.ui.Tooltip useHtml(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".useHtml(%s);", value));

        return this;
    }
    /**
     * Getter for text vertical align settings.
     */
    public void vAlign() {
        APIlib.getInstance().addJSLine(jsBase + ".vAlign();");
    }
    /**
     * Setter for text vertical align settings.
     */
    public com.anychart.core.ui.Tooltip vAlign(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for text vertical align settings.
     */
    public com.anychart.core.ui.Tooltip vAlign(com.anychart.graphics.vector.text.VAlign value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for tooltip postfix value.
     */
    public void valuePostfix() {
        APIlib.getInstance().addJSLine(jsBase + ".valuePostfix();");
    }
    /**
     * Setter for tooltip postfix value.
     */
    public com.anychart.core.ui.Tooltip valuePostfix(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valuePostfix(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for tooltip prefix value.
     */
    public void valuePrefix() {
        APIlib.getInstance().addJSLine(jsBase + ".valuePrefix();");
    }
    /**
     * Setter for tooltip prefix value.
     */
    public com.anychart.core.ui.Tooltip valuePrefix(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".valuePrefix(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the tooltip width.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for the tooltip width.
     */
    public com.anychart.core.ui.Tooltip width(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the tooltip width.
     */
    public com.anychart.core.ui.Tooltip width(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", value));

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
    public com.anychart.core.ui.Tooltip wordBreak(com.anychart.enums.WordBreak value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordBreak(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the word-break mode.
     */
    public com.anychart.core.ui.Tooltip wordBreak(String value) {
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
    public com.anychart.core.ui.Tooltip wordWrap(com.anychart.enums.WordWrap value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordWrap(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the word-wrap mode.
     */
    public com.anychart.core.ui.Tooltip wordWrap(String value) {
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
    public com.anychart.core.ui.Tooltip zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }

}