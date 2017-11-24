package com.anychart.anychart;

import java.util.Arrays;
import java.util.Locale;

// class
/**
 * Table cell.
 */
public class Cell extends TableBase {

    public Cell() {
        js.setLength(0);
        js.append("var cell").append(++variableIndex).append(" = anychart.core.ui.table.cell();");
        jsBase = "cell" + variableIndex;
    }

    protected Cell(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Cell(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double colSpan;

    /**
     * Setter for cell columns span.
     */
    public Cell setColSpan(Double colSpan) {
        if (jsBase == null) {
            this.colSpan = colSpan;
        } else {
            this.colSpan = colSpan;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".colSpan(%f)", colSpan));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".colSpan(%f)", colSpan));
                js.setLength(0);
            }
        }
        return this;
    }

    private VisualBase getContent;

    /**
     * Getter for cell content.
     */
    public VisualBase getContent() {
        if (getContent == null)
            getContent = new VisualBase(jsBase + ".content()");

        return getContent;
    }

    private VisualBase content;
    private String content1;
    private Double content2;

    /**
     * Setter for cell content.
     */
    public Cell setContent(VisualBase content) {
        if (jsBase == null) {
            this.content = null;
            this.content1 = null;
            this.content2 = null;
            
            this.content = content;
        } else {
            this.content = content;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(content.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".content(%s);",  ((content != null) ? content.getJsBase() : "null")));
        }
        return this;
    }


    /**
     * Setter for cell content.
     */
    public Cell setContent(String content1) {
        if (jsBase == null) {
            this.content = null;
            this.content1 = null;
            this.content2 = null;
            
            this.content1 = content1;
        } else {
            this.content1 = content1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".content(%s)", wrapQuotes(content1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".content(%s)", wrapQuotes(content1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for cell content.
     */
    public Cell setContent(Double content2) {
        if (jsBase == null) {
            this.content = null;
            this.content1 = null;
            this.content2 = null;
            
            this.content2 = content2;
        } else {
            this.content2 = content2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".content(%f)", content2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".content(%f)", content2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill fill;

    /**
     * Sets fill settings using an object or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Cell setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private String color;
    private Double opacity;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public Cell fill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Cell fill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Cell fill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Cell fill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Cell fill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Cell fill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Cell fill(String[] keys1, Double angle, Double opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Cell fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public Cell fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }

    private Fill imageSettings;
    private TablePadding getPadding;

    /**
     * Getter for padding settings.
     */
    public TablePadding getPadding() {
        if (getPadding == null)
            getPadding = new TablePadding(jsBase + ".padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;

    /**
     * Setter for cell paddings in pixels using a single value.<br/>
     */
    public Cell setPadding(Double[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for cell paddings in pixels using a single value.<br/>
     */
    public Cell setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for cell paddings in pixels using a single value.<br/>
     */
    public Cell setPadding(String padding2) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding2 = padding2;
        } else {
            this.padding2 = padding2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s)", wrapQuotes(padding2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", wrapQuotes(padding2)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;

    /**
     * Setter for cell paddings in pixels using several numbers.
     */
    public Cell setPadding(String value, String value2, String value4, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value4 = value4;
            this.value6 = value6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for cell paddings in pixels using several numbers.
     */
    public Cell setPadding(Double value1, Double value3, Double value5, Double value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value5 = value5;
            this.value7 = value7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double rowSpan;

    /**
     * Setter for cell rows span.
     */
    public Cell setRowSpan(Double rowSpan) {
        if (jsBase == null) {
            this.rowSpan = rowSpan;
        } else {
            this.rowSpan = rowSpan;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rowSpan(%f)", rowSpan));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rowSpan(%f)", rowSpan));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetContent() {
        if (getContent != null) {
            return getContent.generateJs();
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetContent());
        jsGetters.append(generateJSgetPadding());

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