package com.anychart.core.stock.eventmarkers;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.listener.ListenersInterface;
import com.anychart.core.VisualBase;

import java.util.List;
import java.util.Locale;

// class
/**
 * Event markers group class.<br/>
Settings of the separate markers group.
 */
public class Group extends VisualBase {

    protected Group() {

    }

    public static Group instantiate() {
        return new Group("new anychart.core.stock.eventMarkers.group()");
    }

    

    public Group(String jsChart) {
        jsBase = "group" + ++variableIndex;
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
    public com.anychart.core.stock.eventmarkers.Group adjustFontSize(Boolean adjustOrAdjustByWidth, Boolean adjustByHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %s);", adjustOrAdjustByWidth, adjustByHeight));

        return this;
    }
    /**
     * Setter for the adjusting font size.
     */
    public com.anychart.core.stock.eventmarkers.Group adjustFontSize(Boolean[] adjustOrAdjustByWidth, Boolean adjustByHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %s);", arrayToString(adjustOrAdjustByWidth), adjustByHeight));

        return this;
    }
    /**
     * Setter for the adjusting font size.
     */
    public com.anychart.core.stock.eventmarkers.Group adjustFontSize(String adjustOrAdjustByWidth, Boolean adjustByHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %s);", wrapQuotes(adjustOrAdjustByWidth), adjustByHeight));

        return this;
    }
    /**
     * Getter for connector settings.
     */
    public com.anychart.core.utils.Connector connector() {
        return new com.anychart.core.utils.Connector(jsBase + ".connector()");
    }
    /**
     * Setter for the connector length.
     */
    public com.anychart.core.stock.eventmarkers.Group connector(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connector(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public void data(List<DataEntry> data) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s);", arrayToString(data)));
    }
    /**
     * Getter for the direction.
     */
    public void direction() {
        APIlib.getInstance().addJSLine(jsBase + ".direction();");
    }
    /**
     * Setter for the direction.
     */
    public com.anychart.core.stock.eventmarkers.Group direction(com.anychart.enums.EventMarkerDirection value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".direction(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the direction.
     */
    public com.anychart.core.stock.eventmarkers.Group direction(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".direction(%s);", wrapQuotes(value)));

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
    public com.anychart.core.stock.eventmarkers.Group disablePointerEvents(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".disablePointerEvents(%s);", value));

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
    public com.anychart.core.stock.eventmarkers.Group enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for the fieldName.
     */
    public void fieldName() {
        APIlib.getInstance().addJSLine(jsBase + ".fieldName();");
    }
    /**
     * Setter for the fieldName.<br/>
<b>Note</b>: Sets a series field name for all {@link anychart.core.stock.eventMarkers.Group#position} values with exception of "axis" value.
     */
    public com.anychart.core.stock.eventmarkers.Group fieldName(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fieldName(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the fill color.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Group fill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for fill settings using function.
     */
    public com.anychart.core.stock.eventmarkers.Group fill(String fillFunction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", wrapQuotes(fillFunction)));

        return this;
    }
    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.core.stock.eventmarkers.Group fill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Group fill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Group fill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Group fill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Group fill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Group fill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Group fill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Group fill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Group fill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

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
    public com.anychart.core.stock.eventmarkers.Group fontColor(String value) {
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
    public com.anychart.core.stock.eventmarkers.Group fontDecoration(com.anychart.graphics.vector.text.Decoration value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for font decoration settings.
     */
    public com.anychart.core.stock.eventmarkers.Group fontDecoration(String value) {
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
    public com.anychart.core.stock.eventmarkers.Group fontFamily(String value) {
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
    public com.anychart.core.stock.eventmarkers.Group fontOpacity(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontOpacity(%s);", value));

        return this;
    }
    /**
     * Getter for the font padding.
     */
    public void fontPadding() {
        APIlib.getInstance().addJSLine(jsBase + ".fontPadding();");
    }
    /**
     * Setter for the font padding.
     */
    public com.anychart.core.stock.eventmarkers.Group fontPadding(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontPadding(%s);", value));

        return this;
    }
    /**
     * Setter for the font padding.
     */
    public com.anychart.core.stock.eventmarkers.Group fontPadding(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontPadding(%s);", wrapQuotes(value)));

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
    public com.anychart.core.stock.eventmarkers.Group fontSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", value));

        return this;
    }
    /**
     * Setter for font size settings.
     */
    public com.anychart.core.stock.eventmarkers.Group fontSize(String value) {
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
    public com.anychart.core.stock.eventmarkers.Group fontStyle(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for font style settings.
     */
    public com.anychart.core.stock.eventmarkers.Group fontStyle(com.anychart.graphics.vector.text.FontStyle value) {
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
    public com.anychart.core.stock.eventmarkers.Group fontVariant(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontVariant(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for font variant settings.
     */
    public com.anychart.core.stock.eventmarkers.Group fontVariant(com.anychart.graphics.vector.text.FontVariant value) {
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
    public com.anychart.core.stock.eventmarkers.Group fontWeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for font weight settings.
     */
    public com.anychart.core.stock.eventmarkers.Group fontWeight(Number value) {
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
     */
    public com.anychart.core.stock.eventmarkers.Group format(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".format(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Gets group marker by index.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Stock#draw} is called.
     */
    public com.anychart.format.Context getMarker(Number index) {
        return new com.anychart.format.Context(String.format(Locale.US, jsBase + ".getMarker(%s)", index));
    }
    /**
     * Getter for horizontal align settings.
     */
    public void hAlign() {
        APIlib.getInstance().addJSLine(jsBase + ".hAlign();");
    }
    /**
     * Setter for the horizontal align settings.
     */
    public com.anychart.core.stock.eventmarkers.Group hAlign(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the horizontal align settings.
     */
    public com.anychart.core.stock.eventmarkers.Group hAlign(com.anychart.graphics.vector.text.HAlign value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the markers height.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for the markers height.
     */
    public com.anychart.core.stock.eventmarkers.Group height(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the markers height.
     */
    public com.anychart.core.stock.eventmarkers.Group height(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", value));

        return this;
    }
    /**
     * Getter for hovered state settings.
     */
    public com.anychart.core.stock.eventmarkers.Group hovered() {
        APIlib.getInstance().addJSLine(jsBase + ".hovered();");

        return this;
    }
    /**
     * Setter for hovered state settings.
     */
    public com.anychart.core.stock.eventmarkers.Group hovered(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hovered(%s);", wrapQuotes(value)));

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
    public com.anychart.core.stock.eventmarkers.Group letterSpacing(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".letterSpacing(%s);", value));

        return this;
    }
    /**
     * Getter for line height settings.
     */
    public void lineHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".lineHeight();");
    }
    /**
     * Setter for line height settings.
     */
    public com.anychart.core.stock.eventmarkers.Group lineHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineHeight(%s);", value));

        return this;
    }
    /**
     * Setter for line height settings.
     */
    public com.anychart.core.stock.eventmarkers.Group lineHeight(String value) {
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
    public com.anychart.core.stock.eventmarkers.Group maxFontSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxFontSize(%s);", value));

        return this;
    }
    /**
     * Setter for maximum font size settings for adjust text from.
     */
    public com.anychart.core.stock.eventmarkers.Group maxFontSize(String value) {
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
    public com.anychart.core.stock.eventmarkers.Group minFontSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minFontSize(%s);", value));

        return this;
    }
    /**
     * Setter for minimum font size settings for adjust text from.
     */
    public com.anychart.core.stock.eventmarkers.Group minFontSize(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minFontSize(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for normal state settings.
     */
    public com.anychart.core.stock.eventmarkers.Group normal() {
        APIlib.getInstance().addJSLine(jsBase + ".normal();");

        return this;
    }
    /**
     * Setter for normal state settings.
     */
    public com.anychart.core.stock.eventmarkers.Group normal(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".normal(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the position.
     */
    public void position() {
        APIlib.getInstance().addJSLine(jsBase + ".position();");
    }
    /**
     * Setter for the position.
     */
    public com.anychart.core.stock.eventmarkers.Group position(com.anychart.enums.EventMarkerPosition value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".position(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the position.
     */
    public com.anychart.core.stock.eventmarkers.Group position(String value) {
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
     * Setter for the text selectable option.
     */
    public com.anychart.core.stock.eventmarkers.Group selectable(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectable(%s);", value));

        return this;
    }
    /**
     * Getter for selected state settings.
     */
    public com.anychart.core.stock.eventmarkers.Group selected() {
        APIlib.getInstance().addJSLine(jsBase + ".selected();");

        return this;
    }
    /**
     * Setter for selected state settings.
     */
    public com.anychart.core.stock.eventmarkers.Group selected(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selected(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the seriesId.
     */
    public void seriesId() {
        APIlib.getInstance().addJSLine(jsBase + ".seriesId();");
    }
    /**
     * Setter for the seriesId.<br/>
<b>Note</b>: Sets a series by id for all {@link anychart.core.stock.eventMarkers.Group#position} values with exception of "axis" value.
     */
    public com.anychart.core.stock.eventmarkers.Group seriesId(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".seriesId(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for stroke settings.
     */
    public void stroke() {
        APIlib.getInstance().addJSLine(jsBase + ".stroke();");
    }
    /**
     * Setter for series stroke by function.
     */
    public com.anychart.core.map.series.Base stroke(String strokeFunction) {
        return new com.anychart.core.map.series.Base(String.format(Locale.US, jsBase + ".stroke(%s)", wrapQuotes(strokeFunction)));
    }
    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.map.series.Base stroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        return new com.anychart.core.map.series.Base(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s)", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));
    }
    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.map.series.Base stroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        return new com.anychart.core.map.series.Base(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s)", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));
    }
    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.map.series.Base stroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        return new com.anychart.core.map.series.Base(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s)", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));
    }
    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.map.series.Base stroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        return new com.anychart.core.map.series.Base(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s)", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));
    }
    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.map.series.Base stroke(String color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        return new com.anychart.core.map.series.Base(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));
    }
    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.map.series.Base stroke(String color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        return new com.anychart.core.map.series.Base(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));
    }
    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.map.series.Base stroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        return new com.anychart.core.map.series.Base(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));
    }
    /**
     * Setter for series stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.core.map.series.Base stroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        return new com.anychart.core.map.series.Base(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));
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
    public com.anychart.core.stock.eventmarkers.Group textDirection(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textDirection(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for text direction settings.
     */
    public com.anychart.core.stock.eventmarkers.Group textDirection(com.anychart.graphics.vector.text.Direction value) {
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
    public com.anychart.core.stock.eventmarkers.Group textIndent(Number value) {
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
    public com.anychart.core.stock.eventmarkers.Group textOverflow(com.anychart.graphics.vector.text.TextOverflow value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textOverflow(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for text overflow settings.
     */
    public com.anychart.core.stock.eventmarkers.Group textOverflow(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textOverflow(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for tooltip settings.
     */
    public com.anychart.core.stock.eventmarkers.Group tooltip() {
        APIlib.getInstance().addJSLine(jsBase + ".tooltip();");

        return this;
    }
    /**
     * Setter for tooltip settings.
     */
    public com.anychart.charts.Pie tooltip(String value) {
        return new com.anychart.charts.Pie(String.format(Locale.US, jsBase + ".tooltip(%s)", wrapQuotes(value)));
    }
    /**
     * Setter for tooltip settings.
     */
    public com.anychart.charts.Pie tooltip(Boolean value) {
        return new com.anychart.charts.Pie(String.format(Locale.US, jsBase + ".tooltip(%s)", value));
    }
    /**
     * Getter for the marker type.
     */
    public void type() {
        APIlib.getInstance().addJSLine(jsBase + ".type();");
    }
    /**
     * Setter for the marker type.
     */
    public com.anychart.core.stock.eventmarkers.Group type(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".type(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the marker type.
     */
    public com.anychart.core.stock.eventmarkers.Group type(com.anychart.enums.EventMarkerType value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".type(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    public void setOnClickListener(ListenersInterface.OnClickListener listener) {
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

        ListenersInterface.getInstance().setOnClickListener(listener);

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
    public com.anychart.core.stock.eventmarkers.Group useHtml(Boolean value) {
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
    public com.anychart.core.stock.eventmarkers.Group vAlign(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for text vertical align settings.
     */
    public com.anychart.core.stock.eventmarkers.Group vAlign(com.anychart.graphics.vector.text.VAlign value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the markers width.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for the markers width.
     */
    public com.anychart.core.stock.eventmarkers.Group width(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the markers width.
     */
    public com.anychart.core.stock.eventmarkers.Group width(Number value) {
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
    public com.anychart.core.stock.eventmarkers.Group wordBreak(com.anychart.enums.WordBreak value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordBreak(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the word-break mode.
     */
    public com.anychart.core.stock.eventmarkers.Group wordBreak(String value) {
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
    public com.anychart.core.stock.eventmarkers.Group wordWrap(com.anychart.enums.WordWrap value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordWrap(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the word-wrap mode.
     */
    public com.anychart.core.stock.eventmarkers.Group wordWrap(String value) {
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
    public com.anychart.core.stock.eventmarkers.Group zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.stock.eventmarkers.Group data(com.anychart.data.View data) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s);", (data != null) ? data.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.stock.eventmarkers.Group data(List<DataEntry> data, com.anychart.enums.TreeFillingMethod fillMethod) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s, %s);", arrayToString(data), (fillMethod != null) ? fillMethod.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.stock.eventmarkers.Group data(List<DataEntry> data, String fillMethod) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s, %s);", arrayToString(data), wrapQuotes(fillMethod)));

        return this;
    }

}