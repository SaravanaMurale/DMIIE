package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

public class SearchListDTO {

    @SerializedName("parent")
    private String parent;
    @SerializedName("perc")
    private int perc;
    @SerializedName("ledger_credit_limit")
    private int creditLimit;
    @SerializedName("id")
    private String searchKeyWordId;
    @SerializedName("label")
    private String searchKeyWordCompany;

    public SearchListDTO(String parent, int perc, int creditLimit, String searchKeyWordId, String searchKeyWordCompany) {
        this.parent = parent;
        this.perc = perc;
        this.creditLimit = creditLimit;
        this.searchKeyWordId = searchKeyWordId;
        this.searchKeyWordCompany = searchKeyWordCompany;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public int getPerc() {
        return perc;
    }

    public void setPerc(int perc) {
        this.perc = perc;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getSearchKeyWordId() {
        return searchKeyWordId;
    }

    public void setSearchKeyWordId(String searchKeyWordId) {
        this.searchKeyWordId = searchKeyWordId;
    }

    public String getSearchKeyWordCompany() {
        return searchKeyWordCompany;
    }

    public void setSearchKeyWordCompany(String searchKeyWordCompany) {
        this.searchKeyWordCompany = searchKeyWordCompany;
    }
}
