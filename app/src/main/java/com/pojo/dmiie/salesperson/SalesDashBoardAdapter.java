package com.pojo.dmiie.salesperson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pojo.dmiie.R;
import com.pojo.dmiie.model.SalesDashBoardDTO;

import java.util.List;

public class SalesDashBoardAdapter extends RecyclerView.Adapter<SalesDashBoardAdapter.SalesDashBoardViewHolder> {

    Context context;
    List<SalesDashBoardDTO> salesDashBoardDTOList;
    SalesDashBoardClickListener salesDashBoardClickListener;


    public SalesDashBoardAdapter(Context context, List<SalesDashBoardDTO> salesDashBoardDTOList, SalesDashBoardClickListener salesDashBoardClickListener) {
        this.context = context;
        this.salesDashBoardDTOList = salesDashBoardDTOList;
        this.salesDashBoardClickListener = salesDashBoardClickListener;
    }

    public interface SalesDashBoardClickListener{

        public void onSaleClickListener();

    }

    public void setData(List<SalesDashBoardDTO> salesDashBoardDTOList){
        this.salesDashBoardDTOList=salesDashBoardDTOList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public SalesDashBoardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.layout_sales_dashboard_adapter, parent, false);
        return new SalesDashBoardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SalesDashBoardViewHolder holder, int position) {

        holder.salesCustomerName.setText(salesDashBoardDTOList.get(position).getSaleCustName());
        holder.salesMobileNumber.setText(salesDashBoardDTOList.get(position).getSaleCustMobileNumber());
        holder.salesCustomerStatus.setText(salesDashBoardDTOList.get(position).getSalCustStatus());
        holder.salesSample.setText(salesDashBoardDTOList.get(position).getSaleCustNeedSample());
        holder.salesPriceList.setText(salesDashBoardDTOList.get(position).getSaleCustNeedPriceList());


    }

    @Override
    public int getItemCount() {
        return salesDashBoardDTOList.size();
    }

    class  SalesDashBoardViewHolder extends RecyclerView.ViewHolder {

        TextView salesCustomerName,salesMobileNumber,salesCustomerStatus,salesSample,salesPriceList;

        public SalesDashBoardViewHolder(@NonNull View itemView) {
            super(itemView);

            salesCustomerName=(TextView)itemView.findViewById(R.id.salesCustomerName);
            salesMobileNumber=(TextView)itemView.findViewById(R.id.salesMobileNumber);
            salesCustomerStatus=(TextView)itemView.findViewById(R.id.salesCustomerStatus);
            salesSample=(TextView)itemView.findViewById(R.id.salesSample);
            salesPriceList=(TextView)itemView.findViewById(R.id.salesPriceList);



        }
    }

}
