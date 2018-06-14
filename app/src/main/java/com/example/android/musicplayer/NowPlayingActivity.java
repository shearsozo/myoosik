package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        /** get intent extras */
        String chosenAlbum = getIntent().getStringExtra("ALBUM");
        int chosenArtwork = Integer.parseInt(getIntent().getStringExtra("ARTWORK"));
        String chosenTitle = getIntent().getStringExtra("TITLE");
        String chosenArtist = getIntent().getStringExtra("ARTIST");

        /** Populate XML with intent extras from SongActivity */
        TextView playingAlbumTextView = findViewById(R.id.playing_album_text_view);
        playingAlbumTextView.setText(chosenAlbum);

        ImageView playingArtworkImgView = findViewById(R.id.playing_artwork_image_view);
        playingArtworkImgView.setImageResource(chosenArtwork);

        TextView playingTitleTextView = findViewById(R.id.playing_title_text_view);
        playingTitleTextView.setText(chosenTitle);

        TextView playingArtistTextView = findViewById(R.id.playing_artist_text_view);
        playingArtistTextView.setText(chosenArtist);
    }

    /**
     * Return to previous activity when back action bar button is pressed
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(NowPlayingActivity.this, SongActivity.class);
                /** Pass the previously chosen artist back to SongActivity */
                intent.putExtra("ARTIST_NAME", getIntent().getStringExtra("ARTIST"));
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}