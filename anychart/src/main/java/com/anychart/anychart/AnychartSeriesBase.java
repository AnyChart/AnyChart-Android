package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

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
public class AnychartSeriesBase extends VisualBaseWithBounds {

    public AnychartSeriesBase() {
        js.setLength(0);
        js.append("var anychartSeriesBase").append(++variableIndex).append(" = anychart.core.seriesBase();");
        jsBase = "anychartSeriesBase" + variableIndex;
    }

    protected AnychartSeriesBase(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected AnychartSeriesBase(StringBuilder js, String jsBase, boolean isChain) {
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
    private List<AnychartSeriesBase> setA11y = new ArrayList<>();

    /**
     * Setter for the accessibility setting.
     */
    public AnychartSeriesBase setA11y(Boolean ay) {
        if (jsBase == null) {
            this.ay = null;
            this.ay1 = null;
            
            this.ay = ay;
        } else {
            this.ay = ay;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".a11y(%b)", ay));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".a11y(%b)", ay));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetA11y() {
        if (!setA11y.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setA11y) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setA11y1 = new ArrayList<>();

    /**
     * Setter for the accessibility setting.
     */
    public AnychartSeriesBase setA11y(String ay1) {
        if (jsBase == null) {
            this.ay = null;
            this.ay1 = null;
            
            this.ay1 = ay1;
        } else {
            this.ay1 = ay1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".a11y(%s)", wrapQuotes(ay1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".a11y(%s)", wrapQuotes(ay1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetA11y1() {
        if (!setA11y1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setA11y1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private List<AnychartSeriesBase> setColor = new ArrayList<>();

    /**
     * Setter for the series color.
     */
    public AnychartSeriesBase setColor(String color) {
        if (jsBase == null) {
            this.color = color;
        } else {
            this.color = color;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".color(%s)", wrapQuotes(color)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".color(%s)", wrapQuotes(color)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetColor() {
        if (!setColor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setColor) {
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
    private List<AnychartSeriesBase> setData = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public AnychartSeriesBase setData(View data, TextParsingMode csvSettings) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(data.generateJs());
            js.append(String.format(Locale.US, ".data(%s, %s)", ((data != null) ? data.getJsBase() : "null"), ((csvSettings != null) ? csvSettings.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", ((data != null) ? data.getJsBase() : "null"), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setData1 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public AnychartSeriesBase setData(View data, String csvSettings1) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(data.generateJs());
            js.append(String.format(Locale.US, ".data(%s, %s)", ((data != null) ? data.getJsBase() : "null"), wrapQuotes(csvSettings1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", ((data != null) ? data.getJsBase() : "null"), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setData2 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public AnychartSeriesBase setData(View data, TextParsingSettings csvSettings2) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(data.generateJs());
            js.append(String.format(Locale.US, ".data(%s, %s)", ((data != null) ? data.getJsBase() : "null"), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", ((data != null) ? data.getJsBase() : "null"), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setData3 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public AnychartSeriesBase setData(Set data1, TextParsingMode csvSettings) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(data1.generateJs());
            js.append(String.format(Locale.US, ".data(%s, %s)", ((data1 != null) ? data1.getJsBase() : "null"), ((csvSettings != null) ? csvSettings.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", ((data1 != null) ? data1.getJsBase() : "null"), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData3() {
        if (!setData3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setData4 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public AnychartSeriesBase setData(Set data1, String csvSettings1) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(data1.generateJs());
            js.append(String.format(Locale.US, ".data(%s, %s)", ((data1 != null) ? data1.getJsBase() : "null"), wrapQuotes(csvSettings1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", ((data1 != null) ? data1.getJsBase() : "null"), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData4() {
        if (!setData4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setData4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setData5 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public AnychartSeriesBase setData(Set data1, TextParsingSettings csvSettings2) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(data1.generateJs());
            js.append(String.format(Locale.US, ".data(%s, %s)", ((data1 != null) ? data1.getJsBase() : "null"), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", ((data1 != null) ? data1.getJsBase() : "null"), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData5() {
        if (!setData5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setData5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setData6 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public AnychartSeriesBase setData(String[] data2, TextParsingMode csvSettings) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data2), ((csvSettings != null) ? csvSettings.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data2), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData6() {
        if (!setData6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setData6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setData7 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public AnychartSeriesBase setData(String[] data2, String csvSettings1) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data2), wrapQuotes(csvSettings1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data2), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData7() {
        if (!setData7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setData7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setData8 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public AnychartSeriesBase setData(String[] data2, TextParsingSettings csvSettings2) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data2), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", arrayToStringWrapQuotes(data2), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData8() {
        if (!setData8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setData8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setData9 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public AnychartSeriesBase setData(String data3, TextParsingMode csvSettings) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data3), ((csvSettings != null) ? csvSettings.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data3), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData9() {
        if (!setData9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setData9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setData10 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public AnychartSeriesBase setData(String data3, String csvSettings1) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data3), wrapQuotes(csvSettings1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data3), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData10() {
        if (!setData10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setData10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setData11 = new ArrayList<>();

    /**
     * Setter for series mapping.
     */
    public AnychartSeriesBase setData(String data3, TextParsingSettings csvSettings2) {
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data3), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", wrapQuotes(data3), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetData11() {
        if (!setData11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setData11) {
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
    public SeriesPoint getGetPoint(Double index) {
        SeriesPoint item = new SeriesPoint(jsBase + ".getPoint(" + index + ")");
        getGetPoint.add(item);
        return item;
    }

    private Double index;
    private List<AnychartSeriesBase> setHover = new ArrayList<>();

    /**
     * Hovers point by index.
     */
    public AnychartSeriesBase hover(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hover(%f)", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hover(%f)", index));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHover() {
        if (!setHover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setHover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double[] indexes;
    private List<AnychartSeriesBase> setHover1 = new ArrayList<>();

    /**
     * Hovers points by indexes.
     */
    public AnychartSeriesBase hover(Double[] indexes) {
        if (jsBase == null) {
            this.indexes = indexes;
        } else {
            this.indexes = indexes;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hover(%s)", Arrays.toString(indexes)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hover(%s)", Arrays.toString(indexes)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHover1() {
        if (!setHover1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setHover1) {
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
    private List<AnychartSeriesBase> setHovered = new ArrayList<>();

    /**
     * Setter for hovered state settings.
     */
    public AnychartSeriesBase setHovered(String hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hovered(%s)", wrapQuotes(hovered)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHovered() {
        if (!setHovered.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String id;
    private Double id1;
    private List<AnychartSeriesBase> setId = new ArrayList<>();

    /**
     * Setter for the series id.
     */
    public AnychartSeriesBase setId(String id) {
        if (jsBase == null) {
            this.id = null;
            this.id1 = null;
            
            this.id = id;
        } else {
            this.id = id;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".id(%s)", wrapQuotes(id)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".id(%s)", wrapQuotes(id)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetId() {
        if (!setId.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setId) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setId1 = new ArrayList<>();

    /**
     * Setter for the series id.
     */
    public AnychartSeriesBase setId(Double id1) {
        if (jsBase == null) {
            this.id = null;
            this.id1 = null;
            
            this.id1 = id1;
        } else {
            this.id1 = id1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".id(%f)", id1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".id(%f)", id1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetId1() {
        if (!setId1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setId1) {
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
    private List<AnychartSeriesBase> setLabels = new ArrayList<>();

    /**
     * Setter for the series data labels.
     */
    public AnychartSeriesBase setLabels(String labels) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels = labels;
        } else {
            this.labels = labels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabels() {
        if (!setLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setLabels1 = new ArrayList<>();

    /**
     * Setter for the series data labels.
     */
    public AnychartSeriesBase setLabels(Boolean labels1) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels1 = labels1;
        } else {
            this.labels1 = labels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".labels(%b)", labels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".labels(%b)", labels1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabels1() {
        if (!setLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private LegendItemSettings getLegendItem;

    /**
     * Gets the current legend item setting for series.
     */
    public LegendItemSettings getLegendItem() {
        if (getLegendItem == null)
            getLegendItem = new LegendItemSettings(jsBase + ".legendItem()");

        return getLegendItem;
    }

    private String legendItem;
    private List<AnychartSeriesBase> setLegendItem = new ArrayList<>();

    /**
     * Sets the legend item setting for series.
     */
    public AnychartSeriesBase setLegendItem(String legendItem) {
        if (jsBase == null) {
            this.legendItem = legendItem;
        } else {
            this.legendItem = legendItem;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".legendItem(%s)", wrapQuotes(legendItem)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".legendItem(%s)", wrapQuotes(legendItem)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLegendItem() {
        if (!setLegendItem.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setLegendItem) {
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
    private List<AnychartSeriesBase> setMarkers = new ArrayList<>();

    /**
     * Setter for series data markers.
     */
    public AnychartSeriesBase setMarkers(String markers) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers = markers;
        } else {
            this.markers = markers;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%s)", wrapQuotes(markers)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMarkers() {
        if (!setMarkers.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setMarkers) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setMarkers1 = new ArrayList<>();

    /**
     * Setter for series data markers.
     */
    public AnychartSeriesBase setMarkers(Boolean markers1) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers1 = markers1;
        } else {
            this.markers1 = markers1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".markers(%b)", markers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".markers(%b)", markers1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMarkers1() {
        if (!setMarkers1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setMarkers1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String name;
    private List<AnychartSeriesBase> setName = new ArrayList<>();

    /**
     * Setter for the series name.
     */
    public AnychartSeriesBase setName(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".name(%s)", wrapQuotes(name)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".name(%s)", wrapQuotes(name)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetName() {
        if (!setName.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setName) {
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
    private List<AnychartSeriesBase> setNormal = new ArrayList<>();

    /**
     * Setter for normal state settings.
     */
    public AnychartSeriesBase setNormal(String normal) {
        if (jsBase == null) {
            this.normal = normal;
        } else {
            this.normal = normal;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".normal(%s)", wrapQuotes(normal)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetNormal() {
        if (!setNormal.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setNormal) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private List<AnychartSeriesBase> setSelect = new ArrayList<>();

    /**
     * Selects point by index.
     */
    public AnychartSeriesBase select(Double index1) {
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
            
            js.append(String.format(Locale.US, ".select(%f)", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%f)", index1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelect() {
        if (!setSelect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setSelect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double indexes1;
    private Double[] indexes2;
    private List<AnychartSeriesBase> setSelect1 = new ArrayList<>();

    /**
     * Selects point by indexes.
     */
    public AnychartSeriesBase select(Double[] indexes2) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            
            this.indexes2 = indexes2;
        } else {
            this.indexes2 = indexes2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".select(%s)", Arrays.toString(indexes2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s)", Arrays.toString(indexes2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelect1() {
        if (!setSelect1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setSelect1) {
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
    private List<AnychartSeriesBase> setSelected = new ArrayList<>();

    /**
     * Setter for selected state settings.
     */
    public AnychartSeriesBase setSelected(String selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selected(%s)", wrapQuotes(selected)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelected() {
        if (!setSelected.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private SelectionMode selectionMode;
    private String selectionMode1;
    private List<AnychartSeriesBase> setSelectionMode = new ArrayList<>();

    /**
     * Allows to select points of the series.
To select multiple points, press "ctrl" and click on them.
     */
    public AnychartSeriesBase selectionMode(SelectionMode selectionMode) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode = selectionMode;
        } else {
            this.selectionMode = selectionMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectionMode(%s)", ((selectionMode != null) ? selectionMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectionMode(%s)", ((selectionMode != null) ? selectionMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectionMode() {
        if (!setSelectionMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setSelectionMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setSelectionMode1 = new ArrayList<>();

    /**
     * Allows to select points of the series.
To select multiple points, press "ctrl" and click on them.
     */
    public AnychartSeriesBase selectionMode(String selectionMode1) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode1 = selectionMode1;
        } else {
            this.selectionMode1 = selectionMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectionMode(%s)", wrapQuotes(selectionMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectionMode(%s)", wrapQuotes(selectionMode1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectionMode1() {
        if (!setSelectionMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setSelectionMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Tooltip getTooltip;

    /**
     * Gets the current series data tooltip.
     */
    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;
    private List<AnychartSeriesBase> setTooltip = new ArrayList<>();

    /**
     * Sets series data tooltip.
     */
    public AnychartSeriesBase setTooltip(String tooltip) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip = tooltip;
        } else {
            this.tooltip = tooltip;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".tooltip(%s)", wrapQuotes(tooltip)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%s)", wrapQuotes(tooltip)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTooltip() {
        if (!setTooltip.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setTooltip) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setTooltip1 = new ArrayList<>();

    /**
     * Sets series data tooltip.
     */
    public AnychartSeriesBase setTooltip(Boolean tooltip1) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip1 = tooltip1;
        } else {
            this.tooltip1 = tooltip1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".tooltip(%b)", tooltip1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%b)", tooltip1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTooltip1() {
        if (!setTooltip1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setTooltip1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double indexOrIndexes;
    private Double[] indexOrIndexes1;
    private List<AnychartSeriesBase> setUnhover = new ArrayList<>();

    /**
     * Removes hover from the series.
     */
    public AnychartSeriesBase unhover(Double indexOrIndexes) {
        if (jsBase == null) {
            this.indexOrIndexes = null;
            this.indexOrIndexes1 = null;
            
            this.indexOrIndexes = indexOrIndexes;
        } else {
            this.indexOrIndexes = indexOrIndexes;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unhover(%f)", indexOrIndexes));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".unhover(%f)", indexOrIndexes));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUnhover() {
        if (!setUnhover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setUnhover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<AnychartSeriesBase> setUnhover1 = new ArrayList<>();

    /**
     * Removes hover from the series.
     */
    public AnychartSeriesBase unhover(Double[] indexOrIndexes1) {
        if (jsBase == null) {
            this.indexOrIndexes = null;
            this.indexOrIndexes1 = null;
            
            this.indexOrIndexes1 = indexOrIndexes1;
        } else {
            this.indexOrIndexes1 = indexOrIndexes1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unhover(%s)", Arrays.toString(indexOrIndexes1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".unhover(%s)", Arrays.toString(indexOrIndexes1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUnhover1() {
        if (!setUnhover1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setUnhover1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index2;
    private List<AnychartSeriesBase> setUnselect = new ArrayList<>();

    /**
     * Deselects selected point by index.
     */
    public AnychartSeriesBase unselect(Double index2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.index2 = index2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unselect(%f)", index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".unselect(%f)", index2));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUnselect() {
        if (!setUnselect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setUnselect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double[] indexes3;
    private List<AnychartSeriesBase> setUnselect1 = new ArrayList<>();

    /**
     * Deselects selected points by indexes.
     */
    public AnychartSeriesBase unselect(Double[] indexes3) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes3 = indexes3;
        } else {
            this.indexes3 = indexes3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unselect(%s)", Arrays.toString(indexes3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".unselect(%s)", Arrays.toString(indexes3)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUnselect1() {
        if (!setUnselect1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (AnychartSeriesBase item : setUnselect1) {
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