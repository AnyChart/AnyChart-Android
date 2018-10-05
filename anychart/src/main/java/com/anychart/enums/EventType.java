package com.anychart.enums;

import java.util.Locale;

/**
 * Event types enumeration.
 */
public enum EventType {

    ANIMATION_END("animationEnd"),
    ANIMATION_START("animationStart"),
    ANNOTATION_CHANGE("annotationChange"),
    ANNOTATION_CHANGE_FINISH("annotationChangeFinish"),
    ANNOTATION_CHANGE_START("annotationChangeStart"),
    ANNOTATION_DRAWING_FINISH("annotationDrawingFinish"),
    ANNOTATION_SELECT("annotationSelect"),
    ANNOTATION_UNSELECT("annotationUnselect"),
    AXIS_MARKER_MOVE("axisMarkerMove"),
    AXIS_MARKER_OUT("axisMarkerOut"),
    AXIS_MARKER_OVER("axisMarkerOver"),
    BEFORE_CREATE_CONNECTOR("beforeCreateConnector"),
    CHART_DRAW("chartDraw"),
    CLOSE("close"),
    COMPLETE("complete"),
    CONNECTOR_CLICK("connectorClick"),
    CONNECTOR_DBL_CLICK("connectorDblclick"),
    CONNECTOR_MOUSE_DOWN("connectorMouseDown"),
    CONNECTOR_MOUSE_MOVE("connectorMouseMove"),
    CONNECTOR_MOUSE_OUT("connectorMouseOut"),
    CONNECTOR_MOUSE_OVER("connectorMouseOver"),
    CONNECTOR_MOUSE_UP("connectorMouseUp"),
    CONNECTOR_SELECT("connectorSelect"),
    DATA_CHANGED("dataChanged"),
    DRAG("drag"),
    DRAG_END("dragEnd"),
    DRAG_START("dragStart"),
    DRILL_CHANGE("drillChange"),
    EDITOR_COMPLETE("editorComplete"),
    EVENT_MARKERS_HOVER("eventMarkersHover"),
    EVENT_MARKERS_SELECT("eventMarkersSelect"),
    EVENT_MARKER_CLICK("eventMarkerClick"),
    EVENT_MARKER_DBLCLICK("eventMarkerDblClick"),
    EVENT_MARKER_MOUSE_DOWN("eventMarkerMouseDown"),
    EVENT_MARKER_MOUSE_MOVE("eventMarkerMouseMove"),
    EVENT_MARKER_MOUSE_OUT("eventMarkerMouseOut"),
    EVENT_MARKER_MOUSE_OVER("eventMarkerMouseOver"),
    EVENT_MARKER_MOUSE_UP("eventMarkerMouseUp"),
    LEGEND_ITEM_CLICK("legendItemClick"),
    LEGEND_ITEM_DBLCLICK("legendItemDblclick"),
    LEGEND_ITEM_MOUSE_DOWN("legendItemMouseDown"),
    LEGEND_ITEM_MOUSE_MOVE("legendItemMouseMove"),
    LEGEND_ITEM_MOUSE_OUT("legendItemMouseOut"),
    LEGEND_ITEM_MOUSE_OVER("legendItemMouseOver"),
    LEGEND_ITEM_MOUSE_UP("legendItemMouseUp"),
    POINTS_HOVER("pointsHover"),
    POINTS_SELECT("pointsSelect"),
    POINT_CLICK("pointClick"),
    POINT_DBLCLICK("pointDblclick"),
    POINT_HOVER("pointHover"),
    POINT_MOUSE_DOWN("pointMouseDown"),
    POINT_MOUSE_MOVE("pointMouseMove"),
    POINT_MOUSE_OUT("pointMouseOut"),
    POINT_MOUSE_OVER("pointMouseOver"),
    POINT_MOUSE_UP("pointMouseUp"),
    ROW_CLICK("rowClick"),
    ROW_DBL_CLICK("rowDblClick"),
    ROW_MOUSE_DOWN("rowMouseDown"),
    ROW_MOUSE_MOVE("rowMouseOver"),
    ROW_MOUSE_OUT("rowMouseOut"),
    ROW_MOUSE_OVER("rowMouseOver"),
    ROW_MOUSE_UP("rowMouseUp"),
    ROW_SELECT("rowSelect"),
    SCROLLER_CHANGE("scrollerchange"),
    SCROLLER_CHANGE_FINISH("scrollerChangeFinish"),
    SCROLLER_CHANGE_START("scrollerchangestart"),
    SCROLL_CHANGE("scrollChange"),
    SELECTED_RANGE_BEFORE_CHANGE("selectedRangeBeforeChange"),
    SELECTED_RANGE_CHANGE("selectedRangeChange"),
    SELECTED_RANGE_CHANGE_FINISH("selectedRangeChangeFinish"),
    SELECTED_RANGE_CHANGE_START("selectedRangeChangeStart"),
    SELECT_MARQUEE_CHANGE("selectMarqueeChange"),
    SELECT_MARQUEE_FINISH("selectMarqueeFinish"),
    SELECT_MARQUEE_START("selectMarqueeStart"),
    SIGNAL("signal"),
    TREE_ITEM_CREATE("treeItemCreate"),
    TREE_ITEM_MOVE("treeItemMove"),
    TREE_ITEM_REMOVE("treeItemRemove"),
    TREE_ITEM_UPDATE("treeItemUpdate"),
    ZOOM("zoom"),
    ZOOM_END("zoomEnd"),
    ZOOM_START("zoomStart");

    private final String value;

    EventType(String value) {
        this.value = value;
    }

    public String getJsBase() {
        return String.format(Locale.US, "\"%s\"", value);
    }
}