package com.anychart.sample;


import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.web.webdriver.Locator;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.web.sugar.Web.onWebView;
import static android.support.test.espresso.web.webdriver.DriverAtoms.findElement;
import static android.support.test.espresso.web.webdriver.DriverAtoms.webClick;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(
            MainActivity.class, false, true);

    @Test
    public void pieChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(0, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(1, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(2, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1t")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_20")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1m")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void areaChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(3, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_23")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_24")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void barChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(4, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(5, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(6, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(7, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_simple-text_q")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_simple-text_s")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_simple-text_2a")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void waterfallChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(8, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(9, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(10, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(11, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void linearColorScaleTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(12, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void windSpeedTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(13, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1l")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void windDirectionTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(14, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_y")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void scatterChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(15, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_13")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_6a")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void resourceChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(16, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_6")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_9")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void radarChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(17, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2b")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_22")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void polarChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(18, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2y")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2a")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2d")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void rangeChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(19, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(20, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(21, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(22, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(23, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1u")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1x")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void bubbleChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(24, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(25, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2l")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void pyramidChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(26, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(27, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(28, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1n")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1o")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_1p")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void mekkoChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(29, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(30, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(31, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(32, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2j")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_23")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void hiloChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(33, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_2b")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_3b")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void ohlcChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(34, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    @Test
    public void quadrantChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(35, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(36, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(37, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(38, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(39, click()));

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
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(40, click()));

        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7h")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7i")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7k")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7l")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID, "ac_path_7m")).perform(webClick());
        onView(withId(R.id.web_view)).check(matches(isEnabled()));

        pressBack();
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }

}
