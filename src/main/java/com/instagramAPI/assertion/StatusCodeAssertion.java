package com.instagramAPI.assertion;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;

public class StatusCodeAssertion {
    public static void statusCodeAssert(int responseCode, int statusCode) {
        SoftAssert softAssertions = new SoftAssert();
        softAssertions.assertEquals(responseCode,statusCode);
        softAssertions.assertAll();
    }
}
