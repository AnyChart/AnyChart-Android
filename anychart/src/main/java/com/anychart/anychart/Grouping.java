package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Grouping extends JsObject {

    
    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Boolean forced;

    public void setForced(Boolean forced) {
        this.forced = forced;
    }

    private String[] levels;

    public void setLevels(String[] levels) {
        this.levels = levels;
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

    private Double maxVisiblePoints;

    public void setMaxvisiblepoints(Double maxVisiblePoints) {
        this.maxVisiblePoints = maxVisiblePoints;
    }

    private Double minPixPerPoint;

    public void setMinpixperpoint(Double minPixPerPoint) {
        this.minPixPerPoint = minPixPerPoint;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
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

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSforced() {
        if (forced != null) {
            return String.format(Locale.US, "forced: %b,", forced);
        }
        return "";
    }

    private String generateJSlevels() {
        if (levels != null) {
            return String.format(Locale.US, "levels: %s,", Arrays.toString(levels));
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
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
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSmaxVisiblePoints() {
        if (maxVisiblePoints != null) {
            return String.format(Locale.US, "maxVisiblePoints: %f,", maxVisiblePoints);
        }
        return "";
    }

    private String generateJSminPixPerPoint() {
        if (minPixPerPoint != null) {
            return String.format(Locale.US, "minPixPerPoint: %f,", minPixPerPoint);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
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
        js.append(generateJSenabled());
        js.append(generateJSforced());
        js.append(generateJSlevels());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSmaxVisiblePoints());
        js.append(generateJSminPixPerPoint());
        js.append(generateJStype2());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}