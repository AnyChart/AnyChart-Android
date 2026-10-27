package com.anychart.dsl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.anychart.core.AnyChartError;
import com.anychart.core.AnyChartView;
import com.anychart.dsl.generated.Charts;
import com.anychart.dsl.generated.Pie;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/** The public API from Java on a device: a DSL chart built fluently and loaded into the view. INTEG-7. */
@RunWith(AndroidJUnit4.class)
public class JavaHostTest {
    @Test
    public void aFluentChartLoadsFromJava() throws Exception {
        CountDownLatch rendered = new CountDownLatch(1);
        List<AnyChartError> errors = Collections.synchronizedList(new ArrayList<>());
        try (ActivityScenario<DslHostActivity> scenario = ActivityScenario.launch(DslHostActivity.class)) {
            scenario.onActivity(activity -> {
                AnyChartView view = new AnyChartView(activity);
                activity.setContentView(view);
                view.setListener(new AnyChartView.Listener() {
                    @Override public void onRendered(String chartId, long millis) { rendered.countDown(); }
                    @Override public void onError(AnyChartError error) { errors.add(error); }
                });
                Pie chart = Charts.pie().title("From Java").data(Arrays.asList(Data.point("A", 1), Data.point("B", 2)));
                view.load(chart);
            });
            assertTrue("not rendered in 20s; errors: " + errors, rendered.await(20, TimeUnit.SECONDS));
            assertEquals(Collections.emptyList(), errors);
        }
    }
}
