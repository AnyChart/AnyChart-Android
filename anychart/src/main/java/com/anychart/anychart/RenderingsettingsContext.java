package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class RenderingsettingsContext extends JsObject {

    public RenderingsettingsContext() {

    }

    protected RenderingsettingsContext(String jsBase) {
        this.jsBase = jsBase;
    }

    protected RenderingsettingsContext(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private PointState state;
    private Double baseZIndex;
    private String restrictShapes;

    public void setGetShapesGroup(PointState state, Double baseZIndex, String restrictShapes) {
        if (jsBase == null) {
            this.state = state;
            this.baseZIndex = baseZIndex;
            this.restrictShapes = restrictShapes;
        } else {
            this.state = state;
            this.baseZIndex = baseZIndex;
            this.restrictShapes = restrictShapes;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getShapesGroup(%s, %f, %s);", (state != null) ? state.generateJs() : "null", baseZIndex, restrictShapes));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getShapesGroup(%s, %f, %s)", (state != null) ? state.generateJs() : "null", baseZIndex, restrictShapes));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setGetStat(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getStat(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s)", key));
                js.setLength(0);
            }
        }
    }

    private String generateJSstate() {
        if (state != null) {
            return String.format(Locale.US, "state: %s,", (state != null) ? state.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbaseZIndex() {
        if (baseZIndex != null) {
            return String.format(Locale.US, "baseZIndex: %f,", baseZIndex);
        }
        return "";
    }

    private String generateJSrestrictShapes() {
        if (restrictShapes != null) {
            return String.format(Locale.US, "restrictShapes: %s,", restrictShapes);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
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
            js.append(generateJSstate());
            js.append(generateJSbaseZIndex());
            js.append(generateJSrestrictShapes());
            js.append(generateJSkey());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}