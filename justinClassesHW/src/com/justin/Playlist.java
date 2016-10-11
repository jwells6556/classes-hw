package com.justin;
import java.util.ArrayList;
/**
 * Created by justinwells on 10/11/16.
 */
public class Playlist {
    private String mName;
    private ArrayList <Song> mSongs;

    public Playlist (String name) {
        mName = name;
        mSongs = new ArrayList <> ();
    }

    public String getName () {
        return mName;
    }

    public void addSong (Song song) {
        mSongs.add(song);
    }

    public void playAll () {
        for (int i = 0; i < mSongs.size(); i++) {
            mSongs.get(i).play();
        }
    }



}
