package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TagInfo {
    @JsonProperty("media_count")
    private int mediaCount;
    @JsonProperty("name")
    private String name;
}
