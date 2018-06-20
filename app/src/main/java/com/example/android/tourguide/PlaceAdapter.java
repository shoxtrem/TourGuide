package com.example.android.tourguide;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> itemActivities) {
        super(context, 0, itemActivities);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final Place currentItemActivity = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            nameTextView.setText(Objects.requireNonNull(currentItemActivity).getActivityName());
        }

        TextView descriptionTextView = listItemView.findViewById(R.id.description_text_view);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            descriptionTextView.setText(Objects.requireNonNull(currentItemActivity).getActivityDescription());
        }

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (Objects.requireNonNull(currentItemActivity).hasImage()) {
                // If an image is available, display the provided image based on the resource ID
                imageView.setImageResource(currentItemActivity.getImageResourceId());
                // Make sure the view is visible
                imageView.setVisibility(View.VISIBLE);
            } else {
                // Otherwise hide the ImageView (set visibility to GONE)
                imageView.setVisibility(View.GONE);
            }
        }


        return listItemView;
    }
}
