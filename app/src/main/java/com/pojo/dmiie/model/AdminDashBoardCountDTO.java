package com.pojo.dmiie.model;

public class AdminDashBoardCountDTO {

    int taotalcustomer;
    int totalAssigned;
    int followup;
    int closed;

    public AdminDashBoardCountDTO(int taotalcustomer, int totalAssigned, int followup, int closed) {
        this.taotalcustomer = taotalcustomer;
        this.totalAssigned = totalAssigned;
        this.followup = followup;
        this.closed = closed;
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
