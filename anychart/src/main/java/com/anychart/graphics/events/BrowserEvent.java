package com.anychart.graphics.events;

import com.anychart.APIlib;
import com.anychart.JsObject;

// class
/**
 * Encapsulates browser event for anychart.graphics.
 */
public class BrowserEvent extends JsObject {

    protected BrowserEvent() {

    }

    public static BrowserEvent instantiate() {
        return new BrowserEvent("new anychart.graphics.events.browserEvent()");
    }

    

    public BrowserEvent(String jsChart) {
        jsBase = "browserEvent" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Prevents DOM event default action.
     */
    public void preventDefault() {
        APIlib.getInstance().addJSLine(jsBase + ".preventDefault();");
    }
    /**
     * Stops both DOM and wrapper event propagation.
{docs:Graphics/Events#propagation}Learn more about propagation.{docs}
     */
    public void stopPropagation() {
        APIlib.getInstance().addJSLine(jsBase + ".stopPropagation();");
    }
    /**
     * Stops event propagation (doesn't stop original DOM event propagation).
     */
    public void stopWrapperPropagation() {
        APIlib.getInstance().addJSLine(jsBase + ".stopWrapperPropagation();");
    }

}