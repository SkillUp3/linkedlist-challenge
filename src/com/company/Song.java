package com.company;

/**
 * Created by ian on 15/03/2017.
 */
public class Song {
    private String mTitle;
    private double mDuration;

    public Song(String title, double duration) {
        mTitle = title;
        mDuration = duration;
    }

    public String getTitle() {
        return mTitle;
    }

    @Override
    public String toString() {
        return mTitle + " : " + mDuration;
    }
}
