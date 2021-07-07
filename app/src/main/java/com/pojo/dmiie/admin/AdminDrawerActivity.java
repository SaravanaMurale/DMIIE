package com.pojo.dmiie.admin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.pojo.dmiie.LoginActivity;
import com.pojo.dmiie.R;
import com.pojo.dmiie.model.AdminDashBoardCountDTO;
import com.pojo.dmiie.util.PreferenceUtil;

import java.util.ArrayList;
import java.util.List;

public class AdminDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerAdmin;
    FragmentManager fragmentManagerAdmin;
    FragmentTransaction fragmentTransactionAdmin;


    Toolbar toolbar;


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem salesTabItem,customerTabItem;
    public PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_drawer);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout =(TabLayout)findViewById(R.id.tabLayout);
        salesTabItem=(TabItem)findViewById(R.id.tab1);
        customerTabItem=(TabItem)findViewById(R.id.tab2);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

        pagerAdapter=new com.pojo.dmiie.admin.PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        drawerAdmin = findViewById(R.id.drawer_layout_admin);
        fragmentManagerAdmin=getSupportFragmentManager();
        fragmentTransactionAdmin=fragmentManagerAdmin.beginTransaction();

        
        NavigationView navigationView = findViewById(R.id.nav_view_admin);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerAdmin, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerAdmin.addDrawerListener(toggle);
        drawerAdmin.openDrawer(GravityCompat.START);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                drawerAdmin.closeDrawer(GravityCompat.START);
            }
        },2000);
        toggle.syncState();

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());

                if(tab.getPosition()==0){
                    pagerAdapter.notifyDataSetChanged();
                }
                else if(tab.getPosition()==0){
                    pagerAdapter.notifyDataSetChanged();
                }
                else if(tab.getPosition()==0){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment=null;


        switch (item.getItemId()) {

            case R.id.nav_chat:
                fragment=new AdminReportFragment();
                break;

            case R.id.nav_profile:
                fragment=new AdminProfileFragment();
                break;

            case R.id.nav_logout:
                clearAllData();
                break;
        }

        if(fragment!=null){
            fragmentTransactionAdmin.replace(R.id.fragment_container_admin,fragment);
            fragmentTransactionAdmin.addToBackStack("fragmentB");
            fragmentTransactionAdmin.commit();
        }
        drawerAdmin.closeDrawer(GravityCompat.START);
        return true;
    }

    private void clearAllData() {

        PreferenceUtil.clear(AdminDrawerActivity.this);
        Intent intent=new Intent(AdminDrawerActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();

    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if (drawerAdmin.isDrawerOpen(GravityCompat.START)) {
            drawerAdmin.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }
}