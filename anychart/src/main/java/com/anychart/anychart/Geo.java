package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Geo extends JsObject {

    
    private Double x;
    private Double y;

    public void setExtenddatarange(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    private Double gap;

    public void setGap(Double gap) {
        this.gap = gap;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private Double maxTicksCount;

    public void setMaxtickscount(Double maxTicksCount) {
        this.maxTicksCount = maxTicksCount;
    }

    private Double maximumX;

    public void setMaximumx(Double maximumX) {
        this.maximumX = maximumX;
    }

    private Double maximumY;

    public void setMaximumy(Double maximumY) {
        this.maximumY = maximumY;
    }

    private Double minimumX;

    public void setMinimumx(Double minimumX) {
        this.minimumX = minimumX;
    }

    private Double minimumY;

    public void setMinimumy(Double minimumY) {
        this.minimumY = minimumY;
    }

    private Double[] precision;

    public void setPrecision(Double[] precision) {
        this.precision = precision;
    }

    private Double xPrecision;
    private Double yPrecision;

    public void setPrecision(Double xPrecision, Double yPrecision) {
        this.xPrecision = xPrecision;
        this.yPrecision = yPrecision;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private String[] xMinorTicks;

    public void setXminorticks(String[] xMinorTicks) {
        this.xMinorTicks = xMinorTicks;
    }

    private String[] xTicks;

    public void setXticks(String[] xTicks) {
        this.xTicks = xTicks;
    }

    private String[] yMinorTicks;

    public void setYminorticks(String[] yMinorTicks) {
        this.yMinorTicks = yMinorTicks;
    }

    private String[] yTicks;

    public void setYticks(String[] yTicks) {
        this.yTicks = yTicks;
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
            return String.format(Locale.US, "type: \"%s\",", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: \"%s\",", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
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
            return String.format(Locale.US, "type: \"%s\",", type2);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: \"%s\",", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSxMinorTicks() {
        if (xMinorTicks != null) {
            return String.format(Locale.US, "xMinorTicks: %s,", Arrays.toString(xMinorTicks));
        }
        return "";
    }

    private String generateJSxTicks() {
        if (xTicks != null) {
            return String.format(Locale.US, "xTicks: %s,", Arrays.toString(xTicks));
        }
        return "";
    }

    private String generateJSyMinorTicks() {
        if (yMinorTicks != null) {
            return String.format(Locale.US, "yMinorTicks: %s,", Arrays.toString(yMinorTicks));
        }
        return "";
    }

    private String generateJSyTicks() {
        if (yTicks != null) {
            return String.format(Locale.US, "yTicks: %s,", Arrays.toString(yTicks));
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSx());
        js.append(generateJSy());
        js.append(generateJSgap());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
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
        js.append(generateJSxMinorTicks());
        js.append(generateJSxTicks());
        js.append(generateJSyMinorTicks());
        js.append(generateJSyTicks());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}