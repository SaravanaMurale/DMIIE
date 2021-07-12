package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SalesLedgerResponseDTO {

    @SerializedName("data")
    SalesLedgerDetails salesLedgerDetails;

    public SalesLedgerResponseDTO(SalesLedgerDetails salesLedgerDetails) {
        this.salesLedgerDetails = salesLedgerDetails;
    }

    public SalesLedgerDetails getSalesLedgerDetails() {
        return salesLedgerDetails;
    }

    public void setSalesLedgerDetails(SalesLedgerDetails salesLedgerDetails) {
        this.salesLedgerDetails = salesLedgerDetails;
    }

    public class SalesLedgerDetails{

        @SerializedName("ledger_main")
        List<SalesDashBoardDTO> salesDashBoardDTOList;

        public SalesLedgerDetails(List<SalesDashBoardDTO> salesDashBoardDTOList) {
            this.salesDashBoardDTOList = salesDashBoardDTOList;
        }

        public List<SalesDashBoardDTO> getSalesDashBoardDTOList() {
            return salesDashBoardDTOList;
        }

        public void setSalesDashBoardDTOList(List<SalesDashBoardDTO> salesDashBoardDTOList) {
            this.salesDashBoardDTOList = salesDashBoardDTOList;
        }
    }

}
