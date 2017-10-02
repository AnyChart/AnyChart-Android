package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// chart class
public class Cartesian3d extends Chart {

    public Cartesian3d() {
        js.append("chart = anychart.cartesian3d();");
    }

    
    private Animation getAnimation;

    public Animation getAnimation() {
        if (getAnimation == null)
            getAnimation = new Animation("chart.animation()");

        return getAnimation;
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

    private View data;
    private Set data1;
    private String[] data2;
    private String data3;
    private TextParsingMode csvSettings;
    private TextParsingSettings csvSettings1;

    public void setArea(View data, TextParsingMode csvSettings) {
        this.data = data;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.area(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.area(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setArea(View data, TextParsingSettings csvSettings1) {
        this.data = data;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.area(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.area(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setArea(Set data1, TextParsingMode csvSettings) {
        this.data1 = data1;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.area(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.area(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setArea(Set data1, TextParsingSettings csvSettings1) {
        this.data1 = data1;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.area(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.area(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setArea(String[] data2, TextParsingMode csvSettings) {
        this.data2 = data2;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.area(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.area(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setArea(String[] data2, TextParsingSettings csvSettings1) {
        this.data2 = data2;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.area(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.area(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setArea(String data3, TextParsingMode csvSettings) {
        this.data3 = data3;
        this.csvSettings = csvSettings;

        js.append(String.format(Locale.US, "chart.area(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.area(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setArea(String data3, TextParsingSettings csvSettings1) {
        this.data3 = data3;
        this.csvSettings1 = csvSettings1;

        js.append(String.format(Locale.US, "chart.area(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.area(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
            js.setLength(0);
        }
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

    private View data4;
    private Set data5;
    private String[] data6;
    private String data7;
    private TextParsingMode csvSettings2;
    private TextParsingSettings csvSettings3;

    public void setBar(View data4, TextParsingMode csvSettings2) {
        this.data4 = data4;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(View data4, TextParsingSettings csvSettings3) {
        this.data4 = data4;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(Set data5, TextParsingMode csvSettings2) {
        this.data5 = data5;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(Set data5, TextParsingSettings csvSettings3) {
        this.data5 = data5;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", (data5 != null) ? data5.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(String[] data6, TextParsingMode csvSettings2) {
        this.data6 = data6;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", Arrays.toString(data6), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", Arrays.toString(data6), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(String[] data6, TextParsingSettings csvSettings3) {
        this.data6 = data6;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", Arrays.toString(data6), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", Arrays.toString(data6), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(String data7, TextParsingMode csvSettings2) {
        this.data7 = data7;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", data7, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", data7, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(String data7, TextParsingSettings csvSettings3) {
        this.data7 = data7;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", data7, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", data7, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
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

    private View data8;
    private Set data9;
    private String[] data10;
    private String data11;
    private TextParsingMode csvSettings4;
    private TextParsingSettings csvSettings5;

    public void setColumn(View data8, TextParsingMode csvSettings4) {
        this.data8 = data8;
        this.csvSettings4 = csvSettings4;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(View data8, TextParsingSettings csvSettings5) {
        this.data8 = data8;
        this.csvSettings5 = csvSettings5;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(Set data9, TextParsingMode csvSettings4) {
        this.data9 = data9;
        this.csvSettings4 = csvSettings4;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(Set data9, TextParsingSettings csvSettings5) {
        this.data9 = data9;
        this.csvSettings5 = csvSettings5;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", (data9 != null) ? data9.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(String[] data10, TextParsingMode csvSettings4) {
        this.data10 = data10;
        this.csvSettings4 = csvSettings4;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", Arrays.toString(data10), (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", Arrays.toString(data10), (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(String[] data10, TextParsingSettings csvSettings5) {
        this.data10 = data10;
        this.csvSettings5 = csvSettings5;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", Arrays.toString(data10), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", Arrays.toString(data10), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(String data11, TextParsingMode csvSettings4) {
        this.data11 = data11;
        this.csvSettings4 = csvSettings4;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", data11, (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", data11, (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(String data11, TextParsingSettings csvSettings5) {
        this.data11 = data11;
        this.csvSettings5 = csvSettings5;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", data11, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", data11, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
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

    private Set data12;
    private String[] data13;
    private DataSettings data14;

    public void setData(Set data12) {
        this.data12 = data12;

        js.append(String.format(Locale.US, "chart.data(%s);", (data12 != null) ? data12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s);", (data12 != null) ? data12.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String[] data13) {
        this.data13 = data13;

        js.append(String.format(Locale.US, "chart.data(%s);", Arrays.toString(data13)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s);", Arrays.toString(data13)));
            js.setLength(0);
        }
    }


    public void setData(DataSettings data14) {
        this.data14 = data14;

        js.append(String.format(Locale.US, "chart.data(%s);", (data14 != null) ? data14.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s);", (data14 != null) ? data14.generateJs() : "null"));
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

    private Interactivity getInteractivity;

    public Interactivity getInteractivity() {
        if (getInteractivity == null)
            getInteractivity = new Interactivity("chart.interactivity()");

        return getInteractivity;
    }

    private String interactivity;
    private HoverMode interactivity1;

    public void setInteractivity(String interactivity) {
        this.interactivity = interactivity;

        js.append(String.format(Locale.US, "chart.interactivity(%s);", interactivity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.interactivity(%s);", interactivity));
            js.setLength(0);
        }
    }


    public void setInteractivity(HoverMode interactivity1) {
        this.interactivity1 = interactivity1;

        js.append(String.format(Locale.US, "chart.interactivity(%s);", (interactivity1 != null) ? interactivity1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.interactivity(%s);", (interactivity1 != null) ? interactivity1.generateJs() : "null"));
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

    private String index;
    private Double index1;
    private Boolean label3;
    private String label4;
    private String label5;

    public void setLabel(String index, Boolean label3) {
        this.index = index;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%s, %b);", index, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %b);", index, label3));
            js.setLength(0);
        }
    }


    public void setLabel(String index, String label4) {
        this.index = index;
        this.label4 = label4;

        js.append(String.format(Locale.US, "chart.label(%s, %s);", index, label4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %s);", index, label4));
            js.setLength(0);
        }
    }


    public void setLabel(Double index1, Boolean label3) {
        this.index1 = index1;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%f, %b);", index1, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %b);", index1, label3));
            js.setLength(0);
        }
    }


    public void setLabel(Double index1, String label4) {
        this.index1 = index1;
        this.label4 = label4;

        js.append(String.format(Locale.US, "chart.label(%f, %s);", index1, label4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %s);", index1, label4));
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
    private String csvSettings6;
    private String filename;

    public void setSaveascsv(String chartDataExportMode, String csvSettings6, String filename) {
        this.chartDataExportMode = chartDataExportMode;
        this.csvSettings6 = csvSettings6;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings6, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings6, filename));
            js.setLength(0);
        }
    }


    public void setSaveascsv(ChartDataExportMode chartDataExportMode1, String csvSettings6, String filename) {
        this.chartDataExportMode1 = chartDataExportMode1;
        this.csvSettings6 = csvSettings6;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings6, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings6, filename));
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

    private Fill selectMarqueeFill;

    public void setSelectmarqueefill(Fill selectMarqueeFill) {
        this.selectMarqueeFill = selectMarqueeFill;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s);", (selectMarqueeFill != null) ? selectMarqueeFill.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String color;
    private Double opacity;

    public void setSelectmarqueefill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color, opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f);", color, opacity));
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

    public void setSelectmarqueefill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys1, String mode2, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
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

    public void setSelectmarqueefill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }

    private Fill imageSettings;
    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setSelectmarqueestroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color1 = color1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSelectmarqueestroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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


    public void setSelectmarqueestroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color3 = color3;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;

        js.append(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
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
    private String csvSettings7;

    public void setTocsv(String chartDataExportMode4, String csvSettings7) {
        this.chartDataExportMode4 = chartDataExportMode4;
        this.csvSettings7 = csvSettings7;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings7));
            js.setLength(0);
        }
    }


    public void setTocsv(ChartDataExportMode chartDataExportMode5, String csvSettings7) {
        this.chartDataExportMode5 = chartDataExportMode5;
        this.csvSettings7 = csvSettings7;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings7));
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

    private Double zAngle;

    public void setZangle(Double zAngle) {
        this.zAngle = zAngle;

        js.append(String.format(Locale.US, "chart.zAngle(%f);", zAngle));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zAngle(%f);", zAngle));
            js.setLength(0);
        }
    }

    private Double zAspect;
    private String zAspect1;

    public void setZaspect(Double zAspect) {
        this.zAspect = zAspect;

        js.append(String.format(Locale.US, "chart.zAspect(%f);", zAspect));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zAspect(%f);", zAspect));
            js.setLength(0);
        }
    }


    public void setZaspect(String zAspect1) {
        this.zAspect1 = zAspect1;

        js.append(String.format(Locale.US, "chart.zAspect(%s);", zAspect1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zAspect(%s);", zAspect1));
            js.setLength(0);
        }
    }

    private Boolean zDistribution;

    public void setZdistribution(Boolean zDistribution) {
        this.zDistribution = zDistribution;

        js.append(String.format(Locale.US, "chart.zDistribution(%b);", zDistribution));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zDistribution(%b);", zDistribution));
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

    private Double zPadding;

    public void setZpadding(Double zPadding) {
        this.zPadding = zPadding;

        js.append(String.format(Locale.US, "chart.zPadding(%f);", zPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.zPadding(%f);", zPadding));
            js.setLength(0);
        }
    }

    private String generateJSgetAnimation() {
        if (getAnimation != null) {
            return getAnimation.generateJs();
        }
        return "";
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

    private String generateJSgetHoverLabels() {
        if (getHoverLabels != null) {
            return getHoverLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetInteractivity() {
        if (getInteractivity != null) {
            return getInteractivity.generateJs();
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

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectLabels() {
        if (getSelectLabels != null) {
            return getSelectLabels.generateJs();
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
        js.append(generateJSgetAnimation());
        js.append(generateJSgetBackground());
        js.append(generateJSgetBounds());
        js.append(generateJSgetContainer());
        js.append(generateJSgetContextMenu());
        js.append(generateJSgetCredits());
        js.append(generateJSgetData());
        js.append(generateJSgetHoverLabels());
        js.append(generateJSgetInteractivity());
        js.append(generateJSgetLabel());
        js.append(generateJSgetLabels());
        js.append(generateJSgetLegend());
        js.append(generateJSgetMargin());
        js.append(generateJSgetPadding());
        js.append(generateJSgetSelectLabels());
        js.append(generateJSgetTitle());
        js.append(generateJSgetTooltip());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}