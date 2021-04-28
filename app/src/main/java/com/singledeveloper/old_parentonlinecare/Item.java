package com.singledeveloper.old_parentonlinecare;
//package ru.embersoft.expandabletextview;

public class Item {
    private int imageResource;
    private String title;
    private String desc;
    private boolean isShrink = true;

    public Item() {
    }

    public Item(int imageResource, String title, String desc) {
        this.imageResource = imageResource;
        this.title = title;
        this.desc = desc;
//        this.isShrink = isShrink; , boolean isShrink
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isShrink() {
        return isShrink;
    }

    public void setShrink(boolean shrink) {
        isShrink = shrink;
    }

}
