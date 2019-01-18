package com.example.alvin.mytravels;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    //Private member variables
    private int mColorResourceId;

    /**
     * Constructor to hold a list of multiple locations
     * @param context Current context used to inflate the layout file
     * @param locations List of {@link Location} objects to display
     * @param colorResourceId Color for each category
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourceId){
        //Call parent class super
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    /**
     * Provides view for an AdapterView
     * @param position Position in list of data (similar to row # here)
     * @param convertView View to populate
     * @param parent ViewGroup used for inflation
     * @return View for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if convertView is being reused, else inflate the list_item layout
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get Location object at this position in list
        Location currentLocation = getItem(position);

        // Find the location name TextView in the list_item.xml
        // And set associated name to the TextView
        TextView locationName = (TextView) listView.findViewById(R.id.location_name);
        locationName.setText(currentLocation.getmName());

        // Find the location image ImageView in the list_item.xml
        // And set associated name to the ImageView
        ImageView locationImage = (ImageView) listView.findViewById(R.id.location_image);

        // Check if associated image exists
        if (currentLocation.hasImage()) {
            locationImage.setImageResource(currentLocation.getmImageResourceId());
        }
        else {
            locationImage.setVisibility(View.GONE);
        }

        // Find the location description TextView in the list_item.xml
        // And set associated description to the TextView
        TextView locationDesc = (TextView) listView.findViewById(R.id.location_desc);
        locationDesc.setText(currentLocation.getmDescResourceId());


        return listView;
    }
}
