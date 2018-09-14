package com.anychart.math.adl;

import com.anychart.JsObject;

import com.anychart.math.CycledQueue;

import java.util.Locale;
import java.util.Arrays;

// typedef
/**
 * Type definition for the context.
 */
public class Context extends JsObject  {

    
    public Context(CycledQueue closeQueue, Number dispose, CycledQueue highQueue, CycledQueue lowQueue, Number period, Number prevResult, CycledQueue volumeQueue) {
        js.append(String.format(Locale.US, "{closeQueue:%s, dispose: %s, highQueue: %s, lowQueue: %s, period: %s, prevResult: %s, volumeQueue: %s, } ", (closeQueue != null) ? closeQueue.getJsBase() : null, dispose, (highQueue != null) ? highQueue.getJsBase() : null, (lowQueue != null) ? lowQueue.getJsBase() : null, period, prevResult, (volumeQueue != null) ? volumeQueue.getJsBase() : null));
    }

    @Override
    public String getJsBase() {
        return js.toString();
    }

}