package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class TreeDataItem extends JsObject {

    
    private TreeDataItem child;

    public void setAddchild(TreeDataItem child) {
        this.child = child;
    }

    private TreeDataItem child1;
    private TreeviewDataItem child2;
    private Double index;

    public void setAddchildat(TreeDataItem child1, Double index) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        
        this.child1 = child1;
        this.index = index;
    }


    public void setAddchildat(TreeviewDataItem child2, Double index) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        
        this.child2 = child2;
        this.index = index;
    }

    private String key;

    public void setGet(String key) {
        this.key = key;
    }

    private Double index1;

    public void setGetchildat(Double index1) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }

    private TreeDataItem child3;
    private TreeviewDataItem child4;

    public void setIndexofchild(TreeDataItem child3) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        this.child4 = null;
        
        this.child3 = child3;
    }


    public void setIndexofchild(TreeviewDataItem child4) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        this.child4 = null;
        
        this.child4 = child4;
    }

    private String key1;

    public void setMeta(String key1) {
        this.key = null;
        this.key1 = null;
        
        this.key1 = key1;
    }

    private String key2;
    private TreeDataItem child5;

    public void setRemovechild(TreeDataItem child5) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        this.child4 = null;
        this.child5 = null;
        
        this.child5 = child5;
    }

    private Double index2;

    public void setRemovechildat(Double index2) {
        this.index = null;
        this.index1 = null;
        this.index2 = null;
        
        this.index2 = index2;
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

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSchild3() {
        if (child3 != null) {
            return String.format(Locale.US, "child: %s,", (child3 != null) ? child3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchild4() {
        if (child4 != null) {
            return String.format(Locale.US, "child: %s,", (child4 != null) ? child4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkey1() {
        if (key1 != null) {
            return String.format(Locale.US, "key: %s,", key1);
        }
        return "";
    }

    private String generateJSkey2() {
        if (key2 != null) {
            return String.format(Locale.US, "key: %s,", key2);
        }
        return "";
    }

    private String generateJSchild5() {
        if (child5 != null) {
            return String.format(Locale.US, "child: %s,", (child5 != null) ? child5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSchild());
        js.append(generateJSchild1());
        js.append(generateJSchild2());
        js.append(generateJSindex());
        js.append(generateJSkey());
        js.append(generateJSindex1());
        js.append(generateJSchild3());
        js.append(generateJSchild4());
        js.append(generateJSkey1());
        js.append(generateJSkey2());
        js.append(generateJSchild5());
        js.append(generateJSindex2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}