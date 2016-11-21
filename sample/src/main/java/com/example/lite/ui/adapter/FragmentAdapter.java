package com.example.lite.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * ©2015-2016 kcoin.inc.All Rights Reserved
 *
 * @author: L
 * Description:
 */
public class FragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragmentList;
    private List<String> mIndicatorLabelList;

    public FragmentAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.mFragmentList = fragmentList;
    }

    public FragmentAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> indicatorLabelList) {
        super(fm);
        mFragmentList = fragmentList;
        mIndicatorLabelList = indicatorLabelList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mIndicatorLabelList == null ? super.getPageTitle(position):mIndicatorLabelList.get(position);
    }
}
