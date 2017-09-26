package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// chart class
public class CircularGauge extends Chart {

    public CircularGauge() {
        js.append("chart = anychart.circularGauge();");
    }

    
    private Animation getanimation;

    public Animation getAnimation() {
        if (getanimation == null)
            getanimation = new Animation("chart.animation()");

        return getanimation;
    }

    private Boolean animation;
    private String animation1;

    public void setAnimation(Boolean animation) {
        this.animation = animation;

        js.append(String.format(Locale.US, "chart.animation(%b);", animation));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.animation(%b);", animation));
            js.setLength(0);
        }
    }


    public void setAnimation(String animation1) {
        this.animation1 = animation1;

        js.append(String.format(Locale.US, "chart.animation(%s);", animation1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.animation(%s);", animation1));
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

    private Circular getaxis;

    public Circular getAxis() {
        if (getaxis == null)
            getaxis = new Circular("chart.axis()");

        return getaxis;
    }

    private String axis;
    private Boolean axis1;

    public void setAxis(String axis) {
        this.axis = axis;

        js.append(String.format(Locale.US, "chart.axis(%s);", axis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.axis(%s);", axis));
            js.setLength(0);
        }
    }


    public void setAxis(Boolean axis1) {
        this.axis1 = axis1;

        js.append(String.format(Locale.US, "chart.axis(%b);", axis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.axis(%b);", axis1));
            js.setLength(0);
        }
    }

    private Double index;
    private String axis2;
    private Boolean axis3;

    public void setAxis(String axis2, Double index) {
        this.axis2 = axis2;
        this.index = index;

        js.append(String.format(Locale.US, "chart.axis(%s, %f);", axis2, index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.axis(%s, %f);", axis2, index));
            js.setLength(0);
        }
    }


    public void setAxis(Boolean axis3, Double index) {
        this.axis3 = axis3;
        this.index = index;

        js.append(String.format(Locale.US, "chart.axis(%b, %f);", axis3, index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.axis(%b, %f);", axis3, index));
            js.setLength(0);
        }
    }

    private UiBackground getbackground;

    public UiBackground getBackground() {
        if (getbackground == null)
            getbackground = new UiBackground("chart.background()");

        return getbackground;
    }

    private String background;

    public void setBackground(String background) {
        this.background = background;

        js.append(String.format(Locale.US, "chart.background(%s);", background));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.background(%s);", background));
            js.setLength(0);
        }
    }

    private Double index1;

    public void setBar(Double index1) {
        this.index1 = index1;

        js.append(String.format(Locale.US, "chart.bar(%f);", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%f);", index1));
            js.setLength(0);
        }
    }

    private String bar;
    private Boolean bar1;

    public void setBar(String bar) {
        this.bar = bar;

        js.append(String.format(Locale.US, "chart.bar(%s);", bar));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s);", bar));
            js.setLength(0);
        }
    }


    public void setBar(Boolean bar1) {
        this.bar1 = bar1;

        js.append(String.format(Locale.US, "chart.bar(%b);", bar1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%b);", bar1));
            js.setLength(0);
        }
    }

    private Double index2;
    private String bar2;
    private Boolean bar3;

    public void setBar(String bar2, Double index2) {
        this.bar2 = bar2;
        this.index2 = index2;

        js.append(String.format(Locale.US, "chart.bar(%s, %f);", bar2, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %f);", bar2, index2));
            js.setLength(0);
        }
    }


    public void setBar(Boolean bar3, Double index2) {
        this.bar3 = bar3;
        this.index2 = index2;

        js.append(String.format(Locale.US, "chart.bar(%b, %f);", bar3, index2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%b, %f);", bar3, index2));
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

    private Bounds getbounds;

    public Bounds getBounds() {
        if (getbounds == null)
            getbounds = new Bounds("chart.bounds()");

        return getbounds;
    }

    private RectObj bounds;
    private AnychartMathRect bounds1;
    private Bounds bounds2;

    public void setBounds(RectObj bounds) {
        this.bounds = bounds;

        js.append(String.format(Locale.US, "chart.bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBounds(AnychartMathRect bounds1) {
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

    private Cap getcap;

    public Cap getCap() {
        if (getcap == null)
            getcap = new Cap("chart.cap()");

        return getcap;
    }

    private String cap;
    private Boolean cap1;

    public void setCap(String cap) {
        this.cap = cap;

        js.append(String.format(Locale.US, "chart.cap(%s);", cap));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.cap(%s);", cap));
            js.setLength(0);
        }
    }


    public void setCap(Boolean cap1) {
        this.cap1 = cap1;

        js.append(String.format(Locale.US, "chart.cap(%b);", cap1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.cap(%b);", cap1));
            js.setLength(0);
        }
    }

    private Double circularPadding;
    private String circularPadding1;

    public void setCircularpadding(Double circularPadding) {
        this.circularPadding = circularPadding;

        js.append(String.format(Locale.US, "chart.circularPadding(%f);", circularPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.circularPadding(%f);", circularPadding));
            js.setLength(0);
        }
    }


    public void setCircularpadding(String circularPadding1) {
        this.circularPadding1 = circularPadding1;

        js.append(String.format(Locale.US, "chart.circularPadding(%s);", circularPadding1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.circularPadding(%s);", circularPadding1));
            js.setLength(0);
        }
    }

    private Layer getcontainer;

    public Layer getContainer() {
        if (getcontainer == null)
            getcontainer = new Layer("chart.container()");

        return getcontainer;
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

    private ContextMenu getcontextMenu;

    public ContextMenu getContextmenu() {
        if (getcontextMenu == null)
            getcontextMenu = new ContextMenu("chart.contextMenu()");

        return getcontextMenu;
    }

    private String contextMenu;
    private Boolean contextMenu1;

    public void setContextmenu(String contextMenu) {
        this.contextMenu = contextMenu;

        js.append(String.format(Locale.US, "chart.contextMenu(%s);", contextMenu));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.contextMenu(%s);", contextMenu));
            js.setLength(0);
        }
    }


    public void setContextmenu(Boolean contextMenu1) {
        this.contextMenu1 = contextMenu1;

        js.append(String.format(Locale.US, "chart.contextMenu(%b);", contextMenu1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.contextMenu(%b);", contextMenu1));
            js.setLength(0);
        }
    }

    private View getdata;

    public View getData() {
        if (getdata == null)
            getdata = new View("chart.data()");

        return getdata;
    }

    private View data;
    private Set data1;
    private String[] data2;
    private String data3;
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


    public void setData(Set data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(Set data1, TextParsingSettings csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String[] data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String[] data2, TextParsingSettings csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String data3, TextParsingSettings csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
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

    private Boolean enabled1;

    public void setEnabled(Boolean enabled1) {
        this.enabled1 = enabled1;

        js.append(String.format(Locale.US, "chart.enabled(%b);", enabled1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.enabled(%b);", enabled1));
            js.setLength(0);
        }
    }

    private Boolean encloseWithStraightLine;

    public void setEnclosewithstraightline(Boolean encloseWithStraightLine) {
        this.encloseWithStraightLine = encloseWithStraightLine;

        js.append(String.format(Locale.US, "chart.encloseWithStraightLine(%b);", encloseWithStraightLine));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.encloseWithStraightLine(%b);", encloseWithStraightLine));
            js.setLength(0);
        }
    }

    private Fill fill;
    private String fill1;

    public void setFill(Fill fill) {
        this.fill = fill;

        js.append(String.format(Locale.US, "chart.fill(%s);", (fill != null) ? fill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s);", (fill != null) ? fill.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setFill(String fill1) {
        this.fill1 = fill1;

        js.append(String.format(Locale.US, "chart.fill(%s);", fill1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s);", fill1));
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
    private VectorRect mode1;
    private String mode2;
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


    public void setFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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


    public void setFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
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


    public void setFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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


    public void setFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
            js.setLength(0);
        }
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }


    public void setFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }

    private Fill imageSettings;
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

    private Double index3;

    public void setKnob(Double index3) {
        this.index3 = index3;

        js.append(String.format(Locale.US, "chart.knob(%f);", index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.knob(%f);", index3));
            js.setLength(0);
        }
    }

    private String knob;
    private Boolean knob1;

    public void setKnob(String knob) {
        this.knob = knob;

        js.append(String.format(Locale.US, "chart.knob(%s);", knob));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.knob(%s);", knob));
            js.setLength(0);
        }
    }


    public void setKnob(Boolean knob1) {
        this.knob1 = knob1;

        js.append(String.format(Locale.US, "chart.knob(%b);", knob1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.knob(%b);", knob1));
            js.setLength(0);
        }
    }

    private Double index4;
    private String knob2;
    private Boolean knob3;

    public void setKnob(String knob2, Double index4) {
        this.knob2 = knob2;
        this.index4 = index4;

        js.append(String.format(Locale.US, "chart.knob(%s, %f);", knob2, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.knob(%s, %f);", knob2, index4));
            js.setLength(0);
        }
    }


    public void setKnob(Boolean knob3, Double index4) {
        this.knob3 = knob3;
        this.index4 = index4;

        js.append(String.format(Locale.US, "chart.knob(%b, %f);", knob3, index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.knob(%b, %f);", knob3, index4));
            js.setLength(0);
        }
    }

    private String index5;
    private Double index6;

    public void setLabel(String index5) {
        this.index5 = index5;

        js.append(String.format(Locale.US, "chart.label(%s);", index5));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s);", index5));
            js.setLength(0);
        }
    }


    public void setLabel(Double index6) {
        this.index6 = index6;

        js.append(String.format(Locale.US, "chart.label(%f);", index6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f);", index6));
            js.setLength(0);
        }
    }

    private Boolean label;
    private String label1;
    private String label2;

    public void setLabel(Boolean label) {
        this.label = label;

        js.append(String.format(Locale.US, "chart.label(%b);", label));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%b);", label));
            js.setLength(0);
        }
    }

    private String index7;
    private Double index8;
    private Boolean label3;
    private String label4;
    private String label5;

    public void setLabel(String index7, Boolean label3) {
        this.index7 = index7;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%s, %b);", index7, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %b);", index7, label3));
            js.setLength(0);
        }
    }


    public void setLabel(String index7, String label4) {
        this.index7 = index7;
        this.label4 = label4;

        js.append(String.format(Locale.US, "chart.label(%s, %s);", index7, label4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %s);", index7, label4));
            js.setLength(0);
        }
    }


    public void setLabel(Double index8, Boolean label3) {
        this.index8 = index8;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%f, %b);", index8, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %b);", index8, label3));
            js.setLength(0);
        }
    }


    public void setLabel(Double index8, String label4) {
        this.index8 = index8;
        this.label4 = label4;

        js.append(String.format(Locale.US, "chart.label(%f, %s);", index8, label4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %s);", index8, label4));
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

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        this.type = type;
        this.useCapture = useCapture;
        this.listenerScope = listenerScope;

        js.append(String.format(Locale.US, "chart.listen(%s, %b, %s);", type, useCapture, listenerScope));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.listen(%s, %b, %s);", type, useCapture, listenerScope));
            js.setLength(0);
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        this.type1 = type1;
        this.useCapture1 = useCapture1;
        this.listenerScope1 = listenerScope1;

        js.append(String.format(Locale.US, "chart.listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
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

    private Margin getmargin;

    public Margin getMargin() {
        if (getmargin == null)
            getmargin = new Margin("chart.margin()");

        return getmargin;
    }

    private Double[] margin;
    private String[] margin1;
    private String margin2;

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


    public void setMargin(String margin2) {
        this.margin2 = margin2;

        js.append(String.format(Locale.US, "chart.margin(%s);", margin2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s);", margin2));
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

    private Double index9;

    public void setMarker(Double index9) {
        this.index9 = index9;

        js.append(String.format(Locale.US, "chart.marker(%f);", index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%f);", index9));
            js.setLength(0);
        }
    }

    private String marker;
    private Boolean marker1;

    public void setMarker(String marker) {
        this.marker = marker;

        js.append(String.format(Locale.US, "chart.marker(%s);", marker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s);", marker));
            js.setLength(0);
        }
    }


    public void setMarker(Boolean marker1) {
        this.marker1 = marker1;

        js.append(String.format(Locale.US, "chart.marker(%b);", marker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%b);", marker1));
            js.setLength(0);
        }
    }

    private Double index10;
    private String marker2;
    private Boolean marker3;

    public void setMarker(String marker2, Double index10) {
        this.marker2 = marker2;
        this.index10 = index10;

        js.append(String.format(Locale.US, "chart.marker(%s, %f);", marker2, index10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %f);", marker2, index10));
            js.setLength(0);
        }
    }


    public void setMarker(Boolean marker3, Double index10) {
        this.marker3 = marker3;
        this.index10 = index10;

        js.append(String.format(Locale.US, "chart.marker(%b, %f);", marker3, index10));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%b, %f);", marker3, index10));
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

    private Double index11;

    public void setNeedle(Double index11) {
        this.index11 = index11;

        js.append(String.format(Locale.US, "chart.needle(%f);", index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.needle(%f);", index11));
            js.setLength(0);
        }
    }

    private String needle;
    private Boolean needle1;

    public void setNeedle(String needle) {
        this.needle = needle;

        js.append(String.format(Locale.US, "chart.needle(%s);", needle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.needle(%s);", needle));
            js.setLength(0);
        }
    }


    public void setNeedle(Boolean needle1) {
        this.needle1 = needle1;

        js.append(String.format(Locale.US, "chart.needle(%b);", needle1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.needle(%b);", needle1));
            js.setLength(0);
        }
    }

    private Double index12;
    private String needle2;
    private Boolean needle3;

    public void setNeedle(String needle2, Double index12) {
        this.needle2 = needle2;
        this.index12 = index12;

        js.append(String.format(Locale.US, "chart.needle(%s, %f);", needle2, index12));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.needle(%s, %f);", needle2, index12));
            js.setLength(0);
        }
    }


    public void setNeedle(Boolean needle3, Double index12) {
        this.needle3 = needle3;
        this.index12 = index12;

        js.append(String.format(Locale.US, "chart.needle(%b, %f);", needle3, index12));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.needle(%b, %f);", needle3, index12));
            js.setLength(0);
        }
    }

    private UtilsPadding getpadding;

    public UtilsPadding getPadding() {
        if (getpadding == null)
            getpadding = new UtilsPadding("chart.padding()");

        return getpadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;

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


    public void setPadding(String padding2) {
        this.padding2 = padding2;

        js.append(String.format(Locale.US, "chart.padding(%s);", padding2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s);", padding2));
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

    private PaperSize paperSizeOrOptions;
    private String paperSizeOrOptions1;
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


    public void setPrint(String paperSizeOrOptions1, Boolean landscape) {
        this.paperSizeOrOptions1 = paperSizeOrOptions1;
        this.landscape = landscape;

        js.append(String.format(Locale.US, "chart.print(%s, %b);", paperSizeOrOptions1, landscape));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.print(%s, %b);", paperSizeOrOptions1, landscape));
            js.setLength(0);
        }
    }

    private Double index13;

    public void setRange(Double index13) {
        this.index13 = index13;

        js.append(String.format(Locale.US, "chart.range(%f);", index13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.range(%f);", index13));
            js.setLength(0);
        }
    }

    private String range;
    private Boolean range1;

    public void setRange(String range) {
        this.range = range;

        js.append(String.format(Locale.US, "chart.range(%s);", range));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.range(%s);", range));
            js.setLength(0);
        }
    }


    public void setRange(Boolean range1) {
        this.range1 = range1;

        js.append(String.format(Locale.US, "chart.range(%b);", range1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.range(%b);", range1));
            js.setLength(0);
        }
    }

    private Double index14;
    private String range2;
    private Boolean range3;

    public void setRange(String range2, Double index14) {
        this.range2 = range2;
        this.index14 = index14;

        js.append(String.format(Locale.US, "chart.range(%s, %f);", range2, index14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.range(%s, %f);", range2, index14));
            js.setLength(0);
        }
    }


    public void setRange(Boolean range3, Double index14) {
        this.range3 = range3;
        this.index14 = index14;

        js.append(String.format(Locale.US, "chart.range(%b, %f);", range3, index14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.range(%b, %f);", range3, index14));
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
    private String width3;
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


    public void setSaveasjpg(String width3, Double height4, Double quality, Boolean forceTransparentWhite, String filename1) {
        this.width3 = width3;
        this.height4 = height4;
        this.quality = quality;
        this.forceTransparentWhite = forceTransparentWhite;
        this.filename1 = filename1;

        js.append(String.format(Locale.US, "chart.saveAsJpg(%s, %f, %f, %b, %s);", width3, height4, quality, forceTransparentWhite, filename1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJpg(%s, %f, %f, %b, %s);", width3, height4, quality, forceTransparentWhite, filename1));
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
    private String paperSizeOrWidthOrOptions2;
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

    private Double width4;
    private String width5;
    private Double height5;
    private Double quality1;
    private String filename4;

    public void setSaveaspng(Double width4, Double height5, Double quality1, String filename4) {
        this.width4 = width4;
        this.height5 = height5;
        this.quality1 = quality1;
        this.filename4 = filename4;

        js.append(String.format(Locale.US, "chart.saveAsPng(%f, %f, %f, %s);", width4, height5, quality1, filename4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPng(%f, %f, %f, %s);", width4, height5, quality1, filename4));
            js.setLength(0);
        }
    }


    public void setSaveaspng(String width5, Double height5, Double quality1, String filename4) {
        this.width5 = width5;
        this.height5 = height5;
        this.quality1 = quality1;
        this.filename4 = filename4;

        js.append(String.format(Locale.US, "chart.saveAsPng(%s, %f, %f, %s);", width5, height5, quality1, filename4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPng(%s, %f, %f, %s);", width5, height5, quality1, filename4));
            js.setLength(0);
        }
    }

    private String paperSize;
    private String paperSize1;
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

    private Double width6;
    private Double height6;

    public void setSaveassvg(Double width6, Double height6) {
        this.width6 = width6;
        this.height6 = height6;

        js.append(String.format(Locale.US, "chart.saveAsSvg(%f, %f);", width6, height6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsSvg(%f, %f);", width6, height6));
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

    private String color1;
    private Double opacity3;

    public void setSelectmarqueefill(String color1, Double opacity3) {
        this.color1 = color1;
        this.opacity3 = opacity3;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color1, opacity3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color1, opacity3));
            js.setLength(0);
        }
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Double opacity4;

    public void setSelectmarqueefill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode4 = mode4;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys4), mode4, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys4), mode4, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode5 = mode5;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys4, String mode6, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode6 = mode6;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys4), mode6, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys4), mode6, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys5, Boolean mode4, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode4 = mode4;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode4, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode4, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys5, VectorRect mode5, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode5 = mode5;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys5, String mode6, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode6 = mode6;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys5), mode6, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys5), mode6, angle1, opacity4));
            js.setLength(0);
        }
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private GraphicsMathRect mode7;
    private Double opacity5;
    private Double fx1;
    private Double fy1;

    public void setSelectmarqueefill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        this.keys6 = keys6;
        this.cx1 = cx1;
        this.cy1 = cy1;
        this.mode7 = mode7;
        this.opacity5 = opacity5;
        this.fx1 = fx1;
        this.fy1 = fy1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        this.keys7 = keys7;
        this.cx1 = cx1;
        this.cy1 = cy1;
        this.mode7 = mode7;
        this.opacity5 = opacity5;
        this.fx1 = fx1;
        this.fy1 = fy1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));
            js.setLength(0);
        }
    }

    private Fill imageSettings1;
    private Stroke color2;
    private ColoredFill color3;
    private String color4;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setSelectmarqueestroke(Stroke color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color2 = color2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(ColoredFill color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color3 = color3;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color3 != null) ? color3.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color3 != null) ? color3.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(String color4, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color4 = color4;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color4, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color4, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
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
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setStroke(Stroke stroke, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.stroke = stroke;
        this.thickness1 = thickness1;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (stroke != null) ? stroke.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (stroke != null) ? stroke.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStroke(ColoredFill stroke1, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.stroke1 = stroke1;
        this.thickness1 = thickness1;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (stroke1 != null) ? stroke1.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (stroke1 != null) ? stroke1.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStroke(String stroke2, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.stroke2 = stroke2;
        this.thickness1 = thickness1;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", stroke2, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", stroke2, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String sweepAngle;
    private Double sweepAngle1;

    public void setSweepangle(String sweepAngle) {
        this.sweepAngle = sweepAngle;

        js.append(String.format(Locale.US, "chart.sweepAngle(%s);", sweepAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.sweepAngle(%s);", sweepAngle));
            js.setLength(0);
        }
    }


    public void setSweepangle(Double sweepAngle1) {
        this.sweepAngle1 = sweepAngle1;

        js.append(String.format(Locale.US, "chart.sweepAngle(%f);", sweepAngle1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.sweepAngle(%f);", sweepAngle1));
            js.setLength(0);
        }
    }

    private UiTitle gettitle;

    public UiTitle getTitle() {
        if (gettitle == null)
            gettitle = new UiTitle("chart.title()");

        return gettitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

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

    private String paperSize2;
    private String paperSize3;
    private Boolean landscape3;

    public void setTosvg(String paperSize2, Boolean landscape3) {
        this.paperSize2 = paperSize2;
        this.landscape3 = landscape3;

        js.append(String.format(Locale.US, "chart.toSvg(%s, %b);", paperSize2, landscape3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toSvg(%s, %b);", paperSize2, landscape3));
            js.setLength(0);
        }
    }

    private Double width7;
    private Double height7;

    public void setTosvg(Double width7, Double height7) {
        this.width7 = width7;
        this.height7 = height7;

        js.append(String.format(Locale.US, "chart.toSvg(%f, %f);", width7, height7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toSvg(%f, %f);", width7, height7));
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

    private Tooltip gettooltip;

    public Tooltip getTooltip() {
        if (gettooltip == null)
            gettooltip = new Tooltip("chart.tooltip()");

        return gettooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;

        js.append(String.format(Locale.US, "chart.tooltip(%s);", tooltip));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.tooltip(%s);", tooltip));
            js.setLength(0);
        }
    }


    public void setTooltip(Boolean tooltip1) {
        this.tooltip1 = tooltip1;

        js.append(String.format(Locale.US, "chart.tooltip(%b);", tooltip1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.tooltip(%b);", tooltip1));
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
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        this.type3 = type3;
        this.useCapture2 = useCapture2;
        this.listenerScope2 = listenerScope2;

        js.append(String.format(Locale.US, "chart.unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
            js.setLength(0);
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        this.key = key;

        js.append(String.format(Locale.US, "chart.unlistenByKey(%s);", key));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unlistenByKey(%s);", key));
            js.setLength(0);
        }
    }

    private Double width8;
    private String width9;

    public void setWidth(Double width8) {
        this.width8 = width8;

        js.append(String.format(Locale.US, "chart.width(%f);", width8));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.width(%f);", width8));
            js.setLength(0);
        }
    }


    public void setWidth(String width9) {
        this.width9 = width9;

        js.append(String.format(Locale.US, "chart.width(%s);", width9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.width(%s);", width9));
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

    private String generateJSgetanimation() {
        if (getanimation != null) {
            return getanimation.generateJs();
        }
        return "";
    }

    private String generateJSgetaxis() {
        if (getaxis != null) {
            return getaxis.generateJs();
        }
        return "";
    }

    private String generateJSgetbackground() {
        if (getbackground != null) {
            return getbackground.generateJs();
        }
        return "";
    }

    private String generateJSgetbounds() {
        if (getbounds != null) {
            return getbounds.generateJs();
        }
        return "";
    }

    private String generateJSgetcap() {
        if (getcap != null) {
            return getcap.generateJs();
        }
        return "";
    }

    private String generateJSgetcontainer() {
        if (getcontainer != null) {
            return getcontainer.generateJs();
        }
        return "";
    }

    private String generateJSgetcontextMenu() {
        if (getcontextMenu != null) {
            return getcontextMenu.generateJs();
        }
        return "";
    }

    private String generateJSgetdata() {
        if (getdata != null) {
            return getdata.generateJs();
        }
        return "";
    }

    private String generateJSgetmargin() {
        if (getmargin != null) {
            return getmargin.generateJs();
        }
        return "";
    }

    private String generateJSgetpadding() {
        if (getpadding != null) {
            return getpadding.generateJs();
        }
        return "";
    }

    private String generateJSgettitle() {
        if (gettitle != null) {
            return gettitle.generateJs();
        }
        return "";
    }

    private String generateJSgettooltip() {
        if (gettooltip != null) {
            return gettooltip.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append(generateJSgetanimation());
        js.append(generateJSgetaxis());
        js.append(generateJSgetbackground());
        js.append(generateJSgetbounds());
        js.append(generateJSgetcap());
        js.append(generateJSgetcontainer());
        js.append(generateJSgetcontextMenu());
        js.append(generateJSgetdata());
        js.append(generateJSgetmargin());
        js.append(generateJSgetpadding());
        js.append(generateJSgettitle());
        js.append(generateJSgettooltip());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}