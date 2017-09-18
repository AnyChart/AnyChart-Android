package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class StageCredits extends JsObject {

    
    private String alt;

    public void setAlt(String alt) {
        this.alt = alt;
    }

    private String imgAlt;

    public void setImgalt(String imgAlt) {
        this.imgAlt = imgAlt;
    }

    private String logoSrc;

    public void setLogosrc(String logoSrc) {
        this.logoSrc = logoSrc;
    }

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    private String generateJSalt() {
        if (alt != null) {
            return String.format(Locale.US, "alt: %s,", alt);
        }
        return "";
    }

    private String generateJSimgAlt() {
        if (imgAlt != null) {
            return String.format(Locale.US, "imgAlt: %s,", imgAlt);
        }
        return "";
    }

    private String generateJSlogoSrc() {
        if (logoSrc != null) {
            return String.format(Locale.US, "logoSrc: %s,", logoSrc);
        }
        return "";
    }

    private String generateJStext() {
        if (text != null) {
            return String.format(Locale.US, "text: %s,", text);
        }
        return "";
    }

    private String generateJSurl() {
        if (url != null) {
            return String.format(Locale.US, "url: %s,", url);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSalt());
        js.append(generateJSimgAlt());
        js.append(generateJSlogoSrc());
        js.append(generateJStext());
        js.append(generateJSurl());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}