package com.anychart.anychart;

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

    public Resource setData(SingleValueDataSet data) {
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

    public Resource setData(List<DataEntry> data) {
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

    public Resource setData(List<DataEntry> data, TreeFillingMethod mode) {
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
    private List<Resource> setActivities = new ArrayList<>();

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
    private String generateJSsetActivities() {
        if (!setActivities.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setActivities) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Resource> setCalendar = new ArrayList<>();

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
    private String generateJSsetCalendar() {
        if (!setCalendar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCalendar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private Double[] cellPadding;
    private String[] cellPadding1;
    private String cellPadding2;
    private List<Resource> setCellPadding = new ArrayList<>();

    /**
     * Setter for cell paddings in pixels using a single value.
     */
    public Resource setCellPadding(Double[] cellPadding) {
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
    private String generateJSsetCellPadding() {
        if (!setCellPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding1 = new ArrayList<>();

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
    private String generateJSsetCellPadding1() {
        if (!setCellPadding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding2 = new ArrayList<>();

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
    private String generateJSsetCellPadding2() {
        if (!setCellPadding2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;
    private List<Resource> setCellPadding3 = new ArrayList<>();

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
    private String generateJSsetCellPadding3() {
        if (!setCellPadding3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCellPadding4 = new ArrayList<>();

    /**
     * Setter for cell paddings in pixels using several numbers.
     */
    public Resource setCellPadding(Double value1, Double value3, Double value5, Double value7) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".cellPadding(%f, %f, %f, %f)", value1, value3, value5, value7));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".cellPadding(%f, %f, %f, %f)", value1, value3, value5, value7));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCellPadding4() {
        if (!setCellPadding4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCellPadding4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Resource> setConflicts = new ArrayList<>();

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
    private String generateJSsetConflicts() {
        if (!setConflicts.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setConflicts) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double currentStartDate;
    private String currentStartDate1;
    private List<Resource> setCurrentStartDate = new ArrayList<>();

    /**
     * Setter for the current start date.
     */
    public Resource setCurrentStartDate(Double currentStartDate) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".currentStartDate(%f)", currentStartDate));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".currentStartDate(%f)", currentStartDate));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCurrentStartDate() {
        if (!setCurrentStartDate.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCurrentStartDate) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setCurrentStartDate1 = new ArrayList<>();

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
    private String generateJSsetCurrentStartDate1() {
        if (!setCurrentStartDate1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setCurrentStartDate1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Resource> setData = new ArrayList<>();

    /**
     * Setter for the chart data.
Learn more about mapping at {@link anychart.data.Mapping}.
     */
    public Resource data(List<DataEntry> data) {
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
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double defaultMinutesPerDay;
    private List<Resource> setDefaultMinutesPerDay = new ArrayList<>();

    /**
     * Setter for default minutes per day.
<b>Note:</b> Use method when number of minutes per day isn't specified in the data.
     */
    public Resource setDefaultMinutesPerDay(Double defaultMinutesPerDay) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".defaultMinutesPerDay(%f)", defaultMinutesPerDay));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".defaultMinutesPerDay(%f)", defaultMinutesPerDay));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetDefaultMinutesPerDay() {
        if (!setDefaultMinutesPerDay.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setDefaultMinutesPerDay) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Resource> setGrid = new ArrayList<>();

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
    private String generateJSsetGrid() {
        if (!setGrid.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setGrid) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setGrid1 = new ArrayList<>();

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
    private String generateJSsetGrid1() {
        if (!setGrid1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setGrid1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Resource> setHorizontalScrollBar = new ArrayList<>();

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
    private String generateJSsetHorizontalScrollBar() {
        if (!setHorizontalScrollBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setHorizontalScrollBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setHorizontalScrollBar1 = new ArrayList<>();

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
    private String generateJSsetHorizontalScrollBar1() {
        if (!setHorizontalScrollBar1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setHorizontalScrollBar1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double resourceIndex;
    private Double activityIndex;
    private List<Resource> setHover = new ArrayList<>();

    /**
     * Setter for the hover state on an activity.<br/>
Hovers an activity determined by the resourceIndex and the activityIndex.
     */
    public Resource setHover(Double resourceIndex, Double activityIndex) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hover(%f, %f)", resourceIndex, activityIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hover(%f, %f)", resourceIndex, activityIndex));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHover() {
        if (!setHover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setHover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double globalIndex;
    private List<Resource> setHoverPoint = new ArrayList<>();

    /**
     * Hovers an activity by its global index.
     */
    public Resource hoverPoint(Double globalIndex) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".hoverPoint(%f)", globalIndex));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".hoverPoint(%f)", globalIndex));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHoverPoint() {
        if (!setHoverPoint.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setHoverPoint) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Resource> setLogo = new ArrayList<>();

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
    private String generateJSsetLogo() {
        if (!setLogo.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setLogo) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minRowHeight;
    private List<Resource> setMinRowHeight = new ArrayList<>();

    /**
     * Setter for the minimal row height.
     */
    public Resource setMinRowHeight(Double minRowHeight) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".minRowHeight(%f)", minRowHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".minRowHeight(%f)", minRowHeight));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMinRowHeight() {
        if (!setMinRowHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setMinRowHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Resource> setOverlay = new ArrayList<>();

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
    private String generateJSsetOverlay() {
        if (!setOverlay.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setOverlay) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setOverlay1 = new ArrayList<>();

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
    private String generateJSsetOverlay1() {
        if (!setOverlay1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setOverlay1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double pixPerHour;
    private List<Resource> setPixPerHour = new ArrayList<>();

    /**
     * Setter for hours row height in pixels.
     */
    public Resource setPixPerHour(Double pixPerHour) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".pixPerHour(%f)", pixPerHour));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".pixPerHour(%f)", pixPerHour));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetPixPerHour() {
        if (!setPixPerHour.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setPixPerHour) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double resourceListWidth;
    private String resourceListWidth1;
    private List<Resource> setResourceListWidth = new ArrayList<>();

    /**
     * Setter for the resource list width.
     */
    public Resource setResourceListWidth(Double resourceListWidth) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".resourceListWidth(%f)", resourceListWidth));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".resourceListWidth(%f)", resourceListWidth));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetResourceListWidth() {
        if (!setResourceListWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setResourceListWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setResourceListWidth1 = new ArrayList<>();

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
    private String generateJSsetResourceListWidth1() {
        if (!setResourceListWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setResourceListWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double resourceIndex1;
    private Double activityIndex1;
    private List<Resource> setSelect = new ArrayList<>();

    /**
     * Setter for the select state on an activity.<br/>
Selects an activity determined by the resourceIndex and the activityIndex.
     */
    public Resource setSelect(Double resourceIndex1, Double activityIndex1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".select(%f, %f)", resourceIndex1, activityIndex1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".select(%f, %f)", resourceIndex1, activityIndex1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelect() {
        if (!setSelect.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setSelect) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double globalIndex1;
    private List<Resource> setSelectPoint = new ArrayList<>();

    /**
     * Selects an activity by its global index.
     */
    public Resource selectPoint(Double globalIndex1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".selectPoint(%f)", globalIndex1));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".selectPoint(%f)", globalIndex1));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSelectPoint() {
        if (!setSelectPoint.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setSelectPoint) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color;
    private ColoredFill color1;
    private String color2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<Resource> setSplitterStroke = new ArrayList<>();

    /**
     * Setter for the splitter stroke.
     */
    public Resource setSplitterStroke(Stroke color, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSplitterStroke() {
        if (!setSplitterStroke.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setSplitterStroke) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setSplitterStroke1 = new ArrayList<>();

    /**
     * Setter for the splitter stroke.
     */
    public Resource setSplitterStroke(ColoredFill color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSplitterStroke1() {
        if (!setSplitterStroke1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setSplitterStroke1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setSplitterStroke2 = new ArrayList<>();

    /**
     * Setter for the splitter stroke.
     */
    public Resource setSplitterStroke(String color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".splitterStroke(%s, %f, %s, %s, %s)", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetSplitterStroke2() {
        if (!setSplitterStroke2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setSplitterStroke2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private TimeLine getTimeLine;

    /**
     * Getter for the time line.
     */
    public TimeLine getTimeLine() {
        if (getTimeLine == null)
            getTimeLine = new TimeLine(jsBase + ".timeLine()");

        return getTimeLine;
    }
    private String timeLine;
    private Boolean timeLine1;
    private List<Resource> setTimeLine = new ArrayList<>();

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
    private String generateJSsetTimeLine() {
        if (!setTimeLine.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setTimeLine) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setTimeLine1 = new ArrayList<>();

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
    private String generateJSsetTimeLine1() {
        if (!setTimeLine1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setTimeLine1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double timeLineHeight;
    private String timeLineHeight1;
    private List<Resource> setTimeLineHeight = new ArrayList<>();

    /**
     * Setter for the time line height.
     */
    public Resource setTimeLineHeight(Double timeLineHeight) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".timeLineHeight(%f)", timeLineHeight));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".timeLineHeight(%f)", timeLineHeight));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTimeLineHeight() {
        if (!setTimeLineHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setTimeLineHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setTimeLineHeight1 = new ArrayList<>();

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
    private String generateJSsetTimeLineHeight1() {
        if (!setTimeLineHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setTimeLineHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TimeTrackingMode timeTrackingMode;
    private String timeTrackingMode1;
    private List<Resource> setTimeTrackingMode = new ArrayList<>();

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
    private String generateJSsetTimeTrackingMode() {
        if (!setTimeTrackingMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setTimeTrackingMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setTimeTrackingMode1 = new ArrayList<>();

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
    private String generateJSsetTimeTrackingMode1() {
        if (!setTimeTrackingMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setTimeTrackingMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double resourceIndex2;
    private Double[] resourceIndex3;
    private Double activityIndex2;
    private List<Resource> setUnhover = new ArrayList<>();

    /**
     * Removes hover from an activity by index.
     */
    public Resource unhover(Double resourceIndex2, Double activityIndex2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unhover(%f, %f)", resourceIndex2, activityIndex2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unhover(%f, %f)", resourceIndex2, activityIndex2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetUnhover() {
        if (!setUnhover.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setUnhover) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setUnhover1 = new ArrayList<>();

    /**
     * Removes hover from an activity by index.
     */
    public Resource unhover(Double[] resourceIndex3, Double activityIndex2) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".unhover(%s, %f)", Arrays.toString(resourceIndex3), activityIndex2));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".unhover(%s, %f)", Arrays.toString(resourceIndex3), activityIndex2));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetUnhover1() {
        if (!setUnhover1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setUnhover1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double resourceIndex4;
    private Double[] resourceIndex5;
    private Double activityIndex3;

    /**
     * Removes select from an activity by index.
     */
    public void unselect(Double resourceIndex4, Double activityIndex3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".unselect(%f, %f);", resourceIndex4, activityIndex3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%f, %f)", resourceIndex4, activityIndex3));
            js.setLength(0);
        }
    }


    /**
     * Removes select from an activity by index.
     */
    public void unselect(Double[] resourceIndex5, Double activityIndex3) {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(String.format(Locale.US, "var " + ++variableIndex + " = " + jsBase + ".unselect(%s, %f);", Arrays.toString(resourceIndex5), activityIndex3));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%s, %f)", Arrays.toString(resourceIndex5), activityIndex3));
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
    private List<Resource> setVerticalScrollBar = new ArrayList<>();

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
    private String generateJSsetVerticalScrollBar() {
        if (!setVerticalScrollBar.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setVerticalScrollBar) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setVerticalScrollBar1 = new ArrayList<>();

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
    private String generateJSsetVerticalScrollBar1() {
        if (!setVerticalScrollBar1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setVerticalScrollBar1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
    private List<Resource> setXScale = new ArrayList<>();

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
    private String generateJSsetXScale() {
        if (!setXScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setXScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double indexOrId;
    private String indexOrId1;
    private List<Resource> setZoomLevel = new ArrayList<>();

    /**
     * Setter for the zoom level.
Zooms chart to the level denoted by the passed index or identifier.
     */
    public Resource setZoomLevel(Double indexOrId) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".zoomLevel(%f)", indexOrId));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".zoomLevel(%f)", indexOrId));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetZoomLevel() {
        if (!setZoomLevel.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setZoomLevel) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Resource> setZoomLevel1 = new ArrayList<>();

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
    private String generateJSsetZoomLevel1() {
        if (!setZoomLevel1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setZoomLevel1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private ZoomLevel[] zoomLevels;
    private List<Resource> setZoomLevels = new ArrayList<>();

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
    private String generateJSsetZoomLevels() {
        if (!setZoomLevels.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Resource item : setZoomLevels) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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
        js.append(generateJSsetActivities());
        js.append(generateJSsetCalendar());
        js.append(generateJSsetCellPadding());
        js.append(generateJSsetCellPadding1());
        js.append(generateJSsetCellPadding2());
        js.append(generateJSsetCellPadding3());
        js.append(generateJSsetCellPadding4());
        js.append(generateJSsetConflicts());
        js.append(generateJSsetCurrentStartDate());
        js.append(generateJSsetCurrentStartDate1());
        js.append(generateJSsetData());
        js.append(generateJSsetDefaultMinutesPerDay());
        js.append(generateJSsetGrid());
        js.append(generateJSsetGrid1());
        js.append(generateJSsetHorizontalScrollBar());
        js.append(generateJSsetHorizontalScrollBar1());
        js.append(generateJSsetHover());
        js.append(generateJSsetHoverPoint());
        js.append(generateJSsetLogo());
        js.append(generateJSsetMinRowHeight());
        js.append(generateJSsetOverlay());
        js.append(generateJSsetOverlay1());
        js.append(generateJSsetPixPerHour());
        js.append(generateJSsetResourceListWidth());
        js.append(generateJSsetResourceListWidth1());
        js.append(generateJSsetSelect());
        js.append(generateJSsetSelectPoint());
        js.append(generateJSsetSplitterStroke());
        js.append(generateJSsetSplitterStroke1());
        js.append(generateJSsetSplitterStroke2());
        js.append(generateJSsetTimeLine());
        js.append(generateJSsetTimeLine1());
        js.append(generateJSsetTimeLineHeight());
        js.append(generateJSsetTimeLineHeight1());
        js.append(generateJSsetTimeTrackingMode());
        js.append(generateJSsetTimeTrackingMode1());
        js.append(generateJSsetUnhover());
        js.append(generateJSsetUnhover1());
        js.append(generateJSsetVerticalScrollBar());
        js.append(generateJSsetVerticalScrollBar1());
        js.append(generateJSsetXScale());
        js.append(generateJSsetZoomLevel());
        js.append(generateJSsetZoomLevel1());
        js.append(generateJSsetZoomLevels());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}