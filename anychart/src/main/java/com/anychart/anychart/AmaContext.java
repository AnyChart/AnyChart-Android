package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class AmaContext extends JsObject  {

    
    private Number fastPeriod;
    private Number period;
    private Number prevNoise;
    private Number prevResult;
    private CycledQueue queue;
    private Number slowPeriod;

    
    public AmaContext(Number fastPeriod, Number period, Number prevNoise, Number prevResult, CycledQueue queue, Number slowPeriod) {
        this.fastPeriod = fastPeriod;
        this.period = period;
        this.prevNoise = prevNoise;
        this.prevResult = prevResult;
        this.queue = queue;
        this.slowPeriod = slowPeriod;

        js.append(String.format(Locale.US, "{fastPeriod: %s,period: %s,prevNoise: %s,prevResult: %s,queue: %s,slowPeriod: %s}",  fastPeriod, period, prevNoise, prevResult, ((queue != null) ? queue.generateJs() : "null"), slowPeriod));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}