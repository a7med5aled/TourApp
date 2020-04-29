package com.example.tourapp;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {


    private Context myContext;
    int totalTabs;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Resturant_Activity();
        }
        else if (position == 1){
            return new Event_Fragment();
        }
        else if (position == 2){
            return new IslamicFragment();
        }
        else {
            return new Museum();
        }
    }

    @Override
    public int getCount() {
        return totalTabs;

    }
}

