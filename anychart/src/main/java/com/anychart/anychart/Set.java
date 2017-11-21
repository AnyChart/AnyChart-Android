package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Linear data storage.<br/>
Data is stored as an array or rows where each row contains several columns (see Listing 1 below).
To start working with this storage you need to map columns using
{@link anychart.data.Set#mapAs} method (you can create as many mappings as you like).<br/>
Each field can be a number, a string, a function, an array or an object.
Data fields can of any type and they way you read them depends on mapping only:
{@link anychart.data.Set#mapAs}. Sample mappings are shown in code samples 3, 4 and 5.<br/>
<b>Note:</b> To create an instance of this class use {@link anychart.data#set} method.
 */
public class Set extends CoreBase {

    public Set() {
        js.setLength(0);
        js.append("var set").append(++variableIndex).append(" = anychart.data.set();");
        jsBase = "set" + variableIndex;
    }

    protected Set(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Set(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }public Set(List<DataEntry> data) {
        js.setLength(0);
        js.append("var set").append(++variableIndex).append(" = anychart.data.set([");
        for (DataEntry dataEntry : data) {
            js.append(dataEntry.generateJs()).append(",");
        }
        js.setLength(js.length() - 1);
        js.append("]);");
        jsBase = "set" + variableIndex;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String[] data;
    private String data1;
    private TextParsingMode settings;
    private String settings1;
    private TextParsingSettings settings2;
    private List<Set> setData = new ArrayList<>();

    /**
     * Setter for Set data.
     */
    public Set setData(String[] data, TextParsingMode settings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings = settings;
        } else {
            this.data = data;
            this.settings = settings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data), ((settings != null) ? settings.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data), ((settings != null) ? settings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Set item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Set> setData1 = new ArrayList<>();

    /**
     * Setter for Set data.
     */
    public Set setData(String[] data, String settings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings1 = settings1;
        } else {
            this.data = data;
            this.settings1 = settings1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(settings1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data), wrapQuotes(settings1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Set item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Set> setData2 = new ArrayList<>();

    /**
     * Setter for Set data.
     */
    public Set setData(String[] data, TextParsingSettings settings2) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings2 = settings2;
        } else {
            this.data = data;
            this.settings2 = settings2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data), ((settings2 != null) ? settings2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data), ((settings2 != null) ? settings2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Set item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Set> setData3 = new ArrayList<>();

    /**
     * Setter for Set data.
     */
    public Set setData(String data1, TextParsingMode settings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data1 = data1;
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings = settings;
        } else {
            this.data1 = data1;
            this.settings = settings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data1), ((settings != null) ? settings.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data1), ((settings != null) ? settings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData3() {
        if (!setData3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Set item : setData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Set> setData4 = new ArrayList<>();

    /**
     * Setter for Set data.
     */
    public Set setData(String data1, String settings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data1 = data1;
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings1 = settings1;
        } else {
            this.data1 = data1;
            this.settings1 = settings1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data1), wrapQuotes(settings1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data1), wrapQuotes(settings1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData4() {
        if (!setData4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Set item : setData4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Set> setData5 = new ArrayList<>();

    /**
     * Setter for Set data.
     */
    public Set setData(String data1, TextParsingSettings settings2) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data1 = data1;
            this.settings = null;
            this.settings1 = null;
            this.settings2 = null;
            
            this.settings2 = settings2;
        } else {
            this.data1 = data1;
            this.settings2 = settings2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data1), ((settings2 != null) ? settings2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data1), ((settings2 != null) ? settings2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData5() {
        if (!setData5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Set item : setData5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index;
    private List<Set> setInsert = new ArrayList<>();

    /**
     * Inserts the row to the set at the specified position.
     */
    public Set insert(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".insert(%f)", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".insert(%f)", index));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetInsert() {
        if (!setInsert.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Set item : setInsert) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String mapping;
    private List<Mapping> setMapAs = new ArrayList<>();

    /**
     * Defines mapping for the chart data.<br/>
The mapping object selects and gives names fields from the data set.
Default mapping is shown in {@link anychart.data.Set} constructor samples.
     */
    public Mapping mapAs(String mapping) {
        if (jsBase == null) {
            this.mapping = mapping;
        } else {
            this.mapping = mapping;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(String.format(Locale.US, "var setMapAs" + ++variableIndex + " = " + jsBase + ".mapAs(%s);", wrapQuotes(mapping)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mapAs(%s)", wrapQuotes(mapping)));
                js.setLength(0);
            }
        }
        return new Mapping(js, "setMapAs" + variableIndex, false);
    }
    private String generateJSsetMapAs() {
        if (!setMapAs.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Mapping item : setMapAs) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private List<Set> setRemove = new ArrayList<>();

    /**
     * Removes the row by index.
     */
    public Set remove(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".remove(%f)", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".remove(%f)", index1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRemove() {
        if (!setRemove.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Set item : setRemove) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double rowIndex;

    /**
     * Sets the row in the set by the index.
     */
    public void setRow(Double rowIndex) {
        if (jsBase == null) {
            this.rowIndex = rowIndex;
        } else {
            this.rowIndex = rowIndex;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".row(%f);", rowIndex));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".row(%f)", rowIndex));
                js.setLength(0);
            }
        }
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

        js.append(generateJSsetData());
        js.append(generateJSsetData1());
        js.append(generateJSsetData2());
        js.append(generateJSsetData3());
        js.append(generateJSsetData4());
        js.append(generateJSsetData5());
        js.append(generateJSsetInsert());
        js.append(generateJSsetMapAs());
        js.append(generateJSsetRemove());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}