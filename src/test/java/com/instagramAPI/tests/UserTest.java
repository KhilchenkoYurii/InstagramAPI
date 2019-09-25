package com.instagramAPI.tests;


import com.instagramAPI.business.UserBL;
import com.instagramAPI.util.LogListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(LogListener.class)
public class UserTest{
    private UserBL userBL = new UserBL();

    @Test
    public void getSelfTest() {
      userBL.getSelf();
    }

    @Test
    public void getSelfMediaRecentTest() {
      userBL.getSelfMediaRecentA();
    }

    @Test
    public void getMediaRecentByUserIdTest() {
        userBL.getMediaRecentByUserIdA();
    }

    @Test
    public void getSelfLikedTest() {
        userBL.getSelfLikedA();
    }

    @Test
    public void searchTest() {
        userBL.search();
    }
}
