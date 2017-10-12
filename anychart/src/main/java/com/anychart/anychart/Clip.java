package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Clip extends JsObject {

    public Clip() {

    }

    protected Clip(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Clip(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Shape getShape;

    public Shape getShape() {
        if (getShape == null)
            getShape = new Shape(jsBase + ".shape()");

        return getShape;
    }

    private Double[] shape;
    private Shape shape1;
    private GraphicsMathRect shape2;
    private String shape3;

    public Clip setShape(Double[] shape) {
        if (jsBase == null) {
            this.shape = null;
            this.shape1 = null;
            this.shape2 = null;
            this.shape3 = null;
            
            this.shape = shape;
        } else {
            this.shape = shape;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".shape(%s)", Arrays.toString(shape)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".shape(%s)", Arrays.toString(shape)));
                js.setLength(0);
            }
        }
        return this;
    }


    public Clip setShape(Shape shape1) {
        if (jsBase == null) {
            this.shape = null;
            this.shape1 = null;
            this.shape2 = null;
            this.shape3 = null;
            
            this.shape1 = shape1;
        } else {
            this.shape1 = shape1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".shape(%s)", (shape1 != null) ? shape1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".shape(%s)", (shape1 != null) ? shape1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Clip setShape(GraphicsMathRect shape2) {
        if (jsBase == null) {
            this.shape = null;
            this.shape1 = null;
            this.shape2 = null;
            this.shape3 = null;
            
            this.shape2 = shape2;
        } else {
            this.shape2 = shape2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".shape(%s)", (shape2 != null) ? shape2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".shape(%s)", (shape2 != null) ? shape2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Clip setShape(String shape3) {
        if (jsBase == null) {
            this.shape = null;
            this.shape1 = null;
            this.shape2 = null;
            this.shape3 = null;
            
            this.shape3 = shape3;
        } else {
            this.shape3 = shape3;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".shape(%s)", shape3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".shape(%s)", shape3));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double left;
    private Double top;
    private Double width;
    private Double height;

    public Clip setShape(Double left, Double top, Double width, Double height) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".shape(%f, %f, %f, %f)", left, top, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".shape(%f, %f, %f, %f)", left, top, width, height));
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

    private String generateJSshape() {
        if (shape != null) {
            return String.format(Locale.US, "shape: %s,", Arrays.toString(shape));
        }
        return "";
    }

    private String generateJSshape1() {
        if (shape1 != null) {
            return String.format(Locale.US, "shape: %s,", (shape1 != null) ? shape1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSshape2() {
        if (shape2 != null) {
            return String.format(Locale.US, "shape: %s,", (shape2 != null) ? shape2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSshape3() {
        if (shape3 != null) {
            return String.format(Locale.US, "shape: %s,", shape3);
        }
        return "";
    }

    private String generateJSleft() {
        if (left != null) {
            return String.format(Locale.US, "left: %f,", left);
        }
        return "";
    }

    private String generateJStop() {
        if (top != null) {
            return String.format(Locale.US, "top: %f,", top);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSshape());
            js.append(generateJSshape1());
            js.append(generateJSshape2());
            js.append(generateJSshape3());
            js.append(generateJSleft());
            js.append(generateJStop());
            js.append(generateJSwidth());
            js.append(generateJSheight());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}