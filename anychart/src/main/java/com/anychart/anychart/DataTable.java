package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class DataTable extends JsObject {

    private String jsBase;

    public DataTable() {

    }

    protected DataTable(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String[] rawData;
    private String rawData1;
    private Boolean removeFromStart;
    private Double removeFromStart1;
    private String csvSettings;

    public void setAdddata(String[] rawData, Boolean removeFromStart, String csvSettings) {
        if (jsBase == null) {
            this.rawData = null;
            this.rawData1 = null;
            
            this.rawData = rawData;
            this.removeFromStart = null;
            this.removeFromStart1 = null;
            
            this.removeFromStart = removeFromStart;
            this.csvSettings = csvSettings;
        } else {
            this.rawData = rawData;
            this.removeFromStart = removeFromStart;
            this.csvSettings = csvSettings;

            js.append(String.format(Locale.US, jsBase + ".addData(%s, %b, %s);", Arrays.toString(rawData), removeFromStart, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %b, %s);", Arrays.toString(rawData), removeFromStart, csvSettings));
                js.setLength(0);
            }
        }
    }


    public void setAdddata(String[] rawData, Double removeFromStart1, String csvSettings) {
        if (jsBase == null) {
            this.rawData = null;
            this.rawData1 = null;
            
            this.rawData = rawData;
            this.removeFromStart = null;
            this.removeFromStart1 = null;
            
            this.removeFromStart1 = removeFromStart1;
            this.csvSettings = csvSettings;
        } else {
            this.rawData = rawData;
            this.removeFromStart1 = removeFromStart1;
            this.csvSettings = csvSettings;

            js.append(String.format(Locale.US, jsBase + ".addData(%s, %f, %s);", Arrays.toString(rawData), removeFromStart1, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %f, %s);", Arrays.toString(rawData), removeFromStart1, csvSettings));
                js.setLength(0);
            }
        }
    }


    public void setAdddata(String rawData1, Boolean removeFromStart, String csvSettings) {
        if (jsBase == null) {
            this.rawData = null;
            this.rawData1 = null;
            
            this.rawData1 = rawData1;
            this.removeFromStart = null;
            this.removeFromStart1 = null;
            
            this.removeFromStart = removeFromStart;
            this.csvSettings = csvSettings;
        } else {
            this.rawData1 = rawData1;
            this.removeFromStart = removeFromStart;
            this.csvSettings = csvSettings;

            js.append(String.format(Locale.US, jsBase + ".addData(%s, %b, %s);", rawData1, removeFromStart, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %b, %s);", rawData1, removeFromStart, csvSettings));
                js.setLength(0);
            }
        }
    }


    public void setAdddata(String rawData1, Double removeFromStart1, String csvSettings) {
        if (jsBase == null) {
            this.rawData = null;
            this.rawData1 = null;
            
            this.rawData1 = rawData1;
            this.removeFromStart = null;
            this.removeFromStart1 = null;
            
            this.removeFromStart1 = removeFromStart1;
            this.csvSettings = csvSettings;
        } else {
            this.rawData1 = rawData1;
            this.removeFromStart1 = removeFromStart1;
            this.csvSettings = csvSettings;

            js.append(String.format(Locale.US, jsBase + ".addData(%s, %f, %s);", rawData1, removeFromStart1, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %f, %s);", rawData1, removeFromStart1, csvSettings));
                js.setLength(0);
            }
        }
    }

    private TableMapping mappingSettingsOrMapping;
    private String mappingSettingsOrMapping1;

    public void setCreatecomputer(TableMapping mappingSettingsOrMapping) {
        if (jsBase == null) {
            this.mappingSettingsOrMapping = null;
            this.mappingSettingsOrMapping1 = null;
            
            this.mappingSettingsOrMapping = mappingSettingsOrMapping;
        } else {
            this.mappingSettingsOrMapping = mappingSettingsOrMapping;

            js.append(String.format(Locale.US, jsBase + ".createComputer(%s);", (mappingSettingsOrMapping != null) ? mappingSettingsOrMapping.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".createComputer(%s);", (mappingSettingsOrMapping != null) ? mappingSettingsOrMapping.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setCreatecomputer(String mappingSettingsOrMapping1) {
        if (jsBase == null) {
            this.mappingSettingsOrMapping = null;
            this.mappingSettingsOrMapping1 = null;
            
            this.mappingSettingsOrMapping1 = mappingSettingsOrMapping1;
        } else {
            this.mappingSettingsOrMapping1 = mappingSettingsOrMapping1;

            js.append(String.format(Locale.US, jsBase + ".createComputer(%s);", mappingSettingsOrMapping1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".createComputer(%s);", mappingSettingsOrMapping1));
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

    private String fields;

    public void setMapas(String fields) {
        if (jsBase == null) {
            this.fields = fields;
        } else {
            this.fields = fields;

            js.append(String.format(Locale.US, jsBase + ".mapAs(%s);", fields));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mapAs(%s);", fields));
                js.setLength(0);
            }
        }
    }

    private Double startKey;
    private String startKey1;
    private Double endKey;
    private String endKey1;

    public void setRemove(Double startKey, Double endKey) {
        if (jsBase == null) {
            this.startKey = null;
            this.startKey1 = null;
            
            this.startKey = startKey;
            this.endKey = null;
            this.endKey1 = null;
            
            this.endKey = endKey;
        } else {
            this.startKey = startKey;
            this.endKey = endKey;

            js.append(String.format(Locale.US, jsBase + ".remove(%f, %f);", startKey, endKey));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".remove(%f, %f);", startKey, endKey));
                js.setLength(0);
            }
        }
    }


    public void setRemove(Double startKey, String endKey1) {
        if (jsBase == null) {
            this.startKey = null;
            this.startKey1 = null;
            
            this.startKey = startKey;
            this.endKey = null;
            this.endKey1 = null;
            
            this.endKey1 = endKey1;
        } else {
            this.startKey = startKey;
            this.endKey1 = endKey1;

            js.append(String.format(Locale.US, jsBase + ".remove(%f, %s);", startKey, endKey1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".remove(%f, %s);", startKey, endKey1));
                js.setLength(0);
            }
        }
    }


    public void setRemove(String startKey1, Double endKey) {
        if (jsBase == null) {
            this.startKey = null;
            this.startKey1 = null;
            
            this.startKey1 = startKey1;
            this.endKey = null;
            this.endKey1 = null;
            
            this.endKey = endKey;
        } else {
            this.startKey1 = startKey1;
            this.endKey = endKey;

            js.append(String.format(Locale.US, jsBase + ".remove(%s, %f);", startKey1, endKey));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".remove(%s, %f);", startKey1, endKey));
                js.setLength(0);
            }
        }
    }


    public void setRemove(String startKey1, String endKey1) {
        if (jsBase == null) {
            this.startKey = null;
            this.startKey1 = null;
            
            this.startKey1 = startKey1;
            this.endKey = null;
            this.endKey1 = null;
            
            this.endKey1 = endKey1;
        } else {
            this.startKey1 = startKey1;
            this.endKey1 = endKey1;

            js.append(String.format(Locale.US, jsBase + ".remove(%s, %s);", startKey1, endKey1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".remove(%s, %s);", startKey1, endKey1));
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

    private Double count;

    public void setRemovefirst(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;

            js.append(String.format(Locale.US, jsBase + ".removeFirst(%f);", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeFirst(%f);", count));
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

    private String generateJScsvSettings() {
        if (csvSettings != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings);
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
            js.append(generateJSrawData());
            js.append(generateJSrawData1());
            js.append(generateJSremoveFromStart());
            js.append(generateJSremoveFromStart1());
            js.append(generateJScsvSettings());
            js.append(generateJSmappingSettingsOrMapping());
            js.append(generateJSmappingSettingsOrMapping1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSfields());
            js.append(generateJSstartKey());
            js.append(generateJSstartKey1());
            js.append(generateJSendKey());
            js.append(generateJSendKey1());
            js.append(generateJStype2());
            js.append(generateJScount());
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