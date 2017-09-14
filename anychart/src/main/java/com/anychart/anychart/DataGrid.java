package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class DataGrid extends JsObject {

    
    private Fill backgroundFill;

    public void setBackgroundfill(Fill backgroundFill) {
        this.backgroundFill = backgroundFill;
    }

    private String color;
    private Double opacity;

    public void setBackgroundfill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private Rect mode1;
    private Double opacity1;

    public void setBackgroundfill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
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


    public void setBackgroundfill(GradientKey[] keys, Rect mode1, Double angle, Double opacity1) {
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


    public void setBackgroundfill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
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


    public void setBackgroundfill(String[] keys1, Rect mode1, Double angle, Double opacity1) {
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
    private Rect mode2;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setBackgroundfill(GradientKey[] keys2, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
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


    public void setBackgroundfill(String[] keys3, Double cx, Double cy, Rect mode2, Double opacity2, Double fx, Double fy) {
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
    private Double bottom;
    private String bottom1;

    public void setBottom(Double bottom) {
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
    }


    public void setBottom(String bottom1) {
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
    }

    private RectObj bounds;
    private Rect bounds1;
    private Bounds bounds2;

    public void setBounds(RectObj bounds) {
        this.bounds = null;
        this.bounds1 = null;
        this.bounds2 = null;
        
        this.bounds = bounds;
    }


    public void setBounds(Rect bounds1) {
        this.bounds = null;
        this.bounds1 = null;
        this.bounds2 = null;
        
        this.bounds1 = bounds1;
    }


    public void setBounds(Bounds bounds2) {
        this.bounds = null;
        this.bounds1 = null;
        this.bounds2 = null;
        
        this.bounds2 = bounds2;
    }

    private Double x;
    private String x1;
    private Double y;
    private String y1;
    private Double width;
    private String width1;
    private Double height;
    private String height1;

    public void setBounds(Double x, Double y, Double width, Double height) {
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
    }


    public void setBounds(Double x, Double y, Double width, String height1) {
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
        
        this.height1 = height1;
    }


    public void setBounds(Double x, Double y, String width1, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(Double x, Double y, String width1, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(Double x, String y1, Double width, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(Double x, String y1, Double width, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(Double x, String y1, String width1, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(Double x, String y1, String width1, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x = x;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(String x1, Double y, Double width, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(String x1, Double y, Double width, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(String x1, Double y, String width1, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(String x1, Double y, String width1, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y = y;
        this.width = null;
        this.width1 = null;
        
        this.width1 = width1;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(String x1, String y1, Double width, Double height) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height = height;
    }


    public void setBounds(String x1, String y1, Double width, String height1) {
        this.x = null;
        this.x1 = null;
        
        this.x1 = x1;
        this.y = null;
        this.y1 = null;
        
        this.y1 = y1;
        this.width = null;
        this.width1 = null;
        
        this.width = width;
        this.height = null;
        this.height1 = null;
        
        this.height1 = height1;
    }


    public void setBounds(String x1, String y1, String width1, Double height) {
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
        
        this.height = height;
    }


    public void setBounds(String x1, String y1, String width1, String height1) {
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
    }

    private Double index;

    public void setColumn(Double index) {
        this.index = index;
    }

    private Column column;

    public void setColumn(Column column) {
        this.column = column;
    }

    private Double index1;
    private Column column1;

    public void setColumn(Double index1, Column column1) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
        this.column = null;
        this.column1 = null;
        
        this.column1 = column1;
    }

    private Stroke columnStroke;
    private String columnStroke1;

    public void setColumnstroke(Stroke columnStroke) {
        this.columnStroke = null;
        this.columnStroke1 = null;
        
        this.columnStroke = columnStroke;
    }


    public void setColumnstroke(String columnStroke1) {
        this.columnStroke = null;
        this.columnStroke1 = null;
        
        this.columnStroke1 = columnStroke1;
    }

    private String container;
    private Element container1;

    public void setContainer(String container) {
        this.container = null;
        this.container1 = null;
        
        this.container = container;
    }


    public void setContainer(Element container1) {
        this.container = null;
        this.container1 = null;
        
        this.container1 = container1;
    }

    private Tree data;

    public void setData(Tree data) {
        this.data = data;
    }

    private Double defaultRowHeight;

    public void setDefaultrowheight(Double defaultRowHeight) {
        this.defaultRowHeight = defaultRowHeight;
    }

    private Stroke editStructurePreviewDashStroke;
    private String editStructurePreviewDashStroke1;

    public void setEditstructurepreviewdashstroke(Stroke editStructurePreviewDashStroke) {
        this.editStructurePreviewDashStroke = null;
        this.editStructurePreviewDashStroke1 = null;
        
        this.editStructurePreviewDashStroke = editStructurePreviewDashStroke;
    }


    public void setEditstructurepreviewdashstroke(String editStructurePreviewDashStroke1) {
        this.editStructurePreviewDashStroke = null;
        this.editStructurePreviewDashStroke1 = null;
        
        this.editStructurePreviewDashStroke1 = editStructurePreviewDashStroke1;
    }

    private Fill editStructurePreviewFill;

    public void setEditstructurepreviewfill(Fill editStructurePreviewFill) {
        this.editStructurePreviewFill = editStructurePreviewFill;
    }

    private String color1;
    private Double opacity3;

    public void setEditstructurepreviewfill(String color1, Double opacity3) {
        this.color = null;
        this.color1 = null;
        
        this.color1 = color1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        
        this.opacity3 = opacity3;
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode3;
    private Rect mode4;
    private Double opacity4;

    public void setEditstructurepreviewfill(GradientKey[] keys4, Boolean mode3, Double angle1, Double opacity4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        
        this.keys4 = keys4;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        
        this.mode3 = mode3;
        this.angle = null;
        this.angle1 = null;
        
        this.angle1 = angle1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        
        this.opacity4 = opacity4;
    }


    public void setEditstructurepreviewfill(GradientKey[] keys4, Rect mode4, Double angle1, Double opacity4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        
        this.keys4 = keys4;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        
        this.mode4 = mode4;
        this.angle = null;
        this.angle1 = null;
        
        this.angle1 = angle1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        
        this.opacity4 = opacity4;
    }


    public void setEditstructurepreviewfill(String[] keys5, Boolean mode3, Double angle1, Double opacity4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        
        this.keys5 = keys5;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        
        this.mode3 = mode3;
        this.angle = null;
        this.angle1 = null;
        
        this.angle1 = angle1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        
        this.opacity4 = opacity4;
    }


    public void setEditstructurepreviewfill(String[] keys5, Rect mode4, Double angle1, Double opacity4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        
        this.keys5 = keys5;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        
        this.mode4 = mode4;
        this.angle = null;
        this.angle1 = null;
        
        this.angle1 = angle1;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        
        this.opacity4 = opacity4;
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private Rect mode5;
    private Double opacity5;
    private Double fx1;
    private Double fy1;

    public void setEditstructurepreviewfill(GradientKey[] keys6, Double cx1, Double cy1, Rect mode5, Double opacity5, Double fx1, Double fy1) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        
        this.keys6 = keys6;
        this.cx = null;
        this.cx1 = null;
        
        this.cx1 = cx1;
        this.cy = null;
        this.cy1 = null;
        
        this.cy1 = cy1;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        
        this.mode5 = mode5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        
        this.opacity5 = opacity5;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }


    public void setEditstructurepreviewfill(String[] keys7, Double cx1, Double cy1, Rect mode5, Double opacity5, Double fx1, Double fy1) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        
        this.keys7 = keys7;
        this.cx = null;
        this.cx1 = null;
        
        this.cx1 = cx1;
        this.cy = null;
        this.cy1 = null;
        
        this.cy1 = cy1;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        
        this.mode5 = mode5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        
        this.opacity5 = opacity5;
        this.fx = null;
        this.fx1 = null;
        
        this.fx1 = fx1;
        this.fy = null;
        this.fy1 = null;
        
        this.fy1 = fy1;
    }

    private Fill imageSettings1;
    private Stroke editStructurePreviewStroke;
    private String editStructurePreviewStroke1;

    public void setEditstructurepreviewstroke(Stroke editStructurePreviewStroke) {
        this.editStructurePreviewStroke = null;
        this.editStructurePreviewStroke1 = null;
        
        this.editStructurePreviewStroke = editStructurePreviewStroke;
    }


    public void setEditstructurepreviewstroke(String editStructurePreviewStroke1) {
        this.editStructurePreviewStroke = null;
        this.editStructurePreviewStroke1 = null;
        
        this.editStructurePreviewStroke1 = editStructurePreviewStroke1;
    }

    private Boolean editing;

    public void setEditing(Boolean editing) {
        this.editing = editing;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private Double endIndex;

    public void setEndindex(Double endIndex) {
        this.endIndex = endIndex;
    }

    private Double headerHeight;

    public void setHeaderheight(Double headerHeight) {
        this.headerHeight = headerHeight;
    }

    private Double height2;
    private String height3;

    public void setHeight(Double height2) {
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        
        this.height2 = height2;
    }


    public void setHeight(String height3) {
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        
        this.height3 = height3;
    }

    private Double horizontalOffset;

    public void setHorizontaloffset(Double horizontalOffset) {
        this.horizontalOffset = horizontalOffset;
    }

    private Double left;
    private String left1;

    public void setLeft(Double left) {
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setLeft(String left1) {
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
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

    private Double maxHeight;
    private String maxHeight1;

    public void setMaxheight(Double maxHeight) {
        this.maxHeight = null;
        this.maxHeight1 = null;
        
        this.maxHeight = maxHeight;
    }


    public void setMaxheight(String maxHeight1) {
        this.maxHeight = null;
        this.maxHeight1 = null;
        
        this.maxHeight1 = maxHeight1;
    }

    private Double maxWidth;
    private String maxWidth1;

    public void setMaxwidth(Double maxWidth) {
        this.maxWidth = null;
        this.maxWidth1 = null;
        
        this.maxWidth = maxWidth;
    }


    public void setMaxwidth(String maxWidth1) {
        this.maxWidth = null;
        this.maxWidth1 = null;
        
        this.maxWidth1 = maxWidth1;
    }

    private Double minHeight;
    private String minHeight1;

    public void setMinheight(Double minHeight) {
        this.minHeight = null;
        this.minHeight1 = null;
        
        this.minHeight = minHeight;
    }


    public void setMinheight(String minHeight1) {
        this.minHeight = null;
        this.minHeight1 = null;
        
        this.minHeight1 = minHeight1;
    }

    private Double minWidth;
    private String minWidth1;

    public void setMinwidth(Double minWidth) {
        this.minWidth = null;
        this.minWidth1 = null;
        
        this.minWidth = minWidth;
    }


    public void setMinwidth(String minWidth1) {
        this.minWidth = null;
        this.minWidth1 = null;
        
        this.minWidth1 = minWidth1;
    }

    private Rect parentBounds;

    public void setParentbounds(Rect parentBounds) {
        this.parentBounds = parentBounds;
    }

    private Double left2;
    private Double top;
    private Double width2;
    private Double height4;

    public void setParentbounds(Double left2, Double top, Double width2, Double height4) {
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        
        this.left2 = left2;
        this.top = top;
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        
        this.width2 = width2;
        this.height = null;
        this.height1 = null;
        this.height2 = null;
        this.height3 = null;
        this.height4 = null;
        
        this.height4 = height4;
    }

    private PaperSize paperSizeOrOptions;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        this.paperSizeOrOptions = paperSizeOrOptions;
        this.landscape = landscape;
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
    }

    private Double right;
    private String right1;

    public void setRight(Double right) {
        this.right = null;
        this.right1 = null;
        
        this.right = right;
    }


    public void setRight(String right1) {
        this.right = null;
        this.right1 = null;
        
        this.right1 = right1;
    }

    private Fill rowEvenFill;

    public void setRowevenfill(Fill rowEvenFill) {
        this.rowEvenFill = rowEvenFill;
    }

    private String color2;
    private Double opacity6;

    public void setRowevenfill(String color2, Double opacity6) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        
        this.color2 = color2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        
        this.opacity6 = opacity6;
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode6;
    private Rect mode7;
    private Double opacity7;

    public void setRowevenfill(GradientKey[] keys8, Boolean mode6, Double angle2, Double opacity7) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        
        this.keys8 = keys8;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        
        this.mode6 = mode6;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        
        this.angle2 = angle2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        
        this.opacity7 = opacity7;
    }


    public void setRowevenfill(GradientKey[] keys8, Rect mode7, Double angle2, Double opacity7) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        
        this.keys8 = keys8;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        
        this.mode7 = mode7;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        
        this.angle2 = angle2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        
        this.opacity7 = opacity7;
    }


    public void setRowevenfill(String[] keys9, Boolean mode6, Double angle2, Double opacity7) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        
        this.keys9 = keys9;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        
        this.mode6 = mode6;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        
        this.angle2 = angle2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        
        this.opacity7 = opacity7;
    }


    public void setRowevenfill(String[] keys9, Rect mode7, Double angle2, Double opacity7) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        
        this.keys9 = keys9;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        
        this.mode7 = mode7;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        
        this.angle2 = angle2;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        
        this.opacity7 = opacity7;
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private Rect mode8;
    private Double opacity8;
    private Double fx2;
    private Double fy2;

    public void setRowevenfill(GradientKey[] keys10, Double cx2, Double cy2, Rect mode8, Double opacity8, Double fx2, Double fy2) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        
        this.keys10 = keys10;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        
        this.cx2 = cx2;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        
        this.cy2 = cy2;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        
        this.mode8 = mode8;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        
        this.opacity8 = opacity8;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        
        this.fx2 = fx2;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        
        this.fy2 = fy2;
    }


    public void setRowevenfill(String[] keys11, Double cx2, Double cy2, Rect mode8, Double opacity8, Double fx2, Double fy2) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        
        this.keys11 = keys11;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        
        this.cx2 = cx2;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        
        this.cy2 = cy2;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        
        this.mode8 = mode8;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        
        this.opacity8 = opacity8;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        
        this.fx2 = fx2;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        
        this.fy2 = fy2;
    }

    private Fill imageSettings2;
    private Fill rowFill;

    public void setRowfill(Fill rowFill) {
        this.rowFill = rowFill;
    }

    private String color3;
    private Double opacity9;

    public void setRowfill(String color3, Double opacity9) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        
        this.color3 = color3;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        
        this.opacity9 = opacity9;
    }

    private GradientKey[] keys12;
    private String[] keys13;
    private Double angle3;
    private Boolean mode9;
    private Rect mode10;
    private Double opacity10;

    public void setRowfill(GradientKey[] keys12, Boolean mode9, Double angle3, Double opacity10) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        
        this.keys12 = keys12;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        
        this.mode9 = mode9;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        
        this.angle3 = angle3;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        
        this.opacity10 = opacity10;
    }


    public void setRowfill(GradientKey[] keys12, Rect mode10, Double angle3, Double opacity10) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        
        this.keys12 = keys12;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        
        this.mode10 = mode10;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        
        this.angle3 = angle3;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        
        this.opacity10 = opacity10;
    }


    public void setRowfill(String[] keys13, Boolean mode9, Double angle3, Double opacity10) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        
        this.keys13 = keys13;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        
        this.mode9 = mode9;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        
        this.angle3 = angle3;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        
        this.opacity10 = opacity10;
    }


    public void setRowfill(String[] keys13, Rect mode10, Double angle3, Double opacity10) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        
        this.keys13 = keys13;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        
        this.mode10 = mode10;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        
        this.angle3 = angle3;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        
        this.opacity10 = opacity10;
    }

    private GradientKey[] keys14;
    private String[] keys15;
    private Double cx3;
    private Double cy3;
    private Rect mode11;
    private Double opacity11;
    private Double fx3;
    private Double fy3;

    public void setRowfill(GradientKey[] keys14, Double cx3, Double cy3, Rect mode11, Double opacity11, Double fx3, Double fy3) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        
        this.keys14 = keys14;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        
        this.cx3 = cx3;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        
        this.cy3 = cy3;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        
        this.mode11 = mode11;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        
        this.opacity11 = opacity11;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        
        this.fx3 = fx3;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        
        this.fy3 = fy3;
    }


    public void setRowfill(String[] keys15, Double cx3, Double cy3, Rect mode11, Double opacity11, Double fx3, Double fy3) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        
        this.keys15 = keys15;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        
        this.cx3 = cx3;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        
        this.cy3 = cy3;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        
        this.mode11 = mode11;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        
        this.opacity11 = opacity11;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        
        this.fx3 = fx3;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        
        this.fy3 = fy3;
    }

    private Fill imageSettings3;
    private Fill rowHoverFill;

    public void setRowhoverfill(Fill rowHoverFill) {
        this.rowHoverFill = rowHoverFill;
    }

    private String color4;
    private Double opacity12;

    public void setRowhoverfill(String color4, Double opacity12) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        
        this.color4 = color4;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        
        this.opacity12 = opacity12;
    }

    private GradientKey[] keys16;
    private String[] keys17;
    private Double angle4;
    private Boolean mode12;
    private Rect mode13;
    private Double opacity13;

    public void setRowhoverfill(GradientKey[] keys16, Boolean mode12, Double angle4, Double opacity13) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        
        this.keys16 = keys16;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        
        this.mode12 = mode12;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        
        this.angle4 = angle4;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        
        this.opacity13 = opacity13;
    }


    public void setRowhoverfill(GradientKey[] keys16, Rect mode13, Double angle4, Double opacity13) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        
        this.keys16 = keys16;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        
        this.mode13 = mode13;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        
        this.angle4 = angle4;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        
        this.opacity13 = opacity13;
    }


    public void setRowhoverfill(String[] keys17, Boolean mode12, Double angle4, Double opacity13) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        
        this.keys17 = keys17;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        
        this.mode12 = mode12;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        
        this.angle4 = angle4;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        
        this.opacity13 = opacity13;
    }


    public void setRowhoverfill(String[] keys17, Rect mode13, Double angle4, Double opacity13) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        
        this.keys17 = keys17;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        
        this.mode13 = mode13;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        
        this.angle4 = angle4;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        
        this.opacity13 = opacity13;
    }

    private GradientKey[] keys18;
    private String[] keys19;
    private Double cx4;
    private Double cy4;
    private Rect mode14;
    private Double opacity14;
    private Double fx4;
    private Double fy4;

    public void setRowhoverfill(GradientKey[] keys18, Double cx4, Double cy4, Rect mode14, Double opacity14, Double fx4, Double fy4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        
        this.keys18 = keys18;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        
        this.cx4 = cx4;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        
        this.cy4 = cy4;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        
        this.mode14 = mode14;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        
        this.opacity14 = opacity14;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        
        this.fx4 = fx4;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        
        this.fy4 = fy4;
    }


    public void setRowhoverfill(String[] keys19, Double cx4, Double cy4, Rect mode14, Double opacity14, Double fx4, Double fy4) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        
        this.keys19 = keys19;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        
        this.cx4 = cx4;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        
        this.cy4 = cy4;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        
        this.mode14 = mode14;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        
        this.opacity14 = opacity14;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        
        this.fx4 = fx4;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        
        this.fy4 = fy4;
    }

    private Fill imageSettings4;
    private Fill rowOddFill;

    public void setRowoddfill(Fill rowOddFill) {
        this.rowOddFill = rowOddFill;
    }

    private String color5;
    private Double opacity15;

    public void setRowoddfill(String color5, Double opacity15) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        
        this.color5 = color5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        
        this.opacity15 = opacity15;
    }

    private GradientKey[] keys20;
    private String[] keys21;
    private Double angle5;
    private Boolean mode15;
    private Rect mode16;
    private Double opacity16;

    public void setRowoddfill(GradientKey[] keys20, Boolean mode15, Double angle5, Double opacity16) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        
        this.keys20 = keys20;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        
        this.mode15 = mode15;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        
        this.angle5 = angle5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        
        this.opacity16 = opacity16;
    }


    public void setRowoddfill(GradientKey[] keys20, Rect mode16, Double angle5, Double opacity16) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        
        this.keys20 = keys20;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        
        this.mode16 = mode16;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        
        this.angle5 = angle5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        
        this.opacity16 = opacity16;
    }


    public void setRowoddfill(String[] keys21, Boolean mode15, Double angle5, Double opacity16) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        
        this.keys21 = keys21;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        
        this.mode15 = mode15;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        
        this.angle5 = angle5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        
        this.opacity16 = opacity16;
    }


    public void setRowoddfill(String[] keys21, Rect mode16, Double angle5, Double opacity16) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        
        this.keys21 = keys21;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        
        this.mode16 = mode16;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        
        this.angle5 = angle5;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        
        this.opacity16 = opacity16;
    }

    private GradientKey[] keys22;
    private String[] keys23;
    private Double cx5;
    private Double cy5;
    private Rect mode17;
    private Double opacity17;
    private Double fx5;
    private Double fy5;

    public void setRowoddfill(GradientKey[] keys22, Double cx5, Double cy5, Rect mode17, Double opacity17, Double fx5, Double fy5) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        this.keys22 = null;
        this.keys23 = null;
        
        this.keys22 = keys22;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        
        this.cx5 = cx5;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        
        this.cy5 = cy5;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        this.mode17 = null;
        
        this.mode17 = mode17;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        this.opacity17 = null;
        
        this.opacity17 = opacity17;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        
        this.fx5 = fx5;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        
        this.fy5 = fy5;
    }


    public void setRowoddfill(String[] keys23, Double cx5, Double cy5, Rect mode17, Double opacity17, Double fx5, Double fy5) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        this.keys22 = null;
        this.keys23 = null;
        
        this.keys23 = keys23;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        
        this.cx5 = cx5;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        
        this.cy5 = cy5;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        this.mode17 = null;
        
        this.mode17 = mode17;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        this.opacity17 = null;
        
        this.opacity17 = opacity17;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        
        this.fx5 = fx5;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        
        this.fy5 = fy5;
    }

    private Fill imageSettings5;
    private Fill rowSelectedFill;

    public void setRowselectedfill(Fill rowSelectedFill) {
        this.rowSelectedFill = rowSelectedFill;
    }

    private String color6;
    private Double opacity18;

    public void setRowselectedfill(String color6, Double opacity18) {
        this.color = null;
        this.color1 = null;
        this.color2 = null;
        this.color3 = null;
        this.color4 = null;
        this.color5 = null;
        this.color6 = null;
        
        this.color6 = color6;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        this.opacity17 = null;
        this.opacity18 = null;
        
        this.opacity18 = opacity18;
    }

    private GradientKey[] keys24;
    private String[] keys25;
    private Double angle6;
    private Boolean mode18;
    private Rect mode19;

    public void setRowselectedfill(GradientKey[] keys24, Boolean mode18, Double angle6) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        this.keys22 = null;
        this.keys23 = null;
        this.keys24 = null;
        this.keys25 = null;
        
        this.keys24 = keys24;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        this.mode17 = null;
        this.mode18 = null;
        this.mode19 = null;
        
        this.mode18 = mode18;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        
        this.angle6 = angle6;
    }


    public void setRowselectedfill(GradientKey[] keys24, Rect mode19, Double angle6) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        this.keys22 = null;
        this.keys23 = null;
        this.keys24 = null;
        this.keys25 = null;
        
        this.keys24 = keys24;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        this.mode17 = null;
        this.mode18 = null;
        this.mode19 = null;
        
        this.mode19 = mode19;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        
        this.angle6 = angle6;
    }


    public void setRowselectedfill(String[] keys25, Boolean mode18, Double angle6) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        this.keys22 = null;
        this.keys23 = null;
        this.keys24 = null;
        this.keys25 = null;
        
        this.keys25 = keys25;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        this.mode17 = null;
        this.mode18 = null;
        this.mode19 = null;
        
        this.mode18 = mode18;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        
        this.angle6 = angle6;
    }


    public void setRowselectedfill(String[] keys25, Rect mode19, Double angle6) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        this.keys22 = null;
        this.keys23 = null;
        this.keys24 = null;
        this.keys25 = null;
        
        this.keys25 = keys25;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        this.mode17 = null;
        this.mode18 = null;
        this.mode19 = null;
        
        this.mode19 = mode19;
        this.angle = null;
        this.angle1 = null;
        this.angle2 = null;
        this.angle3 = null;
        this.angle4 = null;
        this.angle5 = null;
        this.angle6 = null;
        
        this.angle6 = angle6;
    }

    private GradientKey[] keys26;
    private String[] keys27;
    private Double cx6;
    private Double cy6;
    private Rect mode20;
    private Double opacity19;
    private Double fx6;
    private Double fy6;

    public void setRowselectedfill(GradientKey[] keys26, Double cx6, Double cy6, Rect mode20, Double opacity19, Double fx6, Double fy6) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        this.keys22 = null;
        this.keys23 = null;
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        
        this.keys26 = keys26;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        
        this.cx6 = cx6;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        
        this.cy6 = cy6;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        this.mode17 = null;
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        
        this.mode20 = mode20;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        this.opacity17 = null;
        this.opacity18 = null;
        this.opacity19 = null;
        
        this.opacity19 = opacity19;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        
        this.fx6 = fx6;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        
        this.fy6 = fy6;
    }


    public void setRowselectedfill(String[] keys27, Double cx6, Double cy6, Rect mode20, Double opacity19, Double fx6, Double fy6) {
        this.keys = null;
        this.keys1 = null;
        this.keys2 = null;
        this.keys3 = null;
        this.keys4 = null;
        this.keys5 = null;
        this.keys6 = null;
        this.keys7 = null;
        this.keys8 = null;
        this.keys9 = null;
        this.keys10 = null;
        this.keys11 = null;
        this.keys12 = null;
        this.keys13 = null;
        this.keys14 = null;
        this.keys15 = null;
        this.keys16 = null;
        this.keys17 = null;
        this.keys18 = null;
        this.keys19 = null;
        this.keys20 = null;
        this.keys21 = null;
        this.keys22 = null;
        this.keys23 = null;
        this.keys24 = null;
        this.keys25 = null;
        this.keys26 = null;
        this.keys27 = null;
        
        this.keys27 = keys27;
        this.cx = null;
        this.cx1 = null;
        this.cx2 = null;
        this.cx3 = null;
        this.cx4 = null;
        this.cx5 = null;
        this.cx6 = null;
        
        this.cx6 = cx6;
        this.cy = null;
        this.cy1 = null;
        this.cy2 = null;
        this.cy3 = null;
        this.cy4 = null;
        this.cy5 = null;
        this.cy6 = null;
        
        this.cy6 = cy6;
        this.mode = null;
        this.mode1 = null;
        this.mode2 = null;
        this.mode3 = null;
        this.mode4 = null;
        this.mode5 = null;
        this.mode6 = null;
        this.mode7 = null;
        this.mode8 = null;
        this.mode9 = null;
        this.mode10 = null;
        this.mode11 = null;
        this.mode12 = null;
        this.mode13 = null;
        this.mode14 = null;
        this.mode15 = null;
        this.mode16 = null;
        this.mode17 = null;
        this.mode18 = null;
        this.mode19 = null;
        this.mode20 = null;
        
        this.mode20 = mode20;
        this.opacity = null;
        this.opacity1 = null;
        this.opacity2 = null;
        this.opacity3 = null;
        this.opacity4 = null;
        this.opacity5 = null;
        this.opacity6 = null;
        this.opacity7 = null;
        this.opacity8 = null;
        this.opacity9 = null;
        this.opacity10 = null;
        this.opacity11 = null;
        this.opacity12 = null;
        this.opacity13 = null;
        this.opacity14 = null;
        this.opacity15 = null;
        this.opacity16 = null;
        this.opacity17 = null;
        this.opacity18 = null;
        this.opacity19 = null;
        
        this.opacity19 = opacity19;
        this.fx = null;
        this.fx1 = null;
        this.fx2 = null;
        this.fx3 = null;
        this.fx4 = null;
        this.fx5 = null;
        this.fx6 = null;
        
        this.fx6 = fx6;
        this.fy = null;
        this.fy1 = null;
        this.fy2 = null;
        this.fy3 = null;
        this.fy4 = null;
        this.fy5 = null;
        this.fy6 = null;
        
        this.fy6 = fy6;
    }

    private Fill imageSettings6;
    private Stroke rowStroke;
    private String rowStroke1;

    public void setRowstroke(Stroke rowStroke) {
        this.rowStroke = null;
        this.rowStroke1 = null;
        
        this.rowStroke = rowStroke;
    }


    public void setRowstroke(String rowStroke1) {
        this.rowStroke = null;
        this.rowStroke1 = null;
        
        this.rowStroke1 = rowStroke1;
    }

    private Double startIndex;

    public void setStartindex(Double startIndex) {
        this.startIndex = startIndex;
    }

    private Boolean tooltip;

    public void setTooltip(Boolean tooltip) {
        this.tooltip = tooltip;
    }

    private Double top1;
    private String top2;

    public void setTop(Double top1) {
        this.top = null;
        this.top1 = null;
        this.top2 = null;
        
        this.top1 = top1;
    }


    public void setTop(String top2) {
        this.top = null;
        this.top1 = null;
        this.top2 = null;
        
        this.top2 = top2;
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

    private Double verticalOffset;

    public void setVerticaloffset(Double verticalOffset) {
        this.verticalOffset = verticalOffset;
    }

    private Double width3;
    private String width4;

    public void setWidth(Double width3) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        
        this.width3 = width3;
    }


    public void setWidth(String width4) {
        this.width = null;
        this.width1 = null;
        this.width2 = null;
        this.width3 = null;
        this.width4 = null;
        
        this.width4 = width4;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
    }

    private String generateJSbackgroundFill() {
        if (backgroundFill != null) {
            return String.format(Locale.US, "backgroundFill: %s,", (backgroundFill != null) ? backgroundFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: \"%s\",", color);
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

    private String generateJSbottom() {
        if (bottom != null) {
            return String.format(Locale.US, "bottom: %f,", bottom);
        }
        return "";
    }

    private String generateJSbottom1() {
        if (bottom1 != null) {
            return String.format(Locale.US, "bottom: \"%s\",", bottom1);
        }
        return "";
    }

    private String generateJSbounds() {
        if (bounds != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds != null) ? bounds.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbounds1() {
        if (bounds1 != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds1 != null) ? bounds1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbounds2() {
        if (bounds2 != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds2 != null) ? bounds2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSx() {
        if (x != null) {
            return String.format(Locale.US, "x: %f,", x);
        }
        return "";
    }

    private String generateJSx1() {
        if (x1 != null) {
            return String.format(Locale.US, "x: \"%s\",", x1);
        }
        return "";
    }

    private String generateJSy() {
        if (y != null) {
            return String.format(Locale.US, "y: %f,", y);
        }
        return "";
    }

    private String generateJSy1() {
        if (y1 != null) {
            return String.format(Locale.US, "y: \"%s\",", y1);
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
            return String.format(Locale.US, "width: \"%s\",", width1);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: \"%s\",", height1);
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJScolumn() {
        if (column != null) {
            return String.format(Locale.US, "column: %s,", (column != null) ? column.generateJs() : "null");
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJScolumn1() {
        if (column1 != null) {
            return String.format(Locale.US, "column: %s,", (column1 != null) ? column1.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolumnStroke() {
        if (columnStroke != null) {
            return String.format(Locale.US, "columnStroke: %s,", (columnStroke != null) ? columnStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolumnStroke1() {
        if (columnStroke1 != null) {
            return String.format(Locale.US, "columnStroke: \"%s\",", columnStroke1);
        }
        return "";
    }

    private String generateJScontainer() {
        if (container != null) {
            return String.format(Locale.US, "container: \"%s\",", container);
        }
        return "";
    }

    private String generateJScontainer1() {
        if (container1 != null) {
            return String.format(Locale.US, "container: %s,", (container1 != null) ? container1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata() {
        if (data != null) {
            return String.format(Locale.US, "data: %s,", (data != null) ? data.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdefaultRowHeight() {
        if (defaultRowHeight != null) {
            return String.format(Locale.US, "defaultRowHeight: %f,", defaultRowHeight);
        }
        return "";
    }

    private String generateJSeditStructurePreviewDashStroke() {
        if (editStructurePreviewDashStroke != null) {
            return String.format(Locale.US, "editStructurePreviewDashStroke: %s,", (editStructurePreviewDashStroke != null) ? editStructurePreviewDashStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditStructurePreviewDashStroke1() {
        if (editStructurePreviewDashStroke1 != null) {
            return String.format(Locale.US, "editStructurePreviewDashStroke: \"%s\",", editStructurePreviewDashStroke1);
        }
        return "";
    }

    private String generateJSeditStructurePreviewFill() {
        if (editStructurePreviewFill != null) {
            return String.format(Locale.US, "editStructurePreviewFill: %s,", (editStructurePreviewFill != null) ? editStructurePreviewFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: \"%s\",", color1);
        }
        return "";
    }

    private String generateJSopacity3() {
        if (opacity3 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity3);
        }
        return "";
    }

    private String generateJSkeys4() {
        if (keys4 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys4));
        }
        return "";
    }

    private String generateJSkeys5() {
        if (keys5 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys5));
        }
        return "";
    }

    private String generateJSangle1() {
        if (angle1 != null) {
            return String.format(Locale.US, "angle: %f,", angle1);
        }
        return "";
    }

    private String generateJSmode3() {
        if (mode3 != null) {
            return String.format(Locale.US, "mode: %b,", mode3);
        }
        return "";
    }

    private String generateJSmode4() {
        if (mode4 != null) {
            return String.format(Locale.US, "mode: %s,", (mode4 != null) ? mode4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity4() {
        if (opacity4 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity4);
        }
        return "";
    }

    private String generateJSkeys6() {
        if (keys6 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys6));
        }
        return "";
    }

    private String generateJSkeys7() {
        if (keys7 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys7));
        }
        return "";
    }

    private String generateJScx1() {
        if (cx1 != null) {
            return String.format(Locale.US, "cx: %f,", cx1);
        }
        return "";
    }

    private String generateJScy1() {
        if (cy1 != null) {
            return String.format(Locale.US, "cy: %f,", cy1);
        }
        return "";
    }

    private String generateJSmode5() {
        if (mode5 != null) {
            return String.format(Locale.US, "mode: %s,", (mode5 != null) ? mode5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity5() {
        if (opacity5 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity5);
        }
        return "";
    }

    private String generateJSfx1() {
        if (fx1 != null) {
            return String.format(Locale.US, "fx: %f,", fx1);
        }
        return "";
    }

    private String generateJSfy1() {
        if (fy1 != null) {
            return String.format(Locale.US, "fy: %f,", fy1);
        }
        return "";
    }

    private String generateJSimageSettings1() {
        if (imageSettings1 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings1 != null) ? imageSettings1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditStructurePreviewStroke() {
        if (editStructurePreviewStroke != null) {
            return String.format(Locale.US, "editStructurePreviewStroke: %s,", (editStructurePreviewStroke != null) ? editStructurePreviewStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSeditStructurePreviewStroke1() {
        if (editStructurePreviewStroke1 != null) {
            return String.format(Locale.US, "editStructurePreviewStroke: \"%s\",", editStructurePreviewStroke1);
        }
        return "";
    }

    private String generateJSediting() {
        if (editing != null) {
            return String.format(Locale.US, "editing: %b,", editing);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSendIndex() {
        if (endIndex != null) {
            return String.format(Locale.US, "endIndex: %f,", endIndex);
        }
        return "";
    }

    private String generateJSheaderHeight() {
        if (headerHeight != null) {
            return String.format(Locale.US, "headerHeight: %f,", headerHeight);
        }
        return "";
    }

    private String generateJSheight2() {
        if (height2 != null) {
            return String.format(Locale.US, "height: %f,", height2);
        }
        return "";
    }

    private String generateJSheight3() {
        if (height3 != null) {
            return String.format(Locale.US, "height: \"%s\",", height3);
        }
        return "";
    }

    private String generateJShorizontalOffset() {
        if (horizontalOffset != null) {
            return String.format(Locale.US, "horizontalOffset: %f,", horizontalOffset);
        }
        return "";
    }

    private String generateJSleft() {
        if (left != null) {
            return String.format(Locale.US, "left: %f,", left);
        }
        return "";
    }

    private String generateJSleft1() {
        if (left1 != null) {
            return String.format(Locale.US, "left: \"%s\",", left1);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: \"%s\",", type);
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
            return String.format(Locale.US, "type: \"%s\",", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSmaxHeight() {
        if (maxHeight != null) {
            return String.format(Locale.US, "maxHeight: %f,", maxHeight);
        }
        return "";
    }

    private String generateJSmaxHeight1() {
        if (maxHeight1 != null) {
            return String.format(Locale.US, "maxHeight: \"%s\",", maxHeight1);
        }
        return "";
    }

    private String generateJSmaxWidth() {
        if (maxWidth != null) {
            return String.format(Locale.US, "maxWidth: %f,", maxWidth);
        }
        return "";
    }

    private String generateJSmaxWidth1() {
        if (maxWidth1 != null) {
            return String.format(Locale.US, "maxWidth: \"%s\",", maxWidth1);
        }
        return "";
    }

    private String generateJSminHeight() {
        if (minHeight != null) {
            return String.format(Locale.US, "minHeight: %f,", minHeight);
        }
        return "";
    }

    private String generateJSminHeight1() {
        if (minHeight1 != null) {
            return String.format(Locale.US, "minHeight: \"%s\",", minHeight1);
        }
        return "";
    }

    private String generateJSminWidth() {
        if (minWidth != null) {
            return String.format(Locale.US, "minWidth: %f,", minWidth);
        }
        return "";
    }

    private String generateJSminWidth1() {
        if (minWidth1 != null) {
            return String.format(Locale.US, "minWidth: \"%s\",", minWidth1);
        }
        return "";
    }

    private String generateJSparentBounds() {
        if (parentBounds != null) {
            return String.format(Locale.US, "parentBounds: %s,", (parentBounds != null) ? parentBounds.generateJs() : "null");
        }
        return "";
    }

    private String generateJSleft2() {
        if (left2 != null) {
            return String.format(Locale.US, "left: %f,", left2);
        }
        return "";
    }

    private String generateJStop() {
        if (top != null) {
            return String.format(Locale.US, "top: %f,", top);
        }
        return "";
    }

    private String generateJSwidth2() {
        if (width2 != null) {
            return String.format(Locale.US, "width: %f,", width2);
        }
        return "";
    }

    private String generateJSheight4() {
        if (height4 != null) {
            return String.format(Locale.US, "height: %f,", height4);
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

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: \"%s\",", type2);
        }
        return "";
    }

    private String generateJSright() {
        if (right != null) {
            return String.format(Locale.US, "right: %f,", right);
        }
        return "";
    }

    private String generateJSright1() {
        if (right1 != null) {
            return String.format(Locale.US, "right: \"%s\",", right1);
        }
        return "";
    }

    private String generateJSrowEvenFill() {
        if (rowEvenFill != null) {
            return String.format(Locale.US, "rowEvenFill: %s,", (rowEvenFill != null) ? rowEvenFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: \"%s\",", color2);
        }
        return "";
    }

    private String generateJSopacity6() {
        if (opacity6 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity6);
        }
        return "";
    }

    private String generateJSkeys8() {
        if (keys8 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys8));
        }
        return "";
    }

    private String generateJSkeys9() {
        if (keys9 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys9));
        }
        return "";
    }

    private String generateJSangle2() {
        if (angle2 != null) {
            return String.format(Locale.US, "angle: %f,", angle2);
        }
        return "";
    }

    private String generateJSmode6() {
        if (mode6 != null) {
            return String.format(Locale.US, "mode: %b,", mode6);
        }
        return "";
    }

    private String generateJSmode7() {
        if (mode7 != null) {
            return String.format(Locale.US, "mode: %s,", (mode7 != null) ? mode7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity7() {
        if (opacity7 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity7);
        }
        return "";
    }

    private String generateJSkeys10() {
        if (keys10 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys10));
        }
        return "";
    }

    private String generateJSkeys11() {
        if (keys11 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys11));
        }
        return "";
    }

    private String generateJScx2() {
        if (cx2 != null) {
            return String.format(Locale.US, "cx: %f,", cx2);
        }
        return "";
    }

    private String generateJScy2() {
        if (cy2 != null) {
            return String.format(Locale.US, "cy: %f,", cy2);
        }
        return "";
    }

    private String generateJSmode8() {
        if (mode8 != null) {
            return String.format(Locale.US, "mode: %s,", (mode8 != null) ? mode8.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity8() {
        if (opacity8 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity8);
        }
        return "";
    }

    private String generateJSfx2() {
        if (fx2 != null) {
            return String.format(Locale.US, "fx: %f,", fx2);
        }
        return "";
    }

    private String generateJSfy2() {
        if (fy2 != null) {
            return String.format(Locale.US, "fy: %f,", fy2);
        }
        return "";
    }

    private String generateJSimageSettings2() {
        if (imageSettings2 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings2 != null) ? imageSettings2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrowFill() {
        if (rowFill != null) {
            return String.format(Locale.US, "rowFill: %s,", (rowFill != null) ? rowFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: \"%s\",", color3);
        }
        return "";
    }

    private String generateJSopacity9() {
        if (opacity9 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity9);
        }
        return "";
    }

    private String generateJSkeys12() {
        if (keys12 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys12));
        }
        return "";
    }

    private String generateJSkeys13() {
        if (keys13 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys13));
        }
        return "";
    }

    private String generateJSangle3() {
        if (angle3 != null) {
            return String.format(Locale.US, "angle: %f,", angle3);
        }
        return "";
    }

    private String generateJSmode9() {
        if (mode9 != null) {
            return String.format(Locale.US, "mode: %b,", mode9);
        }
        return "";
    }

    private String generateJSmode10() {
        if (mode10 != null) {
            return String.format(Locale.US, "mode: %s,", (mode10 != null) ? mode10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity10() {
        if (opacity10 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity10);
        }
        return "";
    }

    private String generateJSkeys14() {
        if (keys14 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys14));
        }
        return "";
    }

    private String generateJSkeys15() {
        if (keys15 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys15));
        }
        return "";
    }

    private String generateJScx3() {
        if (cx3 != null) {
            return String.format(Locale.US, "cx: %f,", cx3);
        }
        return "";
    }

    private String generateJScy3() {
        if (cy3 != null) {
            return String.format(Locale.US, "cy: %f,", cy3);
        }
        return "";
    }

    private String generateJSmode11() {
        if (mode11 != null) {
            return String.format(Locale.US, "mode: %s,", (mode11 != null) ? mode11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity11() {
        if (opacity11 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity11);
        }
        return "";
    }

    private String generateJSfx3() {
        if (fx3 != null) {
            return String.format(Locale.US, "fx: %f,", fx3);
        }
        return "";
    }

    private String generateJSfy3() {
        if (fy3 != null) {
            return String.format(Locale.US, "fy: %f,", fy3);
        }
        return "";
    }

    private String generateJSimageSettings3() {
        if (imageSettings3 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings3 != null) ? imageSettings3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrowHoverFill() {
        if (rowHoverFill != null) {
            return String.format(Locale.US, "rowHoverFill: %s,", (rowHoverFill != null) ? rowHoverFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: \"%s\",", color4);
        }
        return "";
    }

    private String generateJSopacity12() {
        if (opacity12 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity12);
        }
        return "";
    }

    private String generateJSkeys16() {
        if (keys16 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys16));
        }
        return "";
    }

    private String generateJSkeys17() {
        if (keys17 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys17));
        }
        return "";
    }

    private String generateJSangle4() {
        if (angle4 != null) {
            return String.format(Locale.US, "angle: %f,", angle4);
        }
        return "";
    }

    private String generateJSmode12() {
        if (mode12 != null) {
            return String.format(Locale.US, "mode: %b,", mode12);
        }
        return "";
    }

    private String generateJSmode13() {
        if (mode13 != null) {
            return String.format(Locale.US, "mode: %s,", (mode13 != null) ? mode13.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity13() {
        if (opacity13 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity13);
        }
        return "";
    }

    private String generateJSkeys18() {
        if (keys18 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys18));
        }
        return "";
    }

    private String generateJSkeys19() {
        if (keys19 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys19));
        }
        return "";
    }

    private String generateJScx4() {
        if (cx4 != null) {
            return String.format(Locale.US, "cx: %f,", cx4);
        }
        return "";
    }

    private String generateJScy4() {
        if (cy4 != null) {
            return String.format(Locale.US, "cy: %f,", cy4);
        }
        return "";
    }

    private String generateJSmode14() {
        if (mode14 != null) {
            return String.format(Locale.US, "mode: %s,", (mode14 != null) ? mode14.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity14() {
        if (opacity14 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity14);
        }
        return "";
    }

    private String generateJSfx4() {
        if (fx4 != null) {
            return String.format(Locale.US, "fx: %f,", fx4);
        }
        return "";
    }

    private String generateJSfy4() {
        if (fy4 != null) {
            return String.format(Locale.US, "fy: %f,", fy4);
        }
        return "";
    }

    private String generateJSimageSettings4() {
        if (imageSettings4 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings4 != null) ? imageSettings4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrowOddFill() {
        if (rowOddFill != null) {
            return String.format(Locale.US, "rowOddFill: %s,", (rowOddFill != null) ? rowOddFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor5() {
        if (color5 != null) {
            return String.format(Locale.US, "color: \"%s\",", color5);
        }
        return "";
    }

    private String generateJSopacity15() {
        if (opacity15 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity15);
        }
        return "";
    }

    private String generateJSkeys20() {
        if (keys20 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys20));
        }
        return "";
    }

    private String generateJSkeys21() {
        if (keys21 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys21));
        }
        return "";
    }

    private String generateJSangle5() {
        if (angle5 != null) {
            return String.format(Locale.US, "angle: %f,", angle5);
        }
        return "";
    }

    private String generateJSmode15() {
        if (mode15 != null) {
            return String.format(Locale.US, "mode: %b,", mode15);
        }
        return "";
    }

    private String generateJSmode16() {
        if (mode16 != null) {
            return String.format(Locale.US, "mode: %s,", (mode16 != null) ? mode16.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity16() {
        if (opacity16 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity16);
        }
        return "";
    }

    private String generateJSkeys22() {
        if (keys22 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys22));
        }
        return "";
    }

    private String generateJSkeys23() {
        if (keys23 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys23));
        }
        return "";
    }

    private String generateJScx5() {
        if (cx5 != null) {
            return String.format(Locale.US, "cx: %f,", cx5);
        }
        return "";
    }

    private String generateJScy5() {
        if (cy5 != null) {
            return String.format(Locale.US, "cy: %f,", cy5);
        }
        return "";
    }

    private String generateJSmode17() {
        if (mode17 != null) {
            return String.format(Locale.US, "mode: %s,", (mode17 != null) ? mode17.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity17() {
        if (opacity17 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity17);
        }
        return "";
    }

    private String generateJSfx5() {
        if (fx5 != null) {
            return String.format(Locale.US, "fx: %f,", fx5);
        }
        return "";
    }

    private String generateJSfy5() {
        if (fy5 != null) {
            return String.format(Locale.US, "fy: %f,", fy5);
        }
        return "";
    }

    private String generateJSimageSettings5() {
        if (imageSettings5 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings5 != null) ? imageSettings5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrowSelectedFill() {
        if (rowSelectedFill != null) {
            return String.format(Locale.US, "rowSelectedFill: %s,", (rowSelectedFill != null) ? rowSelectedFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor6() {
        if (color6 != null) {
            return String.format(Locale.US, "color: \"%s\",", color6);
        }
        return "";
    }

    private String generateJSopacity18() {
        if (opacity18 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity18);
        }
        return "";
    }

    private String generateJSkeys24() {
        if (keys24 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys24));
        }
        return "";
    }

    private String generateJSkeys25() {
        if (keys25 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys25));
        }
        return "";
    }

    private String generateJSangle6() {
        if (angle6 != null) {
            return String.format(Locale.US, "angle: %f,", angle6);
        }
        return "";
    }

    private String generateJSmode18() {
        if (mode18 != null) {
            return String.format(Locale.US, "mode: %b,", mode18);
        }
        return "";
    }

    private String generateJSmode19() {
        if (mode19 != null) {
            return String.format(Locale.US, "mode: %s,", (mode19 != null) ? mode19.generateJs() : "null");
        }
        return "";
    }

    private String generateJSkeys26() {
        if (keys26 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys26));
        }
        return "";
    }

    private String generateJSkeys27() {
        if (keys27 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys27));
        }
        return "";
    }

    private String generateJScx6() {
        if (cx6 != null) {
            return String.format(Locale.US, "cx: %f,", cx6);
        }
        return "";
    }

    private String generateJScy6() {
        if (cy6 != null) {
            return String.format(Locale.US, "cy: %f,", cy6);
        }
        return "";
    }

    private String generateJSmode20() {
        if (mode20 != null) {
            return String.format(Locale.US, "mode: %s,", (mode20 != null) ? mode20.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity19() {
        if (opacity19 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity19);
        }
        return "";
    }

    private String generateJSfx6() {
        if (fx6 != null) {
            return String.format(Locale.US, "fx: %f,", fx6);
        }
        return "";
    }

    private String generateJSfy6() {
        if (fy6 != null) {
            return String.format(Locale.US, "fy: %f,", fy6);
        }
        return "";
    }

    private String generateJSimageSettings6() {
        if (imageSettings6 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings6 != null) ? imageSettings6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrowStroke() {
        if (rowStroke != null) {
            return String.format(Locale.US, "rowStroke: %s,", (rowStroke != null) ? rowStroke.generateJs() : "null");
        }
        return "";
    }

    private String generateJSrowStroke1() {
        if (rowStroke1 != null) {
            return String.format(Locale.US, "rowStroke: \"%s\",", rowStroke1);
        }
        return "";
    }

    private String generateJSstartIndex() {
        if (startIndex != null) {
            return String.format(Locale.US, "startIndex: %f,", startIndex);
        }
        return "";
    }

    private String generateJStooltip() {
        if (tooltip != null) {
            return String.format(Locale.US, "tooltip: %b,", tooltip);
        }
        return "";
    }

    private String generateJStop1() {
        if (top1 != null) {
            return String.format(Locale.US, "top: %f,", top1);
        }
        return "";
    }

    private String generateJStop2() {
        if (top2 != null) {
            return String.format(Locale.US, "top: \"%s\",", top2);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: \"%s\",", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSverticalOffset() {
        if (verticalOffset != null) {
            return String.format(Locale.US, "verticalOffset: %f,", verticalOffset);
        }
        return "";
    }

    private String generateJSwidth3() {
        if (width3 != null) {
            return String.format(Locale.US, "width: %f,", width3);
        }
        return "";
    }

    private String generateJSwidth4() {
        if (width4 != null) {
            return String.format(Locale.US, "width: \"%s\",", width4);
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
        js.append(generateJSbackgroundFill());
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
        js.append(generateJSbottom());
        js.append(generateJSbottom1());
        js.append(generateJSbounds());
        js.append(generateJSbounds1());
        js.append(generateJSbounds2());
        js.append(generateJSx());
        js.append(generateJSx1());
        js.append(generateJSy());
        js.append(generateJSy1());
        js.append(generateJSwidth());
        js.append(generateJSwidth1());
        js.append(generateJSheight());
        js.append(generateJSheight1());
        js.append(generateJSindex());
        js.append(generateJScolumn());
        js.append(generateJSindex1());
        js.append(generateJScolumn1());
        js.append(generateJScolumnStroke());
        js.append(generateJScolumnStroke1());
        js.append(generateJScontainer());
        js.append(generateJScontainer1());
        js.append(generateJSdata());
        js.append(generateJSdefaultRowHeight());
        js.append(generateJSeditStructurePreviewDashStroke());
        js.append(generateJSeditStructurePreviewDashStroke1());
        js.append(generateJSeditStructurePreviewFill());
        js.append(generateJScolor1());
        js.append(generateJSopacity3());
        js.append(generateJSkeys4());
        js.append(generateJSkeys5());
        js.append(generateJSangle1());
        js.append(generateJSmode3());
        js.append(generateJSmode4());
        js.append(generateJSopacity4());
        js.append(generateJSkeys6());
        js.append(generateJSkeys7());
        js.append(generateJScx1());
        js.append(generateJScy1());
        js.append(generateJSmode5());
        js.append(generateJSopacity5());
        js.append(generateJSfx1());
        js.append(generateJSfy1());
        js.append(generateJSimageSettings1());
        js.append(generateJSeditStructurePreviewStroke());
        js.append(generateJSeditStructurePreviewStroke1());
        js.append(generateJSediting());
        js.append(generateJSenabled());
        js.append(generateJSendIndex());
        js.append(generateJSheaderHeight());
        js.append(generateJSheight2());
        js.append(generateJSheight3());
        js.append(generateJShorizontalOffset());
        js.append(generateJSleft());
        js.append(generateJSleft1());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSmaxHeight());
        js.append(generateJSmaxHeight1());
        js.append(generateJSmaxWidth());
        js.append(generateJSmaxWidth1());
        js.append(generateJSminHeight());
        js.append(generateJSminHeight1());
        js.append(generateJSminWidth());
        js.append(generateJSminWidth1());
        js.append(generateJSparentBounds());
        js.append(generateJSleft2());
        js.append(generateJStop());
        js.append(generateJSwidth2());
        js.append(generateJSheight4());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJStype2());
        js.append(generateJSright());
        js.append(generateJSright1());
        js.append(generateJSrowEvenFill());
        js.append(generateJScolor2());
        js.append(generateJSopacity6());
        js.append(generateJSkeys8());
        js.append(generateJSkeys9());
        js.append(generateJSangle2());
        js.append(generateJSmode6());
        js.append(generateJSmode7());
        js.append(generateJSopacity7());
        js.append(generateJSkeys10());
        js.append(generateJSkeys11());
        js.append(generateJScx2());
        js.append(generateJScy2());
        js.append(generateJSmode8());
        js.append(generateJSopacity8());
        js.append(generateJSfx2());
        js.append(generateJSfy2());
        js.append(generateJSimageSettings2());
        js.append(generateJSrowFill());
        js.append(generateJScolor3());
        js.append(generateJSopacity9());
        js.append(generateJSkeys12());
        js.append(generateJSkeys13());
        js.append(generateJSangle3());
        js.append(generateJSmode9());
        js.append(generateJSmode10());
        js.append(generateJSopacity10());
        js.append(generateJSkeys14());
        js.append(generateJSkeys15());
        js.append(generateJScx3());
        js.append(generateJScy3());
        js.append(generateJSmode11());
        js.append(generateJSopacity11());
        js.append(generateJSfx3());
        js.append(generateJSfy3());
        js.append(generateJSimageSettings3());
        js.append(generateJSrowHoverFill());
        js.append(generateJScolor4());
        js.append(generateJSopacity12());
        js.append(generateJSkeys16());
        js.append(generateJSkeys17());
        js.append(generateJSangle4());
        js.append(generateJSmode12());
        js.append(generateJSmode13());
        js.append(generateJSopacity13());
        js.append(generateJSkeys18());
        js.append(generateJSkeys19());
        js.append(generateJScx4());
        js.append(generateJScy4());
        js.append(generateJSmode14());
        js.append(generateJSopacity14());
        js.append(generateJSfx4());
        js.append(generateJSfy4());
        js.append(generateJSimageSettings4());
        js.append(generateJSrowOddFill());
        js.append(generateJScolor5());
        js.append(generateJSopacity15());
        js.append(generateJSkeys20());
        js.append(generateJSkeys21());
        js.append(generateJSangle5());
        js.append(generateJSmode15());
        js.append(generateJSmode16());
        js.append(generateJSopacity16());
        js.append(generateJSkeys22());
        js.append(generateJSkeys23());
        js.append(generateJScx5());
        js.append(generateJScy5());
        js.append(generateJSmode17());
        js.append(generateJSopacity17());
        js.append(generateJSfx5());
        js.append(generateJSfy5());
        js.append(generateJSimageSettings5());
        js.append(generateJSrowSelectedFill());
        js.append(generateJScolor6());
        js.append(generateJSopacity18());
        js.append(generateJSkeys24());
        js.append(generateJSkeys25());
        js.append(generateJSangle6());
        js.append(generateJSmode18());
        js.append(generateJSmode19());
        js.append(generateJSkeys26());
        js.append(generateJSkeys27());
        js.append(generateJScx6());
        js.append(generateJScy6());
        js.append(generateJSmode20());
        js.append(generateJSopacity19());
        js.append(generateJSfx6());
        js.append(generateJSfy6());
        js.append(generateJSimageSettings6());
        js.append(generateJSrowStroke());
        js.append(generateJSrowStroke1());
        js.append(generateJSstartIndex());
        js.append(generateJStooltip());
        js.append(generateJStop1());
        js.append(generateJStop2());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSverticalOffset());
        js.append(generateJSwidth3());
        js.append(generateJSwidth4());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}