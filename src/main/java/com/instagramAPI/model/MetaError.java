package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class MetaError {
    @JsonProperty("code")
    private int code;
    @JsonProperty("error_type")
    private String errorType;
    @JsonProperty("error_message")
    private String errorMessage;
}
