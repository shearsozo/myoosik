package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        /**
         * Get Intent Extra from @link ArtistsActivity and NowPlayingActivity
         */
        String selectedArtist = getIntent().getStringExtra("ARTIST_NAME");

        /**
         * Create An ArrayList of songs objects
         */
        final ArrayList<Song> songs = new ArrayList<Song>();
        // Create new Song objects
        songs.add(new Song("Sunshine", "Matisyahu",
                "Spark Seeker", R.drawable.matisyahu_spark_seeker));
        songs.add(new Song("One Day", "Matisyahu",
                "Light", R.drawable.matisyahu_light));
        songs.add(new Song("King Without A Crown", "Matisyahu",
                "Shake Off The Dust... Arise", R.drawable.matisyahu_shake_off));
        songs.add(new Song("Time Of Your Song", "Matisyahu",
                "Youth", R.drawable.matisyahu_youth));
        songs.add(new Song("Jerusalem", "Matisyahu",
                "Youth", R.drawable.matisyahu_youth));
        songs.add(new Song("Live Like a Warrior", "Matisyahu",
                "Spark Seeker", R.drawable.matisyahu_spark_seeker));
        songs.add(new Song("I Believe in Love", "Matisyahu",
                "Spark Seeker", R.drawable.matisyahu_spark_seeker));
        songs.add(new Song("Shade from the Sun", "Matisyahu",
                "Release the Bound", R.drawable.matisyahu_release));
        songs.add(new Song("Chop 'em Down", "Matisyahu",
                "Shake Off the Dust... Arise", R.drawable.matisyahu_shake_off));
        songs.add(new Song("Lonely Boy", "The Black Keys",
                "El Camino", R.drawable.the_black_keys_el_camino));
        songs.add(new Song("Gold on the Ceiling", "The Black Keys",
                "El Camino", R.drawable.the_black_keys_el_camino));
        songs.add(new Song("Howlin' for You", "The Black Keys",
                "Brothers", R.drawable.the_black_keys_brothers));
        songs.add(new Song("Tighten Up", "The Black Keys",
                "Brothers", R.drawable.the_black_keys_brothers));
        songs.add(new Song("Little Black Submarines", "The Black Keys",
                "El Camino", R.drawable.the_black_keys_el_camino));
        songs.add(new Song("Fever", "The Black Keys",
                "Turn Blue", R.drawable.the_black_keys_turn));
        songs.add(new Song("Weight Of Love", "The Black Keys",
                "Turn Blue", R.drawable.the_black_keys_turn));
        songs.add(new Song("I Got Mine", "The Black Keys",
                "Attack & Release", R.drawable.the_black_keys_attack));
        songs.add(new Song("Gotta Get Away", "The Black Keys",
                "Turn Blue", R.drawable.the_black_keys_turn));
        songs.add(new Song("Feel Good Inc.", "filous",
                "Feel Good Inc.", R.drawable.filous_feel_good));
        songs.add(new Song("Coming Over - filous Remix", "filous",
                "Coming Over - filous Remix", R.drawable.filous_coming));
        songs.add(new Song("Changes", "filous",
                "CRAZYTALK", R.drawable.filous_crazytalk));
        songs.add(new Song("Ohio - filous Remix", "filous",
                "Ohio - filous Remix", R.drawable.filous_ohio));
        songs.add(new Song("How Hard I Try", "filous",
                "How Hard I Try", R.drawable.filous_how));
        songs.add(new Song("For Love Decco Remix", "filous",
                "For Love EP", R.drawable.filous_for_love));
        songs.add(new Song("Knots", "filous",
                "For Love EP", R.drawable.filous_for_love));
        songs.add(new Song("Vienna By The Sea", "filous",
                "For Love EP", R.drawable.filous_for_love));
        songs.add(new Song("Already Gone", "filous",
                "For Love EP", R.drawable.filous_for_love));
        songs.add(new Song("Lebanese Blonde", "Thievery Corporation",
                "The Mirror Conspiracy", R.drawable.thievery_mirror));
        songs.add(new Song("Sweet Tides", "Thievery Corporation",
                "Radio Retaliation", R.drawable.thievery_radio));
        songs.add(new Song("Until The Morning", "Thievery Corporation",
                "The Richest Man in Babylon", R.drawable.thievery_richest_man));
        songs.add(new Song("True Sons of Zion", "Thievery Corporation",
                "The Temple of I & I", R.drawable.thievery_temple));
        songs.add(new Song("Thief Rockers", "Thievery Corporation",
                "The Temple of I & I", R.drawable.thievery_temple));
        songs.add(new Song("Omid - Hope", "Thievery Corporation",
                "The Richest Man in Babylon", R.drawable.thievery_richest_man));
        songs.add(new Song("All That We Perceive", "Thievery Corporation",
                "The Richest Man in Babylon", R.drawable.thievery_richest_man));
        songs.add(new Song("Shadows of Ourselves", "Thievery Corporation",
                "The Mirror Conspiracy", R.drawable.thievery_mirror));
        songs.add(new Song("Heaven's Gonna Burn Your Eyes", "Thievery Corporation",
                "The Richest Man in Babylon", R.drawable.thievery_richest_man));
        songs.add(new Song("Touch the Sky", "Hillsong United",
                "Empires", R.drawable.hillsong_united_empires));
        songs.add(new Song("So Will I (100 Billion X)", "Hillsong United",
                "Wonder", R.drawable.hillsong_united_wonder));
        songs.add(new Song("Oceans (Where Feet May Fail)", "Hillsong United",
                "Zion (Deluxe Edition)", R.drawable.hillsong_united_zion));
        songs.add(new Song("Wonder", "Hillsong United",
                "Wonder", R.drawable.hillsong_united_wonder));
        songs.add(new Song("Hosanna", "Hillsong United",
                "All Of The Above", R.drawable.hillsong_united_all));
        songs.add(new Song("Search My Heart", "Hillsong United",
                "Aftermath", R.drawable.hillsong_united_aftermath));
        songs.add(new Song("At the Cross", "Chris Tomlin",
                "Love Ran Red", R.drawable.chris_tomlin_love_ran));
        songs.add(new Song("Amazing Grace (My Chains Are Gone)", "Chris Tomlin",
                "See The Morning", R.drawable.chris_tomlin_see_morning));
        songs.add(new Song("Good Good Father", "Chris Tomlin",
                "Good Good Father", R.drawable.chris_tomlin_good));
        songs.add(new Song("Our God", "Chris Tomlin",
                "And if Our God Is For Us", R.drawable.chris_tomlin_if_our_god));
        songs.add(new Song("One Love", "Bob Marley",
                "Dreams of Freedom", R.drawable.bob_marley_dreams));
        songs.add(new Song("No Woman No Cry", "Bob Marley",
                "Dreams of Freedom", R.drawable.bob_marley_dreams));
        songs.add(new Song("Redemption Song", "Bob Marley",
                "Uprising", R.drawable.bob_marley_uprising));
        songs.add(new Song("Is This Love", "Bob Marley",
                "Dreams of Freedom", R.drawable.bob_marley_dreams));
        songs.add(new Song("Three Little Birds", "Bob Marley",
                "Exodus", R.drawable.bob_marley_exodus));
        songs.add(new Song("Buffalo Soldier", "Bob Marley",
                "Confrontation", R.drawable.bob_marley_confrontation));
        songs.add(new Song("War", "Bob Marley",
                "Rastaman Vibraion", R.drawable.bob_marley_rastaman));
        songs.add(new Song("Get up Stand Up", "Bob Marley",
                "Live!", R.drawable.bob_marley_live));
        songs.add(new Song("Could You Be Loved", "Bob Marley",
                "Uprising", R.drawable.bob_marley_uprising));
        songs.add(new Song("Son Come Out", "The Way",
                "The Way", R.drawable.the_way));
        songs.add(new Song("You're Caught In A World", "The Way",
                "The Way", R.drawable.the_way));
        songs.add(new Song("Song Of Joy", "The Way",
                "The Way", R.drawable.the_way));
        songs.add(new Song("Come on Down", "The Way",
                "The Way", R.drawable.the_way));
        songs.add(new Song("Closer To God", "The Way",
                "The Way", R.drawable.the_way));
        songs.add(new Song("New Song", "The Way",
                "The Way", R.drawable.the_way));
        songs.add(new Song("There's A Love", "The Way",
                "The Way", R.drawable.the_way));
        songs.add(new Song("He's The Reason To Go On", "The Way",
                "The Way", R.drawable.the_way));
        songs.add(new Song("Harvest Time", "The Way",
                "The Way", R.drawable.the_way));
        songs.add(new Song("Are You Listening?", "The Way",
                "The Way", R.drawable.the_way));
        songs.add(new Song("A Love Song", "Love Song",
                "Love Song", R.drawable.love_song));
        songs.add(new Song("Changes", "Love Song",
                "Love Song", R.drawable.love_song));
        songs.add(new Song("Two Hands", "Love Song",
                "Love Song", R.drawable.love_song));
        songs.add(new Song("Little Country Church", "Love Song",
                "Love Song", R.drawable.love_song));
        songs.add(new Song("Freedom", "Love Song",
                "Love Song", R.drawable.love_song));
        songs.add(new Song("Welcome Back", "Love Song",
                "Love Song", R.drawable.love_song));
        songs.add(new Song("Front Seat, Back Seat", "Love Song",
                "Love Song", R.drawable.love_song));
        songs.add(new Song("And The Wind Was Low", "Love Song",
                "Love Song", R.drawable.love_song));
        songs.add(new Song("A Brand New Song", "Love Song",
                "Love Song", R.drawable.love_song));
        songs.add(new Song("Feel The Love", "Love Song",
                "Love Song", R.drawable.love_song));
        songs.add(new Song("Perfect", "Ed Sheeran",
                "÷", R.drawable.ed_sheeran_divided));
        songs.add(new Song("Shape Of You", "Ed Sheeran",
                "÷", R.drawable.ed_sheeran_divided));
        songs.add(new Song("Thinking Out Loud", "Ed Sheeran",
                "x", R.drawable.ed_sheeran_multiply));
        songs.add(new Song("Photograph", "Ed Sheeran",
                "x", R.drawable.ed_sheeran_multiply));
        songs.add(new Song("Castle on the Hill", "Ed Sheeran",
                "÷", R.drawable.ed_sheeran_divided));
        songs.add(new Song("Give Me Love", "Ed Sheeran",
                "÷", R.drawable.ed_sheeran_divided));
        songs.add(new Song("I See Fire", "Ed Sheeran",
                "The Hobbit: An Unexpected Journey", R.drawable.ed_sheeran_hobbit));
        songs.add(new Song("The A Team", "Ed Sheeran",
                "÷", R.drawable.ed_sheeran_divided));
        songs.add(new Song("Time", "Pink Floyd",
                "The Dark Side of the Moon", R.drawable.pink_floyd_dark));
        songs.add(new Song("Money", "Pink Floyd",
                "The Dark Side of the Moon", R.drawable.pink_floyd_dark));
        songs.add(new Song("Wish You Were Here", "Pink Floyd",
                "Wish You Were Here", R.drawable.pink_floyd_wish));
        songs.add(new Song("Shine On You Crazy", "Pink Floyd",
                "The Dark Side of the Moon", R.drawable.pink_floyd_dark));
        songs.add(new Song("Another Brick in the Wall", "Pink Floyd",
                "The Wall", R.drawable.pink_floyd_wall));
        songs.add(new Song("Under The Bridge", "Red Hot Chili Peppers",
                "Blood Sugar Sex Magik", R.drawable.rhcp_blood));
        songs.add(new Song("Otherside", "Red Hot Chili Peppers",
                "Californication", R.drawable.rhcp_californication));
        songs.add(new Song("Californication", "Red Hot Chili Peppers",
                "Californication", R.drawable.rhcp_californication));
        songs.add(new Song("Scar Tissue", "Red Hot Chili Peppers",
                "Californication", R.drawable.rhcp_californication));
        songs.add(new Song("By The Way", "Red Hot Chili Peppers",
                "By The Way", R.drawable.rhcp_by));
        songs.add(new Song("Scar Tissue", "Red Hot Chili Peppers",
                "Californication", R.drawable.rhcp_californication));


        /**
         * Create artist songs ArrayList from songs ArrayList on ArtistsActivity intents
         */
        final ArrayList<Song> artistSongs = new ArrayList<>();
        int size = songs.size();
        for (int i = 0; i < size; i++) {
            if (songs.get(i).getArtist().equals(selectedArtist)) {
                artistSongs.add(songs.get(i));
            }
        }

        /**
         *  Create SongAdapter, whose data source is a list of songs
         */
        SongAdapter adapter = new SongAdapter(this, artistSongs);

        /**
         * Get reference to the ListView, and attach the adapter to the listView.
         */
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        /**
         * set onClickListener for artistSongs ArrayList and push data to NowPlayingActivity
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song selectedSong = artistSongs.get(position);
                Intent intent = new Intent(SongActivity.this, NowPlayingActivity.class);
                intent.putExtra("TITLE", selectedSong.getTitle());
                intent.putExtra("ARTIST", selectedSong.getArtist());
                intent.putExtra("ALBUM", selectedSong.getAlbum());
                int artwork = selectedSong.getArtwork();
                intent.putExtra("ARTWORK", Integer.toString(artwork));
                startActivity(intent);
            }
        });
    }
}
