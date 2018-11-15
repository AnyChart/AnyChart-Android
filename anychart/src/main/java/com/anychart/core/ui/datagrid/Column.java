package com.anychart.core.ui.datagrid;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.VisualBase;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Data grid column.
 */
public class Column extends VisualBase {

    protected Column() {

    }

    public static Column instantiate() {
        return new Column("new anychart.core.ui.DataGrid.column()");
    }

    

    public Column(String jsChart) {
        jsBase = "column" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * 
     */
    public void buttonCursor() {
        APIlib.getInstance().addJSLine(jsBase + ".buttonCursor();");
    }
    /**
     * 
     */
    public com.anychart.core.ui.datagrid.Column buttonCursor(com.anychart.enums.Cursor valueCursor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".buttonCursor(%s);", (valueCursor != null) ? valueCursor.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.datagrid.Column buttonCursor(String valueCursor) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".buttonCursor(%s);", wrapQuotes(valueCursor)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.LabelsFactory cellTextSettings() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".cellTextSettings()");
    }
    /**
     * 
     */
    public com.anychart.core.ui.datagrid.Column cellTextSettings(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".cellTextSettings(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public void cellTextSettingsOverrider() {
        APIlib.getInstance().addJSLine(jsBase + ".cellTextSettingsOverrider();");
    }
    /**
     * Getter for expanding or collapse buttons.
     */
    public void collapseExpandButtons() {
        APIlib.getInstance().addJSLine(jsBase + ".collapseExpandButtons();");
    }
    /**
     * Setter for expanding or collapse buttons.
     */
    public com.anychart.core.ui.datagrid.Column collapseExpandButtons(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".collapseExpandButtons(%s);", enabled));

        return this;
    }
    /**
     * Getter for the column default width.
     */
    public void defaultWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".defaultWidth();");
    }
    /**
     * Setter for the column default width.
     */
    public com.anychart.core.ui.datagrid.Column defaultWidth(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".defaultWidth(%s);", width));

        return this;
    }
    /**
     * Getter for the multiplier to choose a left padding.
     */
    public void depthPaddingMultiplier() {
        APIlib.getInstance().addJSLine(jsBase + ".depthPaddingMultiplier();");
    }
    /**
     * Setter for the multiplier to choose a left padding.
     */
    public com.anychart.core.ui.datagrid.Column depthPaddingMultiplier(Number padding) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".depthPaddingMultiplier(%s);", padding));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.datagrid.Column draw() {
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
    public com.anychart.core.ui.datagrid.Column enabled(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", enabled));

        return this;
    }
    /**
     * Getter for labels settings of a column.
     */
    public com.anychart.core.ui.LabelsFactory labels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".labels()");
    }
    /**
     * Getter for the labels overrider.
     */
    public void labelsOverrider() {
        APIlib.getInstance().addJSLine(jsBase + ".labelsOverrider();");
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
     * Sets column format using enum.
     */
    public com.anychart.core.ui.datagrid.Column setColumnFormat(String fieldName, com.anychart.enums.ColumnFormats presetValue) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setColumnFormat(%s, %s);", wrapQuotes(fieldName), (presetValue != null) ? presetValue.getJsBase() : null));

        return this;
    }
    /**
     * Sets column format using enum.
     */
    public com.anychart.core.ui.datagrid.Column setColumnFormat(String fieldName, String presetValue) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setColumnFormat(%s, %s);", wrapQuotes(fieldName), wrapQuotes(presetValue)));

        return this;
    }
    /**
     * Getter for the column title.
     */
    public com.anychart.core.ui.Title title() {
        return new com.anychart.core.ui.Title(jsBase + ".title()");
    }
    /**
     * Setter for the column title.
     */
    public com.anychart.core.ui.datagrid.Column title(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", settings));

        return this;
    }
    /**
     * Setter for the column title.
     */
    public com.anychart.core.ui.datagrid.Column title(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(settings)));

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
     * Getter for the column width.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for the column width.
     */
    public com.anychart.core.ui.datagrid.Column width(Number width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", width));

        return this;
    }
    /**
     * Setter for the column width.
     */
    public com.anychart.core.ui.datagrid.Column width(String width) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width)));

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
    public com.anychart.core.ui.datagrid.Column zIndex(Number zIndex) {
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
    public com.anychart.core.ui.datagrid.Column container(com.anychart.graphics.vector.Layer element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.ui.datagrid.Column container(com.anychart.graphics.vector.Stage element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.ui.datagrid.Column container(String element) {
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
    public com.anychart.core.ui.datagrid.Column parentBounds(com.anychart.math.Rect bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", (bounds != null) ? bounds.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.ui.datagrid.Column parentBounds(String bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", wrapQuotes(bounds)));

        return this;
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.ui.datagrid.Column parentBounds(Number bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", bounds));

        return this;
    }
    /**
     * Setter for the parent bounds using several values.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.ui.datagrid.Column parentBounds(Number left, Number top, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s, %s, %s, %s);", left, top, width, height));

        return this;
    }

}