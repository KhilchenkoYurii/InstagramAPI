package com.instagramAPI.client;

import com.instagramAPI.util.Paths;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CommentsServices extends SetUp {
    public CommentsServices() {
        super(Paths.commentsPaths);
    }

    public Response getCommentList(String mediaId) {
        return given(createRequestToApi())
                .get(mediaId+"/comments/?" + SetUp.accessToken);
    }

    public Response postComment(String mediaId, String commentText) {
        return given(createRequestToApi())
                .post(mediaId+"/comments/?text="+commentText+"&" + SetUp.accessToken);
    }
}
