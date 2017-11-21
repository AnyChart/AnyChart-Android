package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Marker of the markers factory. Use data to set settings for the custom marker.
 */
public class UiMarkersfactoryMarker extends VisualBase {

    public UiMarkersfactoryMarker() {
        js.setLength(0);
        js.append("var uiMarkersfactoryMarker").append(++variableIndex).append(" = anychart.core.ui.MarkersFactory.marker();");
        jsBase = "uiMarkersfactoryMarker" + variableIndex;
    }

    protected UiMarkersfactoryMarker(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected UiMarkersfactoryMarker(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private EnumsAnchor anchor;
    private String anchor1;
    private List<UiMarkersfactoryMarker> setAnchor = new ArrayList<>();

    /**
     * Setter for the anchor of custom marker.
     */
    public UiMarkersfactoryMarker setAnchor(EnumsAnchor anchor) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor = anchor;
        } else {
            this.anchor = anchor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".anchor(%s)", ((anchor != null) ? anchor.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".anchor(%s)", ((anchor != null) ? anchor.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAnchor() {
        if (!setAnchor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setAnchor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setAnchor1 = new ArrayList<>();

    /**
     * Setter for the anchor of custom marker.
     */
    public UiMarkersfactoryMarker setAnchor(String anchor1) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor1 = anchor1;
        } else {
            this.anchor1 = anchor1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".anchor(%s)", wrapQuotes(anchor1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".anchor(%s)", wrapQuotes(anchor1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAnchor1() {
        if (!setAnchor1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setAnchor1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill fill;
    private String fill1;
    private List<UiMarkersfactoryMarker> setFill = new ArrayList<>();

    /**
     * Setter for fill settings of custom marker.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiMarkersfactoryMarker setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = null;
            this.fill1 = null;
            
            this.fill = fill;
        } else {
            this.fill = fill;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", ((fill != null) ? fill.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill() {
        if (!setFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setFill1 = new ArrayList<>();

    /**
     * Setter for fill settings of custom marker.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiMarkersfactoryMarker setFill(String fill1) {
        if (jsBase == null) {
            this.fill = null;
            this.fill1 = null;
            
            this.fill1 = fill1;
        } else {
            this.fill1 = fill1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s)", wrapQuotes(fill1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s)", wrapQuotes(fill1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill1() {
        if (!setFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<UiMarkersfactoryMarker> setFill2 = new ArrayList<>();

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public UiMarkersfactoryMarker fill(String color, Double opacity) {
        if (jsBase == null) {
            this.color = color;
            this.opacity = opacity;
        } else {
            this.color = color;
            this.opacity = opacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color), opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f)", wrapQuotes(color), opacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill2() {
        if (!setFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;
    private List<UiMarkersfactoryMarker> setFill3 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiMarkersfactoryMarker fill(GradientKey[] keys, Double angle, Double opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToString(keys), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill3() {
        if (!setFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setFill4 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiMarkersfactoryMarker fill(GradientKey[] keys, Double angle, Double opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill4() {
        if (!setFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setFill5 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiMarkersfactoryMarker fill(GradientKey[] keys, Double angle, Double opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys = keys;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToString(keys), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill5() {
        if (!setFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setFill6 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiMarkersfactoryMarker fill(String[] keys1, Double angle, Double opacity1, Boolean mode) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode = mode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %b)", arrayToStringWrapQuotes(keys1), angle, opacity1, mode));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill6() {
        if (!setFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setFill7 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiMarkersfactoryMarker fill(String[] keys1, Double angle, Double opacity1, VectorRect mode1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode1 = mode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode1.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, ((mode1 != null) ? mode1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill7() {
        if (!setFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setFill8 = new ArrayList<>();

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiMarkersfactoryMarker fill(String[] keys1, Double angle, Double opacity1, String mode2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
        } else {
            this.keys1 = keys1;
            this.angle = angle;
            this.opacity1 = opacity1;
            this.mode2 = mode2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s)", arrayToStringWrapQuotes(keys1), angle, opacity1, wrapQuotes(mode2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill8() {
        if (!setFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;
    private List<UiMarkersfactoryMarker> setFill9 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiMarkersfactoryMarker fill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
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
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill9() {
        if (!setFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setFill10 = new ArrayList<>();

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public UiMarkersfactoryMarker fill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
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
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(mode3.generateJs());
            js.append(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.getJsBase() : "null"), opacity2, fx, fy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFill10() {
        if (!setFill10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setFill10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private Double offsetX;
    private String offsetX1;
    private List<UiMarkersfactoryMarker> setOffsetX = new ArrayList<>();

    /**
     * Setter for the offset by X of custom marker.
     */
    public UiMarkersfactoryMarker setOffsetX(Double offsetX) {
        if (jsBase == null) {
            this.offsetX = null;
            this.offsetX1 = null;
            
            this.offsetX = offsetX;
        } else {
            this.offsetX = offsetX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".offsetX(%f)", offsetX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offsetX(%f)", offsetX));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOffsetX() {
        if (!setOffsetX.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setOffsetX) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setOffsetX1 = new ArrayList<>();

    /**
     * Setter for the offset by X of custom marker.
     */
    public UiMarkersfactoryMarker setOffsetX(String offsetX1) {
        if (jsBase == null) {
            this.offsetX = null;
            this.offsetX1 = null;
            
            this.offsetX1 = offsetX1;
        } else {
            this.offsetX1 = offsetX1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".offsetX(%s)", wrapQuotes(offsetX1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offsetX(%s)", wrapQuotes(offsetX1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOffsetX1() {
        if (!setOffsetX1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setOffsetX1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double offsetY;
    private String offsetY1;
    private List<UiMarkersfactoryMarker> setOffsetY = new ArrayList<>();

    /**
     * Setter for the offset by Y of custom marker.
     */
    public UiMarkersfactoryMarker setOffsetY(Double offsetY) {
        if (jsBase == null) {
            this.offsetY = null;
            this.offsetY1 = null;
            
            this.offsetY = offsetY;
        } else {
            this.offsetY = offsetY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".offsetY(%f)", offsetY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offsetY(%f)", offsetY));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOffsetY() {
        if (!setOffsetY.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setOffsetY) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setOffsetY1 = new ArrayList<>();

    /**
     * Setter for the offset by Y of custom marker.
     */
    public UiMarkersfactoryMarker setOffsetY(String offsetY1) {
        if (jsBase == null) {
            this.offsetY = null;
            this.offsetY1 = null;
            
            this.offsetY1 = offsetY1;
        } else {
            this.offsetY1 = offsetY1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".offsetY(%s)", wrapQuotes(offsetY1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offsetY(%s)", wrapQuotes(offsetY1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOffsetY1() {
        if (!setOffsetY1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setOffsetY1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Position position;
    private String position1;
    private List<UiMarkersfactoryMarker> setPosition = new ArrayList<>();

    /**
     * Setter for the position of custom marker.
     */
    public UiMarkersfactoryMarker setPosition(Position position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition() {
        if (!setPosition.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setPosition) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setPosition1 = new ArrayList<>();

    /**
     * Setter for the position of custom marker.
     */
    public UiMarkersfactoryMarker setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition1() {
        if (!setPosition1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setPosition1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double rotation;
    private List<UiMarkersfactoryMarker> setRotation = new ArrayList<>();

    /**
     * Setter for the rotate a marker around an anchor.
     */
    public UiMarkersfactoryMarker setRotation(Double rotation) {
        if (jsBase == null) {
            this.rotation = rotation;
        } else {
            this.rotation = rotation;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".rotation(%f)", rotation));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".rotation(%f)", rotation));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRotation() {
        if (!setRotation.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setRotation) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double size;
    private List<UiMarkersfactoryMarker> setSize = new ArrayList<>();

    /**
     * Setter for the size of custom marker.
     */
    public UiMarkersfactoryMarker setSize(Double size) {
        if (jsBase == null) {
            this.size = size;
        } else {
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".size(%f)", size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%f)", size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSize() {
        if (!setSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke stroke;
    private String stroke1;
    private List<UiMarkersfactoryMarker> setStroke = new ArrayList<>();

    /**
     * Setter for the stroke settings of custom marker using a string.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiMarkersfactoryMarker setStroke(Stroke stroke) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            
            this.stroke = stroke;
        } else {
            this.stroke = stroke;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s)", ((stroke != null) ? stroke.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s)", ((stroke != null) ? stroke.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke() {
        if (!setStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setStroke1 = new ArrayList<>();

    /**
     * Setter for the stroke settings of custom marker using a string.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiMarkersfactoryMarker setStroke(String stroke1) {
        if (jsBase == null) {
            this.stroke = null;
            this.stroke1 = null;
            
            this.stroke1 = stroke1;
        } else {
            this.stroke1 = stroke1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s)", wrapQuotes(stroke1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s)", wrapQuotes(stroke1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke1() {
        if (!setStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<UiMarkersfactoryMarker> setStroke2 = new ArrayList<>();

    /**
     * Setter for the stroke settings of custom marker.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiMarkersfactoryMarker setStroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke2() {
        if (!setStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setStroke3 = new ArrayList<>();

    /**
     * Setter for the stroke settings of custom marker.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiMarkersfactoryMarker setStroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke3() {
        if (!setStroke3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setStroke3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setStroke4 = new ArrayList<>();

    /**
     * Setter for the stroke settings of custom marker.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public UiMarkersfactoryMarker setStroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color3 = color3;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".stroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetStroke4() {
        if (!setStroke4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setStroke4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private MarkerType type;
    private String type1;
    private List<UiMarkersfactoryMarker> setType = new ArrayList<>();

    /**
     * Setter for the type of custom marker.
     */
    public UiMarkersfactoryMarker setType(MarkerType type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".type(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetType() {
        if (!setType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<UiMarkersfactoryMarker> setType1 = new ArrayList<>();

    /**
     * Setter for the type of custom marker.
     */
    public UiMarkersfactoryMarker setType(String type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".type(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".type(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetType1() {
        if (!setType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (UiMarkersfactoryMarker item : setType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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

        js.append(generateJsGetters());

        js.append(generateJSsetAnchor());
        js.append(generateJSsetAnchor1());
        js.append(generateJSsetFill());
        js.append(generateJSsetFill1());
        js.append(generateJSsetFill2());
        js.append(generateJSsetFill3());
        js.append(generateJSsetFill4());
        js.append(generateJSsetFill5());
        js.append(generateJSsetFill6());
        js.append(generateJSsetFill7());
        js.append(generateJSsetFill8());
        js.append(generateJSsetFill9());
        js.append(generateJSsetFill10());
        js.append(generateJSsetOffsetX());
        js.append(generateJSsetOffsetX1());
        js.append(generateJSsetOffsetY());
        js.append(generateJSsetOffsetY1());
        js.append(generateJSsetPosition());
        js.append(generateJSsetPosition1());
        js.append(generateJSsetRotation());
        js.append(generateJSsetSize());
        js.append(generateJSsetStroke());
        js.append(generateJSsetStroke1());
        js.append(generateJSsetStroke2());
        js.append(generateJSsetStroke3());
        js.append(generateJSsetStroke4());
        js.append(generateJSsetType());
        js.append(generateJSsetType1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}