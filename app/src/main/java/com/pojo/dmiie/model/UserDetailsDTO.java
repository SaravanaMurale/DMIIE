package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

public class UserDetailsDTO {

    public UserDetailsDTO() {
    }

    @SerializedName("user_id")
    String userIdResponse;
    @SerializedName("user_name")
    String userNameRes;
    @SerializedName("access")
    String userAccessRes;
    @SerializedName("rights")
    String userRightsRes;
    @SerializedName("token")
    String token;

    @SerializedName("default_ledger_prefix")
    int defaulutLedgerPrefix;
    @SerializedName("default_credit_limit")
    int defaulutCreditLimit;
    @SerializedName("default_ledger_group")
    int defaulutLedferGroup;


    public UserDetailsDTO(String userIdResponse, String userNameRes, String userAccessRes, String userRightsRes, String token, int defaulutLedgerPrefix, int defaulutCreditLimit, int defaulutLedferGroup) {
        this.userIdResponse = userIdResponse;
        this.userNameRes = userNameRes;
        this.userAccessRes = userAccessRes;
        this.userRightsRes = userRightsRes;
        this.token = token;
        this.defaulutLedgerPrefix = defaulutLedgerPrefix;
        this.defaulutCreditLimit = defaulutCreditLimit;
        this.defaulutLedferGroup = defaulutLedferGroup;
    }



    public String getUserIdResponse() {
        return userIdResponse;
    }

    public void setUserIdResponse(String userIdResponse) {
        this.userIdResponse = userIdResponse;
    }

    public String getUserNameRes() {
        return userNameRes;
    }

    public void setUserNameRes(String userNameRes) {
        this.userNameRes = userNameRes;
    }

    public String getUserAccessRes() {
        return userAccessRes;
    }

    public void setUserAccessRes(String userAccessRes) {
        this.userAccessRes = userAccessRes;
    }

    public String getUserRightsRes() {
        return userRightsRes;
    }

    public void setUserRightsRes(String userRightsRes) {
        this.userRightsRes = userRightsRes;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getDefaulutLedgerPrefix() {
        return defaulutLedgerPrefix;
    }

    public void setDefaulutLedgerPrefix(int defaulutLedgerPrefix) {
        this.defaulutLedgerPrefix = defaulutLedgerPrefix;
    }

    public int getDefaulutCreditLimit() {
        return defaulutCreditLimit;
    }

    public void setDefaulutCreditLimit(int defaulutCreditLimit) {
        this.defaulutCreditLimit = defaulutCreditLimit;
    }

    public int getDefaulutLedferGroup() {
        return defaulutLedferGroup;
    }

    public void setDefaulutLedferGroup(int defaulutLedferGroup) {
        this.defaulutLedferGroup = defaulutLedferGroup;
    }

}