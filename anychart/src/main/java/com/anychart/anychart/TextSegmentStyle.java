package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Text segment.
 */
public class TextSegmentStyle extends JsObject  {

    
    private String color;
    private String decoration;
    private String fontFamily;
    private String fontSize;
    private Number fontSize1;
    private String fontStyle;
    private String fontVariant;
    private Number fontWeight;
    private String fontWeight1;
    private String letterSpacing;
    private Number opacity;

    
    public TextSegmentStyle(String fontSize, Number fontWeight, String color, String decoration, String fontFamily, String fontStyle, String fontVariant, String letterSpacing, Number opacity) {
        this.fontSize = fontSize;
        this.fontWeight = fontWeight;
        this.color = color;
        this.decoration = decoration;
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.fontVariant = fontVariant;
        this.letterSpacing = letterSpacing;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{fontSize: %s,fontWeight: %s,color: %s,decoration: %s,fontFamily: %s,fontStyle: %s,fontVariant: %s,letterSpacing: %s,opacity: %s}",  wrapQuotes(fontSize), fontWeight, wrapQuotes(color), wrapQuotes(decoration), wrapQuotes(fontFamily), wrapQuotes(fontStyle), wrapQuotes(fontVariant), wrapQuotes(letterSpacing), opacity));
    }
    public TextSegmentStyle(String fontSize, String fontWeight1, String color, String decoration, String fontFamily, String fontStyle, String fontVariant, String letterSpacing, Number opacity) {
        this.fontSize = fontSize;
        this.fontWeight1 = fontWeight1;
        this.color = color;
        this.decoration = decoration;
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.fontVariant = fontVariant;
        this.letterSpacing = letterSpacing;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{fontSize: %s,fontWeight: %s,color: %s,decoration: %s,fontFamily: %s,fontStyle: %s,fontVariant: %s,letterSpacing: %s,opacity: %s}",  wrapQuotes(fontSize), wrapQuotes(fontWeight1), wrapQuotes(color), wrapQuotes(decoration), wrapQuotes(fontFamily), wrapQuotes(fontStyle), wrapQuotes(fontVariant), wrapQuotes(letterSpacing), opacity));
    }
    public TextSegmentStyle(Number fontSize1, Number fontWeight, String color, String decoration, String fontFamily, String fontStyle, String fontVariant, String letterSpacing, Number opacity) {
        this.fontSize1 = fontSize1;
        this.fontWeight = fontWeight;
        this.color = color;
        this.decoration = decoration;
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.fontVariant = fontVariant;
        this.letterSpacing = letterSpacing;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{fontSize: %s,fontWeight: %s,color: %s,decoration: %s,fontFamily: %s,fontStyle: %s,fontVariant: %s,letterSpacing: %s,opacity: %s}",  fontSize1, fontWeight, wrapQuotes(color), wrapQuotes(decoration), wrapQuotes(fontFamily), wrapQuotes(fontStyle), wrapQuotes(fontVariant), wrapQuotes(letterSpacing), opacity));
    }
    public TextSegmentStyle(Number fontSize1, String fontWeight1, String color, String decoration, String fontFamily, String fontStyle, String fontVariant, String letterSpacing, Number opacity) {
        this.fontSize1 = fontSize1;
        this.fontWeight1 = fontWeight1;
        this.color = color;
        this.decoration = decoration;
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.fontVariant = fontVariant;
        this.letterSpacing = letterSpacing;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "{fontSize: %s,fontWeight: %s,color: %s,decoration: %s,fontFamily: %s,fontStyle: %s,fontVariant: %s,letterSpacing: %s,opacity: %s}",  fontSize1, wrapQuotes(fontWeight1), wrapQuotes(color), wrapQuotes(decoration), wrapQuotes(fontFamily), wrapQuotes(fontStyle), wrapQuotes(fontVariant), wrapQuotes(letterSpacing), opacity));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}