package com.example.springbootdemo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactInfo {
    @JsonProperty("name") private CandidateName name;

    public ContactInfo(CandidateName name) {
        this.name = name;
    }

    public CandidateName getName() {
        return name;
    }

    public void setName(CandidateName name) {
        this.name = name;
    }
}
