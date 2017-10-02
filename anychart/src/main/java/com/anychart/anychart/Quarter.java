package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Quarter extends JsObject {

    private String jsBase;

    public Quarter() {

    }

    protected Quarter(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Stroke bottomStroke;
    private ColoredFill bottomStroke1;
    private String bottomStroke2;

    public void setBottomstroke(Stroke bottomStroke) {
        if (jsBase == null) {
            this.bottomStroke = null;
            this.bottomStroke1 = null;
            this.bottomStroke2 = null;
            
            this.bottomStroke = bottomStroke;
        } else {
            this.bottomStroke = bottomStroke;

            js.append(String.format(Locale.US, jsBase + ".bottomStroke(%s);", (bottomStroke != null) ? bottomStroke.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottomStroke(%s);", (bottomStroke != null) ? bottomStroke.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBottomstroke(ColoredFill bottomStroke1) {
        if (jsBase == null) {
            this.bottomStroke = null;
            this.bottomStroke1 = null;
            this.bottomStroke2 = null;
            
            this.bottomStroke1 = bottomStroke1;
        } else {
            this.bottomStroke1 = bottomStroke1;

            js.append(String.format(Locale.US, jsBase + ".bottomStroke(%s);", (bottomStroke1 != null) ? bottomStroke1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottomStroke(%s);", (bottomStroke1 != null) ? bottomStroke1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBottomstroke(String bottomStroke2) {
        if (jsBase == null) {
            this.bottomStroke = null;
            this.bottomStroke1 = null;
            this.bottomStroke2 = null;
            
            this.bottomStroke2 = bottomStroke2;
        } else {
            this.bottomStroke2 = bottomStroke2;

            js.append(String.format(Locale.US, jsBase + ".bottomStroke(%s);", bottomStroke2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottomStroke(%s);", bottomStroke2));
                js.setLength(0);
            }
        }
    }

    private Stroke bottomStroke3;
    private String bottomStroke4;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setBottomstroke(Stroke bottomStroke3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.bottomStroke = null;
            this.bottomStroke1 = null;
            this.bottomStroke2 = null;
            this.bottomStroke3 = null;
            this.bottomStroke4 = null;
            
            this.bottomStroke3 = bottomStroke3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.bottomStroke3 = bottomStroke3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".bottomStroke(%s, %f, %s, %s, %s);", (bottomStroke3 != null) ? bottomStroke3.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottomStroke(%s, %f, %s, %s, %s);", (bottomStroke3 != null) ? bottomStroke3.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBottomstroke(String bottomStroke4, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.bottomStroke = null;
            this.bottomStroke1 = null;
            this.bottomStroke2 = null;
            this.bottomStroke3 = null;
            this.bottomStroke4 = null;
            
            this.bottomStroke4 = bottomStroke4;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.bottomStroke4 = bottomStroke4;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".bottomStroke(%s, %f, %s, %s, %s);", bottomStroke4, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottomStroke(%s, %f, %s, %s, %s);", bottomStroke4, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private BackgroundCornersType cornerType;

    public void setCornertype(BackgroundCornersType cornerType) {
        if (jsBase == null) {
            this.cornerType = cornerType;
        } else {
            this.cornerType = cornerType;

            js.append(String.format(Locale.US, jsBase + ".cornerType(%s);", (cornerType != null) ? cornerType.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cornerType(%s);", (cornerType != null) ? cornerType.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double corners;
    private String corners1;
    private Double[] corners2;

    public void setCorners(Double corners) {
        if (jsBase == null) {
            this.corners = null;
            this.corners1 = null;
            this.corners2 = null;
            
            this.corners = corners;
        } else {
            this.corners = corners;

            js.append(String.format(Locale.US, jsBase + ".corners(%f);", corners));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%f);", corners));
                js.setLength(0);
            }
        }
    }


    public void setCorners(String corners1) {
        if (jsBase == null) {
            this.corners = null;
            this.corners1 = null;
            this.corners2 = null;
            
            this.corners1 = corners1;
        } else {
            this.corners1 = corners1;

            js.append(String.format(Locale.US, jsBase + ".corners(%s);", corners1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s);", corners1));
                js.setLength(0);
            }
        }
    }


    public void setCorners(Double[] corners2) {
        if (jsBase == null) {
            this.corners = null;
            this.corners1 = null;
            this.corners2 = null;
            
            this.corners2 = corners2;
        } else {
            this.corners2 = corners2;

            js.append(String.format(Locale.US, jsBase + ".corners(%s);", Arrays.toString(corners2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s);", Arrays.toString(corners2)));
                js.setLength(0);
            }
        }
    }

    private Double topLeft;
    private String topLeft1;
    private Double topRight;
    private String topRight1;
    private Double bottomRight;
    private String bottomRight1;
    private Double bottomLeft;
    private String bottomLeft1;

    public void setCorners(Double topLeft, Double topRight, Double bottomRight, Double bottomLeft) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft = topLeft;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight = topRight;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight = bottomRight;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft = bottomLeft;
        } else {
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomRight = bottomRight;
            this.bottomLeft = bottomLeft;

            js.append(String.format(Locale.US, jsBase + ".corners(%f, %f, %f, %f);", topLeft, topRight, bottomRight, bottomLeft));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%f, %f, %f, %f);", topLeft, topRight, bottomRight, bottomLeft));
                js.setLength(0);
            }
        }
    }


    public void setCorners(Double topLeft, Double topRight, Double bottomRight, String bottomLeft1) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft = topLeft;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight = topRight;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight = bottomRight;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft1 = bottomLeft1;
        } else {
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomRight = bottomRight;
            this.bottomLeft1 = bottomLeft1;

            js.append(String.format(Locale.US, jsBase + ".corners(%f, %f, %f, %s);", topLeft, topRight, bottomRight, bottomLeft1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%f, %f, %f, %s);", topLeft, topRight, bottomRight, bottomLeft1));
                js.setLength(0);
            }
        }
    }


    public void setCorners(Double topLeft, Double topRight, String bottomRight1, Double bottomLeft) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft = topLeft;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight = topRight;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft = bottomLeft;
        } else {
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = bottomLeft;

            js.append(String.format(Locale.US, jsBase + ".corners(%f, %f, %s, %f);", topLeft, topRight, bottomRight1, bottomLeft));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%f, %f, %s, %f);", topLeft, topRight, bottomRight1, bottomLeft));
                js.setLength(0);
            }
        }
    }


    public void setCorners(Double topLeft, Double topRight, String bottomRight1, String bottomLeft1) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft = topLeft;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight = topRight;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft1 = bottomLeft1;
        } else {
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomRight1 = bottomRight1;
            this.bottomLeft1 = bottomLeft1;

            js.append(String.format(Locale.US, jsBase + ".corners(%f, %f, %s, %s);", topLeft, topRight, bottomRight1, bottomLeft1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%f, %f, %s, %s);", topLeft, topRight, bottomRight1, bottomLeft1));
                js.setLength(0);
            }
        }
    }


    public void setCorners(Double topLeft, String topRight1, Double bottomRight, Double bottomLeft) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft = topLeft;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight1 = topRight1;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight = bottomRight;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft = bottomLeft;
        } else {
            this.topLeft = topLeft;
            this.topRight1 = topRight1;
            this.bottomRight = bottomRight;
            this.bottomLeft = bottomLeft;

            js.append(String.format(Locale.US, jsBase + ".corners(%f, %s, %f, %f);", topLeft, topRight1, bottomRight, bottomLeft));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%f, %s, %f, %f);", topLeft, topRight1, bottomRight, bottomLeft));
                js.setLength(0);
            }
        }
    }


    public void setCorners(Double topLeft, String topRight1, Double bottomRight, String bottomLeft1) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft = topLeft;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight1 = topRight1;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight = bottomRight;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft1 = bottomLeft1;
        } else {
            this.topLeft = topLeft;
            this.topRight1 = topRight1;
            this.bottomRight = bottomRight;
            this.bottomLeft1 = bottomLeft1;

            js.append(String.format(Locale.US, jsBase + ".corners(%f, %s, %f, %s);", topLeft, topRight1, bottomRight, bottomLeft1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%f, %s, %f, %s);", topLeft, topRight1, bottomRight, bottomLeft1));
                js.setLength(0);
            }
        }
    }


    public void setCorners(Double topLeft, String topRight1, String bottomRight1, Double bottomLeft) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft = topLeft;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight1 = topRight1;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft = bottomLeft;
        } else {
            this.topLeft = topLeft;
            this.topRight1 = topRight1;
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = bottomLeft;

            js.append(String.format(Locale.US, jsBase + ".corners(%f, %s, %s, %f);", topLeft, topRight1, bottomRight1, bottomLeft));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%f, %s, %s, %f);", topLeft, topRight1, bottomRight1, bottomLeft));
                js.setLength(0);
            }
        }
    }


    public void setCorners(Double topLeft, String topRight1, String bottomRight1, String bottomLeft1) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft = topLeft;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight1 = topRight1;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft1 = bottomLeft1;
        } else {
            this.topLeft = topLeft;
            this.topRight1 = topRight1;
            this.bottomRight1 = bottomRight1;
            this.bottomLeft1 = bottomLeft1;

            js.append(String.format(Locale.US, jsBase + ".corners(%f, %s, %s, %s);", topLeft, topRight1, bottomRight1, bottomLeft1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%f, %s, %s, %s);", topLeft, topRight1, bottomRight1, bottomLeft1));
                js.setLength(0);
            }
        }
    }


    public void setCorners(String topLeft1, Double topRight, Double bottomRight, Double bottomLeft) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft1 = topLeft1;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight = topRight;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight = bottomRight;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft = bottomLeft;
        } else {
            this.topLeft1 = topLeft1;
            this.topRight = topRight;
            this.bottomRight = bottomRight;
            this.bottomLeft = bottomLeft;

            js.append(String.format(Locale.US, jsBase + ".corners(%s, %f, %f, %f);", topLeft1, topRight, bottomRight, bottomLeft));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s, %f, %f, %f);", topLeft1, topRight, bottomRight, bottomLeft));
                js.setLength(0);
            }
        }
    }


    public void setCorners(String topLeft1, Double topRight, Double bottomRight, String bottomLeft1) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft1 = topLeft1;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight = topRight;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight = bottomRight;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft1 = bottomLeft1;
        } else {
            this.topLeft1 = topLeft1;
            this.topRight = topRight;
            this.bottomRight = bottomRight;
            this.bottomLeft1 = bottomLeft1;

            js.append(String.format(Locale.US, jsBase + ".corners(%s, %f, %f, %s);", topLeft1, topRight, bottomRight, bottomLeft1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s, %f, %f, %s);", topLeft1, topRight, bottomRight, bottomLeft1));
                js.setLength(0);
            }
        }
    }


    public void setCorners(String topLeft1, Double topRight, String bottomRight1, Double bottomLeft) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft1 = topLeft1;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight = topRight;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft = bottomLeft;
        } else {
            this.topLeft1 = topLeft1;
            this.topRight = topRight;
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = bottomLeft;

            js.append(String.format(Locale.US, jsBase + ".corners(%s, %f, %s, %f);", topLeft1, topRight, bottomRight1, bottomLeft));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s, %f, %s, %f);", topLeft1, topRight, bottomRight1, bottomLeft));
                js.setLength(0);
            }
        }
    }


    public void setCorners(String topLeft1, Double topRight, String bottomRight1, String bottomLeft1) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft1 = topLeft1;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight = topRight;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft1 = bottomLeft1;
        } else {
            this.topLeft1 = topLeft1;
            this.topRight = topRight;
            this.bottomRight1 = bottomRight1;
            this.bottomLeft1 = bottomLeft1;

            js.append(String.format(Locale.US, jsBase + ".corners(%s, %f, %s, %s);", topLeft1, topRight, bottomRight1, bottomLeft1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s, %f, %s, %s);", topLeft1, topRight, bottomRight1, bottomLeft1));
                js.setLength(0);
            }
        }
    }


    public void setCorners(String topLeft1, String topRight1, Double bottomRight, Double bottomLeft) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft1 = topLeft1;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight1 = topRight1;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight = bottomRight;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft = bottomLeft;
        } else {
            this.topLeft1 = topLeft1;
            this.topRight1 = topRight1;
            this.bottomRight = bottomRight;
            this.bottomLeft = bottomLeft;

            js.append(String.format(Locale.US, jsBase + ".corners(%s, %s, %f, %f);", topLeft1, topRight1, bottomRight, bottomLeft));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s, %s, %f, %f);", topLeft1, topRight1, bottomRight, bottomLeft));
                js.setLength(0);
            }
        }
    }


    public void setCorners(String topLeft1, String topRight1, Double bottomRight, String bottomLeft1) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft1 = topLeft1;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight1 = topRight1;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight = bottomRight;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft1 = bottomLeft1;
        } else {
            this.topLeft1 = topLeft1;
            this.topRight1 = topRight1;
            this.bottomRight = bottomRight;
            this.bottomLeft1 = bottomLeft1;

            js.append(String.format(Locale.US, jsBase + ".corners(%s, %s, %f, %s);", topLeft1, topRight1, bottomRight, bottomLeft1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s, %s, %f, %s);", topLeft1, topRight1, bottomRight, bottomLeft1));
                js.setLength(0);
            }
        }
    }


    public void setCorners(String topLeft1, String topRight1, String bottomRight1, Double bottomLeft) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft1 = topLeft1;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight1 = topRight1;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft = bottomLeft;
        } else {
            this.topLeft1 = topLeft1;
            this.topRight1 = topRight1;
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = bottomLeft;

            js.append(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %f);", topLeft1, topRight1, bottomRight1, bottomLeft));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %f);", topLeft1, topRight1, bottomRight1, bottomLeft));
                js.setLength(0);
            }
        }
    }


    public void setCorners(String topLeft1, String topRight1, String bottomRight1, String bottomLeft1) {
        if (jsBase == null) {
            this.topLeft = null;
            this.topLeft1 = null;
            
            this.topLeft1 = topLeft1;
            this.topRight = null;
            this.topRight1 = null;
            
            this.topRight1 = topRight1;
            this.bottomRight = null;
            this.bottomRight1 = null;
            
            this.bottomRight1 = bottomRight1;
            this.bottomLeft = null;
            this.bottomLeft1 = null;
            
            this.bottomLeft1 = bottomLeft1;
        } else {
            this.topLeft1 = topLeft1;
            this.topRight1 = topRight1;
            this.bottomRight1 = bottomRight1;
            this.bottomLeft1 = bottomLeft1;

            js.append(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", topLeft1, topRight1, bottomRight1, bottomLeft1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".corners(%s, %s, %s, %s);", topLeft1, topRight1, bottomRight1, bottomLeft1));
                js.setLength(0);
            }
        }
    }

    private Fill fill;

    public void setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;

            js.append(String.format(Locale.US, jsBase + ".fill(%s);", (fill != null) ? fill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", (fill != null) ? fill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color;
    private Double opacity;

    public void setFill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f);", color, opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f);", color, opacity));
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

    public void setFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, String mode2, Double angle, Double opacity1) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
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

    public void setFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
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

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }

    private String index;
    private Double index1;

    public void setLabel(String index) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index = index;
        } else {
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".label(%s);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s);", index));
                js.setLength(0);
            }
        }
    }


    public void setLabel(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;

            js.append(String.format(Locale.US, jsBase + ".label(%f);", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%f);", index1));
                js.setLength(0);
            }
        }
    }

    private Boolean label;
    private String label1;
    private String label2;

    public void setLabel(Boolean label) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label = label;
        } else {
            this.label = label;

            js.append(String.format(Locale.US, jsBase + ".label(%b);", label));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%b);", label));
                js.setLength(0);
            }
        }
    }

    private String index2;
    private Double index3;
    private Boolean label3;
    private String label4;
    private String label5;

    public void setLabel(String index2, Boolean label3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index2 = index2;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label3 = label3;
        } else {
            this.index2 = index2;
            this.label3 = label3;

            js.append(String.format(Locale.US, jsBase + ".label(%s, %b);", index2, label3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s, %b);", index2, label3));
                js.setLength(0);
            }
        }
    }


    public void setLabel(String index2, String label4) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index2 = index2;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label4 = label4;
        } else {
            this.index2 = index2;
            this.label4 = label4;

            js.append(String.format(Locale.US, jsBase + ".label(%s, %s);", index2, label4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s, %s);", index2, label4));
                js.setLength(0);
            }
        }
    }


    public void setLabel(Double index3, Boolean label3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label3 = label3;
        } else {
            this.index3 = index3;
            this.label3 = label3;

            js.append(String.format(Locale.US, jsBase + ".label(%f, %b);", index3, label3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%f, %b);", index3, label3));
                js.setLength(0);
            }
        }
    }


    public void setLabel(Double index3, String label4) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            this.label3 = null;
            this.label4 = null;
            this.label5 = null;
            
            this.label4 = label4;
        } else {
            this.index3 = index3;
            this.label4 = label4;

            js.append(String.format(Locale.US, jsBase + ".label(%f, %s);", index3, label4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%f, %s);", index3, label4));
                js.setLength(0);
            }
        }
    }

    private Stroke leftStroke;
    private String leftStroke1;

    public void setLeftstroke(Stroke leftStroke) {
        if (jsBase == null) {
            this.leftStroke = null;
            this.leftStroke1 = null;
            
            this.leftStroke = leftStroke;
        } else {
            this.leftStroke = leftStroke;

            js.append(String.format(Locale.US, jsBase + ".leftStroke(%s);", (leftStroke != null) ? leftStroke.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".leftStroke(%s);", (leftStroke != null) ? leftStroke.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setLeftstroke(String leftStroke1) {
        if (jsBase == null) {
            this.leftStroke = null;
            this.leftStroke1 = null;
            
            this.leftStroke1 = leftStroke1;
        } else {
            this.leftStroke1 = leftStroke1;

            js.append(String.format(Locale.US, jsBase + ".leftStroke(%s);", leftStroke1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".leftStroke(%s);", leftStroke1));
                js.setLength(0);
            }
        }
    }

    private Stroke leftStroke2;
    private String leftStroke3;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setLeftstroke(Stroke leftStroke2, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.leftStroke = null;
            this.leftStroke1 = null;
            this.leftStroke2 = null;
            this.leftStroke3 = null;
            
            this.leftStroke2 = leftStroke2;
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
            this.leftStroke2 = leftStroke2;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".leftStroke(%s, %f, %s, %s, %s);", (leftStroke2 != null) ? leftStroke2.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".leftStroke(%s, %f, %s, %s, %s);", (leftStroke2 != null) ? leftStroke2.generateJs() : "null", thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setLeftstroke(String leftStroke3, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.leftStroke = null;
            this.leftStroke1 = null;
            this.leftStroke2 = null;
            this.leftStroke3 = null;
            
            this.leftStroke3 = leftStroke3;
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
            this.leftStroke3 = leftStroke3;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".leftStroke(%s, %f, %s, %s, %s);", leftStroke3, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".leftStroke(%s, %f, %s, %s, %s);", leftStroke3, thickness1, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Margin getMargin;

    public Margin getMargin() {
        if (getMargin == null)
            getMargin = new Margin(jsBase + ".margin()");

        return getMargin;
    }

    private Double[] margin;
    private String[] margin1;
    private String margin2;

    public void setMargin(Double[] margin) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            
            this.margin = margin;
        } else {
            this.margin = margin;

            js.append(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin)));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String[] margin1) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            
            this.margin1 = margin1;
        } else {
            this.margin1 = margin1;

            js.append(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", Arrays.toString(margin1)));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String margin2) {
        if (jsBase == null) {
            this.margin = null;
            this.margin1 = null;
            this.margin2 = null;
            
            this.margin2 = margin2;
        } else {
            this.margin2 = margin2;

            js.append(String.format(Locale.US, jsBase + ".margin(%s);", margin2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s);", margin2));
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

    public void setMargin(String value, String value2, String value4, String value6) {
        if (jsBase == null) {
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
            
            this.value2 = value2;
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
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value4 = value4;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value, value2, value4, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %s);", value, value2, value4, value6));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String value, String value2, String value4, Double value7) {
        if (jsBase == null) {
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
            
            this.value2 = value2;
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
            
            this.value7 = value7;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value4 = value4;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", value, value2, value4, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %s, %f);", value, value2, value4, value7));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String value, String value2, Double value5, String value6) {
        if (jsBase == null) {
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
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value5 = value5;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", value, value2, value5, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %s);", value, value2, value5, value6));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String value, String value2, Double value5, Double value7) {
        if (jsBase == null) {
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
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value5 = value5;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", value, value2, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %s, %f, %f);", value, value2, value5, value7));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String value, Double value3, String value4, String value6) {
        if (jsBase == null) {
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
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value3 = value3;
            this.value4 = value4;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", value, value3, value4, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %s);", value, value3, value4, value6));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String value, Double value3, String value4, Double value7) {
        if (jsBase == null) {
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
            
            this.value7 = value7;
        } else {
            this.value = value;
            this.value3 = value3;
            this.value4 = value4;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", value, value3, value4, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %s, %f);", value, value3, value4, value7));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String value, Double value3, Double value5, String value6) {
        if (jsBase == null) {
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
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value3 = value3;
            this.value5 = value5;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", value, value3, value5, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %s);", value, value3, value5, value6));
                js.setLength(0);
            }
        }
    }


    public void setMargin(String value, Double value3, Double value5, Double value7) {
        if (jsBase == null) {
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
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value = value;
            this.value3 = value3;
            this.value5 = value5;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", value, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%s, %f, %f, %f);", value, value3, value5, value7));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double value1, String value2, String value4, String value6) {
        if (jsBase == null) {
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
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value1 = value1;
            this.value2 = value2;
            this.value4 = value4;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %s, %s);", value1, value2, value4, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %s, %s);", value1, value2, value4, value6));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double value1, String value2, String value4, Double value7) {
        if (jsBase == null) {
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
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value2 = value2;
            this.value4 = value4;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %s, %f);", value1, value2, value4, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %s, %f);", value1, value2, value4, value7));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double value1, String value2, Double value5, String value6) {
        if (jsBase == null) {
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
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value1 = value1;
            this.value2 = value2;
            this.value5 = value5;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %s);", value1, value2, value5, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %s);", value1, value2, value5, value6));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double value1, String value2, Double value5, Double value7) {
        if (jsBase == null) {
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
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value2 = value2;
            this.value5 = value5;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %f);", value1, value2, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %s, %f, %f);", value1, value2, value5, value7));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double value1, Double value3, String value4, String value6) {
        if (jsBase == null) {
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
            
            this.value6 = value6;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value4 = value4;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %f, %s, %s);", value1, value3, value4, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %f, %s, %s);", value1, value3, value4, value6));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double value1, Double value3, String value4, Double value7) {
        if (jsBase == null) {
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
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value4 = value4;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %f, %s, %f);", value1, value3, value4, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %f, %s, %f);", value1, value3, value4, value7));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double value1, Double value3, Double value5, String value6) {
        if (jsBase == null) {
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
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value5 = value5;
            this.value6 = value6;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %f, %f, %s);", value1, value3, value5, value6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %f, %f, %s);", value1, value3, value5, value6));
                js.setLength(0);
            }
        }
    }


    public void setMargin(Double value1, Double value3, Double value5, Double value7) {
        if (jsBase == null) {
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
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value5 = value5;
            this.value7 = value7;

            js.append(String.format(Locale.US, jsBase + ".margin(%f, %f, %f, %f);", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".margin(%f, %f, %f, %f);", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
    }

    private UtilsPadding getPadding;

    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;

    public void setPadding(Double[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;

            js.append(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;

            js.append(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", Arrays.toString(padding1)));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String padding2) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding2 = padding2;
        } else {
            this.padding2 = padding2;

            js.append(String.format(Locale.US, jsBase + ".padding(%s);", padding2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s);", padding2));
                js.setLength(0);
            }
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
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value8 = value8;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value10 = value10;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value12 = value12;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value14 = value14;
        } else {
            this.value8 = value8;
            this.value10 = value10;
            this.value12 = value12;
            this.value14 = value14;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value8, value10, value12, value14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %s);", value8, value10, value12, value14));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value8, String value10, String value12, Double value15) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value8 = value8;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value10 = value10;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value12 = value12;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value15 = value15;
        } else {
            this.value8 = value8;
            this.value10 = value10;
            this.value12 = value12;
            this.value15 = value15;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %f);", value8, value10, value12, value15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %s, %f);", value8, value10, value12, value15));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value8, String value10, Double value13, String value14) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value8 = value8;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value10 = value10;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value13 = value13;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value14 = value14;
        } else {
            this.value8 = value8;
            this.value10 = value10;
            this.value13 = value13;
            this.value14 = value14;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s);", value8, value10, value13, value14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %s);", value8, value10, value13, value14));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value8, String value10, Double value13, Double value15) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value8 = value8;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value10 = value10;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value13 = value13;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value15 = value15;
        } else {
            this.value8 = value8;
            this.value10 = value10;
            this.value13 = value13;
            this.value15 = value15;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %f);", value8, value10, value13, value15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %s, %f, %f);", value8, value10, value13, value15));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value8, Double value11, String value12, String value14) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value8 = value8;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value11 = value11;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value12 = value12;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value14 = value14;
        } else {
            this.value8 = value8;
            this.value11 = value11;
            this.value12 = value12;
            this.value14 = value14;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %s);", value8, value11, value12, value14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %s);", value8, value11, value12, value14));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value8, Double value11, String value12, Double value15) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value8 = value8;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value11 = value11;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value12 = value12;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value15 = value15;
        } else {
            this.value8 = value8;
            this.value11 = value11;
            this.value12 = value12;
            this.value15 = value15;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %f);", value8, value11, value12, value15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %s, %f);", value8, value11, value12, value15));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value8, Double value11, Double value13, String value14) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value8 = value8;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value11 = value11;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value13 = value13;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value14 = value14;
        } else {
            this.value8 = value8;
            this.value11 = value11;
            this.value13 = value13;
            this.value14 = value14;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %s);", value8, value11, value13, value14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %s);", value8, value11, value13, value14));
                js.setLength(0);
            }
        }
    }


    public void setPadding(String value8, Double value11, Double value13, Double value15) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value8 = value8;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value11 = value11;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value13 = value13;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value15 = value15;
        } else {
            this.value8 = value8;
            this.value11 = value11;
            this.value13 = value13;
            this.value15 = value15;

            js.append(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %f);", value8, value11, value13, value15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%s, %f, %f, %f);", value8, value11, value13, value15));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value9, String value10, String value12, String value14) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value9 = value9;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value10 = value10;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value12 = value12;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value14 = value14;
        } else {
            this.value9 = value9;
            this.value10 = value10;
            this.value12 = value12;
            this.value14 = value14;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %s, %s);", value9, value10, value12, value14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %s, %s);", value9, value10, value12, value14));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value9, String value10, String value12, Double value15) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value9 = value9;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value10 = value10;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value12 = value12;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value15 = value15;
        } else {
            this.value9 = value9;
            this.value10 = value10;
            this.value12 = value12;
            this.value15 = value15;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %s, %f);", value9, value10, value12, value15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %s, %f);", value9, value10, value12, value15));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value9, String value10, Double value13, String value14) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value9 = value9;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value10 = value10;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value13 = value13;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value14 = value14;
        } else {
            this.value9 = value9;
            this.value10 = value10;
            this.value13 = value13;
            this.value14 = value14;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %s);", value9, value10, value13, value14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %s);", value9, value10, value13, value14));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value9, String value10, Double value13, Double value15) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value9 = value9;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value10 = value10;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value13 = value13;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value15 = value15;
        } else {
            this.value9 = value9;
            this.value10 = value10;
            this.value13 = value13;
            this.value15 = value15;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %f);", value9, value10, value13, value15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %s, %f, %f);", value9, value10, value13, value15));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value9, Double value11, String value12, String value14) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value9 = value9;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value11 = value11;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value12 = value12;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value14 = value14;
        } else {
            this.value9 = value9;
            this.value11 = value11;
            this.value12 = value12;
            this.value14 = value14;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %f, %s, %s);", value9, value11, value12, value14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %s, %s);", value9, value11, value12, value14));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value9, Double value11, String value12, Double value15) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value9 = value9;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value11 = value11;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value12 = value12;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value15 = value15;
        } else {
            this.value9 = value9;
            this.value11 = value11;
            this.value12 = value12;
            this.value15 = value15;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %f, %s, %f);", value9, value11, value12, value15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %s, %f);", value9, value11, value12, value15));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value9, Double value11, Double value13, String value14) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value9 = value9;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value11 = value11;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value13 = value13;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value14 = value14;
        } else {
            this.value9 = value9;
            this.value11 = value11;
            this.value13 = value13;
            this.value14 = value14;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %s);", value9, value11, value13, value14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %s);", value9, value11, value13, value14));
                js.setLength(0);
            }
        }
    }


    public void setPadding(Double value9, Double value11, Double value13, Double value15) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value9 = value9;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value11 = value11;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value13 = value13;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            this.value8 = null;
            this.value9 = null;
            this.value10 = null;
            this.value11 = null;
            this.value12 = null;
            this.value13 = null;
            this.value14 = null;
            this.value15 = null;
            
            this.value15 = value15;
        } else {
            this.value9 = value9;
            this.value11 = value11;
            this.value13 = value13;
            this.value15 = value15;

            js.append(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %f);", value9, value11, value13, value15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".padding(%f, %f, %f, %f);", value9, value11, value13, value15));
                js.setLength(0);
            }
        }
    }

    private Stroke rightStroke;
    private ColoredFill rightStroke1;
    private String rightStroke2;

    public void setRightstroke(Stroke rightStroke) {
        if (jsBase == null) {
            this.rightStroke = null;
            this.rightStroke1 = null;
            this.rightStroke2 = null;
            
            this.rightStroke = rightStroke;
        } else {
            this.rightStroke = rightStroke;

            js.append(String.format(Locale.US, jsBase + ".rightStroke(%s);", (rightStroke != null) ? rightStroke.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rightStroke(%s);", (rightStroke != null) ? rightStroke.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setRightstroke(ColoredFill rightStroke1) {
        if (jsBase == null) {
            this.rightStroke = null;
            this.rightStroke1 = null;
            this.rightStroke2 = null;
            
            this.rightStroke1 = rightStroke1;
        } else {
            this.rightStroke1 = rightStroke1;

            js.append(String.format(Locale.US, jsBase + ".rightStroke(%s);", (rightStroke1 != null) ? rightStroke1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rightStroke(%s);", (rightStroke1 != null) ? rightStroke1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setRightstroke(String rightStroke2) {
        if (jsBase == null) {
            this.rightStroke = null;
            this.rightStroke1 = null;
            this.rightStroke2 = null;
            
            this.rightStroke2 = rightStroke2;
        } else {
            this.rightStroke2 = rightStroke2;

            js.append(String.format(Locale.US, jsBase + ".rightStroke(%s);", rightStroke2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rightStroke(%s);", rightStroke2));
                js.setLength(0);
            }
        }
    }

    private Stroke rightStroke3;
    private String rightStroke4;
    private Double thickness2;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    public void setRightstroke(Stroke rightStroke3, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.rightStroke = null;
            this.rightStroke1 = null;
            this.rightStroke2 = null;
            this.rightStroke3 = null;
            this.rightStroke4 = null;
            
            this.rightStroke3 = rightStroke3;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.rightStroke3 = rightStroke3;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

            js.append(String.format(Locale.US, jsBase + ".rightStroke(%s, %f, %s, %s, %s);", (rightStroke3 != null) ? rightStroke3.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rightStroke(%s, %f, %s, %s, %s);", (rightStroke3 != null) ? rightStroke3.generateJs() : "null", thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setRightstroke(String rightStroke4, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.rightStroke = null;
            this.rightStroke1 = null;
            this.rightStroke2 = null;
            this.rightStroke3 = null;
            this.rightStroke4 = null;
            
            this.rightStroke4 = rightStroke4;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.rightStroke4 = rightStroke4;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

            js.append(String.format(Locale.US, jsBase + ".rightStroke(%s, %f, %s, %s, %s);", rightStroke4, thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rightStroke(%s, %f, %s, %s, %s);", rightStroke4, thickness2, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;

    public void setStroke(Stroke stroke) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke = stroke;
        } else {
            this.stroke = stroke;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s);", (stroke != null) ? stroke.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", (stroke != null) ? stroke.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(ColoredFill stroke1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke1 = stroke1;
        } else {
            this.stroke1 = stroke1;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s);", (stroke1 != null) ? stroke1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", (stroke1 != null) ? stroke1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(String stroke2) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke2 = stroke2;
        } else {
            this.stroke2 = stroke2;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s);", stroke2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", stroke2));
                js.setLength(0);
            }
        }
    }

    private Stroke stroke3;
    private String stroke4;
    private Double thickness3;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;

    public void setStroke(Stroke stroke3, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            
            this.stroke3 = stroke3;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.stroke3 = stroke3;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (stroke3 != null) ? stroke3.generateJs() : "null", thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (stroke3 != null) ? stroke3.generateJs() : "null", thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(String stroke4, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            this.stroke3 = null;
            this.stroke4 = null;
            
            this.stroke4 = stroke4;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.stroke4 = stroke4;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", stroke4, thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", stroke4, thickness3, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private UiTitle getTitle;

    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle(jsBase + ".title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;
    private String title2;

    public void setTitle(Boolean title) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title = title;
        } else {
            this.title = title;

            js.append(String.format(Locale.US, jsBase + ".title(%b);", title));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%b);", title));
                js.setLength(0);
            }
        }
    }


    public void setTitle(String title1) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            this.title2 = null;
            
            this.title1 = title1;
        } else {
            this.title1 = title1;

            js.append(String.format(Locale.US, jsBase + ".title(%s);", title1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".title(%s);", title1));
                js.setLength(0);
            }
        }
    }

    private Stroke topStroke;
    private ColoredFill topStroke1;
    private String topStroke2;

    public void setTopstroke(Stroke topStroke) {
        if (jsBase == null) {
            this.topStroke = null;
            this.topStroke1 = null;
            this.topStroke2 = null;
            
            this.topStroke = topStroke;
        } else {
            this.topStroke = topStroke;

            js.append(String.format(Locale.US, jsBase + ".topStroke(%s);", (topStroke != null) ? topStroke.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".topStroke(%s);", (topStroke != null) ? topStroke.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTopstroke(ColoredFill topStroke1) {
        if (jsBase == null) {
            this.topStroke = null;
            this.topStroke1 = null;
            this.topStroke2 = null;
            
            this.topStroke1 = topStroke1;
        } else {
            this.topStroke1 = topStroke1;

            js.append(String.format(Locale.US, jsBase + ".topStroke(%s);", (topStroke1 != null) ? topStroke1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".topStroke(%s);", (topStroke1 != null) ? topStroke1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTopstroke(String topStroke2) {
        if (jsBase == null) {
            this.topStroke = null;
            this.topStroke1 = null;
            this.topStroke2 = null;
            
            this.topStroke2 = topStroke2;
        } else {
            this.topStroke2 = topStroke2;

            js.append(String.format(Locale.US, jsBase + ".topStroke(%s);", topStroke2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".topStroke(%s);", topStroke2));
                js.setLength(0);
            }
        }
    }

    private Stroke topStroke3;
    private String topStroke4;
    private Double thickness4;
    private String dashpattern4;
    private StrokeLineJoin lineJoin4;
    private StrokeLineCap lineCap4;

    public void setTopstroke(Stroke topStroke3, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.topStroke = null;
            this.topStroke1 = null;
            this.topStroke2 = null;
            this.topStroke3 = null;
            this.topStroke4 = null;
            
            this.topStroke3 = topStroke3;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.topStroke3 = topStroke3;
            this.thickness4 = thickness4;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;

            js.append(String.format(Locale.US, jsBase + ".topStroke(%s, %f, %s, %s, %s);", (topStroke3 != null) ? topStroke3.generateJs() : "null", thickness4, dashpattern4, (lineJoin4 != null) ? lineJoin4.generateJs() : "null", (lineCap4 != null) ? lineCap4.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".topStroke(%s, %f, %s, %s, %s);", (topStroke3 != null) ? topStroke3.generateJs() : "null", thickness4, dashpattern4, (lineJoin4 != null) ? lineJoin4.generateJs() : "null", (lineCap4 != null) ? lineCap4.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setTopstroke(String topStroke4, Double thickness4, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.topStroke = null;
            this.topStroke1 = null;
            this.topStroke2 = null;
            this.topStroke3 = null;
            this.topStroke4 = null;
            
            this.topStroke4 = topStroke4;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.topStroke4 = topStroke4;
            this.thickness4 = thickness4;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;

            js.append(String.format(Locale.US, jsBase + ".topStroke(%s, %f, %s, %s, %s);", topStroke4, thickness4, dashpattern4, (lineJoin4 != null) ? lineJoin4.generateJs() : "null", (lineCap4 != null) ? lineCap4.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".topStroke(%s, %f, %s, %s, %s);", topStroke4, thickness4, dashpattern4, (lineJoin4 != null) ? lineJoin4.generateJs() : "null", (lineCap4 != null) ? lineCap4.generateJs() : "null"));
                js.setLength(0);
            }
        }
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

    private String generateJSgetTitle() {
        if (getTitle != null) {
            return getTitle.generateJs();
        }
        return "";
    }

    private String generateJSbottomStroke() {
        if (bottomStroke != null) {
            return String.format(Locale.US, "bottomStroke: %s,", (bottomStroke != null) ? bottomStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbottomStroke1() {
        if (bottomStroke1 != null) {
            return String.format(Locale.US, "bottomStroke: %s,", (bottomStroke1 != null) ? bottomStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbottomStroke2() {
        if (bottomStroke2 != null) {
            return String.format(Locale.US, "bottomStroke: %s,", bottomStroke2);
        }
        return "";
    }

    private String generateJSbottomStroke3() {
        if (bottomStroke3 != null) {
            return String.format(Locale.US, "bottomStroke: %s,", (bottomStroke3 != null) ? bottomStroke3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbottomStroke4() {
        if (bottomStroke4 != null) {
            return String.format(Locale.US, "bottomStroke: %s,", bottomStroke4);
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

    private String generateJScornerType() {
        if (cornerType != null) {
            return String.format(Locale.US, "cornerType: %s,", (cornerType != null) ? cornerType.generateJs() : "null");
        }
        return "";
    }

    private String generateJScorners() {
        if (corners != null) {
            return String.format(Locale.US, "corners: %f,", corners);
        }
        return "";
    }

    private String generateJScorners1() {
        if (corners1 != null) {
            return String.format(Locale.US, "corners: %s,", corners1);
        }
        return "";
    }

    private String generateJScorners2() {
        if (corners2 != null) {
            return String.format(Locale.US, "corners: %s,", Arrays.toString(corners2));
        }
        return "";
    }

    private String generateJStopLeft() {
        if (topLeft != null) {
            return String.format(Locale.US, "topLeft: %f,", topLeft);
        }
        return "";
    }

    private String generateJStopLeft1() {
        if (topLeft1 != null) {
            return String.format(Locale.US, "topLeft: %s,", topLeft1);
        }
        return "";
    }

    private String generateJStopRight() {
        if (topRight != null) {
            return String.format(Locale.US, "topRight: %f,", topRight);
        }
        return "";
    }

    private String generateJStopRight1() {
        if (topRight1 != null) {
            return String.format(Locale.US, "topRight: %s,", topRight1);
        }
        return "";
    }

    private String generateJSbottomRight() {
        if (bottomRight != null) {
            return String.format(Locale.US, "bottomRight: %f,", bottomRight);
        }
        return "";
    }

    private String generateJSbottomRight1() {
        if (bottomRight1 != null) {
            return String.format(Locale.US, "bottomRight: %s,", bottomRight1);
        }
        return "";
    }

    private String generateJSbottomLeft() {
        if (bottomLeft != null) {
            return String.format(Locale.US, "bottomLeft: %f,", bottomLeft);
        }
        return "";
    }

    private String generateJSbottomLeft1() {
        if (bottomLeft1 != null) {
            return String.format(Locale.US, "bottomLeft: %s,", bottomLeft1);
        }
        return "";
    }

    private String generateJSfill() {
        if (fill != null) {
            return String.format(Locale.US, "fill: %s,", (fill != null) ? fill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
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

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %s,", index);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSlabel() {
        if (label != null) {
            return String.format(Locale.US, "label: %b,", label);
        }
        return "";
    }

    private String generateJSlabel1() {
        if (label1 != null) {
            return String.format(Locale.US, "label: %s,", label1);
        }
        return "";
    }

    private String generateJSlabel2() {
        if (label2 != null) {
            return String.format(Locale.US, "label: %s,", label2);
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %s,", index2);
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
        }
        return "";
    }

    private String generateJSlabel3() {
        if (label3 != null) {
            return String.format(Locale.US, "label: %b,", label3);
        }
        return "";
    }

    private String generateJSlabel4() {
        if (label4 != null) {
            return String.format(Locale.US, "label: %s,", label4);
        }
        return "";
    }

    private String generateJSlabel5() {
        if (label5 != null) {
            return String.format(Locale.US, "label: %s,", label5);
        }
        return "";
    }

    private String generateJSleftStroke() {
        if (leftStroke != null) {
            return String.format(Locale.US, "leftStroke: %s,", (leftStroke != null) ? leftStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSleftStroke1() {
        if (leftStroke1 != null) {
            return String.format(Locale.US, "leftStroke: %s,", leftStroke1);
        }
        return "";
    }

    private String generateJSleftStroke2() {
        if (leftStroke2 != null) {
            return String.format(Locale.US, "leftStroke: %s,", (leftStroke2 != null) ? leftStroke2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSleftStroke3() {
        if (leftStroke3 != null) {
            return String.format(Locale.US, "leftStroke: %s,", leftStroke3);
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

    private String generateJSmargin() {
        if (margin != null) {
            return String.format(Locale.US, "margin: %s,", Arrays.toString(margin));
        }
        return "";
    }

    private String generateJSmargin1() {
        if (margin1 != null) {
            return String.format(Locale.US, "margin: %s,", Arrays.toString(margin1));
        }
        return "";
    }

    private String generateJSmargin2() {
        if (margin2 != null) {
            return String.format(Locale.US, "margin: %s,", margin2);
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

    private String generateJSpadding() {
        if (padding != null) {
            return String.format(Locale.US, "padding: %s,", Arrays.toString(padding));
        }
        return "";
    }

    private String generateJSpadding1() {
        if (padding1 != null) {
            return String.format(Locale.US, "padding: %s,", Arrays.toString(padding1));
        }
        return "";
    }

    private String generateJSpadding2() {
        if (padding2 != null) {
            return String.format(Locale.US, "padding: %s,", padding2);
        }
        return "";
    }

    private String generateJSvalue8() {
        if (value8 != null) {
            return String.format(Locale.US, "value: %s,", value8);
        }
        return "";
    }

    private String generateJSvalue9() {
        if (value9 != null) {
            return String.format(Locale.US, "value: %f,", value9);
        }
        return "";
    }

    private String generateJSvalue10() {
        if (value10 != null) {
            return String.format(Locale.US, "value: %s,", value10);
        }
        return "";
    }

    private String generateJSvalue11() {
        if (value11 != null) {
            return String.format(Locale.US, "value: %f,", value11);
        }
        return "";
    }

    private String generateJSvalue12() {
        if (value12 != null) {
            return String.format(Locale.US, "value: %s,", value12);
        }
        return "";
    }

    private String generateJSvalue13() {
        if (value13 != null) {
            return String.format(Locale.US, "value: %f,", value13);
        }
        return "";
    }

    private String generateJSvalue14() {
        if (value14 != null) {
            return String.format(Locale.US, "value: %s,", value14);
        }
        return "";
    }

    private String generateJSvalue15() {
        if (value15 != null) {
            return String.format(Locale.US, "value: %f,", value15);
        }
        return "";
    }

    private String generateJSrightStroke() {
        if (rightStroke != null) {
            return String.format(Locale.US, "rightStroke: %s,", (rightStroke != null) ? rightStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrightStroke1() {
        if (rightStroke1 != null) {
            return String.format(Locale.US, "rightStroke: %s,", (rightStroke1 != null) ? rightStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrightStroke2() {
        if (rightStroke2 != null) {
            return String.format(Locale.US, "rightStroke: %s,", rightStroke2);
        }
        return "";
    }

    private String generateJSrightStroke3() {
        if (rightStroke3 != null) {
            return String.format(Locale.US, "rightStroke: %s,", (rightStroke3 != null) ? rightStroke3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrightStroke4() {
        if (rightStroke4 != null) {
            return String.format(Locale.US, "rightStroke: %s,", rightStroke4);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
        }
        return "";
    }

    private String generateJSdashpattern2() {
        if (dashpattern2 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern2);
        }
        return "";
    }

    private String generateJSlineJoin2() {
        if (lineJoin2 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin2 != null) ? lineJoin2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap2() {
        if (lineCap2 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap2 != null) ? lineCap2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke() {
        if (stroke != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke != null) ? stroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke1() {
        if (stroke1 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke1 != null) ? stroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke2() {
        if (stroke2 != null) {
            return String.format(Locale.US, "stroke: %s,", stroke2);
        }
        return "";
    }

    private String generateJSstroke3() {
        if (stroke3 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke3 != null) ? stroke3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke4() {
        if (stroke4 != null) {
            return String.format(Locale.US, "stroke: %s,", stroke4);
        }
        return "";
    }

    private String generateJSthickness3() {
        if (thickness3 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness3);
        }
        return "";
    }

    private String generateJSdashpattern3() {
        if (dashpattern3 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern3);
        }
        return "";
    }

    private String generateJSlineJoin3() {
        if (lineJoin3 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin3 != null) ? lineJoin3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap3() {
        if (lineCap3 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap3 != null) ? lineCap3.generateJs() : "null");
        }
        return "";
    }

    private String generateJStitle() {
        if (title != null) {
            return String.format(Locale.US, "title: %b,", title);
        }
        return "";
    }

    private String generateJStitle1() {
        if (title1 != null) {
            return String.format(Locale.US, "title: %s,", title1);
        }
        return "";
    }

    private String generateJStitle2() {
        if (title2 != null) {
            return String.format(Locale.US, "title: %s,", title2);
        }
        return "";
    }

    private String generateJStopStroke() {
        if (topStroke != null) {
            return String.format(Locale.US, "topStroke: %s,", (topStroke != null) ? topStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJStopStroke1() {
        if (topStroke1 != null) {
            return String.format(Locale.US, "topStroke: %s,", (topStroke1 != null) ? topStroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJStopStroke2() {
        if (topStroke2 != null) {
            return String.format(Locale.US, "topStroke: %s,", topStroke2);
        }
        return "";
    }

    private String generateJStopStroke3() {
        if (topStroke3 != null) {
            return String.format(Locale.US, "topStroke: %s,", (topStroke3 != null) ? topStroke3.generateJs() : "null");
        }
        return "";
    }

    private String generateJStopStroke4() {
        if (topStroke4 != null) {
            return String.format(Locale.US, "topStroke: %s,", topStroke4);
        }
        return "";
    }

    private String generateJSthickness4() {
        if (thickness4 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness4);
        }
        return "";
    }

    private String generateJSdashpattern4() {
        if (dashpattern4 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern4);
        }
        return "";
    }

    private String generateJSlineJoin4() {
        if (lineJoin4 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin4 != null) ? lineJoin4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap4() {
        if (lineCap4 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap4 != null) ? lineCap4.generateJs() : "null");
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSbottomStroke());
            js.append(generateJSbottomStroke1());
            js.append(generateJSbottomStroke2());
            js.append(generateJSbottomStroke3());
            js.append(generateJSbottomStroke4());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJScornerType());
            js.append(generateJScorners());
            js.append(generateJScorners1());
            js.append(generateJScorners2());
            js.append(generateJStopLeft());
            js.append(generateJStopLeft1());
            js.append(generateJStopRight());
            js.append(generateJStopRight1());
            js.append(generateJSbottomRight());
            js.append(generateJSbottomRight1());
            js.append(generateJSbottomLeft());
            js.append(generateJSbottomLeft1());
            js.append(generateJSfill());
            js.append(generateJScolor());
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
            js.append(generateJSindex());
            js.append(generateJSindex1());
            js.append(generateJSlabel());
            js.append(generateJSlabel1());
            js.append(generateJSlabel2());
            js.append(generateJSindex2());
            js.append(generateJSindex3());
            js.append(generateJSlabel3());
            js.append(generateJSlabel4());
            js.append(generateJSlabel5());
            js.append(generateJSleftStroke());
            js.append(generateJSleftStroke1());
            js.append(generateJSleftStroke2());
            js.append(generateJSleftStroke3());
            js.append(generateJSthickness1());
            js.append(generateJSdashpattern1());
            js.append(generateJSlineJoin1());
            js.append(generateJSlineCap1());
            js.append(generateJSmargin());
            js.append(generateJSmargin1());
            js.append(generateJSmargin2());
            js.append(generateJSvalue());
            js.append(generateJSvalue1());
            js.append(generateJSvalue2());
            js.append(generateJSvalue3());
            js.append(generateJSvalue4());
            js.append(generateJSvalue5());
            js.append(generateJSvalue6());
            js.append(generateJSvalue7());
            js.append(generateJSpadding());
            js.append(generateJSpadding1());
            js.append(generateJSpadding2());
            js.append(generateJSvalue8());
            js.append(generateJSvalue9());
            js.append(generateJSvalue10());
            js.append(generateJSvalue11());
            js.append(generateJSvalue12());
            js.append(generateJSvalue13());
            js.append(generateJSvalue14());
            js.append(generateJSvalue15());
            js.append(generateJSrightStroke());
            js.append(generateJSrightStroke1());
            js.append(generateJSrightStroke2());
            js.append(generateJSrightStroke3());
            js.append(generateJSrightStroke4());
            js.append(generateJSthickness2());
            js.append(generateJSdashpattern2());
            js.append(generateJSlineJoin2());
            js.append(generateJSlineCap2());
            js.append(generateJSstroke());
            js.append(generateJSstroke1());
            js.append(generateJSstroke2());
            js.append(generateJSstroke3());
            js.append(generateJSstroke4());
            js.append(generateJSthickness3());
            js.append(generateJSdashpattern3());
            js.append(generateJSlineJoin3());
            js.append(generateJSlineCap3());
            js.append(generateJStitle());
            js.append(generateJStitle1());
            js.append(generateJStitle2());
            js.append(generateJStopStroke());
            js.append(generateJStopStroke1());
            js.append(generateJStopStroke2());
            js.append(generateJStopStroke3());
            js.append(generateJStopStroke4());
            js.append(generateJSthickness4());
            js.append(generateJSdashpattern4());
            js.append(generateJSlineJoin4());
            js.append(generateJSlineCap4());
            js.append("}");
        }
            js.append(generateJSgetMargin());
            js.append(generateJSgetPadding());
            js.append(generateJSgetTitle());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}