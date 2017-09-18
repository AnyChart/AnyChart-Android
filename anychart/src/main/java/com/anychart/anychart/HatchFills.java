package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class HatchFills extends JsObject {

    
    private Double index;

    public void setItemat(Double index) {
        this.index = index;
    }

    private Double index1;
    private HatchFillType type;
    private String type1;
    private String color;
    private Double thickness;
    private Double size;

    public void setItemat(HatchFillType type, Double index1, String color, Double thickness, Double size) {
        this.type = null;
        this.type1 = null;
        
        this.type = type;
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
        this.color = color;
        this.thickness = thickness;
        this.size = size;
    }


    public void setItemat(String type1, Double index1, String color, Double thickness, Double size) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
        this.color = color;
        this.thickness = thickness;
        this.size = size;
    }

    private Double index2;
    private PatternFill patternFill;

    public void setItemat(Double index2, PatternFill patternFill) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        
        this.index2 = index2;
        this.patternFill = patternFill;
    }

    private Double index3;
    private HatchFill instance;

    public void setItemat(Double index3, HatchFill instance) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        
        this.index3 = index3;
        this.instance = instance;
    }

    private Double index4;
    private Boolean state;

    public void setItemat(Double index4, Boolean state) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        this.index3 = null;
        this.index4 = null;
        
        this.index4 = index4;
        this.state = state;
    }

    private HatchFill[] items;
    private HatchFillType[] items1;
    private PatternFill[] items2;
    private HatchFill var_args;
    private HatchFillType var_args1;
    private PatternFill var_args2;

    public void setItems(HatchFill[] items, HatchFill var_args) {
        this.items = null;
        this.items1 = null;
        this.items2 = null;
        
        this.items = items;
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        
        this.var_args = var_args;
    }


    public void setItems(HatchFill[] items, HatchFillType var_args1) {
        this.items = null;
        this.items1 = null;
        this.items2 = null;
        
        this.items = items;
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        
        this.var_args1 = var_args1;
    }


    public void setItems(HatchFill[] items, PatternFill var_args2) {
        this.items = null;
        this.items1 = null;
        this.items2 = null;
        
        this.items = items;
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        
        this.var_args2 = var_args2;
    }


    public void setItems(HatchFillType[] items1, HatchFill var_args) {
        this.items = null;
        this.items1 = null;
        this.items2 = null;
        
        this.items1 = items1;
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        
        this.var_args = var_args;
    }


    public void setItems(HatchFillType[] items1, HatchFillType var_args1) {
        this.items = null;
        this.items1 = null;
        this.items2 = null;
        
        this.items1 = items1;
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        
        this.var_args1 = var_args1;
    }


    public void setItems(HatchFillType[] items1, PatternFill var_args2) {
        this.items = null;
        this.items1 = null;
        this.items2 = null;
        
        this.items1 = items1;
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        
        this.var_args2 = var_args2;
    }


    public void setItems(PatternFill[] items2, HatchFill var_args) {
        this.items = null;
        this.items1 = null;
        this.items2 = null;
        
        this.items2 = items2;
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        
        this.var_args = var_args;
    }


    public void setItems(PatternFill[] items2, HatchFillType var_args1) {
        this.items = null;
        this.items1 = null;
        this.items2 = null;
        
        this.items2 = items2;
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        
        this.var_args1 = var_args1;
    }


    public void setItems(PatternFill[] items2, PatternFill var_args2) {
        this.items = null;
        this.items1 = null;
        this.items2 = null;
        
        this.items2 = items2;
        this.var_args = null;
        this.var_args1 = null;
        this.var_args2 = null;
        
        this.var_args2 = var_args2;
    }

    private String type2;
    private Boolean useCapture;

    public void setListen(String type2, Boolean useCapture) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
        this.useCapture = useCapture;
    }

    private String type3;
    private Boolean useCapture1;

    public void setListenonce(String type3, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private String type4;

    public void setRemovealllisteners(String type4) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        this.type4 = null;
        
        this.type4 = type4;
    }

    private String type5;
    private Boolean useCapture2;

    public void setUnlisten(String type5, Boolean useCapture2) {
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


    @Override
    protected String generateJs() {
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
        js.append(generateJStype3());
        js.append(generateJSuseCapture1());
        js.append(generateJStype4());
        js.append(generateJStype5());
        js.append(generateJSuseCapture2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}