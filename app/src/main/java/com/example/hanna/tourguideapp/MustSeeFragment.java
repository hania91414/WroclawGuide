package com.example.hanna.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays "Must See".
 */
public class MustSeeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        //Create the localization info list in ArrayList
        final ArrayList<LocalizInfo> lokalizinfo = new ArrayList<LocalizInfo>();
        //image copyrights: Centennial Hall (Hala Stulecia) in Wrocław, 2014, photo: Marek Maruszak / Forum
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.mSee_place_name1), getResources().getString(R.string.mSee_place_adress1), R.drawable.hala));
        //image source: https://pl.wikipedia.org/wiki/Wroc%C5%82awska_Fontanna, Piotr Walczak & Konradr
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.mSee_place_name2), getResources().getString(R.string.mSee_place_adress2), R.drawable.fontanna));
        //image source: http://www.tapeta-wroclaw-ratusz-rynek.na-pulpit.com/
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.mSee_place_name3), getResources().getString(R.string.mSee_place_adress3), R.drawable.ratusz));
        //image source: https://visitwroclaw.eu/miejsce/wieza-widokowa-kosciola-sw-elzbiety
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.mSee_place_name4), getResources().getString(R.string.mSee_place_adress4), R.drawable.wieza));
        //image source: http://www.gazetawroclawska.pl/tag/sky-tower-punkt-widokowy-cena/
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.mSee_place_name5), getResources().getString(R.string.mSee_place_adress5), R.drawable.skytower));
        //image source:https://visitwroclaw.eu/miejsce/ogrod-japonski-wroclaw
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.mSee_place_name6), getResources().getString(R.string.mSee_place_adress6), R.drawable.ogrod_japonski));
        //image source: https://visitwroclaw.eu/miejsce/zoo-wroclaw-1
        lokalizinfo.add(new LocalizInfo(getResources().getString(R.string.mSee_place_name7), getResources().getString(R.string.mSee_place_adress7), R.drawable.zoo_wroclaw));

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

        listView.setBackgroundResource(R.color.mustSee);

        return rootView;
    }
}