package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

import android.text.TextUtils;

// class
public class Paginator extends CoreText {

    public Paginator() {

    }

    protected Paginator(String jsBase) {
        this.jsBase = jsBase;
    }

    protected Paginator(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private String background;
    private String background1;
    private Boolean background2;

    public Paginator background(String background) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background = background;
        } else {
            this.background = background;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".background(%s)", background));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".background(%s)", background));
                js.setLength(0);
            }
        }
        return this;
    }


    public Paginator background(Boolean background2) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background2 = background2;
        } else {
            this.background2 = background2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".background(%b)", background2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".background(%b)", background2));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double currentPage;
    private String currentPage1;

    public Paginator setCurrentPage(Double currentPage) {
        if (jsBase == null) {
            this.currentPage = null;
            this.currentPage1 = null;
            
            this.currentPage = currentPage;
        } else {
            this.currentPage = currentPage;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".currentPage(%f)", currentPage));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".currentPage(%f)", currentPage));
                js.setLength(0);
            }
        }
        return this;
    }


    public Paginator setCurrentPage(String currentPage1) {
        if (jsBase == null) {
            this.currentPage = null;
            this.currentPage1 = null;
            
            this.currentPage1 = currentPage1;
        } else {
            this.currentPage1 = currentPage1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".currentPage(%s)", currentPage1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".currentPage(%s)", currentPage1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Layout layout;
    private String layout1;

    public Paginator setLayout(Layout layout) {
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

            js.append(String.format(Locale.US, ".layout(%s)", (layout != null) ? layout.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", (layout != null) ? layout.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Paginator setLayout(String layout1) {
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

            js.append(String.format(Locale.US, ".layout(%s)", layout1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".layout(%s)", layout1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Margin getMargin;

    public Margin getMargin() {
        if (getMargin == null)
            getMargin = new Margin(jsBase + ".margin()");

        return getMargin;
    }

    private String spaceOrTopOrTopAndBottom;
    private Double spaceOrTopOrTopAndBottom1;
    private Double[] spaceOrTopOrTopAndBottom2;
    private String[] spaceOrTopOrTopAndBottom3;
    private String spaceOrTopOrTopAndBottom4;
    private String rightOrRightAndLeft;
    private Double rightOrRightAndLeft1;
    private String bottom;
    private Double bottom1;
    private String left;
    private Double left1;

    public Paginator setMargin(Double[] spaceOrTopOrTopAndBottom2) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
        } else {
            this.spaceOrTopOrTopAndBottom2 = spaceOrTopOrTopAndBottom2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".margin(%s)", Arrays.toString(spaceOrTopOrTopAndBottom2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s)", Arrays.toString(spaceOrTopOrTopAndBottom2)));
                js.setLength(0);
            }
        }
        return this;
    }


    public Paginator setMargin(String[] spaceOrTopOrTopAndBottom3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
        } else {
            this.spaceOrTopOrTopAndBottom3 = spaceOrTopOrTopAndBottom3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".margin(%s)", Arrays.toString(spaceOrTopOrTopAndBottom3)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%s)", Arrays.toString(spaceOrTopOrTopAndBottom3)));
                js.setLength(0);
            }
        }
        return this;
    }


    public Paginator setMargin(Double spaceOrTopOrTopAndBottom1, Double rightOrRightAndLeft1, Double bottom1, Double left1) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            
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
        } else {
            this.spaceOrTopOrTopAndBottom1 = spaceOrTopOrTopAndBottom1;
            this.rightOrRightAndLeft1 = rightOrRightAndLeft1;
            this.bottom1 = bottom1;
            this.left1 = left1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".margin(%f, %f, %f, %f)", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom1, left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".margin(%f, %f, %f, %f)", spaceOrTopOrTopAndBottom1, rightOrRightAndLeft1, bottom1, left1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Orientation orientation;
    private String orientation1;

    public Paginator orientation(Orientation orientation) {
        if (jsBase == null) {
            this.orientation = null;
            this.orientation1 = null;
            
            this.orientation = orientation;
        } else {
            this.orientation = orientation;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".orientation(%s)", (orientation != null) ? orientation.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".orientation(%s)", (orientation != null) ? orientation.generateJs() : "null"));
                js.setLength(0);
            }
        }
        return this;
    }


    public Paginator orientation(String orientation1) {
        if (jsBase == null) {
            this.orientation = null;
            this.orientation1 = null;
            
            this.orientation1 = orientation1;
        } else {
            this.orientation1 = orientation1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".orientation(%s)", orientation1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".orientation(%s)", orientation1));
                js.setLength(0);
            }
        }
        return this;
    }

    private UtilsPadding getPadding;

    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private String spaceOrTopOrTopAndBottom5;
    private Double spaceOrTopOrTopAndBottom6;
    private Double[] spaceOrTopOrTopAndBottom7;
    private String[] spaceOrTopOrTopAndBottom8;
    private String spaceOrTopOrTopAndBottom9;
    private String rightOrRightAndLeft2;
    private Double rightOrRightAndLeft3;
    private String bottom2;
    private Double bottom3;
    private String left2;
    private Double left3;

    public Paginator setPadding(Double[] spaceOrTopOrTopAndBottom7) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
        } else {
            this.spaceOrTopOrTopAndBottom7 = spaceOrTopOrTopAndBottom7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".padding(%s)", Arrays.toString(spaceOrTopOrTopAndBottom7)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", Arrays.toString(spaceOrTopOrTopAndBottom7)));
                js.setLength(0);
            }
        }
        return this;
    }


    public Paginator setPadding(String[] spaceOrTopOrTopAndBottom8) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
        } else {
            this.spaceOrTopOrTopAndBottom8 = spaceOrTopOrTopAndBottom8;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".padding(%s)", Arrays.toString(spaceOrTopOrTopAndBottom8)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", Arrays.toString(spaceOrTopOrTopAndBottom8)));
                js.setLength(0);
            }
        }
        return this;
    }


    public Paginator setPadding(Double spaceOrTopOrTopAndBottom6, Double rightOrRightAndLeft3, Double bottom3, Double left3) {
        if (jsBase == null) {
            this.spaceOrTopOrTopAndBottom = null;
            this.spaceOrTopOrTopAndBottom1 = null;
            this.spaceOrTopOrTopAndBottom2 = null;
            this.spaceOrTopOrTopAndBottom3 = null;
            this.spaceOrTopOrTopAndBottom4 = null;
            this.spaceOrTopOrTopAndBottom5 = null;
            this.spaceOrTopOrTopAndBottom6 = null;
            this.spaceOrTopOrTopAndBottom7 = null;
            this.spaceOrTopOrTopAndBottom8 = null;
            this.spaceOrTopOrTopAndBottom9 = null;
            
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
        } else {
            this.spaceOrTopOrTopAndBottom6 = spaceOrTopOrTopAndBottom6;
            this.rightOrRightAndLeft3 = rightOrRightAndLeft3;
            this.bottom3 = bottom3;
            this.left3 = left3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".padding(%f, %f, %f, %f)", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft3, bottom3, left3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%f, %f, %f, %f)", spaceOrTopOrTopAndBottom6, rightOrRightAndLeft3, bottom3, left3));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetMargin() {
        if (getMargin != null) {
            return getMargin.generateJs();
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }

    private String generateJSbackground() {
        if (background != null) {
            return String.format(Locale.US, "background: %s,", background);
        }
        return "";
    }

    private String generateJSbackground1() {
        if (background1 != null) {
            return String.format(Locale.US, "background: %s,", background1);
        }
        return "";
    }

    private String generateJSbackground2() {
        if (background2 != null) {
            return String.format(Locale.US, "background: %b,", background2);
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

    private String generateJSlayout() {
        if (layout != null) {
            return String.format(Locale.US, "layout: %s,", (layout != null) ? layout.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlayout1() {
        if (layout1 != null) {
            return String.format(Locale.US, "layout: %s,", layout1);
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

    private String generateJSspaceOrTopOrTopAndBottom4() {
        if (spaceOrTopOrTopAndBottom4 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", spaceOrTopOrTopAndBottom4);
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

    private String generateJSspaceOrTopOrTopAndBottom5() {
        if (spaceOrTopOrTopAndBottom5 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", spaceOrTopOrTopAndBottom5);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom6() {
        if (spaceOrTopOrTopAndBottom6 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %f,", spaceOrTopOrTopAndBottom6);
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom7() {
        if (spaceOrTopOrTopAndBottom7 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", Arrays.toString(spaceOrTopOrTopAndBottom7));
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom8() {
        if (spaceOrTopOrTopAndBottom8 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", Arrays.toString(spaceOrTopOrTopAndBottom8));
        }
        return "";
    }

    private String generateJSspaceOrTopOrTopAndBottom9() {
        if (spaceOrTopOrTopAndBottom9 != null) {
            return String.format(Locale.US, "spaceOrTopOrTopAndBottom: %s,", spaceOrTopOrTopAndBottom9);
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


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetMargin());
        jsGetters.append(generateJSgetPadding());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        if (jsBase == null) {
            js.append("{");
            js.append(generateJSbackground());
            js.append(generateJSbackground1());
            js.append(generateJSbackground2());
            js.append(generateJScurrentPage());
            js.append(generateJScurrentPage1());
            js.append(generateJSlayout());
            js.append(generateJSlayout1());
            js.append(generateJSspaceOrTopOrTopAndBottom());
            js.append(generateJSspaceOrTopOrTopAndBottom1());
            js.append(generateJSspaceOrTopOrTopAndBottom2());
            js.append(generateJSspaceOrTopOrTopAndBottom3());
            js.append(generateJSspaceOrTopOrTopAndBottom4());
            js.append(generateJSrightOrRightAndLeft());
            js.append(generateJSrightOrRightAndLeft1());
            js.append(generateJSbottom());
            js.append(generateJSbottom1());
            js.append(generateJSleft());
            js.append(generateJSleft1());
            js.append(generateJSorientation());
            js.append(generateJSorientation1());
            js.append(generateJSspaceOrTopOrTopAndBottom5());
            js.append(generateJSspaceOrTopOrTopAndBottom6());
            js.append(generateJSspaceOrTopOrTopAndBottom7());
            js.append(generateJSspaceOrTopOrTopAndBottom8());
            js.append(generateJSspaceOrTopOrTopAndBottom9());
            js.append(generateJSrightOrRightAndLeft2());
            js.append(generateJSrightOrRightAndLeft3());
            js.append(generateJSbottom2());
            js.append(generateJSbottom3());
            js.append(generateJSleft2());
            js.append(generateJSleft3());
            js.append("}");
        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}