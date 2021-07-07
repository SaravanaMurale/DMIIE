package com.pojo.dmiie.salesperson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.CustomerDashBoardDTO;
import com.pojo.dmiie.model.SalesDashBoardDTO;

public class CustomerDashBoardDetailedViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_dash_board_detailed_view);

        Intent intent =getIntent();
        CustomerDashBoardDTO customerDashBoardDTO =(CustomerDashBoardDTO)intent.getSerializableExtra("LIST");


    }
}