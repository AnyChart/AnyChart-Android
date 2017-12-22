package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Base class for Row, Column and Cell. Contains text settings and lazy settings object initialization.
Also knows about table, so it can send messages to the table.
 */
public class TableTimeline extends JsObject {

    public TableTimeline() {
        js.setLength(0);
        js.append("var tableTimeline").append(++variableIndex).append(" = anychart.core.ui.table.base();");
        jsBase = "tableTimeline" + variableIndex;
    }

    protected TableTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TableTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Border getBorder;

    /**
     * Getter for border settings object.
     */
    public Border getBorder() {
        if (getBorder == null)
            getBorder = new Border(jsBase + ".border()");

        return getBorder;
    }

    private Stroke color;
    private ColoredFill color1;
    private String color2;
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<ScalesTimeline> setBorder = new ArrayList<>();

    /**
     * Setter for cell border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScalesTimeline setBorder(Stroke color, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setBorder" + ++variableIndex + " = " + jsBase + ".border(%s, %f, %s, %s, %s);", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".border(%s, %f, %s, %s, %s);", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setBorder" + variableIndex);
        setBorder.add(item);
        return item;
    }
    private String generateJSsetBorder() {
        if (!setBorder.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setBorder) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setBorder1 = new ArrayList<>();

    /**
     * Setter for cell border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScalesTimeline setBorder(ColoredFill color1, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setBorder1" + ++variableIndex + " = " + jsBase + ".border(%s, %f, %s, %s, %s);", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".border(%s, %f, %s, %s, %s);", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setBorder1" + variableIndex);
        setBorder1.add(item);
        return item;
    }
    private String generateJSsetBorder1() {
        if (!setBorder1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setBorder1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setBorder2 = new ArrayList<>();

    /**
     * Setter for cell border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ScalesTimeline setBorder(String color2, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setBorder2" + ++variableIndex + " = " + jsBase + ".border(%s, %f, %s, %s, %s);", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".border(%s, %f, %s, %s, %s);", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setBorder2" + variableIndex);
        setBorder2.add(item);
        return item;
    }
    private String generateJSsetBorder2() {
        if (!setBorder2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setBorder2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean disablePointerEvents;
    private List<ScalesTimeline> setDisablePointerEvents = new ArrayList<>();

    /**
     * Setter for the text disablePointerEvents option.
     */
    public ScalesTimeline setDisablePointerEvents(Boolean disablePointerEvents) {
        if (jsBase == null) {
            this.disablePointerEvents = disablePointerEvents;
        } else {
            this.disablePointerEvents = disablePointerEvents;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setDisablePointerEvents" + ++variableIndex + " = " + jsBase + ".disablePointerEvents(%b);", disablePointerEvents));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".disablePointerEvents(%b);", disablePointerEvents));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setDisablePointerEvents" + variableIndex);
        setDisablePointerEvents.add(item);
        return item;
    }
    private String generateJSsetDisablePointerEvents() {
        if (!setDisablePointerEvents.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setDisablePointerEvents) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontColor;
    private List<ScalesTimeline> setFontColor = new ArrayList<>();

    /**
     * Setter for the text font color. {@link https://www.w3schools.com/html/html_colors.asp}
     */
    public ScalesTimeline setFontColor(String fontColor) {
        if (jsBase == null) {
            this.fontColor = fontColor;
        } else {
            this.fontColor = fontColor;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontColor" + ++variableIndex + " = " + jsBase + ".fontColor(%s);", wrapQuotes(fontColor)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontColor(%s);", wrapQuotes(fontColor)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontColor" + variableIndex);
        setFontColor.add(item);
        return item;
    }
    private String generateJSsetFontColor() {
        if (!setFontColor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontColor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Decoration fontDecoration;
    private String fontDecoration1;
    private List<ScalesTimeline> setFontDecoration = new ArrayList<>();

    /**
     * Setter for the text font decoration.
     */
    public ScalesTimeline setFontDecoration(Decoration fontDecoration) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration = fontDecoration;
        } else {
            this.fontDecoration = fontDecoration;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontDecoration" + ++variableIndex + " = " + jsBase + ".fontDecoration(%s);", ((fontDecoration != null) ? fontDecoration.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontDecoration(%s);", ((fontDecoration != null) ? fontDecoration.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontDecoration" + variableIndex);
        setFontDecoration.add(item);
        return item;
    }
    private String generateJSsetFontDecoration() {
        if (!setFontDecoration.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontDecoration) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setFontDecoration1 = new ArrayList<>();

    /**
     * Setter for the text font decoration.
     */
    public ScalesTimeline setFontDecoration(String fontDecoration1) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration1 = fontDecoration1;
        } else {
            this.fontDecoration1 = fontDecoration1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontDecoration1" + ++variableIndex + " = " + jsBase + ".fontDecoration(%s);", wrapQuotes(fontDecoration1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontDecoration(%s);", wrapQuotes(fontDecoration1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontDecoration1" + variableIndex);
        setFontDecoration1.add(item);
        return item;
    }
    private String generateJSsetFontDecoration1() {
        if (!setFontDecoration1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontDecoration1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontFamily;
    private List<ScalesTimeline> setFontFamily = new ArrayList<>();

    /**
     * Setter for the font family.
     */
    public ScalesTimeline setFontFamily(String fontFamily) {
        if (jsBase == null) {
            this.fontFamily = fontFamily;
        } else {
            this.fontFamily = fontFamily;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontFamily" + ++variableIndex + " = " + jsBase + ".fontFamily(%s);", wrapQuotes(fontFamily)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontFamily(%s);", wrapQuotes(fontFamily)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontFamily" + variableIndex);
        setFontFamily.add(item);
        return item;
    }
    private String generateJSsetFontFamily() {
        if (!setFontFamily.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontFamily) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number fontOpacity;
    private List<ScalesTimeline> setFontOpacity = new ArrayList<>();

    /**
     * Setter for the text font opacity. Double value from 0 to 1.
     */
    public ScalesTimeline setFontOpacity(Number fontOpacity) {
        if (jsBase == null) {
            this.fontOpacity = fontOpacity;
        } else {
            this.fontOpacity = fontOpacity;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontOpacity" + ++variableIndex + " = " + jsBase + ".fontOpacity(%f);", fontOpacity));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontOpacity(%f);", fontOpacity));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontOpacity" + variableIndex);
        setFontOpacity.add(item);
        return item;
    }
    private String generateJSsetFontOpacity() {
        if (!setFontOpacity.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontOpacity) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontSize;
    private Number fontSize1;
    private List<ScalesTimeline> setFontSize = new ArrayList<>();

    /**
     * Setter for text font size.
     */
    public ScalesTimeline setFontSize(String fontSize) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize = fontSize;
        } else {
            this.fontSize = fontSize;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontSize" + ++variableIndex + " = " + jsBase + ".fontSize(%s);", wrapQuotes(fontSize)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%s);", wrapQuotes(fontSize)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontSize" + variableIndex);
        setFontSize.add(item);
        return item;
    }
    private String generateJSsetFontSize() {
        if (!setFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setFontSize1 = new ArrayList<>();

    /**
     * Setter for text font size.
     */
    public ScalesTimeline setFontSize(Number fontSize1) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize1 = fontSize1;
        } else {
            this.fontSize1 = fontSize1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontSize1" + ++variableIndex + " = " + jsBase + ".fontSize(%f);", fontSize1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%f);", fontSize1));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontSize1" + variableIndex);
        setFontSize1.add(item);
        return item;
    }
    private String generateJSsetFontSize1() {
        if (!setFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextFontStyle fontStyle;
    private String fontStyle1;
    private List<ScalesTimeline> setFontStyle = new ArrayList<>();

    /**
     * Setter for the text font style.
     */
    public ScalesTimeline setFontStyle(TextFontStyle fontStyle) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle = fontStyle;
        } else {
            this.fontStyle = fontStyle;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontStyle" + ++variableIndex + " = " + jsBase + ".fontStyle(%s);", ((fontStyle != null) ? fontStyle.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", ((fontStyle != null) ? fontStyle.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontStyle" + variableIndex);
        setFontStyle.add(item);
        return item;
    }
    private String generateJSsetFontStyle() {
        if (!setFontStyle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontStyle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setFontStyle1 = new ArrayList<>();

    /**
     * Setter for the text font style.
     */
    public ScalesTimeline setFontStyle(String fontStyle1) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle1 = fontStyle1;
        } else {
            this.fontStyle1 = fontStyle1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontStyle1" + ++variableIndex + " = " + jsBase + ".fontStyle(%s);", wrapQuotes(fontStyle1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", wrapQuotes(fontStyle1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontStyle1" + variableIndex);
        setFontStyle1.add(item);
        return item;
    }
    private String generateJSsetFontStyle1() {
        if (!setFontStyle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontStyle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextFontVariant fontVariant;
    private String fontVariant1;
    private List<ScalesTimeline> setFontVariant = new ArrayList<>();

    /**
     * Setter for the text font variant.
     */
    public ScalesTimeline setFontVariant(TextFontVariant fontVariant) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant = fontVariant;
        } else {
            this.fontVariant = fontVariant;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontVariant" + ++variableIndex + " = " + jsBase + ".fontVariant(%s);", ((fontVariant != null) ? fontVariant.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", ((fontVariant != null) ? fontVariant.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontVariant" + variableIndex);
        setFontVariant.add(item);
        return item;
    }
    private String generateJSsetFontVariant() {
        if (!setFontVariant.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontVariant) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setFontVariant1 = new ArrayList<>();

    /**
     * Setter for the text font variant.
     */
    public ScalesTimeline setFontVariant(String fontVariant1) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant1 = fontVariant1;
        } else {
            this.fontVariant1 = fontVariant1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontVariant1" + ++variableIndex + " = " + jsBase + ".fontVariant(%s);", wrapQuotes(fontVariant1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", wrapQuotes(fontVariant1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontVariant1" + variableIndex);
        setFontVariant1.add(item);
        return item;
    }
    private String generateJSsetFontVariant1() {
        if (!setFontVariant1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontVariant1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontWeight;
    private Number fontWeight1;
    private List<ScalesTimeline> setFontWeight = new ArrayList<>();

    /**
     * Setter for the text font weight. {@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public ScalesTimeline setFontWeight(String fontWeight) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight = fontWeight;
        } else {
            this.fontWeight = fontWeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontWeight" + ++variableIndex + " = " + jsBase + ".fontWeight(%s);", wrapQuotes(fontWeight)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%s);", wrapQuotes(fontWeight)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontWeight" + variableIndex);
        setFontWeight.add(item);
        return item;
    }
    private String generateJSsetFontWeight() {
        if (!setFontWeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontWeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setFontWeight1 = new ArrayList<>();

    /**
     * Setter for the text font weight. {@link https://www.w3schools.com/cssref/pr_font_weight.asp}
     */
    public ScalesTimeline setFontWeight(Number fontWeight1) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight1 = fontWeight1;
        } else {
            this.fontWeight1 = fontWeight1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setFontWeight1" + ++variableIndex + " = " + jsBase + ".fontWeight(%f);", fontWeight1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%f);", fontWeight1));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setFontWeight1" + variableIndex);
        setFontWeight1.add(item);
        return item;
    }
    private String generateJSsetFontWeight1() {
        if (!setFontWeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setFontWeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextHAlign hAlign;
    private String hAlign1;
    private List<ScalesTimeline> setHAlign = new ArrayList<>();

    /**
     * Setter for the text horizontal align.
     */
    public ScalesTimeline setHAlign(TextHAlign hAlign) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign = hAlign;
        } else {
            this.hAlign = hAlign;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHAlign" + ++variableIndex + " = " + jsBase + ".hAlign(%s);", ((hAlign != null) ? hAlign.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", ((hAlign != null) ? hAlign.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setHAlign" + variableIndex);
        setHAlign.add(item);
        return item;
    }
    private String generateJSsetHAlign() {
        if (!setHAlign.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setHAlign) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setHAlign1 = new ArrayList<>();

    /**
     * Setter for the text horizontal align.
     */
    public ScalesTimeline setHAlign(String hAlign1) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign1 = hAlign1;
        } else {
            this.hAlign1 = hAlign1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHAlign1" + ++variableIndex + " = " + jsBase + ".hAlign(%s);", wrapQuotes(hAlign1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", wrapQuotes(hAlign1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setHAlign1" + variableIndex);
        setHAlign1.add(item);
        return item;
    }
    private String generateJSsetHAlign1() {
        if (!setHAlign1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setHAlign1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String letterSpacing;
    private Number letterSpacing1;
    private List<ScalesTimeline> setLetterSpacing = new ArrayList<>();

    /**
     * Setter for the text letter spacing. {@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public ScalesTimeline setLetterSpacing(String letterSpacing) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing = letterSpacing;
        } else {
            this.letterSpacing = letterSpacing;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLetterSpacing" + ++variableIndex + " = " + jsBase + ".letterSpacing(%s);", wrapQuotes(letterSpacing)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".letterSpacing(%s);", wrapQuotes(letterSpacing)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setLetterSpacing" + variableIndex);
        setLetterSpacing.add(item);
        return item;
    }
    private String generateJSsetLetterSpacing() {
        if (!setLetterSpacing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setLetterSpacing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setLetterSpacing1 = new ArrayList<>();

    /**
     * Setter for the text letter spacing. {@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public ScalesTimeline setLetterSpacing(Number letterSpacing1) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing1 = letterSpacing1;
        } else {
            this.letterSpacing1 = letterSpacing1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLetterSpacing1" + ++variableIndex + " = " + jsBase + ".letterSpacing(%f);", letterSpacing1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".letterSpacing(%f);", letterSpacing1));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setLetterSpacing1" + variableIndex);
        setLetterSpacing1.add(item);
        return item;
    }
    private String generateJSsetLetterSpacing1() {
        if (!setLetterSpacing1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setLetterSpacing1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String lineHeight;
    private Number lineHeight1;
    private List<ScalesTimeline> setLineHeight = new ArrayList<>();

    /**
     * Setter for the text line height. {@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public ScalesTimeline setLineHeight(String lineHeight) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight = lineHeight;
        } else {
            this.lineHeight = lineHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLineHeight" + ++variableIndex + " = " + jsBase + ".lineHeight(%s);", wrapQuotes(lineHeight)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%s);", wrapQuotes(lineHeight)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setLineHeight" + variableIndex);
        setLineHeight.add(item);
        return item;
    }
    private String generateJSsetLineHeight() {
        if (!setLineHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setLineHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setLineHeight1 = new ArrayList<>();

    /**
     * Setter for the text line height. {@link https://www.w3schools.com/cssref/pr_text_letter-spacing.asp}
     */
    public ScalesTimeline setLineHeight(Number lineHeight1) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight1 = lineHeight1;
        } else {
            this.lineHeight1 = lineHeight1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLineHeight1" + ++variableIndex + " = " + jsBase + ".lineHeight(%f);", lineHeight1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%f);", lineHeight1));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setLineHeight1" + variableIndex);
        setLineHeight1.add(item);
        return item;
    }
    private String generateJSsetLineHeight1() {
        if (!setLineHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setLineHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean selectable;
    private List<ScalesTimeline> setSelectable = new ArrayList<>();

    /**
     * Setter for the text selectable.
     */
    public ScalesTimeline setSelectable(Boolean selectable) {
        if (jsBase == null) {
            this.selectable = selectable;
        } else {
            this.selectable = selectable;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSelectable" + ++variableIndex + " = " + jsBase + ".selectable(%b);", selectable));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectable(%b);", selectable));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setSelectable" + variableIndex);
        setSelectable.add(item);
        return item;
    }
    private String generateJSsetSelectable() {
        if (!setSelectable.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setSelectable) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Direction textDirection;
    private String textDirection1;
    private List<ScalesTimeline> setTextDirection = new ArrayList<>();

    /**
     * Setter for the text direction.
     */
    public ScalesTimeline setTextDirection(Direction textDirection) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection = textDirection;
        } else {
            this.textDirection = textDirection;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setTextDirection" + ++variableIndex + " = " + jsBase + ".textDirection(%s);", ((textDirection != null) ? textDirection.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", ((textDirection != null) ? textDirection.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setTextDirection" + variableIndex);
        setTextDirection.add(item);
        return item;
    }
    private String generateJSsetTextDirection() {
        if (!setTextDirection.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setTextDirection) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setTextDirection1 = new ArrayList<>();

    /**
     * Setter for the text direction.
     */
    public ScalesTimeline setTextDirection(String textDirection1) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection1 = textDirection1;
        } else {
            this.textDirection1 = textDirection1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setTextDirection1" + ++variableIndex + " = " + jsBase + ".textDirection(%s);", wrapQuotes(textDirection1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", wrapQuotes(textDirection1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setTextDirection1" + variableIndex);
        setTextDirection1.add(item);
        return item;
    }
    private String generateJSsetTextDirection1() {
        if (!setTextDirection1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setTextDirection1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number textIndent;
    private List<ScalesTimeline> setTextIndent = new ArrayList<>();

    /**
     * Setter for the text indent.
     */
    public ScalesTimeline setTextIndent(Number textIndent) {
        if (jsBase == null) {
            this.textIndent = textIndent;
        } else {
            this.textIndent = textIndent;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setTextIndent" + ++variableIndex + " = " + jsBase + ".textIndent(%f);", textIndent));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textIndent(%f);", textIndent));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setTextIndent" + variableIndex);
        setTextIndent.add(item);
        return item;
    }
    private String generateJSsetTextIndent() {
        if (!setTextIndent.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setTextIndent) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextOverflow textOverflow;
    private String textOverflow1;
    private List<ScalesTimeline> setTextOverflow = new ArrayList<>();

    /**
     * Setter for the text overflow settings.
     */
    public ScalesTimeline setTextOverflow(TextOverflow textOverflow) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow = textOverflow;
        } else {
            this.textOverflow = textOverflow;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setTextOverflow" + ++variableIndex + " = " + jsBase + ".textOverflow(%s);", ((textOverflow != null) ? textOverflow.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textOverflow(%s);", ((textOverflow != null) ? textOverflow.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setTextOverflow" + variableIndex);
        setTextOverflow.add(item);
        return item;
    }
    private String generateJSsetTextOverflow() {
        if (!setTextOverflow.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setTextOverflow) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setTextOverflow1 = new ArrayList<>();

    /**
     * Setter for the text overflow settings.
     */
    public ScalesTimeline setTextOverflow(String textOverflow1) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow1 = textOverflow1;
        } else {
            this.textOverflow1 = textOverflow1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setTextOverflow1" + ++variableIndex + " = " + jsBase + ".textOverflow(%s);", wrapQuotes(textOverflow1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textOverflow(%s);", wrapQuotes(textOverflow1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setTextOverflow1" + variableIndex);
        setTextOverflow1.add(item);
        return item;
    }
    private String generateJSsetTextOverflow1() {
        if (!setTextOverflow1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setTextOverflow1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean useHtml;
    private List<ScalesTimeline> setUseHtml = new ArrayList<>();

    /**
     * Setter for flag useHtml.
     */
    public ScalesTimeline setUseHtml(Boolean useHtml) {
        if (jsBase == null) {
            this.useHtml = useHtml;
        } else {
            this.useHtml = useHtml;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setUseHtml" + ++variableIndex + " = " + jsBase + ".useHtml(%b);", useHtml));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".useHtml(%b);", useHtml));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setUseHtml" + variableIndex);
        setUseHtml.add(item);
        return item;
    }
    private String generateJSsetUseHtml() {
        if (!setUseHtml.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setUseHtml) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextVAlign vAlign;
    private String vAlign1;
    private List<ScalesTimeline> setVAlign = new ArrayList<>();

    /**
     * Setter for the text vertical align.
     */
    public ScalesTimeline setVAlign(TextVAlign vAlign) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign = vAlign;
        } else {
            this.vAlign = vAlign;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setVAlign" + ++variableIndex + " = " + jsBase + ".vAlign(%s);", ((vAlign != null) ? vAlign.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", ((vAlign != null) ? vAlign.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setVAlign" + variableIndex);
        setVAlign.add(item);
        return item;
    }
    private String generateJSsetVAlign() {
        if (!setVAlign.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setVAlign) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setVAlign1 = new ArrayList<>();

    /**
     * Setter for the text vertical align.
     */
    public ScalesTimeline setVAlign(String vAlign1) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign1 = vAlign1;
        } else {
            this.vAlign1 = vAlign1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setVAlign1" + ++variableIndex + " = " + jsBase + ".vAlign(%s);", wrapQuotes(vAlign1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", wrapQuotes(vAlign1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setVAlign1" + variableIndex);
        setVAlign1.add(item);
        return item;
    }
    private String generateJSsetVAlign1() {
        if (!setVAlign1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setVAlign1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private EnumsWordBreak wordBreak;
    private String wordBreak1;
    private List<ScalesTimeline> setWordBreak = new ArrayList<>();

    /**
     * Setter for the word-break mode.
     */
    public ScalesTimeline setWordBreak(EnumsWordBreak wordBreak) {
        if (jsBase == null) {
            this.wordBreak = null;
            this.wordBreak1 = null;
            
            this.wordBreak = wordBreak;
        } else {
            this.wordBreak = wordBreak;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setWordBreak" + ++variableIndex + " = " + jsBase + ".wordBreak(%s);", ((wordBreak != null) ? wordBreak.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".wordBreak(%s);", ((wordBreak != null) ? wordBreak.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setWordBreak" + variableIndex);
        setWordBreak.add(item);
        return item;
    }
    private String generateJSsetWordBreak() {
        if (!setWordBreak.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setWordBreak) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setWordBreak1 = new ArrayList<>();

    /**
     * Setter for the word-break mode.
     */
    public ScalesTimeline setWordBreak(String wordBreak1) {
        if (jsBase == null) {
            this.wordBreak = null;
            this.wordBreak1 = null;
            
            this.wordBreak1 = wordBreak1;
        } else {
            this.wordBreak1 = wordBreak1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setWordBreak1" + ++variableIndex + " = " + jsBase + ".wordBreak(%s);", wrapQuotes(wordBreak1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".wordBreak(%s);", wrapQuotes(wordBreak1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setWordBreak1" + variableIndex);
        setWordBreak1.add(item);
        return item;
    }
    private String generateJSsetWordBreak1() {
        if (!setWordBreak1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setWordBreak1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private EnumsWordWrap wordWrap;
    private String wordWrap1;
    private List<ScalesTimeline> setWordWrap = new ArrayList<>();

    /**
     * Setter for the word-wrap mode.
     */
    public ScalesTimeline setWordWrap(EnumsWordWrap wordWrap) {
        if (jsBase == null) {
            this.wordWrap = null;
            this.wordWrap1 = null;
            
            this.wordWrap = wordWrap;
        } else {
            this.wordWrap = wordWrap;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setWordWrap" + ++variableIndex + " = " + jsBase + ".wordWrap(%s);", ((wordWrap != null) ? wordWrap.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".wordWrap(%s);", ((wordWrap != null) ? wordWrap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setWordWrap" + variableIndex);
        setWordWrap.add(item);
        return item;
    }
    private String generateJSsetWordWrap() {
        if (!setWordWrap.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setWordWrap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setWordWrap1 = new ArrayList<>();

    /**
     * Setter for the word-wrap mode.
     */
    public ScalesTimeline setWordWrap(String wordWrap1) {
        if (jsBase == null) {
            this.wordWrap = null;
            this.wordWrap1 = null;
            
            this.wordWrap1 = wordWrap1;
        } else {
            this.wordWrap1 = wordWrap1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setWordWrap1" + ++variableIndex + " = " + jsBase + ".wordWrap(%s);", wrapQuotes(wordWrap1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".wordWrap(%s);", wrapQuotes(wordWrap1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setWordWrap1" + variableIndex);
        setWordWrap1.add(item);
        return item;
    }
    private String generateJSsetWordWrap1() {
        if (!setWordWrap1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setWordWrap1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetBorder() {
        if (getBorder != null) {
            return getBorder.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetBorder());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetBorder());
        js.append(generateJSsetBorder1());
        js.append(generateJSsetBorder2());
        js.append(generateJSsetDisablePointerEvents());
        js.append(generateJSsetFontColor());
        js.append(generateJSsetFontDecoration());
        js.append(generateJSsetFontDecoration1());
        js.append(generateJSsetFontFamily());
        js.append(generateJSsetFontOpacity());
        js.append(generateJSsetFontSize());
        js.append(generateJSsetFontSize1());
        js.append(generateJSsetFontStyle());
        js.append(generateJSsetFontStyle1());
        js.append(generateJSsetFontVariant());
        js.append(generateJSsetFontVariant1());
        js.append(generateJSsetFontWeight());
        js.append(generateJSsetFontWeight1());
        js.append(generateJSsetHAlign());
        js.append(generateJSsetHAlign1());
        js.append(generateJSsetLetterSpacing());
        js.append(generateJSsetLetterSpacing1());
        js.append(generateJSsetLineHeight());
        js.append(generateJSsetLineHeight1());
        js.append(generateJSsetSelectable());
        js.append(generateJSsetTextDirection());
        js.append(generateJSsetTextDirection1());
        js.append(generateJSsetTextIndent());
        js.append(generateJSsetTextOverflow());
        js.append(generateJSsetTextOverflow1());
        js.append(generateJSsetUseHtml());
        js.append(generateJSsetVAlign());
        js.append(generateJSsetVAlign1());
        js.append(generateJSsetWordBreak());
        js.append(generateJSsetWordBreak1());
        js.append(generateJSsetWordWrap());
        js.append(generateJSsetWordWrap1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}