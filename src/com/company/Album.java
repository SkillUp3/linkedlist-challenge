package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by ian on 15/03/2017.
 */
public class Album {
    private String mName;
    private String mArtist;
    private ArrayList<Song> mSongs;

    public Album(String name, String artist) {
        mName = name;
        mArtist = artist;
        mSongs = new ArrayList<>();
    }

    //pineapple 6:00
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            mSongs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        //for(int i = 0; i <mSongs.size; i++)
        //0 highway  5:00   1
        //1 mymoney  6:00   2
        for (Song checkSong : mSongs) {
            if (checkSong.getTitle().equals(title)) {
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= mSongs.size()) {
         playList.add(mSongs.get(index));
         return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;

    }

}
