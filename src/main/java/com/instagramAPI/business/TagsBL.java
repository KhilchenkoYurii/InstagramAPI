package com.instagramAPI.business;

import com.instagramAPI.assertion.StatusCodeAssertion;
import com.instagramAPI.client.TagsServices;
import com.instagramAPI.responses.ErrorResponse;
import com.instagramAPI.util.StatusCodes;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TagsBL extends TagsServices {

    private Response response;

    public void getTagInform() {
        response = getTagInform("keks");
        ErrorResponse data = response.getBody().as(ErrorResponse.class);
        StatusCodeAssertion.statusCodeAssert(data.getMeta().getCode(), StatusCodes.InputError.getValue());
    }

    public void getMediaRecentByTagName() {
        response = getTagInform("keks");
        ErrorResponse data = response.getBody().as(ErrorResponse.class);
        StatusCodeAssertion.statusCodeAssert(data.getMeta().getCode(), StatusCodes.InputError.getValue());
    }
}
