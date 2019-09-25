package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LocationInfo {
    @JsonProperty("id")
    private String id;
    @JsonProperty("latitude")
    private Number latitude;
    @JsonProperty("longitude")
    private Number longitude;
    @JsonProperty("name")
    private String name;
}
