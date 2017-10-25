package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
public class StandalonesLegend extends UiLegend {

    public StandalonesLegend() {

    }

    protected StandalonesLegend(String jsBase) {
        this.jsBase = jsBase;
    }

    protected StandalonesLegend(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    
    private Element getContainer;

    public Element getContainer() {
        if (getContainer == null)
            getContainer = new Element(jsBase + ".container()");

        return getContainer;
    }

    private String container;
    private Element container1;

    public StandalonesLegend setContainer(String container) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            
            this.container = container;
        } else {
            this.container = container;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".container(%s)", wrapQuotes(container)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", wrapQuotes(container)));
                js.setLength(0);
            }
        }
        return this;
    }


    public StandalonesLegend setContainer(Element container1) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            
            this.container1 = container1;
        } else {
            this.container1 = container1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".container(%s)", ((container1 != null) ? container1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", ((container1 != null) ? container1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private SeparateChart getItemsSource;

    public SeparateChart getItemsSource() {
        if (getItemsSource == null)
            getItemsSource = new SeparateChart(jsBase + ".itemsSource()");

        return getItemsSource;
    }

    private SeparateChart itemsSource;
    private SeparateChart[] itemsSource1;

    public StandalonesLegend setItemsSource(SeparateChart itemsSource) {
        if (jsBase == null) {
            this.itemsSource = null;
            this.itemsSource1 = null;
            
            this.itemsSource = itemsSource;
        } else {
            this.itemsSource = itemsSource;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemsSource(%s)", ((itemsSource != null) ? itemsSource.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemsSource(%s)", ((itemsSource != null) ? itemsSource.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public StandalonesLegend setItemsSource(SeparateChart[] itemsSource1) {
        if (jsBase == null) {
            this.itemsSource = null;
            this.itemsSource1 = null;
            
            this.itemsSource1 = itemsSource1;
        } else {
            this.itemsSource1 = itemsSource1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".itemsSource(%s)", arrayToString(itemsSource1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".itemsSource(%s)", arrayToString(itemsSource1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnychartMathRect getParentBounds;

    public AnychartMathRect getParentBounds() {
        if (getParentBounds == null)
            getParentBounds = new AnychartMathRect(jsBase + ".parentBounds()");

        return getParentBounds;
    }

    private AnychartMathRect parentBounds;
    private String parentBounds1;

    public StandalonesLegend setParentBounds(AnychartMathRect parentBounds) {
        if (jsBase == null) {
            this.parentBounds = null;
            this.parentBounds1 = null;
            
            this.parentBounds = parentBounds;
        } else {
            this.parentBounds = parentBounds;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".parentBounds(%s)", ((parentBounds != null) ? parentBounds.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentBounds(%s)", ((parentBounds != null) ? parentBounds.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    public StandalonesLegend setParentBounds(String parentBounds1) {
        if (jsBase == null) {
            this.parentBounds = null;
            this.parentBounds1 = null;
            
            this.parentBounds1 = parentBounds1;
        } else {
            this.parentBounds1 = parentBounds1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".parentBounds(%s)", wrapQuotes(parentBounds1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentBounds(%s)", wrapQuotes(parentBounds1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double left;
    private Double top;
    private Double width;
    private Double height;

    public StandalonesLegend setParentBounds(Double left, Double top, Double width, Double height) {
        if (jsBase == null) {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
        } else {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".parentBounds(%f, %f, %f, %f)", left, top, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentBounds(%f, %f, %f, %f)", left, top, width, height));
                js.setLength(0);
            }
        }
        return this;
    }


//
//    private String generateJSElement getContainer() {
//        if (Element getContainer != null) {
//            return Element getContainer.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSSeparateChart getItemsSource() {
//        if (SeparateChart getItemsSource != null) {
//            return SeparateChart getItemsSource.generateJs();
//        }
//        return "";
//    }
//
//    private String generateJSAnychartMathRect getParentBounds() {
//        if (AnychartMathRect getParentBounds != null) {
//            return AnychartMathRect getParentBounds.generateJs();
//        }
//        return "";
//    }
//
    private String generateJSgetContainer() {
        if (getContainer != null) {
            return getContainer.generateJs();
            //return String.format(Locale.US, "getContainer: %s,", ((getContainer != null) ? getContainer.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetItemsSource() {
        if (getItemsSource != null) {
            return getItemsSource.generateJs();
            //return String.format(Locale.US, "getItemsSource: %s,", ((getItemsSource != null) ? getItemsSource.generateJs() : "null"));
        }
        return "";
    }

    private String generateJSgetParentBounds() {
        if (getParentBounds != null) {
            return getParentBounds.generateJs();
            //return String.format(Locale.US, "getParentBounds: %s,", ((getParentBounds != null) ? getParentBounds.generateJs() : "null"));
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetContainer());
        jsGetters.append(generateJSgetItemsSource());
        jsGetters.append(generateJSgetParentBounds());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

//        if (jsBase == null) {
//            js.append("{");
////        
//            js.append(generateJScontainer());
////        
//            js.append(generateJScontainer1());
////        
//            js.append(generateJSitemsSource());
////        
//            js.append(generateJSitemsSource1());
////        
//            js.append(generateJSparentBounds());
////        
//            js.append(generateJSparentBounds1());
////        
//            js.append(generateJSleft());
////        
//            js.append(generateJStop());
////        
//            js.append(generateJSwidth());
////        
//            js.append(generateJSheight());
//
//            js.append("}");
//        }

        js.append(generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}