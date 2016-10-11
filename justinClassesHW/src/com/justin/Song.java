package com.justin;

/**
 * Created by justinwells on 10/11/16.
 */
public class Song {
    private String mSongName, mArtistName, mAlbumName;

    public Song (String songName, String artistName, String albumName) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public void play () {
        System.out.println("now playing : " + mSongName + " by " + mArtistName + " from the Album " + mAlbumName);
    }

}
