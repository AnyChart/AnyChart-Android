package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class DmiContext extends JsObject  {

    
    private Double adxAlpha;
    private Double adxPeriod;
    private CycledQueue adxQueue;
    private Double adxValue;
    private Double alpha;
    private CycledQueue closeQueue;
    private CycledQueue highQueue;
    private CycledQueue lowQueue;
    private Double ndiSumValue;
    private Double ndiValue;
    private Double pdiSumValue;
    private Double pdiValue;
    private Double period;
    private Double trSumValue;
    private Boolean useWildersSmoothing;

    
    public DmiContext(Double adxAlpha, Double adxPeriod, CycledQueue adxQueue, Double adxValue, Double alpha, CycledQueue closeQueue, CycledQueue highQueue, CycledQueue lowQueue, Double ndiSumValue, Double ndiValue, Double pdiSumValue, Double pdiValue, Double period, Double trSumValue, Boolean useWildersSmoothing) {
        this.adxAlpha = adxAlpha;
        this.adxPeriod = adxPeriod;
        this.adxQueue = adxQueue;
        this.adxValue = adxValue;
        this.alpha = alpha;
        this.closeQueue = closeQueue;
        this.highQueue = highQueue;
        this.lowQueue = lowQueue;
        this.ndiSumValue = ndiSumValue;
        this.ndiValue = ndiValue;
        this.pdiSumValue = pdiSumValue;
        this.pdiValue = pdiValue;
        this.period = period;
        this.trSumValue = trSumValue;
        this.useWildersSmoothing = useWildersSmoothing;

        js.append(String.format(Locale.US, "{adxAlpha: %f,adxPeriod: %f,adxQueue: %s,adxValue: %f,alpha: %f,closeQueue: %s,highQueue: %s,lowQueue: %s,ndiSumValue: %f,ndiValue: %f,pdiSumValue: %f,pdiValue: %f,period: %f,trSumValue: %f,useWildersSmoothing: %b}",  adxAlpha, adxPeriod, ((adxQueue != null) ? adxQueue.generateJs() : "null"), adxValue, alpha, ((closeQueue != null) ? closeQueue.generateJs() : "null"), ((highQueue != null) ? highQueue.generateJs() : "null"), ((lowQueue != null) ? lowQueue.generateJs() : "null"), ndiSumValue, ndiValue, pdiSumValue, pdiValue, period, trSumValue, useWildersSmoothing));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}