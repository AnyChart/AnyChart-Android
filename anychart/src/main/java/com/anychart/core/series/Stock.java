package com.anychart.core.series;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;

import java.util.List;
import java.util.Locale;

// class
/**
 * 
 */
public class Stock extends Base {

    protected Stock() {

    }

    public static Stock instantiate() {
        return new Stock("new anychart.core.series.stock()");
    }

    

    public Stock(String jsChart) {
        jsBase = "stock" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
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
    public com.anychart.core.series.Stock bottom(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", value));

        return this;
    }
    /**
     * Setter for element bottom bound settings.
     */
    public com.anychart.core.series.Stock bottom(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", wrapQuotes(value)));

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
    public com.anychart.core.series.Stock bounds(com.anychart.utils.RectObj value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.series.Stock bounds(com.anychart.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.core.series.Stock bounds(com.anychart.core.utils.Bounds value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(Number x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(Number x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(Number x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(Number x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(Number x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(Number x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(Number x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(Number x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(String x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(String x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(String x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(String x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(String x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(String x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(String x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.core.series.Stock bounds(String x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.series.Stock clip(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".clip(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.series.Stock clip(com.anychart.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".clip(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * 
     */
    public com.anychart.data.TableMapping data(List<DataEntry> data) {
        return new com.anychart.data.TableMapping(String.format(Locale.US, jsBase + ".data(%s)", arrayToString(data)));
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
    public com.anychart.core.series.Stock enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.utils.Error error(String value) {
        return new com.anychart.core.utils.Error(String.format(Locale.US, jsBase + ".error(%s)", wrapQuotes(value)));
    }
    /**
     * 
     */
    public com.anychart.core.utils.Error error(Boolean value) {
        return new com.anychart.core.utils.Error(String.format(Locale.US, jsBase + ".error(%s)", value));
    }
    /**
     * 
     */
    public void getIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".getIndex();");
    }
    /**
     * Returns pixel bounds of the element due to parent bounds and self bounds settings.
     */
    public com.anychart.math.Rect getPixelBounds() {
        return new com.anychart.math.Rect(jsBase + ".getPixelBounds()");
    }
    /**
     * 
     */
    public void getPixelPointWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".getPixelPointWidth();");
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
    public com.anychart.core.series.Stock height(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", value));

        return this;
    }
    /**
     * Setter for element height setting.
     */
    public com.anychart.core.series.Stock height(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.LabelsFactory hoverLabels(String value) {
        return new com.anychart.core.ui.LabelsFactory(String.format(Locale.US, jsBase + ".hoverLabels(%s)", wrapQuotes(value)));
    }
    /**
     * 
     */
    public com.anychart.core.ui.LabelsFactory hoverLabels(Boolean value) {
        return new com.anychart.core.ui.LabelsFactory(String.format(Locale.US, jsBase + ".hoverLabels(%s)", value));
    }
    /**
     * 
     */
    public com.anychart.core.ui.MarkersFactory hoverMarkers(String value) {
        return new com.anychart.core.ui.MarkersFactory(String.format(Locale.US, jsBase + ".hoverMarkers(%s)", wrapQuotes(value)));
    }
    /**
     * 
     */
    public com.anychart.core.ui.MarkersFactory hoverMarkers(Boolean value) {
        return new com.anychart.core.ui.MarkersFactory(String.format(Locale.US, jsBase + ".hoverMarkers(%s)", value));
    }
    /**
     * 
     */
    public com.anychart.core.ui.MarkersFactory hoverOutlierMarkers(String value) {
        return new com.anychart.core.ui.MarkersFactory(String.format(Locale.US, jsBase + ".hoverOutlierMarkers(%s)", wrapQuotes(value)));
    }
    /**
     * 
     */
    public com.anychart.core.ui.MarkersFactory hoverOutlierMarkers(Boolean value) {
        return new com.anychart.core.ui.MarkersFactory(String.format(Locale.US, jsBase + ".hoverOutlierMarkers(%s)", value));
    }
    /**
     * 
     */
    public void id(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".id(%s);", wrapQuotes(value)));
    }
    /**
     * 
     */
    public com.anychart.core.ui.LabelsFactory labels(String value) {
        return new com.anychart.core.ui.LabelsFactory(String.format(Locale.US, jsBase + ".labels(%s)", wrapQuotes(value)));
    }
    /**
     * 
     */
    public com.anychart.core.ui.LabelsFactory labels(Boolean value) {
        return new com.anychart.core.ui.LabelsFactory(String.format(Locale.US, jsBase + ".labels(%s)", value));
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
    public com.anychart.core.series.Stock left(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", value));

        return this;
    }
    /**
     * Setter for element left bound settings.
     */
    public com.anychart.core.series.Stock left(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.utils.LegendItemSettings legendItem(String value) {
        return new com.anychart.core.utils.LegendItemSettings(String.format(Locale.US, jsBase + ".legendItem(%s)", wrapQuotes(value)));
    }
    /**
     * 
     */
    public com.anychart.core.ui.MarkersFactory markers(String value) {
        return new com.anychart.core.ui.MarkersFactory(String.format(Locale.US, jsBase + ".markers(%s)", wrapQuotes(value)));
    }
    /**
     * 
     */
    public com.anychart.core.ui.MarkersFactory markers(Boolean value) {
        return new com.anychart.core.ui.MarkersFactory(String.format(Locale.US, jsBase + ".markers(%s)", value));
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
    public com.anychart.core.series.Stock maxHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum height.
     */
    public com.anychart.core.series.Stock maxHeight(String value) {
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
    public com.anychart.core.series.Stock maxWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum width.
     */
    public com.anychart.core.series.Stock maxWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public void meta(String object_or_key, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".meta(%s, %s);", wrapQuotes(object_or_key), wrapQuotes(value)));
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
    public com.anychart.core.series.Stock minHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum height.
     */
    public com.anychart.core.series.Stock minHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", wrapQuotes(value)));

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
    public com.anychart.core.series.Stock minWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum width.
     */
    public com.anychart.core.series.Stock minWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.series.Stock name(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".name(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.MarkersFactory outlierMarkers(String value) {
        return new com.anychart.core.ui.MarkersFactory(String.format(Locale.US, jsBase + ".outlierMarkers(%s)", wrapQuotes(value)));
    }
    /**
     * 
     */
    public com.anychart.core.ui.MarkersFactory outlierMarkers(Boolean value) {
        return new com.anychart.core.ui.MarkersFactory(String.format(Locale.US, jsBase + ".outlierMarkers(%s)", value));
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
     * Getter for element right bound settings.
     */
    public void right() {
        APIlib.getInstance().addJSLine(jsBase + ".right();");
    }
    /**
     * Setter for element right bound setting.
     */
    public com.anychart.core.series.Stock right(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", value));

        return this;
    }
    /**
     * Setter for element right bound setting.
     */
    public com.anychart.core.series.Stock right(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.ui.LabelsFactory selectLabels(String value) {
        return new com.anychart.core.ui.LabelsFactory(String.format(Locale.US, jsBase + ".selectLabels(%s)", wrapQuotes(value)));
    }
    /**
     * 
     */
    public com.anychart.core.ui.LabelsFactory selectLabels(Boolean value) {
        return new com.anychart.core.ui.LabelsFactory(String.format(Locale.US, jsBase + ".selectLabels(%s)", value));
    }
    /**
     * 
     */
    public com.anychart.core.ui.MarkersFactory selectMarkers(String value) {
        return new com.anychart.core.ui.MarkersFactory(String.format(Locale.US, jsBase + ".selectMarkers(%s)", wrapQuotes(value)));
    }
    /**
     * 
     */
    public com.anychart.core.ui.MarkersFactory selectMarkers(Boolean value) {
        return new com.anychart.core.ui.MarkersFactory(String.format(Locale.US, jsBase + ".selectMarkers(%s)", value));
    }
    /**
     * 
     */
    public com.anychart.core.ui.MarkersFactory selectOutlierMarkers(String value) {
        return new com.anychart.core.ui.MarkersFactory(String.format(Locale.US, jsBase + ".selectOutlierMarkers(%s)", wrapQuotes(value)));
    }
    /**
     * 
     */
    public com.anychart.core.ui.MarkersFactory selectOutlierMarkers(Boolean value) {
        return new com.anychart.core.ui.MarkersFactory(String.format(Locale.US, jsBase + ".selectOutlierMarkers(%s)", value));
    }
    /**
     * 
     */
    public com.anychart.core.series.Stock seriesType(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".seriesType(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.series.Stock tooltip(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.series.Stock tooltip(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", value));

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
    public com.anychart.core.series.Stock top(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", value));

        return this;
    }
    /**
     * Setter for element top bound settings.
     */
    public com.anychart.core.series.Stock top(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public void transformX(String value, Number subRangeRatio) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".transformX(%s, %s);", wrapQuotes(value), subRangeRatio));
    }
    /**
     * 
     */
    public void transformY(String value, Number subRangeRatio) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".transformY(%s, %s);", wrapQuotes(value), subRangeRatio));
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
     * Getter for element width settings.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for element width setting.
     */
    public com.anychart.core.series.Stock width(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", value));

        return this;
    }
    /**
     * Setter for element width setting.
     */
    public com.anychart.core.series.Stock width(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.scales.Base yScale(com.anychart.scales.Base value) {
        return new com.anychart.scales.Base(String.format(Locale.US, jsBase + ".yScale(%s)", (value != null) ? value.getJsBase() : null));
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
    public com.anychart.core.series.Stock zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

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