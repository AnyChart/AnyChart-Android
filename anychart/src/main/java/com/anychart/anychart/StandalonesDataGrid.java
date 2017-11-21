package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * 
 */
public class StandalonesDataGrid extends UiDataGrid {

    public StandalonesDataGrid() {
        js.setLength(0);
        js.append("var standalonesDataGrid").append(++variableIndex).append(" = anychart.standalones.dataGrid();");
        jsBase = "standalonesDataGrid" + variableIndex;
    }

    protected StandalonesDataGrid(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StandalonesDataGrid(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element getContainer;

    /**
     * Getter for the data grid current container.
     */
    public Element getContainer() {
        if (getContainer == null)
            getContainer = new Element(jsBase + ".container()");

        return getContainer;
    }

    private String container;
    private Element container1;
    private List<StandalonesDataGrid> setContainer = new ArrayList<>();

    /**
     * Setter for the data grid container.
     */
    public StandalonesDataGrid setContainer(String container) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            
            this.container = container;
        } else {
            this.container = container;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".container(%s)", wrapQuotes(container)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", wrapQuotes(container)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetContainer() {
        if (!setContainer.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesDataGrid item : setContainer) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesDataGrid> setContainer1 = new ArrayList<>();

    /**
     * Setter for the data grid container.
     */
    public StandalonesDataGrid setContainer(Element container1) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            
            this.container1 = container1;
        } else {
            this.container1 = container1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(container1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".container(%s);",  ((container1 != null) ? container1.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetContainer1() {
        if (!setContainer1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesDataGrid item : setContainer1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double defaultRowHeight;
    private List<StandalonesDataGrid> setDefaultRowHeight = new ArrayList<>();

    /**
     * Setter for the default row height.
     */
    public StandalonesDataGrid setDefaultRowHeight(Double defaultRowHeight) {
        if (jsBase == null) {
            this.defaultRowHeight = defaultRowHeight;
        } else {
            this.defaultRowHeight = defaultRowHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".defaultRowHeight(%f)", defaultRowHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".defaultRowHeight(%f)", defaultRowHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDefaultRowHeight() {
        if (!setDefaultRowHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesDataGrid item : setDefaultRowHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double headerHeight;
    private List<StandalonesDataGrid> setHeaderHeight = new ArrayList<>();

    /**
     * Setter for the header height.
     */
    public StandalonesDataGrid setHeaderHeight(Double headerHeight) {
        if (jsBase == null) {
            this.headerHeight = headerHeight;
        } else {
            this.headerHeight = headerHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".headerHeight(%f)", headerHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".headerHeight(%f)", headerHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHeaderHeight() {
        if (!setHeaderHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesDataGrid item : setHeaderHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private AnychartMathRect getParentBounds;

    /**
     * Getter for bounds. As a getter falls back to stage bounds.
     */
    public AnychartMathRect getParentBounds() {
        if (getParentBounds == null)
            getParentBounds = new AnychartMathRect(jsBase + ".parentBounds()");

        return getParentBounds;
    }

    private AnychartMathRect parentBounds;
    private String parentBounds1;
    private List<StandalonesDataGrid> setParentBounds = new ArrayList<>();

    /**
     * Setter for bounds using single value.
     */
    public StandalonesDataGrid setParentBounds(AnychartMathRect parentBounds) {
        if (jsBase == null) {
            this.parentBounds = null;
            this.parentBounds1 = null;
            
            this.parentBounds = parentBounds;
        } else {
            this.parentBounds = parentBounds;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(parentBounds.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".parentBounds(%s);",  ((parentBounds != null) ? parentBounds.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetParentBounds() {
        if (!setParentBounds.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesDataGrid item : setParentBounds) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesDataGrid> setParentBounds1 = new ArrayList<>();

    /**
     * Setter for bounds using single value.
     */
    public StandalonesDataGrid setParentBounds(String parentBounds1) {
        if (jsBase == null) {
            this.parentBounds = null;
            this.parentBounds1 = null;
            
            this.parentBounds1 = parentBounds1;
        } else {
            this.parentBounds1 = parentBounds1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".parentBounds(%s)", wrapQuotes(parentBounds1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentBounds(%s)", wrapQuotes(parentBounds1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetParentBounds1() {
        if (!setParentBounds1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesDataGrid item : setParentBounds1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double left;
    private Double top;
    private Double width;
    private Double height;
    private List<StandalonesDataGrid> setParentBounds2 = new ArrayList<>();

    /**
     * Setter for bounds using several value.
     */
    public StandalonesDataGrid setParentBounds(Double left, Double top, Double width, Double height) {
        if (jsBase == null) {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
        } else {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".parentBounds(%f, %f, %f, %f)", left, top, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentBounds(%f, %f, %f, %f)", left, top, width, height));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetParentBounds2() {
        if (!setParentBounds2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesDataGrid item : setParentBounds2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke rowStroke;
    private String rowStroke1;
    private List<StandalonesDataGrid> setRowStroke = new ArrayList<>();

    /**
     * Setter for the row stroke.
     */
    public StandalonesDataGrid setRowStroke(Stroke rowStroke) {
        if (jsBase == null) {
            this.rowStroke = null;
            this.rowStroke1 = null;
            
            this.rowStroke = rowStroke;
        } else {
            this.rowStroke = rowStroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowStroke(%s)", ((rowStroke != null) ? rowStroke.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowStroke(%s)", ((rowStroke != null) ? rowStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowStroke() {
        if (!setRowStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesDataGrid item : setRowStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<StandalonesDataGrid> setRowStroke1 = new ArrayList<>();

    /**
     * Setter for the row stroke.
     */
    public StandalonesDataGrid setRowStroke(String rowStroke1) {
        if (jsBase == null) {
            this.rowStroke = null;
            this.rowStroke1 = null;
            
            this.rowStroke1 = rowStroke1;
        } else {
            this.rowStroke1 = rowStroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowStroke(%s)", wrapQuotes(rowStroke1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowStroke(%s)", wrapQuotes(rowStroke1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRowStroke1() {
        if (!setRowStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesDataGrid item : setRowStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ScrollBar getVerticalScrollBar;

    /**
     * Getter for the vertical scroll bar.
     */
    public ScrollBar getVerticalScrollBar() {
        if (getVerticalScrollBar == null)
            getVerticalScrollBar = new ScrollBar(jsBase + ".verticalScrollBar()");

        return getVerticalScrollBar;
    }

    private String verticalScrollBar;
    private List<StandalonesDataGrid> setVerticalScrollBar = new ArrayList<>();

    /**
     * Setter for the vertical scroll bar.
     */
    public StandalonesDataGrid setVerticalScrollBar(String verticalScrollBar) {
        if (jsBase == null) {
            this.verticalScrollBar = verticalScrollBar;
        } else {
            this.verticalScrollBar = verticalScrollBar;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".verticalScrollBar(%s)", wrapQuotes(verticalScrollBar)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".verticalScrollBar(%s)", wrapQuotes(verticalScrollBar)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetVerticalScrollBar() {
        if (!setVerticalScrollBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StandalonesDataGrid item : setVerticalScrollBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetContainer() {
        if (getContainer != null) {
            return getContainer.generateJs();
        }
        return "";
    }

    private String generateJSgetParentBounds() {
        if (getParentBounds != null) {
            return getParentBounds.generateJs();
        }
        return "";
    }

    private String generateJSgetVerticalScrollBar() {
        if (getVerticalScrollBar != null) {
            return getVerticalScrollBar.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetContainer());
        jsGetters.append(generateJSgetParentBounds());
        jsGetters.append(generateJSgetVerticalScrollBar());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetContainer());
        js.append(generateJSsetContainer1());
        js.append(generateJSsetDefaultRowHeight());
        js.append(generateJSsetHeaderHeight());
        js.append(generateJSsetParentBounds());
        js.append(generateJSsetParentBounds1());
        js.append(generateJSsetParentBounds2());
        js.append(generateJSsetRowStroke());
        js.append(generateJSsetRowStroke1());
        js.append(generateJSsetVerticalScrollBar());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}