package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Grouping extends CoreBase {

    public Grouping() {

    }

    protected Grouping(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Grouping(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Boolean enabled;

    public Grouping setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".enabled(%b)", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".enabled(%b)", enabled));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean forced;

    public Grouping setForced(Boolean forced) {
        if (jsBase == null) {
            this.forced = forced;
        } else {
            this.forced = forced;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".forced(%b)", forced));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".forced(%b)", forced));
                js.setLength(0);
            }
        }
        return this;
    }

    private String[] levels;

    public Grouping setLevels(String[] levels) {
        if (jsBase == null) {
            this.levels = levels;
        } else {
            this.levels = levels;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".levels(%s)", Arrays.toString(levels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".levels(%s)", Arrays.toString(levels)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double maxVisiblePoints;

    public Grouping setMaxVisiblePoints(Double maxVisiblePoints) {
        if (jsBase == null) {
            this.maxVisiblePoints = maxVisiblePoints;
        } else {
            this.maxVisiblePoints = maxVisiblePoints;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".maxVisiblePoints(%f)", maxVisiblePoints));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxVisiblePoints(%f)", maxVisiblePoints));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double minPixPerPoint;

    public Grouping setMinPixPerPoint(Double minPixPerPoint) {
        if (jsBase == null) {
            this.minPixPerPoint = minPixPerPoint;
        } else {
            this.minPixPerPoint = minPixPerPoint;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".minPixPerPoint(%f)", minPixPerPoint));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minPixPerPoint(%f)", minPixPerPoint));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSforced() {
        if (forced != null) {
            return String.format(Locale.US, "forced: %b,", forced);
        }
        return "";
    }

    private String generateJSlevels() {
        if (levels != null) {
            return String.format(Locale.US, "levels: %s,", Arrays.toString(levels));
        }
        return "";
    }

    private String generateJSmaxVisiblePoints() {
        if (maxVisiblePoints != null) {
            return String.format(Locale.US, "maxVisiblePoints: %f,", maxVisiblePoints);
        }
        return "";
    }

    private String generateJSminPixPerPoint() {
        if (minPixPerPoint != null) {
            return String.format(Locale.US, "minPixPerPoint: %f,", minPixPerPoint);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

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
            js.append(generateJSenabled());
            js.append(generateJSforced());
            js.append(generateJSlevels());
            js.append(generateJSmaxVisiblePoints());
            js.append(generateJSminPixPerPoint());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}