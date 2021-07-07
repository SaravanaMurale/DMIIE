package com.pojo.dmiie.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.AdminReportDTO;

public class AdminReportDetailedViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_report_detailed_view);

        Intent intent =getIntent();
        AdminReportDTO adminReportDTO = (AdminReportDTO) intent.getSerializableExtra("LIST");
    }
}