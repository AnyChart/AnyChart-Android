package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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

    public TreeviewDataItem addChild(String child) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
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


    public TreeviewDataItem addChild(TreeDataItem child1) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
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


    public TreeviewDataItem addChild(TreeviewDataItem child2) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child2 = child2;
        } else {
            this.child2 = child2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChild(%s)", ((child2 != null) ? child2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChild(%s)", ((child2 != null) ? child2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", wrapQuotes(child3), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", wrapQuotes(child3), index));
                js.setLength(0);
            }
        }
        return this;
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", ((child5 != null) ? child5.generateJs() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", ((child5 != null) ? child5.generateJs() : "null"), index));
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

    private TreeviewDataItem getGetParent;

    public TreeviewDataItem getGetParent() {
        if (getGetParent == null)
            getGetParent = new TreeviewDataItem(jsBase + ".getParent()");

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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".removeChild(%s)", ((child6 != null) ? child6.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeChild(%s)", ((child6 != null) ? child6.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
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
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".removeChild(%s)", ((child7 != null) ? child7.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeChild(%s)", ((child7 != null) ? child7.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index1;

    public TreeviewDataItem removeChildAt(Double index1) {
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
//    private String generateJSTreeviewDataItem getGetChildAt() {
//        if (TreeviewDataItem getGetChildAt != null) {
//            return TreeviewDataItem getGetChildAt.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSTreeviewDataItem getGetParent() {
//        if (TreeviewDataItem getGetParent != null) {
//            return TreeviewDataItem getGetParent.generateJs();
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
//            js.append(generateJSchild5());
////        
//            js.append(generateJSindex());
////        
//            js.append(generateJSkey());
////        
//            js.append(generateJSchild6());
////        
//            js.append(generateJSchild7());
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