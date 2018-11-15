package com.anychart.core.stock.eventmarkers;

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
 * Chart event markers controller.
Common settings for all event markers.
 */
public class Controller extends Base {

    protected Controller() {

    }

    public static Controller instantiate() {
        return new Controller("new anychart.core.stock.eventMarkers.controller()");
    }

    

    public Controller(String jsChart) {
        jsBase = "controller" + ++variableIndex;
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
    public com.anychart.core.stock.eventmarkers.Controller adjustFontSize(Boolean adjustOrAdjustByWidth, Boolean adjustByHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %s);", adjustOrAdjustByWidth, adjustByHeight));

        return this;
    }
    /**
     * Setter for the adjusting font size.
     */
    public com.anychart.core.stock.eventmarkers.Controller adjustFontSize(Boolean[] adjustOrAdjustByWidth, Boolean adjustByHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".adjustFontSize(%s, %s);", arrayToString(adjustOrAdjustByWidth), adjustByHeight));

        return this;
    }
    /**
     * Setter for the adjusting font size.
     */
    public com.anychart.core.stock.eventmarkers.Controller adjustFontSize(String adjustOrAdjustByWidth, Boolean adjustByHeight) {
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
     * Setter for the connector settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller connector(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".connector(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.data.TableMapping data(List<DataEntry> data) {
        return new com.anychart.data.TableMapping(String.format(Locale.US, jsBase + ".data(%s)", arrayToString(data)));
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
    public com.anychart.core.stock.eventmarkers.Controller direction(com.anychart.enums.EventMarkerDirection direction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".direction(%s);", (direction != null) ? direction.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the direction.
     */
    public com.anychart.core.stock.eventmarkers.Controller direction(String direction) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".direction(%s);", wrapQuotes(direction)));

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
    public com.anychart.core.stock.eventmarkers.Controller disablePointerEvents(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".disablePointerEvents(%s);", enabled));

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
<b>Note</b>: Sets a series field name for all {@link anychart.core.stock.eventMarkers.Controller#position} values with exception of "axis" value.
     */
    public com.anychart.core.stock.eventmarkers.Controller fieldName(String name) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fieldName(%s);", wrapQuotes(name)));

        return this;
    }
    /**
     * Getter for the fill color.
     */
    public void fill() {
        APIlib.getInstance().addJSLine(jsBase + ".fill();");
    }
    /**
     * Setter for fill settings using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(com.anychart.graphics.vector.Fill color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Setter for fill settings using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(com.anychart.graphics.vector.GradientKey color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", (color != null) ? color.getJsBase() : null));

        return this;
    }
    /**
     * Setter for fill settings using an array, an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(String[] color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", arrayToStringWrapQuotes(color)));

        return this;
    }
    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
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
    public com.anychart.core.stock.eventmarkers.Controller fontColor(String color) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontColor(%s);", wrapQuotes(color)));

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
    public com.anychart.core.stock.eventmarkers.Controller fontDecoration(com.anychart.graphics.vector.text.Decoration type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (type != null) ? type.getJsBase() : null));

        return this;
    }
    /**
     * Setter for font decoration settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller fontDecoration(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontDecoration(%s);", wrapQuotes(type)));

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
    public com.anychart.core.stock.eventmarkers.Controller fontFamily(String family) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontFamily(%s);", wrapQuotes(family)));

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
    public com.anychart.core.stock.eventmarkers.Controller fontOpacity(Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontOpacity(%s);", opacity));

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
    public com.anychart.core.stock.eventmarkers.Controller fontPadding(Number padding) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontPadding(%s);", padding));

        return this;
    }
    /**
     * Setter for the font padding.
     */
    public com.anychart.core.stock.eventmarkers.Controller fontPadding(String padding) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontPadding(%s);", wrapQuotes(padding)));

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
    public com.anychart.core.stock.eventmarkers.Controller fontSize(Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", size));

        return this;
    }
    /**
     * Setter for font size settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller fontSize(String size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", wrapQuotes(size)));

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
    public com.anychart.core.stock.eventmarkers.Controller fontStyle(String style) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", wrapQuotes(style)));

        return this;
    }
    /**
     * Setter for font style settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller fontStyle(com.anychart.graphics.vector.text.FontStyle style) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", (style != null) ? style.getJsBase() : null));

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
    public com.anychart.core.stock.eventmarkers.Controller fontVariant(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontVariant(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for font variant settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller fontVariant(com.anychart.graphics.vector.text.FontVariant value) {
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
    public com.anychart.core.stock.eventmarkers.Controller fontWeight(String weight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", wrapQuotes(weight)));

        return this;
    }
    /**
     * Setter for font weight settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller fontWeight(Number weight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", weight));

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
    public com.anychart.core.stock.eventmarkers.Controller format(String format) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".format(%s);", wrapQuotes(format)));

        return this;
    }
    /**
     * Getter for the group.
     */
    public com.anychart.core.stock.eventmarkers.Group group(Number indexOrValue) {
        return new com.anychart.core.stock.eventmarkers.Group(String.format(Locale.US, jsBase + ".group(%s)", indexOrValue));
    }
    /**
     * Setter for the group.
     */
    public com.anychart.core.stock.eventmarkers.Controller group(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".group(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the group.
     */
    public com.anychart.core.stock.eventmarkers.Controller group(String[] settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".group(%s);", arrayToStringWrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the group.
     */
    public com.anychart.core.stock.eventmarkers.Controller group(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".group(%s);", settings));

        return this;
    }
    /**
     * Setter for the group by index.
     */
    public com.anychart.core.stock.eventmarkers.Controller group(Number index, String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".group(%s, %s);", index, wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the group by index.
     */
    public com.anychart.core.stock.eventmarkers.Controller group(Number index, String[] settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".group(%s, %s);", index, arrayToStringWrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for the group by index.
     */
    public com.anychart.core.stock.eventmarkers.Controller group(Number index, Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".group(%s, %s);", index, settings));

        return this;
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
    public com.anychart.core.stock.eventmarkers.Controller hAlign(String align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", wrapQuotes(align)));

        return this;
    }
    /**
     * Setter for the horizontal align settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller hAlign(com.anychart.graphics.vector.text.HAlign align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", (align != null) ? align.getJsBase() : null));

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
    public com.anychart.core.stock.eventmarkers.Controller height(String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for the markers height.
     */
    public com.anychart.core.stock.eventmarkers.Controller height(Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", height));

        return this;
    }
    /**
     * Getter for hovered state settings.
     */
    public com.anychart.core.StateSettings hovered() {
        return new com.anychart.core.StateSettings(jsBase + ".hovered()");
    }
    /**
     * Setter for hovered state settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller hovered(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hovered(%s);", wrapQuotes(settings)));

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
    public com.anychart.core.stock.eventmarkers.Controller letterSpacing(Number spacing) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".letterSpacing(%s);", spacing));

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
    public com.anychart.core.stock.eventmarkers.Controller lineHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineHeight(%s);", value));

        return this;
    }
    /**
     * Setter for line height settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller lineHeight(String value) {
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
    public com.anychart.core.stock.eventmarkers.Controller maxFontSize(Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxFontSize(%s);", size));

        return this;
    }
    /**
     * Setter for maximum font size settings for adjust text from.
     */
    public com.anychart.core.stock.eventmarkers.Controller maxFontSize(String size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxFontSize(%s);", wrapQuotes(size)));

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
    public com.anychart.core.stock.eventmarkers.Controller minFontSize(Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minFontSize(%s);", size));

        return this;
    }
    /**
     * Setter for minimum font size settings for adjust text from.
     */
    public com.anychart.core.stock.eventmarkers.Controller minFontSize(String size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minFontSize(%s);", wrapQuotes(size)));

        return this;
    }
    /**
     * Getter for normal state settings.
     */
    public com.anychart.core.StateSettings normal() {
        return new com.anychart.core.StateSettings(jsBase + ".normal()");
    }
    /**
     * Setter for normal state settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller normal(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".normal(%s);", wrapQuotes(settings)));

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
    public com.anychart.core.stock.eventmarkers.Controller position(com.anychart.enums.EventMarkerPosition position) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".position(%s);", (position != null) ? position.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the position.
     */
    public com.anychart.core.stock.eventmarkers.Controller position(String position) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".position(%s);", wrapQuotes(position)));

        return this;
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
    public com.anychart.core.stock.eventmarkers.Controller selectable(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectable(%s);", enabled));

        return this;
    }
    /**
     * Getter for selected state settings.
     */
    public com.anychart.core.StateSettings selected() {
        return new com.anychart.core.StateSettings(jsBase + ".selected()");
    }
    /**
     * Setter for selected state settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller selected(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selected(%s);", wrapQuotes(settings)));

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
<b>Note</b>: Sets a series by id for all {@link anychart.core.stock.eventMarkers.Controller#position} values with exception of "axis" value.
     */
    public com.anychart.core.stock.eventmarkers.Controller seriesId(String id) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".seriesId(%s);", wrapQuotes(id)));

        return this;
    }
    /**
     * Getter for sticking event markers to left value.
     */
    public void stickToLeft() {
        APIlib.getInstance().addJSLine(jsBase + ".stickToLeft();");
    }
    /**
     * Setter for sticking event markers to left value.
     */
    public com.anychart.core.stock.eventmarkers.Controller stickToLeft(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stickToLeft(%s);", enabled));

        return this;
    }
    /**
     * Getter for stroke settings.
     */
    public void stroke() {
        APIlib.getInstance().addJSLine(jsBase + ".stroke();");
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
     * Setter for stroke using an object.
     */
    public com.anychart.core.stock.eventmarkers.Controller stroke(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(settings)));

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
    public com.anychart.core.stock.eventmarkers.Controller textDirection(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textDirection(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for text direction settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller textDirection(com.anychart.graphics.vector.text.Direction value) {
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
    public com.anychart.core.stock.eventmarkers.Controller textIndent(Number indent) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textIndent(%s);", indent));

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
    public com.anychart.core.stock.eventmarkers.Controller textOverflow(com.anychart.graphics.vector.text.TextOverflow value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textOverflow(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for text overflow settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller textOverflow(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textOverflow(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for tooltip settings.
     */
    public com.anychart.core.ui.Tooltip tooltip() {
        return new com.anychart.core.ui.Tooltip(jsBase + ".tooltip()");
    }
    /**
     * Setter for tooltip settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller tooltip(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for tooltip settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller tooltip(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", settings));

        return this;
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
    public com.anychart.core.stock.eventmarkers.Controller type(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".type(%s);", wrapQuotes(type)));

        return this;
    }
    /**
     * Setter for the marker type.
     */
    public com.anychart.core.stock.eventmarkers.Controller type(com.anychart.enums.EventMarkerType type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".type(%s);", (type != null) ? type.getJsBase() : null));

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
     * Setter for the useHTML flag.
     */
    public com.anychart.core.stock.eventmarkers.Controller useHtml(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".useHtml(%s);", enabled));

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
    public com.anychart.core.stock.eventmarkers.Controller vAlign(String align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", wrapQuotes(align)));

        return this;
    }
    /**
     * Setter for text vertical align settings.
     */
    public com.anychart.core.stock.eventmarkers.Controller vAlign(com.anychart.graphics.vector.text.VAlign align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", (align != null) ? align.getJsBase() : null));

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
    public com.anychart.core.stock.eventmarkers.Controller width(String width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width)));

        return this;
    }
    /**
     * Setter for the markers width.
     */
    public com.anychart.core.stock.eventmarkers.Controller width(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", width));

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
    public com.anychart.core.stock.eventmarkers.Controller wordBreak(com.anychart.enums.WordBreak mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordBreak(%s);", (mode != null) ? mode.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the word-break mode.
     */
    public com.anychart.core.stock.eventmarkers.Controller wordBreak(String mode) {
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
    public com.anychart.core.stock.eventmarkers.Controller wordWrap(com.anychart.enums.WordWrap mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordWrap(%s);", (mode != null) ? mode.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the word-wrap mode.
     */
    public com.anychart.core.stock.eventmarkers.Controller wordWrap(String mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordWrap(%s);", wrapQuotes(mode)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.data.TableMapping data(com.anychart.data.View data) {
        return new com.anychart.data.TableMapping(String.format(Locale.US, jsBase + ".data(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.data.TableMapping data(List<DataEntry> data, com.anychart.enums.TreeFillingMethod fillMethod) {
        return new com.anychart.data.TableMapping(String.format(Locale.US, jsBase + ".data(%s, %s)", arrayToString(data), (fillMethod != null) ? fillMethod.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.data.TableMapping data(List<DataEntry> data, String fillMethod) {
        return new com.anychart.data.TableMapping(String.format(Locale.US, jsBase + ".data(%s, %s)", arrayToString(data), wrapQuotes(fillMethod)));
    }
    /**
     * 
     */
    public com.anychart.core.stock.eventmarkers.Controller fill(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fill(%s);", wrapQuotes(value)));

        return this;
    }

}