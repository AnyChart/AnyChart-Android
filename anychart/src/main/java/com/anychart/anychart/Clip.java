package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Clip extends JsObject {

    
    private Double[] shape;
    private Shape shape1;
    private GraphicsMathRect shape2;

    public void setShape(Double[] shape) {
        this.shape = null;
        this.shape1 = null;
        this.shape2 = null;
        
        this.shape = shape;
    }


    public void setShape(Shape shape1) {
        this.shape = null;
        this.shape1 = null;
        this.shape2 = null;
        
        this.shape1 = shape1;
    }


    public void setShape(GraphicsMathRect shape2) {
        this.shape = null;
        this.shape1 = null;
        this.shape2 = null;
        
        this.shape2 = shape2;
    }

    private Double left;
    private Double top;
    private Double width;
    private Double height;

    public void setShape(Double left, Double top, Double width, Double height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
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


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSshape());
        js.append(generateJSshape1());
        js.append(generateJSshape2());
        js.append(generateJSleft());
        js.append(generateJStop());
        js.append(generateJSwidth());
        js.append(generateJSheight());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}