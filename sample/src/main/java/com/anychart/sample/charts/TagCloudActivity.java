package com.anychart.sample.charts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.anychart.AnyChartView;
import com.anychart.anychart.TagCloud;
import com.anychart.anychart.TextParsingMode;
import com.anychart.sample.R;

public class TagCloudActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = (AnyChartView) findViewById(R.id.any_chart_view);

        TagCloud tagCloud = new TagCloud();

        tagCloud.setTitle("'World Population'");

        // TODO look there
//        OrdinalColor ordinalColor = new OrdinalColor();
//        ordinalColor.setColors(new String[] {
//                "'#26959f'", "'#f18126'", "'#3b8ad8'", "'#60727b'", "'#e24b26'"
//        });
//        tagCloud.setColorScale(ordinalColor);
//        tagCloud.getColorScale().setColors(new String[] {
//                "'#26959f'", "'#f18126'", "'#3b8ad8'", "'#60727b'", "'#e24b26'"
//        });
        tagCloud.setAngles(new Double[] {-90d, 0d, 90d});

        tagCloud.getColorRange().setEnabled(true);
        tagCloud.getColorRange().setColorLineSize(15d);

        tagCloud.setData(getData(), TextParsingMode.CSV);

        anyChartView.setChart(tagCloud);
    }

    private String[] getData() {
        return new String[] {
                "{x: 'China', category: 'asia', value: 1383220000}",
                "{x: 'India', category: 'asia', value: 1316000000}",
                "{x: 'United States', category: 'america', value: 324982000}",
                "{x: 'Indonesia', category: 'asia', value: 263510000}",
                "{x: 'Brazil', category: 'america', value: 207505000}",
                "{x: 'Pakistan', category: 'asia', value: 196459000}",
                "{x: 'Nigeria', category: 'africa', value: 191836000}",
                "{x: 'Bangladesh', category: 'asia', value: 162459000}",
                "{x: 'Russia', category: 'europe', value: 146804372}",
                "{x: 'Japan', category: 'asia', value: 126790000}",
                "{x: 'Mexico', category: 'america', value: 123518000}",
                "{x: 'Ethiopia', category: 'africa', value: 104345000}",
                "{x: 'Philippines', category: 'asia', value: 104037000}",
                "{x: 'Egypt', category: 'africa', value: 93013300}",
                "{x: 'Vietnam', category: 'asia', value: 92700000}",
                "{x: 'Germany', category: 'europe', value: 82800000}",
                "{x: 'Democratic Republic of the Congo', category: 'africa', value: 82243000}",
                "{x: 'Iran', category: 'asia', value: 80135400}",
                "{x: 'Turkey', category: 'asia', value: 79814871}",
                "{x: 'Thailand', category: 'asia', value: 68298000}",
                "{x: 'France', category: 'europe', value: 67013000}",
                "{x: 'United Kingdom', category: 'europe', value: 65110000}",
                "{x: 'Italy', category: 'europe', value: 60599936}",
                "{x: 'Tanzania', category: 'africa', value: 56878000}",
                "{x: 'South Africa', category: 'africa', value: 55908000}",
                "{x: 'Myanmar', category: 'asia', value: 54836000}",
                "{x: 'South Korea', category: 'asia', value: 51446201}",
                "{x: 'Colombia', category: 'america', value: 49224700}",
                "{x: 'Kenya', category: 'africa', value: 48467000}",
                "{x: 'Spain', category: 'europe', value: 46812000}",
                "{x: 'Argentina', category: 'america', value: 43850000}",
                "{x: 'Ukraine', category: 'europe', value: 42541633}",
                "{x: 'Sudan', category: 'africa', value: 42176000}",
                "{x: 'Uganda', category: 'africa', value: 41653000}",
                "{x: 'Algeria', category: 'africa', value: 41064000}",
                "{x: 'Poland', category: 'europe', value: 38424000}",
                "{x: 'Iraq', category: 'asia', value: 37883543}",
                "{x: 'Canada', category: 'america', value: 36541000}",
                "{x: 'Morocco', category: 'africa', value: 34317500}",
                "{x: 'Saudi Arabia', category: 'asia', value: 33710021}",
                "{x: 'Uzbekistan', category: 'asia', value: 32121000}",
                "{x: 'Malaysia', category: 'asia', value: 32063200}",
                "{x: 'Peru', category: 'america', value: 31826018}",
                "{x: 'Venezuela', category: 'america', value: 31431164}",
                "{x: 'Nepal', category: 'asia', value: 28825709}",
                "{x: 'Angola', category: 'africa', value: 28359634}",
                "{x: 'Ghana', category: 'africa', value: 28308301}",
                "{x: 'Yemen', category: 'asia', value: 28120000}",
                "{x: 'Afghanistan', category: 'asia', value: 27657145}",
                "{x: 'Mozambique', category: 'africa', value: 27128530}",
                "{x: 'Australia', category: 'australia', value: 24460900}",
                "{x: 'North Korea', category: 'asia', value: 24213510}",
                "{x: 'Taiwan', category: 'asia', value: 23545680}",
                "{x: 'Cameroon', category: 'africa', value: 23248044}",
                "{x: 'Ivory Coast', category: 'africa', value: 22671331}",
                "{x: 'Madagascar', category: 'africa', value: 22434363}",
                "{x: 'Niger', category: 'africa', value: 21564000}",
                "{x: 'Sri Lanka', category: 'asia', value: 21203000}",
                "{x: 'Romania', category: 'europe', value: 19760000}",
                "{x: 'Burkina Faso', category: 'africa', value: 19632147}",
                "{x: 'Syria', category: 'asia', value: 18907000}",
                "{x: 'Mali', category: 'africa', value: 18875000}",
                "{x: 'Malawi', category: 'africa', value: 18299000}",
                "{x: 'Chile', category: 'america', value: 18191900}",
                "{x: 'Kazakhstan', category: 'asia', value: 17975800}",
                "{x: 'Netherlands', category: 'europe', value: 17121900}",
                "{x: 'Ecuador', category: 'america', value: 16737700}",
                "{x: 'Guatemala', category: 'america', value: 16176133}",
                "{x: 'Zambia', category: 'africa', value: 15933883}",
                "{x: 'Cambodia', category: 'asia', value: 15626444}",
                "{x: 'Senegal', category: 'africa', value: 15256346}",
                "{x: 'Chad', category: 'africa', value: 14965000}",
                "{x: 'Zimbabwe', category: 'africa', value: 14542235}",
                "{x: 'Guinea', category: 'africa', value: 13291000}",
                "{x: 'South Sudan', category: 'africa', value: 12131000}",
                "{x: 'Rwanda', category: 'africa', value: 11553188}",
                "{x: 'Belgium', category: 'europe', value: 11356191}",
                "{x: 'Tunisia', category: 'africa', value: 11299400}",
                "{x: 'Cuba', category: 'america', value: 11239004}",
                "{x: 'Bolivia', category: 'america', value: 11145770}",
                "{x: 'Somalia', category: 'africa', value: 11079000}",
                "{x: 'Haiti', category: 'america', value: 11078033}",
                "{x: 'Greece', category: 'europe', value: 10783748}",
                "{x: 'Benin', category: 'africa', value: 10653654}",
                "{x: 'Czech Republic', category: 'europe', value: 10578820}",
                "{x: 'Portugal', category: 'europe', value: 10341330}",
                "{x: 'Burundi', category: 'africa', value: 10114505}",
                "{x: 'Dominican Republic', category: 'america', value: 10075045}",
                "{x: 'Sweden', category: 'europe', value: 10054100}",
                "{x: 'United Arab Emirates', category: 'asia', value: 10003223}",
                "{x: 'Jordan', category: 'asia', value: 9889270}",
                "{x: 'Azerbaijan', category: 'asia', value: 9823667}",
                "{x: 'Hungary', category: 'europe', value: 9799000}",
                "{x: 'Belarus', category: 'europe', value: 9498600}",
                "{x: 'Honduras', category: 'america', value: 8866351}",
                "{x: 'Austria', category: 'europe', value: 8773686}",
                "{x: 'Tajikistan', category: 'asia', value: 8742000}",
                "{x: 'Israel', category: 'asia', value: 8690220}",
                "{x: 'Switzerland', category: 'europe', value: 8417700}",
                "{x: 'Papua New Guinea', category: 'australia', value: 8151300}"
        };
    }
}
