package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Rectangle class<br/>
<b>Do not invoke constructor directly.</b> Use {@link anychart.graphics.vector.Stage#rect} or
{@link anychart.graphics.vector.Layer#rect} to create stage or layer bound rectangle.
<br/> If you need unbound rectangle - use {@link anychart.graphics#rect}.<br/>
See also:<br/>
{@link anychart.graphics.vector.Stage#rect}<br/>
{@link anychart.graphics.vector.Layer#rect}<br/>
{@link anychart.graphics#rect}
 */
public class VectorRect extends Shape {

    public VectorRect() {
        js.setLength(0);
        js.append("var vectorRect").append(++variableIndex).append(" = anychart.graphics.vector.rect();");
        jsBase = "vectorRect" + variableIndex;
    }

    protected VectorRect(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected VectorRect(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String radiusAll;
    private Number radiusAll1;

    /**
     * Sets cut corners.
     */
    public VectorRect setCut(String radiusAll) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            
            this.radiusAll = radiusAll;
        } else {
            this.radiusAll = radiusAll;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cut(%s)", wrapQuotes(radiusAll)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cut(%s);", wrapQuotes(radiusAll)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets cut corners.
     */
    public VectorRect setCut(Number radiusAll1) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            
            this.radiusAll1 = radiusAll1;
        } else {
            this.radiusAll1 = radiusAll1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cut(%s)", radiusAll1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cut(%s);", radiusAll1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number radiusLeftTop;
    private Number radiusRightTop;
    private Number radiusRightBottom;
    private Number radiusLeftBottom;

    /**
     * Sets cut corners.
     */
    public VectorRect setCut(Number radiusLeftTop, Number radiusRightTop, Number radiusRightBottom, Number radiusLeftBottom) {
        if (jsBase == null) {
            this.radiusLeftTop = radiusLeftTop;
            this.radiusRightTop = radiusRightTop;
            this.radiusRightBottom = radiusRightBottom;
            this.radiusLeftBottom = radiusLeftBottom;
        } else {
            this.radiusLeftTop = radiusLeftTop;
            this.radiusRightTop = radiusRightTop;
            this.radiusRightBottom = radiusRightBottom;
            this.radiusLeftBottom = radiusLeftBottom;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".cut(%s, %s, %s, %s)", radiusLeftTop, radiusRightTop, radiusRightBottom, radiusLeftBottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cut(%s, %s, %s, %s);", radiusLeftTop, radiusRightTop, radiusRightBottom, radiusLeftBottom));
                js.setLength(0);
            }
        }
        return this;
    }

    private String radiusAll2;
    private Number radiusAll3;

    /**
     * Sets corners rounding using single value.
     */
    public VectorRect setRound(String radiusAll2) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            this.radiusAll2 = null;
            this.radiusAll3 = null;
            
            this.radiusAll2 = radiusAll2;
        } else {
            this.radiusAll2 = radiusAll2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".round(%s)", wrapQuotes(radiusAll2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".round(%s);", wrapQuotes(radiusAll2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets corners rounding using single value.
     */
    public VectorRect setRound(Number radiusAll3) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            this.radiusAll2 = null;
            this.radiusAll3 = null;
            
            this.radiusAll3 = radiusAll3;
        } else {
            this.radiusAll3 = radiusAll3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".round(%s)", radiusAll3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".round(%s);", radiusAll3));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number radiusLeftTop1;
    private Number radiusRightTop1;
    private Number radiusRightBottom1;
    private Number radiusLeftBottom1;

    /**
     * Sets corners rounding using several value.
     */
    public VectorRect setRound(Number radiusLeftTop1, Number radiusRightTop1, Number radiusRightBottom1, Number radiusLeftBottom1) {
        if (jsBase == null) {
            this.radiusLeftTop = null;
            this.radiusLeftTop1 = null;
            
            this.radiusLeftTop1 = radiusLeftTop1;
            this.radiusRightTop = null;
            this.radiusRightTop1 = null;
            
            this.radiusRightTop1 = radiusRightTop1;
            this.radiusRightBottom = null;
            this.radiusRightBottom1 = null;
            
            this.radiusRightBottom1 = radiusRightBottom1;
            this.radiusLeftBottom = null;
            this.radiusLeftBottom1 = null;
            
            this.radiusLeftBottom1 = radiusLeftBottom1;
        } else {
            this.radiusLeftTop1 = radiusLeftTop1;
            this.radiusRightTop1 = radiusRightTop1;
            this.radiusRightBottom1 = radiusRightBottom1;
            this.radiusLeftBottom1 = radiusLeftBottom1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".round(%s, %s, %s, %s)", radiusLeftTop1, radiusRightTop1, radiusRightBottom1, radiusLeftBottom1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".round(%s, %s, %s, %s);", radiusLeftTop1, radiusRightTop1, radiusRightBottom1, radiusLeftBottom1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String radiusAll4;
    private Number radiusAll5;

    /**
     * Sets corners inner rounding.
     */
    public VectorRect setRoundInner(String radiusAll4) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            this.radiusAll2 = null;
            this.radiusAll3 = null;
            this.radiusAll4 = null;
            this.radiusAll5 = null;
            
            this.radiusAll4 = radiusAll4;
        } else {
            this.radiusAll4 = radiusAll4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".roundInner(%s)", wrapQuotes(radiusAll4)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".roundInner(%s);", wrapQuotes(radiusAll4)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets corners inner rounding.
     */
    public VectorRect setRoundInner(Number radiusAll5) {
        if (jsBase == null) {
            this.radiusAll = null;
            this.radiusAll1 = null;
            this.radiusAll2 = null;
            this.radiusAll3 = null;
            this.radiusAll4 = null;
            this.radiusAll5 = null;
            
            this.radiusAll5 = radiusAll5;
        } else {
            this.radiusAll5 = radiusAll5;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".roundInner(%s)", radiusAll5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".roundInner(%s);", radiusAll5));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number radiusLeftTop2;
    private Number radiusRightTop2;
    private Number radiusRightBottom2;
    private Number radiusLeftBottom2;

    /**
     * Sets corners inner rounding.
     */
    public VectorRect setRoundInner(Number radiusLeftTop2, Number radiusRightTop2, Number radiusRightBottom2, Number radiusLeftBottom2) {
        if (jsBase == null) {
            this.radiusLeftTop = null;
            this.radiusLeftTop1 = null;
            this.radiusLeftTop2 = null;
            
            this.radiusLeftTop2 = radiusLeftTop2;
            this.radiusRightTop = null;
            this.radiusRightTop1 = null;
            this.radiusRightTop2 = null;
            
            this.radiusRightTop2 = radiusRightTop2;
            this.radiusRightBottom = null;
            this.radiusRightBottom1 = null;
            this.radiusRightBottom2 = null;
            
            this.radiusRightBottom2 = radiusRightBottom2;
            this.radiusLeftBottom = null;
            this.radiusLeftBottom1 = null;
            this.radiusLeftBottom2 = null;
            
            this.radiusLeftBottom2 = radiusLeftBottom2;
        } else {
            this.radiusLeftTop2 = radiusLeftTop2;
            this.radiusRightTop2 = radiusRightTop2;
            this.radiusRightBottom2 = radiusRightBottom2;
            this.radiusLeftBottom2 = radiusLeftBottom2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".roundInner(%s, %s, %s, %s)", radiusLeftTop2, radiusRightTop2, radiusRightBottom2, radiusLeftBottom2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".roundInner(%s, %s, %s, %s);", radiusLeftTop2, radiusRightTop2, radiusRightBottom2, radiusLeftBottom2));
                js.setLength(0);
            }
        }
        return this;
    }

    private GraphicsMathRect setBounds;

    /**
     * Sets bounds.
     */
    public VectorRect setSetBounds(GraphicsMathRect setBounds) {
        if (jsBase == null) {
            this.setBounds = setBounds;
        } else {
            this.setBounds = setBounds;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(setBounds.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".setBounds(%s);",  ((setBounds != null) ? setBounds.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setBounds(%s);", ((setBounds != null) ? setBounds.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number setHeight;

    /**
     * Sets a height.
     */
    public VectorRect setSetHeight(Number setHeight) {
        if (jsBase == null) {
            this.setHeight = setHeight;
        } else {
            this.setHeight = setHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setHeight(%s)", setHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setHeight(%s);", setHeight));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number setWidth;

    /**
     * Sets a width.
     */
    public VectorRect setSetWidth(Number setWidth) {
        if (jsBase == null) {
            this.setWidth = setWidth;
        } else {
            this.setWidth = setWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setWidth(%s)", setWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setWidth(%s);", setWidth));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number setX;

    /**
     * Sets X in parent container.
     */
    public VectorRect setSetX(Number setX) {
        if (jsBase == null) {
            this.setX = setX;
        } else {
            this.setX = setX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setX(%s)", setX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setX(%s);", setX));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number setY;

    /**
     * Sets Y in parent container.
     */
    public VectorRect setSetY(Number setY) {
        if (jsBase == null) {
            this.setY = setY;
        } else {
            this.setY = setY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setY(%s)", setY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setY(%s);", setY));
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