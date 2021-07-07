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
import com.pojo.dmiie.model.CustomerDashBoardDTO;
import com.pojo.dmiie.model.SalesDashBoardDTO;

import java.util.ArrayList;
import java.util.List;

public class CustomerSalesPerDashBoardFragment extends Fragment implements CustomerDashBoardAdapter.CustomerDashBoardClickListener {

    private RecyclerView customerDashBoardRecyclerView;
    private CustomerDashBoardAdapter customerDashBoardAdapter;

    private List<CustomerDashBoardDTO> customerDashBoardDTOList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_home_customer_dashboard, container, false);

        customerDashBoardRecyclerView=(RecyclerView)view.findViewById(R.id.customerDashBoardRecyclerView);
        customerDashBoardRecyclerView.setHasFixedSize(true);
        customerDashBoardRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        customerDashBoardDTOList=new ArrayList<>();

        customerDashBoardAdapter=new CustomerDashBoardAdapter(getActivity(),customerDashBoardDTOList, CustomerSalesPerDashBoardFragment.this);
        customerDashBoardRecyclerView.setAdapter(customerDashBoardAdapter);

        getRecyclerViewData();

        return view;
    }

    private void getRecyclerViewData() {

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

        customerDashBoardAdapter.setData(customerDashBoardDTOList);


    }

    @Override
    public void onCustomerBashBoardClick(CustomerDashBoardDTO customerDashBoardDTO) {

        Intent intent=new Intent(getActivity(),CustomerDashBoardDetailedViewActivity.class);
        intent.putExtra("LIST",customerDashBoardDTO);
        startActivity(intent);


    }
}
