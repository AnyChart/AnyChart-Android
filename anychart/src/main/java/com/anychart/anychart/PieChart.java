package com.anychart.anychart;

import android.text.TextUtils;

import com.anychart.anychart.application.MyApplication;
import com.anychart.anychart.chart.common.JavaScriptInterface;
import com.anychart.anychart.chart.common.enums.Decoration;
import com.anychart.anychart.chart.common.enums.OverlapMode;

import java.util.List;
import java.util.Locale;

/**
 * Created by NeverKnowsBest on 08/04/2017.
 */

public class PieChart extends Chart {

    private List<DataEntry> data;
    private Labels labels;
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

    private JavaScriptInterface.OnClick onClickListener;

    public PieChart() {

    }

    public PieChart(List<DataEntry> data) {
        setData(data);
    }

    public void setData(List<DataEntry> data) {
        this.data = data;

        for (DataEntry dataEntry : data) {
            dataEntry.setOnChangeListener(new OnChange() {
                @Override
                public void onChange(String jsChange) {
                    if (isRendered) {
                        onChangeListener.onChange(generateJSData());
                        js.setLength(0);
                    }
                }
            });
        }

        if (isRendered) {
            onChangeListener.onChange(generateJSData());
            js.setLength(0);
        }
    }

    public Labels getLabels() {
        if (labels == null) {
            labels = new Labels();
            labels.setOnChangeListener(new OnChange() {
                @Override
                public void onChange(String jsChange) {
                    if (isRendered) {
                        onChangeListener.onChange(generateJSLabels());
                        js.setLength(0);
                    }
                }
            });
        }

        return labels;
    }

    public void setTitle(String title) {
        this.title = title;

        if (isRendered) {
            onChangeListener.onChange(generateJSTitle());
            js.setLength(0);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setEnabledLegend(boolean value) {
        this.enabledLegend = value;

        if (isRendered) {
            onChangeListener.onChange(generateJSEnabledLegend());
            js.setLength(0);
        }
    }

    public void setBounds(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        if (isRendered) {
            onChangeListener.onChange(generateJSBounds());
            js.setLength(0);
        }
    }

    public void setPalette(List<String> colors) {
        this.colors = colors;

        if (isRendered) {
            onChangeListener.onChange(generateJSPalette());
            js.setLength(0);
        }
    }

    public void setEnabledCredits(boolean value) {
        this.enabledCredits = value;

        if (isRendered) {
            onChangeListener.onChange(generateJSEnabledCredits());
            js.setLength(0);
        }
    }

    public void setEnabledTooltip(boolean value) {
        this.enabledTooltip = value;

        if (isRendered) {
            onChangeListener.onChange(generateJSEnabledTooltip());
            js.setLength(0);
        }
    }

    public void setBackgroundColor(String color) {
        this.backgroundColor = color;

        if (isRendered) {
            onChangeListener.onChange(generateJSBackgroundColor());
            js.setLength(0);
        }
    }

    public void setBackgroundColor(String color, double alpha) {
        this.backgroundColor = color;
        this.backgroundOpacity = alpha;

        if (isRendered) {
            onChangeListener.onChange(generateJSBackgroundColor());
            js.setLength(0);
        }
    }

    public void setMargin(double top, double right, double bottom, double left) {
        this.marginTop = top;
        this.marginRight = right;
        this.marginBottom = bottom;
        this.marginLeft = left;

        if (isRendered) {
            onChangeListener.onChange(generateJSMargin());
            js.setLength(0);
        }
    }

    public void setInnerRadius(double percent) {
        this.innerRadius = percent;

        if (isRendered) {
            onChangeListener.onChange(generateJSInnerRadius());
            js.setLength(0);
        }
    }

    public void setRadius(double percent) {
        this.radius = percent;

        if (isRendered) {
            onChangeListener.onChange(generateJSRadius());
            js.setLength(0);
        }
    }

    public void setStartAngle(double startAngle) {
        this.startAngle = startAngle;

        if (isRendered) {
            onChangeListener.onChange(generateJSStartAngle());
            js.setLength(0);
        }
    }

    public void setEnabledAnimation(boolean value) {
        this.enabledAnimation = value;

        if (isRendered) {
            onChangeListener.onChange(generateJSEnabledAnimation());
            js.setLength(0);
        }
    }

    public void setOverlapMode(OverlapMode overlapMode) {
        this.overlapMode = overlapMode;

        if (isRendered) {
            onChangeListener.onChange(generateJSOverlapMode());
            js.setLength(0);
        }
    }

    public void setPadding(double top, double right, double bottom, double left) {
        this.paddingTop = top;
        this.paddingRight = right;
        this.paddingBottom = bottom;
        this.paddingLeft = left;

        if (isRendered) {
            onChangeListener.onChange(generateJSPadding());
            js.setLength(0);
        }
    }

    public void setExplode(double explode) {
        this.explode = explode;

        if (isRendered) {
            onChangeListener.onChange(generateJSExplode());
            js.setLength(0);
        }
    }

    public void setExplodeSlice(int slice) {
        this.slice = slice;

        if (isRendered) {
            onChangeListener.onChange(generateJSExplodeSlice());
            js.setLength(0);
        }
    }

    public void setExplodeSlices(boolean value) {
        this.explodeSlices = value;

        if (isRendered) {
            onChangeListener.onChange(generateJSExplodeSlices());
            js.setLength(0);
        }
    }

    public void setOnClickListener(JavaScriptInterface.OnClick listener) {
        MyApplication.getInstance().getJavaScriptInterface().setOnClickListener(listener);

        this.onClickListener = listener;
    }

    private String generateJSData() {
        js.append("chart.data([");
        for (int i = 0; i < data.size(); i++) {
            DataEntry dataEntry = data.get(i);
            js.append(dataEntry.generateJs());

            if (i != data.size() - 1)
                js.append(",");
        }
        js.append("]);");

        return js.toString();
    }

    private String generateJSLabels() {
        js.append(String.format(Locale.US, "chart.labels(%s);", labels.generateJs()));

        return js.toString();
    }

    private String generateJSTitle() {
        js.append(String.format(Locale.US, "chart.title(\"%s\");", title));

        return js.toString();
    }

    private String generateJSEnabledLegend() {
        js.append(String.format(Locale.US, "chart.legend().enabled(%b);", enabledLegend));

        return js.toString();
    }

    private String generateJSBounds() {
        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %f, %f);", x, y, width, height));

        return js.toString();
    }

    private String generateJSPalette() {
        js.append("chart.palette([");
        for (String color : colors) {
            js.append(String.format(Locale.US, "\"%s\",", color));
        }
        js.append("]);");

        return js.toString();
    }

    private String generateJSEnabledCredits() {
        js.append(String.format(Locale.US, "chart.credits(%b);", enabledCredits));

        return js.toString();
    }

    private String generateJSEnabledTooltip() {
        js.append(String.format(Locale.US, "chart.tooltip(%b);", enabledTooltip));

        return js.toString();
    }

    private String generateJSBackgroundColor() {
        if (backgroundOpacity == -1d)
            js.append(String.format(Locale.US, "chart.background().fill(\"%s\");", backgroundColor));
        else
            js.append(String.format(Locale.US, "chart.background().fill(\"%s %f\");", backgroundColor, backgroundOpacity));

        return js.toString();
    }

    private String generateJSMargin() {
        js.append(String.format(Locale.US, "chart.margin(%f, %f, %f, %f);", marginTop, marginRight, marginBottom, marginLeft));

        return js.toString();
    }

    private String generateJSInnerRadius() {
        js.append(String.format(Locale.US, "chart.innerRadius(\"%f%%\");", innerRadius));

        return js.toString();
    }

    private String generateJSRadius() {
        js.append(String.format(Locale.US, "chart.radius(\"%f%%\");", radius));

        return js.toString();
    }

    private String generateJSStartAngle() {
        js.append(String.format(Locale.US, "chart.startAngle(%f);", startAngle));

        return js.toString();
    }

    private String generateJSEnabledAnimation() {
        js.append(String.format(Locale.US, "chart.animation(%b);", enabledAnimation));

        return js.toString();
    }

    private String generateJSOverlapMode() {
        js.append(String.format(Locale.US, "chart.overlapMode(\"%s\");", overlapMode.get()));

        return js.toString();
    }

    private String generateJSPadding() {
        js.append(String.format(Locale.US, "chart.padding(%f, %f, %f, %f);", paddingTop, paddingRight, paddingBottom, paddingLeft));

        return js.toString();
    }

    private String generateJSExplode() {
        js.append(String.format(Locale.US, "chart.explode(%f);", explode));

        return js.toString();
    }

    private String generateJSExplodeSlice() {
        js.append(String.format(Locale.US, "chart.explodeSlice(%d);", slice));

        return js.toString();
    }

    private String generateJSExplodeSlices() {
        js.append(String.format(Locale.US, "chart.explodeSlices(%b);", explodeSlices));

        return js.toString();
    }

    @Override
    protected String generateJs() {
        js.append("chart = anychart.pie();");

        if (data != null) {
            generateJSData();
        }

        if (labels != null)
            generateJSLabels();
        if (!TextUtils.isEmpty(title))
            generateJSTitle();
        generateJSEnabledLegend();
        if (x != -1d && y != -1d && width != -1d && height != -1d)
            generateJSBounds();
        generateJSEnabledCredits();
        generateJSEnabledTooltip();
        if (!TextUtils.isEmpty(backgroundColor))
            generateJSBackgroundColor();
        if (marginLeft != -1d && marginRight != -1d && marginBottom != -1d && marginTop != -1d)
            generateJSMargin();
        if (innerRadius != -1d)
            generateJSInnerRadius();
        if (radius != -1d)
            generateJSRadius();
        if (startAngle !=-1d)
            generateJSStartAngle();
        generateJSEnabledAnimation();
        if (overlapMode != null)
            generateJSOverlapMode();
        if (paddingLeft != -1d && paddingBottom != -1d && paddingRight != -1d && paddingTop != -1d)
            generateJSPadding();
        if (explode != -1d)
            generateJSExplode();
        if (slice != -1)
            generateJSExplodeSlice();


        if (colors != null) {
            generateJSPalette();
        }

        if (onClickListener != null) {
            js.append("chart.listen(\"pointsselect\", function(event) {\n" +
                        "android.onClickListener('{'\n" +
                        "+'\"x\" : \"' + event.point.get('x') + '\",'\n" +
                        "+'\"value\" : \"' + event.point.get('value') + '\"'\n" +
                        "+'}');" +
                    "});");
        }

        String resultJS = js.toString();
        js.setLength(0);
        return resultJS;
    }
}
