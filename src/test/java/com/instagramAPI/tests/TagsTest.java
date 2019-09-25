package com.instagramAPI.tests;

import com.instagramAPI.business.TagsBL;
import com.instagramAPI.util.LogListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(LogListener.class)
public class TagsTest{
    private TagsBL tagsBL = new TagsBL();

    @Test
    public void getTagInformTest() {
        tagsBL.getTagInform();
    }

    @Test
    public void getMediaRecentByTagNameTest() {
        tagsBL.getMediaRecentByTagName();
    }
}
