package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Padding settings proxy. Doesn't store anything - just passes settings to and from the parent object.
 */
public class TablePadding extends JsObject {

    public TablePadding() {
        js.setLength(0);
        js.append("var tablePadding").append(++variableIndex).append(" = anychart.core.ui.table.padding();");
        jsBase = "tablePadding" + variableIndex;
    }

    protected TablePadding(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TablePadding(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double bottom;
    private String bottom1;
    private List<TablePadding> setBottom = new ArrayList<>();

    /**
     * Setter for bottom padding.
     */
    public TablePadding setBottom(Double bottom) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
        } else {
            this.bottom = bottom;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".bottom(%f)", bottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%f)", bottom));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottom() {
        if (!setBottom.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TablePadding item : setBottom) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TablePadding> setBottom1 = new ArrayList<>();

    /**
     * Setter for bottom padding.
     */
    public TablePadding setBottom(String bottom1) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
        } else {
            this.bottom1 = bottom1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".bottom(%s)", wrapQuotes(bottom1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%s)", wrapQuotes(bottom1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottom1() {
        if (!setBottom1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TablePadding item : setBottom1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double left;
    private String left1;
    private List<TablePadding> setLeft = new ArrayList<>();

    /**
     * Setter for left padding.
     */
    public TablePadding setLeft(Double left) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.left = left;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".left(%f)", left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%f)", left));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeft() {
        if (!setLeft.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TablePadding item : setLeft) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TablePadding> setLeft1 = new ArrayList<>();

    /**
     * Setter for left padding.
     */
    public TablePadding setLeft(String left1) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.left1 = left1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".left(%s)", wrapQuotes(left1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%s)", wrapQuotes(left1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeft1() {
        if (!setLeft1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TablePadding item : setLeft1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double right;
    private String right1;
    private List<TablePadding> setRight = new ArrayList<>();

    /**
     * Setter for right padding.
     */
    public TablePadding setRight(Double right) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right = right;
        } else {
            this.right = right;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".right(%f)", right));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%f)", right));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRight() {
        if (!setRight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TablePadding item : setRight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TablePadding> setRight1 = new ArrayList<>();

    /**
     * Setter for right padding.
     */
    public TablePadding setRight(String right1) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right1 = right1;
        } else {
            this.right1 = right1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".right(%s)", wrapQuotes(right1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%s)", wrapQuotes(right1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRight1() {
        if (!setRight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TablePadding item : setRight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double top;
    private String top1;
    private List<TablePadding> setTop = new ArrayList<>();

    /**
     * Setter for top padding.
     */
    public TablePadding setTop(Double top) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top = top;
        } else {
            this.top = top;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".top(%f)", top));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%f)", top));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTop() {
        if (!setTop.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TablePadding item : setTop) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TablePadding> setTop1 = new ArrayList<>();

    /**
     * Setter for top padding.
     */
    public TablePadding setTop(String top1) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top1 = top1;
        } else {
            this.top1 = top1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".top(%s)", wrapQuotes(top1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%s)", wrapQuotes(top1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTop1() {
        if (!setTop1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TablePadding item : setTop1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

        js.append(generateJsGetters());

        js.append(generateJSsetBottom());
        js.append(generateJSsetBottom1());
        js.append(generateJSsetLeft());
        js.append(generateJSsetLeft1());
        js.append(generateJSsetRight());
        js.append(generateJSsetRight1());
        js.append(generateJSsetTop());
        js.append(generateJSsetTop1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}