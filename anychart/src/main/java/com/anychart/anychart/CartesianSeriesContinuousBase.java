package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * A base for all continuous series, like lines, splines, areas, etc.
 */
public class CartesianSeriesContinuousBase extends CartesianSeriesBaseWithMarkers {

    public CartesianSeriesContinuousBase() {
        js.setLength(0);
        js.append("var cartesianSeriesContinuousBase").append(++variableIndex).append(" = anychart.core.cartesian.series.continuousBase();");
        jsBase = "cartesianSeriesContinuousBase" + variableIndex;
    }

    protected CartesianSeriesContinuousBase(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CartesianSeriesContinuousBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean connectMissingPoints;
    private List<CartesianSeriesBase> setConnectMissingPoints = new ArrayList<>();

    /**
     * Setter for connect missing points settings.
     */
    public CartesianSeriesBase setConnectMissingPoints(Boolean connectMissingPoints) {
        if (jsBase == null) {
            this.connectMissingPoints = connectMissingPoints;
        } else {
            this.connectMissingPoints = connectMissingPoints;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setConnectMissingPoints" + ++variableIndex + " = " + jsBase + ".connectMissingPoints(%b);", connectMissingPoints));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".connectMissingPoints(%b);", connectMissingPoints));
                js.setLength(0);
            }
        }
        CartesianSeriesBase item = new CartesianSeriesBase("setConnectMissingPoints" + variableIndex);
        setConnectMissingPoints.add(item);
        return item;
    }
    private String generateJSsetConnectMissingPoints() {
        if (!setConnectMissingPoints.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CartesianSeriesBase item : setConnectMissingPoints) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJSsetConnectMissingPoints());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}