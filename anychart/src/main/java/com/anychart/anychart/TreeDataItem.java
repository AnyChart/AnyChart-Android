package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChild(%s)", wrapQuotes(child)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChild(%s)", wrapQuotes(child)));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChild(%s)", ((child1 != null) ? child1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChild(%s)", ((child1 != null) ? child1.generateJs() : "null")));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", wrapQuotes(child2), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", wrapQuotes(child2), index));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", ((child3 != null) ? child3.generateJs() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", ((child3 != null) ? child3.generateJs() : "null"), index));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", ((child4 != null) ? child4.generateJs() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", ((child4 != null) ? child4.generateJs() : "null"), index));
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".meta(%s);", wrapQuotes(key)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".meta(%s)", wrapQuotes(key)));
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".removeChild(%s)", ((child5 != null) ? child5.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeChild(%s)", ((child5 != null) ? child5.generateJs() : "null")));
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


//
//    private String generateJSTreeDataItem getGetChildAt() {
//        if (TreeDataItem getGetChildAt != null) {
//            return TreeDataItem getGetChildAt.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSTreeDataItem getGetParent() {
//        if (TreeDataItem getGetParent != null) {
//            return TreeDataItem getGetParent.generateJs();
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


    private String generateJSgetGetParent() {
        if (getGetParent != null) {
            return getGetParent.generateJs();
            //return String.format(Locale.US, "getGetParent: %s,", ((getGetParent != null) ? getGetParent.generateJs() : "null"));
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
//            js.append(generateJSindex());
////        
//            js.append(generateJSkey());
////        
//            js.append(generateJSchild5());
////        
//            js.append(generateJSindex1());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}