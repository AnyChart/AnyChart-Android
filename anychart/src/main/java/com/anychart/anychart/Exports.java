package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Exports extends JsObject {

    public Exports() {

    }

    protected Exports(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Exports(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String captionOrOptions;
    private String captionOrOptions1;
    private String link;
    private String name;
    private String description;
    private String width;
    private String height;
    private String appId;

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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".facebook(%s, %s, %s, %s, %s, %s, %s);", captionOrOptions, link, name, description, width, height, appId));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".facebook(%s, %s, %s, %s, %s, %s, %s)", captionOrOptions, link, name, description, width, height, appId));
                js.setLength(0);
            }
        }
    }

    private String filename;

    public void setFilename(String filename) {
        if (jsBase == null) {
            this.filename = filename;
        } else {
            this.filename = filename;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".filename(%s);", filename));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".filename(%s)", filename));
                js.setLength(0);
            }
        }
    }

    private String widthOrOptions;
    private String widthOrOptions1;
    private String height1;

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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".image(%s, %s);", widthOrOptions, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".image(%s, %s)", widthOrOptions, height1));
                js.setLength(0);
            }
        }
    }

    private String captionOrOptions2;
    private String captionOrOptions3;
    private String description1;
    private String width1;
    private String height2;

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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".linkedin(%s, %s, %s, %s);", captionOrOptions2, description1, width1, height2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".linkedin(%s, %s, %s, %s)", captionOrOptions2, description1, width1, height2));
                js.setLength(0);
            }
        }
    }

    private String linkOrOptions;
    private String linkOrOptions1;
    private String description2;
    private String width2;
    private String height3;

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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".pinterest(%s, %s, %s, %s);", linkOrOptions, description2, width2, height3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".pinterest(%s, %s, %s, %s)", linkOrOptions, description2, width2, height3));
                js.setLength(0);
            }
        }
    }

    private String urlOrOptions;
    private String urlOrOptions1;
    private String width3;
    private String height4;

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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".twitter(%s, %s, %s);", urlOrOptions, width3, height4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".twitter(%s, %s, %s)", urlOrOptions, width3, height4));
                js.setLength(0);
            }
        }
    }

    private String generateJScaptionOrOptions() {
        if (captionOrOptions != null) {
            return String.format(Locale.US, "captionOrOptions: %s,", captionOrOptions);
        }
        return "";
    }

    private String generateJScaptionOrOptions1() {
        if (captionOrOptions1 != null) {
            return String.format(Locale.US, "captionOrOptions: %s,", captionOrOptions1);
        }
        return "";
    }

    private String generateJSlink() {
        if (link != null) {
            return String.format(Locale.US, "link: %s,", link);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSdescription() {
        if (description != null) {
            return String.format(Locale.US, "description: %s,", description);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %s,", width);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %s,", height);
        }
        return "";
    }

    private String generateJSappId() {
        if (appId != null) {
            return String.format(Locale.US, "appId: %s,", appId);
        }
        return "";
    }

    private String generateJSfilename() {
        if (filename != null) {
            return String.format(Locale.US, "filename: %s,", filename);
        }
        return "";
    }

    private String generateJSwidthOrOptions() {
        if (widthOrOptions != null) {
            return String.format(Locale.US, "widthOrOptions: %s,", widthOrOptions);
        }
        return "";
    }

    private String generateJSwidthOrOptions1() {
        if (widthOrOptions1 != null) {
            return String.format(Locale.US, "widthOrOptions: %s,", widthOrOptions1);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: %s,", height1);
        }
        return "";
    }

    private String generateJScaptionOrOptions2() {
        if (captionOrOptions2 != null) {
            return String.format(Locale.US, "captionOrOptions: %s,", captionOrOptions2);
        }
        return "";
    }

    private String generateJScaptionOrOptions3() {
        if (captionOrOptions3 != null) {
            return String.format(Locale.US, "captionOrOptions: %s,", captionOrOptions3);
        }
        return "";
    }

    private String generateJSdescription1() {
        if (description1 != null) {
            return String.format(Locale.US, "description: %s,", description1);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %s,", width1);
        }
        return "";
    }

    private String generateJSheight2() {
        if (height2 != null) {
            return String.format(Locale.US, "height: %s,", height2);
        }
        return "";
    }

    private String generateJSlinkOrOptions() {
        if (linkOrOptions != null) {
            return String.format(Locale.US, "linkOrOptions: %s,", linkOrOptions);
        }
        return "";
    }

    private String generateJSlinkOrOptions1() {
        if (linkOrOptions1 != null) {
            return String.format(Locale.US, "linkOrOptions: %s,", linkOrOptions1);
        }
        return "";
    }

    private String generateJSdescription2() {
        if (description2 != null) {
            return String.format(Locale.US, "description: %s,", description2);
        }
        return "";
    }

    private String generateJSwidth2() {
        if (width2 != null) {
            return String.format(Locale.US, "width: %s,", width2);
        }
        return "";
    }

    private String generateJSheight3() {
        if (height3 != null) {
            return String.format(Locale.US, "height: %s,", height3);
        }
        return "";
    }

    private String generateJSurlOrOptions() {
        if (urlOrOptions != null) {
            return String.format(Locale.US, "urlOrOptions: %s,", urlOrOptions);
        }
        return "";
    }

    private String generateJSurlOrOptions1() {
        if (urlOrOptions1 != null) {
            return String.format(Locale.US, "urlOrOptions: %s,", urlOrOptions1);
        }
        return "";
    }

    private String generateJSwidth3() {
        if (width3 != null) {
            return String.format(Locale.US, "width: %s,", width3);
        }
        return "";
    }

    private String generateJSheight4() {
        if (height4 != null) {
            return String.format(Locale.US, "height: %s,", height4);
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJScaptionOrOptions());
            js.append(generateJScaptionOrOptions1());
            js.append(generateJSlink());
            js.append(generateJSname());
            js.append(generateJSdescription());
            js.append(generateJSwidth());
            js.append(generateJSheight());
            js.append(generateJSappId());
            js.append(generateJSfilename());
            js.append(generateJSwidthOrOptions());
            js.append(generateJSwidthOrOptions1());
            js.append(generateJSheight1());
            js.append(generateJScaptionOrOptions2());
            js.append(generateJScaptionOrOptions3());
            js.append(generateJSdescription1());
            js.append(generateJSwidth1());
            js.append(generateJSheight2());
            js.append(generateJSlinkOrOptions());
            js.append(generateJSlinkOrOptions1());
            js.append(generateJSdescription2());
            js.append(generateJSwidth2());
            js.append(generateJSheight3());
            js.append(generateJSurlOrOptions());
            js.append(generateJSurlOrOptions1());
            js.append(generateJSwidth3());
            js.append(generateJSheight4());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}