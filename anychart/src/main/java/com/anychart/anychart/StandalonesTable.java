package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class StandalonesTable extends JsObject {

    private String jsBase;

    public StandalonesTable() {

    }

    protected StandalonesTable(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Border getborder;

    public Border getBorder() {
        if (getborder == null)
            getborder = new Border(jsBase + ".border()");

        return getborder;
    }

    private Stroke color;
    private ColoredFill color1;
    private String color2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setBorder(Stroke color, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".border(%s, %f, %s, %s, %s);", (color != null) ? color.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".border(%s, %f, %s, %s, %s);", (color != null) ? color.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBorder(ColoredFill color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".border(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".border(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBorder(String color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".border(%s, %f, %s, %s, %s);", color2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".border(%s, %f, %s, %s, %s);", color2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double bottom;
    private String bottom1;

    public void setBottom(Double bottom) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
        } else {
            this.bottom = bottom;

            js.append(String.format(Locale.US, jsBase + ".bottom(%f);", bottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottom(%f);", bottom));
                js.setLength(0);
            }
        }
    }


    public void setBottom(String bottom1) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
        } else {
            this.bottom1 = bottom1;

            js.append(String.format(Locale.US, jsBase + ".bottom(%s);", bottom1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottom(%s);", bottom1));
                js.setLength(0);
            }
        }
    }

    private Bounds getbounds;

    public Bounds getBounds() {
        if (getbounds == null)
            getbounds = new Bounds(jsBase + ".bounds()");

        return getbounds;
    }

    private RectObj bounds;
    private AnychartMathRect bounds1;
    private Bounds bounds2;

    public void setBounds(RectObj bounds) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds = bounds;
        } else {
            this.bounds = bounds;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBounds(AnychartMathRect bounds1) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds1 = bounds1;
        } else {
            this.bounds1 = bounds1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Bounds bounds2) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds2 = bounds2;
        } else {
            this.bounds2 = bounds2;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));
                js.setLength(0);
            }
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
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %f);", x, y, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %f);", x, y, width, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, Double y, Double width, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %s);", x, y, width, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %s);", x, y, width, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, Double y, String width1, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y = y;
            this.width1 = width1;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %f, %s, %f);", x, y, width1, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %s, %f);", x, y, width1, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, Double y, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x = x;
            this.y = y;
            this.width1 = width1;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %f, %s, %s);", x, y, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %s, %s);", x, y, width1, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, String y1, Double width, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y1 = y1;
            this.width = width;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %s, %f, %f);", x, y1, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %s, %f, %f);", x, y1, width, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, String y1, Double width, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x = x;
            this.y1 = y1;
            this.width = width;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %s, %f, %s);", x, y1, width, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %s, %f, %s);", x, y1, width, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, String y1, String width1, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y1 = y1;
            this.width1 = width1;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %s, %s, %f);", x, y1, width1, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %s, %s, %f);", x, y1, width1, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, String y1, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x = x;
            this.y1 = y1;
            this.width1 = width1;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %s, %s, %s);", x, y1, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %s, %s, %s);", x, y1, width1, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, Double y, Double width, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x1 = x1;
            this.y = y;
            this.width = width;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %f, %f, %f);", x1, y, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %f, %f, %f);", x1, y, width, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, Double y, Double width, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y = y;
            this.width = width;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %f, %f, %s);", x1, y, width, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %f, %f, %s);", x1, y, width, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, Double y, String width1, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x1 = x1;
            this.y = y;
            this.width1 = width1;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %f, %s, %f);", x1, y, width1, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %f, %s, %f);", x1, y, width1, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, Double y, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y = y;
            this.width1 = width1;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %f, %s, %s);", x1, y, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %f, %s, %s);", x1, y, width1, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, String y1, Double width, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width = width;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %s, %f, %f);", x1, y1, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %f, %f);", x1, y1, width, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, String y1, Double width, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width = width;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %s, %f, %s);", x1, y1, width, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %f, %s);", x1, y1, width, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, String y1, String width1, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width1 = width1;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %f);", x1, y1, width1, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %f);", x1, y1, width1, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, String y1, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width1 = width1;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x1, y1, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x1, y1, width1, height1));
                js.setLength(0);
            }
        }
    }

    private Stroke strokeOrFill;
    private ColoredFill strokeOrFill1;
    private String strokeOrFill2;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setCellborder(Stroke strokeOrFill, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill = strokeOrFill;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.strokeOrFill = strokeOrFill;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".cellBorder(%s, %f, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellBorder(%s, %f, %s, %s, %s);", (strokeOrFill != null) ? strokeOrFill.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setCellborder(ColoredFill strokeOrFill1, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill1 = strokeOrFill1;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.strokeOrFill1 = strokeOrFill1;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".cellBorder(%s, %f, %s, %s, %s);", (strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellBorder(%s, %f, %s, %s, %s);", (strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setCellborder(String strokeOrFill2, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.strokeOrFill = null;
            this.strokeOrFill1 = null;
            this.strokeOrFill2 = null;
            
            this.strokeOrFill2 = strokeOrFill2;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.strokeOrFill2 = strokeOrFill2;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".cellBorder(%s, %f, %s, %s, %s);", strokeOrFill2, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellBorder(%s, %f, %s, %s, %s);", strokeOrFill2, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Fill cellFill;

    public void setCellfill(Fill cellFill) {
        if (jsBase == null) {
            this.cellFill = cellFill;
        } else {
            this.cellFill = cellFill;

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s);", (cellFill != null) ? cellFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s);", (cellFill != null) ? cellFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color3;
    private Double opacity;

    public void setCellfill(String color3, Double opacity) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.opacity = opacity;
        } else {
            this.color3 = color3;
            this.opacity = opacity;

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %f);", color3, opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %f);", color3, opacity));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    public void setCellfill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setCellfill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setCellfill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setCellfill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setCellfill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setCellfill(String[] keys1, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
                js.setLength(0);
            }
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

    public void setCellfill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setCellfill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".cellFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings;
    private TablePadding getcellPadding;

    public TablePadding getCellpadding() {
        if (getcellPadding == null)
            getcellPadding = new TablePadding(jsBase + ".cellPadding()");

        return getcellPadding;
    }

    private Double[] cellPadding;
    private String[] cellPadding1;
    private String cellPadding2;

    public void setCellpadding(Double[] cellPadding) {
        if (jsBase == null) {
            this.cellPadding = null;
            this.cellPadding1 = null;
            this.cellPadding2 = null;
            
            this.cellPadding = cellPadding;
        } else {
            this.cellPadding = cellPadding;

            js.append(String.format(Locale.US, jsBase + ".cellPadding(%s);", Arrays.toString(cellPadding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s);", Arrays.toString(cellPadding)));
                js.setLength(0);
            }
        }
    }


    public void setCellpadding(String[] cellPadding1) {
        if (jsBase == null) {
            this.cellPadding = null;
            this.cellPadding1 = null;
            this.cellPadding2 = null;
            
            this.cellPadding1 = cellPadding1;
        } else {
            this.cellPadding1 = cellPadding1;

            js.append(String.format(Locale.US, jsBase + ".cellPadding(%s);", Arrays.toString(cellPadding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s);", Arrays.toString(cellPadding1)));
                js.setLength(0);
            }
        }
    }


    public void setCellpadding(String cellPadding2) {
        if (jsBase == null) {
            this.cellPadding = null;
            this.cellPadding1 = null;
            this.cellPadding2 = null;
            
            this.cellPadding2 = cellPadding2;
        } else {
            this.cellPadding2 = cellPadding2;

            js.append(String.format(Locale.US, jsBase + ".cellPadding(%s);", cellPadding2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s);", cellPadding2));
                js.setLength(0);
            }
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

    public void setCellpadding(String value6, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
        } else {
            this.value6 = value6;
            this.value = value;
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
            this.value4 = value4;
            this.value5 = value5;

            js.append(String.format(Locale.US, jsBase + ".cellPadding(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%s, %s, %f, %s, %f, %s, %f);", value6, value, value1, value2, value3, value4, value5));
                js.setLength(0);
            }
        }
    }


    public void setCellpadding(Double value7, String value, Double value1, String value2, Double value3, String value4, Double value5) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
        } else {
            this.value7 = value7;
            this.value = value;
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
            this.value4 = value4;
            this.value5 = value5;

            js.append(String.format(Locale.US, jsBase + ".cellPadding(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cellPadding(%f, %s, %f, %s, %f, %s, %f);", value7, value, value1, value2, value3, value4, value5));
                js.setLength(0);
            }
        }
    }

    private Double colsCount;

    public void setColscount(Double colsCount) {
        if (jsBase == null) {
            this.colsCount = colsCount;
        } else {
            this.colsCount = colsCount;

            js.append(String.format(Locale.US, jsBase + ".colsCount(%f);", colsCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colsCount(%f);", colsCount));
                js.setLength(0);
            }
        }
    }

    private String colsMaxWidth;
    private Double colsMaxWidth1;

    public void setColsmaxwidth(String colsMaxWidth) {
        if (jsBase == null) {
            this.colsMaxWidth = null;
            this.colsMaxWidth1 = null;
            
            this.colsMaxWidth = colsMaxWidth;
        } else {
            this.colsMaxWidth = colsMaxWidth;

            js.append(String.format(Locale.US, jsBase + ".colsMaxWidth(%s);", colsMaxWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colsMaxWidth(%s);", colsMaxWidth));
                js.setLength(0);
            }
        }
    }


    public void setColsmaxwidth(Double colsMaxWidth1) {
        if (jsBase == null) {
            this.colsMaxWidth = null;
            this.colsMaxWidth1 = null;
            
            this.colsMaxWidth1 = colsMaxWidth1;
        } else {
            this.colsMaxWidth1 = colsMaxWidth1;

            js.append(String.format(Locale.US, jsBase + ".colsMaxWidth(%f);", colsMaxWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colsMaxWidth(%f);", colsMaxWidth1));
                js.setLength(0);
            }
        }
    }

    private String colsMinWidth;
    private Double colsMinWidth1;

    public void setColsminwidth(String colsMinWidth) {
        if (jsBase == null) {
            this.colsMinWidth = null;
            this.colsMinWidth1 = null;
            
            this.colsMinWidth = colsMinWidth;
        } else {
            this.colsMinWidth = colsMinWidth;

            js.append(String.format(Locale.US, jsBase + ".colsMinWidth(%s);", colsMinWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colsMinWidth(%s);", colsMinWidth));
                js.setLength(0);
            }
        }
    }


    public void setColsminwidth(Double colsMinWidth1) {
        if (jsBase == null) {
            this.colsMinWidth = null;
            this.colsMinWidth1 = null;
            
            this.colsMinWidth1 = colsMinWidth1;
        } else {
            this.colsMinWidth1 = colsMinWidth1;

            js.append(String.format(Locale.US, jsBase + ".colsMinWidth(%f);", colsMinWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colsMinWidth(%f);", colsMinWidth1));
                js.setLength(0);
            }
        }
    }

    private String colsWidth;
    private Double colsWidth1;

    public void setColswidth(String colsWidth) {
        if (jsBase == null) {
            this.colsWidth = null;
            this.colsWidth1 = null;
            
            this.colsWidth = colsWidth;
        } else {
            this.colsWidth = colsWidth;

            js.append(String.format(Locale.US, jsBase + ".colsWidth(%s);", colsWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colsWidth(%s);", colsWidth));
                js.setLength(0);
            }
        }
    }


    public void setColswidth(Double colsWidth1) {
        if (jsBase == null) {
            this.colsWidth = null;
            this.colsWidth1 = null;
            
            this.colsWidth1 = colsWidth1;
        } else {
            this.colsWidth1 = colsWidth1;

            js.append(String.format(Locale.US, jsBase + ".colsWidth(%f);", colsWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".colsWidth(%f);", colsWidth1));
                js.setLength(0);
            }
        }
    }

    private String tableValues;
    private Boolean demergeCells;

    public void setContents(String tableValues, Boolean demergeCells) {
        if (jsBase == null) {
            this.tableValues = tableValues;
            this.demergeCells = demergeCells;
        } else {
            this.tableValues = tableValues;
            this.demergeCells = demergeCells;

            js.append(String.format(Locale.US, jsBase + ".contents(%s, %b);", tableValues, demergeCells));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".contents(%s, %b);", tableValues, demergeCells));
                js.setLength(0);
            }
        }
    }

    private Boolean disablePointerEvents;

    public void setDisablepointerevents(Boolean disablePointerEvents) {
        if (jsBase == null) {
            this.disablePointerEvents = disablePointerEvents;
        } else {
            this.disablePointerEvents = disablePointerEvents;

            js.append(String.format(Locale.US, jsBase + ".disablePointerEvents(%b);", disablePointerEvents));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".disablePointerEvents(%b);", disablePointerEvents));
                js.setLength(0);
            }
        }
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;

            js.append(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));
                js.setLength(0);
            }
        }
    }

    private String fontColor;

    public void setFontcolor(String fontColor) {
        if (jsBase == null) {
            this.fontColor = fontColor;
        } else {
            this.fontColor = fontColor;

            js.append(String.format(Locale.US, jsBase + ".fontColor(%s);", fontColor));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontColor(%s);", fontColor));
                js.setLength(0);
            }
        }
    }

    private Decoration fontDecoration;
    private String fontDecoration1;

    public void setFontdecoration(Decoration fontDecoration) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration = fontDecoration;
        } else {
            this.fontDecoration = fontDecoration;

            js.append(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (fontDecoration != null) ? fontDecoration.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontDecoration(%s);", (fontDecoration != null) ? fontDecoration.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFontdecoration(String fontDecoration1) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration1 = fontDecoration1;
        } else {
            this.fontDecoration1 = fontDecoration1;

            js.append(String.format(Locale.US, jsBase + ".fontDecoration(%s);", fontDecoration1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontDecoration(%s);", fontDecoration1));
                js.setLength(0);
            }
        }
    }

    private String fontFamily;

    public void setFontfamily(String fontFamily) {
        if (jsBase == null) {
            this.fontFamily = fontFamily;
        } else {
            this.fontFamily = fontFamily;

            js.append(String.format(Locale.US, jsBase + ".fontFamily(%s);", fontFamily));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontFamily(%s);", fontFamily));
                js.setLength(0);
            }
        }
    }

    private Double fontOpacity;

    public void setFontopacity(Double fontOpacity) {
        if (jsBase == null) {
            this.fontOpacity = fontOpacity;
        } else {
            this.fontOpacity = fontOpacity;

            js.append(String.format(Locale.US, jsBase + ".fontOpacity(%f);", fontOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontOpacity(%f);", fontOpacity));
                js.setLength(0);
            }
        }
    }

    private String fontSize;
    private Double fontSize1;

    public void setFontsize(String fontSize) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize = fontSize;
        } else {
            this.fontSize = fontSize;

            js.append(String.format(Locale.US, jsBase + ".fontSize(%s);", fontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%s);", fontSize));
                js.setLength(0);
            }
        }
    }


    public void setFontsize(Double fontSize1) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize1 = fontSize1;
        } else {
            this.fontSize1 = fontSize1;

            js.append(String.format(Locale.US, jsBase + ".fontSize(%f);", fontSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontSize(%f);", fontSize1));
                js.setLength(0);
            }
        }
    }

    private TextFontStyle fontStyle;
    private String fontStyle1;

    public void setFontstyle(TextFontStyle fontStyle) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle = fontStyle;
        } else {
            this.fontStyle = fontStyle;

            js.append(String.format(Locale.US, jsBase + ".fontStyle(%s);", (fontStyle != null) ? fontStyle.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", (fontStyle != null) ? fontStyle.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFontstyle(String fontStyle1) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle1 = fontStyle1;
        } else {
            this.fontStyle1 = fontStyle1;

            js.append(String.format(Locale.US, jsBase + ".fontStyle(%s);", fontStyle1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontStyle(%s);", fontStyle1));
                js.setLength(0);
            }
        }
    }

    private TextFontVariant fontVariant;
    private String fontVariant1;

    public void setFontvariant(TextFontVariant fontVariant) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant = fontVariant;
        } else {
            this.fontVariant = fontVariant;

            js.append(String.format(Locale.US, jsBase + ".fontVariant(%s);", (fontVariant != null) ? fontVariant.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", (fontVariant != null) ? fontVariant.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setFontvariant(String fontVariant1) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant1 = fontVariant1;
        } else {
            this.fontVariant1 = fontVariant1;

            js.append(String.format(Locale.US, jsBase + ".fontVariant(%s);", fontVariant1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontVariant(%s);", fontVariant1));
                js.setLength(0);
            }
        }
    }

    private String fontWeight;
    private Double fontWeight1;

    public void setFontweight(String fontWeight) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight = fontWeight;
        } else {
            this.fontWeight = fontWeight;

            js.append(String.format(Locale.US, jsBase + ".fontWeight(%s);", fontWeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%s);", fontWeight));
                js.setLength(0);
            }
        }
    }


    public void setFontweight(Double fontWeight1) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight1 = fontWeight1;
        } else {
            this.fontWeight1 = fontWeight1;

            js.append(String.format(Locale.US, jsBase + ".fontWeight(%f);", fontWeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fontWeight(%f);", fontWeight1));
                js.setLength(0);
            }
        }
    }

    private Double row;
    private Double col;

    public void setGetcell(Double row, Double col) {
        if (jsBase == null) {
            this.row = row;
            this.col = col;
        } else {
            this.row = row;
            this.col = col;

            js.append(String.format(Locale.US, jsBase + ".getCell(%f, %f);", row, col));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getCell(%f, %f);", row, col));
                js.setLength(0);
            }
        }
    }

    private Double col1;

    public void setGetcol(Double col1) {
        if (jsBase == null) {
            this.col = null;
            this.col1 = null;
            
            this.col1 = col1;
        } else {
            this.col1 = col1;

            js.append(String.format(Locale.US, jsBase + ".getCol(%f);", col1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getCol(%f);", col1));
                js.setLength(0);
            }
        }
    }

    private Double row1;

    public void setGetrow(Double row1) {
        if (jsBase == null) {
            this.row = null;
            this.row1 = null;
            
            this.row1 = row1;
        } else {
            this.row1 = row1;

            js.append(String.format(Locale.US, jsBase + ".getRow(%f);", row1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getRow(%f);", row1));
                js.setLength(0);
            }
        }
    }

    private TextHAlign hAlign;
    private String hAlign1;

    public void setHalign(TextHAlign hAlign) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign = hAlign;
        } else {
            this.hAlign = hAlign;

            js.append(String.format(Locale.US, jsBase + ".hAlign(%s);", (hAlign != null) ? hAlign.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", (hAlign != null) ? hAlign.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHalign(String hAlign1) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign1 = hAlign1;
        } else {
            this.hAlign1 = hAlign1;

            js.append(String.format(Locale.US, jsBase + ".hAlign(%s);", hAlign1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hAlign(%s);", hAlign1));
                js.setLength(0);
            }
        }
    }

    private Double height2;
    private String height3;

    public void setHeight(Double height2) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height2 = height2;
        } else {
            this.height2 = height2;

            js.append(String.format(Locale.US, jsBase + ".height(%f);", height2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%f);", height2));
                js.setLength(0);
            }
        }
    }


    public void setHeight(String height3) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height3 = height3;
        } else {
            this.height3 = height3;

            js.append(String.format(Locale.US, jsBase + ".height(%s);", height3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height3));
                js.setLength(0);
            }
        }
    }

    private Double left;
    private String left1;

    public void setLeft(Double left) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".left(%f);", left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".left(%f);", left));
                js.setLength(0);
            }
        }
    }


    public void setLeft(String left1) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".left(%s);", left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".left(%s);", left1));
                js.setLength(0);
            }
        }
    }

    private String letterSpacing;
    private Double letterSpacing1;

    public void setLetterspacing(String letterSpacing) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing = letterSpacing;
        } else {
            this.letterSpacing = letterSpacing;

            js.append(String.format(Locale.US, jsBase + ".letterSpacing(%s);", letterSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".letterSpacing(%s);", letterSpacing));
                js.setLength(0);
            }
        }
    }


    public void setLetterspacing(Double letterSpacing1) {
        if (jsBase == null) {
            this.letterSpacing = null;
            this.letterSpacing1 = null;
            
            this.letterSpacing1 = letterSpacing1;
        } else {
            this.letterSpacing1 = letterSpacing1;

            js.append(String.format(Locale.US, jsBase + ".letterSpacing(%f);", letterSpacing1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".letterSpacing(%f);", letterSpacing1));
                js.setLength(0);
            }
        }
    }

    private String lineHeight;
    private Double lineHeight1;

    public void setLineheight(String lineHeight) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight = lineHeight;
        } else {
            this.lineHeight = lineHeight;

            js.append(String.format(Locale.US, jsBase + ".lineHeight(%s);", lineHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%s);", lineHeight));
                js.setLength(0);
            }
        }
    }


    public void setLineheight(Double lineHeight1) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight1 = lineHeight1;
        } else {
            this.lineHeight1 = lineHeight1;

            js.append(String.format(Locale.US, jsBase + ".lineHeight(%f);", lineHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".lineHeight(%f);", lineHeight1));
                js.setLength(0);
            }
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private Double maxHeight;
    private String maxHeight1;

    public void setMaxheight(Double maxHeight) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight = maxHeight;
        } else {
            this.maxHeight = maxHeight;

            js.append(String.format(Locale.US, jsBase + ".maxHeight(%f);", maxHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%f);", maxHeight));
                js.setLength(0);
            }
        }
    }


    public void setMaxheight(String maxHeight1) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight1 = maxHeight1;
        } else {
            this.maxHeight1 = maxHeight1;

            js.append(String.format(Locale.US, jsBase + ".maxHeight(%s);", maxHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%s);", maxHeight1));
                js.setLength(0);
            }
        }
    }

    private Double maxWidth;
    private String maxWidth1;

    public void setMaxwidth(Double maxWidth) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth = maxWidth;
        } else {
            this.maxWidth = maxWidth;

            js.append(String.format(Locale.US, jsBase + ".maxWidth(%f);", maxWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%f);", maxWidth));
                js.setLength(0);
            }
        }
    }


    public void setMaxwidth(String maxWidth1) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth1 = maxWidth1;
        } else {
            this.maxWidth1 = maxWidth1;

            js.append(String.format(Locale.US, jsBase + ".maxWidth(%s);", maxWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%s);", maxWidth1));
                js.setLength(0);
            }
        }
    }

    private Double minHeight;
    private String minHeight1;

    public void setMinheight(Double minHeight) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight = minHeight;
        } else {
            this.minHeight = minHeight;

            js.append(String.format(Locale.US, jsBase + ".minHeight(%f);", minHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minHeight(%f);", minHeight));
                js.setLength(0);
            }
        }
    }


    public void setMinheight(String minHeight1) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight1 = minHeight1;
        } else {
            this.minHeight1 = minHeight1;

            js.append(String.format(Locale.US, jsBase + ".minHeight(%s);", minHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minHeight(%s);", minHeight1));
                js.setLength(0);
            }
        }
    }

    private Double minWidth;
    private String minWidth1;

    public void setMinwidth(Double minWidth) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth = minWidth;
        } else {
            this.minWidth = minWidth;

            js.append(String.format(Locale.US, jsBase + ".minWidth(%f);", minWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minWidth(%f);", minWidth));
                js.setLength(0);
            }
        }
    }


    public void setMinwidth(String minWidth1) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth1 = minWidth1;
        } else {
            this.minWidth1 = minWidth1;

            js.append(String.format(Locale.US, jsBase + ".minWidth(%s);", minWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minWidth(%s);", minWidth1));
                js.setLength(0);
            }
        }
    }

    private PaperSize paperSizeOrOptions;
    private String paperSizeOrOptions1;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
                js.setLength(0);
            }
        }
    }


    public void setPrint(String paperSizeOrOptions1, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private Double right;
    private String right1;

    public void setRight(Double right) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right = right;
        } else {
            this.right = right;

            js.append(String.format(Locale.US, jsBase + ".right(%f);", right));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".right(%f);", right));
                js.setLength(0);
            }
        }
    }


    public void setRight(String right1) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right1 = right1;
        } else {
            this.right1 = right1;

            js.append(String.format(Locale.US, jsBase + ".right(%s);", right1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".right(%s);", right1));
                js.setLength(0);
            }
        }
    }

    private Fill rowEvenFill;

    public void setRowevenfill(Fill rowEvenFill) {
        if (jsBase == null) {
            this.rowEvenFill = rowEvenFill;
        } else {
            this.rowEvenFill = rowEvenFill;

            js.append(String.format(Locale.US, jsBase + ".rowEvenFill(%s);", (rowEvenFill != null) ? rowEvenFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s);", (rowEvenFill != null) ? rowEvenFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color4;
    private Double opacity3;

    public void setRowevenfill(String color4, Double opacity3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
        } else {
            this.color4 = color4;
            this.opacity3 = opacity3;

            js.append(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %f);", color4, opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %f);", color4, opacity3));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Double opacity4;

    public void setRowevenfill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys4 = keys4;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %b, %f, %f);", arrayToString(keys4), mode4, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %b, %f, %f);", arrayToString(keys4), mode4, angle1, opacity4));
                js.setLength(0);
            }
        }
    }


    public void setRowevenfill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys4 = keys4;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %f, %f);", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %f, %f);", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));
                js.setLength(0);
            }
        }
    }


    public void setRowevenfill(GradientKey[] keys4, String mode6, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys4 = keys4;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %f, %f);", arrayToString(keys4), mode6, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %f, %f);", arrayToString(keys4), mode6, angle1, opacity4));
                js.setLength(0);
            }
        }
    }


    public void setRowevenfill(String[] keys5, Boolean mode4, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys5 = keys5;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode4, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode4, angle1, opacity4));
                js.setLength(0);
            }
        }
    }


    public void setRowevenfill(String[] keys5, VectorRect mode5, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys5 = keys5;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));
                js.setLength(0);
            }
        }
    }


    public void setRowevenfill(String[] keys5, String mode6, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys5 = keys5;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %f, %f);", Arrays.toString(keys5), mode6, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %s, %f, %f);", Arrays.toString(keys5), mode6, angle1, opacity4));
                js.setLength(0);
            }
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

    public void setRowevenfill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            
            this.keys6 = keys6;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            
            this.mode7 = mode7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.keys6 = keys6;
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.mode7 = mode7;
            this.opacity5 = opacity5;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setRowevenfill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            
            this.keys7 = keys7;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            
            this.mode7 = mode7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.keys7 = keys7;
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.mode7 = mode7;
            this.opacity5 = opacity5;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowEvenFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings1;
    private Fill rowOddFill;

    public void setRowoddfill(Fill rowOddFill) {
        if (jsBase == null) {
            this.rowOddFill = rowOddFill;
        } else {
            this.rowOddFill = rowOddFill;

            js.append(String.format(Locale.US, jsBase + ".rowOddFill(%s);", (rowOddFill != null) ? rowOddFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s);", (rowOddFill != null) ? rowOddFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color5;
    private Double opacity6;

    public void setRowoddfill(String color5, Double opacity6) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
        } else {
            this.color5 = color5;
            this.opacity6 = opacity6;

            js.append(String.format(Locale.US, jsBase + ".rowOddFill(%s, %f);", color5, opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %f);", color5, opacity6));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode8;
    private VectorRect mode9;
    private String mode10;
    private Double opacity7;

    public void setRowoddfill(GradientKey[] keys8, Boolean mode8, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode8 = mode8;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys8 = keys8;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;

            js.append(String.format(Locale.US, jsBase + ".rowOddFill(%s, %b, %f, %f);", arrayToString(keys8), mode8, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %b, %f, %f);", arrayToString(keys8), mode8, angle2, opacity7));
                js.setLength(0);
            }
        }
    }


    public void setRowoddfill(GradientKey[] keys8, VectorRect mode9, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode9 = mode9;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys8 = keys8;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;

            js.append(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %f, %f);", arrayToString(keys8), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %f, %f);", arrayToString(keys8), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));
                js.setLength(0);
            }
        }
    }


    public void setRowoddfill(GradientKey[] keys8, String mode10, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode10 = mode10;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys8 = keys8;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity7 = opacity7;

            js.append(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %f, %f);", arrayToString(keys8), mode10, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %f, %f);", arrayToString(keys8), mode10, angle2, opacity7));
                js.setLength(0);
            }
        }
    }


    public void setRowoddfill(String[] keys9, Boolean mode8, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode8 = mode8;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys9 = keys9;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;

            js.append(String.format(Locale.US, jsBase + ".rowOddFill(%s, %b, %f, %f);", Arrays.toString(keys9), mode8, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %b, %f, %f);", Arrays.toString(keys9), mode8, angle2, opacity7));
                js.setLength(0);
            }
        }
    }


    public void setRowoddfill(String[] keys9, VectorRect mode9, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode9 = mode9;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys9 = keys9;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;

            js.append(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %f, %f);", Arrays.toString(keys9), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %f, %f);", Arrays.toString(keys9), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));
                js.setLength(0);
            }
        }
    }


    public void setRowoddfill(String[] keys9, String mode10, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode10 = mode10;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys9 = keys9;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity7 = opacity7;

            js.append(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %f, %f);", Arrays.toString(keys9), mode10, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %s, %f, %f);", Arrays.toString(keys9), mode10, angle2, opacity7));
                js.setLength(0);
            }
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

    public void setRowoddfill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            
            this.keys10 = keys10;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            
            this.mode11 = mode11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.keys10 = keys10;
            this.cx2 = cx2;
            this.cy2 = cy2;
            this.mode11 = mode11;
            this.opacity8 = opacity8;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".rowOddFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys10), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys10), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setRowoddfill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            
            this.keys11 = keys11;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            
            this.mode11 = mode11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.keys11 = keys11;
            this.cx2 = cx2;
            this.cy2 = cy2;
            this.mode11 = mode11;
            this.opacity8 = opacity8;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".rowOddFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys11), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowOddFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys11), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings2;
    private Double rowsCount;

    public void setRowscount(Double rowsCount) {
        if (jsBase == null) {
            this.rowsCount = rowsCount;
        } else {
            this.rowsCount = rowsCount;

            js.append(String.format(Locale.US, jsBase + ".rowsCount(%f);", rowsCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowsCount(%f);", rowsCount));
                js.setLength(0);
            }
        }
    }

    private String rowsHeight;
    private Double rowsHeight1;

    public void setRowsheight(String rowsHeight) {
        if (jsBase == null) {
            this.rowsHeight = null;
            this.rowsHeight1 = null;
            
            this.rowsHeight = rowsHeight;
        } else {
            this.rowsHeight = rowsHeight;

            js.append(String.format(Locale.US, jsBase + ".rowsHeight(%s);", rowsHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowsHeight(%s);", rowsHeight));
                js.setLength(0);
            }
        }
    }


    public void setRowsheight(Double rowsHeight1) {
        if (jsBase == null) {
            this.rowsHeight = null;
            this.rowsHeight1 = null;
            
            this.rowsHeight1 = rowsHeight1;
        } else {
            this.rowsHeight1 = rowsHeight1;

            js.append(String.format(Locale.US, jsBase + ".rowsHeight(%f);", rowsHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowsHeight(%f);", rowsHeight1));
                js.setLength(0);
            }
        }
    }

    private String rowsMaxHeight;
    private Double rowsMaxHeight1;

    public void setRowsmaxheight(String rowsMaxHeight) {
        if (jsBase == null) {
            this.rowsMaxHeight = null;
            this.rowsMaxHeight1 = null;
            
            this.rowsMaxHeight = rowsMaxHeight;
        } else {
            this.rowsMaxHeight = rowsMaxHeight;

            js.append(String.format(Locale.US, jsBase + ".rowsMaxHeight(%s);", rowsMaxHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowsMaxHeight(%s);", rowsMaxHeight));
                js.setLength(0);
            }
        }
    }


    public void setRowsmaxheight(Double rowsMaxHeight1) {
        if (jsBase == null) {
            this.rowsMaxHeight = null;
            this.rowsMaxHeight1 = null;
            
            this.rowsMaxHeight1 = rowsMaxHeight1;
        } else {
            this.rowsMaxHeight1 = rowsMaxHeight1;

            js.append(String.format(Locale.US, jsBase + ".rowsMaxHeight(%f);", rowsMaxHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowsMaxHeight(%f);", rowsMaxHeight1));
                js.setLength(0);
            }
        }
    }

    private String rowsMinHeight;
    private Double rowsMinHeight1;

    public void setRowsminheight(String rowsMinHeight) {
        if (jsBase == null) {
            this.rowsMinHeight = null;
            this.rowsMinHeight1 = null;
            
            this.rowsMinHeight = rowsMinHeight;
        } else {
            this.rowsMinHeight = rowsMinHeight;

            js.append(String.format(Locale.US, jsBase + ".rowsMinHeight(%s);", rowsMinHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowsMinHeight(%s);", rowsMinHeight));
                js.setLength(0);
            }
        }
    }


    public void setRowsminheight(Double rowsMinHeight1) {
        if (jsBase == null) {
            this.rowsMinHeight = null;
            this.rowsMinHeight1 = null;
            
            this.rowsMinHeight1 = rowsMinHeight1;
        } else {
            this.rowsMinHeight1 = rowsMinHeight1;

            js.append(String.format(Locale.US, jsBase + ".rowsMinHeight(%f);", rowsMinHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowsMinHeight(%f);", rowsMinHeight1));
                js.setLength(0);
            }
        }
    }

    private String csvSettings;
    private String filename;

    public void setSaveascsv(String csvSettings, String filename) {
        if (jsBase == null) {
            this.csvSettings = csvSettings;
            this.filename = filename;
        } else {
            this.csvSettings = csvSettings;
            this.filename = filename;

            js.append(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s);", csvSettings, filename));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsCsv(%s, %s);", csvSettings, filename));
                js.setLength(0);
            }
        }
    }

    private Double width2;
    private Double height4;
    private Double quality;
    private Boolean forceTransparentWhite;

    public void setSaveasjpg(Double width2, Double height4, Double quality, Boolean forceTransparentWhite) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            
            this.width2 = width2;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            
            this.height4 = height4;
            this.quality = quality;
            this.forceTransparentWhite = forceTransparentWhite;
        } else {
            this.width2 = width2;
            this.height4 = height4;
            this.quality = quality;
            this.forceTransparentWhite = forceTransparentWhite;

            js.append(String.format(Locale.US, jsBase + ".saveAsJpg(%f, %f, %f, %b);", width2, height4, quality, forceTransparentWhite));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsJpg(%f, %f, %f, %b);", width2, height4, quality, forceTransparentWhite));
                js.setLength(0);
            }
        }
    }

    private String paperSize;
    private Boolean landscape1;
    private Double x2;
    private Double y2;

    public void setSaveaspdf(String paperSize, Boolean landscape1, Double x2, Double y2) {
        if (jsBase == null) {
            this.paperSize = paperSize;
            this.landscape = null;
            this.landscape1 = null;
            
            this.landscape1 = landscape1;
            this.x = null;
            this.x1 = null;
            this.x2 = null;
            
            this.x2 = x2;
            this.y = null;
            this.y1 = null;
            this.y2 = null;
            
            this.y2 = y2;
        } else {
            this.paperSize = paperSize;
            this.landscape1 = landscape1;
            this.x2 = x2;
            this.y2 = y2;

            js.append(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %b, %f, %f);", paperSize, landscape1, x2, y2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPdf(%s, %b, %f, %f);", paperSize, landscape1, x2, y2));
                js.setLength(0);
            }
        }
    }

    private Double width3;
    private Double height5;
    private Double quality1;

    public void setSaveaspng(Double width3, Double height5, Double quality1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width3 = width3;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            
            this.height5 = height5;
            this.quality = null;
            this.quality1 = null;
            
            this.quality1 = quality1;
        } else {
            this.width3 = width3;
            this.height5 = height5;
            this.quality1 = quality1;

            js.append(String.format(Locale.US, jsBase + ".saveAsPng(%f, %f, %f);", width3, height5, quality1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsPng(%f, %f, %f);", width3, height5, quality1));
                js.setLength(0);
            }
        }
    }

    private String paperSize1;
    private Boolean landscape2;

    public void setSaveassvg(String paperSize1, Boolean landscape2) {
        if (jsBase == null) {
            this.paperSize = null;
            this.paperSize1 = null;
            
            this.paperSize1 = paperSize1;
            this.landscape = null;
            this.landscape1 = null;
            this.landscape2 = null;
            
            this.landscape2 = landscape2;
        } else {
            this.paperSize1 = paperSize1;
            this.landscape2 = landscape2;

            js.append(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %b);", paperSize1, landscape2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%s, %b);", paperSize1, landscape2));
                js.setLength(0);
            }
        }
    }

    private Double width4;
    private Double height6;

    public void setSaveassvg(Double width4, Double height6) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            
            this.width4 = width4;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            
            this.height6 = height6;
        } else {
            this.width4 = width4;
            this.height6 = height6;

            js.append(String.format(Locale.US, jsBase + ".saveAsSvg(%f, %f);", width4, height6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsSvg(%f, %f);", width4, height6));
                js.setLength(0);
            }
        }
    }

    private String filename1;

    public void setSaveasxlsx(String filename1) {
        if (jsBase == null) {
            this.filename = null;
            this.filename1 = null;
            
            this.filename1 = filename1;
        } else {
            this.filename1 = filename1;

            js.append(String.format(Locale.US, jsBase + ".saveAsXlsx(%s);", filename1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".saveAsXlsx(%s);", filename1));
                js.setLength(0);
            }
        }
    }

    private Boolean selectable;

    public void setSelectable(Boolean selectable) {
        if (jsBase == null) {
            this.selectable = selectable;
        } else {
            this.selectable = selectable;

            js.append(String.format(Locale.US, jsBase + ".selectable(%b);", selectable));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectable(%b);", selectable));
                js.setLength(0);
            }
        }
    }

    private Direction textDirection;
    private String textDirection1;

    public void setTextdirection(Direction textDirection) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection = textDirection;
        } else {
            this.textDirection = textDirection;

            js.append(String.format(Locale.US, jsBase + ".textDirection(%s);", (textDirection != null) ? textDirection.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", (textDirection != null) ? textDirection.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTextdirection(String textDirection1) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection1 = textDirection1;
        } else {
            this.textDirection1 = textDirection1;

            js.append(String.format(Locale.US, jsBase + ".textDirection(%s);", textDirection1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textDirection(%s);", textDirection1));
                js.setLength(0);
            }
        }
    }

    private Double textIndent;

    public void setTextindent(Double textIndent) {
        if (jsBase == null) {
            this.textIndent = textIndent;
        } else {
            this.textIndent = textIndent;

            js.append(String.format(Locale.US, jsBase + ".textIndent(%f);", textIndent));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textIndent(%f);", textIndent));
                js.setLength(0);
            }
        }
    }

    private TextOverflow textOverflow;
    private String textOverflow1;

    public void setTextoverflow(TextOverflow textOverflow) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow = textOverflow;
        } else {
            this.textOverflow = textOverflow;

            js.append(String.format(Locale.US, jsBase + ".textOverflow(%s);", (textOverflow != null) ? textOverflow.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textOverflow(%s);", (textOverflow != null) ? textOverflow.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTextoverflow(String textOverflow1) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow1 = textOverflow1;
        } else {
            this.textOverflow1 = textOverflow1;

            js.append(String.format(Locale.US, jsBase + ".textOverflow(%s);", textOverflow1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textOverflow(%s);", textOverflow1));
                js.setLength(0);
            }
        }
    }

    private TextTextWrap textWrap;
    private String textWrap1;

    public void setTextwrap(TextTextWrap textWrap) {
        if (jsBase == null) {
            this.textWrap = null;
            this.textWrap1 = null;
            
            this.textWrap = textWrap;
        } else {
            this.textWrap = textWrap;

            js.append(String.format(Locale.US, jsBase + ".textWrap(%s);", (textWrap != null) ? textWrap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textWrap(%s);", (textWrap != null) ? textWrap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTextwrap(String textWrap1) {
        if (jsBase == null) {
            this.textWrap = null;
            this.textWrap1 = null;
            
            this.textWrap1 = textWrap1;
        } else {
            this.textWrap1 = textWrap1;

            js.append(String.format(Locale.US, jsBase + ".textWrap(%s);", textWrap1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".textWrap(%s);", textWrap1));
                js.setLength(0);
            }
        }
    }

    private String csvSettings1;

    public void setTocsv(String csvSettings1) {
        if (jsBase == null) {
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.csvSettings1 = csvSettings1;

            js.append(String.format(Locale.US, jsBase + ".toCsv(%s);", csvSettings1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toCsv(%s);", csvSettings1));
                js.setLength(0);
            }
        }
    }

    private String paperSize2;
    private Boolean landscape3;

    public void setTosvg(String paperSize2, Boolean landscape3) {
        if (jsBase == null) {
            this.paperSize = null;
            this.paperSize1 = null;
            this.paperSize2 = null;
            
            this.paperSize2 = paperSize2;
            this.landscape = null;
            this.landscape1 = null;
            this.landscape2 = null;
            this.landscape3 = null;
            
            this.landscape3 = landscape3;
        } else {
            this.paperSize2 = paperSize2;
            this.landscape3 = landscape3;

            js.append(String.format(Locale.US, jsBase + ".toSvg(%s, %b);", paperSize2, landscape3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%s, %b);", paperSize2, landscape3));
                js.setLength(0);
            }
        }
    }

    private Double width5;
    private Double height7;

    public void setTosvg(Double width5, Double height7) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            
            this.width5 = width5;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            this.height5 = null;
            this.height6 = null;
            this.height7 = null;
            
            this.height7 = height7;
        } else {
            this.width5 = width5;
            this.height7 = height7;

            js.append(String.format(Locale.US, jsBase + ".toSvg(%f, %f);", width5, height7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toSvg(%f, %f);", width5, height7));
                js.setLength(0);
            }
        }
    }

    private Double top;
    private String top1;

    public void setTop(Double top) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top = top;
        } else {
            this.top = top;

            js.append(String.format(Locale.US, jsBase + ".top(%f);", top));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".top(%f);", top));
                js.setLength(0);
            }
        }
    }


    public void setTop(String top1) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top1 = top1;
        } else {
            this.top1 = top1;

            js.append(String.format(Locale.US, jsBase + ".top(%s);", top1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".top(%s);", top1));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
                js.setLength(0);
            }
        }
    }

    private Boolean useHtml;

    public void setUsehtml(Boolean useHtml) {
        if (jsBase == null) {
            this.useHtml = useHtml;
        } else {
            this.useHtml = useHtml;

            js.append(String.format(Locale.US, jsBase + ".useHtml(%b);", useHtml));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".useHtml(%b);", useHtml));
                js.setLength(0);
            }
        }
    }

    private TextVAlign vAlign;
    private String vAlign1;

    public void setValign(TextVAlign vAlign) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign = vAlign;
        } else {
            this.vAlign = vAlign;

            js.append(String.format(Locale.US, jsBase + ".vAlign(%s);", (vAlign != null) ? vAlign.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", (vAlign != null) ? vAlign.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setValign(String vAlign1) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign1 = vAlign1;
        } else {
            this.vAlign1 = vAlign1;

            js.append(String.format(Locale.US, jsBase + ".vAlign(%s);", vAlign1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".vAlign(%s);", vAlign1));
                js.setLength(0);
            }
        }
    }

    private Double width6;
    private String width7;

    public void setWidth(Double width6) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            
            this.width6 = width6;
        } else {
            this.width6 = width6;

            js.append(String.format(Locale.US, jsBase + ".width(%f);", width6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width6));
                js.setLength(0);
            }
        }
    }


    public void setWidth(String width7) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            this.width4 = null;
            this.width5 = null;
            this.width6 = null;
            this.width7 = null;
            
            this.width7 = width7;
        } else {
            this.width7 = width7;

            js.append(String.format(Locale.US, jsBase + ".width(%s);", width7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width7));
                js.setLength(0);
            }
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        if (jsBase == null) {
            this.zIndex = zIndex;
        } else {
            this.zIndex = zIndex;

            js.append(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetborder() {
        if (getborder != null) {
            return getborder.generateJs();
        }
        return "";
    }

    private String generateJSgetbounds() {
        if (getbounds != null) {
            return getbounds.generateJs();
        }
        return "";
    }

    private String generateJSgetcellPadding() {
        if (getcellPadding != null) {
            return getcellPadding.generateJs();
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", (color != null) ? color.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", (color1 != null) ? color1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: %s,", color2);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbottom() {
        if (bottom != null) {
            return String.format(Locale.US, "bottom: %f,", bottom);
        }
        return "";
    }

    private String generateJSbottom1() {
        if (bottom1 != null) {
            return String.format(Locale.US, "bottom: %s,", bottom1);
        }
        return "";
    }

    private String generateJSbounds() {
        if (bounds != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds != null) ? bounds.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbounds1() {
        if (bounds1 != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds1 != null) ? bounds1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbounds2() {
        if (bounds2 != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds2 != null) ? bounds2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSx() {
        if (x != null) {
            return String.format(Locale.US, "x: %f,", x);
        }
        return "";
    }

    private String generateJSx1() {
        if (x1 != null) {
            return String.format(Locale.US, "x: %s,", x1);
        }
        return "";
    }

    private String generateJSy() {
        if (y != null) {
            return String.format(Locale.US, "y: %f,", y);
        }
        return "";
    }

    private String generateJSy1() {
        if (y1 != null) {
            return String.format(Locale.US, "y: %s,", y1);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %s,", width1);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: %s,", height1);
        }
        return "";
    }

    private String generateJSstrokeOrFill() {
        if (strokeOrFill != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", (strokeOrFill != null) ? strokeOrFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeOrFill1() {
        if (strokeOrFill1 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", (strokeOrFill1 != null) ? strokeOrFill1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstrokeOrFill2() {
        if (strokeOrFill2 != null) {
            return String.format(Locale.US, "strokeOrFill: %s,", strokeOrFill2);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
        }
        return "";
    }

    private String generateJSdashpattern1() {
        if (dashpattern1 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern1);
        }
        return "";
    }

    private String generateJSlineJoin1() {
        if (lineJoin1 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin1 != null) ? lineJoin1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap1() {
        if (lineCap1 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap1 != null) ? lineCap1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScellFill() {
        if (cellFill != null) {
            return String.format(Locale.US, "cellFill: %s,", (cellFill != null) ? cellFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: %s,", color3);
        }
        return "";
    }

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
        }
        return "";
    }

    private String generateJSkeys() {
        if (keys != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys));
        }
        return "";
    }

    private String generateJSkeys1() {
        if (keys1 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys1));
        }
        return "";
    }

    private String generateJSangle() {
        if (angle != null) {
            return String.format(Locale.US, "angle: %f,", angle);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %b,", mode);
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", (mode1 != null) ? mode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode2() {
        if (mode2 != null) {
            return String.format(Locale.US, "mode: %s,", mode2);
        }
        return "";
    }

    private String generateJSopacity1() {
        if (opacity1 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity1);
        }
        return "";
    }

    private String generateJSkeys2() {
        if (keys2 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys2));
        }
        return "";
    }

    private String generateJSkeys3() {
        if (keys3 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys3));
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSmode3() {
        if (mode3 != null) {
            return String.format(Locale.US, "mode: %s,", (mode3 != null) ? mode3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity2() {
        if (opacity2 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity2);
        }
        return "";
    }

    private String generateJSfx() {
        if (fx != null) {
            return String.format(Locale.US, "fx: %f,", fx);
        }
        return "";
    }

    private String generateJSfy() {
        if (fy != null) {
            return String.format(Locale.US, "fy: %f,", fy);
        }
        return "";
    }

    private String generateJSimageSettings() {
        if (imageSettings != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings != null) ? imageSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJScellPadding() {
        if (cellPadding != null) {
            return String.format(Locale.US, "cellPadding: %s,", Arrays.toString(cellPadding));
        }
        return "";
    }

    private String generateJScellPadding1() {
        if (cellPadding1 != null) {
            return String.format(Locale.US, "cellPadding: %s,", Arrays.toString(cellPadding1));
        }
        return "";
    }

    private String generateJScellPadding2() {
        if (cellPadding2 != null) {
            return String.format(Locale.US, "cellPadding: %s,", cellPadding2);
        }
        return "";
    }

    private String generateJSvalue() {
        if (value != null) {
            return String.format(Locale.US, "value: %s,", value);
        }
        return "";
    }

    private String generateJSvalue1() {
        if (value1 != null) {
            return String.format(Locale.US, "value: %f,", value1);
        }
        return "";
    }

    private String generateJSvalue2() {
        if (value2 != null) {
            return String.format(Locale.US, "value: %s,", value2);
        }
        return "";
    }

    private String generateJSvalue3() {
        if (value3 != null) {
            return String.format(Locale.US, "value: %f,", value3);
        }
        return "";
    }

    private String generateJSvalue4() {
        if (value4 != null) {
            return String.format(Locale.US, "value: %s,", value4);
        }
        return "";
    }

    private String generateJSvalue5() {
        if (value5 != null) {
            return String.format(Locale.US, "value: %f,", value5);
        }
        return "";
    }

    private String generateJSvalue6() {
        if (value6 != null) {
            return String.format(Locale.US, "value: %s,", value6);
        }
        return "";
    }

    private String generateJSvalue7() {
        if (value7 != null) {
            return String.format(Locale.US, "value: %f,", value7);
        }
        return "";
    }

    private String generateJScolsCount() {
        if (colsCount != null) {
            return String.format(Locale.US, "colsCount: %f,", colsCount);
        }
        return "";
    }

    private String generateJScolsMaxWidth() {
        if (colsMaxWidth != null) {
            return String.format(Locale.US, "colsMaxWidth: %s,", colsMaxWidth);
        }
        return "";
    }

    private String generateJScolsMaxWidth1() {
        if (colsMaxWidth1 != null) {
            return String.format(Locale.US, "colsMaxWidth: %f,", colsMaxWidth1);
        }
        return "";
    }

    private String generateJScolsMinWidth() {
        if (colsMinWidth != null) {
            return String.format(Locale.US, "colsMinWidth: %s,", colsMinWidth);
        }
        return "";
    }

    private String generateJScolsMinWidth1() {
        if (colsMinWidth1 != null) {
            return String.format(Locale.US, "colsMinWidth: %f,", colsMinWidth1);
        }
        return "";
    }

    private String generateJScolsWidth() {
        if (colsWidth != null) {
            return String.format(Locale.US, "colsWidth: %s,", colsWidth);
        }
        return "";
    }

    private String generateJScolsWidth1() {
        if (colsWidth1 != null) {
            return String.format(Locale.US, "colsWidth: %f,", colsWidth1);
        }
        return "";
    }

    private String generateJStableValues() {
        if (tableValues != null) {
            return String.format(Locale.US, "tableValues: %s,", tableValues);
        }
        return "";
    }

    private String generateJSdemergeCells() {
        if (demergeCells != null) {
            return String.format(Locale.US, "demergeCells: %b,", demergeCells);
        }
        return "";
    }

    private String generateJSdisablePointerEvents() {
        if (disablePointerEvents != null) {
            return String.format(Locale.US, "disablePointerEvents: %b,", disablePointerEvents);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSfontColor() {
        if (fontColor != null) {
            return String.format(Locale.US, "fontColor: %s,", fontColor);
        }
        return "";
    }

    private String generateJSfontDecoration() {
        if (fontDecoration != null) {
            return String.format(Locale.US, "fontDecoration: %s,", (fontDecoration != null) ? fontDecoration.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontDecoration1() {
        if (fontDecoration1 != null) {
            return String.format(Locale.US, "fontDecoration: %s,", fontDecoration1);
        }
        return "";
    }

    private String generateJSfontFamily() {
        if (fontFamily != null) {
            return String.format(Locale.US, "fontFamily: %s,", fontFamily);
        }
        return "";
    }

    private String generateJSfontOpacity() {
        if (fontOpacity != null) {
            return String.format(Locale.US, "fontOpacity: %f,", fontOpacity);
        }
        return "";
    }

    private String generateJSfontSize() {
        if (fontSize != null) {
            return String.format(Locale.US, "fontSize: %s,", fontSize);
        }
        return "";
    }

    private String generateJSfontSize1() {
        if (fontSize1 != null) {
            return String.format(Locale.US, "fontSize: %f,", fontSize1);
        }
        return "";
    }

    private String generateJSfontStyle() {
        if (fontStyle != null) {
            return String.format(Locale.US, "fontStyle: %s,", (fontStyle != null) ? fontStyle.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontStyle1() {
        if (fontStyle1 != null) {
            return String.format(Locale.US, "fontStyle: %s,", fontStyle1);
        }
        return "";
    }

    private String generateJSfontVariant() {
        if (fontVariant != null) {
            return String.format(Locale.US, "fontVariant: %s,", (fontVariant != null) ? fontVariant.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontVariant1() {
        if (fontVariant1 != null) {
            return String.format(Locale.US, "fontVariant: %s,", fontVariant1);
        }
        return "";
    }

    private String generateJSfontWeight() {
        if (fontWeight != null) {
            return String.format(Locale.US, "fontWeight: %s,", fontWeight);
        }
        return "";
    }

    private String generateJSfontWeight1() {
        if (fontWeight1 != null) {
            return String.format(Locale.US, "fontWeight: %f,", fontWeight1);
        }
        return "";
    }

    private String generateJSrow() {
        if (row != null) {
            return String.format(Locale.US, "row: %f,", row);
        }
        return "";
    }

    private String generateJScol() {
        if (col != null) {
            return String.format(Locale.US, "col: %f,", col);
        }
        return "";
    }

    private String generateJScol1() {
        if (col1 != null) {
            return String.format(Locale.US, "col: %f,", col1);
        }
        return "";
    }

    private String generateJSrow1() {
        if (row1 != null) {
            return String.format(Locale.US, "row: %f,", row1);
        }
        return "";
    }

    private String generateJShAlign() {
        if (hAlign != null) {
            return String.format(Locale.US, "hAlign: %s,", (hAlign != null) ? hAlign.generateJs() : "null");
        }
        return "";
    }

    private String generateJShAlign1() {
        if (hAlign1 != null) {
            return String.format(Locale.US, "hAlign: %s,", hAlign1);
        }
        return "";
    }

    private String generateJSheight2() {
        if (height2 != null) {
            return String.format(Locale.US, "height: %f,", height2);
        }
        return "";
    }

    private String generateJSheight3() {
        if (height3 != null) {
            return String.format(Locale.US, "height: %s,", height3);
        }
        return "";
    }

    private String generateJSleft() {
        if (left != null) {
            return String.format(Locale.US, "left: %f,", left);
        }
        return "";
    }

    private String generateJSleft1() {
        if (left1 != null) {
            return String.format(Locale.US, "left: %s,", left1);
        }
        return "";
    }

    private String generateJSletterSpacing() {
        if (letterSpacing != null) {
            return String.format(Locale.US, "letterSpacing: %s,", letterSpacing);
        }
        return "";
    }

    private String generateJSletterSpacing1() {
        if (letterSpacing1 != null) {
            return String.format(Locale.US, "letterSpacing: %f,", letterSpacing1);
        }
        return "";
    }

    private String generateJSlineHeight() {
        if (lineHeight != null) {
            return String.format(Locale.US, "lineHeight: %s,", lineHeight);
        }
        return "";
    }

    private String generateJSlineHeight1() {
        if (lineHeight1 != null) {
            return String.format(Locale.US, "lineHeight: %f,", lineHeight1);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
        }
        return "";
    }

    private String generateJSmaxHeight() {
        if (maxHeight != null) {
            return String.format(Locale.US, "maxHeight: %f,", maxHeight);
        }
        return "";
    }

    private String generateJSmaxHeight1() {
        if (maxHeight1 != null) {
            return String.format(Locale.US, "maxHeight: %s,", maxHeight1);
        }
        return "";
    }

    private String generateJSmaxWidth() {
        if (maxWidth != null) {
            return String.format(Locale.US, "maxWidth: %f,", maxWidth);
        }
        return "";
    }

    private String generateJSmaxWidth1() {
        if (maxWidth1 != null) {
            return String.format(Locale.US, "maxWidth: %s,", maxWidth1);
        }
        return "";
    }

    private String generateJSminHeight() {
        if (minHeight != null) {
            return String.format(Locale.US, "minHeight: %f,", minHeight);
        }
        return "";
    }

    private String generateJSminHeight1() {
        if (minHeight1 != null) {
            return String.format(Locale.US, "minHeight: %s,", minHeight1);
        }
        return "";
    }

    private String generateJSminWidth() {
        if (minWidth != null) {
            return String.format(Locale.US, "minWidth: %f,", minWidth);
        }
        return "";
    }

    private String generateJSminWidth1() {
        if (minWidth1 != null) {
            return String.format(Locale.US, "minWidth: %s,", minWidth1);
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions1() {
        if (paperSizeOrOptions1 != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", paperSizeOrOptions1);
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSright() {
        if (right != null) {
            return String.format(Locale.US, "right: %f,", right);
        }
        return "";
    }

    private String generateJSright1() {
        if (right1 != null) {
            return String.format(Locale.US, "right: %s,", right1);
        }
        return "";
    }

    private String generateJSrowEvenFill() {
        if (rowEvenFill != null) {
            return String.format(Locale.US, "rowEvenFill: %s,", (rowEvenFill != null) ? rowEvenFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: %s,", color4);
        }
        return "";
    }

    private String generateJSopacity3() {
        if (opacity3 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity3);
        }
        return "";
    }

    private String generateJSkeys4() {
        if (keys4 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys4));
        }
        return "";
    }

    private String generateJSkeys5() {
        if (keys5 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys5));
        }
        return "";
    }

    private String generateJSangle1() {
        if (angle1 != null) {
            return String.format(Locale.US, "angle: %f,", angle1);
        }
        return "";
    }

    private String generateJSmode4() {
        if (mode4 != null) {
            return String.format(Locale.US, "mode: %b,", mode4);
        }
        return "";
    }

    private String generateJSmode5() {
        if (mode5 != null) {
            return String.format(Locale.US, "mode: %s,", (mode5 != null) ? mode5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode6() {
        if (mode6 != null) {
            return String.format(Locale.US, "mode: %s,", mode6);
        }
        return "";
    }

    private String generateJSopacity4() {
        if (opacity4 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity4);
        }
        return "";
    }

    private String generateJSkeys6() {
        if (keys6 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys6));
        }
        return "";
    }

    private String generateJSkeys7() {
        if (keys7 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys7));
        }
        return "";
    }

    private String generateJScx1() {
        if (cx1 != null) {
            return String.format(Locale.US, "cx: %f,", cx1);
        }
        return "";
    }

    private String generateJScy1() {
        if (cy1 != null) {
            return String.format(Locale.US, "cy: %f,", cy1);
        }
        return "";
    }

    private String generateJSmode7() {
        if (mode7 != null) {
            return String.format(Locale.US, "mode: %s,", (mode7 != null) ? mode7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity5() {
        if (opacity5 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity5);
        }
        return "";
    }

    private String generateJSfx1() {
        if (fx1 != null) {
            return String.format(Locale.US, "fx: %f,", fx1);
        }
        return "";
    }

    private String generateJSfy1() {
        if (fy1 != null) {
            return String.format(Locale.US, "fy: %f,", fy1);
        }
        return "";
    }

    private String generateJSimageSettings1() {
        if (imageSettings1 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings1 != null) ? imageSettings1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrowOddFill() {
        if (rowOddFill != null) {
            return String.format(Locale.US, "rowOddFill: %s,", (rowOddFill != null) ? rowOddFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor5() {
        if (color5 != null) {
            return String.format(Locale.US, "color: %s,", color5);
        }
        return "";
    }

    private String generateJSopacity6() {
        if (opacity6 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity6);
        }
        return "";
    }

    private String generateJSkeys8() {
        if (keys8 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys8));
        }
        return "";
    }

    private String generateJSkeys9() {
        if (keys9 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys9));
        }
        return "";
    }

    private String generateJSangle2() {
        if (angle2 != null) {
            return String.format(Locale.US, "angle: %f,", angle2);
        }
        return "";
    }

    private String generateJSmode8() {
        if (mode8 != null) {
            return String.format(Locale.US, "mode: %b,", mode8);
        }
        return "";
    }

    private String generateJSmode9() {
        if (mode9 != null) {
            return String.format(Locale.US, "mode: %s,", (mode9 != null) ? mode9.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode10() {
        if (mode10 != null) {
            return String.format(Locale.US, "mode: %s,", mode10);
        }
        return "";
    }

    private String generateJSopacity7() {
        if (opacity7 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity7);
        }
        return "";
    }

    private String generateJSkeys10() {
        if (keys10 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys10));
        }
        return "";
    }

    private String generateJSkeys11() {
        if (keys11 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys11));
        }
        return "";
    }

    private String generateJScx2() {
        if (cx2 != null) {
            return String.format(Locale.US, "cx: %f,", cx2);
        }
        return "";
    }

    private String generateJScy2() {
        if (cy2 != null) {
            return String.format(Locale.US, "cy: %f,", cy2);
        }
        return "";
    }

    private String generateJSmode11() {
        if (mode11 != null) {
            return String.format(Locale.US, "mode: %s,", (mode11 != null) ? mode11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity8() {
        if (opacity8 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity8);
        }
        return "";
    }

    private String generateJSfx2() {
        if (fx2 != null) {
            return String.format(Locale.US, "fx: %f,", fx2);
        }
        return "";
    }

    private String generateJSfy2() {
        if (fy2 != null) {
            return String.format(Locale.US, "fy: %f,", fy2);
        }
        return "";
    }

    private String generateJSimageSettings2() {
        if (imageSettings2 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings2 != null) ? imageSettings2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrowsCount() {
        if (rowsCount != null) {
            return String.format(Locale.US, "rowsCount: %f,", rowsCount);
        }
        return "";
    }

    private String generateJSrowsHeight() {
        if (rowsHeight != null) {
            return String.format(Locale.US, "rowsHeight: %s,", rowsHeight);
        }
        return "";
    }

    private String generateJSrowsHeight1() {
        if (rowsHeight1 != null) {
            return String.format(Locale.US, "rowsHeight: %f,", rowsHeight1);
        }
        return "";
    }

    private String generateJSrowsMaxHeight() {
        if (rowsMaxHeight != null) {
            return String.format(Locale.US, "rowsMaxHeight: %s,", rowsMaxHeight);
        }
        return "";
    }

    private String generateJSrowsMaxHeight1() {
        if (rowsMaxHeight1 != null) {
            return String.format(Locale.US, "rowsMaxHeight: %f,", rowsMaxHeight1);
        }
        return "";
    }

    private String generateJSrowsMinHeight() {
        if (rowsMinHeight != null) {
            return String.format(Locale.US, "rowsMinHeight: %s,", rowsMinHeight);
        }
        return "";
    }

    private String generateJSrowsMinHeight1() {
        if (rowsMinHeight1 != null) {
            return String.format(Locale.US, "rowsMinHeight: %f,", rowsMinHeight1);
        }
        return "";
    }

    private String generateJScsvSettings() {
        if (csvSettings != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings);
        }
        return "";
    }

    private String generateJSfilename() {
        if (filename != null) {
            return String.format(Locale.US, "filename: %s,", filename);
        }
        return "";
    }

    private String generateJSwidth2() {
        if (width2 != null) {
            return String.format(Locale.US, "width: %f,", width2);
        }
        return "";
    }

    private String generateJSheight4() {
        if (height4 != null) {
            return String.format(Locale.US, "height: %f,", height4);
        }
        return "";
    }

    private String generateJSquality() {
        if (quality != null) {
            return String.format(Locale.US, "quality: %f,", quality);
        }
        return "";
    }

    private String generateJSforceTransparentWhite() {
        if (forceTransparentWhite != null) {
            return String.format(Locale.US, "forceTransparentWhite: %b,", forceTransparentWhite);
        }
        return "";
    }

    private String generateJSpaperSize() {
        if (paperSize != null) {
            return String.format(Locale.US, "paperSize: %s,", paperSize);
        }
        return "";
    }

    private String generateJSlandscape1() {
        if (landscape1 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape1);
        }
        return "";
    }

    private String generateJSx2() {
        if (x2 != null) {
            return String.format(Locale.US, "x: %f,", x2);
        }
        return "";
    }

    private String generateJSy2() {
        if (y2 != null) {
            return String.format(Locale.US, "y: %f,", y2);
        }
        return "";
    }

    private String generateJSwidth3() {
        if (width3 != null) {
            return String.format(Locale.US, "width: %f,", width3);
        }
        return "";
    }

    private String generateJSheight5() {
        if (height5 != null) {
            return String.format(Locale.US, "height: %f,", height5);
        }
        return "";
    }

    private String generateJSquality1() {
        if (quality1 != null) {
            return String.format(Locale.US, "quality: %f,", quality1);
        }
        return "";
    }

    private String generateJSpaperSize1() {
        if (paperSize1 != null) {
            return String.format(Locale.US, "paperSize: %s,", paperSize1);
        }
        return "";
    }

    private String generateJSlandscape2() {
        if (landscape2 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape2);
        }
        return "";
    }

    private String generateJSwidth4() {
        if (width4 != null) {
            return String.format(Locale.US, "width: %f,", width4);
        }
        return "";
    }

    private String generateJSheight6() {
        if (height6 != null) {
            return String.format(Locale.US, "height: %f,", height6);
        }
        return "";
    }

    private String generateJSfilename1() {
        if (filename1 != null) {
            return String.format(Locale.US, "filename: %s,", filename1);
        }
        return "";
    }

    private String generateJSselectable() {
        if (selectable != null) {
            return String.format(Locale.US, "selectable: %b,", selectable);
        }
        return "";
    }

    private String generateJStextDirection() {
        if (textDirection != null) {
            return String.format(Locale.US, "textDirection: %s,", (textDirection != null) ? textDirection.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextDirection1() {
        if (textDirection1 != null) {
            return String.format(Locale.US, "textDirection: %s,", textDirection1);
        }
        return "";
    }

    private String generateJStextIndent() {
        if (textIndent != null) {
            return String.format(Locale.US, "textIndent: %f,", textIndent);
        }
        return "";
    }

    private String generateJStextOverflow() {
        if (textOverflow != null) {
            return String.format(Locale.US, "textOverflow: %s,", (textOverflow != null) ? textOverflow.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextOverflow1() {
        if (textOverflow1 != null) {
            return String.format(Locale.US, "textOverflow: %s,", textOverflow1);
        }
        return "";
    }

    private String generateJStextWrap() {
        if (textWrap != null) {
            return String.format(Locale.US, "textWrap: %s,", (textWrap != null) ? textWrap.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextWrap1() {
        if (textWrap1 != null) {
            return String.format(Locale.US, "textWrap: %s,", textWrap1);
        }
        return "";
    }

    private String generateJScsvSettings1() {
        if (csvSettings1 != null) {
            return String.format(Locale.US, "csvSettings: %s,", csvSettings1);
        }
        return "";
    }

    private String generateJSpaperSize2() {
        if (paperSize2 != null) {
            return String.format(Locale.US, "paperSize: %s,", paperSize2);
        }
        return "";
    }

    private String generateJSlandscape3() {
        if (landscape3 != null) {
            return String.format(Locale.US, "landscape: %b,", landscape3);
        }
        return "";
    }

    private String generateJSwidth5() {
        if (width5 != null) {
            return String.format(Locale.US, "width: %f,", width5);
        }
        return "";
    }

    private String generateJSheight7() {
        if (height7 != null) {
            return String.format(Locale.US, "height: %f,", height7);
        }
        return "";
    }

    private String generateJStop() {
        if (top != null) {
            return String.format(Locale.US, "top: %f,", top);
        }
        return "";
    }

    private String generateJStop1() {
        if (top1 != null) {
            return String.format(Locale.US, "top: %s,", top1);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSuseHtml() {
        if (useHtml != null) {
            return String.format(Locale.US, "useHtml: %b,", useHtml);
        }
        return "";
    }

    private String generateJSvAlign() {
        if (vAlign != null) {
            return String.format(Locale.US, "vAlign: %s,", (vAlign != null) ? vAlign.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvAlign1() {
        if (vAlign1 != null) {
            return String.format(Locale.US, "vAlign: %s,", vAlign1);
        }
        return "";
    }

    private String generateJSwidth6() {
        if (width6 != null) {
            return String.format(Locale.US, "width: %f,", width6);
        }
        return "";
    }

    private String generateJSwidth7() {
        if (width7 != null) {
            return String.format(Locale.US, "width: %s,", width7);
        }
        return "";
    }

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJScolor());
            js.append(generateJScolor1());
            js.append(generateJScolor2());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJSbottom());
            js.append(generateJSbottom1());
            js.append(generateJSbounds());
            js.append(generateJSbounds1());
            js.append(generateJSbounds2());
            js.append(generateJSx());
            js.append(generateJSx1());
            js.append(generateJSy());
            js.append(generateJSy1());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append(generateJSheight());
            js.append(generateJSheight1());
            js.append(generateJSstrokeOrFill());
            js.append(generateJSstrokeOrFill1());
            js.append(generateJSstrokeOrFill2());
            js.append(generateJSthickness1());
            js.append(generateJSdashpattern1());
            js.append(generateJSlineJoin1());
            js.append(generateJSlineCap1());
            js.append(generateJScellFill());
            js.append(generateJScolor3());
            js.append(generateJSopacity());
            js.append(generateJSkeys());
            js.append(generateJSkeys1());
            js.append(generateJSangle());
            js.append(generateJSmode());
            js.append(generateJSmode1());
            js.append(generateJSmode2());
            js.append(generateJSopacity1());
            js.append(generateJSkeys2());
            js.append(generateJSkeys3());
            js.append(generateJScx());
            js.append(generateJScy());
            js.append(generateJSmode3());
            js.append(generateJSopacity2());
            js.append(generateJSfx());
            js.append(generateJSfy());
            js.append(generateJSimageSettings());
            js.append(generateJScellPadding());
            js.append(generateJScellPadding1());
            js.append(generateJScellPadding2());
            js.append(generateJSvalue());
            js.append(generateJSvalue1());
            js.append(generateJSvalue2());
            js.append(generateJSvalue3());
            js.append(generateJSvalue4());
            js.append(generateJSvalue5());
            js.append(generateJSvalue6());
            js.append(generateJSvalue7());
            js.append(generateJScolsCount());
            js.append(generateJScolsMaxWidth());
            js.append(generateJScolsMaxWidth1());
            js.append(generateJScolsMinWidth());
            js.append(generateJScolsMinWidth1());
            js.append(generateJScolsWidth());
            js.append(generateJScolsWidth1());
            js.append(generateJStableValues());
            js.append(generateJSdemergeCells());
            js.append(generateJSdisablePointerEvents());
            js.append(generateJSenabled());
            js.append(generateJSfontColor());
            js.append(generateJSfontDecoration());
            js.append(generateJSfontDecoration1());
            js.append(generateJSfontFamily());
            js.append(generateJSfontOpacity());
            js.append(generateJSfontSize());
            js.append(generateJSfontSize1());
            js.append(generateJSfontStyle());
            js.append(generateJSfontStyle1());
            js.append(generateJSfontVariant());
            js.append(generateJSfontVariant1());
            js.append(generateJSfontWeight());
            js.append(generateJSfontWeight1());
            js.append(generateJSrow());
            js.append(generateJScol());
            js.append(generateJScol1());
            js.append(generateJSrow1());
            js.append(generateJShAlign());
            js.append(generateJShAlign1());
            js.append(generateJSheight2());
            js.append(generateJSheight3());
            js.append(generateJSleft());
            js.append(generateJSleft1());
            js.append(generateJSletterSpacing());
            js.append(generateJSletterSpacing1());
            js.append(generateJSlineHeight());
            js.append(generateJSlineHeight1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSmaxHeight());
            js.append(generateJSmaxHeight1());
            js.append(generateJSmaxWidth());
            js.append(generateJSmaxWidth1());
            js.append(generateJSminHeight());
            js.append(generateJSminHeight1());
            js.append(generateJSminWidth());
            js.append(generateJSminWidth1());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSright());
            js.append(generateJSright1());
            js.append(generateJSrowEvenFill());
            js.append(generateJScolor4());
            js.append(generateJSopacity3());
            js.append(generateJSkeys4());
            js.append(generateJSkeys5());
            js.append(generateJSangle1());
            js.append(generateJSmode4());
            js.append(generateJSmode5());
            js.append(generateJSmode6());
            js.append(generateJSopacity4());
            js.append(generateJSkeys6());
            js.append(generateJSkeys7());
            js.append(generateJScx1());
            js.append(generateJScy1());
            js.append(generateJSmode7());
            js.append(generateJSopacity5());
            js.append(generateJSfx1());
            js.append(generateJSfy1());
            js.append(generateJSimageSettings1());
            js.append(generateJSrowOddFill());
            js.append(generateJScolor5());
            js.append(generateJSopacity6());
            js.append(generateJSkeys8());
            js.append(generateJSkeys9());
            js.append(generateJSangle2());
            js.append(generateJSmode8());
            js.append(generateJSmode9());
            js.append(generateJSmode10());
            js.append(generateJSopacity7());
            js.append(generateJSkeys10());
            js.append(generateJSkeys11());
            js.append(generateJScx2());
            js.append(generateJScy2());
            js.append(generateJSmode11());
            js.append(generateJSopacity8());
            js.append(generateJSfx2());
            js.append(generateJSfy2());
            js.append(generateJSimageSettings2());
            js.append(generateJSrowsCount());
            js.append(generateJSrowsHeight());
            js.append(generateJSrowsHeight1());
            js.append(generateJSrowsMaxHeight());
            js.append(generateJSrowsMaxHeight1());
            js.append(generateJSrowsMinHeight());
            js.append(generateJSrowsMinHeight1());
            js.append(generateJScsvSettings());
            js.append(generateJSfilename());
            js.append(generateJSwidth2());
            js.append(generateJSheight4());
            js.append(generateJSquality());
            js.append(generateJSforceTransparentWhite());
            js.append(generateJSpaperSize());
            js.append(generateJSlandscape1());
            js.append(generateJSx2());
            js.append(generateJSy2());
            js.append(generateJSwidth3());
            js.append(generateJSheight5());
            js.append(generateJSquality1());
            js.append(generateJSpaperSize1());
            js.append(generateJSlandscape2());
            js.append(generateJSwidth4());
            js.append(generateJSheight6());
            js.append(generateJSfilename1());
            js.append(generateJSselectable());
            js.append(generateJStextDirection());
            js.append(generateJStextDirection1());
            js.append(generateJStextIndent());
            js.append(generateJStextOverflow());
            js.append(generateJStextOverflow1());
            js.append(generateJStextWrap());
            js.append(generateJStextWrap1());
            js.append(generateJScsvSettings1());
            js.append(generateJSpaperSize2());
            js.append(generateJSlandscape3());
            js.append(generateJSwidth5());
            js.append(generateJSheight7());
            js.append(generateJStop());
            js.append(generateJStop1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSuseHtml());
            js.append(generateJSvAlign());
            js.append(generateJSvAlign1());
            js.append(generateJSwidth6());
            js.append(generateJSwidth7());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetborder());
            js.append(generateJSgetbounds());
            js.append(generateJSgetcellPadding());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}