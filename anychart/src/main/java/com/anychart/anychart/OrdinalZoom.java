package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Zoom settings aggregate.
 */
public class OrdinalZoom extends JsObject {

    public OrdinalZoom() {
        js.setLength(0);
        js.append("var ordinalZoom").append(++variableIndex).append(" = anychart.core.utils.ordinalZoom();");
        jsBase = "ordinalZoom" + variableIndex;
    }

    protected OrdinalZoom(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected OrdinalZoom(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean continuous;

    /**
     * Whether to zoom on moving of the scroller or only on mouseUp.
     */
    public OrdinalZoom continuous(Boolean continuous) {
        if (jsBase == null) {
            this.continuous = continuous;
        } else {
            this.continuous = continuous;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".continuous(%b)", continuous));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".continuous(%b);", continuous));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number startRatio;
    private Number endRatio;

    /**
     * Sets zoom to passed start and end ratios.
     */
    public OrdinalZoom setSetTo(Number startRatio, Number endRatio) {
        if (jsBase == null) {
            this.startRatio = startRatio;
            this.endRatio = endRatio;
        } else {
            this.startRatio = startRatio;
            this.endRatio = endRatio;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setTo(%s, %s)", startRatio, endRatio));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setTo(%s, %s);", startRatio, endRatio));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number pointsCount;
    private Boolean fromEnd;
    private ScalesBase scale;

    /**
     * Setups zoom by passed values.
     */
    public OrdinalZoom setToPointsCount(Number pointsCount, Boolean fromEnd, ScalesBase scale) {
        if (jsBase == null) {
            this.pointsCount = pointsCount;
            this.fromEnd = fromEnd;
            this.scale = scale;
        } else {
            this.pointsCount = pointsCount;
            this.fromEnd = fromEnd;
            this.scale = scale;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(scale.generateJs());
            js.append(String.format(Locale.US, ".setToPointsCount(%s, %b, %s)", pointsCount, fromEnd, ((scale != null) ? scale.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setToPointsCount(%s, %b, %s);", pointsCount, fromEnd, ((scale != null) ? scale.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScalesBase scale1;

    /**
     * Setups zoom by passed values.
     */
    public OrdinalZoom setToValues(ScalesBase scale1) {
        if (jsBase == null) {
            this.scale = null;
            this.scale1 = null;
            
            this.scale1 = scale1;
        } else {
            this.scale1 = scale1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(scale1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".setToValues(%s);",  ((scale1 != null) ? scale1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setToValues(%s);", ((scale1 != null) ? scale1.getJsBase() : "null")));
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