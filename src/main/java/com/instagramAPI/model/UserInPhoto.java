package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserInPhoto {
    @JsonProperty("position")
    private Position position;
    @JsonProperty("user")
    private UserShortInfo user;
}
