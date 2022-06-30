package com.gzeinnumer.instrumentestedittext;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.os.SystemClock;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class ButtonActivityTest {

    @Rule
    public ActivityTestRule<ButtonActivity> mActivityRule = new ActivityTestRule<>(ButtonActivity.class);

    /**
     * Confirm that all views in view hierarchy is valid and displayed
     */
    @Test
    public void checkAllViewsIsValid_sameActivity() {
        onView(withId(R.id.btn_toast)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_snackbar)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_dialog)).check(matches(isDisplayed()));
    }

    /**
     * Test button toast click action
     */
    @Test
    public void showToast_sameActivity() {
        // perform click and show Toast
        onView(withId(R.id.btn_toast)).perform(ViewActions.click());

        // for delay purposes
        SystemClock.sleep(3000);
    }

    /**
     * Test button snackbar click action
     */
    @Test
    public void showSnackBar_sameActivity() {
        // perform click and show snackbar
        onView(withText("Show Snackbar")).perform(ViewActions.click());

        // for delay purposes
        SystemClock.sleep(3000);
    }

    /**
     * Test button dialog click action
     */
    @Test
    public void showDialog_sameActivity() {
        // perform click and show dialog
        onView(withId(R.id.btn_dialog)).perform(ViewActions.click());
    }
}
