package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class DataTable extends CoreBase {

    public DataTable() {

    }

    protected DataTable(String jsBase) {
        this.jsBase = jsBase;
    }

    protected DataTable(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String[] rawData;
    private String rawData1;
    private Boolean removeFromStart;
    private Double removeFromStart1;
    private String csvSettings;

    public DataTable setAddData(String[] rawData, Boolean removeFromStart, String csvSettings) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addData(%s, %b, %s)", Arrays.toString(rawData), removeFromStart, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %b, %s)", Arrays.toString(rawData), removeFromStart, csvSettings));
                js.setLength(0);
            }
        }
        return this;
    }


    public DataTable setAddData(String[] rawData, Double removeFromStart1, String csvSettings) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addData(%s, %f, %s)", Arrays.toString(rawData), removeFromStart1, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %f, %s)", Arrays.toString(rawData), removeFromStart1, csvSettings));
                js.setLength(0);
            }
        }
        return this;
    }


    public DataTable setAddData(String rawData1, Boolean removeFromStart, String csvSettings) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addData(%s, %b, %s)", rawData1, removeFromStart, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %b, %s)", rawData1, removeFromStart, csvSettings));
                js.setLength(0);
            }
        }
        return this;
    }


    public DataTable setAddData(String rawData1, Double removeFromStart1, String csvSettings) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addData(%s, %f, %s)", rawData1, removeFromStart1, csvSettings));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %f, %s)", rawData1, removeFromStart1, csvSettings));
                js.setLength(0);
            }
        }
        return this;
    }

    private TableMapping mappingSettingsOrMapping;
    private String mappingSettingsOrMapping1;

    public TableComputer setCreateComputer(TableMapping mappingSettingsOrMapping) {
        if (jsBase == null) {
            this.mappingSettingsOrMapping = null;
            this.mappingSettingsOrMapping1 = null;
            
            this.mappingSettingsOrMapping = mappingSettingsOrMapping;
        } else {
            this.mappingSettingsOrMapping = mappingSettingsOrMapping;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".createComputer(%s);", (mappingSettingsOrMapping != null) ? mappingSettingsOrMapping.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".createComputer(%s)", (mappingSettingsOrMapping != null) ? mappingSettingsOrMapping.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return new TableComputer(jsBase);
    }


    public TableComputer setCreateComputer(String mappingSettingsOrMapping1) {
        if (jsBase == null) {
            this.mappingSettingsOrMapping = null;
            this.mappingSettingsOrMapping1 = null;
            
            this.mappingSettingsOrMapping1 = mappingSettingsOrMapping1;
        } else {
            this.mappingSettingsOrMapping1 = mappingSettingsOrMapping1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".createComputer(%s);", mappingSettingsOrMapping1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".createComputer(%s)", mappingSettingsOrMapping1));
                js.setLength(0);
            }
        }
        return new TableComputer(jsBase);
    }

    private String fields;

    public TableMapping setMapAs(String fields) {
        if (jsBase == null) {
            this.fields = fields;
        } else {
            this.fields = fields;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".mapAs(%s);", fields));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mapAs(%s)", fields));
                js.setLength(0);
            }
        }
        return new TableMapping(jsBase);
    }

    private Double startKey;
    private String startKey1;
    private Double endKey;
    private String endKey1;

    public DataTable setRemove(Double startKey, Double endKey) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".remove(%f, %f)", startKey, endKey));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%f, %f)", startKey, endKey));
                js.setLength(0);
            }
        }
        return this;
    }


    public DataTable setRemove(Double startKey, String endKey1) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".remove(%f, %s)", startKey, endKey1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%f, %s)", startKey, endKey1));
                js.setLength(0);
            }
        }
        return this;
    }


    public DataTable setRemove(String startKey1, Double endKey) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".remove(%s, %f)", startKey1, endKey));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%s, %f)", startKey1, endKey));
                js.setLength(0);
            }
        }
        return this;
    }


    public DataTable setRemove(String startKey1, String endKey1) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".remove(%s, %s)", startKey1, endKey1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%s, %s)", startKey1, endKey1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double count;

    public DataTable setRemoveFirst(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".removeFirst(%f)", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeFirst(%f)", count));
                js.setLength(0);
            }
        }
        return this;
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

    private String generateJScount() {
        if (count != null) {
            return String.format(Locale.US, "count: %f,", count);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSrawData());
            js.append(generateJSrawData1());
            js.append(generateJSremoveFromStart());
            js.append(generateJSremoveFromStart1());
            js.append(generateJScsvSettings());
            js.append(generateJSmappingSettingsOrMapping());
            js.append(generateJSmappingSettingsOrMapping1());
            js.append(generateJSfields());
            js.append(generateJSstartKey());
            js.append(generateJSstartKey1());
            js.append(generateJSendKey());
            js.append(generateJSendKey1());
            js.append(generateJScount());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}