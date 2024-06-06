package com.istiaqahmad.demo_fragment_class;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class pagerAdapter extends FragmentStatePagerAdapter {
   int NumOfTabs;
    public pagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.NumOfTabs = NumOfTabs;

    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                fragment_1 tab1 = new fragment_1();
                return tab1;
            case 1:
                fragment_2 tab2 = new fragment_2();
                return tab2;
            case 2:
                fragment_3 tab3 = new fragment_3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NumOfTabs;
    }
}
