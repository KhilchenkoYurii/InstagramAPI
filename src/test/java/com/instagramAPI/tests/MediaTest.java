package com.instagramAPI.tests;

import com.instagramAPI.business.MediaBL;
import com.instagramAPI.client.MediaServices;
import com.instagramAPI.util.LogListener;
import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LogListener.class)
public class MediaTest {
   private MediaBL mediaBL = new MediaBL();

    @Test
    public void makeSearchTest() {
        mediaBL.makeSearch();
    }
}
