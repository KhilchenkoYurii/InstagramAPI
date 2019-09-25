package com.instagramAPI.responses;

import com.instagramAPI.model.MetaData;
import com.instagramAPI.model.TagInfo;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TagInfoResponse {
    private TagInfo data;
    private MetaData meta;
}
