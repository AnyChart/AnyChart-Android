package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class StandalonesAxesRadar extends JsObject {

    private String jsBase;

    public StandalonesAxesRadar() {

    }

    protected StandalonesAxesRadar(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Layer getcontainer;

    public Layer getContainer() {
        if (getcontainer == null)
            getcontainer = new Layer(jsBase + ".container()");

        return getcontainer;
    }

    private Layer container;
    private Stage container1;
    private String container2;
    private Element container3;

    public void setContainer(Layer container) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container = container;
        } else {
            this.container = container;

            js.append(String.format(Locale.US, jsBase + ".container(%s);", (container != null) ? container.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", (container != null) ? container.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setContainer(Stage container1) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container1 = container1;
        } else {
            this.container1 = container1;

            js.append(String.format(Locale.US, jsBase + ".container(%s);", (container1 != null) ? container1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", (container1 != null) ? container1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setContainer(String container2) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container2 = container2;
        } else {
            this.container2 = container2;

            js.append(String.format(Locale.US, jsBase + ".container(%s);", container2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", container2));
                js.setLength(0);
            }
        }
    }


    public void setContainer(Element container3) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            this.container2 = null;
            this.container3 = null;
            
            this.container3 = container3;
        } else {
            this.container3 = container3;

            js.append(String.format(Locale.US, jsBase + ".container(%s);", (container3 != null) ? container3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".container(%s);", (container3 != null) ? container3.generateJs() : "null"));
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

    private UiLabelsFactory getlabels;

    public UiLabelsFactory getLabels() {
        if (getlabels == null)
            getlabels = new UiLabelsFactory(jsBase + ".labels()");

        return getlabels;
    }

    private String labels;
    private Boolean labels1;

    public void setLabels(String labels) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels = labels;
        } else {
            this.labels = labels;

            js.append(String.format(Locale.US, jsBase + ".labels(%s);", labels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%s);", labels));
                js.setLength(0);
            }
        }
    }


    public void setLabels(Boolean labels1) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels1 = labels1;
        } else {
            this.labels1 = labels1;

            js.append(String.format(Locale.US, jsBase + ".labels(%b);", labels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%b);", labels1));
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

    private AnychartMathRect getparentBounds;

    public AnychartMathRect getParentbounds() {
        if (getparentBounds == null)
            getparentBounds = new AnychartMathRect(jsBase + ".parentBounds()");

        return getparentBounds;
    }

    private AnychartMathRect parentBounds;
    private String parentBounds1;

    public void setParentbounds(AnychartMathRect parentBounds) {
        if (jsBase == null) {
            this.parentBounds = null;
            this.parentBounds1 = null;
            
            this.parentBounds = parentBounds;
        } else {
            this.parentBounds = parentBounds;

            js.append(String.format(Locale.US, jsBase + ".parentBounds(%s);", (parentBounds != null) ? parentBounds.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parentBounds(%s);", (parentBounds != null) ? parentBounds.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setParentbounds(String parentBounds1) {
        if (jsBase == null) {
            this.parentBounds = null;
            this.parentBounds1 = null;
            
            this.parentBounds1 = parentBounds1;
        } else {
            this.parentBounds1 = parentBounds1;

            js.append(String.format(Locale.US, jsBase + ".parentBounds(%s);", parentBounds1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parentBounds(%s);", parentBounds1));
                js.setLength(0);
            }
        }
    }

    private Double left;
    private Double top;
    private Double width;
    private Double height;

    public void setParentbounds(Double left, Double top, Double width, Double height) {
        if (jsBase == null) {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
        } else {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".parentBounds(%f, %f, %f, %f);", left, top, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".parentBounds(%f, %f, %f, %f);", left, top, width, height));
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

    private ScalesBase getscale;

    public ScalesBase getScale() {
        if (getscale == null)
            getscale = new ScalesBase(jsBase + ".scale()");

        return getscale;
    }

    private ScalesBase scale;

    public void setScale(ScalesBase scale) {
        if (jsBase == null) {
            this.scale = scale;
        } else {
            this.scale = scale;

            js.append(String.format(Locale.US, jsBase + ".scale(%s);", (scale != null) ? scale.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".scale(%s);", (scale != null) ? scale.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String startAngle;
    private Double startAngle1;

    public void setStartangle(String startAngle) {
        if (jsBase == null) {
            this.startAngle = null;
            this.startAngle1 = null;
            
            this.startAngle = startAngle;
        } else {
            this.startAngle = startAngle;

            js.append(String.format(Locale.US, jsBase + ".startAngle(%s);", startAngle));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startAngle(%s);", startAngle));
                js.setLength(0);
            }
        }
    }


    public void setStartangle(Double startAngle1) {
        if (jsBase == null) {
            this.startAngle = null;
            this.startAngle1 = null;
            
            this.startAngle1 = startAngle1;
        } else {
            this.startAngle1 = startAngle1;

            js.append(String.format(Locale.US, jsBase + ".startAngle(%f);", startAngle1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startAngle(%f);", startAngle1));
                js.setLength(0);
            }
        }
    }

    private Stroke stroke;
    private ColoredFill stroke1;
    private String stroke2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setStroke(Stroke stroke, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (stroke != null) ? stroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (stroke != null) ? stroke.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(ColoredFill stroke1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (stroke1 != null) ? stroke1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (stroke1 != null) ? stroke1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(String stroke2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
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

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", stroke2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", stroke2, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private RadialTicks getticks;

    public RadialTicks getTicks() {
        if (getticks == null)
            getticks = new RadialTicks(jsBase + ".ticks()");

        return getticks;
    }

    private String ticks;
    private Boolean ticks1;

    public void setTicks(String ticks) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks = ticks;
        } else {
            this.ticks = ticks;

            js.append(String.format(Locale.US, jsBase + ".ticks(%s);", ticks));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ticks(%s);", ticks));
                js.setLength(0);
            }
        }
    }


    public void setTicks(Boolean ticks1) {
        if (jsBase == null) {
            this.ticks = null;
            this.ticks1 = null;
            
            this.ticks1 = ticks1;
        } else {
            this.ticks1 = ticks1;

            js.append(String.format(Locale.US, jsBase + ".ticks(%b);", ticks1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".ticks(%b);", ticks1));
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

    private String generateJSgetcontainer() {
        if (getcontainer != null) {
            return getcontainer.generateJs();
        }
        return "";
    }

    private String generateJSgetlabels() {
        if (getlabels != null) {
            return getlabels.generateJs();
        }
        return "";
    }

    private String generateJSgetparentBounds() {
        if (getparentBounds != null) {
            return getparentBounds.generateJs();
        }
        return "";
    }

    private String generateJSgetscale() {
        if (getscale != null) {
            return getscale.generateJs();
        }
        return "";
    }

    private String generateJSgetticks() {
        if (getticks != null) {
            return getticks.generateJs();
        }
        return "";
    }

    private String generateJScontainer() {
        if (container != null) {
            return String.format(Locale.US, "container: %s,", (container != null) ? container.generateJs() : "null");
        }
        return "";
    }

    private String generateJScontainer1() {
        if (container1 != null) {
            return String.format(Locale.US, "container: %s,", (container1 != null) ? container1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScontainer2() {
        if (container2 != null) {
            return String.format(Locale.US, "container: %s,", container2);
        }
        return "";
    }

    private String generateJScontainer3() {
        if (container3 != null) {
            return String.format(Locale.US, "container: %s,", (container3 != null) ? container3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSlabels() {
        if (labels != null) {
            return String.format(Locale.US, "labels: %s,", labels);
        }
        return "";
    }

    private String generateJSlabels1() {
        if (labels1 != null) {
            return String.format(Locale.US, "labels: %b,", labels1);
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

    private String generateJSparentBounds() {
        if (parentBounds != null) {
            return String.format(Locale.US, "parentBounds: %s,", (parentBounds != null) ? parentBounds.generateJs() : "null");
        }
        return "";
    }

    private String generateJSparentBounds1() {
        if (parentBounds1 != null) {
            return String.format(Locale.US, "parentBounds: %s,", parentBounds1);
        }
        return "";
    }

    private String generateJSleft() {
        if (left != null) {
            return String.format(Locale.US, "left: %f,", left);
        }
        return "";
    }

    private String generateJStop() {
        if (top != null) {
            return String.format(Locale.US, "top: %f,", top);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
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

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSscale() {
        if (scale != null) {
            return String.format(Locale.US, "scale: %s,", (scale != null) ? scale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstartAngle() {
        if (startAngle != null) {
            return String.format(Locale.US, "startAngle: %s,", startAngle);
        }
        return "";
    }

    private String generateJSstartAngle1() {
        if (startAngle1 != null) {
            return String.format(Locale.US, "startAngle: %f,", startAngle1);
        }
        return "";
    }

    private String generateJSstroke() {
        if (stroke != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke != null) ? stroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke1() {
        if (stroke1 != null) {
            return String.format(Locale.US, "stroke: %s,", (stroke1 != null) ? stroke1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSstroke2() {
        if (stroke2 != null) {
            return String.format(Locale.US, "stroke: %s,", stroke2);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJSticks() {
        if (ticks != null) {
            return String.format(Locale.US, "ticks: %s,", ticks);
        }
        return "";
    }

    private String generateJSticks1() {
        if (ticks1 != null) {
            return String.format(Locale.US, "ticks: %b,", ticks1);
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
            js.append(generateJScontainer());
            js.append(generateJScontainer1());
            js.append(generateJScontainer2());
            js.append(generateJScontainer3());
            js.append(generateJSenabled());
            js.append(generateJSlabels());
            js.append(generateJSlabels1());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSparentBounds());
            js.append(generateJSparentBounds1());
            js.append(generateJSleft());
            js.append(generateJStop());
            js.append(generateJSwidth());
            js.append(generateJSheight());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSscale());
            js.append(generateJSstartAngle());
            js.append(generateJSstartAngle1());
            js.append(generateJSstroke());
            js.append(generateJSstroke1());
            js.append(generateJSstroke2());
            js.append(generateJSthickness());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJSticks());
            js.append(generateJSticks1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetcontainer());
            js.append(generateJSgetlabels());
            js.append(generateJSgetparentBounds());
            js.append(generateJSgetscale());
            js.append(generateJSgetticks());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}