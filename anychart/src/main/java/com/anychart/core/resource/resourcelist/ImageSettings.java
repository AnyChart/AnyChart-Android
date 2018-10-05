package com.anychart.core.resource.resourcelist;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.resource.resourcelist.SettingsWithMargin;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Class representing text settings for resource list items.
 */
public class ImageSettings extends SettingsWithMargin {

    protected ImageSettings() {

    }

    public static ImageSettings instantiate() {
        return new ImageSettings("new anychart.core.resource.resourceList.imageSettings()");
    }

    

    public ImageSettings(String jsChart) {
        jsBase = "imageSettings" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the image align. See {@link anychart.graphics.vector.Image.Align}
     */
    public void align() {
        APIlib.getInstance().addJSLine(jsBase + ".align();");
    }
    /**
     * Setter for the image align.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings align(String align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".align(%s);", wrapQuotes(align)));

        return this;
    }
    /**
     * Setter for the image align.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings align(com.anychart.graphics.vector.image.Align align) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".align(%s);", (align != null) ? align.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the border radius of an image in item.
     */
    public void borderRadius() {
        APIlib.getInstance().addJSLine(jsBase + ".borderRadius();");
    }
    /**
     * Setter for the border radius of an image in item.
Learn more about border radius {@link https://www.w3schools.com/cssref/css3_pr_border-radius.asp}
     */
    public com.anychart.core.resource.resourcelist.ImageSettings borderRadius(Number borders) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".borderRadius(%s);", borders));

        return this;
    }
    /**
     * Setter for the border radius of an image in item.
Learn more about border radius {@link https://www.w3schools.com/cssref/css3_pr_border-radius.asp}
     */
    public com.anychart.core.resource.resourcelist.ImageSettings borderRadius(Number[] borders) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".borderRadius(%s);", Arrays.toString(borders)));

        return this;
    }
    /**
     * Getter for the fitting mode. See {@link anychart.graphics.vector.Image.Fitting}
     */
    public void fittingMode() {
        APIlib.getInstance().addJSLine(jsBase + ".fittingMode();");
    }
    /**
     * Setter for the fitting mode.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings fittingMode(String mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fittingMode(%s);", wrapQuotes(mode)));

        return this;
    }
    /**
     * Setter for the fitting mode.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings fittingMode(com.anychart.graphics.vector.image.Fitting mode) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fittingMode(%s);", (mode != null) ? mode.getJsBase() : null));

        return this;
    }
    /**
     * Getter for the margin.
     */
    public com.anychart.core.utils.Margin margin() {
        return new com.anychart.core.utils.Margin(jsBase + ".margin()");
    }
    /**
     * Setter for the margin using a single value.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(Number[] margin) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin)));

        return this;
    }
    /**
     * Setter for the margin using a single value.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(String[] margin) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", arrayToStringWrapQuotes(margin)));

        return this;
    }
    /**
     * Setter for the margin using a single value.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(String margin) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", wrapQuotes(margin)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings margin(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
    }
    /**
     * Getter for the image opacity.
     */
    public void opacity() {
        APIlib.getInstance().addJSLine(jsBase + ".opacity();");
    }
    /**
     * Setter for the image opacity.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings opacity(Number opacity) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".opacity(%s);", opacity));

        return this;
    }
    /**
     * Getter for the image size in item.
     */
    public void size() {
        APIlib.getInstance().addJSLine(jsBase + ".size();");
    }
    /**
     * Setter for the image size in item.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings size(String size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".size(%s);", wrapQuotes(size)));

        return this;
    }
    /**
     * Setter for the image size in item.
     */
    public com.anychart.core.resource.resourcelist.ImageSettings size(Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".size(%s);", size));

        return this;
    }

}