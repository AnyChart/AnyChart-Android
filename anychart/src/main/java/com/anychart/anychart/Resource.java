package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * Resource chart class.
 */
public class Resource extends Chart {

    protected Resource(String name) {
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

    

    private Activities getActivities;

    /**
     * Getter for the activities settings.
     */
    public Activities getActivities() {
        if (getActivities == null)
            getActivities = new Activities(jsBase + ".activities()");

        return getActivities;
    }
    private String activities;

    /**
     * Setter for the activities settings.
     */
    public Resource setActivities(String activities) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".activities(%s)", wrapQuotes(activities)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".activities(%s)", wrapQuotes(activities)));
            js.setLength(0);
        }
        return this;
    }


    private Calendar getCalendar;

    /**
     * Getter for the calendar.
     */
    public Calendar getCalendar() {
        if (getCalendar == null)
            getCalendar = new Calendar(jsBase + ".calendar()");

        return getCalendar;
    }
    private String calendar;

    /**
     * Setter for calendar.
     */
    public Resource setCalendar(String calendar) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".calendar(%s)", wrapQuotes(calendar)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".calendar(%s)", wrapQuotes(calendar)));
            js.setLength(0);
        }
        return this;
    }


    private UtilsPadding getCellPadding;

    /**
     * Getter for the cell padding.
     */
    public UtilsPadding getCellPadding() {
        if (getCellPadding == null)
            getCellPadding = new UtilsPadding(jsBase + ".cellPadding()");

        return getCellPadding;
    }
    private Number[] cellPadding;
    private String[] cellPadding1;
    private String cellPadding2;

    /**
     * Setter for cell paddings in pixels using a single value.
     */
    public Resource setCellPadding(Number[] cellPadding) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s)", Arrays.toString(cellPadding)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s)", Arrays.toString(cellPadding)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for cell paddings in pixels using a single value.
     */
    public Resource setCellPadding(String[] cellPadding1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s)", arrayToStringWrapQuotes(cellPadding1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s)", arrayToStringWrapQuotes(cellPadding1)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for cell paddings in pixels using a single value.
     */
    public Resource setCellPadding(String cellPadding2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s)", wrapQuotes(cellPadding2)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s)", wrapQuotes(cellPadding2)));
            js.setLength(0);
        }
        return this;
    }

    private String value;
    private Number value1;
    private String value2;
    private Number value3;
    private String value4;
    private Number value5;
    private String value6;
    private Number value7;

    /**
     * Setter for cell paddings in pixels using several numbers.
     */
    public Resource setCellPadding(String value, String value2, String value4, String value6) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for cell paddings in pixels using several numbers.
     */
    public Resource setCellPadding(Number value1, Number value3, Number value5, Number value7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%s, %s, %s, %s)", value1, value3, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%s, %s, %s, %s)", value1, value3, value5, value7));
            js.setLength(0);
        }
        return this;
    }


    private Conflicts getConflicts;

    /**
     * Getter for the conflicts settings.
     */
    public Conflicts getConflicts() {
        if (getConflicts == null)
            getConflicts = new Conflicts(jsBase + ".conflicts()");

        return getConflicts;
    }
    private String conflicts;

    /**
     * Setter for the conflicts settings.
     */
    public Resource setConflicts(String conflicts) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".conflicts(%s)", wrapQuotes(conflicts)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".conflicts(%s)", wrapQuotes(conflicts)));
            js.setLength(0);
        }
        return this;
    }

    private Number currentStartDate;
    private String currentStartDate1;

    /**
     * Setter for the current start date.
     */
    public Resource setCurrentStartDate(Number currentStartDate) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".currentStartDate(%s)", currentStartDate));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".currentStartDate(%s)", currentStartDate));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the current start date.
     */
    public Resource setCurrentStartDate(String currentStartDate1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".currentStartDate(%s)", wrapQuotes(currentStartDate1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".currentStartDate(%s)", wrapQuotes(currentStartDate1)));
            js.setLength(0);
        }
        return this;
    }


    private View getData;

    /**
     * Getter for the chart data.
     */
    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for the chart data.
Learn more about mapping at {@link anychart.data.Mapping}.
     */
    public Resource setData(List<DataEntry> data) {
    if (isChain) {
        js.append(";");
        isChain = false;
    }

    if (!data.isEmpty()) {
        StringBuilder resultData = new StringBuilder();
        resultData.append("[");
        for (DataEntry dataEntry : data) {
            resultData.append(dataEntry.generateJs()).append(",");
        }
        resultData.setLength(resultData.length() - 1);
        resultData.append("]");

        js.append(String.format(Locale.US, "var setData" + ++variableIndex + " = " + jsBase + ".data(%s);", resultData.toString()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", resultData.toString()));
            js.setLength(0);
        }
    }
        return this;
    }


    /**
     * 
     */
    public Resource setData(View view) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(view.generateJs());
        js.append(String.format(Locale.US, "var setData1" + ++variableIndex + " = " + jsBase + ".data(%s);",  view.getJsBase()));
        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s);", view.getJsBase()));
            js.setLength(0);
        }
        return this;
    }

    private Number defaultMinutesPerDay;

    /**
     * Setter for default minutes per day.
<b>Note:</b> Use method when number of minutes per day isn't specified in the data.
     */
    public Resource setDefaultMinutesPerDay(Number defaultMinutesPerDay) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultMinutesPerDay(%s)", defaultMinutesPerDay));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultMinutesPerDay(%s)", defaultMinutesPerDay));
            js.setLength(0);
        }
        return this;
    }


    private Grid getGrid;

    /**
     * Getter for the grid.
     */
    public Grid getGrid() {
        if (getGrid == null)
            getGrid = new Grid(jsBase + ".grid()");

        return getGrid;
    }
    private String grid;
    private Boolean grid1;

    /**
     * Setter for the grid.
     */
    public Resource setGrid(String grid) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grid(%s)", wrapQuotes(grid)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".grid(%s)", wrapQuotes(grid)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the grid.
     */
    public Resource setGrid(Boolean grid1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".grid(%b)", grid1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".grid(%b)", grid1));
            js.setLength(0);
        }
        return this;
    }


    private UiScroller getHorizontalScrollBar;

    /**
     * Getter for the horizontal scrollbar.
     */
    public UiScroller getHorizontalScrollBar() {
        if (getHorizontalScrollBar == null)
            getHorizontalScrollBar = new UiScroller(jsBase + ".horizontalScrollBar()");

        return getHorizontalScrollBar;
    }
    private String horizontalScrollBar;
    private Boolean horizontalScrollBar1;

    /**
     * Setter for the horizontal scrollbar.
     */
    public Resource setHorizontalScrollBar(String horizontalScrollBar) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".horizontalScrollBar(%s)", wrapQuotes(horizontalScrollBar)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".horizontalScrollBar(%s)", wrapQuotes(horizontalScrollBar)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the horizontal scrollbar.
     */
    public Resource setHorizontalScrollBar(Boolean horizontalScrollBar1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".horizontalScrollBar(%b)", horizontalScrollBar1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".horizontalScrollBar(%b)", horizontalScrollBar1));
            js.setLength(0);
        }
        return this;
    }

    private Number resourceIndex;
    private Number activityIndex;

    /**
     * Setter for the hover state on an activity.<br/>
Hovers an activity determined by the resourceIndex and the activityIndex.
     */
    public Resource setHover(Number resourceIndex, Number activityIndex) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%s, %s)", resourceIndex, activityIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%s, %s)", resourceIndex, activityIndex));
            js.setLength(0);
        }
        return this;
    }

    private Number globalIndex;

    /**
     * Hovers an activity by its global index.
     */
    public Resource hoverPoint(Number globalIndex) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hoverPoint(%s)", globalIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hoverPoint(%s)", globalIndex));
            js.setLength(0);
        }
        return this;
    }


    private Logo getLogo;

    /**
     * Getter for the logo.
     */
    public Logo getLogo() {
        if (getLogo == null)
            getLogo = new Logo(jsBase + ".logo()");

        return getLogo;
    }
    private String logo;

    /**
     * Setter for the logo.
     */
    public Resource setLogo(String logo) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".logo(%s)", wrapQuotes(logo)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".logo(%s)", wrapQuotes(logo)));
            js.setLength(0);
        }
        return this;
    }

    private Number minRowHeight;

    /**
     * Setter for the minimal row height.
     */
    public Resource setMinRowHeight(Number minRowHeight) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minRowHeight(%s)", minRowHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minRowHeight(%s)", minRowHeight));
            js.setLength(0);
        }
        return this;
    }


    private Overlay getOverlay;

    /**
     * Getter for the overlay element.
     */
    public Overlay getOverlay() {
        if (getOverlay == null)
            getOverlay = new Overlay(jsBase + ".overlay()");

        return getOverlay;
    }
    private String overlay;
    private Boolean overlay1;

    /**
     * Setter for the overlay element.
     */
    public Resource setOverlay(String overlay) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".overlay(%s)", wrapQuotes(overlay)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".overlay(%s)", wrapQuotes(overlay)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the overlay element.
     */
    public Resource setOverlay(Boolean overlay1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".overlay(%b)", overlay1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".overlay(%b)", overlay1));
            js.setLength(0);
        }
        return this;
    }

    private Number pixPerHour;

    /**
     * Setter for hours row height in pixels.
     */
    public Resource setPixPerHour(Number pixPerHour) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pixPerHour(%s)", pixPerHour));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pixPerHour(%s)", pixPerHour));
            js.setLength(0);
        }
        return this;
    }

    private Number resourceListWidth;
    private String resourceListWidth1;

    /**
     * Setter for the resource list width.
     */
    public Resource setResourceListWidth(Number resourceListWidth) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".resourceListWidth(%s)", resourceListWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".resourceListWidth(%s)", resourceListWidth));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the resource list width.
     */
    public Resource setResourceListWidth(String resourceListWidth1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".resourceListWidth(%s)", wrapQuotes(resourceListWidth1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".resourceListWidth(%s)", wrapQuotes(resourceListWidth1)));
            js.setLength(0);
        }
        return this;
    }

    private Number resourceIndex1;
    private Number activityIndex1;

    /**
     * Setter for the select state on an activity.<br/>
Selects an activity determined by the resourceIndex and the activityIndex.
     */
    public Resource setSelect(Number resourceIndex1, Number activityIndex1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%s, %s)", resourceIndex1, activityIndex1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%s, %s)", resourceIndex1, activityIndex1));
            js.setLength(0);
        }
        return this;
    }

    private Number globalIndex1;

    /**
     * Selects an activity by its global index.
     */
    public Resource selectPoint(Number globalIndex1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectPoint(%s)", globalIndex1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectPoint(%s)", globalIndex1));
            js.setLength(0);
        }
        return this;
    }

    private Stroke color;
    private ColoredFill color1;
    private String color2;
    private Number thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    /**
     * Setter for the splitter stroke.
     */
    public Resource setSplitterStroke(Stroke color, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterStroke(%s, %s, %s, %s, %s)", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterStroke(%s, %s, %s, %s, %s)", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the splitter stroke.
     */
    public Resource setSplitterStroke(ColoredFill color1, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterStroke(%s, %s, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterStroke(%s, %s, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the splitter stroke.
     */
    public Resource setSplitterStroke(String color2, Number thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterStroke(%s, %s, %s, %s, %s)", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterStroke(%s, %s, %s, %s, %s)", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    private CoreResourceTimeline getTimeLine;

    /**
     * Getter for the time line.
     */
    public CoreResourceTimeline getTimeLine() {
        if (getTimeLine == null)
            getTimeLine = new CoreResourceTimeline(jsBase + ".timeLine()");

        return getTimeLine;
    }
    private String timeLine;
    private Boolean timeLine1;

    /**
     * Setter for the time line.
     */
    public Resource setTimeLine(String timeLine) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeLine(%s)", wrapQuotes(timeLine)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeLine(%s)", wrapQuotes(timeLine)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the time line.
     */
    public Resource setTimeLine(Boolean timeLine1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeLine(%b)", timeLine1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeLine(%b)", timeLine1));
            js.setLength(0);
        }
        return this;
    }

    private Number timeLineHeight;
    private String timeLineHeight1;

    /**
     * Setter for the time line height.
     */
    public Resource setTimeLineHeight(Number timeLineHeight) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeLineHeight(%s)", timeLineHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeLineHeight(%s)", timeLineHeight));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the time line height.
     */
    public Resource setTimeLineHeight(String timeLineHeight1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeLineHeight(%s)", wrapQuotes(timeLineHeight1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeLineHeight(%s)", wrapQuotes(timeLineHeight1)));
            js.setLength(0);
        }
        return this;
    }

    private TimeTrackingMode timeTrackingMode;
    private String timeTrackingMode1;

    /**
     * Setter for the time tracking mode.
     */
    public Resource setTimeTrackingMode(TimeTrackingMode timeTrackingMode) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeTrackingMode(%s)", ((timeTrackingMode != null) ? timeTrackingMode.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeTrackingMode(%s)", ((timeTrackingMode != null) ? timeTrackingMode.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the time tracking mode.
     */
    public Resource setTimeTrackingMode(String timeTrackingMode1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeTrackingMode(%s)", wrapQuotes(timeTrackingMode1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeTrackingMode(%s)", wrapQuotes(timeTrackingMode1)));
            js.setLength(0);
        }
        return this;
    }

    private Number resourceIndex2;
    private Number[] resourceIndex3;
    private Number activityIndex2;

    /**
     * Removes hover from an activity by index.
     */
    public Resource unhover(Number resourceIndex2, Number activityIndex2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unhover(%s, %s)", resourceIndex2, activityIndex2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unhover(%s, %s)", resourceIndex2, activityIndex2));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Removes hover from an activity by index.
     */
    public Resource unhover(Number[] resourceIndex3, Number activityIndex2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unhover(%s, %s)", Arrays.toString(resourceIndex3), activityIndex2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unhover(%s, %s)", Arrays.toString(resourceIndex3), activityIndex2));
            js.setLength(0);
        }
        return this;
    }

    private Number resourceIndex4;
    private Number[] resourceIndex5;
    private Number activityIndex3;

    /**
     * Removes select from an activity by index.
     */
    public void unselect(Number resourceIndex4, Number activityIndex3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".unselect(%s, %s);", resourceIndex4, activityIndex3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%s, %s)", resourceIndex4, activityIndex3));
            js.setLength(0);
        }
    }


    /**
     * Removes select from an activity by index.
     */
    public void unselect(Number[] resourceIndex5, Number activityIndex3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".unselect(%s, %s);", Arrays.toString(resourceIndex5), activityIndex3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%s, %s)", Arrays.toString(resourceIndex5), activityIndex3));
            js.setLength(0);
        }
    }


    private UiScroller getVerticalScrollBar;

    /**
     * Getter for the vertical scrollbar.
     */
    public UiScroller getVerticalScrollBar() {
        if (getVerticalScrollBar == null)
            getVerticalScrollBar = new UiScroller(jsBase + ".verticalScrollBar()");

        return getVerticalScrollBar;
    }
    private String verticalScrollBar;
    private Boolean verticalScrollBar1;

    /**
     * Setter for the vertical scrollbar.
     */
    public Resource setVerticalScrollBar(String verticalScrollBar) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".verticalScrollBar(%s)", wrapQuotes(verticalScrollBar)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".verticalScrollBar(%s)", wrapQuotes(verticalScrollBar)));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the vertical scrollbar.
     */
    public Resource setVerticalScrollBar(Boolean verticalScrollBar1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".verticalScrollBar(%b)", verticalScrollBar1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".verticalScrollBar(%b)", verticalScrollBar1));
            js.setLength(0);
        }
        return this;
    }


    private DateTimeWithCalendar getXScale;

    /**
     * Getter for the X scale.
     */
    public DateTimeWithCalendar getXScale() {
        if (getXScale == null)
            getXScale = new DateTimeWithCalendar(jsBase + ".xScale()");

        return getXScale;
    }
    private String xScale;

    /**
     * Setter for the X scale.
     */
    public Resource setXScale(String xScale) {
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

    private Number indexOrId;
    private String indexOrId1;

    /**
     * Setter for the zoom level.
Zooms chart to the level denoted by the passed index or identifier.
     */
    public Resource setZoomLevel(Number indexOrId) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomLevel(%s)", indexOrId));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomLevel(%s)", indexOrId));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for the zoom level.
Zooms chart to the level denoted by the passed index or identifier.
     */
    public Resource setZoomLevel(String indexOrId1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomLevel(%s)", wrapQuotes(indexOrId1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomLevel(%s)", wrapQuotes(indexOrId1)));
            js.setLength(0);
        }
        return this;
    }

    private ZoomLevel[] zoomLevels;

    /**
     * Setter for zoom levels set.
     */
    public Resource setZoomLevels(ZoomLevel[] zoomLevels) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomLevels(%s)", arrayToString(zoomLevels)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomLevels(%s)", arrayToString(zoomLevels)));
            js.setLength(0);
        }
        return this;
    }

    private String generateJSgetActivities() {
        if (getActivities != null) {
            return getActivities.generateJs();
        }
        return "";
    }

    private String generateJSgetCalendar() {
        if (getCalendar != null) {
            return getCalendar.generateJs();
        }
        return "";
    }

    private String generateJSgetCellPadding() {
        if (getCellPadding != null) {
            return getCellPadding.generateJs();
        }
        return "";
    }

    private String generateJSgetConflicts() {
        if (getConflicts != null) {
            return getConflicts.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetGrid() {
        if (getGrid != null) {
            return getGrid.generateJs();
        }
        return "";
    }

    private String generateJSgetHorizontalScrollBar() {
        if (getHorizontalScrollBar != null) {
            return getHorizontalScrollBar.generateJs();
        }
        return "";
    }

    private String generateJSgetLogo() {
        if (getLogo != null) {
            return getLogo.generateJs();
        }
        return "";
    }

    private String generateJSgetOverlay() {
        if (getOverlay != null) {
            return getOverlay.generateJs();
        }
        return "";
    }

    private String generateJSgetTimeLine() {
        if (getTimeLine != null) {
            return getTimeLine.generateJs();
        }
        return "";
    }

    private String generateJSgetVerticalScrollBar() {
        if (getVerticalScrollBar != null) {
            return getVerticalScrollBar.generateJs();
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
        js.append(generateJSgetActivities());
        js.append(generateJSgetCalendar());
        js.append(generateJSgetCellPadding());
        js.append(generateJSgetConflicts());
        js.append(generateJSgetData());
        js.append(generateJSgetGrid());
        js.append(generateJSgetHorizontalScrollBar());
        js.append(generateJSgetLogo());
        js.append(generateJSgetOverlay());
        js.append(generateJSgetTimeLine());
        js.append(generateJSgetVerticalScrollBar());
        js.append(generateJSgetXScale());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}