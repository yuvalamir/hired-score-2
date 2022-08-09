package com.example.springbootdemo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Experience {
    @JsonProperty("company_normalized_name") private String companyNormalizedName;
    @JsonProperty("last_job") private boolean lastJob;
    @JsonProperty("company_name") private String companyName;
    @JsonProperty("position_type") private String positionType;
    @JsonProperty("duration_in_month") private int durationInMonth;
    @JsonProperty("current_job") private int currentJob;
    @JsonProperty("title") private String title;
    @JsonProperty("start_date") private Date startDate;
    @JsonProperty("end_date") private Date endDate;
    @JsonProperty("same_company") private boolean sameCompany;
    @JsonProperty("description_short") private String descriptionShort;

    public Experience(int currentJob, String title, Date startDate, Date endDate) {
        this.currentJob = currentJob;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getCurrentJob() {
        return currentJob;
    }

    public void setCurrentJob(int currentJob) {
        this.currentJob = currentJob;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
