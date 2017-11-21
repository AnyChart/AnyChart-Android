package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
    private Double radiusAll1;
    private List<VectorRect> setCut = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".cut(%s)", wrapQuotes(radiusAll)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCut() {
        if (!setCut.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setCut) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorRect> setCut1 = new ArrayList<>();

    /**
     * Sets cut corners.
     */
    public VectorRect setCut(Double radiusAll1) {
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
            
            js.append(String.format(Locale.US, ".cut(%f)", radiusAll1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cut(%f)", radiusAll1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCut1() {
        if (!setCut1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setCut1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double radiusLeftTop;
    private Double radiusRightTop;
    private Double radiusRightBottom;
    private Double radiusLeftBottom;
    private List<VectorRect> setCut2 = new ArrayList<>();

    /**
     * Sets cut corners.
     */
    public VectorRect setCut(Double radiusLeftTop, Double radiusRightTop, Double radiusRightBottom, Double radiusLeftBottom) {
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
            
            js.append(String.format(Locale.US, ".cut(%f, %f, %f, %f)", radiusLeftTop, radiusRightTop, radiusRightBottom, radiusLeftBottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".cut(%f, %f, %f, %f)", radiusLeftTop, radiusRightTop, radiusRightBottom, radiusLeftBottom));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCut2() {
        if (!setCut2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setCut2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String radiusAll2;
    private Double radiusAll3;
    private List<VectorRect> setRound = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".round(%s)", wrapQuotes(radiusAll2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRound() {
        if (!setRound.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setRound) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorRect> setRound1 = new ArrayList<>();

    /**
     * Sets corners rounding using single value.
     */
    public VectorRect setRound(Double radiusAll3) {
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
            
            js.append(String.format(Locale.US, ".round(%f)", radiusAll3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".round(%f)", radiusAll3));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRound1() {
        if (!setRound1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setRound1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double radiusLeftTop1;
    private Double radiusRightTop1;
    private Double radiusRightBottom1;
    private Double radiusLeftBottom1;
    private List<VectorRect> setRound2 = new ArrayList<>();

    /**
     * Sets corners rounding using several value.
     */
    public VectorRect setRound(Double radiusLeftTop1, Double radiusRightTop1, Double radiusRightBottom1, Double radiusLeftBottom1) {
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
            
            js.append(String.format(Locale.US, ".round(%f, %f, %f, %f)", radiusLeftTop1, radiusRightTop1, radiusRightBottom1, radiusLeftBottom1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".round(%f, %f, %f, %f)", radiusLeftTop1, radiusRightTop1, radiusRightBottom1, radiusLeftBottom1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRound2() {
        if (!setRound2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setRound2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String radiusAll4;
    private Double radiusAll5;
    private List<VectorRect> setRoundInner = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".roundInner(%s)", wrapQuotes(radiusAll4)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRoundInner() {
        if (!setRoundInner.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setRoundInner) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VectorRect> setRoundInner1 = new ArrayList<>();

    /**
     * Sets corners inner rounding.
     */
    public VectorRect setRoundInner(Double radiusAll5) {
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
            
            js.append(String.format(Locale.US, ".roundInner(%f)", radiusAll5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".roundInner(%f)", radiusAll5));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRoundInner1() {
        if (!setRoundInner1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setRoundInner1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double radiusLeftTop2;
    private Double radiusRightTop2;
    private Double radiusRightBottom2;
    private Double radiusLeftBottom2;
    private List<VectorRect> setRoundInner2 = new ArrayList<>();

    /**
     * Sets corners inner rounding.
     */
    public VectorRect setRoundInner(Double radiusLeftTop2, Double radiusRightTop2, Double radiusRightBottom2, Double radiusLeftBottom2) {
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
            
            js.append(String.format(Locale.US, ".roundInner(%f, %f, %f, %f)", radiusLeftTop2, radiusRightTop2, radiusRightBottom2, radiusLeftBottom2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".roundInner(%f, %f, %f, %f)", radiusLeftTop2, radiusRightTop2, radiusRightBottom2, radiusLeftBottom2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRoundInner2() {
        if (!setRoundInner2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setRoundInner2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GraphicsMathRect setBounds;
    private List<VectorRect> setSetBounds = new ArrayList<>();

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
        }
        return this;
    }
    private String generateJSsetSetBounds() {
        if (!setSetBounds.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setSetBounds) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double setHeight;
    private List<VectorRect> setSetHeight = new ArrayList<>();

    /**
     * Sets a height.
     */
    public VectorRect setSetHeight(Double setHeight) {
        if (jsBase == null) {
            this.setHeight = setHeight;
        } else {
            this.setHeight = setHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setHeight(%f)", setHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setHeight(%f)", setHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSetHeight() {
        if (!setSetHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setSetHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double setWidth;
    private List<VectorRect> setSetWidth = new ArrayList<>();

    /**
     * Sets a width.
     */
    public VectorRect setSetWidth(Double setWidth) {
        if (jsBase == null) {
            this.setWidth = setWidth;
        } else {
            this.setWidth = setWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setWidth(%f)", setWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setWidth(%f)", setWidth));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSetWidth() {
        if (!setSetWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setSetWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double setX;
    private List<VectorRect> setSetX = new ArrayList<>();

    /**
     * Sets X in parent container.
     */
    public VectorRect setSetX(Double setX) {
        if (jsBase == null) {
            this.setX = setX;
        } else {
            this.setX = setX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setX(%f)", setX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setX(%f)", setX));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSetX() {
        if (!setSetX.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setSetX) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double setY;
    private List<VectorRect> setSetY = new ArrayList<>();

    /**
     * Sets Y in parent container.
     */
    public VectorRect setSetY(Double setY) {
        if (jsBase == null) {
            this.setY = setY;
        } else {
            this.setY = setY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setY(%f)", setY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setY(%f)", setY));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSetY() {
        if (!setSetY.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VectorRect item : setSetY) {
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

        js.append(generateJSsetCut());
        js.append(generateJSsetCut1());
        js.append(generateJSsetCut2());
        js.append(generateJSsetRound());
        js.append(generateJSsetRound1());
        js.append(generateJSsetRound2());
        js.append(generateJSsetRoundInner());
        js.append(generateJSsetRoundInner1());
        js.append(generateJSsetRoundInner2());
        js.append(generateJSsetSetBounds());
        js.append(generateJSsetSetHeight());
        js.append(generateJSsetSetWidth());
        js.append(generateJSsetSetX());
        js.append(generateJSsetSetY());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}