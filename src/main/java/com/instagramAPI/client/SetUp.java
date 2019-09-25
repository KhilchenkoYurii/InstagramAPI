package com.instagramAPI.client;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.Getter;

@Getter
public class SetUp {
    private RequestSpecification specification;
    private String pathUri;
    public static String accessToken = "access_token=8081313509.2962252.ea1909d5c5474542bc5bc21d34cc629f";

    public SetUp(String pathUri) {
        this.pathUri = pathUri;
    }

    public RequestSpecification createRequestToApi() {
        specification = new RequestSpecBuilder()
                .setBaseUri("https://api.instagram.com/v1")
                .setBasePath(pathUri)
                .setContentType("application/x-www-form-urlencoded")
                .build();
        return specification;
    }

    public RequestSpecification createRequestToNoApi() {
        specification = new RequestSpecBuilder()
                .setBaseUri("https://instagram.com")
                .setBasePath(pathUri)
                .setContentType(ContentType.JSON)
                .build();
        return specification;
    }
}
