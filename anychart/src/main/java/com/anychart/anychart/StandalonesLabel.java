package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * 
 */
public class StandalonesLabel extends UiLabel {

    public StandalonesLabel() {
        js.setLength(0);
        js.append("var standalonesLabel").append(++variableIndex).append(" = anychart.standalones.label();");
        jsBase = "standalonesLabel" + variableIndex;
    }

    protected StandalonesLabel(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StandalonesLabel(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element getContainer;

    /**
     * Getter for the label current container.
     */
    public Element getContainer() {
        if (getContainer == null)
            getContainer = new Element(jsBase + ".container()");

        return getContainer;
    }

    private String container;
    private Element container1;
    private List<StandalonesLabel> setContainer = new ArrayList<>();

    /**
     * Setter for the label container.
     */
    public StandalonesLabel setContainer(String container) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            
            this.container = container;
        } else {
            this.container = container;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".container(%s)", wrapQuotes(container)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", wrapQuotes(container)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetContainer() {
        if (!setContainer.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesLabel item : setContainer) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesLabel> setContainer1 = new ArrayList<>();

    /**
     * Setter for the label container.
     */
    public StandalonesLabel setContainer(Element container1) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            
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
            for (StandalonesLabel item : setContainer1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private AnychartMathRect getParentBounds;

    /**
     * Getter for bounds. As a getter falls back to stage bounds.
     */
    public AnychartMathRect getParentBounds() {
        if (getParentBounds == null)
            getParentBounds = new AnychartMathRect(jsBase + ".parentBounds()");

        return getParentBounds;
    }

    private AnychartMathRect parentBounds;
    private String parentBounds1;
    private List<StandalonesLabel> setParentBounds = new ArrayList<>();

    /**
     * Setter for bounds using single value.
     */
    public StandalonesLabel setParentBounds(AnychartMathRect parentBounds) {
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
            for (StandalonesLabel item : setParentBounds) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesLabel> setParentBounds1 = new ArrayList<>();

    /**
     * Setter for bounds using single value.
     */
    public StandalonesLabel setParentBounds(String parentBounds1) {
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
            for (StandalonesLabel item : setParentBounds1) {
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
    private List<StandalonesLabel> setParentBounds2 = new ArrayList<>();

    /**
     * Setter for bounds using several value.
     */
    public StandalonesLabel setParentBounds(Double left, Double top, Double width, Double height) {
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
            for (StandalonesLabel item : setParentBounds2) {
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
        js.append(generateJSsetParentBounds());
        js.append(generateJSsetParentBounds1());
        js.append(generateJSsetParentBounds2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}