package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class ChartCredits extends CoreBase {

    public ChartCredits() {

    }

    protected ChartCredits(String jsBase) {
        this.jsBase = jsBase;
    }

    protected ChartCredits(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String alt;

    public ChartCredits setAlt(String alt) {
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
                onChangeListener.onChange(String.format(Locale.US, ".alt(%s)", wrapQuotes(alt)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean enabled;

    public ChartCredits setEnabled(Boolean enabled) {
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

    private String imgAlt;

    public ChartCredits setImgAlt(String imgAlt) {
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
                onChangeListener.onChange(String.format(Locale.US, ".imgAlt(%s)", wrapQuotes(imgAlt)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String logoSrc;

    public ChartCredits setLogoSrc(String logoSrc) {
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
                onChangeListener.onChange(String.format(Locale.US, ".logoSrc(%s)", wrapQuotes(logoSrc)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String text;

    public ChartCredits setText(String text) {
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
                onChangeListener.onChange(String.format(Locale.US, ".text(%s)", wrapQuotes(text)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String url;

    public ChartCredits setUrl(String url) {
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
                onChangeListener.onChange(String.format(Locale.US, ".url(%s)", wrapQuotes(url)));
                js.setLength(0);
            }
        }
        return this;
    }


//

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

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJSalt());
////        
//            js.append(generateJSenabled());
////        
//            js.append(generateJSimgAlt());
////        
//            js.append(generateJSlogoSrc());
////        
//            js.append(generateJStext());
////        
//            js.append(generateJSurl());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}