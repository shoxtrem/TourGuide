package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_template, container, false);

        final ArrayList<ItemActivity> itemActivities = new ArrayList<>();
        itemActivities.add(new ItemActivity("La Panacée", "Modern art museum with a hip cafe", R.drawable.panacee));
        itemActivities.add(new ItemActivity("Restaurant Leclere", "", R.drawable.restaurant_leclere));
        itemActivities.add(new ItemActivity("Pastis Restaurant", "", R.drawable.restaurant_pastis));
        itemActivities.add(new ItemActivity("Restaurant l'Angelus", "", R.drawable.restaurant_angelus));
        itemActivities.add(new ItemActivity("Léon de Bruxelles", "Mussels and french fries", R.drawable.leon_de_bruxelles));
        itemActivities.add(new ItemActivity("La Boucherie", "Hamburger and meat restaurant", R.drawable.restaurant_la_boucherie));

        ItemActivityAdapter adapter = new ItemActivityAdapter(getActivity(), itemActivities);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}