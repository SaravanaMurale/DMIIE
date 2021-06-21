package com.pojo.dmiie.admin;

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

public class AdminDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_drawer);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerAdmin = findViewById(R.id.drawer_layout_admin);


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
        },1000);
        toggle.syncState();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent = null;

        switch (item.getItemId()) {
            case R.id.nav_message:
                //intent = new Intent(AdminDrawerActivity.this, ScholFeesStandardSelectionActivity.class);
                break;

            case R.id.nav_chat:
                //intent = new Intent(AdminDrawerActivity.this, ColgStuFeesActivity.class);
                break;

            case R.id.nav_profile:
                //intent = new Intent(AdminDrawerActivity.this, ProfileActivity.class);
                break;

            case R.id.nav_logout:
                clearAllData();
                break;
        }

        if(intent!=null){
            startActivity(intent);
        }
        drawerAdmin.closeDrawer(GravityCompat.START);
        return true;
    }

    private void clearAllData() {
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