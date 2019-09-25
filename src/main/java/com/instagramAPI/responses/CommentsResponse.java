package com.instagramAPI.responses;

import com.instagramAPI.model.CommentEntry;
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
public class CommentsResponse {
    private List<CommentEntry> data;
    private MetaData meta;
}
