package com.anychart.core.annotations;

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
 * Chart controller class.
 */
public class ChartController extends Base {

    protected ChartController() {

    }

    public static ChartController instantiate() {
        return new ChartController("new anychart.core.annotations.chartController()");
    }

    

    public ChartController(String jsChart) {
        jsBase = "chartController" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Cancels current annotation drawing.
     */
    public void cancelDrawing() {
        APIlib.getInstance().addJSLine(jsBase + ".cancelDrawing();");
    }
    /**
     * Returns currently selected annotation.
     */
    public com.anychart.core.annotations.Base getSelectedAnnotation() {
        return new com.anychart.core.annotations.Base(jsBase + ".getSelectedAnnotation()");
    }
    /**
     * Removes all annotations from the chart.
     */
    public com.anychart.core.annotations.ChartController removeAllAnnotations() {
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
     * Removes one of annotations from plot by its instance.
     */
    public com.anychart.core.annotations.ChartController removeAnnotation(com.anychart.core.annotations.Base annotation) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAnnotation(%s);", (annotation != null) ? annotation.getJsBase() : null));

        return this;
    }
    /**
     * Selects annotation.
     */
    public com.anychart.core.annotations.ChartController select(com.anychart.core.annotations.Base annotation) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".select(%s);", (annotation != null) ? annotation.getJsBase() : null));

        return this;
    }
    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Stock#draw} is called.
     */
    public com.anychart.core.annotations.Base startDrawing(com.anychart.enums.AnnotationTypes annotationTypeOrConfig) {
        return new com.anychart.core.annotations.Base(String.format(Locale.US, jsBase + ".startDrawing(%s)", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.getJsBase() : null));
    }
    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Stock#draw} is called.
     */
    public com.anychart.core.annotations.Base startDrawing(String annotationTypeOrConfig) {
        return new com.anychart.core.annotations.Base(String.format(Locale.US, jsBase + ".startDrawing(%s)", wrapQuotes(annotationTypeOrConfig)));
    }
    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Stock#draw} is called.
     */
    public com.anychart.core.annotations.Base startDrawing(com.anychart.core.annotations.AnnotationJSONFormat annotationTypeOrConfig) {
        return new com.anychart.core.annotations.Base(String.format(Locale.US, jsBase + ".startDrawing(%s)", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.getJsBase() : null));
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
    public com.anychart.core.annotations.ChartController unselect() {
        APIlib.getInstance().addJSLine(jsBase + ".unselect();");

        return this;
    }

}