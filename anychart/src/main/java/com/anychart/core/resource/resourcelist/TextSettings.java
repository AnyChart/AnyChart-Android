package com.anychart.core.resource.resourcelist;

import com.anychart.APIlib;

import java.util.Arrays;
import java.util.Locale;

// class
/**
 * Class representing text settings for resource list items.
 */
public class TextSettings extends SettingsWithMargin {

    protected TextSettings() {

    }

    public static TextSettings instantiate() {
        return new TextSettings("new anychart.core.resource.resourceList.textSettings()");
    }

    

    public TextSettings(String jsChart) {
        jsBase = "textSettings" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the font color.
     */
    public void fontColor() {
        APIlib.getInstance().addJSLine(jsBase + ".fontColor();");
    }
    /**
     * Setter for the font color.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontColor(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontColor(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the text font decoration.
     */
    public void fontDecoration() {
        APIlib.getInstance().addJSLine(jsBase + ".fontDecoration();");
    }
    /**
     * Setter for the text font decoration.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontDecoration(com.anychart.graphics.vector.text.Decoration value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text font decoration.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontDecoration(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontDecoration(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the font family.
     */
    public void fontFamily() {
        APIlib.getInstance().addJSLine(jsBase + ".fontFamily();");
    }
    /**
     * Setter for the font family.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontFamily(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontFamily(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the font opacity.
     */
    public void fontOpacity() {
        APIlib.getInstance().addJSLine(jsBase + ".fontOpacity();");
    }
    /**
     * Setter for the font opacity.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontOpacity(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontOpacity(%s);", value));

        return this;
    }
    /**
     * Getter for the text font size.
     */
    public void fontSize() {
        APIlib.getInstance().addJSLine(jsBase + ".fontSize();");
    }
    /**
     * Setter for the text font size text.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontSize(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the text font size text.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontSize(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontSize(%s);", value));

        return this;
    }
    /**
     * Getter for the font style.
     */
    public void fontStyle() {
        APIlib.getInstance().addJSLine(jsBase + ".fontStyle();");
    }
    /**
     * Setter for the font style.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontStyle(com.anychart.graphics.vector.text.FontStyle value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the font style.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontStyle(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontStyle(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the font variant.
     */
    public void fontVariant() {
        APIlib.getInstance().addJSLine(jsBase + ".fontVariant();");
    }
    /**
     * Setter for the font variant.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontVariant(com.anychart.graphics.vector.text.FontVariant value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontVariant(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the font variant.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontVariant(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontVariant(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the font weight.
     */
    public void fontWeight() {
        APIlib.getInstance().addJSLine(jsBase + ".fontWeight();");
    }
    /**
     * Setter for the font weight.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontWeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the font weight.
     */
    public com.anychart.core.resource.resourcelist.TextSettings fontWeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".fontWeight(%s);", value));

        return this;
    }
    /**
     * Getter for the font horizontal align.
     */
    public void hAlign() {
        APIlib.getInstance().addJSLine(jsBase + ".hAlign();");
    }
    /**
     * Setter for the font horizontal align.
     */
    public com.anychart.core.resource.resourcelist.TextSettings hAlign(com.anychart.graphics.vector.text.HAlign value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the font horizontal align.
     */
    public com.anychart.core.resource.resourcelist.TextSettings hAlign(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hAlign(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the letter spacing.
     */
    public void letterSpacing() {
        APIlib.getInstance().addJSLine(jsBase + ".letterSpacing();");
    }
    /**
     * Setter for the letter spacing.
     */
    public com.anychart.core.resource.resourcelist.TextSettings letterSpacing(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".letterSpacing(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the letter spacing.
     */
    public com.anychart.core.resource.resourcelist.TextSettings letterSpacing(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".letterSpacing(%s);", value));

        return this;
    }
    /**
     * Getter for the font line height.
     */
    public void lineHeight() {
        APIlib.getInstance().addJSLine(jsBase + ".lineHeight();");
    }
    /**
     * Setter for the font line height.
     */
    public com.anychart.core.resource.resourcelist.TextSettings lineHeight(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineHeight(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the font line height.
     */
    public com.anychart.core.resource.resourcelist.TextSettings lineHeight(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".lineHeight(%s);", value));

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
    public com.anychart.core.resource.resourcelist.TextSettings margin(Number[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(value)));

        return this;
    }
    /**
     * Setter for the margin using a single value.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(String[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", arrayToStringWrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the margin using a single value.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(String value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(String value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(String value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(String value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(String value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(String value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(String value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(String value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", wrapQuotes(value1), value2, value3, value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(Number value1, String value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(Number value1, String value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(Number value1, String value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(Number value1, String value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, wrapQuotes(value2), value3, value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(Number value1, Number value2, String value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(Number value1, Number value2, String value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, wrapQuotes(value3), value4));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(Number value1, Number value2, Number value3, String value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, value3, wrapQuotes(value4)));

        return this;
    }
    /**
     * Setter for the callout margin using several values.
     */
    public com.anychart.core.resource.resourcelist.TextSettings margin(Number value1, Number value2, Number value3, Number value4) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value1, value2, value3, value4));

        return this;
    }
    /**
     * Getter for the text selectable.
     */
    public void selectable() {
        APIlib.getInstance().addJSLine(jsBase + ".selectable();");
    }
    /**
     * Setter for the text selectable.
     */
    public com.anychart.core.resource.resourcelist.TextSettings selectable(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".selectable(%s);", value));

        return this;
    }
    /**
     * Getter for the text direction.
     */
    public void textDirection() {
        APIlib.getInstance().addJSLine(jsBase + ".textDirection();");
    }
    /**
     * Setter for the text direction.
     */
    public com.anychart.core.resource.resourcelist.TextSettings textDirection(com.anychart.graphics.vector.text.Direction value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textDirection(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the text direction.
     */
    public com.anychart.core.resource.resourcelist.TextSettings textDirection(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textDirection(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for text indent settings.
     */
    public void textIndent() {
        APIlib.getInstance().addJSLine(jsBase + ".textIndent();");
    }
    /**
     * Setter for text indent settings.
     */
    public com.anychart.core.resource.resourcelist.TextSettings textIndent(Number value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textIndent(%s);", value));

        return this;
    }
    /**
     * Getter for text overflow settings.
     */
    public void textOverflow() {
        APIlib.getInstance().addJSLine(jsBase + ".textOverflow();");
    }
    /**
     * Setter for text overflow settings.
     */
    public com.anychart.core.resource.resourcelist.TextSettings textOverflow(com.anychart.graphics.vector.text.TextOverflow value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textOverflow(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for text overflow settings.
     */
    public com.anychart.core.resource.resourcelist.TextSettings textOverflow(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".textOverflow(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the useHTML flag.
     */
    public void useHtml() {
        APIlib.getInstance().addJSLine(jsBase + ".useHtml();");
    }
    /**
     * Setter for the useHTML flag.
     */
    public com.anychart.core.resource.resourcelist.TextSettings useHtml(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".useHtml(%s);", value));

        return this;
    }
    /**
     * Getter for the font vertical align.
     */
    public void vAlign() {
        APIlib.getInstance().addJSLine(jsBase + ".vAlign();");
    }
    /**
     * Setter for the font vertical align.
     */
    public com.anychart.core.resource.resourcelist.TextSettings vAlign(com.anychart.graphics.vector.text.VAlign value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the font vertical align.
     */
    public com.anychart.core.resource.resourcelist.TextSettings vAlign(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".vAlign(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the word-break mode.
     */
    public void wordBreak() {
        APIlib.getInstance().addJSLine(jsBase + ".wordBreak();");
    }
    /**
     * Setter for the word-break mode.
     */
    public com.anychart.core.resource.resourcelist.TextSettings wordBreak(com.anychart.enums.WordBreak value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordBreak(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the word-break mode.
     */
    public com.anychart.core.resource.resourcelist.TextSettings wordBreak(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordBreak(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Getter for the word-wrap mode.
     */
    public void wordWrap() {
        APIlib.getInstance().addJSLine(jsBase + ".wordWrap();");
    }
    /**
     * Setter for the word-wrap mode.
     */
    public com.anychart.core.resource.resourcelist.TextSettings wordWrap(com.anychart.enums.WordWrap value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordWrap(%s);", (value != null) ? value.getJsBase() : null));

        return this;
    }
    /**
     * Setter for the word-wrap mode.
     */
    public com.anychart.core.resource.resourcelist.TextSettings wordWrap(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".wordWrap(%s);", wrapQuotes(value)));

        return this;
    }

}