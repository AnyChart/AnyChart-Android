package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class TableMapping extends JsObject {

    
    private String name;
    private Double column;
    private AggregationType type;
    private Double weightsColumn;

    public void setAddfield(String name, Double column, AggregationType type, Double weightsColumn) {
        this.name = name;
        this.column = column;
        this.type = type;
        this.weightsColumn = weightsColumn;
    }

    private String type1;
    private Boolean useCapture;

    public void setListen(String type1, Boolean useCapture) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = useCapture;
    }

    private String type2;
    private Boolean useCapture1;

    public void setListenonce(String type2, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private String type3;

    public void setRemovealllisteners(String type3) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
    }

    private String type4;
    private Boolean useCapture2;

    public void setUnlisten(String type4, Boolean useCapture2) {
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


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSname());
        js.append(generateJScolumn());
        js.append(generateJStype());
        js.append(generateJSweightsColumn());
        js.append(generateJStype1());
        js.append(generateJSuseCapture());
        js.append(generateJStype2());
        js.append(generateJSuseCapture1());
        js.append(generateJStype3());
        js.append(generateJStype4());
        js.append(generateJSuseCapture2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}