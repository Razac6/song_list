package com.example.android.goiplayer;

public class ArtistDetails {

    private String mArtistName;
    private String mBestSong;

    public ArtistDetails(String name, String bestSong) {
        mArtistName = name;
        mBestSong = bestSong;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public String getmBestSong() {
        return mBestSong;
    }

}
