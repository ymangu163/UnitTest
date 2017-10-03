package com.ymangu.unit.section1.activity;

import android.support.test.rule.ActivityTestRule;

import com.ymangu.unit.R;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by gao on 2017/10/3.
 */
public class InstrumentationActivityTest {
    private static final String STRING_TO_BE_TYPED = "Peter";

    @Rule
    public ActivityTestRule<InstrumentationActivity> mActivityRule = new ActivityTestRule<>(
            InstrumentationActivity.class);

    @Test
    public void sayHello() throws Exception {
        onView(withId(R.id.editText)).perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard()); //line 1

        onView(withText("Say hello!")).perform(click()); //line 2

        String expectedText = "Hello, " + STRING_TO_BE_TYPED + "!";
        onView(withId(R.id.textView)).check(matches(withText(expectedText)));

    }

}