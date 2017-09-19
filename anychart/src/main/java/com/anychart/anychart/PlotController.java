package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class PlotController extends JsObject {

    
    private AnnotationTypes annotationTypeOrConfig;
    private AnnotationJSONFormat annotationTypeOrConfig1;

    public void setAdd(AnnotationTypes annotationTypeOrConfig) {
        this.annotationTypeOrConfig = null;
        this.annotationTypeOrConfig1 = null;
        
        this.annotationTypeOrConfig = annotationTypeOrConfig;
    }


    public void setAdd(AnnotationJSONFormat annotationTypeOrConfig1) {
        this.annotationTypeOrConfig = null;
        this.annotationTypeOrConfig1 = null;
        
        this.annotationTypeOrConfig1 = annotationTypeOrConfig1;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private String config;

    public void setFromjson(String config) {
        this.config = config;
    }

    private String config1;

    public void setFromxml(String config1) {
        this.config = null;
        this.config1 = null;
        
        this.config1 = config1;
    }

    private Double index;

    public void setGetannotationat(Double index) {
        this.index = index;
    }

    private String type;
    private Boolean useCapture;

    public void setListen(String type, Boolean useCapture) {
        this.type = type;
        this.useCapture = useCapture;
    }

    private String type1;
    private Boolean useCapture1;

    public void setListenonce(String type1, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private PaperSize paperSizeOrOptions;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        this.paperSizeOrOptions = paperSizeOrOptions;
        this.landscape = landscape;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private AnnotationsBase annotation;

    public void setRemoveannotation(AnnotationsBase annotation) {
        this.annotation = annotation;
    }

    private Double index1;

    public void setRemoveannotationat(Double index1) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
    }

    private AnnotationsBase annotation1;

    public void setSelect(AnnotationsBase annotation1) {
        this.annotation = null;
        this.annotation1 = null;
        
        this.annotation1 = annotation1;
    }

    private AnnotationTypes annotationTypeOrConfig2;
    private AnnotationJSONFormat annotationTypeOrConfig3;

    public void setStartdrawing(AnnotationTypes annotationTypeOrConfig2) {
        this.annotationTypeOrConfig = null;
        this.annotationTypeOrConfig1 = null;
        this.annotationTypeOrConfig2 = null;
        this.annotationTypeOrConfig3 = null;
        
        this.annotationTypeOrConfig2 = annotationTypeOrConfig2;
    }


    public void setStartdrawing(AnnotationJSONFormat annotationTypeOrConfig3) {
        this.annotationTypeOrConfig = null;
        this.annotationTypeOrConfig1 = null;
        this.annotationTypeOrConfig2 = null;
        this.annotationTypeOrConfig3 = null;
        
        this.annotationTypeOrConfig3 = annotationTypeOrConfig3;
    }

    private Boolean stringify;
    private Boolean includeTheme;

    public void setTojson(Boolean stringify, Boolean includeTheme) {
        this.stringify = stringify;
        this.includeTheme = includeTheme;
    }

    private Boolean asXmlNode;
    private Boolean includeTheme1;

    public void setToxml(Boolean asXmlNode, Boolean includeTheme1) {
        this.asXmlNode = asXmlNode;
        this.includeTheme = null;
        this.includeTheme1 = null;
        
        this.includeTheme1 = includeTheme1;
    }

    private String type3;
    private Boolean useCapture2;

    public void setUnlisten(String type3, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
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

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
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

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
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

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
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

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSannotationTypeOrConfig());
        js.append(generateJSannotationTypeOrConfig1());
        js.append(generateJSenabled());
        js.append(generateJSconfig());
        js.append(generateJSconfig1());
        js.append(generateJSindex());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
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
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}