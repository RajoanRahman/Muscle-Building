package com.example.user.musclebodybuilding.All_Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.user.musclebodybuilding.Adapters.HomeWorkoutAdapter;
import com.example.user.musclebodybuilding.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home_Workout extends Fragment {
    View view;
    ListView listView;
    String[] homeWorkoutWeekDays={"Week One","Week Two","Week Three","Week Four","Week Five"};

    public Home_Workout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_home__workout, container, false);
        listView=view.findViewById(R.id.list_view4);

        HomeWorkoutAdapter homeWorkoutAdapter=new HomeWorkoutAdapter(getContext(),homeWorkoutWeekDays);
        listView.setAdapter(homeWorkoutAdapter);

        return view;
    }

}
