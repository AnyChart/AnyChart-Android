package com.anychart.data.tree;

import com.anychart.JsObject;


import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for dependency.
 */
public class Dependency extends JsObject  {

    
    public Dependency(String from, String to) {
        js.append(String.format(Locale.US, "{from:%s, to: %s, } ", wrapQuotes(from), wrapQuotes(to)));
    }
    public Dependency(String from, Number to) {
        js.append(String.format(Locale.US, "{from:%s, to: %s, } ", wrapQuotes(from), to));
    }
    public Dependency(Number from, String to) {
        js.append(String.format(Locale.US, "{from:%s, to: %s, } ", from, wrapQuotes(to)));
    }
    public Dependency(Number from, Number to) {
        js.append(String.format(Locale.US, "{from:%s, to: %s, } ", from, to));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}