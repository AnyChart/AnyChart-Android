package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The Radial class contains methods for configuring standalones Radial axes.<br/>
This class allow to create custom Radial axes or add them to charts.
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
     * Getter for the axis container.
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
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", ((container != null) ? container.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", ((container1 != null) ? container1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(container2)));
                js.setLength(0);
            }
        }
        return this;
    }


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
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", ((container3 != null) ? container3.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String innerRadius;
    private Number innerRadius1;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".innerRadius(%s);", wrapQuotes(innerRadius)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the inner radius.
     */
    public StandalonesAxesRadial setInnerRadius(Number innerRadius1) {
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
            
            js.append(String.format(Locale.US, ".innerRadius(%s)", innerRadius1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".innerRadius(%s);", innerRadius1));
                js.setLength(0);
            }
        }
        return this;
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
    public StandalonesAxesRadial setParentBounds(Number left, Number top, Number width, Number height) {
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

    private String startAngle;
    private Number startAngle1;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startAngle(%s);", wrapQuotes(startAngle)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for a start angle.
     */
    public StandalonesAxesRadial setStartAngle(Number startAngle1) {
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
            
            js.append(String.format(Locale.US, ".startAngle(%s)", startAngle1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startAngle(%s);", startAngle1));
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

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}