package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class VectorRect extends Shape {

    public VectorRect() {

    }

    protected VectorRect(String jsBase) {
        this.jsBase = jsBase;
    }

    protected VectorRect(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String radiusAll;
    private Double radiusAll1;

    public VectorRect setCut(String radiusAll) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            
            this.radiusAll = radiusAll;
        } else {
            this.radiusAll = radiusAll;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".cut(%s)", radiusAll));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cut(%s)", radiusAll));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorRect setCut(Double radiusAll1) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            
            this.radiusAll1 = radiusAll1;
        } else {
            this.radiusAll1 = radiusAll1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".cut(%f)", radiusAll1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cut(%f)", radiusAll1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double radiusLeftTop;
    private Double radiusRightTop;
    private Double radiusRightBottom;
    private Double radiusLeftBottom;

    public VectorRect setCut(Double radiusLeftTop, Double radiusRightTop, Double radiusRightBottom, Double radiusLeftBottom) {
        if (jsBase == null) {
            this.radiusLeftTop = radiusLeftTop;
            this.radiusRightTop = radiusRightTop;
            this.radiusRightBottom = radiusRightBottom;
            this.radiusLeftBottom = radiusLeftBottom;
        } else {
            this.radiusLeftTop = radiusLeftTop;
            this.radiusRightTop = radiusRightTop;
            this.radiusRightBottom = radiusRightBottom;
            this.radiusLeftBottom = radiusLeftBottom;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".cut(%f, %f, %f, %f)", radiusLeftTop, radiusRightTop, radiusRightBottom, radiusLeftBottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cut(%f, %f, %f, %f)", radiusLeftTop, radiusRightTop, radiusRightBottom, radiusLeftBottom));
                js.setLength(0);
            }
        }
        return this;
    }

    private String radiusAll2;
    private Double radiusAll3;

    public VectorRect setRound(String radiusAll2) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            this.radiusAll2 = null;
            this.radiusAll3 = null;
            
            this.radiusAll2 = radiusAll2;
        } else {
            this.radiusAll2 = radiusAll2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".round(%s)", radiusAll2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".round(%s)", radiusAll2));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorRect setRound(Double radiusAll3) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            this.radiusAll2 = null;
            this.radiusAll3 = null;
            
            this.radiusAll3 = radiusAll3;
        } else {
            this.radiusAll3 = radiusAll3;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".round(%f)", radiusAll3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".round(%f)", radiusAll3));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double radiusLeftTop1;
    private Double radiusRightTop1;
    private Double radiusRightBottom1;
    private Double radiusLeftBottom1;

    public VectorRect setRound(Double radiusLeftTop1, Double radiusRightTop1, Double radiusRightBottom1, Double radiusLeftBottom1) {
        if (jsBase == null) {
            this.radiusLeftTop = null;
            this.radiusLeftTop1 = null;
            
            this.radiusLeftTop1 = radiusLeftTop1;
            this.radiusRightTop = null;
            this.radiusRightTop1 = null;
            
            this.radiusRightTop1 = radiusRightTop1;
            this.radiusRightBottom = null;
            this.radiusRightBottom1 = null;
            
            this.radiusRightBottom1 = radiusRightBottom1;
            this.radiusLeftBottom = null;
            this.radiusLeftBottom1 = null;
            
            this.radiusLeftBottom1 = radiusLeftBottom1;
        } else {
            this.radiusLeftTop1 = radiusLeftTop1;
            this.radiusRightTop1 = radiusRightTop1;
            this.radiusRightBottom1 = radiusRightBottom1;
            this.radiusLeftBottom1 = radiusLeftBottom1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".round(%f, %f, %f, %f)", radiusLeftTop1, radiusRightTop1, radiusRightBottom1, radiusLeftBottom1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".round(%f, %f, %f, %f)", radiusLeftTop1, radiusRightTop1, radiusRightBottom1, radiusLeftBottom1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String radiusAll4;
    private Double radiusAll5;

    public VectorRect setRoundInner(String radiusAll4) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            this.radiusAll2 = null;
            this.radiusAll3 = null;
            this.radiusAll4 = null;
            this.radiusAll5 = null;
            
            this.radiusAll4 = radiusAll4;
        } else {
            this.radiusAll4 = radiusAll4;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".roundInner(%s)", radiusAll4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".roundInner(%s)", radiusAll4));
                js.setLength(0);
            }
        }
        return this;
    }


    public VectorRect setRoundInner(Double radiusAll5) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            this.radiusAll2 = null;
            this.radiusAll3 = null;
            this.radiusAll4 = null;
            this.radiusAll5 = null;
            
            this.radiusAll5 = radiusAll5;
        } else {
            this.radiusAll5 = radiusAll5;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".roundInner(%f)", radiusAll5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".roundInner(%f)", radiusAll5));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double radiusLeftTop2;
    private Double radiusRightTop2;
    private Double radiusRightBottom2;
    private Double radiusLeftBottom2;

    public VectorRect setRoundInner(Double radiusLeftTop2, Double radiusRightTop2, Double radiusRightBottom2, Double radiusLeftBottom2) {
        if (jsBase == null) {
            this.radiusLeftTop = null;
            this.radiusLeftTop1 = null;
            this.radiusLeftTop2 = null;
            
            this.radiusLeftTop2 = radiusLeftTop2;
            this.radiusRightTop = null;
            this.radiusRightTop1 = null;
            this.radiusRightTop2 = null;
            
            this.radiusRightTop2 = radiusRightTop2;
            this.radiusRightBottom = null;
            this.radiusRightBottom1 = null;
            this.radiusRightBottom2 = null;
            
            this.radiusRightBottom2 = radiusRightBottom2;
            this.radiusLeftBottom = null;
            this.radiusLeftBottom1 = null;
            this.radiusLeftBottom2 = null;
            
            this.radiusLeftBottom2 = radiusLeftBottom2;
        } else {
            this.radiusLeftTop2 = radiusLeftTop2;
            this.radiusRightTop2 = radiusRightTop2;
            this.radiusRightBottom2 = radiusRightBottom2;
            this.radiusLeftBottom2 = radiusLeftBottom2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".roundInner(%f, %f, %f, %f)", radiusLeftTop2, radiusRightTop2, radiusRightBottom2, radiusLeftBottom2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".roundInner(%f, %f, %f, %f)", radiusLeftTop2, radiusRightTop2, radiusRightBottom2, radiusLeftBottom2));
                js.setLength(0);
            }
        }
        return this;
    }

    private GraphicsMathRect setBounds;

    public VectorRect setSetBounds(GraphicsMathRect setBounds) {
        if (jsBase == null) {
            this.setBounds = setBounds;
        } else {
            this.setBounds = setBounds;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setBounds(%s)", (setBounds != null) ? setBounds.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setBounds(%s)", (setBounds != null) ? setBounds.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double setHeight;

    public VectorRect setSetHeight(Double setHeight) {
        if (jsBase == null) {
            this.setHeight = setHeight;
        } else {
            this.setHeight = setHeight;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setHeight(%f)", setHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setHeight(%f)", setHeight));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double setWidth;

    public VectorRect setSetWidth(Double setWidth) {
        if (jsBase == null) {
            this.setWidth = setWidth;
        } else {
            this.setWidth = setWidth;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setWidth(%f)", setWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setWidth(%f)", setWidth));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double setX;

    public VectorRect setSetX(Double setX) {
        if (jsBase == null) {
            this.setX = setX;
        } else {
            this.setX = setX;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setX(%f)", setX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setX(%f)", setX));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double setY;

    public VectorRect setSetY(Double setY) {
        if (jsBase == null) {
            this.setY = setY;
        } else {
            this.setY = setY;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setY(%f)", setY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setY(%f)", setY));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSradiusAll() {
        if (radiusAll != null) {
            return String.format(Locale.US, "radiusAll: %s,", radiusAll);
        }
        return "";
    }

    private String generateJSradiusAll1() {
        if (radiusAll1 != null) {
            return String.format(Locale.US, "radiusAll: %f,", radiusAll1);
        }
        return "";
    }

    private String generateJSradiusLeftTop() {
        if (radiusLeftTop != null) {
            return String.format(Locale.US, "radiusLeftTop: %f,", radiusLeftTop);
        }
        return "";
    }

    private String generateJSradiusRightTop() {
        if (radiusRightTop != null) {
            return String.format(Locale.US, "radiusRightTop: %f,", radiusRightTop);
        }
        return "";
    }

    private String generateJSradiusRightBottom() {
        if (radiusRightBottom != null) {
            return String.format(Locale.US, "radiusRightBottom: %f,", radiusRightBottom);
        }
        return "";
    }

    private String generateJSradiusLeftBottom() {
        if (radiusLeftBottom != null) {
            return String.format(Locale.US, "radiusLeftBottom: %f,", radiusLeftBottom);
        }
        return "";
    }

    private String generateJSradiusAll2() {
        if (radiusAll2 != null) {
            return String.format(Locale.US, "radiusAll: %s,", radiusAll2);
        }
        return "";
    }

    private String generateJSradiusAll3() {
        if (radiusAll3 != null) {
            return String.format(Locale.US, "radiusAll: %f,", radiusAll3);
        }
        return "";
    }

    private String generateJSradiusLeftTop1() {
        if (radiusLeftTop1 != null) {
            return String.format(Locale.US, "radiusLeftTop: %f,", radiusLeftTop1);
        }
        return "";
    }

    private String generateJSradiusRightTop1() {
        if (radiusRightTop1 != null) {
            return String.format(Locale.US, "radiusRightTop: %f,", radiusRightTop1);
        }
        return "";
    }

    private String generateJSradiusRightBottom1() {
        if (radiusRightBottom1 != null) {
            return String.format(Locale.US, "radiusRightBottom: %f,", radiusRightBottom1);
        }
        return "";
    }

    private String generateJSradiusLeftBottom1() {
        if (radiusLeftBottom1 != null) {
            return String.format(Locale.US, "radiusLeftBottom: %f,", radiusLeftBottom1);
        }
        return "";
    }

    private String generateJSradiusAll4() {
        if (radiusAll4 != null) {
            return String.format(Locale.US, "radiusAll: %s,", radiusAll4);
        }
        return "";
    }

    private String generateJSradiusAll5() {
        if (radiusAll5 != null) {
            return String.format(Locale.US, "radiusAll: %f,", radiusAll5);
        }
        return "";
    }

    private String generateJSradiusLeftTop2() {
        if (radiusLeftTop2 != null) {
            return String.format(Locale.US, "radiusLeftTop: %f,", radiusLeftTop2);
        }
        return "";
    }

    private String generateJSradiusRightTop2() {
        if (radiusRightTop2 != null) {
            return String.format(Locale.US, "radiusRightTop: %f,", radiusRightTop2);
        }
        return "";
    }

    private String generateJSradiusRightBottom2() {
        if (radiusRightBottom2 != null) {
            return String.format(Locale.US, "radiusRightBottom: %f,", radiusRightBottom2);
        }
        return "";
    }

    private String generateJSradiusLeftBottom2() {
        if (radiusLeftBottom2 != null) {
            return String.format(Locale.US, "radiusLeftBottom: %f,", radiusLeftBottom2);
        }
        return "";
    }

    private String generateJSsetBounds() {
        if (setBounds != null) {
            return String.format(Locale.US, "setBounds: %s,", (setBounds != null) ? setBounds.generateJs() : "null");
        }
        return "";
    }

    private String generateJSsetHeight() {
        if (setHeight != null) {
            return String.format(Locale.US, "setHeight: %f,", setHeight);
        }
        return "";
    }

    private String generateJSsetWidth() {
        if (setWidth != null) {
            return String.format(Locale.US, "setWidth: %f,", setWidth);
        }
        return "";
    }

    private String generateJSsetX() {
        if (setX != null) {
            return String.format(Locale.US, "setX: %f,", setX);
        }
        return "";
    }

    private String generateJSsetY() {
        if (setY != null) {
            return String.format(Locale.US, "setY: %f,", setY);
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
            js.append(generateJSradiusAll());
            js.append(generateJSradiusAll1());
            js.append(generateJSradiusLeftTop());
            js.append(generateJSradiusRightTop());
            js.append(generateJSradiusRightBottom());
            js.append(generateJSradiusLeftBottom());
            js.append(generateJSradiusAll2());
            js.append(generateJSradiusAll3());
            js.append(generateJSradiusLeftTop1());
            js.append(generateJSradiusRightTop1());
            js.append(generateJSradiusRightBottom1());
            js.append(generateJSradiusLeftBottom1());
            js.append(generateJSradiusAll4());
            js.append(generateJSradiusAll5());
            js.append(generateJSradiusLeftTop2());
            js.append(generateJSradiusRightTop2());
            js.append(generateJSradiusRightBottom2());
            js.append(generateJSradiusLeftBottom2());
            js.append(generateJSsetBounds());
            js.append(generateJSsetHeight());
            js.append(generateJSsetWidth());
            js.append(generateJSsetX());
            js.append(generateJSsetY());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}