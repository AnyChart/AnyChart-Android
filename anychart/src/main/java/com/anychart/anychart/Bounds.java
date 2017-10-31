package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Stores information about visual location of an object.<br/>
Can be defined with an object, a {@link anychart.math#rect} or as a set of numbers.<br/>
<b>Note</b>: "right" and "bottom" have priority over "width" and "height".
 */
public class Bounds extends CoreBase {

    public Bounds() {
        js.setLength(0);
        js.append("var bounds").append(++variableIndex).append(" = anychart.core.utils.bounds();");
        jsBase = "bounds" + variableIndex;
    }

    protected Bounds(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Bounds(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double bottom;
    private String bottom1;

    /**
     * Setter for the bottom edge position.
     */
    public Bounds setBottom(Double bottom) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
        } else {
            this.bottom = bottom;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".bottom(%f)", bottom));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%f)", bottom));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the bottom edge position.
     */
    public Bounds setBottom(String bottom1) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
        } else {
            this.bottom1 = bottom1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".bottom(%s)", wrapQuotes(bottom1)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%s)", wrapQuotes(bottom1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double height;
    private String height1;

    /**
     * Setter for the height value.
     */
    public Bounds setHeight(Double height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".height(%f)", height));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%f)", height));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the height value.
     */
    public Bounds setHeight(String height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".height(%s)", wrapQuotes(height1)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%s)", wrapQuotes(height1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double left;
    private String left1;

    /**
     * Setter for the left edge position.
     */
    public Bounds setLeft(Double left) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.left = left;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".left(%f)", left));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%f)", left));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the left edge position.
     */
    public Bounds setLeft(String left1) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.left1 = left1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".left(%s)", wrapQuotes(left1)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%s)", wrapQuotes(left1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxHeight;
    private String maxHeight1;

    /**
     * Setter for the maximum height value.
     */
    public Bounds setMaxHeight(Double maxHeight) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight = maxHeight;
        } else {
            this.maxHeight = maxHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxHeight(%f)", maxHeight));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxHeight(%f)", maxHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the maximum height value.
     */
    public Bounds setMaxHeight(String maxHeight1) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight1 = maxHeight1;
        } else {
            this.maxHeight1 = maxHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxHeight(%s)", wrapQuotes(maxHeight1)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxHeight(%s)", wrapQuotes(maxHeight1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxWidth;
    private String maxWidth1;

    /**
     * Setter for the maximum width value.
     */
    public Bounds setMaxWidth(Double maxWidth) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth = maxWidth;
        } else {
            this.maxWidth = maxWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxWidth(%f)", maxWidth));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxWidth(%f)", maxWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the maximum width value.
     */
    public Bounds setMaxWidth(String maxWidth1) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth1 = maxWidth1;
        } else {
            this.maxWidth1 = maxWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxWidth(%s)", wrapQuotes(maxWidth1)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxWidth(%s)", wrapQuotes(maxWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minHeight;
    private String minHeight1;

    /**
     * Setter for the minimum height value.
     */
    public Bounds setMinHeight(Double minHeight) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight = minHeight;
        } else {
            this.minHeight = minHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minHeight(%f)", minHeight));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minHeight(%f)", minHeight));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the minimum height value.
     */
    public Bounds setMinHeight(String minHeight1) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight1 = minHeight1;
        } else {
            this.minHeight1 = minHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minHeight(%s)", wrapQuotes(minHeight1)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minHeight(%s)", wrapQuotes(minHeight1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minWidth;
    private String minWidth1;

    /**
     * Setter for the minimum width value.
     */
    public Bounds setMinWidth(Double minWidth) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth = minWidth;
        } else {
            this.minWidth = minWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minWidth(%f)", minWidth));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minWidth(%f)", minWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the minimum width value.
     */
    public Bounds setMinWidth(String minWidth1) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth1 = minWidth1;
        } else {
            this.minWidth1 = minWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minWidth(%s)", wrapQuotes(minWidth1)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minWidth(%s)", wrapQuotes(minWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double right;
    private String right1;

    /**
     * Setter for the right edge position.
     */
    public Bounds setRight(Double right) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right = right;
        } else {
            this.right = right;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".right(%f)", right));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%f)", right));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the right edge position.
     */
    public Bounds setRight(String right1) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right1 = right1;
        } else {
            this.right1 = right1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".right(%s)", wrapQuotes(right1)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%s)", wrapQuotes(right1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double xOrRect;
    private String xOrRect1;
    private Double[] xOrRect2;
    private RectObj xOrRect3;
    private AnychartMathRect xOrRect4;
    private Bounds xOrRect5;
    private Double y;
    private String y1;
    private Double width;
    private String width1;
    private Double height2;
    private String height3;

    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: "right" and "bottom" have priority over "width" and "height".
     */
    public Bounds set(Double[] xOrRect2) {
        if (jsBase == null) {
            this.xOrRect = null;
            this.xOrRect1 = null;
            this.xOrRect2 = null;
            this.xOrRect3 = null;
            this.xOrRect4 = null;
            this.xOrRect5 = null;
            
            this.xOrRect2 = xOrRect2;
        } else {
            this.xOrRect2 = xOrRect2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".set(%s)", Arrays.toString(xOrRect2)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", Arrays.toString(xOrRect2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: "right" and "bottom" have priority over "width" and "height".
     */
    public Bounds set(RectObj xOrRect3) {
        if (jsBase == null) {
            this.xOrRect = null;
            this.xOrRect1 = null;
            this.xOrRect2 = null;
            this.xOrRect3 = null;
            this.xOrRect4 = null;
            this.xOrRect5 = null;
            
            this.xOrRect3 = xOrRect3;
        } else {
            this.xOrRect3 = xOrRect3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".set(%s)", ((xOrRect3 != null) ? xOrRect3.generateJs() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", ((xOrRect3 != null) ? xOrRect3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: "right" and "bottom" have priority over "width" and "height".
     */
    public Bounds set(AnychartMathRect xOrRect4) {
        if (jsBase == null) {
            this.xOrRect = null;
            this.xOrRect1 = null;
            this.xOrRect2 = null;
            this.xOrRect3 = null;
            this.xOrRect4 = null;
            this.xOrRect5 = null;
            
            this.xOrRect4 = xOrRect4;
        } else {
            this.xOrRect4 = xOrRect4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(xOrRect4.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".set(%s);",  ((xOrRect4 != null) ? xOrRect4.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", ((xOrRect4 != null) ? xOrRect4.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Resets all values of the object by passed values.<br/>
<b>Note</b>: "right" and "bottom" have priority over "width" and "height".
     */
    public Bounds set(Bounds xOrRect5) {
        if (jsBase == null) {
            this.xOrRect = null;
            this.xOrRect1 = null;
            this.xOrRect2 = null;
            this.xOrRect3 = null;
            this.xOrRect4 = null;
            this.xOrRect5 = null;
            
            this.xOrRect5 = xOrRect5;
        } else {
            this.xOrRect5 = xOrRect5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(xOrRect5.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".set(%s);",  ((xOrRect5 != null) ? xOrRect5.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", ((xOrRect5 != null) ? xOrRect5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double parentLeftOrRect;
    private AnychartMathRect parentLeftOrRect1;
    private String parentLeftOrRect2;
    private Double parentTop;
    private Double parentWidth;
    private Double parentHeight;

    /**
     * Normalizes all info stored in this object.
     */
    public AnychartMathRect toRect(Double parentLeftOrRect, Double parentTop, Double parentWidth, Double parentHeight) {
        if (jsBase == null) {
            this.parentLeftOrRect = null;
            this.parentLeftOrRect1 = null;
            this.parentLeftOrRect2 = null;
            
            this.parentLeftOrRect = parentLeftOrRect;
            this.parentTop = parentTop;
            this.parentWidth = parentWidth;
            this.parentHeight = parentHeight;
        } else {
            this.parentLeftOrRect = parentLeftOrRect;
            this.parentTop = parentTop;
            this.parentWidth = parentWidth;
            this.parentHeight = parentHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".toRect(%f, %f, %f, %f);", parentLeftOrRect, parentTop, parentWidth, parentHeight));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toRect(%f, %f, %f, %f)", parentLeftOrRect, parentTop, parentWidth, parentHeight));
                js.setLength(0);
            }
        }
        return new AnychartMathRect(jsBase);
    }


    /**
     * Normalizes all info stored in this object.
     */
    public AnychartMathRect toRect(AnychartMathRect parentLeftOrRect1, Double parentTop, Double parentWidth, Double parentHeight) {
        if (jsBase == null) {
            this.parentLeftOrRect = null;
            this.parentLeftOrRect1 = null;
            this.parentLeftOrRect2 = null;
            
            this.parentLeftOrRect1 = parentLeftOrRect1;
            this.parentTop = parentTop;
            this.parentWidth = parentWidth;
            this.parentHeight = parentHeight;
        } else {
            this.parentLeftOrRect1 = parentLeftOrRect1;
            this.parentTop = parentTop;
            this.parentWidth = parentWidth;
            this.parentHeight = parentHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".toRect(%s, %f, %f, %f);", ((parentLeftOrRect1 != null) ? parentLeftOrRect1.generateJs() : "null"), parentTop, parentWidth, parentHeight));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toRect(%s, %f, %f, %f)", ((parentLeftOrRect1 != null) ? parentLeftOrRect1.generateJs() : "null"), parentTop, parentWidth, parentHeight));
                js.setLength(0);
            }
        }
        return new AnychartMathRect(jsBase);
    }


    /**
     * Normalizes all info stored in this object.
     */
    public AnychartMathRect toRect(String parentLeftOrRect2, Double parentTop, Double parentWidth, Double parentHeight) {
        if (jsBase == null) {
            this.parentLeftOrRect = null;
            this.parentLeftOrRect1 = null;
            this.parentLeftOrRect2 = null;
            
            this.parentLeftOrRect2 = parentLeftOrRect2;
            this.parentTop = parentTop;
            this.parentWidth = parentWidth;
            this.parentHeight = parentHeight;
        } else {
            this.parentLeftOrRect2 = parentLeftOrRect2;
            this.parentTop = parentTop;
            this.parentWidth = parentWidth;
            this.parentHeight = parentHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".toRect(%s, %f, %f, %f);", wrapQuotes(parentLeftOrRect2), parentTop, parentWidth, parentHeight));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toRect(%s, %f, %f, %f)", wrapQuotes(parentLeftOrRect2), parentTop, parentWidth, parentHeight));
                js.setLength(0);
            }
        }
        return new AnychartMathRect(jsBase);
    }

    private Double top;
    private String top1;

    /**
     * Setter for the top edge position.
     */
    public Bounds setTop(Double top) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top = top;
        } else {
            this.top = top;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".top(%f)", top));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%f)", top));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the top edge position.
     */
    public Bounds setTop(String top1) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top1 = top1;
        } else {
            this.top1 = top1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".top(%s)", wrapQuotes(top1)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%s)", wrapQuotes(top1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double width2;
    private String width3;

    /**
     * Setter for the width value.
     */
    public Bounds setWidth(Double width2) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width2 = width2;
        } else {
            this.width2 = width2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".width(%f)", width2));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%f)", width2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the width value.
     */
    public Bounds setWidth(String width3) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width3 = width3;
        } else {
            this.width3 = width3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width3)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%s)", wrapQuotes(width3)));
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