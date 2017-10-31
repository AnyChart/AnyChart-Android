package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Interactivity class for maps.<br/>
{docs:Maps/Move_and_Zoom#navigational_interactivity}Learn more about the map interactivity.{docs}
 */
public class MapInteractivity extends Interactivity {

    public MapInteractivity() {
        js.setLength(0);
        js.append("var mapInteractivity").append(++variableIndex).append(" = anychart.core.utils.mapInteractivity();");
        jsBase = "mapInteractivity" + variableIndex;
    }

    protected MapInteractivity(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected MapInteractivity(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean drag;

    /**
     * Allows to use drag for map.
<b>Note:</b> Works only with {@link anychart.charts.Map#zoom}
     */
    public MapInteractivity drag(Boolean drag) {
        if (jsBase == null) {
            this.drag = drag;
        } else {
            this.drag = drag;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".drag(%b)", drag));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".drag(%b)", drag));
                js.setLength(0);
            }
        }
        return this;
    }

    private Boolean keyboardZoomAndMove;

    /**
     * Allows to use the keyboard to zoom and move.
     */
    public Interactivity keyboardZoomAndMove(Boolean keyboardZoomAndMove) {
        if (jsBase == null) {
            this.keyboardZoomAndMove = keyboardZoomAndMove;
        } else {
            this.keyboardZoomAndMove = keyboardZoomAndMove;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".keyboardZoomAndMove(%b);", keyboardZoomAndMove));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keyboardZoomAndMove(%b)", keyboardZoomAndMove));
                js.setLength(0);
            }
        }
        return new Interactivity(jsBase);
    }

    private Boolean zoomOnDoubleClick;

    /**
     * Enables double click zoom.
     */
    public Interactivity zoomOnDoubleClick(Boolean zoomOnDoubleClick) {
        if (jsBase == null) {
            this.zoomOnDoubleClick = zoomOnDoubleClick;
        } else {
            this.zoomOnDoubleClick = zoomOnDoubleClick;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".zoomOnDoubleClick(%b);", zoomOnDoubleClick));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomOnDoubleClick(%b)", zoomOnDoubleClick));
                js.setLength(0);
            }
        }
        return new Interactivity(jsBase);
    }

    private Boolean zoomOnMouseWheel;

    /**
     * Allows use the mouse wheel to zoom.
     */
    public Interactivity zoomOnMouseWheel(Boolean zoomOnMouseWheel) {
        if (jsBase == null) {
            this.zoomOnMouseWheel = zoomOnMouseWheel;
        } else {
            this.zoomOnMouseWheel = zoomOnMouseWheel;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".zoomOnMouseWheel(%b);", zoomOnMouseWheel));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomOnMouseWheel(%b)", zoomOnMouseWheel));
                js.setLength(0);
            }
        }
        return new Interactivity(jsBase);
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