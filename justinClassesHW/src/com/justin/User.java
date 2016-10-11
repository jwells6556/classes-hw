package com.justin;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by justinwells on 10/11/16.
 */
public class User {
    private String mName;
    private HashMap <String, Playlist> mPlaylists;

    public User (String name) {
        mName = name;
        mPlaylists = new HashMap<>();
    }

    public void addPlayList (Playlist playlist) {
        mPlaylists.put (playlist.getName(), playlist);
    }

    public String getName () {
        return mName;
    }

    public String [] getAllPlaylistNames () {
        Set<String> playListNames = mPlaylists.keySet();
        String [] names = new String[playListNames.size()];
        int i = 0;
        for (String name : playListNames) {
            names[i] = name;
            i++;
        }

        return names;

    }

    public Playlist getPlaylistByName (String name) {
        return mPlaylists.get(name);
    }


}
