package com.instagramAPI.responses;

import com.instagramAPI.model.LocationInfo;
import com.instagramAPI.model.MetaData;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LocationSearchResponse {
    private List<LocationInfo> data;
    private MetaData meta;
}
