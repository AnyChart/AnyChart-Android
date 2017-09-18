package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class RectObj extends JsObject  {

    
    private Double bottom;
    private String bottom1;
    private Double height;
    private String height1;
    private Double left;
    private String left1;
    private Double right;
    private String right1;
    private Double top;
    private String top1;
    private Double width;
    private String width1;

    
    public RectObj(Double bottom, Double height, Double left, Double right, Double top, Double width) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %f,right: %f,top: %f,width: %f}",  bottom, height, left, right, top, width));
    }

    public RectObj(Double bottom, Double height, Double left, Double right, Double top, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %f,right: %f,top: %f,width: %s}",  bottom, height, left, right, top, width1));
    }

    public RectObj(Double bottom, Double height, Double left, Double right, String top1, Double width) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %f,right: %f,top: %s,width: %f}",  bottom, height, left, right, top1, width));
    }

    public RectObj(Double bottom, Double height, Double left, Double right, String top1, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %f,right: %f,top: %s,width: %s}",  bottom, height, left, right, top1, width1));
    }

    public RectObj(Double bottom, Double height, Double left, String right1, Double top, Double width) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %f,right: %s,top: %f,width: %f}",  bottom, height, left, right1, top, width));
    }

    public RectObj(Double bottom, Double height, Double left, String right1, Double top, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %f,right: %s,top: %f,width: %s}",  bottom, height, left, right1, top, width1));
    }

    public RectObj(Double bottom, Double height, Double left, String right1, String top1, Double width) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %f,right: %s,top: %s,width: %f}",  bottom, height, left, right1, top1, width));
    }

    public RectObj(Double bottom, Double height, Double left, String right1, String top1, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %f,right: %s,top: %s,width: %s}",  bottom, height, left, right1, top1, width1));
    }

    public RectObj(Double bottom, Double height, String left1, Double right, Double top, Double width) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %s,right: %f,top: %f,width: %f}",  bottom, height, left1, right, top, width));
    }

    public RectObj(Double bottom, Double height, String left1, Double right, Double top, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %s,right: %f,top: %f,width: %s}",  bottom, height, left1, right, top, width1));
    }

    public RectObj(Double bottom, Double height, String left1, Double right, String top1, Double width) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %s,right: %f,top: %s,width: %f}",  bottom, height, left1, right, top1, width));
    }

    public RectObj(Double bottom, Double height, String left1, Double right, String top1, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %s,right: %f,top: %s,width: %s}",  bottom, height, left1, right, top1, width1));
    }

    public RectObj(Double bottom, Double height, String left1, String right1, Double top, Double width) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %s,right: %s,top: %f,width: %f}",  bottom, height, left1, right1, top, width));
    }

    public RectObj(Double bottom, Double height, String left1, String right1, Double top, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %s,right: %s,top: %f,width: %s}",  bottom, height, left1, right1, top, width1));
    }

    public RectObj(Double bottom, Double height, String left1, String right1, String top1, Double width) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %s,right: %s,top: %s,width: %f}",  bottom, height, left1, right1, top1, width));
    }

    public RectObj(Double bottom, Double height, String left1, String right1, String top1, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %f,left: %s,right: %s,top: %s,width: %s}",  bottom, height, left1, right1, top1, width1));
    }

    public RectObj(Double bottom, String height1, Double left, Double right, Double top, Double width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %f,right: %f,top: %f,width: %f}",  bottom, height1, left, right, top, width));
    }

    public RectObj(Double bottom, String height1, Double left, Double right, Double top, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %f,right: %f,top: %f,width: %s}",  bottom, height1, left, right, top, width1));
    }

    public RectObj(Double bottom, String height1, Double left, Double right, String top1, Double width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %f,right: %f,top: %s,width: %f}",  bottom, height1, left, right, top1, width));
    }

    public RectObj(Double bottom, String height1, Double left, Double right, String top1, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %f,right: %f,top: %s,width: %s}",  bottom, height1, left, right, top1, width1));
    }

    public RectObj(Double bottom, String height1, Double left, String right1, Double top, Double width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %f,right: %s,top: %f,width: %f}",  bottom, height1, left, right1, top, width));
    }

    public RectObj(Double bottom, String height1, Double left, String right1, Double top, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %f,right: %s,top: %f,width: %s}",  bottom, height1, left, right1, top, width1));
    }

    public RectObj(Double bottom, String height1, Double left, String right1, String top1, Double width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %f,right: %s,top: %s,width: %f}",  bottom, height1, left, right1, top1, width));
    }

    public RectObj(Double bottom, String height1, Double left, String right1, String top1, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %f,right: %s,top: %s,width: %s}",  bottom, height1, left, right1, top1, width1));
    }

    public RectObj(Double bottom, String height1, String left1, Double right, Double top, Double width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %s,right: %f,top: %f,width: %f}",  bottom, height1, left1, right, top, width));
    }

    public RectObj(Double bottom, String height1, String left1, Double right, Double top, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %s,right: %f,top: %f,width: %s}",  bottom, height1, left1, right, top, width1));
    }

    public RectObj(Double bottom, String height1, String left1, Double right, String top1, Double width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %s,right: %f,top: %s,width: %f}",  bottom, height1, left1, right, top1, width));
    }

    public RectObj(Double bottom, String height1, String left1, Double right, String top1, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %s,right: %f,top: %s,width: %s}",  bottom, height1, left1, right, top1, width1));
    }

    public RectObj(Double bottom, String height1, String left1, String right1, Double top, Double width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %s,right: %s,top: %f,width: %f}",  bottom, height1, left1, right1, top, width));
    }

    public RectObj(Double bottom, String height1, String left1, String right1, Double top, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %s,right: %s,top: %f,width: %s}",  bottom, height1, left1, right1, top, width1));
    }

    public RectObj(Double bottom, String height1, String left1, String right1, String top1, Double width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %s,right: %s,top: %s,width: %f}",  bottom, height1, left1, right1, top1, width));
    }

    public RectObj(Double bottom, String height1, String left1, String right1, String top1, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %f,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height1, left1, right1, top1, width1));
    }

    public RectObj(String bottom1, Double height, Double left, Double right, Double top, Double width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %f,right: %f,top: %f,width: %f}",  bottom1, height, left, right, top, width));
    }

    public RectObj(String bottom1, Double height, Double left, Double right, Double top, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %f,right: %f,top: %f,width: %s}",  bottom1, height, left, right, top, width1));
    }

    public RectObj(String bottom1, Double height, Double left, Double right, String top1, Double width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %f,right: %f,top: %s,width: %f}",  bottom1, height, left, right, top1, width));
    }

    public RectObj(String bottom1, Double height, Double left, Double right, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %f,right: %f,top: %s,width: %s}",  bottom1, height, left, right, top1, width1));
    }

    public RectObj(String bottom1, Double height, Double left, String right1, Double top, Double width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %f,right: %s,top: %f,width: %f}",  bottom1, height, left, right1, top, width));
    }

    public RectObj(String bottom1, Double height, Double left, String right1, Double top, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %f,right: %s,top: %f,width: %s}",  bottom1, height, left, right1, top, width1));
    }

    public RectObj(String bottom1, Double height, Double left, String right1, String top1, Double width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %f,right: %s,top: %s,width: %f}",  bottom1, height, left, right1, top1, width));
    }

    public RectObj(String bottom1, Double height, Double left, String right1, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %f,right: %s,top: %s,width: %s}",  bottom1, height, left, right1, top1, width1));
    }

    public RectObj(String bottom1, Double height, String left1, Double right, Double top, Double width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %s,right: %f,top: %f,width: %f}",  bottom1, height, left1, right, top, width));
    }

    public RectObj(String bottom1, Double height, String left1, Double right, Double top, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %s,right: %f,top: %f,width: %s}",  bottom1, height, left1, right, top, width1));
    }

    public RectObj(String bottom1, Double height, String left1, Double right, String top1, Double width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %s,right: %f,top: %s,width: %f}",  bottom1, height, left1, right, top1, width));
    }

    public RectObj(String bottom1, Double height, String left1, Double right, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %s,right: %f,top: %s,width: %s}",  bottom1, height, left1, right, top1, width1));
    }

    public RectObj(String bottom1, Double height, String left1, String right1, Double top, Double width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %s,right: %s,top: %f,width: %f}",  bottom1, height, left1, right1, top, width));
    }

    public RectObj(String bottom1, Double height, String left1, String right1, Double top, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %s,right: %s,top: %f,width: %s}",  bottom1, height, left1, right1, top, width1));
    }

    public RectObj(String bottom1, Double height, String left1, String right1, String top1, Double width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %s,right: %s,top: %s,width: %f}",  bottom1, height, left1, right1, top1, width));
    }

    public RectObj(String bottom1, Double height, String left1, String right1, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %f,left: %s,right: %s,top: %s,width: %s}",  bottom1, height, left1, right1, top1, width1));
    }

    public RectObj(String bottom1, String height1, Double left, Double right, Double top, Double width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %f,right: %f,top: %f,width: %f}",  bottom1, height1, left, right, top, width));
    }

    public RectObj(String bottom1, String height1, Double left, Double right, Double top, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %f,right: %f,top: %f,width: %s}",  bottom1, height1, left, right, top, width1));
    }

    public RectObj(String bottom1, String height1, Double left, Double right, String top1, Double width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %f,right: %f,top: %s,width: %f}",  bottom1, height1, left, right, top1, width));
    }

    public RectObj(String bottom1, String height1, Double left, Double right, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %f,right: %f,top: %s,width: %s}",  bottom1, height1, left, right, top1, width1));
    }

    public RectObj(String bottom1, String height1, Double left, String right1, Double top, Double width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %f,right: %s,top: %f,width: %f}",  bottom1, height1, left, right1, top, width));
    }

    public RectObj(String bottom1, String height1, Double left, String right1, Double top, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %f,right: %s,top: %f,width: %s}",  bottom1, height1, left, right1, top, width1));
    }

    public RectObj(String bottom1, String height1, Double left, String right1, String top1, Double width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %f,right: %s,top: %s,width: %f}",  bottom1, height1, left, right1, top1, width));
    }

    public RectObj(String bottom1, String height1, Double left, String right1, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %f,right: %s,top: %s,width: %s}",  bottom1, height1, left, right1, top1, width1));
    }

    public RectObj(String bottom1, String height1, String left1, Double right, Double top, Double width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %f,top: %f,width: %f}",  bottom1, height1, left1, right, top, width));
    }

    public RectObj(String bottom1, String height1, String left1, Double right, Double top, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %f,top: %f,width: %s}",  bottom1, height1, left1, right, top, width1));
    }

    public RectObj(String bottom1, String height1, String left1, Double right, String top1, Double width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %f,top: %s,width: %f}",  bottom1, height1, left1, right, top1, width));
    }

    public RectObj(String bottom1, String height1, String left1, Double right, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %f,top: %s,width: %s}",  bottom1, height1, left1, right, top1, width1));
    }

    public RectObj(String bottom1, String height1, String left1, String right1, Double top, Double width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %f,width: %f}",  bottom1, height1, left1, right1, top, width));
    }

    public RectObj(String bottom1, String height1, String left1, String right1, Double top, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %f,width: %s}",  bottom1, height1, left1, right1, top, width1));
    }

    public RectObj(String bottom1, String height1, String left1, String right1, String top1, Double width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %f}",  bottom1, height1, left1, right1, top1, width));
    }

    public RectObj(String bottom1, String height1, String left1, String right1, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom1, height1, left1, right1, top1, width1));
    }


    @Override
    public String generateJs() {
        return js.toString();
    }

}