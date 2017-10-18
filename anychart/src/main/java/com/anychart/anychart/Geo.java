package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Geo extends CoreBase {

    public Geo() {

    }

    protected Geo(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Geo(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Double x;
    private Double y;

    public Geo extendDataRange(Double x, Double y) {
        if (jsBase == null) {
            this.x = x;
            this.y = y;
        } else {
            this.x = x;
            this.y = y;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".extendDataRange(%f, %f)", x, y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".extendDataRange(%f, %f)", x, y));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double gap;

    public Geo setGap(Double gap) {
        if (jsBase == null) {
            this.gap = gap;
        } else {
            this.gap = gap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".gap(%f)", gap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".gap(%f)", gap));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxTicksCount;

    public Geo setMaxTicksCount(Double maxTicksCount) {
        if (jsBase == null) {
            this.maxTicksCount = maxTicksCount;
        } else {
            this.maxTicksCount = maxTicksCount;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxTicksCount(%f)", maxTicksCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxTicksCount(%f)", maxTicksCount));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maximumX;

    public Geo setMaximumX(Double maximumX) {
        if (jsBase == null) {
            this.maximumX = maximumX;
        } else {
            this.maximumX = maximumX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maximumX(%f)", maximumX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maximumX(%f)", maximumX));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maximumY;

    public Geo setMaximumY(Double maximumY) {
        if (jsBase == null) {
            this.maximumY = maximumY;
        } else {
            this.maximumY = maximumY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maximumY(%f)", maximumY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maximumY(%f)", maximumY));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minimumX;

    public Geo setMinimumX(Double minimumX) {
        if (jsBase == null) {
            this.minimumX = minimumX;
        } else {
            this.minimumX = minimumX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minimumX(%f)", minimumX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minimumX(%f)", minimumX));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minimumY;

    public Geo setMinimumY(Double minimumY) {
        if (jsBase == null) {
            this.minimumY = minimumY;
        } else {
            this.minimumY = minimumY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minimumY(%f)", minimumY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minimumY(%f)", minimumY));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double[] precision;

    public Geo setPrecision(Double[] precision) {
        if (jsBase == null) {
            this.precision = precision;
        } else {
            this.precision = precision;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".precision(%s)", Arrays.toString(precision)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".precision(%s)", Arrays.toString(precision)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double xPrecision;
    private Double yPrecision;

    public Geo setPrecision(Double xPrecision, Double yPrecision) {
        if (jsBase == null) {
            this.xPrecision = xPrecision;
            this.yPrecision = yPrecision;
        } else {
            this.xPrecision = xPrecision;
            this.yPrecision = yPrecision;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".precision(%f, %f)", xPrecision, yPrecision));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".precision(%f, %f)", xPrecision, yPrecision));
                js.setLength(0);
            }
        }
        return this;
    }

    private GeoTicks getXMinorTicks;

    public GeoTicks getXMinorTicks() {
        if (getXMinorTicks == null)
            getXMinorTicks = new GeoTicks(jsBase + ".xMinorTicks()");

        return getXMinorTicks;
    }

    private String xMinorTicks;
    private String[] xMinorTicks1;

    public Geo setXMinorTicks(String xMinorTicks) {
        if (jsBase == null) {
            this.xMinorTicks = null;
            this.xMinorTicks1 = null;
            
            this.xMinorTicks = xMinorTicks;
        } else {
            this.xMinorTicks = xMinorTicks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xMinorTicks(%s)", xMinorTicks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xMinorTicks(%s)", xMinorTicks));
                js.setLength(0);
            }
        }
        return this;
    }


    public Geo setXMinorTicks(String[] xMinorTicks1) {
        if (jsBase == null) {
            this.xMinorTicks = null;
            this.xMinorTicks1 = null;
            
            this.xMinorTicks1 = xMinorTicks1;
        } else {
            this.xMinorTicks1 = xMinorTicks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xMinorTicks(%s)", Arrays.toString(xMinorTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xMinorTicks(%s)", Arrays.toString(xMinorTicks1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GeoTicks getXTicks;

    public GeoTicks getXTicks() {
        if (getXTicks == null)
            getXTicks = new GeoTicks(jsBase + ".xTicks()");

        return getXTicks;
    }

    private String xTicks;
    private String[] xTicks1;

    public Geo setXTicks(String xTicks) {
        if (jsBase == null) {
            this.xTicks = null;
            this.xTicks1 = null;
            
            this.xTicks = xTicks;
        } else {
            this.xTicks = xTicks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xTicks(%s)", xTicks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xTicks(%s)", xTicks));
                js.setLength(0);
            }
        }
        return this;
    }


    public Geo setXTicks(String[] xTicks1) {
        if (jsBase == null) {
            this.xTicks = null;
            this.xTicks1 = null;
            
            this.xTicks1 = xTicks1;
        } else {
            this.xTicks1 = xTicks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".xTicks(%s)", Arrays.toString(xTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".xTicks(%s)", Arrays.toString(xTicks1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GeoTicks getYMinorTicks;

    public GeoTicks getYMinorTicks() {
        if (getYMinorTicks == null)
            getYMinorTicks = new GeoTicks(jsBase + ".yMinorTicks()");

        return getYMinorTicks;
    }

    private String yMinorTicks;
    private String[] yMinorTicks1;

    public Geo setYMinorTicks(String yMinorTicks) {
        if (jsBase == null) {
            this.yMinorTicks = null;
            this.yMinorTicks1 = null;
            
            this.yMinorTicks = yMinorTicks;
        } else {
            this.yMinorTicks = yMinorTicks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".yMinorTicks(%s)", yMinorTicks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yMinorTicks(%s)", yMinorTicks));
                js.setLength(0);
            }
        }
        return this;
    }


    public Geo setYMinorTicks(String[] yMinorTicks1) {
        if (jsBase == null) {
            this.yMinorTicks = null;
            this.yMinorTicks1 = null;
            
            this.yMinorTicks1 = yMinorTicks1;
        } else {
            this.yMinorTicks1 = yMinorTicks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".yMinorTicks(%s)", Arrays.toString(yMinorTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yMinorTicks(%s)", Arrays.toString(yMinorTicks1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GeoTicks getYTicks;

    public GeoTicks getYTicks() {
        if (getYTicks == null)
            getYTicks = new GeoTicks(jsBase + ".yTicks()");

        return getYTicks;
    }

    private String yTicks;
    private String[] yTicks1;

    public Geo setYTicks(String yTicks) {
        if (jsBase == null) {
            this.yTicks = null;
            this.yTicks1 = null;
            
            this.yTicks = yTicks;
        } else {
            this.yTicks = yTicks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".yTicks(%s)", yTicks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yTicks(%s)", yTicks));
                js.setLength(0);
            }
        }
        return this;
    }


    public Geo setYTicks(String[] yTicks1) {
        if (jsBase == null) {
            this.yTicks = null;
            this.yTicks1 = null;
            
            this.yTicks1 = yTicks1;
        } else {
            this.yTicks1 = yTicks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".yTicks(%s)", Arrays.toString(yTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".yTicks(%s)", Arrays.toString(yTicks1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetXMinorTicks() {
        if (getXMinorTicks != null) {
            return getXMinorTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetXTicks() {
        if (getXTicks != null) {
            return getXTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetYMinorTicks() {
        if (getYMinorTicks != null) {
            return getYMinorTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetYTicks() {
        if (getYTicks != null) {
            return getYTicks.generateJs();
        }
        return "";
    }

    private String generateJSx() {
        if (x != null) {
            return String.format(Locale.US, "x: %f,", x);
        }
        return "";
    }

    private String generateJSy() {
        if (y != null) {
            return String.format(Locale.US, "y: %f,", y);
        }
        return "";
    }

    private String generateJSgap() {
        if (gap != null) {
            return String.format(Locale.US, "gap: %f,", gap);
        }
        return "";
    }

    private String generateJSmaxTicksCount() {
        if (maxTicksCount != null) {
            return String.format(Locale.US, "maxTicksCount: %f,", maxTicksCount);
        }
        return "";
    }

    private String generateJSmaximumX() {
        if (maximumX != null) {
            return String.format(Locale.US, "maximumX: %f,", maximumX);
        }
        return "";
    }

    private String generateJSmaximumY() {
        if (maximumY != null) {
            return String.format(Locale.US, "maximumY: %f,", maximumY);
        }
        return "";
    }

    private String generateJSminimumX() {
        if (minimumX != null) {
            return String.format(Locale.US, "minimumX: %f,", minimumX);
        }
        return "";
    }

    private String generateJSminimumY() {
        if (minimumY != null) {
            return String.format(Locale.US, "minimumY: %f,", minimumY);
        }
        return "";
    }

    private String generateJSprecision() {
        if (precision != null) {
            return String.format(Locale.US, "precision: %s,", Arrays.toString(precision));
        }
        return "";
    }

    private String generateJSxPrecision() {
        if (xPrecision != null) {
            return String.format(Locale.US, "xPrecision: %f,", xPrecision);
        }
        return "";
    }

    private String generateJSyPrecision() {
        if (yPrecision != null) {
            return String.format(Locale.US, "yPrecision: %f,", yPrecision);
        }
        return "";
    }

    private String generateJSxMinorTicks() {
        if (xMinorTicks != null) {
            return String.format(Locale.US, "xMinorTicks: %s,", xMinorTicks);
        }
        return "";
    }

    private String generateJSxMinorTicks1() {
        if (xMinorTicks1 != null) {
            return String.format(Locale.US, "xMinorTicks: %s,", Arrays.toString(xMinorTicks1));
        }
        return "";
    }

    private String generateJSxTicks() {
        if (xTicks != null) {
            return String.format(Locale.US, "xTicks: %s,", xTicks);
        }
        return "";
    }

    private String generateJSxTicks1() {
        if (xTicks1 != null) {
            return String.format(Locale.US, "xTicks: %s,", Arrays.toString(xTicks1));
        }
        return "";
    }

    private String generateJSyMinorTicks() {
        if (yMinorTicks != null) {
            return String.format(Locale.US, "yMinorTicks: %s,", yMinorTicks);
        }
        return "";
    }

    private String generateJSyMinorTicks1() {
        if (yMinorTicks1 != null) {
            return String.format(Locale.US, "yMinorTicks: %s,", Arrays.toString(yMinorTicks1));
        }
        return "";
    }

    private String generateJSyTicks() {
        if (yTicks != null) {
            return String.format(Locale.US, "yTicks: %s,", yTicks);
        }
        return "";
    }

    private String generateJSyTicks1() {
        if (yTicks1 != null) {
            return String.format(Locale.US, "yTicks: %s,", Arrays.toString(yTicks1));
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetXMinorTicks());
        jsGetters.append(generateJSgetXTicks());
        jsGetters.append(generateJSgetYMinorTicks());
        jsGetters.append(generateJSgetYTicks());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSx());
            js.append(generateJSy());
            js.append(generateJSgap());
            js.append(generateJSmaxTicksCount());
            js.append(generateJSmaximumX());
            js.append(generateJSmaximumY());
            js.append(generateJSminimumX());
            js.append(generateJSminimumY());
            js.append(generateJSprecision());
            js.append(generateJSxPrecision());
            js.append(generateJSyPrecision());
            js.append(generateJSxMinorTicks());
            js.append(generateJSxMinorTicks1());
            js.append(generateJSxTicks());
            js.append(generateJSxTicks1());
            js.append(generateJSyMinorTicks());
            js.append(generateJSyMinorTicks1());
            js.append(generateJSyTicks());
            js.append(generateJSyTicks1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}