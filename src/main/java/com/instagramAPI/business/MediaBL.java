package com.instagramAPI.business;

import com.instagramAPI.client.MediaServices;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class MediaBL extends MediaServices {
    Response response;
    public void makeSearch() {
        response = getSearch();
        System.out.println(response.asString());
    }
}
