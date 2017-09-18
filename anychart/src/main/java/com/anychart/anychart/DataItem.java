package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class DataItem extends JsObject {

    
    private DataItem child;
    private DataItem child1;

    public void setAddchild(DataItem child) {
        this.child = null;
        this.child1 = null;
        
        this.child = child;
    }

    private DataItem child2;
    private DataItem child3;
    private Double index;

    public void setAddchildat(DataItem child2, Double index) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        
        this.child2 = child2;
        this.index = index;
    }

    private Double index1;

    public void setGetchildat(Double index1) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }

    private DataItem child4;
    private DataItem child5;

    public void setIndexofchild(DataItem child4) {
        this.child = null;
        this.child1 = null;
        this.child2 = null;
        this.child3 = null;
        this.child4 = null;
        this.child5 = null;
        
        this.child4 = child4;
    }

    private String key;

    public void setMeta(String key) {
        this.key = key;
    }

    private String key1;
    private DataItem child6;
    private DataItem child7;

    public void setRemovechild(DataItem child6) {
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

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSkey1() {
        if (key1 != null) {
            return String.format(Locale.US, "key: %s,", key1);
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


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSchild());
        js.append(generateJSchild1());
        js.append(generateJSchild2());
        js.append(generateJSchild3());
        js.append(generateJSindex());
        js.append(generateJSindex1());
        js.append(generateJSchild4());
        js.append(generateJSchild5());
        js.append(generateJSkey());
        js.append(generateJSkey1());
        js.append(generateJSchild6());
        js.append(generateJSchild7());
        js.append(generateJSindex2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}