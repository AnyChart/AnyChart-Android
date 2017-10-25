package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class CycledQueue extends JsObject {

    public CycledQueue() {

    }

    protected CycledQueue(String jsBase) {
        this.jsBase = jsBase;
    }

    protected CycledQueue(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double newLengthLimit;

    public void clear(Double newLengthLimit) {
        if (jsBase == null) {
            this.newLengthLimit = newLengthLimit;
        } else {
            this.newLengthLimit = newLengthLimit;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".clear(%f);", newLengthLimit));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".clear(%f)", newLengthLimit));
                js.setLength(0);
            }
        }
    }

    private Double index;

    public void get(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".get(%f);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%f)", index));
                js.setLength(0);
            }
        }
    }


//

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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSnewLengthLimit());
////        
//            js.append(generateJSindex());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}