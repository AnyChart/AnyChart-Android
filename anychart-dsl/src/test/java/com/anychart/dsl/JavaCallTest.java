package com.anychart.dsl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.anychart.dsl.generated.Charts;
import com.anychart.dsl.generated.Orientation;
import com.anychart.dsl.generated.Pie;

import org.json.JSONObject;
import org.junit.Test;

import java.util.Arrays;

/** The fluent style from Java: no lambdas, no Kotlin defaults. INTEG-4 definition of done. */
public class JavaCallTest {
    @Test
    public void fluentPieFromJava() throws Exception {
        Pie chart = Charts.pie()
                .title("Fruits")
                .radius("45%")
                .data(Arrays.asList(Data.point("Apples", 3), Data.point("Pears", 2)));
        chart.legend(false);
        JSONObject doc = chart.toDocument();
        JSONObject pie = doc.getJSONObject("chart");
        assertEquals("pie", pie.getString("type"));
        assertEquals("Fruits", pie.getString("title"));
        assertEquals("45%", pie.getString("radius"));
        assertEquals(2, pie.getJSONArray("data").length());
        assertTrue(!pie.getBoolean("legend"));
        assertEquals("bottom", Orientation.BOTTOM.getJson());
    }
}
