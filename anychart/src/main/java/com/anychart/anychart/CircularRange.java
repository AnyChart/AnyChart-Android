package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Circular range.
 */
public class CircularRange extends VisualBase {

    public CircularRange() {
        js.setLength(0);
        js.append("var circularRange").append(++variableIndex).append(" = anychart.core.axisMarkers.circularRange();");
        jsBase = "circularRange" + variableIndex;
    }

    protected CircularRange(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CircularRange(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number index;

    /**
     * Setter for the axis index.
     */
    public CircularRange setAxisIndex(Number index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".axisIndex(%s)", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".axisIndex(%s);", index));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number cornersRounding;
    private String cornersRounding1;

    /**
     * Setter for the rounding of circular ranges.<br/>
Round off the ends of circular ranges to the specified radius.
     */
    public CircularRange setCornersRounding(Number cornersRounding) {
        if (jsBase == null) {
            this.cornersRounding = null;
            this.cornersRounding1 = null;
            
            this.cornersRounding = cornersRounding;
        } else {
            this.cornersRounding = cornersRounding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cornersRounding(%s)", cornersRounding));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cornersRounding(%s);", cornersRounding));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the rounding of circular ranges.<br/>
Round off the ends of circular ranges to the specified radius.
     */
    public CircularRange setCornersRounding(String cornersRounding1) {
        if (jsBase == null) {
            this.cornersRounding = null;
            this.cornersRounding1 = null;
            
            this.cornersRounding1 = cornersRounding1;
        } else {
            this.cornersRounding1 = cornersRounding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cornersRounding(%s)", wrapQuotes(cornersRounding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cornersRounding(%s);", wrapQuotes(cornersRounding1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number endSize;
    private String endSize1;

    /**
     * Setter for the range end size.
     */
    public CircularRange setEndSize(Number endSize) {
        if (jsBase == null) {
            this.endSize = null;
            this.endSize1 = null;
            
            this.endSize = endSize;
        } else {
            this.endSize = endSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".endSize(%s)", endSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".endSize(%s);", endSize));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the range end size.
     */
    public CircularRange setEndSize(String endSize1) {
        if (jsBase == null) {
            this.endSize = null;
            this.endSize1 = null;
            
            this.endSize1 = endSize1;
        } else {
            this.endSize1 = endSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".endSize(%s)", wrapQuotes(endSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".endSize(%s);", wrapQuotes(endSize1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill fill;

    /**
     * Setter for the range fill.
     */
    public CircularRange setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", ((fill != null) ? fill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * 
     */
    public CircularRange setFill(String json) {
        if (jsBase == null) {
        } else {
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s)", wrapQuotes(json)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", wrapQuotes(json)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number from;

    /**
     * Setter for the starting range value.
     */
    public CircularRange setFrom(Number from) {
        if (jsBase == null) {
            this.from = from;
        } else {
            this.from = from;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".from(%s)", from));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".from(%s);", from));
                js.setLength(0);
            }
        }
        return this;
    }

    private GaugeSidePosition position;
    private String position1;

    /**
     * Setter for the range position.
     */
    public CircularRange setPosition(GaugeSidePosition position) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", ((position != null) ? position.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the range position.
     */
    public CircularRange setPosition(String position1) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", wrapQuotes(position1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number radius;
    private String radius1;

    /**
     * Setter for the range radius.
     */
    public CircularRange setRadius(Number radius) {
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
            
            js.append(String.format(Locale.US, ".radius(%s)", radius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".radius(%s);", radius));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the range radius.
     */
    public CircularRange setRadius(String radius1) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".radius(%s);", wrapQuotes(radius1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number startSize;
    private String startSize1;

    /**
     * Setter for the range start size.
     */
    public CircularRange setStartSize(Number startSize) {
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
            
            js.append(String.format(Locale.US, ".startSize(%s)", startSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startSize(%s);", startSize));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the range start size.
     */
    public CircularRange setStartSize(String startSize1) {
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startSize(%s);", wrapQuotes(startSize1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number to;

    /**
     * Setter for the ending range value.
     */
    public CircularRange setTo(Number to) {
        if (jsBase == null) {
            this.to = to;
        } else {
            this.to = to;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".to(%s)", to));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".to(%s);", to));
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