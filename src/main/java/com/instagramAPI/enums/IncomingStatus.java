package com.instagramAPI.enums;

public enum IncomingStatus {
    None("none"),
    Followed("followed_by"),
    Requested("requested_by");

    private String value;

    IncomingStatus(String value) {
        this.value = value;
    }
}
