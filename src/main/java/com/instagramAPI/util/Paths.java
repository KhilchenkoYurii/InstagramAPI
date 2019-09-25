package com.instagramAPI.util;

public class Paths {
    public static final String a = "/?__a=1";
    public static final String search = "/web/search/topsearch/?{context}&{query}&{rank_token}&{include_reel}";

    static final String filePath = "D:\\projectu\\InstagramAPI\\Report\\";



    //user
    public static final String usersPath = "/users/";
    public static final String usersSearch = "/search?q=";
    public static final String selfLiked = "/self/media/liked/?";
    public static final String selfMediaRecent = "/self/media/recent/?";
    public static final String userSelf = "/self/?";
    public static final String mediaRecentByUserId = "/6081313509/media/recent/?";

    //comments
    public static final String commentsPaths = "/media/";//+ media-id +/comments
    public static final String commentsById = "/media/"; //+ media-id + /comments/ + comment-id
    //likes
    public static final String likesPath = "/media/";//+ media-id +/likes
    //tags
    public static final String tagsPath = "/tags/";
    public static final String tagsSearch = "/search";
    public static final String tagByTagName = "";//+ tag-name
    public static final String recentTagByTagName = "";//+ media-id +/media/recent
    //locations
    public static final String locationSearch = "/locations/search";
    public static final String locationById = "/locations/"; //+ location-id
    public static final String recentLocationById = "/locations/"; // + location-id +/media/recent
    //geographies
    public static final String recentGeographiesById = "/geographies/"; // + geo-id + /media/recent




}
