package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class SmaContext extends JsObject  {

    
    private Number dequeuedValue;
    private Number period;
    private Number prevResult;
    private CycledQueue queue;

    
    public SmaContext(Number dequeuedValue, Number period, Number prevResult, CycledQueue queue) {
        this.dequeuedValue = dequeuedValue;
        this.period = period;
        this.prevResult = prevResult;
        this.queue = queue;

        js.append(String.format(Locale.US, "{dequeuedValue: %s,period: %s,prevResult: %s,queue: %s}",  dequeuedValue, period, prevResult, ((queue != null) ? queue.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}