package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class Preloader extends JsObject {

    private String jsBase;

    public Preloader() {

    }

    protected Preloader(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Element element;

    public void setDecorate(Element element) {
        if (jsBase == null) {
            this.element = element;
        } else {
            this.element = element;

            js.append(String.format(Locale.US, jsBase + ".decorate(%s);", (element != null) ? element.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".decorate(%s);", (element != null) ? element.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Element parentElement;

    public void setRender(Element parentElement) {
        if (jsBase == null) {
            this.parentElement = parentElement;
        } else {
            this.parentElement = parentElement;

            js.append(String.format(Locale.US, jsBase + ".render(%s);", (parentElement != null) ? parentElement.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".render(%s);", (parentElement != null) ? parentElement.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Boolean visible;

    public void setVisible(Boolean visible) {
        if (jsBase == null) {
            this.visible = visible;
        } else {
            this.visible = visible;

            js.append(String.format(Locale.US, jsBase + ".visible(%b);", visible));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".visible(%b);", visible));
                js.setLength(0);
            }
        }
    }

    private String generateJSelement() {
        if (element != null) {
            return String.format(Locale.US, "element: %s,", (element != null) ? element.generateJs() : "null");
        }
        return "";
    }

    private String generateJSparentElement() {
        if (parentElement != null) {
            return String.format(Locale.US, "parentElement: %s,", (parentElement != null) ? parentElement.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvisible() {
        if (visible != null) {
            return String.format(Locale.US, "visible: %b,", visible);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSelement());
            js.append(generateJSparentElement());
            js.append(generateJSvisible());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}