package com.example.alvin.mytravels;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LandmarksFragment extends android.support.v4.app.Fragment {

    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create list of Locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location("Switzerland - Swiss Alps", R.string.swiss_alps, R.drawable.swiss_alps));
        locations.add(new Location("Paris, France - Eiffel Tower", R.string.eiffel_tower, R.drawable.eiffel_tower));
        locations.add(new Location("Vatican City", R.string.vatican_city, R.drawable.vatican_city));

        /**
         * Create {@link LocationAdapter} containing list of {@link Location}s.
         *
         */
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        /**
         *  Find listview in location_list xml and fill it with the adapter.
         */
        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        listView.setAdapter(adapter);

        return rootView;
    }
}
