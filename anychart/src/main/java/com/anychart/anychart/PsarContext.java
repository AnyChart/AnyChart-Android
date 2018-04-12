package com.anychart.anychart;

import java.util.Locale;

/**
 * Type definition for the context.
 */
public class PsarContext extends JsObject  {

    
    private Number alpha;
    private Number alphaIncrement;
    private Number alphaMax;
    private Number alphaStart;
    private Number currentDownTrendEP;
    private Number currentUpTrendEP;
    private Number dequeuedHigh;
    private Number dequeuedLow;
    private CycledQueue highQueue;
    private Boolean isUptrend;
    private CycledQueue lowQueue;
    private Number prevResult;

    
    public PsarContext(Number alpha, Number alphaIncrement, Number alphaMax, Number alphaStart, Number currentDownTrendEP, Number currentUpTrendEP, Number dequeuedHigh, Number dequeuedLow, CycledQueue highQueue, Boolean isUptrend, CycledQueue lowQueue, Number prevResult) {
        this.alpha = alpha;
        this.alphaIncrement = alphaIncrement;
        this.alphaMax = alphaMax;
        this.alphaStart = alphaStart;
        this.currentDownTrendEP = currentDownTrendEP;
        this.currentUpTrendEP = currentUpTrendEP;
        this.dequeuedHigh = dequeuedHigh;
        this.dequeuedLow = dequeuedLow;
        this.highQueue = highQueue;
        this.isUptrend = isUptrend;
        this.lowQueue = lowQueue;
        this.prevResult = prevResult;

        js.append(String.format(Locale.US, "{alpha: %s,alphaIncrement: %s,alphaMax: %s,alphaStart: %s,currentDownTrendEP: %s,currentUpTrendEP: %s,dequeuedHigh: %s,dequeuedLow: %s,highQueue: %s,isUptrend: %b,lowQueue: %s,prevResult: %s}",  alpha, alphaIncrement, alphaMax, alphaStart, currentDownTrendEP, currentUpTrendEP, dequeuedHigh, dequeuedLow, ((highQueue != null) ? highQueue.generateJs() : "null"), isUptrend, ((lowQueue != null) ? lowQueue.generateJs() : "null"), prevResult));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}