package com.anychart.ui;

import com.anychart.APIlib;
import com.anychart.JsObject;
import com.anychart.chart.common.listener.ListenersInterface;

import java.util.Locale;

// class
/**
 * The ContextMenu class contains methods for configuring context menu.
 */
public class ContextMenu extends JsObject {

    protected ContextMenu() {

    }

    public static ContextMenu instantiate() {
        return new ContextMenu("new anychart.ui.contextMenu()");
    }

    

    public ContextMenu(String jsChart) {
        jsBase = "contextMenu" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Setter for the class name.
     */
    public void addClassName(String className) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addClassName(%s);", wrapQuotes(className)));
    }
    /**
     * Attaches the context menu to a chart or DOM element.
     */
    public com.anychart.ui.ContextMenu attach(com.anychart.core.Chart target, Boolean capture) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".attach(%s, %s);", (target != null) ? target.getJsBase() : null, capture));

        return this;
    }
    /**
     * Getter for the context menu state (enabled or disabled).
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the context menu enabled state.
     */
    public com.anychart.ui.ContextMenu enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Hides the context menu.
     */
    public void hide() {
        APIlib.getInstance().addJSLine(jsBase + ".hide();");
    }
    /**
     * Getter for the context menu items.
     */
    public void items() {
        APIlib.getInstance().addJSLine(jsBase + ".items();");
    }
    /**
     * Setter for the context menu items.
     */
    public com.anychart.ui.ContextMenu items(com.anychart.ui.contextmenu.Item[] value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".items(%s);", arrayToString(value)));

        return this;
    }
    /**
     * Getter for the items formatter.
     */
    public void itemsFormatter() {
        APIlib.getInstance().addJSLine(jsBase + ".itemsFormatter();");
    }
    /**
     * Getter for the items provider.<br/>
<b>Note</b>: Items provider called before items formatter.
     */
    public void itemsProvider() {
        APIlib.getInstance().addJSLine(jsBase + ".itemsProvider();");
    }
    /**
     * Setter for the items provider.
     */
    public com.anychart.ui.ContextMenu itemsProvider(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".itemsProvider(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Adds an event listener for an event to a context menu.
     */
    public void listen(String type, String listener, Boolean useCapture, String listenerScope) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".listen(%s, %s, %s, %s);", wrapQuotes(type), wrapQuotes(listener), useCapture, wrapQuotes(listenerScope)));
    }
    /**
     * Removes the class name.
     */
    public void removeClassName(String className) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeClassName(%s);", wrapQuotes(className)));
    }
    /**
     * Serializes element to JSON.
     */
    public void serialize() {
        APIlib.getInstance().addJSLine(jsBase + ".serialize();");
    }
    /**
     * Setups the element using passed configuration value.
     */
    public com.anychart.ui.ContextMenu setup(String var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setup(%s);", wrapQuotes(var_args)));

        return this;
    }
    /**
     * Setups the element using passed configuration value.
     */
    public com.anychart.ui.ContextMenu setup(String[] var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setup(%s);", arrayToStringWrapQuotes(var_args)));

        return this;
    }
    /**
     * Setups the element using passed configuration value.
     */
    public com.anychart.ui.ContextMenu setup(Number var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setup(%s);", var_args));

        return this;
    }
    /**
     * Setups the element using passed configuration value.
     */
    public com.anychart.ui.ContextMenu setup(Boolean var_args) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".setup(%s);", var_args));

        return this;
    }
    /**
     * Shows the menu immediately at the given client coordinates.
     */
    public void show(Number x, Number y) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".show(%s, %s);", x, y));
    }
    public void setOnClickListener(ListenersInterface.OnClickListener listener) {
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

        ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }

}