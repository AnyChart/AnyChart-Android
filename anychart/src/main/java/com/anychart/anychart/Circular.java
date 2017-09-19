package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Circular extends JsObject {

    
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

    private Boolean drawFirstLabel;

    public void setDrawfirstlabel(Boolean drawFirstLabel) {
        this.drawFirstLabel = drawFirstLabel;
    }

    private Boolean drawLastLabel;

    public void setDrawlastlabel(Boolean drawLastLabel) {
        this.drawLastLabel = drawLastLabel;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Fill fill;
    private String fill1;

    public void setFill(Fill fill) {
        this.fill = null;
        this.fill1 = null;
        
        this.fill = fill;
    }


    public void setFill(String fill1) {
        this.fill = null;
        this.fill1 = null;
        
        this.fill1 = fill1;
    }

    private String color;
    private Double opacity;

    public void setFill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private Double opacity1;

    public void setFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys = keys;
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys = keys;
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys1 = keys1;
        this.mode = null;
        this.mode1 = null;
        
        this.mode = mode;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }


    public void setFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        this.keys = null;
        this.keys1 = null;
        
        this.keys1 = keys1;
        this.mode = null;
        this.mode1 = null;
        
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity = null;
        this.opacity1 = null;
        
        this.opacity1 = opacity1;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode2;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode2, Double opacity2, Double fx, Double fy) {
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
        
        this.mode2 = mode2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
    }


    public void setFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode2, Double opacity2, Double fx, Double fy) {
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
        
        this.mode2 = mode2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
    }

    private Fill imageSettings;
    private Boolean labels;

    public void setLabels(Boolean labels) {
        this.labels = labels;
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

    private Boolean minorLabels;

    public void setMinorlabels(Boolean minorLabels) {
        this.minorLabels = minorLabels;
    }

    private Boolean minorTicks;

    public void setMinorticks(Boolean minorTicks) {
        this.minorTicks = minorTicks;
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private Boolean overlapMode2;

    public void setOverlapmode(LabelsOverlapMode overlapMode) {
        this.overlapMode = null;
        this.overlapMode1 = null;
        this.overlapMode2 = null;
        
        this.overlapMode = overlapMode;
    }


    public void setOverlapmode(String overlapMode1) {
        this.overlapMode = null;
        this.overlapMode1 = null;
        this.overlapMode2 = null;
        
        this.overlapMode1 = overlapMode1;
    }


    public void setOverlapmode(Boolean overlapMode2) {
        this.overlapMode = null;
        this.overlapMode1 = null;
        this.overlapMode2 = null;
        
        this.overlapMode2 = overlapMode2;
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

    private GaugeScaleTypes scale;
    private ScalesLinear scale1;
    private Logarithmic scale2;
    private String scale3;

    public void setScale(GaugeScaleTypes scale) {
        this.scale = null;
        this.scale1 = null;
        this.scale2 = null;
        this.scale3 = null;
        
        this.scale = scale;
    }


    public void setScale(ScalesLinear scale1) {
        this.scale = null;
        this.scale1 = null;
        this.scale2 = null;
        this.scale3 = null;
        
        this.scale1 = scale1;
    }


    public void setScale(Logarithmic scale2) {
        this.scale = null;
        this.scale1 = null;
        this.scale2 = null;
        this.scale3 = null;
        
        this.scale2 = scale2;
    }


    public void setScale(String scale3) {
        this.scale = null;
        this.scale1 = null;
        this.scale2 = null;
        this.scale3 = null;
        
        this.scale3 = scale3;
    }

    private String startAngle;
    private Double startAngle1;

    public void setStartangle(String startAngle) {
        this.startAngle = null;
        this.startAngle1 = null;
        
        this.startAngle = startAngle;
    }


    public void setStartangle(Double startAngle1) {
        this.startAngle = null;
        this.startAngle1 = null;
        
        this.startAngle1 = startAngle1;
    }

    private String sweepAngle;
    private Double sweepAngle1;

    public void setSweepangle(String sweepAngle) {
        this.sweepAngle = null;
        this.sweepAngle1 = null;
        
        this.sweepAngle = sweepAngle;
    }


    public void setSweepangle(Double sweepAngle1) {
        this.sweepAngle = null;
        this.sweepAngle1 = null;
        
        this.sweepAngle1 = sweepAngle1;
    }

    private Boolean ticks;

    public void setTicks(Boolean ticks) {
        this.ticks = ticks;
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

    private Double width;
    private String width1;

    public void setWidth(Double width) {
        this.width = null;
        this.width1 = null;
        
        this.width = width;
    }


    public void setWidth(String width1) {
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
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

    private String generateJSdrawFirstLabel() {
        if (drawFirstLabel != null) {
            return String.format(Locale.US, "drawFirstLabel: %b,", drawFirstLabel);
        }
        return "";
    }

    private String generateJSdrawLastLabel() {
        if (drawLastLabel != null) {
            return String.format(Locale.US, "drawLastLabel: %b,", drawLastLabel);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSfill() {
        if (fill != null) {
            return String.format(Locale.US, "fill: %s,", (fill != null) ? fill.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfill1() {
        if (fill1 != null) {
            return String.format(Locale.US, "fill: %s,", fill1);
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
        }
        return "";
    }

    private String generateJSkeys() {
        if (keys != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys));
        }
        return "";
    }

    private String generateJSkeys1() {
        if (keys1 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys1));
        }
        return "";
    }

    private String generateJSangle() {
        if (angle != null) {
            return String.format(Locale.US, "angle: %f,", angle);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %b,", mode);
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", (mode1 != null) ? mode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity1() {
        if (opacity1 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity1);
        }
        return "";
    }

    private String generateJSkeys2() {
        if (keys2 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys2));
        }
        return "";
    }

    private String generateJSkeys3() {
        if (keys3 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys3));
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSmode2() {
        if (mode2 != null) {
            return String.format(Locale.US, "mode: %s,", (mode2 != null) ? mode2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity2() {
        if (opacity2 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity2);
        }
        return "";
    }

    private String generateJSfx() {
        if (fx != null) {
            return String.format(Locale.US, "fx: %f,", fx);
        }
        return "";
    }

    private String generateJSfy() {
        if (fy != null) {
            return String.format(Locale.US, "fy: %f,", fy);
        }
        return "";
    }

    private String generateJSimageSettings() {
        if (imageSettings != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings != null) ? imageSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlabels() {
        if (labels != null) {
            return String.format(Locale.US, "labels: %b,", labels);
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

    private String generateJSminorLabels() {
        if (minorLabels != null) {
            return String.format(Locale.US, "minorLabels: %b,", minorLabels);
        }
        return "";
    }

    private String generateJSminorTicks() {
        if (minorTicks != null) {
            return String.format(Locale.US, "minorTicks: %b,", minorTicks);
        }
        return "";
    }

    private String generateJSoverlapMode() {
        if (overlapMode != null) {
            return String.format(Locale.US, "overlapMode: %s,", (overlapMode != null) ? overlapMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSoverlapMode1() {
        if (overlapMode1 != null) {
            return String.format(Locale.US, "overlapMode: %s,", overlapMode1);
        }
        return "";
    }

    private String generateJSoverlapMode2() {
        if (overlapMode2 != null) {
            return String.format(Locale.US, "overlapMode: %b,", overlapMode2);
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

    private String generateJSscale() {
        if (scale != null) {
            return String.format(Locale.US, "scale: %s,", (scale != null) ? scale.generateJs() : "null");
        }
        return "";
    }

    private String generateJSscale1() {
        if (scale1 != null) {
            return String.format(Locale.US, "scale: %s,", (scale1 != null) ? scale1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSscale2() {
        if (scale2 != null) {
            return String.format(Locale.US, "scale: %s,", (scale2 != null) ? scale2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSscale3() {
        if (scale3 != null) {
            return String.format(Locale.US, "scale: %s,", scale3);
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

    private String generateJSsweepAngle() {
        if (sweepAngle != null) {
            return String.format(Locale.US, "sweepAngle: %s,", sweepAngle);
        }
        return "";
    }

    private String generateJSsweepAngle1() {
        if (sweepAngle1 != null) {
            return String.format(Locale.US, "sweepAngle: %f,", sweepAngle1);
        }
        return "";
    }

    private String generateJSticks() {
        if (ticks != null) {
            return String.format(Locale.US, "ticks: %b,", ticks);
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

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %s,", width1);
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
        js.append(generateJScornersRounding());
        js.append(generateJScornersRounding1());
        js.append(generateJSdrawFirstLabel());
        js.append(generateJSdrawLastLabel());
        js.append(generateJSenabled());
        js.append(generateJSfill());
        js.append(generateJSfill1());
        js.append(generateJScolor());
        js.append(generateJSopacity());
        js.append(generateJSkeys());
        js.append(generateJSkeys1());
        js.append(generateJSangle());
        js.append(generateJSmode());
        js.append(generateJSmode1());
        js.append(generateJSopacity1());
        js.append(generateJSkeys2());
        js.append(generateJSkeys3());
        js.append(generateJScx());
        js.append(generateJScy());
        js.append(generateJSmode2());
        js.append(generateJSopacity2());
        js.append(generateJSfx());
        js.append(generateJSfy());
        js.append(generateJSimageSettings());
        js.append(generateJSlabels());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSminorLabels());
        js.append(generateJSminorTicks());
        js.append(generateJSoverlapMode());
        js.append(generateJSoverlapMode1());
        js.append(generateJSoverlapMode2());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJSradius());
        js.append(generateJSradius1());
        js.append(generateJStype2());
        js.append(generateJSscale());
        js.append(generateJSscale1());
        js.append(generateJSscale2());
        js.append(generateJSscale3());
        js.append(generateJSstartAngle());
        js.append(generateJSstartAngle1());
        js.append(generateJSsweepAngle());
        js.append(generateJSsweepAngle1());
        js.append(generateJSticks());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSwidth());
        js.append(generateJSwidth1());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}