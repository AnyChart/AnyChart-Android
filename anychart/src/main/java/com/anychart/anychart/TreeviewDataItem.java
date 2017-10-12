package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class TreeviewDataItem extends JsObject {

    public TreeviewDataItem() {

    }

    protected TreeviewDataItem(String jsBase) {
        this.jsBase = jsBase;
    }

    protected TreeviewDataItem(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String child;
    private TreeDataItem child1;
    private TreeviewDataItem child2;

    public TreeviewDataItem setAddChild(String child) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child = child;
        } else {
            this.child = child;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChild(%s)", child));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChild(%s)", child));
                js.setLength(0);
            }
        }
        return this;
    }


    public TreeviewDataItem setAddChild(TreeDataItem child1) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child1 = child1;
        } else {
            this.child1 = child1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChild(%s)", (child1 != null) ? child1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChild(%s)", (child1 != null) ? child1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public TreeviewDataItem setAddChild(TreeviewDataItem child2) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child2 = child2;
        } else {
            this.child2 = child2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChild(%s)", (child2 != null) ? child2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChild(%s)", (child2 != null) ? child2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private String child3;
    private TreeDataItem child4;
    private TreeviewDataItem child5;
    private Double index;

    public TreeviewDataItem setAddChildAt(String child3, Double index) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", child3, index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", child3, index));
                js.setLength(0);
            }
        }
        return this;
    }


    public TreeviewDataItem setAddChildAt(TreeDataItem child4, Double index) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", (child4 != null) ? child4.generateJs() : "null", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", (child4 != null) ? child4.generateJs() : "null", index));
                js.setLength(0);
            }
        }
        return this;
    }


    public TreeviewDataItem setAddChildAt(TreeviewDataItem child5, Double index) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", (child5 != null) ? child5.generateJs() : "null", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", (child5 != null) ? child5.generateJs() : "null", index));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index1;

    public TreeviewDataItem setGetChildAt(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".getChildAt(%f)", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".getChildAt(%f)", index1));
                js.setLength(0);
            }
        }
        return this;
    }

    private TreeviewDataItem getGetChildAt;

    public TreeviewDataItem getGetChildAt() {
        if (getGetChildAt == null)
            getGetChildAt = new TreeviewDataItem(jsBase + ".getChildAt()");

        return getGetChildAt;
    }

    private TreeviewDataItem getGetParent;

    public TreeviewDataItem getGetParent() {
        if (getGetParent == null)
            getGetParent = new TreeviewDataItem(jsBase + ".getParent()");

        return getGetParent;
    }

    private TreeDataItem child6;
    private TreeviewDataItem child7;

    public void setIndexOfChild(TreeDataItem child6) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child6 != null) ? child6.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".indexOfChild(%s)", (child6 != null) ? child6.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setIndexOfChild(TreeviewDataItem child7) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child7 != null) ? child7.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".indexOfChild(%s)", (child7 != null) ? child7.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setMeta(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".meta(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".meta(%s)", key));
                js.setLength(0);
            }
        }
    }

    private String key1;
    private TreeDataItem child8;
    private TreeviewDataItem child9;

    public TreeviewDataItem setRemoveChild(TreeDataItem child8) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            this.child6 = null;
            this.child7 = null;
            this.child8 = null;
            this.child9 = null;
            
            this.child8 = child8;
        } else {
            this.child8 = child8;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".removeChild(%s)", (child8 != null) ? child8.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeChild(%s)", (child8 != null) ? child8.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public TreeviewDataItem setRemoveChild(TreeviewDataItem child9) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            this.child6 = null;
            this.child7 = null;
            this.child8 = null;
            this.child9 = null;
            
            this.child9 = child9;
        } else {
            this.child9 = child9;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".removeChild(%s)", (child9 != null) ? child9.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeChild(%s)", (child9 != null) ? child9.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index2;

    public TreeviewDataItem setRemoveChildAt(Double index2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.index2 = index2;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".removeChildAt(%f)", index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeChildAt(%f)", index2));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetGetChildAt() {
        if (getGetChildAt != null) {
            return getGetChildAt.generateJs();
        }
        return "";
    }

    private String generateJSgetGetParent() {
        if (getGetParent != null) {
            return getGetParent.generateJs();
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
            return String.format(Locale.US, "child: %s,", child3);
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

    private String generateJSchild8() {
        if (child8 != null) {
            return String.format(Locale.US, "child: %s,", (child8 != null) ? child8.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchild9() {
        if (child9 != null) {
            return String.format(Locale.US, "child: %s,", (child9 != null) ? child9.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetChildAt());
        jsGetters.append(generateJSgetGetParent());

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
            js.append(generateJSchild4());
            js.append(generateJSchild5());
            js.append(generateJSindex());
            js.append(generateJSindex1());
            js.append(generateJSchild6());
            js.append(generateJSchild7());
            js.append(generateJSkey());
            js.append(generateJSkey1());
            js.append(generateJSchild8());
            js.append(generateJSchild9());
            js.append(generateJSindex2());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}