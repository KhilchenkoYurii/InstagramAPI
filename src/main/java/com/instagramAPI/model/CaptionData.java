package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CaptionData {
    @JsonProperty("created_time")
    private String createdTime;
    @JsonProperty("from")
    private UserShortInfo from;
    @JsonProperty("id")
    private String id;
    @JsonProperty("text")
    private String text;
}
