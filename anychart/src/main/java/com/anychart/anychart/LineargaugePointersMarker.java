package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Marker pointer class.
 */
public class LineargaugePointersMarker extends LineargaugePointersBase {

    public LineargaugePointersMarker() {
        js.setLength(0);
        js.append("var lineargaugePointersMarker").append(++variableIndex).append(" = anychart.core.linearGauge.pointers.marker();");
        jsBase = "lineargaugePointersMarker" + variableIndex;
    }

    protected LineargaugePointersMarker(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected LineargaugePointersMarker(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private MarkerType type;
    private String type1;
    private List<LineargaugePointersMarker> setType = new ArrayList<>();

    /**
     * Setter for the marker type.
     */
    public LineargaugePointersMarker setType(MarkerType type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".type(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetType() {
        if (!setType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LineargaugePointersMarker item : setType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<LineargaugePointersMarker> setType1 = new ArrayList<>();

    /**
     * Setter for the marker type.
     */
    public LineargaugePointersMarker setType(String type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".type(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetType1() {
        if (!setType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (LineargaugePointersMarker item : setType1) {
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

        js.append(generateJSsetType());
        js.append(generateJSsetType1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}