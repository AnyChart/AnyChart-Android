package com.anychart.charts;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.core.SeparateChart;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Cartesian 3d chart class.<br/>
To get the chart use any of these methods:
 <ul>
     <li>{@link anychart#area3d}</li>
     <li>{@link anychart#bar3d}</li>
     <li>{@link anychart#column3d}</li>
 </ul>
Chart can contain any number of series.
Each series is interactive, you can customize click and hover behavior and other parameters.
 */
public class Cartesian3d extends SeparateChart {

    protected Cartesian3d() {

    }

    public static Cartesian3d instantiate() {
        return new Cartesian3d("new anychart.charts.cartesian3d()");
    }

    

    public Cartesian3d(String jsChart) {
        jsBase = "cartesian3d" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for animation settings.
     */
    public com.anychart.core.utils.Animation animation() {
        return new com.anychart.core.utils.Animation(jsBase + ".animation()");
    }
    /**
     * Setter for animation settings by one value.
     */
    public com.anychart.charts.Cartesian3d animation(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".animation(%s);", value));

        return this;
    }
    /**
     * Setter for animation settings by one value.
     */
    public com.anychart.charts.Cartesian3d animation(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".animation(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for animation settings using several parameters.
     */
    public com.anychart.charts.Cartesian3d animation(Boolean enabled, Number duration) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".animation(%s, %s);", enabled, duration));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Area3d area(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.Area3d(String.format(Locale.US, jsBase + ".area(%s)", arrayToString(data)));
    }
    /**
     * Getter for the autoRedraw flag. <br/>
Flag whether to automatically call chart.draw() on any changes or not.
     */
    public void autoRedraw() {
        APIlib.getInstance().addJSLine(jsBase + ".autoRedraw();");
    }
    /**
     * Setter for the autoRedraw flag.<br/>
Flag whether to automatically call chart.draw() on any changes or not.
     */
    public com.anychart.charts.Cartesian3d autoRedraw(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".autoRedraw(%s);", value));

        return this;
    }
    /**
     * Getter for the chart background.
     */
    public com.anychart.core.ui.Background background() {
        return new com.anychart.core.ui.Background(jsBase + ".background()");
    }
    /**
     * Setter for the chart background.
     */
    public com.anychart.charts.Cartesian3d background(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".background(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Bar3d bar(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.Bar3d(String.format(Locale.US, jsBase + ".bar(%s)", arrayToString(data)));
    }
    /**
     * Getter for the current space between bar groups on the ordinal scale by ratio of bars width.
     */
    public void barGroupsPadding() {
        APIlib.getInstance().addJSLine(jsBase + ".barGroupsPadding();");
    }
    /**
     * Setter for the space between bar groups on the ordinal scale by ratio of bars width.<br/>
See illustration at {@link anychart.charts.Cartesian#barsPadding}.
     */
    public com.anychart.charts.Cartesian barGroupsPadding(Number value) {
        return new com.anychart.charts.Cartesian(String.format(Locale.US, jsBase + ".barGroupsPadding(%s)", value));
    }
    /**
     * Getter for the space between bars on the ordinal scale by ratio of bars width.
     */
    public void barsPadding() {
        APIlib.getInstance().addJSLine(jsBase + ".barsPadding();");
    }
    /**
     * Setter for the space between bars on the ordinal scale by ratio of bars width.</br>
<img src='/si/8.2.1/anychart.charts.Cartesian.barsPadding.png' width='396' height='294'/>
     */
    public com.anychart.charts.Cartesian barsPadding(Number value) {
        return new com.anychart.charts.Cartesian(String.format(Locale.US, jsBase + ".barsPadding(%s)", value));
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
    public com.anychart.charts.Cartesian3d bottom(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bottom(%s);", value));

        return this;
    }
    /**
     * Setter for element bottom bound settings.
     */
    public com.anychart.charts.Cartesian3d bottom(String value) {
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
    public com.anychart.charts.Cartesian3d bounds(com.anychart.utils.RectObj value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.charts.Cartesian3d bounds(com.anychart.math.Rect value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for bounds of the element using one parameter.
     */
    public com.anychart.charts.Cartesian3d bounds(com.anychart.core.utils.Bounds value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(Number x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(Number x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(Number x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(Number x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(Number x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(Number x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(Number x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(Number x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(String x, Number y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(String x, Number y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(String x, Number y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(String x, Number y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), y, wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(String x, String y, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(String x, String y, Number width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), width, wrapQuotes(height)));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(String x, String y, String width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), height));

        return this;
    }
    /**
     * Setter for element bounds settings.
     */
    public com.anychart.charts.Cartesian3d bounds(String x, String y, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x), wrapQuotes(y), wrapQuotes(width), wrapQuotes(height)));

        return this;
    }
    /**
     * Stops current marquee action if any.
     */
    public com.anychart.charts.Cartesian3d cancelMarquee() {
        APIlib.getInstance().addJSLine(jsBase + ".cancelMarquee();");

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Column3d column(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.Column3d(String.format(Locale.US, jsBase + ".column(%s)", arrayToString(data)));
    }
    /**
     * Getter for the element's container.
     */
    public com.anychart.graphics.vector.Layer container() {
        return new com.anychart.graphics.vector.Layer(jsBase + ".container()");
    }
    /**
     * Setter for the element's container.
     */
    public com.anychart.charts.Cartesian3d container(com.anychart.graphics.vector.Layer value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the element's container.
     */
    public com.anychart.charts.Cartesian3d container(com.anychart.graphics.vector.Stage value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the element's container.
     */
    public com.anychart.charts.Cartesian3d container(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the context menu.
     */
    public com.anychart.ui.ContextMenu contextMenu() {
        return new com.anychart.ui.ContextMenu(jsBase + ".contextMenu()");
    }
    /**
     * Setter for the context menu.
     */
    public com.anychart.charts.Cartesian3d contextMenu(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".contextMenu(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the context menu.
     */
    public com.anychart.charts.Cartesian3d contextMenu(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".contextMenu(%s);", value));

        return this;
    }
    /**
     * Getter for the credits.
     */
    public com.anychart.core.ui.ChartCredits credits() {
        return new com.anychart.core.ui.ChartCredits(jsBase + ".credits()");
    }
    /**
     * Setter for the chart credits.
{docs:Quick_Start/Credits}Learn more about credits settings.{docs}
     */
    public com.anychart.charts.Cartesian3d credits(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".credits(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart credits.
{docs:Quick_Start/Credits}Learn more about credits settings.{docs}
     */
    public com.anychart.charts.Cartesian3d credits(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".credits(%s);", value));

        return this;
    }
    /**
     * Getter for the crosshair settings.
     */
    public com.anychart.core.ui.Crosshair crosshair() {
        return new com.anychart.core.ui.Crosshair(jsBase + ".crosshair()");
    }
    /**
     * Setter for the crosshair settings.
     */
    public com.anychart.charts.Cartesian3d crosshair(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".crosshair(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the crosshair settings.
     */
    public com.anychart.charts.Cartesian3d crosshair(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".crosshair(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.data.View data(List<DataEntry> data) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s)", arrayToString(data)));
    }
    /**
     * Disposes charts.
     */
    public void dispose() {
        APIlib.getInstance().addJSLine(jsBase + ".dispose();");
    }
    /**
     * Starts the rendering of the chart into the container.
     */
    public com.anychart.charts.Cartesian3d draw(Boolean async) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".draw(%s);", async));

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
    public com.anychart.charts.Cartesian3d enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for the export charts.
     */
    public com.anychart.core.utils.Exports exports() {
        return new com.anychart.core.utils.Exports(jsBase + ".exports()");
    }
    /**
     * Setter for the export charts.
     */
    public com.anychart.charts.Cartesian3d exports(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".exports(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Returns pixel bounds of the element due to parent bounds and self bounds settings.
     */
    public com.anychart.math.Rect getPixelBounds() {
        return new com.anychart.math.Rect(jsBase + ".getPixelBounds()");
    }
    /**
     * Getter for the selected points.
     */
    public void getSelectedPoints() {
        APIlib.getInstance().addJSLine(jsBase + ".getSelectedPoints();");
    }
    /**
     * Getter for a statistical value by the key.
     */
    public void getStat(com.anychart.enums.Statistics key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", (key != null) ? key.getJsBase() : null));
    }
    /**
     * Getter for a statistical value by the key.
     */
    public void getStat(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", wrapQuotes(key)));
    }
    /**
     * Returns the number of X-axes.
     */
    public void getXAxesCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getXAxesCount();");
    }
    /**
     * Returns chart X scales.
     */
    public void getXScales() {
        APIlib.getInstance().addJSLine(jsBase + ".getXScales();");
    }
    /**
     * Returns the number of Y-axes.
     */
    public void getYAxesCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getYAxesCount();");
    }
    /**
     * Returns chart Y scales.
     */
    public void getYScales() {
        APIlib.getInstance().addJSLine(jsBase + ".getYScales();");
    }
    /**
     * Converts the global coordinates to local coordinates.
<b>Note:</b> Works only after {@link anychart.core.Chart#draw} is called.
     */
    public void globalToLocal(Number xCoord, Number yCoord) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".globalToLocal(%s, %s);", xCoord, yCoord));
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
    public com.anychart.charts.Cartesian3d height(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", value));

        return this;
    }
    /**
     * Setter for element height setting.
     */
    public com.anychart.charts.Cartesian3d height(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(value)));

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
    public com.anychart.charts.Cartesian3d hovered(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hovered(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Gets marquee process running value.
     */
    public void inMarquee() {
        APIlib.getInstance().addJSLine(jsBase + ".inMarquee();");
    }
    /**
     * Getter for interactivity settings for the chart.
     */
    public com.anychart.core.utils.Interactivity interactivity() {
        return new com.anychart.core.utils.Interactivity(jsBase + ".interactivity()");
    }
    /**
     * Setter for interactivity settings for the chart.
     */
    public com.anychart.charts.Cartesian3d interactivity(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".interactivity(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for interactivity settings for the chart.
     */
    public com.anychart.charts.Cartesian3d interactivity(com.anychart.enums.HoverMode value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".interactivity(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the chart label.
     */
    public com.anychart.core.ui.Label label(String index) {
        return new com.anychart.core.ui.Label(String.format(Locale.US, jsBase + ".label(%s)", wrapQuotes(index)));
    }
    /**
     * Getter for the chart label.
     */
    public com.anychart.core.ui.Label label(Number index) {
        return new com.anychart.core.ui.Label(String.format(Locale.US, jsBase + ".label(%s)", index));
    }
    /**
     * Setter for the chart label.
     */
    public com.anychart.charts.Cartesian3d label(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s);", value));

        return this;
    }
    /**
     * Setter for the chart label.
     */
    public com.anychart.charts.Cartesian3d label(String index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s, %s);", wrapQuotes(index), value));

        return this;
    }
    /**
     * Setter for the chart label.
     */
    public com.anychart.charts.Cartesian3d label(String index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s, %s);", wrapQuotes(index), wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart label.
     */
    public com.anychart.charts.Cartesian3d label(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s, %s);", index, value));

        return this;
    }
    /**
     * Setter for the chart label.
     */
    public com.anychart.charts.Cartesian3d label(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for series data labels.
     */
    public com.anychart.core.ui.LabelsFactory labels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".labels()");
    }
    /**
     * Setter for series data labels.
     */
    public com.anychart.charts.Cartesian3d labels(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for series data labels.
     */
    public com.anychart.charts.Cartesian3d labels(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".labels(%s);", value));

        return this;
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
    public com.anychart.charts.Cartesian3d left(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", value));

        return this;
    }
    /**
     * Setter for element left bound settings.
     */
    public com.anychart.charts.Cartesian3d left(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".left(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the chart legend.
     */
    public com.anychart.core.ui.Legend legend() {
        return new com.anychart.core.ui.Legend(jsBase + ".legend()");
    }
    /**
     * Setter for chart legend settings.
     */
    public com.anychart.charts.Cartesian3d legend(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".legend(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for chart legend settings.
     */
    public com.anychart.charts.Cartesian3d legend(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".legend(%s);", value));

        return this;
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Line3d line(List<DataEntry> data) {
        return new com.anychart.core.cartesian.series.Line3d(String.format(Locale.US, jsBase + ".line(%s)", arrayToString(data)));
    }
    /**
     * Adds 2D Line series to the 3D chart.
     */
    public com.anychart.core.cartesian.series.Line line2d(com.anychart.data.View data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds 2D Line series to the 3D chart.
     */
    public com.anychart.core.cartesian.series.Line line2d(com.anychart.data.View data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds 2D Line series to the 3D chart.
     */
    public com.anychart.core.cartesian.series.Line line2d(com.anychart.data.View data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds 2D Line series to the 3D chart.
     */
    public com.anychart.core.cartesian.series.Line line2d(com.anychart.data.Set data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds 2D Line series to the 3D chart.
     */
    public com.anychart.core.cartesian.series.Line line2d(com.anychart.data.Set data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data != null) ? data.getJsBase() : null, wrapQuotes(csvSettings)));
    }
    /**
     * Adds 2D Line series to the 3D chart.
     */
    public com.anychart.core.cartesian.series.Line line2d(com.anychart.data.Set data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line2d(%s, %s)", (data != null) ? data.getJsBase() : null, (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds 2D Line series to the 3D chart.
     */
    public com.anychart.core.cartesian.series.Line line2d(String[] data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line2d(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds 2D Line series to the 3D chart.
     */
    public com.anychart.core.cartesian.series.Line line2d(String[] data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line2d(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds 2D Line series to the 3D chart.
     */
    public com.anychart.core.cartesian.series.Line line2d(String[] data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line2d(%s, %s)", arrayToStringWrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds 2D Line series to the 3D chart.
     */
    public com.anychart.core.cartesian.series.Line line2d(String data, com.anychart.enums.TextParsingMode csvSettings) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line2d(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Adds 2D Line series to the 3D chart.
     */
    public com.anychart.core.cartesian.series.Line line2d(String data, String csvSettings) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line2d(%s, %s)", wrapQuotes(data), wrapQuotes(csvSettings)));
    }
    /**
     * Adds 2D Line series to the 3D chart.
     */
    public com.anychart.core.cartesian.series.Line line2d(String data, com.anychart.data.TextParsingSettings csvSettings) {
        return new com.anychart.core.cartesian.series.Line(String.format(Locale.US, jsBase + ".line2d(%s, %s)", wrapQuotes(data), (csvSettings != null) ? csvSettings.getJsBase() : null));
    }
    /**
     * Converts the local coordinates to global coordinates.
<b>Note:</b> Works only after {@link anychart.core.Chart#draw} is called.
     */
    public void localToGlobal(Number xCoord, Number yCoord) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".localToGlobal(%s, %s);", xCoord, yCoord));
    }
    /**
     * Getter for the chart margin.<br/>
<img src='/si/8.2.1/anychart.core.Chart.prototype.margin.png' width='352' height='351'/>
     */
    public com.anychart.core.utils.Margin margin() {
        return new com.anychart.core.utils.Margin(jsBase + ".margin()");
    }
    /**
     * Setter for the chart margin in pixels using a single complex object.
     */
    public com.anychart.charts.Cartesian3d margin(Number[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(value)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using a single complex object.
     */
    public com.anychart.charts.Cartesian3d margin(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using a single complex object.
     */
    public com.anychart.charts.Cartesian3d margin(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart margin in pixels using several simple values.
     */
    public com.anychart.charts.Cartesian3d margin(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
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
    public com.anychart.charts.Cartesian3d maxHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum height.
     */
    public com.anychart.charts.Cartesian3d maxHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for maximum labels.
     */
    public com.anychart.core.ui.LabelsFactory maxLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".maxLabels()");
    }
    /**
     * Setter for maximum labels.
     */
    public com.anychart.charts.Cartesian3d maxLabels(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxLabels(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for maximum labels.
     */
    public com.anychart.charts.Cartesian3d maxLabels(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxLabels(%s);", settings));

        return this;
    }
    /**
     * Getter for the maximum point width.
     */
    public void maxPointWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".maxPointWidth();");
    }
    /**
     * Setter for the maximum point width.
     */
    public com.anychart.charts.Cartesian3d maxPointWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxPointWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum point width.
     */
    public com.anychart.charts.Cartesian3d maxPointWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxPointWidth(%s);", wrapQuotes(value)));

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
    public com.anychart.charts.Cartesian3d maxWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the maximum width.
     */
    public com.anychart.charts.Cartesian3d maxWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".maxWidth(%s);", wrapQuotes(value)));

        return this;
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
    public com.anychart.charts.Cartesian3d minHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum height.
     */
    public com.anychart.charts.Cartesian3d minHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for minimum labels.
     */
    public com.anychart.core.ui.LabelsFactory minLabels() {
        return new com.anychart.core.ui.LabelsFactory(jsBase + ".minLabels()");
    }
    /**
     * Setter for minimum labels.
     */
    public com.anychart.charts.Cartesian3d minLabels(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minLabels(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Setter for minimum labels.
     */
    public com.anychart.charts.Cartesian3d minLabels(Boolean settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minLabels(%s);", settings));

        return this;
    }
    /**
     * Getter for the minimum point length.
     */
    public void minPointLength() {
        APIlib.getInstance().addJSLine(jsBase + ".minPointLength();");
    }
    /**
     * Setter for the minimum point length.
     */
    public com.anychart.charts.Cartesian3d minPointLength(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minPointLength(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum point length.
     */
    public com.anychart.charts.Cartesian3d minPointLength(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minPointLength(%s);", wrapQuotes(value)));

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
    public com.anychart.charts.Cartesian3d minWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the minimum width.
     */
    public com.anychart.charts.Cartesian3d minWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".minWidth(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for noData settings.
     */
    public com.anychart.core.NoDataSettings noData() {
        return new com.anychart.core.NoDataSettings(jsBase + ".noData()");
    }
    /**
     * Setter for noData settings.<br/>
{docs:Working_with_Data/No_Data_Label} Learn more about "No data" feature {docs}
     */
    public com.anychart.charts.Cartesian3d noData(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".noData(%s);", wrapQuotes(value)));

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
    public com.anychart.charts.Cartesian3d normal(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".normal(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the chart padding.<br/>
<img src='/si/8.2.1/anychart.core.Chart.prototype.padding.png' width='352' height='351'/>
     */
    public com.anychart.core.utils.Padding padding() {
        return new com.anychart.core.utils.Padding(jsBase + ".padding()");
    }
    /**
     * Setter for the chart paddings in pixels using a single value.
     */
    public com.anychart.charts.Cartesian3d padding(Number[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(value)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using a single value.
     */
    public com.anychart.charts.Cartesian3d padding(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using a single value.
     */
    public com.anychart.charts.Cartesian3d padding(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the chart paddings in pixels using several numbers.
     */
    public com.anychart.charts.Cartesian3d padding(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
    }
    /**
     * Getter for the point width settings.
     */
    public void pointWidth() {
        APIlib.getInstance().addJSLine(jsBase + ".pointWidth();");
    }
    /**
     * Setter for the point width settings.
     */
    public com.anychart.charts.Cartesian3d pointWidth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".pointWidth(%s);", value));

        return this;
    }
    /**
     * Setter for the point width settings.
     */
    public com.anychart.charts.Cartesian3d pointWidth(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".pointWidth(%s);", wrapQuotes(value)));

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
     * Getter for element right bound settings.
     */
    public void right() {
        APIlib.getInstance().addJSLine(jsBase + ".right();");
    }
    /**
     * Setter for element right bound setting.
     */
    public com.anychart.charts.Cartesian3d right(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", value));

        return this;
    }
    /**
     * Setter for element right bound setting.
     */
    public com.anychart.charts.Cartesian3d right(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".right(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Saves the current chart as JPEG image.
     */
    public void saveAsJpg(Number width, Number height, Number quality, Boolean forceTransparentWhite, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsJpg(%s, %s, %s, %s, %s);", width, height, quality, forceTransparentWhite, wrapQuotes(filename)));
    }
    /**
     * Saves the current chart as JPEG image.
     */
    public void saveAsJpg(String width, Number height, Number quality, Boolean forceTransparentWhite, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsJpg(%s, %s, %s, %s, %s);", wrapQuotes(width), height, quality, forceTransparentWhite, wrapQuotes(filename)));
    }
    /**
     * Saves chart config as JSON document.
     */
    public void saveAsJson(String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsJson(%s);", wrapQuotes(filename)));
    }
    /**
     * Saves the current chart as PDF image.
     */
    public void saveAsPdf(Number paperSizeOrWidthOrOptions, Boolean landscape, Number x, Number y, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %s, %s, %s, %s);", paperSizeOrWidthOrOptions, landscape, x, y, wrapQuotes(filename)));
    }
    /**
     * Saves the current chart as PDF image.
     */
    public void saveAsPdf(String paperSizeOrWidthOrOptions, Boolean landscape, Number x, Number y, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %s, %s, %s, %s);", wrapQuotes(paperSizeOrWidthOrOptions), landscape, x, y, wrapQuotes(filename)));
    }
    /**
     * Saves the current chart as PNG image.
     */
    public void saveAsPng(Number width, Number height, Number quality, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsPng(%s, %s, %s, %s);", width, height, quality, wrapQuotes(filename)));
    }
    /**
     * Saves the current chart as PNG image.
     */
    public void saveAsPng(String width, Number height, Number quality, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsPng(%s, %s, %s, %s);", wrapQuotes(width), height, quality, wrapQuotes(filename)));
    }
    /**
     * Saves the current chart as SVG image.
     */
    public void saveAsSvg(String paperSize, Boolean landscape, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %s, %s);", wrapQuotes(paperSize), landscape, wrapQuotes(filename)));
    }
    /**
     * Saves the stage as SVG image using width and height.
     */
    public void saveAsSvg(Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %s);", width, height));
    }
    /**
     * Saves chart data as an Excel document.
     */
    public void saveAsXlsx(com.anychart.enums.ChartDataExportMode chartDataExportMode, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s);", (chartDataExportMode != null) ? chartDataExportMode.getJsBase() : null, wrapQuotes(filename)));
    }
    /**
     * Saves chart data as an Excel document.
     */
    public void saveAsXlsx(String chartDataExportMode, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsXlsx(%s, %s);", wrapQuotes(chartDataExportMode), wrapQuotes(filename)));
    }
    /**
     * Saves chart config as XML document.
     */
    public void saveAsXml(String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".saveAsXml(%s);", wrapQuotes(filename)));
    }
    /**
     * Getter for the select marquee fill.
     */
    public void selectMarqueeFill() {
        APIlib.getInstance().addJSLine(jsBase + ".selectMarqueeFill();");
    }
    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeFill(com.anychart.graphics.vector.Fill value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public com.anychart.charts.Cartesian3d selectMarqueeFill(String color, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s);", wrapQuotes(color), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeFill(com.anychart.graphics.vector.GradientKey keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeFill(com.anychart.graphics.vector.GradientKey keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeFill(com.anychart.graphics.vector.GradientKey keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeFill(String[] keys, Number angle, Boolean mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, mode, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeFill(String[] keys, Number angle, com.anychart.graphics.vector.Rect mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, (mode != null) ? mode.getJsBase() : null, opacity));

        return this;
    }
    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeFill(String[] keys, Number angle, String mode, Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s);", arrayToStringWrapQuotes(keys), angle, wrapQuotes(mode), opacity));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeFill(com.anychart.graphics.vector.GradientKey keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s, %s, %s, %s);", (keys != null) ? keys.getJsBase() : null, cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeFill(String[] keys, Number cx, Number cy, com.anychart.graphics.math.Rect mode, Number opacity, Number fx, Number fy) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeFill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(keys), cx, cy, (mode != null) ? mode.getJsBase() : null, opacity, fx, fy));

        return this;
    }
    /**
     * Getter for the select marquee stroke.
     */
    public void selectMarqueeStroke() {
        APIlib.getInstance().addJSLine(jsBase + ".selectMarqueeStroke();");
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeStroke(com.anychart.graphics.vector.Stroke color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeStroke(com.anychart.graphics.vector.ColoredFill color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", (color != null) ? color.getJsBase() : null, thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeStroke(String color, Number thickness, String dashpattern, String lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeStroke(String color, Number thickness, String dashpattern, String lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), wrapQuotes(lineJoin), (lineCap != null) ? lineCap.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeStroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, String lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, wrapQuotes(lineCap)));

        return this;
    }
    /**
     * Setter for the select marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public com.anychart.charts.Cartesian3d selectMarqueeStroke(String color, Number thickness, String dashpattern, com.anychart.graphics.vector.StrokeLineJoin lineJoin, com.anychart.graphics.vector.StrokeLineCap lineCap) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectMarqueeStroke(%s, %s, %s, %s, %s);", wrapQuotes(color), thickness, wrapQuotes(dashpattern), (lineJoin != null) ? lineJoin.getJsBase() : null, (lineCap != null) ? lineCap.getJsBase() : null));

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
    public com.anychart.charts.Cartesian3d selected(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selected(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Starts select marquee drawing.
<b>Note:</b> Works only after {@link anychart.core.Chart#draw} is called.
     */
    public com.anychart.charts.Cartesian3d startSelectMarquee(Boolean repeat) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".startSelectMarquee(%s);", repeat));

        return this;
    }
    /**
     * Getter for the chart title.
     */
    public com.anychart.core.ui.Title title() {
        return new com.anychart.core.ui.Title(jsBase + ".title()");
    }
    /**
     * Setter for the chart title.
     */
    public com.anychart.charts.Cartesian3d title(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", value));

        return this;
    }
    /**
     * Setter for the chart title.
     */
    public com.anychart.charts.Cartesian3d title(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".title(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Return chart configuration as JSON object or string.
     */
    public void toJson(Boolean stringify) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toJson(%s);", stringify));
    }
    /**
     * Returns SVG string with paper size and landscape.
     */
    public void toSvg(String paperSize, Boolean landscape) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toSvg(%s, %s);", wrapQuotes(paperSize), landscape));
    }
    /**
     * Returns SVG string with with determined the width and height.
     */
    public void toSvg(Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toSvg(%s, %s);", width, height));
    }
    /**
     * Return chart configuration as XML string or XMLNode.
     */
    public void toXml(Boolean asXmlNode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toXml(%s);", asXmlNode));
    }
    /**
     * Getter for the chart tooltip.
     */
    public com.anychart.core.ui.Tooltip tooltip() {
        return new com.anychart.core.ui.Tooltip(jsBase + ".tooltip()");
    }
    /**
     * Setter for the chart tooltip.
     */
    public com.anychart.charts.Cartesian3d tooltip(String tooltipSettings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", wrapQuotes(tooltipSettings)));

        return this;
    }
    /**
     * Setter for the chart tooltip.
     */
    public com.anychart.charts.Cartesian3d tooltip(Boolean tooltipSettings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".tooltip(%s);", tooltipSettings));

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
    public com.anychart.charts.Cartesian3d top(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", value));

        return this;
    }
    /**
     * Setter for element top bound settings.
     */
    public com.anychart.charts.Cartesian3d top(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".top(%s);", wrapQuotes(value)));

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
     * Getter for element width settings.
     */
    public void width() {
        APIlib.getInstance().addJSLine(jsBase + ".width();");
    }
    /**
     * Setter for element width setting.
     */
    public com.anychart.charts.Cartesian3d width(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", value));

        return this;
    }
    /**
     * Setter for element width setting.
     */
    public com.anychart.charts.Cartesian3d width(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the chart X-axis.
     */
    public com.anychart.core.axes.Linear xAxis(Number index) {
        return new com.anychart.core.axes.Linear(String.format(Locale.US, jsBase + ".xAxis(%s)", index));
    }
    /**
     * Setter for the chart X-axis.
     */
    public com.anychart.charts.Cartesian3d xAxis(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xAxis(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart X-axis.
     */
    public com.anychart.charts.Cartesian3d xAxis(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xAxis(%s);", value));

        return this;
    }
    /**
     * Setter for the chart X-axis by index.
     */
    public com.anychart.charts.Cartesian3d xAxis(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xAxis(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart X-axis by index.
     */
    public com.anychart.charts.Cartesian3d xAxis(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xAxis(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the chart grid by X-scale.
     */
    public com.anychart.core.grids.Linear xGrid(Number index) {
        return new com.anychart.core.grids.Linear(String.format(Locale.US, jsBase + ".xGrid(%s)", index));
    }
    /**
     * Setter for the chart grid by X-scale.
     */
    public com.anychart.charts.Cartesian3d xGrid(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xGrid(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart grid by X-scale.
     */
    public com.anychart.charts.Cartesian3d xGrid(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xGrid(%s);", value));

        return this;
    }
    /**
     * Setter for chart grid by index.
     */
    public com.anychart.charts.Cartesian3d xGrid(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xGrid(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for chart grid by index.
     */
    public com.anychart.charts.Cartesian3d xGrid(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xGrid(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the chart minor grid by X-scale.
     */
    public com.anychart.core.grids.Linear xMinorGrid(Number index) {
        return new com.anychart.core.grids.Linear(String.format(Locale.US, jsBase + ".xMinorGrid(%s)", index));
    }
    /**
     * Setter for the chart minor grid by X-scale.
     */
    public com.anychart.charts.Cartesian3d xMinorGrid(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorGrid(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart minor grid by X-scale.
     */
    public com.anychart.charts.Cartesian3d xMinorGrid(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorGrid(%s);", value));

        return this;
    }
    /**
     * Setter for the chart minor grid by index.
     */
    public com.anychart.charts.Cartesian3d xMinorGrid(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorGrid(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart minor grid by index.
     */
    public com.anychart.charts.Cartesian3d xMinorGrid(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xMinorGrid(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the chart X-scale.
     */
    public com.anychart.scales.Ordinal xScale() {
        return new com.anychart.scales.Ordinal(jsBase + ".xScale()");
    }
    /**
     * Setter for the chart X-scale.
     */
    public com.anychart.charts.Cartesian3d xScale(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xScale(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart X-scale.
     */
    public com.anychart.charts.Cartesian3d xScale(com.anychart.enums.ScaleTypes value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xScale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart X-scale.
     */
    public com.anychart.charts.Cartesian3d xScale(com.anychart.scales.Base value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".xScale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the chart Y-axis.
     */
    public com.anychart.core.axes.Linear yAxis(Number index) {
        return new com.anychart.core.axes.Linear(String.format(Locale.US, jsBase + ".yAxis(%s)", index));
    }
    /**
     * Setter for the chart Y-axis.
     */
    public com.anychart.charts.Cartesian3d yAxis(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yAxis(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart Y-axis.
     */
    public com.anychart.charts.Cartesian3d yAxis(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yAxis(%s);", value));

        return this;
    }
    /**
     * Setter for the chart Y-axis by index.
     */
    public com.anychart.charts.Cartesian3d yAxis(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yAxis(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart Y-axis by index.
     */
    public com.anychart.charts.Cartesian3d yAxis(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yAxis(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the chart grid by Y-scale.
     */
    public com.anychart.core.grids.Linear yGrid(Number index) {
        return new com.anychart.core.grids.Linear(String.format(Locale.US, jsBase + ".yGrid(%s)", index));
    }
    /**
     * Setter for the chart grid by Y-scale.
     */
    public com.anychart.charts.Cartesian3d yGrid(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yGrid(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart grid by Y-scale.
     */
    public com.anychart.charts.Cartesian3d yGrid(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yGrid(%s);", value));

        return this;
    }
    /**
     * Setter for chart grid by index.
     */
    public com.anychart.charts.Cartesian3d yGrid(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yGrid(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for chart grid by index.
     */
    public com.anychart.charts.Cartesian3d yGrid(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yGrid(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the chart minor grid by Y-scale.
     */
    public com.anychart.core.grids.Linear yMinorGrid(Number index) {
        return new com.anychart.core.grids.Linear(String.format(Locale.US, jsBase + ".yMinorGrid(%s)", index));
    }
    /**
     * Setter for the chart minor grid by Y-scale.
     */
    public com.anychart.charts.Cartesian3d yMinorGrid(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorGrid(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart minor grid by Y-scale.
     */
    public com.anychart.charts.Cartesian3d yMinorGrid(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorGrid(%s);", value));

        return this;
    }
    /**
     * Setter for the chart minor grid by index.
     */
    public com.anychart.charts.Cartesian3d yMinorGrid(Number index, String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorGrid(%s, %s);", index, wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart minor grid by index.
     */
    public com.anychart.charts.Cartesian3d yMinorGrid(Number index, Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yMinorGrid(%s, %s);", index, value));

        return this;
    }
    /**
     * Getter for the chart Y-scale.
     */
    public com.anychart.scales.Linear yScale() {
        return new com.anychart.scales.Linear(jsBase + ".yScale()");
    }
    /**
     * Setter for the chart Y-scale.
     */
    public com.anychart.charts.Cartesian3d yScale(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the chart Y-scale.
     */
    public com.anychart.charts.Cartesian3d yScale(com.anychart.enums.ScaleTypes value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the chart Y-scale.
     */
    public com.anychart.charts.Cartesian3d yScale(com.anychart.scales.Base value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".yScale(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the current Z-axis angle.
     */
    public void zAngle() {
        APIlib.getInstance().addJSLine(jsBase + ".zAngle();");
    }
    /**
     * Setter for the Z-axis angle.
     */
    public com.anychart.charts.Cartesian3d zAngle(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zAngle(%s);", value));

        return this;
    }
    /**
     * Getter for the current depth of the point by Z-axis.
     */
    public void zAspect() {
        APIlib.getInstance().addJSLine(jsBase + ".zAspect();");
    }
    /**
     * Setter for the depth of the point by Z-axis.
     */
    public com.anychart.charts.Cartesian3d zAspect(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zAspect(%s);", value));

        return this;
    }
    /**
     * Setter for the depth of the point by Z-axis.
     */
    public com.anychart.charts.Cartesian3d zAspect(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zAspect(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * 
     */
    public void zDepth() {
        APIlib.getInstance().addJSLine(jsBase + ".zDepth();");
    }
    /**
     * 
     */
    public com.anychart.charts.Cartesian3d zDepth(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zDepth(%s);", value));

        return this;
    }
    /**
     * Getter for the current distribution of the series by Z-axis.
     */
    public void zDistribution() {
        APIlib.getInstance().addJSLine(jsBase + ".zDistribution();");
    }
    /**
     * Setter for distribution of the series by Z-axis.
     */
    public com.anychart.charts.Cartesian3d zDistribution(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zDistribution(%s);", value));

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
    public com.anychart.charts.Cartesian3d zIndex(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zIndex(%s);", value));

        return this;
    }
    /**
     * Getter for the current Z-axis padding.
     */
    public void zPadding() {
        APIlib.getInstance().addJSLine(jsBase + ".zPadding();");
    }
    /**
     * Setter for the Z-axis padding.
     */
    public com.anychart.charts.Cartesian3d zPadding(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".zPadding(%s);", value));

        return this;
    }
    /**
     * Getter for the accessibility setting.
     */
    public com.anychart.core.utils.ChartA11y a11y() {
        return new com.anychart.core.utils.ChartA11y(jsBase + ".a11y()");
    }
    /**
     * Setter for the accessibility setting.
     */
    public com.anychart.charts.Cartesian3d a11y(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".a11y(%s);", value));

        return this;
    }
    /**
     * Setter for the accessibility setting.
     */
    public com.anychart.charts.Cartesian3d a11y(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".a11y(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Returns JPG as base64 string.
     */
    public void getJpgBase64String(String onSuccessOrOptions, String onError, Number width, Number height, Number quality, Boolean forceTransparentWhite) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getJpgBase64String(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), width, height, quality, forceTransparentWhite));
    }
    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String onSuccessOrOptions, String onError, Number paperSizeOrWidth, Number landscapeOrWidth, Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), paperSizeOrWidth, landscapeOrWidth, x, y));
    }
    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String onSuccessOrOptions, String onError, Number paperSizeOrWidth, Boolean landscapeOrWidth, Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), paperSizeOrWidth, landscapeOrWidth, x, y));
    }
    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String onSuccessOrOptions, String onError, String paperSizeOrWidth, Number landscapeOrWidth, Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), wrapQuotes(paperSizeOrWidth), landscapeOrWidth, x, y));
    }
    /**
     * Returns PDF as base64 string.
     */
    public void getPdfBase64String(String onSuccessOrOptions, String onError, String paperSizeOrWidth, Boolean landscapeOrWidth, Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getPdfBase64String(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), wrapQuotes(paperSizeOrWidth), landscapeOrWidth, x, y));
    }
    /**
     * Returns PNG as base64 string.
     */
    public void getPngBase64String(String onSuccessOrOptions, String onError, Number width, Number height, Number quality) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getPngBase64String(%s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), width, height, quality));
    }
    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String onSuccessOrOptions, String onError, String paperSizeOrWidth, Boolean landscapeOrHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), wrapQuotes(paperSizeOrWidth), landscapeOrHeight));
    }
    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String onSuccessOrOptions, String onError, String paperSizeOrWidth, String landscapeOrHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), wrapQuotes(paperSizeOrWidth), wrapQuotes(landscapeOrHeight)));
    }
    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String onSuccessOrOptions, String onError, Number paperSizeOrWidth, Boolean landscapeOrHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), paperSizeOrWidth, landscapeOrHeight));
    }
    /**
     * Returns SVG as base64 string.
     */
    public void getSvgBase64String(String onSuccessOrOptions, String onError, Number paperSizeOrWidth, String landscapeOrHeight) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getSvgBase64String(%s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), paperSizeOrWidth, wrapQuotes(landscapeOrHeight)));
    }
    /**
     * Shares a chart as a JPG file and returns a link to the shared image.
     */
    public void shareAsJpg(String onSuccessOrOptions, String onError, Boolean asBase64, Number width, Number height, Number quality, Boolean forceTransparentWhite, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsJpg(%s, %s, %s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, width, height, quality, forceTransparentWhite, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String onSuccessOrOptions, String onError, Boolean asBase64, Number paperSizeOrWidth, Number landscapeOrWidth, Number x, Number y, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %s, %s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, paperSizeOrWidth, landscapeOrWidth, x, y, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String onSuccessOrOptions, String onError, Boolean asBase64, Number paperSizeOrWidth, Boolean landscapeOrWidth, Number x, Number y, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %s, %s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, paperSizeOrWidth, landscapeOrWidth, x, y, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String onSuccessOrOptions, String onError, Boolean asBase64, String paperSizeOrWidth, Number landscapeOrWidth, Number x, Number y, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %s, %s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, wrapQuotes(paperSizeOrWidth), landscapeOrWidth, x, y, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a PDF file and returns a link to the shared image.
     */
    public void shareAsPdf(String onSuccessOrOptions, String onError, Boolean asBase64, String paperSizeOrWidth, Boolean landscapeOrWidth, Number x, Number y, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsPdf(%s, %s, %s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, wrapQuotes(paperSizeOrWidth), landscapeOrWidth, x, y, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a PNG file and returns a link to the shared image.
     */
    public void shareAsPng(String onSuccessOrOptions, String onError, Boolean asBase64, Number width, Number height, Number quality, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsPng(%s, %s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, width, height, quality, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String onSuccessOrOptions, String onError, Boolean asBase64, String paperSizeOrWidth, Boolean landscapeOrHeight, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, wrapQuotes(paperSizeOrWidth), landscapeOrHeight, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String onSuccessOrOptions, String onError, Boolean asBase64, String paperSizeOrWidth, String landscapeOrHeight, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, wrapQuotes(paperSizeOrWidth), wrapQuotes(landscapeOrHeight), wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String onSuccessOrOptions, String onError, Boolean asBase64, Number paperSizeOrWidth, Boolean landscapeOrHeight, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, paperSizeOrWidth, landscapeOrHeight, wrapQuotes(filename)));
    }
    /**
     * Shares a chart as a SVG file and returns a link to the shared image.
     */
    public void shareAsSvg(String onSuccessOrOptions, String onError, Boolean asBase64, Number paperSizeOrWidth, String landscapeOrHeight, String filename) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareAsSvg(%s, %s, %s, %s, %s, %s);", wrapQuotes(onSuccessOrOptions), wrapQuotes(onError), asBase64, paperSizeOrWidth, wrapQuotes(landscapeOrHeight), wrapQuotes(filename)));
    }
    /**
     * Opens Facebook sharing dialog.
     */
    public void shareWithFacebook(String captionOrOptions, String link, String name, String description) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareWithFacebook(%s, %s, %s, %s);", wrapQuotes(captionOrOptions), wrapQuotes(link), wrapQuotes(name), wrapQuotes(description)));
    }
    /**
     * Opens LinkedIn sharing dialog.
     */
    public void shareWithLinkedIn(String captionOrOptions, String description) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareWithLinkedIn(%s, %s);", wrapQuotes(captionOrOptions), wrapQuotes(description)));
    }
    /**
     * Opens Pinterest sharing dialog.
     */
    public void shareWithPinterest(String linkOrOptions, String description) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".shareWithPinterest(%s, %s);", wrapQuotes(linkOrOptions), wrapQuotes(description)));
    }
    /**
     * Opens Twitter sharing dialog.
     */
    public void shareWithTwitter() {
        APIlib.getInstance().addJSLine(jsBase + ".shareWithTwitter();");
    }
    /**
     * Creates and returns the chart represented as an invisible HTML table.
     */
    public void toA11yTable(String title, Boolean asString) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toA11yTable(%s, %s);", wrapQuotes(title), asString));
    }
    /**
     * Creates and returns a chart as HTML table.
     */
    public void toHtmlTable(String title, Boolean asString) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toHtmlTable(%s, %s);", wrapQuotes(title), asString));
    }
    /**
     * 
     */
    public com.anychart.data.View data(com.anychart.data.View data) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.data.View data(List<DataEntry> data, com.anychart.enums.TreeFillingMethod fillMethod) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s, %s)", arrayToString(data), (fillMethod != null) ? fillMethod.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.data.View data(List<DataEntry> data, String fillMethod) {
        return new com.anychart.data.View(String.format(Locale.US, jsBase + ".data(%s, %s)", arrayToString(data), wrapQuotes(fillMethod)));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Area3d area(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.Area3d(String.format(Locale.US, jsBase + ".area(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Bar3d bar(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.Bar3d(String.format(Locale.US, jsBase + ".bar(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Column3d column(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.Column3d(String.format(Locale.US, jsBase + ".column(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public com.anychart.core.cartesian.series.Line3d line(com.anychart.data.View data) {
        return new com.anychart.core.cartesian.series.Line3d(String.format(Locale.US, jsBase + ".line(%s)", (data != null) ? data.getJsBase() : null));
    }
    /**
     * 
     */
    public Object xScale(Class scaleClass) {
        Object instance = null;
        try {
            instance = scaleClass.getDeclaredConstructor(String.class).newInstance(jsBase + ".xScale()");
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