package com.instagramAPI.responses;

import com.instagramAPI.model.MetaData;
import com.instagramAPI.model.RelationshipStatus;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RelationshipPostResponse {
    private RelationshipStatus data;
    private MetaData meta;
}
