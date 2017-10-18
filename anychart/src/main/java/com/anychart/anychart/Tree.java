package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Tree extends CoreBase {

    public Tree() {

    }

    protected Tree(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Tree(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String child;

    public TreeDataItem addChild(String child) {
        if (jsBase == null) {
            this.child = child;
        } else {
            this.child = child;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".addChild(%s);", child));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s)", child));
                js.setLength(0);
            }
        }
        return new TreeDataItem(jsBase);
    }

    private String child1;
    private TreeDataItem child2;
    private TreeviewDataItem child3;
    private Double index;

    public TreeDataItem addChildAt(String child1, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            
            this.child1 = child1;
            this.index = index;
        } else {
            this.child1 = child1;
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", child1, index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f)", child1, index));
                js.setLength(0);
            }
        }
        return new TreeDataItem(jsBase);
    }


    public TreeDataItem addChildAt(TreeDataItem child2, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            
            this.child2 = child2;
            this.index = index;
        } else {
            this.child2 = child2;
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", (child2 != null) ? child2.generateJs() : "null", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f)", (child2 != null) ? child2.generateJs() : "null", index));
                js.setLength(0);
            }
        }
        return new TreeDataItem(jsBase);
    }


    public TreeDataItem addChildAt(TreeviewDataItem child3, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            
            this.child3 = child3;
            this.index = index;
        } else {
            this.child3 = child3;
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", (child3 != null) ? child3.generateJs() : "null", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f)", (child3 != null) ? child3.generateJs() : "null", index));
                js.setLength(0);
            }
        }
        return new TreeDataItem(jsBase);
    }

    private String data;
    private String data1;
    private TreeFillingMethod fillingMethod;
    private String fillingMethod1;
    private String csvSettingsOrDeps;
    private Dependency[] csvSettingsOrDeps1;

    public Tree addData(String data, TreeFillingMethod fillingMethod, String csvSettingsOrDeps) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillingMethod = null;
            this.fillingMethod1 = null;
            
            this.fillingMethod = fillingMethod;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps = csvSettingsOrDeps;
        } else {
            this.data = data;
            this.fillingMethod = fillingMethod;
            this.csvSettingsOrDeps = csvSettingsOrDeps;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", data, (fillingMethod != null) ? fillingMethod.generateJs() : "null", csvSettingsOrDeps));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", data, (fillingMethod != null) ? fillingMethod.generateJs() : "null", csvSettingsOrDeps));
                js.setLength(0);
            }
        }
        return this;
    }


    public Tree addData(String data, TreeFillingMethod fillingMethod, Dependency[] csvSettingsOrDeps1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillingMethod = null;
            this.fillingMethod1 = null;
            
            this.fillingMethod = fillingMethod;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
        } else {
            this.data = data;
            this.fillingMethod = fillingMethod;
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", data, (fillingMethod != null) ? fillingMethod.generateJs() : "null", arrayToString(csvSettingsOrDeps1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", data, (fillingMethod != null) ? fillingMethod.generateJs() : "null", arrayToString(csvSettingsOrDeps1)));
                js.setLength(0);
            }
        }
        return this;
    }


    public Tree addData(String data, String fillingMethod1, String csvSettingsOrDeps) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillingMethod = null;
            this.fillingMethod1 = null;
            
            this.fillingMethod1 = fillingMethod1;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps = csvSettingsOrDeps;
        } else {
            this.data = data;
            this.fillingMethod1 = fillingMethod1;
            this.csvSettingsOrDeps = csvSettingsOrDeps;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", data, fillingMethod1, csvSettingsOrDeps));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", data, fillingMethod1, csvSettingsOrDeps));
                js.setLength(0);
            }
        }
        return this;
    }


    public Tree addData(String data, String fillingMethod1, Dependency[] csvSettingsOrDeps1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillingMethod = null;
            this.fillingMethod1 = null;
            
            this.fillingMethod1 = fillingMethod1;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
        } else {
            this.data = data;
            this.fillingMethod1 = fillingMethod1;
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", data, fillingMethod1, arrayToString(csvSettingsOrDeps1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", data, fillingMethod1, arrayToString(csvSettingsOrDeps1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String field;
    private Boolean asString;

    public Tree createIndexOn(String field, Boolean asString) {
        if (jsBase == null) {
            this.field = field;
            this.asString = asString;
        } else {
            this.field = field;
            this.asString = asString;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".createIndexOn(%s, %b)", field, asString));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".createIndexOn(%s, %b)", field, asString));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean dispatchEvents;

    public Tree dispatchEvents(Boolean dispatchEvents) {
        if (jsBase == null) {
            this.dispatchEvents = dispatchEvents;
        } else {
            this.dispatchEvents = dispatchEvents;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".dispatchEvents(%b)", dispatchEvents));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dispatchEvents(%b)", dispatchEvents));
                js.setLength(0);
            }
        }
        return this;
    }

    private TreeDataItem getGetChildAt;

    public TreeDataItem getGetChildAt() {
        if (getGetChildAt == null)
            getGetChildAt = new TreeDataItem(jsBase + ".getChildAt()");

        return getGetChildAt;
    }

    private String mapping;

    public TreeView mapAs(String mapping) {
        if (jsBase == null) {
            this.mapping = mapping;
        } else {
            this.mapping = mapping;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".mapAs(%s);", mapping));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mapAs(%s)", mapping));
                js.setLength(0);
            }
        }
        return new TreeView(jsBase);
    }

    private TreeDataItem child4;

    public TreeDataItem removeChild(TreeDataItem child4) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            
            this.child4 = child4;
        } else {
            this.child4 = child4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".removeChild(%s);", (child4 != null) ? child4.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s)", (child4 != null) ? child4.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return new TreeDataItem(jsBase);
    }

    private Double index1;

    public TreeDataItem removeChildAt(Double index1) {
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

            js.append(String.format(Locale.US, jsBase + ".removeChildAt(%f);", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChildAt(%f)", index1));
                js.setLength(0);
            }
        }
        return new TreeDataItem(jsBase);
    }

    private String field1;

    public Tree removeIndexOn(String field1) {
        if (jsBase == null) {
            this.field = null;
            this.field1 = null;
            
            this.field1 = field1;
        } else {
            this.field1 = field1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".removeIndexOn(%s)", field1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeIndexOn(%s)", field1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String soughtField;
    private String search;
    private Double search1;
    private Boolean search2;

    public TreeDataItem search(String search, String soughtField) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search = search;
            this.soughtField = soughtField;
        } else {
            this.search = search;
            this.soughtField = soughtField;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".search(%s, %s);", search, soughtField));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %s)", search, soughtField));
                js.setLength(0);
            }
        }
        return new TreeDataItem(jsBase);
    }


    public TreeDataItem search(Double search1, String soughtField) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search1 = search1;
            this.soughtField = soughtField;
        } else {
            this.search1 = search1;
            this.soughtField = soughtField;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".search(%f, %s);", search1, soughtField));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%f, %s)", search1, soughtField));
                js.setLength(0);
            }
        }
        return new TreeDataItem(jsBase);
    }


    public TreeDataItem search(Boolean search2, String soughtField) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search2 = search2;
            this.soughtField = soughtField;
        } else {
            this.search2 = search2;
            this.soughtField = soughtField;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".search(%b, %s);", search2, soughtField));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%b, %s)", search2, soughtField));
                js.setLength(0);
            }
        }
        return new TreeDataItem(jsBase);
    }

    private String soughtField1;
    private String searchItems;
    private Double searchItems1;
    private Boolean searchItems2;

    public void searchItems(String searchItems, String soughtField1) {
        if (jsBase == null) {
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems = searchItems;
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
        } else {
            this.searchItems = searchItems;
            this.soughtField1 = soughtField1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".searchItems(%s, %s);", searchItems, soughtField1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%s, %s)", searchItems, soughtField1));
                js.setLength(0);
            }
        }
    }


    public void searchItems(Double searchItems1, String soughtField1) {
        if (jsBase == null) {
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems1 = searchItems1;
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
        } else {
            this.searchItems1 = searchItems1;
            this.soughtField1 = soughtField1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".searchItems(%f, %s);", searchItems1, soughtField1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%f, %s)", searchItems1, soughtField1));
                js.setLength(0);
            }
        }
    }


    public void searchItems(Boolean searchItems2, String soughtField1) {
        if (jsBase == null) {
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems2 = searchItems2;
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
        } else {
            this.searchItems2 = searchItems2;
            this.soughtField1 = soughtField1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".searchItems(%b, %s);", searchItems2, soughtField1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%b, %s)", searchItems2, soughtField1));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetGetChildAt() {
        if (getGetChildAt != null) {
            return getGetChildAt.generateJs();
        }
        return "";
    }

    private String generateJSchild() {
        if (child != null) {
            return String.format(Locale.US, "child: %s,", child);
        }
        return "";
    }

    private String generateJSchild1() {
        if (child1 != null) {
            return String.format(Locale.US, "child: %s,", child1);
        }
        return "";
    }

    private String generateJSchild2() {
        if (child2 != null) {
            return String.format(Locale.US, "child: %s,", (child2 != null) ? child2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchild3() {
        if (child3 != null) {
            return String.format(Locale.US, "child: %s,", (child3 != null) ? child3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSdata() {
        if (data != null) {
            return String.format(Locale.US, "data: %s,", data);
        }
        return "";
    }

    private String generateJSdata1() {
        if (data1 != null) {
            return String.format(Locale.US, "data: %s,", data1);
        }
        return "";
    }

    private String generateJSfillingMethod() {
        if (fillingMethod != null) {
            return String.format(Locale.US, "fillingMethod: %s,", (fillingMethod != null) ? fillingMethod.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfillingMethod1() {
        if (fillingMethod1 != null) {
            return String.format(Locale.US, "fillingMethod: %s,", fillingMethod1);
        }
        return "";
    }

    private String generateJScsvSettingsOrDeps() {
        if (csvSettingsOrDeps != null) {
            return String.format(Locale.US, "csvSettingsOrDeps: %s,", csvSettingsOrDeps);
        }
        return "";
    }

    private String generateJScsvSettingsOrDeps1() {
        if (csvSettingsOrDeps1 != null) {
            return String.format(Locale.US, "csvSettingsOrDeps: %s,", arrayToString(csvSettingsOrDeps1));
        }
        return "";
    }

    private String generateJSfield() {
        if (field != null) {
            return String.format(Locale.US, "field: %s,", field);
        }
        return "";
    }

    private String generateJSasString() {
        if (asString != null) {
            return String.format(Locale.US, "asString: %b,", asString);
        }
        return "";
    }

    private String generateJSdispatchEvents() {
        if (dispatchEvents != null) {
            return String.format(Locale.US, "dispatchEvents: %b,", dispatchEvents);
        }
        return "";
    }

    private String generateJSmapping() {
        if (mapping != null) {
            return String.format(Locale.US, "mapping: %s,", mapping);
        }
        return "";
    }

    private String generateJSchild4() {
        if (child4 != null) {
            return String.format(Locale.US, "child: %s,", (child4 != null) ? child4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSfield1() {
        if (field1 != null) {
            return String.format(Locale.US, "field: %s,", field1);
        }
        return "";
    }

    private String generateJSsoughtField() {
        if (soughtField != null) {
            return String.format(Locale.US, "soughtField: %s,", soughtField);
        }
        return "";
    }

    private String generateJSsearch() {
        if (search != null) {
            return String.format(Locale.US, "search: %s,", search);
        }
        return "";
    }

    private String generateJSsearch1() {
        if (search1 != null) {
            return String.format(Locale.US, "search: %f,", search1);
        }
        return "";
    }

    private String generateJSsearch2() {
        if (search2 != null) {
            return String.format(Locale.US, "search: %b,", search2);
        }
        return "";
    }

    private String generateJSsoughtField1() {
        if (soughtField1 != null) {
            return String.format(Locale.US, "soughtField: %s,", soughtField1);
        }
        return "";
    }

    private String generateJSsearchItems() {
        if (searchItems != null) {
            return String.format(Locale.US, "searchItems: %s,", searchItems);
        }
        return "";
    }

    private String generateJSsearchItems1() {
        if (searchItems1 != null) {
            return String.format(Locale.US, "searchItems: %f,", searchItems1);
        }
        return "";
    }

    private String generateJSsearchItems2() {
        if (searchItems2 != null) {
            return String.format(Locale.US, "searchItems: %b,", searchItems2);
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSchild());
            js.append(generateJSchild1());
            js.append(generateJSchild2());
            js.append(generateJSchild3());
            js.append(generateJSindex());
            js.append(generateJSdata());
            js.append(generateJSdata1());
            js.append(generateJSfillingMethod());
            js.append(generateJSfillingMethod1());
            js.append(generateJScsvSettingsOrDeps());
            js.append(generateJScsvSettingsOrDeps1());
            js.append(generateJSfield());
            js.append(generateJSasString());
            js.append(generateJSdispatchEvents());
            js.append(generateJSmapping());
            js.append(generateJSchild4());
            js.append(generateJSindex1());
            js.append(generateJSfield1());
            js.append(generateJSsoughtField());
            js.append(generateJSsearch());
            js.append(generateJSsearch1());
            js.append(generateJSsearch2());
            js.append(generateJSsoughtField1());
            js.append(generateJSsearchItems());
            js.append(generateJSsearchItems1());
            js.append(generateJSsearchItems2());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}