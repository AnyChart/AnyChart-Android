package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class AroonContext extends JsObject  {

    
    private CycledQueue highQueue;
    private CycledQueue lowQueue;
    private Double period;

    
    public AroonContext(CycledQueue highQueue, CycledQueue lowQueue, Double period) {
        this.highQueue = highQueue;
        this.lowQueue = lowQueue;
        this.period = period;

        js.append(String.format(Locale.US, "{highQueue: %s,lowQueue: %s,period: %f}",  (highQueue != null) ? highQueue.generateJs() : "null", (lowQueue != null) ? lowQueue.generateJs() : "null", period));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}