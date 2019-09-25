package com.instagramAPI.responses;

import com.instagramAPI.model.MediaEntry;
import com.instagramAPI.model.MetaData;
import com.instagramAPI.model.TagPaginationInfo;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TagMediaListResponse {
    private List<MediaEntry> data;
    private MetaData meta;
    private TagPaginationInfo pagination;
}
