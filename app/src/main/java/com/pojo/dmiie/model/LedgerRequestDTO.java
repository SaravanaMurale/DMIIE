package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

public class LedgerRequestDTO {

    @SerializedName("operation")
    private String ledgerOperation;
    @SerializedName("remarks")
    private String ledgerRemarks;
    @SerializedName("type")
    private String ledgerType;
    @SerializedName("consolidated")
    private String ledgerConslidated;
    @SerializedName("from_date")
    private String ledgerFromDate;
    @SerializedName("to_date")
    private String ledgerToDate;
    @SerializedName("ledger_name")
    private String ledgerName;
    @SerializedName("ledger_code")
    private String ledgerCode;

    public LedgerRequestDTO(String ledgerOperation, String ledgerRemarks, String ledgerType, String ledgerConslidated, String ledgerFromDate, String ledgerToDate, String ledgerName, String ledgerCode) {
        this.ledgerOperation = ledgerOperation;
        this.ledgerRemarks = ledgerRemarks;
        this.ledgerType = ledgerType;
        this.ledgerConslidated = ledgerConslidated;
        this.ledgerFromDate = ledgerFromDate;
        this.ledgerToDate = ledgerToDate;
        this.ledgerName = ledgerName;
        this.ledgerCode = ledgerCode;
    }

    public String getLedgerOperation() {
        return ledgerOperation;
    }

    public void setLedgerOperation(String ledgerOperation) {
        this.ledgerOperation = ledgerOperation;
    }

    public String getLedgerRemarks() {
        return ledgerRemarks;
    }

    public void setLedgerRemarks(String ledgerRemarks) {
        this.ledgerRemarks = ledgerRemarks;
    }

    public String getLedgerType() {
        return ledgerType;
    }

    public void setLedgerType(String ledgerType) {
        this.ledgerType = ledgerType;
    }

    public String getLedgerConslidated() {
        return ledgerConslidated;
    }

    public void setLedgerConslidated(String ledgerConslidated) {
        this.ledgerConslidated = ledgerConslidated;
    }

    public String getLedgerFromDate() {
        return ledgerFromDate;
    }

    public void setLedgerFromDate(String ledgerFromDate) {
        this.ledgerFromDate = ledgerFromDate;
    }

    public String getLedgerToDate() {
        return ledgerToDate;
    }

    public void setLedgerToDate(String ledgerToDate) {
        this.ledgerToDate = ledgerToDate;
    }

    public String getLedgerName() {
        return ledgerName;
    }

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    public String getLedgerCode() {
        return ledgerCode;
    }

    public void setLedgerCode(String ledgerCode) {
        this.ledgerCode = ledgerCode;
    }
}
