package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Mapping extends JsObject {

    private String jsBase;

    public Mapping() {

    }

    protected Mapping(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private View otherView;
    private String[] otherView1;

    public void setConcat(View otherView) {
        if (jsBase == null) {
            this.otherView = null;
            this.otherView1 = null;
            
            this.otherView = otherView;
        } else {
            this.otherView = otherView;

            js.append(String.format(Locale.US, jsBase + ".concat(%s);", (otherView != null) ? otherView.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".concat(%s);", (otherView != null) ? otherView.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setConcat(String[] otherView1) {
        if (jsBase == null) {
            this.otherView = null;
            this.otherView1 = null;
            
            this.otherView1 = otherView1;
        } else {
            this.otherView1 = otherView1;

            js.append(String.format(Locale.US, jsBase + ".concat(%s);", Arrays.toString(otherView1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".concat(%s);", Arrays.toString(otherView1)));
                js.setLength(0);
            }
        }
    }

    private String fieldName;

    public void setFilter(String fieldName) {
        if (jsBase == null) {
            this.fieldName = fieldName;
        } else {
            this.fieldName = fieldName;

            js.append(String.format(Locale.US, jsBase + ".filter(%s);", fieldName));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".filter(%s);", fieldName));
                js.setLength(0);
            }
        }
    }

    private String fieldName1;

    public void setFind(String fieldName1) {
        if (jsBase == null) {
            this.fieldName = null;
            this.fieldName1 = null;
            
            this.fieldName1 = fieldName1;
        } else {
            this.fieldName1 = fieldName1;

            js.append(String.format(Locale.US, jsBase + ".find(%s);", fieldName1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".find(%s);", fieldName1));
                js.setLength(0);
            }
        }
    }

    private Double rowIndex;
    private String fieldName2;

    public void setGet(Double rowIndex, String fieldName2) {
        if (jsBase == null) {
            this.rowIndex = rowIndex;
            this.fieldName = null;
            this.fieldName1 = null;
            this.fieldName2 = null;
            
            this.fieldName2 = fieldName2;
        } else {
            this.rowIndex = rowIndex;
            this.fieldName2 = fieldName2;

            js.append(String.format(Locale.US, jsBase + ".get(%f, %s);", rowIndex, fieldName2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%f, %s);", rowIndex, fieldName2));
                js.setLength(0);
            }
        }
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

    private Double index;
    private String name;

    public void setMeta(Double index, String name) {
        if (jsBase == null) {
            this.index = index;
            this.name = name;
        } else {
            this.index = index;
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".meta(%f, %s);", index, name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".meta(%f, %s);", index, name));
                js.setLength(0);
            }
        }
    }

    private Double index1;
    private String name1;
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

    private Double rowIndex1;

    public void setRow(Double rowIndex1) {
        if (jsBase == null) {
            this.rowIndex = null;
            this.rowIndex1 = null;
            
            this.rowIndex1 = rowIndex1;
        } else {
            this.rowIndex1 = rowIndex1;

            js.append(String.format(Locale.US, jsBase + ".row(%f);", rowIndex1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".row(%f);", rowIndex1));
                js.setLength(0);
            }
        }
    }

    private Double rowIndex2;
    private Double rowIndex3;
    private String fieldName3;

    public void setSet(Double rowIndex3, String fieldName3) {
        if (jsBase == null) {
            this.rowIndex = null;
            this.rowIndex1 = null;
            this.rowIndex2 = null;
            this.rowIndex3 = null;
            
            this.rowIndex3 = rowIndex3;
            this.fieldName = null;
            this.fieldName1 = null;
            this.fieldName2 = null;
            this.fieldName3 = null;
            
            this.fieldName3 = fieldName3;
        } else {
            this.rowIndex3 = rowIndex3;
            this.fieldName3 = fieldName3;

            js.append(String.format(Locale.US, jsBase + ".set(%f, %s);", rowIndex3, fieldName3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".set(%f, %s);", rowIndex3, fieldName3));
                js.setLength(0);
            }
        }
    }

    private String fieldName4;

    public void setSort(String fieldName4) {
        if (jsBase == null) {
            this.fieldName = null;
            this.fieldName1 = null;
            this.fieldName2 = null;
            this.fieldName3 = null;
            this.fieldName4 = null;
            
            this.fieldName4 = fieldName4;
        } else {
            this.fieldName4 = fieldName4;

            js.append(String.format(Locale.US, jsBase + ".sort(%s);", fieldName4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sort(%s);", fieldName4));
                js.setLength(0);
            }
        }
    }

    private String fieldName5;
    private Sort order;

    public void setSort(String fieldName5, Sort order) {
        if (jsBase == null) {
            this.fieldName = null;
            this.fieldName1 = null;
            this.fieldName2 = null;
            this.fieldName3 = null;
            this.fieldName4 = null;
            this.fieldName5 = null;
            
            this.fieldName5 = fieldName5;
            this.order = order;
        } else {
            this.fieldName5 = fieldName5;
            this.order = order;

            js.append(String.format(Locale.US, jsBase + ".sort(%s, %s);", fieldName5, (order != null) ? order.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".sort(%s, %s);", fieldName5, (order != null) ? order.generateJs() : "null"));
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

    private String generateJSotherView() {
        if (otherView != null) {
            return String.format(Locale.US, "otherView: %s,", (otherView != null) ? otherView.generateJs() : "null");
        }
        return "";
    }

    private String generateJSotherView1() {
        if (otherView1 != null) {
            return String.format(Locale.US, "otherView: %s,", Arrays.toString(otherView1));
        }
        return "";
    }

    private String generateJSfieldName() {
        if (fieldName != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName);
        }
        return "";
    }

    private String generateJSfieldName1() {
        if (fieldName1 != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName1);
        }
        return "";
    }

    private String generateJSrowIndex() {
        if (rowIndex != null) {
            return String.format(Locale.US, "rowIndex: %f,", rowIndex);
        }
        return "";
    }

    private String generateJSfieldName2() {
        if (fieldName2 != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName2);
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

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSname1() {
        if (name1 != null) {
            return String.format(Locale.US, "name: %s,", name1);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSrowIndex1() {
        if (rowIndex1 != null) {
            return String.format(Locale.US, "rowIndex: %f,", rowIndex1);
        }
        return "";
    }

    private String generateJSrowIndex2() {
        if (rowIndex2 != null) {
            return String.format(Locale.US, "rowIndex: %f,", rowIndex2);
        }
        return "";
    }

    private String generateJSrowIndex3() {
        if (rowIndex3 != null) {
            return String.format(Locale.US, "rowIndex: %f,", rowIndex3);
        }
        return "";
    }

    private String generateJSfieldName3() {
        if (fieldName3 != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName3);
        }
        return "";
    }

    private String generateJSfieldName4() {
        if (fieldName4 != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName4);
        }
        return "";
    }

    private String generateJSfieldName5() {
        if (fieldName5 != null) {
            return String.format(Locale.US, "fieldName: %s,", fieldName5);
        }
        return "";
    }

    private String generateJSorder() {
        if (order != null) {
            return String.format(Locale.US, "order: %s,", (order != null) ? order.generateJs() : "null");
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


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSotherView());
            js.append(generateJSotherView1());
            js.append(generateJSfieldName());
            js.append(generateJSfieldName1());
            js.append(generateJSrowIndex());
            js.append(generateJSfieldName2());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSindex());
            js.append(generateJSname());
            js.append(generateJSindex1());
            js.append(generateJSname1());
            js.append(generateJStype2());
            js.append(generateJSrowIndex1());
            js.append(generateJSrowIndex2());
            js.append(generateJSrowIndex3());
            js.append(generateJSfieldName3());
            js.append(generateJSfieldName4());
            js.append(generateJSfieldName5());
            js.append(generateJSorder());
            js.append(generateJStype3());
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