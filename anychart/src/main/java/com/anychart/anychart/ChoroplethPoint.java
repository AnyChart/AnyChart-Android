package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ChoroplethPoint extends JsObject {

    
    private String crs;

    public void setCrs(String crs) {
        this.crs = crs;
    }

    private String field;

    public void setGet(String field) {
        this.field = field;
    }

    private String key;
    private Statistics key1;

    public void setGetstat(String key) {
        this.key = null;
        this.key1 = null;
        
        this.key = key;
    }


    public void setGetstat(Statistics key1) {
        this.key = null;
        this.key1 = null;
        
        this.key1 = key1;
    }

    private Boolean hovered;

    public void setHovered(Boolean hovered) {
        this.hovered = hovered;
    }

    private Double middleX;

    public void setMiddlex(Double middleX) {
        this.middleX = middleX;
    }

    private Double middleY;

    public void setMiddley(Double middleY) {
        this.middleY = middleY;
    }

    private Double scale;

    public void setScalefactor(Double scale) {
        this.scale = scale;
    }

    private Boolean selected;

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    private String field1;

    public void setSet(String field1) {
        this.field = null;
        this.field1 = null;
        
        this.field1 = field1;
    }

    private Double dx;
    private Double dy;

    public void setTranslate(Double dx, Double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    private Double dx1;
    private Double dy1;

    public void setTranslation(Double dx1, Double dy1) {
        this.dx = null;
        this.dx1 = null;
        
        this.dx1 = dx1;
        this.dy = null;
        this.dy1 = null;
        
        this.dy1 = dy1;
    }

    private String generateJScrs() {
        if (crs != null) {
            return String.format(Locale.US, "crs: \"%s\",", crs);
        }
        return "";
    }

    private String generateJSfield() {
        if (field != null) {
            return String.format(Locale.US, "field: \"%s\",", field);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: \"%s\",", key);
        }
        return "";
    }

    private String generateJSkey1() {
        if (key1 != null) {
            return String.format(Locale.US, "key: %s,", (key1 != null) ? key1.generateJs() : "null");
        }
        return "";
    }

    private String generateJShovered() {
        if (hovered != null) {
            return String.format(Locale.US, "hovered: %b,", hovered);
        }
        return "";
    }

    private String generateJSmiddleX() {
        if (middleX != null) {
            return String.format(Locale.US, "middleX: %f,", middleX);
        }
        return "";
    }

    private String generateJSmiddleY() {
        if (middleY != null) {
            return String.format(Locale.US, "middleY: %f,", middleY);
        }
        return "";
    }

    private String generateJSscale() {
        if (scale != null) {
            return String.format(Locale.US, "scale: %f,", scale);
        }
        return "";
    }

    private String generateJSselected() {
        if (selected != null) {
            return String.format(Locale.US, "selected: %b,", selected);
        }
        return "";
    }

    private String generateJSfield1() {
        if (field1 != null) {
            return String.format(Locale.US, "field: \"%s\",", field1);
        }
        return "";
    }

    private String generateJSdx() {
        if (dx != null) {
            return String.format(Locale.US, "dx: %f,", dx);
        }
        return "";
    }

    private String generateJSdy() {
        if (dy != null) {
            return String.format(Locale.US, "dy: %f,", dy);
        }
        return "";
    }

    private String generateJSdx1() {
        if (dx1 != null) {
            return String.format(Locale.US, "dx: %f,", dx1);
        }
        return "";
    }

    private String generateJSdy1() {
        if (dy1 != null) {
            return String.format(Locale.US, "dy: %f,", dy1);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJScrs());
        js.append(generateJSfield());
        js.append(generateJSkey());
        js.append(generateJSkey1());
        js.append(generateJShovered());
        js.append(generateJSmiddleX());
        js.append(generateJSmiddleY());
        js.append(generateJSscale());
        js.append(generateJSselected());
        js.append(generateJSfield1());
        js.append(generateJSdx());
        js.append(generateJSdy());
        js.append(generateJSdx1());
        js.append(generateJSdy1());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}