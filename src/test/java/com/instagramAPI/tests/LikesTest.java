package com.instagramAPI.tests;

import com.instagramAPI.assertion.StatusCodeAssertion;
import com.instagramAPI.business.LikesBL;
import com.instagramAPI.client.LikesServices;
import com.instagramAPI.responses.ErrorResponse;
import com.instagramAPI.util.LogListener;
import com.instagramAPI.util.StatusCodes;
import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LogListener.class)
public class LikesTest {
    private LikesBL likesBL = new LikesBL();

    @Test
    public void postLikeTest() {
        likesBL.postLike();
    }

    @Test
    public void deleteLikeTest() {
        likesBL.deleteLike();
    }
}
