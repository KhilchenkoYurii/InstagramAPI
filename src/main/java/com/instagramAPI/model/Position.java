package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Position {
    @JsonProperty("x")
    private Number x;
    @JsonProperty("y")
    private Number y;
}
