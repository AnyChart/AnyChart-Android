package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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

    public SeriesA11y getAy() {
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

    private String color;

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
    private String csvSettings1;
    private TextParsingSettings csvSettings2;

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

            js.append(String.format(Locale.US, ".data(%s, %s)", ((data != null) ? data.generateJs() : "null"), ((csvSettings != null) ? csvSettings.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", ((data != null) ? data.generateJs() : "null"), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".data(%s, %s)", ((data != null) ? data.generateJs() : "null"), wrapQuotes(csvSettings1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", ((data != null) ? data.generateJs() : "null"), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".data(%s, %s)", ((data != null) ? data.generateJs() : "null"), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", ((data != null) ? data.generateJs() : "null"), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
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
            this.csvSettings2 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data1 = data1;
            this.csvSettings = csvSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".data(%s, %s)", ((data1 != null) ? data1.generateJs() : "null"), ((csvSettings != null) ? csvSettings.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", ((data1 != null) ? data1.generateJs() : "null"), ((csvSettings != null) ? csvSettings.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".data(%s, %s)", ((data1 != null) ? data1.generateJs() : "null"), wrapQuotes(csvSettings1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", ((data1 != null) ? data1.generateJs() : "null"), wrapQuotes(csvSettings1)));
                js.setLength(0);
            }
        }
        return this;
    }


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

            js.append(String.format(Locale.US, ".data(%s, %s)", ((data1 != null) ? data1.generateJs() : "null"), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s)", ((data1 != null) ? data1.generateJs() : "null"), ((csvSettings2 != null) ? csvSettings2.generateJs() : "null")));
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

    private List<SeriesPoint> getGetPoint = new ArrayList<>();

    public SeriesPoint getGetPoint(Double index) {
        SeriesPoint item = new SeriesPoint(jsBase + ".getPoint(" + index + ")");
        getGetPoint.add(item);
        return item;
    }

    private Double index;

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

    private Double[] indexes;

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

    private String id;
    private Double id1;

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

    private UiMarkersFactory getMarkers;

    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }

    private String markers;
    private Boolean markers1;
    private String markers2;

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

    private String name;

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

    private Double index1;

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

    private SelectionMode selectionMode;
    private String selectionMode1;

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

    private Double indexOrIndexes;
    private Double[] indexOrIndexes1;

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

    private Double index2;

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


//
//    private String generateJSSeriesA11y getA11y() {
//        if (SeriesA11y getA11y != null) {
//            return SeriesA11y getA11y.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSView getData() {
//        if (View getData != null) {
//            return View getData.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSSeriesPoint getGetPoint() {
//        if (SeriesPoint getGetPoint != null) {
//            return SeriesPoint getGetPoint.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSStateSettings getHovered() {
//        if (StateSettings getHovered != null) {
//            return StateSettings getHovered.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSUiLabelsFactory getLabels() {
//        if (UiLabelsFactory getLabels != null) {
//            return UiLabelsFactory getLabels.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSLegendItemSettings getLegendItem() {
//        if (LegendItemSettings getLegendItem != null) {
//            return LegendItemSettings getLegendItem.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSUiMarkersFactory getMarkers() {
//        if (UiMarkersFactory getMarkers != null) {
//            return UiMarkersFactory getMarkers.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSStateSettings getNormal() {
//        if (StateSettings getNormal != null) {
//            return StateSettings getNormal.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSStateSettings getSelected() {
//        if (StateSettings getSelected != null) {
//            return StateSettings getSelected.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSTooltip getTooltip() {
//        if (Tooltip getTooltip != null) {
//            return Tooltip getTooltip.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetA11y() {
        if (getA11y != null) {
            return getA11y.generateJs();
            //return String.format(Locale.US, "getAy: %s,", ((getA11y != null) ? getA11y.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
            //return String.format(Locale.US, "getData: %s,", ((getData != null) ? getData.generateJs() : "null"));
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
            //return String.format(Locale.US, "getHovered: %s,", ((getHovered != null) ? getHovered.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
            //return String.format(Locale.US, "getLabels: %s,", ((getLabels != null) ? getLabels.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetLegendItem() {
        if (getLegendItem != null) {
            return getLegendItem.generateJs();
            //return String.format(Locale.US, "getLegendItem: %s,", ((getLegendItem != null) ? getLegendItem.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
            //return String.format(Locale.US, "getMarkers: %s,", ((getMarkers != null) ? getMarkers.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
            //return String.format(Locale.US, "getNormal: %s,", ((getNormal != null) ? getNormal.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
            //return String.format(Locale.US, "getSelected: %s,", ((getSelected != null) ? getSelected.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
            //return String.format(Locale.US, "getTooltip: %s,", ((getTooltip != null) ? getTooltip.generateJs() : "null"));
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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSay());
////        
//            js.append(generateJSay1());
////        
//            js.append(generateJScolor());
////        
//            js.append(generateJSdata());
////        
//            js.append(generateJSdata1());
////        
//            js.append(generateJSdata2());
////        
//            js.append(generateJSdata3());
////        
//            js.append(generateJScsvSettings());
////        
//            js.append(generateJScsvSettings1());
////        
//            js.append(generateJScsvSettings2());
////        
//            js.append(generateJSindex());
////        
//            js.append(generateJSindexes());
////        
//            js.append(generateJShovered());
////        
//            js.append(generateJSid());
////        
//            js.append(generateJSid1());
////        
//            js.append(generateJSlabels());
////        
//            js.append(generateJSlabels1());
////        
//            js.append(generateJSlegendItem());
////        
//            js.append(generateJSmarkers());
////        
//            js.append(generateJSmarkers1());
////        
//            js.append(generateJSmarkers2());
////        
//            js.append(generateJSname());
////        
//            js.append(generateJSnormal());
////        
//            js.append(generateJSindex1());
////        
//            js.append(generateJSindexes1());
////        
//            js.append(generateJSindexes2());
////        
//            js.append(generateJSselected());
////        
//            js.append(generateJSselectionMode());
////        
//            js.append(generateJSselectionMode1());
////        
//            js.append(generateJStooltip());
////        
//            js.append(generateJStooltip1());
////        
//            js.append(generateJSindexOrIndexes());
////        
//            js.append(generateJSindexOrIndexes1());
////        
//            js.append(generateJSindex2());
////        
//            js.append(generateJSindexes3());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}