package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
    private List<StockDateTime> setBackground = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".background(%s)", wrapQuotes(background)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackground() {
        if (!setBackground.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : setBackground) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockDateTime> setBackground1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".background(%b)", background1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackground1() {
        if (!setBackground1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : setBackground1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double height;
    private List<StockDateTime> setHeight = new ArrayList<>();

    /**
     * Setter for the axis height.
     */
    public StockDateTime setHeight(Double height) {
        if (jsBase == null) {
            this.height = height;
        } else {
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".height(%f)", height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%f)", height));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHeight() {
        if (!setHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : setHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<StockDateTime> setLabels = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".labels(%s)", wrapQuotes(labels)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabels() {
        if (!setLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : setLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockDateTime> setLabels1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".labels(%b)", labels1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLabels1() {
        if (!setLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : setLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<StockDateTime> setMinorLabels = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".minorLabels(%s)", wrapQuotes(minorLabels)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorLabels() {
        if (!setMinorLabels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : setMinorLabels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockDateTime> setMinorLabels1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".minorLabels(%b)", minorLabels1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorLabels1() {
        if (!setMinorLabels1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : setMinorLabels1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<StockDateTime> setMinorTicks = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".minorTicks(%s)", wrapQuotes(minorTicks)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorTicks() {
        if (!setMinorTicks.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : setMinorTicks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockDateTime> setMinorTicks1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".minorTicks(%b)", minorTicks1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinorTicks1() {
        if (!setMinorTicks1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : setMinorTicks1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StockLabelsOverlapMode overlapMode;
    private String overlapMode1;
    private List<StockDateTime> setOverlapMode = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%s)", ((overlapMode != null) ? overlapMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOverlapMode() {
        if (!setOverlapMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : setOverlapMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StockDateTime> setOverlapMode1 = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".overlapMode(%s)", wrapQuotes(overlapMode1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOverlapMode1() {
        if (!setOverlapMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : setOverlapMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean showHelperLabel;
    private List<StockDateTime> setShowHelperLabel = new ArrayList<>();

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
                onChangeListener.onChange(String.format(Locale.US, ".showHelperLabel(%b)", showHelperLabel));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetShowHelperLabel() {
        if (!setShowHelperLabel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StockDateTime item : setShowHelperLabel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJSsetBackground());
        js.append(generateJSsetBackground1());
        js.append(generateJSsetHeight());
        js.append(generateJSsetLabels());
        js.append(generateJSsetLabels1());
        js.append(generateJSsetMinorLabels());
        js.append(generateJSsetMinorLabels1());
        js.append(generateJSsetMinorTicks());
        js.append(generateJSsetMinorTicks1());
        js.append(generateJSsetOverlapMode());
        js.append(generateJSsetOverlapMode1());
        js.append(generateJSsetShowHelperLabel());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}