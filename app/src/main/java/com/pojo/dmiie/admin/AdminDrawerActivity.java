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

import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.pojo.dmiie.R;
import com.pojo.dmiie.model.AdminDashBoardCountDTO;

import java.util.ArrayList;
import java.util.List;

public class AdminDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerAdmin;
    FragmentManager fragmentManagerAdmin;
    FragmentTransaction fragmentTransactionAdmin;

    RecyclerView recyclerViewAdminDashboard;
    AdminDashBoardAdapter adminDashBoardAdapter;
    Toolbar toolbar;
    
    List<AdminDashBoardCountDTO> adminDashBoardCountDTOList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_drawer);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerAdmin = findViewById(R.id.drawer_layout_admin);
        fragmentManagerAdmin=getSupportFragmentManager();
        fragmentTransactionAdmin=fragmentManagerAdmin.beginTransaction();
        
        recyclerViewAdminDashboard=(RecyclerView)findViewById(R.id.adminRecyclerView);
        recyclerViewAdminDashboard.setHasFixedSize(true);
        recyclerViewAdminDashboard.setLayoutManager(new LinearLayoutManager(AdminDrawerActivity.this));
        
        adminDashBoardCountDTOList=new ArrayList<>();
        
        adminDashBoardAdapter=new AdminDashBoardAdapter(AdminDrawerActivity.this,adminDashBoardCountDTOList);
        recyclerViewAdminDashboard.setAdapter(adminDashBoardAdapter);
        
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


        
        getDashBoardCount();
        
    }

    private void getDashBoardCount() {

        AdminDashBoardCountDTO adminDashBoardCountDTO=new AdminDashBoardCountDTO("Saravana",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO1=new AdminDashBoardCountDTO("Murali",50,0,5,2);
        AdminDashBoardCountDTO adminDashBoardCountDTO2=new AdminDashBoardCountDTO("Suresh",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO3=new AdminDashBoardCountDTO("Ramesh",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO4=new AdminDashBoardCountDTO("Saravana",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO5=new AdminDashBoardCountDTO("Murali",50,0,5,2);
        AdminDashBoardCountDTO adminDashBoardCountDTO6=new AdminDashBoardCountDTO("Suresh",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO7=new AdminDashBoardCountDTO("Ramesh",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO8=new AdminDashBoardCountDTO("Saravana",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO9=new AdminDashBoardCountDTO("Murali",50,0,5,2);
        AdminDashBoardCountDTO adminDashBoardCountDTO10=new AdminDashBoardCountDTO("Suresh",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO11=new AdminDashBoardCountDTO("Ramesh",50,5,2,6);

        adminDashBoardCountDTOList.add(adminDashBoardCountDTO);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO1);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO2);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO3);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO4);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO5);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO6);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO7);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO8);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO9);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO10);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO11);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO5);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO6);

        adminDashBoardAdapter.setData(adminDashBoardCountDTOList);

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