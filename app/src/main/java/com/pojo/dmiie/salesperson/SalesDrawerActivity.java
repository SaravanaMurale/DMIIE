package com.pojo.dmiie.salesperson;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.pojo.dmiie.R;
import com.pojo.dmiie.model.SalesDashBoardDTO;

import java.util.ArrayList;
import java.util.List;

public class SalesDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerSales;



    private TabLayout tabLayoutSales;
    private ViewPager viewPagerSales;
    private TabItem salesTabItemSales,customerTabItemSales;
    public PagerAdapterSales pagerAdapterSales;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_drawer);

        Toolbar toolbar = findViewById(R.id.toolbar_sales);
        setSupportActionBar(toolbar);

        drawerSales = findViewById(R.id.drawer_layout_sales);


        tabLayoutSales =(TabLayout)findViewById(R.id.tabLayoutSales);
        salesTabItemSales=(TabItem)findViewById(R.id.tab1Sales);
        customerTabItemSales=(TabItem)findViewById(R.id.tab2Sales);
        viewPagerSales=(ViewPager)findViewById(R.id.viewPagerSales);

        pagerAdapterSales =new PagerAdapterSales(getSupportFragmentManager(),tabLayoutSales.getTabCount());
        viewPagerSales.setAdapter(pagerAdapterSales);







        NavigationView navigationView = findViewById(R.id.nav_view_admin);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerSales, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerSales.addDrawerListener(toggle);
        drawerSales.openDrawer(GravityCompat.START);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                drawerSales.closeDrawer(GravityCompat.START);
            }
        },1000);
        toggle.syncState();

        tabLayoutSales.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerSales.setCurrentItem(tab.getPosition());

                if(tab.getPosition()==0){
                    pagerAdapterSales.notifyDataSetChanged();
                }
                else if(tab.getPosition()==0){
                    pagerAdapterSales.notifyDataSetChanged();
                }
                else if(tab.getPosition()==0){
                    pagerAdapterSales.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent = null;

        switch (item.getItemId()) {
            case R.id.nav_message_sales:
                //intent = new Intent(AdminDrawerActivity.this, ScholFeesStandardSelectionActivity.class);
                break;

            case R.id.nav_chat_sales:
                //intent = new Intent(AdminDrawerActivity.this, ColgStuFeesActivity.class);
                break;

            case R.id.nav_profile_sales:
                //intent = new Intent(AdminDrawerActivity.this, ProfileActivity.class);
                break;

            case R.id.nav_logout_sales:
                clearAllData();
                break;
        }

        if(intent!=null){
            startActivity(intent);
        }
        drawerSales.closeDrawer(GravityCompat.START);
        return true;
    }

    private void clearAllData() {
    }

}