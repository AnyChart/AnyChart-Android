package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * A base for all continuous series, like lines, splines, areas, etc.
 */
public class PolarSeriesContinuousBase extends PolarSeriesBase {

    public PolarSeriesContinuousBase() {
        js.setLength(0);
        js.append("var polarSeriesContinuousBase").append(++variableIndex).append(" = anychart.core.polar.series.continuousBase();");
        jsBase = "polarSeriesContinuousBase" + variableIndex;
    }

    protected PolarSeriesContinuousBase(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected PolarSeriesContinuousBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean closed;
    private List<PolarSeriesContinuousBase> setClosed = new ArrayList<>();

    /**
     * Setter for series close settings.
     */
    public PolarSeriesContinuousBase setClosed(Boolean closed) {
        if (jsBase == null) {
            this.closed = closed;
        } else {
            this.closed = closed;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".closed(%b)", closed));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".closed(%b)", closed));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetClosed() {
        if (!setClosed.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesContinuousBase item : setClosed) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean connectMissingPoints;
    private List<PolarSeriesContinuousBase> setConnectMissingPoints = new ArrayList<>();

    /**
     * Setter for connectMissingPoints series settings.
     */
    public PolarSeriesContinuousBase setConnectMissingPoints(Boolean connectMissingPoints) {
        if (jsBase == null) {
            this.connectMissingPoints = connectMissingPoints;
        } else {
            this.connectMissingPoints = connectMissingPoints;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".connectMissingPoints(%b)", connectMissingPoints));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".connectMissingPoints(%b)", connectMissingPoints));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetConnectMissingPoints() {
        if (!setConnectMissingPoints.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesContinuousBase item : setConnectMissingPoints) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiMarkersFactory getMarkers;

    /**
     * Getter for series data markers.
     */
    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }

    private String markers;
    private Boolean markers1;
    private String markers2;
    private List<PolarSeriesContinuousBase> setMarkers = new ArrayList<>();

    /**
     * Setter for series data markers.
     */
    public PolarSeriesContinuousBase setMarkers(String markers) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers = markers;
        } else {
            this.markers = markers;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMarkers() {
        if (!setMarkers.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesContinuousBase item : setMarkers) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<PolarSeriesContinuousBase> setMarkers1 = new ArrayList<>();

    /**
     * Setter for series data markers.
     */
    public PolarSeriesContinuousBase setMarkers(Boolean markers1) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers1 = markers1;
        } else {
            this.markers1 = markers1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".markers(%b)", markers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%b)", markers1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMarkers1() {
        if (!setMarkers1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (PolarSeriesContinuousBase item : setMarkers1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetMarkers());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetClosed());
        js.append(generateJSsetConnectMissingPoints());
        js.append(generateJSsetMarkers());
        js.append(generateJSsetMarkers1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}