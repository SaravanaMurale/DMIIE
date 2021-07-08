package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

public class LedgerMainDTO {

    @SerializedName("ledger_code")
    private String ledgerCode;
    @SerializedName("ledger_name")
    private String ledgerName;
    @SerializedName("company_name")
    private String ledgerCompanyName;
    @SerializedName("company_address")
    private String ledgerCompanyAddress;
    @SerializedName("date")
    private String ledgerDate;
    @SerializedName("closing_dr")
    private int closingDr;
    @SerializedName("closing_cr")
    private int closingCr;
    @SerializedName("closing")
    private int closing;
    @SerializedName("opening")
    private int opening;


    public LedgerMainDTO(String ledgerCode, String ledgerName, String ledgerCompanyName, String ledgerCompanyAddress, String ledgerDate, int closingDr, int closingCr, int closing, int opening) {
        this.ledgerCode = ledgerCode;
        this.ledgerName = ledgerName;
        this.ledgerCompanyName = ledgerCompanyName;
        this.ledgerCompanyAddress = ledgerCompanyAddress;
        this.ledgerDate = ledgerDate;
        this.closingDr = closingDr;
        this.closingCr = closingCr;
        this.closing = closing;
        this.opening = opening;
    }

    public String getLedgerCode() {
        return ledgerCode;
    }

    public void setLedgerCode(String ledgerCode) {
        this.ledgerCode = ledgerCode;
    }

    public String getLedgerName() {
        return ledgerName;
    }

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    public String getLedgerCompanyName() {
        return ledgerCompanyName;
    }

    public void setLedgerCompanyName(String ledgerCompanyName) {
        this.ledgerCompanyName = ledgerCompanyName;
    }

    public String getLedgerCompanyAddress() {
        return ledgerCompanyAddress;
    }

    public void setLedgerCompanyAddress(String ledgerCompanyAddress) {
        this.ledgerCompanyAddress = ledgerCompanyAddress;
    }

    public String getLedgerDate() {
        return ledgerDate;
    }

    public void setLedgerDate(String ledgerDate) {
        this.ledgerDate = ledgerDate;
    }

    public int getClosingDr() {
        return closingDr;
    }

    public void setClosingDr(int closingDr) {
        this.closingDr = closingDr;
    }

    public int getClosingCr() {
        return closingCr;
    }

    public void setClosingCr(int closingCr) {
        this.closingCr = closingCr;
    }

    public int getClosing() {
        return closing;
    }

    public void setClosing(int closing) {
        this.closing = closing;
    }

    public int getOpening() {
        return opening;
    }

    public void setOpening(int opening) {
        this.opening = opening;
    }
}
