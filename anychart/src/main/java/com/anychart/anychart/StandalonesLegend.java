package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The Legend class contains methods for configuring standalones legend.
 */
public class StandalonesLegend extends UiLegend {

    public StandalonesLegend() {
        js.setLength(0);
        js.append("var standalonesLegend").append(++variableIndex).append(" = anychart.standalones.legend();");
        jsBase = "standalonesLegend" + variableIndex;
    }

    protected StandalonesLegend(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StandalonesLegend(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element getContainer;

    /**
     * Getter for the legend container.
     */
    public Element getContainer() {
        if (getContainer == null)
            getContainer = new Element(jsBase + ".container()");

        return getContainer;
    }

    private String container;
    private Element container1;

    /**
     * Setter for the legend container.
     */
    public StandalonesLegend setContainer(String container) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(container)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the legend container.
     */
    public StandalonesLegend setContainer(Element container1) {
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
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", ((container1 != null) ? container1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private SeparateChart getItemsSource;

    /**
     * Getter for items source.
     */
    public SeparateChart getItemsSource() {
        if (getItemsSource == null)
            getItemsSource = new SeparateChart(jsBase + ".itemsSource()");

        return getItemsSource;
    }

    private SeparateChart itemsSource;
    private SeparateChart[] itemsSource1;

    /**
     * Setter for items source.
     */
    public StandalonesLegend setItemsSource(SeparateChart itemsSource) {
        if (jsBase == null) {
            this.itemsSource = null;
            this.itemsSource1 = null;
            
            this.itemsSource = itemsSource;
        } else {
            this.itemsSource = itemsSource;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(itemsSource.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".itemsSource(%s);",  ((itemsSource != null) ? itemsSource.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsSource(%s);", ((itemsSource != null) ? itemsSource.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for items source.
     */
    public StandalonesLegend setItemsSource(SeparateChart[] itemsSource1) {
        if (jsBase == null) {
            this.itemsSource = null;
            this.itemsSource1 = null;
            
            this.itemsSource1 = itemsSource1;
        } else {
            this.itemsSource1 = itemsSource1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".itemsSource(%s)", arrayToString(itemsSource1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemsSource(%s);", arrayToString(itemsSource1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnychartMathRect getParentBounds;

    /**
     * Getter for parent bounds.<br/>
As a getter falls back to stage bounds.
     */
    public AnychartMathRect getParentBounds() {
        if (getParentBounds == null)
            getParentBounds = new AnychartMathRect(jsBase + ".parentBounds()");

        return getParentBounds;
    }

    private AnychartMathRect parentBounds;
    private String parentBounds1;

    /**
     * Setter for bounds using single value.
     */
    public StandalonesLegend setParentBounds(AnychartMathRect parentBounds) {
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
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parentBounds(%s);", ((parentBounds != null) ? parentBounds.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for bounds using single value.
     */
    public StandalonesLegend setParentBounds(String parentBounds1) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parentBounds(%s);", wrapQuotes(parentBounds1)));
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
     * Setter for bounds using several values.
     */
    public StandalonesLegend setParentBounds(Number left, Number top, Number width, Number height) {
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
            
            js.append(String.format(Locale.US, ".parentBounds(%s, %s, %s, %s)", left, top, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parentBounds(%s, %s, %s, %s);", left, top, width, height));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetContainer() {
        if (getContainer != null) {
            return getContainer.generateJs();
        }
        return "";
    }

    private String generateJSgetItemsSource() {
        if (getItemsSource != null) {
            return getItemsSource.generateJs();
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
        jsGetters.append(generateJSgetItemsSource());
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

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}