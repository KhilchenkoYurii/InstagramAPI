package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ImageInfo {
    @JsonProperty("height")
    private int height;
    @JsonProperty("url")
    private String url;
    @JsonProperty("width")
    private int width;
}
