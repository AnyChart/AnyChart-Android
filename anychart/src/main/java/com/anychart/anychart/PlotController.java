package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class PlotController extends JsObject {

    private String jsBase;

    public PlotController() {

    }

    protected PlotController(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private AnnotationTypes annotationTypeOrConfig;
    private AnnotationJSONFormat annotationTypeOrConfig1;

    public void setAdd(AnnotationTypes annotationTypeOrConfig) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            
            this.annotationTypeOrConfig = annotationTypeOrConfig;
        } else {
            this.annotationTypeOrConfig = annotationTypeOrConfig;

            js.append(String.format(Locale.US, jsBase + ".add(%s);", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".add(%s);", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setAdd(AnnotationJSONFormat annotationTypeOrConfig1) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            
            this.annotationTypeOrConfig1 = annotationTypeOrConfig1;
        } else {
            this.annotationTypeOrConfig1 = annotationTypeOrConfig1;

            js.append(String.format(Locale.US, jsBase + ".add(%s);", (annotationTypeOrConfig1 != null) ? annotationTypeOrConfig1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".add(%s);", (annotationTypeOrConfig1 != null) ? annotationTypeOrConfig1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String config;

    public void setAndrewspitchfork(String config) {
        if (jsBase == null) {
            this.config = config;
        } else {
            this.config = config;

            js.append(String.format(Locale.US, jsBase + ".andrewsPitchfork(%s);", config));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".andrewsPitchfork(%s);", config));
                js.setLength(0);
            }
        }
    }

    private String config1;

    public void setEllipse(String config1) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            
            this.config1 = config1;
        } else {
            this.config1 = config1;

            js.append(String.format(Locale.US, jsBase + ".ellipse(%s);", config1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ellipse(%s);", config1));
                js.setLength(0);
            }
        }
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;

            js.append(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));
                js.setLength(0);
            }
        }
    }

    private String config2;

    public void setFibonacciarc(String config2) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            
            this.config2 = config2;
        } else {
            this.config2 = config2;

            js.append(String.format(Locale.US, jsBase + ".fibonacciArc(%s);", config2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fibonacciArc(%s);", config2));
                js.setLength(0);
            }
        }
    }

    private String config3;

    public void setFibonaccifan(String config3) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            
            this.config3 = config3;
        } else {
            this.config3 = config3;

            js.append(String.format(Locale.US, jsBase + ".fibonacciFan(%s);", config3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fibonacciFan(%s);", config3));
                js.setLength(0);
            }
        }
    }

    private String config4;

    public void setFibonacciretracement(String config4) {
        if (jsBase == null) {
            this.config = null;
            this.config1 = null;
            this.config2 = null;
            this.config3 = null;
            this.config4 = null;
            
            this.config4 = config4;
        } else {
            this.config4 = config4;

            js.append(String.format(Locale.US, jsBase + ".fibonacciRetracement(%s);", config4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fibonacciRetracement(%s);", config4));
                js.setLength(0);
            }
        }
    }

    private String config5;

    public void setFibonaccitimezones(String config5) {
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

            js.append(String.format(Locale.US, jsBase + ".fibonacciTimezones(%s);", config5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fibonacciTimezones(%s);", config5));
                js.setLength(0);
            }
        }
    }

    private String config6;
    private String config7;

    public void setFromjson(String config6) {
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

            js.append(String.format(Locale.US, jsBase + ".fromJson(%s);", config6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fromJson(%s);", config6));
                js.setLength(0);
            }
        }
    }

    private String config8;

    public void setFromxml(String config8) {
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

            js.append(String.format(Locale.US, jsBase + ".fromXml(%s);", config8));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fromXml(%s);", config8));
                js.setLength(0);
            }
        }
    }

    private Double index;

    public void setGetannotationat(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".getAnnotationAt(%f);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getAnnotationAt(%f);", index));
                js.setLength(0);
            }
        }
    }

    private String config9;

    public void setHorizontalline(String config9) {
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

            js.append(String.format(Locale.US, jsBase + ".horizontalLine(%s);", config9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".horizontalLine(%s);", config9));
                js.setLength(0);
            }
        }
    }

    private String config10;

    public void setInfiniteline(String config10) {
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

            js.append(String.format(Locale.US, jsBase + ".infiniteLine(%s);", config10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".infiniteLine(%s);", config10));
                js.setLength(0);
            }
        }
    }

    private String config11;

    public void setLine(String config11) {
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

            js.append(String.format(Locale.US, jsBase + ".line(%s);", config11));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".line(%s);", config11));
                js.setLength(0);
            }
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private String config12;

    public void setMarker(String config12) {
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

            js.append(String.format(Locale.US, jsBase + ".marker(%s);", config12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".marker(%s);", config12));
                js.setLength(0);
            }
        }
    }

    private PaperSize paperSizeOrOptions;
    private String paperSizeOrOptions1;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
                js.setLength(0);
            }
        }
    }


    public void setPrint(String paperSizeOrOptions1, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));
                js.setLength(0);
            }
        }
    }

    private String config13;

    public void setRay(String config13) {
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

            js.append(String.format(Locale.US, jsBase + ".ray(%s);", config13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ray(%s);", config13));
                js.setLength(0);
            }
        }
    }

    private String config14;

    public void setRectangle(String config14) {
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

            js.append(String.format(Locale.US, jsBase + ".rectangle(%s);", config14));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".rectangle(%s);", config14));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private AnnotationsBase annotation;

    public void setRemoveannotation(AnnotationsBase annotation) {
        if (jsBase == null) {
            this.annotation = annotation;
        } else {
            this.annotation = annotation;

            js.append(String.format(Locale.US, jsBase + ".removeAnnotation(%s);", (annotation != null) ? annotation.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAnnotation(%s);", (annotation != null) ? annotation.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double index1;

    public void setRemoveannotationat(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;

            js.append(String.format(Locale.US, jsBase + ".removeAnnotationAt(%f);", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAnnotationAt(%f);", index1));
                js.setLength(0);
            }
        }
    }

    private AnnotationsBase annotation1;

    public void setSelect(AnnotationsBase annotation1) {
        if (jsBase == null) {
            this.annotation = null;
            this.annotation1 = null;
            
            this.annotation1 = annotation1;
        } else {
            this.annotation1 = annotation1;

            js.append(String.format(Locale.US, jsBase + ".select(%s);", (annotation1 != null) ? annotation1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s);", (annotation1 != null) ? annotation1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private AnnotationTypes annotationTypeOrConfig2;
    private AnnotationJSONFormat annotationTypeOrConfig3;

    public void setStartdrawing(AnnotationTypes annotationTypeOrConfig2) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            this.annotationTypeOrConfig3 = null;
            
            this.annotationTypeOrConfig2 = annotationTypeOrConfig2;
        } else {
            this.annotationTypeOrConfig2 = annotationTypeOrConfig2;

            js.append(String.format(Locale.US, jsBase + ".startDrawing(%s);", (annotationTypeOrConfig2 != null) ? annotationTypeOrConfig2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s);", (annotationTypeOrConfig2 != null) ? annotationTypeOrConfig2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStartdrawing(AnnotationJSONFormat annotationTypeOrConfig3) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            this.annotationTypeOrConfig3 = null;
            
            this.annotationTypeOrConfig3 = annotationTypeOrConfig3;
        } else {
            this.annotationTypeOrConfig3 = annotationTypeOrConfig3;

            js.append(String.format(Locale.US, jsBase + ".startDrawing(%s);", (annotationTypeOrConfig3 != null) ? annotationTypeOrConfig3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s);", (annotationTypeOrConfig3 != null) ? annotationTypeOrConfig3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Boolean stringify;
    private Boolean includeTheme;

    public void setTojson(Boolean stringify, Boolean includeTheme) {
        if (jsBase == null) {
            this.stringify = stringify;
            this.includeTheme = includeTheme;
        } else {
            this.stringify = stringify;
            this.includeTheme = includeTheme;

            js.append(String.format(Locale.US, jsBase + ".toJson(%b, %b);", stringify, includeTheme));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toJson(%b, %b);", stringify, includeTheme));
                js.setLength(0);
            }
        }
    }

    private Boolean asXmlNode;
    private Boolean includeTheme1;

    public void setToxml(Boolean asXmlNode, Boolean includeTheme1) {
        if (jsBase == null) {
            this.asXmlNode = asXmlNode;
            this.includeTheme = null;
            this.includeTheme1 = null;
            
            this.includeTheme1 = includeTheme1;
        } else {
            this.asXmlNode = asXmlNode;
            this.includeTheme1 = includeTheme1;

            js.append(String.format(Locale.US, jsBase + ".toXml(%b, %b);", asXmlNode, includeTheme1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".toXml(%b, %b);", asXmlNode, includeTheme1));
                js.setLength(0);
            }
        }
    }

    private String config15;

    public void setTrendchannel(String config15) {
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

            js.append(String.format(Locale.US, jsBase + ".trendChannel(%s);", config15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".trendChannel(%s);", config15));
                js.setLength(0);
            }
        }
    }

    private String config16;

    public void setTriangle(String config16) {
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

            js.append(String.format(Locale.US, jsBase + ".triangle(%s);", config16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".triangle(%s);", config16));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key;

    public void setUnlistenbykey(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key));
                js.setLength(0);
            }
        }
    }

    private String config17;

    public void setVerticalline(String config17) {
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

            js.append(String.format(Locale.US, jsBase + ".verticalLine(%s);", config17));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".verticalLine(%s);", config17));
                js.setLength(0);
            }
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        if (jsBase == null) {
            this.zIndex = zIndex;
        } else {
            this.zIndex = zIndex;

            js.append(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));
                js.setLength(0);
            }
        }
    }

    private String generateJSannotationTypeOrConfig() {
        if (annotationTypeOrConfig != null) {
            return String.format(Locale.US, "annotationTypeOrConfig: %s,", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.generateJs() : "null");
        }
        return "";
    }

    private String generateJSannotationTypeOrConfig1() {
        if (annotationTypeOrConfig1 != null) {
            return String.format(Locale.US, "annotationTypeOrConfig: %s,", (annotationTypeOrConfig1 != null) ? annotationTypeOrConfig1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSconfig() {
        if (config != null) {
            return String.format(Locale.US, "config: %s,", config);
        }
        return "";
    }

    private String generateJSconfig1() {
        if (config1 != null) {
            return String.format(Locale.US, "config: %s,", config1);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSconfig2() {
        if (config2 != null) {
            return String.format(Locale.US, "config: %s,", config2);
        }
        return "";
    }

    private String generateJSconfig3() {
        if (config3 != null) {
            return String.format(Locale.US, "config: %s,", config3);
        }
        return "";
    }

    private String generateJSconfig4() {
        if (config4 != null) {
            return String.format(Locale.US, "config: %s,", config4);
        }
        return "";
    }

    private String generateJSconfig5() {
        if (config5 != null) {
            return String.format(Locale.US, "config: %s,", config5);
        }
        return "";
    }

    private String generateJSconfig6() {
        if (config6 != null) {
            return String.format(Locale.US, "config: %s,", config6);
        }
        return "";
    }

    private String generateJSconfig7() {
        if (config7 != null) {
            return String.format(Locale.US, "config: %s,", config7);
        }
        return "";
    }

    private String generateJSconfig8() {
        if (config8 != null) {
            return String.format(Locale.US, "config: %s,", config8);
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSconfig9() {
        if (config9 != null) {
            return String.format(Locale.US, "config: %s,", config9);
        }
        return "";
    }

    private String generateJSconfig10() {
        if (config10 != null) {
            return String.format(Locale.US, "config: %s,", config10);
        }
        return "";
    }

    private String generateJSconfig11() {
        if (config11 != null) {
            return String.format(Locale.US, "config: %s,", config11);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
        }
        return "";
    }

    private String generateJSconfig12() {
        if (config12 != null) {
            return String.format(Locale.US, "config: %s,", config12);
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions1() {
        if (paperSizeOrOptions1 != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", paperSizeOrOptions1);
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJSconfig13() {
        if (config13 != null) {
            return String.format(Locale.US, "config: %s,", config13);
        }
        return "";
    }

    private String generateJSconfig14() {
        if (config14 != null) {
            return String.format(Locale.US, "config: %s,", config14);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSannotation() {
        if (annotation != null) {
            return String.format(Locale.US, "annotation: %s,", (annotation != null) ? annotation.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSannotation1() {
        if (annotation1 != null) {
            return String.format(Locale.US, "annotation: %s,", (annotation1 != null) ? annotation1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSannotationTypeOrConfig2() {
        if (annotationTypeOrConfig2 != null) {
            return String.format(Locale.US, "annotationTypeOrConfig: %s,", (annotationTypeOrConfig2 != null) ? annotationTypeOrConfig2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSannotationTypeOrConfig3() {
        if (annotationTypeOrConfig3 != null) {
            return String.format(Locale.US, "annotationTypeOrConfig: %s,", (annotationTypeOrConfig3 != null) ? annotationTypeOrConfig3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstringify() {
        if (stringify != null) {
            return String.format(Locale.US, "stringify: %b,", stringify);
        }
        return "";
    }

    private String generateJSincludeTheme() {
        if (includeTheme != null) {
            return String.format(Locale.US, "includeTheme: %b,", includeTheme);
        }
        return "";
    }

    private String generateJSasXmlNode() {
        if (asXmlNode != null) {
            return String.format(Locale.US, "asXmlNode: %b,", asXmlNode);
        }
        return "";
    }

    private String generateJSincludeTheme1() {
        if (includeTheme1 != null) {
            return String.format(Locale.US, "includeTheme: %b,", includeTheme1);
        }
        return "";
    }

    private String generateJSconfig15() {
        if (config15 != null) {
            return String.format(Locale.US, "config: %s,", config15);
        }
        return "";
    }

    private String generateJSconfig16() {
        if (config16 != null) {
            return String.format(Locale.US, "config: %s,", config16);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSconfig17() {
        if (config17 != null) {
            return String.format(Locale.US, "config: %s,", config17);
        }
        return "";
    }

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSannotationTypeOrConfig());
            js.append(generateJSannotationTypeOrConfig1());
            js.append(generateJSconfig());
            js.append(generateJSconfig1());
            js.append(generateJSenabled());
            js.append(generateJSconfig2());
            js.append(generateJSconfig3());
            js.append(generateJSconfig4());
            js.append(generateJSconfig5());
            js.append(generateJSconfig6());
            js.append(generateJSconfig7());
            js.append(generateJSconfig8());
            js.append(generateJSindex());
            js.append(generateJSconfig9());
            js.append(generateJSconfig10());
            js.append(generateJSconfig11());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSconfig12());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJSconfig13());
            js.append(generateJSconfig14());
            js.append(generateJStype2());
            js.append(generateJSannotation());
            js.append(generateJSindex1());
            js.append(generateJSannotation1());
            js.append(generateJSannotationTypeOrConfig2());
            js.append(generateJSannotationTypeOrConfig3());
            js.append(generateJSstringify());
            js.append(generateJSincludeTheme());
            js.append(generateJSasXmlNode());
            js.append(generateJSincludeTheme1());
            js.append(generateJSconfig15());
            js.append(generateJSconfig16());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSconfig17());
            js.append(generateJSzIndex());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}