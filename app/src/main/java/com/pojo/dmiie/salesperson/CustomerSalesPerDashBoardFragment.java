package com.pojo.dmiie.salesperson;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.CustomerDashBoardDTO;
import com.pojo.dmiie.model.LedgerMainDTO;
import com.pojo.dmiie.model.LedgerRequestDTO;
import com.pojo.dmiie.model.LedgerResponseDTO;
import com.pojo.dmiie.retrofit.ApiClient;
import com.pojo.dmiie.retrofit.ApiInterface;
import com.pojo.dmiie.util.AppConstant;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CustomerSalesPerDashBoardFragment extends Fragment implements CustomerDashBoardAdapter.CustomerDashBoardClickListener {

    private RecyclerView customerDashBoardRecyclerView;
    private CustomerDashBoardAdapter customerDashBoardAdapter;

    private List<LedgerMainDTO> customerDashBoardDTOList;

    List<String> ledgerList;
    int totalLedgerSize;

    CustomerSalesPerDashBoardFragment(List<String> ledgerList) {
        this.ledgerList = ledgerList;
    }

    List<LedgerMainDTO> ledgerMainDTOList;
    List<LedgerMainDTO> myLedgerList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_home_customer_dashboard, container, false);

        customerDashBoardRecyclerView = (RecyclerView) view.findViewById(R.id.customerDashBoardRecyclerView);
        customerDashBoardRecyclerView.setHasFixedSize(true);
        customerDashBoardRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        customerDashBoardDTOList = new ArrayList<>();

        myLedgerList=new ArrayList<>();

        customerDashBoardAdapter = new CustomerDashBoardAdapter(getActivity(), customerDashBoardDTOList, CustomerSalesPerDashBoardFragment.this);
        customerDashBoardRecyclerView.setAdapter(customerDashBoardAdapter);

        System.out.println("MyLedgerList" + ledgerList.size());

        totalLedgerSize = ledgerList.size();


        for (int i = 0; i < ledgerList.size(); i++) {

            //System.out.println("MyLedgerCode" + ledgerList.get(i));

            getMyLedgerData(ledgerList.get(i));


        }

        //getRecyclerViewData();

        return view;
    }

    private void getMyLedgerData(String s) {

        ApiInterface apiInterface = ApiClient.getAPIClient().create(ApiInterface.class);

        final LedgerRequestDTO ledgerRequestDTO = new LedgerRequestDTO("v", "y", "new", "y", "01-02-2019", "30-03-2019", "6001 - ", s);

        Call<LedgerResponseDTO> call = apiInterface.getMyLedgerDetails(AppConstant.getAuthToken(getActivity()), ledgerRequestDTO);
        call.enqueue(new Callback<LedgerResponseDTO>() {
            @Override
            public void onResponse(Call<LedgerResponseDTO> call, Response<LedgerResponseDTO> response) {


                System.out.println("LedgerSuccess");
                LedgerResponseDTO ledgerResponseDTO = response.body();
                //ledgerResponseDTO.getLedgerDetails().getLedgerMainDTOList().size();

                ledgerMainDTOList = ledgerResponseDTO.getLedgerDetails().getLedgerMainDTOList();

                LedgerMainDTO ledgerMainDTO =ledgerMainDTOList.get(0);

                myLedgerList.add(ledgerMainDTO);


                //copyOfLedgerMainDTOList.add(ledgerMainDTOList);


              /* for (int i = 0; i <ledgerResponseDTO.getLedgerDetails().getLedgerMainDTOList().size() ; i++) {

                   System.out.println("ListOfLEdgerNames"+ledgerResponseDTO.getLedgerDetails().getLedgerMainDTOList().get(i).getLedgerName());
               }*/

                //System.out.println("totalLedgerSize" + totalLedgerSize);

                if (totalLedgerSize == myLedgerList.size()) {

                    customerDashBoardAdapter.setData(myLedgerList);
                }
            }

            @Override
            public void onFailure(Call<LedgerResponseDTO> call, Throwable t) {

            }
        });

    }


    @Override
    public void onCustomerBashBoardClick(LedgerMainDTO customerDashBoardDTO) {

        Intent intent = new Intent(getActivity(), CustomerDashBoardDetailedViewActivity.class);
        intent.putExtra("LIST", customerDashBoardDTO);
        startActivity(intent);


    }



    /*private void getRecyclerViewData() {

        CustomerDashBoardDTO customerDashBoardDTO=new CustomerDashBoardDTO("Srini","9876543219","07-06-2021","Active","15-06-2021");
        customerDashBoardDTOList.add(customerDashBoardDTO);

        CustomerDashBoardDTO customerDashBoardDTO1=new CustomerDashBoardDTO("Srini","9876543219","07-06-2021","Active","15-06-2021");
        customerDashBoardDTOList.add(customerDashBoardDTO1);

        CustomerDashBoardDTO customerDashBoardDTO2=new CustomerDashBoardDTO("Srini","9876543219","07-06-2021","Active","15-06-2021");
        customerDashBoardDTOList.add(customerDashBoardDTO2);


        CustomerDashBoardDTO customerDashBoardDTO3=new CustomerDashBoardDTO("Srini","9876543219","07-06-2021","Active","15-06-2021");
        customerDashBoardDTOList.add(customerDashBoardDTO3);

        CustomerDashBoardDTO customerDashBoardDTO4=new CustomerDashBoardDTO("Srini","9876543219","07-06-2021","Active","15-06-2021");
        customerDashBoardDTOList.add(customerDashBoardDTO4);

        CustomerDashBoardDTO customerDashBoardDTO5=new CustomerDashBoardDTO("Srini","9876543219","07-06-2021","Active","15-06-2021");
        customerDashBoardDTOList.add(customerDashBoardDTO5);

        //customerDashBoardAdapter.setData(customerDashBoardDTOList);


    }*/

}
