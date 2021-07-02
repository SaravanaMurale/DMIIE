package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

public class BaseDTO {

    @SerializedName("status")
    boolean status;


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
