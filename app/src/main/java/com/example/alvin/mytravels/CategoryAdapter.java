package com.example.alvin.mytravels;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    /**
     * Create constructor for new {@link CategoryAdapter} object
     *
     * @param fm      Fragment manager keeping track of fragment states
     * @param context Referring to the activity of app
     */
    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    // Get position for desired fragment to display
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HistoricalSitesFragment();
            case 1:
                return new LandmarksFragment();
            case 2:
                return new DiningFragment();
            case 3:
                return new ActivitiesFragment();
            default:
                return new HistoricalSitesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_history);
            case 1:
                return mContext.getString(R.string.category_landmarks);
            case 2:
                return mContext.getString(R.string.category_dining);
            case 3:
                return mContext.getString(R.string.category_activities);
            default:
                return null;
        }
    }
}


