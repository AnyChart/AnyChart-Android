package com.anychart.sample;


import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
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
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.web.sugar.Web.onWebView;
import static android.support.test.espresso.web.webdriver.DriverAtoms.findElement;
import static android.support.test.espresso.web.webdriver.DriverAtoms.webClick;
import static org.hamcrest.Matchers.allOf;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    public static ViewAction waitFor(final long millis) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return isRoot();
            }

            @Override
            public String getDescription() {
                return "Wait for " + millis + " milliseconds.";
            }

            @Override
            public void perform(UiController uiController, final View view) {
                uiController.loopMainThreadForAtLeast(millis);
            }
        };
    }

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(
            MainActivity.class, false, true);

    private final static long waitingTime = 55000L;

    @Test
    public void pieChartTest() {
        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.recycler_view),
                        childAtPosition(
                                withId(android.R.id.content),
                                0)));
        recyclerView.perform(actionOnItemAtPosition(0, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(11, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(12, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(13, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(14, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(15, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(16, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(17, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(18, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(19, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(20, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(21, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(22, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(23, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(24, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(25, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(26, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(27, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(28, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(29, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
        recyclerView.perform(actionOnItemAtPosition(30, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
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
        recyclerView.perform(actionOnItemAtPosition(31, click()));

        onView(isRoot()).perform(waitFor(waitingTime));
        onView(isRoot()).perform(waitFor(waitingTime));
        onWebView().withElement(findElement(Locator.ID, "container")).perform(webClick());
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
