package com.instagramAPI.responses;

import com.instagramAPI.model.MetaData;
import com.instagramAPI.model.TagInfo;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TagSearchResponse {
    private List<TagInfo> data;
    private MetaData meta;
}
