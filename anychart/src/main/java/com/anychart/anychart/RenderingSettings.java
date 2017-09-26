package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class RenderingSettings extends JsObject {

    private String jsBase;

    public RenderingSettings() {

    }

    protected RenderingSettings(String jsBase) {
        this.jsBase = jsBase;
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

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
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

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private Boolean needsWidth;

    public void setNeedswidth(Boolean needsWidth) {
        if (jsBase == null) {
            this.needsWidth = needsWidth;
        } else {
            this.needsWidth = needsWidth;

            js.append(String.format(Locale.US, jsBase + ".needsWidth(%b);", needsWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".needsWidth(%b);", needsWidth));
                js.setLength(0);
            }
        }
    }

    private Boolean needsZero;

    public void setNeedszero(Boolean needsZero) {
        if (jsBase == null) {
            this.needsZero = needsZero;
        } else {
            this.needsZero = needsZero;

            js.append(String.format(Locale.US, jsBase + ".needsZero(%b);", needsZero));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".needsZero(%b);", needsZero));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private ShapeConfig[] shapes;

    public void setShapes(ShapeConfig[] shapes) {
        if (jsBase == null) {
            this.shapes = shapes;
        } else {
            this.shapes = shapes;

            js.append(String.format(Locale.US, jsBase + ".shapes(%s);", arrayToString(shapes)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".shapes(%s);", arrayToString(shapes)));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
                js.setLength(0);
            }
        }
    }

    private String[] yValues;

    public void setYvalues(String[] yValues) {
        if (jsBase == null) {
            this.yValues = yValues;
        } else {
            this.yValues = yValues;

            js.append(String.format(Locale.US, jsBase + ".yValues(%s);", Arrays.toString(yValues)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yValues(%s);", Arrays.toString(yValues)));
                js.setLength(0);
            }
        }
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
            return String.format(Locale.US, "type: %s,", type2);
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

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
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
        if (jsBase == null) {
            js.append("{");
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSneedsWidth());
            js.append(generateJSneedsZero());
            js.append(generateJStype2());
            js.append(generateJSshapes());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSyValues());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}