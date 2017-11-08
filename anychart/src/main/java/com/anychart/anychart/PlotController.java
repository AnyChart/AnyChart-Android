package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Plot controller class.
 */
public class PlotController extends VisualBase {

    public PlotController() {
        js.setLength(0);
        js.append("var plotController").append(++variableIndex).append(" = anychart.core.annotations.plotController();");
        jsBase = "plotController" + variableIndex;
    }

    protected PlotController(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected PlotController(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private AnnotationTypes annotationTypeOrConfig;
    private String annotationTypeOrConfig1;
    private AnnotationJSONFormat annotationTypeOrConfig2;

    /**
     * Adds annotation on the plot.
     */
    public AnnotationsBase add(AnnotationTypes annotationTypeOrConfig) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            
            this.annotationTypeOrConfig = annotationTypeOrConfig;
        } else {
            this.annotationTypeOrConfig = annotationTypeOrConfig;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".add(%s)", ((annotationTypeOrConfig != null) ? annotationTypeOrConfig.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
    }


    /**
     * Adds annotation on the plot.
     */
    public AnnotationsBase add(String annotationTypeOrConfig1) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            
            this.annotationTypeOrConfig1 = annotationTypeOrConfig1;
        } else {
            this.annotationTypeOrConfig1 = annotationTypeOrConfig1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".add(%s)", wrapQuotes(annotationTypeOrConfig1)));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
    }


    /**
     * Adds annotation on the plot.
     */
    public AnnotationsBase add(AnnotationJSONFormat annotationTypeOrConfig2) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            
            this.annotationTypeOrConfig2 = annotationTypeOrConfig2;
        } else {
            this.annotationTypeOrConfig2 = annotationTypeOrConfig2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".add(%s)", ((annotationTypeOrConfig2 != null) ? annotationTypeOrConfig2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
    }

    private String config;

    /**
     * Creates and returns an Andrews Pitchfork annotation.
     */
    public AndrewsPitchfork andrewsPitchfork(String config) {
        if (jsBase == null) {
            this.config = config;
        } else {
            this.config = config;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".andrewsPitchfork(%s)", wrapQuotes(config)));
                js.setLength(0);
            }
        }
        return new AndrewsPitchfork(jsBase);
    }

    private String config1;

    /**
     * Creates and returns an Ellipse annotation.
     */
    public AnnotationsEllipse ellipse(String config1) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            
            this.config1 = config1;
        } else {
            this.config1 = config1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ellipse(%s)", wrapQuotes(config1)));
                js.setLength(0);
            }
        }
        return new AnnotationsEllipse(jsBase);
    }

    private String config2;

    /**
     * Creates and returns a Fibonacci Arc annotation.
     */
    public FibonacciArc fibonacciArc(String config2) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            
            this.config2 = config2;
        } else {
            this.config2 = config2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fibonacciArc(%s)", wrapQuotes(config2)));
                js.setLength(0);
            }
        }
        return new FibonacciArc(jsBase);
    }

    private String config3;

    /**
     * Creates and returns a Fibonacci Fan annotation.
     */
    public FibonacciFan fibonacciFan(String config3) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            
            this.config3 = config3;
        } else {
            this.config3 = config3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fibonacciFan(%s)", wrapQuotes(config3)));
                js.setLength(0);
            }
        }
        return new FibonacciFan(jsBase);
    }

    private String config4;

    /**
     * Creates and returns a Fibonacci Retracement annotation.
     */
    public FibonacciRetracement fibonacciRetracement(String config4) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            
            this.config4 = config4;
        } else {
            this.config4 = config4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fibonacciRetracement(%s)", wrapQuotes(config4)));
                js.setLength(0);
            }
        }
        return new FibonacciRetracement(jsBase);
    }

    private String config5;

    /**
     * Creates and returns a Fibonacci Timezones annotation.
     */
    public FibonacciTimezones fibonacciTimezones(String config5) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            
            this.config5 = config5;
        } else {
            this.config5 = config5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fibonacciTimezones(%s)", wrapQuotes(config5)));
                js.setLength(0);
            }
        }
        return new FibonacciTimezones(jsBase);
    }

    private String config6;
    private String config7;

    /**
     * Creates annotations list by JSON config.
     */
    public PlotController fromJson(String config6) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            
            this.config6 = config6;
        } else {
            this.config6 = config6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fromJson(%s)", wrapQuotes(config6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fromJson(%s)", wrapQuotes(config6)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String config8;

    /**
     * Creates annotations list by XML config.
     */
    public PlotController fromXml(String config8) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            
            this.config8 = config8;
        } else {
            this.config8 = config8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fromXml(%s)", wrapQuotes(config8)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fromXml(%s)", wrapQuotes(config8)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double index;

    /**
     * Returns annotation by index.
     */
    public AnnotationsBase getAnnotationAt(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getAnnotationAt(%f)", index));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
    }

    private String config9;

    /**
     * Creates and returns a Horizontal Line annotation.
     */
    public HorizontalLine horizontalLine(String config9) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            
            this.config9 = config9;
        } else {
            this.config9 = config9;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".horizontalLine(%s)", wrapQuotes(config9)));
                js.setLength(0);
            }
        }
        return new HorizontalLine(jsBase);
    }

    private String config10;

    /**
     * Creates and returns an Infinite Line annotation.
     */
    public InfiniteLine infiniteLine(String config10) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            
            this.config10 = config10;
        } else {
            this.config10 = config10;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".infiniteLine(%s)", wrapQuotes(config10)));
                js.setLength(0);
            }
        }
        return new InfiniteLine(jsBase);
    }

    private String config11;

    /**
     * Creates and returns a Line annotation.
     */
    public AnnotationsLine line(String config11) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            
            this.config11 = config11;
        } else {
            this.config11 = config11;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s)", wrapQuotes(config11)));
                js.setLength(0);
            }
        }
        return new AnnotationsLine(jsBase);
    }

    private String config12;

    /**
     * Creates and returns a Marker annotation.
     */
    public AnnotationsMarker marker(String config12) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            
            this.config12 = config12;
        } else {
            this.config12 = config12;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s)", wrapQuotes(config12)));
                js.setLength(0);
            }
        }
        return new AnnotationsMarker(jsBase);
    }

    private String config13;

    /**
     * Creates and returns a Ray annotation.
     */
    public Ray ray(String config13) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            this.config13 = null;
            
            this.config13 = config13;
        } else {
            this.config13 = config13;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ray(%s)", wrapQuotes(config13)));
                js.setLength(0);
            }
        }
        return new Ray(jsBase);
    }

    private String config14;

    /**
     * Creates and returns a Rectangle annotation.
     */
    public Rectangle rectangle(String config14) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            this.config13 = null;
            this.config14 = null;
            
            this.config14 = config14;
        } else {
            this.config14 = config14;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rectangle(%s)", wrapQuotes(config14)));
                js.setLength(0);
            }
        }
        return new Rectangle(jsBase);
    }

    private AnnotationsBase annotation;

    /**
     * Removes an annotation from a plot by its instance.
     */
    public PlotController removeAnnotation(AnnotationsBase annotation) {
        if (jsBase == null) {
            this.annotation = annotation;
        } else {
            this.annotation = annotation;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(annotation.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".removeAnnotation(%s);",  ((annotation != null) ? annotation.getJsBase() : "null")));
        }
        return this;
    }

    private Double index1;

    /**
     * Removes an annotation from a plot by its index.
     */
    public PlotController removeAnnotationAt(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".removeAnnotationAt(%f)", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeAnnotationAt(%f)", index1));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnnotationsBase annotation1;

    /**
     * Selects annotation.
     */
    public PlotController select(AnnotationsBase annotation1) {
        if (jsBase == null) {
            this.annotation = null;
            this.annotation1 = null;
            
            this.annotation1 = annotation1;
        } else {
            this.annotation1 = annotation1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(annotation1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".select(%s);",  ((annotation1 != null) ? annotation1.getJsBase() : "null")));
        }
        return this;
    }

    private AnnotationTypes annotationTypeOrConfig3;
    private String annotationTypeOrConfig4;
    private AnnotationJSONFormat annotationTypeOrConfig5;

    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} and {@link anychart.charts.Stock#draw} is called.
     */
    public AnnotationsBase startDrawing(AnnotationTypes annotationTypeOrConfig3) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            this.annotationTypeOrConfig3 = null;
            this.annotationTypeOrConfig4 = null;
            this.annotationTypeOrConfig5 = null;
            
            this.annotationTypeOrConfig3 = annotationTypeOrConfig3;
        } else {
            this.annotationTypeOrConfig3 = annotationTypeOrConfig3;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s)", ((annotationTypeOrConfig3 != null) ? annotationTypeOrConfig3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
    }


    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} and {@link anychart.charts.Stock#draw} is called.
     */
    public AnnotationsBase startDrawing(String annotationTypeOrConfig4) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            this.annotationTypeOrConfig3 = null;
            this.annotationTypeOrConfig4 = null;
            this.annotationTypeOrConfig5 = null;
            
            this.annotationTypeOrConfig4 = annotationTypeOrConfig4;
        } else {
            this.annotationTypeOrConfig4 = annotationTypeOrConfig4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s)", wrapQuotes(annotationTypeOrConfig4)));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
    }


    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Cartesian#draw} and {@link anychart.charts.Stock#draw} is called.
     */
    public AnnotationsBase startDrawing(AnnotationJSONFormat annotationTypeOrConfig5) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            this.annotationTypeOrConfig3 = null;
            this.annotationTypeOrConfig4 = null;
            this.annotationTypeOrConfig5 = null;
            
            this.annotationTypeOrConfig5 = annotationTypeOrConfig5;
        } else {
            this.annotationTypeOrConfig5 = annotationTypeOrConfig5;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s)", ((annotationTypeOrConfig5 != null) ? annotationTypeOrConfig5.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
    }

    private Boolean stringify;

    /**
     * Return plot annotations configuration as JSON object or string.
     */
    public void toJson(Boolean stringify) {
        if (jsBase == null) {
            this.stringify = stringify;
        } else {
            this.stringify = stringify;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toJson(%b)", stringify));
                js.setLength(0);
            }
        }
    }

    private Boolean asXmlNode;

    /**
     * Return plot annotations configuration as XML string or XMLNode.
     */
    public void toXml(Boolean asXmlNode) {
        if (jsBase == null) {
            this.asXmlNode = asXmlNode;
        } else {
            this.asXmlNode = asXmlNode;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toXml(%b)", asXmlNode));
                js.setLength(0);
            }
        }
    }

    private String config15;

    /**
     * Creates and returns a Trend Channel annotation.
     */
    public TrendChannel trendChannel(String config15) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            this.config13 = null;
            this.config14 = null;
            this.config15 = null;
            
            this.config15 = config15;
        } else {
            this.config15 = config15;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".trendChannel(%s)", wrapQuotes(config15)));
                js.setLength(0);
            }
        }
        return new TrendChannel(jsBase);
    }

    private String config16;

    /**
     * Creates and returns a Triangle annotation.
     */
    public Triangle triangle(String config16) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            this.config13 = null;
            this.config14 = null;
            this.config15 = null;
            this.config16 = null;
            
            this.config16 = config16;
        } else {
            this.config16 = config16;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".triangle(%s)", wrapQuotes(config16)));
                js.setLength(0);
            }
        }
        return new Triangle(jsBase);
    }

    private String config17;

    /**
     * Creates and returns a Vertical Line annotation.
     */
    public VerticalLine verticalLine(String config17) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            this.config5 = null;
            this.config6 = null;
            this.config7 = null;
            this.config8 = null;
            this.config9 = null;
            this.config10 = null;
            this.config11 = null;
            this.config12 = null;
            this.config13 = null;
            this.config14 = null;
            this.config15 = null;
            this.config16 = null;
            this.config17 = null;
            
            this.config17 = config17;
        } else {
            this.config17 = config17;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".verticalLine(%s)", wrapQuotes(config17)));
                js.setLength(0);
            }
        }
        return new VerticalLine(jsBase);
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