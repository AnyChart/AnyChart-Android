package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Set extends JsObject {

    
    private String[] data;
    private String data1;
    private TextParsingMode settings;
    private TextParsingSettings settings1;

    public void setData(String[] data, TextParsingMode settings) {
        this.data = null;
        this.data1 = null;
        
        this.data = data;
        this.settings = null;
        this.settings1 = null;
        
        this.settings = settings;
    }


    public void setData(String[] data, TextParsingSettings settings1) {
        this.data = null;
        this.data1 = null;
        
        this.data = data;
        this.settings = null;
        this.settings1 = null;
        
        this.settings1 = settings1;
    }


    public void setData(String data1, TextParsingMode settings) {
        this.data = null;
        this.data1 = null;
        
        this.data1 = data1;
        this.settings = null;
        this.settings1 = null;
        
        this.settings = settings;
    }


    public void setData(String data1, TextParsingSettings settings1) {
        this.data = null;
        this.data1 = null;
        
        this.data1 = data1;
        this.settings = null;
        this.settings1 = null;
        
        this.settings1 = settings1;
    }

    private Double index;

    public void setInsert(Double index) {
        this.index = index;
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

    private String arrayMapping;
    private String objectMapping;
    private String[] defaultProps;
    private String[] indexProps;

    public void setMapas(String arrayMapping, String objectMapping, String[] defaultProps, String[] indexProps) {
        this.arrayMapping = arrayMapping;
        this.objectMapping = objectMapping;
        this.defaultProps = defaultProps;
        this.indexProps = indexProps;
    }

    private Double index1;

    public void setRemove(Double index1) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private Double rowIndex;

    public void setRow(Double rowIndex) {
        this.rowIndex = rowIndex;
    }

    private Double rowIndex1;
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

    private String generateJSdata() {
        if (data != null) {
            return String.format(Locale.US, "data: %s,", Arrays.toString(data));
        }
        return "";
    }

    private String generateJSdata1() {
        if (data1 != null) {
            return String.format(Locale.US, "data: \"%s\",", data1);
        }
        return "";
    }

    private String generateJSsettings() {
        if (settings != null) {
            return String.format(Locale.US, "settings: %s,", (settings != null) ? settings.generateJs() : "null");
        }
        return "";
    }

    private String generateJSsettings1() {
        if (settings1 != null) {
            return String.format(Locale.US, "settings: %s,", (settings1 != null) ? settings1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
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

    private String generateJSarrayMapping() {
        if (arrayMapping != null) {
            return String.format(Locale.US, "arrayMapping: \"%s\",", arrayMapping);
        }
        return "";
    }

    private String generateJSobjectMapping() {
        if (objectMapping != null) {
            return String.format(Locale.US, "objectMapping: \"%s\",", objectMapping);
        }
        return "";
    }

    private String generateJSdefaultProps() {
        if (defaultProps != null) {
            return String.format(Locale.US, "defaultProps: %s,", Arrays.toString(defaultProps));
        }
        return "";
    }

    private String generateJSindexProps() {
        if (indexProps != null) {
            return String.format(Locale.US, "indexProps: %s,", Arrays.toString(indexProps));
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: \"%s\",", type2);
        }
        return "";
    }

    private String generateJSrowIndex() {
        if (rowIndex != null) {
            return String.format(Locale.US, "rowIndex: %f,", rowIndex);
        }
        return "";
    }

    private String generateJSrowIndex1() {
        if (rowIndex1 != null) {
            return String.format(Locale.US, "rowIndex: %f,", rowIndex1);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: \"%s\",", type3);
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
        js.append(generateJSdata());
        js.append(generateJSdata1());
        js.append(generateJSsettings());
        js.append(generateJSsettings1());
        js.append(generateJSindex());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSarrayMapping());
        js.append(generateJSobjectMapping());
        js.append(generateJSdefaultProps());
        js.append(generateJSindexProps());
        js.append(generateJSindex1());
        js.append(generateJStype2());
        js.append(generateJSrowIndex());
        js.append(generateJSrowIndex1());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}