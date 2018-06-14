package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    /**
     * This is custom constructor.
     * The context is used to inflate the layout file, and the list is the data
     * is to populate into the lists.
     *
     * @param context the current context. Used to inflate layout file
     * @param songs   a list of song objects to display in list
     */
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for 3 TextViews, and 1 imageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the list view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list_item, parent, false);
        }

        /** Get the @link Song object located at this position in the list */
        Song currentSong = getItem(position);

        // Find the TextView in the song_list_item.xml layout with the ID version_name
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the title from the current Song object and set text on this textView
        titleTextView.setText(currentSong.getTitle());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText("Artist: " + currentSong.getArtist());

        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_text_view);
        albumTextView.setText("Album: " + currentSong.getAlbum());

        // Find the ImageView in the song_list_item.xml layout with the ID list_item_icon
        ImageView albumImageView = (ImageView) listItemView.findViewById(R.id.album_image_view);
        // Get the image resource ID from the current Song object and set to albumImageView
        albumImageView.setImageResource(currentSong.getArtwork());

        // Return the whole list item layout (containing 3 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}