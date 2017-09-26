package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class AmaContext extends JsObject  {

    
    private Double fastPeriod;
    private Double period;
    private Double prevNoise;
    private Double prevResult;
    private CycledQueue queue;
    private Double slowPeriod;

    
    public AmaContext(Double fastPeriod, Double period, Double prevNoise, Double prevResult, CycledQueue queue, Double slowPeriod) {
        this.fastPeriod = fastPeriod;
        this.period = period;
        this.prevNoise = prevNoise;
        this.prevResult = prevResult;
        this.queue = queue;
        this.slowPeriod = slowPeriod;

        js.append(String.format(Locale.US, "{fastPeriod: %f,period: %f,prevNoise: %f,prevResult: %f,queue: %s,slowPeriod: %f}",  fastPeriod, period, prevNoise, prevResult, (queue != null) ? queue.generateJs() : "null", slowPeriod));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}