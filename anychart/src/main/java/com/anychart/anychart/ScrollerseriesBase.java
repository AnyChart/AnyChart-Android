package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Base class for all stock scroller series.
 */
public class ScrollerseriesBase extends VisualBaseWithBounds {

    public ScrollerseriesBase() {
        js.setLength(0);
        js.append("var scrollerseriesBase").append(++variableIndex).append(" = anychart.core.stock.scrollerSeries.base();");
        jsBase = "scrollerseriesBase" + variableIndex;
    }

    protected ScrollerseriesBase(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ScrollerseriesBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private TableMapping getData;

    /**
     * Gets data for the scroller series.
     */
    public TableMapping getData() {
        if (getData == null)
            getData = new TableMapping(jsBase + ".data()");

        return getData;
    }

    private TableMapping data;
    private DataTable data1;
    private String data2;
    private String data3;
    private String mappingSettings;
    private String csvSettings;

    /**
     * Sets data for the scroller series.
     */
    public ScrollerseriesBase setData(TableMapping data, String mappingSettings, String csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data = data;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
        } else {
            this.data = data;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".data(%s, %s, %s)", ((data != null) ? data.generateJs() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", ((data != null) ? data.generateJs() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets data for the scroller series.
     */
    public ScrollerseriesBase setData(DataTable data1, String mappingSettings, String csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data1 = data1;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
        } else {
            this.data1 = data1;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".data(%s, %s, %s)", ((data1 != null) ? data1.generateJs() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", ((data1 != null) ? data1.generateJs() : "null"), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Sets data for the scroller series.
     */
    public ScrollerseriesBase setData(String data2, String mappingSettings, String csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data2 = data2;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
        } else {
            this.data2 = data2;
            this.mappingSettings = mappingSettings;
            this.csvSettings = csvSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".data(%s, %s, %s)", wrapQuotes(data2), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", wrapQuotes(data2), wrapQuotes(mappingSettings), wrapQuotes(csvSettings)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxPointWidth;
    private String maxPointWidth1;

    /**
     * Setter for the maximum point width.
     */
    public ScrollerseriesBase setMaxPointWidth(Double maxPointWidth) {
        if (jsBase == null) {
            this.maxPointWidth = null;
            this.maxPointWidth1 = null;
            
            this.maxPointWidth = maxPointWidth;
        } else {
            this.maxPointWidth = maxPointWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%f)", maxPointWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the maximum point width.
     */
    public ScrollerseriesBase setMaxPointWidth(String maxPointWidth1) {
        if (jsBase == null) {
            this.maxPointWidth = null;
            this.maxPointWidth1 = null;
            
            this.maxPointWidth1 = maxPointWidth1;
        } else {
            this.maxPointWidth1 = maxPointWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxPointWidth(%s)", wrapQuotes(maxPointWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minPointLength;
    private String minPointLength1;

    /**
     * Setter for the minimum point length.
     */
    public ScrollerseriesBase setMinPointLength(Double minPointLength) {
        if (jsBase == null) {
            this.minPointLength = null;
            this.minPointLength1 = null;
            
            this.minPointLength = minPointLength;
        } else {
            this.minPointLength = minPointLength;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".minPointLength(%f)", minPointLength));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%f)", minPointLength));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the minimum point length.
     */
    public ScrollerseriesBase setMinPointLength(String minPointLength1) {
        if (jsBase == null) {
            this.minPointLength = null;
            this.minPointLength1 = null;
            
            this.minPointLength1 = minPointLength1;
        } else {
            this.minPointLength1 = minPointLength1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minPointLength(%s)", wrapQuotes(minPointLength1)));
                js.setLength(0);
            }
        }
        return this;
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

    /**
     * Setter for normal state settings.
     */
    public ScrollerseriesBase setNormal(String normal) {
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

    private Double pointWidth;
    private String pointWidth1;

    /**
     * Setter for the point width settings.
     */
    public ScrollerseriesBase setPointWidth(Double pointWidth) {
        if (jsBase == null) {
            this.pointWidth = null;
            this.pointWidth1 = null;
            
            this.pointWidth = pointWidth;
        } else {
            this.pointWidth = pointWidth;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".pointWidth(%f)", pointWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%f)", pointWidth));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the point width settings.
     */
    public ScrollerseriesBase setPointWidth(String pointWidth1) {
        if (jsBase == null) {
            this.pointWidth = null;
            this.pointWidth1 = null;
            
            this.pointWidth1 = pointWidth1;
        } else {
            this.pointWidth1 = pointWidth1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".pointWidth(%s)", wrapQuotes(pointWidth1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private RenderingSettings getRendering;

    /**
     * Getter for the series rendering.
     */
    public RenderingSettings getRendering() {
        if (getRendering == null)
            getRendering = new RenderingSettings(jsBase + ".rendering()");

        return getRendering;
    }

    private String rendering;

    /**
     * Setter for the series rendering settings.
     */
    public ScrollerseriesBase setRendering(String rendering) {
        if (jsBase == null) {
            this.rendering = rendering;
        } else {
            this.rendering = rendering;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".rendering(%s)", wrapQuotes(rendering)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rendering(%s)", wrapQuotes(rendering)));
                js.setLength(0);
            }
        }
        return this;
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

    /**
     * Setter for selected state settings.
     */
    public ScrollerseriesBase setSelected(String selected) {
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

    private String seriesType;

    /**
     * Setter for switching of the series type.
     */
    public ScrollerseriesBase setSeriesType(String seriesType) {
        if (jsBase == null) {
            this.seriesType = seriesType;
        } else {
            this.seriesType = seriesType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".seriesType(%s)", wrapQuotes(seriesType)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".seriesType(%s)", wrapQuotes(seriesType)));
                js.setLength(0);
            }
        }
        return this;
    }

    private ScatterBase getYScale;

    /**
     * Getter for the current Y-scale.
     */
    public ScatterBase getYScale() {
        if (getYScale == null)
            getYScale = new ScatterBase(jsBase + ".yScale()");

        return getYScale;
    }

    private ScatterBase yScale;
    private String yScale1;
    private ScaleTypes yScale2;
    private String yScale3;

    /**
     * Setter for the Y-scale.
     */
    public ScrollerseriesBase setYScale(ScatterBase yScale) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale = yScale;
        } else {
            this.yScale = yScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(yScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".yScale(%s);",  ((yScale != null) ? yScale.getJsBase() : "null")));
        }
        return this;
    }


    /**
     * Setter for the Y-scale.
     */
    public ScrollerseriesBase setYScale(String yScale1) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale1 = yScale1;
        } else {
            this.yScale1 = yScale1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", wrapQuotes(yScale1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the Y-scale.
     */
    public ScrollerseriesBase setYScale(ScaleTypes yScale2) {
        if (jsBase == null) {
            this.yScale = null;
            this.yScale1 = null;
            this.yScale2 = null;
            this.yScale3 = null;
            
            this.yScale2 = yScale2;
        } else {
            this.yScale2 = yScale2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".yScale(%s)", ((yScale2 != null) ? yScale2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yScale(%s)", ((yScale2 != null) ? yScale2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetRendering() {
        if (getRendering != null) {
            return getRendering.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }

    private String generateJSgetYScale() {
        if (getYScale != null) {
            return getYScale.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetData());
        jsGetters.append(generateJSgetNormal());
        jsGetters.append(generateJSgetRendering());
        jsGetters.append(generateJSgetSelected());
        jsGetters.append(generateJSgetYScale());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}