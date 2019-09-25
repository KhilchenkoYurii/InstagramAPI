package com.instagramAPI.client;

import com.instagramAPI.util.Paths;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class LikesServices extends SetUp{

    public LikesServices() {
        super(Paths.likesPath);
    }

    public Response getListOfLikedPeople(String mediaId) {
        return given(createRequestToApi())
                .get(mediaId+"/likes?"+SetUp.accessToken);
    }

    public Response postLike(String mediaId) {
        return given(createRequestToApi())
                .post(mediaId+"/likes/?"+SetUp.accessToken);
    }

    public Response deleteLike(String mediaId) {
        return given(createRequestToApi())
                .delete(mediaId+"/likes/?"+SetUp.accessToken);
    }

}
