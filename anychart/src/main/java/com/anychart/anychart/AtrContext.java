package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class AtrContext extends JsObject  {

    
    private Double dequeuedValue;
    private Double period;
    private Double prevClose;
    private Double prevResult;
    private CycledQueue queue;

    
    public AtrContext(Double dequeuedValue, Double period, Double prevClose, Double prevResult, CycledQueue queue) {
        this.dequeuedValue = dequeuedValue;
        this.period = period;
        this.prevClose = prevClose;
        this.prevResult = prevResult;
        this.queue = queue;

        js.append(String.format(Locale.US, "{dequeuedValue: %f,period: %f,prevClose: %f,prevResult: %f,queue: %s}",  dequeuedValue, period, prevClose, prevResult, ((queue != null) ? queue.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}