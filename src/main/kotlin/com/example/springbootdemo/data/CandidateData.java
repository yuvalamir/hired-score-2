package com.example.springbootdemo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CandidateData {
    @JsonProperty("highest_degree")
    private String highestDegree;

    @JsonProperty("languages")
    private List<Language> languages;

    @JsonProperty("experience")
    private List<Experience> experience;

    @JsonProperty("contact_info")
    private ContactInfo contactInfo;

    public CandidateData(String highestDegree, List<Language> languages, List<Experience> experience, ContactInfo contactInfo) {
        this.highestDegree = highestDegree;
        this.languages = languages;
        this.experience = experience;
        this.contactInfo = contactInfo;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
