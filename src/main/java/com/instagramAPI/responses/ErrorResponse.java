package com.instagramAPI.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagramAPI.model.MetaError;
import lombok.Getter;

@Getter
public class ErrorResponse {
    @JsonProperty("meta")
    private MetaError meta;
}
