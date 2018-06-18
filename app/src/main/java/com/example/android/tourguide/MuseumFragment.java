package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_template, container, false);

        final ArrayList<ItemActivity> itemActivities = new ArrayList<>();
        itemActivities.add(new ItemActivity("La Panacée", "Modern art museum with a hip cafe", R.drawable.ic_launcher_background));
        itemActivities.add(new ItemActivity("Carré Saint Anne", "Contemporary art in a converted church", R.drawable.ic_launcher_background));
        itemActivities.add(new ItemActivity("Pavillon Populaire", "Cutting-edge photography exhibitions", R.drawable.ic_launcher_background));
        itemActivities.add(new ItemActivity("Musée du Vieux Montpellier", "Museum", R.drawable.ic_launcher_background));
        itemActivities.add(new ItemActivity("Musée Atger", "University museum with historic art", R.drawable.ic_launcher_background));
        itemActivities.add(new ItemActivity("Musée des arts décoratifs Sabatier d'Espeyran", "Art Museum", R.drawable.ic_launcher_background));
        itemActivities.add(new ItemActivity("Musée Art Brut", "Art Museum", R.drawable.ic_launcher_background));

        ItemActivityAdapter adapter = new ItemActivityAdapter(getActivity(), itemActivities);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}