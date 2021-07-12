package com.pojo.dmiie.salesperson;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.LedgerMainDTO;
import com.pojo.dmiie.model.LedgerRequestDTO;
import com.pojo.dmiie.model.LedgerResponseDTO;
import com.pojo.dmiie.model.SalesDashBoardDTO;
import com.pojo.dmiie.retrofit.ApiClient;
import com.pojo.dmiie.retrofit.ApiInterface;
import com.pojo.dmiie.util.AppConstant;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeSalesPerDashBoardFragment extends Fragment implements SalesDashBoardAdapter.SalesDashBoardClickListener {


    private RecyclerView salesDashBoardRecyclerView;
    private SalesDashBoardAdapter salesDashBoardAdapter;

    private List<LedgerMainDTO> salesDashBoardDTOList;

    List<String> ledgerList;

    List<LedgerMainDTO> ledgerMainDTOList;
    List<LedgerMainDTO> myLedgerList;

    int totalLedgerSize;

    public HomeSalesPerDashBoardFragment(List<String> ledgerList) {
        this.ledgerList=ledgerList;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_home_sales_dashboard, container, false);


        salesDashBoardRecyclerView=(RecyclerView)view.findViewById(R.id.salesDashBoardRecyclerView);
        salesDashBoardRecyclerView.setHasFixedSize(true);
        salesDashBoardRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        salesDashBoardDTOList=new ArrayList<>();

        ledgerMainDTOList=new ArrayList<>();

        myLedgerList=new ArrayList<>();

        salesDashBoardAdapter=new SalesDashBoardAdapter(getActivity(),salesDashBoardDTOList, HomeSalesPerDashBoardFragment.this);
        salesDashBoardRecyclerView.setAdapter(salesDashBoardAdapter);

        //getRecyclerViewData();

        totalLedgerSize = ledgerList.size();

        for (int i = 0; i <ledgerList.size() ; i++) {

            getAllMyCompanyList(ledgerList.get(i));

        }



        return view;

    }

    private void getAllMyCompanyList(String s) {

        ApiInterface apiInterface = ApiClient.getAPIClient().create(ApiInterface.class);

        LedgerRequestDTO ledgerRequestDTO = new LedgerRequestDTO("v", "y", "new", "y", "01-02-2019", "30-03-2019", "6001 - ", s);

        Call<LedgerResponseDTO> call = apiInterface.getMyLedgerDetails(AppConstant.getAuthToken(getActivity()), ledgerRequestDTO);
        call.enqueue(new Callback<LedgerResponseDTO>() {
            @Override
            public void onResponse(Call<LedgerResponseDTO> call, Response<LedgerResponseDTO> response) {

                LedgerResponseDTO ledgerResponseDTO = response.body();

                ledgerMainDTOList = ledgerResponseDTO.getLedgerDetails().getLedgerMainDTOList();

                LedgerMainDTO ledgerMainDTO =ledgerMainDTOList.get(0);
                myLedgerList.add(ledgerMainDTO);

                if (totalLedgerSize == myLedgerList.size()) {

                    salesDashBoardAdapter.setData(myLedgerList);
                }

            }

            @Override
            public void onFailure(Call<LedgerResponseDTO> call, Throwable t) {

            }
        });

    }

    /*private void getRecyclerViewData() {


        SalesDashBoardDTO salesDashBoardDTO=new SalesDashBoardDTO("Srini","98765432","Active","Yes","1000");
        salesDashBoardDTOList.add(salesDashBoardDTO);

        SalesDashBoardDTO salesDashBoardDTO1=new SalesDashBoardDTO("Murali","98765432","Active","Yes","1000");
        salesDashBoardDTOList.add(salesDashBoardDTO1);

        SalesDashBoardDTO salesDashBoardDTO3=new SalesDashBoardDTO("Srini","98765432","Active","Yes","1000");
        salesDashBoardDTOList.add(salesDashBoardDTO3);

        SalesDashBoardDTO salesDashBoardDTO4=new SalesDashBoardDTO("Murali","98765432","Active","Yes","1000");
        salesDashBoardDTOList.add(salesDashBoardDTO4);

        SalesDashBoardDTO salesDashBoardDTO5=new SalesDashBoardDTO("Srini","98765432","Active","Yes","1000");
        salesDashBoardDTOList.add(salesDashBoardDTO5);

        SalesDashBoardDTO salesDashBoardDTO6=new SalesDashBoardDTO("Murali","98765432","Active","Yes","1000");
        salesDashBoardDTOList.add(salesDashBoardDTO6);

        salesDashBoardAdapter.setData(salesDashBoardDTOList);

    }*/

    @Override
    public void onSaleClickListener(LedgerMainDTO salesDashBoardDTO) {

        Intent intent=new Intent(getActivity(),SalesDashBoardDetailedViewActivity.class);
        intent.putExtra("LIST",salesDashBoardDTO);
        startActivity(intent);


    }
}
