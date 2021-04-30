package com.anychart.sample;


import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.web.webdriver.Locator;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.web.sugar.Web.onWebView;
import static androidx.test.espresso.web.webdriver.DriverAtoms.findElement;
import static androidx.test.espresso.web.webdriver.DriverAtoms.webClick;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(
            MainActivity.class, false, true);

    @Test
    public void pieChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1p")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1q")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1r")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1s")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1t")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void columnChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(1, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_z")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_10")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_11")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_12")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_13")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_14")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_15")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_16")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_17")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void lineChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(2, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1t")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_20")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1m")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void areaChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(3, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_23")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_24")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void barChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(4, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_47")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_48")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_49")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_4a")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_4b")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_4c")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_4e")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_4f")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_4g")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_4h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3i")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3j")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3l")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3m")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3n")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3o")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3p")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3q")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3r")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void vennDiagramTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(5, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_13")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_11")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_z")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_15")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_a")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_x")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void heatMapChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(6, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_v")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_w")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_x")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_y")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_z")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_10")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_11")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_12")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_13")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_14")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_15")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_16")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_17")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_18")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_19")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_1a")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_1b")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_1c")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_1d")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_1e")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_1f")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_1g")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_1h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_1i")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_1j")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void tagCloudTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(7, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_simple-text_q")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_simple-text_s")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_simple-text_2a")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void waterfallChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(8, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1g")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1i")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1j")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1l")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1m")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1n")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1o")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1p")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1q")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1r")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1s")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1t")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void treeMapChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(9, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_10")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_12")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_13")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_14")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_15")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_16")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_18")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_17")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_11")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_27")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_10")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_11")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_12")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_rect_13")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void circularGaugeTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(10, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_b")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_c")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_d")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_e")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_f")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void thermometerTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(11, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void linearColorScaleTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(12, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void windSpeedTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(13, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1l")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void windDirectionTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(14, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_y")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void scatterChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(15, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_13")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_6a")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void resourceChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(16, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_6")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_9")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void radarChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(17, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2b")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_22")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void polarChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(18, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2y")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2a")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2d")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void rangeChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(19, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2p")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2o")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2l")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2m")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2n")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2j")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_33")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_32")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_31")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_30")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void verticalChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(20, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onWebView().withElement(findElement(Locator.ID, "ac_path_1b")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1c")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1d")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1e")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1f")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1g")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1i")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1j")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1l")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1m")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void funnelChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(21, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_i")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_j")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_l")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void pertChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(22, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1c")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_40")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1d")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_43")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1g")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_44")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1j")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_48")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1l")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_4a")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1n")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_41")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1e")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_45")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1a")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void combinedChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(23, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1u")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1x")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void bubbleChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(24, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_2u")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_3m")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_2w")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_3k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_39")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_2r")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_3u")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void paretoChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(25, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2l")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void pyramidChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(26, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_t")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_s")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_r")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_i")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void boxChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(27, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_10")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_11")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_15")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_19")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1d")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1l")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1p")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1t")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void mosaicChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(28, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1n")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1o")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1p")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void mekkoChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(29, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2b")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2a")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1d")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1c")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1b")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1a")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void bar3DChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(30, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1y")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2m")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3a")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3y")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_25")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2t")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_45")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2b")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2z")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3n")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_4b")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void column3DChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(31, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_5e")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_5d")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_5l")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_5r")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_5x")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3r")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3x")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_4l")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2w")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_6r")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void area3DChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(32, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2j")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_23")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void hiloChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(33, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2b")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3b")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void ohlcChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(34, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void quadrantChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(35, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_j")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_o")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_p")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_n")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_m")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_l")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_d")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_f")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void sunburstChartTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(36, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_t")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_9")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_6")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_5")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_5")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_5")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void bubbleMapTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(37, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_19")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_18")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_12")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_1a")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_17")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_1b")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_z")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_y")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_1c")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_10")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_11")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_circle_x")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void choroplethMapTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(38, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_u")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1g")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_10")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_s")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void pointMapTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(39, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_23")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_24")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_22")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_21")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_20")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_25")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_26")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void connectorMapTest() {
        onView(withId(R.id.recycler_view))
                .perform(RecyclerViewActions.actionOnItemAtPosition(40, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7i")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7l")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7m")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

}
