package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// chart class
public class Venn extends Chart {

    public Venn() {
        js.append("chart = anychart.venn();");
    }

    
    private UiBackground getBackground;

    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground("chart.background()");

        return getBackground;
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

    private Bounds getBounds;

    public Bounds getBounds() {
        if (getBounds == null)
            getBounds = new Bounds("chart.bounds()");

        return getBounds;
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

    private Layer getContainer;

    public Layer getContainer() {
        if (getContainer == null)
            getContainer = new Layer("chart.container()");

        return getContainer;
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

    private ContextMenu getContextMenu;

    public ContextMenu getContextMenu() {
        if (getContextMenu == null)
            getContextMenu = new ContextMenu("chart.contextMenu()");

        return getContextMenu;
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

    private ChartCredits getCredits;

    public ChartCredits getCredits() {
        if (getCredits == null)
            getCredits = new ChartCredits("chart.credits()");

        return getCredits;
    }

    private String credits;
    private Boolean credits1;

    public void setCredits(String credits) {
        this.credits = credits;

        js.append(String.format(Locale.US, "chart.credits(%s);", credits));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.credits(%s);", credits));
            js.setLength(0);
        }
    }


    public void setCredits(Boolean credits1) {
        this.credits1 = credits1;

        js.append(String.format(Locale.US, "chart.credits(%b);", credits1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.credits(%b);", credits1));
            js.setLength(0);
        }
    }

    private View getData;

    public View getData() {
        if (getData == null)
            getData = new View("chart.data()");

        return getData;
    }

    private View data;
    private Mapping data1;
    private Set data2;
    private String[] data3;
    private String data4;
    private DataSettings data5;
    private String csvSettings;

    public void setData(View data, String csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", csvSettings));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data != null) ? data.generateJs() : "null", csvSettings));
            js.setLength(0);
        }
    }


    public void setData(Mapping data1, String csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", csvSettings));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", csvSettings));
            js.setLength(0);
        }
    }


    public void setData(Set data2, String csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data2 != null) ? data2.generateJs() : "null", csvSettings));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data2 != null) ? data2.generateJs() : "null", csvSettings));
            js.setLength(0);
        }
    }


    public void setData(String[] data3, String csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data3), csvSettings));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", Arrays.toString(data3), csvSettings));
            js.setLength(0);
        }
    }


    public void setData(String data4, String csvSettings) {
        this.data4 = data4;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", data4, csvSettings));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", data4, csvSettings));
            js.setLength(0);
        }
    }


    public void setData(DataSettings data5, String csvSettings) {
        this.data5 = data5;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.data(%s, %s);", (data5 != null) ? data5.generateJs() : "null", csvSettings));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s, %s);", (data5 != null) ? data5.generateJs() : "null", csvSettings));
            js.setLength(0);
        }
    }

    private String dataSeparator;

    public void setDataseparator(String dataSeparator) {
        this.dataSeparator = dataSeparator;

        js.append(String.format(Locale.US, "chart.dataSeparator(%s);", dataSeparator));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.dataSeparator(%s);", dataSeparator));
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

    private PatternFill getHatchFill;

    public PatternFill getHatchFill() {
        if (getHatchFill == null)
            getHatchFill = new PatternFill("chart.hatchFill()");

        return getHatchFill;
    }

    private PatternFill patternFillOrType;
    private HatchFill patternFillOrType1;
    private HatchFillType patternFillOrType2;
    private String patternFillOrType3;
    private Boolean patternFillOrType4;
    private String color1;
    private Double thickness;
    private Double size;

    public void setHatchfill(PatternFill patternFillOrType, String color1, Double thickness, Double size) {
        this.patternFillOrType = patternFillOrType;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;

        js.append(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType != null) ? patternFillOrType.generateJs() : "null", color1, thickness, size));
            js.setLength(0);
        }
    }


    public void setHatchfill(HatchFill patternFillOrType1, String color1, Double thickness, Double size) {
        this.patternFillOrType1 = patternFillOrType1;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;

        js.append(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType1 != null) ? patternFillOrType1.generateJs() : "null", color1, thickness, size));
            js.setLength(0);
        }
    }


    public void setHatchfill(HatchFillType patternFillOrType2, String color1, Double thickness, Double size) {
        this.patternFillOrType2 = patternFillOrType2;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;

        js.append(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", (patternFillOrType2 != null) ? patternFillOrType2.generateJs() : "null", color1, thickness, size));
            js.setLength(0);
        }
    }


    public void setHatchfill(String patternFillOrType3, String color1, Double thickness, Double size) {
        this.patternFillOrType3 = patternFillOrType3;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;

        js.append(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", patternFillOrType3, color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%s, %s, %f, %f);", patternFillOrType3, color1, thickness, size));
            js.setLength(0);
        }
    }


    public void setHatchfill(Boolean patternFillOrType4, String color1, Double thickness, Double size) {
        this.patternFillOrType4 = patternFillOrType4;
        this.color1 = color1;
        this.thickness = thickness;
        this.size = size;

        js.append(String.format(Locale.US, "chart.hatchFill(%b, %s, %f, %f);", patternFillOrType4, color1, thickness, size));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFill(%b, %s, %f, %f);", patternFillOrType4, color1, thickness, size));
            js.setLength(0);
        }
    }

    private HatchFills getHatchFillPalette;

    public HatchFills getHatchFillPalette() {
        if (getHatchFillPalette == null)
            getHatchFillPalette = new HatchFills("chart.hatchFillPalette()");

        return getHatchFillPalette;
    }

    private HatchFillType[] hatchFillPalette;
    private String hatchFillPalette1;
    private HatchFills hatchFillPalette2;

    public void setHatchfillpalette(HatchFillType[] hatchFillPalette) {
        this.hatchFillPalette = hatchFillPalette;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", arrayToString(hatchFillPalette)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", arrayToString(hatchFillPalette)));
            js.setLength(0);
        }
    }


    public void setHatchfillpalette(String hatchFillPalette1) {
        this.hatchFillPalette1 = hatchFillPalette1;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", hatchFillPalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", hatchFillPalette1));
            js.setLength(0);
        }
    }


    public void setHatchfillpalette(HatchFills hatchFillPalette2) {
        this.hatchFillPalette2 = hatchFillPalette2;

        js.append(String.format(Locale.US, "chart.hatchFillPalette(%s);", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hatchFillPalette(%s);", (hatchFillPalette2 != null) ? hatchFillPalette2.generateJs() : "null"));
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

    private Double index;

    public void setHover(Double index) {
        this.index = index;

        js.append(String.format(Locale.US, "chart.hover(%f);", index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hover(%f);", index));
            js.setLength(0);
        }
    }

    private Double[] indexes;

    public void setHover(Double[] indexes) {
        this.indexes = indexes;

        js.append(String.format(Locale.US, "chart.hover(%s);", Arrays.toString(indexes)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hover(%s);", Arrays.toString(indexes)));
            js.setLength(0);
        }
    }

    private Fill hoverFill;

    public void setHoverfill(Fill hoverFill) {
        this.hoverFill = hoverFill;

        js.append(String.format(Locale.US, "chart.hoverFill(%s);", (hoverFill != null) ? hoverFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s);", (hoverFill != null) ? hoverFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

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
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Double opacity4;

    public void setHoverfill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode4 = mode4;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %b, %f, %f);", arrayToString(keys4), mode4, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %b, %f, %f);", arrayToString(keys4), mode4, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setHoverfill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode5 = mode5;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %s, %f, %f);", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %s, %f, %f);", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setHoverfill(GradientKey[] keys4, String mode6, Double angle1, Double opacity4) {
        this.keys4 = keys4;
        this.mode6 = mode6;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %s, %f, %f);", arrayToString(keys4), mode6, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %s, %f, %f);", arrayToString(keys4), mode6, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setHoverfill(String[] keys5, Boolean mode4, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode4 = mode4;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode4, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode4, angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setHoverfill(String[] keys5, VectorRect mode5, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode5 = mode5;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));
            js.setLength(0);
        }
    }


    public void setHoverfill(String[] keys5, String mode6, Double angle1, Double opacity4) {
        this.keys5 = keys5;
        this.mode6 = mode6;
        this.angle1 = angle1;
        this.opacity4 = opacity4;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), mode6, angle1, opacity4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), mode6, angle1, opacity4));
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

    public void setHoverfill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        this.keys6 = keys6;
        this.cx1 = cx1;
        this.cy1 = cy1;
        this.mode7 = mode7;
        this.opacity5 = opacity5;
        this.fx1 = fx1;
        this.fy1 = fy1;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));
            js.setLength(0);
        }
    }


    public void setHoverfill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        this.keys7 = keys7;
        this.cx1 = cx1;
        this.cy1 = cy1;
        this.mode7 = mode7;
        this.opacity5 = opacity5;
        this.fx1 = fx1;
        this.fy1 = fy1;

        js.append(String.format(Locale.US, "chart.hoverFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));
            js.setLength(0);
        }
    }

    private Fill imageSettings1;
    private PatternFill getHoverHatchFill;

    public PatternFill getHoverHatchFill() {
        if (getHoverHatchFill == null)
            getHoverHatchFill = new PatternFill("chart.hoverHatchFill()");

        return getHoverHatchFill;
    }

    private PatternFill patternFillOrType5;
    private HatchFill patternFillOrType6;
    private HatchFillType patternFillOrType7;
    private String patternFillOrType8;
    private Boolean patternFillOrType9;
    private String color3;
    private Double thickness1;
    private Double size1;

    public void setHoverhatchfill(PatternFill patternFillOrType5, String color3, Double thickness1, Double size1) {
        this.patternFillOrType5 = patternFillOrType5;
        this.color3 = color3;
        this.thickness1 = thickness1;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null", color3, thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType5 != null) ? patternFillOrType5.generateJs() : "null", color3, thickness1, size1));
            js.setLength(0);
        }
    }


    public void setHoverhatchfill(HatchFill patternFillOrType6, String color3, Double thickness1, Double size1) {
        this.patternFillOrType6 = patternFillOrType6;
        this.color3 = color3;
        this.thickness1 = thickness1;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null", color3, thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType6 != null) ? patternFillOrType6.generateJs() : "null", color3, thickness1, size1));
            js.setLength(0);
        }
    }


    public void setHoverhatchfill(HatchFillType patternFillOrType7, String color3, Double thickness1, Double size1) {
        this.patternFillOrType7 = patternFillOrType7;
        this.color3 = color3;
        this.thickness1 = thickness1;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType7 != null) ? patternFillOrType7.generateJs() : "null", color3, thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", (patternFillOrType7 != null) ? patternFillOrType7.generateJs() : "null", color3, thickness1, size1));
            js.setLength(0);
        }
    }


    public void setHoverhatchfill(String patternFillOrType8, String color3, Double thickness1, Double size1) {
        this.patternFillOrType8 = patternFillOrType8;
        this.color3 = color3;
        this.thickness1 = thickness1;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", patternFillOrType8, color3, thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverHatchFill(%s, %s, %f, %f);", patternFillOrType8, color3, thickness1, size1));
            js.setLength(0);
        }
    }


    public void setHoverhatchfill(Boolean patternFillOrType9, String color3, Double thickness1, Double size1) {
        this.patternFillOrType9 = patternFillOrType9;
        this.color3 = color3;
        this.thickness1 = thickness1;
        this.size1 = size1;

        js.append(String.format(Locale.US, "chart.hoverHatchFill(%b, %s, %f, %f);", patternFillOrType9, color3, thickness1, size1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverHatchFill(%b, %s, %f, %f);", patternFillOrType9, color3, thickness1, size1));
            js.setLength(0);
        }
    }

    private UiLabelsFactory getHoverLabels;

    public UiLabelsFactory getHoverLabels() {
        if (getHoverLabels == null)
            getHoverLabels = new UiLabelsFactory("chart.hoverLabels()");

        return getHoverLabels;
    }

    private String hoverLabels;
    private Boolean hoverLabels1;

    public void setHoverlabels(String hoverLabels) {
        this.hoverLabels = hoverLabels;

        js.append(String.format(Locale.US, "chart.hoverLabels(%s);", hoverLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverLabels(%s);", hoverLabels));
            js.setLength(0);
        }
    }


    public void setHoverlabels(Boolean hoverLabels1) {
        this.hoverLabels1 = hoverLabels1;

        js.append(String.format(Locale.US, "chart.hoverLabels(%b);", hoverLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverLabels(%b);", hoverLabels1));
            js.setLength(0);
        }
    }

    private UiMarkersFactory getHoverMarkers;

    public UiMarkersFactory getHoverMarkers() {
        if (getHoverMarkers == null)
            getHoverMarkers = new UiMarkersFactory("chart.hoverMarkers()");

        return getHoverMarkers;
    }

    private String hoverMarkers;
    private Boolean hoverMarkers1;
    private String hoverMarkers2;

    public void setHovermarkers(String hoverMarkers) {
        this.hoverMarkers = hoverMarkers;

        js.append(String.format(Locale.US, "chart.hoverMarkers(%s);", hoverMarkers));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverMarkers(%s);", hoverMarkers));
            js.setLength(0);
        }
    }


    public void setHovermarkers(Boolean hoverMarkers1) {
        this.hoverMarkers1 = hoverMarkers1;

        js.append(String.format(Locale.US, "chart.hoverMarkers(%b);", hoverMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverMarkers(%b);", hoverMarkers1));
            js.setLength(0);
        }
    }

    private Stroke hoverStroke;

    public void setHoverstroke(Stroke hoverStroke) {
        this.hoverStroke = hoverStroke;

        js.append(String.format(Locale.US, "chart.hoverStroke(%s);", (hoverStroke != null) ? hoverStroke.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverStroke(%s);", (hoverStroke != null) ? hoverStroke.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Stroke color4;
    private ColoredFill color5;
    private String color6;
    private Double thickness2;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setHoverstroke(Stroke color4, Double thickness2, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color4 = color4;
        this.thickness2 = thickness2;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.hoverStroke(%s, %f, %s, %s, %s);", (color4 != null) ? color4.generateJs() : "null", thickness2, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverStroke(%s, %f, %s, %s, %s);", (color4 != null) ? color4.generateJs() : "null", thickness2, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setHoverstroke(ColoredFill color5, Double thickness2, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color5 = color5;
        this.thickness2 = thickness2;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.hoverStroke(%s, %f, %s, %s, %s);", (color5 != null) ? color5.generateJs() : "null", thickness2, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverStroke(%s, %f, %s, %s, %s);", (color5 != null) ? color5.generateJs() : "null", thickness2, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setHoverstroke(String color6, Double thickness2, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color6 = color6;
        this.thickness2 = thickness2;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.hoverStroke(%s, %f, %s, %s, %s);", color6, thickness2, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hoverStroke(%s, %f, %s, %s, %s);", color6, thickness2, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Intersections getIntersections;

    public Intersections getIntersections() {
        if (getIntersections == null)
            getIntersections = new Intersections("chart.intersections()");

        return getIntersections;
    }

    private String intersections;

    public void setIntersections(String intersections) {
        this.intersections = intersections;

        js.append(String.format(Locale.US, "chart.intersections(%s);", intersections));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.intersections(%s);", intersections));
            js.setLength(0);
        }
    }

    private UiLabel getLabel;

    public UiLabel getLabel() {
        if (getLabel == null)
            getLabel = new UiLabel("chart.label()");

        return getLabel;
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


    public void setLabel(String label1) {
        this.label1 = label1;

        js.append(String.format(Locale.US, "chart.label(%s);", label1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s);", label1));
            js.setLength(0);
        }
    }

    private String index1;
    private Double index2;
    private Boolean label3;
    private String label4;
    private String label5;

    public void setLabel(String index1, Boolean label3) {
        this.index1 = index1;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%s, %b);", index1, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %b);", index1, label3));
            js.setLength(0);
        }
    }


    public void setLabel(String index1, String label4) {
        this.index1 = index1;
        this.label4 = label4;

        js.append(String.format(Locale.US, "chart.label(%s, %s);", index1, label4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %s);", index1, label4));
            js.setLength(0);
        }
    }


    public void setLabel(Double index2, Boolean label3) {
        this.index2 = index2;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%f, %b);", index2, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %b);", index2, label3));
            js.setLength(0);
        }
    }


    public void setLabel(Double index2, String label4) {
        this.index2 = index2;
        this.label4 = label4;

        js.append(String.format(Locale.US, "chart.label(%f, %s);", index2, label4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %s);", index2, label4));
            js.setLength(0);
        }
    }

    private UiLabelsFactory getLabels;

    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory("chart.labels()");

        return getLabels;
    }

    private String labels;
    private Boolean labels1;

    public void setLabels(String labels) {
        this.labels = labels;

        js.append(String.format(Locale.US, "chart.labels(%s);", labels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.labels(%s);", labels));
            js.setLength(0);
        }
    }


    public void setLabels(Boolean labels1) {
        this.labels1 = labels1;

        js.append(String.format(Locale.US, "chart.labels(%b);", labels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.labels(%b);", labels1));
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

    private UiLegend getLegend;

    public UiLegend getLegend() {
        if (getLegend == null)
            getLegend = new UiLegend("chart.legend()");

        return getLegend;
    }

    private String legend;
    private Boolean legend1;

    public void setLegend(String legend) {
        this.legend = legend;

        js.append(String.format(Locale.US, "chart.legend(%s);", legend));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.legend(%s);", legend));
            js.setLength(0);
        }
    }


    public void setLegend(Boolean legend1) {
        this.legend1 = legend1;

        js.append(String.format(Locale.US, "chart.legend(%b);", legend1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.legend(%b);", legend1));
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

    private Margin getMargin;

    public Margin getMargin() {
        if (getMargin == null)
            getMargin = new Margin("chart.margin()");

        return getMargin;
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

    public void setMargin(String value, String value2, String value4, String value6) {
        this.value = value;
        this.value2 = value2;
        this.value4 = value4;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%s, %s, %s, %s);", value, value2, value4, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %s, %s, %s);", value, value2, value4, value6));
            js.setLength(0);
        }
    }


    public void setMargin(String value, String value2, String value4, Double value7) {
        this.value = value;
        this.value2 = value2;
        this.value4 = value4;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%s, %s, %s, %f);", value, value2, value4, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %s, %s, %f);", value, value2, value4, value7));
            js.setLength(0);
        }
    }


    public void setMargin(String value, String value2, Double value5, String value6) {
        this.value = value;
        this.value2 = value2;
        this.value5 = value5;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%s, %s, %f, %s);", value, value2, value5, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %s, %f, %s);", value, value2, value5, value6));
            js.setLength(0);
        }
    }


    public void setMargin(String value, String value2, Double value5, Double value7) {
        this.value = value;
        this.value2 = value2;
        this.value5 = value5;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%s, %s, %f, %f);", value, value2, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %s, %f, %f);", value, value2, value5, value7));
            js.setLength(0);
        }
    }


    public void setMargin(String value, Double value3, String value4, String value6) {
        this.value = value;
        this.value3 = value3;
        this.value4 = value4;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%s, %f, %s, %s);", value, value3, value4, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %f, %s, %s);", value, value3, value4, value6));
            js.setLength(0);
        }
    }


    public void setMargin(String value, Double value3, String value4, Double value7) {
        this.value = value;
        this.value3 = value3;
        this.value4 = value4;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%s, %f, %s, %f);", value, value3, value4, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %f, %s, %f);", value, value3, value4, value7));
            js.setLength(0);
        }
    }


    public void setMargin(String value, Double value3, Double value5, String value6) {
        this.value = value;
        this.value3 = value3;
        this.value5 = value5;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%s, %f, %f, %s);", value, value3, value5, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %f, %f, %s);", value, value3, value5, value6));
            js.setLength(0);
        }
    }


    public void setMargin(String value, Double value3, Double value5, Double value7) {
        this.value = value;
        this.value3 = value3;
        this.value5 = value5;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%s, %f, %f, %f);", value, value3, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%s, %f, %f, %f);", value, value3, value5, value7));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, String value2, String value4, String value6) {
        this.value1 = value1;
        this.value2 = value2;
        this.value4 = value4;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%f, %s, %s, %s);", value1, value2, value4, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %s, %s, %s);", value1, value2, value4, value6));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, String value2, String value4, Double value7) {
        this.value1 = value1;
        this.value2 = value2;
        this.value4 = value4;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%f, %s, %s, %f);", value1, value2, value4, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %s, %s, %f);", value1, value2, value4, value7));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, String value2, Double value5, String value6) {
        this.value1 = value1;
        this.value2 = value2;
        this.value5 = value5;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%f, %s, %f, %s);", value1, value2, value5, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %s, %f, %s);", value1, value2, value5, value6));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, String value2, Double value5, Double value7) {
        this.value1 = value1;
        this.value2 = value2;
        this.value5 = value5;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%f, %s, %f, %f);", value1, value2, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %s, %f, %f);", value1, value2, value5, value7));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, Double value3, String value4, String value6) {
        this.value1 = value1;
        this.value3 = value3;
        this.value4 = value4;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%f, %f, %s, %s);", value1, value3, value4, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %f, %s, %s);", value1, value3, value4, value6));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, Double value3, String value4, Double value7) {
        this.value1 = value1;
        this.value3 = value3;
        this.value4 = value4;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%f, %f, %s, %f);", value1, value3, value4, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %f, %s, %f);", value1, value3, value4, value7));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, Double value3, Double value5, String value6) {
        this.value1 = value1;
        this.value3 = value3;
        this.value5 = value5;
        this.value6 = value6;

        js.append(String.format(Locale.US, "chart.margin(%f, %f, %f, %s);", value1, value3, value5, value6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %f, %f, %s);", value1, value3, value5, value6));
            js.setLength(0);
        }
    }


    public void setMargin(Double value1, Double value3, Double value5, Double value7) {
        this.value1 = value1;
        this.value3 = value3;
        this.value5 = value5;
        this.value7 = value7;

        js.append(String.format(Locale.US, "chart.margin(%f, %f, %f, %f);", value1, value3, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.margin(%f, %f, %f, %f);", value1, value3, value5, value7));
            js.setLength(0);
        }
    }

    private Markers getMarkerPalette;

    public Markers getMarkerPalette() {
        if (getMarkerPalette == null)
            getMarkerPalette = new Markers("chart.markerPalette()");

        return getMarkerPalette;
    }

    private Markers markerPalette;
    private String markerPalette1;
    private MarkerType[] markerPalette2;

    public void setMarkerpalette(Markers markerPalette) {
        this.markerPalette = markerPalette;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", (markerPalette != null) ? markerPalette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", (markerPalette != null) ? markerPalette.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarkerpalette(String markerPalette1) {
        this.markerPalette1 = markerPalette1;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", markerPalette1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", markerPalette1));
            js.setLength(0);
        }
    }


    public void setMarkerpalette(MarkerType[] markerPalette2) {
        this.markerPalette2 = markerPalette2;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", arrayToString(markerPalette2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", arrayToString(markerPalette2)));
            js.setLength(0);
        }
    }

    private UiMarkersFactory getMarkers;

    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory("chart.markers()");

        return getMarkers;
    }

    private String markers;
    private Boolean markers1;
    private String markers2;

    public void setMarkers(String markers) {
        this.markers = markers;

        js.append(String.format(Locale.US, "chart.markers(%s);", markers));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markers(%s);", markers));
            js.setLength(0);
        }
    }


    public void setMarkers(Boolean markers1) {
        this.markers1 = markers1;

        js.append(String.format(Locale.US, "chart.markers(%b);", markers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markers(%b);", markers1));
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

    private UtilsPadding getPadding;

    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding("chart.padding()");

        return getPadding;
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

    public void setPadding(String value8, String value10, String value12, String value14) {
        this.value8 = value8;
        this.value10 = value10;
        this.value12 = value12;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%s, %s, %s, %s);", value8, value10, value12, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %s, %s, %s);", value8, value10, value12, value14));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, String value10, String value12, Double value15) {
        this.value8 = value8;
        this.value10 = value10;
        this.value12 = value12;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%s, %s, %s, %f);", value8, value10, value12, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %s, %s, %f);", value8, value10, value12, value15));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, String value10, Double value13, String value14) {
        this.value8 = value8;
        this.value10 = value10;
        this.value13 = value13;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%s, %s, %f, %s);", value8, value10, value13, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %s, %f, %s);", value8, value10, value13, value14));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, String value10, Double value13, Double value15) {
        this.value8 = value8;
        this.value10 = value10;
        this.value13 = value13;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%s, %s, %f, %f);", value8, value10, value13, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %s, %f, %f);", value8, value10, value13, value15));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, Double value11, String value12, String value14) {
        this.value8 = value8;
        this.value11 = value11;
        this.value12 = value12;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%s, %f, %s, %s);", value8, value11, value12, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %f, %s, %s);", value8, value11, value12, value14));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, Double value11, String value12, Double value15) {
        this.value8 = value8;
        this.value11 = value11;
        this.value12 = value12;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%s, %f, %s, %f);", value8, value11, value12, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %f, %s, %f);", value8, value11, value12, value15));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, Double value11, Double value13, String value14) {
        this.value8 = value8;
        this.value11 = value11;
        this.value13 = value13;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%s, %f, %f, %s);", value8, value11, value13, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %f, %f, %s);", value8, value11, value13, value14));
            js.setLength(0);
        }
    }


    public void setPadding(String value8, Double value11, Double value13, Double value15) {
        this.value8 = value8;
        this.value11 = value11;
        this.value13 = value13;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%s, %f, %f, %f);", value8, value11, value13, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%s, %f, %f, %f);", value8, value11, value13, value15));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, String value10, String value12, String value14) {
        this.value9 = value9;
        this.value10 = value10;
        this.value12 = value12;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%f, %s, %s, %s);", value9, value10, value12, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %s, %s, %s);", value9, value10, value12, value14));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, String value10, String value12, Double value15) {
        this.value9 = value9;
        this.value10 = value10;
        this.value12 = value12;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%f, %s, %s, %f);", value9, value10, value12, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %s, %s, %f);", value9, value10, value12, value15));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, String value10, Double value13, String value14) {
        this.value9 = value9;
        this.value10 = value10;
        this.value13 = value13;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%f, %s, %f, %s);", value9, value10, value13, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %s, %f, %s);", value9, value10, value13, value14));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, String value10, Double value13, Double value15) {
        this.value9 = value9;
        this.value10 = value10;
        this.value13 = value13;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%f, %s, %f, %f);", value9, value10, value13, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %s, %f, %f);", value9, value10, value13, value15));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, Double value11, String value12, String value14) {
        this.value9 = value9;
        this.value11 = value11;
        this.value12 = value12;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%f, %f, %s, %s);", value9, value11, value12, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %f, %s, %s);", value9, value11, value12, value14));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, Double value11, String value12, Double value15) {
        this.value9 = value9;
        this.value11 = value11;
        this.value12 = value12;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%f, %f, %s, %f);", value9, value11, value12, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %f, %s, %f);", value9, value11, value12, value15));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, Double value11, Double value13, String value14) {
        this.value9 = value9;
        this.value11 = value11;
        this.value13 = value13;
        this.value14 = value14;

        js.append(String.format(Locale.US, "chart.padding(%f, %f, %f, %s);", value9, value11, value13, value14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %f, %f, %s);", value9, value11, value13, value14));
            js.setLength(0);
        }
    }


    public void setPadding(Double value9, Double value11, Double value13, Double value15) {
        this.value9 = value9;
        this.value11 = value11;
        this.value13 = value13;
        this.value15 = value15;

        js.append(String.format(Locale.US, "chart.padding(%f, %f, %f, %f);", value9, value11, value13, value15));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.padding(%f, %f, %f, %f);", value9, value11, value13, value15));
            js.setLength(0);
        }
    }

    private RangeColors getPalette;

    public RangeColors getPalette() {
        if (getPalette == null)
            getPalette = new RangeColors("chart.palette()");

        return getPalette;
    }

    private RangeColors palette;
    private DistinctColors palette1;
    private String palette2;
    private String[] palette3;

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


    public void setPalette(String palette2) {
        this.palette2 = palette2;

        js.append(String.format(Locale.US, "chart.palette(%s);", palette2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", palette2));
            js.setLength(0);
        }
    }


    public void setPalette(String[] palette3) {
        this.palette3 = palette3;

        js.append(String.format(Locale.US, "chart.palette(%s);", Arrays.toString(palette3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.palette(%s);", Arrays.toString(palette3)));
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
    private String csvSettings1;
    private String filename;

    public void setSaveascsv(String chartDataExportMode, String csvSettings1, String filename) {
        this.chartDataExportMode = chartDataExportMode;
        this.csvSettings1 = csvSettings1;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings1, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings1, filename));
            js.setLength(0);
        }
    }


    public void setSaveascsv(ChartDataExportMode chartDataExportMode1, String csvSettings1, String filename) {
        this.chartDataExportMode1 = chartDataExportMode1;
        this.csvSettings1 = csvSettings1;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings1, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings1, filename));
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

    private Double index3;

    public void setSelect(Double index3) {
        this.index3 = index3;

        js.append(String.format(Locale.US, "chart.select(%f);", index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.select(%f);", index3));
            js.setLength(0);
        }
    }

    private Double indexes1;
    private Double[] indexes2;

    public void setSelect(Double[] indexes2) {
        this.indexes2 = indexes2;

        js.append(String.format(Locale.US, "chart.select(%s);", Arrays.toString(indexes2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.select(%s);", Arrays.toString(indexes2)));
            js.setLength(0);
        }
    }

    private Fill selectFill;

    public void setSelectfill(Fill selectFill) {
        this.selectFill = selectFill;

        js.append(String.format(Locale.US, "chart.selectFill(%s);", (selectFill != null) ? selectFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectFill(%s);", (selectFill != null) ? selectFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color7;
    private Double opacity6;

    public void setSelectfill(String color7, Double opacity6) {
        this.color7 = color7;
        this.opacity6 = opacity6;

        js.append(String.format(Locale.US, "chart.selectFill(%s, %f);", color7, opacity6));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectFill(%s, %f);", color7, opacity6));
            js.setLength(0);
        }
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode8;
    private VectorRect mode9;
    private String mode10;
    private Double opacity7;

    public void setSelectfill(GradientKey[] keys8, Boolean mode8, Double angle2, Double opacity7) {
        this.keys8 = keys8;
        this.mode8 = mode8;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.selectFill(%s, %b, %f, %f);", arrayToString(keys8), mode8, angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectFill(%s, %b, %f, %f);", arrayToString(keys8), mode8, angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setSelectfill(GradientKey[] keys8, VectorRect mode9, Double angle2, Double opacity7) {
        this.keys8 = keys8;
        this.mode9 = mode9;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.selectFill(%s, %s, %f, %f);", arrayToString(keys8), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectFill(%s, %s, %f, %f);", arrayToString(keys8), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setSelectfill(GradientKey[] keys8, String mode10, Double angle2, Double opacity7) {
        this.keys8 = keys8;
        this.mode10 = mode10;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.selectFill(%s, %s, %f, %f);", arrayToString(keys8), mode10, angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectFill(%s, %s, %f, %f);", arrayToString(keys8), mode10, angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setSelectfill(String[] keys9, Boolean mode8, Double angle2, Double opacity7) {
        this.keys9 = keys9;
        this.mode8 = mode8;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.selectFill(%s, %b, %f, %f);", Arrays.toString(keys9), mode8, angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectFill(%s, %b, %f, %f);", Arrays.toString(keys9), mode8, angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setSelectfill(String[] keys9, VectorRect mode9, Double angle2, Double opacity7) {
        this.keys9 = keys9;
        this.mode9 = mode9;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.selectFill(%s, %s, %f, %f);", Arrays.toString(keys9), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectFill(%s, %s, %f, %f);", Arrays.toString(keys9), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));
            js.setLength(0);
        }
    }


    public void setSelectfill(String[] keys9, String mode10, Double angle2, Double opacity7) {
        this.keys9 = keys9;
        this.mode10 = mode10;
        this.angle2 = angle2;
        this.opacity7 = opacity7;

        js.append(String.format(Locale.US, "chart.selectFill(%s, %s, %f, %f);", Arrays.toString(keys9), mode10, angle2, opacity7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectFill(%s, %s, %f, %f);", Arrays.toString(keys9), mode10, angle2, opacity7));
            js.setLength(0);
        }
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private GraphicsMathRect mode11;
    private Double opacity8;
    private Double fx2;
    private Double fy2;

    public void setSelectfill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
        this.keys10 = keys10;
        this.cx2 = cx2;
        this.cy2 = cy2;
        this.mode11 = mode11;
        this.opacity8 = opacity8;
        this.fx2 = fx2;
        this.fy2 = fy2;

        js.append(String.format(Locale.US, "chart.selectFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys10), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys10), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));
            js.setLength(0);
        }
    }


    public void setSelectfill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
        this.keys11 = keys11;
        this.cx2 = cx2;
        this.cy2 = cy2;
        this.mode11 = mode11;
        this.opacity8 = opacity8;
        this.fx2 = fx2;
        this.fy2 = fy2;

        js.append(String.format(Locale.US, "chart.selectFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys11), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys11), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));
            js.setLength(0);
        }
    }

    private Fill imageSettings2;
    private PatternFill getSelectHatchFill;

    public PatternFill getSelectHatchFill() {
        if (getSelectHatchFill == null)
            getSelectHatchFill = new PatternFill("chart.selectHatchFill()");

        return getSelectHatchFill;
    }

    private PatternFill patternFillOrTypeOrState;
    private HatchFill patternFillOrTypeOrState1;
    private HatchFillType patternFillOrTypeOrState2;
    private String patternFillOrTypeOrState3;
    private Boolean patternFillOrTypeOrState4;
    private String color8;
    private Double thickness3;
    private Double size2;

    public void setSelecthatchfill(PatternFill patternFillOrTypeOrState, String color8, Double thickness3, Double size2) {
        this.patternFillOrTypeOrState = patternFillOrTypeOrState;
        this.color8 = color8;
        this.thickness3 = thickness3;
        this.size2 = size2;

        js.append(String.format(Locale.US, "chart.selectHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null", color8, thickness3, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null", color8, thickness3, size2));
            js.setLength(0);
        }
    }


    public void setSelecthatchfill(HatchFill patternFillOrTypeOrState1, String color8, Double thickness3, Double size2) {
        this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
        this.color8 = color8;
        this.thickness3 = thickness3;
        this.size2 = size2;

        js.append(String.format(Locale.US, "chart.selectHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null", color8, thickness3, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null", color8, thickness3, size2));
            js.setLength(0);
        }
    }


    public void setSelecthatchfill(HatchFillType patternFillOrTypeOrState2, String color8, Double thickness3, Double size2) {
        this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
        this.color8 = color8;
        this.thickness3 = thickness3;
        this.size2 = size2;

        js.append(String.format(Locale.US, "chart.selectHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null", color8, thickness3, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null", color8, thickness3, size2));
            js.setLength(0);
        }
    }


    public void setSelecthatchfill(String patternFillOrTypeOrState3, String color8, Double thickness3, Double size2) {
        this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
        this.color8 = color8;
        this.thickness3 = thickness3;
        this.size2 = size2;

        js.append(String.format(Locale.US, "chart.selectHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState3, color8, thickness3, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState3, color8, thickness3, size2));
            js.setLength(0);
        }
    }


    public void setSelecthatchfill(Boolean patternFillOrTypeOrState4, String color8, Double thickness3, Double size2) {
        this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
        this.color8 = color8;
        this.thickness3 = thickness3;
        this.size2 = size2;

        js.append(String.format(Locale.US, "chart.selectHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState4, color8, thickness3, size2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState4, color8, thickness3, size2));
            js.setLength(0);
        }
    }

    private UiLabelsFactory getSelectLabels;

    public UiLabelsFactory getSelectLabels() {
        if (getSelectLabels == null)
            getSelectLabels = new UiLabelsFactory("chart.selectLabels()");

        return getSelectLabels;
    }

    private String selectLabels;
    private Boolean selectLabels1;

    public void setSelectlabels(String selectLabels) {
        this.selectLabels = selectLabels;

        js.append(String.format(Locale.US, "chart.selectLabels(%s);", selectLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectLabels(%s);", selectLabels));
            js.setLength(0);
        }
    }


    public void setSelectlabels(Boolean selectLabels1) {
        this.selectLabels1 = selectLabels1;

        js.append(String.format(Locale.US, "chart.selectLabels(%b);", selectLabels1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectLabels(%b);", selectLabels1));
            js.setLength(0);
        }
    }

    private UiMarkersFactory getSelectMarkers;

    public UiMarkersFactory getSelectMarkers() {
        if (getSelectMarkers == null)
            getSelectMarkers = new UiMarkersFactory("chart.selectMarkers()");

        return getSelectMarkers;
    }

    private String selectMarkers;
    private Boolean selectMarkers1;
    private String selectMarkers2;

    public void setSelectmarkers(String selectMarkers) {
        this.selectMarkers = selectMarkers;

        js.append(String.format(Locale.US, "chart.selectMarkers(%s);", selectMarkers));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarkers(%s);", selectMarkers));
            js.setLength(0);
        }
    }


    public void setSelectmarkers(Boolean selectMarkers1) {
        this.selectMarkers1 = selectMarkers1;

        js.append(String.format(Locale.US, "chart.selectMarkers(%b);", selectMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarkers(%b);", selectMarkers1));
            js.setLength(0);
        }
    }

    private Stroke color9;
    private ColoredFill color10;
    private String color11;
    private Double thickness4;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setSelectstroke(Stroke color9, Double thickness4, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color9 = color9;
        this.thickness4 = thickness4;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.selectStroke(%s, %f, %s, %s, %s);", (color9 != null) ? color9.generateJs() : "null", thickness4, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectStroke(%s, %f, %s, %s, %s);", (color9 != null) ? color9.generateJs() : "null", thickness4, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectstroke(ColoredFill color10, Double thickness4, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color10 = color10;
        this.thickness4 = thickness4;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.selectStroke(%s, %f, %s, %s, %s);", (color10 != null) ? color10.generateJs() : "null", thickness4, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectStroke(%s, %f, %s, %s, %s);", (color10 != null) ? color10.generateJs() : "null", thickness4, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectstroke(String color11, Double thickness4, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        this.color11 = color11;
        this.thickness4 = thickness4;
        this.dashpattern1 = dashpattern1;
        this.lineJoin1 = lineJoin1;
        this.lineCap1 = lineCap1;

        js.append(String.format(Locale.US, "chart.selectStroke(%s, %f, %s, %s, %s);", color11, thickness4, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectStroke(%s, %f, %s, %s, %s);", color11, thickness4, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Stroke color12;
    private ColoredFill color13;
    private String color14;
    private Double thickness5;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    public void setStroke(Stroke color12, Double thickness5, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.color12 = color12;
        this.thickness5 = thickness5;
        this.dashpattern2 = dashpattern2;
        this.lineJoin2 = lineJoin2;
        this.lineCap2 = lineCap2;

        js.append(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (color12 != null) ? color12.generateJs() : "null", thickness5, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (color12 != null) ? color12.generateJs() : "null", thickness5, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStroke(ColoredFill color13, Double thickness5, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.color13 = color13;
        this.thickness5 = thickness5;
        this.dashpattern2 = dashpattern2;
        this.lineJoin2 = lineJoin2;
        this.lineCap2 = lineCap2;

        js.append(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (color13 != null) ? color13.generateJs() : "null", thickness5, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", (color13 != null) ? color13.generateJs() : "null", thickness5, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStroke(String color14, Double thickness5, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        this.color14 = color14;
        this.thickness5 = thickness5;
        this.dashpattern2 = dashpattern2;
        this.lineJoin2 = lineJoin2;
        this.lineCap2 = lineCap2;

        js.append(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", color14, thickness5, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stroke(%s, %f, %s, %s, %s);", color14, thickness5, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private UiTitle getTitle;

    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle("chart.title()");

        return getTitle;
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
    private String csvSettings2;

    public void setTocsv(String chartDataExportMode4, String csvSettings2) {
        this.chartDataExportMode4 = chartDataExportMode4;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings2));
            js.setLength(0);
        }
    }


    public void setTocsv(ChartDataExportMode chartDataExportMode5, String csvSettings2) {
        this.chartDataExportMode5 = chartDataExportMode5;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings2));
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

    private Tooltip getTooltip;

    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip("chart.tooltip()");

        return getTooltip;
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

    private Double indexOrIndexes;
    private Double[] indexOrIndexes1;

    public void setUnhover(Double indexOrIndexes) {
        this.indexOrIndexes = indexOrIndexes;

        js.append(String.format(Locale.US, "chart.unhover(%f);", indexOrIndexes));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unhover(%f);", indexOrIndexes));
            js.setLength(0);
        }
    }


    public void setUnhover(Double[] indexOrIndexes1) {
        this.indexOrIndexes1 = indexOrIndexes1;

        js.append(String.format(Locale.US, "chart.unhover(%s);", Arrays.toString(indexOrIndexes1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unhover(%s);", Arrays.toString(indexOrIndexes1)));
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

    private Double index4;

    public void setUnselect(Double index4) {
        this.index4 = index4;

        js.append(String.format(Locale.US, "chart.unselect(%f);", index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unselect(%f);", index4));
            js.setLength(0);
        }
    }

    private Double[] indexes3;

    public void setUnselect(Double[] indexes3) {
        this.indexes3 = indexes3;

        js.append(String.format(Locale.US, "chart.unselect(%s);", Arrays.toString(indexes3)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.unselect(%s);", Arrays.toString(indexes3)));
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

    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
        }
        return "";
    }

    private String generateJSgetBounds() {
        if (getBounds != null) {
            return getBounds.generateJs();
        }
        return "";
    }

    private String generateJSgetContainer() {
        if (getContainer != null) {
            return getContainer.generateJs();
        }
        return "";
    }

    private String generateJSgetContextMenu() {
        if (getContextMenu != null) {
            return getContextMenu.generateJs();
        }
        return "";
    }

    private String generateJSgetCredits() {
        if (getCredits != null) {
            return getCredits.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHatchFillPalette() {
        if (getHatchFillPalette != null) {
            return getHatchFillPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetHoverHatchFill() {
        if (getHoverHatchFill != null) {
            return getHoverHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHoverLabels() {
        if (getHoverLabels != null) {
            return getHoverLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetHoverMarkers() {
        if (getHoverMarkers != null) {
            return getHoverMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetIntersections() {
        if (getIntersections != null) {
            return getIntersections.generateJs();
        }
        return "";
    }

    private String generateJSgetLabel() {
        if (getLabel != null) {
            return getLabel.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLegend() {
        if (getLegend != null) {
            return getLegend.generateJs();
        }
        return "";
    }

    private String generateJSgetMargin() {
        if (getMargin != null) {
            return getMargin.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkerPalette() {
        if (getMarkerPalette != null) {
            return getMarkerPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }

    private String generateJSgetPalette() {
        if (getPalette != null) {
            return getPalette.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectHatchFill() {
        if (getSelectHatchFill != null) {
            return getSelectHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectLabels() {
        if (getSelectLabels != null) {
            return getSelectLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectMarkers() {
        if (getSelectMarkers != null) {
            return getSelectMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetTitle() {
        if (getTitle != null) {
            return getTitle.generateJs();
        }
        return "";
    }

    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append(generateJSgetBackground());
        js.append(generateJSgetBounds());
        js.append(generateJSgetContainer());
        js.append(generateJSgetContextMenu());
        js.append(generateJSgetCredits());
        js.append(generateJSgetData());
        js.append(generateJSgetHatchFill());
        js.append(generateJSgetHatchFillPalette());
        js.append(generateJSgetHoverHatchFill());
        js.append(generateJSgetHoverLabels());
        js.append(generateJSgetHoverMarkers());
        js.append(generateJSgetIntersections());
        js.append(generateJSgetLabel());
        js.append(generateJSgetLabels());
        js.append(generateJSgetLegend());
        js.append(generateJSgetMargin());
        js.append(generateJSgetMarkerPalette());
        js.append(generateJSgetMarkers());
        js.append(generateJSgetPadding());
        js.append(generateJSgetPalette());
        js.append(generateJSgetSelectHatchFill());
        js.append(generateJSgetSelectLabels());
        js.append(generateJSgetSelectMarkers());
        js.append(generateJSgetTitle());
        js.append(generateJSgetTooltip());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}