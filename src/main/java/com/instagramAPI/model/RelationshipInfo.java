package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RelationshipInfo {
    @JsonProperty("incoming_status")
    private String incomingStatus;
    @JsonProperty("outgoing_status")
    private String outgoingStatus;
    @JsonProperty("target_user_is_private")
    private boolean targetUserIsPrivate;
}
