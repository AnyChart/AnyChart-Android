package com.anychart.core;

import com.anychart.APIlib;

import java.util.Locale;

// class
/**
 * Class with settings for "No data" feature.<br/>
{docs:Working_with_Data/No_Data_Label} Learn more about "No data" feature {docs}
 */
public class NoDataSettings extends Base {

    protected NoDataSettings() {

    }

    public static NoDataSettings instantiate() {
        return new NoDataSettings("new anychart.core.noDataSettings()");
    }

    

    public NoDataSettings(String jsChart) {
        jsBase = "noDataSettings" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Getter for no data label.
     */
    public com.anychart.core.ui.Label label() {
        return new com.anychart.core.ui.Label(jsBase + ".label()");
    }
    /**
     * Setter for no data label.
     */
    public com.anychart.core.NoDataSettings label(String value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s);", wrapQuotes(value)));

        return this;
    }
    /**
     * Setter for no data label.
     */
    public com.anychart.core.NoDataSettings label(Boolean value) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".label(%s);", value));

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
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }

}