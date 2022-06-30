package com.gzeinnumer.instrumentestedittext;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class EditActivityTest {

    private String inputText = "bonioctavianus";

    @Rule
    public ActivityTestRule<EditActivity> mActivityRule = new ActivityTestRule<>(EditActivity.class);

    /**
     * Confirm that all views in view hierarchy is valid and displayed
     */
    @Test
    public void checkAllViewsIsValid_sameActivity() {
        onView(withId(R.id.et_name)).check(matches(isDisplayed()));
        onView(withId(R.id.btn_enter)).check(matches(isDisplayed()));
    }

    @Test
    public void typeText_sameActivity() {
        // Type text then press the button
        onView(withId(R.id.et_name)).perform(ViewActions.typeText(inputText), ViewActions.closeSoftKeyboard());

        // Validate the text was changed
        onView(withId(R.id.et_name)).check(matches(withText(inputText)));

        // Perform click action on button
        onView(withId(R.id.btn_enter)).perform(ViewActions.click());
    }
}

