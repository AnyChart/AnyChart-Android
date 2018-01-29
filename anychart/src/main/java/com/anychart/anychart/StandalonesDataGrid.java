package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The DataGrid class contains methods for configuring standalones data grid.
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
     * Getter for the data grid container.
     */
    public Element getContainer() {
        if (getContainer == null)
            getContainer = new Element(jsBase + ".container()");

        return getContainer;
    }

    private String container;
    private Element container1;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", wrapQuotes(container)));
                js.setLength(0);
            }
        }
        return this;
    }


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
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", ((container1 != null) ? container1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number defaultRowHeight;

    /**
     * Setter for the default row height.
     */
    public StandalonesDataGrid setDefaultRowHeight(Number defaultRowHeight) {
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

    private Number headerHeight;

    /**
     * Setter for the header height.
     */
    public StandalonesDataGrid setHeaderHeight(Number headerHeight) {
        if (jsBase == null) {
            this.headerHeight = headerHeight;
        } else {
            this.headerHeight = headerHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".headerHeight(%s)", headerHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".headerHeight(%s);", headerHeight));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnychartMathRect getParentBounds;

    /**
     * Getter for parent bounds.<br/>
As a getter falls back to stage bounds.
     */
    public AnychartMathRect getParentBounds() {
        if (getParentBounds == null)
            getParentBounds = new AnychartMathRect(jsBase + ".parentBounds()");

        return getParentBounds;
    }

    private AnychartMathRect parentBounds;
    private String parentBounds1;

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
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parentBounds(%s);", ((parentBounds != null) ? parentBounds.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parentBounds(%s);", wrapQuotes(parentBounds1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number left;
    private Number top;
    private Number width;
    private Number height;

    /**
     * Setter for bounds using several values.
     */
    public StandalonesDataGrid setParentBounds(Number left, Number top, Number width, Number height) {
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
            
            js.append(String.format(Locale.US, ".parentBounds(%s, %s, %s, %s)", left, top, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parentBounds(%s, %s, %s, %s);", left, top, width, height));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke rowStroke;
    private String rowStroke1;

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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowStroke(%s);", ((rowStroke != null) ? rowStroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rowStroke(%s);", wrapQuotes(rowStroke1)));
                js.setLength(0);
            }
        }
        return this;
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".verticalScrollBar(%s);", wrapQuotes(verticalScrollBar)));
                js.setLength(0);
            }
        }
        return this;
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

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}