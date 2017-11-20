package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Gantt text marker.
 */
public class GanttText extends CoreText {

    public GanttText() {
        js.setLength(0);
        js.append("var ganttText").append(++variableIndex).append(" = anychart.core.axisMarkers.ganttText();");
        jsBase = "ganttText" + variableIndex;
    }

    protected GanttText(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected GanttText(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private EnumsAlign align;
    private String align1;
    private List<GanttText> setAlign = new ArrayList<>();

    /**
     * Setter for the gantt text marker align.
     */
    public GanttText setAlign(EnumsAlign align) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align = align;
        } else {
            this.align = align;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".align(%s)", ((align != null) ? align.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".align(%s)", ((align != null) ? align.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAlign() {
        if (!setAlign.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : setAlign) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttText> setAlign1 = new ArrayList<>();

    /**
     * Setter for the gantt text marker align.
     */
    public GanttText setAlign(String align1) {
        if (jsBase == null) {
            this.align = null;
            this.align1 = null;
            
            this.align1 = align1;
        } else {
            this.align1 = align1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".align(%s)", wrapQuotes(align1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".align(%s)", wrapQuotes(align1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAlign1() {
        if (!setAlign1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : setAlign1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private EnumsAnchor anchor;
    private String anchor1;
    private List<GanttText> setAnchor = new ArrayList<>();

    /**
     * Setter for the text marker anchor settings.
     */
    public GanttText setAnchor(EnumsAnchor anchor) {
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
            for (GanttText item : setAnchor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttText> setAnchor1 = new ArrayList<>();

    /**
     * Setter for the text marker anchor settings.
     */
    public GanttText setAnchor(String anchor1) {
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
            for (GanttText item : setAnchor1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double height;
    private String height1;
    private List<GanttText> setHeight = new ArrayList<>();

    /**
     * Setter for the text marker height.
     */
    public GanttText setHeight(Double height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".height(%f)", height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%f)", height));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHeight() {
        if (!setHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : setHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttText> setHeight1 = new ArrayList<>();

    /**
     * Setter for the text marker height.
     */
    public GanttText setHeight(String height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".height(%s)", wrapQuotes(height1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%s)", wrapQuotes(height1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHeight1() {
        if (!setHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : setHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Layout layout;
    private String layout1;
    private List<GanttText> setLayout = new ArrayList<>();

    /**
     * Setter for the text marker layout.<br/>
<b>Note:</b> The layout method will not work here, only "vertical" layout are available in Gantt Chart.
     */
    public GanttText setLayout(Layout layout) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout = layout;
        } else {
            this.layout = layout;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".layout(%s)", ((layout != null) ? layout.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", ((layout != null) ? layout.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLayout() {
        if (!setLayout.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : setLayout) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttText> setLayout1 = new ArrayList<>();

    /**
     * Setter for the text marker layout.<br/>
<b>Note:</b> The layout method will not work here, only "vertical" layout are available in Gantt Chart.
     */
    public GanttText setLayout(String layout1) {
        if (jsBase == null) {
            this.layout = null;
            this.layout1 = null;
            
            this.layout1 = layout1;
        } else {
            this.layout1 = layout1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".layout(%s)", wrapQuotes(layout1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", wrapQuotes(layout1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLayout1() {
        if (!setLayout1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : setLayout1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double offsetX;
    private String offsetX1;
    private List<GanttText> setOffsetX = new ArrayList<>();

    /**
     * Setter for the text marker offset by x.
     */
    public GanttText setOffsetX(Double offsetX) {
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
            for (GanttText item : setOffsetX) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttText> setOffsetX1 = new ArrayList<>();

    /**
     * Setter for the text marker offset by x.
     */
    public GanttText setOffsetX(String offsetX1) {
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
            for (GanttText item : setOffsetX1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double offsetY;
    private String offsetY1;
    private List<GanttText> setOffsetY = new ArrayList<>();

    /**
     * Setter for the text marker offset by y.
     */
    public GanttText setOffsetY(Double offsetY) {
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
            for (GanttText item : setOffsetY) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttText> setOffsetY1 = new ArrayList<>();

    /**
     * Setter for the text marker offset by y.
     */
    public GanttText setOffsetY(String offsetY1) {
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
            for (GanttText item : setOffsetY1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double rotation;
    private List<GanttText> setRotation = new ArrayList<>();

    /**
     * Setter for the gantt text marker rotation.
     */
    public GanttText setRotation(Double rotation) {
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
            for (GanttText item : setRotation) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GanttDateTime getScale;

    /**
     * Getter for the gantt text marker scale.
     */
    public GanttDateTime getScale() {
        if (getScale == null)
            getScale = new GanttDateTime(jsBase + ".scale()");

        return getScale;
    }

    private List<GanttText> getScale1 = new ArrayList<>();

    /**
     * Getter for the gantt text marker scale.<br/>
<b>Note:</b> The scale method will not work here, only "dateTime" scale are available in Gantt Chart.
{docs:Gantt_Chart/Timeline#special_features}Learn more about scale.{docs}
     */
    public GanttText getScale(GanttDateTime scale) {
        GanttText item = new GanttText(jsBase + ".scale(" + ((scale != null) ? scale.generateJs() : "null") + ")");
        getScale1.add(item);
        return item;
    }

    private String text;
    private List<GanttText> setText = new ArrayList<>();

    /**
     * Setter for the gantt text marker text setting.
     */
    public GanttText setText(String text) {
        if (jsBase == null) {
            this.text = text;
        } else {
            this.text = text;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".text(%s)", wrapQuotes(text)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".text(%s)", wrapQuotes(text)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetText() {
        if (!setText.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : setText) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double value;
    private GanttDateTimeMarkers value1;
    private String value2;
    private List<GanttText> setValue = new ArrayList<>();

    /**
     * Setter for the gantt text marker value.
     */
    public GanttText setValue(Double value) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            
            this.value = value;
        } else {
            this.value = value;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".value(%f)", value));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%f)", value));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValue() {
        if (!setValue.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : setValue) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttText> setValue1 = new ArrayList<>();

    /**
     * Setter for the gantt text marker value.
     */
    public GanttText setValue(GanttDateTimeMarkers value1) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            
            this.value1 = value1;
        } else {
            this.value1 = value1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".value(%s)", ((value1 != null) ? value1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%s)", ((value1 != null) ? value1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValue1() {
        if (!setValue1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : setValue1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttText> setValue2 = new ArrayList<>();

    /**
     * Setter for the gantt text marker value.
     */
    public GanttText setValue(String value2) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            
            this.value2 = value2;
        } else {
            this.value2 = value2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".value(%s)", wrapQuotes(value2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".value(%s)", wrapQuotes(value2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValue2() {
        if (!setValue2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : setValue2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double width;
    private String width1;
    private List<GanttText> setWidth = new ArrayList<>();

    /**
     * Setter for the text marker width.
     */
    public GanttText setWidth(Double width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".width(%f)", width));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%f)", width));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWidth() {
        if (!setWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : setWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<GanttText> setWidth1 = new ArrayList<>();

    /**
     * Setter for the text marker width.
     */
    public GanttText setWidth(String width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%s)", wrapQuotes(width1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWidth1() {
        if (!setWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : setWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetScale() {
        if (getScale != null) {
            return getScale.generateJs();
        }
        return "";
    }

    private String generateJSgetScale1() {
        if (!getScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (GanttText item : getScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetScale());
        jsGetters.append(generateJSgetScale1());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetAlign());
        js.append(generateJSsetAlign1());
        js.append(generateJSsetAnchor());
        js.append(generateJSsetAnchor1());
        js.append(generateJSsetHeight());
        js.append(generateJSsetHeight1());
        js.append(generateJSsetLayout());
        js.append(generateJSsetLayout1());
        js.append(generateJSsetOffsetX());
        js.append(generateJSsetOffsetX1());
        js.append(generateJSsetOffsetY());
        js.append(generateJSsetOffsetY1());
        js.append(generateJSsetRotation());
        js.append(generateJSsetText());
        js.append(generateJSsetValue());
        js.append(generateJSsetValue1());
        js.append(generateJSsetValue2());
        js.append(generateJSsetWidth());
        js.append(generateJSsetWidth1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}