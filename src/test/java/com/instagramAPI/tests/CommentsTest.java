package com.instagramAPI.tests;

import com.instagramAPI.assertion.StatusCodeAssertion;
import com.instagramAPI.business.CommentBL;
import com.instagramAPI.client.CommentsServices;
import com.instagramAPI.responses.ErrorResponse;
import com.instagramAPI.util.LogListener;
import com.instagramAPI.util.StatusCodes;
import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LogListener.class)
public class CommentsTest  {
    private CommentBL commentBL = new CommentBL();

    @Test
    public void getCommentListTest() {
        commentBL.getCommentList();
    }

    @Test
    public void postCommentTest() {
       commentBL.postComment();
    }
}
