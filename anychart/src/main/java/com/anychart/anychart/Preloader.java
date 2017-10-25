package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class Preloader extends JsObject {

    public Preloader() {

    }

    protected Preloader(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Preloader(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Element element;

    public void decorate(Element element) {
        if (jsBase == null) {
            this.element = element;
        } else {
            this.element = element;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".decorate(%s);", ((element != null) ? element.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".decorate(%s)", ((element != null) ? element.generateJs() : "null")));
                js.setLength(0);
            }
        }
    }

    private Element parentElement;

    public void render(Element parentElement) {
        if (jsBase == null) {
            this.parentElement = parentElement;
        } else {
            this.parentElement = parentElement;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".render(%s);", ((parentElement != null) ? parentElement.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".render(%s)", ((parentElement != null) ? parentElement.generateJs() : "null")));
                js.setLength(0);
            }
        }
    }

    private Boolean visible;

    public Preloader setVisible(Boolean visible) {
        if (jsBase == null) {
            this.visible = visible;
        } else {
            this.visible = visible;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".visible(%b)", visible));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".visible(%b)", visible));
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
//            js.append(generateJSelement());
////        
//            js.append(generateJSparentElement());
////        
//            js.append(generateJSvisible());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}