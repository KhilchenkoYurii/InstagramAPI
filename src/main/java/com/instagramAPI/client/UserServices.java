package com.instagramAPI.client;

import com.instagramAPI.util.Paths;
import com.sun.org.apache.bcel.internal.generic.ARETURN;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class UserServices extends SetUp{
    public UserServices() {
        super(Paths.usersPath);
    }

    public Response getSelf() {
        return given(createRequestToApi())
                .get(Paths.userSelf+SetUp.accessToken);
    }
    public Response getSelfMediaRecent() {
        return given(createRequestToApi())
                .get(Paths.selfMediaRecent+SetUp.accessToken);
    }
    public Response getMediaRecentByUserId() {
        return given(createRequestToApi())
                .get(Paths.mediaRecentByUserId+SetUp.accessToken);
    }

    public Response getSelfLiked() {
        return given(createRequestToApi())
                .get(Paths.selfLiked + SetUp.accessToken);
    }

    public Response search(String query) {
        return given(createRequestToApi())
                .get(Paths.usersSearch+query+"&"+SetUp.accessToken);
    }

 }
