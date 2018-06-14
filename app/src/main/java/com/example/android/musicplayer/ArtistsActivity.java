package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        /**
         * Set action bar title */
        setTitle("Artists");

        /**
         * Create a An ArrayList of artists
         */
        final ArrayList<Artist> artists = new ArrayList<>();
        // create new artists objects
        artists.add(new Artist("Matisyahu", R.drawable.matisyahu));
        artists.add(new Artist("The Black Keys", R.drawable.the_black_keys));
        artists.add(new Artist("filous", R.drawable.filous));
        artists.add(new Artist("Thievery Corporation", R.drawable.thievery_corp));
        artists.add(new Artist("Hillsong United", R.drawable.hillsong_united));
        artists.add(new Artist("Chris Tomlin", R.drawable.chris_tomlin));
        artists.add(new Artist("Bob Marley", R.drawable.bob_marley));
        artists.add(new Artist("The Way", R.drawable.the_way));
        artists.add(new Artist("Love Song", R.drawable.love_song));
        artists.add(new Artist("Ed Sheeran", R.drawable.ed_sheeran));
        artists.add(new Artist("Pink Floyd", R.drawable.pink_floyd));
        artists.add(new Artist("Red Hot Chili Peppers", R.drawable.rhcp));

        /**
         * Link gridView and adapter
         */
        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(adapter);

        /**
         * Add onClickListener for artists ArrayList and push data to song activity.
         */
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Artist selectedArtist = artists.get(position);
                Intent intent = new Intent(ArtistsActivity.this, SongActivity.class);
                intent.putExtra("ARTIST_NAME", selectedArtist.getArtistName());
                startActivity(intent);
            }
        });
    }
}
