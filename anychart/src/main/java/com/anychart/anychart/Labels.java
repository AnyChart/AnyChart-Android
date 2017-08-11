package com.anychart.anychart;

import android.text.TextUtils;

import com.anychart.anychart.chart.common.enums.Anchor;
import com.anychart.anychart.chart.common.enums.Decoration;
import com.anychart.anychart.chart.common.enums.Direction;
import com.anychart.anychart.chart.common.enums.FontStyle;
import com.anychart.anychart.chart.common.enums.FontVariant;
import com.anychart.anychart.chart.common.enums.HAlign;
import com.anychart.anychart.chart.common.enums.TextWrap;
import com.anychart.anychart.chart.common.enums.VAlign;

import java.util.Locale;

/**
 * Created by arseny on 8/8/17.
 */

public class Labels extends JsObject {

    private String backgroundColor;
    private String fontColor;
    private Decoration fontDecoration;
    private String fontFamily;
    private double fontOpacity = -1d;
    private double fontSize = -1d;
    private FontStyle fontStyle;
    private double fontWeight = -1d;
    private HAlign hAlign;
    private double lineHeight = -1d;
    private double maxFontSize = -1d;
    private double minFontSize = -1d;
    private VAlign vAlign;
    private boolean adjustByWidth;
    private boolean adjustByHeight;
    private FontVariant fontVariant;
    private double letterSpacing = -1d;
    private Direction textDirection;
    private double textIndent = -1d;
    private String textOverflow;
    private TextWrap textWrap;
    private boolean enabled = true;
    private boolean selectable;
    private Anchor anchor;
    private double height = -1d;
    private double offsetX = -1d;
    private double offsetY = -1d;
    private double paddingTop = -1d;
    private double paddingRight = -1d;
    private double paddingBottom = -1d;
    private double paddingLeft = -1d;
    private String position;
    private double angle = -1d;
    private double width = -1d;
    private double zIndex = -1d;

    private OnChange onChangeListener;

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;

        onChangeListener.onChange(null);
    }

    public void setHAlign(HAlign hAlign) {
        this.hAlign = hAlign;

        onChangeListener.onChange(null);
    }

    public void setLineHeight(double lineHeight) {
        this.lineHeight = lineHeight;

        onChangeListener.onChange(null);
    }

    public void setVAlign(VAlign vAlign) {
        this.vAlign = vAlign;

        onChangeListener.onChange(null);
    }

    public void setAdjustByWidth(boolean adjustByWidth) {
        this.adjustByWidth = adjustByWidth;

        onChangeListener.onChange(null);
    }

    public void setAdjustByHeight(boolean adjustByHeight) {
        this.adjustByHeight = adjustByHeight;

        onChangeListener.onChange(null);
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;

        onChangeListener.onChange(null);
    }

    public void setSelectable(boolean selectable) {
        this.selectable = selectable;

        onChangeListener.onChange(null);
    }

    public void setPaddingTop(double paddingTop) {
        this.paddingTop = paddingTop;

        onChangeListener.onChange(null);
    }

    public void setPaddingRight(double paddingRight) {
        this.paddingRight = paddingRight;

        onChangeListener.onChange(null);
    }

    public void setPaddingBottom(double paddingBottom) {
        this.paddingBottom = paddingBottom;

        onChangeListener.onChange(null);
    }

    public void setPaddingLeft(double paddingLeft) {
        this.paddingLeft = paddingLeft;

        onChangeListener.onChange(null);
    }

    public void setRotation(double angle) {
        this.angle = angle;

        onChangeListener.onChange(null);
    }

    public void setzIndex(double zIndex) {
        this.zIndex = zIndex;

        onChangeListener.onChange(null);
    }

    @Override
    void setOnChangeListener(OnChange onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    @Override
    protected String generateJs() {
        js.append("{");

        if (!TextUtils.isEmpty(backgroundColor))
            js.append(String.format(Locale.US, "background: \"%s\",", backgroundColor));
        if (!TextUtils.isEmpty(fontColor))
            js.append(String.format(Locale.US, "fontColor: \"%s\",", fontColor));
        if (fontDecoration != null)
            js.append(String.format(Locale.US, "fontDecoration: \"%s\",", fontDecoration.get()));
        if (!TextUtils.isEmpty(fontFamily))
            js.append(String.format(Locale.US, "fontFamily: \"%s\",", fontFamily));
        if (fontOpacity != -1d)
            js.append(String.format(Locale.US, "fontOpacity: %f,", fontOpacity));
        if (fontSize != -1d)
            js.append(String.format(Locale.US, "fontSize: %f,", fontSize));
        if (fontStyle != null)
            js.append(String.format(Locale.US, "fontStyle: \"%s\",", fontStyle.get()));
        if (fontWeight != -1d)
            js.append(String.format(Locale.US, "fontWeight: %f,", fontWeight));
        if (hAlign != null)
            js.append(String.format(Locale.US, "hAlign: \"%s\",", hAlign.get()));
        if (lineHeight != -1d)
            js.append(String.format(Locale.US, "lineHeight: %f,", lineHeight));
        if (maxFontSize != -1d)
            js.append(String.format(Locale.US, "maxFontSize: %f,", maxFontSize));
        if (minFontSize != -1d)
            js.append(String.format(Locale.US, "minFontSize: %f,", minFontSize));
        if (vAlign != null)
            js.append(String.format(Locale.US, "vAlign: \"%s\",", vAlign.get()));
        js.append(String.format(Locale.US, "adjustByWidth: %b, adjustByHeight: %b,",
                adjustByWidth, adjustByHeight));
        if (fontVariant != null)
            js.append(String.format(Locale.US, "fontVariant: \"%s\",", fontVariant.get()));
        if (letterSpacing != -1d)
            js.append(String.format(Locale.US, "letterSpacing: %f,", letterSpacing));
        if (textDirection != null)
            js.append(String.format(Locale.US, "textDirection: \"%s\",", textDirection.get()));
        if (textIndent != -1d)
            js.append(String.format(Locale.US, "textIndent: %f,", textIndent));
        if (!TextUtils.isEmpty(textOverflow))
            js.append(String.format(Locale.US, "textOverflow: \"%s\",", textOverflow));
        if (textWrap != null)
            js.append(String.format(Locale.US, "textWrap: \"%s\",", textWrap.get()));
        js.append(String.format(Locale.US, "enabled: %b,", enabled));
        js.append(String.format(Locale.US, "selectable: %b,", selectable));
        if (anchor != null)
            js.append(String.format(Locale.US, "anchor: \"%s\",", anchor.get()));
        if (height != -1d)
            js.append(String.format(Locale.US, "height: %f,", height));
        if (offsetX != -1d)
            js.append(String.format(Locale.US, "offsetX: \"%f\",", offsetX));
        if (offsetY != -1d)
            js.append(String.format(Locale.US, "offsetY: \"%f\",", offsetY));
        if (paddingBottom != -1d && paddingLeft != -1d && paddingRight != -1d && paddingTop != -1d)
            js.append(String.format(Locale.US, "padding: {value1: %f, value2: %f, value3: %f, value4: %f},",
                    paddingTop, paddingRight, paddingBottom, paddingLeft));
        if (!TextUtils.isEmpty(position))
            js.append(String.format(Locale.US, "position: %s,", position));
        if (angle != -1d)
            js.append(String.format(Locale.US, "rotation: %f,", angle));
        if (width != -1d)
            js.append(String.format(Locale.US, "width: %f,", width));
        if (zIndex != -1d)
            js.append(String.format(Locale.US, "zIndex: %f,", zIndex));

        js.append("}");

        String resultJs = super.generateJs();
        js.setLength(0);
        return resultJs;
    }
}
