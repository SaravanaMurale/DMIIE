package com.pojo.dmiie.salesperson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.CustomerDashBoardDTO;
import com.pojo.dmiie.model.SalesDashBoardDTO;

public class CustomerDashBoardDetailedViewActivity extends AppCompatActivity {

    TextView custCust_user_name_detailView,custCust_user_mobile_detailView;
    EditText custCust_last_purchase_detailView,custCust_last_sale_amt_detailView,custCust_remarks_detailView;
    Spinner custCust_active_detailView;
    Button custBtnDetailView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_dash_board_detailed_view);

        Intent intent =getIntent();
        CustomerDashBoardDTO customerDashBoardDTO =(CustomerDashBoardDTO)intent.getSerializableExtra("LIST");

        custCust_user_name_detailView=(TextView)findViewById(R.id.custCust_user_name_detailView);
        custCust_user_mobile_detailView=(TextView)findViewById(R.id.custCust_user_mobile_detailView);

        custCust_last_purchase_detailView=(EditText)findViewById(R.id.custCust_last_purchase_detailView);
        custCust_last_sale_amt_detailView=(EditText)findViewById(R.id.custCust_last_sale_amt_detailView);
        custCust_remarks_detailView=(EditText)findViewById(R.id.custCust_remarks_detailView);

        custBtnDetailView=(Button)findViewById(R.id.custBtnDetailView);

        custCust_user_name_detailView.setText(customerDashBoardDTO.getCustCustomerName());
        custCust_user_mobile_detailView.setText(customerDashBoardDTO.getCustCustomerMobileNumber());

        custCust_last_purchase_detailView.setText(customerDashBoardDTO.getCustLastPurchaseDate());



    }
}