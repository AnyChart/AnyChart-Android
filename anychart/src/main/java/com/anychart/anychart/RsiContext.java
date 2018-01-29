package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class RsiContext extends JsObject  {

    
    private Number downwardChange;
    private Number period;
    private CycledQueue queue;
    private Number upwardChange;

    
    public RsiContext(Number downwardChange, Number period, CycledQueue queue, Number upwardChange) {
        this.downwardChange = downwardChange;
        this.period = period;
        this.queue = queue;
        this.upwardChange = upwardChange;

        js.append(String.format(Locale.US, "{downwardChange: %s,period: %s,queue: %s,upwardChange: %s}",  downwardChange, period, ((queue != null) ? queue.generateJs() : "null"), upwardChange));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}