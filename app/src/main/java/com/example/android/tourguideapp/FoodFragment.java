package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        ArrayList<DataContener> dc = new ArrayList<>();

        for (int i = 0 ; i <=20 ; i++) {
            dc.add(new DataContener(getString(R.string.fragment_food), "Food title " + i, getString(R.string.my_small_text), getString(R.string.my_long_text), R.drawable.food));
        }

        DataContenerAdapter adapter = new DataContenerAdapter(getActivity(), dc);
        ListView listView = (ListView)  rootView.findViewById(R.id.list_layout);
        listView.setAdapter(adapter);

        return rootView;
    }

}
