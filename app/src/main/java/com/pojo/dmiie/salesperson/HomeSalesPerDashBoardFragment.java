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
import com.pojo.dmiie.model.SalesDashBoardDTO;

import java.util.ArrayList;
import java.util.List;

public class HomeSalesPerDashBoardFragment extends Fragment implements SalesDashBoardAdapter.SalesDashBoardClickListener {


    private RecyclerView salesDashBoardRecyclerView;
    private SalesDashBoardAdapter salesDashBoardAdapter;

    private List<SalesDashBoardDTO> salesDashBoardDTOList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_home_sales_dashboard, container, false);


        salesDashBoardRecyclerView=(RecyclerView)view.findViewById(R.id.salesDashBoardRecyclerView);
        salesDashBoardRecyclerView.setHasFixedSize(true);
        salesDashBoardRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        salesDashBoardDTOList=new ArrayList<>();

        salesDashBoardAdapter=new SalesDashBoardAdapter(getActivity(),salesDashBoardDTOList, HomeSalesPerDashBoardFragment.this);
        salesDashBoardRecyclerView.setAdapter(salesDashBoardAdapter);

        getRecyclerViewData();

        return view;

    }

    private void getRecyclerViewData() {


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

    }

    @Override
    public void onSaleClickListener(SalesDashBoardDTO salesDashBoardDTO) {

        Intent intent=new Intent(getActivity(),SalesDashBoardDetailedViewActivity.class);
        intent.putExtra("LIST",salesDashBoardDTO);
        startActivity(intent);


    }
}
