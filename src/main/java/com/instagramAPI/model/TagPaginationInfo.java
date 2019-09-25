package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TagPaginationInfo {
    @JsonProperty("deprecation_warning")
    private String deprecationWarning;
    @JsonProperty("min_tag_id")
    private String minTagId;
    @JsonProperty("next_max_id")
    private String nextMaxId;
    @JsonProperty("next_max_tag_id")
    private String nextMaxTagId;
    @JsonProperty("next_min_id")
    private String nextMinId;
    @JsonProperty("nextUrl")
    private String nextUrl;
}
