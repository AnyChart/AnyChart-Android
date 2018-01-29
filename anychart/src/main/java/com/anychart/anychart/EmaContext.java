package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class EmaContext extends JsObject  {

    
    private Number period;
    private Number prevResult;
    private CycledQueue queue;

    
    public EmaContext(Number period, Number prevResult, CycledQueue queue) {
        this.period = period;
        this.prevResult = prevResult;
        this.queue = queue;

        js.append(String.format(Locale.US, "{period: %s,prevResult: %s,queue: %s}",  period, prevResult, ((queue != null) ? queue.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}