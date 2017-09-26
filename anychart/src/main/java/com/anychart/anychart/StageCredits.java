package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class StageCredits extends JsObject {

    private String jsBase;

    public StageCredits() {

    }

    protected StageCredits(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private String alt;

    public void setAlt(String alt) {
        if (jsBase == null) {
            this.alt = alt;
        } else {
            this.alt = alt;

            js.append(String.format(Locale.US, jsBase + ".alt(%s);", alt));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".alt(%s);", alt));
                js.setLength(0);
            }
        }
    }

    private String imgAlt;

    public void setImgalt(String imgAlt) {
        if (jsBase == null) {
            this.imgAlt = imgAlt;
        } else {
            this.imgAlt = imgAlt;

            js.append(String.format(Locale.US, jsBase + ".imgAlt(%s);", imgAlt));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".imgAlt(%s);", imgAlt));
                js.setLength(0);
            }
        }
    }

    private String logoSrc;

    public void setLogosrc(String logoSrc) {
        if (jsBase == null) {
            this.logoSrc = logoSrc;
        } else {
            this.logoSrc = logoSrc;

            js.append(String.format(Locale.US, jsBase + ".logoSrc(%s);", logoSrc));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".logoSrc(%s);", logoSrc));
                js.setLength(0);
            }
        }
    }

    private String text;

    public void setText(String text) {
        if (jsBase == null) {
            this.text = text;
        } else {
            this.text = text;

            js.append(String.format(Locale.US, jsBase + ".text(%s);", text));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".text(%s);", text));
                js.setLength(0);
            }
        }
    }

    private String url;

    public void setUrl(String url) {
        if (jsBase == null) {
            this.url = url;
        } else {
            this.url = url;

            js.append(String.format(Locale.US, jsBase + ".url(%s);", url));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".url(%s);", url));
                js.setLength(0);
            }
        }
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
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSalt());
            js.append(generateJSimgAlt());
            js.append(generateJSlogoSrc());
            js.append(generateJStext());
            js.append(generateJSurl());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}