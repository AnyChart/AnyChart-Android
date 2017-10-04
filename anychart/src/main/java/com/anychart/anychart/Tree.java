package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Tree extends CoreBase {

    private String jsBase;

    public Tree() {

    }

    protected Tree(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String child;

    public void setAddchild(String child) {
        if (jsBase == null) {
            this.child = child;
        } else {
            this.child = child;

            js.append(String.format(Locale.US, jsBase + ".addChild(%s);", child));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", child));
                js.setLength(0);
            }
        }
    }

    private String child1;
    private TreeDataItem child2;
    private TreeviewDataItem child3;
    private Double index;

    public void setAddchildat(String child1, Double index) {
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

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", child1, index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", child1, index));
                js.setLength(0);
            }
        }
    }


    public void setAddchildat(TreeDataItem child2, Double index) {
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

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", (child2 != null) ? child2.generateJs() : "null", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", (child2 != null) ? child2.generateJs() : "null", index));
                js.setLength(0);
            }
        }
    }


    public void setAddchildat(TreeviewDataItem child3, Double index) {
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

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", (child3 != null) ? child3.generateJs() : "null", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", (child3 != null) ? child3.generateJs() : "null", index));
                js.setLength(0);
            }
        }
    }

    private String data;
    private String data1;
    private TreeFillingMethod fillingMethod;
    private String fillingMethod1;
    private String csvSettingsOrDeps;
    private Dependency[] csvSettingsOrDeps1;

    public void setAdddata(String data, TreeFillingMethod fillingMethod, String csvSettingsOrDeps) {
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

            js.append(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, (fillingMethod != null) ? fillingMethod.generateJs() : "null", csvSettingsOrDeps));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, (fillingMethod != null) ? fillingMethod.generateJs() : "null", csvSettingsOrDeps));
                js.setLength(0);
            }
        }
    }


    public void setAdddata(String data, TreeFillingMethod fillingMethod, Dependency[] csvSettingsOrDeps1) {
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

            js.append(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, (fillingMethod != null) ? fillingMethod.generateJs() : "null", arrayToString(csvSettingsOrDeps1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, (fillingMethod != null) ? fillingMethod.generateJs() : "null", arrayToString(csvSettingsOrDeps1)));
                js.setLength(0);
            }
        }
    }


    public void setAdddata(String data, String fillingMethod1, String csvSettingsOrDeps) {
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

            js.append(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, fillingMethod1, csvSettingsOrDeps));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, fillingMethod1, csvSettingsOrDeps));
                js.setLength(0);
            }
        }
    }


    public void setAdddata(String data, String fillingMethod1, Dependency[] csvSettingsOrDeps1) {
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

            js.append(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, fillingMethod1, arrayToString(csvSettingsOrDeps1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addData(%s, %s, %s);", data, fillingMethod1, arrayToString(csvSettingsOrDeps1)));
                js.setLength(0);
            }
        }
    }

    private String field;
    private Boolean asString;

    public void setCreateindexon(String field, Boolean asString) {
        if (jsBase == null) {
            this.field = field;
            this.asString = asString;
        } else {
            this.field = field;
            this.asString = asString;

            js.append(String.format(Locale.US, jsBase + ".createIndexOn(%s, %b);", field, asString));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".createIndexOn(%s, %b);", field, asString));
                js.setLength(0);
            }
        }
    }

    private Boolean dispatchEvents;

    public void setDispatchevents(Boolean dispatchEvents) {
        if (jsBase == null) {
            this.dispatchEvents = dispatchEvents;
        } else {
            this.dispatchEvents = dispatchEvents;

            js.append(String.format(Locale.US, jsBase + ".dispatchEvents(%b);", dispatchEvents));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".dispatchEvents(%b);", dispatchEvents));
                js.setLength(0);
            }
        }
    }

    private Double index1;

    public void setGetchildat(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;

            js.append(String.format(Locale.US, jsBase + ".getChildAt(%f);", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getChildAt(%f);", index1));
                js.setLength(0);
            }
        }
    }

    private TreeDataItem getGetChildAt;

    public TreeDataItem getGetChildAt() {
        if (getGetChildAt == null)
            getGetChildAt = new TreeDataItem(jsBase + ".getChildAt()");

        return getGetChildAt;
    }

    private TreeDataItem child4;
    private TreeviewDataItem child5;

    public void setIndexofchild(TreeDataItem child4) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            
            this.child4 = child4;
        } else {
            this.child4 = child4;

            js.append(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child4 != null) ? child4.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child4 != null) ? child4.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setIndexofchild(TreeviewDataItem child5) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            
            this.child5 = child5;
        } else {
            this.child5 = child5;

            js.append(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child5 != null) ? child5.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child5 != null) ? child5.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private String mapping;

    public void setMapas(String mapping) {
        if (jsBase == null) {
            this.mapping = mapping;
        } else {
            this.mapping = mapping;

            js.append(String.format(Locale.US, jsBase + ".mapAs(%s);", mapping));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mapAs(%s);", mapping));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private TreeDataItem child6;

    public void setRemovechild(TreeDataItem child6) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            this.child6 = null;
            
            this.child6 = child6;
        } else {
            this.child6 = child6;

            js.append(String.format(Locale.US, jsBase + ".removeChild(%s);", (child6 != null) ? child6.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s);", (child6 != null) ? child6.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double index2;

    public void setRemovechildat(Double index2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.index2 = index2;

            js.append(String.format(Locale.US, jsBase + ".removeChildAt(%f);", index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChildAt(%f);", index2));
                js.setLength(0);
            }
        }
    }

    private String field1;

    public void setRemoveindexon(String field1) {
        if (jsBase == null) {
            this.field = null;
            this.field1 = null;
            
            this.field1 = field1;
        } else {
            this.field1 = field1;

            js.append(String.format(Locale.US, jsBase + ".removeIndexOn(%s);", field1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeIndexOn(%s);", field1));
                js.setLength(0);
            }
        }
    }

    private String soughtField;
    private String search;
    private Double search1;
    private Boolean search2;

    public void setSearch(String search, String soughtField) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search = search;
            this.soughtField = soughtField;
        } else {
            this.search = search;
            this.soughtField = soughtField;

            js.append(String.format(Locale.US, jsBase + ".search(%s, %s);", search, soughtField));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %s);", search, soughtField));
                js.setLength(0);
            }
        }
    }


    public void setSearch(Double search1, String soughtField) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search1 = search1;
            this.soughtField = soughtField;
        } else {
            this.search1 = search1;
            this.soughtField = soughtField;

            js.append(String.format(Locale.US, jsBase + ".search(%f, %s);", search1, soughtField));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%f, %s);", search1, soughtField));
                js.setLength(0);
            }
        }
    }


    public void setSearch(Boolean search2, String soughtField) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search2 = search2;
            this.soughtField = soughtField;
        } else {
            this.search2 = search2;
            this.soughtField = soughtField;

            js.append(String.format(Locale.US, jsBase + ".search(%b, %s);", search2, soughtField));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%b, %s);", search2, soughtField));
                js.setLength(0);
            }
        }
    }

    private String soughtField1;
    private String searchItems;
    private Double searchItems1;
    private Boolean searchItems2;

    public void setSearchitems(String searchItems, String soughtField1) {
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

            js.append(String.format(Locale.US, jsBase + ".searchItems(%s, %s);", searchItems, soughtField1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%s, %s);", searchItems, soughtField1));
                js.setLength(0);
            }
        }
    }


    public void setSearchitems(Double searchItems1, String soughtField1) {
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

            js.append(String.format(Locale.US, jsBase + ".searchItems(%f, %s);", searchItems1, soughtField1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%f, %s);", searchItems1, soughtField1));
                js.setLength(0);
            }
        }
    }


    public void setSearchitems(Boolean searchItems2, String soughtField1) {
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

            js.append(String.format(Locale.US, jsBase + ".searchItems(%b, %s);", searchItems2, soughtField1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%b, %s);", searchItems2, soughtField1));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
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

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSchild4() {
        if (child4 != null) {
            return String.format(Locale.US, "child: %s,", (child4 != null) ? child4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchild5() {
        if (child5 != null) {
            return String.format(Locale.US, "child: %s,", (child5 != null) ? child5.generateJs() : "null");
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
        }
        return "";
    }

    private String generateJSmapping() {
        if (mapping != null) {
            return String.format(Locale.US, "mapping: %s,", mapping);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSchild6() {
        if (child6 != null) {
            return String.format(Locale.US, "child: %s,", (child6 != null) ? child6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
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

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }


    @Override
    protected String generateJs() {
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
            js.append(generateJSindex1());
            js.append(generateJSchild4());
            js.append(generateJSchild5());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSmapping());
            js.append(generateJStype2());
            js.append(generateJSchild6());
            js.append(generateJSindex2());
            js.append(generateJSfield1());
            js.append(generateJSsoughtField());
            js.append(generateJSsearch());
            js.append(generateJSsearch1());
            js.append(generateJSsearch2());
            js.append(generateJSsoughtField1());
            js.append(generateJSsearchItems());
            js.append(generateJSsearchItems1());
            js.append(generateJSsearchItems2());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append("}");
        }
            js.append(generateJSgetGetChildAt());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}