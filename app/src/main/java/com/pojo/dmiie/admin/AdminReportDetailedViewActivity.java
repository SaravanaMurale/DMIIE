package com.pojo.dmiie.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.AdminReportDTO;
import com.pojo.dmiie.salesperson.SalesDashBoardDetailedViewActivity;

import java.util.Calendar;

public class AdminReportDetailedViewActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner assignActiveStatusSpinner,assignNeedSampleSpinner,assignNeedPriceListSpinner,assignManualVistSpinner;

    RelativeLayout assignNxtFollowBlock;
    private DatePickerDialog.OnDateSetListener setListenerDateOfBirth;
    private String nxtFollowDateString;

    TextView assignNxtFollowTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_report_detailed_view);

        Intent intent =getIntent();
        AdminReportDTO adminReportDTO = (AdminReportDTO) intent.getSerializableExtra("LIST");


        assignActiveStatusSpinner=(Spinner)findViewById(R.id.assignActiveStatus);
        assignNeedSampleSpinner=(Spinner)findViewById(R.id.assignNeedSample);
        assignNeedPriceListSpinner=(Spinner)findViewById(R.id.assignNeedPriceList);
        assignManualVistSpinner=(Spinner)findViewById(R.id.assignManualVist);

        assignNxtFollowTxt=(TextView)findViewById(R.id.assignNxtFollowTxt);

        assignNxtFollowBlock=(RelativeLayout)findViewById(R.id.assignNxtFollowBlock);


        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int date = calendar.get(Calendar.DATE);

        assignNxtFollowBlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(AdminReportDetailedViewActivity.this, android.R.style.Theme_Holo_Light_Dialog, setListenerDateOfBirth, year, month, date);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        setListenerDateOfBirth = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                month = month + 1;
                String date = dayOfMonth + "/" + month + "/" + year;
                assignNxtFollowTxt.setText(date);

                nxtFollowDateString=date;

                System.out.println("selectedFromDate " + date);


            }
        };

        ArrayAdapter<CharSequence> assignActiveStatus = ArrayAdapter.createFromResource(AdminReportDetailedViewActivity.this, R.array.customer_status, android.R.layout.simple_spinner_item);
        assignActiveStatus.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        assignActiveStatusSpinner.setAdapter(assignActiveStatus);
        assignActiveStatusSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> assignNeedSample = ArrayAdapter.createFromResource(AdminReportDetailedViewActivity.this, R.array.need_sample, android.R.layout.simple_spinner_item);
        assignNeedSample.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        assignNeedSampleSpinner.setAdapter(assignNeedSample);
        assignNeedSampleSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> assigNeedPriceList = ArrayAdapter.createFromResource(AdminReportDetailedViewActivity.this, R.array.need_price_list, android.R.layout.simple_spinner_item);
        assigNeedPriceList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        assignNeedPriceListSpinner.setAdapter(assigNeedPriceList);
        assignNeedPriceListSpinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> assignManualVisitReq = ArrayAdapter.createFromResource(AdminReportDetailedViewActivity.this, R.array.manual_visit, android.R.layout.simple_spinner_item);
        assignManualVisitReq.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        assignManualVistSpinner.setAdapter(assignManualVisitReq);
        assignManualVistSpinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}