package com.aryan.instagram.models;

public class StoryModel{

    private String name;
    private int story, views;

    public StoryModel(String name, int story, int views) {
        this.name = name;
        this.story = story;
        this.views = views;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
