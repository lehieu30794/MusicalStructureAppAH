package com.example.android.musicalstructureappah;

public class Music {
    private String mSong;
    private String mArtist;

    public Music(String song, String artist) {
        mSong = song;
        mArtist = artist;
    }

    public String getSong() {
        return mSong;
    }

    public String getArtist() {
        return mArtist;
    }
}
