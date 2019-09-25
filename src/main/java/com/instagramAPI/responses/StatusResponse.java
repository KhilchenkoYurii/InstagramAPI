package com.instagramAPI.responses;

import com.instagramAPI.model.MetaData;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StatusResponse {
    private String data;
    private MetaData meta;
}

