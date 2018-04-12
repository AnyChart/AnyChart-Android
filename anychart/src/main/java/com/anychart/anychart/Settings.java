package com.anychart.anychart;

// class
/**
 * Custom drawing settings.<br/>
Two main methods in rendering settings are {api: anychart.core.gantt.rendering.Settings#drawer}drawer{api}
and {api:anychart.core.gantt.rendering.Settings#shapes}shapes{api}. The drawer method sets the drawing function.<br/>
The shapes method returns the map of shapes used for drawing. Also, shapes are used in the context of the drawing function (drawer()).<br/>
{api: anychart.core.gantt.rendering.Settings.ShapeConfig}ShapeConfig{api} is the configurations of shapes that are set
in the array using the shapes() method.
 */
public class Settings extends CoreBase {

    public Settings() {
        js.setLength(0);
        js.append("var settings").append(++variableIndex).append(" = anychart.core.gantt.rendering.settings();");
        jsBase = "settings" + variableIndex;
    }

    protected Settings(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Settings(StringBuilder js, String jsBase, boolean isChain) {
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