package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Paginator extends JsObject {

    
    private String background;
    private Boolean background1;

    public void setBackground(String background) {
        this.background = null;
        this.background1 = null;
        
        this.background = background;
    }


    public void setBackground(Boolean background1) {
        this.background = null;
        this.background1 = null;
        
        this.background1 = background1;
    }

    private Double currentPage;
    private String currentPage1;

    public void setCurrentpage(Double currentPage) {
        this.currentPage = null;
        this.currentPage1 = null;
        
        this.currentPage = currentPage;
    }


    public void setCurrentpage(String currentPage1) {
        this.currentPage = null;
        this.currentPage1 = null;
        
        this.currentPage1 = currentPage1;
    }

    private Boolean disablePointerEvents;

    public void setDisablepointerevents(Boolean disablePointerEvents) {
        this.disablePointerEvents = disablePointerEvents;
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    private String fontColor;

    public void setFontcolor(String fontColor) {
        this.fontColor = fontColor;
    }

    private Decoration fontDecoration;
    private String fontDecoration1;

    public void setFontdecoration(Decoration fontDecoration) {
        this.fontDecoration = null;
        this.fontDecoration1 = null;
        
        this.fontDecoration = fontDecoration;
    }


    public void setFontdecoration(String fontDecoration1) {
        this.fontDecoration = null;
        this.fontDecoration1 = null;
        
        this.fontDecoration1 = fontDecoration1;
    }

    private String fontFamily;

    public void setFontfamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    private Double fontOpacity;

    public void setFontopacity(Double fontOpacity) {
        this.fontOpacity = fontOpacity;
    }

    private String fontSize;
    private Double fontSize1;

    public void setFontsize(String fontSize) {
        this.fontSize = null;
        this.fontSize1 = null;
        
        this.fontSize = fontSize;
    }


    public void setFontsize(Double fontSize1) {
        this.fontSize = null;
        this.fontSize1 = null;
        
        this.fontSize1 = fontSize1;
    }

    private FontStyle fontStyle;
    private String fontStyle1;

    public void setFontstyle(FontStyle fontStyle) {
        this.fontStyle = null;
        this.fontStyle1 = null;
        
        this.fontStyle = fontStyle;
    }


    public void setFontstyle(String fontStyle1) {
        this.fontStyle = null;
        this.fontStyle1 = null;
        
        this.fontStyle1 = fontStyle1;
    }

    private FontVariant fontVariant;
    private String fontVariant1;

    public void setFontvariant(FontVariant fontVariant) {
        this.fontVariant = null;
        this.fontVariant1 = null;
        
        this.fontVariant = fontVariant;
    }


    public void setFontvariant(String fontVariant1) {
        this.fontVariant = null;
        this.fontVariant1 = null;
        
        this.fontVariant1 = fontVariant1;
    }

    private String fontWeight;
    private Double fontWeight1;

    public void setFontweight(String fontWeight) {
        this.fontWeight = null;
        this.fontWeight1 = null;
        
        this.fontWeight = fontWeight;
    }


    public void setFontweight(Double fontWeight1) {
        this.fontWeight = null;
        this.fontWeight1 = null;
        
        this.fontWeight1 = fontWeight1;
    }

    private HAlign hAlign;
    private String hAlign1;

    public void setHalign(HAlign hAlign) {
        this.hAlign = null;
        this.hAlign1 = null;
        
        this.hAlign = hAlign;
    }


    public void setHalign(String hAlign1) {
        this.hAlign = null;
        this.hAlign1 = null;
        
        this.hAlign1 = hAlign1;
    }

    private String layout;
    private Layout layout1;

    public void setLayout(String layout) {
        this.layout = null;
        this.layout1 = null;
        
        this.layout = layout;
    }


    public void setLayout(Layout layout1) {
        this.layout = null;
        this.layout1 = null;
        
        this.layout1 = layout1;
    }

    private String letterSpacing;
    private Double letterSpacing1;

    public void setLetterspacing(String letterSpacing) {
        this.letterSpacing = null;
        this.letterSpacing1 = null;
        
        this.letterSpacing = letterSpacing;
    }


    public void setLetterspacing(Double letterSpacing1) {
        this.letterSpacing = null;
        this.letterSpacing1 = null;
        
        this.letterSpacing1 = letterSpacing1;
    }

    private String lineHeight;
    private Double lineHeight1;

    public void setLineheight(String lineHeight) {
        this.lineHeight = null;
        this.lineHeight1 = null;
        
        this.lineHeight = lineHeight;
    }


    public void setLineheight(Double lineHeight1) {
        this.lineHeight = null;
        this.lineHeight1 = null;
        
        this.lineHeight1 = lineHeight1;
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

    private String spaceOrTopOrTopAndBottom;
    private Double spaceOrTopOrTopAndBottom1;
    private Double[] spaceOrTopOrTopAndBottom2;
    private String[] spaceOrTopOrTopAndBottom3;
    private String rightOrRightAndLeft;
    private Double rightOrRightAndLeft1;
    private String bottom;
    private Double bottom1;
    private String left;
    private Double left1;

    public void setMargin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, String bottom, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Double bottom1, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, String rightOrRightAndLeft, Double bottom1, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, Double rightOrRightAndLeft1, String bottom, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, Double rightOrRightAndLeft1, String bottom, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, Double rightOrRightAndLeft1, Double bottom1, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(String spaceOrTopOrTopAndBottom, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom = spaceOrTopOrTopAndBottom;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, String rightOrRightAndLeft, String bottom, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, String rightOrRightAndLeft, String bottom, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, String rightOrRightAndLeft, Double bottom1, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, String rightOrRightAndLeft, Double bottom1, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, String bottom, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, String bottom, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, Double bottom1, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, String rightOrRightAndLeft, String bottom, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, String rightOrRightAndLeft, String bottom, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, String rightOrRightAndLeft, Double bottom1, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, String rightOrRightAndLeft, Double bottom1, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, Double rightOrRightAndLeft1, String bottom, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, Double rightOrRightAndLeft1, String bottom, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, Double rightOrRightAndLeft1, Double bottom1, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(Double[] spaceOrTopOrTopAndBottom2, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, String rightOrRightAndLeft, String bottom, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, String rightOrRightAndLeft, String bottom, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, String rightOrRightAndLeft, Double bottom1, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, String rightOrRightAndLeft, Double bottom1, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft = rightOrRightAndLeft;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, Double rightOrRightAndLeft1, String bottom, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, Double rightOrRightAndLeft1, String bottom, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom = bottom;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, Double rightOrRightAndLeft1, Double bottom1, String left) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left = left;
    }


    public void setMargin(String[] spaceOrTopOrTopAndBottom3, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        
        this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        
        this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
        this.bottom = null;
        this.bottom1 = null;
        
        this.bottom1 = bottom1;
        this.left = null;
        this.left1 = null;
        
        this.left1 = left1;
    }

    private Orientation orientation;
    private String orientation1;

    public void setOrientation(Orientation orientation) {
        this.orientation = null;
        this.orientation1 = null;
        
        this.orientation = orientation;
    }


    public void setOrientation(String orientation1) {
        this.orientation = null;
        this.orientation1 = null;
        
        this.orientation1 = orientation1;
    }

    private String spaceOrTopOrTopAndBottom4;
    private Double spaceOrTopOrTopAndBottom5;
    private Double[] spaceOrTopOrTopAndBottom6;
    private String[] spaceOrTopOrTopAndBottom7;
    private String rightOrRightAndLeft2;
    private Double rightOrRightAndLeft3;
    private String bottom2;
    private Double bottom3;
    private String left2;
    private Double left3;

    public void setPadding(String spaceOrTopOrTopAndBottom4, String rightOrRightAndLeft2, String bottom2, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom4 = spaceOrTopOrTopAndBottom4;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(String spaceOrTopOrTopAndBottom4, String rightOrRightAndLeft2, String bottom2, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom4 = spaceOrTopOrTopAndBottom4;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(String spaceOrTopOrTopAndBottom4, String rightOrRightAndLeft2, Double bottom3, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom4 = spaceOrTopOrTopAndBottom4;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(String spaceOrTopOrTopAndBottom4, String rightOrRightAndLeft2, Double bottom3, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom4 = spaceOrTopOrTopAndBottom4;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(String spaceOrTopOrTopAndBottom4, Double rightOrRightAndLeft3, String bottom2, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom4 = spaceOrTopOrTopAndBottom4;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(String spaceOrTopOrTopAndBottom4, Double rightOrRightAndLeft3, String bottom2, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom4 = spaceOrTopOrTopAndBottom4;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(String spaceOrTopOrTopAndBottom4, Double rightOrRightAndLeft3, Double bottom3, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom4 = spaceOrTopOrTopAndBottom4;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(String spaceOrTopOrTopAndBottom4, Double rightOrRightAndLeft3, Double bottom3, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom4 = spaceOrTopOrTopAndBottom4;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom5, String rightOrRightAndLeft2, String bottom2, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom5, String rightOrRightAndLeft2, String bottom2, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom5, String rightOrRightAndLeft2, Double bottom3, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom5, String rightOrRightAndLeft2, Double bottom3, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom5, Double rightOrRightAndLeft3, String bottom2, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom5, Double rightOrRightAndLeft3, String bottom2, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom5, Double rightOrRightAndLeft3, Double bottom3, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(Double spaceOrTopOrTopAndBottom5, Double rightOrRightAndLeft3, Double bottom3, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom5 = spaceOrTopOrTopAndBottom5;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom6, String rightOrRightAndLeft2, String bottom2, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom6, String rightOrRightAndLeft2, String bottom2, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom6, String rightOrRightAndLeft2, Double bottom3, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom6, String rightOrRightAndLeft2, Double bottom3, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom6, Double rightOrRightAndLeft3, String bottom2, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom6, Double rightOrRightAndLeft3, String bottom2, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom6, Double rightOrRightAndLeft3, Double bottom3, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(Double[] spaceOrTopOrTopAndBottom6, Double rightOrRightAndLeft3, Double bottom3, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom7, String rightOrRightAndLeft2, String bottom2, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom7, String rightOrRightAndLeft2, String bottom2, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom7, String rightOrRightAndLeft2, Double bottom3, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom7, String rightOrRightAndLeft2, Double bottom3, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft2 = rightOrRightAndLeft2;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom7, Double rightOrRightAndLeft3, String bottom2, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom7, Double rightOrRightAndLeft3, String bottom2, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom2 = bottom2;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom7, Double rightOrRightAndLeft3, Double bottom3, String left2) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left2 = left2;
    }


    public void setPadding(String[] spaceOrTopOrTopAndBottom7, Double rightOrRightAndLeft3, Double bottom3, Double left3) {
        this.spaceOrTopOrTopAndBottom = null;
        this.spaceOrTopOrTopAndBottom1 = null;
        this.spaceOrTopOrTopAndBottom2 = null;
        this.spaceOrTopOrTopAndBottom3 = null;
        this.spaceOrTopOrTopAndBottom4 = null;
        this.spaceOrTopOrTopAndBottom5 = null;
        this.spaceOrTopOrTopAndBottom6 = null;
        this.spaceOrTopOrTopAndBottom7 = null;
        
        this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
        this.rightOrRightAndLeft = null;
        this.rightOrRightAndLeft1 = null;
        this.rightOrRightAndLeft2 = null;
        this.rightOrRightAndLeft3 = null;
        
        this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
        this.bottom = null;
        this.bottom1 = null;
        this.bottom2 = null;
        this.bottom3 = null;
        
        this.bottom3 = bottom3;
        this.left = null;
        this.left1 = null;
        this.left2 = null;
        this.left3 = null;
        
        this.left3 = left3;
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

    private Boolean selectable;

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    private Direction textDirection;
    private String textDirection1;

    public void setTextdirection(Direction textDirection) {
        this.textDirection = null;
        this.textDirection1 = null;
        
        this.textDirection = textDirection;
    }


    public void setTextdirection(String textDirection1) {
        this.textDirection = null;
        this.textDirection1 = null;
        
        this.textDirection1 = textDirection1;
    }

    private Double textIndent;

    public void setTextindent(Double textIndent) {
        this.textIndent = textIndent;
    }

    private TextOverflow textOverflow;
    private String textOverflow1;

    public void setTextoverflow(TextOverflow textOverflow) {
        this.textOverflow = null;
        this.textOverflow1 = null;
        
        this.textOverflow = textOverflow;
    }


    public void setTextoverflow(String textOverflow1) {
        this.textOverflow = null;
        this.textOverflow1 = null;
        
        this.textOverflow1 = textOverflow1;
    }

    private String name;

    public void setTextsettings(String name) {
        this.name = name;
    }

    private String name1;
    private String textSettings;
    private Double textSettings1;
    private Boolean textSettings2;

    public void setTextsettings(String textSettings, String name1) {
        this.textSettings = null;
        this.textSettings1 = null;
        this.textSettings2 = null;
        
        this.textSettings = textSettings;
        this.name = null;
        this.name1 = null;
        
        this.name1 = name1;
    }


    public void setTextsettings(Double textSettings1, String name1) {
        this.textSettings = null;
        this.textSettings1 = null;
        this.textSettings2 = null;
        
        this.textSettings1 = textSettings1;
        this.name = null;
        this.name1 = null;
        
        this.name1 = name1;
    }


    public void setTextsettings(Boolean textSettings2, String name1) {
        this.textSettings = null;
        this.textSettings1 = null;
        this.textSettings2 = null;
        
        this.textSettings2 = textSettings2;
        this.name = null;
        this.name1 = null;
        
        this.name1 = name1;
    }

    private TextWrap textWrap;
    private String textWrap1;

    public void setTextwrap(TextWrap textWrap) {
        this.textWrap = null;
        this.textWrap1 = null;
        
        this.textWrap = textWrap;
    }


    public void setTextwrap(String textWrap1) {
        this.textWrap = null;
        this.textWrap1 = null;
        
        this.textWrap1 = textWrap1;
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

    private Boolean useHtml;

    public void setUsehtml(Boolean useHtml) {
        this.useHtml = useHtml;
    }

    private VAlign vAlign;
    private String vAlign1;

    public void setValign(VAlign vAlign) {
        this.vAlign = null;
        this.vAlign1 = null;
        
        this.vAlign = vAlign;
    }


    public void setValign(String vAlign1) {
        this.vAlign = null;
        this.vAlign1 = null;
        
        this.vAlign1 = vAlign1;
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        this.zIndex = zIndex;
    }

    private String generateJSbackground() {
        if (background != null) {
            return String.format(Locale.US, "background: %s,", background);
        }
        return "";
    }

    private String generateJSbackground1() {
        if (background1 != null) {
            return String.format(Locale.US, "background: %b,", background1);
        }
        return "";
    }

    private String generateJScurrentPage() {
        if (currentPage != null) {
            return String.format(Locale.US, "currentPage: %f,", currentPage);
        }
        return "";
    }

    private String generateJScurrentPage1() {
        if (currentPage1 != null) {
            return String.format(Locale.US, "currentPage: %s,", currentPage1);
        }
        return "";
    }

    private String generateJSdisablePointerEvents() {
        if (disablePointerEvents != null) {
            return String.format(Locale.US, "disablePointerEvents: %b,", disablePointerEvents);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSfontColor() {
        if (fontColor != null) {
            return String.format(Locale.US, "fontColor: %s,", fontColor);
        }
        return "";
    }

    private String generateJSfontDecoration() {
        if (fontDecoration != null) {
            return String.format(Locale.US, "fontDecoration: %s,", (fontDecoration != null) ? fontDecoration.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontDecoration1() {
        if (fontDecoration1 != null) {
            return String.format(Locale.US, "fontDecoration: %s,", fontDecoration1);
        }
        return "";
    }

    private String generateJSfontFamily() {
        if (fontFamily != null) {
            return String.format(Locale.US, "fontFamily: %s,", fontFamily);
        }
        return "";
    }

    private String generateJSfontOpacity() {
        if (fontOpacity != null) {
            return String.format(Locale.US, "fontOpacity: %f,", fontOpacity);
        }
        return "";
    }

    private String generateJSfontSize() {
        if (fontSize != null) {
            return String.format(Locale.US, "fontSize: %s,", fontSize);
        }
        return "";
    }

    private String generateJSfontSize1() {
        if (fontSize1 != null) {
            return String.format(Locale.US, "fontSize: %f,", fontSize1);
        }
        return "";
    }

    private String generateJSfontStyle() {
        if (fontStyle != null) {
            return String.format(Locale.US, "fontStyle: %s,", (fontStyle != null) ? fontStyle.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontStyle1() {
        if (fontStyle1 != null) {
            return String.format(Locale.US, "fontStyle: %s,", fontStyle1);
        }
        return "";
    }

    private String generateJSfontVariant() {
        if (fontVariant != null) {
            return String.format(Locale.US, "fontVariant: %s,", (fontVariant != null) ? fontVariant.generateJs() : "null");
        }
        return "";
    }

    private String generateJSfontVariant1() {
        if (fontVariant1 != null) {
            return String.format(Locale.US, "fontVariant: %s,", fontVariant1);
        }
        return "";
    }

    private String generateJSfontWeight() {
        if (fontWeight != null) {
            return String.format(Locale.US, "fontWeight: %s,", fontWeight);
        }
        return "";
    }

    private String generateJSfontWeight1() {
        if (fontWeight1 != null) {
            return String.format(Locale.US, "fontWeight: %f,", fontWeight1);
        }
        return "";
    }

    private String generateJShAlign() {
        if (hAlign != null) {
            return String.format(Locale.US, "hAlign: %s,", (hAlign != null) ? hAlign.generateJs() : "null");
        }
        return "";
    }

    private String generateJShAlign1() {
        if (hAlign1 != null) {
            return String.format(Locale.US, "hAlign: %s,", hAlign1);
        }
        return "";
    }

    private String generateJSlayout() {
        if (layout != null) {
            return String.format(Locale.US, "layout: %s,", layout);
        }
        return "";
    }

    private String generateJSlayout1() {
        if (layout1 != null) {
            return String.format(Locale.US, "layout: %s,", (layout1 != null) ? layout1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSletterSpacing() {
        if (letterSpacing != null) {
            return String.format(Locale.US, "letterSpacing: %s,", letterSpacing);
        }
        return "";
    }

    private String generateJSletterSpacing1() {
        if (letterSpacing1 != null) {
            return String.format(Locale.US, "letterSpacing: %f,", letterSpacing1);
        }
        return "";
    }

    private String generateJSlineHeight() {
        if (lineHeight != null) {
            return String.format(Locale.US, "lineHeight: %s,", lineHeight);
        }
        return "";
    }

    private String generateJSlineHeight1() {
        if (lineHeight1 != null) {
            return String.format(Locale.US, "lineHeight: %f,", lineHeight1);
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

    private String generateJSspaceOrTopOrTopAndBottom() {
        if (spaceOrTopOrTopAndBottom != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", spaceOrTopOrTopAndBottom);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom1() {
        if (spaceOrTopOrTopAndBottom1 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %f,", spaceOrTopOrTopAndBottom1);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom2() {
        if (spaceOrTopOrTopAndBottom2 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", Arrays.toString(spaceOrTopOrTopAndBottom2));
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom3() {
        if (spaceOrTopOrTopAndBottom3 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", Arrays.toString(spaceOrTopOrTopAndBottom3));
        }
        return "";
    }

    private String generateJSrightOrRightAndLeft() {
        if (rightOrRightAndLeft != null) {
            return String.format(Locale.US, "rightOrRightAndLeft: %s,", rightOrRightAndLeft);
        }
        return "";
    }

    private String generateJSrightOrRightAndLeft1() {
        if (rightOrRightAndLeft1 != null) {
            return String.format(Locale.US, "rightOrRightAndLeft: %f,", rightOrRightAndLeft1);
        }
        return "";
    }

    private String generateJSbottom() {
        if (bottom != null) {
            return String.format(Locale.US, "bottom: %s,", bottom);
        }
        return "";
    }

    private String generateJSbottom1() {
        if (bottom1 != null) {
            return String.format(Locale.US, "bottom: %f,", bottom1);
        }
        return "";
    }

    private String generateJSleft() {
        if (left != null) {
            return String.format(Locale.US, "left: %s,", left);
        }
        return "";
    }

    private String generateJSleft1() {
        if (left1 != null) {
            return String.format(Locale.US, "left: %f,", left1);
        }
        return "";
    }

    private String generateJSorientation() {
        if (orientation != null) {
            return String.format(Locale.US, "orientation: %s,", (orientation != null) ? orientation.generateJs() : "null");
        }
        return "";
    }

    private String generateJSorientation1() {
        if (orientation1 != null) {
            return String.format(Locale.US, "orientation: %s,", orientation1);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom4() {
        if (spaceOrTopOrTopAndBottom4 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", spaceOrTopOrTopAndBottom4);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom5() {
        if (spaceOrTopOrTopAndBottom5 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %f,", spaceOrTopOrTopAndBottom5);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom6() {
        if (spaceOrTopOrTopAndBottom6 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", Arrays.toString(spaceOrTopOrTopAndBottom6));
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom7() {
        if (spaceOrTopOrTopAndBottom7 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", Arrays.toString(spaceOrTopOrTopAndBottom7));
        }
        return "";
    }

    private String generateJSrightOrRightAndLeft2() {
        if (rightOrRightAndLeft2 != null) {
            return String.format(Locale.US, "rightOrRightAndLeft: %s,", rightOrRightAndLeft2);
        }
        return "";
    }

    private String generateJSrightOrRightAndLeft3() {
        if (rightOrRightAndLeft3 != null) {
            return String.format(Locale.US, "rightOrRightAndLeft: %f,", rightOrRightAndLeft3);
        }
        return "";
    }

    private String generateJSbottom2() {
        if (bottom2 != null) {
            return String.format(Locale.US, "bottom: %s,", bottom2);
        }
        return "";
    }

    private String generateJSbottom3() {
        if (bottom3 != null) {
            return String.format(Locale.US, "bottom: %f,", bottom3);
        }
        return "";
    }

    private String generateJSleft2() {
        if (left2 != null) {
            return String.format(Locale.US, "left: %s,", left2);
        }
        return "";
    }

    private String generateJSleft3() {
        if (left3 != null) {
            return String.format(Locale.US, "left: %f,", left3);
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
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSselectable() {
        if (selectable != null) {
            return String.format(Locale.US, "selectable: %b,", selectable);
        }
        return "";
    }

    private String generateJStextDirection() {
        if (textDirection != null) {
            return String.format(Locale.US, "textDirection: %s,", (textDirection != null) ? textDirection.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextDirection1() {
        if (textDirection1 != null) {
            return String.format(Locale.US, "textDirection: %s,", textDirection1);
        }
        return "";
    }

    private String generateJStextIndent() {
        if (textIndent != null) {
            return String.format(Locale.US, "textIndent: %f,", textIndent);
        }
        return "";
    }

    private String generateJStextOverflow() {
        if (textOverflow != null) {
            return String.format(Locale.US, "textOverflow: %s,", (textOverflow != null) ? textOverflow.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextOverflow1() {
        if (textOverflow1 != null) {
            return String.format(Locale.US, "textOverflow: %s,", textOverflow1);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSname1() {
        if (name1 != null) {
            return String.format(Locale.US, "name: %s,", name1);
        }
        return "";
    }

    private String generateJStextSettings() {
        if (textSettings != null) {
            return String.format(Locale.US, "textSettings: %s,", textSettings);
        }
        return "";
    }

    private String generateJStextSettings1() {
        if (textSettings1 != null) {
            return String.format(Locale.US, "textSettings: %f,", textSettings1);
        }
        return "";
    }

    private String generateJStextSettings2() {
        if (textSettings2 != null) {
            return String.format(Locale.US, "textSettings: %b,", textSettings2);
        }
        return "";
    }

    private String generateJStextWrap() {
        if (textWrap != null) {
            return String.format(Locale.US, "textWrap: %s,", (textWrap != null) ? textWrap.generateJs() : "null");
        }
        return "";
    }

    private String generateJStextWrap1() {
        if (textWrap1 != null) {
            return String.format(Locale.US, "textWrap: %s,", textWrap1);
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

    private String generateJSuseHtml() {
        if (useHtml != null) {
            return String.format(Locale.US, "useHtml: %b,", useHtml);
        }
        return "";
    }

    private String generateJSvAlign() {
        if (vAlign != null) {
            return String.format(Locale.US, "vAlign: %s,", (vAlign != null) ? vAlign.generateJs() : "null");
        }
        return "";
    }

    private String generateJSvAlign1() {
        if (vAlign1 != null) {
            return String.format(Locale.US, "vAlign: %s,", vAlign1);
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
        js.append(generateJSbackground());
        js.append(generateJSbackground1());
        js.append(generateJScurrentPage());
        js.append(generateJScurrentPage1());
        js.append(generateJSdisablePointerEvents());
        js.append(generateJSenabled());
        js.append(generateJSfontColor());
        js.append(generateJSfontDecoration());
        js.append(generateJSfontDecoration1());
        js.append(generateJSfontFamily());
        js.append(generateJSfontOpacity());
        js.append(generateJSfontSize());
        js.append(generateJSfontSize1());
        js.append(generateJSfontStyle());
        js.append(generateJSfontStyle1());
        js.append(generateJSfontVariant());
        js.append(generateJSfontVariant1());
        js.append(generateJSfontWeight());
        js.append(generateJSfontWeight1());
        js.append(generateJShAlign());
        js.append(generateJShAlign1());
        js.append(generateJSlayout());
        js.append(generateJSlayout1());
        js.append(generateJSletterSpacing());
        js.append(generateJSletterSpacing1());
        js.append(generateJSlineHeight());
        js.append(generateJSlineHeight1());
        js.append(generateJStype());
        js.append(generateJSuseCapture());
        js.append(generateJStype1());
        js.append(generateJSuseCapture1());
        js.append(generateJSspaceOrTopOrTopAndBottom());
        js.append(generateJSspaceOrTopOrTopAndBottom1());
        js.append(generateJSspaceOrTopOrTopAndBottom2());
        js.append(generateJSspaceOrTopOrTopAndBottom3());
        js.append(generateJSrightOrRightAndLeft());
        js.append(generateJSrightOrRightAndLeft1());
        js.append(generateJSbottom());
        js.append(generateJSbottom1());
        js.append(generateJSleft());
        js.append(generateJSleft1());
        js.append(generateJSorientation());
        js.append(generateJSorientation1());
        js.append(generateJSspaceOrTopOrTopAndBottom4());
        js.append(generateJSspaceOrTopOrTopAndBottom5());
        js.append(generateJSspaceOrTopOrTopAndBottom6());
        js.append(generateJSspaceOrTopOrTopAndBottom7());
        js.append(generateJSrightOrRightAndLeft2());
        js.append(generateJSrightOrRightAndLeft3());
        js.append(generateJSbottom2());
        js.append(generateJSbottom3());
        js.append(generateJSleft2());
        js.append(generateJSleft3());
        js.append(generateJSpaperSizeOrOptions());
        js.append(generateJSlandscape());
        js.append(generateJStype2());
        js.append(generateJSselectable());
        js.append(generateJStextDirection());
        js.append(generateJStextDirection1());
        js.append(generateJStextIndent());
        js.append(generateJStextOverflow());
        js.append(generateJStextOverflow1());
        js.append(generateJSname());
        js.append(generateJSname1());
        js.append(generateJStextSettings());
        js.append(generateJStextSettings1());
        js.append(generateJStextSettings2());
        js.append(generateJStextWrap());
        js.append(generateJStextWrap1());
        js.append(generateJStype3());
        js.append(generateJSuseCapture2());
        js.append(generateJSuseHtml());
        js.append(generateJSvAlign());
        js.append(generateJSvAlign1());
        js.append(generateJSzIndex());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}