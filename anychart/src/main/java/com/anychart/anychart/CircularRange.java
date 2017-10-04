package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class CircularRange extends VisualBase {

    private String jsBase;

    public CircularRange() {

    }

    protected CircularRange(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double index;

    public void setAxisindex(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".axisIndex(%f);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".axisIndex(%f);", index));
                js.setLength(0);
            }
        }
    }

    private Double cornersRounding;
    private String cornersRounding1;

    public void setCornersrounding(Double cornersRounding) {
        if (jsBase == null) {
            this.cornersRounding = null;
            this.cornersRounding1 = null;
            
            this.cornersRounding = cornersRounding;
        } else {
            this.cornersRounding = cornersRounding;

            js.append(String.format(Locale.US, jsBase + ".cornersRounding(%f);", cornersRounding));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cornersRounding(%f);", cornersRounding));
                js.setLength(0);
            }
        }
    }


    public void setCornersrounding(String cornersRounding1) {
        if (jsBase == null) {
            this.cornersRounding = null;
            this.cornersRounding1 = null;
            
            this.cornersRounding1 = cornersRounding1;
        } else {
            this.cornersRounding1 = cornersRounding1;

            js.append(String.format(Locale.US, jsBase + ".cornersRounding(%s);", cornersRounding1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".cornersRounding(%s);", cornersRounding1));
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

    private Double endSize;
    private String endSize1;

    public void setEndsize(Double endSize) {
        if (jsBase == null) {
            this.endSize = null;
            this.endSize1 = null;
            
            this.endSize = endSize;
        } else {
            this.endSize = endSize;

            js.append(String.format(Locale.US, jsBase + ".endSize(%f);", endSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".endSize(%f);", endSize));
                js.setLength(0);
            }
        }
    }


    public void setEndsize(String endSize1) {
        if (jsBase == null) {
            this.endSize = null;
            this.endSize1 = null;
            
            this.endSize1 = endSize1;
        } else {
            this.endSize1 = endSize1;

            js.append(String.format(Locale.US, jsBase + ".endSize(%s);", endSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".endSize(%s);", endSize1));
                js.setLength(0);
            }
        }
    }

    private Fill fill;

    public void setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;

            js.append(String.format(Locale.US, jsBase + ".fill(%s);", (fill != null) ? fill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", (fill != null) ? fill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double from;

    public void setFrom(Double from) {
        if (jsBase == null) {
            this.from = from;
        } else {
            this.from = from;

            js.append(String.format(Locale.US, jsBase + ".from(%f);", from));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".from(%f);", from));
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

    private GaugeSidePosition position;
    private String position1;

    public void setPosition(GaugeSidePosition position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;

            js.append(String.format(Locale.US, jsBase + ".position(%s);", (position != null) ? position.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", (position != null) ? position.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;

            js.append(String.format(Locale.US, jsBase + ".position(%s);", position1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".position(%s);", position1));
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

    private Double radius;
    private String radius1;

    public void setRadius(Double radius) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius = radius;
        } else {
            this.radius = radius;

            js.append(String.format(Locale.US, jsBase + ".radius(%f);", radius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".radius(%f);", radius));
                js.setLength(0);
            }
        }
    }


    public void setRadius(String radius1) {
        if (jsBase == null) {
            this.radius = null;
            this.radius1 = null;
            
            this.radius1 = radius1;
        } else {
            this.radius1 = radius1;

            js.append(String.format(Locale.US, jsBase + ".radius(%s);", radius1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".radius(%s);", radius1));
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

    private Double startSize;
    private String startSize1;

    public void setStartsize(Double startSize) {
        if (jsBase == null) {
            this.startSize = null;
            this.startSize1 = null;
            
            this.startSize = startSize;
        } else {
            this.startSize = startSize;

            js.append(String.format(Locale.US, jsBase + ".startSize(%f);", startSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startSize(%f);", startSize));
                js.setLength(0);
            }
        }
    }


    public void setStartsize(String startSize1) {
        if (jsBase == null) {
            this.startSize = null;
            this.startSize1 = null;
            
            this.startSize1 = startSize1;
        } else {
            this.startSize1 = startSize1;

            js.append(String.format(Locale.US, jsBase + ".startSize(%s);", startSize1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startSize(%s);", startSize1));
                js.setLength(0);
            }
        }
    }

    private Double to;

    public void setTo(Double to) {
        if (jsBase == null) {
            this.to = to;
        } else {
            this.to = to;

            js.append(String.format(Locale.US, jsBase + ".to(%f);", to));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".to(%f);", to));
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

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJScornersRounding() {
        if (cornersRounding != null) {
            return String.format(Locale.US, "cornersRounding: %f,", cornersRounding);
        }
        return "";
    }

    private String generateJScornersRounding1() {
        if (cornersRounding1 != null) {
            return String.format(Locale.US, "cornersRounding: %s,", cornersRounding1);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSendSize() {
        if (endSize != null) {
            return String.format(Locale.US, "endSize: %f,", endSize);
        }
        return "";
    }

    private String generateJSendSize1() {
        if (endSize1 != null) {
            return String.format(Locale.US, "endSize: %s,", endSize1);
        }
        return "";
    }

    private String generateJSfill() {
        if (fill != null) {
            return String.format(Locale.US, "fill: %s,", (fill != null) ? fill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfrom() {
        if (from != null) {
            return String.format(Locale.US, "from: %f,", from);
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

    private String generateJSposition() {
        if (position != null) {
            return String.format(Locale.US, "position: %s,", (position != null) ? position.generateJs() : "null");
        }
        return "";
    }

    private String generateJSposition1() {
        if (position1 != null) {
            return String.format(Locale.US, "position: %s,", position1);
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

    private String generateJSradius() {
        if (radius != null) {
            return String.format(Locale.US, "radius: %f,", radius);
        }
        return "";
    }

    private String generateJSradius1() {
        if (radius1 != null) {
            return String.format(Locale.US, "radius: %s,", radius1);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSstartSize() {
        if (startSize != null) {
            return String.format(Locale.US, "startSize: %f,", startSize);
        }
        return "";
    }

    private String generateJSstartSize1() {
        if (startSize1 != null) {
            return String.format(Locale.US, "startSize: %s,", startSize1);
        }
        return "";
    }

    private String generateJSto() {
        if (to != null) {
            return String.format(Locale.US, "to: %f,", to);
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
            js.append(generateJSindex());
            js.append(generateJScornersRounding());
            js.append(generateJScornersRounding1());
            js.append(generateJSenabled());
            js.append(generateJSendSize());
            js.append(generateJSendSize1());
            js.append(generateJSfill());
            js.append(generateJSfrom());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSposition());
            js.append(generateJSposition1());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJSradius());
            js.append(generateJSradius1());
            js.append(generateJStype2());
            js.append(generateJSstartSize());
            js.append(generateJSstartSize1());
            js.append(generateJSto());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey());
            js.append(generateJSzIndex());
            js.append("}");
        }

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}