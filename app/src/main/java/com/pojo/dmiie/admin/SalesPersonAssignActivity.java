package com.pojo.dmiie.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.AdminDashBoardCountDTO;

public class SalesPersonAssignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_person_assign);

        Intent intent =getIntent();
        AdminDashBoardCountDTO adminDashBoardCountDTO= (AdminDashBoardCountDTO) intent.getSerializableExtra("LIST");




    }
}