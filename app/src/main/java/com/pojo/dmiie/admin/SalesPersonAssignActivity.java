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
import com.pojo.dmiie.util.PreferenceUtil;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SalesPersonAssignActivity extends AppCompatActivity {

    EditText toAssignLedger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales_person_assign);

        Intent intent = getIntent();
        AdminDashBoardCountDTO adminDashBoardCountDTO = (AdminDashBoardCountDTO) intent.getSerializableExtra("LIST");

        toAssignLedger = (EditText) findViewById(R.id.toAssignLedger);

        getLedgerSearchList("su");

        //toAssignLedger.addTextChangedListener(searchCompany);

    }

    TextWatcher searchCompany = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            String getLedgerName = toAssignLedger.getText().toString();


            if (getLedgerName.length() >= 2) {

                getLedgerSearchList(getLedgerName);
            }else {

            }


        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private void getLedgerSearchList(String getLedgerName) {

        String s="su";

        ApiInterface apiInterface = ApiClient.getAPIClient().create(ApiInterface.class);

        LedgerSearchDTO ledgerSearchDTO = new LedgerSearchDTO("ledger_master", getLedgerName);

        Call<SearchResponseDTO> call = apiInterface.getSearchCompanyList(PreferenceUtil.getValueString(SalesPersonAssignActivity.this,PreferenceUtil.AUTH_TOKEN),ledgerSearchDTO);
        call.enqueue(new Callback<SearchResponseDTO>() {
            @Override
            public void onResponse(Call<SearchResponseDTO> call, Response<SearchResponseDTO> response) {

                SearchResponseDTO searchResponseDTO=response.body();

                if(searchResponseDTO.getSearchListDTOList()==null){

                }else if(searchResponseDTO.getSearchListDTOList()!=null) {

                    if(searchResponseDTO.getSearchListDTOList().size()>0){

                        System.out.println("SearchListSize"+searchResponseDTO.getSearchListDTOList().size());
                    }else {

                    }



                }else {

                }

            }

            @Override
            public void onFailure(Call<SearchResponseDTO> call, Throwable t) {

            }
        });


    }


}