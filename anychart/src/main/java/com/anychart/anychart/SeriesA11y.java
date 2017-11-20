package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Anychart series accessibility class.
 */
public class SeriesA11y extends A11y {

    public SeriesA11y() {
        js.setLength(0);
        js.append("var seriesA11y").append(++variableIndex).append(" = anychart.core.utils.seriesA11y();");
        jsBase = "seriesA11y" + variableIndex;
    }

    protected SeriesA11y(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected SeriesA11y(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean enabled;
    private List<SeriesA11y> setEnabled = new ArrayList<>();

    /**
     * Setter for the accessibility enabled state.
     */
    public SeriesA11y setEnabled(Boolean enabled) {
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
            for (SeriesA11y item : setEnabled) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String titleFormat;
    private List<SeriesA11y> setTitleFormat = new ArrayList<>();

    /**
     * Setter for the function to format title.<br/>
{docs:Common_Settings/Text_Formatters}Learn more about using titleFormat() method.{docs}
     */
    public SeriesA11y setTitleFormat(String titleFormat) {
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
            for (SeriesA11y item : setTitleFormat) {
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
        js.append(generateJSsetTitleFormat());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}