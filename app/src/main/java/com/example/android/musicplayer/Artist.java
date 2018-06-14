package com.example.android.musicplayer;

/**
 * @link Artist holds the artist names and images.
 */

public class Artist {
    // Artist's name
    private String mArtistName;

    // Artist's image
    private int mArtistImage;

    // create a new artist object
    // @param mArtistName is the name
    // @param mArtistImage is the image
    public Artist(String artistName, int artistImage) {
        mArtistName = artistName;
        mArtistImage = artistImage;
    }

    // Get artist name
    public String getArtistName() {
        return mArtistName;
    }

    // Get artist image
    public int getArtistImage() {
        return mArtistImage;
    }

}
