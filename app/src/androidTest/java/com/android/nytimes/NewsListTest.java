package com.android.nytimes;

import android.content.Context;
import android.os.SystemClock;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.android.nytimes.app_fragments_modules.news.NewsListingFragment;
import com.android.nytimes.utils.Utility;

import org.hamcrest.core.AllOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(AndroidJUnit4.class)
public class NewsListTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.android.nytimes", appContext.getPackageName());
    }

    /**
     * TEST CASE:
     * For checking internet connection:
     *
     * When u run this test case and device doesn't have not internet connection at that time test case will fail.
     * When u run this test case and device has live internet connection at that time test case will Pass.
     */
    @Test
    public void isInternetAvilale(){
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertFalse(!Utility.isConnectingToInternet(appContext));
    }

    /**
     * TEST CASE:
     *  NOTE : Might be getting failed to execute.
     * Checking for web service calling and News data
     */
    @Test
    public void isThereNewYorkTimesNewsToday(){
        //Context appContext = InstrumentationRegistry.getTargetContext();
        NewsListingFragment newsListingFragment =new NewsListingFragment();
        newsListingFragment.filterNews();
    }

    /**
     * TEST CASE: WHEN USER PRESS ON NEWS ITEM
     * Wait for approx. 5 seconds while the news data loading
     * then after automatically this test case will execute
     * WHEN USER PRESS ON NEWS ITEM ROW then what Happened.
     */
    @Test
    public void onNewsItemPressed(){
        SystemClock.sleep(5000); /// wait until the service finish data loading so that
        ViewInteraction recyclerView = onView(AllOf.allOf(withId(R.id.newsRV), isDisplayed()));
        onView(withId(R.id.newsRV)).perform(click());
        //recyclerView.perform(actionOnItemAtPosition(2, click()));
        SystemClock.sleep(3000); /// hold to see the result for some time...
    }


    /**
     * TEST CASE: IS SEARCH DIALOG DISPLAYED or not?
     * Wait for 6 seconds while the news data loading
     * then after automatically this test case will execute
     * and Can See the SEARCH DIALOG.
     */
    @Test
    public void isSearchDialogDisplayed(){
        SystemClock.sleep(6000); /// wait until the service finish data loading so that
        onView(withId(R.id.btnSearchOnToolbar)).perform(click());
    }



}
