package com.pojo.dmiie.model;

import java.io.Serializable;

public class AdminDashBoardCountDTO implements Serializable {

    String salesPersonName;
    int taotalcustomer;
    int totalAssigned;
    int followup;
    int closed;

    public AdminDashBoardCountDTO(String salesPersonName, int taotalcustomer, int totalAssigned, int followup, int closed) {
        this.salesPersonName = salesPersonName;
        this.taotalcustomer = taotalcustomer;
        this.totalAssigned = totalAssigned;
        this.followup = followup;
        this.closed = closed;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
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
