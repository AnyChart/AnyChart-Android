package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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

        ListenersInterface.getInstance().setOnClickListener(listener);
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


    private Controller getEventMarkers;

    /**
     * Getter for the event markers controller.
     */
    public Controller getEventMarkers() {
        if (getEventMarkers == null)
            getEventMarkers = new Controller(jsBase + ".eventMarkers()");

        return getEventMarkers;
    }
    private String eventMarkers;
    private Boolean eventMarkers1;

    /**
     * Setter for the event markers controller.
     */
    public ChartsStock setEventMarkers(String eventMarkers) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".eventMarkers(%s)", wrapQuotes(eventMarkers)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".eventMarkers(%s)", wrapQuotes(eventMarkers)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the event markers controller.
     */
    public ChartsStock setEventMarkers(Boolean eventMarkers1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".eventMarkers(%b)", eventMarkers1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".eventMarkers(%b)", eventMarkers1));
            js.setLength(0);
        }
        return this;
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
    public Plot getPlot(Number index) {
        Plot item = new Plot(jsBase + ".plot("+ index+")");
        getPlot1.add(item);
        return item;
    }
    private String plot;
    private Boolean plot1;

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

    private Number index1;
    private String plot2;
    private Boolean plot3;

    /**
     * Setter for the plots by index.
     */
    public ChartsStock setPlot(String plot2, Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".plot(%s, %s)", wrapQuotes(plot2), index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".plot(%s, %s)", wrapQuotes(plot2), index1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the plots by index.
     */
    public ChartsStock setPlot(Boolean plot3, Number index1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".plot(%b, %s)", plot3, index1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".plot(%b, %s)", plot3, index1));
            js.setLength(0);
        }
        return this;
    }

    private Boolean preserveSelectedRangeOnDataUpdate;

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

    private Number typeOrUnitOrStart;
    private String typeOrUnitOrStart1;
    private StockRangeType typeOrUnitOrStart2;
    private String typeOrUnitOrStart3;
    private Interval typeOrUnitOrStart4;
    private Number endOrCountOrDispatchEvent;
    private String endOrCountOrDispatchEvent1;
    private Boolean endOrCountOrDispatchEvent2;
    private StockRangeAnchor anchorOrDispatchEvent;
    private String anchorOrDispatchEvent1;
    private Boolean anchorOrDispatchEvent2;
    private Boolean dispatchEvent;

    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Number typeOrUnitOrStart, Number endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Number typeOrUnitOrStart, Number endOrCountOrDispatchEvent, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Number typeOrUnitOrStart, Number endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Number typeOrUnitOrStart, String endOrCountOrDispatchEvent1, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", typeOrUnitOrStart, wrapQuotes(endOrCountOrDispatchEvent1), ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", typeOrUnitOrStart, wrapQuotes(endOrCountOrDispatchEvent1), ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Number typeOrUnitOrStart, String endOrCountOrDispatchEvent1, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", typeOrUnitOrStart, wrapQuotes(endOrCountOrDispatchEvent1), wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", typeOrUnitOrStart, wrapQuotes(endOrCountOrDispatchEvent1), wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Number typeOrUnitOrStart, String endOrCountOrDispatchEvent1, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", typeOrUnitOrStart, wrapQuotes(endOrCountOrDispatchEvent1), anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", typeOrUnitOrStart, wrapQuotes(endOrCountOrDispatchEvent1), anchorOrDispatchEvent2, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Number typeOrUnitOrStart, Boolean endOrCountOrDispatchEvent2, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Number typeOrUnitOrStart, Boolean endOrCountOrDispatchEvent2, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %s, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Number typeOrUnitOrStart, Boolean endOrCountOrDispatchEvent2, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %b, %b, %b)", typeOrUnitOrStart, endOrCountOrDispatchEvent2, anchorOrDispatchEvent2, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(String typeOrUnitOrStart1, Number endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(String typeOrUnitOrStart1, Number endOrCountOrDispatchEvent, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(String typeOrUnitOrStart1, Number endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", wrapQuotes(typeOrUnitOrStart1), endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


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


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Number endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Number endOrCountOrDispatchEvent, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(StockRangeType typeOrUnitOrStart2, Number endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", ((typeOrUnitOrStart2 != null) ? typeOrUnitOrStart2.generateJs() : "null"), endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


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


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Interval typeOrUnitOrStart4, Number endOrCountOrDispatchEvent, StockRangeAnchor anchorOrDispatchEvent, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent, ((anchorOrDispatchEvent != null) ? anchorOrDispatchEvent.generateJs() : "null"), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Interval typeOrUnitOrStart4, Number endOrCountOrDispatchEvent, String anchorOrDispatchEvent1, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %s, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent, wrapQuotes(anchorOrDispatchEvent1), dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Selects passed range and initiates data redraw.
     */
    public ChartsStock selectRange(Interval typeOrUnitOrStart4, Number endOrCountOrDispatchEvent, Boolean anchorOrDispatchEvent2, Boolean dispatchEvent) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectRange(%s, %s, %b, %b)", ((typeOrUnitOrStart4 != null) ? typeOrUnitOrStart4.generateJs() : "null"), endOrCountOrDispatchEvent, anchorOrDispatchEvent2, dispatchEvent));
            js.setLength(0);
        }
        return this;
    }


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

    private Boolean repeat;
    private Boolean asRect;

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

    private Fill zoomMarqueeFill;

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

    private String color;
    private Number opacity;

    /**
     * Fill color with opacity. Fill as a string or an object.
     */
    public ChartsStock zoomMarqueeFill(String color, Number opacity) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s)", wrapQuotes(color), opacity));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s)", wrapQuotes(color), opacity));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Number angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Number opacity1;

    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(GradientKey[] keys, Boolean mode, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %s, %s)", arrayToString(keys), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %s, %s)", arrayToString(keys), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(GradientKey[] keys, VectorRect mode1, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %s, %s)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %s, %s)", arrayToString(keys), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(GradientKey[] keys, String mode2, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %s, %s)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %s, %s)", arrayToString(keys), wrapQuotes(mode2), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(String[] keys1, Boolean mode, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %s, %s)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %b, %s, %s)", arrayToStringWrapQuotes(keys1), mode, angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(String[] keys1, VectorRect mode1, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), ((mode1 != null) ? mode1.generateJs() : "null"), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Linear gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(String[] keys1, String mode2, Number angle, Number opacity1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %s, %s)", arrayToStringWrapQuotes(keys1), wrapQuotes(mode2), angle, opacity1));
            js.setLength(0);
        }
        return this;
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Number cx;
    private Number cy;
    private GraphicsMathRect mode3;
    private Number opacity2;
    private Number fx;
    private Number fy;

    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(GradientKey[] keys2, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %s, %s, %s, %s, %s)", arrayToString(keys2), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Radial gradient fill.
{docs:Graphics/Fill_Settings}Learn more about coloring.{docs}
     */
    public ChartsStock zoomMarqueeFill(String[] keys3, Number cx, Number cy, GraphicsMathRect mode3, Number opacity2, Number fx, Number fy) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomMarqueeFill(%s, %s, %s, %s, %s, %s, %s)", arrayToStringWrapQuotes(keys3), cx, cy, ((mode3 != null) ? mode3.generateJs() : "null"), opacity2, fx, fy));
            js.setLength(0);
        }
        return this;
    }

    private Fill imageSettings;
    private Stroke color1;
    private ColoredFill color2;
    private String color3;
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<Chart> setZoomMarqueeStroke = new ArrayList<>();

    /**
     * Setter for the zoom marquee stroke.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Chart setZoomMarqueeStroke(Stroke color1, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setZoomMarqueeStroke" + ++variableIndex + " = " + jsBase + ".zoomMarqueeStroke(%s, %s, %s, %s, %s);", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomMarqueeStroke(%s, %s, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
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
    public Chart setZoomMarqueeStroke(ColoredFill color2, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setZoomMarqueeStroke1" + ++variableIndex + " = " + jsBase + ".zoomMarqueeStroke(%s, %s, %s, %s, %s);", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomMarqueeStroke(%s, %s, %s, %s, %s)", ((color2 != null) ? color2.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
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
    public Chart setZoomMarqueeStroke(String color3, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var setZoomMarqueeStroke2" + ++variableIndex + " = " + jsBase + ".zoomMarqueeStroke(%s, %s, %s, %s, %s);", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".zoomMarqueeStroke(%s, %s, %s, %s, %s)", wrapQuotes(color3), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
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

    private String generateJSgetEventMarkers() {
        if (getEventMarkers != null) {
            return getEventMarkers.generateJs();
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
        js.append(generateJSgetEventMarkers());
        js.append(generateJSgetGrouping());
        js.append(generateJSgetInteractivity());
        js.append(generateJSgetPlot());
        js.append(generateJSgetPlot1());
        js.append(generateJSgetScroller());
        js.append(generateJSgetScrollerGrouping());
        js.append(generateJSgetXScale());
        js.append(generateJSsetInteractivity());
        js.append(generateJSsetInteractivity1());
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