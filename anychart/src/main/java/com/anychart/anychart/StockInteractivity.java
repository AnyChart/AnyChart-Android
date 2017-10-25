package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class StockInteractivity extends Interactivity {

    public StockInteractivity() {

    }

    protected StockInteractivity(String jsBase) {
        this.jsBase = jsBase;
    }

    protected StockInteractivity(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Boolean scrollOnMouseWheel;

    public StockInteractivity setScrollOnMouseWheel(Boolean scrollOnMouseWheel) {
        if (jsBase == null) {
            this.scrollOnMouseWheel = scrollOnMouseWheel;
        } else {
            this.scrollOnMouseWheel = scrollOnMouseWheel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".scrollOnMouseWheel(%b)", scrollOnMouseWheel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scrollOnMouseWheel(%b)", scrollOnMouseWheel));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean zoomOnMouseWheel;

    public StockInteractivity setZoomOnMouseWheel(Boolean zoomOnMouseWheel) {
        if (jsBase == null) {
            this.zoomOnMouseWheel = zoomOnMouseWheel;
        } else {
            this.zoomOnMouseWheel = zoomOnMouseWheel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".zoomOnMouseWheel(%b)", zoomOnMouseWheel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".zoomOnMouseWheel(%b)", zoomOnMouseWheel));
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
//            js.append(generateJSscrollOnMouseWheel());
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