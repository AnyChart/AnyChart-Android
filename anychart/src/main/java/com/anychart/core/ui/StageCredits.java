package com.anychart.core.ui;

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
 * Define class Credits.<br/>
<b>Note:</b> Use {@link anychart.ui#credits} method to create instance of this class.<br/>
<b>Note:</b> You can't customize credits without <u>a license key</u>. See <a href="https://www.anychart.com/buy/">AnyChart Licensing</a> to learn more.
 */
public class StageCredits extends JsObject {

    protected StageCredits() {

    }

    public static StageCredits instantiate() {
        return new StageCredits("new anychart.core.ui.stageCredits()");
    }

    

    public StageCredits(String jsChart) {
        jsBase = "stageCredits" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for credits alternative text.
     */
    public void alt() {
        APIlib.getInstance().addJSLine(jsBase + ".alt();");
    }
    /**
     * Setter for credits alternative text.
     */
    public com.anychart.core.ui.StageCredits alt(String text) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".alt(%s);", wrapQuotes(text)));

        return this;
    }
    /**
     * Getter for the sateg credits state.
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the stage credits state.
     */
    public com.anychart.core.ui.StageCredits enabled(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", enabled));

        return this;
    }
    /**
     * Getter for the image alternative text.
     */
    public void imgAlt() {
        APIlib.getInstance().addJSLine(jsBase + ".imgAlt();");
    }
    /**
     * Setter for the image alternative text.
     */
    public com.anychart.core.ui.StageCredits imgAlt(String alt) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".imgAlt(%s);", wrapQuotes(alt)));

        return this;
    }
    /**
     * Getter for credits logo source.
     */
    public void logoSrc() {
        APIlib.getInstance().addJSLine(jsBase + ".logoSrc();");
    }
    /**
     * Setter for credits logo source.<br/>
<b>Note:</b> <b>Note:</b> You can't customize credits without <u>a license key</u>. See <a href="https://www.anychart.com/buy/">AnyChart Licensing</a> to learn more.
     */
    public com.anychart.core.ui.StageCredits logoSrc(String logoSrc) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".logoSrc(%s);", wrapQuotes(logoSrc)));

        return this;
    }
    /**
     * Getter for credits text value.
     */
    public void text() {
        APIlib.getInstance().addJSLine(jsBase + ".text();");
    }
    /**
     * Setter for credits text value.
     */
    public com.anychart.core.ui.StageCredits text(String text) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".text(%s);", wrapQuotes(text)));

        return this;
    }
    /**
     * Getter for credits URL address.
     */
    public void url() {
        APIlib.getInstance().addJSLine(jsBase + ".url();");
    }
    /**
     * Setter for credits URL.
     */
    public com.anychart.core.ui.StageCredits url(String url) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".url(%s);", wrapQuotes(url)));

        return this;
    }

}