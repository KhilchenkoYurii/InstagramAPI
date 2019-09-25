package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RelationshipStatus {
    @JsonProperty("outgoing_status")
    private String outgoingStatus;
}
