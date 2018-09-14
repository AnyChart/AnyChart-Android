package com.anychart.utils;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for the rectangle.
 */
public class RectObj extends JsObject  {

    
    public RectObj(Number bottom, Number height, Number left, Number right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, left, right, top, width));
    }
    public RectObj(Number bottom, Number height, Number left, Number right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, left, right, top, wrapQuotes(width)));
    }
    public RectObj(Number bottom, Number height, Number left, Number right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, left, right, wrapQuotes(top), width));
    }
    public RectObj(Number bottom, Number height, Number left, Number right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, left, right, wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(Number bottom, Number height, Number left, String right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, left, wrapQuotes(right), top, width));
    }
    public RectObj(Number bottom, Number height, Number left, String right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, left, wrapQuotes(right), top, wrapQuotes(width)));
    }
    public RectObj(Number bottom, Number height, Number left, String right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, left, wrapQuotes(right), wrapQuotes(top), width));
    }
    public RectObj(Number bottom, Number height, Number left, String right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, left, wrapQuotes(right), wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(Number bottom, Number height, String left, Number right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, wrapQuotes(left), right, top, width));
    }
    public RectObj(Number bottom, Number height, String left, Number right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, wrapQuotes(left), right, top, wrapQuotes(width)));
    }
    public RectObj(Number bottom, Number height, String left, Number right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, wrapQuotes(left), right, wrapQuotes(top), width));
    }
    public RectObj(Number bottom, Number height, String left, Number right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, wrapQuotes(left), right, wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(Number bottom, Number height, String left, String right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, wrapQuotes(left), wrapQuotes(right), top, width));
    }
    public RectObj(Number bottom, Number height, String left, String right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, wrapQuotes(left), wrapQuotes(right), top, wrapQuotes(width)));
    }
    public RectObj(Number bottom, Number height, String left, String right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, wrapQuotes(left), wrapQuotes(right), wrapQuotes(top), width));
    }
    public RectObj(Number bottom, Number height, String left, String right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, height, wrapQuotes(left), wrapQuotes(right), wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(Number bottom, String height, Number left, Number right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), left, right, top, width));
    }
    public RectObj(Number bottom, String height, Number left, Number right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), left, right, top, wrapQuotes(width)));
    }
    public RectObj(Number bottom, String height, Number left, Number right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), left, right, wrapQuotes(top), width));
    }
    public RectObj(Number bottom, String height, Number left, Number right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), left, right, wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(Number bottom, String height, Number left, String right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), left, wrapQuotes(right), top, width));
    }
    public RectObj(Number bottom, String height, Number left, String right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), left, wrapQuotes(right), top, wrapQuotes(width)));
    }
    public RectObj(Number bottom, String height, Number left, String right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), left, wrapQuotes(right), wrapQuotes(top), width));
    }
    public RectObj(Number bottom, String height, Number left, String right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), left, wrapQuotes(right), wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(Number bottom, String height, String left, Number right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), wrapQuotes(left), right, top, width));
    }
    public RectObj(Number bottom, String height, String left, Number right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), wrapQuotes(left), right, top, wrapQuotes(width)));
    }
    public RectObj(Number bottom, String height, String left, Number right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), wrapQuotes(left), right, wrapQuotes(top), width));
    }
    public RectObj(Number bottom, String height, String left, Number right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), wrapQuotes(left), right, wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(Number bottom, String height, String left, String right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), wrapQuotes(left), wrapQuotes(right), top, width));
    }
    public RectObj(Number bottom, String height, String left, String right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), wrapQuotes(left), wrapQuotes(right), top, wrapQuotes(width)));
    }
    public RectObj(Number bottom, String height, String left, String right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), wrapQuotes(left), wrapQuotes(right), wrapQuotes(top), width));
    }
    public RectObj(Number bottom, String height, String left, String right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", bottom, wrapQuotes(height), wrapQuotes(left), wrapQuotes(right), wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(String bottom, Number height, Number left, Number right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, left, right, top, width));
    }
    public RectObj(String bottom, Number height, Number left, Number right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, left, right, top, wrapQuotes(width)));
    }
    public RectObj(String bottom, Number height, Number left, Number right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, left, right, wrapQuotes(top), width));
    }
    public RectObj(String bottom, Number height, Number left, Number right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, left, right, wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(String bottom, Number height, Number left, String right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, left, wrapQuotes(right), top, width));
    }
    public RectObj(String bottom, Number height, Number left, String right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, left, wrapQuotes(right), top, wrapQuotes(width)));
    }
    public RectObj(String bottom, Number height, Number left, String right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, left, wrapQuotes(right), wrapQuotes(top), width));
    }
    public RectObj(String bottom, Number height, Number left, String right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, left, wrapQuotes(right), wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(String bottom, Number height, String left, Number right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, wrapQuotes(left), right, top, width));
    }
    public RectObj(String bottom, Number height, String left, Number right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, wrapQuotes(left), right, top, wrapQuotes(width)));
    }
    public RectObj(String bottom, Number height, String left, Number right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, wrapQuotes(left), right, wrapQuotes(top), width));
    }
    public RectObj(String bottom, Number height, String left, Number right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, wrapQuotes(left), right, wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(String bottom, Number height, String left, String right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, wrapQuotes(left), wrapQuotes(right), top, width));
    }
    public RectObj(String bottom, Number height, String left, String right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, wrapQuotes(left), wrapQuotes(right), top, wrapQuotes(width)));
    }
    public RectObj(String bottom, Number height, String left, String right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, wrapQuotes(left), wrapQuotes(right), wrapQuotes(top), width));
    }
    public RectObj(String bottom, Number height, String left, String right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), height, wrapQuotes(left), wrapQuotes(right), wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(String bottom, String height, Number left, Number right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), left, right, top, width));
    }
    public RectObj(String bottom, String height, Number left, Number right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), left, right, top, wrapQuotes(width)));
    }
    public RectObj(String bottom, String height, Number left, Number right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), left, right, wrapQuotes(top), width));
    }
    public RectObj(String bottom, String height, Number left, Number right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), left, right, wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(String bottom, String height, Number left, String right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), left, wrapQuotes(right), top, width));
    }
    public RectObj(String bottom, String height, Number left, String right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), left, wrapQuotes(right), top, wrapQuotes(width)));
    }
    public RectObj(String bottom, String height, Number left, String right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), left, wrapQuotes(right), wrapQuotes(top), width));
    }
    public RectObj(String bottom, String height, Number left, String right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), left, wrapQuotes(right), wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(String bottom, String height, String left, Number right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), wrapQuotes(left), right, top, width));
    }
    public RectObj(String bottom, String height, String left, Number right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), wrapQuotes(left), right, top, wrapQuotes(width)));
    }
    public RectObj(String bottom, String height, String left, Number right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), wrapQuotes(left), right, wrapQuotes(top), width));
    }
    public RectObj(String bottom, String height, String left, Number right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), wrapQuotes(left), right, wrapQuotes(top), wrapQuotes(width)));
    }
    public RectObj(String bottom, String height, String left, String right, Number top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), wrapQuotes(left), wrapQuotes(right), top, width));
    }
    public RectObj(String bottom, String height, String left, String right, Number top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), wrapQuotes(left), wrapQuotes(right), top, wrapQuotes(width)));
    }
    public RectObj(String bottom, String height, String left, String right, String top, Number width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), wrapQuotes(left), wrapQuotes(right), wrapQuotes(top), width));
    }
    public RectObj(String bottom, String height, String left, String right, String top, String width) {
        js.append(String.format(Locale.US, "{bottom:%s, height: %s, left: %s, right: %s, top: %s, width: %s, } ", wrapQuotes(bottom), wrapQuotes(height), wrapQuotes(left), wrapQuotes(right), wrapQuotes(top), wrapQuotes(width)));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}