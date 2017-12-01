package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Define class Credits.<br/>
<b>Note:</b> Use {@link anychart.ui#credits} method to create instance of this class.<br/>
<b>Note:</b> You can't customize credits without <u>a license key</u>. See <a href="https://www.anychart.com/buy/">AnyChart Licensing</a> to learn more.
 */
public class StageCredits extends JsObject {

    public StageCredits() {
        js.setLength(0);
        js.append("var stageCredits").append(++variableIndex).append(" = anychart.core.ui.stageCredits();");
        jsBase = "stageCredits" + variableIndex;
    }

    protected StageCredits(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StageCredits(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String alt;

    /**
     * Setter for credits alternative text.
     */
    public StageCredits setAlt(String alt) {
        if (jsBase == null) {
            this.alt = alt;
        } else {
            this.alt = alt;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".alt(%s)", wrapQuotes(alt)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".alt(%s);", wrapQuotes(alt)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean enabled;

    /**
     * Setter for the stage credits state.
     */
    public StageCredits setEnabled(Boolean enabled) {
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

    private String imgAlt;

    /**
     * Setter for the image alternative text.
     */
    public StageCredits setImgAlt(String imgAlt) {
        if (jsBase == null) {
            this.imgAlt = imgAlt;
        } else {
            this.imgAlt = imgAlt;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".imgAlt(%s)", wrapQuotes(imgAlt)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".imgAlt(%s);", wrapQuotes(imgAlt)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String logoSrc;

    /**
     * Setter for credits logo source.<br/>
<b>Note:</b> <b>Note:</b> You can't customize credits without <u>a license key</u>. See <a href="https://www.anychart.com/buy/">AnyChart Licensing</a> to learn more.
     */
    public StageCredits setLogoSrc(String logoSrc) {
        if (jsBase == null) {
            this.logoSrc = logoSrc;
        } else {
            this.logoSrc = logoSrc;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".logoSrc(%s)", wrapQuotes(logoSrc)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".logoSrc(%s);", wrapQuotes(logoSrc)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String text;

    /**
     * Setter for credits text value.
     */
    public StageCredits setText(String text) {
        if (jsBase == null) {
            this.text = text;
        } else {
            this.text = text;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".text(%s)", wrapQuotes(text)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".text(%s);", wrapQuotes(text)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String url;

    /**
     * Setter for credits url.
     */
    public StageCredits setUrl(String url) {
        if (jsBase == null) {
            this.url = url;
        } else {
            this.url = url;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".url(%s)", wrapQuotes(url)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".url(%s);", wrapQuotes(url)));
                js.setLength(0);
            }
        }
        return this;
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