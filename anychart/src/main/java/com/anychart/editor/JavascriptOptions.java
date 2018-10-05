package com.anychart.editor;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for range.
 */
public class JavascriptOptions extends JsObject  {

    
    public JavascriptOptions(Boolean addData, Boolean addGeoData, Boolean addMarkers, String container, Boolean minify, String wrapper) {
        js.append(String.format(Locale.US, "{addData:%s, addGeoData: %s, addMarkers: %s, container: %s, minify: %s, wrapper: %s, } ", addData, addGeoData, addMarkers, wrapQuotes(container), minify, wrapQuotes(wrapper)));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}