package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class TextSegmentStyle extends JsObject  {

    
    private String color;
    private String decoration;
    private String fontFamily;
    private String fontSize;
    private Double fontSize1;
    private String fontStyle;
    private String fontVariant;
    private Double fontWeight;
    private String fontWeight1;
    private String letterSpacing;
    private Double opacity;

    
    public TextSegmentStyle(String fontSize, Double fontWeight, String color, String decoration, String fontFamily, String fontStyle, String fontVariant, String letterSpacing, Double opacity) {
        this.fontSize = fontSize;
        this.fontWeight = fontWeight;
        this.color = color;
        this.decoration = decoration;
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.fontVariant = fontVariant;
        this.letterSpacing = letterSpacing;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{fontSize: %s,fontWeight: %f,color: %s,decoration: %s,fontFamily: %s,fontStyle: %s,fontVariant: %s,letterSpacing: %s,opacity: %f}",  fontSize, fontWeight, color, decoration, fontFamily, fontStyle, fontVariant, letterSpacing, opacity));
    }

    public TextSegmentStyle(String fontSize, String fontWeight1, String color, String decoration, String fontFamily, String fontStyle, String fontVariant, String letterSpacing, Double opacity) {
        this.fontSize = fontSize;
        this.fontWeight1 = fontWeight1;
        this.color = color;
        this.decoration = decoration;
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.fontVariant = fontVariant;
        this.letterSpacing = letterSpacing;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{fontSize: %s,fontWeight: %s,color: %s,decoration: %s,fontFamily: %s,fontStyle: %s,fontVariant: %s,letterSpacing: %s,opacity: %f}",  fontSize, fontWeight1, color, decoration, fontFamily, fontStyle, fontVariant, letterSpacing, opacity));
    }

    public TextSegmentStyle(Double fontSize1, Double fontWeight, String color, String decoration, String fontFamily, String fontStyle, String fontVariant, String letterSpacing, Double opacity) {
        this.fontSize1 = fontSize1;
        this.fontWeight = fontWeight;
        this.color = color;
        this.decoration = decoration;
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.fontVariant = fontVariant;
        this.letterSpacing = letterSpacing;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{fontSize: %f,fontWeight: %f,color: %s,decoration: %s,fontFamily: %s,fontStyle: %s,fontVariant: %s,letterSpacing: %s,opacity: %f}",  fontSize1, fontWeight, color, decoration, fontFamily, fontStyle, fontVariant, letterSpacing, opacity));
    }

    public TextSegmentStyle(Double fontSize1, String fontWeight1, String color, String decoration, String fontFamily, String fontStyle, String fontVariant, String letterSpacing, Double opacity) {
        this.fontSize1 = fontSize1;
        this.fontWeight1 = fontWeight1;
        this.color = color;
        this.decoration = decoration;
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.fontVariant = fontVariant;
        this.letterSpacing = letterSpacing;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{fontSize: %f,fontWeight: %s,color: %s,decoration: %s,fontFamily: %s,fontStyle: %s,fontVariant: %s,letterSpacing: %s,opacity: %f}",  fontSize1, fontWeight1, color, decoration, fontFamily, fontStyle, fontVariant, letterSpacing, opacity));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}