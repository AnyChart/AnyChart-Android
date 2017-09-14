package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Preloader extends JsObject {

    
    private Element element;

    public void setDecorate(Element element) {
        this.element = element;
    }

    private Element parentElement;

    public void setRender(Element parentElement) {
        this.parentElement = parentElement;
    }

    private Boolean visible;

    public void setVisible(Boolean visible) {
        this.visible = visible;
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
        js.append("{");
        js.append(generateJSelement());
        js.append(generateJSparentElement());
        js.append(generateJSvisible());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}