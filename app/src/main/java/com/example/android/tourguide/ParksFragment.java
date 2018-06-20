package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_template, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.park_name_1), getString(R.string.park_description_1), R.drawable.jardins_des_plantes));
        places.add(new Place(getString(R.string.park_name_2), getString(R.string.park_description_2), R.drawable.esplanade_charles_de_gaulle));
        places.add(new Place(getString(R.string.park_name_3), getString(R.string.park_description_3), R.drawable.parc_clemenceau));
        places.add(new Place(getString(R.string.park_name_4), getString(R.string.park_description_4), R.drawable.parc_montcalm));
        places.add(new Place(getString(R.string.park_name_5), getString(R.string.park_description_5), R.drawable.parc_charpak));
        places.add(new Place(getString(R.string.park_name_6), getString(R.string.park_description_6), R.drawable.serre_amazonienne));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}