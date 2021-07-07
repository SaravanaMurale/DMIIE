package com.pojo.dmiie.salesperson;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pojo.dmiie.model.CustomerDashBoardDTO;

import java.util.List;

public class CustomerDashBoardAdapter extends RecyclerView.Adapter<CustomerDashBoardAdapter.CustomerDashBoardViewHolder> {


    private Context mCtx;
    List<CustomerDashBoardDTO> customerDashBoardDTOList;
    CustomerDashBoardClickListener customerDashBoardClickListener;


    public CustomerDashBoardAdapter(Context mCtx, List<CustomerDashBoardDTO> customerDashBoardDTOList, CustomerDashBoardClickListener customerDashBoardClickListener) {
        this.mCtx = mCtx;
        this.customerDashBoardDTOList = customerDashBoardDTOList;
        this.customerDashBoardClickListener = customerDashBoardClickListener;
    }

    public interface CustomerDashBoardClickListener{
        void onCustomerBashBoardClick();
    }

    public void setData(List<CustomerDashBoardDTO> customerDashBoardDTOList){
        this.customerDashBoardDTOList=customerDashBoardDTOList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CustomerDashBoardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerDashBoardViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return customerDashBoardDTOList.size();
    }

    class CustomerDashBoardViewHolder extends RecyclerView.ViewHolder{

        public CustomerDashBoardViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }




}
