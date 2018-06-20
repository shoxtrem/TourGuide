package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_template, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.restaurant_name_1), getString(R.string.restaurant_description_1), R.drawable.panacee));
        places.add(new Place(getString(R.string.restaurant_name_2), getString(R.string.restaurant_description_2), R.drawable.restaurant_leclere));
        places.add(new Place(getString(R.string.restaurant_name_3), getString(R.string.restaurant_description_3), R.drawable.restaurant_pastis));
        places.add(new Place(getString(R.string.restaurant_name_4), getString(R.string.restaurant_description_4), R.drawable.restaurant_angelus));
        places.add(new Place(getString(R.string.restaurant_name_5), getString(R.string.restaurant_description_5), R.drawable.leon_de_bruxelles));
        places.add(new Place(getString(R.string.restaurant_name_6), getString(R.string.restaurant_description_6), R.drawable.restaurant_la_boucherie));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}