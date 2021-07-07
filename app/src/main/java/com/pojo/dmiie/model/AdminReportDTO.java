package com.pojo.dmiie.model;

public class AdminReportDTO {

    String reportSalesPerName;
    String reportCustName;
    String reportMobileNumber;
    String reportStatus;


    public AdminReportDTO(String reportSalesPerName, String reportCustName, String reportMobileNumber, String reportStatus) {
        this.reportSalesPerName = reportSalesPerName;
        this.reportCustName = reportCustName;
        this.reportMobileNumber = reportMobileNumber;
        this.reportStatus = reportStatus;
    }

    public String getReportSalesPerName() {
        return reportSalesPerName;
    }

    public void setReportSalesPerName(String reportSalesPerName) {
        this.reportSalesPerName = reportSalesPerName;
    }

    public String getReportCustName() {
        return reportCustName;
    }

    public void setReportCustName(String reportCustName) {
        this.reportCustName = reportCustName;
    }

    public String getReportMobileNumber() {
        return reportMobileNumber;
    }

    public void setReportMobileNumber(String reportMobileNumber) {
        this.reportMobileNumber = reportMobileNumber;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }
}
