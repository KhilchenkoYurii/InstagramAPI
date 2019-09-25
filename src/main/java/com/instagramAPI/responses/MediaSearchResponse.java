package com.instagramAPI.responses;

import com.instagramAPI.model.MediaEntry;
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
public class MediaSearchResponse {
    private List<MediaEntry> data;
    private MetaData meta;
}
