package com.example.android.musicplayer;

public class Song {
    /**
     * Song title
     */
    private String mTitle;

    /**
     * Song artist
     */
    private String mArtist;

    /**
     * Song album name
     */
    private String mAlbum;

    /**
     * Song album art
     */
    private int mArtwork;


    /**
     * * Create a new Song object.
     *
     * @param title   the name of the song
     * @param artist  the artist of the song
     * @param album   the album name of the song
     * @param artwork the album artwork of the song
     */
    public Song(String title, String artist, String album, int artwork) {
        mTitle = title;
        mArtist = artist;
        mAlbum = album;
        mArtwork = artwork;
    }

    /**
     * Get song title
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get song artist
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get song album name
     */
    public String getAlbum() {
        return mAlbum;
    }

    /**
     * Get song album artwork.
     */
    public int getArtwork() {
        return mArtwork;
    }


}
