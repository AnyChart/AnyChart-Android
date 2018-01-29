package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * The ContextMenu class contains methods for configuring context menu.
 */
public class ContextMenu extends JsObject {

    public ContextMenu() {
        js.setLength(0);
        js.append("var contextMenu").append(++variableIndex).append(" = anychart.ui.contextMenu();");
        jsBase = "contextMenu" + variableIndex;
    }

    protected ContextMenu(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ContextMenu(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String className;

    /**
     * Setter for the class name.
     */
    public void setAddClassName(String className) {
        if (jsBase == null) {
            this.className = className;
        } else {
            this.className = className;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".addClassName(%s);", wrapQuotes(className)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addClassName(%s);", wrapQuotes(className)));
                js.setLength(0);
            }
        }
    }

    private Element target;
    private Chart target1;
    private Boolean capture;

    /**
     * Attaches the context menu to a chart or DOM element.
     */
    public ContextMenu attach(Element target, Boolean capture) {
        if (jsBase == null) {
            this.target = null;
            this.target1 = null;
            
            this.target = target;
            this.capture = capture;
        } else {
            this.target = target;
            this.capture = capture;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(target.generateJs());
            js.append(String.format(Locale.US, ".attach(%s, %b)", ((target != null) ? target.getJsBase() : "null"), capture));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".attach(%s, %b);", ((target != null) ? target.getJsBase() : "null"), capture));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Attaches the context menu to a chart or DOM element.
     */
    public ContextMenu attach(Chart target1, Boolean capture) {
        if (jsBase == null) {
            this.target = null;
            this.target1 = null;
            
            this.target1 = target1;
            this.capture = capture;
        } else {
            this.target1 = target1;
            this.capture = capture;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(target1.generateJs());
            js.append(String.format(Locale.US, ".attach(%s, %b)", ((target1 != null) ? target1.getJsBase() : "null"), capture));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".attach(%s, %b);", ((target1 != null) ? target1.getJsBase() : "null"), capture));
                js.setLength(0);
            }
        }
        return this;
    }

    private Element target2;
    private Boolean capture1;

    /**
     * Detaches the context menu from a given element or chart.
     */
    public ContextMenu detach(Element target2, Boolean capture1) {
        if (jsBase == null) {
            this.target = null;
            this.target1 = null;
            this.target2 = null;
            
            this.target2 = target2;
            this.capture = null;
            this.capture1 = null;
            
            this.capture1 = capture1;
        } else {
            this.target2 = target2;
            this.capture1 = capture1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(target2.generateJs());
            js.append(String.format(Locale.US, ".detach(%s, %b)", ((target2 != null) ? target2.getJsBase() : "null"), capture1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".detach(%s, %b);", ((target2 != null) ? target2.getJsBase() : "null"), capture1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean enabled;

    /**
     * Setter for the context menu enabled state.
     */
    public ContextMenu setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".enabled(%b)", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));
                js.setLength(0);
            }
        }
        return this;
    }

    private Item[] items;

    /**
     * Setter for the context menu items.
     */
    public ContextMenu setItems(Item[] items) {
        if (jsBase == null) {
            this.items = items;
        } else {
            this.items = items;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".items(%s)", arrayToString(items)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".items(%s);", arrayToString(items)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String className1;

    /**
     * Removes the class name.
     */
    public void removeClassName(String className1) {
        if (jsBase == null) {
            this.className = null;
            this.className1 = null;
            
            this.className1 = className1;
        } else {
            this.className1 = className1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".removeClassName(%s);", wrapQuotes(className1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeClassName(%s);", wrapQuotes(className1)));
                js.setLength(0);
            }
        }
    }

    private String var_args;
    private String[] var_args1;
    private Number var_args2;
    private String var_args3;
    private Boolean var_args4;

    /**
     * Setups the element using passed configuration value.
     */
    public ContextMenu setup(String var_args) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            
            this.var_args = var_args;
        } else {
            this.var_args = var_args;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setup(%s)", wrapQuotes(var_args)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setup(%s);", wrapQuotes(var_args)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setups the element using passed configuration value.
     */
    public ContextMenu setup(String[] var_args1) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            
            this.var_args1 = var_args1;
        } else {
            this.var_args1 = var_args1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setup(%s)", arrayToStringWrapQuotes(var_args1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setup(%s);", arrayToStringWrapQuotes(var_args1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setups the element using passed configuration value.
     */
    public ContextMenu setup(Number var_args2) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            
            this.var_args2 = var_args2;
        } else {
            this.var_args2 = var_args2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setup(%s)", var_args2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setup(%s);", var_args2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setups the element using passed configuration value.
     */
    public ContextMenu setup(Boolean var_args4) {
        if (jsBase == null) {
            this.var_args = null;
            this.var_args1 = null;
            this.var_args2 = null;
            this.var_args3 = null;
            this.var_args4 = null;
            
            this.var_args4 = var_args4;
        } else {
            this.var_args4 = var_args4;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".setup(%b)", var_args4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".setup(%b);", var_args4));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number x;
    private Number y;

    /**
     * Shows the menu immediately at the given client coordinates.
     */
    public void show(Number x, Number y) {
        if (jsBase == null) {
            this.x = x;
            this.y = y;
        } else {
            this.x = x;
            this.y = y;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".show(%s, %s);", x, y));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".show(%s, %s);", x, y));
                js.setLength(0);
            }
        }
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

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