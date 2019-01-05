package com.example.user.musclebodybuilding.All_Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.user.musclebodybuilding.Adapters.Split_WorkoutAdapter;
import com.example.user.musclebodybuilding.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Split_Workout extends Fragment {

    View view;
    ListView listView;

    String[] splitWorkoutName={"Two Days Workout/Week","Three Days Workout/Week","Four Days Workout/Week"};
    int[] splitWorkoutImages={R.drawable.twodays,R.drawable.threedays,R.drawable.fourdays};
    public Split_Workout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view=inflater.inflate(R.layout.fragment_split__workout, container, false);
        listView=view.findViewById(R.id.list_view3);

        Split_WorkoutAdapter split_workoutAdapter=new Split_WorkoutAdapter(getContext(),splitWorkoutName,splitWorkoutImages);

        listView.setAdapter(split_workoutAdapter);

        return view;
    }

}
