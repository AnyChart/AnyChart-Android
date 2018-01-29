package com.anychart.anychart;

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

    public CycledQueue() {
        js.setLength(0);
        js.append("var cycledQueue").append(++variableIndex).append(" = anychart.math.cycledQueue();");
        jsBase = "cycledQueue" + variableIndex;
    }

    protected CycledQueue(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CycledQueue(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number newLengthLimit;

    /**
     * Clears the queue. You can optionally reset the queue length limit.
     */
    public void clear(Number newLengthLimit) {
        if (jsBase == null) {
            this.newLengthLimit = newLengthLimit;
        } else {
            this.newLengthLimit = newLengthLimit;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".clear(%s);", newLengthLimit));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".clear(%s);", newLengthLimit));
                js.setLength(0);
            }
        }
    }

    private Number index;

    /**
     * Returns the queue item at the specified index.
The index can be negative - that is interpreted as the index from the end of the queue.
     */
    public void get(Number index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".get(%s);", index));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%s);", index));
                js.setLength(0);
            }
        }
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}