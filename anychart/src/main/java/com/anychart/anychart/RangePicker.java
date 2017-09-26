package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class RangePicker extends JsObject {

    private String jsBase;

    public RangePicker() {

    }

    protected RangePicker(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Element decorate;

    public void setDecorate(Element decorate) {
        if (jsBase == null) {
            this.decorate = decorate;
        } else {
            this.decorate = decorate;

            js.append(String.format(Locale.US, jsBase + ".decorate(%s);", (decorate != null) ? decorate.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".decorate(%s);", (decorate != null) ? decorate.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String format;

    public void setFormat(String format) {
        if (jsBase == null) {
            this.format = format;
        } else {
            this.format = format;

            js.append(String.format(Locale.US, jsBase + ".format(%s);", format));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".format(%s);", format));
                js.setLength(0);
            }
        }
    }

    private String fromLabelText;

    public void setFromlabeltext(String fromLabelText) {
        if (jsBase == null) {
            this.fromLabelText = fromLabelText;
        } else {
            this.fromLabelText = fromLabelText;

            js.append(String.format(Locale.US, jsBase + ".fromLabelText(%s);", fromLabelText));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fromLabelText(%s);", fromLabelText));
                js.setLength(0);
            }
        }
    }

    private ChartsStock parentElement;
    private Element parentElement1;

    public void setRender(ChartsStock parentElement) {
        if (jsBase == null) {
            this.parentElement = null;
            this.parentElement1 = null;
            
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


    public void setRender(Element parentElement1) {
        if (jsBase == null) {
            this.parentElement = null;
            this.parentElement1 = null;
            
            this.parentElement1 = parentElement1;
        } else {
            this.parentElement1 = parentElement1;

            js.append(String.format(Locale.US, jsBase + ".render(%s);", (parentElement1 != null) ? parentElement1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".render(%s);", (parentElement1 != null) ? parentElement1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private ChartsStock chart;

    public void setTarget(ChartsStock chart) {
        if (jsBase == null) {
            this.chart = chart;
        } else {
            this.chart = chart;

            js.append(String.format(Locale.US, jsBase + ".target(%s);", (chart != null) ? chart.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".target(%s);", (chart != null) ? chart.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String toLabelText;

    public void setTolabeltext(String toLabelText) {
        if (jsBase == null) {
            this.toLabelText = toLabelText;
        } else {
            this.toLabelText = toLabelText;

            js.append(String.format(Locale.US, jsBase + ".toLabelText(%s);", toLabelText));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toLabelText(%s);", toLabelText));
                js.setLength(0);
            }
        }
    }

    private String generateJSdecorate() {
        if (decorate != null) {
            return String.format(Locale.US, "decorate: %s,", (decorate != null) ? decorate.generateJs() : "null");
        }
        return "";
    }

    private String generateJSformat() {
        if (format != null) {
            return String.format(Locale.US, "format: %s,", format);
        }
        return "";
    }

    private String generateJSfromLabelText() {
        if (fromLabelText != null) {
            return String.format(Locale.US, "fromLabelText: %s,", fromLabelText);
        }
        return "";
    }

    private String generateJSparentElement() {
        if (parentElement != null) {
            return String.format(Locale.US, "parentElement: %s,", (parentElement != null) ? parentElement.generateJs() : "null");
        }
        return "";
    }

    private String generateJSparentElement1() {
        if (parentElement1 != null) {
            return String.format(Locale.US, "parentElement: %s,", (parentElement1 != null) ? parentElement1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSchart() {
        if (chart != null) {
            return String.format(Locale.US, "chart: %s,", (chart != null) ? chart.generateJs() : "null");
        }
        return "";
    }

    private String generateJStoLabelText() {
        if (toLabelText != null) {
            return String.format(Locale.US, "toLabelText: %s,", toLabelText);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSdecorate());
            js.append(generateJSformat());
            js.append(generateJSfromLabelText());
            js.append(generateJSparentElement());
            js.append(generateJSparentElement1());
            js.append(generateJSchart());
            js.append(generateJStoLabelText());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}