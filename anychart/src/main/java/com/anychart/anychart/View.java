package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * View is a representation of raw data.<br/>
<b>Note:</b> Default View is a view with default mapping.
 */
public class View extends CoreBase {

    public View() {
        js.setLength(0);
        js.append("var view").append(++variableIndex).append(" = anychart.data.view();");
        jsBase = "view" + variableIndex;
    }

    protected View(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected View(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private View otherView;
    private String[] otherView1;
    private List<View> setConcat = new ArrayList<>();

    /**
     * Concatenates two views to make a derived view that contains rows from both views.
     */
    public View concat(View otherView) {
        if (jsBase == null) {
            this.otherView = null;
            this.otherView1 = null;
            
            this.otherView = otherView;
        } else {
            this.otherView = otherView;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(otherView.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".concat(%s);",  ((otherView != null) ? otherView.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetConcat() {
        if (!setConcat.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (View item : setConcat) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<View> setConcat1 = new ArrayList<>();

    /**
     * Concatenates two views to make a derived view that contains rows from both views.
     */
    public View concat(String[] otherView1) {
        if (jsBase == null) {
            this.otherView = null;
            this.otherView1 = null;
            
            this.otherView1 = otherView1;
        } else {
            this.otherView1 = otherView1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".concat(%s)", arrayToStringWrapQuotes(otherView1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".concat(%s)", arrayToStringWrapQuotes(otherView1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetConcat1() {
        if (!setConcat1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (View item : setConcat1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fieldName;
    private List<View> setFilter = new ArrayList<>();

    /**
     * Creates a derived view, containing only the rows that pass the filter.
     */
    public View filter(String fieldName) {
        if (jsBase == null) {
            this.fieldName = fieldName;
        } else {
            this.fieldName = fieldName;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".filter(%s)", wrapQuotes(fieldName)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".filter(%s)", wrapQuotes(fieldName)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFilter() {
        if (!setFilter.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (View item : setFilter) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fieldName1;

    /**
     * Searches fieldName by fieldValue and returns it index (or the first match).
     */
    public void find(String fieldName1) {
        if (jsBase == null) {
            this.fieldName = null;
            this.fieldName1 = null;
            
            this.fieldName1 = fieldName1;
        } else {
            this.fieldName1 = fieldName1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".find(%s);", wrapQuotes(fieldName1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".find(%s)", wrapQuotes(fieldName1)));
                js.setLength(0);
            }
        }
    }

    private Double index;
    private String name;
    private List<View> setMeta = new ArrayList<>();

    /**
     * Setter for a metadata value. Learn how it works at {@link anychart.data.Iterator#meta}.
     */
    public View setMeta(Double index, String name) {
        if (jsBase == null) {
            this.index = index;
            this.name = name;
        } else {
            this.index = index;
            this.name = name;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".meta(%f, %s)", index, wrapQuotes(name)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".meta(%f, %s)", index, wrapQuotes(name)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMeta() {
        if (!setMeta.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (View item : setMeta) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double rowIndex;

    /**
     * Sets a row of the set by an index.
     */
    public void setRow(Double rowIndex) {
        if (jsBase == null) {
            this.rowIndex = rowIndex;
        } else {
            this.rowIndex = rowIndex;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".row(%f);", rowIndex));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".row(%f)", rowIndex));
                js.setLength(0);
            }
        }
    }

    private Double rowIndex1;
    private String fieldName2;
    private List<View> setSet = new ArrayList<>();

    /**
     * Sets the value to the row field by row index and field name.
     */
    public View setSet(Double rowIndex1, String fieldName2) {
        if (jsBase == null) {
            this.rowIndex = null;
            this.rowIndex1 = null;
            
            this.rowIndex1 = rowIndex1;
            this.fieldName = null;
            this.fieldName1 = null;
            this.fieldName2 = null;
            
            this.fieldName2 = fieldName2;
        } else {
            this.rowIndex1 = rowIndex1;
            this.fieldName2 = fieldName2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".set(%f, %s)", rowIndex1, wrapQuotes(fieldName2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%f, %s)", rowIndex1, wrapQuotes(fieldName2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSet() {
        if (!setSet.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (View item : setSet) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fieldName3;
    private List<View> setSort = new ArrayList<>();

    /**
     * Creates a derived view that ensures sorting by a passed field.
     */
    public View sort(String fieldName3) {
        if (jsBase == null) {
            this.fieldName = null;
            this.fieldName1 = null;
            this.fieldName2 = null;
            this.fieldName3 = null;
            
            this.fieldName3 = fieldName3;
        } else {
            this.fieldName3 = fieldName3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sort(%s)", wrapQuotes(fieldName3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sort(%s)", wrapQuotes(fieldName3)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSort() {
        if (!setSort.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (View item : setSort) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fieldName4;
    private Sort order;
    private String order1;
    private List<View> setSort1 = new ArrayList<>();

    /**
     * Creates a derived view that ensures sorting by a passed field.
     */
    public View sort(String fieldName4, Sort order) {
        if (jsBase == null) {
            this.fieldName = null;
            this.fieldName1 = null;
            this.fieldName2 = null;
            this.fieldName3 = null;
            this.fieldName4 = null;
            
            this.fieldName4 = fieldName4;
            this.order = null;
            this.order1 = null;
            
            this.order = order;
        } else {
            this.fieldName4 = fieldName4;
            this.order = order;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sort(%s, %s)", wrapQuotes(fieldName4), ((order != null) ? order.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sort(%s, %s)", wrapQuotes(fieldName4), ((order != null) ? order.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSort1() {
        if (!setSort1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (View item : setSort1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<View> setSort2 = new ArrayList<>();

    /**
     * Creates a derived view that ensures sorting by a passed field.
     */
    public View sort(String fieldName4, String order1) {
        if (jsBase == null) {
            this.fieldName = null;
            this.fieldName1 = null;
            this.fieldName2 = null;
            this.fieldName3 = null;
            this.fieldName4 = null;
            
            this.fieldName4 = fieldName4;
            this.order = null;
            this.order1 = null;
            
            this.order1 = order1;
        } else {
            this.fieldName4 = fieldName4;
            this.order1 = order1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".sort(%s, %s)", wrapQuotes(fieldName4), wrapQuotes(order1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".sort(%s, %s)", wrapQuotes(fieldName4), wrapQuotes(order1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSort2() {
        if (!setSort2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (View item : setSort2) {
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

        js.append(generateJSsetConcat());
        js.append(generateJSsetConcat1());
        js.append(generateJSsetFilter());
        js.append(generateJSsetMeta());
        js.append(generateJSsetSet());
        js.append(generateJSsetSort());
        js.append(generateJSsetSort1());
        js.append(generateJSsetSort2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}