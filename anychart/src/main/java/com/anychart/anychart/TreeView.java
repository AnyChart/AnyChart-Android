package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * TreeView. Class of mapped tree.
 */
public class TreeView extends CoreBase {

    public TreeView() {
        js.setLength(0);
        js.append("var treeView").append(++variableIndex).append(" = anychart.data.treeView();");
        jsBase = "treeView" + variableIndex;
    }

    protected TreeView(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TreeView(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String child;
    private TreeDataItem child1;
    private TreeviewDataItem child2;
    private List<TreeviewDataItem> setAddChild = new ArrayList<>();

    /**
     * Adds a child.
     */
    public TreeviewDataItem addChild(String child) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child = child;
        } else {
            this.child = child;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setAddChild" + ++variableIndex + " = " + jsBase + ".addChild(%s);", wrapQuotes(child)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", wrapQuotes(child)));
                js.setLength(0);
            }
        }
        TreeviewDataItem item = new TreeviewDataItem("setAddChild" + variableIndex);
        setAddChild.add(item);
        return item;
    }
    private String generateJSsetAddChild() {
        if (!setAddChild.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setAddChild) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> setAddChild1 = new ArrayList<>();

    /**
     * Adds a child.
     */
    public TreeviewDataItem addChild(TreeDataItem child1) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child1 = child1;
        } else {
            this.child1 = child1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".addChild(%s);",  ((child1 != null) ? child1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", ((child1 != null) ? child1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        TreeviewDataItem item = new TreeviewDataItem("setAddChild1" + variableIndex);
        setAddChild1.add(item);
        return item;
    }
    private String generateJSsetAddChild1() {
        if (!setAddChild1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setAddChild1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> setAddChild2 = new ArrayList<>();

    /**
     * Adds a child.
     */
    public TreeviewDataItem addChild(TreeviewDataItem child2) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child2 = child2;
        } else {
            this.child2 = child2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child2.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".addChild(%s);",  ((child2 != null) ? child2.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", ((child2 != null) ? child2.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        TreeviewDataItem item = new TreeviewDataItem("setAddChild2" + variableIndex);
        setAddChild2.add(item);
        return item;
    }
    private String generateJSsetAddChild2() {
        if (!setAddChild2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setAddChild2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String child3;
    private TreeDataItem child4;
    private TreeviewDataItem child5;
    private Number index;
    private List<TreeviewDataItem> setAddChildAt = new ArrayList<>();

    /**
     * Inserts a child into a specified position.
     */
    public TreeviewDataItem addChildAt(String child3, Number index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            
            this.child3 = child3;
            this.index = index;
        } else {
            this.child3 = child3;
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setAddChildAt" + ++variableIndex + " = " + jsBase + ".addChildAt(%s, %s);", wrapQuotes(child3), index));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", wrapQuotes(child3), index));
                js.setLength(0);
            }
        }
        TreeviewDataItem item = new TreeviewDataItem("setAddChildAt" + variableIndex);
        setAddChildAt.add(item);
        return item;
    }
    private String generateJSsetAddChildAt() {
        if (!setAddChildAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setAddChildAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> setAddChildAt1 = new ArrayList<>();

    /**
     * Inserts a child into a specified position.
     */
    public TreeviewDataItem addChildAt(TreeDataItem child4, Number index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            
            this.child4 = child4;
            this.index = index;
        } else {
            this.child4 = child4;
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child4.generateJs());
            js.append(String.format(Locale.US, "var setAddChildAt1" + ++variableIndex + " = " + jsBase + ".addChildAt(%s, %s);", ((child4 != null) ? child4.getJsBase() : "null"), index));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", ((child4 != null) ? child4.getJsBase() : "null"), index));
                js.setLength(0);
            }
        }
        TreeviewDataItem item = new TreeviewDataItem("setAddChildAt1" + variableIndex);
        setAddChildAt1.add(item);
        return item;
    }
    private String generateJSsetAddChildAt1() {
        if (!setAddChildAt1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setAddChildAt1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> setAddChildAt2 = new ArrayList<>();

    /**
     * Inserts a child into a specified position.
     */
    public TreeviewDataItem addChildAt(TreeviewDataItem child5, Number index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            
            this.child5 = child5;
            this.index = index;
        } else {
            this.child5 = child5;
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child5.generateJs());
            js.append(String.format(Locale.US, "var setAddChildAt2" + ++variableIndex + " = " + jsBase + ".addChildAt(%s, %s);", ((child5 != null) ? child5.getJsBase() : "null"), index));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", ((child5 != null) ? child5.getJsBase() : "null"), index));
                js.setLength(0);
            }
        }
        TreeviewDataItem item = new TreeviewDataItem("setAddChildAt2" + variableIndex);
        setAddChildAt2.add(item);
        return item;
    }
    private String generateJSsetAddChildAt2() {
        if (!setAddChildAt2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setAddChildAt2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String data;
    private String data1;
    private TreeFillingMethod fillMethodOrCsvMapping;
    private String fillMethodOrCsvMapping1;
    private String fillMethodOrCsvMapping2;
    private String csvSettingsOrDeps;
    private Dependency[] csvSettingsOrDeps1;

    /**
     * Adds a data.
     */
    public TreeView addData(String data, TreeFillingMethod fillMethodOrCsvMapping, String csvSettingsOrDeps) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillMethodOrCsvMapping = null;
            this.fillMethodOrCsvMapping1 = null;
            this.fillMethodOrCsvMapping2 = null;
            
            this.fillMethodOrCsvMapping = fillMethodOrCsvMapping;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps = csvSettingsOrDeps;
        } else {
            this.data = data;
            this.fillMethodOrCsvMapping = fillMethodOrCsvMapping;
            this.csvSettingsOrDeps = csvSettingsOrDeps;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), ((fillMethodOrCsvMapping != null) ? fillMethodOrCsvMapping.generateJs() : "null"), wrapQuotes(csvSettingsOrDeps)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", wrapQuotes(data), ((fillMethodOrCsvMapping != null) ? fillMethodOrCsvMapping.generateJs() : "null"), wrapQuotes(csvSettingsOrDeps)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Adds a data.
     */
    public TreeView addData(String data, TreeFillingMethod fillMethodOrCsvMapping, Dependency[] csvSettingsOrDeps1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillMethodOrCsvMapping = null;
            this.fillMethodOrCsvMapping1 = null;
            this.fillMethodOrCsvMapping2 = null;
            
            this.fillMethodOrCsvMapping = fillMethodOrCsvMapping;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
        } else {
            this.data = data;
            this.fillMethodOrCsvMapping = fillMethodOrCsvMapping;
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), ((fillMethodOrCsvMapping != null) ? fillMethodOrCsvMapping.generateJs() : "null"), arrayToString(csvSettingsOrDeps1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", wrapQuotes(data), ((fillMethodOrCsvMapping != null) ? fillMethodOrCsvMapping.generateJs() : "null"), arrayToString(csvSettingsOrDeps1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Adds a data.
     */
    public TreeView addData(String data, String fillMethodOrCsvMapping1, String csvSettingsOrDeps) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillMethodOrCsvMapping = null;
            this.fillMethodOrCsvMapping1 = null;
            this.fillMethodOrCsvMapping2 = null;
            
            this.fillMethodOrCsvMapping1 = fillMethodOrCsvMapping1;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps = csvSettingsOrDeps;
        } else {
            this.data = data;
            this.fillMethodOrCsvMapping1 = fillMethodOrCsvMapping1;
            this.csvSettingsOrDeps = csvSettingsOrDeps;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), wrapQuotes(fillMethodOrCsvMapping1), wrapQuotes(csvSettingsOrDeps)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", wrapQuotes(data), wrapQuotes(fillMethodOrCsvMapping1), wrapQuotes(csvSettingsOrDeps)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Adds a data.
     */
    public TreeView addData(String data, String fillMethodOrCsvMapping1, Dependency[] csvSettingsOrDeps1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillMethodOrCsvMapping = null;
            this.fillMethodOrCsvMapping1 = null;
            this.fillMethodOrCsvMapping2 = null;
            
            this.fillMethodOrCsvMapping1 = fillMethodOrCsvMapping1;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
        } else {
            this.data = data;
            this.fillMethodOrCsvMapping1 = fillMethodOrCsvMapping1;
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), wrapQuotes(fillMethodOrCsvMapping1), arrayToString(csvSettingsOrDeps1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", wrapQuotes(data), wrapQuotes(fillMethodOrCsvMapping1), arrayToString(csvSettingsOrDeps1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<TreeviewDataItem> getGetChildAt = new ArrayList<>();

    /**
     * Gets the child by index.
     */
    public TreeviewDataItem getGetChildAt(Number index) {
        TreeviewDataItem item = new TreeviewDataItem(jsBase + ".getChildAt(" + index + ")");
        getGetChildAt.add(item);
        return item;
    }

    private TreeDataItem child6;
    private TreeviewDataItem child7;
    private List<TreeviewDataItem> setRemoveChild = new ArrayList<>();

    /**
     * Removes data item's child.
     */
    public TreeviewDataItem removeChild(TreeDataItem child6) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            this.child6 = null;
            this.child7 = null;
            
            this.child6 = child6;
        } else {
            this.child6 = child6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child6.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".removeChild(%s);",  ((child6 != null) ? child6.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s);", ((child6 != null) ? child6.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        TreeviewDataItem item = new TreeviewDataItem("setRemoveChild" + variableIndex);
        setRemoveChild.add(item);
        return item;
    }
    private String generateJSsetRemoveChild() {
        if (!setRemoveChild.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setRemoveChild) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> setRemoveChild1 = new ArrayList<>();

    /**
     * Removes data item's child.
     */
    public TreeviewDataItem removeChild(TreeviewDataItem child7) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            this.child6 = null;
            this.child7 = null;
            
            this.child7 = child7;
        } else {
            this.child7 = child7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child7.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".removeChild(%s);",  ((child7 != null) ? child7.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s);", ((child7 != null) ? child7.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        TreeviewDataItem item = new TreeviewDataItem("setRemoveChild1" + variableIndex);
        setRemoveChild1.add(item);
        return item;
    }
    private String generateJSsetRemoveChild1() {
        if (!setRemoveChild1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setRemoveChild1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number index1;
    private List<TreeviewDataItem> setRemoveChildAt = new ArrayList<>();

    /**
     * Removes child at the specified position.
     */
    public TreeviewDataItem removeChildAt(Number index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setRemoveChildAt" + ++variableIndex + " = " + jsBase + ".removeChildAt(%s);", index1));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChildAt(%s);", index1));
                js.setLength(0);
            }
        }
        TreeviewDataItem item = new TreeviewDataItem("setRemoveChildAt" + variableIndex);
        setRemoveChildAt.add(item);
        return item;
    }
    private String generateJSsetRemoveChildAt() {
        if (!setRemoveChildAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setRemoveChildAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String soughtField;
    private String search;
    private Number search1;
    private Boolean search2;
    private String comparisonFn;
    private List<TreeviewDataItem> setSearch = new ArrayList<>();

    /**
     * Performs a data search.
     */
    public TreeviewDataItem search(String soughtField, String search, String comparisonFn) {
        if (jsBase == null) {
            this.soughtField = soughtField;
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search = search;
            this.comparisonFn = comparisonFn;
        } else {
            this.soughtField = soughtField;
            this.search = search;
            this.comparisonFn = comparisonFn;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSearch" + ++variableIndex + " = " + jsBase + ".search(%s, %s, %s);", wrapQuotes(soughtField), wrapQuotes(search), wrapQuotes(comparisonFn)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %s, %s);", wrapQuotes(soughtField), wrapQuotes(search), wrapQuotes(comparisonFn)));
                js.setLength(0);
            }
        }
        TreeviewDataItem item = new TreeviewDataItem("setSearch" + variableIndex);
        setSearch.add(item);
        return item;
    }
    private String generateJSsetSearch() {
        if (!setSearch.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setSearch) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> setSearch1 = new ArrayList<>();

    /**
     * Performs a data search.
     */
    public TreeviewDataItem search(String soughtField, Number search1, String comparisonFn) {
        if (jsBase == null) {
            this.soughtField = soughtField;
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search1 = search1;
            this.comparisonFn = comparisonFn;
        } else {
            this.soughtField = soughtField;
            this.search1 = search1;
            this.comparisonFn = comparisonFn;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSearch1" + ++variableIndex + " = " + jsBase + ".search(%s, %s, %s);", wrapQuotes(soughtField), search1, wrapQuotes(comparisonFn)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %s, %s);", wrapQuotes(soughtField), search1, wrapQuotes(comparisonFn)));
                js.setLength(0);
            }
        }
        TreeviewDataItem item = new TreeviewDataItem("setSearch1" + variableIndex);
        setSearch1.add(item);
        return item;
    }
    private String generateJSsetSearch1() {
        if (!setSearch1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setSearch1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> setSearch2 = new ArrayList<>();

    /**
     * Performs a data search.
     */
    public TreeviewDataItem search(String soughtField, Boolean search2, String comparisonFn) {
        if (jsBase == null) {
            this.soughtField = soughtField;
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search2 = search2;
            this.comparisonFn = comparisonFn;
        } else {
            this.soughtField = soughtField;
            this.search2 = search2;
            this.comparisonFn = comparisonFn;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setSearch2" + ++variableIndex + " = " + jsBase + ".search(%s, %b, %s);", wrapQuotes(soughtField), search2, wrapQuotes(comparisonFn)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %b, %s);", wrapQuotes(soughtField), search2, wrapQuotes(comparisonFn)));
                js.setLength(0);
            }
        }
        TreeviewDataItem item = new TreeviewDataItem("setSearch2" + variableIndex);
        setSearch2.add(item);
        return item;
    }
    private String generateJSsetSearch2() {
        if (!setSearch2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setSearch2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String soughtField1;
    private String searchItems;
    private Number searchItems1;
    private Boolean searchItems2;
    private String comparisonFn1;

    /**
     * Performs a data item search.
     */
    public void searchItems(String soughtField1, String searchItems, String comparisonFn1) {
        if (jsBase == null) {
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems = searchItems;
            this.comparisonFn = null;
            this.comparisonFn1 = null;
            
            this.comparisonFn1 = comparisonFn1;
        } else {
            this.soughtField1 = soughtField1;
            this.searchItems = searchItems;
            this.comparisonFn1 = comparisonFn1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".searchItems(%s, %s, %s);", wrapQuotes(soughtField1), wrapQuotes(searchItems), wrapQuotes(comparisonFn1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%s, %s, %s);", wrapQuotes(soughtField1), wrapQuotes(searchItems), wrapQuotes(comparisonFn1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Performs a data item search.
     */
    public void searchItems(String soughtField1, Number searchItems1, String comparisonFn1) {
        if (jsBase == null) {
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems1 = searchItems1;
            this.comparisonFn = null;
            this.comparisonFn1 = null;
            
            this.comparisonFn1 = comparisonFn1;
        } else {
            this.soughtField1 = soughtField1;
            this.searchItems1 = searchItems1;
            this.comparisonFn1 = comparisonFn1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".searchItems(%s, %s, %s);", wrapQuotes(soughtField1), searchItems1, wrapQuotes(comparisonFn1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%s, %s, %s);", wrapQuotes(soughtField1), searchItems1, wrapQuotes(comparisonFn1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Performs a data item search.
     */
    public void searchItems(String soughtField1, Boolean searchItems2, String comparisonFn1) {
        if (jsBase == null) {
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems2 = searchItems2;
            this.comparisonFn = null;
            this.comparisonFn1 = null;
            
            this.comparisonFn1 = comparisonFn1;
        } else {
            this.soughtField1 = soughtField1;
            this.searchItems2 = searchItems2;
            this.comparisonFn1 = comparisonFn1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".searchItems(%s, %b, %s);", wrapQuotes(soughtField1), searchItems2, wrapQuotes(comparisonFn1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%s, %b, %s);", wrapQuotes(soughtField1), searchItems2, wrapQuotes(comparisonFn1)));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetGetChildAt() {
        if (!getGetChildAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : getGetChildAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetChildAt());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetAddChild());
        js.append(generateJSsetAddChild1());
        js.append(generateJSsetAddChild2());
        js.append(generateJSsetAddChildAt());
        js.append(generateJSsetAddChildAt1());
        js.append(generateJSsetAddChildAt2());
        js.append(generateJSsetRemoveChild());
        js.append(generateJSsetRemoveChild1());
        js.append(generateJSsetRemoveChildAt());
        js.append(generateJSsetSearch());
        js.append(generateJSsetSearch1());
        js.append(generateJSsetSearch2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}