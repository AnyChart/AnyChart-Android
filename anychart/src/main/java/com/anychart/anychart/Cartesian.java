package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Cartesian extends Chart {

    public Cartesian() {
        js.append("chart = anychart.cartesian();");
    }

    
    private View var_args;
    private Set var_args1;
    private String[] var_args2;

    public void setAddseries(View var_args) {
        this.var_args = var_args;

        js.append(String.format(Locale.US, "chart.addSeries(%s);", (var_args != null) ? var_args.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.addSeries(%s);", (var_args != null) ? var_args.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setAddseries(Set var_args1) {
        this.var_args1 = var_args1;

        js.append(String.format(Locale.US, "chart.addSeries(%s);", (var_args1 != null) ? var_args1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.addSeries(%s);", (var_args1 != null) ? var_args1.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setAddseries(String[] var_args2) {
        this.var_args2 = var_args2;

        js.append(String.format(Locale.US, "chart.addSeries(%s);", Arrays.toString(var_args2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.addSeries(%s);", Arrays.toString(var_args2)));
            js.setLength(0);
        }
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

    private String[] annotationsList;

    public void setAnnotations(String[] annotationsList) {
        this.annotationsList = annotationsList;

        js.append(String.format(Locale.US, "chart.annotations(%s);", Arrays.toString(annotationsList)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.annotations(%s);", Arrays.toString(annotationsList)));
            js.setLength(0);
        }
    }

    private View data;
    private Set data1;
    private String[] data2;
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

    private String background;
    private Boolean background1;

    public void setBackground(String background) {
        this.background = background;

        js.append(String.format(Locale.US, "chart.background(%s);", background));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.background(%s);", background));
            js.setLength(0);
        }
    }


    public void setBackground(Boolean background1) {
        this.background1 = background1;

        js.append(String.format(Locale.US, "chart.background(%b);", background1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.background(%b);", background1));
            js.setLength(0);
        }
    }

    private View data3;
    private Set data4;
    private String[] data5;
    private String data6;
    private TextParsingMode csvSettings2;
    private TextParsingSettings csvSettings3;

    public void setBar(View data3, TextParsingMode csvSettings2) {
        this.data3 = data3;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(View data3, TextParsingSettings csvSettings3) {
        this.data3 = data3;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", (data3 != null) ? data3.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(Set data4, TextParsingMode csvSettings2) {
        this.data4 = data4;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(Set data4, TextParsingSettings csvSettings3) {
        this.data4 = data4;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", (data4 != null) ? data4.generateJs() : "null", (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(String[] data5, TextParsingMode csvSettings2) {
        this.data5 = data5;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", Arrays.toString(data5), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", Arrays.toString(data5), (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(String[] data5, TextParsingSettings csvSettings3) {
        this.data5 = data5;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", Arrays.toString(data5), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", Arrays.toString(data5), (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(String data6, TextParsingMode csvSettings2) {
        this.data6 = data6;
        this.csvSettings2 = csvSettings2;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", data6, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", data6, (csvSettings2 != null) ? csvSettings2.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBar(String data6, TextParsingSettings csvSettings3) {
        this.data6 = data6;
        this.csvSettings3 = csvSettings3;

        js.append(String.format(Locale.US, "chart.bar(%s, %s);", data6, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bar(%s, %s);", data6, (csvSettings3 != null) ? csvSettings3.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double barGroupsPadding;

    public void setBargroupspadding(Double barGroupsPadding) {
        this.barGroupsPadding = barGroupsPadding;

        js.append(String.format(Locale.US, "chart.barGroupsPadding(%f);", barGroupsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.barGroupsPadding(%f);", barGroupsPadding));
            js.setLength(0);
        }
    }

    private Double barsPadding;

    public void setBarspadding(Double barsPadding) {
        this.barsPadding = barsPadding;

        js.append(String.format(Locale.US, "chart.barsPadding(%f);", barsPadding));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.barsPadding(%f);", barsPadding));
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

    private View data7;
    private Set data8;
    private String[] data9;
    private String data10;
    private TextParsingMode csvSettings4;
    private TextParsingSettings csvSettings5;

    public void setBox(View data7, TextParsingMode csvSettings4) {
        this.data7 = data7;
        this.csvSettings4 = csvSettings4;

        js.append(String.format(Locale.US, "chart.box(%s, %s);", (data7 != null) ? data7.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.box(%s, %s);", (data7 != null) ? data7.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBox(View data7, TextParsingSettings csvSettings5) {
        this.data7 = data7;
        this.csvSettings5 = csvSettings5;

        js.append(String.format(Locale.US, "chart.box(%s, %s);", (data7 != null) ? data7.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.box(%s, %s);", (data7 != null) ? data7.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBox(Set data8, TextParsingMode csvSettings4) {
        this.data8 = data8;
        this.csvSettings4 = csvSettings4;

        js.append(String.format(Locale.US, "chart.box(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.box(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBox(Set data8, TextParsingSettings csvSettings5) {
        this.data8 = data8;
        this.csvSettings5 = csvSettings5;

        js.append(String.format(Locale.US, "chart.box(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.box(%s, %s);", (data8 != null) ? data8.generateJs() : "null", (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBox(String[] data9, TextParsingMode csvSettings4) {
        this.data9 = data9;
        this.csvSettings4 = csvSettings4;

        js.append(String.format(Locale.US, "chart.box(%s, %s);", Arrays.toString(data9), (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.box(%s, %s);", Arrays.toString(data9), (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBox(String[] data9, TextParsingSettings csvSettings5) {
        this.data9 = data9;
        this.csvSettings5 = csvSettings5;

        js.append(String.format(Locale.US, "chart.box(%s, %s);", Arrays.toString(data9), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.box(%s, %s);", Arrays.toString(data9), (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBox(String data10, TextParsingMode csvSettings4) {
        this.data10 = data10;
        this.csvSettings4 = csvSettings4;

        js.append(String.format(Locale.US, "chart.box(%s, %s);", data10, (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.box(%s, %s);", data10, (csvSettings4 != null) ? csvSettings4.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBox(String data10, TextParsingSettings csvSettings5) {
        this.data10 = data10;
        this.csvSettings5 = csvSettings5;

        js.append(String.format(Locale.US, "chart.box(%s, %s);", data10, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.box(%s, %s);", data10, (csvSettings5 != null) ? csvSettings5.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private View data11;
    private Set data12;
    private String[] data13;
    private String data14;
    private TextParsingMode csvSettings6;
    private TextParsingSettings csvSettings7;

    public void setBubble(View data11, TextParsingMode csvSettings6) {
        this.data11 = data11;
        this.csvSettings6 = csvSettings6;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", (data11 != null) ? data11.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", (data11 != null) ? data11.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(View data11, TextParsingSettings csvSettings7) {
        this.data11 = data11;
        this.csvSettings7 = csvSettings7;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", (data11 != null) ? data11.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", (data11 != null) ? data11.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(Set data12, TextParsingMode csvSettings6) {
        this.data12 = data12;
        this.csvSettings6 = csvSettings6;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", (data12 != null) ? data12.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", (data12 != null) ? data12.generateJs() : "null", (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(Set data12, TextParsingSettings csvSettings7) {
        this.data12 = data12;
        this.csvSettings7 = csvSettings7;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", (data12 != null) ? data12.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", (data12 != null) ? data12.generateJs() : "null", (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(String[] data13, TextParsingMode csvSettings6) {
        this.data13 = data13;
        this.csvSettings6 = csvSettings6;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", Arrays.toString(data13), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", Arrays.toString(data13), (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(String[] data13, TextParsingSettings csvSettings7) {
        this.data13 = data13;
        this.csvSettings7 = csvSettings7;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", Arrays.toString(data13), (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", Arrays.toString(data13), (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(String data14, TextParsingMode csvSettings6) {
        this.data14 = data14;
        this.csvSettings6 = csvSettings6;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", data14, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", data14, (csvSettings6 != null) ? csvSettings6.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setBubble(String data14, TextParsingSettings csvSettings7) {
        this.data14 = data14;
        this.csvSettings7 = csvSettings7;

        js.append(String.format(Locale.US, "chart.bubble(%s, %s);", data14, (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.bubble(%s, %s);", data14, (csvSettings7 != null) ? csvSettings7.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private View data15;
    private Set data16;
    private String[] data17;
    private String data18;
    private TextParsingMode csvSettings8;
    private TextParsingSettings csvSettings9;

    public void setCandlestick(View data15, TextParsingMode csvSettings8) {
        this.data15 = data15;
        this.csvSettings8 = csvSettings8;

        js.append(String.format(Locale.US, "chart.candlestick(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.candlestick(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setCandlestick(View data15, TextParsingSettings csvSettings9) {
        this.data15 = data15;
        this.csvSettings9 = csvSettings9;

        js.append(String.format(Locale.US, "chart.candlestick(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.candlestick(%s, %s);", (data15 != null) ? data15.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setCandlestick(Set data16, TextParsingMode csvSettings8) {
        this.data16 = data16;
        this.csvSettings8 = csvSettings8;

        js.append(String.format(Locale.US, "chart.candlestick(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.candlestick(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setCandlestick(Set data16, TextParsingSettings csvSettings9) {
        this.data16 = data16;
        this.csvSettings9 = csvSettings9;

        js.append(String.format(Locale.US, "chart.candlestick(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.candlestick(%s, %s);", (data16 != null) ? data16.generateJs() : "null", (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setCandlestick(String[] data17, TextParsingMode csvSettings8) {
        this.data17 = data17;
        this.csvSettings8 = csvSettings8;

        js.append(String.format(Locale.US, "chart.candlestick(%s, %s);", Arrays.toString(data17), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.candlestick(%s, %s);", Arrays.toString(data17), (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setCandlestick(String[] data17, TextParsingSettings csvSettings9) {
        this.data17 = data17;
        this.csvSettings9 = csvSettings9;

        js.append(String.format(Locale.US, "chart.candlestick(%s, %s);", Arrays.toString(data17), (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.candlestick(%s, %s);", Arrays.toString(data17), (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setCandlestick(String data18, TextParsingMode csvSettings8) {
        this.data18 = data18;
        this.csvSettings8 = csvSettings8;

        js.append(String.format(Locale.US, "chart.candlestick(%s, %s);", data18, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.candlestick(%s, %s);", data18, (csvSettings8 != null) ? csvSettings8.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setCandlestick(String data18, TextParsingSettings csvSettings9) {
        this.data18 = data18;
        this.csvSettings9 = csvSettings9;

        js.append(String.format(Locale.US, "chart.candlestick(%s, %s);", data18, (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.candlestick(%s, %s);", data18, (csvSettings9 != null) ? csvSettings9.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private View data19;
    private Set data20;
    private String[] data21;
    private String data22;
    private TextParsingMode csvSettings10;
    private TextParsingSettings csvSettings11;

    public void setColumn(View data19, TextParsingMode csvSettings10) {
        this.data19 = data19;
        this.csvSettings10 = csvSettings10;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(View data19, TextParsingSettings csvSettings11) {
        this.data19 = data19;
        this.csvSettings11 = csvSettings11;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", (data19 != null) ? data19.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(Set data20, TextParsingMode csvSettings10) {
        this.data20 = data20;
        this.csvSettings10 = csvSettings10;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(Set data20, TextParsingSettings csvSettings11) {
        this.data20 = data20;
        this.csvSettings11 = csvSettings11;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", (data20 != null) ? data20.generateJs() : "null", (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(String[] data21, TextParsingMode csvSettings10) {
        this.data21 = data21;
        this.csvSettings10 = csvSettings10;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", Arrays.toString(data21), (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", Arrays.toString(data21), (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(String[] data21, TextParsingSettings csvSettings11) {
        this.data21 = data21;
        this.csvSettings11 = csvSettings11;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", Arrays.toString(data21), (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", Arrays.toString(data21), (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(String data22, TextParsingMode csvSettings10) {
        this.data22 = data22;
        this.csvSettings10 = csvSettings10;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", data22, (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", data22, (csvSettings10 != null) ? csvSettings10.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setColumn(String data22, TextParsingSettings csvSettings11) {
        this.data22 = data22;
        this.csvSettings11 = csvSettings11;

        js.append(String.format(Locale.US, "chart.column(%s, %s);", data22, (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.column(%s, %s);", data22, (csvSettings11 != null) ? csvSettings11.generateJs() : "null"));
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

    private Boolean crosshair;

    public void setCrosshair(Boolean crosshair) {
        this.crosshair = crosshair;

        js.append(String.format(Locale.US, "chart.crosshair(%b);", crosshair));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.crosshair(%b);", crosshair));
            js.setLength(0);
        }
    }

    private Set data23;
    private DataSettings data24;
    private String[] data25;

    public void setData(Set data23) {
        this.data23 = data23;

        js.append(String.format(Locale.US, "chart.data(%s);", (data23 != null) ? data23.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s);", (data23 != null) ? data23.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(DataSettings data24) {
        this.data24 = data24;

        js.append(String.format(Locale.US, "chart.data(%s);", (data24 != null) ? data24.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s);", (data24 != null) ? data24.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setData(String[] data25) {
        this.data25 = data25;

        js.append(String.format(Locale.US, "chart.data(%s);", Arrays.toString(data25)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.data(%s);", Arrays.toString(data25)));
            js.setLength(0);
        }
    }

    private String defaultSeriesType;
    private CartesianSeriesType defaultSeriesType1;

    public void setDefaultseriestype(String defaultSeriesType) {
        this.defaultSeriesType = defaultSeriesType;

        js.append(String.format(Locale.US, "chart.defaultSeriesType(%s);", defaultSeriesType));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.defaultSeriesType(%s);", defaultSeriesType));
            js.setLength(0);
        }
    }


    public void setDefaultseriestype(CartesianSeriesType defaultSeriesType1) {
        this.defaultSeriesType1 = defaultSeriesType1;

        js.append(String.format(Locale.US, "chart.defaultSeriesType(%s);", (defaultSeriesType1 != null) ? defaultSeriesType1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.defaultSeriesType(%s);", (defaultSeriesType1 != null) ? defaultSeriesType1.generateJs() : "null"));
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

    private Double id;
    private String id1;

    public void setGetseries(Double id) {
        this.id = id;

        js.append(String.format(Locale.US, "chart.getSeries(%f);", id));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getSeries(%f);", id));
            js.setLength(0);
        }
    }


    public void setGetseries(String id1) {
        this.id1 = id1;

        js.append(String.format(Locale.US, "chart.getSeries(%s);", id1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getSeries(%s);", id1));
            js.setLength(0);
        }
    }

    private Double index;

    public void setGetseriesat(Double index) {
        this.index = index;

        js.append(String.format(Locale.US, "chart.getSeriesAt(%f);", index));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.getSeriesAt(%f);", index));
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

    private Double index1;

    public void setGrid(Double index1) {
        this.index1 = index1;

        js.append(String.format(Locale.US, "chart.grid(%f);", index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grid(%f);", index1));
            js.setLength(0);
        }
    }

    private Boolean grid;

    public void setGrid(Boolean grid) {
        this.grid = grid;

        js.append(String.format(Locale.US, "chart.grid(%b);", grid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grid(%b);", grid));
            js.setLength(0);
        }
    }

    private Double index2;
    private Boolean grid1;

    public void setGrid(Double index2, Boolean grid1) {
        this.index2 = index2;
        this.grid1 = grid1;

        js.append(String.format(Locale.US, "chart.grid(%f, %b);", index2, grid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.grid(%f, %b);", index2, grid1));
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

    private View data26;
    private Set data27;
    private String[] data28;
    private String data29;
    private TextParsingMode csvSettings12;
    private TextParsingSettings csvSettings13;

    public void setHilo(View data26, TextParsingMode csvSettings12) {
        this.data26 = data26;
        this.csvSettings12 = csvSettings12;

        js.append(String.format(Locale.US, "chart.hilo(%s, %s);", (data26 != null) ? data26.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hilo(%s, %s);", (data26 != null) ? data26.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setHilo(View data26, TextParsingSettings csvSettings13) {
        this.data26 = data26;
        this.csvSettings13 = csvSettings13;

        js.append(String.format(Locale.US, "chart.hilo(%s, %s);", (data26 != null) ? data26.generateJs() : "null", (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hilo(%s, %s);", (data26 != null) ? data26.generateJs() : "null", (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setHilo(Set data27, TextParsingMode csvSettings12) {
        this.data27 = data27;
        this.csvSettings12 = csvSettings12;

        js.append(String.format(Locale.US, "chart.hilo(%s, %s);", (data27 != null) ? data27.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hilo(%s, %s);", (data27 != null) ? data27.generateJs() : "null", (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setHilo(Set data27, TextParsingSettings csvSettings13) {
        this.data27 = data27;
        this.csvSettings13 = csvSettings13;

        js.append(String.format(Locale.US, "chart.hilo(%s, %s);", (data27 != null) ? data27.generateJs() : "null", (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hilo(%s, %s);", (data27 != null) ? data27.generateJs() : "null", (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setHilo(String[] data28, TextParsingMode csvSettings12) {
        this.data28 = data28;
        this.csvSettings12 = csvSettings12;

        js.append(String.format(Locale.US, "chart.hilo(%s, %s);", Arrays.toString(data28), (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hilo(%s, %s);", Arrays.toString(data28), (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setHilo(String[] data28, TextParsingSettings csvSettings13) {
        this.data28 = data28;
        this.csvSettings13 = csvSettings13;

        js.append(String.format(Locale.US, "chart.hilo(%s, %s);", Arrays.toString(data28), (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hilo(%s, %s);", Arrays.toString(data28), (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setHilo(String data29, TextParsingMode csvSettings12) {
        this.data29 = data29;
        this.csvSettings12 = csvSettings12;

        js.append(String.format(Locale.US, "chart.hilo(%s, %s);", data29, (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hilo(%s, %s);", data29, (csvSettings12 != null) ? csvSettings12.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setHilo(String data29, TextParsingSettings csvSettings13) {
        this.data29 = data29;
        this.csvSettings13 = csvSettings13;

        js.append(String.format(Locale.US, "chart.hilo(%s, %s);", data29, (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.hilo(%s, %s);", data29, (csvSettings13 != null) ? csvSettings13.generateJs() : "null"));
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

    private HoverMode interactivity;

    public void setInteractivity(HoverMode interactivity) {
        this.interactivity = interactivity;

        js.append(String.format(Locale.US, "chart.interactivity(%s);", (interactivity != null) ? interactivity.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.interactivity(%s);", (interactivity != null) ? interactivity.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private View data30;
    private Set data31;
    private String[] data32;
    private String data33;
    private TextParsingMode csvSettings14;
    private TextParsingSettings csvSettings15;

    public void setJumpline(View data30, TextParsingMode csvSettings14) {
        this.data30 = data30;
        this.csvSettings14 = csvSettings14;

        js.append(String.format(Locale.US, "chart.jumpLine(%s, %s);", (data30 != null) ? data30.generateJs() : "null", (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.jumpLine(%s, %s);", (data30 != null) ? data30.generateJs() : "null", (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setJumpline(View data30, TextParsingSettings csvSettings15) {
        this.data30 = data30;
        this.csvSettings15 = csvSettings15;

        js.append(String.format(Locale.US, "chart.jumpLine(%s, %s);", (data30 != null) ? data30.generateJs() : "null", (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.jumpLine(%s, %s);", (data30 != null) ? data30.generateJs() : "null", (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setJumpline(Set data31, TextParsingMode csvSettings14) {
        this.data31 = data31;
        this.csvSettings14 = csvSettings14;

        js.append(String.format(Locale.US, "chart.jumpLine(%s, %s);", (data31 != null) ? data31.generateJs() : "null", (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.jumpLine(%s, %s);", (data31 != null) ? data31.generateJs() : "null", (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setJumpline(Set data31, TextParsingSettings csvSettings15) {
        this.data31 = data31;
        this.csvSettings15 = csvSettings15;

        js.append(String.format(Locale.US, "chart.jumpLine(%s, %s);", (data31 != null) ? data31.generateJs() : "null", (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.jumpLine(%s, %s);", (data31 != null) ? data31.generateJs() : "null", (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setJumpline(String[] data32, TextParsingMode csvSettings14) {
        this.data32 = data32;
        this.csvSettings14 = csvSettings14;

        js.append(String.format(Locale.US, "chart.jumpLine(%s, %s);", Arrays.toString(data32), (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.jumpLine(%s, %s);", Arrays.toString(data32), (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setJumpline(String[] data32, TextParsingSettings csvSettings15) {
        this.data32 = data32;
        this.csvSettings15 = csvSettings15;

        js.append(String.format(Locale.US, "chart.jumpLine(%s, %s);", Arrays.toString(data32), (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.jumpLine(%s, %s);", Arrays.toString(data32), (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setJumpline(String data33, TextParsingMode csvSettings14) {
        this.data33 = data33;
        this.csvSettings14 = csvSettings14;

        js.append(String.format(Locale.US, "chart.jumpLine(%s, %s);", data33, (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.jumpLine(%s, %s);", data33, (csvSettings14 != null) ? csvSettings14.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setJumpline(String data33, TextParsingSettings csvSettings15) {
        this.data33 = data33;
        this.csvSettings15 = csvSettings15;

        js.append(String.format(Locale.US, "chart.jumpLine(%s, %s);", data33, (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.jumpLine(%s, %s);", data33, (csvSettings15 != null) ? csvSettings15.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private String index3;
    private Double index4;

    public void setLabel(String index3) {
        this.index3 = index3;

        js.append(String.format(Locale.US, "chart.label(%s);", index3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s);", index3));
            js.setLength(0);
        }
    }


    public void setLabel(Double index4) {
        this.index4 = index4;

        js.append(String.format(Locale.US, "chart.label(%f);", index4));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f);", index4));
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

    private String index5;
    private Double index6;
    private Boolean label2;
    private String label3;

    public void setLabel(String index5, Boolean label2) {
        this.index5 = index5;
        this.label2 = label2;

        js.append(String.format(Locale.US, "chart.label(%s, %b);", index5, label2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %b);", index5, label2));
            js.setLength(0);
        }
    }


    public void setLabel(String index5, String label3) {
        this.index5 = index5;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%s, %s);", index5, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%s, %s);", index5, label3));
            js.setLength(0);
        }
    }


    public void setLabel(Double index6, Boolean label2) {
        this.index6 = index6;
        this.label2 = label2;

        js.append(String.format(Locale.US, "chart.label(%f, %b);", index6, label2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %b);", index6, label2));
            js.setLength(0);
        }
    }


    public void setLabel(Double index6, String label3) {
        this.index6 = index6;
        this.label3 = label3;

        js.append(String.format(Locale.US, "chart.label(%f, %s);", index6, label3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.label(%f, %s);", index6, label3));
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

    private View data34;
    private Set data35;
    private String[] data36;
    private String data37;
    private TextParsingMode csvSettings16;
    private TextParsingSettings csvSettings17;

    public void setLine(View data34, TextParsingMode csvSettings16) {
        this.data34 = data34;
        this.csvSettings16 = csvSettings16;

        js.append(String.format(Locale.US, "chart.line(%s, %s);", (data34 != null) ? data34.generateJs() : "null", (csvSettings16 != null) ? csvSettings16.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.line(%s, %s);", (data34 != null) ? data34.generateJs() : "null", (csvSettings16 != null) ? csvSettings16.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setLine(View data34, TextParsingSettings csvSettings17) {
        this.data34 = data34;
        this.csvSettings17 = csvSettings17;

        js.append(String.format(Locale.US, "chart.line(%s, %s);", (data34 != null) ? data34.generateJs() : "null", (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.line(%s, %s);", (data34 != null) ? data34.generateJs() : "null", (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setLine(Set data35, TextParsingMode csvSettings16) {
        this.data35 = data35;
        this.csvSettings16 = csvSettings16;

        js.append(String.format(Locale.US, "chart.line(%s, %s);", (data35 != null) ? data35.generateJs() : "null", (csvSettings16 != null) ? csvSettings16.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.line(%s, %s);", (data35 != null) ? data35.generateJs() : "null", (csvSettings16 != null) ? csvSettings16.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setLine(Set data35, TextParsingSettings csvSettings17) {
        this.data35 = data35;
        this.csvSettings17 = csvSettings17;

        js.append(String.format(Locale.US, "chart.line(%s, %s);", (data35 != null) ? data35.generateJs() : "null", (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.line(%s, %s);", (data35 != null) ? data35.generateJs() : "null", (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setLine(String[] data36, TextParsingMode csvSettings16) {
        this.data36 = data36;
        this.csvSettings16 = csvSettings16;

        js.append(String.format(Locale.US, "chart.line(%s, %s);", Arrays.toString(data36), (csvSettings16 != null) ? csvSettings16.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.line(%s, %s);", Arrays.toString(data36), (csvSettings16 != null) ? csvSettings16.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setLine(String[] data36, TextParsingSettings csvSettings17) {
        this.data36 = data36;
        this.csvSettings17 = csvSettings17;

        js.append(String.format(Locale.US, "chart.line(%s, %s);", Arrays.toString(data36), (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.line(%s, %s);", Arrays.toString(data36), (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setLine(String data37, TextParsingMode csvSettings16) {
        this.data37 = data37;
        this.csvSettings16 = csvSettings16;

        js.append(String.format(Locale.US, "chart.line(%s, %s);", data37, (csvSettings16 != null) ? csvSettings16.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.line(%s, %s);", data37, (csvSettings16 != null) ? csvSettings16.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setLine(String data37, TextParsingSettings csvSettings17) {
        this.data37 = data37;
        this.csvSettings17 = csvSettings17;

        js.append(String.format(Locale.US, "chart.line(%s, %s);", data37, (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.line(%s, %s);", data37, (csvSettings17 != null) ? csvSettings17.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double index7;

    public void setLinemarker(Double index7) {
        this.index7 = index7;

        js.append(String.format(Locale.US, "chart.lineMarker(%f);", index7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%f);", index7));
            js.setLength(0);
        }
    }

    private Boolean lineMarker;

    public void setLinemarker(Boolean lineMarker) {
        this.lineMarker = lineMarker;

        js.append(String.format(Locale.US, "chart.lineMarker(%b);", lineMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%b);", lineMarker));
            js.setLength(0);
        }
    }

    private Double index8;
    private Boolean lineMarker1;

    public void setLinemarker(Double index8, Boolean lineMarker1) {
        this.index8 = index8;
        this.lineMarker1 = lineMarker1;

        js.append(String.format(Locale.US, "chart.lineMarker(%f, %b);", index8, lineMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.lineMarker(%f, %b);", index8, lineMarker1));
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

    private View data38;
    private Set data39;
    private String[] data40;
    private String data41;
    private TextParsingMode csvSettings18;
    private TextParsingSettings csvSettings19;

    public void setMarker(View data38, TextParsingMode csvSettings18) {
        this.data38 = data38;
        this.csvSettings18 = csvSettings18;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", (data38 != null) ? data38.generateJs() : "null", (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", (data38 != null) ? data38.generateJs() : "null", (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(View data38, TextParsingSettings csvSettings19) {
        this.data38 = data38;
        this.csvSettings19 = csvSettings19;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", (data38 != null) ? data38.generateJs() : "null", (csvSettings19 != null) ? csvSettings19.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", (data38 != null) ? data38.generateJs() : "null", (csvSettings19 != null) ? csvSettings19.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(Set data39, TextParsingMode csvSettings18) {
        this.data39 = data39;
        this.csvSettings18 = csvSettings18;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", (data39 != null) ? data39.generateJs() : "null", (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", (data39 != null) ? data39.generateJs() : "null", (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(Set data39, TextParsingSettings csvSettings19) {
        this.data39 = data39;
        this.csvSettings19 = csvSettings19;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", (data39 != null) ? data39.generateJs() : "null", (csvSettings19 != null) ? csvSettings19.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", (data39 != null) ? data39.generateJs() : "null", (csvSettings19 != null) ? csvSettings19.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(String[] data40, TextParsingMode csvSettings18) {
        this.data40 = data40;
        this.csvSettings18 = csvSettings18;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", Arrays.toString(data40), (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", Arrays.toString(data40), (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(String[] data40, TextParsingSettings csvSettings19) {
        this.data40 = data40;
        this.csvSettings19 = csvSettings19;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", Arrays.toString(data40), (csvSettings19 != null) ? csvSettings19.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", Arrays.toString(data40), (csvSettings19 != null) ? csvSettings19.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(String data41, TextParsingMode csvSettings18) {
        this.data41 = data41;
        this.csvSettings18 = csvSettings18;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", data41, (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", data41, (csvSettings18 != null) ? csvSettings18.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarker(String data41, TextParsingSettings csvSettings19) {
        this.data41 = data41;
        this.csvSettings19 = csvSettings19;

        js.append(String.format(Locale.US, "chart.marker(%s, %s);", data41, (csvSettings19 != null) ? csvSettings19.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.marker(%s, %s);", data41, (csvSettings19 != null) ? csvSettings19.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Markers markerPalette;
    private MarkerType[] markerPalette1;

    public void setMarkerpalette(Markers markerPalette) {
        this.markerPalette = markerPalette;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", (markerPalette != null) ? markerPalette.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", (markerPalette != null) ? markerPalette.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setMarkerpalette(MarkerType[] markerPalette1) {
        this.markerPalette1 = markerPalette1;

        js.append(String.format(Locale.US, "chart.markerPalette(%s);", arrayToString(markerPalette1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.markerPalette(%s);", arrayToString(markerPalette1)));
            js.setLength(0);
        }
    }

    private Double maxBubbleSize;
    private String maxBubbleSize1;

    public void setMaxbubblesize(Double maxBubbleSize) {
        this.maxBubbleSize = maxBubbleSize;

        js.append(String.format(Locale.US, "chart.maxBubbleSize(%f);", maxBubbleSize));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxBubbleSize(%f);", maxBubbleSize));
            js.setLength(0);
        }
    }


    public void setMaxbubblesize(String maxBubbleSize1) {
        this.maxBubbleSize1 = maxBubbleSize1;

        js.append(String.format(Locale.US, "chart.maxBubbleSize(%s);", maxBubbleSize1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.maxBubbleSize(%s);", maxBubbleSize1));
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

    private Double minBubbleSize;
    private String minBubbleSize1;

    public void setMinbubblesize(Double minBubbleSize) {
        this.minBubbleSize = minBubbleSize;

        js.append(String.format(Locale.US, "chart.minBubbleSize(%f);", minBubbleSize));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minBubbleSize(%f);", minBubbleSize));
            js.setLength(0);
        }
    }


    public void setMinbubblesize(String minBubbleSize1) {
        this.minBubbleSize1 = minBubbleSize1;

        js.append(String.format(Locale.US, "chart.minBubbleSize(%s);", minBubbleSize1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minBubbleSize(%s);", minBubbleSize1));
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

    private Double index9;

    public void setMinorgrid(Double index9) {
        this.index9 = index9;

        js.append(String.format(Locale.US, "chart.minorGrid(%f);", index9));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minorGrid(%f);", index9));
            js.setLength(0);
        }
    }

    private Boolean minorGrid;

    public void setMinorgrid(Boolean minorGrid) {
        this.minorGrid = minorGrid;

        js.append(String.format(Locale.US, "chart.minorGrid(%b);", minorGrid));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minorGrid(%b);", minorGrid));
            js.setLength(0);
        }
    }

    private Double index10;
    private Boolean minorGrid1;

    public void setMinorgrid(Double index10, Boolean minorGrid1) {
        this.index10 = index10;
        this.minorGrid1 = minorGrid1;

        js.append(String.format(Locale.US, "chart.minorGrid(%f, %b);", index10, minorGrid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.minorGrid(%f, %b);", index10, minorGrid1));
            js.setLength(0);
        }
    }

    private View data42;
    private Set data43;
    private String[] data44;
    private String data45;
    private TextParsingMode csvSettings20;
    private TextParsingSettings csvSettings21;

    public void setOhlc(View data42, TextParsingMode csvSettings20) {
        this.data42 = data42;
        this.csvSettings20 = csvSettings20;

        js.append(String.format(Locale.US, "chart.ohlc(%s, %s);", (data42 != null) ? data42.generateJs() : "null", (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.ohlc(%s, %s);", (data42 != null) ? data42.generateJs() : "null", (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setOhlc(View data42, TextParsingSettings csvSettings21) {
        this.data42 = data42;
        this.csvSettings21 = csvSettings21;

        js.append(String.format(Locale.US, "chart.ohlc(%s, %s);", (data42 != null) ? data42.generateJs() : "null", (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.ohlc(%s, %s);", (data42 != null) ? data42.generateJs() : "null", (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setOhlc(Set data43, TextParsingMode csvSettings20) {
        this.data43 = data43;
        this.csvSettings20 = csvSettings20;

        js.append(String.format(Locale.US, "chart.ohlc(%s, %s);", (data43 != null) ? data43.generateJs() : "null", (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.ohlc(%s, %s);", (data43 != null) ? data43.generateJs() : "null", (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setOhlc(Set data43, TextParsingSettings csvSettings21) {
        this.data43 = data43;
        this.csvSettings21 = csvSettings21;

        js.append(String.format(Locale.US, "chart.ohlc(%s, %s);", (data43 != null) ? data43.generateJs() : "null", (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.ohlc(%s, %s);", (data43 != null) ? data43.generateJs() : "null", (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setOhlc(String[] data44, TextParsingMode csvSettings20) {
        this.data44 = data44;
        this.csvSettings20 = csvSettings20;

        js.append(String.format(Locale.US, "chart.ohlc(%s, %s);", Arrays.toString(data44), (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.ohlc(%s, %s);", Arrays.toString(data44), (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setOhlc(String[] data44, TextParsingSettings csvSettings21) {
        this.data44 = data44;
        this.csvSettings21 = csvSettings21;

        js.append(String.format(Locale.US, "chart.ohlc(%s, %s);", Arrays.toString(data44), (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.ohlc(%s, %s);", Arrays.toString(data44), (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setOhlc(String data45, TextParsingMode csvSettings20) {
        this.data45 = data45;
        this.csvSettings20 = csvSettings20;

        js.append(String.format(Locale.US, "chart.ohlc(%s, %s);", data45, (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.ohlc(%s, %s);", data45, (csvSettings20 != null) ? csvSettings20.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setOhlc(String data45, TextParsingSettings csvSettings21) {
        this.data45 = data45;
        this.csvSettings21 = csvSettings21;

        js.append(String.format(Locale.US, "chart.ohlc(%s, %s);", data45, (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.ohlc(%s, %s);", data45, (csvSettings21 != null) ? csvSettings21.generateJs() : "null"));
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

    private PaperSize paperSize;
    private Boolean landscape;

    public void setPrint(PaperSize paperSize, Boolean landscape) {
        this.paperSize = paperSize;
        this.landscape = landscape;

        js.append(String.format(Locale.US, "chart.print(%s, %b);", (paperSize != null) ? paperSize.generateJs() : "null", landscape));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.print(%s, %b);", (paperSize != null) ? paperSize.generateJs() : "null", landscape));
            js.setLength(0);
        }
    }

    private View data46;
    private Set data47;
    private String[] data48;
    private String data49;
    private TextParsingMode csvSettings22;
    private TextParsingSettings csvSettings23;

    public void setRangearea(View data46, TextParsingMode csvSettings22) {
        this.data46 = data46;
        this.csvSettings22 = csvSettings22;

        js.append(String.format(Locale.US, "chart.rangeArea(%s, %s);", (data46 != null) ? data46.generateJs() : "null", (csvSettings22 != null) ? csvSettings22.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeArea(%s, %s);", (data46 != null) ? data46.generateJs() : "null", (csvSettings22 != null) ? csvSettings22.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangearea(View data46, TextParsingSettings csvSettings23) {
        this.data46 = data46;
        this.csvSettings23 = csvSettings23;

        js.append(String.format(Locale.US, "chart.rangeArea(%s, %s);", (data46 != null) ? data46.generateJs() : "null", (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeArea(%s, %s);", (data46 != null) ? data46.generateJs() : "null", (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangearea(Set data47, TextParsingMode csvSettings22) {
        this.data47 = data47;
        this.csvSettings22 = csvSettings22;

        js.append(String.format(Locale.US, "chart.rangeArea(%s, %s);", (data47 != null) ? data47.generateJs() : "null", (csvSettings22 != null) ? csvSettings22.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeArea(%s, %s);", (data47 != null) ? data47.generateJs() : "null", (csvSettings22 != null) ? csvSettings22.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangearea(Set data47, TextParsingSettings csvSettings23) {
        this.data47 = data47;
        this.csvSettings23 = csvSettings23;

        js.append(String.format(Locale.US, "chart.rangeArea(%s, %s);", (data47 != null) ? data47.generateJs() : "null", (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeArea(%s, %s);", (data47 != null) ? data47.generateJs() : "null", (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangearea(String[] data48, TextParsingMode csvSettings22) {
        this.data48 = data48;
        this.csvSettings22 = csvSettings22;

        js.append(String.format(Locale.US, "chart.rangeArea(%s, %s);", Arrays.toString(data48), (csvSettings22 != null) ? csvSettings22.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeArea(%s, %s);", Arrays.toString(data48), (csvSettings22 != null) ? csvSettings22.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangearea(String[] data48, TextParsingSettings csvSettings23) {
        this.data48 = data48;
        this.csvSettings23 = csvSettings23;

        js.append(String.format(Locale.US, "chart.rangeArea(%s, %s);", Arrays.toString(data48), (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeArea(%s, %s);", Arrays.toString(data48), (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangearea(String data49, TextParsingMode csvSettings22) {
        this.data49 = data49;
        this.csvSettings22 = csvSettings22;

        js.append(String.format(Locale.US, "chart.rangeArea(%s, %s);", data49, (csvSettings22 != null) ? csvSettings22.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeArea(%s, %s);", data49, (csvSettings22 != null) ? csvSettings22.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangearea(String data49, TextParsingSettings csvSettings23) {
        this.data49 = data49;
        this.csvSettings23 = csvSettings23;

        js.append(String.format(Locale.US, "chart.rangeArea(%s, %s);", data49, (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeArea(%s, %s);", data49, (csvSettings23 != null) ? csvSettings23.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private View data50;
    private Set data51;
    private String[] data52;
    private String data53;
    private TextParsingMode csvSettings24;
    private TextParsingSettings csvSettings25;

    public void setRangebar(View data50, TextParsingMode csvSettings24) {
        this.data50 = data50;
        this.csvSettings24 = csvSettings24;

        js.append(String.format(Locale.US, "chart.rangeBar(%s, %s);", (data50 != null) ? data50.generateJs() : "null", (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeBar(%s, %s);", (data50 != null) ? data50.generateJs() : "null", (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangebar(View data50, TextParsingSettings csvSettings25) {
        this.data50 = data50;
        this.csvSettings25 = csvSettings25;

        js.append(String.format(Locale.US, "chart.rangeBar(%s, %s);", (data50 != null) ? data50.generateJs() : "null", (csvSettings25 != null) ? csvSettings25.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeBar(%s, %s);", (data50 != null) ? data50.generateJs() : "null", (csvSettings25 != null) ? csvSettings25.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangebar(Set data51, TextParsingMode csvSettings24) {
        this.data51 = data51;
        this.csvSettings24 = csvSettings24;

        js.append(String.format(Locale.US, "chart.rangeBar(%s, %s);", (data51 != null) ? data51.generateJs() : "null", (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeBar(%s, %s);", (data51 != null) ? data51.generateJs() : "null", (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangebar(Set data51, TextParsingSettings csvSettings25) {
        this.data51 = data51;
        this.csvSettings25 = csvSettings25;

        js.append(String.format(Locale.US, "chart.rangeBar(%s, %s);", (data51 != null) ? data51.generateJs() : "null", (csvSettings25 != null) ? csvSettings25.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeBar(%s, %s);", (data51 != null) ? data51.generateJs() : "null", (csvSettings25 != null) ? csvSettings25.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangebar(String[] data52, TextParsingMode csvSettings24) {
        this.data52 = data52;
        this.csvSettings24 = csvSettings24;

        js.append(String.format(Locale.US, "chart.rangeBar(%s, %s);", Arrays.toString(data52), (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeBar(%s, %s);", Arrays.toString(data52), (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangebar(String[] data52, TextParsingSettings csvSettings25) {
        this.data52 = data52;
        this.csvSettings25 = csvSettings25;

        js.append(String.format(Locale.US, "chart.rangeBar(%s, %s);", Arrays.toString(data52), (csvSettings25 != null) ? csvSettings25.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeBar(%s, %s);", Arrays.toString(data52), (csvSettings25 != null) ? csvSettings25.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangebar(String data53, TextParsingMode csvSettings24) {
        this.data53 = data53;
        this.csvSettings24 = csvSettings24;

        js.append(String.format(Locale.US, "chart.rangeBar(%s, %s);", data53, (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeBar(%s, %s);", data53, (csvSettings24 != null) ? csvSettings24.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangebar(String data53, TextParsingSettings csvSettings25) {
        this.data53 = data53;
        this.csvSettings25 = csvSettings25;

        js.append(String.format(Locale.US, "chart.rangeBar(%s, %s);", data53, (csvSettings25 != null) ? csvSettings25.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeBar(%s, %s);", data53, (csvSettings25 != null) ? csvSettings25.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private View data54;
    private Set data55;
    private String[] data56;
    private String data57;
    private TextParsingMode csvSettings26;
    private TextParsingSettings csvSettings27;

    public void setRangecolumn(View data54, TextParsingMode csvSettings26) {
        this.data54 = data54;
        this.csvSettings26 = csvSettings26;

        js.append(String.format(Locale.US, "chart.rangeColumn(%s, %s);", (data54 != null) ? data54.generateJs() : "null", (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeColumn(%s, %s);", (data54 != null) ? data54.generateJs() : "null", (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangecolumn(View data54, TextParsingSettings csvSettings27) {
        this.data54 = data54;
        this.csvSettings27 = csvSettings27;

        js.append(String.format(Locale.US, "chart.rangeColumn(%s, %s);", (data54 != null) ? data54.generateJs() : "null", (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeColumn(%s, %s);", (data54 != null) ? data54.generateJs() : "null", (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangecolumn(Set data55, TextParsingMode csvSettings26) {
        this.data55 = data55;
        this.csvSettings26 = csvSettings26;

        js.append(String.format(Locale.US, "chart.rangeColumn(%s, %s);", (data55 != null) ? data55.generateJs() : "null", (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeColumn(%s, %s);", (data55 != null) ? data55.generateJs() : "null", (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangecolumn(Set data55, TextParsingSettings csvSettings27) {
        this.data55 = data55;
        this.csvSettings27 = csvSettings27;

        js.append(String.format(Locale.US, "chart.rangeColumn(%s, %s);", (data55 != null) ? data55.generateJs() : "null", (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeColumn(%s, %s);", (data55 != null) ? data55.generateJs() : "null", (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangecolumn(String[] data56, TextParsingMode csvSettings26) {
        this.data56 = data56;
        this.csvSettings26 = csvSettings26;

        js.append(String.format(Locale.US, "chart.rangeColumn(%s, %s);", Arrays.toString(data56), (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeColumn(%s, %s);", Arrays.toString(data56), (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangecolumn(String[] data56, TextParsingSettings csvSettings27) {
        this.data56 = data56;
        this.csvSettings27 = csvSettings27;

        js.append(String.format(Locale.US, "chart.rangeColumn(%s, %s);", Arrays.toString(data56), (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeColumn(%s, %s);", Arrays.toString(data56), (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangecolumn(String data57, TextParsingMode csvSettings26) {
        this.data57 = data57;
        this.csvSettings26 = csvSettings26;

        js.append(String.format(Locale.US, "chart.rangeColumn(%s, %s);", data57, (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeColumn(%s, %s);", data57, (csvSettings26 != null) ? csvSettings26.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangecolumn(String data57, TextParsingSettings csvSettings27) {
        this.data57 = data57;
        this.csvSettings27 = csvSettings27;

        js.append(String.format(Locale.US, "chart.rangeColumn(%s, %s);", data57, (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeColumn(%s, %s);", data57, (csvSettings27 != null) ? csvSettings27.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double index11;

    public void setRangemarker(Double index11) {
        this.index11 = index11;

        js.append(String.format(Locale.US, "chart.rangeMarker(%f);", index11));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%f);", index11));
            js.setLength(0);
        }
    }

    private Boolean rangeMarker;

    public void setRangemarker(Boolean rangeMarker) {
        this.rangeMarker = rangeMarker;

        js.append(String.format(Locale.US, "chart.rangeMarker(%b);", rangeMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%b);", rangeMarker));
            js.setLength(0);
        }
    }

    private Double index12;
    private Boolean rangeMarker1;

    public void setRangemarker(Double index12, Boolean rangeMarker1) {
        this.index12 = index12;
        this.rangeMarker1 = rangeMarker1;

        js.append(String.format(Locale.US, "chart.rangeMarker(%f, %b);", index12, rangeMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeMarker(%f, %b);", index12, rangeMarker1));
            js.setLength(0);
        }
    }

    private View data58;
    private Set data59;
    private String[] data60;
    private String data61;
    private TextParsingMode csvSettings28;
    private TextParsingSettings csvSettings29;

    public void setRangesplinearea(View data58, TextParsingMode csvSettings28) {
        this.data58 = data58;
        this.csvSettings28 = csvSettings28;

        js.append(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", (data58 != null) ? data58.generateJs() : "null", (csvSettings28 != null) ? csvSettings28.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", (data58 != null) ? data58.generateJs() : "null", (csvSettings28 != null) ? csvSettings28.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesplinearea(View data58, TextParsingSettings csvSettings29) {
        this.data58 = data58;
        this.csvSettings29 = csvSettings29;

        js.append(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", (data58 != null) ? data58.generateJs() : "null", (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", (data58 != null) ? data58.generateJs() : "null", (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesplinearea(Set data59, TextParsingMode csvSettings28) {
        this.data59 = data59;
        this.csvSettings28 = csvSettings28;

        js.append(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", (data59 != null) ? data59.generateJs() : "null", (csvSettings28 != null) ? csvSettings28.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", (data59 != null) ? data59.generateJs() : "null", (csvSettings28 != null) ? csvSettings28.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesplinearea(Set data59, TextParsingSettings csvSettings29) {
        this.data59 = data59;
        this.csvSettings29 = csvSettings29;

        js.append(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", (data59 != null) ? data59.generateJs() : "null", (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", (data59 != null) ? data59.generateJs() : "null", (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesplinearea(String[] data60, TextParsingMode csvSettings28) {
        this.data60 = data60;
        this.csvSettings28 = csvSettings28;

        js.append(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", Arrays.toString(data60), (csvSettings28 != null) ? csvSettings28.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", Arrays.toString(data60), (csvSettings28 != null) ? csvSettings28.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesplinearea(String[] data60, TextParsingSettings csvSettings29) {
        this.data60 = data60;
        this.csvSettings29 = csvSettings29;

        js.append(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", Arrays.toString(data60), (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", Arrays.toString(data60), (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesplinearea(String data61, TextParsingMode csvSettings28) {
        this.data61 = data61;
        this.csvSettings28 = csvSettings28;

        js.append(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", data61, (csvSettings28 != null) ? csvSettings28.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", data61, (csvSettings28 != null) ? csvSettings28.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesplinearea(String data61, TextParsingSettings csvSettings29) {
        this.data61 = data61;
        this.csvSettings29 = csvSettings29;

        js.append(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", data61, (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeSplineArea(%s, %s);", data61, (csvSettings29 != null) ? csvSettings29.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private View data62;
    private Set data63;
    private String[] data64;
    private String data65;
    private TextParsingMode csvSettings30;
    private TextParsingSettings csvSettings31;

    public void setRangesteparea(View data62, TextParsingMode csvSettings30) {
        this.data62 = data62;
        this.csvSettings30 = csvSettings30;

        js.append(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", (data62 != null) ? data62.generateJs() : "null", (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", (data62 != null) ? data62.generateJs() : "null", (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesteparea(View data62, TextParsingSettings csvSettings31) {
        this.data62 = data62;
        this.csvSettings31 = csvSettings31;

        js.append(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", (data62 != null) ? data62.generateJs() : "null", (csvSettings31 != null) ? csvSettings31.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", (data62 != null) ? data62.generateJs() : "null", (csvSettings31 != null) ? csvSettings31.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesteparea(Set data63, TextParsingMode csvSettings30) {
        this.data63 = data63;
        this.csvSettings30 = csvSettings30;

        js.append(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", (data63 != null) ? data63.generateJs() : "null", (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", (data63 != null) ? data63.generateJs() : "null", (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesteparea(Set data63, TextParsingSettings csvSettings31) {
        this.data63 = data63;
        this.csvSettings31 = csvSettings31;

        js.append(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", (data63 != null) ? data63.generateJs() : "null", (csvSettings31 != null) ? csvSettings31.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", (data63 != null) ? data63.generateJs() : "null", (csvSettings31 != null) ? csvSettings31.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesteparea(String[] data64, TextParsingMode csvSettings30) {
        this.data64 = data64;
        this.csvSettings30 = csvSettings30;

        js.append(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", Arrays.toString(data64), (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", Arrays.toString(data64), (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesteparea(String[] data64, TextParsingSettings csvSettings31) {
        this.data64 = data64;
        this.csvSettings31 = csvSettings31;

        js.append(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", Arrays.toString(data64), (csvSettings31 != null) ? csvSettings31.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", Arrays.toString(data64), (csvSettings31 != null) ? csvSettings31.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesteparea(String data65, TextParsingMode csvSettings30) {
        this.data65 = data65;
        this.csvSettings30 = csvSettings30;

        js.append(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", data65, (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", data65, (csvSettings30 != null) ? csvSettings30.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setRangesteparea(String data65, TextParsingSettings csvSettings31) {
        this.data65 = data65;
        this.csvSettings31 = csvSettings31;

        js.append(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", data65, (csvSettings31 != null) ? csvSettings31.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.rangeStepArea(%s, %s);", data65, (csvSettings31 != null) ? csvSettings31.generateJs() : "null"));
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

    private Double id2;
    private String id3;

    public void setRemoveseries(Double id2) {
        this.id2 = id2;

        js.append(String.format(Locale.US, "chart.removeSeries(%f);", id2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeSeries(%f);", id2));
            js.setLength(0);
        }
    }


    public void setRemoveseries(String id3) {
        this.id3 = id3;

        js.append(String.format(Locale.US, "chart.removeSeries(%s);", id3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeSeries(%s);", id3));
            js.setLength(0);
        }
    }

    private Double index13;

    public void setRemoveseriesat(Double index13) {
        this.index13 = index13;

        js.append(String.format(Locale.US, "chart.removeSeriesAt(%f);", index13));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.removeSeriesAt(%f);", index13));
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
    private String csvSettings32;
    private String filename;

    public void setSaveascsv(String chartDataExportMode, String csvSettings32, String filename) {
        this.chartDataExportMode = chartDataExportMode;
        this.csvSettings32 = csvSettings32;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings32, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", chartDataExportMode, csvSettings32, filename));
            js.setLength(0);
        }
    }


    public void setSaveascsv(ChartDataExportMode chartDataExportMode1, String csvSettings32, String filename) {
        this.chartDataExportMode1 = chartDataExportMode1;
        this.csvSettings32 = csvSettings32;
        this.filename = filename;

        js.append(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings32, filename));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsCsv(%s, %s, %s);", (chartDataExportMode1 != null) ? chartDataExportMode1.generateJs() : "null", csvSettings32, filename));
            js.setLength(0);
        }
    }

    private Double width2;
    private Double height4;
    private Double quality;
    private Boolean forceTransparentWhite;

    public void setSaveasjpg(Double width2, Double height4, Double quality, Boolean forceTransparentWhite) {
        this.width2 = width2;
        this.height4 = height4;
        this.quality = quality;
        this.forceTransparentWhite = forceTransparentWhite;

        js.append(String.format(Locale.US, "chart.saveAsJpg(%f, %f, %f, %b);", width2, height4, quality, forceTransparentWhite));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJpg(%f, %f, %f, %b);", width2, height4, quality, forceTransparentWhite));
            js.setLength(0);
        }
    }

    private Boolean includeTheme;
    private String filename1;

    public void setSaveasjson(Boolean includeTheme, String filename1) {
        this.includeTheme = includeTheme;
        this.filename1 = filename1;

        js.append(String.format(Locale.US, "chart.saveAsJson(%b, %s);", includeTheme, filename1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsJson(%b, %s);", includeTheme, filename1));
            js.setLength(0);
        }
    }

    private String paperSize1;
    private Boolean landscape1;
    private Double x2;
    private Double y2;

    public void setSaveaspdf(String paperSize1, Boolean landscape1, Double x2, Double y2) {
        this.paperSize1 = paperSize1;
        this.landscape1 = landscape1;
        this.x2 = x2;
        this.y2 = y2;

        js.append(String.format(Locale.US, "chart.saveAsPdf(%s, %b, %f, %f);", paperSize1, landscape1, x2, y2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPdf(%s, %b, %f, %f);", paperSize1, landscape1, x2, y2));
            js.setLength(0);
        }
    }

    private Double width3;
    private Double height5;
    private Double quality1;

    public void setSaveaspng(Double width3, Double height5, Double quality1) {
        this.width3 = width3;
        this.height5 = height5;
        this.quality1 = quality1;

        js.append(String.format(Locale.US, "chart.saveAsPng(%f, %f, %f);", width3, height5, quality1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsPng(%f, %f, %f);", width3, height5, quality1));
            js.setLength(0);
        }
    }

    private String paperSize2;
    private Boolean landscape2;

    public void setSaveassvg(String paperSize2, Boolean landscape2) {
        this.paperSize2 = paperSize2;
        this.landscape2 = landscape2;

        js.append(String.format(Locale.US, "chart.saveAsSvg(%s, %b);", paperSize2, landscape2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsSvg(%s, %b);", paperSize2, landscape2));
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
    private String filename2;

    public void setSaveasxlsx(String chartDataExportMode2, String filename2) {
        this.chartDataExportMode2 = chartDataExportMode2;
        this.filename2 = filename2;

        js.append(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", chartDataExportMode2, filename2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", chartDataExportMode2, filename2));
            js.setLength(0);
        }
    }


    public void setSaveasxlsx(ChartDataExportMode chartDataExportMode3, String filename2) {
        this.chartDataExportMode3 = chartDataExportMode3;
        this.filename2 = filename2;

        js.append(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null", filename2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXlsx(%s, %s);", (chartDataExportMode3 != null) ? chartDataExportMode3.generateJs() : "null", filename2));
            js.setLength(0);
        }
    }

    private Boolean includeTheme1;
    private String filename3;

    public void setSaveasxml(Boolean includeTheme1, String filename3) {
        this.includeTheme1 = includeTheme1;
        this.filename3 = filename3;

        js.append(String.format(Locale.US, "chart.saveAsXml(%b, %s);", includeTheme1, filename3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.saveAsXml(%b, %s);", includeTheme1, filename3));
            js.setLength(0);
        }
    }

    private Boolean selectLabels;

    public void setSelectlabels(Boolean selectLabels) {
        this.selectLabels = selectLabels;

        js.append(String.format(Locale.US, "chart.selectLabels(%b);", selectLabels));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectLabels(%b);", selectLabels));
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

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode2;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setSelectmarqueefill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode2, Double opacity2, Double fx, Double fy) {
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode2 = mode2;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
    }


    public void setSelectmarqueefill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode2, Double opacity2, Double fx, Double fy) {
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode2 = mode2;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;

        js.append(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.selectMarqueeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode2 != null) ? mode2.generateJs() : "null", opacity2, fx, fy));
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

    private View data66;
    private Set data67;
    private String[] data68;
    private String data69;
    private TextParsingMode csvSettings33;
    private TextParsingSettings csvSettings34;

    public void setSpline(View data66, TextParsingMode csvSettings33) {
        this.data66 = data66;
        this.csvSettings33 = csvSettings33;

        js.append(String.format(Locale.US, "chart.spline(%s, %s);", (data66 != null) ? data66.generateJs() : "null", (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.spline(%s, %s);", (data66 != null) ? data66.generateJs() : "null", (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSpline(View data66, TextParsingSettings csvSettings34) {
        this.data66 = data66;
        this.csvSettings34 = csvSettings34;

        js.append(String.format(Locale.US, "chart.spline(%s, %s);", (data66 != null) ? data66.generateJs() : "null", (csvSettings34 != null) ? csvSettings34.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.spline(%s, %s);", (data66 != null) ? data66.generateJs() : "null", (csvSettings34 != null) ? csvSettings34.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSpline(Set data67, TextParsingMode csvSettings33) {
        this.data67 = data67;
        this.csvSettings33 = csvSettings33;

        js.append(String.format(Locale.US, "chart.spline(%s, %s);", (data67 != null) ? data67.generateJs() : "null", (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.spline(%s, %s);", (data67 != null) ? data67.generateJs() : "null", (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSpline(Set data67, TextParsingSettings csvSettings34) {
        this.data67 = data67;
        this.csvSettings34 = csvSettings34;

        js.append(String.format(Locale.US, "chart.spline(%s, %s);", (data67 != null) ? data67.generateJs() : "null", (csvSettings34 != null) ? csvSettings34.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.spline(%s, %s);", (data67 != null) ? data67.generateJs() : "null", (csvSettings34 != null) ? csvSettings34.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSpline(String[] data68, TextParsingMode csvSettings33) {
        this.data68 = data68;
        this.csvSettings33 = csvSettings33;

        js.append(String.format(Locale.US, "chart.spline(%s, %s);", Arrays.toString(data68), (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.spline(%s, %s);", Arrays.toString(data68), (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSpline(String[] data68, TextParsingSettings csvSettings34) {
        this.data68 = data68;
        this.csvSettings34 = csvSettings34;

        js.append(String.format(Locale.US, "chart.spline(%s, %s);", Arrays.toString(data68), (csvSettings34 != null) ? csvSettings34.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.spline(%s, %s);", Arrays.toString(data68), (csvSettings34 != null) ? csvSettings34.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSpline(String data69, TextParsingMode csvSettings33) {
        this.data69 = data69;
        this.csvSettings33 = csvSettings33;

        js.append(String.format(Locale.US, "chart.spline(%s, %s);", data69, (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.spline(%s, %s);", data69, (csvSettings33 != null) ? csvSettings33.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSpline(String data69, TextParsingSettings csvSettings34) {
        this.data69 = data69;
        this.csvSettings34 = csvSettings34;

        js.append(String.format(Locale.US, "chart.spline(%s, %s);", data69, (csvSettings34 != null) ? csvSettings34.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.spline(%s, %s);", data69, (csvSettings34 != null) ? csvSettings34.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private View data70;
    private Set data71;
    private String[] data72;
    private String data73;
    private TextParsingMode csvSettings35;
    private TextParsingSettings csvSettings36;

    public void setSplinearea(View data70, TextParsingMode csvSettings35) {
        this.data70 = data70;
        this.csvSettings35 = csvSettings35;

        js.append(String.format(Locale.US, "chart.splineArea(%s, %s);", (data70 != null) ? data70.generateJs() : "null", (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.splineArea(%s, %s);", (data70 != null) ? data70.generateJs() : "null", (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSplinearea(View data70, TextParsingSettings csvSettings36) {
        this.data70 = data70;
        this.csvSettings36 = csvSettings36;

        js.append(String.format(Locale.US, "chart.splineArea(%s, %s);", (data70 != null) ? data70.generateJs() : "null", (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.splineArea(%s, %s);", (data70 != null) ? data70.generateJs() : "null", (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSplinearea(Set data71, TextParsingMode csvSettings35) {
        this.data71 = data71;
        this.csvSettings35 = csvSettings35;

        js.append(String.format(Locale.US, "chart.splineArea(%s, %s);", (data71 != null) ? data71.generateJs() : "null", (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.splineArea(%s, %s);", (data71 != null) ? data71.generateJs() : "null", (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSplinearea(Set data71, TextParsingSettings csvSettings36) {
        this.data71 = data71;
        this.csvSettings36 = csvSettings36;

        js.append(String.format(Locale.US, "chart.splineArea(%s, %s);", (data71 != null) ? data71.generateJs() : "null", (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.splineArea(%s, %s);", (data71 != null) ? data71.generateJs() : "null", (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSplinearea(String[] data72, TextParsingMode csvSettings35) {
        this.data72 = data72;
        this.csvSettings35 = csvSettings35;

        js.append(String.format(Locale.US, "chart.splineArea(%s, %s);", Arrays.toString(data72), (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.splineArea(%s, %s);", Arrays.toString(data72), (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSplinearea(String[] data72, TextParsingSettings csvSettings36) {
        this.data72 = data72;
        this.csvSettings36 = csvSettings36;

        js.append(String.format(Locale.US, "chart.splineArea(%s, %s);", Arrays.toString(data72), (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.splineArea(%s, %s);", Arrays.toString(data72), (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSplinearea(String data73, TextParsingMode csvSettings35) {
        this.data73 = data73;
        this.csvSettings35 = csvSettings35;

        js.append(String.format(Locale.US, "chart.splineArea(%s, %s);", data73, (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.splineArea(%s, %s);", data73, (csvSettings35 != null) ? csvSettings35.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSplinearea(String data73, TextParsingSettings csvSettings36) {
        this.data73 = data73;
        this.csvSettings36 = csvSettings36;

        js.append(String.format(Locale.US, "chart.splineArea(%s, %s);", data73, (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.splineArea(%s, %s);", data73, (csvSettings36 != null) ? csvSettings36.generateJs() : "null"));
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

    private View data74;
    private Set data75;
    private String[] data76;
    private String data77;
    private TextParsingMode csvSettings37;
    private TextParsingSettings csvSettings38;

    public void setSteparea(View data74, TextParsingMode csvSettings37) {
        this.data74 = data74;
        this.csvSettings37 = csvSettings37;

        js.append(String.format(Locale.US, "chart.stepArea(%s, %s);", (data74 != null) ? data74.generateJs() : "null", (csvSettings37 != null) ? csvSettings37.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepArea(%s, %s);", (data74 != null) ? data74.generateJs() : "null", (csvSettings37 != null) ? csvSettings37.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSteparea(View data74, TextParsingSettings csvSettings38) {
        this.data74 = data74;
        this.csvSettings38 = csvSettings38;

        js.append(String.format(Locale.US, "chart.stepArea(%s, %s);", (data74 != null) ? data74.generateJs() : "null", (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepArea(%s, %s);", (data74 != null) ? data74.generateJs() : "null", (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSteparea(Set data75, TextParsingMode csvSettings37) {
        this.data75 = data75;
        this.csvSettings37 = csvSettings37;

        js.append(String.format(Locale.US, "chart.stepArea(%s, %s);", (data75 != null) ? data75.generateJs() : "null", (csvSettings37 != null) ? csvSettings37.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepArea(%s, %s);", (data75 != null) ? data75.generateJs() : "null", (csvSettings37 != null) ? csvSettings37.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSteparea(Set data75, TextParsingSettings csvSettings38) {
        this.data75 = data75;
        this.csvSettings38 = csvSettings38;

        js.append(String.format(Locale.US, "chart.stepArea(%s, %s);", (data75 != null) ? data75.generateJs() : "null", (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepArea(%s, %s);", (data75 != null) ? data75.generateJs() : "null", (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSteparea(String[] data76, TextParsingMode csvSettings37) {
        this.data76 = data76;
        this.csvSettings37 = csvSettings37;

        js.append(String.format(Locale.US, "chart.stepArea(%s, %s);", Arrays.toString(data76), (csvSettings37 != null) ? csvSettings37.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepArea(%s, %s);", Arrays.toString(data76), (csvSettings37 != null) ? csvSettings37.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSteparea(String[] data76, TextParsingSettings csvSettings38) {
        this.data76 = data76;
        this.csvSettings38 = csvSettings38;

        js.append(String.format(Locale.US, "chart.stepArea(%s, %s);", Arrays.toString(data76), (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepArea(%s, %s);", Arrays.toString(data76), (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSteparea(String data77, TextParsingMode csvSettings37) {
        this.data77 = data77;
        this.csvSettings37 = csvSettings37;

        js.append(String.format(Locale.US, "chart.stepArea(%s, %s);", data77, (csvSettings37 != null) ? csvSettings37.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepArea(%s, %s);", data77, (csvSettings37 != null) ? csvSettings37.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setSteparea(String data77, TextParsingSettings csvSettings38) {
        this.data77 = data77;
        this.csvSettings38 = csvSettings38;

        js.append(String.format(Locale.US, "chart.stepArea(%s, %s);", data77, (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepArea(%s, %s);", data77, (csvSettings38 != null) ? csvSettings38.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private View data78;
    private Set data79;
    private String[] data80;
    private String data81;
    private TextParsingMode csvSettings39;
    private TextParsingSettings csvSettings40;

    public void setStepline(View data78, TextParsingMode csvSettings39) {
        this.data78 = data78;
        this.csvSettings39 = csvSettings39;

        js.append(String.format(Locale.US, "chart.stepLine(%s, %s);", (data78 != null) ? data78.generateJs() : "null", (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepLine(%s, %s);", (data78 != null) ? data78.generateJs() : "null", (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStepline(View data78, TextParsingSettings csvSettings40) {
        this.data78 = data78;
        this.csvSettings40 = csvSettings40;

        js.append(String.format(Locale.US, "chart.stepLine(%s, %s);", (data78 != null) ? data78.generateJs() : "null", (csvSettings40 != null) ? csvSettings40.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepLine(%s, %s);", (data78 != null) ? data78.generateJs() : "null", (csvSettings40 != null) ? csvSettings40.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStepline(Set data79, TextParsingMode csvSettings39) {
        this.data79 = data79;
        this.csvSettings39 = csvSettings39;

        js.append(String.format(Locale.US, "chart.stepLine(%s, %s);", (data79 != null) ? data79.generateJs() : "null", (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepLine(%s, %s);", (data79 != null) ? data79.generateJs() : "null", (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStepline(Set data79, TextParsingSettings csvSettings40) {
        this.data79 = data79;
        this.csvSettings40 = csvSettings40;

        js.append(String.format(Locale.US, "chart.stepLine(%s, %s);", (data79 != null) ? data79.generateJs() : "null", (csvSettings40 != null) ? csvSettings40.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepLine(%s, %s);", (data79 != null) ? data79.generateJs() : "null", (csvSettings40 != null) ? csvSettings40.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStepline(String[] data80, TextParsingMode csvSettings39) {
        this.data80 = data80;
        this.csvSettings39 = csvSettings39;

        js.append(String.format(Locale.US, "chart.stepLine(%s, %s);", Arrays.toString(data80), (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepLine(%s, %s);", Arrays.toString(data80), (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStepline(String[] data80, TextParsingSettings csvSettings40) {
        this.data80 = data80;
        this.csvSettings40 = csvSettings40;

        js.append(String.format(Locale.US, "chart.stepLine(%s, %s);", Arrays.toString(data80), (csvSettings40 != null) ? csvSettings40.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepLine(%s, %s);", Arrays.toString(data80), (csvSettings40 != null) ? csvSettings40.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStepline(String data81, TextParsingMode csvSettings39) {
        this.data81 = data81;
        this.csvSettings39 = csvSettings39;

        js.append(String.format(Locale.US, "chart.stepLine(%s, %s);", data81, (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepLine(%s, %s);", data81, (csvSettings39 != null) ? csvSettings39.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStepline(String data81, TextParsingSettings csvSettings40) {
        this.data81 = data81;
        this.csvSettings40 = csvSettings40;

        js.append(String.format(Locale.US, "chart.stepLine(%s, %s);", data81, (csvSettings40 != null) ? csvSettings40.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stepLine(%s, %s);", data81, (csvSettings40 != null) ? csvSettings40.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private View data82;
    private Set data83;
    private String[] data84;
    private String data85;
    private TextParsingMode csvSettings41;
    private TextParsingSettings csvSettings42;

    public void setStick(View data82, TextParsingMode csvSettings41) {
        this.data82 = data82;
        this.csvSettings41 = csvSettings41;

        js.append(String.format(Locale.US, "chart.stick(%s, %s);", (data82 != null) ? data82.generateJs() : "null", (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stick(%s, %s);", (data82 != null) ? data82.generateJs() : "null", (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStick(View data82, TextParsingSettings csvSettings42) {
        this.data82 = data82;
        this.csvSettings42 = csvSettings42;

        js.append(String.format(Locale.US, "chart.stick(%s, %s);", (data82 != null) ? data82.generateJs() : "null", (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stick(%s, %s);", (data82 != null) ? data82.generateJs() : "null", (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStick(Set data83, TextParsingMode csvSettings41) {
        this.data83 = data83;
        this.csvSettings41 = csvSettings41;

        js.append(String.format(Locale.US, "chart.stick(%s, %s);", (data83 != null) ? data83.generateJs() : "null", (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stick(%s, %s);", (data83 != null) ? data83.generateJs() : "null", (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStick(Set data83, TextParsingSettings csvSettings42) {
        this.data83 = data83;
        this.csvSettings42 = csvSettings42;

        js.append(String.format(Locale.US, "chart.stick(%s, %s);", (data83 != null) ? data83.generateJs() : "null", (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stick(%s, %s);", (data83 != null) ? data83.generateJs() : "null", (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStick(String[] data84, TextParsingMode csvSettings41) {
        this.data84 = data84;
        this.csvSettings41 = csvSettings41;

        js.append(String.format(Locale.US, "chart.stick(%s, %s);", Arrays.toString(data84), (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stick(%s, %s);", Arrays.toString(data84), (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStick(String[] data84, TextParsingSettings csvSettings42) {
        this.data84 = data84;
        this.csvSettings42 = csvSettings42;

        js.append(String.format(Locale.US, "chart.stick(%s, %s);", Arrays.toString(data84), (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stick(%s, %s);", Arrays.toString(data84), (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStick(String data85, TextParsingMode csvSettings41) {
        this.data85 = data85;
        this.csvSettings41 = csvSettings41;

        js.append(String.format(Locale.US, "chart.stick(%s, %s);", data85, (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stick(%s, %s);", data85, (csvSettings41 != null) ? csvSettings41.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setStick(String data85, TextParsingSettings csvSettings42) {
        this.data85 = data85;
        this.csvSettings42 = csvSettings42;

        js.append(String.format(Locale.US, "chart.stick(%s, %s);", data85, (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.stick(%s, %s);", data85, (csvSettings42 != null) ? csvSettings42.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Double index14;

    public void setTextmarker(Double index14) {
        this.index14 = index14;

        js.append(String.format(Locale.US, "chart.textMarker(%f);", index14));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%f);", index14));
            js.setLength(0);
        }
    }

    private Boolean textMarker;

    public void setTextmarker(Boolean textMarker) {
        this.textMarker = textMarker;

        js.append(String.format(Locale.US, "chart.textMarker(%b);", textMarker));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%b);", textMarker));
            js.setLength(0);
        }
    }

    private Double index15;
    private Boolean textMarker1;

    public void setTextmarker(Double index15, Boolean textMarker1) {
        this.index15 = index15;
        this.textMarker1 = textMarker1;

        js.append(String.format(Locale.US, "chart.textMarker(%f, %b);", index15, textMarker1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.textMarker(%f, %b);", index15, textMarker1));
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
    private String csvSettings43;

    public void setTocsv(String chartDataExportMode4, String csvSettings43) {
        this.chartDataExportMode4 = chartDataExportMode4;
        this.csvSettings43 = csvSettings43;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings43));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", chartDataExportMode4, csvSettings43));
            js.setLength(0);
        }
    }


    public void setTocsv(ChartDataExportMode chartDataExportMode5, String csvSettings43) {
        this.chartDataExportMode5 = chartDataExportMode5;
        this.csvSettings43 = csvSettings43;

        js.append(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings43));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toCsv(%s, %s);", (chartDataExportMode5 != null) ? chartDataExportMode5.generateJs() : "null", csvSettings43));
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

    private String paperSize3;
    private Boolean landscape3;

    public void setTosvg(String paperSize3, Boolean landscape3) {
        this.paperSize3 = paperSize3;
        this.landscape3 = landscape3;

        js.append(String.format(Locale.US, "chart.toSvg(%s, %b);", paperSize3, landscape3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.toSvg(%s, %b);", paperSize3, landscape3));
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

    private Double index16;

    public void setXaxis(Double index16) {
        this.index16 = index16;

        js.append(String.format(Locale.US, "chart.xAxis(%f);", index16));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%f);", index16));
            js.setLength(0);
        }
    }

    private Boolean xAxis;

    public void setXaxis(Boolean xAxis) {
        this.xAxis = xAxis;

        js.append(String.format(Locale.US, "chart.xAxis(%b);", xAxis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%b);", xAxis));
            js.setLength(0);
        }
    }

    private Double index17;
    private Boolean xAxis1;

    public void setXaxis(Double index17, Boolean xAxis1) {
        this.index17 = index17;
        this.xAxis1 = xAxis1;

        js.append(String.format(Locale.US, "chart.xAxis(%f, %b);", index17, xAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xAxis(%f, %b);", index17, xAxis1));
            js.setLength(0);
        }
    }

    private ScaleTypes xScale;
    private ScalesBase xScale1;

    public void setXscale(ScaleTypes xScale) {
        this.xScale = xScale;

        js.append(String.format(Locale.US, "chart.xScale(%s);", (xScale != null) ? xScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScale(%s);", (xScale != null) ? xScale.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setXscale(ScalesBase xScale1) {
        this.xScale1 = xScale1;

        js.append(String.format(Locale.US, "chart.xScale(%s);", (xScale1 != null) ? xScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScale(%s);", (xScale1 != null) ? xScale1.generateJs() : "null"));
            js.setLength(0);
        }
    }

    private Boolean xScroller;

    public void setXscroller(Boolean xScroller) {
        this.xScroller = xScroller;

        js.append(String.format(Locale.US, "chart.xScroller(%b);", xScroller));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xScroller(%b);", xScroller));
            js.setLength(0);
        }
    }

    private Double xZoom;
    private Boolean xZoom1;

    public void setXzoom(Double xZoom) {
        this.xZoom = xZoom;

        js.append(String.format(Locale.US, "chart.xZoom(%f);", xZoom));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xZoom(%f);", xZoom));
            js.setLength(0);
        }
    }


    public void setXzoom(Boolean xZoom1) {
        this.xZoom1 = xZoom1;

        js.append(String.format(Locale.US, "chart.xZoom(%b);", xZoom1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.xZoom(%b);", xZoom1));
            js.setLength(0);
        }
    }

    private Double index18;

    public void setYaxis(Double index18) {
        this.index18 = index18;

        js.append(String.format(Locale.US, "chart.yAxis(%f);", index18));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%f);", index18));
            js.setLength(0);
        }
    }

    private Boolean yAxis;

    public void setYaxis(Boolean yAxis) {
        this.yAxis = yAxis;

        js.append(String.format(Locale.US, "chart.yAxis(%b);", yAxis));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%b);", yAxis));
            js.setLength(0);
        }
    }

    private Double index19;
    private Boolean yAxis1;

    public void setYaxis(Double index19, Boolean yAxis1) {
        this.index19 = index19;
        this.yAxis1 = yAxis1;

        js.append(String.format(Locale.US, "chart.yAxis(%f, %b);", index19, yAxis1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yAxis(%f, %b);", index19, yAxis1));
            js.setLength(0);
        }
    }

    private ScaleTypes yScale;
    private ScalesBase yScale1;

    public void setYscale(ScaleTypes yScale) {
        this.yScale = yScale;

        js.append(String.format(Locale.US, "chart.yScale(%s);", (yScale != null) ? yScale.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yScale(%s);", (yScale != null) ? yScale.generateJs() : "null"));
            js.setLength(0);
        }
    }


    public void setYscale(ScalesBase yScale1) {
        this.yScale1 = yScale1;

        js.append(String.format(Locale.US, "chart.yScale(%s);", (yScale1 != null) ? yScale1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, "chart.yScale(%s);", (yScale1 != null) ? yScale1.generateJs() : "null"));
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