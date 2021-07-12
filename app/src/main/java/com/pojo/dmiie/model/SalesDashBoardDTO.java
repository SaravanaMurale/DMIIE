package com.pojo.dmiie.model;

import android.widget.TextView;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SalesDashBoardDTO implements Serializable {

    @SerializedName("ledger_name")
    private String saleCustName;
    @SerializedName("")
    private String saleCustMobileNumber;
    @SerializedName("")
    private String saleCustBusOwnerName;
    @SerializedName("")
    private String salCustStatus;
    @SerializedName("")
    private String saleCustNeedSample;
    @SerializedName("")
    private String saleCustNeedPriceList;
    @SerializedName("")
    private String saleCustRemark;
    @SerializedName("")
    private String saleCustNextFollowUp;
    @SerializedName("")
    private String saleCustManualVisitRequired;
    @SerializedName("")
    private String saleCustFollowUpStatus;
    @SerializedName("")
    private String saleCustFile;
    @SerializedName("")
    private String saleCustLastSaleDate;
    @SerializedName("")
    private String saleCustCurrency;

    public SalesDashBoardDTO(String saleCustName, String saleCustMobileNumber, String salCustStatus, String saleCustNeedSample, String saleCustNeedPriceList) {
        this.saleCustName = saleCustName;
        this.saleCustMobileNumber = saleCustMobileNumber;
        this.salCustStatus = salCustStatus;
        this.saleCustNeedSample = saleCustNeedSample;
        this.saleCustNeedPriceList = saleCustNeedPriceList;
    }

    public SalesDashBoardDTO(String saleCustName, String saleCustMobileNumber, String saleCustBusOwnerName, String salCustStatus, String saleCustNeedSample, String saleCustNeedPriceList, String saleCustRemark, String saleCustNextFollowUp, String saleCustManualVisitRequired, String saleCustFollowUpStatus, String saleCustFile, String saleCustLastSaleDate, String saleCustCurrency) {
        this.saleCustName = saleCustName;
        this.saleCustMobileNumber = saleCustMobileNumber;
        this.saleCustBusOwnerName = saleCustBusOwnerName;
        this.salCustStatus = salCustStatus;
        this.saleCustNeedSample = saleCustNeedSample;
        this.saleCustNeedPriceList = saleCustNeedPriceList;
        this.saleCustRemark = saleCustRemark;
        this.saleCustNextFollowUp = saleCustNextFollowUp;
        this.saleCustManualVisitRequired = saleCustManualVisitRequired;
        this.saleCustFollowUpStatus = saleCustFollowUpStatus;
        this.saleCustFile = saleCustFile;
        this.saleCustLastSaleDate = saleCustLastSaleDate;
        this.saleCustCurrency = saleCustCurrency;
    }

    public String getSaleCustName() {
        return saleCustName;
    }

    public void setSaleCustName(String saleCustName) {
        this.saleCustName = saleCustName;
    }

    public String getSaleCustMobileNumber() {
        return saleCustMobileNumber;
    }

    public void setSaleCustMobileNumber(String saleCustMobileNumber) {
        this.saleCustMobileNumber = saleCustMobileNumber;
    }

    public String getSaleCustBusOwnerName() {
        return saleCustBusOwnerName;
    }

    public void setSaleCustBusOwnerName(String saleCustBusOwnerName) {
        this.saleCustBusOwnerName = saleCustBusOwnerName;
    }

    public String getSalCustStatus() {
        return salCustStatus;
    }

    public void setSalCustStatus(String salCustStatus) {
        this.salCustStatus = salCustStatus;
    }

    public String getSaleCustNeedSample() {
        return saleCustNeedSample;
    }

    public void setSaleCustNeedSample(String saleCustNeedSample) {
        this.saleCustNeedSample = saleCustNeedSample;
    }

    public String getSaleCustNeedPriceList() {
        return saleCustNeedPriceList;
    }

    public void setSaleCustNeedPriceList(String saleCustNeedPriceList) {
        this.saleCustNeedPriceList = saleCustNeedPriceList;
    }

    public String getSaleCustRemark() {
        return saleCustRemark;
    }

    public void setSaleCustRemark(String saleCustRemark) {
        this.saleCustRemark = saleCustRemark;
    }

    public String getSaleCustNextFollowUp() {
        return saleCustNextFollowUp;
    }

    public void setSaleCustNextFollowUp(String saleCustNextFollowUp) {
        this.saleCustNextFollowUp = saleCustNextFollowUp;
    }

    public String getSaleCustManualVisitRequired() {
        return saleCustManualVisitRequired;
    }

    public void setSaleCustManualVisitRequired(String saleCustManualVisitRequired) {
        this.saleCustManualVisitRequired = saleCustManualVisitRequired;
    }

    public String getSaleCustFollowUpStatus() {
        return saleCustFollowUpStatus;
    }

    public void setSaleCustFollowUpStatus(String saleCustFollowUpStatus) {
        this.saleCustFollowUpStatus = saleCustFollowUpStatus;
    }

    public String getSaleCustFile() {
        return saleCustFile;
    }

    public void setSaleCustFile(String saleCustFile) {
        this.saleCustFile = saleCustFile;
    }

    public String getSaleCustLastSaleDate() {
        return saleCustLastSaleDate;
    }

    public void setSaleCustLastSaleDate(String saleCustLastSaleDate) {
        this.saleCustLastSaleDate = saleCustLastSaleDate;
    }

    public String getSaleCustCurrency() {
        return saleCustCurrency;
    }

    public void setSaleCustCurrency(String saleCustCurrency) {
        this.saleCustCurrency = saleCustCurrency;
    }
}
