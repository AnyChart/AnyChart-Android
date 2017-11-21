package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
    private List<Grouping> setEnabled = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".enabled(%b)", enabled));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEnabled() {
        if (!setEnabled.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Grouping item : setEnabled) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean forced;
    private List<Grouping> setForced = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".forced(%b)", forced));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetForced() {
        if (!setForced.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Grouping item : setForced) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String[] levels;
    private List<Grouping> setLevels = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".levels(%s)", arrayToStringWrapQuotes(levels)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLevels() {
        if (!setLevels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Grouping item : setLevels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxVisiblePoints;
    private List<Grouping> setMaxVisiblePoints = new ArrayList<>();

    /**
     * Setter for the maximum visible points count.
     */
    public Grouping setMaxVisiblePoints(Double maxVisiblePoints) {
        if (jsBase == null) {
            this.maxVisiblePoints = maxVisiblePoints;
        } else {
            this.maxVisiblePoints = maxVisiblePoints;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".maxVisiblePoints(%f)", maxVisiblePoints));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxVisiblePoints(%f)", maxVisiblePoints));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxVisiblePoints() {
        if (!setMaxVisiblePoints.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Grouping item : setMaxVisiblePoints) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minPixPerPoint;
    private List<Grouping> setMinPixPerPoint = new ArrayList<>();

    /**
     * Setter for minimum pixels per point count.
     */
    public Grouping setMinPixPerPoint(Double minPixPerPoint) {
        if (jsBase == null) {
            this.minPixPerPoint = minPixPerPoint;
        } else {
            this.minPixPerPoint = minPixPerPoint;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minPixPerPoint(%f)", minPixPerPoint));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minPixPerPoint(%f)", minPixPerPoint));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinPixPerPoint() {
        if (!setMinPixPerPoint.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Grouping item : setMinPixPerPoint) {
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

        js.append(generateJSsetEnabled());
        js.append(generateJSsetForced());
        js.append(generateJSsetLevels());
        js.append(generateJSsetMaxVisiblePoints());
        js.append(generateJSsetMinPixPerPoint());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}