package com.anychart.anychart.chart.common.dataentry;

import android.text.TextUtils;

import com.anychart.anychart.chart.common.enums.Anchor;
import com.anychart.anychart.chart.common.JsObject;
import com.anychart.anychart.chart.common.enums.MarkerType;
import com.anychart.anychart.chart.common.fill.Fill;
import com.anychart.anychart.chart.common.stroke.Stroke;

import java.util.Locale;

/**
 * Created by arseny on 8/8/17.
 */

public class Markers extends JsObject {

    private MarkerType markerType;
    private Fill fill;
    private Stroke stroke;
    private boolean enabled = false;
    private Anchor anchor;
    private double offsetX = -1d;
    private double offsetY = -1d;
    private String position;
    private double angle = -1d;
    private double markerSize = -1d;
    private double zIndex = -1d;

    public void setMarkerType(MarkerType markerType) {
        this.markerType = markerType;
    }

    public void setFill(Fill fill) {
        this.fill = fill;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setMarkerSize(double markerSize) {
        this.markerSize = markerSize;
    }

    public void setzIndex(double zIndex) {
        this.zIndex = zIndex;
    }

    @Override
    public String generateJs() {
        js.append("{");

        if (markerType != null)
            js.append(String.format(Locale.US, "type: \"%s\",", markerType.get()));
        if (fill != null)
            js.append(String.format(Locale.US, "fill: %s,", fill.generateJs()));
        if (stroke != null)
            js.append(String.format(Locale.US, "stroke: %s,", stroke.generateJs()));
        js.append(String.format(Locale.US, "enabled: %b,", enabled));
        if (anchor != null)
            js.append(String.format(Locale.US, "anchor: \"%s\",", anchor.get()));
        if (offsetX != -1d)
            js.append(String.format(Locale.US, "offsetX: \"%f\",", offsetX));
        if (offsetY != -1d)
            js.append(String.format(Locale.US, "offsetY: \"%f\",", offsetY));
        if (!TextUtils.isEmpty(position))
            js.append(String.format(Locale.US, "position: %s,", position));
        if (angle != -1d)
            js.append(String.format(Locale.US, "rotation: %f,", angle));
        if (markerSize != -1d)
            js.append(String.format(Locale.US, "size: %f,", markerSize));
        if (zIndex != -1d)
            js.append(String.format(Locale.US, "zIndex: %f,", zIndex));

        js.append("}");

        return super.generateJs();
    }
}
