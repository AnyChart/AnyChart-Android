package com.anychart.anychart;

import com.anychart.anychart.chart.common.ListenersInterface;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * Pert chart class.<br/>
<b>Note:</b> Use {@link anychart#pert} method to get an instance of this class.
 */
public class Pert extends SeparateChart {

    protected Pert(String name) {
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

    

    private CriticalPath getCriticalPath;

    /**
     * Getter for the critical path settings.
     */
    public CriticalPath getCriticalPath() {
        if (getCriticalPath == null)
            getCriticalPath = new CriticalPath(jsBase + ".criticalPath()");

        return getCriticalPath;
    }
    private String criticalPath;

    /**
     * Setter for the critical path settings.
     */
    public Pert setCriticalPath(String criticalPath) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".criticalPath(%s)", wrapQuotes(criticalPath)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".criticalPath(%s)", wrapQuotes(criticalPath)));
            js.setLength(0);
        }
        return this;
    }


    private Tree getData;

    /**
     * Getter for the chart data.
     */
    public Tree getData() {
        if (getData == null)
            getData = new Tree(jsBase + ".data()");

        return getData;
    }

    /**
     * Setter for the chart data.
     */
    public Pert setData(List<DataEntry> data, TreeFillingMethod fillMethod) {
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

        js.append(String.format(Locale.US, "var setData" + ++variableIndex + " = " + jsBase + ".data(%s, %s);", resultData.toString(), fillMethod.generateJs()));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", resultData.toString(), fillMethod.generateJs()));
            js.setLength(0);
        }
    }
        return this;
    }


    /**
     * 
     */
    public Pert setData(View view) {
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

    private Number horizontalSpacing;
    private String horizontalSpacing1;

    /**
     * Setter for milestones horizontal spacing.
     */
    public Pert setHorizontalSpacing(Number horizontalSpacing) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".horizontalSpacing(%s)", horizontalSpacing));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".horizontalSpacing(%s)", horizontalSpacing));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for milestones horizontal spacing.
     */
    public Pert setHorizontalSpacing(String horizontalSpacing1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".horizontalSpacing(%s)", wrapQuotes(horizontalSpacing1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".horizontalSpacing(%s)", wrapQuotes(horizontalSpacing1)));
            js.setLength(0);
        }
        return this;
    }


    private Milestones getMilestones;

    /**
     * Getter for milestones settings.
     */
    public Milestones getMilestones() {
        if (getMilestones == null)
            getMilestones = new Milestones(jsBase + ".milestones()");

        return getMilestones;
    }
    private String milestones;

    /**
     * Setter for milestones settings object.
     */
    public Pert setMilestones(String milestones) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".milestones(%s)", wrapQuotes(milestones)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".milestones(%s)", wrapQuotes(milestones)));
            js.setLength(0);
        }
        return this;
    }


    private Tasks getTasks;

    /**
     * Getter for the tasks settings.
     */
    public Tasks getTasks() {
        if (getTasks == null)
            getTasks = new Tasks(jsBase + ".tasks()");

        return getTasks;
    }
    private String tasks;

    /**
     * Setter for the tasks settings.
     */
    public Pert setTasks(String tasks) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".tasks(%s)", wrapQuotes(tasks)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".tasks(%s)", wrapQuotes(tasks)));
            js.setLength(0);
        }
        return this;
    }

    private Number verticalSpacing;
    private String verticalSpacing1;

    /**
     * Setter for milestones vertical spacing.
     */
    public Pert setVerticalSpacing(Number verticalSpacing) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".verticalSpacing(%s)", verticalSpacing));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".verticalSpacing(%s)", verticalSpacing));
            js.setLength(0);
        }
        return this;
    }


    /**
     * Setter for milestones vertical spacing.
     */
    public Pert setVerticalSpacing(String verticalSpacing1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".verticalSpacing(%s)", wrapQuotes(verticalSpacing1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".verticalSpacing(%s)", wrapQuotes(verticalSpacing1)));
            js.setLength(0);
        }
        return this;
    }

    private String generateJSgetCriticalPath() {
        if (getCriticalPath != null) {
            return getCriticalPath.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetMilestones() {
        if (getMilestones != null) {
            return getMilestones.generateJs();
        }
        return "";
    }

    private String generateJSgetTasks() {
        if (getTasks != null) {
            return getTasks.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetCriticalPath());
        js.append(generateJSgetData());
        js.append(generateJSgetMilestones());
        js.append(generateJSgetTasks());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}