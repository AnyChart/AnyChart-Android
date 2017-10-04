package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class PointContext extends RenderingsettingsContext {

    private String jsBase;

    public PointContext() {

    }

    protected PointContext(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String name;

    public void setGetdatavalue(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".getDataValue(%s);", name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getDataValue(%s);", name));
                js.setLength(0);
            }
        }
    }

    private PointState state;
    private Double baseZIndex;
    private String restrictShapes;

    public void setGetshapesgroup(PointState state, Double baseZIndex, String restrictShapes) {
        if (jsBase == null) {
            this.state = state;
            this.baseZIndex = baseZIndex;
            this.restrictShapes = restrictShapes;
        } else {
            this.state = state;
            this.baseZIndex = baseZIndex;
            this.restrictShapes = restrictShapes;

            js.append(String.format(Locale.US, jsBase + ".getShapesGroup(%s, %f, %s);", (state != null) ? state.generateJs() : "null", baseZIndex, restrictShapes));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getShapesGroup(%s, %f, %s);", (state != null) ? state.generateJs() : "null", baseZIndex, restrictShapes));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setGetstat(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".getStat(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s);", key));
                js.setLength(0);
            }
        }
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSstate() {
        if (state != null) {
            return String.format(Locale.US, "state: %s,", (state != null) ? state.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbaseZIndex() {
        if (baseZIndex != null) {
            return String.format(Locale.US, "baseZIndex: %f,", baseZIndex);
        }
        return "";
    }

    private String generateJSrestrictShapes() {
        if (restrictShapes != null) {
            return String.format(Locale.US, "restrictShapes: %s,", restrictShapes);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSname());
            js.append(generateJSstate());
            js.append(generateJSbaseZIndex());
            js.append(generateJSrestrictShapes());
            js.append(generateJSkey());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}