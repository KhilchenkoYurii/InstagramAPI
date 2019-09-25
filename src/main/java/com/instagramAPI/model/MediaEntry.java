package com.instagramAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MediaEntry {
    @JsonProperty("attribution")
    private String attribution;
    @JsonProperty("caption")
    private CaptionData caption;
    @JsonProperty("comments")
    private CommentsCollections comments;
    @JsonProperty("created_time")
    private String created_time;
    @JsonProperty("filter")
    private String filter;
    @JsonProperty("id")
    private String id;
    @JsonProperty("images")
    private ImagesData images;
    @JsonProperty("likes")
    private LikesCollection likes;
    @JsonProperty("link")
    private String link;
    @JsonProperty("location")
    private LocationInfo location;
    @JsonProperty("tags")
    private List<String> tags;
    @JsonProperty("type")
    private String type;
    @JsonProperty("user")
    private UserShortInfo user;
    @JsonProperty("user_has_liked")
    private boolean userHasLiked;
    @JsonProperty("users_in_photo")
    private List<UserInPhoto> userInPhoto;
    @JsonProperty("videos")
    private VideosData videos;
    @JsonProperty("carousel_media")
    private Object carouselMedia;
}
