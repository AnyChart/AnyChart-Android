package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class RangeColors extends JsObject {

    private String jsBase;

    public RangeColors() {

    }

    protected RangeColors(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double count;

    public void setCount(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;

            js.append(String.format(Locale.US, jsBase + ".count(%f);", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".count(%f);", count));
                js.setLength(0);
            }
        }
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

    private Double index1;
    private SolidFill color;

    public void setItemat(Double index1, SolidFill color) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
            this.color = color;
        } else {
            this.index1 = index1;
            this.color = color;

            js.append(String.format(Locale.US, jsBase + ".itemAt(%f, %s);", index1, (color != null) ? color.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".itemAt(%f, %s);", index1, (color != null) ? color.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private SolidFill[] items;
    private LinearGradientFill items1;
    private RadialGradientFill items2;
    private GradientKey[] items3;
    private String[] items4;
    private SolidFill items5;
    private String items6;
    private SolidFill var_args;
    private String var_args1;

    public void setItems(SolidFill[] items, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            
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


    public void setItems(SolidFill[] items, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items = items;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items = items;
            this.var_args1 = var_args1;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), var_args1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items), var_args1));
                js.setLength(0);
            }
        }
    }


    public void setItems(LinearGradientFill items1, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items1 = items1;
            this.var_args = var_args;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", (items1 != null) ? items1.generateJs() : "null", (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", (items1 != null) ? items1.generateJs() : "null", (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(LinearGradientFill items1, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items1 = items1;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items1 = items1;
            this.var_args1 = var_args1;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", (items1 != null) ? items1.generateJs() : "null", var_args1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", (items1 != null) ? items1.generateJs() : "null", var_args1));
                js.setLength(0);
            }
        }
    }


    public void setItems(RadialGradientFill items2, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items2 = items2;
            this.var_args = var_args;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", (items2 != null) ? items2.generateJs() : "null", (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", (items2 != null) ? items2.generateJs() : "null", (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(RadialGradientFill items2, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items2 = items2;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items2 = items2;
            this.var_args1 = var_args1;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", (items2 != null) ? items2.generateJs() : "null", var_args1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", (items2 != null) ? items2.generateJs() : "null", var_args1));
                js.setLength(0);
            }
        }
    }


    public void setItems(GradientKey[] items3, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items3 = items3;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items3 = items3;
            this.var_args = var_args;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items3), (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items3), (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(GradientKey[] items3, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items3 = items3;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items3 = items3;
            this.var_args1 = var_args1;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items3), var_args1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", arrayToString(items3), var_args1));
                js.setLength(0);
            }
        }
    }


    public void setItems(String[] items4, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items4 = items4;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items4 = items4;
            this.var_args = var_args;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", Arrays.toString(items4), (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", Arrays.toString(items4), (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(String[] items4, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items4 = items4;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items4 = items4;
            this.var_args1 = var_args1;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", Arrays.toString(items4), var_args1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", Arrays.toString(items4), var_args1));
                js.setLength(0);
            }
        }
    }


    public void setItems(SolidFill items5, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items5 = items5;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items5 = items5;
            this.var_args = var_args;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", (items5 != null) ? items5.generateJs() : "null", (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", (items5 != null) ? items5.generateJs() : "null", (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(SolidFill items5, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items5 = items5;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items5 = items5;
            this.var_args1 = var_args1;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", (items5 != null) ? items5.generateJs() : "null", var_args1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", (items5 != null) ? items5.generateJs() : "null", var_args1));
                js.setLength(0);
            }
        }
    }


    public void setItems(String items6, SolidFill var_args) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items6 = items6;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args = var_args;
        } else {
            this.items6 = items6;
            this.var_args = var_args;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", items6, (var_args != null) ? var_args.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", items6, (var_args != null) ? var_args.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setItems(String items6, String var_args1) {
        if (jsBase == null) {
            this.items = null;
            this.items1 = null;
            this.items2 = null;
            this.items3 = null;
            this.items4 = null;
            this.items5 = null;
            this.items6 = null;
            
            this.items6 = items6;
            this.var_args = null;
            this.var_args1 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.items6 = items6;
            this.var_args1 = var_args1;

            js.append(String.format(Locale.US, jsBase + ".items(%s, %s);", items6, var_args1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s, %s);", items6, var_args1));
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

    private String generateJScount() {
        if (count != null) {
            return String.format(Locale.US, "count: %f,", count);
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

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", (color != null) ? color.generateJs() : "null");
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
            return String.format(Locale.US, "items: %s,", (items1 != null) ? items1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSitems2() {
        if (items2 != null) {
            return String.format(Locale.US, "items: %s,", (items2 != null) ? items2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSitems3() {
        if (items3 != null) {
            return String.format(Locale.US, "items: %s,", arrayToString(items3));
        }
        return "";
    }

    private String generateJSitems4() {
        if (items4 != null) {
            return String.format(Locale.US, "items: %s,", Arrays.toString(items4));
        }
        return "";
    }

    private String generateJSitems5() {
        if (items5 != null) {
            return String.format(Locale.US, "items: %s,", (items5 != null) ? items5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSitems6() {
        if (items6 != null) {
            return String.format(Locale.US, "items: %s,", items6);
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
            return String.format(Locale.US, "var_args: %s,", var_args1);
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
            js.append(generateJScount());
            js.append(generateJSindex());
            js.append(generateJSindex1());
            js.append(generateJScolor());
            js.append(generateJSitems());
            js.append(generateJSitems1());
            js.append(generateJSitems2());
            js.append(generateJSitems3());
            js.append(generateJSitems4());
            js.append(generateJSitems5());
            js.append(generateJSitems6());
            js.append(generateJSvar_args());
            js.append(generateJSvar_args1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJStype2());
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