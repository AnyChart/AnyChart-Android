package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class AnychartSeriesBase extends VisualBaseWithBounds {

    public AnychartSeriesBase() {

    }

    protected AnychartSeriesBase(String jsBase) {
        this.jsBase = jsBase;
    }

    protected AnychartSeriesBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private SeriesA11y getA11y;

    public SeriesA11y getA11y() {
        if (getA11y == null)
            getA11y = new SeriesA11y(jsBase + ".ay()");

        return getA11y;
    }

    private Boolean ay;
    private String ay1;

    public AnychartSeriesBase setA11y(Boolean ay) {
        if (jsBase == null) {
            this.ay = null;
            this.ay1 = null;
            
            this.ay = ay;
        } else {
            this.ay = ay;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public AnychartSeriesBase setA11y(String ay1) {
        if (jsBase == null) {
            this.ay = null;
            this.ay1 = null;
            
            this.ay1 = ay1;
        } else {
            this.ay1 = ay1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".a11y(%s)", ay1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".a11y(%s)", ay1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color;

    public AnychartSeriesBase setColor(String color) {
        if (jsBase == null) {
            this.color = color;
        } else {
            this.color = color;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".color(%s)", color));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".color(%s)", color));
                js.setLength(0);
            }
        }
        return this;
    }

    private View getData;

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
    private TextParsingSettings csvSettings1;

    public AnychartSeriesBase setData(View data, TextParsingMode csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data = data;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data = data;
            this.csvSettings = csvSettings;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public AnychartSeriesBase setData(View data, TextParsingSettings csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data = data;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data = data;
            this.csvSettings1 = csvSettings1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public AnychartSeriesBase setData(Set data1, TextParsingMode csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data1 = data1;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data1 = data1;
            this.csvSettings = csvSettings;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public AnychartSeriesBase setData(Set data1, TextParsingSettings csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data1 = data1;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data1 = data1;
            this.csvSettings1 = csvSettings1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public AnychartSeriesBase setData(String[] data2, TextParsingMode csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data2 = data2;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data2 = data2;
            this.csvSettings = csvSettings;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public AnychartSeriesBase setData(String[] data2, TextParsingSettings csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data2 = data2;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data2 = data2;
            this.csvSettings1 = csvSettings1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public AnychartSeriesBase setData(String data3, TextParsingMode csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data3 = data3;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data3 = data3;
            this.csvSettings = csvSettings;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public AnychartSeriesBase setData(String data3, TextParsingSettings csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data3 = data3;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data3 = data3;
            this.csvSettings1 = csvSettings1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private SeriesPoint getGetPoint;

    public SeriesPoint getGetPoint() {
        if (getGetPoint == null)
            getGetPoint = new SeriesPoint(jsBase + ".getPoint()");

        return getGetPoint;
    }

    private Double index;

    public AnychartSeriesBase hover(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double[] indexes;

    public AnychartSeriesBase hover(Double[] indexes) {
        if (jsBase == null) {
            this.indexes = indexes;
        } else {
            this.indexes = indexes;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private StateSettings getHovered;

    public StateSettings getHovered() {
        if (getHovered == null)
            getHovered = new StateSettings(jsBase + ".hovered()");

        return getHovered;
    }

    private String hovered;

    public AnychartSeriesBase setHovered(String hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".hovered(%s)", hovered));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hovered(%s)", hovered));
                js.setLength(0);
            }
        }
        return this;
    }

    private String id;
    private Double id1;

    public AnychartSeriesBase setId(String id) {
        if (jsBase == null) {
            this.id = null;
            this.id1 = null;
            
            this.id = id;
        } else {
            this.id = id;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".id(%s)", id));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".id(%s)", id));
                js.setLength(0);
            }
        }
        return this;
    }


    public AnychartSeriesBase setId(Double id1) {
        if (jsBase == null) {
            this.id = null;
            this.id1 = null;
            
            this.id1 = id1;
        } else {
            this.id1 = id1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private UiLabelsFactory getLabels;

    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }

    private String labels;
    private Boolean labels1;

    public AnychartSeriesBase setLabels(String labels) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels = labels;
        } else {
            this.labels = labels;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".labels(%s)", labels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", labels));
                js.setLength(0);
            }
        }
        return this;
    }


    public AnychartSeriesBase setLabels(Boolean labels1) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels1 = labels1;
        } else {
            this.labels1 = labels1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private LegendItemSettings getLegendItem;

    public LegendItemSettings getLegendItem() {
        if (getLegendItem == null)
            getLegendItem = new LegendItemSettings(jsBase + ".legendItem()");

        return getLegendItem;
    }

    private String legendItem;

    public AnychartSeriesBase setLegendItem(String legendItem) {
        if (jsBase == null) {
            this.legendItem = legendItem;
        } else {
            this.legendItem = legendItem;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".legendItem(%s)", legendItem));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".legendItem(%s)", legendItem));
                js.setLength(0);
            }
        }
        return this;
    }

    private String name;

    public AnychartSeriesBase setName(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".name(%s)", name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".name(%s)", name));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getNormal;

    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }

    private String normal;

    public AnychartSeriesBase setNormal(String normal) {
        if (jsBase == null) {
            this.normal = normal;
        } else {
            this.normal = normal;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".normal(%s)", normal));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".normal(%s)", normal));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index1;

    public AnychartSeriesBase select(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double indexes1;
    private Double[] indexes2;

    public AnychartSeriesBase select(Double[] indexes2) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            
            this.indexes2 = indexes2;
        } else {
            this.indexes2 = indexes2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private StateSettings getSelected;

    public StateSettings getSelected() {
        if (getSelected == null)
            getSelected = new StateSettings(jsBase + ".selected()");

        return getSelected;
    }

    private String selected;

    public AnychartSeriesBase setSelected(String selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".selected(%s)", selected));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selected(%s)", selected));
                js.setLength(0);
            }
        }
        return this;
    }

    private SelectionMode selectionMode;
    private String selectionMode1;

    public AnychartSeriesBase selectionMode(SelectionMode selectionMode) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode = selectionMode;
        } else {
            this.selectionMode = selectionMode;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".selectionMode(%s)", (selectionMode != null) ? selectionMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectionMode(%s)", (selectionMode != null) ? selectionMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public AnychartSeriesBase selectionMode(String selectionMode1) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode1 = selectionMode1;
        } else {
            this.selectionMode1 = selectionMode1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".selectionMode(%s)", selectionMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectionMode(%s)", selectionMode1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Tooltip getTooltip;

    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

    public AnychartSeriesBase setTooltip(String tooltip) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip = tooltip;
        } else {
            this.tooltip = tooltip;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".tooltip(%s)", tooltip));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".tooltip(%s)", tooltip));
                js.setLength(0);
            }
        }
        return this;
    }


    public AnychartSeriesBase setTooltip(Boolean tooltip1) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip1 = tooltip1;
        } else {
            this.tooltip1 = tooltip1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double indexOrIndexes;
    private Double[] indexOrIndexes1;

    public AnychartSeriesBase unhover(Double indexOrIndexes) {
        if (jsBase == null) {
            this.indexOrIndexes = null;
            this.indexOrIndexes1 = null;
            
            this.indexOrIndexes = indexOrIndexes;
        } else {
            this.indexOrIndexes = indexOrIndexes;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public AnychartSeriesBase unhover(Double[] indexOrIndexes1) {
        if (jsBase == null) {
            this.indexOrIndexes = null;
            this.indexOrIndexes1 = null;
            
            this.indexOrIndexes1 = indexOrIndexes1;
        } else {
            this.indexOrIndexes1 = indexOrIndexes1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double index2;

    public AnychartSeriesBase unselect(Double index2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.index2 = index2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

    private Double[] indexes3;

    public AnychartSeriesBase unselect(Double[] indexes3) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            
            this.indexes3 = indexes3;
        } else {
            this.indexes3 = indexes3;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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
        if (getGetPoint != null) {
            return getGetPoint.generateJs();
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

    private String generateJSay() {
        if (ay != null) {
            return String.format(Locale.US, "ay: %b,", ay);
        }
        return "";
    }

    private String generateJSay1() {
        if (ay1 != null) {
            return String.format(Locale.US, "ay: %s,", ay1);
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSdata() {
        if (data != null) {
            return String.format(Locale.US, "data: %s,", (data != null) ? data.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata1() {
        if (data1 != null) {
            return String.format(Locale.US, "data: %s,", (data1 != null) ? data1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata2() {
        if (data2 != null) {
            return String.format(Locale.US, "data: %s,", Arrays.toString(data2));
        }
        return "";
    }

    private String generateJSdata3() {
        if (data3 != null) {
            return String.format(Locale.US, "data: %s,", data3);
        }
        return "";
    }

    private String generateJScsvSettings() {
        if (csvSettings != null) {
            return String.format(Locale.US, "csvSettings: %s,", (csvSettings != null) ? csvSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJScsvSettings1() {
        if (csvSettings1 != null) {
            return String.format(Locale.US, "csvSettings: %s,", (csvSettings1 != null) ? csvSettings1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSindexes() {
        if (indexes != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes));
        }
        return "";
    }

    private String generateJShovered() {
        if (hovered != null) {
            return String.format(Locale.US, "hovered: %s,", hovered);
        }
        return "";
    }

    private String generateJSid() {
        if (id != null) {
            return String.format(Locale.US, "id: %s,", id);
        }
        return "";
    }

    private String generateJSid1() {
        if (id1 != null) {
            return String.format(Locale.US, "id: %f,", id1);
        }
        return "";
    }

    private String generateJSlabels() {
        if (labels != null) {
            return String.format(Locale.US, "labels: %s,", labels);
        }
        return "";
    }

    private String generateJSlabels1() {
        if (labels1 != null) {
            return String.format(Locale.US, "labels: %b,", labels1);
        }
        return "";
    }

    private String generateJSlegendItem() {
        if (legendItem != null) {
            return String.format(Locale.US, "legendItem: %s,", legendItem);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSnormal() {
        if (normal != null) {
            return String.format(Locale.US, "normal: %s,", normal);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSindexes1() {
        if (indexes1 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes1);
        }
        return "";
    }

    private String generateJSindexes2() {
        if (indexes2 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes2));
        }
        return "";
    }

    private String generateJSselected() {
        if (selected != null) {
            return String.format(Locale.US, "selected: %s,", selected);
        }
        return "";
    }

    private String generateJSselectionMode() {
        if (selectionMode != null) {
            return String.format(Locale.US, "selectionMode: %s,", (selectionMode != null) ? selectionMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectionMode1() {
        if (selectionMode1 != null) {
            return String.format(Locale.US, "selectionMode: %s,", selectionMode1);
        }
        return "";
    }

    private String generateJStooltip() {
        if (tooltip != null) {
            return String.format(Locale.US, "tooltip: %s,", tooltip);
        }
        return "";
    }

    private String generateJStooltip1() {
        if (tooltip1 != null) {
            return String.format(Locale.US, "tooltip: %b,", tooltip1);
        }
        return "";
    }

    private String generateJSindexOrIndexes() {
        if (indexOrIndexes != null) {
            return String.format(Locale.US, "indexOrIndexes: %f,", indexOrIndexes);
        }
        return "";
    }

    private String generateJSindexOrIndexes1() {
        if (indexOrIndexes1 != null) {
            return String.format(Locale.US, "indexOrIndexes: %s,", Arrays.toString(indexOrIndexes1));
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }

    private String generateJSindexes3() {
        if (indexes3 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes3));
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSay());
            js.append(generateJSay1());
            js.append(generateJScolor());
            js.append(generateJSdata());
            js.append(generateJSdata1());
            js.append(generateJSdata2());
            js.append(generateJSdata3());
            js.append(generateJScsvSettings());
            js.append(generateJScsvSettings1());
            js.append(generateJSindex());
            js.append(generateJSindexes());
            js.append(generateJShovered());
            js.append(generateJSid());
            js.append(generateJSid1());
            js.append(generateJSlabels());
            js.append(generateJSlabels1());
            js.append(generateJSlegendItem());
            js.append(generateJSname());
            js.append(generateJSnormal());
            js.append(generateJSindex1());
            js.append(generateJSindexes1());
            js.append(generateJSindexes2());
            js.append(generateJSselected());
            js.append(generateJSselectionMode());
            js.append(generateJSselectionMode1());
            js.append(generateJStooltip());
            js.append(generateJStooltip1());
            js.append(generateJSindexOrIndexes());
            js.append(generateJSindexOrIndexes1());
            js.append(generateJSindex2());
            js.append(generateJSindexes3());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}