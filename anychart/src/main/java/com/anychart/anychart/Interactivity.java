package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Interactivity extends CoreBase {

    public Interactivity() {

    }

    protected Interactivity(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Interactivity(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private HoverMode hoverMode;
    private String hoverMode1;

    public Interactivity setHoverMode(HoverMode hoverMode) {
        if (jsBase == null) {
            this.hoverMode = null;
            this.hoverMode1 = null;
            
            this.hoverMode = hoverMode;
        } else {
            this.hoverMode = hoverMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".hoverMode(%s)", (hoverMode != null) ? hoverMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hoverMode(%s)", (hoverMode != null) ? hoverMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Interactivity setHoverMode(String hoverMode1) {
        if (jsBase == null) {
            this.hoverMode = null;
            this.hoverMode1 = null;
            
            this.hoverMode1 = hoverMode1;
        } else {
            this.hoverMode1 = hoverMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".hoverMode(%s)", hoverMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hoverMode(%s)", hoverMode1));
                js.setLength(0);
            }
        }
        return this;
    }

    private SelectionMode selectionMode;
    private String selectionMode1;

    public Interactivity setSelectionMode(SelectionMode selectionMode) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode = selectionMode;
        } else {
            this.selectionMode = selectionMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".selectionMode(%s)", (selectionMode != null) ? selectionMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectionMode(%s)", (selectionMode != null) ? selectionMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Interactivity setSelectionMode(String selectionMode1) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode1 = selectionMode1;
        } else {
            this.selectionMode1 = selectionMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".selectionMode(%s)", selectionMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectionMode(%s)", selectionMode1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double spotRadius;

    public Interactivity setSpotRadius(Double spotRadius) {
        if (jsBase == null) {
            this.spotRadius = spotRadius;
        } else {
            this.spotRadius = spotRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".spotRadius(%f)", spotRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".spotRadius(%f)", spotRadius));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJShoverMode() {
        if (hoverMode != null) {
            return String.format(Locale.US, "hoverMode: %s,", (hoverMode != null) ? hoverMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJShoverMode1() {
        if (hoverMode1 != null) {
            return String.format(Locale.US, "hoverMode: %s,", hoverMode1);
        }
        return "";
    }

    private String generateJSselectionMode() {
        if (selectionMode != null) {
            return String.format(Locale.US, "selectionMode: %s,", (selectionMode != null) ? selectionMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectionMode1() {
        if (selectionMode1 != null) {
            return String.format(Locale.US, "selectionMode: %s,", selectionMode1);
        }
        return "";
    }

    private String generateJSspotRadius() {
        if (spotRadius != null) {
            return String.format(Locale.US, "spotRadius: %f,", spotRadius);
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
            js.append(generateJShoverMode());
            js.append(generateJShoverMode1());
            js.append(generateJSselectionMode());
            js.append(generateJSselectionMode1());
            js.append(generateJSspotRadius());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}