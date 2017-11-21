package com.anychart.anychart;

import java.util.Locale;

// class
/**
 * Class implements all the work with consistency states.
invalidate() and markConsistent() are used to change states.
isConsistent() and hasInvalidationState() are used to check states.
 */
public class CoreBase extends JsObject {

    public CoreBase() {
        js.setLength(0);
        js.append("var coreBase").append(++variableIndex).append(" = anychart.core.base();");
        jsBase = "coreBase" + variableIndex;
    }

    protected CoreBase(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CoreBase(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String type;
    private Boolean useCapture;
    private String listenerScope;

    /**
     * Adds an event listener to an implementing object.
     */
    public void listen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".listen(%s, %b, %s);", wrapQuotes(type), useCapture, wrapQuotes(listenerScope)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s)", wrapQuotes(type), useCapture, wrapQuotes(listenerScope)));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    /**
     * Adds an event listener to an implementing object.
     */
    public void listenOnce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".listenOnce(%s, %b, %s);", wrapQuotes(type1), useCapture1, wrapQuotes(listenerScope1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s)", wrapQuotes(type1), useCapture1, wrapQuotes(listenerScope1)));
                js.setLength(0);
            }
        }
    }

    private String type2;

    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".removeAllListeners(%s);", wrapQuotes(type2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s)", wrapQuotes(type2)));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    /**
     * Removes a listener added using listen() or listenOnce() methods.
     */
    public void unlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".unlisten(%s, %b, %s);", wrapQuotes(type3), useCapture2, wrapQuotes(listenerScope2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s)", wrapQuotes(type3), useCapture2, wrapQuotes(listenerScope2)));
                js.setLength(0);
            }
        }
    }

    private String key;

    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s)", wrapQuotes(key)));
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