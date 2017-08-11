package com.anychart.anychart.chart.common.dataentry;

import com.anychart.anychart.JsObject;
import com.anychart.anychart.chart.common.fill.Fill;
import com.anychart.anychart.chart.common.stroke.Stroke;

import java.util.Locale;

/**
 * Created by arseny on 8/7/17.
 */

public class DataEntry extends JsObject {

    private Markers markers;
    private Labels labels;

    public String x;
    public double value;

    private Fill fill;
    private Stroke stroke;

    public DataEntry(String x, Double value) {
        this.x = x;
        this.value = value;
    }

    public void setFill(Fill fill) {
        this.fill = fill;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public Markers getMarkers() {
        if (markers == null)
            markers = new Markers();

        return markers;
    }

    public Labels getLabels() {
        if (labels == null)
            labels = new Labels();

        return labels;
    }

    @Override
    public String generateJs() {
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
