package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class TableMapping extends JsObject {

    private String jsBase;

    public TableMapping() {

    }

    protected TableMapping(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String name;
    private Double column;
    private AggregationType type;
    private Double weightsColumn;

    public void setAddfield(String name, Double column, AggregationType type, Double weightsColumn) {
        if (jsBase == null) {
            this.name = name;
            this.column = column;
            this.type = type;
            this.weightsColumn = weightsColumn;
        } else {
            this.name = name;
            this.column = column;
            this.type = type;
            this.weightsColumn = weightsColumn;

            js.append(String.format(Locale.US, jsBase + ".addField(%s, %f, %s, %f);", name, column, (type != null) ? type.generateJs() : "null", weightsColumn));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addField(%s, %f, %s, %f);", name, column, (type != null) ? type.generateJs() : "null", weightsColumn));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type1, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type1 = type1;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type1, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type1, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type2;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type2, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type2 = type2;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type2, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type2, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private String type3;

    public void setRemovealllisteners(String type3) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
        } else {
            this.type3 = type3;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type3));
                js.setLength(0);
            }
        }
    }

    private String type4;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type4, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            this.type4 = null;
            
            this.type4 = type4;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type4 = type4;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type4, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type4, useCapture2, listenerScope2));
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

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJScolumn() {
        if (column != null) {
            return String.format(Locale.US, "column: %f,", column);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", (type != null) ? type.generateJs() : "null");
        }
        return "";
    }

    private String generateJSweightsColumn() {
        if (weightsColumn != null) {
            return String.format(Locale.US, "weightsColumn: %f,", weightsColumn);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
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

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
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

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJStype4() {
        if (type4 != null) {
            return String.format(Locale.US, "type: %s,", type4);
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


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSname());
            js.append(generateJScolumn());
            js.append(generateJStype());
            js.append(generateJSweightsColumn());
            js.append(generateJStype1());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype2());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJStype3());
            js.append(generateJStype4());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}