package com.aryan.instagram.models;

public class PostModel {

    private String postBy, caption;
    int post, authorPic;
//    int loveCount, loveReacts, comments;


    public PostModel(String postBy, String caption, int post, int authorPic) {
        this.postBy = postBy;
        this.caption = caption;
        this.post = post;
        this.authorPic = authorPic;
    }

    public String getPostBy() {
        return postBy;
    }

    public void setPostBy(String postBy) {
        this.postBy = postBy;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    public int getAuthorPic() {
        return authorPic;
    }

    public void setAuthorPic(int authorPic) {
        this.authorPic = authorPic;
    }

}
