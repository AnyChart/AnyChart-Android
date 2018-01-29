package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The ProjectTimeline class contains methods for configuring standalones project timeline.
 */
public class ProjectTimeline extends UiTimeline {

    public ProjectTimeline() {
        js.setLength(0);
        js.append("var projectTimeline").append(++variableIndex).append(" = anychart.standalones.projectTimeline();");
        jsBase = "projectTimeline" + variableIndex;
    }

    protected ProjectTimeline(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ProjectTimeline(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number defaultRowHeight;

    /**
     * Setter for the default row height.
     */
    public ProjectTimeline setDefaultRowHeight(Number defaultRowHeight) {
        if (jsBase == null) {
            this.defaultRowHeight = defaultRowHeight;
        } else {
            this.defaultRowHeight = defaultRowHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".defaultRowHeight(%s)", defaultRowHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".defaultRowHeight(%s);", defaultRowHeight));
                js.setLength(0);
            }
        }
        return this;
    }

    private RangeColors getPalette;

    /**
     * Getter for the palette.
     */
    public RangeColors getPalette() {
        if (getPalette == null)
            getPalette = new RangeColors(jsBase + ".palette()");

        return getPalette;
    }

    private RangeColors paletteSettings;
    private DistinctColors paletteSettings1;
    private String paletteSettings2;
    private String[] paletteSettings3;

    /**
     * Setter the for palette.
     */
    public ProjectTimeline setPalette(RangeColors paletteSettings) {
        if (jsBase == null) {
            this.paletteSettings = null;
            this.paletteSettings1 = null;
            this.paletteSettings2 = null;
            this.paletteSettings3 = null;
            
            this.paletteSettings = paletteSettings;
        } else {
            this.paletteSettings = paletteSettings;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(paletteSettings.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".palette(%s);",  ((paletteSettings != null) ? paletteSettings.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s);", ((paletteSettings != null) ? paletteSettings.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter the for palette.
     */
    public ProjectTimeline setPalette(DistinctColors paletteSettings1) {
        if (jsBase == null) {
            this.paletteSettings = null;
            this.paletteSettings1 = null;
            this.paletteSettings2 = null;
            this.paletteSettings3 = null;
            
            this.paletteSettings1 = paletteSettings1;
        } else {
            this.paletteSettings1 = paletteSettings1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(paletteSettings1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".palette(%s);",  ((paletteSettings1 != null) ? paletteSettings1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s);", ((paletteSettings1 != null) ? paletteSettings1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter the for palette.
     */
    public ProjectTimeline setPalette(String paletteSettings2) {
        if (jsBase == null) {
            this.paletteSettings = null;
            this.paletteSettings1 = null;
            this.paletteSettings2 = null;
            this.paletteSettings3 = null;
            
            this.paletteSettings2 = paletteSettings2;
        } else {
            this.paletteSettings2 = paletteSettings2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".palette(%s)", wrapQuotes(paletteSettings2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s);", wrapQuotes(paletteSettings2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter the for palette.
     */
    public ProjectTimeline setPalette(String[] paletteSettings3) {
        if (jsBase == null) {
            this.paletteSettings = null;
            this.paletteSettings1 = null;
            this.paletteSettings2 = null;
            this.paletteSettings3 = null;
            
            this.paletteSettings3 = paletteSettings3;
        } else {
            this.paletteSettings3 = paletteSettings3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".palette(%s)", arrayToStringWrapQuotes(paletteSettings3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".palette(%s);", arrayToStringWrapQuotes(paletteSettings3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetPalette() {
        if (getPalette != null) {
            return getPalette.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetPalette());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}