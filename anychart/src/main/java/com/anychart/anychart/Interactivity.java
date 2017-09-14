package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Interactivity extends JsObject {

    
    private HoverMode hoverMode;
    private String hoverMode1;

    public void setHovermode(HoverMode hoverMode) {
        this.hoverMode = null;
        this.hoverMode1 = null;
        
        this.hoverMode = hoverMode;
    }


    public void setHovermode(String hoverMode1) {
        this.hoverMode = null;
        this.hoverMode1 = null;
        
        this.hoverMode1 = hoverMode1;
    }

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

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private SelectionMode selectionMode;
    private String selectionMode1;

    public void setSelectionmode(SelectionMode selectionMode) {
        this.selectionMode = null;
        this.selectionMode1 = null;
        
        this.selectionMode = selectionMode;
    }


    public void setSelectionmode(String selectionMode1) {
        this.selectionMode = null;
        this.selectionMode1 = null;
        
        this.selectionMode1 = selectionMode1;
    }

    private Double spotRadius;

    public void setSpotradius(Double spotRadius) {
        this.spotRadius = spotRadius;
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

    private String generateJShoverMode() {
        if (hoverMode != null) {
            return String.format(Locale.US, "hoverMode: %s,", (hoverMode != null) ? hoverMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJShoverMode1() {
        if (hoverMode1 != null) {
            return String.format(Locale.US, "hoverMode: \"%s\",", hoverMode1);
        }
        return "";
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

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: \"%s\",", type2);
        }
        return "";
    }

    private String generateJSselectionMode() {
        if (selectionMode != null) {
            return String.format(Locale.US, "selectionMode: %s,", (selectionMode != null) ? selectionMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectionMode1() {
        if (selectionMode1 != null) {
            return String.format(Locale.US, "selectionMode: \"%s\",", selectionMode1);
        }
        return "";
    }

    private String generateJSspotRadius() {
        if (spotRadius != null) {
            return String.format(Locale.US, "spotRadius: %f,", spotRadius);
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


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJShoverMode());
        js.append(generateJShoverMode1());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJStype2());
        js.append(generateJSselectionMode());
        js.append(generateJSselectionMode1());
        js.append(generateJSspotRadius());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}