package com.android.nytimes.utils;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.android.nytimes.R;


/**
 * Created by N!K$ on 11/11/2015.
 */
public class NavigationUtils {

    private FragmentActivity activity;

    private static NavigationUtils navUtils;

    public static void createInstance(FragmentActivity activity) {
        navUtils = new NavigationUtils(activity);
    }

    public static NavigationUtils getInstance() {
        if (navUtils == null) {
            throw new RuntimeException("Init Frag");
        }
        return navUtils;
    }

    private NavigationUtils(FragmentActivity homeActivity) {
        this.activity = homeActivity;
    }

    /**
     * Checking for If u are adding/pushing same fragment again
     * @param fName
     * @return
     */
    public boolean isSameFragmentOnTop(String fName) {
        String fragName = getTopFragmentName();
        if (fragName == null)
            return false;
        return fName.equals(fragName);

    }
    public String getTopFragmentName() {
        FragmentManager fmManager = activity.getSupportFragmentManager();
        if (fmManager.getBackStackEntryCount() == 0) {
            return null;
        }
        FragmentManager.BackStackEntry topEntry = fmManager.getBackStackEntryAt(fmManager.getBackStackEntryCount() - 1);
        return (topEntry != null) ? topEntry.getName() : null;
    }

    /**
     * Checking for If u are on the first Fragment/Home fragment
     * @return
     */
    public boolean isHomeFragment() {
        FragmentManager fmManager = activity.getSupportFragmentManager();
        return (fmManager.getBackStackEntryCount() == 0);
    }

    /**
     * Programmatically GO Back from fragment screen
     */
    public void goBack() {
        FragmentManager fmManager = activity.getSupportFragmentManager();
        fmManager.popBackStack();
    }

    /**
     * Close all the fragment except first(Home) and land user on Homescreen.
     */
    public void resetToHomeScreen() {
        try {
            FragmentManager fmManager = activity.getSupportFragmentManager();

            fmManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * WE ARE USING THIS TO NAVIGATE : all inner fragments
     */
    public void navigateToFragment(Fragment fragmentToShow) {
        navigateToFragment(fragmentToShow,true);
    }

    /**
     * ADDING ROOT LEVEL (FIRST) FRAGMENT
     * @param fragmentToShow
     * @param addToStack
     */
    public void navigateToFragment(Fragment fragmentToShow, boolean addToStack) {
        if (fragmentToShow == null){
            LogUtils.logError("ERROR: FRAGMENT: ", "We are receiving NULL fragment object");
            return;
        }
        pushFragmentAction(fragmentToShow, addToStack);
    }

    private void pushFragmentAction(Fragment frag, Boolean state) {
        LogUtils.logError("Fragment Pushed: " + frag.getClass().getName());

        if (isSameFragmentOnTop(frag.getClass().toString())) {
            LogUtils.logError("HomeActivity", "Fragment On top:" + frag.getClass().toString());
            return;
        }

        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // load fragment with animations
        //fragmentTransaction.setCustomAnimations(R.anim.fragment_enter_from_left, R.anim.fragment_exit_to_right, R.anim.fragment_enter_from_right, R.anim.fragment_exit_to_left);

        fragmentTransaction.replace(R.id.fragmentContinerView, frag);
        if (state) {
            fragmentTransaction.addToBackStack(frag.getClass().toString());
        }
        try {
            fragmentTransaction.commit();
        } catch (Exception ex) {
            LogUtils.logError("Ex", "Exceptiob Happens\n" + ex.getLocalizedMessage());
        }
    }

}
