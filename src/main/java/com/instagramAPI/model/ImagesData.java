package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ImagesData {
    @JsonProperty("low_resolution")
    private ImageInfo lowResolution;
    @JsonProperty("standard_resolution")
    private ImageInfo standardResolution;
    @JsonProperty("thumbnail")
    private ImageInfo thumbnail;
}
