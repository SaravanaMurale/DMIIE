package com.pojo.dmiie.salesperson;

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

        return view;
    }

    @Override
    public void onCustomerBashBoardClick() {

    }
}
