package com.instagramAPI.responses;

import com.instagramAPI.model.CursorPaginationInfo;
import com.instagramAPI.model.MetaData;
import com.instagramAPI.model.UserShortInfo;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsersPagingResponse {
    private List<UserShortInfo> data;
    private MetaData meta;
    private CursorPaginationInfo pagination;
}
