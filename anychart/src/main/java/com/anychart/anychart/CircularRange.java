package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class CircularRange extends JsObject {

    
    private Double index;

    public void setAxisindex(Double index) {
        this.index = index;
    }

    private Double cornersRounding;
    private String cornersRounding1;

    public void setCornersrounding(Double cornersRounding) {
        this.cornersRounding = null;
        this.cornersRounding1 = null;
        
        this.cornersRounding = cornersRounding;
    }


    public void setCornersrounding(String cornersRounding1) {
        this.cornersRounding = null;
        this.cornersRounding1 = null;
        
        this.cornersRounding1 = cornersRounding1;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Double endSize;
    private String endSize1;

    public void setEndsize(Double endSize) {
        this.endSize = null;
        this.endSize1 = null;
        
        this.endSize = endSize;
    }


    public void setEndsize(String endSize1) {
        this.endSize = null;
        this.endSize1 = null;
        
        this.endSize1 = endSize1;
    }

    private Fill fill;

    public void setFill(Fill fill) {
        this.fill = fill;
    }

    private Double from;

    public void setFrom(Double from) {
        this.from = from;
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

    private GaugeSidePosition position;
    private String position1;

    public void setPosition(GaugeSidePosition position) {
        this.position = null;
        this.position1 = null;
        
        this.position = position;
    }


    public void setPosition(String position1) {
        this.position = null;
        this.position1 = null;
        
        this.position1 = position1;
    }

    private PaperSize paperSizeOrOptions;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        this.paperSizeOrOptions = paperSizeOrOptions;
        this.landscape = landscape;
    }

    private Double radius;
    private String radius1;

    public void setRadius(Double radius) {
        this.radius = null;
        this.radius1 = null;
        
        this.radius = radius;
    }


    public void setRadius(String radius1) {
        this.radius = null;
        this.radius1 = null;
        
        this.radius1 = radius1;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private Double startSize;
    private String startSize1;

    public void setStartsize(Double startSize) {
        this.startSize = null;
        this.startSize1 = null;
        
        this.startSize = startSize;
    }


    public void setStartsize(String startSize1) {
        this.startSize = null;
        this.startSize1 = null;
        
        this.startSize1 = startSize1;
    }

    private Double to;

    public void setTo(Double to) {
        this.to = to;
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

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
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
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSposition());
        js.append(generateJSposition1());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJSradius());
        js.append(generateJSradius1());
        js.append(generateJStype2());
        js.append(generateJSstartSize());
        js.append(generateJSstartSize1());
        js.append(generateJSto());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}