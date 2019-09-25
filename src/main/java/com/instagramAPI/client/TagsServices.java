package com.instagramAPI.client;

import com.instagramAPI.util.Paths;
import io.restassured.response.Response;


import java.util.Set;

import static io.restassured.RestAssured.given;

public class TagsServices extends SetUp{
    public TagsServices() {
        super(Paths.tagsPath);
    }

    public Response getTagInform(String tagName) {
        return given(createRequestToApi())
                .get(tagName+"/?"+SetUp.accessToken);
    }

    public Response getMediaRecentByTagName(String tagName) {
        return given(createRequestToApi())
                .get(tagName+"/media/recent/?" + SetUp.accessToken);
    }

}
