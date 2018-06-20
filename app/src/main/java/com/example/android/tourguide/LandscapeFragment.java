package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LandscapeFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_template, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.landscape_name_1), getString(R.string.landscape_description_1), R.drawable.chateau_d_eau_du_peyrou));
        places.add(new Place(getString(R.string.landscape_name_2), getString(R.string.landscape_description_2), R.drawable.arc_triomphe_de_montpellier));
        places.add(new Place(getString(R.string.landscape_name_3), getString(R.string.landscape_description_3), R.drawable.montpellier_cathedrale));
        places.add(new Place(getString(R.string.landscape_name_4), getString(R.string.landscape_description_4), R.drawable.chateau_flaugergues));
        places.add(new Place(getString(R.string.landscape_name_5), getString(R.string.landscape_description_5), R.drawable.eglise_saint_roch));
        places.add(new Place(getString(R.string.landscape_name_6), getString(R.string.landscape_description_6), R.drawable.three_graces_fountain));
        places.add(new Place(getString(R.string.landscape_name_7), getString(R.string.landscape_description_7), R.drawable.aqueduc_de_saint_clement));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}