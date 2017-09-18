package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Pie extends Chart {

    public Pie() {
        js.append("chart = anychart.pie();");
    }

    
    private Boolean animation;

    public void setAnimation(Boolean animation) {
        this.animation = animation;

        js.append(String.format(Locale.US, "chart.animation(%b);", animation));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.animation(%b);", animation));
            js.setLength(0);
        }
    }

    private Boolean enabled;
    private Double duration;

    public void setAnimation(Boolean enabled, Double duration) {
        this.enabled = enabled;
        this.duration = duration;

        js.append(String.format(Locale.US, "chart.animation(%b, %f);", enabled, duration));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.animation(%b, %f);", enabled, duration));
            js.setLength(0);
        }
    }

    private Double bottom;
    private String bottom1;

    public void setBottom(Double bottom) {
        this.bottom = bottom;

        js.append(String.format(Locale.US, "chart.bottom(%f);", bottom));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bottom(%f);", bottom));
            js.setLength(0);
        }
    }


    public void setBottom(String bottom1) {
        this.bottom1 = bottom1;

        js.append(String.format(Locale.US, "chart.bottom(%s);", bottom1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bottom(%s);", bottom1));
            js.setLength(0);
        }
    }

    private RectObj bounds;
    private Rect bounds1;
    private Bounds bounds2;

    public void setBounds(RectObj bounds) {
        this.bounds = bounds;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBounds(Rect bounds1) {
        this.bounds1 = bounds1;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBounds(Bounds bounds2) {
        this.bounds2 = bounds2;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double x;
    private String x1;
    private Double y;
    private String y1;
    private Double width;
    private String width1;
    private Double height;
    private String height1;

    public void setBounds(Double x, Double y, Double width, Double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %f, %f);", x, y, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %f, %f);", x, y, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, Double y, Double width, String height1) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %f, %s);", x, y, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %f, %s);", x, y, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, Double y, String width1, Double height) {
        this.x = x;
        this.y = y;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %s, %f);", x, y, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %s, %f);", x, y, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, Double y, String width1, String height1) {
        this.x = x;
        this.y = y;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %f, %s, %s);", x, y, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %f, %s, %s);", x, y, width1, height1));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, Double width, Double height) {
        this.x = x;
        this.y1 = y1;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %f, %f);", x, y1, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %f, %f);", x, y1, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, Double width, String height1) {
        this.x = x;
        this.y1 = y1;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %f, %s);", x, y1, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %f, %s);", x, y1, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, String width1, Double height) {
        this.x = x;
        this.y1 = y1;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %s, %f);", x, y1, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %s, %f);", x, y1, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(Double x, String y1, String width1, String height1) {
        this.x = x;
        this.y1 = y1;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%f, %s, %s, %s);", x, y1, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%f, %s, %s, %s);", x, y1, width1, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, Double width, Double height) {
        this.x1 = x1;
        this.y = y;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %f, %f);", x1, y, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %f, %f);", x1, y, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, Double width, String height1) {
        this.x1 = x1;
        this.y = y;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %f, %s);", x1, y, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %f, %s);", x1, y, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, String width1, Double height) {
        this.x1 = x1;
        this.y = y;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %s, %f);", x1, y, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %s, %f);", x1, y, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, Double y, String width1, String height1) {
        this.x1 = x1;
        this.y = y;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %f, %s, %s);", x1, y, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %f, %s, %s);", x1, y, width1, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, Double width, Double height) {
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %f, %f);", x1, y1, width, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %f, %f);", x1, y1, width, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, Double width, String height1) {
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %f, %s);", x1, y1, width, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %f, %s);", x1, y1, width, height1));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, String width1, Double height) {
        this.x1 = x1;
        this.y1 = y1;
        this.width1 = width1;
        this.height = height;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %s, %f);", x1, y1, width1, height));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %s, %f);", x1, y1, width1, height));
            js.setLength(0);
        }
    }


    public void setBounds(String x1, String y1, String width1, String height1) {
        this.x1 = x1;
        this.y1 = y1;
        this.width1 = width1;
        this.height1 = height1;

        js.append(String.format(Locale.US, "chart.bounds(%s, %s, %s, %s);", x1, y1, width1, height1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s, %s, %s, %s);", x1, y1, width1, height1));
            js.setLength(0);
        }
    }

    private Double connectorLength;
    private String connectorLength1;

    public void setConnectorlength(Double connectorLength) {
        this.connectorLength = connectorLength;

        js.append(String.format(Locale.US, "chart.connectorLength(%f);", connectorLength));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connectorLength(%f);", connectorLength));
            js.setLength(0);
        }
    }


    public void setConnectorlength(String connectorLength1) {
        this.connectorLength1 = connectorLength1;

        js.append(String.format(Locale.US, "chart.connectorLength(%s);", connectorLength1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connectorLength(%s);", connectorLength1));
            js.setLength(0);
        }
    }

    private Stroke connectorStroke;
    private ColoredFill connectorStroke1;
    private String connectorStroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setConnectorstroke(Stroke connectorStroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.connectorStroke = connectorStroke;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.connectorStroke(%s, %f, %s, %s, %s);", (connectorStroke != null) ? connectorStroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connectorStroke(%s, %f, %s, %s, %s);", (connectorStroke != null) ? connectorStroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setConnectorstroke(ColoredFill connectorStroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.connectorStroke1 = connectorStroke1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.connectorStroke(%s, %f, %s, %s, %s);", (connectorStroke1 != null) ? connectorStroke1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connectorStroke(%s, %f, %s, %s, %s);", (connectorStroke1 != null) ? connectorStroke1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setConnectorstroke(String connectorStroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.connectorStroke2 = connectorStroke2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.connectorStroke(%s, %f, %s, %s, %s);", connectorStroke2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.connectorStroke(%s, %f, %s, %s, %s);", connectorStroke2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Layer container;
    private Stage container1;
    private String container2;
    private Element container3;

    public void setContainer(Layer container) {
        this.container = container;

        js.append(String.format(Locale.US, "chart.container(%s);", (container != null) ? container.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", (container != null) ? container.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setContainer(Stage container1) {
        this.container1 = container1;

        js.append(String.format(Locale.US, "chart.container(%s);", (container1 != null) ? container1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", (container1 != null) ? container1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setContainer(String container2) {
        this.container2 = container2;

        js.append(String.format(Locale.US, "chart.container(%s);", container2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", container2));
            js.setLength(0);
        }
    }


    public void setContainer(Element container3) {
        this.container3 = container3;

        js.append(String.format(Locale.US, "chart.container(%s);", (container3 != null) ? container3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.container(%s);", (container3 != null) ? container3.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean contextMenu;

    public void setContextmenu(Boolean contextMenu) {
        this.contextMenu = contextMenu;

        js.append(String.format(Locale.US, "chart.contextMenu(%b);", contextMenu));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.contextMenu(%b);", contextMenu));
            js.setLength(0);
        }
    }

    private Boolean credits;

    public void setCredits(Boolean credits) {
        this.credits = credits;

        js.append(String.format(Locale.US, "chart.credits(%b);", credits));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.credits(%b);", credits));
            js.setLength(0);
        }
    }

    private View data;
    private Mapping data1;
    private Set data2;
    private DataSettings data3;
    private String[] data4;
    private TextParsingMode csvSettings;
    private TextParsingSettings csvSettings1;

    public void setData(View data, TextParsingMode csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(View data, TextParsingSettings csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(Mapping data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(Mapping data1, TextParsingSettings csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(Set data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data2 != null) ? data2.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data2 != null) ? data2.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(Set data2, TextParsingSettings csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data2 != null) ? data2.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data2 != null) ? data2.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(DataSettings data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(DataSettings data3, TextParsingSettings csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String[] data4, TextParsingMode csvSettings) {
        this.data4 = data4;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data4), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data4), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String[] data4, TextParsingSettings csvSettings1) {
        this.data4 = data4;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data4), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data4), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean async;

    public void setDraw(Boolean async) {
        this.async = async;

        js.append(String.format(Locale.US, "chart.draw(%b);", async));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.draw(%b);", async));
            js.setLength(0);
        }
    }

    private String explode;
    private Double explode1;

    public void setExplode(String explode) {
        this.explode = explode;

        js.append(String.format(Locale.US, "chart.explode(%s);", explode));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.explode(%s);", explode));
            js.setLength(0);
        }
    }


    public void setExplode(Double explode1) {
        this.explode1 = explode1;

        js.append(String.format(Locale.US, "chart.explode(%f);", explode1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.explode(%f);", explode1));
            js.setLength(0);
        }
    }

    private Double index;
    private Boolean explode2;

    public void setExplodeslice(Double index, Boolean explode2) {
        this.index = index;
        this.explode2 = explode2;

        js.append(String.format(Locale.US, "chart.explodeSlice(%f, %b);", index, explode2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.explodeSlice(%f, %b);", index, explode2));
            js.setLength(0);
        }
    }

    private Boolean explodeSlices;

    public void setExplodeslices(Boolean explodeSlices) {
        this.explodeSlices = explodeSlices;

        js.append(String.format(Locale.US, "chart.explodeSlices(%b);", explodeSlices));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.explodeSlices(%b);", explodeSlices));
            js.setLength(0);
        }
    }

    private Fill fill;

    public void setFill(Fill fill) {
        this.fill = fill;

        js.append(String.format(Locale.US, "chart.fill(%s);", (fill != null) ? fill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s);", (fill != null) ? fill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color;
    private Double opacity;

    public void setFill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "chart.fill(%s, %f);", color, opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %f);", color, opacity));
            js.setLength(0);
        }
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private Rect mode1;
    private Double opacity1;

    public void setFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setFill(GradientKey[] keys, Rect mode1, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
    }


    public void setFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setFill(String[] keys1, Rect mode1, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private Rect mode2;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setFill(GradientKey[] keys2, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode2 = mode2;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }


    public void setFill(String[] keys3, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode2 = mode2;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }

    private Fill imageSettings;
    private Boolean forceHoverLabels;

    public void setForcehoverlabels(Boolean forceHoverLabels) {
        this.forceHoverLabels = forceHoverLabels;

        js.append(String.format(Locale.US, "chart.forceHoverLabels(%b);", forceHoverLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.forceHoverLabels(%b);", forceHoverLabels));
            js.setLength(0);
        }
    }

    private String key;
    private Statistics key1;

    public void setGetstat(String key) {
        this.key = key;

        js.append(String.format(Locale.US, "chart.getStat(%s);", key));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getStat(%s);", key));
            js.setLength(0);
        }
    }


    public void setGetstat(Statistics key1) {
        this.key1 = key1;

        js.append(String.format(Locale.US, "chart.getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double xCoord;
    private Double yCoord;

    public void setGlobaltolocal(Double xCoord, Double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;

        js.append(String.format(Locale.US, "chart.globalToLocal(%f, %f);", xCoord, yCoord));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.globalToLocal(%f, %f);", xCoord, yCoord));
            js.setLength(0);
        }
    }

    private String group;

    public void setGroup(String group) {
        this.group = group;

        js.append(String.format(Locale.US, "chart.group(%s);", group));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.group(%s);", group));
            js.setLength(0);
        }
    }

    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private Boolean patternFillOrType4;
    private String color1;
    private Double thickness1;
    private Double size;

    public void setHatchfill(PatternFill patternFillOrType, String color1, Double thickness1, Double size) {
        this.patternFillOrType = patternFillOrType;
        this.color1 = color1;
        this.thickness1 = thickness1;
        this.size = size;

        js.append(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness1, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness1, size));
            js.setLength(0);
        }
    }


    public void setHatchfill(HatchFill patternFillOrType1, String color1, Double thickness1, Double size) {
        this.patternFillOrType1 = patternFillOrType1;
        this.color1 = color1;
        this.thickness1 = thickness1;
        this.size = size;

        js.append(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness1, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness1, size));
            js.setLength(0);
        }
    }


    public void setHatchfill(HatchFillType patternFillOrType2, String color1, Double thickness1, Double size) {
        this.patternFillOrType2 = patternFillOrType2;
        this.color1 = color1;
        this.thickness1 = thickness1;
        this.size = size;

        js.append(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness1, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness1, size));
            js.setLength(0);
        }
    }


    public void setHatchfill(String patternFillOrType3, String color1, Double thickness1, Double size) {
        this.patternFillOrType3 = patternFillOrType3;
        this.color1 = color1;
        this.thickness1 = thickness1;
        this.size = size;

        js.append(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", patternFillOrType3, color1, thickness1, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", patternFillOrType3, color1, thickness1, size));
            js.setLength(0);
        }
    }


    public void setHatchfill(Boolean patternFillOrType4, String color1, Double thickness1, Double size) {
        this.patternFillOrType4 = patternFillOrType4;
        this.color1 = color1;
        this.thickness1 = thickness1;
        this.size = size;

        js.append(String.format(Locale.US, "chart.hatchFill(%b, %s, %f, %f);", patternFillOrType4, color1, thickness1, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%b, %s, %f, %f);", patternFillOrType4, color1, thickness1, size));
            js.setLength(0);
        }
    }

    private HatchFillType[] hatchFillPalette;
    private HatchFills hatchFillPalette1;

    public void setHatchfillpalette(HatchFillType[] hatchFillPalette) {
        this.hatchFillPalette = hatchFillPalette;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", arrayToString(hatchFillPalette)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", arrayToString(hatchFillPalette)));
            js.setLength(0);
        }
    }


    public void setHatchfillpalette(HatchFills hatchFillPalette1) {
        this.hatchFillPalette1 = hatchFillPalette1;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", (hatchFillPalette1 != null) ? hatchFillPalette1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", (hatchFillPalette1 != null) ? hatchFillPalette1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double height2;
    private String height3;

    public void setHeight(Double height2) {
        this.height2 = height2;

        js.append(String.format(Locale.US, "chart.height(%f);", height2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.height(%f);", height2));
            js.setLength(0);
        }
    }


    public void setHeight(String height3) {
        this.height3 = height3;

        js.append(String.format(Locale.US, "chart.height(%s);", height3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.height(%s);", height3));
            js.setLength(0);
        }
    }

    private Double index1;

    public void setHover(Double index1) {
        this.index1 = index1;

        js.append(String.format(Locale.US, "chart.hover(%f);", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hover(%f);", index1));
            js.setLength(0);
        }
    }

    private Fill fillFunction;

    public void setHoverfill(Fill fillFunction) {
        this.fillFunction = fillFunction;

        js.append(String.format(Locale.US, "chart.hoverFill(%s);", (fillFunction != null) ? fillFunction.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s);", (fillFunction != null) ? fillFunction.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Fill hoverFill;
    private String color2;
    private Double opacity3;

    public void setHoverfill(String color2, Double opacity3) {
        this.color2 = color2;
        this.opacity3 = opacity3;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %f);", color2, opacity3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %f);", color2, opacity3));
            js.setLength(0);
        }
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode3;
    private Rect mode4;
    private Double opacity4;

    public void setHoverfill(GradientKey[] keys4, Boolean mode3, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode3 = mode3;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %b, %f, %f);", arrayToString(keys4), mode3, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %b, %f, %f);", arrayToString(keys4), mode3, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setHoverfill(GradientKey[] keys4, Rect mode4, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode4 = mode4;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %s, %f, %f);", arrayToString(keys4), (mode4 != null) ? mode4.generateJs() : "null", angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %s, %f, %f);", arrayToString(keys4), (mode4 != null) ? mode4.generateJs() : "null", angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setHoverfill(String[] keys5, Boolean mode3, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode3 = mode3;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode3, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode3, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setHoverfill(String[] keys5, Rect mode4, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode4 = mode4;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode4 != null) ? mode4.generateJs() : "null", angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode4 != null) ? mode4.generateJs() : "null", angle1, opacity4));
            js.setLength(0);
        }
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private Rect mode5;
    private Double opacity5;
    private Double fx1;
    private Double fy1;

    public void setHoverfill(GradientKey[] keys6, Double cx1, Double cy1, Rect mode5, Double opacity5, Double fx1, Double fy1) {
        this.keys6 = keys6;
        this.cx1 = cx1;
        this.cy1 = cy1;
        this.mode5 = mode5;
        this.opacity5 = opacity5;
        this.fx1 = fx1;
        this.fy1 = fy1;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode5 != null) ? mode5.generateJs() : "null", opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode5 != null) ? mode5.generateJs() : "null", opacity5, fx1, fy1));
            js.setLength(0);
        }
    }


    public void setHoverfill(String[] keys7, Double cx1, Double cy1, Rect mode5, Double opacity5, Double fx1, Double fy1) {
        this.keys7 = keys7;
        this.cx1 = cx1;
        this.cy1 = cy1;
        this.mode5 = mode5;
        this.opacity5 = opacity5;
        this.fx1 = fx1;
        this.fy1 = fy1;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode5 != null) ? mode5.generateJs() : "null", opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode5 != null) ? mode5.generateJs() : "null", opacity5, fx1, fy1));
            js.setLength(0);
        }
    }

    private Fill imageSettings1;
    private PatternFill patternFillOrType5;
    private HatchFill patternFillOrType6;
    private HatchFillType patternFillOrType7;
    private String patternFillOrType8;
    private Boolean patternFillOrType9;
    private String color3;
    private Double thickness2;
    private Double size1;

    public void setHoverhatchfill(PatternFill patternFillOrType5, String color3, Double thickness2, Double size1) {
        this.patternFillOrType5 = patternFillOrType5;
        this.color3 = color3;
        this.thickness2 = thickness2;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null", color3, thickness2, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null", color3, thickness2, size1));
            js.setLength(0);
        }
    }


    public void setHoverhatchfill(HatchFill patternFillOrType6, String color3, Double thickness2, Double size1) {
        this.patternFillOrType6 = patternFillOrType6;
        this.color3 = color3;
        this.thickness2 = thickness2;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null", color3, thickness2, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null", color3, thickness2, size1));
            js.setLength(0);
        }
    }


    public void setHoverhatchfill(HatchFillType patternFillOrType7, String color3, Double thickness2, Double size1) {
        this.patternFillOrType7 = patternFillOrType7;
        this.color3 = color3;
        this.thickness2 = thickness2;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType7 != null) ? patternFillOrType7.generateJs() : "null", color3, thickness2, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType7 != null) ? patternFillOrType7.generateJs() : "null", color3, thickness2, size1));
            js.setLength(0);
        }
    }


    public void setHoverhatchfill(String patternFillOrType8, String color3, Double thickness2, Double size1) {
        this.patternFillOrType8 = patternFillOrType8;
        this.color3 = color3;
        this.thickness2 = thickness2;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", patternFillOrType8, color3, thickness2, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", patternFillOrType8, color3, thickness2, size1));
            js.setLength(0);
        }
    }


    public void setHoverhatchfill(Boolean patternFillOrType9, String color3, Double thickness2, Double size1) {
        this.patternFillOrType9 = patternFillOrType9;
        this.color3 = color3;
        this.thickness2 = thickness2;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hoverHatchFill(%b, %s, %f, %f);", patternFillOrType9, color3, thickness2, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverHatchFill(%b, %s, %f, %f);", patternFillOrType9, color3, thickness2, size1));
            js.setLength(0);
        }
    }

    private Boolean hoverLabels;

    public void setHoverlabels(Boolean hoverLabels) {
        this.hoverLabels = hoverLabels;

        js.append(String.format(Locale.US, "chart.hoverLabels(%b);", hoverLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverLabels(%b);", hoverLabels));
            js.setLength(0);
        }
    }

    private Stroke hoverStroke;
    private ColoredFill hoverStroke1;
    private String hoverStroke2;
    private Double thickness3;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setHoverstroke(Stroke hoverStroke, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.hoverStroke = hoverStroke;
        this.thickness3 = thickness3;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.hoverStroke(%s, %f, %s, %s, %s);", (hoverStroke != null) ? hoverStroke.generateJs() : "null", thickness3, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverStroke(%s, %f, %s, %s, %s);", (hoverStroke != null) ? hoverStroke.generateJs() : "null", thickness3, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setHoverstroke(ColoredFill hoverStroke1, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.hoverStroke1 = hoverStroke1;
        this.thickness3 = thickness3;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.hoverStroke(%s, %f, %s, %s, %s);", (hoverStroke1 != null) ? hoverStroke1.generateJs() : "null", thickness3, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverStroke(%s, %f, %s, %s, %s);", (hoverStroke1 != null) ? hoverStroke1.generateJs() : "null", thickness3, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setHoverstroke(String hoverStroke2, Double thickness3, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.hoverStroke2 = hoverStroke2;
        this.thickness3 = thickness3;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.hoverStroke(%s, %f, %s, %s, %s);", hoverStroke2, thickness3, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverStroke(%s, %f, %s, %s, %s);", hoverStroke2, thickness3, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String innerRadius;
    private Double innerRadius1;

    public void setInnerradius(String innerRadius) {
        this.innerRadius = innerRadius;

        js.append(String.format(Locale.US, "chart.innerRadius(%s);", innerRadius));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.innerRadius(%s);", innerRadius));
            js.setLength(0);
        }
    }


    public void setInnerradius(Double innerRadius1) {
        this.innerRadius1 = innerRadius1;

        js.append(String.format(Locale.US, "chart.innerRadius(%f);", innerRadius1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.innerRadius(%f);", innerRadius1));
            js.setLength(0);
        }
    }

    private Double insideLabelsOffset;
    private String insideLabelsOffset1;

    public void setInsidelabelsoffset(Double insideLabelsOffset) {
        this.insideLabelsOffset = insideLabelsOffset;

        js.append(String.format(Locale.US, "chart.insideLabelsOffset(%f);", insideLabelsOffset));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.insideLabelsOffset(%f);", insideLabelsOffset));
            js.setLength(0);
        }
    }


    public void setInsidelabelsoffset(String insideLabelsOffset1) {
        this.insideLabelsOffset1 = insideLabelsOffset1;

        js.append(String.format(Locale.US, "chart.insideLabelsOffset(%s);", insideLabelsOffset1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.insideLabelsOffset(%s);", insideLabelsOffset1));
            js.setLength(0);
        }
    }

    private HoverMode interactivity;

    public void setInteractivity(HoverMode interactivity) {
        this.interactivity = interactivity;

        js.append(String.format(Locale.US, "chart.interactivity(%s);", (interactivity != null) ? interactivity.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.interactivity(%s);", (interactivity != null) ? interactivity.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String index2;
    private Double index3;

    public void setLabel(String index2) {
        this.index2 = index2;

        js.append(String.format(Locale.US, "chart.label(%s);", index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s);", index2));
            js.setLength(0);
        }
    }


    public void setLabel(Double index3) {
        this.index3 = index3;

        js.append(String.format(Locale.US, "chart.label(%f);", index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f);", index3));
            js.setLength(0);
        }
    }

    private Boolean label;
    private String label1;

    public void setLabel(Boolean label) {
        this.label = label;

        js.append(String.format(Locale.US, "chart.label(%b);", label));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%b);", label));
            js.setLength(0);
        }
    }

    private String index4;
    private Double index5;
    private Boolean label2;
    private String label3;

    public void setLabel(String index4, Boolean label2) {
        this.index4 = index4;
        this.label2 = label2;

        js.append(String.format(Locale.US, "chart.label(%s, %b);", index4, label2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %b);", index4, label2));
            js.setLength(0);
        }
    }


    public void setLabel(String index4, String label3) {
        this.index4 = index4;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%s, %s);", index4, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %s);", index4, label3));
            js.setLength(0);
        }
    }


    public void setLabel(Double index5, Boolean label2) {
        this.index5 = index5;
        this.label2 = label2;

        js.append(String.format(Locale.US, "chart.label(%f, %b);", index5, label2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %b);", index5, label2));
            js.setLength(0);
        }
    }


    public void setLabel(Double index5, String label3) {
        this.index5 = index5;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%f, %s);", index5, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %s);", index5, label3));
            js.setLength(0);
        }
    }

    private Boolean labels;

    public void setLabels(Boolean labels) {
        this.labels = labels;

        js.append(String.format(Locale.US, "chart.labels(%b);", labels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.labels(%b);", labels));
            js.setLength(0);
        }
    }

    private Double left;
    private String left1;

    public void setLeft(Double left) {
        this.left = left;

        js.append(String.format(Locale.US, "chart.left(%f);", left));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.left(%f);", left));
            js.setLength(0);
        }
    }


    public void setLeft(String left1) {
        this.left1 = left1;

        js.append(String.format(Locale.US, "chart.left(%s);", left1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.left(%s);", left1));
            js.setLength(0);
        }
    }

    private Boolean legend;

    public void setLegend(Boolean legend) {
        this.legend = legend;

        js.append(String.format(Locale.US, "chart.legend(%b);", legend));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.legend(%b);", legend));
            js.setLength(0);
        }
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;

        js.append(String.format(Locale.US, "chart.listen(%s, %b);", type, useCapture));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.listen(%s, %b);", type, useCapture));
            js.setLength(0);
        }
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type1 = type1;
        this.useCapture1 = useCapture1;

        js.append(String.format(Locale.US, "chart.listenOnce(%s, %b);", type1, useCapture1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.listenOnce(%s, %b);", type1, useCapture1));
            js.setLength(0);
        }
    }

    private Double xCoord1;
    private Double yCoord1;

    public void setLocaltoglobal(Double xCoord1, Double yCoord1) {
        this.xCoord1 = xCoord1;
        this.yCoord1 = yCoord1;

        js.append(String.format(Locale.US, "chart.localToGlobal(%f, %f);", xCoord1, yCoord1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.localToGlobal(%f, %f);", xCoord1, yCoord1));
            js.setLength(0);
        }
    }

    private Double[] margin;
    private String[] margin1;

    public void setMargin(Double[] margin) {
        this.margin = margin;

        js.append(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin)));
            js.setLength(0);
        }
    }


    public void setMargin(String[] margin1) {
        this.margin1 = margin1;

        js.append(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s);", Arrays.toString(margin1)));
            js.setLength(0);
        }
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    public void setMargin(String value6, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        this.value6 = value6;
        this.value = value;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;

        js.append(String.format(Locale.US, "chart.margin(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));
            js.setLength(0);
        }
    }


    public void setMargin(Double value7, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        this.value7 = value7;
        this.value = value;
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
        this.value5 = value5;

        js.append(String.format(Locale.US, "chart.margin(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));
            js.setLength(0);
        }
    }

    private Double maxHeight;
    private String maxHeight1;

    public void setMaxheight(Double maxHeight) {
        this.maxHeight = maxHeight;

        js.append(String.format(Locale.US, "chart.maxHeight(%f);", maxHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxHeight(%f);", maxHeight));
            js.setLength(0);
        }
    }


    public void setMaxheight(String maxHeight1) {
        this.maxHeight1 = maxHeight1;

        js.append(String.format(Locale.US, "chart.maxHeight(%s);", maxHeight1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxHeight(%s);", maxHeight1));
            js.setLength(0);
        }
    }

    private Double maxWidth;
    private String maxWidth1;

    public void setMaxwidth(Double maxWidth) {
        this.maxWidth = maxWidth;

        js.append(String.format(Locale.US, "chart.maxWidth(%f);", maxWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxWidth(%f);", maxWidth));
            js.setLength(0);
        }
    }


    public void setMaxwidth(String maxWidth1) {
        this.maxWidth1 = maxWidth1;

        js.append(String.format(Locale.US, "chart.maxWidth(%s);", maxWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxWidth(%s);", maxWidth1));
            js.setLength(0);
        }
    }

    private Double minHeight;
    private String minHeight1;

    public void setMinheight(Double minHeight) {
        this.minHeight = minHeight;

        js.append(String.format(Locale.US, "chart.minHeight(%f);", minHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minHeight(%f);", minHeight));
            js.setLength(0);
        }
    }


    public void setMinheight(String minHeight1) {
        this.minHeight1 = minHeight1;

        js.append(String.format(Locale.US, "chart.minHeight(%s);", minHeight1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minHeight(%s);", minHeight1));
            js.setLength(0);
        }
    }

    private Double minWidth;
    private String minWidth1;

    public void setMinwidth(Double minWidth) {
        this.minWidth = minWidth;

        js.append(String.format(Locale.US, "chart.minWidth(%f);", minWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minWidth(%f);", minWidth));
            js.setLength(0);
        }
    }


    public void setMinwidth(String minWidth1) {
        this.minWidth1 = minWidth1;

        js.append(String.format(Locale.US, "chart.minWidth(%s);", minWidth1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minWidth(%s);", minWidth1));
            js.setLength(0);
        }
    }

    private Double outsideLabelsCriticalAngle;
    private String outsideLabelsCriticalAngle1;

    public void setOutsidelabelscriticalangle(Double outsideLabelsCriticalAngle) {
        this.outsideLabelsCriticalAngle = outsideLabelsCriticalAngle;

        js.append(String.format(Locale.US, "chart.outsideLabelsCriticalAngle(%f);", outsideLabelsCriticalAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.outsideLabelsCriticalAngle(%f);", outsideLabelsCriticalAngle));
            js.setLength(0);
        }
    }


    public void setOutsidelabelscriticalangle(String outsideLabelsCriticalAngle1) {
        this.outsideLabelsCriticalAngle1 = outsideLabelsCriticalAngle1;

        js.append(String.format(Locale.US, "chart.outsideLabelsCriticalAngle(%s);", outsideLabelsCriticalAngle1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.outsideLabelsCriticalAngle(%s);", outsideLabelsCriticalAngle1));
            js.setLength(0);
        }
    }

    private Double outsideLabelsSpace;
    private String outsideLabelsSpace1;

    public void setOutsidelabelsspace(Double outsideLabelsSpace) {
        this.outsideLabelsSpace = outsideLabelsSpace;

        js.append(String.format(Locale.US, "chart.outsideLabelsSpace(%f);", outsideLabelsSpace));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.outsideLabelsSpace(%f);", outsideLabelsSpace));
            js.setLength(0);
        }
    }


    public void setOutsidelabelsspace(String outsideLabelsSpace1) {
        this.outsideLabelsSpace1 = outsideLabelsSpace1;

        js.append(String.format(Locale.US, "chart.outsideLabelsSpace(%s);", outsideLabelsSpace1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.outsideLabelsSpace(%s);", outsideLabelsSpace1));
            js.setLength(0);
        }
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private Boolean overlapMode2;

    public void setOverlapmode(LabelsOverlapMode overlapMode) {
        this.overlapMode = overlapMode;

        js.append(String.format(Locale.US, "chart.overlapMode(%s);", (overlapMode != null) ? overlapMode.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.overlapMode(%s);", (overlapMode != null) ? overlapMode.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setOverlapmode(String overlapMode1) {
        this.overlapMode1 = overlapMode1;

        js.append(String.format(Locale.US, "chart.overlapMode(%s);", overlapMode1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.overlapMode(%s);", overlapMode1));
            js.setLength(0);
        }
    }


    public void setOverlapmode(Boolean overlapMode2) {
        this.overlapMode2 = overlapMode2;

        js.append(String.format(Locale.US, "chart.overlapMode(%b);", overlapMode2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.overlapMode(%b);", overlapMode2));
            js.setLength(0);
        }
    }

    private Double[] padding;
    private String[] padding1;

    public void setPadding(Double[] padding) {
        this.padding = padding;

        js.append(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding)));
            js.setLength(0);
        }
    }


    public void setPadding(String[] padding1) {
        this.padding1 = padding1;

        js.append(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s);", Arrays.toString(padding1)));
            js.setLength(0);
        }
    }

    private String value8;
    private Double value9;
    private String value10;
    private Double value11;
    private String value12;
    private Double value13;
    private String value14;
    private Double value15;

    public void setPadding(String value14, String value8, Double value9, String value10, Double value11, String value12, Double value13) {
        this.value14 = value14;
        this.value8 = value8;
        this.value9 = value9;
        this.value10 = value10;
        this.value11 = value11;
        this.value12 = value12;
        this.value13 = value13;

        js.append(String.format(Locale.US, "chart.padding(%s, %s, %f, %s, %f, %s, %f);", value14, value8, value9, value10, value11, value12, value13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %s, %f, %s, %f, %s, %f);", value14, value8, value9, value10, value11, value12, value13));
            js.setLength(0);
        }
    }


    public void setPadding(Double value15, String value8, Double value9, String value10, Double value11, String value12, Double value13) {
        this.value15 = value15;
        this.value8 = value8;
        this.value9 = value9;
        this.value10 = value10;
        this.value11 = value11;
        this.value12 = value12;
        this.value13 = value13;

        js.append(String.format(Locale.US, "chart.padding(%f, %s, %f, %s, %f, %s, %f);", value15, value8, value9, value10, value11, value12, value13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %s, %f, %s, %f, %s, %f);", value15, value8, value9, value10, value11, value12, value13));
            js.setLength(0);
        }
    }

    private RangeColors palette;
    private DistinctColors palette1;
    private String[] palette2;

    public void setPalette(RangeColors palette) {
        this.palette = palette;

        js.append(String.format(Locale.US, "chart.palette(%s);", (palette != null) ? palette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", (palette != null) ? palette.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setPalette(DistinctColors palette1) {
        this.palette1 = palette1;

        js.append(String.format(Locale.US, "chart.palette(%s);", (palette1 != null) ? palette1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", (palette1 != null) ? palette1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setPalette(String[] palette2) {
        this.palette2 = palette2;

        js.append(String.format(Locale.US, "chart.palette(%s);", Arrays.toString(palette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", Arrays.toString(palette2)));
            js.setLength(0);
        }
    }

    private PaperSize paperSizeOrOptions;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        this.paperSizeOrOptions = paperSizeOrOptions;
        this.landscape = landscape;

        js.append(String.format(Locale.US, "chart.print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
            js.setLength(0);
        }
    }

    private String radius;
    private Double radius1;

    public void setRadius(String radius) {
        this.radius = radius;

        js.append(String.format(Locale.US, "chart.radius(%s);", radius));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.radius(%s);", radius));
            js.setLength(0);
        }
    }


    public void setRadius(Double radius1) {
        this.radius1 = radius1;

        js.append(String.format(Locale.US, "chart.radius(%f);", radius1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.radius(%f);", radius1));
            js.setLength(0);
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type2 = type2;

        js.append(String.format(Locale.US, "chart.removeAllListeners(%s);", type2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeAllListeners(%s);", type2));
            js.setLength(0);
        }
    }

    private Double right;
    private String right1;

    public void setRight(Double right) {
        this.right = right;

        js.append(String.format(Locale.US, "chart.right(%f);", right));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.right(%f);", right));
            js.setLength(0);
        }
    }


    public void setRight(String right1) {
        this.right1 = right1;

        js.append(String.format(Locale.US, "chart.right(%s);", right1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.right(%s);", right1));
            js.setLength(0);
        }
    }

    private String chartDataExportMode;
    private ChartDataExportMode chartDataExportMode1;
    private String csvSettings2;
    private String filename;

    public void setSaveascsv(String chartDataExportMode, String csvSettings2, String filename) {
        this.chartDataExportMode = chartDataExportMode;
        this.csvSettings2 = csvSettings2;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings2, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings2, filename));
            js.setLength(0);
        }
    }


    public void setSaveascsv(ChartDataExportMode chartDataExportMode1, String csvSettings2, String filename) {
        this.chartDataExportMode1 = chartDataExportMode1;
        this.csvSettings2 = csvSettings2;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings2, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings2, filename));
            js.setLength(0);
        }
    }

    private Double width2;
    private Double height4;
    private Double quality;
    private Boolean forceTransparentWhite;
    private String filename1;

    public void setSaveasjpg(Double width2, Double height4, Double quality, Boolean forceTransparentWhite, String filename1) {
        this.width2 = width2;
        this.height4 = height4;
        this.quality = quality;
        this.forceTransparentWhite = forceTransparentWhite;
        this.filename1 = filename1;

        js.append(String.format(Locale.US, "chart.saveAsJpg(%f, %f, %f, %b, %s);", width2, height4, quality, forceTransparentWhite, filename1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJpg(%f, %f, %f, %b, %s);", width2, height4, quality, forceTransparentWhite, filename1));
            js.setLength(0);
        }
    }

    private Boolean includeTheme;
    private String filename2;

    public void setSaveasjson(Boolean includeTheme, String filename2) {
        this.includeTheme = includeTheme;
        this.filename2 = filename2;

        js.append(String.format(Locale.US, "chart.saveAsJson(%b, %s);", includeTheme, filename2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJson(%b, %s);", includeTheme, filename2));
            js.setLength(0);
        }
    }

    private Double paperSizeOrWidthOrOptions;
    private String paperSizeOrWidthOrOptions1;
    private Boolean landscape1;
    private Double x2;
    private Double y2;
    private String filename3;

    public void setSaveaspdf(Double paperSizeOrWidthOrOptions, Boolean landscape1, Double x2, Double y2, String filename3) {
        this.paperSizeOrWidthOrOptions = paperSizeOrWidthOrOptions;
        this.landscape1 = landscape1;
        this.x2 = x2;
        this.y2 = y2;
        this.filename3 = filename3;

        js.append(String.format(Locale.US, "chart.saveAsPdf(%f, %b, %f, %f, %s);", paperSizeOrWidthOrOptions, landscape1, x2, y2, filename3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPdf(%f, %b, %f, %f, %s);", paperSizeOrWidthOrOptions, landscape1, x2, y2, filename3));
            js.setLength(0);
        }
    }


    public void setSaveaspdf(String paperSizeOrWidthOrOptions1, Boolean landscape1, Double x2, Double y2, String filename3) {
        this.paperSizeOrWidthOrOptions1 = paperSizeOrWidthOrOptions1;
        this.landscape1 = landscape1;
        this.x2 = x2;
        this.y2 = y2;
        this.filename3 = filename3;

        js.append(String.format(Locale.US, "chart.saveAsPdf(%s, %b, %f, %f, %s);", paperSizeOrWidthOrOptions1, landscape1, x2, y2, filename3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPdf(%s, %b, %f, %f, %s);", paperSizeOrWidthOrOptions1, landscape1, x2, y2, filename3));
            js.setLength(0);
        }
    }

    private Double width3;
    private Double height5;
    private Double quality1;
    private String filename4;

    public void setSaveaspng(Double width3, Double height5, Double quality1, String filename4) {
        this.width3 = width3;
        this.height5 = height5;
        this.quality1 = quality1;
        this.filename4 = filename4;

        js.append(String.format(Locale.US, "chart.saveAsPng(%f, %f, %f, %s);", width3, height5, quality1, filename4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPng(%f, %f, %f, %s);", width3, height5, quality1, filename4));
            js.setLength(0);
        }
    }

    private String paperSize;
    private Boolean landscape2;
    private String filename5;

    public void setSaveassvg(String paperSize, Boolean landscape2, String filename5) {
        this.paperSize = paperSize;
        this.landscape2 = landscape2;
        this.filename5 = filename5;

        js.append(String.format(Locale.US, "chart.saveAsSvg(%s, %b, %s);", paperSize, landscape2, filename5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsSvg(%s, %b, %s);", paperSize, landscape2, filename5));
            js.setLength(0);
        }
    }

    private Double width4;
    private Double height6;

    public void setSaveassvg(Double width4, Double height6) {
        this.width4 = width4;
        this.height6 = height6;

        js.append(String.format(Locale.US, "chart.saveAsSvg(%f, %f);", width4, height6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsSvg(%f, %f);", width4, height6));
            js.setLength(0);
        }
    }

    private String chartDataExportMode2;
    private ChartDataExportMode chartDataExportMode3;
    private String filename6;

    public void setSaveasxlsx(String chartDataExportMode2, String filename6) {
        this.chartDataExportMode2 = chartDataExportMode2;
        this.filename6 = filename6;

        js.append(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", chartDataExportMode2, filename6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", chartDataExportMode2, filename6));
            js.setLength(0);
        }
    }


    public void setSaveasxlsx(ChartDataExportMode chartDataExportMode3, String filename6) {
        this.chartDataExportMode3 = chartDataExportMode3;
        this.filename6 = filename6;

        js.append(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null", filename6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null", filename6));
            js.setLength(0);
        }
    }

    private Boolean includeTheme1;
    private String filename7;

    public void setSaveasxml(Boolean includeTheme1, String filename7) {
        this.includeTheme1 = includeTheme1;
        this.filename7 = filename7;

        js.append(String.format(Locale.US, "chart.saveAsXml(%b, %s);", includeTheme1, filename7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXml(%b, %s);", includeTheme1, filename7));
            js.setLength(0);
        }
    }

    private Fill selectMarqueeFill;

    public void setSelectmarqueefill(Fill selectMarqueeFill) {
        this.selectMarqueeFill = selectMarqueeFill;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color4;
    private Double opacity6;

    public void setSelectmarqueefill(String color4, Double opacity6) {
        this.color4 = color4;
        this.opacity6 = opacity6;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color4, opacity6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color4, opacity6));
            js.setLength(0);
        }
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode6;
    private Rect mode7;
    private Double opacity7;

    public void setSelectmarqueefill(GradientKey[] keys8, Boolean mode6, Double angle2, Double opacity7) {
        this.keys8 = keys8;
        this.mode6 = mode6;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys8), mode6, angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys8), mode6, angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys8, Rect mode7, Double angle2, Double opacity7) {
        this.keys8 = keys8;
        this.mode7 = mode7;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys8), (mode7 != null) ? mode7.generateJs() : "null", angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys8), (mode7 != null) ? mode7.generateJs() : "null", angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys9, Boolean mode6, Double angle2, Double opacity7) {
        this.keys9 = keys9;
        this.mode6 = mode6;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys9), mode6, angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys9), mode6, angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys9, Rect mode7, Double angle2, Double opacity7) {
        this.keys9 = keys9;
        this.mode7 = mode7;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys9), (mode7 != null) ? mode7.generateJs() : "null", angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys9), (mode7 != null) ? mode7.generateJs() : "null", angle2, opacity7));
            js.setLength(0);
        }
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private Rect mode8;
    private Double opacity8;
    private Double fx2;
    private Double fy2;

    public void setSelectmarqueefill(GradientKey[] keys10, Double cx2, Double cy2, Rect mode8, Double opacity8, Double fx2, Double fy2) {
        this.keys10 = keys10;
        this.cx2 = cx2;
        this.cy2 = cy2;
        this.mode8 = mode8;
        this.opacity8 = opacity8;
        this.fx2 = fx2;
        this.fy2 = fy2;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys10), cx2, cy2, (mode8 != null) ? mode8.generateJs() : "null", opacity8, fx2, fy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys10), cx2, cy2, (mode8 != null) ? mode8.generateJs() : "null", opacity8, fx2, fy2));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys11, Double cx2, Double cy2, Rect mode8, Double opacity8, Double fx2, Double fy2) {
        this.keys11 = keys11;
        this.cx2 = cx2;
        this.cy2 = cy2;
        this.mode8 = mode8;
        this.opacity8 = opacity8;
        this.fx2 = fx2;
        this.fy2 = fy2;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys11), cx2, cy2, (mode8 != null) ? mode8.generateJs() : "null", opacity8, fx2, fy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys11), cx2, cy2, (mode8 != null) ? mode8.generateJs() : "null", opacity8, fx2, fy2));
            js.setLength(0);
        }
    }

    private Fill imageSettings2;
    private Stroke color5;
    private ColoredFill color6;
    private String color7;
    private Double thickness4;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    public void setSelectmarqueestroke(Stroke color5, Double thickness4, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.color5 = color5;
        this.thickness4 = thickness4;
        this.dashpattern2 = dashpattern2;
        this.lineJoin2 = lineJoin2;
        this.lineCap2 = lineCap2;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color5 != null) ? color5.generateJs() : "null", thickness4, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color5 != null) ? color5.generateJs() : "null", thickness4, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(ColoredFill color6, Double thickness4, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.color6 = color6;
        this.thickness4 = thickness4;
        this.dashpattern2 = dashpattern2;
        this.lineJoin2 = lineJoin2;
        this.lineCap2 = lineCap2;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color6 != null) ? color6.generateJs() : "null", thickness4, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color6 != null) ? color6.generateJs() : "null", thickness4, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(String color7, Double thickness4, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.color7 = color7;
        this.thickness4 = thickness4;
        this.dashpattern2 = dashpattern2;
        this.lineJoin2 = lineJoin2;
        this.lineCap2 = lineCap2;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color7, thickness4, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color7, thickness4, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Sort sort;
    private String sort1;

    public void setSort(Sort sort) {
        this.sort = sort;

        js.append(String.format(Locale.US, "chart.sort(%s);", (sort != null) ? sort.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.sort(%s);", (sort != null) ? sort.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSort(String sort1) {
        this.sort1 = sort1;

        js.append(String.format(Locale.US, "chart.sort(%s);", sort1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.sort(%s);", sort1));
            js.setLength(0);
        }
    }

    private String startAngle;
    private Double startAngle1;

    public void setStartangle(String startAngle) {
        this.startAngle = startAngle;

        js.append(String.format(Locale.US, "chart.startAngle(%s);", startAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.startAngle(%s);", startAngle));
            js.setLength(0);
        }
    }


    public void setStartangle(Double startAngle1) {
        this.startAngle1 = startAngle1;

        js.append(String.format(Locale.US, "chart.startAngle(%f);", startAngle1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.startAngle(%f);", startAngle1));
            js.setLength(0);
        }
    }

    private Boolean repeat;

    public void setStartselectmarquee(Boolean repeat) {
        this.repeat = repeat;

        js.append(String.format(Locale.US, "chart.startSelectMarquee(%b);", repeat));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.startSelectMarquee(%b);", repeat));
            js.setLength(0);
        }
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Double thickness5;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;

    public void setStroke(Stroke stroke, Double thickness5, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        this.stroke = stroke;
        this.thickness5 = thickness5;
        this.dashpattern3 = dashpattern3;
        this.lineJoin3 = lineJoin3;
        this.lineCap3 = lineCap3;

        js.append(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (stroke != null) ? stroke.generateJs() : "null", thickness5, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (stroke != null) ? stroke.generateJs() : "null", thickness5, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStroke(ColoredFill stroke1, Double thickness5, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        this.stroke1 = stroke1;
        this.thickness5 = thickness5;
        this.dashpattern3 = dashpattern3;
        this.lineJoin3 = lineJoin3;
        this.lineCap3 = lineCap3;

        js.append(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (stroke1 != null) ? stroke1.generateJs() : "null", thickness5, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (stroke1 != null) ? stroke1.generateJs() : "null", thickness5, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStroke(String stroke2, Double thickness5, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        this.stroke2 = stroke2;
        this.thickness5 = thickness5;
        this.dashpattern3 = dashpattern3;
        this.lineJoin3 = lineJoin3;
        this.lineCap3 = lineCap3;

        js.append(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", stroke2, thickness5, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", stroke2, thickness5, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean title;
    private String title1;

    public void setTitle(Boolean title) {
        this.title = title;

        js.append(String.format(Locale.US, "chart.title(%b);", title));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.title(%b);", title));
            js.setLength(0);
        }
    }


    public void setTitle(String title1) {
        this.title1 = title1;

        js.append(String.format(Locale.US, "chart.title(%s);", title1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.title(%s);", title1));
            js.setLength(0);
        }
    }

    private String chartDataExportMode4;
    private ChartDataExportMode chartDataExportMode5;
    private String csvSettings3;

    public void setTocsv(String chartDataExportMode4, String csvSettings3) {
        this.chartDataExportMode4 = chartDataExportMode4;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings3));
            js.setLength(0);
        }
    }


    public void setTocsv(ChartDataExportMode chartDataExportMode5, String csvSettings3) {
        this.chartDataExportMode5 = chartDataExportMode5;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings3));
            js.setLength(0);
        }
    }

    private Boolean stringify;
    private Boolean includeTheme2;

    public void setTojson(Boolean stringify, Boolean includeTheme2) {
        this.stringify = stringify;
        this.includeTheme2 = includeTheme2;

        js.append(String.format(Locale.US, "chart.toJson(%b, %b);", stringify, includeTheme2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toJson(%b, %b);", stringify, includeTheme2));
            js.setLength(0);
        }
    }

    private String paperSize1;
    private Boolean landscape3;

    public void setTosvg(String paperSize1, Boolean landscape3) {
        this.paperSize1 = paperSize1;
        this.landscape3 = landscape3;

        js.append(String.format(Locale.US, "chart.toSvg(%s, %b);", paperSize1, landscape3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toSvg(%s, %b);", paperSize1, landscape3));
            js.setLength(0);
        }
    }

    private Double width5;
    private Double height7;

    public void setTosvg(Double width5, Double height7) {
        this.width5 = width5;
        this.height7 = height7;

        js.append(String.format(Locale.US, "chart.toSvg(%f, %f);", width5, height7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toSvg(%f, %f);", width5, height7));
            js.setLength(0);
        }
    }

    private Boolean asXmlNode;
    private Boolean includeTheme3;

    public void setToxml(Boolean asXmlNode, Boolean includeTheme3) {
        this.asXmlNode = asXmlNode;
        this.includeTheme3 = includeTheme3;

        js.append(String.format(Locale.US, "chart.toXml(%b, %b);", asXmlNode, includeTheme3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toXml(%b, %b);", asXmlNode, includeTheme3));
            js.setLength(0);
        }
    }

    private Boolean tooltip;

    public void setTooltip(Boolean tooltip) {
        this.tooltip = tooltip;

        js.append(String.format(Locale.US, "chart.tooltip(%b);", tooltip));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.tooltip(%b);", tooltip));
            js.setLength(0);
        }
    }

    private Double top;
    private String top1;

    public void setTop(Double top) {
        this.top = top;

        js.append(String.format(Locale.US, "chart.top(%f);", top));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.top(%f);", top));
            js.setLength(0);
        }
    }


    public void setTop(String top1) {
        this.top1 = top1;

        js.append(String.format(Locale.US, "chart.top(%s);", top1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.top(%s);", top1));
            js.setLength(0);
        }
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type3 = type3;
        this.useCapture2 = useCapture2;

        js.append(String.format(Locale.US, "chart.unlisten(%s, %b);", type3, useCapture2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unlisten(%s, %b);", type3, useCapture2));
            js.setLength(0);
        }
    }

    private Double width6;
    private String width7;

    public void setWidth(Double width6) {
        this.width6 = width6;

        js.append(String.format(Locale.US, "chart.width(%f);", width6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.width(%f);", width6));
            js.setLength(0);
        }
    }


    public void setWidth(String width7) {
        this.width7 = width7;

        js.append(String.format(Locale.US, "chart.width(%s);", width7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.width(%s);", width7));
            js.setLength(0);
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;

        js.append(String.format(Locale.US, "chart.zIndex(%f);", zIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zIndex(%f);", zIndex));
            js.setLength(0);
        }
    }


}