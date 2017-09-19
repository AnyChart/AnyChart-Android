package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class TreeView extends JsObject {

    
    private TreeDataItem child;
    private TreeviewDataItem child1;

    public void setAddchild(TreeDataItem child) {
        this.child = null;
        this.child1 = null;
        
        this.child = child;
    }


    public void setAddchild(TreeviewDataItem child1) {
        this.child = null;
        this.child1 = null;
        
        this.child1 = child1;
    }

    private TreeDataItem child2;
    private TreeviewDataItem child3;
    private Double index;

    public void setAddchildat(TreeDataItem child2, Double index) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        
        this.child2 = child2;
        this.index = index;
    }


    public void setAddchildat(TreeviewDataItem child3, Double index) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        
        this.child3 = child3;
        this.index = index;
    }

    private String data;
    private String data1;
    private TreeFillingMethod fillMethodOrCsvMapping;
    private Dependency[] csvSettingsOrDeps;

    public void setAdddata(String data, TreeFillingMethod fillMethodOrCsvMapping, Dependency[] csvSettingsOrDeps) {
        this.data = null;
        this.data1 = null;
        
        this.data = data;
        this.fillMethodOrCsvMapping = fillMethodOrCsvMapping;
        this.csvSettingsOrDeps = csvSettingsOrDeps;
    }

    private Double index1;

    public void setGetchildat(Double index1) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }

    private TreeDataItem child4;
    private TreeviewDataItem child5;

    public void setIndexofchild(TreeDataItem child4) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        this.child4 = null;
        this.child5 = null;
        
        this.child4 = child4;
    }


    public void setIndexofchild(TreeviewDataItem child5) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        this.child4 = null;
        this.child5 = null;
        
        this.child5 = child5;
    }

    private TreeDataItem child6;
    private TreeviewDataItem child7;

    public void setRemovechild(TreeDataItem child6) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        this.child4 = null;
        this.child5 = null;
        this.child6 = null;
        this.child7 = null;
        
        this.child6 = child6;
    }


    public void setRemovechild(TreeviewDataItem child7) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        this.child4 = null;
        this.child5 = null;
        this.child6 = null;
        this.child7 = null;
        
        this.child7 = child7;
    }

    private Double index2;

    public void setRemovechildat(Double index2) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        
        this.index2 = index2;
    }

    private String soughtField;
    private String search;
    private Double search1;
    private Boolean search2;

    public void setSearch(String search, String soughtField) {
        this.search = null;
        this.search1 = null;
        this.search2 = null;
        
        this.search = search;
        this.soughtField = soughtField;
    }


    public void setSearch(Double search1, String soughtField) {
        this.search = null;
        this.search1 = null;
        this.search2 = null;
        
        this.search1 = search1;
        this.soughtField = soughtField;
    }


    public void setSearch(Boolean search2, String soughtField) {
        this.search = null;
        this.search1 = null;
        this.search2 = null;
        
        this.search2 = search2;
        this.soughtField = soughtField;
    }

    private String soughtField1;
    private String searchItems;
    private Double searchItems1;
    private Boolean searchItems2;

    public void setSearchitems(String searchItems, String soughtField1) {
        this.searchItems = null;
        this.searchItems1 = null;
        this.searchItems2 = null;
        
        this.searchItems = searchItems;
        this.soughtField = null;
        this.soughtField1 = null;
        
        this.soughtField1 = soughtField1;
    }


    public void setSearchitems(Double searchItems1, String soughtField1) {
        this.searchItems = null;
        this.searchItems1 = null;
        this.searchItems2 = null;
        
        this.searchItems1 = searchItems1;
        this.soughtField = null;
        this.soughtField1 = null;
        
        this.soughtField1 = soughtField1;
    }


    public void setSearchitems(Boolean searchItems2, String soughtField1) {
        this.searchItems = null;
        this.searchItems1 = null;
        this.searchItems2 = null;
        
        this.searchItems2 = searchItems2;
        this.soughtField = null;
        this.soughtField1 = null;
        
        this.soughtField1 = soughtField1;
    }

    private String generateJSchild() {
        if (child != null) {
            return String.format(Locale.US, "child: %s,", (child != null) ? child.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchild1() {
        if (child1 != null) {
            return String.format(Locale.US, "child: %s,", (child1 != null) ? child1.generateJs() : "null");
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

    private String generateJSfillMethodOrCsvMapping() {
        if (fillMethodOrCsvMapping != null) {
            return String.format(Locale.US, "fillMethodOrCsvMapping: %s,", (fillMethodOrCsvMapping != null) ? fillMethodOrCsvMapping.generateJs() : "null");
        }
        return "";
    }

    private String generateJScsvSettingsOrDeps() {
        if (csvSettingsOrDeps != null) {
            return String.format(Locale.US, "csvSettingsOrDeps: %s,", arrayToString(csvSettingsOrDeps));
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

    private String generateJSchild6() {
        if (child6 != null) {
            return String.format(Locale.US, "child: %s,", (child6 != null) ? child6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchild7() {
        if (child7 != null) {
            return String.format(Locale.US, "child: %s,", (child7 != null) ? child7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
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


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSchild());
        js.append(generateJSchild1());
        js.append(generateJSchild2());
        js.append(generateJSchild3());
        js.append(generateJSindex());
        js.append(generateJSdata());
        js.append(generateJSdata1());
        js.append(generateJSfillMethodOrCsvMapping());
        js.append(generateJScsvSettingsOrDeps());
        js.append(generateJSindex1());
        js.append(generateJSchild4());
        js.append(generateJSchild5());
        js.append(generateJSchild6());
        js.append(generateJSchild7());
        js.append(generateJSindex2());
        js.append(generateJSsoughtField());
        js.append(generateJSsearch());
        js.append(generateJSsearch1());
        js.append(generateJSsearch2());
        js.append(generateJSsoughtField1());
        js.append(generateJSsearchItems());
        js.append(generateJSsearchItems1());
        js.append(generateJSsearchItems2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}