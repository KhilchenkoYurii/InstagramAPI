package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CursorPaginationInfo {
    @JsonProperty("next_cursor")
    private String nextCursor;
    @JsonProperty("nextUrl")
    private String nextUrl;
}
