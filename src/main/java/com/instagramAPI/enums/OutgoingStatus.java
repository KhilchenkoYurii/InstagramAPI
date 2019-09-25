package com.instagramAPI.enums;

public enum OutgoingStatus {
    None("none"),
    Followed("follows"),
    Requested("requested");

    private String value;

    OutgoingStatus(String value) {
        this.value = value;
    }
}
