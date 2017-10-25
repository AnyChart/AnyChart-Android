package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class TreeView extends CoreBase {

    public TreeView() {

    }

    protected TreeView(String jsBase) {
        this.jsBase = jsBase;
    }

    protected TreeView(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String child;
    private TreeDataItem child1;
    private TreeviewDataItem child2;

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

            js.append(String.format(Locale.US, jsBase + ".addChild(%s);", wrapQuotes(child)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s)", wrapQuotes(child)));
                js.setLength(0);
            }
        }
        return new TreeviewDataItem(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".addChild(%s);", ((child1 != null) ? child1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s)", ((child1 != null) ? child1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new TreeviewDataItem(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".addChild(%s);", ((child2 != null) ? child2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s)", ((child2 != null) ? child2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new TreeviewDataItem(jsBase);
    }

    private String child3;
    private TreeDataItem child4;
    private TreeviewDataItem child5;
    private Double index;

    public TreeviewDataItem addChildAt(String child3, Double index) {
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

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", wrapQuotes(child3), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f)", wrapQuotes(child3), index));
                js.setLength(0);
            }
        }
        return new TreeviewDataItem(jsBase);
    }


    public TreeviewDataItem addChildAt(TreeDataItem child4, Double index) {
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

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", ((child4 != null) ? child4.generateJs() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f)", ((child4 != null) ? child4.generateJs() : "null"), index));
                js.setLength(0);
            }
        }
        return new TreeviewDataItem(jsBase);
    }


    public TreeviewDataItem addChildAt(TreeviewDataItem child5, Double index) {
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

            js.append(String.format(Locale.US, jsBase + ".addChildAt(%s, %f);", ((child5 != null) ? child5.generateJs() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f)", ((child5 != null) ? child5.generateJs() : "null"), index));
                js.setLength(0);
            }
        }
        return new TreeviewDataItem(jsBase);
    }

    private String data;
    private String data1;
    private TreeFillingMethod fillMethodOrCsvMapping;
    private String fillMethodOrCsvMapping1;
    private String fillMethodOrCsvMapping2;
    private String csvSettingsOrDeps;
    private Dependency[] csvSettingsOrDeps1;

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
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), ((fillMethodOrCsvMapping != null) ? fillMethodOrCsvMapping.generateJs() : "null"), wrapQuotes(csvSettingsOrDeps)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), ((fillMethodOrCsvMapping != null) ? fillMethodOrCsvMapping.generateJs() : "null"), arrayToString(csvSettingsOrDeps1)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), wrapQuotes(fillMethodOrCsvMapping1), wrapQuotes(csvSettingsOrDeps)));
                js.setLength(0);
            }
        }
        return this;
    }


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
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), wrapQuotes(fillMethodOrCsvMapping1), arrayToString(csvSettingsOrDeps1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<TreeviewDataItem> getGetChildAt = new ArrayList<>();

    public TreeviewDataItem getGetChildAt(Double index) {
        TreeviewDataItem item = new TreeviewDataItem(jsBase + ".getChildAt(" + index + ")");
        getGetChildAt.add(item);
        return item;
    }

    private TreeDataItem child6;
    private TreeviewDataItem child7;

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

            js.append(String.format(Locale.US, jsBase + ".removeChild(%s);", ((child6 != null) ? child6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s)", ((child6 != null) ? child6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new TreeviewDataItem(jsBase);
    }


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

            js.append(String.format(Locale.US, jsBase + ".removeChild(%s);", ((child7 != null) ? child7.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s)", ((child7 != null) ? child7.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new TreeviewDataItem(jsBase);
    }

    private Double index1;

    public TreeviewDataItem removeChildAt(Double index1) {
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
        return new TreeviewDataItem(jsBase);
    }

    private String soughtField;
    private String search;
    private Double search1;
    private Boolean search2;
    private String comparisonFn;

    public TreeviewDataItem search(String search, String soughtField, String comparisonFn) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search = search;
            this.soughtField = soughtField;
            this.comparisonFn = comparisonFn;
        } else {
            this.search = search;
            this.soughtField = soughtField;
            this.comparisonFn = comparisonFn;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".search(%s, %s, %s);", wrapQuotes(search), wrapQuotes(soughtField), wrapQuotes(comparisonFn)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %s, %s)", wrapQuotes(search), wrapQuotes(soughtField), wrapQuotes(comparisonFn)));
                js.setLength(0);
            }
        }
        return new TreeviewDataItem(jsBase);
    }


    public TreeviewDataItem search(Double search1, String soughtField, String comparisonFn) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search1 = search1;
            this.soughtField = soughtField;
            this.comparisonFn = comparisonFn;
        } else {
            this.search1 = search1;
            this.soughtField = soughtField;
            this.comparisonFn = comparisonFn;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".search(%f, %s, %s);", search1, wrapQuotes(soughtField), wrapQuotes(comparisonFn)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%f, %s, %s)", search1, wrapQuotes(soughtField), wrapQuotes(comparisonFn)));
                js.setLength(0);
            }
        }
        return new TreeviewDataItem(jsBase);
    }


    public TreeviewDataItem search(Boolean search2, String soughtField, String comparisonFn) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search2 = search2;
            this.soughtField = soughtField;
            this.comparisonFn = comparisonFn;
        } else {
            this.search2 = search2;
            this.soughtField = soughtField;
            this.comparisonFn = comparisonFn;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".search(%b, %s, %s);", search2, wrapQuotes(soughtField), wrapQuotes(comparisonFn)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%b, %s, %s)", search2, wrapQuotes(soughtField), wrapQuotes(comparisonFn)));
                js.setLength(0);
            }
        }
        return new TreeviewDataItem(jsBase);
    }

    private String soughtField1;
    private String searchItems;
    private Double searchItems1;
    private Boolean searchItems2;
    private String comparisonFn1;

    public void searchItems(String searchItems, String soughtField1, String comparisonFn1) {
        if (jsBase == null) {
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems = searchItems;
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
            this.comparisonFn = null;
            this.comparisonFn1 = null;
            
            this.comparisonFn1 = comparisonFn1;
        } else {
            this.searchItems = searchItems;
            this.soughtField1 = soughtField1;
            this.comparisonFn1 = comparisonFn1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".searchItems(%s, %s, %s);", wrapQuotes(searchItems), wrapQuotes(soughtField1), wrapQuotes(comparisonFn1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%s, %s, %s)", wrapQuotes(searchItems), wrapQuotes(soughtField1), wrapQuotes(comparisonFn1)));
                js.setLength(0);
            }
        }
    }


    public void searchItems(Double searchItems1, String soughtField1, String comparisonFn1) {
        if (jsBase == null) {
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems1 = searchItems1;
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
            this.comparisonFn = null;
            this.comparisonFn1 = null;
            
            this.comparisonFn1 = comparisonFn1;
        } else {
            this.searchItems1 = searchItems1;
            this.soughtField1 = soughtField1;
            this.comparisonFn1 = comparisonFn1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".searchItems(%f, %s, %s);", searchItems1, wrapQuotes(soughtField1), wrapQuotes(comparisonFn1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%f, %s, %s)", searchItems1, wrapQuotes(soughtField1), wrapQuotes(comparisonFn1)));
                js.setLength(0);
            }
        }
    }


    public void searchItems(Boolean searchItems2, String soughtField1, String comparisonFn1) {
        if (jsBase == null) {
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems2 = searchItems2;
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
            this.comparisonFn = null;
            this.comparisonFn1 = null;
            
            this.comparisonFn1 = comparisonFn1;
        } else {
            this.searchItems2 = searchItems2;
            this.soughtField1 = soughtField1;
            this.comparisonFn1 = comparisonFn1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".searchItems(%b, %s, %s);", searchItems2, wrapQuotes(soughtField1), wrapQuotes(comparisonFn1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%b, %s, %s)", searchItems2, wrapQuotes(soughtField1), wrapQuotes(comparisonFn1)));
                js.setLength(0);
            }
        }
    }


//
//    private String generateJSTreeviewDataItem getGetChildAt() {
//        if (TreeviewDataItem getGetChildAt != null) {
//            return TreeviewDataItem getGetChildAt.generateJs();
//        }
//        return "";
//    }
//
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
//            js.append(generateJSchild4());
////        
//            js.append(generateJSchild5());
////        
//            js.append(generateJSindex());
////        
//            js.append(generateJSdata());
////        
//            js.append(generateJSdata1());
////        
//            js.append(generateJSfillMethodOrCsvMapping());
////        
//            js.append(generateJSfillMethodOrCsvMapping1());
////        
//            js.append(generateJSfillMethodOrCsvMapping2());
////        
//            js.append(generateJScsvSettingsOrDeps());
////        
//            js.append(generateJScsvSettingsOrDeps1());
////        
//            js.append(generateJSchild6());
////        
//            js.append(generateJSchild7());
////        
//            js.append(generateJSindex1());
////        
//            js.append(generateJSsoughtField());
////        
//            js.append(generateJSsearch());
////        
//            js.append(generateJSsearch1());
////        
//            js.append(generateJSsearch2());
////        
//            js.append(generateJScomparisonFn());
////        
//            js.append(generateJSsoughtField1());
////        
//            js.append(generateJSsearchItems());
////        
//            js.append(generateJSsearchItems1());
////        
//            js.append(generateJSsearchItems2());
////        
//            js.append(generateJScomparisonFn1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}