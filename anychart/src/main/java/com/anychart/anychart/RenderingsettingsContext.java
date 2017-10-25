package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
    private String state1;
    private Double baseZIndex;
    private String restrictShapes;

    public void getShapesGroup(PointState state, Double baseZIndex, String restrictShapes) {
        if (jsBase == null) {
            this.state = null;
            this.state1 = null;
            
            this.state = state;
            this.baseZIndex = baseZIndex;
            this.restrictShapes = restrictShapes;
        } else {
            this.state = state;
            this.baseZIndex = baseZIndex;
            this.restrictShapes = restrictShapes;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getShapesGroup(%s, %f, %s);", ((state != null) ? state.generateJs() : "null"), baseZIndex, wrapQuotes(restrictShapes)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getShapesGroup(%s, %f, %s)", ((state != null) ? state.generateJs() : "null"), baseZIndex, wrapQuotes(restrictShapes)));
                js.setLength(0);
            }
        }
    }


    public void getShapesGroup(String state1, Double baseZIndex, String restrictShapes) {
        if (jsBase == null) {
            this.state = null;
            this.state1 = null;
            
            this.state1 = state1;
            this.baseZIndex = baseZIndex;
            this.restrictShapes = restrictShapes;
        } else {
            this.state1 = state1;
            this.baseZIndex = baseZIndex;
            this.restrictShapes = restrictShapes;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getShapesGroup(%s, %f, %s);", wrapQuotes(state1), baseZIndex, wrapQuotes(restrictShapes)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getShapesGroup(%s, %f, %s)", wrapQuotes(state1), baseZIndex, wrapQuotes(restrictShapes)));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void getStat(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".getStat(%s);", wrapQuotes(key)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s)", wrapQuotes(key)));
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
//            js.append(generateJSstate());
////        
//            js.append(generateJSstate1());
////        
//            js.append(generateJSbaseZIndex());
////        
//            js.append(generateJSrestrictShapes());
////        
//            js.append(generateJSkey());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}