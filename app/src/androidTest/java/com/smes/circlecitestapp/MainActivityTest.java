package com.smes.circlecitestapp;

import android.app.IntentService;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.action.ViewActions.click;
import static org.hamcrest.CoreMatchers.not;
@RunWith(AndroidJUnit4.class)
public class MainActivityTest{

    @Rule public final ActivityRule<MainActivity> main = new ActivityRule<>(MainActivity.class);

    @Test
    public void shouldBeAbleToRunMainScreen() {
        //Onview(Matcher)
            //.perform(ViewAction)
            //.check(ViewAssertion)
        onView(withText("Hello")).check(ViewAssertions.matches(isDisplayed()));
        onView(withId(R.id.button)).perform(click()).check(ViewAssertions.matches(isEnabled()));
    }



}
