package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class CmfContext extends JsObject  {

    
    private CycledQueue mfvQueue;
    private Number period;
    private Number prevMFVSum;
    private Number prevVolumeSum;
    private CycledQueue volumeQueue;

    
    public CmfContext(CycledQueue mfvQueue, Number period, Number prevMFVSum, Number prevVolumeSum, CycledQueue volumeQueue) {
        this.mfvQueue = mfvQueue;
        this.period = period;
        this.prevMFVSum = prevMFVSum;
        this.prevVolumeSum = prevVolumeSum;
        this.volumeQueue = volumeQueue;

        js.append(String.format(Locale.US, "{mfvQueue: %s,period: %s,prevMFVSum: %s,prevVolumeSum: %s,volumeQueue: %s}",  ((mfvQueue != null) ? mfvQueue.generateJs() : "null"), period, prevMFVSum, prevVolumeSum, ((volumeQueue != null) ? volumeQueue.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}