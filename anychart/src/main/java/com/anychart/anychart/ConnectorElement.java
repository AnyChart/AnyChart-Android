package com.anychart.anychart;

import java.util.Locale;

// class
/**
 * Connector element settings.
 */
public class ConnectorElement extends CoreBase {

    public ConnectorElement() {
        js.setLength(0);
        js.append("var connectorElement").append(++variableIndex).append(" = anychart.core.gantt.elements.connectorElement();");
        jsBase = "connectorElement" + variableIndex;
    }

    protected ConnectorElement(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ConnectorElement(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Fill fill;
    private GradientKey[] fill1;
    private String[] fill2;
    private Number cx;
    private Number cy;
    private GraphicsMathRect opacityOrMode;
    private Number opacity;
    private Number fx;
    private Number fy;

    /**
     * Setter for connector fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ConnectorElement setFill(Fill fill, Number cx, Number cy, GraphicsMathRect opacityOrMode, Number opacity, Number fx, Number fy) {
        if (jsBase == null) {
            this.fill = null;
            this.fill1 = null;
            this.fill2 = null;
            
            this.fill = fill;
            this.cx = cx;
            this.cy = cy;
            this.opacityOrMode = opacityOrMode;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fill = fill;
            this.cx = cx;
            this.cy = cy;
            this.opacityOrMode = opacityOrMode;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(opacityOrMode.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", ((fill != null) ? fill.generateJs() : "null"), cx, cy, ((opacityOrMode != null) ? opacityOrMode.getJsBase() : "null"), opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", ((fill != null) ? fill.generateJs() : "null"), cx, cy, ((opacityOrMode != null) ? opacityOrMode.getJsBase() : "null"), opacity, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * 
     */
    public ConnectorElement setFill(String json) {
        if (jsBase == null) {
        } else {
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s)", wrapQuotes(json)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", wrapQuotes(json)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for connector fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ConnectorElement setFill(GradientKey[] fill1, Number cx, Number cy, GraphicsMathRect opacityOrMode, Number opacity, Number fx, Number fy) {
        if (jsBase == null) {
            this.fill = null;
            this.fill1 = null;
            this.fill2 = null;
            
            this.fill1 = fill1;
            this.cx = cx;
            this.cy = cy;
            this.opacityOrMode = opacityOrMode;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fill1 = fill1;
            this.cx = cx;
            this.cy = cy;
            this.opacityOrMode = opacityOrMode;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(opacityOrMode.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(fill1), cx, cy, ((opacityOrMode != null) ? opacityOrMode.getJsBase() : "null"), opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToString(fill1), cx, cy, ((opacityOrMode != null) ? opacityOrMode.getJsBase() : "null"), opacity, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for connector fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ConnectorElement setFill(String[] fill2, Number cx, Number cy, GraphicsMathRect opacityOrMode, Number opacity, Number fx, Number fy) {
        if (jsBase == null) {
            this.fill = null;
            this.fill1 = null;
            this.fill2 = null;
            
            this.fill2 = fill2;
            this.cx = cx;
            this.cy = cy;
            this.opacityOrMode = opacityOrMode;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.fill2 = fill2;
            this.cx = cx;
            this.cy = cy;
            this.opacityOrMode = opacityOrMode;
            this.opacity = opacity;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(opacityOrMode.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(fill2), cx, cy, ((opacityOrMode != null) ? opacityOrMode.getJsBase() : "null"), opacity, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %s, %s, %s, %s, %s);", arrayToStringWrapQuotes(fill2), cx, cy, ((opacityOrMode != null) ? opacityOrMode.getJsBase() : "null"), opacity, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getNormal;

    /**
     * Getter for normal state settings.
     */
    public StateSettings getNormal() {
        if (getNormal == null)
            getNormal = new StateSettings(jsBase + ".normal()");

        return getNormal;
    }

    private String settings;

    /**
     * Setter for normal state settings.
     */
    public ConnectorElement setNormal(String settings) {
        if (jsBase == null) {
            this.settings = settings;
        } else {
            this.settings = settings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".normal(%s)", wrapQuotes(settings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".normal(%s);", wrapQuotes(settings)));
                js.setLength(0);
            }
        }
        return this;
    }

    private StateSettings getSelected;

    /**
     * Getter for selected state settings.
     */
    public StateSettings getSelected() {
        if (getSelected == null)
            getSelected = new StateSettings(jsBase + ".selected()");

        return getSelected;
    }

    private String settings1;

    /**
     * Setter for selected state settings.
     */
    public ConnectorElement setSelected(String settings1) {
        if (jsBase == null) {
            this.settings = null;
            this.settings1 = null;
            
            this.settings1 = settings1;
        } else {
            this.settings1 = settings1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selected(%s)", wrapQuotes(settings1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selected(%s);", wrapQuotes(settings1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for the connector stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ConnectorElement setStroke(Stroke stroke, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke = stroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke = stroke;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((stroke != null) ? stroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", ((stroke != null) ? stroke.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * 
     */
    public ConnectorElement setStroke(String json) {
        if (jsBase == null) {
        } else {
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s)", wrapQuotes(json)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s);", wrapQuotes(json)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the connector stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ConnectorElement setStroke(ColoredFill stroke1, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke1 = stroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke1 = stroke1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", ((stroke1 != null) ? stroke1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the connector stroke settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public ConnectorElement setStroke(String stroke2, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            this.stroke2 = null;
            
            this.stroke2 = stroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.stroke2 = stroke2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %s, %s, %s, %s)", wrapQuotes(stroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %s, %s, %s, %s);", wrapQuotes(stroke2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String settings2;
    private String generateJSgetNormal() {
        if (getNormal != null) {
            return getNormal.generateJs();
        }
        return "";
    }

    private String generateJSgetSelected() {
        if (getSelected != null) {
            return getSelected.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetNormal());
        jsGetters.append(generateJSgetSelected());

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