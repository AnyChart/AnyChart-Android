package com.anychart.anychart;

import java.util.Locale;

/**
 * Type definition for the context.
 */
public class MfiContext extends JsObject  {

    
    private Number lastValueSign;
    private Number negativeFlow;
    private Number period;
    private Number positiveFlow;
    private Number prevResult;
    private CycledQueue priceQueue;
    private CycledQueue volumeQueue;

    
    public MfiContext(Number lastValueSign, Number negativeFlow, Number period, Number positiveFlow, Number prevResult, CycledQueue priceQueue, CycledQueue volumeQueue) {
        this.lastValueSign = lastValueSign;
        this.negativeFlow = negativeFlow;
        this.period = period;
        this.positiveFlow = positiveFlow;
        this.prevResult = prevResult;
        this.priceQueue = priceQueue;
        this.volumeQueue = volumeQueue;

        js.append(String.format(Locale.US, "{lastValueSign: %s,negativeFlow: %s,period: %s,positiveFlow: %s,prevResult: %s,priceQueue: %s,volumeQueue: %s}",  lastValueSign, negativeFlow, period, positiveFlow, prevResult, ((priceQueue != null) ? priceQueue.generateJs() : "null"), ((volumeQueue != null) ? volumeQueue.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}