package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class TreeDataItem extends JsObject {

    public TreeDataItem() {

    }

    protected TreeDataItem(String jsBase) {
        this.jsBase = jsBase;
    }

    protected TreeDataItem(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String child;
    private TreeDataItem child1;

    public TreeDataItem addChild(String child) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            
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


    public TreeDataItem addChild(TreeDataItem child1) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            
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

    private String child2;
    private TreeDataItem child3;
    private TreeviewDataItem child4;
    private Double index;

    public TreeDataItem addChildAt(String child2, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            
            this.child2 = child2;
            this.index = index;
        } else {
            this.child2 = child2;
            this.index = index;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", child2, index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", child2, index));
                js.setLength(0);
            }
        }
        return this;
    }


    public TreeDataItem addChildAt(TreeDataItem child3, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            
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

            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", (child3 != null) ? child3.generateJs() : "null", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", (child3 != null) ? child3.generateJs() : "null", index));
                js.setLength(0);
            }
        }
        return this;
    }


    public TreeDataItem addChildAt(TreeviewDataItem child4, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            
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

    private TreeDataItem getGetChildAt;

    public TreeDataItem getGetChildAt() {
        if (getGetChildAt == null)
            getGetChildAt = new TreeDataItem(jsBase + ".getChildAt()");

        return getGetChildAt;
    }

    private TreeDataItem getGetParent;

    public TreeDataItem getGetParent() {
        if (getGetParent == null)
            getGetParent = new TreeDataItem(jsBase + ".getParent()");

        return getGetParent;
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

    private TreeDataItem child5;

    public TreeDataItem removeChild(TreeDataItem child5) {
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".removeChild(%s)", (child5 != null) ? child5.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeChild(%s)", (child5 != null) ? child5.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index1;

    public TreeDataItem removeChildAt(Double index1) {
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

            js.append(String.format(Locale.US, ".removeChildAt(%f)", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeChildAt(%f)", index1));
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
            return String.format(Locale.US, "child: %s,", child2);
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

    private String generateJSchild5() {
        if (child5 != null) {
            return String.format(Locale.US, "child: %s,", (child5 != null) ? child5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
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
            js.append(generateJSindex());
            js.append(generateJSkey());
            js.append(generateJSchild5());
            js.append(generateJSindex1());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}