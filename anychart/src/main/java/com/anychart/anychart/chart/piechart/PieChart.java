package com.anychart.anychart.chart.piechart;

import android.text.TextUtils;
import android.util.Log;

import com.anychart.anychart.MyApplication;
import com.anychart.anychart.chart.common.Chart;
import com.anychart.anychart.chart.common.dataentry.DataEntry;
import com.anychart.anychart.chart.common.JavaScriptInterface;
import com.anychart.anychart.chart.common.enums.OverlapMode;
import com.anychart.anychart.chart.common.dataentry.Labels;

import java.util.List;
import java.util.Locale;

/**
 * Created by NeverKnowsBest on 08/04/2017.
 */

public class PieChart extends Chart {

    private List<DataEntry> data;
    private Labels labels;
    private boolean enableHoverLabels;
    private String title;
    private boolean enabledLegend = true;
    private double x = -1d;
    private double y = -1d;
    private double width = -1d;
    private double height = -1d;
    private List<String> colors;
    private boolean enabledCredits;
    private boolean enabledTooltip;
    private String backgroundColor;
    private double backgroundOpacity = -1d;
    private double marginTop = -1d;
    private double marginLeft = -1d;
    private double marginRight = -1d;
    private double marginBottom = -1d;
    private double innerRadius = -1d;
    private double radius = -1d;
    private double startAngle = -1d;
    private boolean enabledAnimation;
    private OverlapMode overlapMode;
    private double paddingTop = -1d;
    private double paddingLeft = -1d;
    private double paddingRight = -1d;
    private double paddingBottom = -1d;
    private double explode = -1d;
    private int slice = -1;
    private boolean explodeSlices;

    private JavaScriptInterface.OnClick listener;

    public PieChart() {

    }

    public PieChart(List<DataEntry> data) {
        setData(data);
    }

    public void setData(List<DataEntry> data) {
        this.data = data;
    }

    public Labels getLabels() {
        if (labels == null)
            labels = new Labels();

        return labels;
    }

    public void setEnabledHoverLabels(boolean value) {
        this.enableHoverLabels = value;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEnabledLegend(boolean value) {
        this.enabledLegend = value;
    }

    public void setBounds(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setPalette(List<String> colors) {
        this.colors = colors;
    }

    public void setEnabledCredits(boolean value) {
        this.enabledCredits = value;
    }

    public void setEnabledTooltip(boolean value) {
        this.enabledTooltip = value;
    }

    public void setBackgroundColor(String color) {
        this.backgroundColor = color;
    }

    public void setBackgroundColor(String color, double alpha) {
        this.backgroundColor = color;
        this.backgroundOpacity = alpha;
    }

    public void setMargin(double top, double right, double bottom, double left) {
        this.marginTop = top;
        this.marginRight = right;
        this.marginBottom = bottom;
        this.marginLeft = left;
    }

    public void setInnerRadius(double percent) {
        this.innerRadius = percent;
    }

    public void setRadius(double percent) {
        this.radius = percent;
    }

    public void setStartAngle(double startAngle) {
        this.startAngle = startAngle;
    }

    public void setEnabledAnimation(boolean value) {
        this.enabledAnimation = value;
    }

    public void setOverlapMode(OverlapMode overlapMode) {
        this.overlapMode = overlapMode;
    }

    public void setPadding(double top, double right, double bottom, double left) {
        this.paddingTop = top;
        this.paddingRight = right;
        this.paddingBottom = bottom;
        this.paddingLeft = left;
    }

    public void setExplode(double explode) {
        this.explode = explode;
    }

    public void setExplodeSlice(int slice) {
        this.slice = slice;
    }

    public void setExplodeSlices(boolean value) {
        this.explodeSlices = value;
    }

    public void setOnClickListener(JavaScriptInterface.OnClick listener) {
        MyApplication.getInstance().getJavaScriptInterface().setOnClickListener(listener);

        this.listener = listener;
    }

    @Override
    public String generateJs() {
        js.append("var chart = anychart.pie();");

        if (data != null) {
            js.append("chart.data([");
            for (int i = 0; i < data.size(); i++) {
                DataEntry dataEntry = data.get(i);
                js.append(dataEntry.generateJs());

                if (i != data.size() - 1)
                    js.append(",");
            }
            js.append("]);");
        }

        if (labels != null)
            js.append(String.format(Locale.US, "chart.labels(%s);", labels.generateJs()));
        if (!TextUtils.isEmpty(title))
            js.append(String.format(Locale.US, "chart.title(\"%s\");", title));
        js.append(String.format(Locale.US, "chart.legend().enabled(%b);", enabledLegend));
        if (x != -1d && y != -1d && width != -1d && height != -1d)
            js.append(String.format(Locale.US, "chart.bounds(%f, %f, %f, %f);", x, y, width, height));
        js.append(String.format(Locale.US, "chart.credits(%b);", enabledCredits));
        js.append(String.format(Locale.US, "chart.tooltip(%b);", enabledTooltip));
        if (!TextUtils.isEmpty(backgroundColor) && backgroundOpacity == -1d)
            js.append(String.format(Locale.US, "chart.background().fill(\"%s\");", backgroundColor));
        if (!TextUtils.isEmpty(backgroundColor) && backgroundOpacity != -1d)
            js.append(String.format(Locale.US, "chart.background().fill(\"%s %f\");", backgroundColor, backgroundOpacity));
        if (marginLeft != -1d && marginRight != -1d && marginBottom != -1d && marginTop != -1d)
            js.append(String.format(Locale.US, "chart.margin(%f, %f, %f, %f);", marginTop, marginRight, marginBottom, marginLeft));
        if (innerRadius != -1d)
            js.append(String.format(Locale.US, "chart.innerRadius(\"%f%%\");", innerRadius));
        if (radius != -1d)
            js.append(String.format(Locale.US, "chart.radius(\"%f%%\");", radius));
        if (startAngle !=-1d)
            js.append(String.format(Locale.US, "chart.startAngle(%f);", startAngle));
        js.append(String.format(Locale.US, "chart.animation(%b);", enabledAnimation));
        if (overlapMode != null)
            js.append(String.format(Locale.US, "chart.overlapMode(\"%s\");", overlapMode.get()));
        if (paddingLeft != -1d && paddingBottom != -1d && paddingRight != -1d && paddingTop != -1d)
            js.append(String.format(Locale.US, "chart.padding(%f, %f, %f, %f);", paddingTop, paddingRight, paddingBottom, paddingLeft));
        if (explode != -1d)
            js.append(String.format(Locale.US, "chart.explode(%f);", explode));
        if (slice != -1)
            js.append(String.format(Locale.US, "chart.explodeSlice(%d);", slice));
        js.append(String.format(Locale.US, "chart.explodeSlices(%b);", explodeSlices));

        if (colors != null) {
            js.append("chart.palette([");
            for (String color : colors) {
                js.append(String.format(Locale.US, "\"%s\",", color));
            }
            js.append("]);");
        }

        if (listener != null) {
            js.append("chart.listen(\"pointsselect\", function(event) {\n" +
                        "android.onClick('{'\n" +
                        "+'\"x\" : \"' + event.point.get('x') + '\",'\n" +
                        "+'\"value\" : \"' + event.point.get('value') + '\"'\n" +
                        "+'}');" +
                    "});");
        }

        return js.toString();
    }
}
