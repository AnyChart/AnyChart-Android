package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class ContextMenu extends JsObject {

    public ContextMenu() {

    }

    protected ContextMenu(String jsBase) {
        this.jsBase = jsBase;
    }

    protected ContextMenu(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String className;

    public void setAddClassName(String className) {
        if (jsBase == null) {
            this.className = className;
        } else {
            this.className = className;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".addClassName(%s);", className));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addClassName(%s)", className));
                js.setLength(0);
            }
        }
    }

    private Element target;
    private Chart target1;
    private Boolean capture;

    public ContextMenu setAttach(Element target, Boolean capture) {
        if (jsBase == null) {
            this.target = null;
            this.target1 = null;
            
            this.target = target;
            this.capture = capture;
        } else {
            this.target = target;
            this.capture = capture;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".attach(%s, %b)", (target != null) ? target.generateJs() : "null", capture));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".attach(%s, %b)", (target != null) ? target.generateJs() : "null", capture));
                js.setLength(0);
            }
        }
        return this;
    }


    public ContextMenu setAttach(Chart target1, Boolean capture) {
        if (jsBase == null) {
            this.target = null;
            this.target1 = null;
            
            this.target1 = target1;
            this.capture = capture;
        } else {
            this.target1 = target1;
            this.capture = capture;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".attach(%s, %b)", (target1 != null) ? target1.generateJs() : "null", capture));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".attach(%s, %b)", (target1 != null) ? target1.generateJs() : "null", capture));
                js.setLength(0);
            }
        }
        return this;
    }

    private Element target2;
    private Boolean capture1;

    public ContextMenu setDetach(Element target2, Boolean capture1) {
        if (jsBase == null) {
            this.target = null;
            this.target1 = null;
            this.target2 = null;
            
            this.target2 = target2;
            this.capture = null;
            this.capture1 = null;
            
            this.capture1 = capture1;
        } else {
            this.target2 = target2;
            this.capture1 = capture1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".detach(%s, %b)", (target2 != null) ? target2.generateJs() : "null", capture1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".detach(%s, %b)", (target2 != null) ? target2.generateJs() : "null", capture1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean enabled;

    public ContextMenu setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Item[] items;

    public ContextMenu setItems(Item[] items) {
        if (jsBase == null) {
            this.items = items;
        } else {
            this.items = items;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".items(%s)", arrayToString(items)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".items(%s)", arrayToString(items)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s)", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String className1;

    public void setRemoveClassName(String className1) {
        if (jsBase == null) {
            this.className = null;
            this.className1 = null;
            
            this.className1 = className1;
        } else {
            this.className1 = className1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".removeClassName(%s);", className1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeClassName(%s)", className1));
                js.setLength(0);
            }
        }
    }

    private String var_args;
    private String[] var_args1;
    private Double var_args2;
    private String var_args3;
    private Boolean var_args4;

    public ContextMenu setSetup(String var_args) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            
            this.var_args = var_args;
        } else {
            this.var_args = var_args;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setup(%s)", var_args));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setup(%s)", var_args));
                js.setLength(0);
            }
        }
        return this;
    }


    public ContextMenu setSetup(String[] var_args1) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.var_args1 = var_args1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setup(%s)", Arrays.toString(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setup(%s)", Arrays.toString(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


    public ContextMenu setSetup(Double var_args2) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.var_args2 = var_args2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setup(%f)", var_args2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setup(%f)", var_args2));
                js.setLength(0);
            }
        }
        return this;
    }


    public ContextMenu setSetup(Boolean var_args4) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            
            this.var_args4 = var_args4;
        } else {
            this.var_args4 = var_args4;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setup(%b)", var_args4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setup(%b)", var_args4));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double x;
    private Double y;

    public void setShow(Double x, Double y) {
        if (jsBase == null) {
            this.x = x;
            this.y = y;
        } else {
            this.x = x;
            this.y = y;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".show(%f, %f);", x, y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".show(%f, %f)", x, y));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setUnlisten(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s)", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private String generateJSclassName() {
        if (className != null) {
            return String.format(Locale.US, "className: %s,", className);
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

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJSclassName1() {
        if (className1 != null) {
            return String.format(Locale.US, "className: %s,", className1);
        }
        return "";
    }

    private String generateJSvar_args() {
        if (var_args != null) {
            return String.format(Locale.US, "var_args: %s,", var_args);
        }
        return "";
    }

    private String generateJSvar_args1() {
        if (var_args1 != null) {
            return String.format(Locale.US, "var_args: %s,", Arrays.toString(var_args1));
        }
        return "";
    }

    private String generateJSvar_args2() {
        if (var_args2 != null) {
            return String.format(Locale.US, "var_args: %f,", var_args2);
        }
        return "";
    }

    private String generateJSvar_args3() {
        if (var_args3 != null) {
            return String.format(Locale.US, "var_args: %s,", var_args3);
        }
        return "";
    }

    private String generateJSvar_args4() {
        if (var_args4 != null) {
            return String.format(Locale.US, "var_args: %b,", var_args4);
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

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
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

        if (jsBase == null) {
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
            js.append(generateJSlistenerScope());
            js.append(generateJSclassName1());
            js.append(generateJSvar_args());
            js.append(generateJSvar_args1());
            js.append(generateJSvar_args2());
            js.append(generateJSvar_args3());
            js.append(generateJSvar_args4());
            js.append(generateJSx());
            js.append(generateJSy());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}