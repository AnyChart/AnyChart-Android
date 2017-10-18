package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class MapSeriesMarker extends MapSeriesBase {

    public MapSeriesMarker() {

    }

    protected MapSeriesMarker(String jsBase) {
        this.jsBase = jsBase;
    }

    protected MapSeriesMarker(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double size;

    public MapSeriesMarker setSize(Double size) {
        if (jsBase == null) {
            this.size = size;
        } else {
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".size(%f)", size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%f)", size));
                js.setLength(0);
            }
        }
        return this;
    }

    private MarkerType type;
    private String type1;

    public MapSeriesMarker setType(MarkerType type) {
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

            js.append(String.format(Locale.US, ".type(%s)", (type != null) ? type.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", (type != null) ? type.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public MapSeriesMarker setType(String type1) {
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

            js.append(String.format(Locale.US, ".type(%s)", type1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", type1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %f,", size);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", (type != null) ? type.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSsize());
            js.append(generateJStype());
            js.append(generateJStype1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}