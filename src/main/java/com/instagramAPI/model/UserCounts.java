package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserCounts {
    @JsonProperty("followed_by")
    private int followedBy;
    @JsonProperty("follows")
    private int follows;
    @JsonProperty("media")
    private int media;
}
