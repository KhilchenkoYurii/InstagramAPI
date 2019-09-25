package com.instagramAPI.responses;

import com.instagramAPI.model.MetaData;
import com.instagramAPI.model.RelationshipInfo;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RelationshipResponse {
    private RelationshipInfo data;
    private MetaData meta;
}
