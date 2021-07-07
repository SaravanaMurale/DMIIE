package com.pojo.dmiie.salesperson;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapterSales extends FragmentPagerAdapter {


    private int numOfTabsSales;


    public PagerAdapterSales(@NonNull FragmentManager fm,int numOfTabsSales) {
        super(fm);

        this.numOfTabsSales=numOfTabsSales;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeSalesPerDashBoardFragment();
            case 1:
                return new CustomerSalesPerDashBoardFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabsSales;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
