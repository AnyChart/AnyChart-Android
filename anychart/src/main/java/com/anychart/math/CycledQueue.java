package com.anychart.math;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Class for queues with random access by indexes. Default maximum queue length is 256. It dequeues automatically when
the length of the queue reaches that limit. So if you need larger queue - set the length limit explicitly.
 */
public class CycledQueue extends JsObject {

    protected CycledQueue() {

    }

    public static CycledQueue instantiate() {
        return new CycledQueue("new anychart.math.cycledQueue()");
    }

    

    public CycledQueue(String jsChart) {
        jsBase = "cycledQueue" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Clears the queue. You can optionally reset the queue length limit.
     */
    public void clear(Number newLengthLimit) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".clear(%s);", newLengthLimit));
    }
    /**
     * Removes the first item from the queue and returns it.
     */
    public void dequeue() {
        APIlib.getInstance().addJSLine(jsBase + ".dequeue();");
    }
    /**
     * Enqueues passed the item.
If this call dequeued an item - returns it.
     */
    public void enqueue(String item) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".enqueue(%s);", wrapQuotes(item)));
    }
    /**
     * Returns the queue item at the specified index.
The index can be negative - that is interpreted as the index from the end of the queue.
     */
    public void get(Number index) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".get(%s);", index));
    }
    /**
     * Returns current queue length.
     */
    public void getLength() {
        APIlib.getInstance().addJSLine(jsBase + ".getLength();");
    }

}