package com.instagramAPI.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.instagramAPI.model.MetaData;
import com.instagramAPI.model.UserInfo;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserResponse {
    @JsonProperty("data")
    private UserInfo data;
    @JsonProperty("meta")
    private MetaData meta;
}
