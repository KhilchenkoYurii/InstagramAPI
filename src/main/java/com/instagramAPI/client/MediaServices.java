package com.instagramAPI.client;

import com.instagramAPI.util.Paths;
import io.restassured.response.Response;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class MediaServices extends SetUp {
    public MediaServices() {
        super(Paths.search);
    }
    public HashMap<String,String > paramMap = new HashMap<String, String>();
    public Response getA() {
        return given(createRequestToNoApi())
                .get();
    }
    public Response getSearch() {
        paramMap.put("context","blended");
        paramMap.put("query","kk");
        paramMap.put("rank_token","0.5374661066944657");
        paramMap.put("include_reel","true");
        return given(createRequestToNoApi())
                .params(paramMap)
                .get();
    }
}
