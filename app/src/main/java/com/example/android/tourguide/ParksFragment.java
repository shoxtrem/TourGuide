package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_template, container, false);

        final ArrayList<ItemActivity> itemActivities = new ArrayList<>();
        itemActivities.add(new ItemActivity("Jardin des Plantes", "Garden with a collection of flowers and trees", R.drawable.ic_launcher_background));
        itemActivities.add(new ItemActivity("Esplanade Charles-de-Gaulle", "Green avenue", R.drawable.ic_launcher_background));
        itemActivities.add(new ItemActivity("Parc Clemenceau", "Garden", R.drawable.ic_launcher_background));
        itemActivities.add(new ItemActivity("Parc Montcalm", "Park", R.drawable.ic_launcher_background));
        itemActivities.add(new ItemActivity("Parc Georges Charpak", "Park. risk of flooding", R.drawable.ic_launcher_background));
        itemActivities.add(new ItemActivity("Serre Amazonienne", "Greenhouse with diverse Amazonian plants", R.drawable.ic_launcher_background));
        itemActivities.add(new ItemActivity("Castle Park Grammont", "Park", R.drawable.ic_launcher_background));

        ItemActivityAdapter adapter = new ItemActivityAdapter(getActivity(), itemActivities);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}