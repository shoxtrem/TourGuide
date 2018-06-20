package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_template, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.museum_name_1), getString(R.string.museum_description_1), R.drawable.panacee));
        places.add(new Place(getString(R.string.museum_name_2), getString(R.string.museum_description_2), R.drawable.carre_sainte_anne));
        places.add(new Place(getString(R.string.museum_name_3), getString(R.string.museum_description_3), R.drawable.pavillon_populaire));
        places.add(new Place(getString(R.string.museum_name_4), getString(R.string.museum_description_4), R.drawable.musee_vieux));
        places.add(new Place(getString(R.string.museum_name_5), getString(R.string.museum_description_5), R.drawable.atger));
        places.add(new Place(getString(R.string.museum_name_6), getString(R.string.museum_description_6), R.drawable.sabatier_espeyran));
        places.add(new Place(getString(R.string.museum_name_7), getString(R.string.museum_description_7), R.drawable.art_brut));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}