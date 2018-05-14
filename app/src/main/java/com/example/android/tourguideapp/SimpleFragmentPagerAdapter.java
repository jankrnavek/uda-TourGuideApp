package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Sights", "Accommodations", "Activities", "Food"};
    final int PAGE_COUNT = tabTitles.length;

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new AccommodationsFragment();
        } else if (position == 2) {
            return new ActivitiesFragment();
        } else {
            return new FoodFragment();
        }

    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}