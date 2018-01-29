package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class AtrContext extends JsObject  {

    
    private Number dequeuedValue;
    private Number period;
    private Number prevClose;
    private Number prevResult;
    private CycledQueue queue;

    
    public AtrContext(Number dequeuedValue, Number period, Number prevClose, Number prevResult, CycledQueue queue) {
        this.dequeuedValue = dequeuedValue;
        this.period = period;
        this.prevClose = prevClose;
        this.prevResult = prevResult;
        this.queue = queue;

        js.append(String.format(Locale.US, "{dequeuedValue: %s,period: %s,prevClose: %s,prevResult: %s,queue: %s}",  dequeuedValue, period, prevClose, prevResult, ((queue != null) ? queue.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}