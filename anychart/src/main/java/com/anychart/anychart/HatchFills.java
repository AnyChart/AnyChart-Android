package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class HatchFills extends CoreBase {

    private String jsBase;

    public HatchFills() {

    }

    protected HatchFills(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double index;

    public void setItemat(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".itemAt(%f);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%f);", index));
                js.setLength(0);
            }
        }
    }

    private HatchFill getItemAt;

    public HatchFill getItemAt() {
        if (getItemAt == null)
            getItemAt = new HatchFill(jsBase + ".itemAt()");

        return getItemAt;
    }

    private Double index1;
    private HatchFillType type;
    private String type1;
    private String color;
    private Double thickness;
    private Double size;

    public void setItemat(HatchFillType type, Double index1, String color, Double thickness, Double size) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.type = type;
            this.index1 = index1;
            this.color = color;
            this.thickness = thickness;
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".itemAt(%s, %f, %s, %f, %f);", (type != null) ? type.generateJs() : "null", index1, color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%s, %f, %s, %f, %f);", (type != null) ? type.generateJs() : "null", index1, color, thickness, size));
                js.setLength(0);
            }
        }
    }


    public void setItemat(String type1, Double index1, String color, Double thickness, Double size) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.color = color;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.type1 = type1;
            this.index1 = index1;
            this.color = color;
            this.thickness = thickness;
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".itemAt(%s, %f, %s, %f, %f);", type1, index1, color, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%s, %f, %s, %f, %f);", type1, index1, color, thickness, size));
                js.setLength(0);
            }
        }
    }

    private Double index2;
    private PatternFill patternFill;

    public void setItemat(Double index2, PatternFill patternFill) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
            this.patternFill = patternFill;
        } else {
            this.index2 = index2;
            this.patternFill = patternFill;

            js.append(String.format(Locale.US, jsBase + ".itemAt(%f, %s);", index2, (patternFill != null) ? patternFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%f, %s);", index2, (patternFill != null) ? patternFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double index3;
    private HatchFill instance;

    public void setItemat(Double index3, HatchFill instance) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.instance = instance;
        } else {
            this.index3 = index3;
            this.instance = instance;

            js.append(String.format(Locale.US, jsBase + ".itemAt(%f, %s);", index3, (instance != null) ? instance.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%f, %s);", index3, (instance != null) ? instance.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double index4;
    private Boolean state;

    public void setItemat(Double index4, Boolean state) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            this.index4 = null;
            
            this.index4 = index4;
            this.state = state;
        } else {
            this.index4 = index4;
            this.state = state;

            js.append(String.format(Locale.US, jsBase + ".itemAt(%f, %b);", index4, state));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%f, %b);", index4, state));
                js.setLength(0);
            }
        }
    }

    private HatchFill[] items;
    private HatchFillType[] items1;
    private PatternFill[] items2;
    private HatchFill var_args;
    private HatchFillType var_args1;
    private PatternFill var_args2;

    public void setItems(HatchFill[] items, HatchFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args = var_args;
        } else {
            this.items = items;
            this.var_args = var_args;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(HatchFill[] items, HatchFillType var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items = items;
            this.var_args1 = var_args1;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), (var_args1 != null) ? var_args1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), (var_args1 != null) ? var_args1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(HatchFill[] items, PatternFill var_args2) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.items = items;
            this.var_args2 = var_args2;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), (var_args2 != null) ? var_args2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), (var_args2 != null) ? var_args2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(HatchFillType[] items1, HatchFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args = var_args;
        } else {
            this.items1 = items1;
            this.var_args = var_args;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items1), (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items1), (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(HatchFillType[] items1, HatchFillType var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items1 = items1;
            this.var_args1 = var_args1;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items1), (var_args1 != null) ? var_args1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items1), (var_args1 != null) ? var_args1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(HatchFillType[] items1, PatternFill var_args2) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.items1 = items1;
            this.var_args2 = var_args2;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items1), (var_args2 != null) ? var_args2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items1), (var_args2 != null) ? var_args2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(PatternFill[] items2, HatchFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args = var_args;
        } else {
            this.items2 = items2;
            this.var_args = var_args;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items2), (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items2), (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(PatternFill[] items2, HatchFillType var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items2 = items2;
            this.var_args1 = var_args1;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items2), (var_args1 != null) ? var_args1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items2), (var_args1 != null) ? var_args1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(PatternFill[] items2, PatternFill var_args2) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.items2 = items2;
            this.var_args2 = var_args2;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items2), (var_args2 != null) ? var_args2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items2), (var_args2 != null) ? var_args2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String type2;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type2, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type2 = type2;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type2, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type2, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type3, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type3 = type3;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type3, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type3, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private String type4;

    public void setRemovealllisteners(String type4) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            this.type4 = null;
            
            this.type4 = type4;
        } else {
            this.type4 = type4;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type4));
                js.setLength(0);
            }
        }
    }

    private String type5;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type5, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            this.type4 = null;
            this.type5 = null;
            
            this.type5 = type5;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type5 = type5;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type5, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type5, useCapture2, listenerScope2));
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

    private String generateJSgetItemAt() {
        if (getItemAt != null) {
            return getItemAt.generateJs();
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", (type != null) ? type.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %f,", size);
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }

    private String generateJSpatternFill() {
        if (patternFill != null) {
            return String.format(Locale.US, "patternFill: %s,", (patternFill != null) ? patternFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
        }
        return "";
    }

    private String generateJSinstance() {
        if (instance != null) {
            return String.format(Locale.US, "instance: %s,", (instance != null) ? instance.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex4() {
        if (index4 != null) {
            return String.format(Locale.US, "index: %f,", index4);
        }
        return "";
    }

    private String generateJSstate() {
        if (state != null) {
            return String.format(Locale.US, "state: %b,", state);
        }
        return "";
    }

    private String generateJSitems() {
        if (items != null) {
            return String.format(Locale.US, "items: %s,", arrayToString(items));
        }
        return "";
    }

    private String generateJSitems1() {
        if (items1 != null) {
            return String.format(Locale.US, "items: %s,", arrayToString(items1));
        }
        return "";
    }

    private String generateJSitems2() {
        if (items2 != null) {
            return String.format(Locale.US, "items: %s,", arrayToString(items2));
        }
        return "";
    }

    private String generateJSvar_args() {
        if (var_args != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args != null) ? var_args.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvar_args1() {
        if (var_args1 != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args1 != null) ? var_args1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvar_args2() {
        if (var_args2 != null) {
            return String.format(Locale.US, "var_args: %s,", (var_args2 != null) ? var_args2.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
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

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
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

    private String generateJStype4() {
        if (type4 != null) {
            return String.format(Locale.US, "type: %s,", type4);
        }
        return "";
    }

    private String generateJStype5() {
        if (type5 != null) {
            return String.format(Locale.US, "type: %s,", type5);
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
            js.append(generateJSindex());
            js.append(generateJSindex1());
            js.append(generateJStype());
            js.append(generateJStype1());
            js.append(generateJScolor());
            js.append(generateJSthickness());
            js.append(generateJSsize());
            js.append(generateJSindex2());
            js.append(generateJSpatternFill());
            js.append(generateJSindex3());
            js.append(generateJSinstance());
            js.append(generateJSindex4());
            js.append(generateJSstate());
            js.append(generateJSitems());
            js.append(generateJSitems1());
            js.append(generateJSitems2());
            js.append(generateJSvar_args());
            js.append(generateJSvar_args1());
            js.append(generateJSvar_args2());
            js.append(generateJStype2());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype3());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJStype4());
            js.append(generateJStype5());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append("}");
        }
            js.append(generateJSgetItemAt());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}