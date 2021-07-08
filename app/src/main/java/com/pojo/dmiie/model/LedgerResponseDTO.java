package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LedgerResponseDTO {

    @SerializedName("data")
    LedgerDetails ledgerDetails;

    public LedgerResponseDTO(LedgerDetails ledgerDetails) {
        this.ledgerDetails = ledgerDetails;
    }

    public LedgerDetails getLedgerDetails() {
        return ledgerDetails;
    }

    public void setLedgerDetails(LedgerDetails ledgerDetails) {
        this.ledgerDetails = ledgerDetails;
    }

   public class LedgerDetails{

        @SerializedName("ledger_main")
        List<LedgerMainDTO> ledgerMainDTOList;

        public LedgerDetails(List<LedgerMainDTO> ledgerMainDTOList) {
            this.ledgerMainDTOList = ledgerMainDTOList;
        }

        public List<LedgerMainDTO> getLedgerMainDTOList() {
            return ledgerMainDTOList;
        }

        public void setLedgerMainDTOList(List<LedgerMainDTO> ledgerMainDTOList) {
            this.ledgerMainDTOList = ledgerMainDTOList;
        }
    }

}
