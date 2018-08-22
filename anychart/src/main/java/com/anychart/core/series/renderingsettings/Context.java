package com.anychart.core.series.renderingsettings;

import com.anychart.APIlib;
import com.anychart.JsObject;

import java.util.Locale;

// class
/**
 * Rendering functions context.
 */
public class Context extends JsObject {

    protected Context() {

    }

    public static Context instantiate() {
        return new Context("new anychart.core.series.RenderingSettings.context()");
    }

    

    public Context(String jsChart) {
        jsBase = "context" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Fetch statistics value by its key or a whole object if no key provided.
     */
    public void getStat(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".getStat(%s);", wrapQuotes(key)));
    }

}