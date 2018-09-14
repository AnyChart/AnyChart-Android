package com.anychart.signalevent;

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
 * Special event for changes in dirty states.
 */
public class SignalEvent extends JsObject {

    protected SignalEvent() {

    }

    public static SignalEvent instantiate() {
        return new SignalEvent("new anychart.signalEvent()");
    }

    

    public SignalEvent(String jsChart) {
        jsBase = "signalEvent" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * If target signalled bounds change.
     */
    public void targetBoundsChanged() {
        APIlib.getInstance().addJSLine(jsBase + ".targetBoundsChanged();");
    }
    /**
     * If target signalled data change.
     */
    public void targetDataChanged() {
        APIlib.getInstance().addJSLine(jsBase + ".targetDataChanged();");
    }
    /**
     * If target signalled meta change.
     */
    public void targetMetaChanged() {
        APIlib.getInstance().addJSLine(jsBase + ".targetMetaChanged();");
    }
    /**
     * If target needs to be reapplied.
     */
    public void targetNeedsReapplication() {
        APIlib.getInstance().addJSLine(jsBase + ".targetNeedsReapplication();");
    }
    /**
     * If target needs to be recalculated.
     */
    public void targetNeedsRecalculation() {
        APIlib.getInstance().addJSLine(jsBase + ".targetNeedsRecalculation();");
    }
    /**
     * If target needs redraw.
     */
    public void targetNeedsRedraw() {
        APIlib.getInstance().addJSLine(jsBase + ".targetNeedsRedraw();");
    }

}