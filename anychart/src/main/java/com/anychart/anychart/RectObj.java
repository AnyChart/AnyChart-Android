package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the rectangle.
 */
public class RectObj extends JsObject  {

    
    private Number bottom;
    private String bottom1;
    private Number height;
    private String height1;
    private Number left;
    private String left1;
    private Number right;
    private String right1;
    private Number top;
    private String top1;
    private Number width;
    private String width1;

    
    public RectObj(Number bottom, Number height, Number left, Number right, Number top, Number width) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, left, right, top, width));
    }
    public RectObj(Number bottom, Number height, Number left, Number right, Number top, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, left, right, top, wrapQuotes(width1)));
    }
    public RectObj(Number bottom, Number height, Number left, Number right, String top1, Number width) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, left, right, wrapQuotes(top1), width));
    }
    public RectObj(Number bottom, Number height, Number left, Number right, String top1, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, left, right, wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(Number bottom, Number height, Number left, String right1, Number top, Number width) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, left, wrapQuotes(right1), top, width));
    }
    public RectObj(Number bottom, Number height, Number left, String right1, Number top, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, left, wrapQuotes(right1), top, wrapQuotes(width1)));
    }
    public RectObj(Number bottom, Number height, Number left, String right1, String top1, Number width) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, left, wrapQuotes(right1), wrapQuotes(top1), width));
    }
    public RectObj(Number bottom, Number height, Number left, String right1, String top1, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, left, wrapQuotes(right1), wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(Number bottom, Number height, String left1, Number right, Number top, Number width) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, wrapQuotes(left1), right, top, width));
    }
    public RectObj(Number bottom, Number height, String left1, Number right, Number top, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, wrapQuotes(left1), right, top, wrapQuotes(width1)));
    }
    public RectObj(Number bottom, Number height, String left1, Number right, String top1, Number width) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, wrapQuotes(left1), right, wrapQuotes(top1), width));
    }
    public RectObj(Number bottom, Number height, String left1, Number right, String top1, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, wrapQuotes(left1), right, wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(Number bottom, Number height, String left1, String right1, Number top, Number width) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, wrapQuotes(left1), wrapQuotes(right1), top, width));
    }
    public RectObj(Number bottom, Number height, String left1, String right1, Number top, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, wrapQuotes(left1), wrapQuotes(right1), top, wrapQuotes(width1)));
    }
    public RectObj(Number bottom, Number height, String left1, String right1, String top1, Number width) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, wrapQuotes(left1), wrapQuotes(right1), wrapQuotes(top1), width));
    }
    public RectObj(Number bottom, Number height, String left1, String right1, String top1, String width1) {
        this.bottom = bottom;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, height, wrapQuotes(left1), wrapQuotes(right1), wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(Number bottom, String height1, Number left, Number right, Number top, Number width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), left, right, top, width));
    }
    public RectObj(Number bottom, String height1, Number left, Number right, Number top, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), left, right, top, wrapQuotes(width1)));
    }
    public RectObj(Number bottom, String height1, Number left, Number right, String top1, Number width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), left, right, wrapQuotes(top1), width));
    }
    public RectObj(Number bottom, String height1, Number left, Number right, String top1, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), left, right, wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(Number bottom, String height1, Number left, String right1, Number top, Number width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), left, wrapQuotes(right1), top, width));
    }
    public RectObj(Number bottom, String height1, Number left, String right1, Number top, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), left, wrapQuotes(right1), top, wrapQuotes(width1)));
    }
    public RectObj(Number bottom, String height1, Number left, String right1, String top1, Number width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), left, wrapQuotes(right1), wrapQuotes(top1), width));
    }
    public RectObj(Number bottom, String height1, Number left, String right1, String top1, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), left, wrapQuotes(right1), wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(Number bottom, String height1, String left1, Number right, Number top, Number width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), wrapQuotes(left1), right, top, width));
    }
    public RectObj(Number bottom, String height1, String left1, Number right, Number top, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), wrapQuotes(left1), right, top, wrapQuotes(width1)));
    }
    public RectObj(Number bottom, String height1, String left1, Number right, String top1, Number width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), wrapQuotes(left1), right, wrapQuotes(top1), width));
    }
    public RectObj(Number bottom, String height1, String left1, Number right, String top1, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), wrapQuotes(left1), right, wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(Number bottom, String height1, String left1, String right1, Number top, Number width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), wrapQuotes(left1), wrapQuotes(right1), top, width));
    }
    public RectObj(Number bottom, String height1, String left1, String right1, Number top, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), wrapQuotes(left1), wrapQuotes(right1), top, wrapQuotes(width1)));
    }
    public RectObj(Number bottom, String height1, String left1, String right1, String top1, Number width) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), wrapQuotes(left1), wrapQuotes(right1), wrapQuotes(top1), width));
    }
    public RectObj(Number bottom, String height1, String left1, String right1, String top1, String width1) {
        this.bottom = bottom;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  bottom, wrapQuotes(height1), wrapQuotes(left1), wrapQuotes(right1), wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(String bottom1, Number height, Number left, Number right, Number top, Number width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, left, right, top, width));
    }
    public RectObj(String bottom1, Number height, Number left, Number right, Number top, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, left, right, top, wrapQuotes(width1)));
    }
    public RectObj(String bottom1, Number height, Number left, Number right, String top1, Number width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, left, right, wrapQuotes(top1), width));
    }
    public RectObj(String bottom1, Number height, Number left, Number right, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, left, right, wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(String bottom1, Number height, Number left, String right1, Number top, Number width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, left, wrapQuotes(right1), top, width));
    }
    public RectObj(String bottom1, Number height, Number left, String right1, Number top, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, left, wrapQuotes(right1), top, wrapQuotes(width1)));
    }
    public RectObj(String bottom1, Number height, Number left, String right1, String top1, Number width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, left, wrapQuotes(right1), wrapQuotes(top1), width));
    }
    public RectObj(String bottom1, Number height, Number left, String right1, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, left, wrapQuotes(right1), wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(String bottom1, Number height, String left1, Number right, Number top, Number width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, wrapQuotes(left1), right, top, width));
    }
    public RectObj(String bottom1, Number height, String left1, Number right, Number top, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, wrapQuotes(left1), right, top, wrapQuotes(width1)));
    }
    public RectObj(String bottom1, Number height, String left1, Number right, String top1, Number width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, wrapQuotes(left1), right, wrapQuotes(top1), width));
    }
    public RectObj(String bottom1, Number height, String left1, Number right, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, wrapQuotes(left1), right, wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(String bottom1, Number height, String left1, String right1, Number top, Number width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, wrapQuotes(left1), wrapQuotes(right1), top, width));
    }
    public RectObj(String bottom1, Number height, String left1, String right1, Number top, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, wrapQuotes(left1), wrapQuotes(right1), top, wrapQuotes(width1)));
    }
    public RectObj(String bottom1, Number height, String left1, String right1, String top1, Number width) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, wrapQuotes(left1), wrapQuotes(right1), wrapQuotes(top1), width));
    }
    public RectObj(String bottom1, Number height, String left1, String right1, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height = height;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), height, wrapQuotes(left1), wrapQuotes(right1), wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(String bottom1, String height1, Number left, Number right, Number top, Number width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), left, right, top, width));
    }
    public RectObj(String bottom1, String height1, Number left, Number right, Number top, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), left, right, top, wrapQuotes(width1)));
    }
    public RectObj(String bottom1, String height1, Number left, Number right, String top1, Number width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), left, right, wrapQuotes(top1), width));
    }
    public RectObj(String bottom1, String height1, Number left, Number right, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), left, right, wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(String bottom1, String height1, Number left, String right1, Number top, Number width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), left, wrapQuotes(right1), top, width));
    }
    public RectObj(String bottom1, String height1, Number left, String right1, Number top, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), left, wrapQuotes(right1), top, wrapQuotes(width1)));
    }
    public RectObj(String bottom1, String height1, Number left, String right1, String top1, Number width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), left, wrapQuotes(right1), wrapQuotes(top1), width));
    }
    public RectObj(String bottom1, String height1, Number left, String right1, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left = left;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), left, wrapQuotes(right1), wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(String bottom1, String height1, String left1, Number right, Number top, Number width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), wrapQuotes(left1), right, top, width));
    }
    public RectObj(String bottom1, String height1, String left1, Number right, Number top, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), wrapQuotes(left1), right, top, wrapQuotes(width1)));
    }
    public RectObj(String bottom1, String height1, String left1, Number right, String top1, Number width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), wrapQuotes(left1), right, wrapQuotes(top1), width));
    }
    public RectObj(String bottom1, String height1, String left1, Number right, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right = right;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), wrapQuotes(left1), right, wrapQuotes(top1), wrapQuotes(width1)));
    }
    public RectObj(String bottom1, String height1, String left1, String right1, Number top, Number width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), wrapQuotes(left1), wrapQuotes(right1), top, width));
    }
    public RectObj(String bottom1, String height1, String left1, String right1, Number top, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top = top;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), wrapQuotes(left1), wrapQuotes(right1), top, wrapQuotes(width1)));
    }
    public RectObj(String bottom1, String height1, String left1, String right1, String top1, Number width) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width = width;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), wrapQuotes(left1), wrapQuotes(right1), wrapQuotes(top1), width));
    }
    public RectObj(String bottom1, String height1, String left1, String right1, String top1, String width1) {
        this.bottom1 = bottom1;
        this.height1 = height1;
        this.left1 = left1;
        this.right1 = right1;
        this.top1 = top1;
        this.width1 = width1;

        js.append(String.format(Locale.US, "{bottom: %s,height: %s,left: %s,right: %s,top: %s,width: %s}",  wrapQuotes(bottom1), wrapQuotes(height1), wrapQuotes(left1), wrapQuotes(right1), wrapQuotes(top1), wrapQuotes(width1)));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}