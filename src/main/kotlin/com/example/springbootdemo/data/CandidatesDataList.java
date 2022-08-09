package com.example.springbootdemo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CandidatesDataList {
    List<CandidateData> candidates;

    public CandidatesDataList(List<CandidateData> candidates) {
        this.candidates = candidates;
    }

    public List<CandidateData> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<CandidateData> candidates) {
        this.candidates = candidates;
    }
}
