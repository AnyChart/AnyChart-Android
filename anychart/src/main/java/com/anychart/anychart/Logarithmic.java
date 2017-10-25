package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class Logarithmic extends ScalesLinear {

    public Logarithmic() {

    }

    protected Logarithmic(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Logarithmic(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double logBase;

    public Logarithmic setLogBase(Double logBase) {
        if (jsBase == null) {
            this.logBase = logBase;
        } else {
            this.logBase = logBase;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".logBase(%f)", logBase));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".logBase(%f)", logBase));
                js.setLength(0);
            }
        }
        return this;
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
//            js.append(generateJSlogBase());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}