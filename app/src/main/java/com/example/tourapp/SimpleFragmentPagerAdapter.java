package com.example.tourapp;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
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
        return 4;
    }
}
