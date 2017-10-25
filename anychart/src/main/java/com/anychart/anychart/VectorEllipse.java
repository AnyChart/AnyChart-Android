package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class VectorEllipse extends Shape {

    public VectorEllipse() {

    }

    protected VectorEllipse(String jsBase) {
        this.jsBase = jsBase;
    }

    protected VectorEllipse(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Coordinate getCenter;

    public Coordinate getCenter() {
        if (getCenter == null)
            getCenter = new Coordinate(jsBase + ".center()");

        return getCenter;
    }

    private Coordinate center;

    public VectorEllipse setCenter(Coordinate center) {
        if (jsBase == null) {
            this.center = center;
        } else {
            this.center = center;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".center(%s)", ((center != null) ? center.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".center(%s)", ((center != null) ? center.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double centerX;

    public VectorEllipse setCenterX(Double centerX) {
        if (jsBase == null) {
            this.centerX = centerX;
        } else {
            this.centerX = centerX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".centerX(%f)", centerX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".centerX(%f)", centerX));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double centerY;

    public VectorEllipse setCenterY(Double centerY) {
        if (jsBase == null) {
            this.centerY = centerY;
        } else {
            this.centerY = centerY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".centerY(%f)", centerY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".centerY(%f)", centerY));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double radiusX;

    public VectorEllipse setRadiusX(Double radiusX) {
        if (jsBase == null) {
            this.radiusX = radiusX;
        } else {
            this.radiusX = radiusX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".radiusX(%f)", radiusX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".radiusX(%f)", radiusX));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double radiusY;

    public VectorEllipse setRadiusY(Double radiusY) {
        if (jsBase == null) {
            this.radiusY = radiusY;
        } else {
            this.radiusY = radiusY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".radiusY(%f)", radiusY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".radiusY(%f)", radiusY));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double rx;
    private Double ry;

    public VectorEllipse setSetRadius(Double rx, Double ry) {
        if (jsBase == null) {
            this.rx = rx;
            this.ry = ry;
        } else {
            this.rx = rx;
            this.ry = ry;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setRadius(%f, %f)", rx, ry));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setRadius(%f, %f)", rx, ry));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSCoordinate getCenter() {
//        if (Coordinate getCenter != null) {
//            return Coordinate getCenter.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetCenter() {
        if (getCenter != null) {
            return getCenter.generateJs();
            //return String.format(Locale.US, "getCenter: %s,", ((getCenter != null) ? getCenter.generateJs() : "null"));
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetCenter());

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
//            js.append(generateJScenter());
////        
//            js.append(generateJScenterX());
////        
//            js.append(generateJScenterY());
////        
//            js.append(generateJSradiusX());
////        
//            js.append(generateJSradiusY());
////        
//            js.append(generateJSrx());
////        
//            js.append(generateJSry());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}