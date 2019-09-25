package com.instagramAPI.business;

import com.instagramAPI.assertion.StatusCodeAssertion;
import com.instagramAPI.client.UserServices;
import com.instagramAPI.responses.ErrorResponse;
import com.instagramAPI.responses.MediaListResponse;
import com.instagramAPI.responses.UserResponse;
import com.instagramAPI.util.StatusCodes;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UserBL extends UserServices {
    private Response response;
    SoftAssert softAssert = new SoftAssert();

    public void getSelfA() {
        response = getSelf();
        UserResponse data = response.getBody().as(UserResponse.class);
        softAssert.assertEquals(data.getMeta().getCode(), StatusCodes.Success.getValue());
    }

    public void getSelfMediaRecentA() {
        response = getSelfMediaRecent();
        MediaListResponse data = response.getBody().as(MediaListResponse.class);
        StatusCodeAssertion.statusCodeAssert(data.getMeta().getCode(), StatusCodes.Success.getValue());
    }

    public void getMediaRecentByUserIdA() {
        response = getMediaRecentByUserId();
        MediaListResponse data = response.getBody().as(MediaListResponse.class);
        StatusCodeAssertion.statusCodeAssert(data.getMeta().getCode(), StatusCodes.Success.getValue());
    }

    public void getSelfLikedA() {
        response = getSelfLiked();
        ErrorResponse data = response.getBody().as(ErrorResponse.class);
        StatusCodeAssertion.statusCodeAssert(data.getMeta().getCode(), StatusCodes.InputError.getValue());
    }

    public void search() {
        response = search("kek");
        ErrorResponse data = response.getBody().as(ErrorResponse.class);
        StatusCodeAssertion.statusCodeAssert(data.getMeta().getCode(), StatusCodes.InputError.getValue());
    }
}
