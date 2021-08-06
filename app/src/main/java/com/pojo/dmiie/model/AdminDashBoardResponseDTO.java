package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AdminDashBoardResponseDTO {

    @SerializedName("status")
    public boolean status;


    @SerializedName("data")
    public List<AdminDashBoardCountDTO> adminDashBoardCountDTOList;


    public AdminDashBoardResponseDTO(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public AdminDashBoardResponseDTO(List<AdminDashBoardCountDTO> adminDashBoardCountDTOList) {
        this.adminDashBoardCountDTOList = adminDashBoardCountDTOList;
    }

    public List<AdminDashBoardCountDTO> getAdminDashBoardCountDTOList() {
        return adminDashBoardCountDTOList;
    }

    public void setAdminDashBoardCountDTOList(List<AdminDashBoardCountDTO> adminDashBoardCountDTOList) {
        this.adminDashBoardCountDTOList = adminDashBoardCountDTOList;
    }
}
