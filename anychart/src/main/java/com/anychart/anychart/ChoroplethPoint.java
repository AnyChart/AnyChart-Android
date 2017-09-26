package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class ChoroplethPoint extends JsObject {

    private String jsBase;

    public ChoroplethPoint() {

    }

    protected ChoroplethPoint(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String crs;

    public void setCrs(String crs) {
        if (jsBase == null) {
            this.crs = crs;
        } else {
            this.crs = crs;

            js.append(String.format(Locale.US, jsBase + ".crs(%s);", crs));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".crs(%s);", crs));
                js.setLength(0);
            }
        }
    }

    private String field;

    public void setGet(String field) {
        if (jsBase == null) {
            this.field = field;
        } else {
            this.field = field;

            js.append(String.format(Locale.US, jsBase + ".get(%s);", field));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%s);", field));
                js.setLength(0);
            }
        }
    }

    private SeparateChart getgetChart;

    public SeparateChart getGetchart() {
        if (getgetChart == null)
            getgetChart = new SeparateChart(jsBase + ".getChart()");

        return getgetChart;
    }

    private AnychartMathRect getgetFeatureBounds;

    public AnychartMathRect getGetfeaturebounds() {
        if (getgetFeatureBounds == null)
            getgetFeatureBounds = new AnychartMathRect(jsBase + ".getFeatureBounds()");

        return getgetFeatureBounds;
    }

    private AnychartSeriesBase getgetSeries;

    public AnychartSeriesBase getGetseries() {
        if (getgetSeries == null)
            getgetSeries = new AnychartSeriesBase(jsBase + ".getSeries()");

        return getgetSeries;
    }

    private String key;
    private Statistics key1;

    public void setGetstat(String key) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".getStat(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s);", key));
                js.setLength(0);
            }
        }
    }


    public void setGetstat(Statistics key1) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            
            this.key1 = key1;
        } else {
            this.key1 = key1;

            js.append(String.format(Locale.US, jsBase + ".getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Boolean hovered;

    public void setHovered(Boolean hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;

            js.append(String.format(Locale.US, jsBase + ".hovered(%b);", hovered));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hovered(%b);", hovered));
                js.setLength(0);
            }
        }
    }

    private Double middleX;

    public void setMiddlex(Double middleX) {
        if (jsBase == null) {
            this.middleX = middleX;
        } else {
            this.middleX = middleX;

            js.append(String.format(Locale.US, jsBase + ".middleX(%f);", middleX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".middleX(%f);", middleX));
                js.setLength(0);
            }
        }
    }

    private Double middleY;

    public void setMiddley(Double middleY) {
        if (jsBase == null) {
            this.middleY = middleY;
        } else {
            this.middleY = middleY;

            js.append(String.format(Locale.US, jsBase + ".middleY(%f);", middleY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".middleY(%f);", middleY));
                js.setLength(0);
            }
        }
    }

    private Double scale;

    public void setScalefactor(Double scale) {
        if (jsBase == null) {
            this.scale = scale;
        } else {
            this.scale = scale;

            js.append(String.format(Locale.US, jsBase + ".scaleFactor(%f);", scale));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scaleFactor(%f);", scale));
                js.setLength(0);
            }
        }
    }

    private Boolean selected;

    public void setSelected(Boolean selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;

            js.append(String.format(Locale.US, jsBase + ".selected(%b);", selected));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selected(%b);", selected));
                js.setLength(0);
            }
        }
    }

    private String field1;

    public void setSet(String field1) {
        if (jsBase == null) {
            this.field = null;
            this.field1 = null;
            
            this.field1 = field1;
        } else {
            this.field1 = field1;

            js.append(String.format(Locale.US, jsBase + ".set(%s);", field1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".set(%s);", field1));
                js.setLength(0);
            }
        }
    }

    private Double dx;
    private Double dy;

    public void setTranslate(Double dx, Double dy) {
        if (jsBase == null) {
            this.dx = dx;
            this.dy = dy;
        } else {
            this.dx = dx;
            this.dy = dy;

            js.append(String.format(Locale.US, jsBase + ".translate(%f, %f);", dx, dy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".translate(%f, %f);", dx, dy));
                js.setLength(0);
            }
        }
    }

    private Double dx1;
    private Double dy1;

    public void setTranslation(Double dx1, Double dy1) {
        if (jsBase == null) {
            this.dx = null;
            this.dx1 = null;
            
            this.dx1 = dx1;
            this.dy = null;
            this.dy1 = null;
            
            this.dy1 = dy1;
        } else {
            this.dx1 = dx1;
            this.dy1 = dy1;

            js.append(String.format(Locale.US, jsBase + ".translation(%f, %f);", dx1, dy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".translation(%f, %f);", dx1, dy1));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetgetChart() {
        if (getgetChart != null) {
            return getgetChart.generateJs();
        }
        return "";
    }

    private String generateJSgetgetFeatureBounds() {
        if (getgetFeatureBounds != null) {
            return getgetFeatureBounds.generateJs();
        }
        return "";
    }

    private String generateJSgetgetSeries() {
        if (getgetSeries != null) {
            return getgetSeries.generateJs();
        }
        return "";
    }

    private String generateJScrs() {
        if (crs != null) {
            return String.format(Locale.US, "crs: %s,", crs);
        }
        return "";
    }

    private String generateJSfield() {
        if (field != null) {
            return String.format(Locale.US, "field: %s,", field);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSkey1() {
        if (key1 != null) {
            return String.format(Locale.US, "key: %s,", (key1 != null) ? key1.generateJs() : "null");
        }
        return "";
    }

    private String generateJShovered() {
        if (hovered != null) {
            return String.format(Locale.US, "hovered: %b,", hovered);
        }
        return "";
    }

    private String generateJSmiddleX() {
        if (middleX != null) {
            return String.format(Locale.US, "middleX: %f,", middleX);
        }
        return "";
    }

    private String generateJSmiddleY() {
        if (middleY != null) {
            return String.format(Locale.US, "middleY: %f,", middleY);
        }
        return "";
    }

    private String generateJSscale() {
        if (scale != null) {
            return String.format(Locale.US, "scale: %f,", scale);
        }
        return "";
    }

    private String generateJSselected() {
        if (selected != null) {
            return String.format(Locale.US, "selected: %b,", selected);
        }
        return "";
    }

    private String generateJSfield1() {
        if (field1 != null) {
            return String.format(Locale.US, "field: %s,", field1);
        }
        return "";
    }

    private String generateJSdx() {
        if (dx != null) {
            return String.format(Locale.US, "dx: %f,", dx);
        }
        return "";
    }

    private String generateJSdy() {
        if (dy != null) {
            return String.format(Locale.US, "dy: %f,", dy);
        }
        return "";
    }

    private String generateJSdx1() {
        if (dx1 != null) {
            return String.format(Locale.US, "dx: %f,", dx1);
        }
        return "";
    }

    private String generateJSdy1() {
        if (dy1 != null) {
            return String.format(Locale.US, "dy: %f,", dy1);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJScrs());
            js.append(generateJSfield());
            js.append(generateJSkey());
            js.append(generateJSkey1());
            js.append(generateJShovered());
            js.append(generateJSmiddleX());
            js.append(generateJSmiddleY());
            js.append(generateJSscale());
            js.append(generateJSselected());
            js.append(generateJSfield1());
            js.append(generateJSdx());
            js.append(generateJSdy());
            js.append(generateJSdx1());
            js.append(generateJSdy1());
            js.append("}");
        }
            js.append(generateJSgetgetChart());
            js.append(generateJSgetgetFeatureBounds());
            js.append(generateJSgetgetSeries());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}