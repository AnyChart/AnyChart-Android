package com.anychart.anychart;

import com.anychart.anychart.application.MyApplication;
import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// chart class
/**
 * Stock chart class.<br/>
<b>Note:</b> Use {@link anychart#stock} method to get an instance of this class.
 */
public class ChartsStock extends Chart {

    protected ChartsStock(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    public ChartsStock setData(SingleValueDataSet data) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            js.append(data.generateJs());

            js.append("]);");
        }

        return this;
    }

    public ChartsStock setData(List<DataEntry> data) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            for (DataEntry dataEntry : data) {
                js.append(dataEntry.generateJs()).append(",");
            }
            js.setLength(js.length() - 1);

            js.append("]);");
        }

        return this;
    }

    public ChartsStock setData(List<DataEntry> data, TreeFillingMethod mode) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            for (DataEntry dataEntry : data) {
                js.append(dataEntry.generateJs()).append(",");
            }
            js.setLength(js.length() - 1);

            js.append("], ").append((mode != null) ? mode.generateJs() : "null").append(");");
        }

        return this;
    }

    public ChartsStock setData(Mapping mapping) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(mapping.generateJs());

        js.append(jsBase).append(".data(").append(mapping.getJsBase()).append(");");

        return this;
    }

    public void setOnClickListener(ListenersInterface.OnClickListener listener) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append("chart.listen('pointClick', function(e) {");
        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        MyApplication.getInstance().getJavaScriptInterface().setOnClickListener(listener);
    }

    

    private Crosshair getCrosshair;

    /**
     * Getter for crosshair settings.
     */
    public Crosshair getCrosshair() {
        if (getCrosshair == null)
            getCrosshair = new Crosshair(jsBase + ".crosshair()");

        return getCrosshair;
    }
    private String crosshair;
    private Boolean crosshair1;
    private List<ChartsStock> setCrosshair = new ArrayList<>();

    /**
     * Setter for crosshair settings.<br/>
The plot crosshair settings have a higher priority than the chart crosshair settings.
     */
    public ChartsStock setCrosshair(String crosshair) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crosshair(%s)", wrapQuotes(crosshair)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".crosshair(%s)", wrapQuotes(crosshair)));
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

    /**
     * Setter for crosshair settings.<br/>
The plot crosshair settings have a higher priority than the chart crosshair settings.
     */
    public ChartsStock setCrosshair(Boolean crosshair1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".crosshair(%b)", crosshair1));

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

    /**
     * Getter for the current data grouping settings.
     */
    public Grouping getGrouping() {
        if (getGrouping == null)
            getGrouping = new Grouping(jsBase + ".grouping()");

        return getGrouping;
    }
    private Boolean grouping;
    private String[] grouping1;
    private String grouping2;
    private List<ChartsStock> setGrouping = new ArrayList<>();

    /**
     * Setter for the data grouping settings.
     */
    public ChartsStock setGrouping(Boolean grouping) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grouping(%b)", grouping));

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

    /**
     * Setter for the data grouping settings.
     */
    public ChartsStock setGrouping(String[] grouping1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grouping(%s)", arrayToStringWrapQuotes(grouping1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".grouping(%s)", arrayToStringWrapQuotes(grouping1)));
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

    /**
     * Setter for the data grouping settings.
     */
    public ChartsStock setGrouping(String grouping2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grouping(%s)", wrapQuotes(grouping2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".grouping(%s)", wrapQuotes(grouping2)));
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

    /**
     * Getter for interactivity settings.
     */
    public StockInteractivity getInteractivity() {
        if (getInteractivity == null)
            getInteractivity = new StockInteractivity(jsBase + ".interactivity()");

        return getInteractivity;
    }
    private String interactivity;
    private HoverMode interactivity1;
    private String interactivity2;
    private List<SeparateChart> setInteractivity = new ArrayList<>();

    /**
     * Setter for interactivity settings.
     */
    public SeparateChart setInteractivity(String interactivity) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setInteractivity" + ++variableIndex + " = " + jsBase + ".interactivity(%s);", wrapQuotes(interactivity)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".interactivity(%s)", wrapQuotes(interactivity)));
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

    /**
     * Setter for interactivity settings.
     */
    public SeparateChart setInteractivity(HoverMode interactivity1) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setInteractivity1" + ++variableIndex + " = " + jsBase + ".interactivity(%s);", ((interactivity1 != null) ? interactivity1.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".interactivity(%s)", ((interactivity1 != null) ? interactivity1.generateJs() : "null")));
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

    /**
     * Getter for the current plots.
     */
    public Plot getPlot() {
        if (getPlot == null)
            getPlot = new Plot(jsBase + ".plot()");

        return getPlot;
    }

    private List<Plot> getPlot1 = new ArrayList<>();

    /**
     * Getter for the current plots.
     */
    public Plot getPlot(Double index) {
        Plot item = new Plot(jsBase + ".plot("+ index+")");
        getPlot1.add(item);
        return item;
    }
    private String plot;
    private Boolean plot1;
    private List<ChartsStock> setPlot = new ArrayList<>();

    /**
     * Setter for the plots.
     */
    public ChartsStock setPlot(String plot) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".plot(%s)", wrapQuotes(plot)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".plot(%s)", wrapQuotes(plot)));
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

    /**
     * Setter for the plots.
     */
    public ChartsStock setPlot(Boolean plot1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".plot(%b)", plot1));

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

    /**
     * Setter for the plots by index.
     */
    public ChartsStock setPlot(String plot2, Double index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".plot(%s, %f)", wrapQuotes(plot2), index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".plot(%s, %f)", wrapQuotes(plot2), index1));
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

    /**
     * Setter for the plots by index.
     */
    public ChartsStock setPlot(Boolean plot3, Double index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".plot(%b, %f)", plot3, index1));

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

    /**
     * Setter for the Selected Range Change Behaviour.
     */
    public ChartsStock setPreserveSelectedRangeOnDataUpdate(Boolean preserveSelectedRangeOnDataUpdate) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".preserveSelectedRangeOnDataUpdate(%b)", preserveSelectedRangeOnDataUpdate));

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

    /**
     * Getter for the current scroller.
     */
    public StockScroller getScroller() {
        if (getScroller == null)
            getScroller = new StockScroller(jsBase + ".scroller()");

        return getScroller;
    }
    private String scroller;
    private Boolean scroller1;
    private List<ChartsStock> setScroller = new ArrayList<>();

    /**
     * Setter for the scroller.
     */
    public ChartsStock setScroller(String scroller) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scroller(%s)", wrapQuotes(scroller)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scroller(%s)", wrapQuotes(scroller)));
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

    /**
     * Setter for the scroller.
     */
    public ChartsStock setScroller(Boolean scroller1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scroller(%b)", scroller1));

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

    /**
     * Getter for the current scroller data grouping settings.
     */
    public Grouping getScrollerGrouping() {
        if (getScrollerGrouping == null)
            getScrollerGrouping = new Grouping(jsBase + ".scrollerGrouping()");

        return getScrollerGrouping;
    }
    private Boolean scrollerGrouping;
    private String[] scrollerGrouping1;
    private String scrollerGrouping2;
    private List<ChartsStock> setScrollerGrouping = new ArrayList<>();

    /**
     * Setter for the scroller data grouping settings.
     */
    public ChartsStock setScrollerGrouping(Boolean scrollerGrouping) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scrollerGrouping(%b)", scrollerGrouping));

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

    /**
     * Setter for the scroller data grouping settings.
     */
    public ChartsStock setScrollerGrouping(String[] scrollerGrouping1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scrollerGrouping(%s)", arrayToStringWrapQuotes(scrollerGrouping1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scrollerGrouping(%s)", arrayToStringWrapQuotes(scrollerGrouping1)));
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

    /**
     * Setter for the scroller data grouping settings.
     */
    public ChartsStock setScrollerGrouping(String scrollerGrouping2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".scrollerGrouping(%s)", wrapQuotes(scrollerGrouping2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".scrollerGrouping(%s)", wrapQuotes(scrollerGrouping2)));
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
    private String typeOrUnitOrStart3;
    private Interval typeOrUnitOrStart4;
    private Double endOrCountOrDispatchEvent;
    private String endOrCountOrDispatchEvent1;
    private Boolean endOrCountOrDispatchEvent2;
    private StockRangeAnchor anchorOrDispatchEvent;
    private String anchorOrDispatchEvent1;
    private Boolean anchorOrDispatchEvent2;
    private Boolean dispatchEvent;
    private List<ChartsStock> setSelectRange = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Double typeOrUnitOrStart, Double endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %f, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %f, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Double typeOrUnitOrStart, Double endOrCountOrDispatchEvent, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %f, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %f, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Double typeOrUnitOrStart, Double endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %f, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %f, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Double typeOrUnitOrStart, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %s, %s, %b)", typeOrUnitOrStart, wrapQuotes(endOrCountOrDispatchEvent1), ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %s, %s, %b)", typeOrUnitOrStart, wrapQuotes(endOrCountOrDispatchEvent1), ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Double typeOrUnitOrStart, String endOrCountOrDispatchEvent1, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %s, %s, %b)", typeOrUnitOrStart, wrapQuotes(endOrCountOrDispatchEvent1), wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %s, %s, %b)", typeOrUnitOrStart, wrapQuotes(endOrCountOrDispatchEvent1), wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Double typeOrUnitOrStart, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %s, %b, %b)", typeOrUnitOrStart, wrapQuotes(endOrCountOrDispatchEvent1), anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %s, %b, %b)", typeOrUnitOrStart, wrapQuotes(endOrCountOrDispatchEvent1), anchorOrDispatchEvent2, dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Double typeOrUnitOrStart, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %b, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %b, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Double typeOrUnitOrStart, Boolean endOrCountOrDispatchEvent2, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %b, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %b, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Double typeOrUnitOrStart, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%f, %b, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%f, %b, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, anchorOrDispatchEvent2, dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(String typeOrUnitOrStart1, Double endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(String typeOrUnitOrStart1, Double endOrCountOrDispatchEvent, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(String typeOrUnitOrStart1, Double endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(String typeOrUnitOrStart1, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", wrapQuotes(typeOrUnitOrStart1), wrapQuotes(endOrCountOrDispatchEvent1), ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", wrapQuotes(typeOrUnitOrStart1), wrapQuotes(endOrCountOrDispatchEvent1), ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(String typeOrUnitOrStart1, String endOrCountOrDispatchEvent1, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", wrapQuotes(typeOrUnitOrStart1), wrapQuotes(endOrCountOrDispatchEvent1), wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", wrapQuotes(typeOrUnitOrStart1), wrapQuotes(endOrCountOrDispatchEvent1), wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(String typeOrUnitOrStart1, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", wrapQuotes(typeOrUnitOrStart1), wrapQuotes(endOrCountOrDispatchEvent1), anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", wrapQuotes(typeOrUnitOrStart1), wrapQuotes(endOrCountOrDispatchEvent1), anchorOrDispatchEvent2, dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(String typeOrUnitOrStart1, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent2, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent2, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(String typeOrUnitOrStart1, Boolean endOrCountOrDispatchEvent2, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent2, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent2, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(String typeOrUnitOrStart1, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent2, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent2, anchorOrDispatchEvent2, dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Double endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Double endOrCountOrDispatchEvent, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Double endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), wrapQuotes(endOrCountOrDispatchEvent1), ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), wrapQuotes(endOrCountOrDispatchEvent1), ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, String endOrCountOrDispatchEvent1, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), wrapQuotes(endOrCountOrDispatchEvent1), wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), wrapQuotes(endOrCountOrDispatchEvent1), wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
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

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), wrapQuotes(endOrCountOrDispatchEvent1), anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), wrapQuotes(endOrCountOrDispatchEvent1), anchorOrDispatchEvent2, dispatchEvent));
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

    private List<ChartsStock> setSelectRange24 = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent2, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent2, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange24() {
        if (!setSelectRange24.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange24) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange25 = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Boolean endOrCountOrDispatchEvent2, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent2, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent2, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange25() {
        if (!setSelectRange25.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange25) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange26 = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent2, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent2, anchorOrDispatchEvent2, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange26() {
        if (!setSelectRange26.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange26) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange27 = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Interval typeOrUnitOrStart4, Double endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange27() {
        if (!setSelectRange27.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange27) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange28 = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Interval typeOrUnitOrStart4, Double endOrCountOrDispatchEvent, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange28() {
        if (!setSelectRange28.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange28) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange29 = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Interval typeOrUnitOrStart4, Double endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %f, %b, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange29() {
        if (!setSelectRange29.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange29) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange30 = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Interval typeOrUnitOrStart4, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), wrapQuotes(endOrCountOrDispatchEvent1), ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), wrapQuotes(endOrCountOrDispatchEvent1), ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange30() {
        if (!setSelectRange30.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange30) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange31 = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Interval typeOrUnitOrStart4, String endOrCountOrDispatchEvent1, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), wrapQuotes(endOrCountOrDispatchEvent1), wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), wrapQuotes(endOrCountOrDispatchEvent1), wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange31() {
        if (!setSelectRange31.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange31) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange32 = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Interval typeOrUnitOrStart4, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), wrapQuotes(endOrCountOrDispatchEvent1), anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), wrapQuotes(endOrCountOrDispatchEvent1), anchorOrDispatchEvent2, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange32() {
        if (!setSelectRange32.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange32) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange33 = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Interval typeOrUnitOrStart4, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent2, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent2, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange33() {
        if (!setSelectRange33.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange33) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange34 = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Interval typeOrUnitOrStart4, Boolean endOrCountOrDispatchEvent2, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent2, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent2, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange34() {
        if (!setSelectRange34.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange34) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<ChartsStock> setSelectRange35 = new ArrayList<>();

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Interval typeOrUnitOrStart4, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent2, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent2, anchorOrDispatchEvent2, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectRange35() {
        if (!setSelectRange35.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChartsStock item : setSelectRange35) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean repeat;
    private Boolean asRect;
    private List<ChartsStock> setStartZoomMarquee = new ArrayList<>();

    /**
     * Starts zoom marquee.
     */
    public ChartsStock startZoomMarquee(Boolean repeat, Boolean asRect) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".startZoomMarquee(%b, %b)", repeat, asRect));

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

    /**
     * Getter for the current stock chart X-scale.
     */
    public StockScatterDateTime getXScale() {
        if (getXScale == null)
            getXScale = new StockScatterDateTime(jsBase + ".xScale()");

        return getXScale;
    }
    private String xScale;
    private String xScale1;
    private List<ChartsStock> setXScale = new ArrayList<>();

    /**
     * Setter for stock chart X-scale.
     */
    public ChartsStock setXScale(String xScale) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".xScale(%s)", wrapQuotes(xScale)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".xScale(%s)", wrapQuotes(xScale)));
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

    /**
     * Setter for fill settings using an array or a string.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock setZoomMarqueeFill(Fill zoomMarqueeFill) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s)", ((zoomMarqueeFill != null) ? zoomMarqueeFill.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s)", ((zoomMarqueeFill != null) ? zoomMarqueeFill.generateJs() : "null")));
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

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public ChartsStock zoomMarqueeFill(String color, Double opacity) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %f)", wrapQuotes(color), opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %f)", wrapQuotes(color), opacity));
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

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %f, %f)", arrayToString(keys), mode, angle, opacity1));

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

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
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

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
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

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %f, %f)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
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

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
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

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %f, %f)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
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

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
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

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %f, %f, %s, %f, %f, %f)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
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

    /**
     * Setter for the zoom marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Chart setZoomMarqueeStroke(Stroke color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setZoomMarqueeStroke" + ++variableIndex + " = " + jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s);", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
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

    /**
     * Setter for the zoom marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Chart setZoomMarqueeStroke(ColoredFill color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setZoomMarqueeStroke1" + ++variableIndex + " = " + jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s);", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
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

    /**
     * Setter for the zoom marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Chart setZoomMarqueeStroke(String color3, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setZoomMarqueeStroke2" + ++variableIndex + " = " + jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s);", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomMarqueeStroke(%s, %f, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
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
        if (!getPlot1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Plot item : getPlot1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
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
        js.append(generateJSsetSelectRange24());
        js.append(generateJSsetSelectRange25());
        js.append(generateJSsetSelectRange26());
        js.append(generateJSsetSelectRange27());
        js.append(generateJSsetSelectRange28());
        js.append(generateJSsetSelectRange29());
        js.append(generateJSsetSelectRange30());
        js.append(generateJSsetSelectRange31());
        js.append(generateJSsetSelectRange32());
        js.append(generateJSsetSelectRange33());
        js.append(generateJSsetSelectRange34());
        js.append(generateJSsetSelectRange35());
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
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}