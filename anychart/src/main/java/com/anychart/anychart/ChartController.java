package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class ChartController extends CoreBase {

    public ChartController() {

    }

    protected ChartController(String jsBase) {
        this.jsBase = jsBase;
    }

    protected ChartController(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private AnnotationsBase annotation;

    public ChartController removeAnnotation(AnnotationsBase annotation) {
        if (jsBase == null) {
            this.annotation = annotation;
        } else {
            this.annotation = annotation;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".removeAnnotation(%s)", (annotation != null) ? annotation.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeAnnotation(%s)", (annotation != null) ? annotation.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnnotationsBase annotation1;

    public ChartController select(AnnotationsBase annotation1) {
        if (jsBase == null) {
            this.annotation = null;
            this.annotation1 = null;
            
            this.annotation1 = annotation1;
        } else {
            this.annotation1 = annotation1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".select(%s)", (annotation1 != null) ? annotation1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s)", (annotation1 != null) ? annotation1.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnnotationTypes annotationTypeOrConfig;
    private String annotationTypeOrConfig1;
    private AnnotationJSONFormat annotationTypeOrConfig2;

    public AnnotationsBase startDrawing(AnnotationTypes annotationTypeOrConfig) {
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

            js.append(String.format(Locale.US, jsBase + ".startDrawing(%s);", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s)", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
    }


    public AnnotationsBase startDrawing(String annotationTypeOrConfig1) {
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

            js.append(String.format(Locale.US, jsBase + ".startDrawing(%s);", annotationTypeOrConfig1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s)", annotationTypeOrConfig1));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
    }


    public AnnotationsBase startDrawing(AnnotationJSONFormat annotationTypeOrConfig2) {
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

            js.append(String.format(Locale.US, jsBase + ".startDrawing(%s);", (annotationTypeOrConfig2 != null) ? annotationTypeOrConfig2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s)", (annotationTypeOrConfig2 != null) ? annotationTypeOrConfig2.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
    }

    private String generateJSannotation() {
        if (annotation != null) {
            return String.format(Locale.US, "annotation: %s,", (annotation != null) ? annotation.generateJs() : "null");
        }
        return "";
    }

    private String generateJSannotation1() {
        if (annotation1 != null) {
            return String.format(Locale.US, "annotation: %s,", (annotation1 != null) ? annotation1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSannotationTypeOrConfig() {
        if (annotationTypeOrConfig != null) {
            return String.format(Locale.US, "annotationTypeOrConfig: %s,", (annotationTypeOrConfig != null) ? annotationTypeOrConfig.generateJs() : "null");
        }
        return "";
    }

    private String generateJSannotationTypeOrConfig1() {
        if (annotationTypeOrConfig1 != null) {
            return String.format(Locale.US, "annotationTypeOrConfig: %s,", annotationTypeOrConfig1);
        }
        return "";
    }

    private String generateJSannotationTypeOrConfig2() {
        if (annotationTypeOrConfig2 != null) {
            return String.format(Locale.US, "annotationTypeOrConfig: %s,", (annotationTypeOrConfig2 != null) ? annotationTypeOrConfig2.generateJs() : "null");
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

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSannotation());
            js.append(generateJSannotation1());
            js.append(generateJSannotationTypeOrConfig());
            js.append(generateJSannotationTypeOrConfig1());
            js.append(generateJSannotationTypeOrConfig2());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}