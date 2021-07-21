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
import com.pojo.dmiie.model.AdminDashBoardResponseDTO;
import com.pojo.dmiie.retrofit.ApiClient;
import com.pojo.dmiie.retrofit.ApiInterface;
import com.pojo.dmiie.util.PreferenceUtil;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

        //getDashBoardCount();

        getAllSalespersonList();


        return view;
    }

    private void getAllSalespersonList() {

        ApiInterface apiInterface = ApiClient.getAPIClient().create(ApiInterface.class);

        String token=PreferenceUtil.getValueString(getActivity(),PreferenceUtil.AUTH_TOKEN);

        Call<AdminDashBoardResponseDTO> call=apiInterface.getAllSalesPersonList(token);
        call.enqueue(new Callback<AdminDashBoardResponseDTO>() {
            @Override
            public void onResponse(Call<AdminDashBoardResponseDTO> call, Response<AdminDashBoardResponseDTO> response) {


                AdminDashBoardResponseDTO adminDashBoardResponseDTO  =response.body();

                System.out.println("ResponsesStatus"+adminDashBoardResponseDTO.isStatus());

                adminDashBoardCountDTOList= adminDashBoardResponseDTO.getAdminDashBoardCountDTOList();

                adminDashBoardAdapter.setData(adminDashBoardCountDTOList);


            }

            @Override
            public void onFailure(Call<AdminDashBoardResponseDTO> call, Throwable t) {

            }
        });


    }


    @Override
    public void onSalesPersonAssignClick(AdminDashBoardCountDTO adminDashBoardCountDTO) {

        Intent intent=new Intent(getActivity(),SalesPersonAssignActivity.class);
        intent.putExtra("LIST",adminDashBoardCountDTO);
        startActivity(intent);

    }
}
