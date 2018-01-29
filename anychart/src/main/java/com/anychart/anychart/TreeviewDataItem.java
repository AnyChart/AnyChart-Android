package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Mapped data item class.
 */
public class TreeviewDataItem extends JsObject {

    public TreeviewDataItem() {
        js.setLength(0);
        js.append("var treeviewDataItem").append(++variableIndex).append(" = anychart.data.TreeView.dataItem();");
        jsBase = "treeviewDataItem" + variableIndex;
    }

    protected TreeviewDataItem(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TreeviewDataItem(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String child;
    private TreeDataItem child1;
    private TreeviewDataItem child2;

    /**
     * Adds a child.
     */
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
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", wrapQuotes(child)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Adds a child.
     */
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


    /**
     * Adds a child.
     */
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
            js.append(child2.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".addChild(%s);",  ((child2 != null) ? child2.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s);", ((child2 != null) ? child2.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String child3;
    private TreeDataItem child4;
    private TreeviewDataItem child5;
    private Number index;

    /**
     * Inserts a child into a specified position.
     */
    public TreeviewDataItem addChildAt(String child3, Number index) {
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
            
            js.append(String.format(Locale.US, ".addChildAt(%s, %s)", wrapQuotes(child3), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", wrapQuotes(child3), index));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Inserts a child into a specified position.
     */
    public TreeviewDataItem addChildAt(TreeDataItem child4, Number index) {
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
            js.append(child4.generateJs());
            js.append(String.format(Locale.US, ".addChildAt(%s, %s)", ((child4 != null) ? child4.getJsBase() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", ((child4 != null) ? child4.getJsBase() : "null"), index));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Inserts a child into a specified position.
     */
    public TreeviewDataItem addChildAt(TreeviewDataItem child5, Number index) {
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
            js.append(child5.generateJs());
            js.append(String.format(Locale.US, ".addChildAt(%s, %s)", ((child5 != null) ? child5.getJsBase() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %s);", ((child5 != null) ? child5.getJsBase() : "null"), index));
                js.setLength(0);
            }
        }
        return this;
    }

    private List<TreeviewDataItem> getGetChildAt = new ArrayList<>();

    /**
     * Gets the child by index.
     */
    public TreeviewDataItem getGetChildAt(Number index) {
        TreeviewDataItem item = new TreeviewDataItem(jsBase + ".getChildAt(" + index + ")");
        getGetChildAt.add(item);
        return item;
    }

    private TreeviewDataItem getGetParent;

    /**
     * Gets a data item's parent.
     */
    public TreeviewDataItem getGetParent() {
        if (getGetParent == null)
            getGetParent = new TreeviewDataItem(jsBase + ".getParent()");

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

    private TreeDataItem child6;
    private TreeviewDataItem child7;

    /**
     * Removes data item's child.
     */
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
            js.append(child6.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".removeChild(%s);",  ((child6 != null) ? child6.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s);", ((child6 != null) ? child6.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Removes data item's child.
     */
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
            js.append(child7.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".removeChild(%s);",  ((child7 != null) ? child7.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChild(%s);", ((child7 != null) ? child7.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index1;

    /**
     * Removes child at the specified position.
     */
    public TreeviewDataItem removeChildAt(Number index1) {
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