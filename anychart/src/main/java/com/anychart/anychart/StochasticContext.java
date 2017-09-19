package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class StochasticContext extends JsObject  {

    
    private SmaContext dMAContext;
    private EmaContext dMAContext1;
    private MovingAverageType dMAType;
    private CycledQueue highQueue;
    private SmaContext kMAContext;
    private EmaContext kMAContext1;
    private MovingAverageType kMAType;
    private Double kPeriod;
    private CycledQueue lowQueue;

    
    public StochasticContext(SmaContext dMAContext, SmaContext kMAContext, MovingAverageType dMAType, CycledQueue highQueue, MovingAverageType kMAType, Double kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.kMAContext = kMAContext;
        this.dMAType = dMAType;
        this.highQueue = highQueue;
        this.kMAType = kMAType;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,kMAContext: %s,dMAType: %s,highQueue: %s,kMAType: %s,kPeriod: %f,lowQueue: %s}",  (dMAContext != null) ? dMAContext.generateJs() : "null", (kMAContext != null) ? kMAContext.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", (highQueue != null) ? highQueue.generateJs() : "null", (kMAType != null) ? kMAType.generateJs() : "null", kPeriod, (lowQueue != null) ? lowQueue.generateJs() : "null"));
    }

    public StochasticContext(SmaContext dMAContext, EmaContext kMAContext1, MovingAverageType dMAType, CycledQueue highQueue, MovingAverageType kMAType, Double kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.kMAContext1 = kMAContext1;
        this.dMAType = dMAType;
        this.highQueue = highQueue;
        this.kMAType = kMAType;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,kMAContext: %s,dMAType: %s,highQueue: %s,kMAType: %s,kPeriod: %f,lowQueue: %s}",  (dMAContext != null) ? dMAContext.generateJs() : "null", (kMAContext1 != null) ? kMAContext1.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", (highQueue != null) ? highQueue.generateJs() : "null", (kMAType != null) ? kMAType.generateJs() : "null", kPeriod, (lowQueue != null) ? lowQueue.generateJs() : "null"));
    }

    public StochasticContext(EmaContext dMAContext1, SmaContext kMAContext, MovingAverageType dMAType, CycledQueue highQueue, MovingAverageType kMAType, Double kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.kMAContext = kMAContext;
        this.dMAType = dMAType;
        this.highQueue = highQueue;
        this.kMAType = kMAType;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,kMAContext: %s,dMAType: %s,highQueue: %s,kMAType: %s,kPeriod: %f,lowQueue: %s}",  (dMAContext1 != null) ? dMAContext1.generateJs() : "null", (kMAContext != null) ? kMAContext.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", (highQueue != null) ? highQueue.generateJs() : "null", (kMAType != null) ? kMAType.generateJs() : "null", kPeriod, (lowQueue != null) ? lowQueue.generateJs() : "null"));
    }

    public StochasticContext(EmaContext dMAContext1, EmaContext kMAContext1, MovingAverageType dMAType, CycledQueue highQueue, MovingAverageType kMAType, Double kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.kMAContext1 = kMAContext1;
        this.dMAType = dMAType;
        this.highQueue = highQueue;
        this.kMAType = kMAType;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,kMAContext: %s,dMAType: %s,highQueue: %s,kMAType: %s,kPeriod: %f,lowQueue: %s}",  (dMAContext1 != null) ? dMAContext1.generateJs() : "null", (kMAContext1 != null) ? kMAContext1.generateJs() : "null", (dMAType != null) ? dMAType.generateJs() : "null", (highQueue != null) ? highQueue.generateJs() : "null", (kMAType != null) ? kMAType.generateJs() : "null", kPeriod, (lowQueue != null) ? lowQueue.generateJs() : "null"));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}