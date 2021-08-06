package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AdminDashBoardCountDTO implements Serializable {

    @SerializedName("salesman_id")
    String spId;
    @SerializedName("salesman_name")
    String spName;
    @SerializedName("assigned_company")
    String spassignedCompany;
    @SerializedName("company_code")
    String spCompanyCode;

    int taotalcustomer;
    int totalAssigned;
    int followup;
    int closed;

    public AdminDashBoardCountDTO(String spName, String spId, String spassignedCompany, String spCompanyCode) {
        this.spName = spName;
        this.spId = spId;
        this.spassignedCompany = spassignedCompany;
        this.spCompanyCode = spCompanyCode;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public String getSpassignedCompany() {
        return spassignedCompany;
    }

    public void setSpassignedCompany(String spassignedCompany) {
        this.spassignedCompany = spassignedCompany;
    }

    public String getSpCompanyCode() {
        return spCompanyCode;
    }

    public void setSpCompanyCode(String spCompanyCode) {
        this.spCompanyCode = spCompanyCode;
    }

    public int getTaotalcustomer() {
        return taotalcustomer;
    }

    public void setTaotalcustomer(int taotalcustomer) {
        this.taotalcustomer = taotalcustomer;
    }

    public int getTotalAssigned() {
        return totalAssigned;
    }

    public void setTotalAssigned(int totalAssigned) {
        this.totalAssigned = totalAssigned;
    }

    public int getFollowup() {
        return followup;
    }

    public void setFollowup(int followup) {
        this.followup = followup;
    }

    public int getClosed() {
        return closed;
    }

    public void setClosed(int closed) {
        this.closed = closed;
    }
}
