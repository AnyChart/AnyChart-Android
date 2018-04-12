package com.anychart.anychart;

import java.util.Locale;

/**
 * Type definition for the context.
 */
public class WilliamsrContext extends JsObject  {

    
    private CycledQueue closeQueue;
    private CycledQueue highQueue;
    private CycledQueue lowQueue;
    private Number period;
    private Number prevResult;

    
    public WilliamsrContext(CycledQueue closeQueue, CycledQueue highQueue, CycledQueue lowQueue, Number period, Number prevResult) {
        this.closeQueue = closeQueue;
        this.highQueue = highQueue;
        this.lowQueue = lowQueue;
        this.period = period;
        this.prevResult = prevResult;

        js.append(String.format(Locale.US, "{closeQueue: %s,highQueue: %s,lowQueue: %s,period: %s,prevResult: %s}",  ((closeQueue != null) ? closeQueue.generateJs() : "null"), ((highQueue != null) ? highQueue.generateJs() : "null"), ((lowQueue != null) ? lowQueue.generateJs() : "null"), period, prevResult));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}