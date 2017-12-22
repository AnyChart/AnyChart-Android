package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Base class for all base series.<br/>
Base class defines common methods, such as those for:
<ul>
  <li>Binding series to a scale: <i>xScale, yScale</i></li>
  <li>Base color settings: <i>color</i></li>
</ul>
You can also obtain <i>getIterator, getResetIterator</i> iterators here.
 */
public class SeriesBase extends VisualBaseWithBounds {

    public SeriesBase() {
        js.setLength(0);
        js.append("var seriesBase").append(++variableIndex).append(" = anychart.core.seriesBase();");
        jsBase = "seriesBase" + variableIndex;
    }

    protected SeriesBase(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected SeriesBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private SeriesA11y getA11y;

    /**
     * Getter for the accessibility setting.
     */
    public SeriesA11y getAy() {
        if (getA11y == null)
            getA11y = new SeriesA11y(jsBase + ".ay()");

        return getA11y;
    }

    private Boolean ay;
    private String ay1;
    private List<ScalesTimeline> setA11y = new ArrayList<>();

    /**
     * Setter for the accessibility setting.
     */
    public ScalesTimeline setA11y(Boolean ay) {
        if (jsBase == null) {
            this.ay = null;
            this.ay1 = null;
            
            this.ay = ay;
        } else {
            this.ay = ay;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setA11y" + ++variableIndex + " = " + jsBase + ".a11y(%b);", ay));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".a11y(%b);", ay));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setA11y" + variableIndex);
        setA11y.add(item);
        return item;
    }
    private String generateJSsetA11y() {
        if (!setA11y.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setA11y) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setA11y1 = new ArrayList<>();

    /**
     * Setter for the accessibility setting.
     */
    public ScalesTimeline setA11y(String ay1) {
        if (jsBase == null) {
            this.ay = null;
            this.ay1 = null;
            
            this.ay1 = ay1;
        } else {
            this.ay1 = ay1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setA11y1" + ++variableIndex + " = " + jsBase + ".a11y(%s);", wrapQuotes(ay1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".a11y(%s);", wrapQuotes(ay1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setA11y1" + variableIndex);
        setA11y1.add(item);
        return item;
    }
    private String generateJSsetA11y1() {
        if (!setA11y1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setA11y1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private List<ScalesTimeline> setColor = new ArrayList<>();

    /**
     * Setter for the series color.
     */
    public ScalesTimeline setColor(String color) {
        if (jsBase == null) {
            this.color = color;
        } else {
            this.color = color;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setColor" + ++variableIndex + " = " + jsBase + ".color(%s);", wrapQuotes(color)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".color(%s);", wrapQuotes(color)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setColor" + variableIndex);
        setColor.add(item);
        return item;
    }
    private String generateJSsetColor() {
        if (!setColor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setColor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private View getData;

    /**
     * Getter for series mapping.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }

    private View data;
    private Set data1;
    private String[] data2;
    private String data3;
    private TextParsingMode csvSettings;
    private String csvSettings1;
    private TextParsingSettings csvSettings2;
    private List<ScalesTimeline> setData = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public ScalesTimeline setData(View data, TextParsingMode csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data = data;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data = data;
            this.csvSettings = csvSettings;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data.generateJs());
            js.append(String.format(Locale.US, "var setData" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", ((data != null) ? data.getJsBase() : "null"), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", ((data != null) ? data.getJsBase() : "null"), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData" + variableIndex);
        setData.add(item);
        return item;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData1 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public ScalesTimeline setData(View data, String csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data = data;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data = data;
            this.csvSettings1 = csvSettings1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data.generateJs());
            js.append(String.format(Locale.US, "var setData1" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", ((data != null) ? data.getJsBase() : "null"), wrapQuotes(csvSettings1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", ((data != null) ? data.getJsBase() : "null"), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData1" + variableIndex);
        setData1.add(item);
        return item;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData2 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public ScalesTimeline setData(View data, TextParsingSettings csvSettings2) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data = data;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings2 = csvSettings2;
        } else {
            this.data = data;
            this.csvSettings2 = csvSettings2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data.generateJs());
            js.append(String.format(Locale.US, "var setData2" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", ((data != null) ? data.getJsBase() : "null"), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", ((data != null) ? data.getJsBase() : "null"), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData2" + variableIndex);
        setData2.add(item);
        return item;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData3 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public ScalesTimeline setData(Set data1, TextParsingMode csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data1 = data1;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data1 = data1;
            this.csvSettings = csvSettings;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data1.generateJs());
            js.append(String.format(Locale.US, "var setData3" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", ((data1 != null) ? data1.getJsBase() : "null"), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", ((data1 != null) ? data1.getJsBase() : "null"), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData3" + variableIndex);
        setData3.add(item);
        return item;
    }
    private String generateJSsetData3() {
        if (!setData3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData4 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public ScalesTimeline setData(Set data1, String csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data1 = data1;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data1 = data1;
            this.csvSettings1 = csvSettings1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data1.generateJs());
            js.append(String.format(Locale.US, "var setData4" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", ((data1 != null) ? data1.getJsBase() : "null"), wrapQuotes(csvSettings1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", ((data1 != null) ? data1.getJsBase() : "null"), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData4" + variableIndex);
        setData4.add(item);
        return item;
    }
    private String generateJSsetData4() {
        if (!setData4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData5 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public ScalesTimeline setData(Set data1, TextParsingSettings csvSettings2) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data1 = data1;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings2 = csvSettings2;
        } else {
            this.data1 = data1;
            this.csvSettings2 = csvSettings2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(data1.generateJs());
            js.append(String.format(Locale.US, "var setData5" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", ((data1 != null) ? data1.getJsBase() : "null"), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", ((data1 != null) ? data1.getJsBase() : "null"), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData5" + variableIndex);
        setData5.add(item);
        return item;
    }
    private String generateJSsetData5() {
        if (!setData5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData6 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public ScalesTimeline setData(String[] data2, TextParsingMode csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data2 = data2;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data2 = data2;
            this.csvSettings = csvSettings;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setData6" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", arrayToStringWrapQuotes(data2), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", arrayToStringWrapQuotes(data2), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData6" + variableIndex);
        setData6.add(item);
        return item;
    }
    private String generateJSsetData6() {
        if (!setData6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData7 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public ScalesTimeline setData(String[] data2, String csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data2 = data2;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data2 = data2;
            this.csvSettings1 = csvSettings1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setData7" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", arrayToStringWrapQuotes(data2), wrapQuotes(csvSettings1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", arrayToStringWrapQuotes(data2), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData7" + variableIndex);
        setData7.add(item);
        return item;
    }
    private String generateJSsetData7() {
        if (!setData7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData8 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public ScalesTimeline setData(String[] data2, TextParsingSettings csvSettings2) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data2 = data2;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings2 = csvSettings2;
        } else {
            this.data2 = data2;
            this.csvSettings2 = csvSettings2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setData8" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", arrayToStringWrapQuotes(data2), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", arrayToStringWrapQuotes(data2), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData8" + variableIndex);
        setData8.add(item);
        return item;
    }
    private String generateJSsetData8() {
        if (!setData8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData9 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public ScalesTimeline setData(String data3, TextParsingMode csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data3 = data3;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data3 = data3;
            this.csvSettings = csvSettings;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setData9" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", wrapQuotes(data3), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", wrapQuotes(data3), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData9" + variableIndex);
        setData9.add(item);
        return item;
    }
    private String generateJSsetData9() {
        if (!setData9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData10 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public ScalesTimeline setData(String data3, String csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data3 = data3;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data3 = data3;
            this.csvSettings1 = csvSettings1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setData10" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", wrapQuotes(data3), wrapQuotes(csvSettings1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", wrapQuotes(data3), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData10" + variableIndex);
        setData10.add(item);
        return item;
    }
    private String generateJSsetData10() {
        if (!setData10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setData11 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public ScalesTimeline setData(String data3, TextParsingSettings csvSettings2) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data3 = data3;
            this.csvSettings = null;
            this.csvSettings1 = null;
            this.csvSettings2 = null;
            
            this.csvSettings2 = csvSettings2;
        } else {
            this.data3 = data3;
            this.csvSettings2 = csvSettings2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setData11" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", wrapQuotes(data3), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", wrapQuotes(data3), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setData11" + variableIndex);
        setData11.add(item);
        return item;
    }
    private String generateJSsetData11() {
        if (!setData11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setData11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeriesPoint> getGetPoint = new ArrayList<>();

    /**
     * Gets wrapped point by index.
     */
    public SeriesPoint getGetPoint(Number index) {
        SeriesPoint item = new SeriesPoint(jsBase + ".getPoint(" + index + ")");
        getGetPoint.add(item);
        return item;
    }

    private Number index;
    private List<ScalesTimeline> setHover = new ArrayList<>();

    /**
     * Hovers point by index.
     */
    public ScalesTimeline hover(Number index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHover" + ++variableIndex + " = " + jsBase + ".hover(%f);", index));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hover(%f);", index));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setHover" + variableIndex);
        setHover.add(item);
        return item;
    }
    private String generateJSsetHover() {
        if (!setHover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setHover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number[] indexes;
    private List<ScalesTimeline> setHover1 = new ArrayList<>();

    /**
     * Hovers points by indexes.
     */
    public ScalesTimeline hover(Number[] indexes) {
        if (jsBase == null) {
            this.indexes = indexes;
        } else {
            this.indexes = indexes;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHover1" + ++variableIndex + " = " + jsBase + ".hover(%s);", Arrays.toString(indexes)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hover(%s);", Arrays.toString(indexes)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setHover1" + variableIndex);
        setHover1.add(item);
        return item;
    }
    private String generateJSsetHover1() {
        if (!setHover1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setHover1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StateSettings getHovered;

    /**
     * Getter for hovered state settings.
     */
    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }

    private String hovered;
    private List<ScalesTimeline> setHovered = new ArrayList<>();

    /**
     * Setter for hovered state settings.
     */
    public ScalesTimeline setHovered(String hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setHovered" + ++variableIndex + " = " + jsBase + ".hovered(%s);", wrapQuotes(hovered)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hovered(%s);", wrapQuotes(hovered)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setHovered" + variableIndex);
        setHovered.add(item);
        return item;
    }
    private String generateJSsetHovered() {
        if (!setHovered.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String id;
    private Number id1;
    private List<ScalesTimeline> setId = new ArrayList<>();

    /**
     * Setter for the series id.
     */
    public ScalesTimeline setId(String id) {
        if (jsBase == null) {
            this.id = null;
            this.id1 = null;
            
            this.id = id;
        } else {
            this.id = id;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setId" + ++variableIndex + " = " + jsBase + ".id(%s);", wrapQuotes(id)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".id(%s);", wrapQuotes(id)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setId" + variableIndex);
        setId.add(item);
        return item;
    }
    private String generateJSsetId() {
        if (!setId.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setId) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setId1 = new ArrayList<>();

    /**
     * Setter for the series id.
     */
    public ScalesTimeline setId(Number id1) {
        if (jsBase == null) {
            this.id = null;
            this.id1 = null;
            
            this.id1 = id1;
        } else {
            this.id1 = id1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setId1" + ++variableIndex + " = " + jsBase + ".id(%f);", id1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".id(%f);", id1));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setId1" + variableIndex);
        setId1.add(item);
        return item;
    }
    private String generateJSsetId1() {
        if (!setId1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setId1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiLabelsFactory getLabels;

    /**
     * Getter for the series data labels.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }

    private String labels;
    private Boolean labels1;
    private List<ScalesTimeline> setLabels = new ArrayList<>();

    /**
     * Setter for the series data labels.
     */
    public ScalesTimeline setLabels(String labels) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels = labels;
        } else {
            this.labels = labels;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLabels" + ++variableIndex + " = " + jsBase + ".labels(%s);", wrapQuotes(labels)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(labels)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setLabels" + variableIndex);
        setLabels.add(item);
        return item;
    }
    private String generateJSsetLabels() {
        if (!setLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setLabels1 = new ArrayList<>();

    /**
     * Setter for the series data labels.
     */
    public ScalesTimeline setLabels(Boolean labels1) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels1 = labels1;
        } else {
            this.labels1 = labels1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLabels1" + ++variableIndex + " = " + jsBase + ".labels(%b);", labels1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%b);", labels1));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setLabels1" + variableIndex);
        setLabels1.add(item);
        return item;
    }
    private String generateJSsetLabels1() {
        if (!setLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LegendItemSettings getLegendItem;

    /**
     * Getter for legend item settings for series.
     */
    public LegendItemSettings getLegendItem() {
        if (getLegendItem == null)
            getLegendItem = new LegendItemSettings(jsBase + ".legendItem()");

        return getLegendItem;
    }

    private String legendItem;
    private List<ScalesTimeline> setLegendItem = new ArrayList<>();

    /**
     * Setter for legend item settings for series.
     */
    public ScalesTimeline setLegendItem(String legendItem) {
        if (jsBase == null) {
            this.legendItem = legendItem;
        } else {
            this.legendItem = legendItem;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setLegendItem" + ++variableIndex + " = " + jsBase + ".legendItem(%s);", wrapQuotes(legendItem)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".legendItem(%s);", wrapQuotes(legendItem)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setLegendItem" + variableIndex);
        setLegendItem.add(item);
        return item;
    }
    private String generateJSsetLegendItem() {
        if (!setLegendItem.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setLegendItem) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiMarkersFactory getMarkers;

    /**
     * Getter for series data markers.
     */
    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }

    private String markers;
    private Boolean markers1;
    private String markers2;
    private List<ScalesTimeline> setMarkers = new ArrayList<>();

    /**
     * Setter for series data markers.
     */
    public ScalesTimeline setMarkers(String markers) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers = markers;
        } else {
            this.markers = markers;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMarkers" + ++variableIndex + " = " + jsBase + ".markers(%s);", wrapQuotes(markers)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".markers(%s);", wrapQuotes(markers)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setMarkers" + variableIndex);
        setMarkers.add(item);
        return item;
    }
    private String generateJSsetMarkers() {
        if (!setMarkers.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setMarkers) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setMarkers1 = new ArrayList<>();

    /**
     * Setter for series data markers.
     */
    public ScalesTimeline setMarkers(Boolean markers1) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers1 = markers1;
        } else {
            this.markers1 = markers1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMarkers1" + ++variableIndex + " = " + jsBase + ".markers(%b);", markers1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".markers(%b);", markers1));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setMarkers1" + variableIndex);
        setMarkers1.add(item);
        return item;
    }
    private String generateJSsetMarkers1() {
        if (!setMarkers1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setMarkers1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String name;
    private List<ScalesTimeline> setName = new ArrayList<>();

    /**
     * Setter for the series name.
     */
    public ScalesTimeline setName(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setName" + ++variableIndex + " = " + jsBase + ".name(%s);", wrapQuotes(name)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".name(%s);", wrapQuotes(name)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setName" + variableIndex);
        setName.add(item);
        return item;
    }
    private String generateJSsetName() {
        if (!setName.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setName) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StateSettings getNormal;

    /**
     * Getter for normal state settings.
     */
    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }

    private String normal;
    private List<ScalesTimeline> setNormal = new ArrayList<>();

    /**
     * Setter for normal state settings.
     */
    public ScalesTimeline setNormal(String normal) {
        if (jsBase == null) {
            this.normal = normal;
        } else {
            this.normal = normal;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setNormal" + ++variableIndex + " = " + jsBase + ".normal(%s);", wrapQuotes(normal)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".normal(%s);", wrapQuotes(normal)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setNormal" + variableIndex);
        setNormal.add(item);
        return item;
    }
    private String generateJSsetNormal() {
        if (!setNormal.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setNormal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number index1;
    private List<ScalesTimeline> setSelect = new ArrayList<>();

    /**
     * Selects point by index.
     */
    public ScalesTimeline select(Number index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSelect" + ++variableIndex + " = " + jsBase + ".select(%f);", index1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%f);", index1));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setSelect" + variableIndex);
        setSelect.add(item);
        return item;
    }
    private String generateJSsetSelect() {
        if (!setSelect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setSelect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number indexes1;
    private Number[] indexes2;
    private List<ScalesTimeline> setSelect1 = new ArrayList<>();

    /**
     * Selects point by indexes.
     */
    public ScalesTimeline select(Number[] indexes2) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            
            this.indexes2 = indexes2;
        } else {
            this.indexes2 = indexes2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSelect1" + ++variableIndex + " = " + jsBase + ".select(%s);", Arrays.toString(indexes2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s);", Arrays.toString(indexes2)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setSelect1" + variableIndex);
        setSelect1.add(item);
        return item;
    }
    private String generateJSsetSelect1() {
        if (!setSelect1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setSelect1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StateSettings getSelected;

    /**
     * Getter for selected state settings.
     */
    public StateSettings getSelected() {
        if (getSelected == null)
            getSelected = new StateSettings(jsBase + ".selected()");

        return getSelected;
    }

    private String selected;
    private List<ScalesTimeline> setSelected = new ArrayList<>();

    /**
     * Setter for selected state settings.
     */
    public ScalesTimeline setSelected(String selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSelected" + ++variableIndex + " = " + jsBase + ".selected(%s);", wrapQuotes(selected)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selected(%s);", wrapQuotes(selected)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setSelected" + variableIndex);
        setSelected.add(item);
        return item;
    }
    private String generateJSsetSelected() {
        if (!setSelected.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private SelectionMode selectionMode;
    private String selectionMode1;
    private List<ScalesTimeline> setSelectionMode = new ArrayList<>();

    /**
     * Allows to select points of the series.
To select multiple points, press "ctrl" and click on them.
     */
    public ScalesTimeline selectionMode(SelectionMode selectionMode) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode = selectionMode;
        } else {
            this.selectionMode = selectionMode;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSelectionMode" + ++variableIndex + " = " + jsBase + ".selectionMode(%s);", ((selectionMode != null) ? selectionMode.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectionMode(%s);", ((selectionMode != null) ? selectionMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setSelectionMode" + variableIndex);
        setSelectionMode.add(item);
        return item;
    }
    private String generateJSsetSelectionMode() {
        if (!setSelectionMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setSelectionMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setSelectionMode1 = new ArrayList<>();

    /**
     * Allows to select points of the series.
To select multiple points, press "ctrl" and click on them.
     */
    public ScalesTimeline selectionMode(String selectionMode1) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode1 = selectionMode1;
        } else {
            this.selectionMode1 = selectionMode1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSelectionMode1" + ++variableIndex + " = " + jsBase + ".selectionMode(%s);", wrapQuotes(selectionMode1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectionMode(%s);", wrapQuotes(selectionMode1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setSelectionMode1" + variableIndex);
        setSelectionMode1.add(item);
        return item;
    }
    private String generateJSsetSelectionMode1() {
        if (!setSelectionMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setSelectionMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Tooltip getTooltip;

    /**
     * Getter for the series data tooltip.
     */
    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;
    private List<ScalesTimeline> setTooltip = new ArrayList<>();

    /**
     * Setter for the series data tooltip.
     */
    public ScalesTimeline setTooltip(String tooltip) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip = tooltip;
        } else {
            this.tooltip = tooltip;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setTooltip" + ++variableIndex + " = " + jsBase + ".tooltip(%s);", wrapQuotes(tooltip)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%s);", wrapQuotes(tooltip)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setTooltip" + variableIndex);
        setTooltip.add(item);
        return item;
    }
    private String generateJSsetTooltip() {
        if (!setTooltip.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setTooltip) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setTooltip1 = new ArrayList<>();

    /**
     * Setter for the series data tooltip.
     */
    public ScalesTimeline setTooltip(Boolean tooltip1) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip1 = tooltip1;
        } else {
            this.tooltip1 = tooltip1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setTooltip1" + ++variableIndex + " = " + jsBase + ".tooltip(%b);", tooltip1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%b);", tooltip1));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setTooltip1" + variableIndex);
        setTooltip1.add(item);
        return item;
    }
    private String generateJSsetTooltip1() {
        if (!setTooltip1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setTooltip1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number indexOrIndexes;
    private Number[] indexOrIndexes1;
    private List<ScalesTimeline> setUnhover = new ArrayList<>();

    /**
     * Removes hover from the series.
     */
    public ScalesTimeline unhover(Number indexOrIndexes) {
        if (jsBase == null) {
            this.indexOrIndexes = null;
            this.indexOrIndexes1 = null;
            
            this.indexOrIndexes = indexOrIndexes;
        } else {
            this.indexOrIndexes = indexOrIndexes;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setUnhover" + ++variableIndex + " = " + jsBase + ".unhover(%f);", indexOrIndexes));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unhover(%f);", indexOrIndexes));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setUnhover" + variableIndex);
        setUnhover.add(item);
        return item;
    }
    private String generateJSsetUnhover() {
        if (!setUnhover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setUnhover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ScalesTimeline> setUnhover1 = new ArrayList<>();

    /**
     * Removes hover from the series.
     */
    public ScalesTimeline unhover(Number[] indexOrIndexes1) {
        if (jsBase == null) {
            this.indexOrIndexes = null;
            this.indexOrIndexes1 = null;
            
            this.indexOrIndexes1 = indexOrIndexes1;
        } else {
            this.indexOrIndexes1 = indexOrIndexes1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setUnhover1" + ++variableIndex + " = " + jsBase + ".unhover(%s);", Arrays.toString(indexOrIndexes1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unhover(%s);", Arrays.toString(indexOrIndexes1)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setUnhover1" + variableIndex);
        setUnhover1.add(item);
        return item;
    }
    private String generateJSsetUnhover1() {
        if (!setUnhover1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setUnhover1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number index2;
    private List<ScalesTimeline> setUnselect = new ArrayList<>();

    /**
     * Deselects selected point by index.
     */
    public ScalesTimeline unselect(Number index2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.index2 = index2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setUnselect" + ++variableIndex + " = " + jsBase + ".unselect(%f);", index2));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%f);", index2));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setUnselect" + variableIndex);
        setUnselect.add(item);
        return item;
    }
    private String generateJSsetUnselect() {
        if (!setUnselect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setUnselect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number[] indexes3;
    private List<ScalesTimeline> setUnselect1 = new ArrayList<>();

    /**
     * Deselects selected points by indexes.
     */
    public ScalesTimeline unselect(Number[] indexes3) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes3 = indexes3;
        } else {
            this.indexes3 = indexes3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setUnselect1" + ++variableIndex + " = " + jsBase + ".unselect(%s);", Arrays.toString(indexes3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%s);", Arrays.toString(indexes3)));
                js.setLength(0);
            }
        }
        ScalesTimeline item = new ScalesTimeline("setUnselect1" + variableIndex);
        setUnselect1.add(item);
        return item;
    }
    private String generateJSsetUnselect1() {
        if (!setUnselect1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ScalesTimeline item : setUnselect1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetA11y() {
        if (getA11y != null) {
            return getA11y.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetGetPoint() {
        if (!getGetPoint.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeriesPoint item : getGetPoint) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetHovered() {
        if (getHovered != null) {
            return getHovered.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLegendItem() {
        if (getLegendItem != null) {
            return getLegendItem.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }

    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetA11y());
        jsGetters.append(generateJSgetData());
        jsGetters.append(generateJSgetGetPoint());
        jsGetters.append(generateJSgetHovered());
        jsGetters.append(generateJSgetLabels());
        jsGetters.append(generateJSgetLegendItem());
        jsGetters.append(generateJSgetMarkers());
        jsGetters.append(generateJSgetNormal());
        jsGetters.append(generateJSgetSelected());
        jsGetters.append(generateJSgetTooltip());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetA11y());
        js.append(generateJSsetA11y1());
        js.append(generateJSsetColor());
        js.append(generateJSsetData());
        js.append(generateJSsetData1());
        js.append(generateJSsetData2());
        js.append(generateJSsetData3());
        js.append(generateJSsetData4());
        js.append(generateJSsetData5());
        js.append(generateJSsetData6());
        js.append(generateJSsetData7());
        js.append(generateJSsetData8());
        js.append(generateJSsetData9());
        js.append(generateJSsetData10());
        js.append(generateJSsetData11());
        js.append(generateJSsetHover());
        js.append(generateJSsetHover1());
        js.append(generateJSsetHovered());
        js.append(generateJSsetId());
        js.append(generateJSsetId1());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetLegendItem());
        js.append(generateJSsetMarkers());
        js.append(generateJSsetMarkers1());
        js.append(generateJSsetName());
        js.append(generateJSsetNormal());
        js.append(generateJSsetSelect());
        js.append(generateJSsetSelect1());
        js.append(generateJSsetSelected());
        js.append(generateJSsetSelectionMode());
        js.append(generateJSsetSelectionMode1());
        js.append(generateJSsetTooltip());
        js.append(generateJSsetTooltip1());
        js.append(generateJSsetUnhover());
        js.append(generateJSsetUnhover1());
        js.append(generateJSsetUnselect());
        js.append(generateJSsetUnselect1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}