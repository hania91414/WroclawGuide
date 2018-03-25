package com.example.hanna.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays "Cafes".
 */
public class CafesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create the localization info list in ArrayList
        final ArrayList<LocalizInfo> lokalizinfo = new ArrayList<LocalizInfo>();
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.cafes_place_name1), getResources().getString(R.string.cafes_place_adress1)));
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.cafes_place_name2), getResources().getString(R.string.cafes_place_adress2)));
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.cafes_place_name3), getResources().getString(R.string.cafes_place_adress3)));
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.cafes_place_name4), getResources().getString(R.string.cafes_place_adress4)));
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.cafes_place_name5), getResources().getString(R.string.cafes_place_adress5)));
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.cafes_place_name6), getResources().getString(R.string.cafes_place_adress6)));
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.cafes_place_name7), getResources().getString(R.string.cafes_place_adress7)));
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.cafes_place_name8), getResources().getString(R.string.cafes_place_adress8)));
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.cafes_place_name9), getResources().getString(R.string.cafes_place_adress9)));
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.cafes_place_name10), getResources().getString(R.string.cafes_place_adress10)));

        // Create an {@link LocalizationInfoAdapter}, whose data source is a list of {@link LocalizInfo}s. The
        // adapter knows how to create list items for each item in the list.
        LocalizInfoAdapter adapter = new LocalizInfoAdapter(getActivity(), lokalizinfo);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocalizInfoAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link LocalizInfo} in the list.
        listView.setAdapter(adapter);

        listView.setBackgroundResource(R.color.cafes);

        return rootView;
    }

}