package com.anychart.core.axes;

import com.anychart.APIlib;
import com.anychart.chart.common.listener.ListenersInterface;
import com.anychart.core.VisualBase;

import java.util.Locale;

// class
/**
 * Stock date time axis class.
 */
public class StockDateTime extends VisualBase {

    protected StockDateTime() {

    }

    public static StockDateTime instantiate() {
        return new StockDateTime("new anychart.core.axes.stockDateTime()");
    }

    

    public StockDateTime(String jsChart) {
        jsBase = "stockDateTime" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for axis background settings.
     */
    public com.anychart.core.ui.Background background() {
        return new com.anychart.core.ui.Background(jsBase + ".background()");
    }
    /**
     * Setter for axis background settings.
     */
    public com.anychart.core.axes.StockDateTime background(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for axis background settings.
     */
    public com.anychart.core.axes.StockDateTime background(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", value));

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
    public com.anychart.core.axes.StockDateTime enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for the axis height.
     */
    public void height() {
        APIlib.getInstance().addJSLine(jsBase + ".height();");
    }
    /**
     * Setter for the axis height.
     */
    public com.anychart.core.axes.StockDateTime height(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", value));

        return this;
    }
    /**
     * Getter for axis labels settings.
     */
    public com.anychart.core.ui.LabelsFactory labels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".labels()");
    }
    /**
     * Setter for axis labels settings.
     */
    public com.anychart.core.axes.StockDateTime labels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for axis labels settings.
     */
    public com.anychart.core.axes.StockDateTime labels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", value));

        return this;
    }
    /**
     * Getter for minor labels settings.
     */
    public com.anychart.core.ui.LabelsFactory minorLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".minorLabels()");
    }
    /**
     * Setter for minor labels settings.
     */
    public com.anychart.core.axes.StockDateTime minorLabels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorLabels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for minor labels settings.
     */
    public com.anychart.core.axes.StockDateTime minorLabels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorLabels(%s);", value));

        return this;
    }
    /**
     * Getter for minor ticks.
     */
    public com.anychart.core.axes.StockTicks minorTicks() {
        return new com.anychart.core.axes.StockTicks(jsBase + ".minorTicks()");
    }
    /**
     * Setter for the minor ticks.
     */
    public com.anychart.core.axes.StockDateTime minorTicks(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorTicks(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the minor ticks.
     */
    public com.anychart.core.axes.StockDateTime minorTicks(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minorTicks(%s);", value));

        return this;
    }
    /**
     * Getter for labels overlap mode.
     */
    public void overlapMode() {
        APIlib.getInstance().addJSLine(jsBase + ".overlapMode();");
    }
    /**
     * Setter for labels overlap mode.
Whether to allow labels to overlap.
     */
    public com.anychart.core.axes.StockDateTime overlapMode(com.anychart.enums.StockLabelsOverlapMode value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".overlapMode(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for labels overlap mode.
Whether to allow labels to overlap.
     */
    public com.anychart.core.axes.StockDateTime overlapMode(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".overlapMode(%s);", wrapQuotes(value)));

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
     * Getter for the drawing helper label.
     */
    public void showHelperLabel() {
        APIlib.getInstance().addJSLine(jsBase + ".showHelperLabel();");
    }
    /**
     * Setter for the drawing helper label.
Whether to draw helper label (leftmost hanging label).
     */
    public com.anychart.core.axes.StockDateTime showHelperLabel(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".showHelperLabel(%s);", value));

        return this;
    }
    /**
     * Getter for axis ticks.
     */
    public com.anychart.core.axes.StockTicks ticks() {
        return new com.anychart.core.axes.StockTicks(jsBase + ".ticks()");
    }
    /**
     * Getter for axis ticks.
     */
    public com.anychart.core.axes.StockDateTime ticks(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for axis ticks.
     */
    public com.anychart.core.axes.StockDateTime ticks(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".ticks(%s);", value));

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
     * Getter for the Z-index of the element.
     */
    public void zIndex() {
        APIlib.getInstance().addJSLine(jsBase + ".zIndex();");
    }
    /**
     * Setter for the Z-index of the element.
     */
    public com.anychart.core.axes.StockDateTime zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }

}