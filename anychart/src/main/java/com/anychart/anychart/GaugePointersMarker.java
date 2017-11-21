package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Marker pointer class.
 */
public class GaugePointersMarker extends GaugePointersBase {

    public GaugePointersMarker() {
        js.setLength(0);
        js.append("var gaugePointersMarker").append(++variableIndex).append(" = anychart.core.gauge.pointers.marker();");
        jsBase = "gaugePointersMarker" + variableIndex;
    }

    protected GaugePointersMarker(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected GaugePointersMarker(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private GaugeSidePosition position;
    private String position1;
    private List<GaugePointersMarker> setPosition = new ArrayList<>();

    /**
     * Setter for the marker position.
     */
    public GaugePointersMarker setPosition(GaugeSidePosition position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition() {
        if (!setPosition.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GaugePointersMarker item : setPosition) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GaugePointersMarker> setPosition1 = new ArrayList<>();

    /**
     * Setter for the marker position.
     */
    public GaugePointersMarker setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition1() {
        if (!setPosition1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GaugePointersMarker item : setPosition1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double radius;
    private String radius1;
    private List<GaugePointersMarker> setRadius = new ArrayList<>();

    /**
     * Setter for the marker radius.
     */
    public GaugePointersMarker setRadius(Double radius) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius = radius;
        } else {
            this.radius = radius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".radius(%f)", radius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".radius(%f)", radius));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRadius() {
        if (!setRadius.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GaugePointersMarker item : setRadius) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GaugePointersMarker> setRadius1 = new ArrayList<>();

    /**
     * Setter for the marker radius.
     */
    public GaugePointersMarker setRadius(String radius1) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius1 = radius1;
        } else {
            this.radius1 = radius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".radius(%s)", wrapQuotes(radius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".radius(%s)", wrapQuotes(radius1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRadius1() {
        if (!setRadius1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GaugePointersMarker item : setRadius1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double size;
    private String size1;
    private List<GaugePointersMarker> setSize = new ArrayList<>();

    /**
     * Setter for the marker size.
     */
    public GaugePointersMarker setSize(Double size) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size = size;
        } else {
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".size(%f)", size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%f)", size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSize() {
        if (!setSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GaugePointersMarker item : setSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GaugePointersMarker> setSize1 = new ArrayList<>();

    /**
     * Setter for the marker size.
     */
    public GaugePointersMarker setSize(String size1) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.size1 = size1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".size(%s)", wrapQuotes(size1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%s)", wrapQuotes(size1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSize1() {
        if (!setSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GaugePointersMarker item : setSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private MarkerType type;
    private String type1;
    private String type2;
    private List<GaugePointersMarker> setType = new ArrayList<>();

    /**
     * Setter for the marker type.
     */
    public GaugePointersMarker setType(MarkerType type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type = type;
        } else {
            this.type = type;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".type(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetType() {
        if (!setType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GaugePointersMarker item : setType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GaugePointersMarker> setType1 = new ArrayList<>();

    /**
     * Setter for the marker type.
     */
    public GaugePointersMarker setType(String type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".type(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetType1() {
        if (!setType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GaugePointersMarker item : setType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

        js.append(generateJsGetters());

        js.append(generateJSsetPosition());
        js.append(generateJSsetPosition1());
        js.append(generateJSsetRadius());
        js.append(generateJSsetRadius1());
        js.append(generateJSsetSize());
        js.append(generateJSsetSize1());
        js.append(generateJSsetType());
        js.append(generateJSsetType1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}