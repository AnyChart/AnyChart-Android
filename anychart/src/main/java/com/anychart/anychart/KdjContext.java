package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class KdjContext extends JsObject  {

    
    private SmaContext dMAContext;
    private EmaContext dMAContext1;
    private String dMAContext2;
    private MovingAverageType dMAType;
    private String dMAType1;
    private Number dMultiplier;
    private CycledQueue highQueue;
    private SmaContext kMAContext;
    private EmaContext kMAContext1;
    private String kMAContext2;
    private MovingAverageType kMAType;
    private String kMAType1;
    private Number kMultiplier;
    private Number kPeriod;
    private CycledQueue lowQueue;

    
    public KdjContext(SmaContext dMAContext, MovingAverageType dMAType, SmaContext kMAContext, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.dMAType = dMAType;
        this.kMAContext = kMAContext;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext != null) ? dMAContext.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kMAContext != null) ? kMAContext.generateJs() : "null"), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(SmaContext dMAContext, MovingAverageType dMAType, SmaContext kMAContext, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.dMAType = dMAType;
        this.kMAContext = kMAContext;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext != null) ? dMAContext.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kMAContext != null) ? kMAContext.generateJs() : "null"), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(SmaContext dMAContext, MovingAverageType dMAType, EmaContext kMAContext1, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.dMAType = dMAType;
        this.kMAContext1 = kMAContext1;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext != null) ? dMAContext.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kMAContext1 != null) ? kMAContext1.generateJs() : "null"), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(SmaContext dMAContext, MovingAverageType dMAType, EmaContext kMAContext1, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.dMAType = dMAType;
        this.kMAContext1 = kMAContext1;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext != null) ? dMAContext.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kMAContext1 != null) ? kMAContext1.generateJs() : "null"), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(SmaContext dMAContext, MovingAverageType dMAType, String kMAContext2, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.dMAType = dMAType;
        this.kMAContext2 = kMAContext2;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext != null) ? dMAContext.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kMAContext2), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(SmaContext dMAContext, MovingAverageType dMAType, String kMAContext2, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.dMAType = dMAType;
        this.kMAContext2 = kMAContext2;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext != null) ? dMAContext.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kMAContext2), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(SmaContext dMAContext, String dMAType1, SmaContext kMAContext, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.dMAType1 = dMAType1;
        this.kMAContext = kMAContext;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext != null) ? dMAContext.generateJs() : "null"), wrapQuotes(dMAType1), ((kMAContext != null) ? kMAContext.generateJs() : "null"), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(SmaContext dMAContext, String dMAType1, SmaContext kMAContext, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.dMAType1 = dMAType1;
        this.kMAContext = kMAContext;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext != null) ? dMAContext.generateJs() : "null"), wrapQuotes(dMAType1), ((kMAContext != null) ? kMAContext.generateJs() : "null"), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(SmaContext dMAContext, String dMAType1, EmaContext kMAContext1, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.dMAType1 = dMAType1;
        this.kMAContext1 = kMAContext1;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext != null) ? dMAContext.generateJs() : "null"), wrapQuotes(dMAType1), ((kMAContext1 != null) ? kMAContext1.generateJs() : "null"), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(SmaContext dMAContext, String dMAType1, EmaContext kMAContext1, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.dMAType1 = dMAType1;
        this.kMAContext1 = kMAContext1;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext != null) ? dMAContext.generateJs() : "null"), wrapQuotes(dMAType1), ((kMAContext1 != null) ? kMAContext1.generateJs() : "null"), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(SmaContext dMAContext, String dMAType1, String kMAContext2, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.dMAType1 = dMAType1;
        this.kMAContext2 = kMAContext2;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext != null) ? dMAContext.generateJs() : "null"), wrapQuotes(dMAType1), wrapQuotes(kMAContext2), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(SmaContext dMAContext, String dMAType1, String kMAContext2, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext = dMAContext;
        this.dMAType1 = dMAType1;
        this.kMAContext2 = kMAContext2;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext != null) ? dMAContext.generateJs() : "null"), wrapQuotes(dMAType1), wrapQuotes(kMAContext2), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(EmaContext dMAContext1, MovingAverageType dMAType, SmaContext kMAContext, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.dMAType = dMAType;
        this.kMAContext = kMAContext;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext1 != null) ? dMAContext1.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kMAContext != null) ? kMAContext.generateJs() : "null"), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(EmaContext dMAContext1, MovingAverageType dMAType, SmaContext kMAContext, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.dMAType = dMAType;
        this.kMAContext = kMAContext;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext1 != null) ? dMAContext1.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kMAContext != null) ? kMAContext.generateJs() : "null"), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(EmaContext dMAContext1, MovingAverageType dMAType, EmaContext kMAContext1, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.dMAType = dMAType;
        this.kMAContext1 = kMAContext1;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext1 != null) ? dMAContext1.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kMAContext1 != null) ? kMAContext1.generateJs() : "null"), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(EmaContext dMAContext1, MovingAverageType dMAType, EmaContext kMAContext1, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.dMAType = dMAType;
        this.kMAContext1 = kMAContext1;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext1 != null) ? dMAContext1.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kMAContext1 != null) ? kMAContext1.generateJs() : "null"), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(EmaContext dMAContext1, MovingAverageType dMAType, String kMAContext2, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.dMAType = dMAType;
        this.kMAContext2 = kMAContext2;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext1 != null) ? dMAContext1.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kMAContext2), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(EmaContext dMAContext1, MovingAverageType dMAType, String kMAContext2, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.dMAType = dMAType;
        this.kMAContext2 = kMAContext2;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext1 != null) ? dMAContext1.generateJs() : "null"), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kMAContext2), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(EmaContext dMAContext1, String dMAType1, SmaContext kMAContext, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.dMAType1 = dMAType1;
        this.kMAContext = kMAContext;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext1 != null) ? dMAContext1.generateJs() : "null"), wrapQuotes(dMAType1), ((kMAContext != null) ? kMAContext.generateJs() : "null"), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(EmaContext dMAContext1, String dMAType1, SmaContext kMAContext, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.dMAType1 = dMAType1;
        this.kMAContext = kMAContext;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext1 != null) ? dMAContext1.generateJs() : "null"), wrapQuotes(dMAType1), ((kMAContext != null) ? kMAContext.generateJs() : "null"), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(EmaContext dMAContext1, String dMAType1, EmaContext kMAContext1, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.dMAType1 = dMAType1;
        this.kMAContext1 = kMAContext1;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext1 != null) ? dMAContext1.generateJs() : "null"), wrapQuotes(dMAType1), ((kMAContext1 != null) ? kMAContext1.generateJs() : "null"), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(EmaContext dMAContext1, String dMAType1, EmaContext kMAContext1, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.dMAType1 = dMAType1;
        this.kMAContext1 = kMAContext1;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext1 != null) ? dMAContext1.generateJs() : "null"), wrapQuotes(dMAType1), ((kMAContext1 != null) ? kMAContext1.generateJs() : "null"), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(EmaContext dMAContext1, String dMAType1, String kMAContext2, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.dMAType1 = dMAType1;
        this.kMAContext2 = kMAContext2;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext1 != null) ? dMAContext1.generateJs() : "null"), wrapQuotes(dMAType1), wrapQuotes(kMAContext2), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(EmaContext dMAContext1, String dMAType1, String kMAContext2, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext1 = dMAContext1;
        this.dMAType1 = dMAType1;
        this.kMAContext2 = kMAContext2;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  ((dMAContext1 != null) ? dMAContext1.generateJs() : "null"), wrapQuotes(dMAType1), wrapQuotes(kMAContext2), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(String dMAContext2, MovingAverageType dMAType, SmaContext kMAContext, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext2 = dMAContext2;
        this.dMAType = dMAType;
        this.kMAContext = kMAContext;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  wrapQuotes(dMAContext2), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kMAContext != null) ? kMAContext.generateJs() : "null"), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(String dMAContext2, MovingAverageType dMAType, SmaContext kMAContext, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext2 = dMAContext2;
        this.dMAType = dMAType;
        this.kMAContext = kMAContext;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  wrapQuotes(dMAContext2), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kMAContext != null) ? kMAContext.generateJs() : "null"), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(String dMAContext2, MovingAverageType dMAType, EmaContext kMAContext1, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext2 = dMAContext2;
        this.dMAType = dMAType;
        this.kMAContext1 = kMAContext1;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  wrapQuotes(dMAContext2), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kMAContext1 != null) ? kMAContext1.generateJs() : "null"), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(String dMAContext2, MovingAverageType dMAType, EmaContext kMAContext1, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext2 = dMAContext2;
        this.dMAType = dMAType;
        this.kMAContext1 = kMAContext1;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  wrapQuotes(dMAContext2), ((dMAType != null) ? dMAType.generateJs() : "null"), ((kMAContext1 != null) ? kMAContext1.generateJs() : "null"), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(String dMAContext2, MovingAverageType dMAType, String kMAContext2, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext2 = dMAContext2;
        this.dMAType = dMAType;
        this.kMAContext2 = kMAContext2;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  wrapQuotes(dMAContext2), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kMAContext2), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(String dMAContext2, MovingAverageType dMAType, String kMAContext2, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext2 = dMAContext2;
        this.dMAType = dMAType;
        this.kMAContext2 = kMAContext2;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  wrapQuotes(dMAContext2), ((dMAType != null) ? dMAType.generateJs() : "null"), wrapQuotes(kMAContext2), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(String dMAContext2, String dMAType1, SmaContext kMAContext, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext2 = dMAContext2;
        this.dMAType1 = dMAType1;
        this.kMAContext = kMAContext;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  wrapQuotes(dMAContext2), wrapQuotes(dMAType1), ((kMAContext != null) ? kMAContext.generateJs() : "null"), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(String dMAContext2, String dMAType1, SmaContext kMAContext, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext2 = dMAContext2;
        this.dMAType1 = dMAType1;
        this.kMAContext = kMAContext;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  wrapQuotes(dMAContext2), wrapQuotes(dMAType1), ((kMAContext != null) ? kMAContext.generateJs() : "null"), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(String dMAContext2, String dMAType1, EmaContext kMAContext1, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext2 = dMAContext2;
        this.dMAType1 = dMAType1;
        this.kMAContext1 = kMAContext1;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  wrapQuotes(dMAContext2), wrapQuotes(dMAType1), ((kMAContext1 != null) ? kMAContext1.generateJs() : "null"), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(String dMAContext2, String dMAType1, EmaContext kMAContext1, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext2 = dMAContext2;
        this.dMAType1 = dMAType1;
        this.kMAContext1 = kMAContext1;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  wrapQuotes(dMAContext2), wrapQuotes(dMAType1), ((kMAContext1 != null) ? kMAContext1.generateJs() : "null"), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(String dMAContext2, String dMAType1, String kMAContext2, MovingAverageType kMAType, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext2 = dMAContext2;
        this.dMAType1 = dMAType1;
        this.kMAContext2 = kMAContext2;
        this.kMAType = kMAType;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  wrapQuotes(dMAContext2), wrapQuotes(dMAType1), wrapQuotes(kMAContext2), ((kMAType != null) ? kMAType.generateJs() : "null"), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }
    public KdjContext(String dMAContext2, String dMAType1, String kMAContext2, String kMAType1, Number dMultiplier, CycledQueue highQueue, Number kMultiplier, Number kPeriod, CycledQueue lowQueue) {
        this.dMAContext2 = dMAContext2;
        this.dMAType1 = dMAType1;
        this.kMAContext2 = kMAContext2;
        this.kMAType1 = kMAType1;
        this.dMultiplier = dMultiplier;
        this.highQueue = highQueue;
        this.kMultiplier = kMultiplier;
        this.kPeriod = kPeriod;
        this.lowQueue = lowQueue;

        js.append(String.format(Locale.US, "{dMAContext: %s,dMAType: %s,kMAContext: %s,kMAType: %s,dMultiplier: %s,highQueue: %s,kMultiplier: %s,kPeriod: %s,lowQueue: %s}",  wrapQuotes(dMAContext2), wrapQuotes(dMAType1), wrapQuotes(kMAContext2), wrapQuotes(kMAType1), dMultiplier, ((highQueue != null) ? highQueue.generateJs() : "null"), kMultiplier, kPeriod, ((lowQueue != null) ? lowQueue.generateJs() : "null")));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}