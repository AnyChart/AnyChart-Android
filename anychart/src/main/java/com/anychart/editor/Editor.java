package com.anychart.editor;

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
 * Editor class.
 */
public class Editor extends JsObject {

    protected Editor() {

    }

    public static Editor instantiate() {
        return new Editor("new anychart.editor.editor()");
    }

    

    public Editor(String jsChart) {
        jsBase = "editor" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Adds the given class name to the list of classes to be applied to the chart editor component root element.<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void addClassName(String className) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addClassName(%s);", wrapQuotes(className)));
    }
    /**
     * 
     */
    public void data(List<DataEntry> data) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".data(%s);", arrayToString(data)));
    }
    /**
     * Renders the Chart Editor as a modal dialog.<br/>
To set dialog visible or hidden use dialogVisible(boolean) method.<br/>
<br>
<i>To work with the Chart Editor you need to reference the extension file from AnyChart CDN
(example for the versioned file: https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void dialogRender() {
        APIlib.getInstance().addJSLine(jsBase + ".dialogRender();");
    }
    /**
     * Renders the Chart Editor as a modal dialog using class name.<br/>
To set dialog visible or hidden use dialogVisible(boolean) method.<br/>
<br>
<i>To work with the Chart Editor you need to reference the extension file from AnyChart CDN
(example for the versioned file: https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void dialogRender(String className) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dialogRender(%s);", wrapQuotes(className)));
    }
    /**
     * Getter for the visibility of the dialog box.<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void dialogVisible() {
        APIlib.getInstance().addJSLine(jsBase + ".dialogVisible();");
    }
    /**
     * Setter for the visibility of the dialog box.<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public com.anychart.editor.Editor dialogVisible(Boolean enabled) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".dialogVisible(%s);", enabled));

        return this;
    }
    /**
     * Disposes a chart editor. Removes it and its children from defs, clears the clip for managed elements.<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void dispose() {
        APIlib.getInstance().addJSLine(jsBase + ".dispose();");
    }
    /**
     * Returns javascript code string that creates a configured chart.<br/>
<br>
<i>To work with the Chart Editor you need to reference the extension file from AnyChart CDN
(example for the versioned file: https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void getJavascript() {
        APIlib.getInstance().addJSLine(jsBase + ".getJavascript();");
    }
    /**
     * Returns javascript code string using an object.<br/>
<br>
<i>To work with the Chart Editor you need to reference the extension file from AnyChart CDN
(example for the versioned file: https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void getJavascript(com.anychart.editor.JavascriptOptions outputOptions) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getJavascript(%s);", (outputOptions != null) ? outputOptions.getJsBase() : null));
    }
    /**
     * Returns the configured chart in the JSON representation.<br/>
<br>
<i>To work with the Chart Editor you need to reference the extension file from AnyChart CDN
(example for the versioned file: https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void getJson() {
        APIlib.getInstance().addJSLine(jsBase + ".getJson();");
    }
    /**
     * Returns configured chart in XML representation.<br/>
<br>
<i>To work with the Chart Editor you need to reference the extension file from AnyChart CDN
(example for the versioned file: https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void getXml() {
        APIlib.getInstance().addJSLine(jsBase + ".getXml();");
    }
    /**
     * Hides chart editor component in DOM by setting 'display: none' style to it's root element.<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void hide(Boolean hide) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".hide(%s);", hide));
    }
    /**
     * Sets anychart locale settings.<br>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public com.anychart.editor.Editor localization(String settings) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".localization(%s);", wrapQuotes(settings)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    /**
     * Removes the given class name from the list of classes to be applied to the chart editor component root element.<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void removeClassName(String className) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeClassName(%s);", wrapQuotes(className)));
    }
    /**
     * Shows chart editor component in DOM by removing 'display: none' style.<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void show(Boolean show) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".show(%s);", show));
    }
    /**
     * Getter for the step by its name.<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public com.anychart.editor.Step step(com.anychart.enums.EditorSteps stepName) {
        return new com.anychart.editor.Step(String.format(Locale.US, jsBase + ".step(%s)", (stepName != null) ? stepName.getJsBase() : null));
    }
    /**
     * Getter for the step by its name.<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public com.anychart.editor.Step step(String stepName) {
        return new com.anychart.editor.Step(String.format(Locale.US, jsBase + ".step(%s)", wrapQuotes(stepName)));
    }
    /**
     * Setter for the step settings.<br/>
Call this method only before {api:anychart.editor.Editor#render}render{api} chart editor.<br/>
Step is a screen of the chart editor.<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public com.anychart.editor.Step step(com.anychart.enums.EditorSteps stepName, Boolean value) {
        return new com.anychart.editor.Step(String.format(Locale.US, jsBase + ".step(%s, %s)", (stepName != null) ? stepName.getJsBase() : null, value));
    }
    /**
     * Setter for the step settings.<br/>
Call this method only before {api:anychart.editor.Editor#render}render{api} chart editor.<br/>
Step is a screen of the chart editor.<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public com.anychart.editor.Step step(String stepName, Boolean value) {
        return new com.anychart.editor.Step(String.format(Locale.US, jsBase + ".step(%s, %s)", wrapQuotes(stepName), value));
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
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().<br/>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }
    /**
     * Returns the current chart editor version.<br>
<br>
<i> To work with the Chart Editor you need to reference the extension file from AnyChart CDN (example for the versioned file:
https://cdn.anychart.com/releases/8.4.0/js/anychart-editor.min.js)</i>
     */
    public void version() {
        APIlib.getInstance().addJSLine(jsBase + ".version();");
    }

}