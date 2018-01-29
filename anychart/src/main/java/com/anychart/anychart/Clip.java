package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Class representing independent clip, that can be applied to any element.<br/>
Used to set one clip to many elements, and updates only clip.
 */
public class Clip extends JsObject {

    public Clip() {
        js.setLength(0);
        js.append("var clip").append(++variableIndex).append(" = anychart.graphics.vector.clip();");
        jsBase = "clip" + variableIndex;
    }

    protected Clip(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Clip(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Shape getShape;

    /**
     * Getter for the current shape of the clip.
     */
    public Shape getShape() {
        if (getShape == null)
            getShape = new Shape(jsBase + ".shape()");

        return getShape;
    }

    private Number[] shape;
    private Shape shape1;
    private GraphicsMathRect shape2;
    private String shape3;

    /**
     * Setter for the shape of the clip.
     */
    public Clip setShape(Number[] shape) {
        if (jsBase == null) {
            this.shape = null;
            this.shape1 = null;
            this.shape2 = null;
            this.shape3 = null;
            
            this.shape = shape;
        } else {
            this.shape = shape;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".shape(%s)", Arrays.toString(shape)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shape(%s);", Arrays.toString(shape)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the shape of the clip.
     */
    public Clip setShape(Shape shape1) {
        if (jsBase == null) {
            this.shape = null;
            this.shape1 = null;
            this.shape2 = null;
            this.shape3 = null;
            
            this.shape1 = shape1;
        } else {
            this.shape1 = shape1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(shape1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".shape(%s);",  ((shape1 != null) ? shape1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shape(%s);", ((shape1 != null) ? shape1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the shape of the clip.
     */
    public Clip setShape(GraphicsMathRect shape2) {
        if (jsBase == null) {
            this.shape = null;
            this.shape1 = null;
            this.shape2 = null;
            this.shape3 = null;
            
            this.shape2 = shape2;
        } else {
            this.shape2 = shape2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(shape2.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".shape(%s);",  ((shape2 != null) ? shape2.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shape(%s);", ((shape2 != null) ? shape2.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the shape of the clip.
     */
    public Clip setShape(String shape3) {
        if (jsBase == null) {
            this.shape = null;
            this.shape1 = null;
            this.shape2 = null;
            this.shape3 = null;
            
            this.shape3 = shape3;
        } else {
            this.shape3 = shape3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".shape(%s)", wrapQuotes(shape3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shape(%s);", wrapQuotes(shape3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number left;
    private Number top;
    private Number width;
    private Number height;

    /**
     * Setter for the shape of the clip with coordinates.
     */
    public Clip setShape(Number left, Number top, Number width, Number height) {
        if (jsBase == null) {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
        } else {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".shape(%s, %s, %s, %s)", left, top, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shape(%s, %s, %s, %s);", left, top, width, height));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetShape() {
        if (getShape != null) {
            return getShape.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetShape());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}