package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Point representing choropleth points that belongs to map.
 */
public class ChoroplethPoint extends SeriesPoint {

    public ChoroplethPoint() {
        js.setLength(0);
        js.append("var choroplethPoint").append(++variableIndex).append(" = anychart.core.choroplethPoint();");
        jsBase = "choroplethPoint" + variableIndex;
    }

    protected ChoroplethPoint(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ChoroplethPoint(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String crs;

    /**
     * Changes crs (coordinate system) of the point.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChoroplethPoint crs(String crs) {
        if (jsBase == null) {
            this.crs = crs;
        } else {
            this.crs = crs;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".crs(%s)", wrapQuotes(crs)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".crs(%s);", wrapQuotes(crs)));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnychartMathRect getGetFeatureBounds;

    /**
     * Getter for the point bounds.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public AnychartMathRect getGetFeatureBounds() {
        if (getGetFeatureBounds == null)
            getGetFeatureBounds = new AnychartMathRect(jsBase + ".getFeatureBounds()");

        return getGetFeatureBounds;
    }

    private Number middleX;

    /**
     * Setter for the X center of the point label.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChoroplethPoint setMiddleX(Number middleX) {
        if (jsBase == null) {
            this.middleX = middleX;
        } else {
            this.middleX = middleX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".middleX(%s)", middleX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".middleX(%s);", middleX));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number middleY;

    /**
     * Setter for the Y center of the point label.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChoroplethPoint setMiddleY(Number middleY) {
        if (jsBase == null) {
            this.middleY = middleY;
        } else {
            this.middleY = middleY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".middleY(%s)", middleY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".middleY(%s);", middleY));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number scale;

    /**
     * Scales point.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChoroplethPoint scaleFactor(Number scale) {
        if (jsBase == null) {
            this.scale = scale;
        } else {
            this.scale = scale;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".scaleFactor(%s)", scale));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scaleFactor(%s);", scale));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number dx;
    private Number dy;

    /**
     * Moves point.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChoroplethPoint translate(Number dx, Number dy) {
        if (jsBase == null) {
            this.dx = dx;
            this.dy = dy;
        } else {
            this.dx = dx;
            this.dy = dy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".translate(%s, %s)", dx, dy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".translate(%s, %s);", dx, dy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number dx1;
    private Number dy1;

    /**
     * Setter for the point translation.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChoroplethPoint setTranslation(Number dx1, Number dy1) {
        if (jsBase == null) {
            this.dx = null;
            this.dx1 = null;
            
            this.dx1 = dx1;
            this.dy = null;
            this.dy1 = null;
            
            this.dy1 = dy1;
        } else {
            this.dx1 = dx1;
            this.dy1 = dy1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".translation(%s, %s)", dx1, dy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".translation(%s, %s);", dx1, dy1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetGetFeatureBounds() {
        if (getGetFeatureBounds != null) {
            return getGetFeatureBounds.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetFeatureBounds());

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