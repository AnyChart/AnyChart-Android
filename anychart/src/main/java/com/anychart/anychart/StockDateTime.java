package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Stock date time axis class.
 */
public class StockDateTime extends VisualBase {

    public StockDateTime() {
        js.setLength(0);
        js.append("var stockDateTime").append(++variableIndex).append(" = anychart.core.axes.stockDateTime();");
        jsBase = "stockDateTime" + variableIndex;
    }

    protected StockDateTime(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StockDateTime(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private UiBackground getBackground;

    /**
     * Getter for axis background settings.
     */
    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private String background;
    private Boolean background1;
    private String background2;

    /**
     * Setter for axis background settings.
     */
    public StockDateTime setBackground(String background) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background = background;
        } else {
            this.background = background;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".background(%s)", wrapQuotes(background)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%s);", wrapQuotes(background)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for axis background settings.
     */
    public StockDateTime setBackground(Boolean background1) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background1 = background1;
        } else {
            this.background1 = background1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".background(%b)", background1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".background(%b);", background1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number height;

    /**
     * Setter for the axis height.
     */
    public StockDateTime setHeight(Number height) {
        if (jsBase == null) {
            this.height = height;
        } else {
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".height(%s)", height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabelsFactory getLabels;

    /**
     * Getter for axis labels settings.
     */
    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }

    private String labels;
    private Boolean labels1;

    /**
     * Setter for axis labels settings.
     */
    public StockDateTime setLabels(String labels) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels = labels;
        } else {
            this.labels = labels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%s);", wrapQuotes(labels)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for axis labels settings.
     */
    public StockDateTime setLabels(Boolean labels1) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels1 = labels1;
        } else {
            this.labels1 = labels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".labels(%b)", labels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%b);", labels1));
                js.setLength(0);
            }
        }
        return this;
    }

    private UiLabelsFactory getMinorLabels;

    /**
     * Getter for minor labels settings.
     */
    public UiLabelsFactory getMinorLabels() {
        if (getMinorLabels == null)
            getMinorLabels = new UiLabelsFactory(jsBase + ".minorLabels()");

        return getMinorLabels;
    }

    private String minorLabels;
    private Boolean minorLabels1;

    /**
     * Setter for minor labels settings.
     */
    public StockDateTime setMinorLabels(String minorLabels) {
        if (jsBase == null) {
            this.minorLabels = null;
            this.minorLabels1 = null;
            
            this.minorLabels = minorLabels;
        } else {
            this.minorLabels = minorLabels;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minorLabels(%s)", wrapQuotes(minorLabels)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minorLabels(%s);", wrapQuotes(minorLabels)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for minor labels settings.
     */
    public StockDateTime setMinorLabels(Boolean minorLabels1) {
        if (jsBase == null) {
            this.minorLabels = null;
            this.minorLabels1 = null;
            
            this.minorLabels1 = minorLabels1;
        } else {
            this.minorLabels1 = minorLabels1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minorLabels(%b)", minorLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minorLabels(%b);", minorLabels1));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockTicks getMinorTicks;

    /**
     * Getter for minor ticks.
     */
    public StockTicks getMinorTicks() {
        if (getMinorTicks == null)
            getMinorTicks = new StockTicks(jsBase + ".minorTicks()");

        return getMinorTicks;
    }

    private String minorTicks;
    private Boolean minorTicks1;

    /**
     * Setter for the minor ticks.
     */
    public StockDateTime setMinorTicks(String minorTicks) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks = minorTicks;
        } else {
            this.minorTicks = minorTicks;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minorTicks(%s)", wrapQuotes(minorTicks)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minorTicks(%s);", wrapQuotes(minorTicks)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the minor ticks.
     */
    public StockDateTime setMinorTicks(Boolean minorTicks1) {
        if (jsBase == null) {
            this.minorTicks = null;
            this.minorTicks1 = null;
            
            this.minorTicks1 = minorTicks1;
        } else {
            this.minorTicks1 = minorTicks1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".minorTicks(%b)", minorTicks1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minorTicks(%b);", minorTicks1));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockLabelsOverlapMode overlapMode;
    private String overlapMode1;

    /**
     * Setter for labels overlap mode.
Whether to allow labels to overlap.
     */
    public StockDateTime setOverlapMode(StockLabelsOverlapMode overlapMode) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            
            this.overlapMode = overlapMode;
        } else {
            this.overlapMode = overlapMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".overlapMode(%s)", ((overlapMode != null) ? overlapMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlapMode(%s);", ((overlapMode != null) ? overlapMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for labels overlap mode.
Whether to allow labels to overlap.
     */
    public StockDateTime setOverlapMode(String overlapMode1) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            
            this.overlapMode1 = overlapMode1;
        } else {
            this.overlapMode1 = overlapMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".overlapMode(%s)", wrapQuotes(overlapMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlapMode(%s);", wrapQuotes(overlapMode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean showHelperLabel;

    /**
     * Setter for the drawing helper label.
Whether to draw helper label (leftmost hanging label).
     */
    public StockDateTime setShowHelperLabel(Boolean showHelperLabel) {
        if (jsBase == null) {
            this.showHelperLabel = showHelperLabel;
        } else {
            this.showHelperLabel = showHelperLabel;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".showHelperLabel(%b)", showHelperLabel));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".showHelperLabel(%b);", showHelperLabel));
                js.setLength(0);
            }
        }
        return this;
    }

    private StockTicks getTicks;

    /**
     * Getter for axis ticks.
     */
    public StockTicks getTicks() {
        if (getTicks == null)
            getTicks = new StockTicks(jsBase + ".ticks()");

        return getTicks;
    }

    private List<StockDateTime> getTicks1 = new ArrayList<>();

    /**
     * Getter for axis ticks.
     */
    public StockDateTime getTicks(String ticks) {
        StockDateTime item = new StockDateTime(jsBase + ".ticks(" + wrapQuotes(ticks) + ")");
        getTicks1.add(item);
        return item;
    }

    private List<StockDateTime> getTicks2 = new ArrayList<>();

    /**
     * Getter for axis ticks.
     */
    public StockDateTime getTicks(Boolean ticks) {
        StockDateTime item = new StockDateTime(jsBase + ".ticks(" + ticks + ")");
        getTicks2.add(item);
        return item;
    }

    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMinorLabels() {
        if (getMinorLabels != null) {
            return getMinorLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetMinorTicks() {
        if (getMinorTicks != null) {
            return getMinorTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetTicks() {
        if (getTicks != null) {
            return getTicks.generateJs();
        }
        return "";
    }

    private String generateJSgetTicks1() {
        if (!getTicks1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : getTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetTicks2() {
        if (!getTicks2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : getTicks2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetBackground());
        jsGetters.append(generateJSgetLabels());
        jsGetters.append(generateJSgetMinorLabels());
        jsGetters.append(generateJSgetMinorTicks());
        jsGetters.append(generateJSgetTicks());
        jsGetters.append(generateJSgetTicks1());
        jsGetters.append(generateJSgetTicks2());

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