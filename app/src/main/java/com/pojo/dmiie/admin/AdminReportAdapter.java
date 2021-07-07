package com.pojo.dmiie.admin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.AdminReportDTO;

import java.util.List;

public class AdminReportAdapter extends RecyclerView.Adapter<AdminReportAdapter.AdminReportViewHolder> {


    Context context;
    List<AdminReportDTO> adminReportDTOList;
    AdminReportClickListener adminReportClickListener;


    public AdminReportAdapter(Context context, List<AdminReportDTO> adminReportDTOList, AdminReportClickListener adminReportClickListener) {
        this.context = context;
        this.adminReportDTOList = adminReportDTOList;
        this.adminReportClickListener = adminReportClickListener;
    }

    interface AdminReportClickListener {

        public void onAdminReportClick(AdminReportDTO adminReportDTO);

    }

    public void setData(List<AdminReportDTO> adminReportDTOList) {
        this.adminReportDTOList = adminReportDTOList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public AdminReportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_report_adapter, parent, false);
        return new AdminReportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdminReportViewHolder holder, int position) {

        holder.reportSalesPerName.setText(adminReportDTOList.get(position).getReportSalesPerName());
        holder.reportCustName.setText(adminReportDTOList.get(position).getReportCustName());
        holder.reportMobileNum.setText(adminReportDTOList.get(position).getReportMobileNumber());
        holder.reportStatus.setText(adminReportDTOList.get(position).getReportStatus());


    }

    @Override
    public int getItemCount() {
        return adminReportDTOList.size();
    }

    public class AdminReportViewHolder extends RecyclerView.ViewHolder {

        TextView reportSalesPerName, reportCustName, reportMobileNum, reportStatus, reportNxtFollow;

        public AdminReportViewHolder(@NonNull View itemView) {
            super(itemView);

            reportSalesPerName = (TextView) itemView.findViewById(R.id.reportSalesPerName);
            reportCustName = (TextView) itemView.findViewById(R.id.reportCustName);

            reportMobileNum = (TextView) itemView.findViewById(R.id.reportMobileNum);
            reportStatus = (TextView) itemView.findViewById(R.id.reportStatus);
            reportNxtFollow = (TextView) itemView.findViewById(R.id.reportNxtFollow);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    AdminReportDTO adminReportDTO  =adminReportDTOList.get(getAdapterPosition());
                    adminReportClickListener.onAdminReportClick(adminReportDTO);

                }
            });

        }
    }

}
