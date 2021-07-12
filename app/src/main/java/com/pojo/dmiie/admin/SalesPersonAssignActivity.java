package com.pojo.dmiie.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.AdminDashBoardCountDTO;
import com.pojo.dmiie.model.LedgerSearchDTO;
import com.pojo.dmiie.model.SearchResponseDTO;
import com.pojo.dmiie.retrofit.ApiClient;
import com.pojo.dmiie.retrofit.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SalesPersonAssignActivity extends AppCompatActivity {

    EditText toAssignLedger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_person_assign);

        Intent intent =getIntent();
        AdminDashBoardCountDTO adminDashBoardCountDTO= (AdminDashBoardCountDTO) intent.getSerializableExtra("LIST");

        toAssignLedger=(EditText)findViewById(R.id.toAssignLedger);

        toAssignLedger.addTextChangedListener(searchCompany);

    }

    TextWatcher searchCompany=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            String getLedgerName=toAssignLedger.getText().toString();

            getLedgerSearchList(getLedgerName);


        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private void getLedgerSearchList(String getLedgerName) {

        ApiInterface apiInterface = ApiClient.getAPIClient().create(ApiInterface.class);

        LedgerSearchDTO ledgerSearchDTO=new LedgerSearchDTO("ledger_master",getLedgerName);

        Call<SearchResponseDTO> call=apiInterface.getSearchCompanyList();
        call.enqueue(new Callback<SearchResponseDTO>() {
            @Override
            public void onResponse(Call<SearchResponseDTO> call, Response<SearchResponseDTO> response) {



            }

            @Override
            public void onFailure(Call<SearchResponseDTO> call, Throwable t) {

            }
        });




    }


}