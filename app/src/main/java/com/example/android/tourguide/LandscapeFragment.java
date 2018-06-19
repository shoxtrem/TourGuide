package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LandscapeFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_template, container, false);

        final ArrayList<ItemActivity> itemActivities = new ArrayList<>();
        itemActivities.add(new ItemActivity("La Place du Peyrou", "Esplanade with dramatic city views", R.drawable.chateau_d_eau_du_peyrou));
        itemActivities.add(new ItemActivity("Arc de Triomphe", "Landmark arch dating to the 17th century", R.drawable.arc_triomphe_de_montpellier));
        itemActivities.add(new ItemActivity("Montpellier Cathedral", "Cathedral from 1536 with conical towers", R.drawable.montpellier_cathedrale));
        itemActivities.add(new ItemActivity("Castle of Flaugergues", "Early 19th-century chateau", R.drawable.chateau_flaugergues));
        itemActivities.add(new ItemActivity("Eglise Saint-Roch", "Church", R.drawable.eglise_saint_roch));
        itemActivities.add(new ItemActivity("Fountain of the Three Graces", "Opera", R.drawable.three_graces_fountain));
        itemActivities.add(new ItemActivity("Saint-Clément Aqueduct", "18th-century, bi-level aqueduct", R.drawable.aqueduc_de_saint_clement));

        ItemActivityAdapter adapter = new ItemActivityAdapter(getActivity(), itemActivities);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}