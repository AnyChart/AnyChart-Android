package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class AdlContext extends JsObject  {

    
    private CycledQueue closeQueue;
    private Number dispose;
    private CycledQueue highQueue;
    private CycledQueue lowQueue;
    private Number period;
    private Number prevResult;
    private CycledQueue volumeQueue;

    
    public AdlContext(CycledQueue closeQueue, Number dispose, CycledQueue highQueue, CycledQueue lowQueue, Number period, Number prevResult, CycledQueue volumeQueue) {
        this.closeQueue = closeQueue;
        this.dispose = dispose;
        this.highQueue = highQueue;
        this.lowQueue = lowQueue;
        this.period = period;
        this.prevResult = prevResult;
        this.volumeQueue = volumeQueue;

        js.append(String.format(Locale.US, "{closeQueue: %s,dispose: %s,highQueue: %s,lowQueue: %s,period: %s,prevResult: %s,volumeQueue: %s}",  ((closeQueue != null) ? closeQueue.generateJs() : "null"), dispose, ((highQueue != null) ? highQueue.generateJs() : "null"), ((lowQueue != null) ? lowQueue.generateJs() : "null"), period, prevResult, ((volumeQueue != null) ? volumeQueue.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}