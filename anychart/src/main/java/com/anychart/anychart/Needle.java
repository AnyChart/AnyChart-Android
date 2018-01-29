package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Needle pointer class.
 */
public class Needle extends GaugePointersBase {

    public Needle() {
        js.setLength(0);
        js.append("var needle").append(++variableIndex).append(" = anychart.core.gauge.pointers.needle();");
        jsBase = "needle" + variableIndex;
    }

    protected Needle(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Needle(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number endRadius;
    private String endRadius1;

    /**
     * Setter for the end radius.
     */
    public Needle setEndRadius(Number endRadius) {
        if (jsBase == null) {
            this.endRadius = null;
            this.endRadius1 = null;
            
            this.endRadius = endRadius;
        } else {
            this.endRadius = endRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".endRadius(%s)", endRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".endRadius(%s);", endRadius));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the end radius.
     */
    public Needle setEndRadius(String endRadius1) {
        if (jsBase == null) {
            this.endRadius = null;
            this.endRadius1 = null;
            
            this.endRadius1 = endRadius1;
        } else {
            this.endRadius1 = endRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".endRadius(%s)", wrapQuotes(endRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".endRadius(%s);", wrapQuotes(endRadius1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number endWidth;
    private String endWidth1;

    /**
     * Setter for the end width.
     */
    public Needle setEndWidth(Number endWidth) {
        if (jsBase == null) {
            this.endWidth = null;
            this.endWidth1 = null;
            
            this.endWidth = endWidth;
        } else {
            this.endWidth = endWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".endWidth(%s)", endWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".endWidth(%s);", endWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the end width.
     */
    public Needle setEndWidth(String endWidth1) {
        if (jsBase == null) {
            this.endWidth = null;
            this.endWidth1 = null;
            
            this.endWidth1 = endWidth1;
        } else {
            this.endWidth1 = endWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".endWidth(%s)", wrapQuotes(endWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".endWidth(%s);", wrapQuotes(endWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number middleRadius;
    private String middleRadius1;

    /**
     * Setter for the middle radius.
     */
    public Needle setMiddleRadius(Number middleRadius) {
        if (jsBase == null) {
            this.middleRadius = null;
            this.middleRadius1 = null;
            
            this.middleRadius = middleRadius;
        } else {
            this.middleRadius = middleRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".middleRadius(%s)", middleRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".middleRadius(%s);", middleRadius));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the middle radius.
     */
    public Needle setMiddleRadius(String middleRadius1) {
        if (jsBase == null) {
            this.middleRadius = null;
            this.middleRadius1 = null;
            
            this.middleRadius1 = middleRadius1;
        } else {
            this.middleRadius1 = middleRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".middleRadius(%s)", wrapQuotes(middleRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".middleRadius(%s);", wrapQuotes(middleRadius1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number middleWidth;
    private String middleWidth1;

    /**
     * Setter for the middle width
     */
    public Needle setMiddleWidth(Number middleWidth) {
        if (jsBase == null) {
            this.middleWidth = null;
            this.middleWidth1 = null;
            
            this.middleWidth = middleWidth;
        } else {
            this.middleWidth = middleWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".middleWidth(%s)", middleWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".middleWidth(%s);", middleWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the middle width
     */
    public Needle setMiddleWidth(String middleWidth1) {
        if (jsBase == null) {
            this.middleWidth = null;
            this.middleWidth1 = null;
            
            this.middleWidth1 = middleWidth1;
        } else {
            this.middleWidth1 = middleWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".middleWidth(%s)", wrapQuotes(middleWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".middleWidth(%s);", wrapQuotes(middleWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number startRadius;
    private String startRadius1;

    /**
     * Setter for the start radius.
     */
    public Needle setStartRadius(Number startRadius) {
        if (jsBase == null) {
            this.startRadius = null;
            this.startRadius1 = null;
            
            this.startRadius = startRadius;
        } else {
            this.startRadius = startRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startRadius(%s)", startRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startRadius(%s);", startRadius));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the start radius.
     */
    public Needle setStartRadius(String startRadius1) {
        if (jsBase == null) {
            this.startRadius = null;
            this.startRadius1 = null;
            
            this.startRadius1 = startRadius1;
        } else {
            this.startRadius1 = startRadius1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startRadius(%s)", wrapQuotes(startRadius1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startRadius(%s);", wrapQuotes(startRadius1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number startWidth;
    private String startWidth1;

    /**
     * Setter for the start width
     */
    public Needle setStartWidth(Number startWidth) {
        if (jsBase == null) {
            this.startWidth = null;
            this.startWidth1 = null;
            
            this.startWidth = startWidth;
        } else {
            this.startWidth = startWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startWidth(%s)", startWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startWidth(%s);", startWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the start width
     */
    public Needle setStartWidth(String startWidth1) {
        if (jsBase == null) {
            this.startWidth = null;
            this.startWidth1 = null;
            
            this.startWidth1 = startWidth1;
        } else {
            this.startWidth1 = startWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".startWidth(%s)", wrapQuotes(startWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startWidth(%s);", wrapQuotes(startWidth1)));
                js.setLength(0);
            }
        }
        return this;
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

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}