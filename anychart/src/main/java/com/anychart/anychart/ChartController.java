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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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
    private AnnotationJSONFormat annotationTypeOrConfig1;

    public AnnotationsBase startDrawing(AnnotationTypes annotationTypeOrConfig) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            
            this.annotationTypeOrConfig = annotationTypeOrConfig;
        } else {
            this.annotationTypeOrConfig = annotationTypeOrConfig;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
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


    public AnnotationsBase startDrawing(AnnotationJSONFormat annotationTypeOrConfig1) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            
            this.annotationTypeOrConfig1 = annotationTypeOrConfig1;
        } else {
            this.annotationTypeOrConfig1 = annotationTypeOrConfig1;

//            if (isChain && js.length() > 0 && TextUtils.equals(js.toString().substring(js.toString().length() - 1), ";")) {
//                js.setLength(js.length() - 1);
//            }
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".startDrawing(%s);", (annotationTypeOrConfig1 != null) ? annotationTypeOrConfig1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s)", (annotationTypeOrConfig1 != null) ? annotationTypeOrConfig1.generateJs() : "null"));
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
            return String.format(Locale.US, "annotationTypeOrConfig: %s,", (annotationTypeOrConfig1 != null) ? annotationTypeOrConfig1.generateJs() : "null");
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
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}