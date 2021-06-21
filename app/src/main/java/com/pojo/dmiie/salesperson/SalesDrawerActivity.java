package com.pojo.dmiie.salesperson;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.pojo.dmiie.R;

public class SalesDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerSales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_drawer);

        Toolbar toolbar = findViewById(R.id.toolbar_sales);
        setSupportActionBar(toolbar);

        drawerSales = findViewById(R.id.drawer_layout_sales);


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