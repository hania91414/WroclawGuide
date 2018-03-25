package com.example.hanna.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hanna on 24.03.2018.
 */

public class LocalizInfoAdapter extends ArrayAdapter<LocalizInfo> {

    private static final String LOG_TAG = LocalizInfoAdapter.class.getSimpleName();

    public LocalizInfoAdapter(Activity context, ArrayList<LocalizInfo> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.single_item, parent, false);
        }
        // Get the {@link LocalizInfo} object located at this position in the list
            LocalizInfo currentLocalizInfo = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView placeNameTextView = listItemView.findViewById(R.id.place_name);
        // Get the version name from the current LocalizInfo object and
        // set this text on the name TextView
        placeNameTextView.setText(currentLocalizInfo.getmPlaceName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView placeAdressTextView = listItemView.findViewById(R.id.place_adress);
        // Get the version number from the current LocalizInfo object and
        // set this text on the place TextView
        placeAdressTextView.setText(currentLocalizInfo.getmPlaceAdress());

        // Find the ImageView in the list_item.xml layout with the ID version_number
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this localizinfo or not
        if (currentLocalizInfo.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentLocalizInfo.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }


}


