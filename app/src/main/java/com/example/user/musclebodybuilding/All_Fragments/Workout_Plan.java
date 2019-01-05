package com.example.user.musclebodybuilding.All_Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import com.example.user.musclebodybuilding.Adapters.WorkoutPlanAdapter;
import com.example.user.musclebodybuilding.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Workout_Plan extends Fragment {

    View view;
    ListView listView;
    String[] workoutPlanName={"BEGINNER LEVEL","INTERMEDIATE LEVEL","ADVANCE LEVEL","FULL BODY WORKOUT"};
    int[] workoutPlanImages={R.drawable.beginner,R.drawable.intermediate,R.drawable.adavance,
                                          R.drawable.fullbody};

    public Workout_Plan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_workout__plan, container, false);
        listView=view.findViewById(R.id.list_view);

        WorkoutPlanAdapter workoutPlanAdapter=new WorkoutPlanAdapter(getContext(),workoutPlanName,workoutPlanImages);
        listView.setAdapter(workoutPlanAdapter);

        return view;
    }

}
