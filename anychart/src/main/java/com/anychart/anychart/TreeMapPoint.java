package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class TreeMapPoint extends JsObject {

    
    private String field;

    public void setGet(String field) {
        this.field = field;
    }

    private Boolean hovered;

    public void setHovered(Boolean hovered) {
        this.hovered = hovered;
    }

    private Boolean selected;

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    private String field1;

    public void setSet(String field1) {
        this.field = null;
        this.field1 = null;
        
        this.field1 = field1;
    }

    private String generateJSfield() {
        if (field != null) {
            return String.format(Locale.US, "field: %s,", field);
        }
        return "";
    }

    private String generateJShovered() {
        if (hovered != null) {
            return String.format(Locale.US, "hovered: %b,", hovered);
        }
        return "";
    }

    private String generateJSselected() {
        if (selected != null) {
            return String.format(Locale.US, "selected: %b,", selected);
        }
        return "";
    }

    private String generateJSfield1() {
        if (field1 != null) {
            return String.format(Locale.US, "field: %s,", field1);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSfield());
        js.append(generateJShovered());
        js.append(generateJSselected());
        js.append(generateJSfield1());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}