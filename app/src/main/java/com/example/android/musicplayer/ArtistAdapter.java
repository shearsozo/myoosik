package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * @link ArtistAdapter is an ArrayAdapter that can provide the layout for each
 * list based on a data source, which is a list of @link Artist objects
 */

public class ArtistAdapter extends ArrayAdapter<Artist> {
    /**
     * Create new ArtistAdapter object
     * The context is used to inflate the layout file, and the list is the data
     * we want to populate into the lists.
     *
     * @param context the current context used to inflate the layout file.
     * @param artists a list of artists objects to display in a list
     */
    public ArtistAdapter(Activity context, ArrayList<Artist> artists) {
        super(context, 0, artists);
        // a constructor. We initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
    }

    /**
     * Provides a view for an AdapterView (ListView, Gridview, etc.)
     *
     * @param position    the position in the list of data that should be displayed in the list view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflattion.
     * @return The View for the postion in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artists_list_item, parent, false);
        }
        // Get @link Artist object located at this position in the ist
        Artist currentArtist = getItem(position);

        // Find the TextView in the artist_list_item.xml layout with the ID name text
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name_view);
        // Set the text on the name view
        artistNameTextView.setText(currentArtist.getArtistName());

        //Find the ImageView in the artist_item_list layout with the ID artist_image_view
        ImageView artistImageView = (ImageView) listItemView.findViewById(R.id.artist_image_view);
        // Get the image resource ID from the current Artist object and
        // set the image to artistImageView
        artistImageView.setImageResource(currentArtist.getArtistImage());

        // Return the artist_list_item layout containing 1 textView and 1 imageView
        return listItemView;
    }
}
