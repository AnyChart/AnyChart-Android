package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Tree extends JsObject {

    
    private TreeDataItem child;
    private TreeviewDataItem child1;
    private Double index;

    public void setAddchildat(TreeDataItem child, Double index) {
        this.child = null;
        this.child1 = null;
        
        this.child = child;
        this.index = index;
    }


    public void setAddchildat(TreeviewDataItem child1, Double index) {
        this.child = null;
        this.child1 = null;
        
        this.child1 = child1;
        this.index = index;
    }

    private String data;
    private String data1;
    private TreeFillingMethod fillingMethod;
    private String fillingMethod1;
    private Dependency[] csvSettingsOrDeps;

    public void setAdddata(String data, TreeFillingMethod fillingMethod, Dependency[] csvSettingsOrDeps) {
        this.data = null;
        this.data1 = null;
        
        this.data = data;
        this.fillingMethod = null;
        this.fillingMethod1 = null;
        
        this.fillingMethod = fillingMethod;
        this.csvSettingsOrDeps = csvSettingsOrDeps;
    }


    public void setAdddata(String data, String fillingMethod1, Dependency[] csvSettingsOrDeps) {
        this.data = null;
        this.data1 = null;
        
        this.data = data;
        this.fillingMethod = null;
        this.fillingMethod1 = null;
        
        this.fillingMethod1 = fillingMethod1;
        this.csvSettingsOrDeps = csvSettingsOrDeps;
    }

    private String field;
    private Boolean asString;

    public void setCreateindexon(String field, Boolean asString) {
        this.field = field;
        this.asString = asString;
    }

    private Boolean dispatchEvents;

    public void setDispatchevents(Boolean dispatchEvents) {
        this.dispatchEvents = dispatchEvents;
    }

    private Double index1;

    public void setGetchildat(Double index1) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }

    private TreeDataItem child2;
    private TreeviewDataItem child3;

    public void setIndexofchild(TreeDataItem child2) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        
        this.child2 = child2;
    }


    public void setIndexofchild(TreeviewDataItem child3) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        
        this.child3 = child3;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private TreeDataItem child4;

    public void setRemovechild(TreeDataItem child4) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        this.child4 = null;
        
        this.child4 = child4;
    }

    private Double index2;

    public void setRemovechildat(Double index2) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        
        this.index2 = index2;
    }

    private String field1;

    public void setRemoveindexon(String field1) {
        this.field = null;
        this.field1 = null;
        
        this.field1 = field1;
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

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
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
            return String.format(Locale.US, "csvSettingsOrDeps: %s,", arrayToString(csvSettingsOrDeps));
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

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSchild4() {
        if (child4 != null) {
            return String.format(Locale.US, "child: %s,", (child4 != null) ? child4.generateJs() : "null");
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


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSchild());
        js.append(generateJSchild1());
        js.append(generateJSindex());
        js.append(generateJSdata());
        js.append(generateJSdata1());
        js.append(generateJSfillingMethod());
        js.append(generateJSfillingMethod1());
        js.append(generateJScsvSettingsOrDeps());
        js.append(generateJSfield());
        js.append(generateJSasString());
        js.append(generateJSdispatchEvents());
        js.append(generateJSindex1());
        js.append(generateJSchild2());
        js.append(generateJSchild3());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJStype2());
        js.append(generateJSchild4());
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

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}