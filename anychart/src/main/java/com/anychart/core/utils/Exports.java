package com.anychart.core.utils;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Composition view, that concatenates two different views.
 */
public class Exports extends JsObject {

    protected Exports() {

    }

    public static Exports instantiate() {
        return new Exports("new anychart.core.utils.exports()");
    }

    

    public Exports(String jsChart) {
        jsBase = "exports" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for facebook sharing settings.
     */
    public void facebook() {
        APIlib.getInstance().addJSLine(jsBase + ".facebook();");
    }
    /**
     * Setter for facebook sharing settings.
     */
    public void facebook(String captionOrOptions, String link, String name, String description, String width, String height, String appId) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".facebook(%s, %s, %s, %s, %s, %s, %s);", wrapQuotes(captionOrOptions), wrapQuotes(link), wrapQuotes(name), wrapQuotes(description), wrapQuotes(width), wrapQuotes(height), wrapQuotes(appId)));
    }
    /**
     * Setter and getter for the file name for exported files.
     */
    public void filename(String name) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".filename(%s);", wrapQuotes(name)));
    }
    /**
     * Getter for dimensions for exported images and PDFs.
     */
    public void image() {
        APIlib.getInstance().addJSLine(jsBase + ".image();");
    }
    /**
     * Setter for dimensions for exported images and PDFs.
     */
    public void image(String widthOrOptions, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".image(%s, %s);", wrapQuotes(widthOrOptions), wrapQuotes(height)));
    }
    /**
     * Getter for LinkedIn sharing settings.
     */
    public void linkedin() {
        APIlib.getInstance().addJSLine(jsBase + ".linkedin();");
    }
    /**
     * Setter for LinkedIn sharing settings.
     */
    public void linkedin(String captionOrOptions, String description, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".linkedin(%s, %s, %s, %s);", wrapQuotes(captionOrOptions), wrapQuotes(description), wrapQuotes(width), wrapQuotes(height)));
    }
    /**
     * Getter for Pinterest sharing settings.
     */
    public void pinterest() {
        APIlib.getInstance().addJSLine(jsBase + ".pinterest();");
    }
    /**
     * Setter for Pinterest sharing settings.
     */
    public void pinterest(String linkOrOptions, String description, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".pinterest(%s, %s, %s, %s);", wrapQuotes(linkOrOptions), wrapQuotes(description), wrapQuotes(width), wrapQuotes(height)));
    }
    /**
     * Getter for Twitter sharing settings.
     */
    public void twitter() {
        APIlib.getInstance().addJSLine(jsBase + ".twitter();");
    }
    /**
     * Setter for twitter sharing settings.
     */
    public void twitter(String urlOrOptions, String width, String height) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".twitter(%s, %s, %s);", wrapQuotes(urlOrOptions), wrapQuotes(width), wrapQuotes(height)));
    }

}