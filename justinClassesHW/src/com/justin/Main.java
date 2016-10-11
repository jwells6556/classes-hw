package com.justin;

public class Main {

    public static void main(String[] args) {

        User justin = new User("Justin");

        Song song1 = new Song ("Achey Breaky Heart", "Billy Ray Cyrus", "Greatest Hits");
        Song song2 = new Song ("Foam Born A: The Backtrack", "Between the Buried and Me", "Colors");
        Song song3 = new Song ("Two Headed Boy", "Neutral Milk Hotel", "In the Aeroplane Over the Sea");
        Song song4 = new Song ("Dead", "They Might Be Giants", "Flood");
        Song song5 = new Song ("Raining Blood", "Slayer", "Reign In Blood");

        Playlist jockJams = new Playlist("Jock Jams");
        Playlist now2458 = new Playlist("NOW 2458");

        jockJams.addSong(song1);
        jockJams.addSong(song3);
        jockJams.addSong(song4);

        now2458.addSong(song1);
        now2458.addSong(song2);
        now2458.addSong(song5);

        justin.addPlayList(jockJams);
        justin.addPlayList(now2458);

        String [] playlistNames = justin.getAllPlaylistNames();

        System.out.println(justin.getName() + "'s playlists: ");

        for (int i = 0; i < playlistNames.length; i++) {
            System.out.println(playlistNames[i]);
        }

        for (int i = 0; i < playlistNames.length; i++) {
            System.out.println("playing " + playlistNames[i] + ":");
            justin.getPlaylistByName(playlistNames[i]).playAll();
        }
    }
}
