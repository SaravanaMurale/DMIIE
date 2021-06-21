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

import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.pojo.dmiie.R;

public class AdminDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerAdmin;
    FragmentManager fragmentManagerAdmin;
    FragmentTransaction fragmentTransactionAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_drawer);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
        },1000);
        toggle.syncState();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment=null;


        switch (item.getItemId()) {
            case R.id.nav_message:
                fragment=new AssignSalesPersonFragment();
                break;

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