package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * <b>anychart.data.Iterator</b> class is used to work with data in a View.<br/>
The iterator allows getting data from a {@link anychart.data.View} by crawling through rows. Iterator
can be obtained using {@link anychart.data.View#getIterator} method and has methods to control current
index and get values from data/metadata fields in a current row.
 */
public class Iterator extends JsObject {

    public Iterator() {
        js.setLength(0);
        js.append("var iterator").append(++variableIndex).append(" = anychart.data.iterator();");
        jsBase = "iterator" + variableIndex;
    }

    protected Iterator(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Iterator(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String name;

    /**
     * Sets metadata value by the field name.
     */
    public Iterator setMeta(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".meta(%s)", wrapQuotes(name)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".meta(%s);", wrapQuotes(name)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number index;

    /**
     * Sets a passed index as the current index and returns it in case of success.
     */
    public void setSelect(Number index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".select(%s);", index));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s);", index));
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