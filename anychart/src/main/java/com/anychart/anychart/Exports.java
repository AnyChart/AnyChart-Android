package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Composition view, that concatenates two different views.
 */
public class Exports extends JsObject {

    public Exports() {
        js.setLength(0);
        js.append("var exports").append(++variableIndex).append(" = anychart.core.utils.exports();");
        jsBase = "exports" + variableIndex;
    }

    protected Exports(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Exports(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String captionOrOptions;
    private String captionOrOptions1;
    private String link;
    private String name;
    private String description;
    private String width;
    private String height;
    private String appId;

    /**
     * Setter for facebook sharing settings.
     */
    public void setFacebook(String captionOrOptions, String link, String name, String description, String width, String height, String appId) {
        if (jsBase == null) {
            this.captionOrOptions = null;
            this.captionOrOptions1 = null;
            
            this.captionOrOptions = captionOrOptions;
            this.link = link;
            this.name = name;
            this.description = description;
            this.width = width;
            this.height = height;
            this.appId = appId;
        } else {
            this.captionOrOptions = captionOrOptions;
            this.link = link;
            this.name = name;
            this.description = description;
            this.width = width;
            this.height = height;
            this.appId = appId;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".facebook(%s, %s, %s, %s, %s, %s, %s);", wrapQuotes(captionOrOptions), wrapQuotes(link), wrapQuotes(name), wrapQuotes(description), wrapQuotes(width), wrapQuotes(height), wrapQuotes(appId)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".facebook(%s, %s, %s, %s, %s, %s, %s);", wrapQuotes(captionOrOptions), wrapQuotes(link), wrapQuotes(name), wrapQuotes(description), wrapQuotes(width), wrapQuotes(height), wrapQuotes(appId)));
                js.setLength(0);
            }
        }
    }

    private String filename;

    /**
     * Setter and getter for the file name for exported files.
     */
    public void setFilename(String filename) {
        if (jsBase == null) {
            this.filename = filename;
        } else {
            this.filename = filename;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".filename(%s);", wrapQuotes(filename)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".filename(%s);", wrapQuotes(filename)));
                js.setLength(0);
            }
        }
    }

    private String widthOrOptions;
    private String widthOrOptions1;
    private String height1;

    /**
     * Setter for dimensions for exported images and PDFs.
     */
    public void setImage(String widthOrOptions, String height1) {
        if (jsBase == null) {
            this.widthOrOptions = null;
            this.widthOrOptions1 = null;
            
            this.widthOrOptions = widthOrOptions;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.widthOrOptions = widthOrOptions;
            this.height1 = height1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".image(%s, %s);", wrapQuotes(widthOrOptions), wrapQuotes(height1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".image(%s, %s);", wrapQuotes(widthOrOptions), wrapQuotes(height1)));
                js.setLength(0);
            }
        }
    }

    private String captionOrOptions2;
    private String captionOrOptions3;
    private String description1;
    private String width1;
    private String height2;

    /**
     * Setter for LinkedIn sharing settings.
     */
    public void setLinkedin(String captionOrOptions2, String description1, String width1, String height2) {
        if (jsBase == null) {
            this.captionOrOptions = null;
            this.captionOrOptions1 = null;
            this.captionOrOptions2 = null;
            this.captionOrOptions3 = null;
            
            this.captionOrOptions2 = captionOrOptions2;
            this.description = null;
            this.description1 = null;
            
            this.description1 = description1;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            
            this.height2 = height2;
        } else {
            this.captionOrOptions2 = captionOrOptions2;
            this.description1 = description1;
            this.width1 = width1;
            this.height2 = height2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".linkedin(%s, %s, %s, %s);", wrapQuotes(captionOrOptions2), wrapQuotes(description1), wrapQuotes(width1), wrapQuotes(height2)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".linkedin(%s, %s, %s, %s);", wrapQuotes(captionOrOptions2), wrapQuotes(description1), wrapQuotes(width1), wrapQuotes(height2)));
                js.setLength(0);
            }
        }
    }

    private String linkOrOptions;
    private String linkOrOptions1;
    private String description2;
    private String width2;
    private String height3;

    /**
     * Setter for Pinterest sharing settings.
     */
    public void setPinterest(String linkOrOptions, String description2, String width2, String height3) {
        if (jsBase == null) {
            this.linkOrOptions = null;
            this.linkOrOptions1 = null;
            
            this.linkOrOptions = linkOrOptions;
            this.description = null;
            this.description1 = null;
            this.description2 = null;
            
            this.description2 = description2;
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            
            this.width2 = width2;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height3 = height3;
        } else {
            this.linkOrOptions = linkOrOptions;
            this.description2 = description2;
            this.width2 = width2;
            this.height3 = height3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".pinterest(%s, %s, %s, %s);", wrapQuotes(linkOrOptions), wrapQuotes(description2), wrapQuotes(width2), wrapQuotes(height3)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pinterest(%s, %s, %s, %s);", wrapQuotes(linkOrOptions), wrapQuotes(description2), wrapQuotes(width2), wrapQuotes(height3)));
                js.setLength(0);
            }
        }
    }

    private String urlOrOptions;
    private String urlOrOptions1;
    private String width3;
    private String height4;

    /**
     * Setter for twitter sharing settings.
     */
    public void setTwitter(String urlOrOptions, String width3, String height4) {
        if (jsBase == null) {
            this.urlOrOptions = null;
            this.urlOrOptions1 = null;
            
            this.urlOrOptions = urlOrOptions;
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width3 = width3;
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            this.height4 = null;
            
            this.height4 = height4;
        } else {
            this.urlOrOptions = urlOrOptions;
            this.width3 = width3;
            this.height4 = height4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".twitter(%s, %s, %s);", wrapQuotes(urlOrOptions), wrapQuotes(width3), wrapQuotes(height4)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".twitter(%s, %s, %s);", wrapQuotes(urlOrOptions), wrapQuotes(width3), wrapQuotes(height4)));
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