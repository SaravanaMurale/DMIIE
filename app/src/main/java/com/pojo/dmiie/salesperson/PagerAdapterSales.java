package com.pojo.dmiie.salesperson;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class PagerAdapterSales extends FragmentPagerAdapter {


    private int numOfTabsSales;
    List<String> ledgerList;


    public PagerAdapterSales(@NonNull FragmentManager fm, int numOfTabsSales, List<String> ledgerList) {
        super(fm);

        this.numOfTabsSales=numOfTabsSales;
        this.ledgerList=ledgerList;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeSalesPerDashBoardFragment(ledgerList);
            case 1:
                return new CustomerSalesPerDashBoardFragment(ledgerList);

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
