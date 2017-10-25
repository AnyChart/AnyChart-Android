package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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

            js.append(String.format(Locale.US, jsBase + ".addChild(%s);", wrapQuotes(child)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s)", wrapQuotes(child)));
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

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", wrapQuotes(child1), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f)", wrapQuotes(child1), index));
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

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", ((child2 != null) ? child2.generateJs() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f)", ((child2 != null) ? child2.generateJs() : "null"), index));
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

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", ((child3 != null) ? child3.generateJs() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f)", ((child3 != null) ? child3.generateJs() : "null"), index));
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

            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), ((fillingMethod != null) ? fillingMethod.generateJs() : "null"), wrapQuotes(csvSettingsOrDeps)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), ((fillingMethod != null) ? fillingMethod.generateJs() : "null"), wrapQuotes(csvSettingsOrDeps)));
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

            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), ((fillingMethod != null) ? fillingMethod.generateJs() : "null"), arrayToString(csvSettingsOrDeps1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), ((fillingMethod != null) ? fillingMethod.generateJs() : "null"), arrayToString(csvSettingsOrDeps1)));
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

            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), wrapQuotes(fillingMethod1), wrapQuotes(csvSettingsOrDeps)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), wrapQuotes(fillingMethod1), wrapQuotes(csvSettingsOrDeps)));
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

            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), wrapQuotes(fillingMethod1), arrayToString(csvSettingsOrDeps1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), wrapQuotes(fillingMethod1), arrayToString(csvSettingsOrDeps1)));
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

            js.append(String.format(Locale.US, ".createIndexOn(%s, %b)", wrapQuotes(field), asString));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".createIndexOn(%s, %b)", wrapQuotes(field), asString));
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

    private List<TreeDataItem> getGetChildAt = new ArrayList<>();

    public TreeDataItem getGetChildAt(Double index) {
        TreeDataItem item = new TreeDataItem(jsBase + ".getChildAt(" + index + ")");
        getGetChildAt.add(item);
        return item;
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

            js.append(String.format(Locale.US, jsBase + ".mapAs(%s);", wrapQuotes(mapping)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mapAs(%s)", wrapQuotes(mapping)));
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

            js.append(String.format(Locale.US, jsBase + ".removeChild(%s);", ((child4 != null) ? child4.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s)", ((child4 != null) ? child4.generateJs() : "null")));
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

            js.append(String.format(Locale.US, ".removeIndexOn(%s)", wrapQuotes(field1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeIndexOn(%s)", wrapQuotes(field1)));
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

            js.append(String.format(Locale.US, jsBase + ".search(%s, %s);", wrapQuotes(search), wrapQuotes(soughtField)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %s)", wrapQuotes(search), wrapQuotes(soughtField)));
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

            js.append(String.format(Locale.US, jsBase + ".search(%f, %s);", search1, wrapQuotes(soughtField)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%f, %s)", search1, wrapQuotes(soughtField)));
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

            js.append(String.format(Locale.US, jsBase + ".search(%b, %s);", search2, wrapQuotes(soughtField)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%b, %s)", search2, wrapQuotes(soughtField)));
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

            js.append(String.format(Locale.US, jsBase + ".searchItems(%s, %s);", wrapQuotes(searchItems), wrapQuotes(soughtField1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%s, %s)", wrapQuotes(searchItems), wrapQuotes(soughtField1)));
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

            js.append(String.format(Locale.US, jsBase + ".searchItems(%f, %s);", searchItems1, wrapQuotes(soughtField1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%f, %s)", searchItems1, wrapQuotes(soughtField1)));
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

            js.append(String.format(Locale.US, jsBase + ".searchItems(%b, %s);", searchItems2, wrapQuotes(soughtField1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%b, %s)", searchItems2, wrapQuotes(soughtField1)));
                js.setLength(0);
            }
        }
    }


//
//    private String generateJSTreeDataItem getGetChildAt() {
//        if (TreeDataItem getGetChildAt != null) {
//            return TreeDataItem getGetChildAt.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetGetChildAt() {
        if (!getGetChildAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeDataItem item : getGetChildAt) {
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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSchild());
////        
//            js.append(generateJSchild1());
////        
//            js.append(generateJSchild2());
////        
//            js.append(generateJSchild3());
////        
//            js.append(generateJSindex());
////        
//            js.append(generateJSdata());
////        
//            js.append(generateJSdata1());
////        
//            js.append(generateJSfillingMethod());
////        
//            js.append(generateJSfillingMethod1());
////        
//            js.append(generateJScsvSettingsOrDeps());
////        
//            js.append(generateJScsvSettingsOrDeps1());
////        
//            js.append(generateJSfield());
////        
//            js.append(generateJSasString());
////        
//            js.append(generateJSdispatchEvents());
////        
//            js.append(generateJSmapping());
////        
//            js.append(generateJSchild4());
////        
//            js.append(generateJSindex1());
////        
//            js.append(generateJSfield1());
////        
//            js.append(generateJSsoughtField());
////        
//            js.append(generateJSsearch());
////        
//            js.append(generateJSsearch1());
////        
//            js.append(generateJSsearch2());
////        
//            js.append(generateJSsoughtField1());
////        
//            js.append(generateJSsearchItems());
////        
//            js.append(generateJSsearchItems1());
////        
//            js.append(generateJSsearchItems2());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}