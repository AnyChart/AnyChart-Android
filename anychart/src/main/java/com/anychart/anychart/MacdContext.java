package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class MacdContext extends JsObject  {

    
    private Double fastPeriod;
    private CycledQueue fastQueue;
    private Double fastResult;
    private Double signalPeriod;
    private CycledQueue signalQueue;
    private Double signalResult;
    private Double slowPeriod;
    private CycledQueue slowQueue;
    private Double slowResult;

    
    public MacdContext(Double fastPeriod, CycledQueue fastQueue, Double fastResult, Double signalPeriod, CycledQueue signalQueue, Double signalResult, Double slowPeriod, CycledQueue slowQueue, Double slowResult) {
        this.fastPeriod = fastPeriod;
        this.fastQueue = fastQueue;
        this.fastResult = fastResult;
        this.signalPeriod = signalPeriod;
        this.signalQueue = signalQueue;
        this.signalResult = signalResult;
        this.slowPeriod = slowPeriod;
        this.slowQueue = slowQueue;
        this.slowResult = slowResult;

        js.append(String.format(Locale.US, "{fastPeriod: %f,fastQueue: %s,fastResult: %f,signalPeriod: %f,signalQueue: %s,signalResult: %f,slowPeriod: %f,slowQueue: %s,slowResult: %f}",  fastPeriod, (fastQueue != null) ? fastQueue.generateJs() : "null", fastResult, signalPeriod, (signalQueue != null) ? signalQueue.generateJs() : "null", signalResult, slowPeriod, (slowQueue != null) ? slowQueue.generateJs() : "null", slowResult));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}