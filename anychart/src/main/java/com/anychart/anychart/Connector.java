package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class Connector extends MapSeriesBaseWithMarkers {

    public Connector() {

    }

    protected Connector(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Connector(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double curvature;
    private String curvature1;

    public Connector setCurvature(Double curvature) {
        if (jsBase == null) {
            this.curvature = null;
            this.curvature1 = null;
            
            this.curvature = curvature;
        } else {
            this.curvature = curvature;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".curvature(%f)", curvature));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".curvature(%f)", curvature));
                js.setLength(0);
            }
        }
        return this;
    }


    public Connector setCurvature(String curvature1) {
        if (jsBase == null) {
            this.curvature = null;
            this.curvature1 = null;
            
            this.curvature1 = curvature1;
        } else {
            this.curvature1 = curvature1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".curvature(%s)", wrapQuotes(curvature1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".curvature(%s)", wrapQuotes(curvature1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<Connector> getEndSize = new ArrayList<>();

    public Connector getEndSize(Double endSize) {
        Connector item = new Connector(jsBase + ".endSize(" + endSize + ")");
        getEndSize.add(item);
        return item;
    }

    private List<Connector> getEndSize1 = new ArrayList<>();

    public Connector getEndSize(String endSize) {
        Connector item = new Connector(jsBase + ".endSize(" + wrapQuotes(endSize) + ")");
        getEndSize1.add(item);
        return item;
    }

    private Double startSize;
    private String startSize1;

    public Connector setStartSize(Double startSize) {
        if (jsBase == null) {
            this.startSize = null;
            this.startSize1 = null;
            
            this.startSize = startSize;
        } else {
            this.startSize = startSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".startSize(%f)", startSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startSize(%f)", startSize));
                js.setLength(0);
            }
        }
        return this;
    }


    public Connector setStartSize(String startSize1) {
        if (jsBase == null) {
            this.startSize = null;
            this.startSize1 = null;
            
            this.startSize1 = startSize1;
        } else {
            this.startSize1 = startSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".startSize(%s)", wrapQuotes(startSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startSize(%s)", wrapQuotes(startSize1)));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSConnector getEndSize() {
//        if (Connector getEndSize != null) {
//            return Connector getEndSize.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSConnector getEndSize1() {
//        if (Connector getEndSize1 != null) {
//            return Connector getEndSize1.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetEndSize() {
        if (!getEndSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : getEndSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetEndSize1() {
        if (!getEndSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Connector item : getEndSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetEndSize());
        jsGetters.append(generateJSgetEndSize1());

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
//            js.append(generateJScurvature());
////        
//            js.append(generateJScurvature1());
////        
//            js.append(generateJSstartSize());
////        
//            js.append(generateJSstartSize1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}