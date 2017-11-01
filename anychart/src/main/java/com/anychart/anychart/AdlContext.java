package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class AdlContext extends JsObject  {

    
    private CycledQueue closeQueue;
    private Double dispose;
    private CycledQueue highQueue;
    private CycledQueue lowQueue;
    private Double period;
    private Double prevResult;
    private CycledQueue volumeQueue;

    
    public AdlContext(CycledQueue closeQueue, Double dispose, CycledQueue highQueue, CycledQueue lowQueue, Double period, Double prevResult, CycledQueue volumeQueue) {
        this.closeQueue = closeQueue;
        this.dispose = dispose;
        this.highQueue = highQueue;
        this.lowQueue = lowQueue;
        this.period = period;
        this.prevResult = prevResult;
        this.volumeQueue = volumeQueue;

        js.append(String.format(Locale.US, "{closeQueue: %s,dispose: %f,highQueue: %s,lowQueue: %s,period: %f,prevResult: %f,volumeQueue: %s}",  ((closeQueue != null) ? closeQueue.generateJs() : "null"), dispose, ((highQueue != null) ? highQueue.generateJs() : "null"), ((lowQueue != null) ? lowQueue.generateJs() : "null"), period, prevResult, ((volumeQueue != null) ? volumeQueue.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}