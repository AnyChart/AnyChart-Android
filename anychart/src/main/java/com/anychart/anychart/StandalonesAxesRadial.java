package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * 
 */
public class StandalonesAxesRadial extends CoreAxesRadial {

    public StandalonesAxesRadial() {
        js.setLength(0);
        js.append("var standalonesAxesRadial").append(++variableIndex).append(" = anychart.standalones.axes.radial();");
        jsBase = "standalonesAxesRadial" + variableIndex;
    }

    protected StandalonesAxesRadial(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StandalonesAxesRadial(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Layer getContainer;

    /**
     * Getter for the axis current container.
     */
    public Layer getContainer() {
        if (getContainer == null)
            getContainer = new Layer(jsBase + ".container()");

        return getContainer;
    }

    private Layer container;
    private Stage container1;
    private String container2;
    private Element container3;
    private List<StandalonesAxesRadial> setContainer = new ArrayList<>();

    /**
     * Setter for the axis container.
     */
    public StandalonesAxesRadial setContainer(Layer container) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container = container;
        } else {
            this.container = container;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(container.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".container(%s);",  ((container != null) ? container.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetContainer() {
        if (!setContainer.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesAxesRadial item : setContainer) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesAxesRadial> setContainer1 = new ArrayList<>();

    /**
     * Setter for the axis container.
     */
    public StandalonesAxesRadial setContainer(Stage container1) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container1 = container1;
        } else {
            this.container1 = container1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(container1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".container(%s);",  ((container1 != null) ? container1.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetContainer1() {
        if (!setContainer1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesAxesRadial item : setContainer1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesAxesRadial> setContainer2 = new ArrayList<>();

    /**
     * Setter for the axis container.
     */
    public StandalonesAxesRadial setContainer(String container2) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container2 = container2;
        } else {
            this.container2 = container2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".container(%s)", wrapQuotes(container2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", wrapQuotes(container2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetContainer2() {
        if (!setContainer2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesAxesRadial item : setContainer2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesAxesRadial> setContainer3 = new ArrayList<>();

    /**
     * Setter for the axis container.
     */
    public StandalonesAxesRadial setContainer(Element container3) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container3 = container3;
        } else {
            this.container3 = container3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(container3.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".container(%s);",  ((container3 != null) ? container3.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetContainer3() {
        if (!setContainer3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesAxesRadial item : setContainer3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String innerRadius;
    private Double innerRadius1;
    private List<StandalonesAxesRadial> setInnerRadius = new ArrayList<>();

    /**
     * Setter for the inner radius.
     */
    public StandalonesAxesRadial setInnerRadius(String innerRadius) {
        if (jsBase == null) {
            this.innerRadius = null;
            this.innerRadius1 = null;
            
            this.innerRadius = innerRadius;
        } else {
            this.innerRadius = innerRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".innerRadius(%s)", wrapQuotes(innerRadius)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".innerRadius(%s)", wrapQuotes(innerRadius)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetInnerRadius() {
        if (!setInnerRadius.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesAxesRadial item : setInnerRadius) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesAxesRadial> setInnerRadius1 = new ArrayList<>();

    /**
     * Setter for the inner radius.
     */
    public StandalonesAxesRadial setInnerRadius(Double innerRadius1) {
        if (jsBase == null) {
            this.innerRadius = null;
            this.innerRadius1 = null;
            
            this.innerRadius1 = innerRadius1;
        } else {
            this.innerRadius1 = innerRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".innerRadius(%f)", innerRadius1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".innerRadius(%f)", innerRadius1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetInnerRadius1() {
        if (!setInnerRadius1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesAxesRadial item : setInnerRadius1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private AnychartMathRect getParentBounds;

    /**
     * Getter for bounds.
     */
    public AnychartMathRect getParentBounds() {
        if (getParentBounds == null)
            getParentBounds = new AnychartMathRect(jsBase + ".parentBounds()");

        return getParentBounds;
    }

    private AnychartMathRect parentBounds;
    private String parentBounds1;
    private List<StandalonesAxesRadial> setParentBounds = new ArrayList<>();

    /**
     * Setter for bounds using single value.
     */
    public StandalonesAxesRadial setParentBounds(AnychartMathRect parentBounds) {
        if (jsBase == null) {
            this.parentBounds = null;
            this.parentBounds1 = null;
            
            this.parentBounds = parentBounds;
        } else {
            this.parentBounds = parentBounds;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(parentBounds.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".parentBounds(%s);",  ((parentBounds != null) ? parentBounds.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetParentBounds() {
        if (!setParentBounds.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesAxesRadial item : setParentBounds) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesAxesRadial> setParentBounds1 = new ArrayList<>();

    /**
     * Setter for bounds using single value.
     */
    public StandalonesAxesRadial setParentBounds(String parentBounds1) {
        if (jsBase == null) {
            this.parentBounds = null;
            this.parentBounds1 = null;
            
            this.parentBounds1 = parentBounds1;
        } else {
            this.parentBounds1 = parentBounds1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".parentBounds(%s)", wrapQuotes(parentBounds1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentBounds(%s)", wrapQuotes(parentBounds1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetParentBounds1() {
        if (!setParentBounds1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesAxesRadial item : setParentBounds1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double left;
    private Double top;
    private Double width;
    private Double height;
    private List<StandalonesAxesRadial> setParentBounds2 = new ArrayList<>();

    /**
     * Setter for bounds using several values.
     */
    public StandalonesAxesRadial setParentBounds(Double left, Double top, Double width, Double height) {
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
            
            js.append(String.format(Locale.US, ".parentBounds(%f, %f, %f, %f)", left, top, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentBounds(%f, %f, %f, %f)", left, top, width, height));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetParentBounds2() {
        if (!setParentBounds2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesAxesRadial item : setParentBounds2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String startAngle;
    private Double startAngle1;
    private List<StandalonesAxesRadial> setStartAngle = new ArrayList<>();

    /**
     * Setter for a start angle.
     */
    public StandalonesAxesRadial setStartAngle(String startAngle) {
        if (jsBase == null) {
            this.startAngle = null;
            this.startAngle1 = null;
            
            this.startAngle = startAngle;
        } else {
            this.startAngle = startAngle;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startAngle(%s)", wrapQuotes(startAngle)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startAngle(%s)", wrapQuotes(startAngle)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStartAngle() {
        if (!setStartAngle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesAxesRadial item : setStartAngle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesAxesRadial> setStartAngle1 = new ArrayList<>();

    /**
     * Setter for a start angle.
     */
    public StandalonesAxesRadial setStartAngle(Double startAngle1) {
        if (jsBase == null) {
            this.startAngle = null;
            this.startAngle1 = null;
            
            this.startAngle1 = startAngle1;
        } else {
            this.startAngle1 = startAngle1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startAngle(%f)", startAngle1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startAngle(%f)", startAngle1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStartAngle1() {
        if (!setStartAngle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesAxesRadial item : setStartAngle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetContainer() {
        if (getContainer != null) {
            return getContainer.generateJs();
        }
        return "";
    }

    private String generateJSgetParentBounds() {
        if (getParentBounds != null) {
            return getParentBounds.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetContainer());
        jsGetters.append(generateJSgetParentBounds());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetContainer());
        js.append(generateJSsetContainer1());
        js.append(generateJSsetContainer2());
        js.append(generateJSsetContainer3());
        js.append(generateJSsetInnerRadius());
        js.append(generateJSsetInnerRadius1());
        js.append(generateJSsetParentBounds());
        js.append(generateJSsetParentBounds1());
        js.append(generateJSsetParentBounds2());
        js.append(generateJSsetStartAngle());
        js.append(generateJSsetStartAngle1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}