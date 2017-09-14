package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class RenderingSettings extends JsObject {

    
    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private Boolean needsWidth;

    public void setNeedswidth(Boolean needsWidth) {
        this.needsWidth = needsWidth;
    }

    private Boolean needsZero;

    public void setNeedszero(Boolean needsZero) {
        this.needsZero = needsZero;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private ShapeConfig[] shapes;

    public void setShapes(ShapeConfig[] shapes) {
        this.shapes = shapes;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private String[] yValues;

    public void setYvalues(String[] yValues) {
        this.yValues = yValues;
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: \"%s\",", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: \"%s\",", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSneedsWidth() {
        if (needsWidth != null) {
            return String.format(Locale.US, "needsWidth: %b,", needsWidth);
        }
        return "";
    }

    private String generateJSneedsZero() {
        if (needsZero != null) {
            return String.format(Locale.US, "needsZero: %b,", needsZero);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: \"%s\",", type2);
        }
        return "";
    }

    private String generateJSshapes() {
        if (shapes != null) {
            return String.format(Locale.US, "shapes: %s,", arrayToString(shapes));
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: \"%s\",", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSyValues() {
        if (yValues != null) {
            return String.format(Locale.US, "yValues: %s,", Arrays.toString(yValues));
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSneedsWidth());
        js.append(generateJSneedsZero());
        js.append(generateJStype2());
        js.append(generateJSshapes());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSyValues());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}