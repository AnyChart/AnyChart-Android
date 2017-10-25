package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class BbandsContext extends JsObject  {

    
    private Double dequeuedValue;
    private Double deviation;
    private CycledQueue highQueue;
    private Double period;
    private Double prevDeviation;
    private Double prevResult;

    
    public BbandsContext(Double dequeuedValue, Double deviation, CycledQueue highQueue, Double period, Double prevDeviation, Double prevResult) {
        this.dequeuedValue = dequeuedValue;
        this.deviation = deviation;
        this.highQueue = highQueue;
        this.period = period;
        this.prevDeviation = prevDeviation;
        this.prevResult = prevResult;

        js.append(String.format(Locale.US, "{dequeuedValue: %f,deviation: %f,highQueue: %s,period: %f,prevDeviation: %f,prevResult: %f}",  dequeuedValue, deviation, ((highQueue != null) ? highQueue.generateJs() : "null"), period, prevDeviation, prevResult));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}