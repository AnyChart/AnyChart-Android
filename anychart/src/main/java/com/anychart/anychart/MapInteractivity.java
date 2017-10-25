package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class MapInteractivity extends Interactivity {

    public MapInteractivity() {

    }

    protected MapInteractivity(String jsBase) {
        this.jsBase = jsBase;
    }

    protected MapInteractivity(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Boolean drag;

    public MapInteractivity drag(Boolean drag) {
        if (jsBase == null) {
            this.drag = drag;
        } else {
            this.drag = drag;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".drag(%b)", drag));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".drag(%b)", drag));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean keyboardZoomAndMove;

    public Interactivity keyboardZoomAndMove(Boolean keyboardZoomAndMove) {
        if (jsBase == null) {
            this.keyboardZoomAndMove = keyboardZoomAndMove;
        } else {
            this.keyboardZoomAndMove = keyboardZoomAndMove;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".keyboardZoomAndMove(%b);", keyboardZoomAndMove));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keyboardZoomAndMove(%b)", keyboardZoomAndMove));
                js.setLength(0);
            }
        }
        return new Interactivity(jsBase);
    }

    private Boolean zoomOnDoubleClick;

    public Interactivity zoomOnDoubleClick(Boolean zoomOnDoubleClick) {
        if (jsBase == null) {
            this.zoomOnDoubleClick = zoomOnDoubleClick;
        } else {
            this.zoomOnDoubleClick = zoomOnDoubleClick;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".zoomOnDoubleClick(%b);", zoomOnDoubleClick));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomOnDoubleClick(%b)", zoomOnDoubleClick));
                js.setLength(0);
            }
        }
        return new Interactivity(jsBase);
    }

    private Boolean zoomOnMouseWheel;

    public Interactivity zoomOnMouseWheel(Boolean zoomOnMouseWheel) {
        if (jsBase == null) {
            this.zoomOnMouseWheel = zoomOnMouseWheel;
        } else {
            this.zoomOnMouseWheel = zoomOnMouseWheel;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".zoomOnMouseWheel(%b);", zoomOnMouseWheel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomOnMouseWheel(%b)", zoomOnMouseWheel));
                js.setLength(0);
            }
        }
        return new Interactivity(jsBase);
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
//            js.append(generateJSdrag());
////        
//            js.append(generateJSkeyboardZoomAndMove());
////        
//            js.append(generateJSzoomOnDoubleClick());
////        
//            js.append(generateJSzoomOnMouseWheel());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}