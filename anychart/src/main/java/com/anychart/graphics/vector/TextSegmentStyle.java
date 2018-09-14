package com.anychart.graphics.vector;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Text segment.
 */
public class TextSegmentStyle extends JsObject  {

    
    public TextSegmentStyle(String color, String decoration, String fontFamily, String fontSize, String fontStyle, String fontVariant, Number fontWeight, String letterSpacing, Number opacity) {
        js.append(String.format(Locale.US, "{color:%s, decoration: %s, fontFamily: %s, fontSize: %s, fontStyle: %s, fontVariant: %s, fontWeight: %s, letterSpacing: %s, opacity: %s, } ", wrapQuotes(color), wrapQuotes(decoration), wrapQuotes(fontFamily), wrapQuotes(fontSize), wrapQuotes(fontStyle), wrapQuotes(fontVariant), fontWeight, wrapQuotes(letterSpacing), opacity));
    }
    public TextSegmentStyle(String color, String decoration, String fontFamily, String fontSize, String fontStyle, String fontVariant, String fontWeight, String letterSpacing, Number opacity) {
        js.append(String.format(Locale.US, "{color:%s, decoration: %s, fontFamily: %s, fontSize: %s, fontStyle: %s, fontVariant: %s, fontWeight: %s, letterSpacing: %s, opacity: %s, } ", wrapQuotes(color), wrapQuotes(decoration), wrapQuotes(fontFamily), wrapQuotes(fontSize), wrapQuotes(fontStyle), wrapQuotes(fontVariant), wrapQuotes(fontWeight), wrapQuotes(letterSpacing), opacity));
    }
    public TextSegmentStyle(String color, String decoration, String fontFamily, Number fontSize, String fontStyle, String fontVariant, Number fontWeight, String letterSpacing, Number opacity) {
        js.append(String.format(Locale.US, "{color:%s, decoration: %s, fontFamily: %s, fontSize: %s, fontStyle: %s, fontVariant: %s, fontWeight: %s, letterSpacing: %s, opacity: %s, } ", wrapQuotes(color), wrapQuotes(decoration), wrapQuotes(fontFamily), fontSize, wrapQuotes(fontStyle), wrapQuotes(fontVariant), fontWeight, wrapQuotes(letterSpacing), opacity));
    }
    public TextSegmentStyle(String color, String decoration, String fontFamily, Number fontSize, String fontStyle, String fontVariant, String fontWeight, String letterSpacing, Number opacity) {
        js.append(String.format(Locale.US, "{color:%s, decoration: %s, fontFamily: %s, fontSize: %s, fontStyle: %s, fontVariant: %s, fontWeight: %s, letterSpacing: %s, opacity: %s, } ", wrapQuotes(color), wrapQuotes(decoration), wrapQuotes(fontFamily), fontSize, wrapQuotes(fontStyle), wrapQuotes(fontVariant), wrapQuotes(fontWeight), wrapQuotes(letterSpacing), opacity));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}