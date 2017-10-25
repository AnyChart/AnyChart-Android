package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class CartesianSeriesContinuousBase extends CartesianSeriesBaseWithMarkers {

    public CartesianSeriesContinuousBase() {

    }

    protected CartesianSeriesContinuousBase(String jsBase) {
        this.jsBase = jsBase;
    }

    protected CartesianSeriesContinuousBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Boolean connectMissingPoints;

    public CartesianSeriesBase setConnectMissingPoints(Boolean connectMissingPoints) {
        if (jsBase == null) {
            this.connectMissingPoints = connectMissingPoints;
        } else {
            this.connectMissingPoints = connectMissingPoints;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".connectMissingPoints(%b);", connectMissingPoints));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".connectMissingPoints(%b)", connectMissingPoints));
                js.setLength(0);
            }
        }
        return new CartesianSeriesBase(jsBase);
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
//            js.append(generateJSconnectMissingPoints());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}