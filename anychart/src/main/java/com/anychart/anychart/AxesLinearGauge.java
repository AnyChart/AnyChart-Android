package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class AxesLinearGauge extends CoreAxesLinear {

    public AxesLinearGauge() {

    }

    protected AxesLinearGauge(String jsBase) {
        this.jsBase = jsBase;
    }

    protected AxesLinearGauge(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String offset;

    public AxesLinearGauge setOffset(String offset) {
        if (jsBase == null) {
            this.offset = offset;
        } else {
            this.offset = offset;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".offset(%s)", offset));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offset(%s)", offset));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSoffset() {
        if (offset != null) {
            return String.format(Locale.US, "offset: %s,", offset);
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
            js.append(generateJSoffset());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}