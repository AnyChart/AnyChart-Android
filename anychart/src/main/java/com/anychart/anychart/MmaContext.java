package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class MmaContext extends JsObject  {

    
    private Double period;
    private Double prevResult;
    private CycledQueue queue;

    
    public MmaContext(Double period, Double prevResult, CycledQueue queue) {
        this.period = period;
        this.prevResult = prevResult;
        this.queue = queue;

        js.append(String.format(Locale.US, "{period: %f,prevResult: %f,queue: %s}",  period, prevResult, (queue != null) ? queue.generateJs() : "null"));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}