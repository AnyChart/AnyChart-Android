package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class ContextMenu extends JsObject {

    
    private String className;

    public void setAddclassname(String className) {
        this.className = className;
    }

    private Element target;
    private Chart target1;
    private Boolean capture;

    public void setAttach(Element target, Boolean capture) {
        this.target = null;
        this.target1 = null;
        
        this.target = target;
        this.capture = capture;
    }


    public void setAttach(Chart target1, Boolean capture) {
        this.target = null;
        this.target1 = null;
        
        this.target1 = target1;
        this.capture = capture;
    }

    private Element target2;
    private Boolean capture1;

    public void setDetach(Element target2, Boolean capture1) {
        this.target = null;
        this.target1 = null;
        this.target2 = null;
        
        this.target2 = target2;
        this.capture = null;
        this.capture1 = null;
        
        this.capture1 = capture1;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Item[] items;

    public void setItems(Item[] items) {
        this.items = items;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String className1;

    public void setRemoveclassname(String className1) {
        this.className = null;
        this.className1 = null;
        
        this.className1 = className1;
    }

    private String[] var_args;
    private Double var_args1;
    private String var_args2;
    private Boolean var_args3;

    public void setSetup(String[] var_args) {
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        this.var_args3 = null;
        
        this.var_args = var_args;
    }


    public void setSetup(Double var_args1) {
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        this.var_args3 = null;
        
        this.var_args1 = var_args1;
    }


    public void setSetup(String var_args2) {
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        this.var_args3 = null;
        
        this.var_args2 = var_args2;
    }


    public void setSetup(Boolean var_args3) {
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        this.var_args3 = null;
        
        this.var_args3 = var_args3;
    }

    private Double x;
    private Double y;

    public void setShow(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    private String type1;
    private Boolean useCapture1;

    public void setUnlisten(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private String generateJSclassName() {
        if (className != null) {
            return String.format(Locale.US, "className: \"%s\",", className);
        }
        return "";
    }

    private String generateJStarget() {
        if (target != null) {
            return String.format(Locale.US, "target: %s,", (target != null) ? target.generateJs() : "null");
        }
        return "";
    }

    private String generateJStarget1() {
        if (target1 != null) {
            return String.format(Locale.US, "target: %s,", (target1 != null) ? target1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScapture() {
        if (capture != null) {
            return String.format(Locale.US, "capture: %b,", capture);
        }
        return "";
    }

    private String generateJStarget2() {
        if (target2 != null) {
            return String.format(Locale.US, "target: %s,", (target2 != null) ? target2.generateJs() : "null");
        }
        return "";
    }

    private String generateJScapture1() {
        if (capture1 != null) {
            return String.format(Locale.US, "capture: %b,", capture1);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSitems() {
        if (items != null) {
            return String.format(Locale.US, "items: %s,", arrayToString(items));
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

    private String generateJSclassName1() {
        if (className1 != null) {
            return String.format(Locale.US, "className: \"%s\",", className1);
        }
        return "";
    }

    private String generateJSvar_args() {
        if (var_args != null) {
            return String.format(Locale.US, "var_args: %s,", Arrays.toString(var_args));
        }
        return "";
    }

    private String generateJSvar_args1() {
        if (var_args1 != null) {
            return String.format(Locale.US, "var_args: %f,", var_args1);
        }
        return "";
    }

    private String generateJSvar_args2() {
        if (var_args2 != null) {
            return String.format(Locale.US, "var_args: \"%s\",", var_args2);
        }
        return "";
    }

    private String generateJSvar_args3() {
        if (var_args3 != null) {
            return String.format(Locale.US, "var_args: %b,", var_args3);
        }
        return "";
    }

    private String generateJSx() {
        if (x != null) {
            return String.format(Locale.US, "x: %f,", x);
        }
        return "";
    }

    private String generateJSy() {
        if (y != null) {
            return String.format(Locale.US, "y: %f,", y);
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


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSclassName());
        js.append(generateJStarget());
        js.append(generateJStarget1());
        js.append(generateJScapture());
        js.append(generateJStarget2());
        js.append(generateJScapture1());
        js.append(generateJSenabled());
        js.append(generateJSitems());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJSclassName1());
        js.append(generateJSvar_args());
        js.append(generateJSvar_args1());
        js.append(generateJSvar_args2());
        js.append(generateJSvar_args3());
        js.append(generateJSx());
        js.append(generateJSy());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}