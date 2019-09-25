package com.instagramAPI.business;

import com.instagramAPI.assertion.StatusCodeAssertion;
import com.instagramAPI.client.LikesServices;
import com.instagramAPI.responses.ErrorResponse;
import com.instagramAPI.util.StatusCodes;
import io.restassured.response.Response;

public class LikesBL extends LikesServices {
    private Response response;

    public void postLike() {
        response = postLike("2077717972203421790_6081313509");
        ErrorResponse data = response.getBody().as(ErrorResponse.class);
        StatusCodeAssertion.statusCodeAssert(data.getMeta().getCode(), StatusCodes.InputError.getValue());
    }

    public void deleteLike() {
        response = deleteLike("2077717972203421790_6081313509");
        ErrorResponse data = response.getBody().as(ErrorResponse.class);
        StatusCodeAssertion.statusCodeAssert(data.getMeta().getCode(), StatusCodes.InputError.getValue());
    }
}
