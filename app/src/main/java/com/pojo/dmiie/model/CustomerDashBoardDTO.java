package com.pojo.dmiie.model;

public class CustomerDashBoardDTO {

    String custDate;
    String custCustomerName;
    String custCustomerMobileNumber;
    String custLastPurchaseDate;
    String custLastSalesAmt;
    String custStatus;
    String custRemarks;
    String custNextFollowup;


    public CustomerDashBoardDTO(String custDate, String custCustomerName, String custCustomerMobileNumber, String custLastPurchaseDate, String custLastSalesAmt, String custStatus, String custRemarks, String custNextFollowup) {
        this.custDate = custDate;
        this.custCustomerName = custCustomerName;
        this.custCustomerMobileNumber = custCustomerMobileNumber;
        this.custLastPurchaseDate = custLastPurchaseDate;
        this.custLastSalesAmt = custLastSalesAmt;
        this.custStatus = custStatus;
        this.custRemarks = custRemarks;
        this.custNextFollowup = custNextFollowup;
    }

    public String getCustDate() {
        return custDate;
    }

    public void setCustDate(String custDate) {
        this.custDate = custDate;
    }

    public String getCustCustomerName() {
        return custCustomerName;
    }

    public void setCustCustomerName(String custCustomerName) {
        this.custCustomerName = custCustomerName;
    }

    public String getCustCustomerMobileNumber() {
        return custCustomerMobileNumber;
    }

    public void setCustCustomerMobileNumber(String custCustomerMobileNumber) {
        this.custCustomerMobileNumber = custCustomerMobileNumber;
    }

    public String getCustLastPurchaseDate() {
        return custLastPurchaseDate;
    }

    public void setCustLastPurchaseDate(String custLastPurchaseDate) {
        this.custLastPurchaseDate = custLastPurchaseDate;
    }

    public String getCustLastSalesAmt() {
        return custLastSalesAmt;
    }

    public void setCustLastSalesAmt(String custLastSalesAmt) {
        this.custLastSalesAmt = custLastSalesAmt;
    }

    public String getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(String custStatus) {
        this.custStatus = custStatus;
    }

    public String getCustRemarks() {
        return custRemarks;
    }

    public void setCustRemarks(String custRemarks) {
        this.custRemarks = custRemarks;
    }

    public String getCustNextFollowup() {
        return custNextFollowup;
    }

    public void setCustNextFollowup(String custNextFollowup) {
        this.custNextFollowup = custNextFollowup;
    }
}
