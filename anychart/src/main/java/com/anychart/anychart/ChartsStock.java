package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
public class ChartsStock extends Chart {

    public ChartsStock() {
        js.append("chart = anychart.stock();");
        jsBase = "chart";
    }

    
    private Crosshair getCrosshair;

    public Crosshair getCrosshair() {
        if (getCrosshair == null)
            getCrosshair = new Crosshair(jsBase + ".crosshair()");

        return getCrosshair;
    }

    private String crosshair;
    private Boolean crosshair1;
    private List<ChartsStock> setCrosshair = new ArrayList<>();

    public ChartsStock setCrosshair(String crosshair) {
        this.crosshair = crosshair;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crosshair(%s)", crosshair));

//        js.append(String.format(Locale.US, ".crosshair(%s)", crosshair));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crosshair(%s)", crosshair));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCrosshair() {
        if (!setCrosshair.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setCrosshair) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setCrosshair1 = new ArrayList<>();

    public ChartsStock setCrosshair(Boolean crosshair1) {
        this.crosshair1 = crosshair1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crosshair(%b)", crosshair1));

//        js.append(String.format(Locale.US, ".crosshair(%b)", crosshair1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crosshair(%b)", crosshair1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCrosshair1() {
        if (!setCrosshair1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setCrosshair1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Grouping getGrouping;

    public Grouping getGrouping() {
        if (getGrouping == null)
            getGrouping = new Grouping(jsBase + ".grouping()");

        return getGrouping;
    }

    private Boolean grouping;
    private String[] grouping1;
    private String grouping2;
    private List<ChartsStock> setGrouping = new ArrayList<>();

    public ChartsStock setGrouping(Boolean grouping) {
        this.grouping = grouping;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grouping(%b)", grouping));

//        js.append(String.format(Locale.US, ".grouping(%b)", grouping));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".grouping(%b)", grouping));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetGrouping() {
        if (!setGrouping.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setGrouping) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setGrouping1 = new ArrayList<>();

    public ChartsStock setGrouping(String[] grouping1) {
        this.grouping1 = grouping1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grouping(%s)", Arrays.toString(grouping1)));

//        js.append(String.format(Locale.US, ".grouping(%s)", Arrays.toString(grouping1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".grouping(%s)", Arrays.toString(grouping1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetGrouping1() {
        if (!setGrouping1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setGrouping1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setGrouping2 = new ArrayList<>();

    public ChartsStock setGrouping(String grouping2) {
        this.grouping2 = grouping2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grouping(%s)", grouping2));

//        js.append(String.format(Locale.US, ".grouping(%s)", grouping2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".grouping(%s)", grouping2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetGrouping2() {
        if (!setGrouping2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setGrouping2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StockInteractivity getInteractivity;

    public StockInteractivity getInteractivity() {
        if (getInteractivity == null)
            getInteractivity = new StockInteractivity(jsBase + ".interactivity()");

        return getInteractivity;
    }

    private String interactivity;
    private HoverMode interactivity1;
    private List<SeparateChart> setInteractivity = new ArrayList<>();

    public SeparateChart setInteractivity(String interactivity) {
        this.interactivity = interactivity;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setInteractivity" + ++variableIndex + " = " + jsBase + ".interactivity(%s);", interactivity));

//        js.append(String.format(Locale.US, jsBase + ".interactivity(%s);", interactivity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".interactivity(%s)", interactivity));
            js.setLength(0);
        }
        SeparateChart item = new SeparateChart("setInteractivity" + variableIndex);
        setInteractivity.add(item);
        return item;
    }
    private String generateJSsetInteractivity() {
        if (!setInteractivity.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeparateChart item : setInteractivity) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<SeparateChart> setInteractivity1 = new ArrayList<>();

    public SeparateChart setInteractivity(HoverMode interactivity1) {
        this.interactivity1 = interactivity1;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setInteractivity1" + ++variableIndex + " = " + jsBase + ".interactivity(%s);", (interactivity1 != null) ? interactivity1.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".interactivity(%s);", (interactivity1 != null) ? interactivity1.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".interactivity(%s)", (interactivity1 != null) ? interactivity1.generateJs() : "null"));
            js.setLength(0);
        }
        SeparateChart item = new SeparateChart("setInteractivity1" + variableIndex);
        setInteractivity1.add(item);
        return item;
    }
    private String generateJSsetInteractivity1() {
        if (!setInteractivity1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (SeparateChart item : setInteractivity1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Plot getPlot;

    public Plot getPlot() {
        if (getPlot == null)
            getPlot = new Plot(jsBase + ".plot()");

        return getPlot;
    }

    private Plot getPlot1;

    public Plot getPlot(Double index) {
        if (getPlot1 == null)
            getPlot1 = new Plot(jsBase + ".plot1("+ index+")");

        return getPlot1;
    }

    private String plot;
    private Boolean plot1;
    private List<ChartsStock> setPlot = new ArrayList<>();

    public ChartsStock setPlot(String plot) {
        this.plot = plot;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".plot(%s)", plot));

//        js.append(String.format(Locale.US, ".plot(%s)", plot));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".plot(%s)", plot));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPlot() {
        if (!setPlot.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setPlot) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setPlot1 = new ArrayList<>();

    public ChartsStock setPlot(Boolean plot1) {
        this.plot1 = plot1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".plot(%b)", plot1));

//        js.append(String.format(Locale.US, ".plot(%b)", plot1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".plot(%b)", plot1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPlot1() {
        if (!setPlot1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setPlot1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private String plot2;
    private Boolean plot3;
    private List<ChartsStock> setPlot2 = new ArrayList<>();

    public ChartsStock setPlot(String plot2, Double index1) {
        this.plot2 = plot2;
        this.index1 = index1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".plot(%s, %f)", plot2, index1));

//        js.append(String.format(Locale.US, ".plot(%s, %f)", plot2, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".plot(%s, %f)", plot2, index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPlot2() {
        if (!setPlot2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setPlot2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setPlot3 = new ArrayList<>();

    public ChartsStock setPlot(Boolean plot3, Double index1) {
        this.plot3 = plot3;
        this.index1 = index1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".plot(%b, %f)", plot3, index1));

//        js.append(String.format(Locale.US, ".plot(%b, %f)", plot3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".plot(%b, %f)", plot3, index1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPlot3() {
        if (!setPlot3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setPlot3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean preserveSelectedRangeOnDataUpdate;
    private List<ChartsStock> setPreserveSelectedRangeOnDataUpdate = new ArrayList<>();

    public ChartsStock setPreserveSelectedRangeOnDataUpdate(Boolean preserveSelectedRangeOnDataUpdate) {
        this.preserveSelectedRangeOnDataUpdate = preserveSelectedRangeOnDataUpdate;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".preserveSelectedRangeOnDataUpdate(%b)", preserveSelectedRangeOnDataUpdate));

//        js.append(String.format(Locale.US, ".preserveSelectedRangeOnDataUpdate(%b)", preserveSelectedRangeOnDataUpdate));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".preserveSelectedRangeOnDataUpdate(%b)", preserveSelectedRangeOnDataUpdate));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPreserveSelectedRangeOnDataUpdate() {
        if (!setPreserveSelectedRangeOnDataUpdate.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setPreserveSelectedRangeOnDataUpdate) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StockScroller getScroller;

    public StockScroller getScroller() {
        if (getScroller == null)
            getScroller = new StockScroller(jsBase + ".scroller()");

        return getScroller;
    }

    private String scroller;
    private Boolean scroller1;
    private List<ChartsStock> setScroller = new ArrayList<>();

    public ChartsStock setScroller(String scroller) {
        this.scroller = scroller;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scroller(%s)", scroller));

//        js.append(String.format(Locale.US, ".scroller(%s)", scroller));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scroller(%s)", scroller));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScroller() {
        if (!setScroller.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setScroller) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setScroller1 = new ArrayList<>();

    public ChartsStock setScroller(Boolean scroller1) {
        this.scroller1 = scroller1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scroller(%b)", scroller1));

//        js.append(String.format(Locale.US, ".scroller(%b)", scroller1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scroller(%b)", scroller1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScroller1() {
        if (!setScroller1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setScroller1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Grouping getScrollerGrouping;

    public Grouping getScrollerGrouping() {
        if (getScrollerGrouping == null)
            getScrollerGrouping = new Grouping(jsBase + ".scrollerGrouping()");

        return getScrollerGrouping;
    }

    private Boolean scrollerGrouping;
    private String[] scrollerGrouping1;
    private String scrollerGrouping2;
    private List<ChartsStock> setScrollerGrouping = new ArrayList<>();

    public ChartsStock setScrollerGrouping(Boolean scrollerGrouping) {
        this.scrollerGrouping = scrollerGrouping;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scrollerGrouping(%b)", scrollerGrouping));

//        js.append(String.format(Locale.US, ".scrollerGrouping(%b)", scrollerGrouping));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scrollerGrouping(%b)", scrollerGrouping));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScrollerGrouping() {
        if (!setScrollerGrouping.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setScrollerGrouping) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setScrollerGrouping1 = new ArrayList<>();

    public ChartsStock setScrollerGrouping(String[] scrollerGrouping1) {
        this.scrollerGrouping1 = scrollerGrouping1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scrollerGrouping(%s)", Arrays.toString(scrollerGrouping1)));

//        js.append(String.format(Locale.US, ".scrollerGrouping(%s)", Arrays.toString(scrollerGrouping1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scrollerGrouping(%s)", Arrays.toString(scrollerGrouping1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScrollerGrouping1() {
        if (!setScrollerGrouping1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setScrollerGrouping1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setScrollerGrouping2 = new ArrayList<>();

    public ChartsStock setScrollerGrouping(String scrollerGrouping2) {
        this.scrollerGrouping2 = scrollerGrouping2;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scrollerGrouping(%s)", scrollerGrouping2));

//        js.append(String.format(Locale.US, ".scrollerGrouping(%s)", scrollerGrouping2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scrollerGrouping(%s)", scrollerGrouping2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetScrollerGrouping2() {
        if (!setScrollerGrouping2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setScrollerGrouping2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double typeOrUnitOrStart;
    private String typeOrUnitOrStart1;
    private StockRangeType typeOrUnitOrStart2;
    private Interval typeOrUnitOrStart3;
    private Double endOrCountOrDispatchEvent;
    private String endOrCountOrDispatchEvent1;
    private Boolean endOrCountOrDispatchEvent2;
    private StockRangeAnchor anchorOrDispatchEvent;
    private Boolean anchorOrDispatchEvent1;
    private Boolean dispatchEvent;
    private List<ChartsStock> setSelectRange = new ArrayList<>();

    public ChartsStock selectRange(Double typeOrUnitOrStart, Double endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart = typeOrUnitOrStart;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %f, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%f, %f, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %f, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange() {
        if (!setSelectRange.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange1 = new ArrayList<>();

    public ChartsStock selectRange(Double typeOrUnitOrStart, Double endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart = typeOrUnitOrStart;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %f, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%f, %f, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %f, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange1() {
        if (!setSelectRange1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange2 = new ArrayList<>();

    public ChartsStock selectRange(Double typeOrUnitOrStart, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart = typeOrUnitOrStart;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %s, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%f, %s, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %s, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange2() {
        if (!setSelectRange2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange3 = new ArrayList<>();

    public ChartsStock selectRange(Double typeOrUnitOrStart, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart = typeOrUnitOrStart;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %s, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%f, %s, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %s, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange3() {
        if (!setSelectRange3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange4 = new ArrayList<>();

    public ChartsStock selectRange(Double typeOrUnitOrStart, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart = typeOrUnitOrStart;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %b, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%f, %b, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %b, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange4() {
        if (!setSelectRange4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange5 = new ArrayList<>();

    public ChartsStock selectRange(Double typeOrUnitOrStart, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart = typeOrUnitOrStart;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %b, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%f, %b, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %b, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange5() {
        if (!setSelectRange5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange6 = new ArrayList<>();

    public ChartsStock selectRange(String typeOrUnitOrStart1, Double endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart1 = typeOrUnitOrStart1;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange6() {
        if (!setSelectRange6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange7 = new ArrayList<>();

    public ChartsStock selectRange(String typeOrUnitOrStart1, Double endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart1 = typeOrUnitOrStart1;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange7() {
        if (!setSelectRange7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange8 = new ArrayList<>();

    public ChartsStock selectRange(String typeOrUnitOrStart1, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart1 = typeOrUnitOrStart1;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange8() {
        if (!setSelectRange8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange9 = new ArrayList<>();

    public ChartsStock selectRange(String typeOrUnitOrStart1, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart1 = typeOrUnitOrStart1;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange9() {
        if (!setSelectRange9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange10 = new ArrayList<>();

    public ChartsStock selectRange(String typeOrUnitOrStart1, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart1 = typeOrUnitOrStart1;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange10() {
        if (!setSelectRange10.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange10) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange11 = new ArrayList<>();

    public ChartsStock selectRange(String typeOrUnitOrStart1, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart1 = typeOrUnitOrStart1;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", typeOrUnitOrStart1, endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange11() {
        if (!setSelectRange11.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange11) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange12 = new ArrayList<>();

    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Double endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart2 = typeOrUnitOrStart2;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange12() {
        if (!setSelectRange12.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange12) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange13 = new ArrayList<>();

    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Double endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart2 = typeOrUnitOrStart2;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange13() {
        if (!setSelectRange13.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange13) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange14 = new ArrayList<>();

    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart2 = typeOrUnitOrStart2;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange14() {
        if (!setSelectRange14.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange14) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange15 = new ArrayList<>();

    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart2 = typeOrUnitOrStart2;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange15() {
        if (!setSelectRange15.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange15) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange16 = new ArrayList<>();

    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart2 = typeOrUnitOrStart2;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange16() {
        if (!setSelectRange16.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange16) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange17 = new ArrayList<>();

    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart2 = typeOrUnitOrStart2;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", (typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null", endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange17() {
        if (!setSelectRange17.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange17) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange18 = new ArrayList<>();

    public ChartsStock selectRange(Interval typeOrUnitOrStart3, Double endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart3 = typeOrUnitOrStart3;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange18() {
        if (!setSelectRange18.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange18) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange19 = new ArrayList<>();

    public ChartsStock selectRange(Interval typeOrUnitOrStart3, Double endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart3 = typeOrUnitOrStart3;
        this.endOrCountOrDispatchEvent = endOrCountOrDispatchEvent;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange19() {
        if (!setSelectRange19.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange19) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange20 = new ArrayList<>();

    public ChartsStock selectRange(Interval typeOrUnitOrStart3, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart3 = typeOrUnitOrStart3;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent1, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange20() {
        if (!setSelectRange20.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange20) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange21 = new ArrayList<>();

    public ChartsStock selectRange(Interval typeOrUnitOrStart3, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart3 = typeOrUnitOrStart3;
        this.endOrCountOrDispatchEvent1 = endOrCountOrDispatchEvent1;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent1, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange21() {
        if (!setSelectRange21.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange21) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange22 = new ArrayList<>();

    public ChartsStock selectRange(Interval typeOrUnitOrStart3, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        this.typeOrUnitOrStart3 = typeOrUnitOrStart3;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent = anchorOrDispatchEvent;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent2, (anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null", dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange22() {
        if (!setSelectRange22.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange22) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange23 = new ArrayList<>();

    public ChartsStock selectRange(Interval typeOrUnitOrStart3, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent1, Boolean dispatchEvent) {
        this.typeOrUnitOrStart3 = typeOrUnitOrStart3;
        this.endOrCountOrDispatchEvent2 = endOrCountOrDispatchEvent2;
        this.anchorOrDispatchEvent1 = anchorOrDispatchEvent1;
        this.dispatchEvent = dispatchEvent;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));

//        js.append(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", (typeOrUnitOrStart3 != null) ? typeOrUnitOrStart3.generateJs() : "null", endOrCountOrDispatchEvent2, anchorOrDispatchEvent1, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange23() {
        if (!setSelectRange23.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange23) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean repeat;
    private Boolean asRect;
    private List<ChartsStock> setStartZoomMarquee = new ArrayList<>();

    public ChartsStock startZoomMarquee(Boolean repeat, Boolean asRect) {
        this.repeat = repeat;
        this.asRect = asRect;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".startZoomMarquee(%b, %b)", repeat, asRect));

//        js.append(String.format(Locale.US, ".startZoomMarquee(%b, %b)", repeat, asRect));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".startZoomMarquee(%b, %b)", repeat, asRect));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetStartZoomMarquee() {
        if (!setStartZoomMarquee.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setStartZoomMarquee) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StockScatterDateTime getXScale;

    public StockScatterDateTime getXScale() {
        if (getXScale == null)
            getXScale = new StockScatterDateTime(jsBase + ".xScale()");

        return getXScale;
    }

    private String xScale;
    private String xScale1;
    private List<ChartsStock> setXScale = new ArrayList<>();

    public ChartsStock setXScale(String xScale) {
        this.xScale = xScale;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", xScale));

//        js.append(String.format(Locale.US, ".xScale(%s)", xScale));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", xScale));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetXScale() {
        if (!setXScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill zoomMarqueeFill;
    private List<ChartsStock> setZoomMarqueeFill = new ArrayList<>();

    public ChartsStock setZoomMarqueeFill(Fill zoomMarqueeFill) {
        this.zoomMarqueeFill = zoomMarqueeFill;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s)", (zoomMarqueeFill != null) ? zoomMarqueeFill.generateJs() : "null"));

//        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s)", (zoomMarqueeFill != null) ? zoomMarqueeFill.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s)", (zoomMarqueeFill != null) ? zoomMarqueeFill.generateJs() : "null"));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomMarqueeFill() {
        if (!setZoomMarqueeFill.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setZoomMarqueeFill) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String color;
    private Double opacity;
    private List<ChartsStock> setZoomMarqueeFill1 = new ArrayList<>();

    public ChartsStock zoomMarqueeFill(String color, Double opacity) {
        this.color = color;
        this.opacity = opacity;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %f)", color, opacity));

//        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %f)", color, opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %f)", color, opacity));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomMarqueeFill1() {
        if (!setZoomMarqueeFill1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setZoomMarqueeFill1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;
    private List<ChartsStock> setZoomMarqueeFill2 = new ArrayList<>();

    public ChartsStock zoomMarqueeFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

//        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomMarqueeFill2() {
        if (!setZoomMarqueeFill2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setZoomMarqueeFill2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setZoomMarqueeFill3 = new ArrayList<>();

    public ChartsStock zoomMarqueeFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

//        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomMarqueeFill3() {
        if (!setZoomMarqueeFill3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setZoomMarqueeFill3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setZoomMarqueeFill4 = new ArrayList<>();

    public ChartsStock zoomMarqueeFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        this.keys = keys;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));

//        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), mode2, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomMarqueeFill4() {
        if (!setZoomMarqueeFill4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setZoomMarqueeFill4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setZoomMarqueeFill5 = new ArrayList<>();

    public ChartsStock zoomMarqueeFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode = mode;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));

//        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %f, %f)", Arrays.toString(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomMarqueeFill5() {
        if (!setZoomMarqueeFill5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setZoomMarqueeFill5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setZoomMarqueeFill6 = new ArrayList<>();

    public ChartsStock zoomMarqueeFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode1 = mode1;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

//        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomMarqueeFill6() {
        if (!setZoomMarqueeFill6.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setZoomMarqueeFill6) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setZoomMarqueeFill7 = new ArrayList<>();

    public ChartsStock zoomMarqueeFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        this.keys1 = keys1;
        this.mode2 = mode2;
        this.angle = angle;
        this.opacity1 = opacity1;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));

//        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", Arrays.toString(keys1), mode2, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomMarqueeFill7() {
        if (!setZoomMarqueeFill7.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setZoomMarqueeFill7) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;
    private List<ChartsStock> setZoomMarqueeFill8 = new ArrayList<>();

    public ChartsStock zoomMarqueeFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys2 = keys2;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

//        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomMarqueeFill8() {
        if (!setZoomMarqueeFill8.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setZoomMarqueeFill8) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setZoomMarqueeFill9 = new ArrayList<>();

    public ChartsStock zoomMarqueeFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        this.keys3 = keys3;
        this.cx = cx;
        this.cy = cy;
        this.mode3 = mode3;
        this.opacity2 = opacity2;
        this.fx = fx;
        this.fy = fy;
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

//        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomMarqueeFill9() {
        if (!setZoomMarqueeFill9.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setZoomMarqueeFill9) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Fill imageSettings;
    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<Chart> setZoomMarqueeStroke = new ArrayList<>();

    public Chart setZoomMarqueeStroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color1 = color1;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setZoomMarqueeStroke" + ++variableIndex + " = " + jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s);", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s)", (color1 != null) ? color1.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        Chart item = new Chart("setZoomMarqueeStroke" + variableIndex);
        setZoomMarqueeStroke.add(item);
        return item;
    }
    private String generateJSsetZoomMarqueeStroke() {
        if (!setZoomMarqueeStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setZoomMarqueeStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setZoomMarqueeStroke1 = new ArrayList<>();

    public Chart setZoomMarqueeStroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color2 = color2;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setZoomMarqueeStroke1" + ++variableIndex + " = " + jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s);", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s)", (color2 != null) ? color2.generateJs() : "null", thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        Chart item = new Chart("setZoomMarqueeStroke1" + variableIndex);
        setZoomMarqueeStroke1.add(item);
        return item;
    }
    private String generateJSsetZoomMarqueeStroke1() {
        if (!setZoomMarqueeStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setZoomMarqueeStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Chart> setZoomMarqueeStroke2 = new ArrayList<>();

    public Chart setZoomMarqueeStroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        this.color3 = color3;
        this.thickness = thickness;
        this.dashpattern = dashpattern;
        this.lineJoin = lineJoin;
        this.lineCap = lineCap;
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setZoomMarqueeStroke2" + ++variableIndex + " = " + jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

//        js.append(String.format(Locale.US, jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s);", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s)", color3, thickness, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
            js.setLength(0);
        }
        Chart item = new Chart("setZoomMarqueeStroke2" + variableIndex);
        setZoomMarqueeStroke2.add(item);
        return item;
    }
    private String generateJSsetZoomMarqueeStroke2() {
        if (!setZoomMarqueeStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Chart item : setZoomMarqueeStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetCrosshair() {
        if (getCrosshair != null) {
            return getCrosshair.generateJs();
        }
        return "";
    }

    private String generateJSgetGrouping() {
        if (getGrouping != null) {
            return getGrouping.generateJs();
        }
        return "";
    }

    private String generateJSgetInteractivity() {
        if (getInteractivity != null) {
            return getInteractivity.generateJs();
        }
        return "";
    }

    private String generateJSgetPlot() {
        if (getPlot != null) {
            return getPlot.generateJs();
        }
        return "";
    }

    private String generateJSgetPlot1() {
        if (getPlot1 != null) {
            return getPlot1.generateJs();
        }
        return "";
    }

    private String generateJSgetScroller() {
        if (getScroller != null) {
            return getScroller.generateJs();
        }
        return "";
    }

    private String generateJSgetScrollerGrouping() {
        if (getScrollerGrouping != null) {
            return getScrollerGrouping.generateJs();
        }
        return "";
    }

    private String generateJSgetXScale() {
        if (getXScale != null) {
            return getXScale.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetCrosshair());
        js.append(generateJSgetGrouping());
        js.append(generateJSgetInteractivity());
        js.append(generateJSgetPlot());
        js.append(generateJSgetPlot1());
        js.append(generateJSgetScroller());
        js.append(generateJSgetScrollerGrouping());
        js.append(generateJSgetXScale());
        js.append(generateJSsetCrosshair());
        js.append(generateJSsetCrosshair1());
        js.append(generateJSsetGrouping());
        js.append(generateJSsetGrouping1());
        js.append(generateJSsetGrouping2());
        js.append(generateJSsetInteractivity());
        js.append(generateJSsetInteractivity1());
        js.append(generateJSsetPlot());
        js.append(generateJSsetPlot1());
        js.append(generateJSsetPlot2());
        js.append(generateJSsetPlot3());
        js.append(generateJSsetPreserveSelectedRangeOnDataUpdate());
        js.append(generateJSsetScroller());
        js.append(generateJSsetScroller1());
        js.append(generateJSsetScrollerGrouping());
        js.append(generateJSsetScrollerGrouping1());
        js.append(generateJSsetScrollerGrouping2());
        js.append(generateJSsetSelectRange());
        js.append(generateJSsetSelectRange1());
        js.append(generateJSsetSelectRange2());
        js.append(generateJSsetSelectRange3());
        js.append(generateJSsetSelectRange4());
        js.append(generateJSsetSelectRange5());
        js.append(generateJSsetSelectRange6());
        js.append(generateJSsetSelectRange7());
        js.append(generateJSsetSelectRange8());
        js.append(generateJSsetSelectRange9());
        js.append(generateJSsetSelectRange10());
        js.append(generateJSsetSelectRange11());
        js.append(generateJSsetSelectRange12());
        js.append(generateJSsetSelectRange13());
        js.append(generateJSsetSelectRange14());
        js.append(generateJSsetSelectRange15());
        js.append(generateJSsetSelectRange16());
        js.append(generateJSsetSelectRange17());
        js.append(generateJSsetSelectRange18());
        js.append(generateJSsetSelectRange19());
        js.append(generateJSsetSelectRange20());
        js.append(generateJSsetSelectRange21());
        js.append(generateJSsetSelectRange22());
        js.append(generateJSsetSelectRange23());
        js.append(generateJSsetStartZoomMarquee());
        js.append(generateJSsetXScale());
        js.append(generateJSsetZoomMarqueeFill());
        js.append(generateJSsetZoomMarqueeFill1());
        js.append(generateJSsetZoomMarqueeFill2());
        js.append(generateJSsetZoomMarqueeFill3());
        js.append(generateJSsetZoomMarqueeFill4());
        js.append(generateJSsetZoomMarqueeFill5());
        js.append(generateJSsetZoomMarqueeFill6());
        js.append(generateJSsetZoomMarqueeFill7());
        js.append(generateJSsetZoomMarqueeFill8());
        js.append(generateJSsetZoomMarqueeFill9());
        js.append(generateJSsetZoomMarqueeStroke());
        js.append(generateJSsetZoomMarqueeStroke1());
        js.append(generateJSsetZoomMarqueeStroke2());

        js.append(super.generateJsGetters());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}