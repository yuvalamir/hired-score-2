package com.example.springbootdemo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CandidateName {
    @JsonProperty("formatted_name") private String formattedName;

    public CandidateName(String formattedName) {
        this.formattedName = formattedName;
    }

    public String getFormattedName() {
        return formattedName;
    }

    public void setFormattedName(String formattedName) {
        this.formattedName = formattedName;
    }
}
