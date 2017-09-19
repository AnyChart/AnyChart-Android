package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class RenderingsettingsContext extends JsObject {

    
    private PointState state;
    private Double baseZIndex;
    private String restrictShapes;

    public void setGetshapesgroup(PointState state, Double baseZIndex, String restrictShapes) {
        this.state = state;
        this.baseZIndex = baseZIndex;
        this.restrictShapes = restrictShapes;
    }

    private String key;

    public void setGetstat(String key) {
        this.key = key;
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
        js.append("{");
        js.append(generateJSstate());
        js.append(generateJSbaseZIndex());
        js.append(generateJSrestrictShapes());
        js.append(generateJSkey());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}