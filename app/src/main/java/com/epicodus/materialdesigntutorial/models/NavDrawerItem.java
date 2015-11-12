package com.epicodus.materialdesigntutorial.models;

public class NavDrawerItem {

    private boolean mShowNotify;
    private String mTitle;

    public NavDrawerItem() {

    }

    public NavDrawerItem(boolean showNotify, String title) {
        mShowNotify = showNotify;
        mTitle = title;
    }

    public boolean isShowNotify() {
        return mShowNotify;
    }

    public void setShowNotify(boolean showNotify) {
        mShowNotify = showNotify;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
