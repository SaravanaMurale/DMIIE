package com.pojo.dmiie.salesperson;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.pojo.dmiie.R;
import com.pojo.dmiie.model.SalesDashBoardDTO;

import java.util.ArrayList;
import java.util.List;

public class SalesDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, SalesDashBoardAdapter.SalesDashBoardClickListener {

    private DrawerLayout drawerSales;

    private RecyclerView salesDashBoardRecyclerView;
    private SalesDashBoardAdapter salesDashBoardAdapter;

    private List<SalesDashBoardDTO> salesDashBoardDTOList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_drawer);

        Toolbar toolbar = findViewById(R.id.toolbar_sales);
        setSupportActionBar(toolbar);

        drawerSales = findViewById(R.id.drawer_layout_sales);

        salesDashBoardRecyclerView=(RecyclerView)findViewById(R.id.salesDashBoardRecyclerView);
        salesDashBoardRecyclerView.setHasFixedSize(true);
        salesDashBoardRecyclerView.setLayoutManager(new LinearLayoutManager(SalesDrawerActivity.this));

        salesDashBoardDTOList=new ArrayList<>();

        salesDashBoardAdapter=new SalesDashBoardAdapter(SalesDrawerActivity.this,salesDashBoardDTOList,SalesDrawerActivity.this);
        salesDashBoardRecyclerView.setAdapter(salesDashBoardAdapter);



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


        getRecyclerViewData();

    }

    private void getRecyclerViewData() {


        SalesDashBoardDTO salesDashBoardDTO=new SalesDashBoardDTO("Srini","9876543219","Active","Yes","1000");
        salesDashBoardDTOList.add(salesDashBoardDTO);

        SalesDashBoardDTO salesDashBoardDTO1=new SalesDashBoardDTO("Murali","9876543219","Active","Yes","1000");
        salesDashBoardDTOList.add(salesDashBoardDTO1);

        SalesDashBoardDTO salesDashBoardDTO3=new SalesDashBoardDTO("Srini","9876543219","Active","Yes","1000");
        salesDashBoardDTOList.add(salesDashBoardDTO3);

        SalesDashBoardDTO salesDashBoardDTO4=new SalesDashBoardDTO("Murali","9876543219","Active","Yes","1000");
        salesDashBoardDTOList.add(salesDashBoardDTO4);

        SalesDashBoardDTO salesDashBoardDTO5=new SalesDashBoardDTO("Srini","9876543219","Active","Yes","1000");
        salesDashBoardDTOList.add(salesDashBoardDTO5);

        SalesDashBoardDTO salesDashBoardDTO6=new SalesDashBoardDTO("Murali","9876543219","Active","Yes","1000");
        salesDashBoardDTOList.add(salesDashBoardDTO6);

        salesDashBoardAdapter.setData(salesDashBoardDTOList);

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

    @Override
    public void onSaleClickListener(SalesDashBoardDTO salesDashBoardDTO) {

        Intent intent=new Intent(SalesDrawerActivity.this,SalesDashBoardDetailedViewActivity.class);
        intent.putExtra("LIST",salesDashBoardDTO);
        startActivity(intent);

    }
}