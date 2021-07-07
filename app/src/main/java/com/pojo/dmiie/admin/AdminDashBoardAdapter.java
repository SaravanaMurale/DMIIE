package com.pojo.dmiie.admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.AdminDashBoardCountDTO;

import java.util.List;

public class AdminDashBoardAdapter extends RecyclerView.Adapter<AdminDashBoardAdapter.AdminDashBoardViewHolder> {

    Context context;
    List<AdminDashBoardCountDTO> adminDashBoardCountDTOList;
    SalesPerAssignListener salesPerAssignListener;


    interface SalesPerAssignListener{

        public void onSalesPersonAssignClick(AdminDashBoardCountDTO adminDashBoardCountDTO);

    }

    public AdminDashBoardAdapter(Context context, List<AdminDashBoardCountDTO> adminDashBoardCountDTOList, SalesPerAssignListener salesPerAssignListener) {
        this.context = context;
        this.adminDashBoardCountDTOList = adminDashBoardCountDTOList;
        this.salesPerAssignListener = salesPerAssignListener;
    }

    public void setData(List<AdminDashBoardCountDTO> adminDashBoardCountDTOList){
        this.adminDashBoardCountDTOList=adminDashBoardCountDTOList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public AdminDashBoardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_admin_dashboard_adapter, parent, false);
        return new AdminDashBoardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdminDashBoardViewHolder holder, int position) {


        holder.admin_salesper_name.setText(adminDashBoardCountDTOList.get(position).getSalesPersonName());
        holder.totalCustomer.setText(""+adminDashBoardCountDTOList.get(position).getTaotalcustomer());
        holder.totalAssigned.setText(""+adminDashBoardCountDTOList.get(position).getTotalAssigned());
        holder.followUp.setText(""+adminDashBoardCountDTOList.get(position).getFollowup());
        holder.closed.setText(""+adminDashBoardCountDTOList.get(position).getClosed());

    }

    @Override
    public int getItemCount() {
        return adminDashBoardCountDTOList.size();
    }

    class AdminDashBoardViewHolder extends RecyclerView.ViewHolder {

        TextView admin_salesper_name,totalCustomer,totalAssigned,followUp,closed;

        public AdminDashBoardViewHolder(@NonNull View itemView) {
            super(itemView);

            admin_salesper_name=(TextView)itemView.findViewById(R.id.admin_salesper_name);
            totalCustomer=(TextView)itemView.findViewById(R.id.totalCustomerCount);
            totalAssigned=(TextView)itemView.findViewById(R.id.totalAssignedCount);
            followUp=(TextView)itemView.findViewById(R.id.followCount);
            closed=(TextView)itemView.findViewById(R.id.closedCount);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AdminDashBoardCountDTO adminDashBoardCountDTO=adminDashBoardCountDTOList.get(getAdapterPosition());
                    salesPerAssignListener.onSalesPersonAssignClick(adminDashBoardCountDTO);




                }
            });

        }
    }
}
