package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Anychart chart accessibility class.
 */
public class ChartA11y extends A11y {

    public ChartA11y() {
        js.setLength(0);
        js.append("var chartA11y").append(++variableIndex).append(" = anychart.core.utils.chartA11y();");
        jsBase = "chartA11y" + variableIndex;
    }

    protected ChartA11y(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ChartA11y(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean enabled;
    private List<ChartA11y> setEnabled = new ArrayList<>();

    /**
     * Setter for the accessibility enabled state.
     */
    public ChartA11y setEnabled(Boolean enabled) {
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
                onChangeListener.onChange(String.format(Locale.US, ".enabled(%b)", enabled));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEnabled() {
        if (!setEnabled.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartA11y item : setEnabled) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private A11yMode mode;
    private String mode1;
    private List<ChartA11y> setMode = new ArrayList<>();

    /**
     * Setter for the accessibility mode.
     */
    public ChartA11y setMode(A11yMode mode) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode = mode;
        } else {
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".mode(%s)", ((mode != null) ? mode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", ((mode != null) ? mode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMode() {
        if (!setMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartA11y item : setMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartA11y> setMode1 = new ArrayList<>();

    /**
     * Setter for the accessibility mode.
     */
    public ChartA11y setMode(String mode1) {
        if (jsBase == null) {
            this.mode = null;
            this.mode1 = null;
            
            this.mode1 = mode1;
        } else {
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".mode(%s)", wrapQuotes(mode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".mode(%s)", wrapQuotes(mode1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMode1() {
        if (!setMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartA11y item : setMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String titleFormat;
    private List<ChartA11y> setTitleFormat = new ArrayList<>();

    /**
     * Setter for the function to format title.<br/>
{docs:Common_Settings/Text_Formatters}Learn more about using titleFormat() method.{docs}
     */
    public ChartA11y setTitleFormat(String titleFormat) {
        if (jsBase == null) {
            this.titleFormat = titleFormat;
        } else {
            this.titleFormat = titleFormat;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".titleFormat(%s)", wrapQuotes(titleFormat)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".titleFormat(%s)", wrapQuotes(titleFormat)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTitleFormat() {
        if (!setTitleFormat.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartA11y item : setTitleFormat) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJSsetEnabled());
        js.append(generateJSsetMode());
        js.append(generateJSsetMode1());
        js.append(generateJSsetTitleFormat());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}