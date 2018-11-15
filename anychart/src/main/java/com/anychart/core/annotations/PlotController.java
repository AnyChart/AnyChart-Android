package com.anychart.core.annotations;

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
 * Plot controller class.
 */
public class PlotController extends VisualBase {

    protected PlotController() {

    }

    public static PlotController instantiate() {
        return new PlotController("new anychart.core.annotations.plotController()");
    }

    

    public PlotController(String jsChart) {
        jsBase = "plotController" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Adds annotation on the plot.
     */
    public com.anychart.core.annotations.Base add(com.anychart.enums.AnnotationTypes annotationTypeOrConfig) {
        return new com.anychart.core.annotations.Base(String.format(Locale.US, jsBase + ".add(%s)", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.getJsBase() : null));
    }
    /**
     * Adds annotation on the plot.
     */
    public com.anychart.core.annotations.Base add(String annotationTypeOrConfig) {
        return new com.anychart.core.annotations.Base(String.format(Locale.US, jsBase + ".add(%s)", wrapQuotes(annotationTypeOrConfig)));
    }
    /**
     * Adds annotation on the plot.
     */
    public com.anychart.core.annotations.Base add(com.anychart.core.annotations.AnnotationJSONFormat annotationTypeOrConfig) {
        return new com.anychart.core.annotations.Base(String.format(Locale.US, jsBase + ".add(%s)", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.getJsBase() : null));
    }
    /**
     * Creates and returns an Andrews Pitchfork annotation.
     */
    public com.anychart.core.annotations.AndrewsPitchfork andrewsPitchfork(String settings) {
        return new com.anychart.core.annotations.AndrewsPitchfork(String.format(Locale.US, jsBase + ".andrewsPitchfork(%s)", wrapQuotes(settings)));
    }
    /**
     * Cancels current annotation drawing.
     */
    public void cancelDrawing() {
        APIlib.getInstance().addJSLine(jsBase + ".cancelDrawing();");
    }
    /**
     * Creates and returns an Ellipse annotation.
     */
    public com.anychart.core.annotations.Ellipse ellipse(String settings) {
        return new com.anychart.core.annotations.Ellipse(String.format(Locale.US, jsBase + ".ellipse(%s)", wrapQuotes(settings)));
    }
    /**
     * Getter for the enabled state.
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the enabled state.
     */
    public com.anychart.core.annotations.PlotController enabled(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", enabled));

        return this;
    }
    /**
     * Creates and returns a Fibonacci Arc annotation.
     */
    public com.anychart.core.annotations.FibonacciArc fibonacciArc(String settings) {
        return new com.anychart.core.annotations.FibonacciArc(String.format(Locale.US, jsBase + ".fibonacciArc(%s)", wrapQuotes(settings)));
    }
    /**
     * Creates and returns a Fibonacci Fan annotation.
     */
    public com.anychart.core.annotations.FibonacciFan fibonacciFan(String settings) {
        return new com.anychart.core.annotations.FibonacciFan(String.format(Locale.US, jsBase + ".fibonacciFan(%s)", wrapQuotes(settings)));
    }
    /**
     * Creates and returns a Fibonacci Retracement annotation.
     */
    public com.anychart.core.annotations.FibonacciRetracement fibonacciRetracement(String settings) {
        return new com.anychart.core.annotations.FibonacciRetracement(String.format(Locale.US, jsBase + ".fibonacciRetracement(%s)", wrapQuotes(settings)));
    }
    /**
     * Creates and returns a Fibonacci Timezones annotation.
     */
    public com.anychart.core.annotations.FibonacciTimezones fibonacciTimezones(String settings) {
        return new com.anychart.core.annotations.FibonacciTimezones(String.format(Locale.US, jsBase + ".fibonacciTimezones(%s)", wrapQuotes(settings)));
    }
    /**
     * Creates annotations list by JSON config.
     */
    public com.anychart.core.annotations.PlotController fromJson(String config) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fromJson(%s);", wrapQuotes(config)));

        return this;
    }
    /**
     * Creates annotations list by XML config.
     */
    public com.anychart.core.annotations.PlotController fromXml(String config) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fromXml(%s);", wrapQuotes(config)));

        return this;
    }
    /**
     * Returns annotation by index.
     */
    public com.anychart.core.annotations.Base getAnnotationAt(Number index) {
        return new com.anychart.core.annotations.Base(String.format(Locale.US, jsBase + ".getAnnotationAt(%s)", index));
    }
    /**
     * Returns annotations count.
     */
    public void getAnnotationsCount() {
        APIlib.getInstance().addJSLine(jsBase + ".getAnnotationsCount();");
    }
    /**
     * Returns currently selected annotation.
     */
    public com.anychart.core.annotations.Base getSelectedAnnotation() {
        return new com.anychart.core.annotations.Base(jsBase + ".getSelectedAnnotation()");
    }
    /**
     * Creates and returns a Horizontal Line annotation.
     */
    public com.anychart.core.annotations.HorizontalLine horizontalLine(String settings) {
        return new com.anychart.core.annotations.HorizontalLine(String.format(Locale.US, jsBase + ".horizontalLine(%s)", wrapQuotes(settings)));
    }
    /**
     * Creates and returns an Infinite Line annotation.
     */
    public com.anychart.core.annotations.InfiniteLine infiniteLine(String settings) {
        return new com.anychart.core.annotations.InfiniteLine(String.format(Locale.US, jsBase + ".infiniteLine(%s)", wrapQuotes(settings)));
    }
    /**
     * Creates and returns a Label annotation.
     */
    public com.anychart.core.annotations.Label label(String settings) {
        return new com.anychart.core.annotations.Label(String.format(Locale.US, jsBase + ".label(%s)", wrapQuotes(settings)));
    }
    /**
     * Creates and returns a Line annotation.
     */
    public com.anychart.core.annotations.Line line(String settings) {
        return new com.anychart.core.annotations.Line(String.format(Locale.US, jsBase + ".line(%s)", wrapQuotes(settings)));
    }
    /**
     * Creates and returns a Marker annotation.
     */
    public com.anychart.core.annotations.Marker marker(String settings) {
        return new com.anychart.core.annotations.Marker(String.format(Locale.US, jsBase + ".marker(%s)", wrapQuotes(settings)));
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
     * Creates and returns a Ray annotation.
     */
    public com.anychart.core.annotations.Ray ray(String settings) {
        return new com.anychart.core.annotations.Ray(String.format(Locale.US, jsBase + ".ray(%s)", wrapQuotes(settings)));
    }
    /**
     * Creates and returns a Rectangle annotation.
     */
    public com.anychart.core.annotations.Rectangle rectangle(String settings) {
        return new com.anychart.core.annotations.Rectangle(String.format(Locale.US, jsBase + ".rectangle(%s)", wrapQuotes(settings)));
    }
    /**
     * Removes all annotations from a plot.
     */
    public com.anychart.core.annotations.PlotController removeAllAnnotations() {
        APIlib.getInstance().addJSLine(jsBase + ".removeAllAnnotations();");

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Removes an annotation from a plot by its instance.
     */
    public com.anychart.core.annotations.PlotController removeAnnotation(com.anychart.core.annotations.Base annotation) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAnnotation(%s);", (annotation != null) ? annotation.getJsBase() : null));

        return this;
    }
    /**
     * Removes an annotation from a plot by its index.
     */
    public com.anychart.core.annotations.PlotController removeAnnotationAt(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAnnotationAt(%s);", index));

        return this;
    }
    /**
     * Selects annotation.
     */
    public com.anychart.core.annotations.PlotController select(com.anychart.core.annotations.Base annotation) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s);", (annotation != null) ? annotation.getJsBase() : null));

        return this;
    }
    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} and {@link anychart.charts.Stock#draw} is called.
     */
    public com.anychart.core.annotations.Base startDrawing(com.anychart.enums.AnnotationTypes annotationTypeOrConfig) {
        return new com.anychart.core.annotations.Base(String.format(Locale.US, jsBase + ".startDrawing(%s)", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.getJsBase() : null));
    }
    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} and {@link anychart.charts.Stock#draw} is called.
     */
    public com.anychart.core.annotations.Base startDrawing(String annotationTypeOrConfig) {
        return new com.anychart.core.annotations.Base(String.format(Locale.US, jsBase + ".startDrawing(%s)", wrapQuotes(annotationTypeOrConfig)));
    }
    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} and {@link anychart.charts.Stock#draw} is called.
     */
    public com.anychart.core.annotations.Base startDrawing(com.anychart.core.annotations.AnnotationJSONFormat annotationTypeOrConfig) {
        return new com.anychart.core.annotations.Base(String.format(Locale.US, jsBase + ".startDrawing(%s)", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.getJsBase() : null));
    }
    /**
     * Return plot annotations configuration as JSON object or string.
     */
    public void toJson(Boolean stringify) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toJson(%s);", stringify));
    }
    /**
     * Return plot annotations configuration as XML string or XMLNode.
     */
    public void toXml(Boolean asXmlNode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".toXml(%s);", asXmlNode));
    }
    /**
     * Creates and returns a Trend Channel annotation.
     */
    public com.anychart.core.annotations.TrendChannel trendChannel(String settings) {
        return new com.anychart.core.annotations.TrendChannel(String.format(Locale.US, jsBase + ".trendChannel(%s)", wrapQuotes(settings)));
    }
    /**
     * Creates and returns a Triangle annotation.
     */
    public com.anychart.core.annotations.Triangle triangle(String settings) {
        return new com.anychart.core.annotations.Triangle(String.format(Locale.US, jsBase + ".triangle(%s)", wrapQuotes(settings)));
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
     * Unselects annotations.
     */
    public com.anychart.core.annotations.PlotController unselect() {
        APIlib.getInstance().addJSLine(jsBase + ".unselect();");

        return this;
    }
    /**
     * Creates and returns a Vertical Line annotation.
     */
    public com.anychart.core.annotations.VerticalLine verticalLine(String settings) {
        return new com.anychart.core.annotations.VerticalLine(String.format(Locale.US, jsBase + ".verticalLine(%s)", wrapQuotes(settings)));
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
    public com.anychart.core.annotations.PlotController zIndex(Number zIndex) {
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
    public com.anychart.core.annotations.PlotController container(com.anychart.graphics.vector.Layer element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.annotations.PlotController container(com.anychart.graphics.vector.Stage element) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".container(%s);", (element != null) ? element.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the container.
     */
    public com.anychart.core.annotations.PlotController container(String element) {
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
    public com.anychart.core.annotations.PlotController parentBounds(com.anychart.math.Rect bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", (bounds != null) ? bounds.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.annotations.PlotController parentBounds(String bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", wrapQuotes(bounds)));

        return this;
    }
    /**
     * Setter for the parent bounds using single value.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.annotations.PlotController parentBounds(Number bounds) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s);", bounds));

        return this;
    }
    /**
     * Setter for the parent bounds using several values.<br>
Bounds that would be used in case of percent size calculations. Expects pixel values only.
     */
    public com.anychart.core.annotations.PlotController parentBounds(Number left, Number top, Number width, Number height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".parentBounds(%s, %s, %s, %s);", left, top, width, height));

        return this;
    }

}