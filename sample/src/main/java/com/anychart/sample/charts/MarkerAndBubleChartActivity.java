package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.Scatter;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class MarkerAndBubleChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        Scatter scatter = new Scatter();

        scatter.setAnimation(true);

        scatter.getTitle().setEnabled(true);
        scatter.getTitle().setUseHtml(true);
        scatter.getTitle()
                .setPadding(0d, 0d, 10d, 0d)
                .setText("'Best sportsmen training data ' +\n" +
                        "        '<br/><span  style=\"color:#929292; font-size: 12px;\">' +\n" +
                        "        '(bubble size means duration, each bubble represents one training)</span>'");

        scatter.setPadding(20d, 20d, 10d, 20d);

        scatter.setYGrid(true)
                .setXGrid(true)
                .setXMinorGrid(true)
                .setYMinorGrid(true);

        scatter.setMinBubbleSize(5d)
                .setMaxBubbleSize(40d);

        scatter.getXAxis()
                .setTitle("'Average pulse during training'")
                .setMinorTicks(true);
        scatter.getYAxis()
                .setTitle("'Average power'")
                .setMinorTicks(true);

        scatter.getLegend().setEnabled(true);
        scatter.getLabels().setPadding(0d, 0d, 10d, 0d);

        scatter.bubble(new String[] {
                "{'training':1, 'x':184, 'value':113, 'data':'10/13/2014', 'size':120}",
                "{'training':1, 'x':180, 'value':94, 'data':'03/25/2015', 'size':45}",
                "{'training':1, 'x':145, 'value':137, 'data':'11/23/2014', 'size':123}",
                "{'training':1, 'x':136, 'value':89, 'data':'02/02/2015', 'size':89}",
                "{'training':1, 'x':180, 'value':96, 'data':'12/24/2014', 'size':118}",
                "{'training':1, 'x':149, 'value':113, 'data':'11/20/2014', 'size':60}",
                "{'training':1, 'x':161, 'value':94, 'data':'04/10/2015', 'size':87}",
                "{'training':1, 'x':168, 'value':141, 'data':'02/03/2015', 'size':45}",
                "{'training':1, 'x':173, 'value':127, 'data':'01/14/2015', 'size':89}"
        }, TextParsingMode.CSV)
                .setName("'Christopher Sanchez'");

        scatter.bubble(new String[] {
                "{'training':2, 'x':165, 'value':145, 'data':'10/22/2014', 'size':95}",
                "{'training':2, 'x':147, 'value':71, 'data':'07/25/2014', 'size':53}",
                "{'training':2, 'x':157, 'value':138, 'data':'08/18/2014', 'size':115}",
                "{'training':2, 'x':179, 'value':107, 'data':'07/05/2014', 'size':91}",
                "{'training':2, 'x':187, 'value':65, 'data':'06/21/2014', 'size':90}",
                "{'training':2, 'x':142, 'value':139, 'data':'11/05/2014', 'size':94}",
                "{'training':2, 'x':136, 'value':90, 'data':'06/22/2014', 'size':90}",
                "{'training':2, 'x':166, 'value':70, 'data':'09/18/2014', 'size':54}",
                "{'training':2, 'x':161, 'value':131, 'data':'01/07/2015', 'size':121}"
        }, TextParsingMode.CSV)
                .setName("'Judy Evans'");

        scatter.bubble(new String[] {
                "{'training':3, 'x':145, 'value':141, 'data':'09/15/2014', 'size':25}",
                "{'training':3, 'x':174, 'value':144, 'data':'10/28/2014', 'size':50}",
                "{'training':3, 'x':180, 'value':94, 'data':'03/03/2015', 'size':50}",
                "{'training':3, 'x':170, 'value':142, 'data':'10/29/2014', 'size':63}",
                "{'training':3, 'x':146, 'value':120, 'data':'02/28/2015', 'size':98}",
                "{'training':3, 'x':164, 'value':66, 'data':'06/24/2014', 'size':67}",
                "{'training':3, 'x':166, 'value':137, 'data':'03/24/2015', 'size':120}",
                "{'training':3, 'x':181, 'value':121, 'data':'06/02/2014', 'size':96}"
        }, TextParsingMode.CSV)
                .setName("'Walter Burke'");

        scatter.bubble(new String[] {
                "{'training':4, 'x':169, 'value':84, 'data':'05/16/2014', 'size':46}",
                "{'training':4, 'x':176, 'value':123, 'data':'01/10/2015', 'size':43}",
                "{'training':4, 'x':163, 'value':106, 'data':'08/06/2014', 'size':105}",
                "{'training':4, 'x':167, 'value':96, 'data':'09/01/2014', 'size':90}",
                "{'training':4, 'x':162, 'value':131, 'data':'05/24/2014', 'size':91}",
                "{'training':4, 'x':142, 'value':124, 'data':'12/24/2014', 'size':112}",
                "{'training':4, 'x':142, 'value':70, 'data':'01/16/2015', 'size':56}",
                "{'training':4, 'x':174, 'value':89, 'data':'02/09/2015', 'size':90}"
        }, TextParsingMode.CSV)
                .setName("'Daniel Williamson'");

        scatter.getTooltip()
                .setUseHtml(true)
                .setFontColor("'#fff'")
                .setFormat("function() {\n" +
                        "        return this.getData('data') + '<br/>' +\n" +
                        "          'Power: <span style=\"color: #d2d2d2; font-size: 12px\">' +\n" +
                        "          this.getData('value') + '</span></strong><br/>' +\n" +
                        "          'Pulse: <span style=\"color: #d2d2d2; font-size: 12px\">' +\n" +
                        "          this.getData('x') + '</span></strong><br/>' +\n" +
                        "          'Duration: <span style=\"color: #d2d2d2; font-size: 12px\">' +\n" +
                        "          this.getData('size') + ' min.</span></strong>';\n" +
                        "      }");

        anyChartView.setChart(scatter);
    }
}
