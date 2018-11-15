package com.anychart.palettes;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.Base;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * HatchFills palette class.
 */
public class HatchFills extends Base {

    protected HatchFills() {

    }

    public static HatchFills instantiate() {
        return new HatchFills("new anychart.palettes.hatchFills()");
    }

    

    public HatchFills(String jsChart) {
        jsBase = "hatchFills" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for type palette HatchFills from list by index.
     */
    public com.anychart.graphics.vector.HatchFill itemAt(Number index) {
        return new com.anychart.graphics.vector.HatchFill(String.format(Locale.US, jsBase + ".itemAt(%s)", index));
    }
    /**
     * Setter for type palette HatchFills from list by index.
     */
    public com.anychart.palettes.HatchFills itemAt(Number index, com.anychart.graphics.vector.hatchfill.HatchFillType type, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemAt(%s, %s, %s, %s, %s);", index, (type != null) ? type.getJsBase() : null, wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for type palette HatchFills from list by index.
     */
    public com.anychart.palettes.HatchFills itemAt(Number index, String type, String color, Number thickness, Number size) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemAt(%s, %s, %s, %s, %s);", index, wrapQuotes(type), wrapQuotes(color), thickness, size));

        return this;
    }
    /**
     * Setter for type palette HatchFills from list by index using patternFill.
     */
    public com.anychart.palettes.HatchFills itemAt(Number index, com.anychart.graphics.vector.PatternFill patternFill) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemAt(%s, %s);", index, (patternFill != null) ? patternFill.getJsBase() : null));

        return this;
    }
    /**
     * Setter for type palette HatchFills from list by index using instance.
     */
    public com.anychart.palettes.HatchFills itemAt(Number index, com.anychart.graphics.vector.HatchFill instance) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemAt(%s, %s);", index, (instance != null) ? instance.getJsBase() : null));

        return this;
    }
    /**
     * Enables/disables type palette HatchFills from list by index.
     */
    public com.anychart.palettes.HatchFills itemAt(Number index, Boolean state) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemAt(%s, %s);", index, state));

        return this;
    }
    /**
     * Getter for HatchFills list of palette.
     */
    public void items() {
        APIlib.getInstance().addJSLine(jsBase + ".items();");
    }
    /**
     * Setter for HatchFills list of palette.
     */
    public com.anychart.palettes.HatchFills items(com.anychart.graphics.vector.HatchFill hatchFill, com.anychart.graphics.vector.HatchFill var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", (hatchFill != null) ? hatchFill.getJsBase() : null, (var_args != null) ? var_args.getJsBase() : null));

        return this;
    }
    /**
     * Setter for HatchFills list of palette.
     */
    public com.anychart.palettes.HatchFills items(com.anychart.graphics.vector.HatchFill hatchFill, com.anychart.graphics.vector.hatchfill.HatchFillType var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", (hatchFill != null) ? hatchFill.getJsBase() : null, (var_args != null) ? var_args.getJsBase() : null));

        return this;
    }
    /**
     * Setter for HatchFills list of palette.
     */
    public com.anychart.palettes.HatchFills items(com.anychart.graphics.vector.HatchFill hatchFill, com.anychart.graphics.vector.PatternFill var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", (hatchFill != null) ? hatchFill.getJsBase() : null, (var_args != null) ? var_args.getJsBase() : null));

        return this;
    }
    /**
     * Setter for HatchFills list of palette.
     */
    public com.anychart.palettes.HatchFills items(com.anychart.graphics.vector.hatchfill.HatchFillType hatchFill, com.anychart.graphics.vector.HatchFill var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", (hatchFill != null) ? hatchFill.getJsBase() : null, (var_args != null) ? var_args.getJsBase() : null));

        return this;
    }
    /**
     * Setter for HatchFills list of palette.
     */
    public com.anychart.palettes.HatchFills items(com.anychart.graphics.vector.hatchfill.HatchFillType hatchFill, com.anychart.graphics.vector.hatchfill.HatchFillType var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", (hatchFill != null) ? hatchFill.getJsBase() : null, (var_args != null) ? var_args.getJsBase() : null));

        return this;
    }
    /**
     * Setter for HatchFills list of palette.
     */
    public com.anychart.palettes.HatchFills items(com.anychart.graphics.vector.hatchfill.HatchFillType hatchFill, com.anychart.graphics.vector.PatternFill var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", (hatchFill != null) ? hatchFill.getJsBase() : null, (var_args != null) ? var_args.getJsBase() : null));

        return this;
    }
    /**
     * Setter for HatchFills list of palette.
     */
    public com.anychart.palettes.HatchFills items(com.anychart.graphics.vector.PatternFill hatchFill, com.anychart.graphics.vector.HatchFill var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", (hatchFill != null) ? hatchFill.getJsBase() : null, (var_args != null) ? var_args.getJsBase() : null));

        return this;
    }
    /**
     * Setter for HatchFills list of palette.
     */
    public com.anychart.palettes.HatchFills items(com.anychart.graphics.vector.PatternFill hatchFill, com.anychart.graphics.vector.hatchfill.HatchFillType var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", (hatchFill != null) ? hatchFill.getJsBase() : null, (var_args != null) ? var_args.getJsBase() : null));

        return this;
    }
    /**
     * Setter for HatchFills list of palette.
     */
    public com.anychart.palettes.HatchFills items(com.anychart.graphics.vector.PatternFill hatchFill, com.anychart.graphics.vector.PatternFill var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s, %s);", (hatchFill != null) ? hatchFill.getJsBase() : null, (var_args != null) ? var_args.getJsBase() : null));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(".listen('pointClick', function(e) {");

        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }

    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener, String type, String ePath) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(String.format(Locale.US, ".listen('%1$s', function(e) {", type));

        if (listener.getFields() != null) {
            ePath = (ePath != null) ? ePath + "." : "";
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.%2$s%1$s + ',' +", field, ePath));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }

}