package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Grouping settings class.
 */
public class Grouping extends CoreBase {

    public Grouping() {
        js.setLength(0);
        js.append("var grouping").append(++variableIndex).append(" = anychart.core.stock.grouping();");
        jsBase = "grouping" + variableIndex;
    }

    protected Grouping(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Grouping(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean enabled;

    /**
     * Setter for the grouping enabled state.
     */
    public Grouping setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".enabled(%b)", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean forced;

    /**
     * Setter for the forced grouping settings.
     */
    public Grouping setForced(Boolean forced) {
        if (jsBase == null) {
            this.forced = forced;
        } else {
            this.forced = forced;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".forced(%b)", forced));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".forced(%b);", forced));
                js.setLength(0);
            }
        }
        return this;
    }

    private String[] levels;

    /**
     * Setter for the data grouping levels.
     */
    public Grouping setLevels(String[] levels) {
        if (jsBase == null) {
            this.levels = levels;
        } else {
            this.levels = levels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".levels(%s)", arrayToStringWrapQuotes(levels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".levels(%s);", arrayToStringWrapQuotes(levels)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number maxVisiblePoints;

    /**
     * Setter for the maximum visible points count.
     */
    public Grouping setMaxVisiblePoints(Number maxVisiblePoints) {
        if (jsBase == null) {
            this.maxVisiblePoints = maxVisiblePoints;
        } else {
            this.maxVisiblePoints = maxVisiblePoints;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxVisiblePoints(%s)", maxVisiblePoints));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxVisiblePoints(%s);", maxVisiblePoints));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number minPixPerPoint;

    /**
     * Setter for minimum pixels per point count.
     */
    public Grouping setMinPixPerPoint(Number minPixPerPoint) {
        if (jsBase == null) {
            this.minPixPerPoint = minPixPerPoint;
        } else {
            this.minPixPerPoint = minPixPerPoint;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minPixPerPoint(%s)", minPixPerPoint));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minPixPerPoint(%s);", minPixPerPoint));
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