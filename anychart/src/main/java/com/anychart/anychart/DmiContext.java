package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class DmiContext extends JsObject  {

    
    private Number adxAlpha;
    private Number adxPeriod;
    private CycledQueue adxQueue;
    private Number adxValue;
    private Number alpha;
    private CycledQueue closeQueue;
    private CycledQueue highQueue;
    private CycledQueue lowQueue;
    private Number ndiSumValue;
    private Number ndiValue;
    private Number pdiSumValue;
    private Number pdiValue;
    private Number period;
    private Number trSumValue;
    private Boolean useWildersSmoothing;

    
    public DmiContext(Number adxAlpha, Number adxPeriod, CycledQueue adxQueue, Number adxValue, Number alpha, CycledQueue closeQueue, CycledQueue highQueue, CycledQueue lowQueue, Number ndiSumValue, Number ndiValue, Number pdiSumValue, Number pdiValue, Number period, Number trSumValue, Boolean useWildersSmoothing) {
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

        js.append(String.format(Locale.US, "{adxAlpha: %s,adxPeriod: %s,adxQueue: %s,adxValue: %s,alpha: %s,closeQueue: %s,highQueue: %s,lowQueue: %s,ndiSumValue: %s,ndiValue: %s,pdiSumValue: %s,pdiValue: %s,period: %s,trSumValue: %s,useWildersSmoothing: %b}",  adxAlpha, adxPeriod, ((adxQueue != null) ? adxQueue.generateJs() : "null"), adxValue, alpha, ((closeQueue != null) ? closeQueue.generateJs() : "null"), ((highQueue != null) ? highQueue.generateJs() : "null"), ((lowQueue != null) ? lowQueue.generateJs() : "null"), ndiSumValue, ndiValue, pdiSumValue, pdiValue, period, trSumValue, useWildersSmoothing));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}