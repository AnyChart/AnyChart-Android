package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.DataEntry;
import com.anychart.anychart.Milestones;
import com.anychart.anychart.Pert;
import com.anychart.anychart.PertDataEntry;
import com.anychart.anychart.Tasks;
import com.anychart.anychart.Tooltip;
import com.anychart.anychart.TreeFillingMethod;
import com.anychart.sample.R;

import java.util.ArrayList;
import java.util.List;

public class PertChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Pert pert = AnyChart.pert();

        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomPertDataEntry("1", 30, "1", "Aerodinamics"));
        data.add(new CustomPertDataEntry("2", 50, "2", "Build & Test Model"));
        data.add(new CustomPertDataEntry("3", 35, "3", "Structure"));
        data.add(new CustomPertDataEntry("4", 50, "4", new String[]{"1"}, "Propulsion"));
        data.add(new CustomPertDataEntry("5", 60, "5", new String[]{"2"}, "Build Prototype"));
        data.add(new CustomPertDataEntry("6", 40, "6", new String[]{"3"}, "Control & Stability"));
        data.add(new CustomPertDataEntry("7", 20, "7", new String[]{"4"}, "Wind Tunnel"));
        data.add(new CustomPertDataEntry("8", 20, "8", new String[]{"6"}, "Computation"));
        data.add(new CustomPertDataEntry("9", 45, "9", new String[]{"7"}, "Review"));
        data.add(new CustomPertDataEntry("10", 30, "10", new String[]{"8"}, "Flight Simulation"));
        data.add(new CustomPertDataEntry("11", 50, "11", new String[]{"9"}, "Research flights"));
        data.add(new CustomPertDataEntry("12", 45, "12", new String[]{"10"}, "Revise & Review"));
        data.add(new CustomPertDataEntry("13", 25, "13", new String[]{"5"}, "Finalize"));

        pert.setData(data, TreeFillingMethod.AS_TABLE);

        pert.setPadding(50d, 0d, 0d, 50d);

        pert.getTitle().setEnabled(true);
        pert.getTitle().setUseHtml(true);
        pert.getTitle()
                .setPadding(new Double[]{ 0d, 50d, 35d, 0d })
                .setText("Airplane Design Process with PERT Chart");

        Tasks tasks = pert.getTasks();
        tasks.getUpperLabels().setFormat(
                "function() {\n" +
                "    return this.item.get('fullName');\n" +
                "  }");

        tasks.getLowerLabels().setFormat("{%duration} days");

        Tooltip tooltip = tasks.getTooltip();
        tooltip.setSeparator(true)
                .setTitleFormat(
                        "function() {\n" +
                        "      return this.item.get('fullName');\n" +
                        "    }");
        tooltip.getTitle().setUseHtml(true);

        Milestones milestones = pert.getMilestones();
        milestones.setColor("#2C81D5")
                .setSize("6.5%");
        milestones.getHovered().setFill("#2C81D5", 0.75d);
        milestones.getTooltip().setFormat("" +
                "function() {\n" +
                "  var result = '';\n" +
                "  var i = 0;\n" +
                "  if (this['successors'] && this['successors'].length) {\n" +
                "    result += 'Successors:';\n" +
                "    for (i = 0; i < this['successors'].length; i++) {\n" +
                "      result += '\\n - ' + this['successors'][i].get('fullName');\n" +
                "    }\n" +
                "    if (this['predecessors'] && this['predecessors'].length)\n" +
                "      result += '\\n\\n';\n" +
                "  }\n" +
                "  if (this['predecessors'] && this['predecessors'].length) {\n" +
                "    result += 'Predecessors:';\n" +
                "    for (i = 0; i < this['predecessors'].length; i++) {\n" +
                "      result += '\\n - ' + this['predecessors'][i].get('fullName');\n" +
                "    }\n" +
                "  }\n" +
                "  return result;\n" +
                "}");

        Milestones critMilestones = pert.getCriticalPath().getMilestones();
        critMilestones.getLabels().setFormat(
                "function() {\n" +
                "    return this['creator'] ? this['creator'].get('name') : this['isStart'] ? 'Start' : 'Finish';\n" +
                "  }");
        critMilestones.setColor("#E24B26");



        anyChartView.setChart(pert);
    }

    private class CustomPertDataEntry extends PertDataEntry {
        CustomPertDataEntry(String id, int duration, String name, String fullName) {
            super(id, name, fullName);
            setValue("duration", duration);
        }

        CustomPertDataEntry(String id, int duration, String name, String[] dependsOn, String fullName) {
            super(id, name, fullName, dependsOn);
            setValue("duration", duration);
        }
    }

}
