package com.anychart.anychart;

import com.anychart.anychart.chart.common.Fill;
import com.anychart.anychart.chart.common.Stroke;

import java.util.Locale;

/**
 * Created by arseny on 8/7/17.
 */

public class DataEntry extends JsObject {

    private Markers markers;
    private Labels labels;

    private String x;
    private double value;

    private Fill fill;
    private Stroke stroke;

    public DataEntry(String x, Double value) {
        this.x = x;
        this.value = value;
    }

    public void setFill(Fill fill) {
        this.fill = fill;

        if (onChangeListener != null)
            onChangeListener.onChange(null);
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;

        if (onChangeListener != null)
            onChangeListener.onChange(null);
    }

    public Markers getMarkers() {
        if (markers == null) {
            markers = new Markers();
            markers.setOnChangeListener(new OnChange() {
                @Override
                public void onChange(String jsChange) {
                    if (isRendered && onChangeListener != null) {
                        onChangeListener.onChange(null);
                        js.setLength(0);
                    }
                }
            });
        }

        return markers;
    }

    public Labels getLabels() {
        if (labels == null) {
            labels = new Labels();
            labels.setOnChangeListener(new OnChange() {
                @Override
                public void onChange(String jsChange) {
                    if (isRendered && onChangeListener != null) {
                        onChangeListener.onChange(null);
                        js.setLength(0);
                    }
                }
            });
        }

        return labels;
    }

    void setOnChangeListener(Labels.OnChange onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    @Override
    protected String generateJs() {
        js.append(String.format(Locale.US, "{" +
                        "x: \"%s\"," +
                        "value: %f",
                x, value));
        if (fill != null) {
            js.append(String.format(Locale.US, "," +
                    "fill: %s", fill.generateJs()));
        }
        if (stroke != null) {
            js.append(String.format(Locale.US, "," +
                    "stroke: %s", stroke.generateJs()));
        }
        if (markers != null) {
            js.append(String.format(Locale.US, "," +
                    "marker: %s", markers.generateJs()));
        }
        if (labels != null) {
            js.append(String.format(Locale.US, "," +
                    "label: %s", labels.generateJs()));
        }
        js.append("}");

        return super.generateJs();
    }
}
