package com.instagramAPI.enums;

public enum Type {
    Image("image"),
    Video("video");

    private String value;

    Type(String value) {
        this.value = value;
    }
}
