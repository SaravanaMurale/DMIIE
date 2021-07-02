package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

public class LoginRequestDTO {

    @SerializedName("user_id")
    String userName;
    @SerializedName("password")
    String password;
    @SerializedName("device")
    String device;


    public LoginRequestDTO(String userName, String password, String device) {
        this.userName = userName;
        this.password = password;
        this.device = device;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
