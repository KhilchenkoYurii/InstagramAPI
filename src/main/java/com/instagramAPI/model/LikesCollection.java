package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LikesCollection {
    @JsonProperty("count")
    private int count;
    @JsonProperty("data")
    private List<UserShortInfo> data;
}
