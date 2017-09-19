package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class DataTable extends JsObject {

    
    private String[] rawData;
    private String rawData1;
    private Boolean removeFromStart;
    private Double removeFromStart1;

    public void setAdddata(String[] rawData, Boolean removeFromStart) {
        this.rawData = null;
        this.rawData1 = null;
        
        this.rawData = rawData;
        this.removeFromStart = null;
        this.removeFromStart1 = null;
        
        this.removeFromStart = removeFromStart;
    }


    public void setAdddata(String[] rawData, Double removeFromStart1) {
        this.rawData = null;
        this.rawData1 = null;
        
        this.rawData = rawData;
        this.removeFromStart = null;
        this.removeFromStart1 = null;
        
        this.removeFromStart1 = removeFromStart1;
    }


    public void setAdddata(String rawData1, Boolean removeFromStart) {
        this.rawData = null;
        this.rawData1 = null;
        
        this.rawData1 = rawData1;
        this.removeFromStart = null;
        this.removeFromStart1 = null;
        
        this.removeFromStart = removeFromStart;
    }


    public void setAdddata(String rawData1, Double removeFromStart1) {
        this.rawData = null;
        this.rawData1 = null;
        
        this.rawData1 = rawData1;
        this.removeFromStart = null;
        this.removeFromStart1 = null;
        
        this.removeFromStart1 = removeFromStart1;
    }

    private TableMapping mappingSettingsOrMapping;
    private String mappingSettingsOrMapping1;

    public void setCreatecomputer(TableMapping mappingSettingsOrMapping) {
        this.mappingSettingsOrMapping = null;
        this.mappingSettingsOrMapping1 = null;
        
        this.mappingSettingsOrMapping = mappingSettingsOrMapping;
    }


    public void setCreatecomputer(String mappingSettingsOrMapping1) {
        this.mappingSettingsOrMapping = null;
        this.mappingSettingsOrMapping1 = null;
        
        this.mappingSettingsOrMapping1 = mappingSettingsOrMapping1;
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

    private String fields;

    public void setMapas(String fields) {
        this.fields = fields;
    }

    private Double startKey;
    private String startKey1;
    private Double endKey;
    private String endKey1;

    public void setRemove(Double startKey, Double endKey) {
        this.startKey = null;
        this.startKey1 = null;
        
        this.startKey = startKey;
        this.endKey = null;
        this.endKey1 = null;
        
        this.endKey = endKey;
    }


    public void setRemove(Double startKey, String endKey1) {
        this.startKey = null;
        this.startKey1 = null;
        
        this.startKey = startKey;
        this.endKey = null;
        this.endKey1 = null;
        
        this.endKey1 = endKey1;
    }


    public void setRemove(String startKey1, Double endKey) {
        this.startKey = null;
        this.startKey1 = null;
        
        this.startKey1 = startKey1;
        this.endKey = null;
        this.endKey1 = null;
        
        this.endKey = endKey;
    }


    public void setRemove(String startKey1, String endKey1) {
        this.startKey = null;
        this.startKey1 = null;
        
        this.startKey1 = startKey1;
        this.endKey = null;
        this.endKey1 = null;
        
        this.endKey1 = endKey1;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private Double count;

    public void setRemovefirst(Double count) {
        this.count = count;
    }

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

    private String generateJSrawData() {
        if (rawData != null) {
            return String.format(Locale.US, "rawData: %s,", Arrays.toString(rawData));
        }
        return "";
    }

    private String generateJSrawData1() {
        if (rawData1 != null) {
            return String.format(Locale.US, "rawData: %s,", rawData1);
        }
        return "";
    }

    private String generateJSremoveFromStart() {
        if (removeFromStart != null) {
            return String.format(Locale.US, "removeFromStart: %b,", removeFromStart);
        }
        return "";
    }

    private String generateJSremoveFromStart1() {
        if (removeFromStart1 != null) {
            return String.format(Locale.US, "removeFromStart: %f,", removeFromStart1);
        }
        return "";
    }

    private String generateJSmappingSettingsOrMapping() {
        if (mappingSettingsOrMapping != null) {
            return String.format(Locale.US, "mappingSettingsOrMapping: %s,", (mappingSettingsOrMapping != null) ? mappingSettingsOrMapping.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmappingSettingsOrMapping1() {
        if (mappingSettingsOrMapping1 != null) {
            return String.format(Locale.US, "mappingSettingsOrMapping: %s,", mappingSettingsOrMapping1);
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

    private String generateJSfields() {
        if (fields != null) {
            return String.format(Locale.US, "fields: %s,", fields);
        }
        return "";
    }

    private String generateJSstartKey() {
        if (startKey != null) {
            return String.format(Locale.US, "startKey: %f,", startKey);
        }
        return "";
    }

    private String generateJSstartKey1() {
        if (startKey1 != null) {
            return String.format(Locale.US, "startKey: %s,", startKey1);
        }
        return "";
    }

    private String generateJSendKey() {
        if (endKey != null) {
            return String.format(Locale.US, "endKey: %f,", endKey);
        }
        return "";
    }

    private String generateJSendKey1() {
        if (endKey1 != null) {
            return String.format(Locale.US, "endKey: %s,", endKey1);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJScount() {
        if (count != null) {
            return String.format(Locale.US, "count: %f,", count);
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


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSrawData());
        js.append(generateJSrawData1());
        js.append(generateJSremoveFromStart());
        js.append(generateJSremoveFromStart1());
        js.append(generateJSmappingSettingsOrMapping());
        js.append(generateJSmappingSettingsOrMapping1());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSfields());
        js.append(generateJSstartKey());
        js.append(generateJSstartKey1());
        js.append(generateJSendKey());
        js.append(generateJSendKey1());
        js.append(generateJStype2());
        js.append(generateJScount());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}