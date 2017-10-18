package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChart;
import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Milestones;
import com.anychart.anychart.Pert;
import com.anychart.anychart.Tasks;
import com.anychart.anychart.Tooltip;
import com.anychart.anychart.TreeFillingMethod;
import com.anychart.sample.R;

public class PertChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Pert pert = AnyChart.pert();

        pert.setData(getData(), TreeFillingMethod.AS_TABLE, null)
                .setHorizontalSpacing("'18.7%'")
                .setPadding(new Double[] { 25d, 50d, 0d, 50d });

        // TODO problems with stat
//        pert.setGetstat();

        pert.getTitle().setEnabled(true);
        pert.getTitle().setUseHtml(true);
        pert.getTitle()
                .setPadding(new Double[]{ 0d, 0d, 35d, 0d })
                .setText("'Airplane Design Process with PERT Chart'");

        Tasks tasks = pert.getTasks();
        tasks.getUpperLabels().setFormat(
                "function() {\n" +
                "    return this.item.get('fullName');\n" +
                "  }");

        tasks.getLowerLabels().setFormat("'{%duration} days'");

        Tooltip tooltip = tasks.getTooltip();
        tooltip.setSeparator(true)
                .setTitleFormat(
                        "function() {\n" +
                        "      return this.item.get('fullName');\n" +
                        "    }");
        tooltip.getTitle().setUseHtml(true);

        Milestones milestones = pert.getMilestones();
        milestones.setColor("'#2C81D5'")
                .setSize("'6.5%'");
        milestones.getHovered().setFill("'#2C81D5'", 0.75d);
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
        critMilestones.setColor("'#E24B26'");

        // TODO stoke as function
//        critMilestones.getHovered().setStroke();

        anyChartView.setChart(pert);
    }

    private String getData() {
        return "[{\n" +
                "      id: '1',\n" +
                "      duration: 30,\n" +
                "      name: '1',\n" +
                "      fullName: 'Aerodynamics'\n" +
                "    },\n" +
                "    {\n" +
                "      id: '2',\n" +
                "      duration: 50,\n" +
                "      name: '2',\n" +
                "      fullName: 'Build & Test Model'\n" +
                "    },\n" +
                "    {\n" +
                "      id: '3',\n" +
                "      duration: 35,\n" +
                "      name: '3',\n" +
                "      fullName: 'Structure'\n" +
                "    },\n" +
                "    {\n" +
                "      id: '4',\n" +
                "      duration: 50,\n" +
                "      name: '4',\n" +
                "      dependsOn: ['1'],\n" +
                "      fullName: 'Propulsion'\n" +
                "    },\n" +
                "    {\n" +
                "      id: '5',\n" +
                "      duration: 60,\n" +
                "      name: '5',\n" +
                "      dependsOn: ['2'],\n" +
                "      fullName: 'Build Prototype'\n" +
                "    },\n" +
                "    {\n" +
                "      id: '6',\n" +
                "      duration: 40,\n" +
                "      name: '6',\n" +
                "      dependsOn: ['3'],\n" +
                "      fullName: 'Control & Stability'\n" +
                "    },\n" +
                "    {\n" +
                "      id: '7',\n" +
                "      duration: 20,\n" +
                "      name: '7',\n" +
                "      dependsOn: ['4'],\n" +
                "      fullName: 'Wind Tunnel'\n" +
                "    },\n" +
                "    {\n" +
                "      id: '8',\n" +
                "      duration: 20,\n" +
                "      name: '8',\n" +
                "      dependsOn: ['6'],\n" +
                "      fullName: 'Computation'\n" +
                "    },\n" +
                "    {\n" +
                "      id: '9',\n" +
                "      duration: 45,\n" +
                "      name: '9',\n" +
                "      dependsOn: ['7'],\n" +
                "      fullName: 'Review'\n" +
                "    },\n" +
                "    {\n" +
                "      id: '10',\n" +
                "      duration: 30,\n" +
                "      name: '10',\n" +
                "      dependsOn: ['8'],\n" +
                "      fullName: 'Flight Simulation'\n" +
                "    },\n" +
                "    {\n" +
                "      id: '11',\n" +
                "      duration: 50,\n" +
                "      name: '11',\n" +
                "      dependsOn: ['9'],\n" +
                "      fullName: 'Research flights'\n" +
                "    },\n" +
                "    {\n" +
                "      id: '12',\n" +
                "      duration: 45,\n" +
                "      name: '12',\n" +
                "      dependsOn: ['10'],\n" +
                "      fullName: 'Revise & Review'\n" +
                "    },\n" +
                "    {\n" +
                "      id: '13',\n" +
                "      duration: 25,\n" +
                "      name: '13',\n" +
                "      dependsOn: ['5'],\n" +
                "      fullName: 'Finalize'\n" +
                "    }\n" +
                "  ]";
    }

}
