package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class RocContext extends JsObject  {

    
    private Double period;
    private CycledQueue queue;

    
    public RocContext(Double period, CycledQueue queue) {
        this.period = period;
        this.queue = queue;

        js.append(String.format(Locale.US, "{period: %f,queue: %s}",  period, ((queue != null) ? queue.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}