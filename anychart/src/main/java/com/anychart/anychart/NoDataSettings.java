package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Class with settings for "No data" feature.<br/>
{docs:Working_with_Data/No_Data_Label} Learn more about "No data" feature {docs}
 */
public class NoDataSettings extends CoreBase {

    public NoDataSettings() {
        js.setLength(0);
        js.append("var noDataSettings").append(++variableIndex).append(" = anychart.core.noDataSettings();");
        jsBase = "noDataSettings" + variableIndex;
    }

    protected NoDataSettings(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected NoDataSettings(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private UiLabel getLabel;

    /**
     * Getter for no data label.
     */
    public UiLabel getLabel() {
        if (getLabel == null)
            getLabel = new UiLabel(jsBase + ".label()");

        return getLabel;
    }

    private String label;
    private String label1;
    private Boolean label2;

    /**
     * Setter for no data label.
     */
    public NoDataSettings setLabel(String label) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label = label;
        } else {
            this.label = label;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".label(%s)", wrapQuotes(label)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%s);", wrapQuotes(label)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for no data label.
     */
    public NoDataSettings setLabel(Boolean label2) {
        if (jsBase == null) {
            this.label = null;
            this.label1 = null;
            this.label2 = null;
            
            this.label2 = label2;
        } else {
            this.label2 = label2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".label(%b)", label2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".label(%b);", label2));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetLabel() {
        if (getLabel != null) {
            return getLabel.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetLabel());

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