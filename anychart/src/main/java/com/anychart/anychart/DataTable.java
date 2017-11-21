package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Stock data table constructor.
 */
public class DataTable extends CoreBase {

    public DataTable() {
        js.setLength(0);
        js.append("var dataTable").append(++variableIndex).append(" = anychart.data.table();");
        jsBase = "dataTable" + variableIndex;
    }

    public DataTable(String x) {
        js.setLength(0);
        js.append("var dataTable").append(++variableIndex).append(" = anychart.data.table('").append(x).append("');");
        jsBase = "dataTable" + variableIndex;
    }

    protected DataTable(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }public DataTable addData(List<DataEntry> data) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(".addData([");
        for (DataEntry dataEntry : data) {
            js.append(dataEntry.generateJs()).append(",");
        }
        js.setLength(js.length() - 1);
        js.append("])");

        return this;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String[] rawData;
    private String rawData1;
    private Boolean removeFromStart;
    private Double removeFromStart1;
    private String csvSettings;
    private List<DataTable> setAddData = new ArrayList<>();

    /**
     * Adds data to the table. Replaces all rows with duplicating keys by the last seen row with that key.
     */
    public DataTable addData(String[] rawData, String csvSettings, Boolean removeFromStart) {
        if (jsBase == null) {
            this.rawData = null;
            this.rawData1 = null;
            
            this.rawData = rawData;
            this.csvSettings = csvSettings;
            this.removeFromStart = null;
            this.removeFromStart1 = null;
            
            this.removeFromStart = removeFromStart;
        } else {
            this.rawData = rawData;
            this.csvSettings = csvSettings;
            this.removeFromStart = removeFromStart;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".addData(%s, %s, %b)", arrayToStringWrapQuotes(rawData), wrapQuotes(csvSettings), removeFromStart));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %b)", arrayToStringWrapQuotes(rawData), wrapQuotes(csvSettings), removeFromStart));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAddData() {
        if (!setAddData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DataTable item : setAddData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DataTable> setAddData1 = new ArrayList<>();

    /**
     * Adds data to the table. Replaces all rows with duplicating keys by the last seen row with that key.
     */
    public DataTable addData(String[] rawData, String csvSettings, Double removeFromStart1) {
        if (jsBase == null) {
            this.rawData = null;
            this.rawData1 = null;
            
            this.rawData = rawData;
            this.csvSettings = csvSettings;
            this.removeFromStart = null;
            this.removeFromStart1 = null;
            
            this.removeFromStart1 = removeFromStart1;
        } else {
            this.rawData = rawData;
            this.csvSettings = csvSettings;
            this.removeFromStart1 = removeFromStart1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".addData(%s, %s, %f)", arrayToStringWrapQuotes(rawData), wrapQuotes(csvSettings), removeFromStart1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %f)", arrayToStringWrapQuotes(rawData), wrapQuotes(csvSettings), removeFromStart1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAddData1() {
        if (!setAddData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DataTable item : setAddData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DataTable> setAddData2 = new ArrayList<>();

    /**
     * Adds data to the table. Replaces all rows with duplicating keys by the last seen row with that key.
     */
    public DataTable addData(String rawData1, String csvSettings, Boolean removeFromStart) {
        if (jsBase == null) {
            this.rawData = null;
            this.rawData1 = null;
            
            this.rawData1 = rawData1;
            this.csvSettings = csvSettings;
            this.removeFromStart = null;
            this.removeFromStart1 = null;
            
            this.removeFromStart = removeFromStart;
        } else {
            this.rawData1 = rawData1;
            this.csvSettings = csvSettings;
            this.removeFromStart = removeFromStart;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".addData(%s, %s, %b)", wrapQuotes(rawData1), wrapQuotes(csvSettings), removeFromStart));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %b)", wrapQuotes(rawData1), wrapQuotes(csvSettings), removeFromStart));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAddData2() {
        if (!setAddData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DataTable item : setAddData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DataTable> setAddData3 = new ArrayList<>();

    /**
     * Adds data to the table. Replaces all rows with duplicating keys by the last seen row with that key.
     */
    public DataTable addData(String rawData1, String csvSettings, Double removeFromStart1) {
        if (jsBase == null) {
            this.rawData = null;
            this.rawData1 = null;
            
            this.rawData1 = rawData1;
            this.csvSettings = csvSettings;
            this.removeFromStart = null;
            this.removeFromStart1 = null;
            
            this.removeFromStart1 = removeFromStart1;
        } else {
            this.rawData1 = rawData1;
            this.csvSettings = csvSettings;
            this.removeFromStart1 = removeFromStart1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".addData(%s, %s, %f)", wrapQuotes(rawData1), wrapQuotes(csvSettings), removeFromStart1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %f)", wrapQuotes(rawData1), wrapQuotes(csvSettings), removeFromStart1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAddData3() {
        if (!setAddData3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DataTable item : setAddData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TableMapping mappingSettingsOrMapping;
    private String mappingSettingsOrMapping1;
    private List<TableComputer> setCreateComputer = new ArrayList<>();

    /**
     * Creates new computer with given input fields.
     */
    public TableComputer createComputer(TableMapping mappingSettingsOrMapping) {
        if (jsBase == null) {
            this.mappingSettingsOrMapping = null;
            this.mappingSettingsOrMapping1 = null;
            
            this.mappingSettingsOrMapping = mappingSettingsOrMapping;
        } else {
            this.mappingSettingsOrMapping = mappingSettingsOrMapping;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(mappingSettingsOrMapping.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".createComputer(%s);",  ((mappingSettingsOrMapping != null) ? mappingSettingsOrMapping.getJsBase() : "null")));
        }
        TableComputer item = new TableComputer("setCreateComputer" + variableIndex);
        setCreateComputer.add(item);
        return item;
    }
    private String generateJSsetCreateComputer() {
        if (!setCreateComputer.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableComputer item : setCreateComputer) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TableComputer> setCreateComputer1 = new ArrayList<>();

    /**
     * Creates new computer with given input fields.
     */
    public TableComputer createComputer(String mappingSettingsOrMapping1) {
        if (jsBase == null) {
            this.mappingSettingsOrMapping = null;
            this.mappingSettingsOrMapping1 = null;
            
            this.mappingSettingsOrMapping1 = mappingSettingsOrMapping1;
        } else {
            this.mappingSettingsOrMapping1 = mappingSettingsOrMapping1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setCreateComputer1" + ++variableIndex + " = " + jsBase + ".createComputer(%s);", wrapQuotes(mappingSettingsOrMapping1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".createComputer(%s)", wrapQuotes(mappingSettingsOrMapping1)));
                js.setLength(0);
            }
        }
        TableComputer item = new TableComputer("setCreateComputer1" + variableIndex);
        setCreateComputer1.add(item);
        return item;
    }
    private String generateJSsetCreateComputer1() {
        if (!setCreateComputer1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableComputer item : setCreateComputer1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fields;
    private List<TableMapping> setMapAs = new ArrayList<>();

    /**
     * Returns a new mapping for the table.
You can add fields to table mappings after the mapping is created using it's addField() method.
     */
    public TableMapping mapAs(String fields) {
        if (jsBase == null) {
            this.fields = fields;
        } else {
            this.fields = fields;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(String.format(Locale.US, "var setMapAs" + ++variableIndex + " = " + jsBase + ".mapAs(%s);", wrapQuotes(fields)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mapAs(%s)", wrapQuotes(fields)));
                js.setLength(0);
            }
        }
        return new TableMapping(js, "setMapAs" + variableIndex, false);
    }
    private String generateJSsetMapAs() {
        if (!setMapAs.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TableMapping item : setMapAs) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double startKey;
    private String startKey1;
    private Double endKey;
    private String endKey1;
    private List<DataTable> setRemove = new ArrayList<>();

    /**
     * Removes all items between start and end keys.
     */
    public DataTable remove(Double startKey, Double endKey) {
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
    private String generateJSsetRemove() {
        if (!setRemove.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DataTable item : setRemove) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DataTable> setRemove1 = new ArrayList<>();

    /**
     * Removes all items between start and end keys.
     */
    public DataTable remove(Double startKey, String endKey1) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".remove(%f, %s)", startKey, wrapQuotes(endKey1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%f, %s)", startKey, wrapQuotes(endKey1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRemove1() {
        if (!setRemove1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DataTable item : setRemove1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DataTable> setRemove2 = new ArrayList<>();

    /**
     * Removes all items between start and end keys.
     */
    public DataTable remove(String startKey1, Double endKey) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".remove(%s, %f)", wrapQuotes(startKey1), endKey));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%s, %f)", wrapQuotes(startKey1), endKey));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRemove2() {
        if (!setRemove2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DataTable item : setRemove2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<DataTable> setRemove3 = new ArrayList<>();

    /**
     * Removes all items between start and end keys.
     */
    public DataTable remove(String startKey1, String endKey1) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".remove(%s, %s)", wrapQuotes(startKey1), wrapQuotes(endKey1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%s, %s)", wrapQuotes(startKey1), wrapQuotes(endKey1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRemove3() {
        if (!setRemove3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DataTable item : setRemove3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double count;
    private List<DataTable> setRemoveFirst = new ArrayList<>();

    /**
     * Removes first opt_count rows from the storage also considering appended but not yet committed rows.
     */
    public DataTable removeFirst(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;
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
    private String generateJSsetRemoveFirst() {
        if (!setRemoveFirst.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (DataTable item : setRemoveFirst) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

        js.append(generateJsGetters());

        js.append(generateJSsetAddData());
        js.append(generateJSsetAddData1());
        js.append(generateJSsetAddData2());
        js.append(generateJSsetAddData3());
        js.append(generateJSsetCreateComputer());
        js.append(generateJSsetCreateComputer1());
        js.append(generateJSsetMapAs());
        js.append(generateJSsetRemove());
        js.append(generateJSsetRemove1());
        js.append(generateJSsetRemove2());
        js.append(generateJSsetRemove3());
        js.append(generateJSsetRemoveFirst());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}