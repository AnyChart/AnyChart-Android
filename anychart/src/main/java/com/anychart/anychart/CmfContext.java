package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class CmfContext extends JsObject  {

    
    private CycledQueue mfvQueue;
    private Double period;
    private Double prevMFVSum;
    private Double prevVolumeSum;
    private CycledQueue volumeQueue;

    
    public CmfContext(CycledQueue mfvQueue, Double period, Double prevMFVSum, Double prevVolumeSum, CycledQueue volumeQueue) {
        this.mfvQueue = mfvQueue;
        this.period = period;
        this.prevMFVSum = prevMFVSum;
        this.prevVolumeSum = prevVolumeSum;
        this.volumeQueue = volumeQueue;

        js.append(String.format(Locale.US, "{mfvQueue: %s,period: %f,prevMFVSum: %f,prevVolumeSum: %f,volumeQueue: %s}",  ((mfvQueue != null) ? mfvQueue.generateJs() : "null"), period, prevMFVSum, prevVolumeSum, ((volumeQueue != null) ? volumeQueue.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}