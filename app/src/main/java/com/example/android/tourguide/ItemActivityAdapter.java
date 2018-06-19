package com.example.android.tourguide;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemActivityAdapter extends ArrayAdapter<ItemActivity> {

    public ItemActivityAdapter(Context context, ArrayList<ItemActivity> itemActivities) {
        super(context, 0, itemActivities);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final ItemActivity currentItemActivity = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentItemActivity.getActivityName());

        TextView descriptionTextView = listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentItemActivity.getActivityDescription());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentItemActivity.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentItemActivity.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
