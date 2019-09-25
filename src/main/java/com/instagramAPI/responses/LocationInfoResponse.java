package com.instagramAPI.responses;

import com.instagramAPI.model.LocationInfo;
import com.instagramAPI.model.MetaData;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LocationInfoResponse {
    private LocationInfo data;
    private MetaData meta;
}
