package com.example.springbootdemo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Language {
    @JsonProperty("read") private boolean read;
    @JsonProperty("comments") private String comments;
    @JsonProperty("write") private boolean write;
    @JsonProperty("speak") private boolean speak;
    @JsonProperty("language_code") private boolean languageCode;

    public Language(boolean read, String comments, boolean write, boolean speak, boolean languageCode) {
        this.read = read;
        this.comments = comments;
        this.write = write;
        this.speak = speak;
        this.languageCode = languageCode;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isWrite() {
        return write;
    }

    public void setWrite(boolean write) {
        this.write = write;
    }

    public boolean isSpeak() {
        return speak;
    }

    public void setSpeak(boolean speak) {
        this.speak = speak;
    }

    public boolean isLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(boolean languageCode) {
        this.languageCode = languageCode;
    }
}
