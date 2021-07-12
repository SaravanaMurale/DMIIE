package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchResponseDTO {


    @SerializedName("data")
    List<SearchListDTO> searchListDTOList;

    public SearchResponseDTO(List<SearchListDTO> searchListDTOList) {
        this.searchListDTOList = searchListDTOList;
    }

    public List<SearchListDTO> getSearchListDTOList() {
        return searchListDTOList;
    }

    public void setSearchListDTOList(List<SearchListDTO> searchListDTOList) {
        this.searchListDTOList = searchListDTOList;
    }
}
