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
import com.pojo.dmiie.model.AdminDashBoardCountDTO;

import java.util.ArrayList;
import java.util.List;

public class HomeSalesPersonFragment extends Fragment implements AdminDashBoardAdapter.SalesPerAssignListener {

    RecyclerView recyclerViewAdminDashboard;
    AdminDashBoardAdapter adminDashBoardAdapter;

    List<AdminDashBoardCountDTO> adminDashBoardCountDTOList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_home_salesperson, container, false);

        recyclerViewAdminDashboard=(RecyclerView)view.findViewById(R.id.adminRecyclerView);
        recyclerViewAdminDashboard.setHasFixedSize(true);
        recyclerViewAdminDashboard.setLayoutManager(new LinearLayoutManager(getActivity()));

        adminDashBoardCountDTOList=new ArrayList<>();

        adminDashBoardAdapter=new AdminDashBoardAdapter(getActivity(),adminDashBoardCountDTOList,HomeSalesPersonFragment.this);
        recyclerViewAdminDashboard.setAdapter(adminDashBoardAdapter);

        getDashBoardCount();

        return view;
    }

    private void getDashBoardCount() {

        AdminDashBoardCountDTO adminDashBoardCountDTO=new AdminDashBoardCountDTO("Saravana",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO1=new AdminDashBoardCountDTO("Murali",50,0,5,2);
        AdminDashBoardCountDTO adminDashBoardCountDTO2=new AdminDashBoardCountDTO("Suresh",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO3=new AdminDashBoardCountDTO("Ramesh",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO4=new AdminDashBoardCountDTO("Saravana",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO5=new AdminDashBoardCountDTO("Murali",50,0,5,2);
        AdminDashBoardCountDTO adminDashBoardCountDTO6=new AdminDashBoardCountDTO("Suresh",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO7=new AdminDashBoardCountDTO("Ramesh",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO8=new AdminDashBoardCountDTO("Saravana",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO9=new AdminDashBoardCountDTO("Murali",50,0,5,2);
        AdminDashBoardCountDTO adminDashBoardCountDTO10=new AdminDashBoardCountDTO("Suresh",50,5,2,6);
        AdminDashBoardCountDTO adminDashBoardCountDTO11=new AdminDashBoardCountDTO("Ramesh",50,5,2,6);

        adminDashBoardCountDTOList.add(adminDashBoardCountDTO);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO1);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO2);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO3);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO4);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO5);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO6);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO7);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO8);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO9);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO10);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO11);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO5);
        adminDashBoardCountDTOList.add(adminDashBoardCountDTO6);

        adminDashBoardAdapter.setData(adminDashBoardCountDTOList);

    }


    @Override
    public void onSalesPersonAssignClick(AdminDashBoardCountDTO adminDashBoardCountDTO) {

        Intent intent=new Intent(getActivity(),SalesPersonAssignActivity.class);
        intent.putExtra("LIST",adminDashBoardCountDTO);
        startActivity(intent);




    }
}
