package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Geo extends JsObject {

    private String jsBase;

    public Geo() {

    }

    protected Geo(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double x;
    private Double y;

    public void setExtenddatarange(Double x, Double y) {
        if (jsBase == null) {
            this.x = x;
            this.y = y;
        } else {
            this.x = x;
            this.y = y;

            js.append(String.format(Locale.US, jsBase + ".extendDataRange(%f, %f);", x, y));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".extendDataRange(%f, %f);", x, y));
                js.setLength(0);
            }
        }
    }

    private Double gap;

    public void setGap(Double gap) {
        if (jsBase == null) {
            this.gap = gap;
        } else {
            this.gap = gap;

            js.append(String.format(Locale.US, jsBase + ".gap(%f);", gap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".gap(%f);", gap));
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

    private Double maxTicksCount;

    public void setMaxtickscount(Double maxTicksCount) {
        if (jsBase == null) {
            this.maxTicksCount = maxTicksCount;
        } else {
            this.maxTicksCount = maxTicksCount;

            js.append(String.format(Locale.US, jsBase + ".maxTicksCount(%f);", maxTicksCount));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxTicksCount(%f);", maxTicksCount));
                js.setLength(0);
            }
        }
    }

    private Double maximumX;

    public void setMaximumx(Double maximumX) {
        if (jsBase == null) {
            this.maximumX = maximumX;
        } else {
            this.maximumX = maximumX;

            js.append(String.format(Locale.US, jsBase + ".maximumX(%f);", maximumX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maximumX(%f);", maximumX));
                js.setLength(0);
            }
        }
    }

    private Double maximumY;

    public void setMaximumy(Double maximumY) {
        if (jsBase == null) {
            this.maximumY = maximumY;
        } else {
            this.maximumY = maximumY;

            js.append(String.format(Locale.US, jsBase + ".maximumY(%f);", maximumY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maximumY(%f);", maximumY));
                js.setLength(0);
            }
        }
    }

    private Double minimumX;

    public void setMinimumx(Double minimumX) {
        if (jsBase == null) {
            this.minimumX = minimumX;
        } else {
            this.minimumX = minimumX;

            js.append(String.format(Locale.US, jsBase + ".minimumX(%f);", minimumX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minimumX(%f);", minimumX));
                js.setLength(0);
            }
        }
    }

    private Double minimumY;

    public void setMinimumy(Double minimumY) {
        if (jsBase == null) {
            this.minimumY = minimumY;
        } else {
            this.minimumY = minimumY;

            js.append(String.format(Locale.US, jsBase + ".minimumY(%f);", minimumY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minimumY(%f);", minimumY));
                js.setLength(0);
            }
        }
    }

    private Double[] precision;

    public void setPrecision(Double[] precision) {
        if (jsBase == null) {
            this.precision = precision;
        } else {
            this.precision = precision;

            js.append(String.format(Locale.US, jsBase + ".precision(%s);", Arrays.toString(precision)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".precision(%s);", Arrays.toString(precision)));
                js.setLength(0);
            }
        }
    }

    private Double xPrecision;
    private Double yPrecision;

    public void setPrecision(Double xPrecision, Double yPrecision) {
        if (jsBase == null) {
            this.xPrecision = xPrecision;
            this.yPrecision = yPrecision;
        } else {
            this.xPrecision = xPrecision;
            this.yPrecision = yPrecision;

            js.append(String.format(Locale.US, jsBase + ".precision(%f, %f);", xPrecision, yPrecision));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".precision(%f, %f);", xPrecision, yPrecision));
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

    private GeoTicks getxMinorTicks;

    public GeoTicks getXminorticks() {
        if (getxMinorTicks == null)
            getxMinorTicks = new GeoTicks(jsBase + ".xMinorTicks()");

        return getxMinorTicks;
    }

    private String xMinorTicks;
    private String[] xMinorTicks1;

    public void setXminorticks(String xMinorTicks) {
        if (jsBase == null) {
            this.xMinorTicks = null;
            this.xMinorTicks1 = null;
            
            this.xMinorTicks = xMinorTicks;
        } else {
            this.xMinorTicks = xMinorTicks;

            js.append(String.format(Locale.US, jsBase + ".xMinorTicks(%s);", xMinorTicks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xMinorTicks(%s);", xMinorTicks));
                js.setLength(0);
            }
        }
    }


    public void setXminorticks(String[] xMinorTicks1) {
        if (jsBase == null) {
            this.xMinorTicks = null;
            this.xMinorTicks1 = null;
            
            this.xMinorTicks1 = xMinorTicks1;
        } else {
            this.xMinorTicks1 = xMinorTicks1;

            js.append(String.format(Locale.US, jsBase + ".xMinorTicks(%s);", Arrays.toString(xMinorTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xMinorTicks(%s);", Arrays.toString(xMinorTicks1)));
                js.setLength(0);
            }
        }
    }

    private GeoTicks getxTicks;

    public GeoTicks getXticks() {
        if (getxTicks == null)
            getxTicks = new GeoTicks(jsBase + ".xTicks()");

        return getxTicks;
    }

    private String xTicks;
    private String[] xTicks1;

    public void setXticks(String xTicks) {
        if (jsBase == null) {
            this.xTicks = null;
            this.xTicks1 = null;
            
            this.xTicks = xTicks;
        } else {
            this.xTicks = xTicks;

            js.append(String.format(Locale.US, jsBase + ".xTicks(%s);", xTicks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xTicks(%s);", xTicks));
                js.setLength(0);
            }
        }
    }


    public void setXticks(String[] xTicks1) {
        if (jsBase == null) {
            this.xTicks = null;
            this.xTicks1 = null;
            
            this.xTicks1 = xTicks1;
        } else {
            this.xTicks1 = xTicks1;

            js.append(String.format(Locale.US, jsBase + ".xTicks(%s);", Arrays.toString(xTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".xTicks(%s);", Arrays.toString(xTicks1)));
                js.setLength(0);
            }
        }
    }

    private GeoTicks getyMinorTicks;

    public GeoTicks getYminorticks() {
        if (getyMinorTicks == null)
            getyMinorTicks = new GeoTicks(jsBase + ".yMinorTicks()");

        return getyMinorTicks;
    }

    private String yMinorTicks;
    private String[] yMinorTicks1;

    public void setYminorticks(String yMinorTicks) {
        if (jsBase == null) {
            this.yMinorTicks = null;
            this.yMinorTicks1 = null;
            
            this.yMinorTicks = yMinorTicks;
        } else {
            this.yMinorTicks = yMinorTicks;

            js.append(String.format(Locale.US, jsBase + ".yMinorTicks(%s);", yMinorTicks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yMinorTicks(%s);", yMinorTicks));
                js.setLength(0);
            }
        }
    }


    public void setYminorticks(String[] yMinorTicks1) {
        if (jsBase == null) {
            this.yMinorTicks = null;
            this.yMinorTicks1 = null;
            
            this.yMinorTicks1 = yMinorTicks1;
        } else {
            this.yMinorTicks1 = yMinorTicks1;

            js.append(String.format(Locale.US, jsBase + ".yMinorTicks(%s);", Arrays.toString(yMinorTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yMinorTicks(%s);", Arrays.toString(yMinorTicks1)));
                js.setLength(0);
            }
        }
    }

    private GeoTicks getyTicks;

    public GeoTicks getYticks() {
        if (getyTicks == null)
            getyTicks = new GeoTicks(jsBase + ".yTicks()");

        return getyTicks;
    }

    private String yTicks;
    private String[] yTicks1;

    public void setYticks(String yTicks) {
        if (jsBase == null) {
            this.yTicks = null;
            this.yTicks1 = null;
            
            this.yTicks = yTicks;
        } else {
            this.yTicks = yTicks;

            js.append(String.format(Locale.US, jsBase + ".yTicks(%s);", yTicks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yTicks(%s);", yTicks));
                js.setLength(0);
            }
        }
    }


    public void setYticks(String[] yTicks1) {
        if (jsBase == null) {
            this.yTicks = null;
            this.yTicks1 = null;
            
            this.yTicks1 = yTicks1;
        } else {
            this.yTicks1 = yTicks1;

            js.append(String.format(Locale.US, jsBase + ".yTicks(%s);", Arrays.toString(yTicks1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".yTicks(%s);", Arrays.toString(yTicks1)));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetxMinorTicks() {
        if (getxMinorTicks != null) {
            return getxMinorTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetxTicks() {
        if (getxTicks != null) {
            return getxTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetyMinorTicks() {
        if (getyMinorTicks != null) {
            return getyMinorTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetyTicks() {
        if (getyTicks != null) {
            return getyTicks.generateJs();
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

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
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


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSx());
            js.append(generateJSy());
            js.append(generateJSgap());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSmaxTicksCount());
            js.append(generateJSmaximumX());
            js.append(generateJSmaximumY());
            js.append(generateJSminimumX());
            js.append(generateJSminimumY());
            js.append(generateJSprecision());
            js.append(generateJSxPrecision());
            js.append(generateJSyPrecision());
            js.append(generateJStype2());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
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
            js.append(generateJSgetxMinorTicks());
            js.append(generateJSgetxTicks());
            js.append(generateJSgetyMinorTicks());
            js.append(generateJSgetyTicks());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}