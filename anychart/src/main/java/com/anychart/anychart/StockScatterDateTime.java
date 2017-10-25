package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class StockScatterDateTime extends CoreBase {

    public StockScatterDateTime() {

    }

    protected StockScatterDateTime(String jsBase) {
        this.jsBase = jsBase;
    }

    protected StockScatterDateTime(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double ratio;

    public void inverseTransform(Double ratio) {
        if (jsBase == null) {
            this.ratio = ratio;
        } else {
            this.ratio = ratio;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".inverseTransform(%f);", ratio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".inverseTransform(%f)", ratio));
                js.setLength(0);
            }
        }
    }

    private Double transform;
    private String transform1;

    public void transform(Double transform) {
        if (jsBase == null) {
            this.transform = null;
            this.transform1 = null;
            
            this.transform = transform;
        } else {
            this.transform = transform;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".transform(%f);", transform));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transform(%f)", transform));
                js.setLength(0);
            }
        }
    }


    public void transform(String transform1) {
        if (jsBase == null) {
            this.transform = null;
            this.transform1 = null;
            
            this.transform1 = transform1;
        } else {
            this.transform1 = transform1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".transform(%s);", wrapQuotes(transform1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transform(%s)", wrapQuotes(transform1)));
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
//            js.append(generateJSratio());
////        
//            js.append(generateJStransform());
////        
//            js.append(generateJStransform1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}