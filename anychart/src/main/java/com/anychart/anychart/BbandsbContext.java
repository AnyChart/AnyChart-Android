package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class BbandsbContext extends JsObject  {

    
    private Double deviation;
    private CycledQueue highQueue;
    private Double period;
    private Double prevDeviation;
    private Double prevResult;

    
    public BbandsbContext(Double deviation, CycledQueue highQueue, Double period, Double prevDeviation, Double prevResult) {
        this.deviation = deviation;
        this.highQueue = highQueue;
        this.period = period;
        this.prevDeviation = prevDeviation;
        this.prevResult = prevResult;

        js.append(String.format(Locale.US, "{deviation: %f,highQueue: %s,period: %f,prevDeviation: %f,prevResult: %f}",  deviation, ((highQueue != null) ? highQueue.generateJs() : "null"), period, prevDeviation, prevResult));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}