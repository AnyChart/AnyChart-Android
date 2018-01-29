package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Tree data item.
 */
public class TreeDataItem extends JsObject {

    public TreeDataItem() {
        js.setLength(0);
        js.append("var treeDataItem").append(++variableIndex).append(" = anychart.data.Tree.dataItem();");
        jsBase = "treeDataItem" + variableIndex;
    }

    protected TreeDataItem(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TreeDataItem(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String child;
    private TreeDataItem child1;

    /**
     * Adds a child.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", wrapQuotes(child)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Adds a child.
     */
    public TreeDataItem addChild(TreeDataItem child1) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            
            this.child1 = child1;
        } else {
            this.child1 = child1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".addChild(%s);",  ((child1 != null) ? child1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", ((child1 != null) ? child1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String child2;
    private TreeDataItem child3;
    private TreeviewDataItem child4;
    private Number index;

    /**
     * Inserts a child into a specified position.</br>
Please make sure that child has not inner cycles to avoid stack overflow exception.
     */
    public TreeDataItem addChildAt(String child2, Number index) {
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
            
            js.append(String.format(Locale.US, ".addChildAt(%s, %s)", wrapQuotes(child2), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", wrapQuotes(child2), index));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Inserts a child into a specified position.</br>
Please make sure that child has not inner cycles to avoid stack overflow exception.
     */
    public TreeDataItem addChildAt(TreeDataItem child3, Number index) {
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
            js.append(child3.generateJs());
            js.append(String.format(Locale.US, ".addChildAt(%s, %s)", ((child3 != null) ? child3.getJsBase() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", ((child3 != null) ? child3.getJsBase() : "null"), index));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Inserts a child into a specified position.</br>
Please make sure that child has not inner cycles to avoid stack overflow exception.
     */
    public TreeDataItem addChildAt(TreeviewDataItem child4, Number index) {
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
            js.append(child4.generateJs());
            js.append(String.format(Locale.US, ".addChildAt(%s, %s)", ((child4 != null) ? child4.getJsBase() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", ((child4 != null) ? child4.getJsBase() : "null"), index));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<TreeDataItem> getGetChildAt = new ArrayList<>();

    /**
     * Gets the child by index.
     */
    public TreeDataItem getGetChildAt(Number index) {
        TreeDataItem item = new TreeDataItem(jsBase + ".getChildAt(" + index + ")");
        getGetChildAt.add(item);
        return item;
    }

    private TreeDataItem getGetParent;

    /**
     * Gets a data item's parent.
     */
    public TreeDataItem getGetParent() {
        if (getGetParent == null)
            getGetParent = new TreeDataItem(jsBase + ".getParent()");

        return getGetParent;
    }

    private String key;

    /**
     * Setter for a meta data.
     */
    public void setMeta(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".meta(%s);", wrapQuotes(key)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".meta(%s);", wrapQuotes(key)));
                js.setLength(0);
            }
        }
    }

    private TreeDataItem child5;

    /**
     * Removes data item's child.
     */
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
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child5.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".removeChild(%s);",  ((child5 != null) ? child5.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s);", ((child5 != null) ? child5.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index1;

    /**
     * Removes child at specified position.
     */
    public TreeDataItem removeChildAt(Number index1) {
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
            
            js.append(String.format(Locale.US, ".removeChildAt(%s)", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChildAt(%s);", index1));
                js.setLength(0);
            }
        }
        return this;
    }

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

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}