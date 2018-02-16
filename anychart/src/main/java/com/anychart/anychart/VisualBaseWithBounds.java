package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * An extended base element that understands bounds settings and can handle percent values in it.
 */
public class VisualBaseWithBounds extends VisualBase {

    public VisualBaseWithBounds() {
        js.setLength(0);
        js.append("var visualBaseWithBounds").append(++variableIndex).append(" = anychart.core.visualBaseWithBounds();");
        jsBase = "visualBaseWithBounds" + variableIndex;
    }

    protected VisualBaseWithBounds(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected VisualBaseWithBounds(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Number bottom;
    private String bottom1;

    /**
     * Setter for element bottom bound settings.
     */
    public VisualBaseWithBounds setBottom(Number bottom) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
        } else {
            this.bottom = bottom;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".bottom(%s)", bottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottom(%s);", bottom));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for element bottom bound settings.
     */
    public VisualBaseWithBounds setBottom(String bottom1) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
        } else {
            this.bottom1 = bottom1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".bottom(%s)", wrapQuotes(bottom1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottom(%s);", wrapQuotes(bottom1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Bounds getBounds;

    /**
     * Getter for element bounds settings.
     */
    public Bounds getBounds() {
        if (getBounds == null)
            getBounds = new Bounds(jsBase + ".bounds()");

        return getBounds;
    }

    private RectObj bounds;
    private AnychartMathRect bounds1;
    private Bounds bounds2;
    private List<VisualBase> setBounds = new ArrayList<>();

    /**
     * Setter for bounds of the element using one parameter.
     */
    public VisualBase setBounds(RectObj bounds) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds = bounds;
        } else {
            this.bounds = bounds;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setBounds" + ++variableIndex + " = " + jsBase + ".bounds(%s);", ((bounds != null) ? bounds.generateJs() : "null")));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s);", ((bounds != null) ? bounds.generateJs() : "null")));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setBounds" + variableIndex);
        setBounds.add(item);
        return item;
    }
    private String generateJSsetBounds() {
        if (!setBounds.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setBounds) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VisualBase> setBounds1 = new ArrayList<>();

    /**
     * Setter for bounds of the element using one parameter.
     */
    public VisualBase setBounds(AnychartMathRect bounds1) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds1 = bounds1;
        } else {
            this.bounds1 = bounds1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(bounds1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".bounds(%s);",  ((bounds1 != null) ? bounds1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s);", ((bounds1 != null) ? bounds1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setBounds1" + variableIndex);
        setBounds1.add(item);
        return item;
    }
    private String generateJSsetBounds1() {
        if (!setBounds1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setBounds1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VisualBase> setBounds2 = new ArrayList<>();

    /**
     * Setter for bounds of the element using one parameter.
     */
    public VisualBase setBounds(Bounds bounds2) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds2 = bounds2;
        } else {
            this.bounds2 = bounds2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(bounds2.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".bounds(%s);",  ((bounds2 != null) ? bounds2.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s);", ((bounds2 != null) ? bounds2.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setBounds2" + variableIndex);
        setBounds2.add(item);
        return item;
    }
    private String generateJSsetBounds2() {
        if (!setBounds2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setBounds2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number x;
    private String x1;
    private Number y;
    private String y1;
    private Number width;
    private String width1;
    private Number height;
    private String height1;
    private List<VisualBase> setBounds3 = new ArrayList<>();

    /**
     * Setter for element bounds settings.
     */
    public VisualBase setBounds(String x1, String y1, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width1 = width1;
            this.height1 = height1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setBounds3" + ++variableIndex + " = " + jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x1), wrapQuotes(y1), wrapQuotes(width1), wrapQuotes(height1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", wrapQuotes(x1), wrapQuotes(y1), wrapQuotes(width1), wrapQuotes(height1)));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setBounds3" + variableIndex);
        setBounds3.add(item);
        return item;
    }
    private String generateJSsetBounds3() {
        if (!setBounds3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setBounds3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VisualBase> setBounds4 = new ArrayList<>();

    /**
     * Setter for element bounds settings.
     */
    public VisualBase setBounds(Number x, Number y, Number width, Number height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setBounds4" + ++variableIndex + " = " + jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, height));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x, y, width, height));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setBounds4" + variableIndex);
        setBounds4.add(item);
        return item;
    }
    private String generateJSsetBounds4() {
        if (!setBounds4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setBounds4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number height2;
    private String height3;

    /**
     * Setter for element height setting.
     */
    public VisualBaseWithBounds setHeight(Number height2) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height2 = height2;
        } else {
            this.height2 = height2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".height(%s)", height2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for element height setting.
     */
    public VisualBaseWithBounds setHeight(String height3) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height3 = height3;
        } else {
            this.height3 = height3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".height(%s)", wrapQuotes(height3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", wrapQuotes(height3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number left;
    private String left1;

    /**
     * Setter for element left bound settings.
     */
    public VisualBaseWithBounds setLeft(Number left) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.left = left;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".left(%s)", left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".left(%s);", left));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for element left bound settings.
     */
    public VisualBaseWithBounds setLeft(String left1) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.left1 = left1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".left(%s)", wrapQuotes(left1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".left(%s);", wrapQuotes(left1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number maxHeight;
    private String maxHeight1;
    private List<VisualBase> setMaxHeight = new ArrayList<>();

    /**
     * Setter for the maximum height.
     */
    public VisualBase setMaxHeight(Number maxHeight) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight = maxHeight;
        } else {
            this.maxHeight = maxHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMaxHeight" + ++variableIndex + " = " + jsBase + ".maxHeight(%s);", maxHeight));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%s);", maxHeight));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setMaxHeight" + variableIndex);
        setMaxHeight.add(item);
        return item;
    }
    private String generateJSsetMaxHeight() {
        if (!setMaxHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setMaxHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VisualBase> setMaxHeight1 = new ArrayList<>();

    /**
     * Setter for the maximum height.
     */
    public VisualBase setMaxHeight(String maxHeight1) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight1 = maxHeight1;
        } else {
            this.maxHeight1 = maxHeight1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMaxHeight1" + ++variableIndex + " = " + jsBase + ".maxHeight(%s);", wrapQuotes(maxHeight1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%s);", wrapQuotes(maxHeight1)));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setMaxHeight1" + variableIndex);
        setMaxHeight1.add(item);
        return item;
    }
    private String generateJSsetMaxHeight1() {
        if (!setMaxHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setMaxHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number maxWidth;
    private String maxWidth1;
    private List<VisualBase> setMaxWidth = new ArrayList<>();

    /**
     * Setter for the maximum width.
     */
    public VisualBase setMaxWidth(Number maxWidth) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth = maxWidth;
        } else {
            this.maxWidth = maxWidth;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMaxWidth" + ++variableIndex + " = " + jsBase + ".maxWidth(%s);", maxWidth));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%s);", maxWidth));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setMaxWidth" + variableIndex);
        setMaxWidth.add(item);
        return item;
    }
    private String generateJSsetMaxWidth() {
        if (!setMaxWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setMaxWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VisualBase> setMaxWidth1 = new ArrayList<>();

    /**
     * Setter for the maximum width.
     */
    public VisualBase setMaxWidth(String maxWidth1) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth1 = maxWidth1;
        } else {
            this.maxWidth1 = maxWidth1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMaxWidth1" + ++variableIndex + " = " + jsBase + ".maxWidth(%s);", wrapQuotes(maxWidth1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%s);", wrapQuotes(maxWidth1)));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setMaxWidth1" + variableIndex);
        setMaxWidth1.add(item);
        return item;
    }
    private String generateJSsetMaxWidth1() {
        if (!setMaxWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setMaxWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number minHeight;
    private String minHeight1;
    private List<VisualBase> setMinHeight = new ArrayList<>();

    /**
     * Setter for the minimum height.
     */
    public VisualBase setMinHeight(Number minHeight) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight = minHeight;
        } else {
            this.minHeight = minHeight;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMinHeight" + ++variableIndex + " = " + jsBase + ".minHeight(%s);", minHeight));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minHeight(%s);", minHeight));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setMinHeight" + variableIndex);
        setMinHeight.add(item);
        return item;
    }
    private String generateJSsetMinHeight() {
        if (!setMinHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setMinHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VisualBase> setMinHeight1 = new ArrayList<>();

    /**
     * Setter for the minimum height.
     */
    public VisualBase setMinHeight(String minHeight1) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight1 = minHeight1;
        } else {
            this.minHeight1 = minHeight1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMinHeight1" + ++variableIndex + " = " + jsBase + ".minHeight(%s);", wrapQuotes(minHeight1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minHeight(%s);", wrapQuotes(minHeight1)));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setMinHeight1" + variableIndex);
        setMinHeight1.add(item);
        return item;
    }
    private String generateJSsetMinHeight1() {
        if (!setMinHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setMinHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number minWidth;
    private String minWidth1;
    private List<VisualBase> setMinWidth = new ArrayList<>();

    /**
     * Setter for the minimum width.
     */
    public VisualBase setMinWidth(Number minWidth) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth = minWidth;
        } else {
            this.minWidth = minWidth;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMinWidth" + ++variableIndex + " = " + jsBase + ".minWidth(%s);", minWidth));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minWidth(%s);", minWidth));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setMinWidth" + variableIndex);
        setMinWidth.add(item);
        return item;
    }
    private String generateJSsetMinWidth() {
        if (!setMinWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setMinWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<VisualBase> setMinWidth1 = new ArrayList<>();

    /**
     * Setter for the minimum width.
     */
    public VisualBase setMinWidth(String minWidth1) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth1 = minWidth1;
        } else {
            this.minWidth1 = minWidth1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            
            js.append(String.format(Locale.US, "var setMinWidth1" + ++variableIndex + " = " + jsBase + ".minWidth(%s);", wrapQuotes(minWidth1)));
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minWidth(%s);", wrapQuotes(minWidth1)));
                js.setLength(0);
            }
        }
        VisualBase item = new VisualBase("setMinWidth1" + variableIndex);
        setMinWidth1.add(item);
        return item;
    }
    private String generateJSsetMinWidth1() {
        if (!setMinWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (VisualBase item : setMinWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Number right;
    private String right1;

    /**
     * Setter for element right bound setting.
     */
    public VisualBaseWithBounds setRight(Number right) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right = right;
        } else {
            this.right = right;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".right(%s)", right));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".right(%s);", right));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for element right bound setting.
     */
    public VisualBaseWithBounds setRight(String right1) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right1 = right1;
        } else {
            this.right1 = right1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".right(%s)", wrapQuotes(right1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".right(%s);", wrapQuotes(right1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number top;
    private String top1;

    /**
     * Setter for element top bound settings.
     */
    public VisualBaseWithBounds setTop(Number top) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top = top;
        } else {
            this.top = top;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".top(%s)", top));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".top(%s);", top));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for element top bound settings.
     */
    public VisualBaseWithBounds setTop(String top1) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top1 = top1;
        } else {
            this.top1 = top1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".top(%s)", wrapQuotes(top1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".top(%s);", wrapQuotes(top1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number width2;
    private String width3;

    /**
     * Setter for element width setting.
     */
    public VisualBaseWithBounds setWidth(Number width2) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width2 = width2;
        } else {
            this.width2 = width2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%s)", width2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width2));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for element width setting.
     */
    public VisualBaseWithBounds setWidth(String width3) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width3 = width3;
        } else {
            this.width3 = width3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", wrapQuotes(width3)));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetBounds() {
        if (getBounds != null) {
            return getBounds.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetBounds());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetBounds());
        js.append(generateJSsetBounds1());
        js.append(generateJSsetBounds2());
        js.append(generateJSsetBounds3());
        js.append(generateJSsetBounds4());
        js.append(generateJSsetMaxHeight());
        js.append(generateJSsetMaxHeight1());
        js.append(generateJSsetMaxWidth());
        js.append(generateJSsetMaxWidth1());
        js.append(generateJSsetMinHeight());
        js.append(generateJSsetMinHeight1());
        js.append(generateJSsetMinWidth());
        js.append(generateJSsetMinWidth1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}