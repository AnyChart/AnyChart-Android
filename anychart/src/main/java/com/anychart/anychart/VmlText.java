package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * A class for text formatting.<br/> Processes plain text and HTML text.<br/>
Plain text is set using the <b>setText</b> method {@link anychart.graphics.vector.Text#text}.
HTML text is set using the <b>setHtml</b> method {@link anychart.graphics.vector.Text#htmlText}.
A text style is set using the <b>setStyle</b> method {@link anychart.graphics.vector.Text#style}.
 */
public class VmlText extends VectorText {

    public VmlText() {
        js.setLength(0);
        js.append("var vmlText").append(++variableIndex).append(" = anychart.graphics.vector.vml.text();");
        jsBase = "vmlText" + variableIndex;
    }

    protected VmlText(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected VmlText(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
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