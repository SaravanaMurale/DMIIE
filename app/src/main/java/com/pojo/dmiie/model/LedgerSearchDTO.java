package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

public class LedgerSearchDTO {

    @SerializedName("type")
    private String type;
    @SerializedName("term")
    private String term;

    public LedgerSearchDTO(String type, String term) {
        this.type = type;
        this.term = term;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}
