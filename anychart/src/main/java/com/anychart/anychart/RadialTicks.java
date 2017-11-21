package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Axis radar ticks class.<br/>
You can change position, length and line features.
 */
public class RadialTicks extends VisualBase {

    public RadialTicks() {
        js.setLength(0);
        js.append("var radialTicks").append(++variableIndex).append(" = anychart.core.axes.radialTicks();");
        jsBase = "radialTicks" + variableIndex;
    }

    protected RadialTicks(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected RadialTicks(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double length;
    private List<RadialTicks> setLength = new ArrayList<>();

    /**
     * Setter for ticks length.<br/>
<img src='https://api.anychart.com/si/special-hotfixes-typescript/anychart.core.axes.RadialTicks.length.png' height='77' width='412'/>
     */
    public RadialTicks setLength(Double length) {
        if (jsBase == null) {
            this.length = length;
        } else {
            this.length = length;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".length(%f)", length));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".length(%f)", length));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLength() {
        if (!setLength.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadialTicks item : setLength) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke stroke;
    private List<Ticks> setStroke = new ArrayList<>();

    /**
     * Setter for stroke settings via single parameter.<br/>
<img src='https://api.anychart.com/si/special-hotfixes-typescript/anychart.core.axes.RadialTicks.stroke.png' height='66' width='413'/><br/>
     */
    public Ticks setStroke(Stroke stroke) {
        if (jsBase == null) {
            this.stroke = stroke;
        } else {
            this.stroke = stroke;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setStroke" + ++variableIndex + " = " + jsBase + ".stroke(%s);", ((stroke != null) ? stroke.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s)", ((stroke != null) ? stroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        Ticks item = new Ticks("setStroke" + variableIndex);
        setStroke.add(item);
        return item;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Ticks item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<RadialTicks> setStroke1 = new ArrayList<>();

    /**
     * Setter for stroke settings via several parameter.<br/>
The following options are acceptable:
<ul>
 <li>String formatted as '[thickness ]color[ opacity]':
   <ol>
     <li><b>'color'</b> - {@link https://www.w3schools.com/html/html_colors.asp}.</li>
     <li><b>'thickness color'</b> - like a css border, e.g. '3 red' or '3px red'</li>
     <li><b>'color opacity'</b> - as a fill string, e.g. '#fff 0.5'</li>
     <li><b>'thickness color opacity'</b> - as a complex string, e.g. '3px #00ff00 0.5'</li>
   </ol>
 </li>
 <li>{@link anychart.graphics.vector.Stroke} object</li>
 <li>Keys array {@link anychart.graphics.vector.GradientKey}</li>
 <li><b>null</b> - reset current stroke settings.</li>
</ul>
<b>Note:</b> String parts order is significant and '3px red' is not the same as 'red 3px'.
     */
    public RadialTicks setStroke(String color, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (RadialTicks item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

        js.append(generateJsGetters());

        js.append(generateJSsetLength());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}