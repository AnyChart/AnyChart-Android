package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class BbandsbContext extends JsObject  {

    
    private Number deviation;
    private CycledQueue highQueue;
    private Number period;
    private Number prevDeviation;
    private Number prevResult;

    
    public BbandsbContext(Number deviation, CycledQueue highQueue, Number period, Number prevDeviation, Number prevResult) {
        this.deviation = deviation;
        this.highQueue = highQueue;
        this.period = period;
        this.prevDeviation = prevDeviation;
        this.prevResult = prevResult;

        js.append(String.format(Locale.US, "{deviation: %s,highQueue: %s,period: %s,prevDeviation: %s,prevResult: %s}",  deviation, ((highQueue != null) ? highQueue.generateJs() : "null"), period, prevDeviation, prevResult));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}