package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class RenderingSettings extends CoreBase {

    public RenderingSettings() {

    }

    protected RenderingSettings(String jsBase) {
        this.jsBase = jsBase;
    }

    protected RenderingSettings(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Boolean needsWidth;

    public RenderingSettings setNeedsWidth(Boolean needsWidth) {
        if (jsBase == null) {
            this.needsWidth = needsWidth;
        } else {
            this.needsWidth = needsWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".needsWidth(%b)", needsWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".needsWidth(%b)", needsWidth));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean needsZero;

    public RenderingSettings setNeedsZero(Boolean needsZero) {
        if (jsBase == null) {
            this.needsZero = needsZero;
        } else {
            this.needsZero = needsZero;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".needsZero(%b)", needsZero));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".needsZero(%b)", needsZero));
                js.setLength(0);
            }
        }
        return this;
    }

    private ShapeConfig[] shapes;

    public RenderingSettings setShapes(ShapeConfig[] shapes) {
        if (jsBase == null) {
            this.shapes = shapes;
        } else {
            this.shapes = shapes;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".shapes(%s)", arrayToString(shapes)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".shapes(%s)", arrayToString(shapes)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String[] yValues;

    public RenderingSettings setYValues(String[] yValues) {
        if (jsBase == null) {
            this.yValues = yValues;
        } else {
            this.yValues = yValues;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".yValues(%s)", arrayToStringWrapQuotes(yValues)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yValues(%s)", arrayToStringWrapQuotes(yValues)));
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
//            js.append(generateJSneedsWidth());
////        
//            js.append(generateJSneedsZero());
////        
//            js.append(generateJSshapes());
////        
//            js.append(generateJSyValues());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}