package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Bar pointer class.
 */
public class GaugePointersBar extends GaugePointersBase {

    public GaugePointersBar() {
        js.setLength(0);
        js.append("var gaugePointersBar").append(++variableIndex).append(" = anychart.core.gauge.pointers.bar();");
        jsBase = "gaugePointersBar" + variableIndex;
    }

    protected GaugePointersBar(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected GaugePointersBar(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private GaugeSidePosition position;
    private String position1;
    private List<GaugePointersBar> setPosition = new ArrayList<>();

    /**
     * Setter for the bar position.
     */
    public GaugePointersBar setPosition(GaugeSidePosition position) {
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
            for (GaugePointersBar item : setPosition) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GaugePointersBar> setPosition1 = new ArrayList<>();

    /**
     * Setter for the bar position.
     */
    public GaugePointersBar setPosition(String position1) {
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
            for (GaugePointersBar item : setPosition1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double radius;
    private String radius1;
    private List<GaugePointersBar> setRadius = new ArrayList<>();

    /**
     * Setter for the bar pointer radius.
     */
    public GaugePointersBar setRadius(Double radius) {
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
            for (GaugePointersBar item : setRadius) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GaugePointersBar> setRadius1 = new ArrayList<>();

    /**
     * Setter for the bar pointer radius.
     */
    public GaugePointersBar setRadius(String radius1) {
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
            for (GaugePointersBar item : setRadius1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double width;
    private String width1;
    private List<GaugePointersBar> setWidth = new ArrayList<>();

    /**
     * Setter for the bar width.
     */
    public GaugePointersBar setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%f)", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%f)", width));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWidth() {
        if (!setWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GaugePointersBar item : setWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GaugePointersBar> setWidth1 = new ArrayList<>();

    /**
     * Setter for the bar width.
     */
    public GaugePointersBar setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%s)", wrapQuotes(width1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWidth1() {
        if (!setWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GaugePointersBar item : setWidth1) {
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
        js.append(generateJSsetWidth());
        js.append(generateJSsetWidth1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}