package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class CircularLabelsFactory extends UiLabelsFactory {

    public CircularLabelsFactory() {

    }

    protected CircularLabelsFactory(String jsBase) {
        this.jsBase = jsBase;
    }

    protected CircularLabelsFactory(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Boolean autoRotate;

    public CircularLabelsFactory setAutoRotate(Boolean autoRotate) {
        if (jsBase == null) {
            this.autoRotate = autoRotate;
        } else {
            this.autoRotate = autoRotate;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".autoRotate(%b)", autoRotate));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".autoRotate(%b)", autoRotate));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSautoRotate() {
        if (autoRotate != null) {
            return String.format(Locale.US, "autoRotate: %b,", autoRotate);
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
            js.append(generateJSautoRotate());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}