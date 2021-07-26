package com.pojo.dmiie.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AdminDashBoardResponseDTO {

    @SerializedName("status")
    boolean status;

    public AdminDashBoardResponseDTO(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    /* @SerializedName("data")
    List<AdminDashBoardCountDTO> adminDashBoardCountDTOList;

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
    }*/
}
