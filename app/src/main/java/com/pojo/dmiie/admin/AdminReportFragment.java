package com.pojo.dmiie.admin;

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
import com.pojo.dmiie.model.AdminReportDTO;

import java.util.ArrayList;
import java.util.List;

public class AdminReportFragment extends Fragment implements AdminReportAdapter.AdminReportClickListener {

    RecyclerView reportRecyclerView;
    AdminReportAdapter adminReportAdapter;

    List<AdminReportDTO> adminReportDTOList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_admin_report, container, false);

        reportRecyclerView=(RecyclerView)view.findViewById(R.id.reportRecyclerview);
        reportRecyclerView.setHasFixedSize(true);
        reportRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adminReportDTOList=new ArrayList<>();

        adminReportAdapter=new AdminReportAdapter(getActivity(),adminReportDTOList,AdminReportFragment.this);
        reportRecyclerView.setAdapter(adminReportAdapter);

        getRecyclerViewData();

        return view;
    }

    private void getRecyclerViewData() {


        AdminReportDTO adminReportDTO=new AdminReportDTO("Srini","Murali","9876543219","Active");
        AdminReportDTO adminReportDTO1=new AdminReportDTO("Saravana","Srini","9876543219","Active");
        AdminReportDTO adminReportDTO2=new AdminReportDTO("Srini","Murali","9876543219","Active");
        AdminReportDTO adminReportDTO3=new AdminReportDTO("Saravana","Srini","9876543219","Active");
        AdminReportDTO adminReportDTO4=new AdminReportDTO("Srini","Murali","9876543219","Active");
        AdminReportDTO adminReportDTO5=new AdminReportDTO("Saravana","Srini","9876543219","Active");

        adminReportDTOList.add(adminReportDTO);
        adminReportDTOList.add(adminReportDTO1);
        adminReportDTOList.add(adminReportDTO2);
        adminReportDTOList.add(adminReportDTO3);
        adminReportDTOList.add(adminReportDTO4);
        adminReportDTOList.add(adminReportDTO5);


        adminReportAdapter.setData(adminReportDTOList);



    }

    @Override
    public void onAdminReportClick(AdminReportDTO adminReportDTO) {

        Intent intent=new Intent(getActivity(),AdminReportDetailedViewActivity.class);
        intent.putExtra("LIST",adminReportDTO);
        startActivity(intent);



    }
}
