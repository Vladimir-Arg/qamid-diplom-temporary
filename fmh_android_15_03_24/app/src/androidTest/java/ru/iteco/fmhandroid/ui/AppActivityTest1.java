package ru.iteco.fmhandroid.ui;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.longClick;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.iteco.fmhandroid.R;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AppActivityTest1 {

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);

    @Test
    public void appActivityTest1() {
    ViewInteraction textInputEditTextLogin = onView(
allOf(childAtPosition(
childAtPosition(
withId(R.id.login_text_input_layout),
0),
0),
isDisplayed()));
    textInputEditTextLogin.perform(click());

    ViewInteraction textInputEditText2 = onView(
allOf(childAtPosition(
childAtPosition(
withId(R.id.login_text_input_layout),
0),
0),
isDisplayed()));
    textInputEditText2.perform(replaceText("login2"), closeSoftKeyboard());

    ViewInteraction textInputEditText3 = onView(
allOf(childAtPosition(
childAtPosition(
withId(R.id.password_text_input_layout),
0),
0),
isDisplayed()));
    textInputEditText3.perform(replaceText("password2"), closeSoftKeyboard());

    ViewInteraction textInputEditText4 = onView(
allOf(withText("password2"),
childAtPosition(
childAtPosition(
withId(R.id.password_text_input_layout),
0),
0),
isDisplayed()));
    textInputEditText4.perform(pressImeActionButton());

    ViewInteraction textInputEditText5 = onView(
allOf(withText("login2"),
childAtPosition(
childAtPosition(
withId(R.id.login_text_input_layout),
0),
0),
isDisplayed()));
    textInputEditText5.perform(pressImeActionButton());

    ViewInteraction textInputEditText6 = onView(
allOf(withText("password2"),
childAtPosition(
childAtPosition(
withId(R.id.password_text_input_layout),
0),
0),
isDisplayed()));
    textInputEditText6.perform(pressImeActionButton());

    ViewInteraction materialButton = onView(
allOf(withId(R.id.enter_button), withText("Sign in"), withContentDescription("Save"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.RelativeLayout")),
1),
2),
isDisplayed()));
    materialButton.perform(click());

    ViewInteraction materialTextView = onView(
allOf(withId(R.id.all_news_text_view), withText("All news"),
childAtPosition(
allOf(withId(R.id.container_list_news_include_on_fragment_main),
childAtPosition(
withClassName(is("android.widget.LinearLayout")),
0)),
1),
isDisplayed()));
    materialTextView.perform(click());

    ViewInteraction appCompatImageButton = onView(
allOf(withId(R.id.main_menu_image_button), withContentDescription("Main menu"),
childAtPosition(
allOf(withId(R.id.container_custom_app_bar_include_on_fragment_news_list),
childAtPosition(
withClassName(is("android.widget.LinearLayout")),
0)),
0),
isDisplayed()));
    appCompatImageButton.perform(click());

    ViewInteraction materialTextView2 = onView(
allOf(withId(android.R.id.title), withText("Main"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
0),
isDisplayed()));
    materialTextView2.perform(click());

    ViewInteraction appCompatImageButton2 = onView(
allOf(withId(R.id.main_menu_image_button), withContentDescription("Main menu"),
childAtPosition(
allOf(withId(R.id.container_custom_app_bar_include_on_fragment_main),
childAtPosition(
withClassName(is("android.widget.LinearLayout")),
0)),
0),
isDisplayed()));
    appCompatImageButton2.perform(click());

    ViewInteraction materialTextView3 = onView(
allOf(withId(android.R.id.title), withText("News"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
0),
isDisplayed()));
    materialTextView3.perform(click());

    ViewInteraction appCompatImageButton3 = onView(
allOf(withId(R.id.main_menu_image_button), withContentDescription("Main menu"),
childAtPosition(
allOf(withId(R.id.container_custom_app_bar_include_on_fragment_news_list),
childAtPosition(
withClassName(is("android.widget.LinearLayout")),
0)),
0),
isDisplayed()));
    appCompatImageButton3.perform(click());

    ViewInteraction materialTextView4 = onView(
allOf(withId(android.R.id.title), withText("Main"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
0),
isDisplayed()));
    materialTextView4.perform(click());

    ViewInteraction appCompatImageButton4 = onView(
allOf(withId(R.id.main_menu_image_button), withContentDescription("Main menu"),
childAtPosition(
allOf(withId(R.id.container_custom_app_bar_include_on_fragment_main),
childAtPosition(
withClassName(is("android.widget.LinearLayout")),
0)),
0),
isDisplayed()));
    appCompatImageButton4.perform(click());

    ViewInteraction materialTextView5 = onView(
allOf(withId(android.R.id.title), withText("About"),
childAtPosition(
childAtPosition(
withId(android.R.id.content),
0),
0),
isDisplayed()));
    materialTextView5.perform(click());

    ViewInteraction textView = onView(
allOf(withId(R.id.about_privacy_policy_value_text_view), withText("https://vhospice.org/#/privacy-policy/"),
withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
isDisplayed()));
    textView.check(matches(withText("https://vhospice.org/#/privacy-policy/")));

/*    ViewInteraction materialTextView6 = onView(
allOf(withId(R.id.about_privacy_policy_value_text_view), withText("https://vhospice.org/#/privacy-policy/"),
childAtPosition(
childAtPosition(
withClassName(is("android.widget.LinearLayout")),
1),
3),
isDisplayed()));
    materialTextView6.perform(longClick());*/


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
                        && view.equals(((ViewGroup)parent).getChildAt(position));
            }
        };
    }
}
