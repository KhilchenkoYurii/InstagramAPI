package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserShortInfo {
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("id")
    private String id;
    @JsonProperty("profile_picture")
    private String profilePicture;
    @JsonProperty("username")
    private String username;
}
