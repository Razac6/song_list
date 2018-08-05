package com.example.android.goiplayer;

public class ArtistSong {

    private String mArtist;
    private String mSong;

    public ArtistSong(String song, String artist) {
        mArtist = song;
        mSong = artist;
    }

    public String getmArtist() {
        return mArtist;
    }
    public String getmSong() {
        return mSong;
    }

}
