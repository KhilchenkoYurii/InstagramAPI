package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserInfo {
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("counts")
    private UserCounts counts;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("id")
    private String id;
    @JsonProperty("profile_picture")
    private String profilePicture;
    @JsonProperty("username")
    private String username;
    @JsonProperty("website")
    private String website;
    @JsonProperty("is_business")
    private boolean isBusiness;
}
