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
public class ActivitiesFragment extends android.support.v4.app.Fragment {

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create list of Locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.swiss_jungfraujoch), R.string.swiss_jungfraujoch_desc));
        locations.add(new Location(getString(R.string.montmartre_tour), R.string.montmartre_tour_desc));
        locations.add(new Location(getString(R.string.rome_tour), R.string.rome_tour_desc));

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
