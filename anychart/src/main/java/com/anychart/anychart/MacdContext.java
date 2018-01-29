package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class MacdContext extends JsObject  {

    
    private Number fastPeriod;
    private CycledQueue fastQueue;
    private Number fastResult;
    private Number signalPeriod;
    private CycledQueue signalQueue;
    private Number signalResult;
    private Number slowPeriod;
    private CycledQueue slowQueue;
    private Number slowResult;

    
    public MacdContext(Number fastPeriod, CycledQueue fastQueue, Number fastResult, Number signalPeriod, CycledQueue signalQueue, Number signalResult, Number slowPeriod, CycledQueue slowQueue, Number slowResult) {
        this.fastPeriod = fastPeriod;
        this.fastQueue = fastQueue;
        this.fastResult = fastResult;
        this.signalPeriod = signalPeriod;
        this.signalQueue = signalQueue;
        this.signalResult = signalResult;
        this.slowPeriod = slowPeriod;
        this.slowQueue = slowQueue;
        this.slowResult = slowResult;

        js.append(String.format(Locale.US, "{fastPeriod: %s,fastQueue: %s,fastResult: %s,signalPeriod: %s,signalQueue: %s,signalResult: %s,slowPeriod: %s,slowQueue: %s,slowResult: %s}",  fastPeriod, ((fastQueue != null) ? fastQueue.generateJs() : "null"), fastResult, signalPeriod, ((signalQueue != null) ? signalQueue.generateJs() : "null"), signalResult, slowPeriod, ((slowQueue != null) ? slowQueue.generateJs() : "null"), slowResult));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}