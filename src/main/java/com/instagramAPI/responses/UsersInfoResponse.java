package com.instagramAPI.responses;

import com.instagramAPI.model.MetaData;
import com.instagramAPI.model.UserShortInfo;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsersInfoResponse {
    private List<UserShortInfo> data;
    private MetaData meta;
}
