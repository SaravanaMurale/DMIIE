package com.pojo.dmiie.salesperson;

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
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.SalesDashBoardDTO;

import java.util.Calendar;

public class SalesDashBoardDetailedViewActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView salesCustName,salesCustMobileNum,salesCustBusOwnNum,salesCustNxtFollowDate,salesCustLastSaleDate;
    Spinner salesCustSpinnerStatus,salesCustSpinnerNeedSample,salesCustSpinnerNeedPriceList,salesCustSpinnerManualVisit,salesCustSpinnerFollowUpStatus;
    EditText salesCustRemark;

    RelativeLayout nxtfollowUpBlock;
    DatePickerDialog.OnDateSetListener setListenerDateOfBirth;
    String nxtFollowDateString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_dash_board_detailed_view);

        Intent intent =getIntent();
        SalesDashBoardDTO salesDashBoardDTO =(SalesDashBoardDTO)intent.getSerializableExtra("LIST");

        salesCustName=(TextView)findViewById(R.id.salesCust_user_name_detailView);
        salesCustMobileNum=(TextView)findViewById(R.id.salesCust_user_mobile_detailView);
        salesCustBusOwnNum=(TextView)findViewById(R.id.salesCust_owner_mobile_detailView);

        salesCustSpinnerStatus=(Spinner)findViewById(R.id.salesCust_status_detailView);
        salesCustSpinnerNeedSample=(Spinner)findViewById(R.id.salesCust_need_sample_detailView);
        salesCustSpinnerNeedPriceList=(Spinner)findViewById(R.id.salesCust_need_price_list_detailView);
        salesCustSpinnerManualVisit=(Spinner)findViewById(R.id.salesCust_manual_visit_detailView);
        salesCustSpinnerFollowUpStatus=(Spinner)findViewById(R.id.salesCust_follow_status_detailView);

        nxtfollowUpBlock=(RelativeLayout)findViewById(R.id.nxtfollowUpBlock);



        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int date = calendar.get(Calendar.DATE);

        nxtfollowUpBlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(SalesDashBoardDetailedViewActivity.this, android.R.style.Theme_Holo_Light_Dialog, setListenerDateOfBirth, year, month, date);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        setListenerDateOfBirth = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                month = month + 1;
                String date = dayOfMonth + "/" + month + "/" + year;
                salesCustNxtFollowDate.setText(date);

                nxtFollowDateString=date;

                System.out.println("selectedFromDate " + date);


            }
        };


        ArrayAdapter<CharSequence> customerStatus = ArrayAdapter.createFromResource(SalesDashBoardDetailedViewActivity.this, R.array.customer_status, android.R.layout.simple_spinner_item);
        customerStatus.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        salesCustSpinnerStatus.setAdapter(customerStatus);
        salesCustSpinnerStatus.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> needSample = ArrayAdapter.createFromResource(SalesDashBoardDetailedViewActivity.this, R.array.need_sample, android.R.layout.simple_spinner_item);
        needSample.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        salesCustSpinnerNeedSample.setAdapter(needSample);
        salesCustSpinnerNeedSample.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> needPriceList = ArrayAdapter.createFromResource(SalesDashBoardDetailedViewActivity.this, R.array.need_price_list, android.R.layout.simple_spinner_item);
        needPriceList.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        salesCustSpinnerNeedPriceList.setAdapter(needPriceList);
        salesCustSpinnerNeedPriceList.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> manualVisitReq = ArrayAdapter.createFromResource(SalesDashBoardDetailedViewActivity.this, R.array.manual_visit, android.R.layout.simple_spinner_item);
        manualVisitReq.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        salesCustSpinnerManualVisit.setAdapter(manualVisitReq);
        salesCustSpinnerManualVisit.setOnItemSelectedListener(this);


        ArrayAdapter<CharSequence> followUpStatus = ArrayAdapter.createFromResource(SalesDashBoardDetailedViewActivity.this, R.array.nxt_follow, android.R.layout.simple_spinner_item);
        followUpStatus.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        salesCustSpinnerFollowUpStatus.setAdapter(followUpStatus);
        salesCustSpinnerFollowUpStatus.setOnItemSelectedListener(this);




        salesCustName.setText(salesDashBoardDTO.getSaleCustName());
        salesCustMobileNum.setText(salesDashBoardDTO.getSaleCustMobileNumber());
        salesCustBusOwnNum.setText(salesDashBoardDTO.getSaleCustBusOwnerName());




    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}