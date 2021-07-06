package com.pojo.dmiie.salesperson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.SalesDashBoardDTO;

public class SalesDashBoardDetailedViewActivity extends AppCompatActivity {

    TextView salesCustName,salesCustMobileNum,salesCustBusOwnNum,salesCustNxtFollowDate,salesCustLastSaleDate;
    Spinner salesCustSpinnerStatus,salesCustSpinnerNeedSample,salesCustSpinnerNeedPriceList,salesCustSpinnerManualVisit,salesCustSpinnerFollowUpStatus;
    EditText salesCustRemark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_dash_board_detailed_view);

        Intent intent =getIntent();
        SalesDashBoardDTO salesDashBoardDTO =(SalesDashBoardDTO)intent.getSerializableExtra("LIST");

        salesCustName=(TextView)findViewById(R.id.salesCust_user_name_detailView);
        salesCustMobileNum=(TextView)findViewById(R.id.salesCust_user_mobile_detailView);
        salesCustBusOwnNum=(TextView)findViewById(R.id.salesCust_owner_mobile_detailView);

        salesCustName.setText(salesDashBoardDTO.getSaleCustName());
        salesCustMobileNum.setText(salesDashBoardDTO.getSaleCustMobileNumber());
        salesCustBusOwnNum.setText(salesDashBoardDTO.getSaleCustBusOwnerName());




    }
}