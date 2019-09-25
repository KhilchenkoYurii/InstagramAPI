package com.instagramAPI.business;

import com.instagramAPI.assertion.StatusCodeAssertion;
import com.instagramAPI.client.CommentsServices;
import com.instagramAPI.responses.ErrorResponse;
import com.instagramAPI.util.StatusCodes;
import io.restassured.response.Response;

public class CommentBL extends CommentsServices {
    private Response response;

   public void getCommentList() {
        response = getCommentList("2077717972203421790_6081313509");
        System.out.println(response.asString());
    }

    public void postComment() {
        response = postComment("2077717972203421790_6081313509","he");
        ErrorResponse data = response.getBody().as(ErrorResponse.class);
        StatusCodeAssertion.statusCodeAssert(data.getMeta().getCode(), StatusCodes.InputError.getValue());
    }
}
