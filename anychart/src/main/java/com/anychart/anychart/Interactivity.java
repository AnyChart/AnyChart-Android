package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Interactivity class for charts.<br/>
{docs:Common_Settings/Interactivity}Learn more about the interactivity.{docs}
 */
public class Interactivity extends CoreBase {

    public Interactivity() {
        js.setLength(0);
        js.append("var interactivity").append(++variableIndex).append(" = anychart.core.utils.interactivity();");
        jsBase = "interactivity" + variableIndex;
    }

    protected Interactivity(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Interactivity(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private HoverMode hoverMode;
    private String hoverMode1;

    /**
     * Setter for the hover mode.
     */
    public Interactivity setHoverMode(HoverMode hoverMode) {
        if (jsBase == null) {
            this.hoverMode = null;
            this.hoverMode1 = null;
            
            this.hoverMode = hoverMode;
        } else {
            this.hoverMode = hoverMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hoverMode(%s)", ((hoverMode != null) ? hoverMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverMode(%s);", ((hoverMode != null) ? hoverMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the hover mode.
     */
    public Interactivity setHoverMode(String hoverMode1) {
        if (jsBase == null) {
            this.hoverMode = null;
            this.hoverMode1 = null;
            
            this.hoverMode1 = hoverMode1;
        } else {
            this.hoverMode1 = hoverMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".hoverMode(%s)", wrapQuotes(hoverMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverMode(%s);", wrapQuotes(hoverMode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean multiSelectOnClick;

    /**
     * Setter for the multi-select on click.
     */
    public Interactivity setMultiSelectOnClick(Boolean multiSelectOnClick) {
        if (jsBase == null) {
            this.multiSelectOnClick = multiSelectOnClick;
        } else {
            this.multiSelectOnClick = multiSelectOnClick;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".multiSelectOnClick(%b)", multiSelectOnClick));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".multiSelectOnClick(%b);", multiSelectOnClick));
                js.setLength(0);
            }
        }
        return this;
    }

    private SelectionMode selectionMode;
    private String selectionMode1;

    /**
     * Setter for the selection mode.
     */
    public Interactivity setSelectionMode(SelectionMode selectionMode) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode = selectionMode;
        } else {
            this.selectionMode = selectionMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectionMode(%s)", ((selectionMode != null) ? selectionMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectionMode(%s);", ((selectionMode != null) ? selectionMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the selection mode.
     */
    public Interactivity setSelectionMode(String selectionMode1) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode1 = selectionMode1;
        } else {
            this.selectionMode1 = selectionMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".selectionMode(%s)", wrapQuotes(selectionMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectionMode(%s);", wrapQuotes(selectionMode1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Number spotRadius;

    /**
     * Setter for the spot radius.
Size of the area under cursor in pixels for radius hovering.
<b>Note:</b> Works only with "by-spot" value in the {@link anychart.core.utils.Interactivity#hoverMode} method.
     */
    public Interactivity setSpotRadius(Number spotRadius) {
        if (jsBase == null) {
            this.spotRadius = spotRadius;
        } else {
            this.spotRadius = spotRadius;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".spotRadius(%s)", spotRadius));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".spotRadius(%s);", spotRadius));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean unselectOnClickOutOfPoint;

    /**
     * Setter for the unselectOnClickOutOfPoint.<br/>
If the value is <b>true<b/>, disables select all points when clicking outside the chart point.
     */
    public Interactivity setUnselectOnClickOutOfPoint(Boolean unselectOnClickOutOfPoint) {
        if (jsBase == null) {
            this.unselectOnClickOutOfPoint = unselectOnClickOutOfPoint;
        } else {
            this.unselectOnClickOutOfPoint = unselectOnClickOutOfPoint;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            
            js.append(String.format(Locale.US, ".unselectOnClickOutOfPoint(%b)", unselectOnClickOutOfPoint));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselectOnClickOutOfPoint(%b);", unselectOnClickOutOfPoint));
                js.setLength(0);
            }
        }
        return this;
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

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}