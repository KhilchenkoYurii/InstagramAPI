package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IdPaginationInfo {
    @JsonProperty("nextMaxId")
    private String nextMaxId;
    @JsonProperty("nextUrl")
    private String nextUrl;
}
