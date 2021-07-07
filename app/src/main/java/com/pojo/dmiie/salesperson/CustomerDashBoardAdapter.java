package com.pojo.dmiie.salesperson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pojo.dmiie.R;
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
        void onCustomerBashBoardClick(CustomerDashBoardDTO customerDashBoardDTO);
    }

    public void setData(List<CustomerDashBoardDTO> customerDashBoardDTOList){
        this.customerDashBoardDTOList=customerDashBoardDTOList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CustomerDashBoardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mCtx);
        View view = layoutInflater.inflate(R.layout.layout_customer_dash_adapter, parent, false);
        return new CustomerDashBoardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerDashBoardViewHolder holder, int position) {

        holder.custDashName.setText(customerDashBoardDTOList.get(position).getCustCustomerName());
        holder.custDashMobile.setText(customerDashBoardDTOList.get(position).getCustCustomerMobileNumber());
        holder.custDashPurchase.setText(customerDashBoardDTOList.get(position).getCustLastPurchaseDate());
        holder.custDashStatus.setText(customerDashBoardDTOList.get(position).getCustStatus());
        holder.custDashFollow.setText(customerDashBoardDTOList.get(position).getCustNextFollowup());


    }

    @Override
    public int getItemCount() {
        return customerDashBoardDTOList.size();
    }

    class CustomerDashBoardViewHolder extends RecyclerView.ViewHolder{

        TextView custDashName,custDashMobile,custDashPurchase,custDashStatus,custDashFollow;

        public CustomerDashBoardViewHolder(@NonNull View itemView) {
            super(itemView);

            custDashName=(TextView)itemView.findViewById(R.id.custDashName);
            custDashMobile=(TextView)itemView.findViewById(R.id.custDashMobile);
            custDashPurchase=(TextView)itemView.findViewById(R.id.custDashPurchase);
            custDashStatus=(TextView)itemView.findViewById(R.id.custDashStatus);
            custDashFollow=(TextView)itemView.findViewById(R.id.custDashFollow);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    CustomerDashBoardDTO customerDashBoardDTO =customerDashBoardDTOList.get(getAdapterPosition());

                    customerDashBoardClickListener.onCustomerBashBoardClick(customerDashBoardDTO);

                }
            });

        }
    }




}
