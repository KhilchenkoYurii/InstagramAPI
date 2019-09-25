package com.instagramAPI.responses;

import com.instagramAPI.model.MediaEntry;
import com.instagramAPI.model.MetaData;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MediaEntryResponse {
    private MediaEntry data;
    private MetaData meta;
}
