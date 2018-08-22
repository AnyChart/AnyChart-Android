package com.anychart.core.utils;

import com.anychart.APIlib;
import com.anychart.chart.common.listener.ListenersInterface;

import java.util.Locale;

// class
/**
 * Anychart series accessibility class.
 */
public class SeriesA11y extends A11y {

    protected SeriesA11y() {

    }

    public static SeriesA11y instantiate() {
        return new SeriesA11y("new anychart.core.utils.seriesA11y()");
    }

    

    public SeriesA11y(String jsChart) {
        jsBase = "seriesA11y" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for the accessibility enabled state (enabled or disabled).
     */
    public void enabled() {
        APIlib.getInstance().addJSLine(jsBase + ".enabled();");
    }
    /**
     * Setter for the accessibility enabled state.
     */
    public com.anychart.core.utils.SeriesA11y enabled(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enabled(%s);", value));

        return this;
    }
    /**
     * Getter for the function to format title.
     */
    public void titleFormat() {
        APIlib.getInstance().addJSLine(jsBase + ".titleFormat();");
    }
    /**
     * Setter for the function to format title.<br/>
{docs:Common_Settings/Text_Formatters}Learn more about using titleFormat() method.{docs}
     */
    public com.anychart.core.utils.SeriesA11y titleFormat(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".titleFormat(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
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
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }

}