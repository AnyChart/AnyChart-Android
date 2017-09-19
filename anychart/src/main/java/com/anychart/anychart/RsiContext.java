package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class RsiContext extends JsObject  {

    
    private Double downwardChange;
    private Double period;
    private CycledQueue queue;
    private Double upwardChange;

    
    public RsiContext(Double downwardChange, Double period, CycledQueue queue, Double upwardChange) {
        this.downwardChange = downwardChange;
        this.period = period;
        this.queue = queue;
        this.upwardChange = upwardChange;

        js.append(String.format(Locale.US, "{downwardChange: %f,period: %f,queue: %s,upwardChange: %f}",  downwardChange, period, (queue != null) ? queue.generateJs() : "null", upwardChange));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}